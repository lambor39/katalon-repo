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
public class IDNSalesforceLightningClaimMotorCarNewbizHelperClaim{
	public static WebElement getElementIgniteClaimReportingFormRoot(WebDriver webDriver,String cssLocator,Boolean isIgnoreCssLocator=true){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-i-g-n-claim-flow'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-claim-form-app'
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
	public static Map inputSfClaimMotorProductType(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorProductType){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorProductType)){
			return lreturn
		}
		String lStrSfClaimMotorProductType=strSfClaimMotorProductType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorProductType)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox-item'
			Boolean lIsProductTypeDropDownClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
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
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsProductTypeDropDownClickOK=true
					}
					if(lIsProductTypeDropDownClickOK){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'data-value')
				lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
				lStrSfClaimMotorProductType='MotorCar'
				lStrSfClaimMotorProductType=lStrSfClaimMotorProductType.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,lStrSfClaimMotorProductType)){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsProductTypeDropDownClickOK=true
					lResult=lIsProductTypeDropDownClickOK
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimMotorOpportunityNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorOpportunityNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorOpportunityNo)){
			return lreturn
		}
		String lStrSfClaimMotorOpportunityNo=strSfClaimMotorOpportunityNo.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorOpportunityNo)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='span.slds-truncate'
			Boolean lIsOpportunityNoDropDownClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
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
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'policyNumber')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsOpportunityNoDropDownClickOK=true
					}
					if(lIsOpportunityNoDropDownClickOK){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
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
				String lStrOpportunityNoValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'title')
				lStrOpportunityNoValue=lStrOpportunityNoValue.toLowerCase()
				lStrSfClaimMotorOpportunityNo=lStrSfClaimMotorOpportunityNo.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrOpportunityNoValue,lStrSfClaimMotorOpportunityNo)){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsOpportunityNoDropDownClickOK=true
					lResult=lIsOpportunityNoDropDownClickOK
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimLossDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorLossDateValue)){
			return lreturn
		}
		String lStrSfClaimMotorLossDateValue=strSfClaimMotorLossDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorLossDateValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
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
					String lStrClaimLossDateValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrClaimLossDateValue=lStrClaimLossDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossDateValue,'claimLossDate')){
						lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimMotorLossDateValue)
						break
					}
				}
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimLossTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorLossTimeValue)){
			return lreturn
		}
		String lStrSfClaimMotorLossTimeValue=strSfClaimMotorLossTimeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorLossTimeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='div.slds-form-element.slds-form-element_horizontal'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimLossTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
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
					String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'name')
					lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,'claimLossDate')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsClaimLossTimeClickOK=true
					}
					if(lIsClaimLossTimeClickOK){
						lIsClaimLossTimeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
						lStrSfClaimMotorLossTimeValue=lStrSfClaimMotorLossTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,lStrSfClaimMotorLossTimeValue)){
							lIsClaimLossTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimLossTimeClickOK
						}
						if(lResult){
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
	public static Map inputSfClaimIncidentDriver(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorIncidentDriver){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorIncidentDriver)){
			return lreturn
		}
		String lStrSfClaimMotorIncidentDriver=strSfClaimMotorIncidentDriver.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorIncidentDriver)){
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormParent=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentPerson')){
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
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lStrSfClaimMotorIncidentDriver)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild08=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			lElementSearch01InputLevel01IgniteIncidentDriverFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormParent,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild01,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(webDriver,lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAddress(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorAddress){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorAddress)){
			return lreturn
		}
		String lStrSfClaimMotorAddress=strSfClaimMotorAddress.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorAddress)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentLocationData_address')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimMotorAddress)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
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
	public static Map inputSfClaimCauseType(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCauseTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCauseTypeValue)){
			return lreturn
		}
		String lStrSfClaimCauseTypeValue=strSfClaimCauseTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimCauseTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsClaimCauseTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,'claimCauseType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
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
						String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
						lStrSfClaimCauseTypeValue=lStrSfClaimCauseTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,lStrSfClaimCauseTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
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
	public static Map inputSfClaimIncidentType(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIncidentTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIncidentTypeValue)){
			return lreturn
		}
		String lStrSfClaimIncidentTypeValue=strSfClaimIncidentTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimIncidentTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-base-combobox-item'
			Boolean lIsClaimCauseTypeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,'claimIncidentType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
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
						String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
						lStrSfClaimIncidentTypeValue=lStrSfClaimIncidentTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,lStrSfClaimIncidentTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
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
	public static Map inputSfClaimLiability(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimLiabilityValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimLiabilityValue)){
			return lreturn
		}
		String lStrSfClaimLiabilityValue=strSfClaimLiabilityValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimLiabilityValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentReportingMotorData_liability')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimLiabilityValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim liability'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimWereYouTravellingOrWork(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWereYouTravellingOrWorkValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWereYouTravellingOrWorkValue)){
			return lreturn
		}
		String lStrSfClaimWereYouTravellingOrWorkValue=strSfClaimWereYouTravellingOrWorkValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimWereYouTravellingOrWorkValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'flagUsageDriveToWork')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimWereYouTravellingOrWorkValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim were you travelling or work'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAppointmentPlace(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAppointmentPlaceValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAppointmentPlaceValue)){
			return lreturn
		}
		String lStrSfClaimAppointmentPlaceValue=strSfClaimAppointmentPlaceValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAppointmentPlaceValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'surveyorData_accidentLocationLandmark')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAppointmentPlaceValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim appointment place'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimIndependentWitness(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIndependentWitnessValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIndependentWitnessValue)){
			return lreturn
		}
		String lStrSfClaimIndependentWitnessValue=strSfClaimIndependentWitnessValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimIndependentWitnessValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIndependentWitnessValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIndependentWitnessValue=lStrClaimIndependentWitnessValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIndependentWitnessValue,'incidentReportingData_independentWitness')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimIndependentWitnessValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim independent witness'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimCarIsDrivable(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCarIsDrivableValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCarIsDrivableValue)){
			return lreturn
		}
		String lStrSfClaimCarIsDrivableValue=strSfClaimCarIsDrivableValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimCarIsDrivableValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCarIsDrivableValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCarIsDrivableValue=lStrClaimCarIsDrivableValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCarIsDrivableValue,'surveyorData_vehicleIsDrivable')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimCarIsDrivableValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim car is drivable'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimClaimDescription(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimDescriptionValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimDescriptionValue)){
			return lreturn
		}
		String lStrSfClaimDescriptionValueValue=strSfClaimDescriptionValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimDescriptionValueValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'claimDescription')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimDescriptionValueValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim description'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAnyInjury(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAnyInjuryValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAnyInjuryValue)){
			return lreturn
		}
		String lStrSfClaimAnyInjuryValue=strSfClaimAnyInjuryValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAnyInjuryValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimAnyInjuryValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimAnyInjuryValue=lStrClaimAnyInjuryValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimAnyInjuryValue,'anyInjury')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimAnyInjuryValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim any injury'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimClaimReportDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportDateValue)){
			return lreturn
		}
		String lStrSfClaimReportDateValue=strSfClaimReportDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReportDateValue)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrReportDateValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrReportDateValue=lStrReportDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrReportDateValue,'claimReportDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimReportDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorRequired(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorRequiredValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorRequiredValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorRequiredValue=strSfClaimSurveyorRequiredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorRequiredValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyorRequiredValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyorRequiredValue=lStrClaimSurveyorRequiredValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorRequiredValue,'surveyorData_doYouRequireASurveyorAtTheScene')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyorRequiredValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim surveyor required'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyCompany(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyCompany){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyCompany)){
			return lreturn
		}
		String lStrSfClaimSurveyCompany=strSfClaimSurveyCompany.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyCompany)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorCompany')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimSurveyCompany)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
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
	public static Map inputSfClaimSurveyorName(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorName)){
			return lreturn
		}
		String lStrSfClaimSurveyorName=strSfClaimSurveyorName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorName)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorName')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorMobileNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorMobileNo)){
			return lreturn
		}
		String lStrSfClaimSurveyorMobileNo=strSfClaimSurveyorMobileNo.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorMobileNo)){
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorMobileNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyType(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyTypeValue)){
			return lreturn
		}
		String lStrSfClaimSurveyTypeValue=strSfClaimSurveyTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyTypeValue=lStrClaimSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyTypeValue,'surveyorData_surveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyTypeValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim survey type'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimReasonForSurveyType(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReasonForSurveyTypeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReasonForSurveyTypeValue)){
			return lreturn
		}
		String lStrSfClaimReasonForSurveyTypeValue=strSfClaimReasonForSurveyTypeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReasonForSurveyTypeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimReasonForSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimReasonForSurveyTypeValue=lStrClaimReasonForSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimReasonForSurveyTypeValue,'surveyorData_reasonForSurveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimReasonForSurveyTypeValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim reason for survey type'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorAppointedDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedDateValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorAppointedDateValue=strSfClaimSurveyorAppointedDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedDateValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimSurveyorAppointedDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorAppointedTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedTimeValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorAppointedTimeValue=strSfClaimSurveyorAppointedTimeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedTimeValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimSurveyorAppointedTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
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
				lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimSurveyorAppointedTimeClickOK){
				return lreturn
			}
			if(lIsClaimSurveyorAppointedTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimSurveyorAppointedTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimSurveyorAppointedTimeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimSurveyorAppointedTimeValue=lStrClaimSurveyorAppointedTimeValue.toLowerCase()
						lStrSfClaimSurveyorAppointedTimeValue=lStrSfClaimSurveyorAppointedTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorAppointedTimeValue,lStrSfClaimSurveyorAppointedTimeValue)){
							lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimSurveyorAppointedTimeClickOK
						}
						if(lIsClaimSurveyorAppointedTimeClickOK){
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
	public static Map inputSfClaimReportedBy(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportedByValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportedByValue)){
			return lreturn
		}
		String lStrSfClaimReportedByValue=strSfClaimReportedByValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReportedByValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'reportedBy')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetInputTextB(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimReportedByValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim reported by'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimChronologyAccident(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfChronologyAccidentValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfChronologyAccidentValue)){
			return lreturn
		}
		String lStrSfChronologyAccidentValue=strSfChronologyAccidentValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfChronologyAccidentValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'chronologyAccident')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfChronologyAccidentValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim chronology accident'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimClaimAccidentVillage(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentVillageValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentVillageValue)){
			return lreturn
		}
		String lStrSfClaimAccidentVillageValue=strSfClaimAccidentVillageValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimAccidentVillageValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentLocationData_claimAccidentVillage')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetInputTextB(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAccidentVillageValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim accident village'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTouchPointStage(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimTouchPointStageValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTouchPointStageValue)){
			return lreturn
		}
		String lStrSfClaimTouchPointStageValue=strSfClaimTouchPointStageValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimTouchPointStageValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimTouchPointStageValueFromElement=lStrSfClaimTouchPointStageValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimTouchPointStageValueFromElement,'touchPointStage')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimTouchPointStageValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim touch point stage'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimQuotationReceivedFromGarageDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimQuotationReceivedFromGarageDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimQuotationReceivedFromGarageDateValue)){
			return lreturn
		}
		String lStrSfClaimQuotationReceivedFromGarageDateValue=strSfClaimQuotationReceivedFromGarageDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimQuotationReceivedFromGarageDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimQuotationReceivedFromGarageDateValueFromElement=lStrSfClaimQuotationReceivedFromGarageDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationReceivedFromGarageDateValueFromElement,'motorClaimData_estimatedDamageAssessmentDate')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimQuotationReceivedFromGarageDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimQuotationReceivedFromGarageTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimQuotationReceivedFromGarageTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimQuotationReceivedFromGarageTimeValue)){
			return lreturn
		}
		String lStrSfClaimQuotationReceivedFromGarageTimeValue=strSfClaimQuotationReceivedFromGarageTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimQuotationReceivedFromGarageTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement=lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement,'motorClaimData_estimatedDamageAssessmentDate')){
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
				lIsClaimQuotationReceivedFromGarageTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimQuotationReceivedFromGarageTimeClickOK){
				return lreturn
			}
			if(lIsClaimQuotationReceivedFromGarageTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimQuotationReceivedFromGarageTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement=lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement.toLowerCase()
						lStrSfClaimQuotationReceivedFromGarageTimeValue=lStrSfClaimQuotationReceivedFromGarageTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationReceivedFromGarageTimeValueFromElement,lStrSfClaimQuotationReceivedFromGarageTimeValue)){
							lIsClaimQuotationReceivedFromGarageTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimQuotationReceivedFromGarageTimeClickOK
						}
						if(lIsClaimQuotationReceivedFromGarageTimeClickOK){
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
	public static Map inputSfClaimQuotationApprovalDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimQuotationApprovalDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimQuotationApprovalDateValue)){
			return lreturn
		}
		String lStrSfClaimQuotationApprovalDateValue=strSfClaimQuotationApprovalDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimQuotationApprovalDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimQuotationApprovalDateValueFromElement=lStrSfClaimQuotationApprovalDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationApprovalDateValueFromElement,'motorClaimData_actualDamageAssessmentDate')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimQuotationApprovalDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimQuotationApprovalTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimQuotationApprovalTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimQuotationApprovalTimeValue)){
			return lreturn
		}
		String lStrSfClaimQuotationApprovalTimeValue=strSfClaimQuotationApprovalTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimQuotationApprovalTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimQuotationApprovalTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimQuotationApprovalTimeValueFromElement=lStrSfClaimQuotationApprovalTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationApprovalTimeValueFromElement,'motorClaimData_actualDamageAssessmentDate')){
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
				lIsClaimQuotationApprovalTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimQuotationApprovalTimeClickOK){
				return lreturn
			}
			if(lIsClaimQuotationApprovalTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimQuotationApprovalTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimQuotationApprovalTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimQuotationApprovalTimeValueFromElement=lStrSfClaimQuotationApprovalTimeValueFromElement.toLowerCase()
						lStrSfClaimQuotationApprovalTimeValue=lStrSfClaimQuotationApprovalTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimQuotationApprovalTimeValueFromElement,lStrSfClaimQuotationApprovalTimeValue)){
							lIsClaimQuotationApprovalTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimQuotationApprovalTimeClickOK
						}
						if(lIsClaimQuotationApprovalTimeClickOK){
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
	public static Map inputSfClaimBeginRepairDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimBeginRepairDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimBeginRepairDateValue)){
			return lreturn
		}
		String lStrSfClaimBeginRepairDateValue=strSfClaimBeginRepairDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimBeginRepairDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimBeginRepairDateValueFromElement=lStrSfClaimBeginRepairDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimBeginRepairDateValueFromElement,'motorClaimData_estimatedVehicleDeliveryDate')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimBeginRepairDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimBeginRepairTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimBeginRepairTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimBeginRepairTimeValue)){
			return lreturn
		}
		String lStrSfClaimBeginRepairTimeValue=strSfClaimBeginRepairTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimBeginRepairTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimBeginRepairTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimBeginRepairTimeValueFromElement=lStrSfClaimBeginRepairTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimBeginRepairTimeValueFromElement,'motorClaimData_estimatedVehicleDeliveryDate')){
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
				lIsClaimBeginRepairTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimBeginRepairTimeClickOK){
				return lreturn
			}
			if(lIsClaimBeginRepairTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimBeginRepairTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimBeginRepairTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimBeginRepairTimeValueFromElement=lStrSfClaimBeginRepairTimeValueFromElement.toLowerCase()
						lStrSfClaimBeginRepairTimeValue=lStrSfClaimBeginRepairTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimBeginRepairTimeValueFromElement,lStrSfClaimBeginRepairTimeValue)){
							lIsClaimBeginRepairTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimBeginRepairTimeClickOK
						}
						if(lIsClaimBeginRepairTimeClickOK){
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
	public static Map inputSfClaimFinishRepairDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimFinishRepairDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimFinishRepairDateValue)){
			return lreturn
		}
		String lStrSfClaimFinishRepairDateValue=strSfClaimFinishRepairDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimFinishRepairDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimFinishRepairDateValueFromElement=lStrSfClaimFinishRepairDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimFinishRepairDateValueFromElement,'motorClaimData_actualVehicleDeliveryDate')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimFinishRepairDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimFinishRepairTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimFinishRepairTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimFinishRepairTimeValue)){
			return lreturn
		}
		String lStrSfClaimFinishRepairTimeValue=strSfClaimFinishRepairTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimBeginRepairTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimFinishRepairTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimFinishRepairTimeValueFromElement=lStrSfClaimFinishRepairTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimFinishRepairTimeValueFromElement,'motorClaimData_actualVehicleDeliveryDate')){
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
				lIsClaimBeginRepairTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimBeginRepairTimeClickOK){
				return lreturn
			}
			if(lIsClaimBeginRepairTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimBeginRepairTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimFinishRepairTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimFinishRepairTimeValueFromElement=lStrSfClaimFinishRepairTimeValueFromElement.toLowerCase()
						lStrSfClaimFinishRepairTimeValue=lStrSfClaimFinishRepairTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimFinishRepairTimeValueFromElement,lStrSfClaimFinishRepairTimeValue)){
							lIsClaimBeginRepairTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimBeginRepairTimeClickOK
						}
						if(lIsClaimBeginRepairTimeClickOK){
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
	public static Map inputSfClaimInsurerApprovalStatus(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimInsurerApprovalStatusValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimInsurerApprovalStatusValue)){
			return lreturn
		}
		String lStrSfClaimInsurerApprovalStatusValue=strSfClaimInsurerApprovalStatusValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimInsurerApprovalStatusValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimInsurerApprovalStatusValueFromElement=lStrSfClaimInsurerApprovalStatusValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimInsurerApprovalStatusValueFromElement,'insurerApprovalStatus')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimInsurerApprovalStatusValue,true)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim touch point stage'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimInsurerClaimNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimInsurerClaimNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimInsurerClaimNo)){
			return lreturn
		}
		String lStrSfClaimInsurerClaimNo=strSfClaimInsurerClaimNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimInsurerClaimNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimInsurerClaimNoFromElement=lStrSfClaimInsurerClaimNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimInsurerClaimNoFromElement,'insurerClaimNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimInsurerClaimNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimApprovalDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimApprovalDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimApprovalDateValue)){
			return lreturn
		}
		String lStrSfClaimApprovalDateValue=strSfClaimApprovalDateValue.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimApprovalDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimApprovalDateValueFromElement=lStrSfClaimApprovalDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimApprovalDateValueFromElement,'insurerApprovalDate')){
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
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimApprovalDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimCancellationAndRejectionRemarks(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCancellationAndRejectionRemarks){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCancellationAndRejectionRemarks)){
			return lreturn
		}
		String lStrSfClaimCancellationAndRejectionRemarks=strSfClaimCancellationAndRejectionRemarks
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimCancellationAndRejectionRemarksFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimCancellationAndRejectionRemarksFromElement=lStrSfClaimCancellationAndRejectionRemarksFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimCancellationAndRejectionRemarksFromElement,'cancellationRemarks')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimCancellationAndRejectionRemarks)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim cancellation/rejection remarks'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimIncidentDriverMobileNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIncidentDriverMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIncidentDriverMobileNo)){
			return lreturn
		}
		String lStrSfClaimIncidentDriverMobileNo=strSfClaimIncidentDriverMobileNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimIncidentDriverMobileNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimIncidentDriverMobileNoFromElement=lStrSfClaimIncidentDriverMobileNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimIncidentDriverMobileNoFromElement,'motorClaimData_driverMobileNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimIncidentDriverMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimClaimantName(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimClaimantName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimClaimantName)){
			return lreturn
		}
		String lStrSfClaimClaimantName=strSfClaimClaimantName.trim()
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='button'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormParent=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimClaimantNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimClaimantNameValueFromElement=lStrClaimClaimantNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimClaimantNameValueFromElement,'claimant')){
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
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lStrSfClaimClaimantName)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild08=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					String lStrClaimClaimantNameValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'data-value')
					lStrClaimClaimantNameValueFromElement=lStrClaimClaimantNameValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimClaimantNameValueFromElement,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			lElementSearch01InputLevel01IgniteIncidentDriverFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormParent,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild01,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(webDriver,lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimClaimantMobileNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimClaimantMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimClaimantMobileNo)){
			return lreturn
		}
		String lStrSfClaimClaimantMobileNo=strSfClaimClaimantMobileNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimClaimantMobileNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimClaimantMobileNoFromElement=lStrSfClaimClaimantMobileNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimClaimantMobileNoFromElement,'claimantMobileNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimClaimantMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimReportedByName(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportedByName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportedByName)){
			return lreturn
		}
		String lStrSfClaimReportedByName=strSfClaimReportedByName.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimReportedByNameFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimReportedByNameFromElement=lStrSfClaimReportedByNameFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimReportedByNameFromElement,'reportedBy')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimReportedByName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimReportedByMobileNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportedByMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportedByMobileNo)){
			return lreturn
		}
		String lStrSfClaimReportedByMobileNo=strSfClaimReportedByMobileNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimReportedByMobileNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimReportedByMobileNoFromElement=lStrSfClaimReportedByMobileNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimReportedByMobileNoFromElement,'reportedByMobileNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimReportedByMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimDriverOnScene(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimDriverOnSceneValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimDriverOnSceneValue)){
			return lreturn
		}
		String lStrSfClaimDriverOnSceneValue=strSfClaimDriverOnSceneValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimDriverOnSceneValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimDriverOnSceneValueFromElement=lStrClaimDriverOnSceneValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimDriverOnSceneValueFromElement,'surveyorData_flagDriverAtScene')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimDriverOnSceneValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim driver on scene'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimCarIsAtWorkshop(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCarIsAtWorkshopValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCarIsAtWorkshopValue)){
			return lreturn
		}
		String lStrSfClaimCarIsAtWorkshopValue=strSfClaimCarIsAtWorkshopValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCarIsAtWorkshopValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCarIsAtWorkshopValueFromElement=lStrClaimCarIsAtWorkshopValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCarIsAtWorkshopValueFromElement,'surveyorData_vehicleIsAtWorkshop')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimCarIsAtWorkshopValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim car is at workshop'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorArrivedDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorArrivedDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorArrivedDateValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorArrivedDateValue=strSfClaimSurveyorArrivedDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimSurveyorArrivedDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimSurveyorArrivedDateValueFromElement=lStrSfClaimSurveyorArrivedDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorArrivedDateValueFromElement,'surveyorData_surveyorArrivedDateTime')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimSurveyorArrivedDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorArrivedTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorArrivedTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorArrivedTimeValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorArrivedTimeValue=strSfClaimSurveyorArrivedTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimSurveyorArrivedTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimSurveyorArrivedTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimSurveyorArrivedTimeValueFromElement=lStrSfClaimSurveyorArrivedTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorArrivedTimeValueFromElement,'surveyorData_surveyorArrivedDateTime')){
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
				lIsClaimSurveyorArrivedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimSurveyorArrivedTimeClickOK){
				return lreturn
			}
			if(lIsClaimSurveyorArrivedTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimSurveyorArrivedTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimSurveyorArrivedTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimSurveyorArrivedTimeValueFromElement=lStrSfClaimSurveyorArrivedTimeValueFromElement.toLowerCase()
						lStrSfClaimSurveyorArrivedTimeValue=lStrSfClaimSurveyorArrivedTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorArrivedTimeValueFromElement,lStrSfClaimSurveyorArrivedTimeValue)){
							lIsClaimSurveyorArrivedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimSurveyorArrivedTimeClickOK
						}
						if(lIsClaimSurveyorArrivedTimeClickOK){
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
	public static Map inputSfClaimSurveyorFinishedDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorFinishedDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorFinishedDateValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorFinishedDateValue=strSfClaimSurveyorFinishedDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimSurveyorFinishedDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimSurveyorFinishedDateValueFromElement=lStrSfClaimSurveyorFinishedDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorFinishedDateValueFromElement,'surveyorData_surveyorFinishedDateTime')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimSurveyorFinishedDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimSurveyorFinishedTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorFinishedTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorFinishedTimeValue)){
			return lreturn
		}
		String lStrSfClaimSurveyorFinishedTimeValue=strSfClaimSurveyorFinishedTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimSurveyorFinishedTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimSurveyorArrivedTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimSurveyorArrivedTimeValueFromElement=lStrSfClaimSurveyorArrivedTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorArrivedTimeValueFromElement,'surveyorData_surveyorFinishedDateTime')){
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
				lIsClaimSurveyorFinishedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimSurveyorFinishedTimeClickOK){
				return lreturn
			}
			if(lIsClaimSurveyorFinishedTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimSurveyorFinishedTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimSurveyorArrivedTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimSurveyorArrivedTimeValueFromElement=lStrSfClaimSurveyorArrivedTimeValueFromElement.toLowerCase()
						lStrSfClaimSurveyorFinishedTimeValue=lStrSfClaimSurveyorFinishedTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimSurveyorArrivedTimeValueFromElement,lStrSfClaimSurveyorFinishedTimeValue)){
							lIsClaimSurveyorFinishedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimSurveyorFinishedTimeClickOK
						}
						if(lIsClaimSurveyorFinishedTimeClickOK){
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
	public static Map inputSfClaimVehicleDamaged(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimVehicleDamagedValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimVehicleDamagedValue)){
			return lreturn
		}
		String lStrSfClaimVehicleDamagedValue=strSfClaimVehicleDamagedValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimVehicleDamagedValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimVehicleDamagedValueFromElement=lStrClaimVehicleDamagedValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimVehicleDamagedValueFromElement,'incidentReportingMotorData_isTheVehicleDamage')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimVehicleDamagedValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim vehicle damaged'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimKFK(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimKFKValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimKFKValue)){
			return lreturn
		}
		String lStrSfClaimKFKValue=strSfClaimKFKValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimKFKValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimKFKValueFromElement=lStrSfClaimKFKValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimKFKValueFromElement,'incidentReportingMotorData_isKfk')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimKFKValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim KFK'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimCollisionCountByVehicle(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCollisionCountByVehicle){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCollisionCountByVehicle)){
			return lreturn
		}
		String lStrSfClaimCollisionCountByVehicle=strSfClaimCollisionCountByVehicle.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimCollisionCountByVehicleFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimCollisionCountByVehicleFromElement=lStrSfClaimCollisionCountByVehicleFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimCollisionCountByVehicleFromElement,'collisionCountByVehicle')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimCollisionCountByVehicle)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimIncidentInfoTotalRejectAmount(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIncidentInfoTotalRejectAmount){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIncidentInfoTotalRejectAmount)){
			return lreturn
		}
		String lStrSfClaimIncidentInfoTotalRejectAmount=strSfClaimIncidentInfoTotalRejectAmount.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimIncidentInfoTotalRejectAmountFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimIncidentInfoTotalRejectAmountFromElement=lStrSfClaimIncidentInfoTotalRejectAmountFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimIncidentInfoTotalRejectAmountFromElement,'totalRejectAmount')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimIncidentInfoTotalRejectAmount)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAccidentHouseNumber(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentHouseNumber){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentHouseNumber)){
			return lreturn
		}
		String lStrSfClaimAccidentHouseNumber=strSfClaimAccidentHouseNumber.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimAccidentHouseNumberFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimAccidentHouseNumberFromElement=lStrSfClaimAccidentHouseNumberFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimAccidentHouseNumberFromElement,'incidentLocationData_claimAccidentHouseNumber')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimAccidentHouseNumber)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAccidentRoad(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentRoad){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentRoad)){
			return lreturn
		}
		String lStrSfClaimAccidentRoad=strSfClaimAccidentRoad.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimAccidentRoadFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimAccidentRoadFromElement=lStrSfClaimAccidentRoadFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimAccidentRoadFromElement,'incidentLocationData_claimAccidentRoad')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimAccidentRoad)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAccidentCountry(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentCountryValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentCountryValue)){
			return lreturn
		}
		String lStrSfClaimAccidentCountryValue=strSfClaimAccidentCountryValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimAccidentCountryValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimAccidentCountryValueFromElement=lStrSfClaimAccidentCountryValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimAccidentCountryValueFromElement,'incidentLocationData_claimAccidentCountry')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimAccidentCountryValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim accident country'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAccidentGeoLocationLongitude(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentGeoLocationLongitude){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentGeoLocationLongitude)){
			return lreturn
		}
		String lStrSfClaimAccidentGeoLocationLongitude=strSfClaimAccidentGeoLocationLongitude.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimAccidentGeoLocationLongitudeFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimAccidentGeoLocationLongitudeFromElement=lStrSfClaimAccidentGeoLocationLongitudeFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimAccidentGeoLocationLongitudeFromElement,'incidentLocationData_accidentGeoLocationLongitudeS')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimAccidentGeoLocationLongitude)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimAccidentGeoLocationLatitude(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentGeoLocationLatitude){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimAccidentGeoLocationLatitude)){
			return lreturn
		}
		String lStrSfClaimAccidentGeoLocationLatitude=strSfClaimAccidentGeoLocationLatitude.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimAccidentGeoLocationLatitudeFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimAccidentGeoLocationLatitudeFromElement=lStrSfClaimAccidentGeoLocationLatitudeFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimAccidentGeoLocationLatitudeFromElement,'incidentLocationData_accidentGeoLocationLatitudeS')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimAccidentGeoLocationLatitude)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPhotosTaken(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPhotosTakenValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPhotosTakenValue)){
			return lreturn
		}
		String lStrSfClaimPhotosTakenValue=strSfClaimPhotosTakenValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPhotosTakenValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPhotosTakenValueFromElement=lStrSfClaimPhotosTakenValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPhotosTakenValueFromElement,'incidentReportingMotorData_werePhotosTakenAtTheScene')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimPhotosTakenValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim photos taken'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTowingRequired(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimTowingRequiredValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTowingRequiredValue)){
			return lreturn
		}
		String lStrSfClaimTowingRequiredValue=strSfClaimTowingRequiredValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimTowingRequiredValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimTowingRequiredValueFromElement=lStrSfClaimTowingRequiredValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimTowingRequiredValueFromElement,'incidentReportingMotorData_doYouRequireTowing')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimTowingRequiredValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim towing required'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimTowingCompany(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimTowingCompany){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimTowingCompany)){
			return lreturn
		}
		String lStrSfClaimTowingCompany=strSfClaimTowingCompany.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimTowingCompanyValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimTowingCompanyValueFromElement=lStrClaimTowingCompanyValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimTowingCompanyValueFromElement,'incidentReportingMotorData_towingCompany')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimTowingCompany)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrClaimTowingCompanyValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrClaimTowingCompanyValueFromElement=lStrClaimTowingCompanyValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimTowingCompanyValueFromElement,'actionAdvancedSearch')){
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
	public static Map inputSfClaimDidAnyoneCallAnAmbulance(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimDidAnyoneCallAnAmbulanceValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimDidAnyoneCallAnAmbulanceValue)){
			return lreturn
		}
		String lStrSfClaimDidAnyoneCallAnAmbulanceValue=strSfClaimDidAnyoneCallAnAmbulanceValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimDidAnyoneCallAnAmbulanceValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimDidAnyoneCallAnAmbulanceValueFromElement=lStrSfClaimDidAnyoneCallAnAmbulanceValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimDidAnyoneCallAnAmbulanceValueFromElement,'incidentReportingMotorData_didAnyoneCallAnAmbulance')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimDidAnyoneCallAnAmbulanceValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim did anyone call an ambulance'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimWitnessName(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWitnessName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWitnessName)){
			return lreturn
		}
		String lStrSfClaimWitnessName=strSfClaimWitnessName.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimWitnessNameFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimWitnessNameFromElement=lStrSfClaimWitnessNameFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimWitnessNameFromElement,'incidentReportingData_witnessName')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimWitnessName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimWitnessPhone(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWitnessPhone){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWitnessPhone)){
			return lreturn
		}
		String lStrSfClaimWitnessPhone=strSfClaimWitnessPhone.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimWitnessPhoneFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimWitnessPhoneFromElement=lStrSfClaimWitnessPhoneFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimWitnessPhoneFromElement,'incidentReportingData_witnessPhone')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimWitnessPhone)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimWitnessRelation(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWitnessRelation){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWitnessRelation)){
			return lreturn
		}
		String lStrSfClaimWitnessRelation=strSfClaimWitnessRelation.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimWitnessRelationFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimWitnessRelationFromElement=lStrSfClaimWitnessRelationFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimWitnessRelationFromElement,'incidentReportingData_witnessRelation')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimWitnessRelation)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimWasTheIncidentReportedToThePolice(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWasTheIncidentReportedToThePoliceValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimWasTheIncidentReportedToThePoliceValue)){
			return lreturn
		}
		String lStrSfClaimWasTheIncidentReportedToThePoliceValue=strSfClaimWasTheIncidentReportedToThePoliceValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimWasTheIncidentReportedToThePoliceValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimWasTheIncidentReportedToThePoliceValueFromElement=lStrSfClaimWasTheIncidentReportedToThePoliceValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimWasTheIncidentReportedToThePoliceValueFromElement,'incidentReportingData_wasTheIncidentReportedToThePolice')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimWasTheIncidentReportedToThePoliceValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim was the incident reported to the police'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPoliceStation(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceStation){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceStation)){
			return lreturn
		}
		String lStrSfClaimPoliceStation=strSfClaimPoliceStation.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimPoliceStationFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimPoliceStationFromElement=lStrClaimPoliceStationFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimPoliceStationFromElement,'incidentReportingData_policeStation')){
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
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimPoliceStation)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrClaimPoliceStationFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrClaimPoliceStationFromElement=lStrClaimPoliceStationFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimPoliceStationFromElement,'actionAdvancedSearch')){
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
	public static Map inputSfClaimPoliceOfficerName(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceOfficerName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceOfficerName)){
			return lreturn
		}
		String lStrSfClaimPoliceOfficerName=strSfClaimPoliceOfficerName.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPoliceOfficerNameFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPoliceOfficerNameFromElement=lStrSfClaimPoliceOfficerNameFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceOfficerNameFromElement,'incidentReportingData_policeOfficerName')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimPoliceOfficerName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPoliceMobileNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceMobileNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceMobileNo)){
			return lreturn
		}
		String lStrSfClaimPoliceMobileNo=strSfClaimPoliceMobileNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPoliceMobileNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPoliceMobileNoFromElement=lStrSfClaimPoliceMobileNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceMobileNoFromElement,'incidentReportingData_policeMobileNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimPoliceMobileNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPoliceReportNo(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceReportNo){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceReportNo)){
			return lreturn
		}
		String lStrSfClaimPoliceReportNo=strSfClaimPoliceReportNo.trim()
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPoliceReportNoFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPoliceReportNoFromElement=lStrSfClaimPoliceReportNoFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceReportNoFromElement,'incidentReportingData_policeReportNo')){
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
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimPoliceReportNo)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPoliceReportDate(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceReportDateValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceReportDateValue)){
			return lreturn
		}
		String lStrSfClaimPoliceReportDateValue=strSfClaimPoliceReportDateValue.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPoliceReportDateValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPoliceReportDateValueFromElement=lStrSfClaimPoliceReportDateValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceReportDateValueFromElement,'incidentReportingData_policeReportDate')){
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
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lStrSfClaimPoliceReportDateValue)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimPoliceReportTime(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimPoliceReportTimeValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimPoliceReportTimeValue)){
			return lreturn
		}
		String lStrSfClaimPoliceReportTimeValue=strSfClaimPoliceReportTimeValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08='span.slds-truncate'
			Boolean lIsClaimPoliceReportTimeClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimPoliceReportTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimPoliceReportTimeValueFromElement=lStrSfClaimPoliceReportTimeValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceReportTimeValueFromElement,'incidentReportingData_policeReportDate')){
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
				lIsClaimPoliceReportTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimPoliceReportTimeClickOK){
				return lreturn
			}
			if(lIsClaimPoliceReportTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimPoliceReportTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrSfClaimPoliceReportTimeValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrSfClaimPoliceReportTimeValueFromElement=lStrSfClaimPoliceReportTimeValueFromElement.toLowerCase()
						lStrSfClaimPoliceReportTimeValue=lStrSfClaimPoliceReportTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrSfClaimPoliceReportTimeValueFromElement,lStrSfClaimPoliceReportTimeValue)){
							lIsClaimPoliceReportTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimPoliceReportTimeClickOK
						}
						if(lIsClaimPoliceReportTimeClickOK){
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
	public static Map inputSfClaimConfirmedFraud(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimConfirmedFraudValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimConfirmedFraudValue)){
			return lreturn
		}
		String lStrSfClaimConfirmedFraudValue=strSfClaimConfirmedFraudValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimConfirmedFraudValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimConfirmedFraudValueFromElement=lStrSfClaimConfirmedFraudValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimConfirmedFraudValueFromElement,'fraudCheckClaimData_confirmedFraud')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimConfirmedFraudValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim confirmed fraud'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimProvenFraud(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimProvenFraudValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimProvenFraudValue)){
			return lreturn
		}
		String lStrSfClaimProvenFraudValue=strSfClaimProvenFraudValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrSfClaimProvenFraudValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrSfClaimProvenFraudValueFromElement=lStrSfClaimProvenFraudValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrSfClaimProvenFraudValueFromElement,'fraudCheckClaimData_provenFraud')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimProvenFraudValue)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in claim proven fraud'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimCommentBox(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCommentBoxValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimCommentBoxValue)){
			return lreturn
		}
		String lStrSfClaimCommentBoxValue=strSfClaimCommentBoxValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCommentBoxValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCommentBoxValueFromElement=lStrClaimCommentBoxValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCommentBoxValueFromElement,'fraudCheckClaimData_commentBox')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimCommentBoxValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim comment box'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfClaimIrregularitiesObserved(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIrregularitiesObservedValue){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimIrregularitiesObservedValue)){
			return lreturn
		}
		String lStrSfClaimIrregularitiesObservedValue=strSfClaimIrregularitiesObservedValue
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIrregularitiesObservedValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIrregularitiesObservedValueFromElement=lStrClaimIrregularitiesObservedValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIrregularitiesObservedValueFromElement,'irregularitiesObserved')){
						break
					}
				}
			}
			lResult=IDNSalesforceLightningClaimMotorCarNewbizCoreHelper.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimIrregularitiesObservedValue)
			if(!lResult){
				lStrErrorMessage='Cannot input text in claim irregularities observed'
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
}