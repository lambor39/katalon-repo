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
		return lreturn
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
			IGNUemaHelper.delayThreadSecond(3)
			if(IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorUsername)){
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
	public static Map getListSalesforceQuoteElementPolicyFlowButton(WebDriver webDriver){
		Map lreturn=[:]
		List<WebElement> lListElementSalesforceQuoteElementPolicyFlowButton=null
		WebElement lElementDropDownSalesforceQuoteElementPolicyFlowButton=null
		Boolean lResult=false
		try{
			lreturn.put('ListElementSalesforceQuoteElementPolicyFlowButton',lListElementSalesforceQuoteElementPolicyFlowButton)
			lreturn.put('ElementDropDownSalesforceQuoteElementPolicyFlowButton',lElementDropDownSalesforceQuoteElementPolicyFlowButton)
			lreturn.put('Result',lResult)
			if(!webDriver){
				return lreturn
			}
			Boolean lIsOK=true
			String lLocatorSearch01InputLevel01SearchHomeFlexipageParent='div.recordHomeFlexipage2'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild01='div.actionsContainer'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild02='runtime_platform_actions-actions-ribbon'
			List<WebElement> lListElementSearch03InputLevel01PolicyFlowButton=null
			WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)){
				WebElement lElementSearch01InputLevel01SearchHomeFlexipageParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)
				if(lElementSearch01InputLevel01SearchHomeFlexipageParent){
					WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageParent,lLocatorSearch01InputLevel01SearchHomeFlexipageChild01,true)
					if(lElementSearch01InputLevel01SearchHomeFlexipageChild01){
						lElementSearch01InputLevel01SearchHomeFlexipageChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild01,lLocatorSearch01InputLevel01SearchHomeFlexipageChild02,true)
					}
				}
			}
			String lLocatorSearch02InputLevel01LightningButtonMenuParent='ul'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild01='li'
			String lLocatorSearch02InputLevel01LightningButtonMenuChild02='li.slds-dropdown-trigger'
			List<WebElement> lListElementSearch02InputLevel01LightningButtonMenuChild01=null
			WebElement lElementSearch02InputLevel01LightningButtonMenuChild02=null
			if(lElementSearch01InputLevel01SearchHomeFlexipageChild02){
				WebElement lElementSearch02InputLevel01LightningButtonMenuParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild02,lLocatorSearch02InputLevel01LightningButtonMenuParent,true)
				if(lElementSearch02InputLevel01LightningButtonMenuParent){
					lListElementSearch02InputLevel01LightningButtonMenuChild01=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild01)
					lElementSearch02InputLevel01LightningButtonMenuChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild02,true)
				}
			}
			if(lElementSearch02InputLevel01LightningButtonMenuChild02){
				lElementDropDownSalesforceQuoteElementPolicyFlowButton=lElementSearch02InputLevel01LightningButtonMenuChild02
				lListElementSalesforceQuoteElementPolicyFlowButton=lListElementSearch02InputLevel01LightningButtonMenuChild01
				lIsOK=true
			}
			lIsOK=(lListElementSalesforceQuoteElementPolicyFlowButton.size()>0&&lIsOK)
			lResult=lIsOK
			if(lResult){
				lreturn.put('ListElementSalesforceQuoteElementPolicyFlowButton',lListElementSalesforceQuoteElementPolicyFlowButton)
				lreturn.put('ElementDropDownSalesforceQuoteElementPolicyFlowButton',lElementDropDownSalesforceQuoteElementPolicyFlowButton)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuotePolicyFlowButton(WebDriver webDriver,List<WebElement> listElementPolicyFlowButton,WebElement elementDropDownPolicyFlowButton ,String strOpenPolicyFlowButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementPolicyFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementPolicyFlowButton=listElementPolicyFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(elementDropDownPolicyFlowButton)){
			return lreturn
		}
		WebElement lElementDropDownPolicyFlowButton=elementDropDownPolicyFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strOpenPolicyFlowButtonName)){
			return lreturn
		}
		String lStrOpenPolicyFlowButtonName=strOpenPolicyFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrOpenPolicyFlowButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			WebElement lElementPolicyFlowButtonMain=null
			Boolean lIsFindSalesforceQuoteFindPolicyFlowButtonOK=this.findSalesforceQuoteFindPolicyFlowButtonByDirectLabel(webDriver,lListElementPolicyFlowButton,lStrOpenPolicyFlowButtonName)
			if(!lIsFindSalesforceQuoteFindPolicyFlowButtonOK){
				String lLocatorSearch02InputLevel01DropDownBoxChild01='lightning-button-menu'
				String lLocatorSearch02InputLevel01DropDownBoxChild02='lightning-primitive-icon'
				if(lElementDropDownPolicyFlowButton){
					WebElement lElementSearch02InputLevel01DropDownBoxChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementDropDownPolicyFlowButton,lLocatorSearch02InputLevel01DropDownBoxChild01,true)
					if(lElementSearch02InputLevel01DropDownBoxChild01){
						WebElement lElementSearch02InputLevel01DropDownBoxChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch02InputLevel01DropDownBoxChild01,lLocatorSearch02InputLevel01DropDownBoxChild02,true)
						if(lElementSearch02InputLevel01DropDownBoxChild02){
							IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch02InputLevel01DropDownBoxChild02)
							List<WebElement> lListElementDropDownPolicyFlowButton=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch02InputLevel01DropDownBoxChild01,lLocatorSearch01InputLevel01LightningButtonParent)
							if(lListElementDropDownPolicyFlowButton.size()>0){
								lIsFindSalesforceQuoteFindPolicyFlowButtonOK=this.findSalesforceQuoteFindPolicyFlowButtonByDropdownLabel(webDriver,lListElementDropDownPolicyFlowButton,lStrOpenPolicyFlowButtonName)
							}
						}
					}
				}
			}
			lResult=lIsFindSalesforceQuoteFindPolicyFlowButtonOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean findSalesforceQuoteFindPolicyFlowButtonByDirectLabel(WebDriver webDriver,List<WebElement> listElementPolicyFlowButton,String strOpenPolicyFlowButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementPolicyFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementPolicyFlowButton=listElementPolicyFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strOpenPolicyFlowButtonName)){
			return lreturn
		}
		String lStrOpenPolicyFlowButtonName=strOpenPolicyFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrOpenPolicyFlowButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			WebElement lElementPolicyFlowButtonMain=null
			for(Integer lIndex=0;lIndex<=lListElementPolicyFlowButton.size()-1;lIndex++){
				WebElement lElementPolicyFlowButton=lListElementPolicyFlowButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementPolicyFlowButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				String lStrPolicyFlowButtonValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01LightningButtonParent,'title')
				if(lStrPolicyFlowButtonValue==lStrOpenPolicyFlowButtonName){
					lElementPolicyFlowButtonMain=lElementSearch01InputLevel01LightningButtonParent
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
			if(lResult){
				lreturn=true
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean findSalesforceQuoteFindPolicyFlowButtonByDropdownLabel(WebDriver webDriver,List<WebElement> listElementPolicyFlowButton,String strOpenPolicyFlowButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementPolicyFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementPolicyFlowButton=listElementPolicyFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strOpenPolicyFlowButtonName)){
			return lreturn
		}
		String lStrOpenPolicyFlowButtonName=strOpenPolicyFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrOpenPolicyFlowButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningButtonParent='lightning-menu-item'
			String lLocatorSearch01InputLevel01LightningButtonChild01='span'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			WebElement lElementPolicyFlowButtonMain=null
			for(Integer lIndex=0;lIndex<=lListElementPolicyFlowButton.size()-1;lIndex++){
				WebElement lElementPolicyFlowButton=lListElementPolicyFlowButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementPolicyFlowButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				if(lElementSearch01InputLevel01LightningButtonParent){
					WebElement lElementSearch01InputLevel01LightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningButtonParent,lLocatorSearch01InputLevel01LightningButtonChild01,true)
					String lStrPolicyFlowButtonValue=lElementSearch01InputLevel01LightningButtonChild01.getText()
					if(lStrPolicyFlowButtonValue==lStrOpenPolicyFlowButtonName){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningButtonChild01)
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=true
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSalesforceQuoteIgnitePolicyFlowRoot(WebDriver webDriver){
		WebElement lreturn=null
		if(!webDriver){
			return lreturn
		}
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01IgnitePolicyFlowParent='c-ignite-policy-flow'
			String lLocatorSearch01InputLevel01IgnitePolicyFlowChild01='div.slds-grid'
			String lLocatorSearch01InputLevel01IgnitePolicyFlowChild02='c-ign-quotation-flow'
			WebElement lElementSearch01InputLevel01IgnitePolicyFlowChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(webDriver,lLocatorSearch01InputLevel01IgnitePolicyFlowParent)){
				WebElement lElementSearch01InputLevel01IgnitePolicyFlowParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgnitePolicyFlowParent)
				if(lElementSearch01InputLevel01IgnitePolicyFlowParent){
					WebElement lElementSearch01InputLevel01IgnitePolicyFlowChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgnitePolicyFlowParent,lLocatorSearch01InputLevel01IgnitePolicyFlowChild01,true)
					if(lElementSearch01InputLevel01IgnitePolicyFlowChild01){
						lElementSearch01InputLevel01IgnitePolicyFlowChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgnitePolicyFlowChild01,lLocatorSearch01InputLevel01IgnitePolicyFlowChild02,true)
					}
				}
			}
			if(lElementSearch01InputLevel01IgnitePolicyFlowChild02){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01IgnitePolicyFlowChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteProductType(WebDriver webDriver,WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteProductType){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteProductType)){
			return lreturn
		}
		String lStrSfQuoteProductType=strSfQuoteProductType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteProductType)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='lightning-base-combobox-item'
			Boolean lIsProductTypeDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild02){
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,'id')
						if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
							lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				WebElement lElemenSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild04,true)
				if(lElemenSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElemenSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild05)
				if(lListElementSearch01InputLevel01QuotationFlowFormChild04.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,'data-value')
						lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
						lStrSfQuoteProductType=lStrSfQuoteProductType.toLowerCase()
						if(IGNUemaHelper.checkStringContainStringRemoveWhitespace(lStrProductTypeValue,lStrSfQuoteProductType)){
							IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
							lIsProductTypeDropDownClickOK=true
						}
					}
				}
			}
			if(lIsProductTypeDropDownClickOK){
				if(lElementSearch01InputLevel01QuotationFlowFormParent){
					Boolean lIsInputNextPageNavigationActionDoneOK=this.inputSalesforceQuoteNextPageNavigationAction(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,'Next')
					if(lIsInputNextPageNavigationActionDoneOK){
						lResult=true
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteNextPageNavigationAction(WebDriver webDriver,WebElement elementIgnitePolicyFlowRoot,String strNavigationButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent=elementIgnitePolicyFlowRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strNavigationButtonName)){
			return lreturn
		}
		String lStrNavigationButtonName=strNavigationButtonName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrNavigationButtonName)){
			return lreturn
		}
		try{
			WebElement lElementQuotationFlowFormFooterNavigationLightningButtonMain=null
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01='div.slds-card__footer.navigationBar'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02='lightning-button'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03='button'
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=null
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01,true)
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01){
				List<WebElement> lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02)
				if(lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.get(lIndex)
						String lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text=lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.getText()
						if((lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text==lStrNavigationButtonName)||(IGNUemaHelper.checkStringContainString(lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text,lStrNavigationButtonName))){
							lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static  WebElement getElementSaleforceQuoteTargetFlowDetailRoot(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strLocatorSearch01InputLevel01TargetFlowDetailChild01){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strLocatorSearch01InputLevel01TargetFlowDetailChild01)){
			return lreturn
		}
		String lLocatorSearch01InputLevel01TargetDetailFlowFormChild01=strLocatorSearch01InputLevel01TargetFlowDetailChild01.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lLocatorSearch01InputLevel01TargetDetailFlowFormChild01)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetDetailFlowFormChild01,false)
			if(lElementSearch01InputLevel01TargetFlowDetailChild01){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteMainInsuredDetail(WebDriver webDriver,WebElement elementSearch01InputLevel01MainInsuredParent,String strSfQuoteInsuredDateOfBirth,String strSfQuoteInsuredGender,String strSfQuoteInsuredMaritalStatus,String strSfQuoteInsuredOccupation){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01MainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01MainInsuredParent=elementSearch01InputLevel01MainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteInsuredDateOfBirth)){
			return lreturn
		}
		String lStrSfQuoteInsuredDateOfBirth=strSfQuoteInsuredDateOfBirth
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteInsuredDateOfBirth)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteInsuredGender)){
			return lreturn
		}
		String lStrSfQuoteInsuredGender=strSfQuoteInsuredGender
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteInsuredGender)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteInsuredMaritalStatus)){
			return lreturn
		}
		String lStrSfQuoteInsuredMaritalStatus=strSfQuoteInsuredMaritalStatus
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteInsuredMaritalStatus)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteInsuredOccupation)){
			return lreturn
		}
		String lStrSfQuoteInsuredOccupation=strSfQuoteInsuredOccupation
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteInsuredOccupation)){
			return lreturn
		}
		try{
			String lStrInputMainInsuredDobName='insured_dob'
			Boolean lIsInputMainInsuredDobOK=this.inputSalesforceQuoteMainInsuredDob(webDriver,lElementSearch01InputLevel01MainInsuredParent,lStrInputMainInsuredDobName,lStrSfQuoteInsuredDateOfBirth)
			if(!lIsInputMainInsuredDobOK){
				return lreturn
			}
			String lStrMainInsuredGender='insured_gender'
			Boolean lIsInputMainInsuredGenderOK=this.inputSalesforceQuoteTargetDetailByRadioButton(webDriver,lElementSearch01InputLevel01MainInsuredParent,lStrMainInsuredGender,lStrSfQuoteInsuredGender,true)
			if(!lIsInputMainInsuredGenderOK){
				return lreturn
			}
			String lStrMainInsuredMaritalStatus='insured_maritialStatus'
			Boolean lIsInputMainInsuredMaritalStatusOK=this.inputSalesforceQuoteTargetDetailByRadioButton(webDriver,lElementSearch01InputLevel01MainInsuredParent,lStrMainInsuredMaritalStatus,lStrSfQuoteInsuredMaritalStatus,true)
			if(!lIsInputMainInsuredMaritalStatusOK){
				return lreturn
			}
			String lStrInputMainInsuredOccupationName='insured_occupation'
			Boolean lIsInputMainInsuredOccupationOK=this.inputSalesforceQuoteTargetDetailByComboBox(webDriver,lElementSearch01InputLevel01MainInsuredParent,lStrInputMainInsuredOccupationName,lStrSfQuoteInsuredOccupation,true)
			if(!lIsInputMainInsuredOccupationOK){
				return lreturn
			}
			lreturn=lIsInputMainInsuredOccupationOK
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteMainInsuredDob(WebDriver webDriver,WebElement elementSearch01InputLevel01MainInsuredParent,String strMainInsuredName,String strMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01MainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01MainInsuredParent=elementSearch01InputLevel01MainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredName)){
			return lreturn
		}
		String lStrMainInsuredName=strMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredValue)){
			return lreturn
		}
		String lStrMainInsuredValue=strMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredValue)){
			return lreturn
		}
		try{
			WebElement lElementMainInsuredInput=null
			String lLocatorSearch01InputLevel01MainInsuredChild01='lightning-datepicker'
			String lLocatorSearch01InputLevel01MainInsuredChild02='input'
			WebElement lElementSearch01InputLevel01MainInsuredByNameParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01MainInsuredParent,lStrMainInsuredName)
			if(lElementSearch01InputLevel01MainInsuredByNameParent){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01MainInsuredByNameParent)
				WebElement lElementSearch01InputLevel01MainInsuredChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01MainInsuredByNameParent,lLocatorSearch01InputLevel01MainInsuredChild01,false)
				if(lElementSearch01InputLevel01MainInsuredChild01){
					WebElement lElementSearch01InputLevel01MainInsuredChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01MainInsuredChild01,lLocatorSearch01InputLevel01MainInsuredChild02,false)
					if(lElementSearch01InputLevel01MainInsuredChild02){
						IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01MainInsuredChild02,lStrMainInsuredValue)
						lResult=true
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteTargetDetailByComboBox(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetFlowDetailName,String strTargetFlowDetailValue,Boolean boolIsSelectComboboxByValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailName)){
			return lreturn
		}
		String lStrTargetFlowDetailName=strTargetFlowDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailValue)){
			return lreturn
		}
		String lStrTargetFlowDetailValue=strTargetFlowDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailValue)){
			return lreturn
		}
		Boolean lIsSelectComboboxByValue=boolIsSelectComboboxByValue
		try{
			WebElement lElementTargetDetailInput=null
			Boolean lIsInputSfTargetFlowDetailMainComboxOK=false
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetFlowDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				if(lIsSelectComboboxByValue){
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectTargetDetailFormComboboxItemByValue(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}else{
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectTargetDetailFormComboboxItemByTitle(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}

				lResult=lIsInputSfTargetFlowDetailMainComboxOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetPolicyDetailParent,String strTargetDetailInputName){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetPolicyDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetPolicyDetailParent=elementSearch01InputLevel01TargetPolicyDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailInputName)){
			return lreturn
		}
		String lStrTargetDetailInputName=strTargetDetailInputName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailInputName)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01TargetPolicyDetailByName=null
			IGNUemaHelper.delayThreadSecond(5)
			List<WebElement> lListElementSearch01InputLevel01TargetPolicyDetailParent=IGNUemaHelper.getChildShadowWebElementListAll(webDriver,lElementSearch01InputLevel01TargetPolicyDetailParent)
			if(lListElementSearch01InputLevel01TargetPolicyDetailParent.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetPolicyDetailParent.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetPolicyDetailCurrent=lListElementSearch01InputLevel01TargetPolicyDetailParent.get(lIndex)
					String lStrElementSearch01InputLevel01TargetPolicyDetailCurrentName=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01TargetPolicyDetailCurrent,'name')
					if(lStrElementSearch01InputLevel01TargetPolicyDetailCurrentName==lStrTargetDetailInputName){
						lElementSearch01InputLevel01TargetPolicyDetailByName=lElementSearch01InputLevel01TargetPolicyDetailCurrent
					}
				}
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetPolicyDetailByName
			}
			lResult=lreturn
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteTargetDetailByRadioButton(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue,Boolean booIsSearchByInput){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		Boolean lIsSearchByInput=booIsSearchByInput
		try{
			WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButton=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				if(lIsSearchByInput){
					lElementSearch01InputLevel01TargetFlowDetailRadioButton=this.getElementSalesforceQuoteTargetRadioButtonByValue(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				}else{
					lElementSearch01InputLevel01TargetFlowDetailRadioButton=this.getElementSalesforceQuoteTargetRadioButtonByLabel(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				}
				if(lElementSearch01InputLevel01TargetFlowDetailRadioButton){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButton)
					lResult=true
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static  WebElement getElementSalesforceQuoteTargetRadioButtonByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strRadioValue){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strRadioValue)){
			return lreturn
		}
		String lStrRadioValue=strRadioValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrRadioValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			List<WebElement> lListElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01)
			if(lListElementSearch01InputLevel01TargetFlowDetailChild01.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowDetailChild01.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetFlowDetailCurrentChild01=lListElementSearch01InputLevel01TargetFlowDetailChild01.get(lIndex)
					String lStrSearch01InputLevel01TargetFlowDetailChild01Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailCurrentChild01,'value')
					if(lStrSearch01InputLevel01TargetFlowDetailChild01Value==lStrRadioValue){
						lElementSearch01InputLevel01TargetFlowDetailChild01=lElementSearch01InputLevel01TargetFlowDetailCurrentChild01
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSalesforceQuoteTargetRadioButtonByLabel(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailRadioButtonParent,String strRadioValue){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailRadioButtonParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent=elementSearch01InputLevel01TargetFlowDetailRadioButtonParent
		if(IGNUemaHelper.checkObjectNullOfObject(strRadioValue)){
			return lreturn
		}
		String lStrRadioValue=strRadioValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrRadioValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01='input'
			String lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01='label'
			WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=null
			List<WebElement> lListSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent,lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01)
			List<WebElement> lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailRadioButtonParent,lLocatorSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01)
			if(lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.size()>0){
				for(Integer lIndex=0;lIndex<=lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01=lListSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.get(lIndex)
					String lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value=lElementSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01.getText()
					lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value=lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value.toLowerCase()
					lStrRadioValue=lStrRadioValue.toLowerCase()
					if(lStrSearch01InputLevel01TargetFlowDetailRadioButtonLabelChild01Value==lStrRadioValue){
						lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01=lListSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01.get(lIndex)
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailRadioButtonInputChild01
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static  Boolean selectTargetDetailFormComboboxItemByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='lightning-base-combobox-item'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild04)
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
					String lStrSearch01InputLevel01QuotationFlowFormChild04Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,'data-value')
					lStrSearch01InputLevel01QuotationFlowFormChild04Value=lStrSearch01InputLevel01QuotationFlowFormChild04Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01QuotationFlowFormChild04Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01QuotationFlowFormChild04Value,lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
						lreturn=true
						return lreturn
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean selectTargetDetailFormComboboxItemByTitle(WebDriver webDriver,WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='span.slds-truncate'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild04)
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,lLocatorSearch01InputLevel01QuotationFlowFormChild05,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild05){
						String lStrSearch01InputLevel01QuotationFlowFormChild05Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild05,'title')
						lStrSearch01InputLevel01QuotationFlowFormChild05Value=lStrSearch01InputLevel01QuotationFlowFormChild05Value.toLowerCase()
						lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
						if((lStrSearch01InputLevel01QuotationFlowFormChild05Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01QuotationFlowFormChild05Value, lStrSfQuoteMotorComboboxItem))){
							IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
							lreturn=true
							return lreturn
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteTargetDetailByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01TargetFlowDetailChild02='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild02=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01,true)
				if(lElementSearch01InputLevel01TargetFlowDetailChild01){
					lElementSearch01InputLevel01TargetFlowDetailChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailChild01,lLocatorSearch01InputLevel01TargetFlowDetailChild02,true)
				}
			}
			if(lElementSearch01InputLevel01TargetFlowDetailChild02){
				IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailChild02,lStrTargetDetailValue)
				lResult=true
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfQuoteProductType(WebDriver webDriver,WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorProductType){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorProductType)){
			return lreturn
		}
		String lStrSfQuoteMotorProductType=strSfQuoteMotorProductType.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorProductType)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-combobox'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='lightning-base-combobox-item'
			Boolean lIsProductTypeDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild02){
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,'id')
						if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
							lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				WebElement lElemenSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild04,true)
				if(lElemenSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElemenSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild03){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03,lLocatorSearch01InputLevel01QuotationFlowFormChild05)
				if(lListElementSearch01InputLevel01QuotationFlowFormChild04.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
						String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,'data-value')
						lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
						lStrSfQuoteMotorProductType=lStrSfQuoteMotorProductType.toLowerCase()
						if(lStrProductTypeValue==lStrSfQuoteMotorProductType){
							IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
							lIsProductTypeDropDownClickOK=true
						}
					}
				}
			}
			if(lIsProductTypeDropDownClickOK){
				if(lElementSearch01InputLevel01QuotationFlowFormParent){
					Boolean lIsInputNextPageNavigationActionDoneOK=this.inputNextPageNavigationAction(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,'Next')
					if(lIsInputNextPageNavigationActionDoneOK){
						lResult=true
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputNextPageNavigationAction(WebDriver webDriver,WebElement elementIgnitePolicyFlowRoot,String strNavigationButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent=elementIgnitePolicyFlowRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strNavigationButtonName)){
			return lreturn
		}
		String lStrNavigationButtonName=strNavigationButtonName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrNavigationButtonName)){
			return lreturn
		}
		try{
			WebElement lElementQuotationFlowFormFooterNavigationLightningButtonMain=null
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01='div.slds-card__footer.navigationBar'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02='lightning-button'
			String lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03='button'
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=null
			WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationParent,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild01,true)
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01){
				List<WebElement> lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=IGNUemaHelper.getChildWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild01,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild02)
				if(lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02=lListElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.get(lIndex)
						String lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text=lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02.getText()
						if((lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text==lStrNavigationButtonName)||(IGNUemaHelper.checkStringContainString(lStrElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02Text,lStrNavigationButtonName))){
							lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild02,lLocatorSearch01InputLevel01TargetFlowFormFooterNavigationChild03,true)
						}
					}
				}
			}
			if(lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01TargetFlowFormFooterNavigationChild03)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputDisclaimerPageNavigationAction(WebDriver webDriver){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningOverlayContainerParent='lightning-overlay-container'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild01='lightning-modal-base'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild02='lightning-modal'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild03='lightning-button'
			String lLocatorSearch01InputLevel01LightningOverlayContainerChild04='button'
			WebElement lElementSearch01InputLevel01LightningOverlayContainerChild04=null
			WebElement lElementSearch01InputLevel01LightningOverlayContainerParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver, lLocatorSearch01InputLevel01LightningOverlayContainerParent)
			if(lElementSearch01InputLevel01LightningOverlayContainerParent){
				WebElement lElementSearch01InputLevel01LightningOverlayContainerChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningOverlayContainerParent,lLocatorSearch01InputLevel01LightningOverlayContainerChild01,true)
				if(lElementSearch01InputLevel01LightningOverlayContainerChild01){
					WebElement lElementSearch01InputLevel01LightningOverlayContainerChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild01,lLocatorSearch01InputLevel01LightningOverlayContainerChild02,true)
					if(lElementSearch01InputLevel01LightningOverlayContainerChild02){
						List<WebElement> lListElementSearch01InputLevel01LightningOverlayContainerChild03=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild02,lLocatorSearch01InputLevel01LightningOverlayContainerChild03)
						if(lListElementSearch01InputLevel01LightningOverlayContainerChild03.size()>0){
							for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningOverlayContainerChild03.size()-1;lIndex++){
								WebElement lElementSearch01InputLevel01LightningOverlayContainerChild03=lListElementSearch01InputLevel01LightningOverlayContainerChild03.get(lIndex)
								String lStrElementSearch01InputLevel01LightningOverlayContainerChild03Text=lElementSearch01InputLevel01LightningOverlayContainerChild03.getText()
								if(lStrElementSearch01InputLevel01LightningOverlayContainerChild03Text=='Ok'){
									lElementSearch01InputLevel01LightningOverlayContainerChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild03,lLocatorSearch01InputLevel01LightningOverlayContainerChild04,true)
								}
							}
						}
					}
				}
			}
			if(lElementSearch01InputLevel01LightningOverlayContainerChild04){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01LightningOverlayContainerChild04)
				lResult=true
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceQuoteTargetDetailByCheckBox(WebDriver webDriver,WebElement elementTargetDetailFlowParent,String strTargetDetailCheckBoxName,String strTargetDetailCheckBoxValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementTargetDetailFlowParent)){
			return lreturn
		}
		WebElement lElementTargetDetailFlowParent=elementTargetDetailFlowParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxName)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxName=strTargetDetailCheckBoxName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxValue)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxValue=strTargetDetailCheckBoxValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxValue)){
			return lreturn
		}
		try{
			WebElement lElementTargetDetailFlowByName=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementTargetDetailFlowParent,lStrTargetDetailCheckBoxName)
			if(lElementTargetDetailFlowByName){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementTargetDetailFlowByName)
				Boolean lIsTargetDetailCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrTargetDetailCheckBoxValue)
				String lStrCheckBoxValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementTargetDetailFlowByName,'value')
				Boolean lIsStrCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrCheckBoxValue)
				if(lIsTargetDetailCheckBoxValueOK){
					if(!lIsStrCheckBoxValueOK){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementTargetDetailFlowByName)
					}
					lResult=true
				}else{
					if(lIsStrCheckBoxValueOK){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementTargetDetailFlowByName)
					}
					lResult=true
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfTargetPlanDetailByCheckBox(WebDriver webDriver,WebElement elementTargetDetailFlowParent,String strTargetDetailCheckBoxName,String strTargetDetailCheckBoxValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementTargetDetailFlowParent)){
			return lreturn
		}
		WebElement lElementTargetDetailFlowParent=elementTargetDetailFlowParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxName)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxName=strTargetDetailCheckBoxName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailCheckBoxValue)){
			return lreturn
		}
		String lStrTargetDetailCheckBoxValue=strTargetDetailCheckBoxValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailCheckBoxValue)){
			return lreturn
		}
		try{
			WebElement lElementSearch01InputLevel01LightningInputParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementTargetDetailFlowParent,lStrTargetDetailCheckBoxName)
			if(lElementSearch01InputLevel01LightningInputParent){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01LightningInputParent)
				Boolean lIsTargetDetailCheckBoxValueOK=IGNUemaHelper.convertStringToBoolean(lStrTargetDetailCheckBoxValue)
				if(lIsTargetDetailCheckBoxValueOK){
					WebElement lElementSearch01InputLevel01LightningInputChild01=this.getElementSfPlanDetailTargetCheckBox(webDriver,lElementSearch01InputLevel01LightningInputParent)
					if(lElementSearch01InputLevel01LightningInputChild01){
						IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch01InputLevel01LightningInputChild01)
						lResult=true
					}
				}else{
					lResult=true
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSfPlanDetailTargetCheckBox(WebDriver webDriver,WebElement elementSearch01InputLevel01LightningInputParent){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01LightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01LightningInputParent=elementSearch01InputLevel01LightningInputParent
		try{
			String lLocatorSearch01InputLevel01LightningInputChild01='lightning-primitive-input-checkbox'
			String lLocatorSearch01InputLevel01LightningInputChild02='input'
			WebElement lElementSearch01InputLevel01LightningInputChild02=null
			WebElement lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=true
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01LightningInputChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyHolderAndMainInsuredDob(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsInputSfPolicyHolderAndMainInsuredValueOK=false
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03='lightning-input'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=this.getElementSfPolicyHolderAndMainInsuredDobByName(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,lStrPolicyHolderAndMainInsuredName)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04){
									lIsInputSfPolicyHolderAndMainInsuredValueOK=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04,lStrPolicyHolderAndMainInsuredValue)
									lreturn=lIsInputSfPolicyHolderAndMainInsuredValueOK
									return lreturn
								}
							}
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSfPolicyHolderAndMainInsuredDobByName(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent,String strMainInsuredName){
		WebElement  lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent
		if(IGNUemaHelper.checkObjectNullOfObject(strMainInsuredName)){
			return lreturn
		}
		String lStrMainInsuredName=strMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrMainInsuredName)){
			return lreturn
		}
		try{
			WebElement lElementMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01='lightning-datepicker'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02='input'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02=null
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01,false)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01){
					lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02,false)
					if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02){
						String lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02,'Name')
						if(lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02NameValue==lStrMainInsuredName){
							lResult=true
						}
						lResult=true
					}
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningDatePickerChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyHolderAndMainInsuredByComboBox(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue,Boolean boolIsSelectComboboxByValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsSelectComboboxByValue=boolIsSelectComboboxByValue
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			Boolean lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=false
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03='lightning-picklist'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04='lightning-combobox'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild03,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04,true)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04){
									WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05=this.getElementCheckBoxFromPolicyHolderAndMainInsuredFormList(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild04,lStrPolicyHolderAndMainInsuredName)
									if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05){
										if(lIsSelectComboboxByValue){
											lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=this.selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByValue(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05,lStrPolicyHolderAndMainInsuredValue)
										}else{
											lIsInputSfPolicyHolderAndMainInsuredComboBoxOK=this.selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByTitle(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningComboboxChild05,lStrPolicyHolderAndMainInsuredValue)
										}
									}
								}
							}
						}
					}
				}
			}
			lResult=lIsInputSfPolicyHolderAndMainInsuredComboBoxOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyHolderAndMainInsuredByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,String strPolicyHolderAndMainInsuredName,String strPolicyHolderAndMainInsuredValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredValue=strPolicyHolderAndMainInsuredValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredValue)){
			return lreturn
		}
		Boolean lIsInputSfPolicyHolderAndMainInsuredValueOK=false
		try{
			WebElement lElementPolicyHolderAndMainInsuredInput=null
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01='lightning-layout-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02='lightning-input-field'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03='lightning-input'
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01.get(lIndex)
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02){
							WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,true)
							if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03){
								WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04=this.getElementSfPolicyHolderAndMainInsuredByName(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild03,lStrPolicyHolderAndMainInsuredName)
								if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04){
									lIsInputSfPolicyHolderAndMainInsuredValueOK=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningInputChild04,lStrPolicyHolderAndMainInsuredValue)
								}
							}
						}
					}
				}
			}
			lResult= lIsInputSfPolicyHolderAndMainInsuredValueOK
			if(lResult){
				lreturn=lResult
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementSfPolicyHolderAndMainInsuredByName(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strPolicyHolderAndMainInsuredName){
		WebElement lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredName=strPolicyHolderAndMainInsuredName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01TargetFlowDetailChild02='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild02=null
			if(lElementSearch01InputLevel01TargetFlowDetailParent){
				WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lLocatorSearch01InputLevel01TargetFlowDetailChild01,true)
				if(lElementSearch01InputLevel01TargetFlowDetailChild01){
					lElementSearch01InputLevel01TargetFlowDetailChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailChild01,lLocatorSearch01InputLevel01TargetFlowDetailChild02,true)
				}
			}
			if(lElementSearch01InputLevel01TargetFlowDetailChild02){
				String lStrElementSearch01InputLevel01TargetFlowDetailChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailChild02,'Name')
				if(lStrElementSearch01InputLevel01TargetFlowDetailChild02NameValue==lStrPolicyHolderAndMainInsuredName){
					lResult=true
				}
			}
			if(lResult){
				lreturn=lElementSearch01InputLevel01TargetFlowDetailChild02
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static WebElement getElementCheckBoxFromPolicyHolderAndMainInsuredFormList(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent,String strPolicyHolderAndMainInsuredComboBoxName){
		WebElement lreturn=null
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredComboBoxName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredComboBoxName=strPolicyHolderAndMainInsuredComboBoxName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredComboBoxName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03='button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild04='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild05='span.slds-truncate'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02=null
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01){
					lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredChild03Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03,'Name')
					if(lStrSearch01InputLevel01PolicyHolderAndMainInsuredChild03Value==lStrPolicyHolderAndMainInsuredComboBoxName){
						IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03)
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild03)
						IGNUemaHelper.delayThreadSecond(3)
						lIsComboboxItemDropDownClickOK=true
					}
				}
			}
			lResult=lIsComboboxItemDropDownClickOK
			if(lResult){
				lreturn=lElementSearch01InputLevel01PolicyHolderAndMainInsuredFormChild02
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02='span.slds-media__body'
			List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.size()-1;lIndex++){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.get(lIndex)
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,'data-value')
					lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value,lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02)
						lResult=true
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
	public static  Boolean selectTargetDetailPolicyHolderAndMainInsuredComboboxItemByTitle(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02='lightning-base-combobox.slds-combobox_container'
			List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.size()-1;lIndex++){
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01.get(lIndex)
				WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,true)
				if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02){
					String lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02,'title')
					lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value=lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value.toLowerCase()
					lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
					if((lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02Value,lStrSfQuoteMotorComboboxItem))){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredCheckBoxChild02)
						lResult=true
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
	public static Boolean inputSfPolicyHolderAndMainInsuredPageActionNavigation(WebDriver webDriver,WebElement elementSearch01InputLevel01PolicyHolderAndMainInsuredParent,String strPolicyHolderAndMainInsuredButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01PolicyHolderAndMainInsuredParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent=elementSearch01InputLevel01PolicyHolderAndMainInsuredParent
		if(IGNUemaHelper.checkObjectNullOfObject(strPolicyHolderAndMainInsuredButtonName)){
			return lreturn
		}
		String lStrPolicyHolderAndMainInsuredButtonName=strPolicyHolderAndMainInsuredButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPolicyHolderAndMainInsuredButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02='button'
			WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=null
			if( lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent){
				List<WebElement> lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver, lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonParent,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01)
				if(lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01=lListElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01.get(lIndex)
						lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild01,lLocatorSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02,true)
						if(lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02){
							String lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02NameValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02,'title')
							if(lStrElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02NameValue==lStrPolicyHolderAndMainInsuredButtonName){
								Boolean lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02ClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02)
								lreturn=lIsElementSearch01InputLevel01PolicyHolderAndMainInsuredLightningButtonChild02ClickOK
								return lreturn
							}
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyLightningButtonNavigation(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetFlowDetailButtonName){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailLightningButtonParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailButtonName)){
			return lreturn
		}
		String lStrTargetFlowDetailButtonName=strTargetFlowDetailButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailLightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01TargetFlowDetailLightningButtonChild02='button'
			WebElement lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02=null
			if( lElementSearch01InputLevel01TargetFlowDetailLightningButtonParent){
				List<WebElement> lListElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver, lElementSearch01InputLevel01TargetFlowDetailLightningButtonParent,lLocatorSearch01InputLevel01TargetFlowDetailLightningButtonChild01)
				if(lListElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01.size()>0){
					for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01.size()-1;lIndex++){
						WebElement lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01=lListElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01.get(lIndex)
						lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild01,lLocatorSearch01InputLevel01TargetFlowDetailLightningButtonChild02,true)
						if(lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02){
							String lStrElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02NameValue=lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02.getText()
							if(lStrElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02NameValue==lStrTargetFlowDetailButtonName){
								Boolean lIsElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02ClickOK=IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02)
								lreturn=lIsElementSearch01InputLevel01TargetFlowDetailLightningButtonChild02ClickOK
								return lreturn
							}
						}
					}
				}
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyCoverageDetail(WebDriver webDriver,WebElement elementIgnitePolicyFlowRoot){
		Boolean lreturn=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgnitePolicyFlowRoot)){
			return lreturn
		}
		WebElement lElementIgnitePolicyFlowRoot=elementIgnitePolicyFlowRoot
		try{
			String lLocatorIgniteSelectedCoverageFlowFormRoot='c-ign-selected-coverage'
			WebElement lElementIgniteSelectedCoverageFlowFormRoot=IDNSalesforceLightningCoreHelperUI.getElementSaleforceQuoteTargetFlowDetailRoot(webDriver,lElementIgnitePolicyFlowRoot,lLocatorIgniteSelectedCoverageFlowFormRoot)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteSelectedCoverageFlowFormRoot)){
				return lreturn
			}
			Boolean lIsInputIgniteSelectedCoverageFlowFormNextButtonOK=IDNSalesforceLightningCoreHelperUI.inputNextPageNavigationAction(webDriver,lElementIgniteSelectedCoverageFlowFormRoot,'Next')
			if(!lIsInputIgniteSelectedCoverageFlowFormNextButtonOK){
				return lreturn
			}
			lreturn=lIsInputIgniteSelectedCoverageFlowFormNextButtonOK
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSfPolicyDetailInformationByValue(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetDetailName,String strTargetDetailValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailName)){
			return lreturn
		}
		String lStrTargetDetailName=strTargetDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetDetailValue)){
			return lreturn
		}
		String lStrTargetDetailValue=strTargetDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetDetailValue)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01TargetFlowDetailChild01='input'
			WebElement lElementSearch01InputLevel01TargetFlowDetailChild01=null
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=IDNSalesforceLightningCoreHelperUI.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetDetailValue)
				lResult=true
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static Boolean inputSalesforceEndorseDetailByComboBox(WebDriver webDriver,WebElement elementSearch01InputLevel01TargetFlowDetailParent,String strTargetFlowDetailName,String strTargetFlowDetailValue,Boolean boolIsSelectComboboxByValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01TargetFlowDetailParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01TargetFlowDetailParent=elementSearch01InputLevel01TargetFlowDetailParent
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailName)){
			return lreturn
		}
		String lStrTargetFlowDetailName=strTargetFlowDetailName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFlowDetailValue)){
			return lreturn
		}
		String lStrTargetFlowDetailValue=strTargetFlowDetailValue
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetFlowDetailValue)){
			return lreturn
		}
		Boolean lIsSelectComboboxByValue=boolIsSelectComboboxByValue
		try{
			WebElement lElementTargetDetailInput=null
			Boolean lIsInputSfTargetFlowDetailMainComboxOK=false
			WebElement lElementSearch01InputLevel01TargetFlowDetailByNameParent=this.getWebElementSalesforceQuoteTargetDetailFlowFormInputByName(webDriver,lElementSearch01InputLevel01TargetFlowDetailParent,lStrTargetFlowDetailName)
			if(lElementSearch01InputLevel01TargetFlowDetailByNameParent){
				IGNUemaHelper.webJsScrollToElement(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent)
				if(lIsSelectComboboxByValue){
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectTargetDetailFormComboboxItemByValue(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}else{
					lIsInputSfTargetFlowDetailMainComboxOK=this.selectEndorseDetailFormComboboxItemByTitle(webDriver,lElementSearch01InputLevel01TargetFlowDetailByNameParent,lStrTargetFlowDetailValue)
				}

				lResult=lIsInputSfTargetFlowDetailMainComboxOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public static  Boolean selectEndorseDetailFormComboboxItemByTitle(WebDriver webDriver,WebElement elementSearch01InputLevel01QuotationFlowFormParent,String strSfQuoteMotorComboboxItem){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(elementSearch01InputLevel01QuotationFlowFormParent)){
			return lreturn
		}
		WebElement lElementSearch01InputLevel01QuotationFlowFormParent=elementSearch01InputLevel01QuotationFlowFormParent
		if(IGNUemaHelper.checkObjectNullOfObject(strSfQuoteMotorComboboxItem)){
			return lreturn
		}
		String lStrSfQuoteMotorComboboxItem=strSfQuoteMotorComboboxItem.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfQuoteMotorComboboxItem)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01QuotationFlowFormChild01='div.slds-form-element__control'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild02='lightning-base-combobox.slds-combobox_container'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild03='button'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild04='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild05='span.slds-media__body'
			String lLocatorSearch01InputLevel01QuotationFlowFormChild06='span'
			Boolean lIsComboboxItemDropDownClickOK=false
			WebElement lElementIgnitePolicyFlowInput=null
			WebElement lElementSearch01InputLevel01QuotationFlowFormChild02=null
			if(lElementSearch01InputLevel01QuotationFlowFormParent){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormParent,lLocatorSearch01InputLevel01QuotationFlowFormChild01,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild01){
					lElementSearch01InputLevel01QuotationFlowFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild01,lLocatorSearch01InputLevel01QuotationFlowFormChild02,true)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				WebElement lElementSearch01InputLevel01QuotationFlowFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild03,true)
				if(lElementSearch01InputLevel01QuotationFlowFormChild03){
					IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild03)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lElementSearch01InputLevel01QuotationFlowFormChild02){
				List<WebElement> lListElementSearch01InputLevel01QuotationFlowFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild02,lLocatorSearch01InputLevel01QuotationFlowFormChild04)
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01QuotationFlowFormChild04.size()-1;lIndex++){
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild04=lListElementSearch01InputLevel01QuotationFlowFormChild04.get(lIndex)
					WebElement lElementSearch01InputLevel01QuotationFlowFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04,lLocatorSearch01InputLevel01QuotationFlowFormChild05,true)
					if(lElementSearch01InputLevel01QuotationFlowFormChild05){
						WebElement lElementSearch01InputLevel01QuotationFlowFormChild06=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild05,lLocatorSearch01InputLevel01QuotationFlowFormChild06,true)
						if(lElementSearch01InputLevel01QuotationFlowFormChild06) {
							String lStrSearch01InputLevel01QuotationFlowFormChild06Value=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild06,'title')
							lStrSearch01InputLevel01QuotationFlowFormChild06Value=lStrSearch01InputLevel01QuotationFlowFormChild06Value.toLowerCase()
							lStrSfQuoteMotorComboboxItem=lStrSfQuoteMotorComboboxItem.toLowerCase()
							if((lStrSearch01InputLevel01QuotationFlowFormChild06Value==lStrSfQuoteMotorComboboxItem)||(IGNUemaHelper.checkStringContainString(lStrSearch01InputLevel01QuotationFlowFormChild06Value, lStrSfQuoteMotorComboboxItem))){
								IGNUemaHelper.clickByWebElementNoScroll(webDriver,lElementSearch01InputLevel01QuotationFlowFormChild04)
								lreturn=true
								return lreturn
							}
						}
					}
				}
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
			String lLocatorSearch01InputLevel01LightningInputChild04='span.slds-media__body'
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
						String lStrValue=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01LightningInputChild04,'textContent')
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
	public static Map inputValueWithInButtonWithSearch(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-lookup'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-lookup-desktop'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='lightning-grouped-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild06='button'
			String lLocatorSearch01InputLevel01IgniteMainFormChild07='input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild08='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteSearchFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteSearchFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteSearchFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild08=null
			WebElement lElementSearch01InputLevel01IgniteSearchFormParent=null
			WebElement lElementSearch01InputLevel01IgniteSearchFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteSearchFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteSearchFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild08=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				lElementSearch01InputLevel01IgniteMainFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lLocatorSearch01InputLevel01IgniteMainFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild05){
				lElementSearch01InputLevel01IgniteMainFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild06,true)
				lElementSearch01InputLevel01IgniteMainFormChild07=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild07,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild06)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild07){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild07){
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild07,lStrTargetValueName)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteMainFormChild08=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild08)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild08.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild08=lListElementSearch01InputLevel01IgniteMainFormChild08.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild08){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild08){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild08,'data-value')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild08)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteSearchFormParent)
			lElementSearch01InputLevel01IgniteSearchFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorSearch01InputLevel01IgniteSearchFormParent)
			if(!lElementSearch01InputLevel01IgniteSearchFormParent){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteSearchFormChild01)
			if(lElementSearch01InputLevel01IgniteSearchFormParent){
				lElementSearch01InputLevel01IgniteSearchFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteSearchFormParent,lLocatorSearch01InputLevel01IgniteSearchFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteSearchFormChild01){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorSearch01InputLevel01IgniteSearchFormChild02)
			if(lElementSearch01InputLevel01IgniteSearchFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteSearchFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteSearchFormChild01,lLocatorSearch01InputLevel01IgniteSearchFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteSearchFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteSearchFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(webDriver,lListElementSearch01InputLevel01IgniteSearchFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteSearchFormChild02)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputValueWithOutButtonWithSearch(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-lookup'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-lookup-desktop'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='lightning-grouped-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormParent='div.DESKTOP.uiContainerManager'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01='div.forceSearchLookupAdvanced'
			String lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02='a.outputLookupLink'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormParent=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimAddressFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				lElementSearch01InputLevel01IgniteMainFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lLocatorSearch01InputLevel01IgniteMainFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild05){
				lElementSearch01InputLevel01IgniteMainFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild06)
				IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild06,lStrTargetValueName)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild07){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild07,'data-value')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild07)
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
	public static Map inputSfLightningComboBoxWithPicklist(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='button'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='lightning-base-combobox-item'
			Boolean lIsClickOK=false
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,elementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteMainFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteMainFormChild02){
							lIsClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02)
						}
					}
					if(lIsClickOK){
						lIsClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteMainFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteMainFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteMainFormChild04){
						String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,'data-value')
						lStrValueFromElement=lStrValueFromElement.toLowerCase()
						lStrTargetValueName=lStrTargetValueName.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetValueName)){
							lIsClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04)
							lResult=lIsClickOK
						}
						if(lIsClickOK){
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
	public static Map inputSfLightningPicklist(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName,Boolean isContainString){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		Boolean lIsContainString=isContainString
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteMainFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteMainFormChild02){
							lResult=this.clickSfToTargetButton(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lStrTargetValueName,lIsContainString)
			if(!lResult){
				lStrErrorMessage='Cannot selected item in '+lStrTargetFieldName
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfLightningTextArea(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lStrTargetValueName)
			if(!lResult){
				lStrErrorMessage='Cannot input text in '+lStrTargetFieldName
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfLightningDatePickerWithOutTime(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04)
				lResult=IGNUemaHelper.typeSetTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lStrTargetValueName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfLightningPrimitiveInput(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lStrTargetValueName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfLightningDateTimePickerByDate(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteMainFormChild05='input'
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild05=null
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				lElementSearch01InputLevel01IgniteMainFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lLocatorSearch01InputLevel01IgniteMainFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild05){
				IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lStrTargetValueName)
			}
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map inputSfLightningDateTimePickerByTime(WebDriver webDriver,WebElement elementIgniteFormRoot,String strTargetFieldName,String strTargetValueName){
		Map lreturn=[:]
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteFormRoot=elementIgniteFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetFieldName)){
			return lreturn
		}
		String lStrTargetFieldName=strTargetFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetValueName)){
			return lreturn
		}
		String lStrTargetValueName=strTargetValueName.trim()
		try{
			Boolean lResult=false
			lreturn.put('ErrorMessage','')
			lreturn.put('Result',lResult)
			String lStrErrorMessage=''
			String lLocatorSearch01InputLevel01IgniteMainFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteMainFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild03='lightning-datetimepicker'
			String lLocatorSearch01InputLevel01IgniteMainFormChild04='lightning-timepicker'
			String lLocatorSearch01InputLevel01IgniteMainFormChild05='lightning-base-combobox'
			String lLocatorSearch01InputLevel01IgniteMainFormChild06='input'
			String lLocatorSearch01InputLevel01IgniteMainFormChild07='lightning-base-combobox-item'
			String lLocatorSearch01InputLevel01IgniteMainFormChild08='span.slds-truncate'
			Boolean lIsClickOK=false
			WebElement lElementSearch01InputLevel01IgniteMainFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild04=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild05=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild06=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild07=null
			WebElement lElementSearch01InputLevel01IgniteMainFormChild08=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteMainFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementIgniteFormRoot,lLocatorSearch01InputLevel01IgniteMainFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteMainFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteMainFormChild01=lListElementSearch01InputLevel01IgniteMainFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteMainFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteMainFormChild01){
					String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,'id')
					lStrValueFromElement=lStrValueFromElement.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetFieldName)){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild01){
				lElementSearch01InputLevel01IgniteMainFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild01,lLocatorSearch01InputLevel01IgniteMainFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild02){
				lElementSearch01InputLevel01IgniteMainFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild02,lLocatorSearch01InputLevel01IgniteMainFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild03){
				lElementSearch01InputLevel01IgniteMainFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild03,lLocatorSearch01InputLevel01IgniteMainFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild04){
				lElementSearch01InputLevel01IgniteMainFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04,lLocatorSearch01InputLevel01IgniteMainFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild05){
				lElementSearch01InputLevel01IgniteMainFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteMainFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteMainFormChild06){
				lIsClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild04)
			}
			if(!lIsClickOK){
				return lreturn
			}
			if(lIsClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild05,lLocatorSearch01InputLevel01IgniteMainFormChild07)
			}
			lIsClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteMainFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteMainFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild07,lLocatorSearch01InputLevel01IgniteMainFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteMainFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteMainFormChild08){
						String lStrValueFromElement=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementSearch01InputLevel01IgniteMainFormChild08,'title')
						lStrValueFromElement=lStrValueFromElement.toLowerCase()
						lStrTargetValueName=lStrTargetValueName.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrValueFromElement,lStrTargetValueName)){
							lIsClickOK=IGNUemaHelper.clickByWebElementWithScroll(webDriver,lElementSearch01InputLevel01IgniteMainFormChild07)
							lResult=lIsClickOK
						}
						if(lIsClickOK){
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
	public static Map getGenericObjectNameOnSfLightning(WebDriver webDriver){
		Map lreturn=[:]
		try{
			/*
			 * get url
			 * document.querySelector('div.recordHomeFlexipage2').baseURI
			 * 
			 * get object name
			 * document.querySelector('div.recordHomeFlexipage2').querySelector('div.slds-media__body').querySelector('div.entityNameTitle').querySelector('slot').outerText
			 * 
			 *get name 
			 * document.querySelector('div.recordHomeFlexipage2').querySelector('div.slds-media__body').querySelector('slot.slds-page-header__title').outerText
			 */
			Boolean lResult=false
			String lStrSalesforceBaseUrl=''
			String lStrSalesforceObjectName=''
			String lStrSalesforceValueName=''
			String lStrErrorMessage=''
			lreturn.put('SalesforceBaseUrl',lStrSalesforceBaseUrl)
			lreturn.put('SalesforceObjectName',lStrSalesforceObjectName)
			lreturn.put('SalesforceValueName',lStrSalesforceValueName)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
			String lLocatorIgniteMainFormParent='div.recordHomeFlexipage2'
			String lLocatorIgniteMainFormChild01='div.slds-media__body'
			String lLocatorIgniteObjectNameFormChild01='div.entityNameTitle'
			String lLocatorIgniteObjectNameFormChild02='slot'
			String lLocatorIgniteValueNameFormChild01='slot.slds-page-header__title'
			WebElement lElementIgniteMainFormChild01=null
			WebElement lElementIgniteObjectNameFormChild01=null
			WebElement lElementIgniteObjectNameFormChild02=null
			WebElement lElementIgniteValueNameFormChild01=null
			IGNUemaHelper.waitElementVisibleByLocator(webDriver,lLocatorIgniteMainFormParent)
			WebElement lElementIgniteMainFormParent=IGNUemaHelper.getWebElementFromCssLocator(webDriver,lLocatorIgniteMainFormParent)
			if(lElementIgniteMainFormParent){
				lStrSalesforceBaseUrl=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementIgniteMainFormParent,'baseURI')
			}
			if(!lElementIgniteMainFormParent){
				return lreturn
			}
			if(lElementIgniteMainFormParent){
				lElementIgniteMainFormChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementIgniteMainFormParent,lLocatorIgniteMainFormChild01,false)
			}
			if(!lElementIgniteMainFormChild01){
				return lreturn
			}
			if(lElementIgniteMainFormChild01){
				lElementIgniteValueNameFormChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementIgniteMainFormChild01,lLocatorIgniteValueNameFormChild01,false)
			}
			if(lElementIgniteMainFormChild01){
				lElementIgniteObjectNameFormChild01=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementIgniteMainFormChild01,lLocatorIgniteObjectNameFormChild01,false)
			}
			if(!lElementIgniteValueNameFormChild01){
				return lreturn
			}
			if(lElementIgniteValueNameFormChild01){
				lStrSalesforceValueName=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementIgniteValueNameFormChild01,'outerText')
			}
			if(!lElementIgniteObjectNameFormChild01){
				return lreturn
			}
			if(lElementIgniteObjectNameFormChild01){
				lElementIgniteObjectNameFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(webDriver,lElementIgniteObjectNameFormChild01,lLocatorIgniteObjectNameFormChild02,false)
			}
			if(!lElementIgniteObjectNameFormChild02){
				return lreturn
			}
			if(lElementIgniteObjectNameFormChild02){
				lStrSalesforceObjectName=IGNUemaHelper.getElementAttributeByWebElement(webDriver,lElementIgniteObjectNameFormChild02,'outerText')
			}
			lResult=true
			lreturn.put('SalesforceBaseUrl',lStrSalesforceBaseUrl)
			lreturn.put('SalesforceObjectName',lStrSalesforceObjectName)
			lreturn.put('SalesforceValueName',lStrSalesforceValueName)
			lreturn.put('ErrorMessage',lStrErrorMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
		}
		return lreturn
	}
}