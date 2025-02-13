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
public class IDNSalesforceLightningClaimMotorCarNewbizCoreHelper{
	public static Map inputSearchBySfObject(WebDriver webDriver,Map mapCaseDataCurrentInput,Map mapCaseDataCurrentOutput){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentOutput)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('StrSalesforceRecordId','')
			lreturn.put('StrSalesforceSearchByDefaultObjectValue','')
			lreturn.put('Result',lResult)
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			Map lMapCaseDataCurrentOutput=mapCaseDataCurrentOutput
			String lStrSalesforceRecordId=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			Map lMapSearchDefaultObjectResult=IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil.inputSearchBySfObject(webDriver,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordId=lMapSearchDefaultObjectResult.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObjectResult.StrSalesforceSearchByDefaultObjectValue
			}
			lResult=lStrSalesforceRecordId.length()>0
			if(lResult){
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordId)
				lreturn.put('StrSalesforceSearchByDefaultObjectValue',lStrSalesforceSearchByDefaultObjectValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static List<WebElement> getListElementMainButton(WebDriver webDriver){
		List<WebElement> lreturn=null
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01SearchHomeFlexipageParent='div.recordHomeFlexipage2'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild01='div.actionsContainer'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild02='runtime_platform_actions-actions-ribbon'
			WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild02=null
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent,5)
			List<WebElement> lListElementSearch01InputLevel01SearchHomeFlexipageParent=IGNUemaHelper.getWebElementListFromCssLocator(webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)
			for(WebElement lElementSearch01InputLevel01SearchHomeFlexipageParent:lListElementSearch01InputLevel01SearchHomeFlexipageParent){
				if(lElementSearch01InputLevel01SearchHomeFlexipageParent){
					Boolean lIsWebElementVisibled=IGNUemaHelper.checkElementVisibleByElementKs(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageParent)
					if(lIsWebElementVisibled){
						WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageParent,lLocatorSearch01InputLevel01SearchHomeFlexipageChild01,true)
						if(lElementSearch01InputLevel01SearchHomeFlexipageChild01){
							lElementSearch01InputLevel01SearchHomeFlexipageChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild01,lLocatorSearch01InputLevel01SearchHomeFlexipageChild02,true)
						}
						break
					}
				}
			}
			String lLocatorSearch02InputLevel01LightningButtonMenuParent='ul'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild01='li'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild02='runtime_platform_actions-action-renderer'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild03='lightning-button'
			List<WebElement> lListElementSearch02InputLevel01LightningButtonMenuChild01=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild02=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild03=null
			if(lElementSearch01InputLevel01SearchHomeFlexipageChild02){
				WebElement lElementSearch02InputLevel01LightningButtonMenuParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild02,lLocatorSearch02InputLevel01LightningButtonMenuParent,true)
				if(lElementSearch02InputLevel01LightningButtonMenuParent){
					lListElementSearch02InputLevel01LightningButtonMenuChild01=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild01)
				}
			}
			lResult=lListElementSearch02InputLevel01LightningButtonMenuChild01.size()>0
			if(lResult){
				lreturn=lListElementSearch02InputLevel01LightningButtonMenuChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputMainTargetButton(WebDriver webDriver,List<WebElement> listElementMainButton,String strMainTargetButtonName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementMainButton)){
			return lreturn
		}
		List<WebElement> lListElementMainButton=listElementMainButton
		if(IGNUemaHelper.checkObjectNullOfObject(strMainTargetButtonName)){
			return lreturn
		}
		String lStrMainTargetButtonName=strMainTargetButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainTargetButtonName)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			for(Integer lIndex=0;lIndex<=lListElementMainButton.size()-1;lIndex++){
				WebElement lElementMainButton=lListElementMainButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementMainButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				String lStrMainButtonValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01LightningButtonParent,'title')
				if(lStrMainButtonValue==lStrMainTargetButtonName){
					WebElement lElementSearch01InputLevel01LightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningButtonParent,lLocatorSearch01InputLevel01LightningButtonChild01,true)
					if(lElementSearch01InputLevel01LightningButtonChild01){
						WebElement lElementSearch01InputLevel01LightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningButtonChild01,lLocatorSearch01InputLevel01LightningButtonChild02,true)
						if(lElementSearch01InputLevel01LightningButtonChild02){
							IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningButtonChild02)
							lResult=true
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
	public static Boolean inputSfNextButton(WebDriver webDriver,WebElement elementIgniteClaimReportingFormRoot,String strTargetButton){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetButton)){
			return lreturn
		}
		String lStrTargetButton=strTargetButton
		try{
			Boolean lIsNextButtonClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=this.getElementSfTargetNextButton(webDriver,lElementIgniteClaimReportingFormRoot,lStrTargetButton)
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lIsNextButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01)
				lResult=lIsNextButtonClickOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSfTargetNextButton(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent,String strTargetButtonName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetButtonName=strTargetButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningInputChild02='button'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			List<WebElement> lListElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01LightningInputChild01=lListElementSearch01InputLevel01LightningInputChild01.get(lIndex)
				if(lElementSearch01InputLevel01LightningInputChild01){
					lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
				}
				if(!lElementSearch01InputLevel01LightningInputChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01LightningInputChild02){
					String lStrNameValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,'name')
					lStrNameValue=lStrNameValue.toLowerCase()
					lStrTargetButtonName=lStrTargetButtonName.toLowerCase()
					if(lStrNameValue.equalsIgnoreCase(lStrTargetButtonName)){
						lResult=true
						break
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01LightningInputChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputValueSfToTargetTextArea(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-textarea'
			String lLocatorSearch01InputLevel01LightningInputChild02='textarea'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputValueSfToTargetInputTextA(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-input'
			String lLocatorSearch01InputLevel01LightningInputChild02='input'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputValueSfToTargetInputTextB(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetInputText=strTargetInputText
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetInputText)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-input'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01LightningInputChild03='input'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild03,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean clickSfToTargetButton(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild03='button'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningInputChild03)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean selectedValueSfToTargetBaseComboBoxItem(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent,String strTargetBaseComboBoxItemName,Boolean isContainString=false){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		String lStrTargetBaseComboBoxItemName=strTargetBaseComboBoxItemName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetBaseComboBoxItemName)){
			return lreturn
		}
		Boolean lIsContainString=isContainString
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01LightningInputChild03='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01LightningInputChild04='span.slds-truncate'
			WebElement lElementSearch01InputLevel01LightningInputChild01=null
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild03=null
			WebElement lElementSearch01InputLevel01LightningInputChild04=null
			List<WebElement> lListElementSearch01InputLevel01LightningInputChild03=[]
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lListElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03)
			}
			if(lListElementSearch01InputLevel01LightningInputChild03.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild03.size()-1;lIndex++){
					lElementSearch01InputLevel01LightningInputChild03=lListElementSearch01InputLevel01LightningInputChild03.get(lIndex)
					if(!lElementSearch01InputLevel01LightningInputChild03){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild03){
						lElementSearch01InputLevel01LightningInputChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild03,lLocatorSearch01InputLevel01LightningInputChild04,true)
					}
					if(!lElementSearch01InputLevel01LightningInputChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild04){
						String lStrValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild04,'title')
						lStrValue=lStrValue.toLowerCase()
						lStrTargetBaseComboBoxItemName=lStrTargetBaseComboBoxItemName.toLowerCase()
						if(lIsContainString){
							if(IGNUemaHelper.checkStringContainString(lStrValue,lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningInputChild04)
							}
						}else{
							if(lStrValue.equalsIgnoreCase(lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningInputChild04)
							}
						}
						if(lResult){
							break
						}
					}
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputAdjustDate(strDateOffset,strDateValue){
		Map lreturn=[:]
		String lStrDateOffset=strDateOffset.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrDateOffset)){
			return lreturn
		}
		String lStrDateValue=strDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrDateValue)){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('DateValue','')
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lFormatDate='dd/MM/yyyy'
			if(lStrDateValue.length()<=0||lStrDateValue.equalsIgnoreCase("TODAY")){
				lStrDateValue=IGNUemaHelper.convertLocalDateToString(lFormatDate)
			}
			Integer lStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lStrDateOffset,0)
			lStrDateValue=IGNUemaHelper.offsetDayByDateString(lFormatDate,lStrDateValue,lStartDayOffsetNum)
			lResult=lStrDateValue.length()>0
			if(lResult){
				lreturn.put('DateValue',lStrDateValue)
				lreturn.put('ErrorMessage',lStrErrorMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
}