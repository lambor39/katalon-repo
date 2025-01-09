package org.roojai.idn.types.salesforce.lightning.core
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import groovy.json.JsonSlurper
import internal.GlobalVariable
import org.apache.commons.lang3.StringUtils
import org.openqa.selenium.*
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreConst
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceMode
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectTypeName
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperCommon
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreType
import org.roojai.idn.core.IDNGlobalConst
public class IDNSalesforceLightningCoreHelperUI{
	public static Boolean inputSalesforceDefaultRecordIdPage(WebDriver webDriver,String strSearchByDefaultSalesforceRecordId,String strTargetSearchObjectTypeName,Boolean boolIsSfLightningOK){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSearchByDefaultSalesforceRecordId)){
			return lreturn
		}
		String lStrSearchByDefaultSalesforceRecordId=strSearchByDefaultSalesforceRecordId.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSearchByDefaultSalesforceRecordId)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectTypeName)){
			return lreturn
		}
		String lStrTargetSearchObjectTypeName=strTargetSearchObjectTypeName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectTypeName)){
			return lreturn
		}
		Boolean lIsSfLightningOK=boolIsSfLightningOK
		try{
			Boolean lIsSearchRecordIDOK=true
			String lLocatorSearch01InputLevel01SearchNavexStandManagerParent='div.none.navexStandardManager'
			String lLocatorSearch01InputLevel01SearchNavexStandManagerChild01='div.fullheight.center.oneCenterStage.mainContentMark'
			String lLocatorSearch01InputLevel01SearchNavexStandManagerChild02='div.uiBlock'
			String lLocatorSearch01InputLevel01SearchNavexStandManagerChild03='p.summary'
			String lPreviousUrl=webDriver.getCurrentUrl()
			Boolean lIsSwitchToHomePageOK=this.inputSalesforceSwitchUIMode(webDriver,lIsSfLightningOK)
			Boolean lIsNavigateSfTargetObjectPageByDirectAccessOK=false
			if(lIsSwitchToHomePageOK){
				IGNUemaHelper.delayThreadSecond(3)
				lIsNavigateSfTargetObjectPageByDirectAccessOK=this.navigateSfTargetObjectByDirectAccess(webDriver,lStrSearchByDefaultSalesforceRecordId,lStrTargetSearchObjectTypeName,lIsSfLightningOK)
			}
			if(lIsNavigateSfTargetObjectPageByDirectAccessOK){
				if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01SearchNavexStandManagerParent,25)){
					WebElement lElementSearch01InputLevel01SearchNavexStandManagerParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01SearchNavexStandManagerParent)
					IGNUemaHelper.delayThreadSecond(3)
					if(lElementSearch01InputLevel01SearchNavexStandManagerParent){
						IGNUemaHelper.delayThreadSecond(3)
						WebElement lElementSearch01InputLevel01SearchNavexStandManagerChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchNavexStandManagerParent,lLocatorSearch01InputLevel01SearchNavexStandManagerChild01,false)
						if(lElementSearch01InputLevel01SearchNavexStandManagerChild01){
							WebElement lElementSearch01InputLevel01SearchNavexStandManagerChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchNavexStandManagerChild01,lLocatorSearch01InputLevel01SearchNavexStandManagerChild02,true)
							if(lElementSearch01InputLevel01SearchNavexStandManagerChild02){
								WebElement lElementSearch01InputLevel01SearchNavexStandManagerChild03=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchNavexStandManagerChild02,lLocatorSearch01InputLevel01SearchNavexStandManagerChild03,true)
								if(lElementSearch01InputLevel01SearchNavexStandManagerChild03){
									String lStrElementSearch01InputLevel01SearchNavexStandManagerChild03Text=lElementSearch01InputLevel01SearchNavexStandManagerChild03.getText()
									if(lStrElementSearch01InputLevel01SearchNavexStandManagerChild03Text.contains('Looks')){
										lIsSearchRecordIDOK=false
									}
								}
							}
						}
					}
				}
			}
			if(!lIsSearchRecordIDOK){
				webDriver.navigate().to(lPreviousUrl)
			}
			lResult=lIsSearchRecordIDOK
			if(lResult){
				lreturn=true
			}
		}catch(Exception e){
		}
	}
	public static Map inputSalesforceTargetObjectSearchDetailByDefaultOptionValue(WebDriver webDriver,Boolean boolIsLightningMode,String strTargetSearchObjectTypeName,String strSfSearchByDetailObjAccountDefaultOptionValue){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordId=''
		String lStrListSalesforceRecordID=''
		List<String>  lListSalesforceRecordID=null
		try{
			lreturn.put('ListSalesforceRecordID',lListSalesforceRecordID)
			lreturn.put('StrSalesforceRecordID',lStrListSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(!webDriver){
				return lreturn
			}
			Boolean lIsLightningMode=boolIsLightningMode
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectTypeName)){
				return lreturn
			}
			String lStrTargetSearchObjectTypeName=strTargetSearchObjectTypeName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectTypeName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSfSearchByDetailObjAccountDefaultOptionValue)){
				return lreturn
			}
			String lStrSfSearchByDetailObjAccountDefaultOptionValue=strSfSearchByDetailObjAccountDefaultOptionValue.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailObjAccountDefaultOptionValue)){
				return lreturn
			}
			String lLocatorSearch01InputLevel01SearchAssistantParent='div.forceSearchAssistant'
			String lLocatorSearch01InputLevel01SearchAssistantChild01='button'
			String lLocatorSearch01InputLevel01SearchAssistantChild02='div.forceSearchAssistantDialog'
			String lLocatorSearch01InputLevel01SearchAssistantChild03='input'
			String lLocatorSearch01InputLevel02DropDownListItemParent='li.slds-listbox__item'
			String lLocatorSearch01InputLevel02DropDownListItemChild01='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel03SearchLightningInput='lightning-input'
			IDNEnumSalesforceObjectTypeName lIDNEnumSalesforceObjectTypeName=null
			try{
				lIDNEnumSalesforceObjectTypeName=IDNEnumSalesforceObjectTypeName.valueOf(lStrTargetSearchObjectTypeName)
			}catch(Exception ex){
			}
			if(IGNUemaHelper.checkObjectNullOfObject(lIDNEnumSalesforceObjectTypeName)){
				return lreturn
			}
			String lStrSalesforceTargetObjectTypeName=lIDNEnumSalesforceObjectTypeName.toRefString()
			String lPreviousUrl=webDriver.getCurrentUrl()
			Boolean lIsSwitchToHomePageOK=this.inputSalesforceSwitchUIMode(webDriver,lIsLightningMode)
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01SearchAssistantParent,15)){
				WebElement lElementSearch01InputLevel01SearchAssistantParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01SearchAssistantParent)
				if(lElementSearch01InputLevel01SearchAssistantParent){
					WebElement lElementSearch01InputLevel01SearchAssistantChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchAssistantParent,lLocatorSearch01InputLevel01SearchAssistantChild01,true)
					if(lElementSearch01InputLevel01SearchAssistantChild01){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01SearchAssistantChild01)
						WebElement lElementSearch01InputLevel01SearchAssistantChild02=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01SearchAssistantChild02)
						if(lElementSearch01InputLevel01SearchAssistantChild02){
							WebElement lElementSearch01InputLevel01SearchAssistantChild03=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchAssistantChild02,lLocatorSearch01InputLevel01SearchAssistantChild03,true)
							if(lElementSearch01InputLevel01SearchAssistantChild03){
								IGNUemaHelper.delayThreadSecond(3)
								IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01SearchAssistantChild03)
							}
							WebElement lElementSearchObjectAccountInput=null
							List<WebElement>  lElementSearch01InputLevel02DropDownListBoxParentList=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01SearchAssistantChild02,lLocatorSearch01InputLevel02DropDownListItemParent)
							if(lElementSearch01InputLevel02DropDownListBoxParentList.size()>0){
								for(Integer lSearchIndex=1;lSearchIndex<=lElementSearch01InputLevel02DropDownListBoxParentList.size()-1;lSearchIndex++){
									WebElement lElementSearch01InputLevel02DropDownListItemParent=lElementSearch01InputLevel02DropDownListBoxParentList.get(lSearchIndex)
									WebElement lElementSearch01InputLevel02DropDownListItemChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel02DropDownListItemParent,lLocatorSearch01InputLevel02DropDownListItemChild01,true)
									if(!IGNUemaHelper.checkObjectNullOfObject(lElementSearch01InputLevel02DropDownListItemChild01)){
										String  lStrElementSearch01InputLevel02DropDownListBoxChildText=lElementSearch01InputLevel02DropDownListItemChild01.getText()
										if(lStrSalesforceTargetObjectTypeName==lStrElementSearch01InputLevel02DropDownListBoxChildText){
											lElementSearchObjectAccountInput=lElementSearch01InputLevel02DropDownListItemChild01
											IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearchObjectAccountInput)
										}
									}
									if(!IGNUemaHelper.checkObjectNullOfObject(lElementSearchObjectAccountInput)){
										break
									}
								}
							}
							WebElement lElementSearch01InputLevel03SearchLightningInput=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchAssistantChild02,lLocatorSearch01InputLevel03SearchLightningInput,true)
							if(lElementSearch01InputLevel03SearchLightningInput){
								IGNUemaHelper.delayThreadSecond(3)
								IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel03SearchLightningInput)
								IGNUemaHelper.delayThreadSecond(3)
								String lStrText=IGNUemaHelper.typeSetTextWithEnterByWebElement(webDriver,lElementSearch01InputLevel03SearchLightningInput,lStrSfSearchByDetailObjAccountDefaultOptionValue)
								lResult=true
							}
						}
					}
				}
			}
			lListSalesforceRecordID=this.getListAllSalesforceTargetObjectRecordID(webDriver)
			List<String> lListUpdatedSalesforceRecordID=[]
			if(lListSalesforceRecordID.size()>0){
				for (String lStrRecordID:lListSalesforceRecordID){
					lStrRecordID=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrRecordID)
					lListUpdatedSalesforceRecordID.add(lStrRecordID)
				}
			}
			lStrListSalesforceRecordID=IGNUemaHelper.getStringCommaTextFromListString(lListUpdatedSalesforceRecordID)
			lResult=lStrListSalesforceRecordID.length()>0
			if(lResult){
				lreturn.put('ListSalesforceRecordID',lListSalesforceRecordID)
				lreturn.put('StrSalesforceRecordID',lStrListSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static List<String> getListAllSalesforceTargetObjectRecordID(WebDriver webDriver){
		List<String> lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		try{
			List<String> lListRecordID=[]
			Integer  lNumCurrentSearchTableListSize=0
			Integer lNumPreviousSearchTableListSize=0
			List<WebElement> lElementSalesforceObjectTableList=null
			IGNUemaHelper.delayThreadSecond(5)
			WebElement lElementSalesforceObjectTableGridCell=this.getElementSalesforceTargetObjectSearchResultTable(webDriver)
			if(lElementSalesforceObjectTableGridCell){
				Integer lScrollIndex=1
				for(Integer lIndex=0;lIndex<lScrollIndex;){
					lElementSalesforceObjectTableList=this.getListElementSalesforceTargetObjectSearchResultMainTable(webDriver,lElementSalesforceObjectTableGridCell)
					if(lElementSalesforceObjectTableList.size()>0){
						lNumPreviousSearchTableListSize=lElementSalesforceObjectTableList.size()
						WebElement lElementSalesforceObjectTableGridCellLastRow=lElementSalesforceObjectTableList.get(lNumPreviousSearchTableListSize-1)
						WebElement lElementSalesforceObjectTableGridCellFirstRow=this.getElementSalesforceTargetObjectSearchResultFirstGridCellRow(webDriver,lElementSalesforceObjectTableGridCellLastRow)
						if(lElementSalesforceObjectTableGridCellFirstRow){
							IGNUemaHelper.webArrowScrollElementDown(webDriver,lElementSalesforceObjectTableGridCellLastRow,20)
						}
					}
					lElementSalesforceObjectTableList=this.getListElementSalesforceTargetObjectSearchResultMainTable(webDriver,lElementSalesforceObjectTableGridCell)
					lNumCurrentSearchTableListSize=lElementSalesforceObjectTableList.size()
					if(lNumCurrentSearchTableListSize>lNumPreviousSearchTableListSize){
						lScrollIndex=lScrollIndex+1
						lIndex=lIndex+1
					}
					if(lNumCurrentSearchTableListSize==lNumPreviousSearchTableListSize){
						lIndex=0
						lScrollIndex=0
					}
				}
			}
			String lLocatorSalesforceObjectTableCurrentRowGridCellChild='a'
			for(Integer lRefineSearchIndex=0;lRefineSearchIndex<=lElementSalesforceObjectTableList.size()-1;lRefineSearchIndex++){
				WebElement lElementSalesforceObjectTableCurrentRowGridCellParent=lElementSalesforceObjectTableList.get(lRefineSearchIndex)
				if(lElementSalesforceObjectTableCurrentRowGridCellParent){
					WebElement lElementSalesforceObjectTableCurrentRowGridCellChild=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSalesforceObjectTableCurrentRowGridCellParent,lLocatorSalesforceObjectTableCurrentRowGridCellChild,true)
					if(!IGNUemaHelper.checkObjectNullOfObject(lElementSalesforceObjectTableCurrentRowGridCellChild)){
						String lStrAttributeDataRecordIDValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSalesforceObjectTableCurrentRowGridCellChild,'data-recordid')
						lListRecordID.add(lStrAttributeDataRecordIDValue)
					}
				}
			}
			lResult=lListRecordID.size()>0
			if(lResult){
				lreturn=lListRecordID
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static List<WebElement> getListElementSalesforceTargetObjectSearchResultMainTable(WebDriver webDriver,WebElement elementSalesforceTargetSearchBodyInput){
		List<WebElement> lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSalesforceTargetSearchBodyInput)){
			return lreturn
		}
		WebElement lElementRefineSearchAccountInputBodyMain=elementSalesforceTargetSearchBodyInput
		try{
			List<WebElement> lElementRefineSearchAccountInputBodyMainList=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementRefineSearchAccountInputBodyMain,'tr')
			lResult=lElementRefineSearchAccountInputBodyMainList.size()>0
			if(lResult){
				lreturn=lElementRefineSearchAccountInputBodyMainList
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSalesforceTargetObjectSearchResultFirstGridCellRow(WebDriver webDriver,WebElement elementSalesforceTargetSearchBodyInput){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSalesforceTargetSearchBodyInput)){
			return lreturn
		}
		WebElement lElementSearchTargetInputBodyMain=elementSalesforceTargetSearchBodyInput
		try{
			WebElement lElementSearchTargetInput=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearchTargetInputBodyMain,'th',true)
			if(lElementSearchTargetInput){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearchTargetInput
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSalesforceTargetObjectSearchResultTable(WebDriver webDriver){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01RefineSearchTableParent='div.scroller.actionBarPlugin'
			String lLocatorSearch01InputLevel01RefineSearchTableChild01='table'
			String lLocatorSearch01InputLevel01RefineSearchTableChild02='tbody'
			WebElement lElementSearch01InputLevel01RefineSearchTableChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01RefineSearchTableParent,15)){
				WebElement lElementSearch01InputLevel01RefineSearchTableParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01RefineSearchTableParent)
				if(lElementSearch01InputLevel01RefineSearchTableParent){
					WebElement lElementSearch01InputLevel01RefineSearchTableChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01RefineSearchTableParent,lLocatorSearch01InputLevel01RefineSearchTableChild01,true)
					if(lElementSearch01InputLevel01RefineSearchTableChild01){
						lElementSearch01InputLevel01RefineSearchTableChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01RefineSearchTableChild01,lLocatorSearch01InputLevel01RefineSearchTableChild02,true)
						if(lElementSearch01InputLevel01RefineSearchTableChild02){
							lResult=true
						}
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01RefineSearchTableChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean navigateSfTargetObjectByDirectAccess(WebDriver webDriver,String strSearchByDefaultSalesforceRecordId,String strTargetSearchObjectTypeName,Boolean boolIsSfLightningMode){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSearchByDefaultSalesforceRecordId)){
			return lreturn
		}
		String lStrSearchByDefaultSalesforceRecordId=strSearchByDefaultSalesforceRecordId.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSearchByDefaultSalesforceRecordId)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectTypeName)){
			return lreturn
		}
		String lStrTargetSearchObjectTypeName=strTargetSearchObjectTypeName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectTypeName)){
			return lreturn
		}
		Boolean lIsSfLightningMode=boolIsSfLightningMode
		try{
			String lStrSalesforceLightningUrl=IGNSalesforceRestAPIHelper.getConfigurationSalesforceServerURI()
			String lStrSalesforceLightningAccountFullAccessPageUrl=''
			if(lIsSfLightningMode){
				IDNEnumSalesforceMode lIDNEnumSalesforceMode=IDNEnumSalesforceMode.Lightning
				String lStrSfSwitchUIModeLightning=lIDNEnumSalesforceMode.toString()
				lStrSfSwitchUIModeLightning=lStrSfSwitchUIModeLightning.toLowerCase()
				lStrSalesforceLightningAccountFullAccessPageUrl=lStrSalesforceLightningUrl+'/'+lStrSfSwitchUIModeLightning+'/'+'r'+'/'+lStrTargetSearchObjectTypeName+'/'+lStrSearchByDefaultSalesforceRecordId+'/view'
			}else{
				lStrSalesforceLightningAccountFullAccessPageUrl=lStrSalesforceLightningUrl+'/'+lStrSearchByDefaultSalesforceRecordId
			}
			webDriver.navigate().to(lStrSalesforceLightningAccountFullAccessPageUrl)
			lreturn=true
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean initSalesforceLightningLoginWithCredential(WebDriver webDriver,String strUsername,String strPassword){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strUsername)){
			return lreturn
		}
		String lStrUsername=strUsername.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrUsername)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPassword)){
			return lreturn
		}
		String lStrPassword=strPassword.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPassword)){
			return lreturn
		}
		try{
			String lLocatorUsername='input#username'
			String lLocatorPassword='input#password'
			String lLocatorLogin='input#Login'
			IGNUemaHelper.delayWebUISecond(5)
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorUsername,15)){
				WebElement lElementUsernameInput=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorUsername)
				if(lElementUsernameInput){
					lStrUsername=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementUsernameInput,lStrUsername)
				}
			}
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorPassword,15)){
				WebElement lElementPasswordInput=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorPassword)
				if(lElementPasswordInput){
					lStrPassword=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementPasswordInput,lStrPassword)
				}
			}
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorLogin,15)){
				WebElement lElementLoginInput=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorLogin)
				if(lElementLoginInput){
					Boolean lIsLoginButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementLoginInput)
					lResult=lIsLoginButtonClickOK
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
	}
	public static Boolean checkTargetSalesforceModeIsLightning(String strSfSwitchModeValue){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(strSfSwitchModeValue)){
			return lreturn
		}
		String lStrSfSwitchModeValue=strSfSwitchModeValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSwitchModeValue)){
			return lreturn
		}
		try{
			IDNEnumSalesforceMode lIDNEnumSalesforceMode=IDNEnumSalesforceMode.valueOf(lStrSfSwitchModeValue)
			String lStrSalesforceModeName=lIDNEnumSalesforceMode.toRefString()
			Boolean lIsSfModeIsLightningOK=lStrSalesforceModeName.equals(lStrSfSwitchModeValue)
			lreturn=lIsSfModeIsLightningOK
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceSwitchUIMode(WebDriver webDriver,Boolean boolIsLightningMode){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		Boolean lIsSwitchLightningMode=boolIsLightningMode
		try{
			String lStrSalesforceLightningUrl=IGNSalesforceRestAPIHelper.getConfigurationSalesforceServerURI()
			String lLocatorSfSwitchLightningLink='a.switch-to-lightning'
			Boolean lIsSfSwitchModeOK=false
			if(lIsSwitchLightningMode){
				if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSfSwitchLightningLink)){
					Boolean lIsSwitchModeLightning=this.switchSfModeToLightning(webDriver)
					lIsSfSwitchModeOK=lIsSwitchModeLightning
				}else{
					IDNEnumSalesforceMode lIDNEnumSalesforceMode=IDNEnumSalesforceMode.Lightning
					String lStrSfSwitchUIModeLightning=lIDNEnumSalesforceMode.toString()
					lStrSfSwitchUIModeLightning=lStrSfSwitchUIModeLightning.toLowerCase()
					String lSfLightningHomePageUrl=lStrSalesforceLightningUrl+'/'+lStrSfSwitchUIModeLightning+'/'+'page'+'/'+'home'
					webDriver.navigate().to(lSfLightningHomePageUrl)
					lIsSfSwitchModeOK=true
				}
			}else{
				if(!IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSfSwitchLightningLink)){
					Boolean lIsSwitchModeClassic=this.switchSfModeToClassic(webDriver)
					lIsSfSwitchModeOK=lIsSwitchModeClassic
				}else{
					IDNEnumSalesforceMode lIDNEnumSalesforceMode=IDNEnumSalesforceMode.Classic
					String lStrSfSwitchUIModeClassic=lIDNEnumSalesforceMode.toString()
					lStrSfSwitchUIModeClassic=lStrSfSwitchUIModeClassic.toLowerCase()
					String lSfClassicHomePageUrl=lStrSalesforceLightningUrl+'/'+lStrSfSwitchUIModeClassic+'/'+'home'+'/'+'home'+'.'+'jsp'
					webDriver.navigate().to(lSfClassicHomePageUrl)
					lIsSfSwitchModeOK=true
				}
			}
			lResult=lIsSfSwitchModeOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean switchSfModeToLightning(WebDriver webDriver){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		try{
			String lLocatorSfSwitchLightningLink='a.switch-to-lightning'
			WebElement lElementSwitchToLightningLink=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSfSwitchLightningLink)
			Boolean lIsSwitchToLightningOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSwitchToLightningLink)
			lResult=lIsSwitchToLightningOK
			if(lResult){
				lResult=lreturn
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean switchSfModeToClassic(WebDriver webDriver){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardParent='div.slds-global-header'
			String lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardChild01='span.oneUserProfileCardTrigger'
			String lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardChild02='button'
			WebElement lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardParent)){
				WebElement lElementSearch01InputLevel01SelectGlobalHeaderProfileCardParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardParent)
				if(lElementSearch01InputLevel01SelectGlobalHeaderProfileCardParent){
					WebElement lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SelectGlobalHeaderProfileCardParent,lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardChild01,true)
					if(lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild01){
						lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild01,lLocatorSearch01InputLevel01SelectGlobalHeaderProfileCardChild02,true)
					}
				}
				String lLocatorSearch02InputLevel01SelectSfSwitchClassicLink='a.profile-link-label.switch-to-aloha.uiOutputURL'
				if(lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild02){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01SelectGlobalHeaderProfileCardChild02)
					if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch02InputLevel01SelectSfSwitchClassicLink)){
						WebElement lElementSearch02InputLevel01SelectSfSwitchClassicLink=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch02InputLevel01SelectSfSwitchClassicLink)
						Boolean lIsSwitchToClassicOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch02InputLevel01SelectSfSwitchClassicLink)
						lResult=lIsSwitchToClassicOK
					}
				}
			}
			if(lResult){
				lResult=lreturn
			}
		}catch(Exception e){
		}
		return lreturn
	}
}