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
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectDriverType
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningClaimMotorCarNewbizCreateUtil_bk2 {
	public WebDriver webDriver
	private IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate parentStageController=null
	public IDNSalesforceLightningClaimMotorCarNewbizCreateUtil_bk2(WebDriver webDriver,IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate initStageController){
		super()
		try{
			this.webDriver=webDriver
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate newParentStageController){
		//Do Nothing
		//this.parentStageController=newParentStageController
	}
	public Boolean inputCase(){
		Boolean lreturn=false
		try{
			String lStrSalesforceRecordID=''
			String lStrSalesforceSearchByDefaultObjectValue=''
			String lStrCssLocator=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			Map lMapSearchDefaultObjectResult=this.inputSearchBySfObject(lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObjectResult.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObjectResult.StrSalesforceSearchByDefaultObjectValue
			}
			IGNUemaHelper.delayWebUISecond(5)
			List<WebElement> lListElementCreateClaimFlowButton=this.getListElementCreateClaimFlowButton()
			if(lListElementCreateClaimFlowButton.size()==0){
				return lreturn
			}
			String lStrCreateClaimFlowButtonName='Create Claim'
			Boolean lIsInputCreateClaimFlowOK=this.inputCreateClaimFlowButton(lListElementCreateClaimFlowButton,lStrCreateClaimFlowButtonName)
			if(!lIsInputCreateClaimFlowOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lStrCssLocator='c-ign-claim-reporting-form'
			WebElement lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			Boolean lIsInputSfNextButtonOK=false
			switch(lStrSalesforceSearchByDefaultObjectValue){
				case 'Account':
					IGNUemaHelper.delayWebUISecond(5)
				//Change to Map
					Boolean lIsInputSfProductTypeOK=this.inputSfProductType(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfProductTypeOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfOpportunityNoOK=this.inputSfOpportunityNo(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfOpportunityNoOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfClaimLossDateAndTimeOK=this.inputSfLossDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfClaimLossDateAndTimeOK){
						return lreturn
					}
					break
				case 'Contract':
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfClaimLossDateAndTimeOK=this.inputSfLossDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfClaimLossDateAndTimeOK){
						return lreturn
					}
					break
				default:
					return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			if(lIsInputSfNextButtonOK){
				IGNUemaHelper.delayWebUISecond(5)
				lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			}
			if(lIsInputSfNextButtonOK){
				IGNUemaHelper.delayWebUISecond(5)
				lStrCssLocator='c-ign-open-claim-form'
				lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
				if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfIncidentDriverOK=this.inputSfIncidentDriver(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfIncidentDriverOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfAddressOK=this.inputSfAddress(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfAddressOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfClaimCauseAndIncidentTypeOK=this.inputSfClaimCauseAndIncidentType(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfClaimCauseAndIncidentTypeOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfLiabilityOK=this.inputSfLiability(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfLiabilityOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfWereYouTravellingOrWorkOK=this.inputSfWereYouTravellingOrWork(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfWereYouTravellingOrWorkOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfAppointmentPlaceOK=this.inputSfAppointmentPlace(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfAppointmentPlaceOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfIndependentWitnessOK=this.inputSfIndependentWitness(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfIndependentWitnessOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfCarIsDrivableOK=this.inputSfCarIsDrivable(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfCarIsDrivableOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfClaimDescriptionOK=this.inputSfClaimDescription(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfClaimDescriptionOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfAnyInjuryOK=this.inputSfAnyInjury(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfAnyInjuryOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Boolean lIsInputSfClaimReportDateOK=this.inputSfClaimReportDate(lElementIgniteClaimReportingFormRoot)
				if(!lIsInputSfClaimReportDateOK){
					return lreturn
				}
				IGNUemaHelper.delayWebUISecond(5)
				Map lMapInputSfSurveyorRequiredOK=this.inputSfSurveyorRequired(lElementIgniteClaimReportingFormRoot)
				if(!lMapInputSfSurveyorRequiredOK.Result){
					return lreturn
				}
				if(lMapInputSfSurveyorRequiredOK.IsSurveyorRequired){
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfSurveyCompanyOK=this.inputSfSurveyCompany(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfSurveyCompanyOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfSurveyorNameOK=this.inputSfSurveyorName(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfSurveyorNameOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfSurveyorMobileNoOK=this.inputSfSurveyorMobileNo(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfSurveyorMobileNoOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfSurveyTypeOK=this.inputSfSurveyType(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfSurveyTypeOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfReasonForSurveyTypeOK=this.inputSfReasonForSurveyType(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfReasonForSurveyTypeOK){
						return lreturn
					}
					IGNUemaHelper.delayWebUISecond(5)
					Boolean lIsInputSfSurveyorAppointedDateAndTimeOK=this.inputSfSurveyorAppointedDateAndTime(lElementIgniteClaimReportingFormRoot)
					if(!lIsInputSfSurveyorAppointedDateAndTimeOK){
						return lreturn
					}
				}
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'next')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lStrCssLocator='c-ign-claim-additional-info-form'
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator,false)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfReportedByOK=this.inputSfReportedBy(lElementIgniteClaimReportingFormRoot)
			if(!lIsInputSfReportedByOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfChronologyAccidentOK=this.inputSfChronologyAccident(lElementIgniteClaimReportingFormRoot)
			if(!lIsInputSfChronologyAccidentOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			Boolean lIsInputSfClaimAccidentVillageOK=this.inputSfClaimAccidentVillage(lElementIgniteClaimReportingFormRoot)
			if(!lIsInputSfReportedByOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lIsInputSfNextButtonOK=this.inputSfNextButton(lElementIgniteClaimReportingFormRoot,'finish')
			if(!lIsInputSfNextButtonOK){
				return lreturn
			}
			IGNUemaHelper.delayWebUISecond(5)
			lElementIgniteClaimReportingFormRoot=this.getElementIgniteClaimReportingFormRoot(lStrCssLocator)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			lreturn=lMapSearchDefaultObjectResult.Result
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public Map inputSearchBySfObject(Map mapCaseDataCurrentInput,Map mapCaseDataCurrentOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordId=''
		String lStrSalesforceSearchByDefaultObjectValue=''
		try{
			lreturn.put('StrSalesforceRecordId','')
			lreturn.put('StrSalesforceSearchByDefaultObjectValue','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentOutput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			Map lMapCaseDataCurrentOutput=mapCaseDataCurrentOutput
			Map lMapSearchDefaultObjectResult=IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil.inputSearchBySfObject(this.webDriver,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordId=lMapSearchDefaultObjectResult.StrSalesforceRecordId
				lStrSalesforceSearchByDefaultObjectValue=lMapSearchDefaultObjectResult.StrSalesforceSearchByDefaultObjectValue
			}
			lResult=lStrSalesforceRecordId.length()>0
			IGNUemaHelper.printLog(lResult)
			if(lResult){
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordId)
				lreturn.put('StrSalesforceSearchByDefaultObjectValue',lStrSalesforceSearchByDefaultObjectValue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public List<WebElement> getListElementCreateClaimFlowButton(){
		//document.querySelector('div.recordHomeFlexipage2').querySelector('div.actionsContainer').querySelector('runtime_platform_actions-actions-ribbon').shadowRoot.querySelector('ul').querySelectorAll('li')
		List<WebElement> lreturn=null
		Boolean lResult=false
		try{
			String lLocatorSearch01InputLevel01SearchHomeFlexipageParent='div.recordHomeFlexipage2'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild01='div.actionsContainer'
			String lLocatorSearch01InputLevel01SearchHomeFlexipageChild02='runtime_platform_actions-actions-ribbon'
			WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild02=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)){
				WebElement lElementSearch01InputLevel01SearchHomeFlexipageParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01SearchHomeFlexipageParent)
				if(lElementSearch01InputLevel01SearchHomeFlexipageParent){
					WebElement lElementSearch01InputLevel01SearchHomeFlexipageChild01=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageParent,lLocatorSearch01InputLevel01SearchHomeFlexipageChild01,true)
					if(lElementSearch01InputLevel01SearchHomeFlexipageChild01){
						lElementSearch01InputLevel01SearchHomeFlexipageChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild01,lLocatorSearch01InputLevel01SearchHomeFlexipageChild02,true)
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
				WebElement lElementSearch02InputLevel01LightningButtonMenuParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01SearchHomeFlexipageChild02,lLocatorSearch02InputLevel01LightningButtonMenuParent,true)
				if(lElementSearch02InputLevel01LightningButtonMenuParent){
					lListElementSearch02InputLevel01LightningButtonMenuChild01=IGNUemaHelper.getChildWebElementListOfWebElement(this.webDriver,lElementSearch02InputLevel01LightningButtonMenuParent,lLocatorSearch02InputLevel01LightningButtonMenuChild01)
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
	public Boolean inputCreateClaimFlowButton(List<WebElement> listElementCreateClaimFlowButton,String strCreateClaimFlowButtonName){
		//document.querySelector('div.recordHomeFlexipage2').querySelector('div.actionsContainer').querySelector('runtime_platform_actions-actions-ribbon').shadowRoot.querySelector('ul').querySelector('li').querySelector('runtime_platform_actions-action-renderer').shadowRoot.querySelector('lightning-button').shadowRoot.querySelector('button')
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(listElementCreateClaimFlowButton)){
			return lreturn
		}
		List<WebElement> lListElementCreateClaimFlowButton=listElementCreateClaimFlowButton
		if(IGNUemaHelper.checkObjectNullOfObject(strCreateClaimFlowButtonName)){
			return lreturn
		}
		String lStrCreateClaimFlowButtonName=strCreateClaimFlowButtonName
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrCreateClaimFlowButtonName)){
			return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01LightningButtonParent='runtime_platform_actions-action-renderer'
			String lLocatorSearch01InputLevel01LightningButtonChild01='lightning-button'
			String lLocatorSearch01InputLevel01LightningButtonChild02='button'
			for(Integer lIndex=0;lIndex<=lListElementCreateClaimFlowButton.size()-1;lIndex++){
				WebElement lElementCreateClaimFlowButton=lListElementCreateClaimFlowButton.get(lIndex)
				WebElement lElementSearch01InputLevel01LightningButtonParent=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementCreateClaimFlowButton,lLocatorSearch01InputLevel01LightningButtonParent,true)
				String lStrCreateClaimFlowButtonValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonParent,'title')
				if(lStrCreateClaimFlowButtonValue==lStrCreateClaimFlowButtonName){
					WebElement lElementSearch01InputLevel01LightningButtonChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonParent,lLocatorSearch01InputLevel01LightningButtonChild01,true)
					if(lElementSearch01InputLevel01LightningButtonChild01){
						WebElement lElementSearch01InputLevel01LightningButtonChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningButtonChild01,lLocatorSearch01InputLevel01LightningButtonChild02,true)
						if(lElementSearch01InputLevel01LightningButtonChild02){
							IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningButtonChild02)
							lResult=true
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
	public WebElement getElementIgniteClaimReportingFormRoot(String cssLocator,Boolean isIgnoreCssLocator=true){
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
			//document.querySelector('c-i-g-n-claim-flow').shadowRoot.querySelector('c-ign-claim-form-app').shadowRoot.querySelector('c-ign-claim-reporting-form').shadowRoot.querySelectorAll('div.slds-form-element.slds-form-element_horizontal')
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormParent='c-i-g-n-claim-flow'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='c-ign-claim-form-app'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02=lStrCssLocator
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormOutput=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)){
				WebElement lElementSearch01InputLevel01IgniteClaimReportingFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimReportingFormParent)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormParent){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormParent,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01,true)
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
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
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
	public Boolean inputSfNextButton(WebElement elementIgniteClaimReportingFormRoot,String strTargetButton){
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
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetButton)){
			return lreturn
		}
		try{
			Boolean lIsNextButtonClickOK=false
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=this.getElementSfTargetNextButton(lElementIgniteClaimReportingFormRoot,lStrTargetButton)
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lIsNextButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01)
				lResult=lIsNextButtonClickOK
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public WebElement getElementSfTargetNextButton(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetButtonName){
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
			List<WebElement> lListElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01LightningInputChild01=lListElementSearch01InputLevel01LightningInputChild01.get(lIndex)
				if(lElementSearch01InputLevel01LightningInputChild01){
					lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
				}
				if(!lElementSearch01InputLevel01LightningInputChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01LightningInputChild02){
					String lStrNameValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,'name')
					lStrNameValue=lStrNameValue.toLowerCase()
					lStrTargetButtonName=lStrTargetButtonName.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrNameValue,lStrTargetButtonName)){
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
	public Boolean inputValueSfToTargetTextArea(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
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
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputValueSfToTargetInputTextA(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
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
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputValueSfToTargetInputTextB(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetInputText){
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
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild03,lStrTargetInputText)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean clickSfToTargetButton(WebElement elementSearch01InputLevel01LightningInputParent){
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
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild03){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningInputChild03)
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean selectedValueSfToTargetBaseComboBoxItem(WebElement elementSearch01InputLevel01LightningInputParent,String strTargetBaseComboBoxItemName,Boolean isContainString=false){
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
			lElementSearch01InputLevel01LightningInputChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputParent,lLocatorSearch01InputLevel01LightningInputChild01,true)
			if(!lElementSearch01InputLevel01LightningInputChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild01){
				lElementSearch01InputLevel01LightningInputChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild01,lLocatorSearch01InputLevel01LightningInputChild02,true)
			}
			if(!lElementSearch01InputLevel01LightningInputChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01LightningInputChild02){
				lListElementSearch01InputLevel01LightningInputChild03=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild02,lLocatorSearch01InputLevel01LightningInputChild03)
			}
			if(lListElementSearch01InputLevel01LightningInputChild03.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01LightningInputChild03.size()-1;lIndex++){
					lElementSearch01InputLevel01LightningInputChild03=lListElementSearch01InputLevel01LightningInputChild03.get(lIndex)
					if(!lElementSearch01InputLevel01LightningInputChild03){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild03){
						lElementSearch01InputLevel01LightningInputChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild03,lLocatorSearch01InputLevel01LightningInputChild04,true)
					}
					if(!lElementSearch01InputLevel01LightningInputChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01LightningInputChild04){
						String lStrValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01LightningInputChild04,'title')
						lStrValue=lStrValue.toLowerCase()
						lStrTargetBaseComboBoxItemName=lStrTargetBaseComboBoxItemName.toLowerCase()
						if(lIsContainString){
							if(IGNUemaHelper.checkStringContainString(lStrValue,lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningInputChild04)
							}
						}else{
							if(lStrValue.equalsIgnoreCase(lStrTargetBaseComboBoxItemName)){
								lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01LightningInputChild04)
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
	public Boolean inputSfProductType(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorProductType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenProductType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Product_Type')
			String lStrSfClaimMotorProductTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorProductType)
			lreturn=this.inputSfClaimMotorProductType(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorProductTypeValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimMotorProductType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorProductType){
		Boolean lreturn=false
		Boolean lResult=false
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
			//elementIgniteClaimReportingFormRoot.shadowRoot.querySelector('div.slds-form-element.slds-form-element_horizontal')[0].querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox.slds-combobox_container').shadowRoot.querySelector('button').getAttribute('name')
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'ProductType')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsProductTypeDropDownClickOK=true
					}
					if(lIsProductTypeDropDownClickOK){
						break
					}
				}
			}
			//elementIgniteClaimReportingFormRoot.shadowRoot.querySelector('div.slds-form-element.slds-form-element_horizontal')[0].querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox.slds-combobox_container').shadowRoot.querySelector('lightning-base-combobox-item')
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'data-value')
				lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
				lStrSfClaimMotorProductType='MotorCar'
				lStrSfClaimMotorProductType=lStrSfClaimMotorProductType.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,lStrSfClaimMotorProductType)){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsProductTypeDropDownClickOK=true
					lResult=lIsProductTypeDropDownClickOK
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfOpportunityNo(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorOpportunityNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenOpportunityNo
			lreturn=this.inputSfClaimMotorOpportunityNo(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorOpportunityNo)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimMotorOpportunityNo(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorOpportunityNo){
		Boolean lreturn=false
		Boolean lResult=false
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					String lStrProductTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrProductTypeValue=lStrProductTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrProductTypeValue,'policyNumber')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsOpportunityNoDropDownClickOK=true
					}
					if(lIsOpportunityNoDropDownClickOK){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			//querySelector('lightning-combobox').shadowRoot.querySelector('lightning-base-combobox.slds-combobox_container').shadowRoot.querySelector('lightning-base-combobox-item').shadowRoot.querySelector('span.slds-truncate').getAttribute('title')
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				String lStrOpportunityNoValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'title')
				lStrOpportunityNoValue=lStrOpportunityNoValue.toLowerCase()
				lStrSfClaimMotorOpportunityNo=lStrSfClaimMotorOpportunityNo.toLowerCase()
				if(IGNUemaHelper.checkStringContainString(lStrOpportunityNoValue,lStrSfClaimMotorOpportunityNo)){
					IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
					lIsOpportunityNoDropDownClickOK=true
					lResult=lIsOpportunityNoDropDownClickOK
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfLossDateAndTime(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorLossDate=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimRequiredLossDate
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Required_Loss_Date')
			String lStrSfClaimMotorLossDateValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimMotorLossDate)
			String lStrSfClaimMotorLossTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimLossDateTime
			IGNTestManager lIGNTestManager02=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=lIGNTestManager02.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Loss_Date_Time')
			String lStrSfClaimMotorLossTimeValue=lIGNTestMasterFieldTypeSingle02.getMasterPairValueByKey(lStrSfClaimMotorLossTime)
			lreturn=this.inputSfClaimLossDate(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossDateValue)
			if(lreturn){
				lreturn=this.inputSfClaimLossTime(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorLossTimeValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimLossDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossDateValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimMotorLossDateValue)){
			//return lreturn
		}
		//String lStrSfClaimMotorLossDateValue=strSfClaimMotorLossDateValue.trim()
		String lStrSfClaimMotorLossDateValue=''
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimMotorLossDateValue)){
			//return lreturn
		}
		try{
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					String lStrClaimLossDateValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'name')
					lStrClaimLossDateValue=lStrClaimLossDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossDateValue,'claimLossDate')){
						lResult=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'22 Nov 2024')
						break
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimLossTime(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorLossTimeValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					continue
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
				}
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
					String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,'name')
					lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,'claimLossDate')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
						lIsClaimLossTimeClickOK=true
					}
					if(lIsClaimLossTimeClickOK){
						lIsClaimLossTimeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimLossTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimLossTimeValue=lStrClaimLossTimeValue.toLowerCase()
						lStrSfClaimMotorLossTimeValue=lStrSfClaimMotorLossTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimLossTimeValue,lStrSfClaimMotorLossTimeValue)){
							lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lIsClaimLossTimeClickOK=true
							lResult=lIsClaimLossTimeClickOK
						}
						if(lIsClaimLossTimeClickOK){
							break
						}
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfIncidentDriver(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimMotorIncidentDriver=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimIncidentDriver
			lreturn=this.inputSfClaimIncidentDriver(elementIgniteClaimReportingFormRoot,lStrSfClaimMotorIncidentDriver)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimIncidentDriver(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorIncidentDriver){
		Boolean lreturn=false
		Boolean lResult=false
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
			//lElementIgniteClaimReportingFormRoot.shadowRoot.querySelector('lightning-input-field').shadowRoot.querySelector('lightning-lookup').shadowRoot.querySelector('lightning-lookup-desktop').shadowRoot.querySelector('lightning-grouped-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('input')
			List<WebElement> lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=[]
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentPerson')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
				lResult=IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lStrSfClaimMotorIncidentDriver)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild08=lListElementSearch01InputLevel01IgniteClaimReportingFormChild08.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08)
						break
					}
				}
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			lElementSearch01InputLevel01IgniteIncidentDriverFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormParent)
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormParent){
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormParent,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				return lreturn
			}
			IGNUemaHelper.waitElementVisibleByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			if(lElementSearch01InputLevel01IgniteIncidentDriverFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild01,lLocatorSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteIncidentDriverFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.webDriver,lListElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteIncidentDriverFormChild02)
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfAddress(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimAddress=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAddress
			lreturn=this.inputSfClaimAddress(elementIgniteClaimReportingFormRoot,lStrSfClaimAddress)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimAddress(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimMotorAddress){
		Boolean lreturn=false
		Boolean lResult=false
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
			//lElementIgniteClaimReportingFormRoot.shadowRoot.querySelector('lightning-input-field').shadowRoot.querySelector('lightning-lookup').shadowRoot.querySelector('lightning-lookup-desktop').shadowRoot.querySelector('lightning-grouped-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('input')
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'incidentLocationData_address')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
				IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimMotorAddress)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
						break
					}
				}
			}
			//document.querySelector('div.DESKTOP.uiContainerManager').querySelector('div.forceSearchLookupAdvanced').querySelector('a.outputLookupLink')
			IGNUemaHelper.waitElementVisibleByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			lElementSearch01InputLevel01IgniteClaimAddressFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				lElementSearch01InputLevel01IgniteClaimAddressFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormParent,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild01,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteClaimAddressFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.webDriver,lListElementSearch01InputLevel01IgniteClaimAddressFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimCauseAndIncidentType(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Integer lNumSfClaimCauseTypeIndex=0
			Integer lNumSfClaimIncidentTypeIndex=1
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimCauseAndIncidentType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimCauseAndIncidentType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Claim_Cause_And_Incident_Type')
			String lStrSfClaimCauseAndIncidentTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimCauseAndIncidentType)
			List<String>lListSfClaimCauseAndIncidentType=lStrSfClaimCauseAndIncidentTypeValue.split('[|]')
			String lStrSfClaimCauseTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimCauseTypeIndex)
			String lStrSfClaimIncidentTypeValue=lListSfClaimCauseAndIncidentType.get(lNumSfClaimIncidentTypeIndex)
			lreturn=this.inputSfClaimCauseType(elementIgniteClaimReportingFormRoot,lStrSfClaimCauseTypeValue)
			if(lreturn){
				lreturn=this.inputSfClaimIncidentType(elementIgniteClaimReportingFormRoot,lStrSfClaimIncidentTypeValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimCauseType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCauseTypeValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,'claimCauseType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrClaimCauseTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimCauseTypeValue=lStrClaimCauseTypeValue.toLowerCase()
						lStrSfClaimCauseTypeValue=lStrSfClaimCauseTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimCauseTypeValue,lStrSfClaimCauseTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
							break
						}
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimIncidentType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIncidentTypeValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,'claimIncidentType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lIsClaimCauseTypeClickOK){
						lIsClaimCauseTypeClickOK=false
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild04=lListElementSearch01InputLevel01IgniteClaimReportingFormChild04.get(lIndex)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
						String lStrClaimIncidentTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'data-value')
						lStrClaimIncidentTypeValue=lStrClaimIncidentTypeValue.toLowerCase()
						lStrSfClaimIncidentTypeValue=lStrSfClaimIncidentTypeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimIncidentTypeValue,lStrSfClaimIncidentTypeValue)){
							lIsClaimCauseTypeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
							lResult=lIsClaimCauseTypeClickOK
						}
						if(lIsClaimCauseTypeClickOK){
							break
						}
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfLiability(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfLiability=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenLiability
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Liability')
			String lStrSfClaimLiabilityValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfLiability)
			lreturn=this.inputSfClaimLiability(elementIgniteClaimReportingFormRoot,lStrSfClaimLiabilityValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimLiability(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimLiabilityValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentReportingMotorData_liability')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimLiabilityValue,true)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfWereYouTravellingOrWork(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfWereYouTravellingOrWork=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimWereYouTravellingOrWorkValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfWereYouTravellingOrWork)
			lreturn=this.inputSfClaimWereYouTravellingOrWork(elementIgniteClaimReportingFormRoot,lStrSfClaimWereYouTravellingOrWorkValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimWereYouTravellingOrWork(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimWereYouTravellingOrWorkValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'flagUsageDriveToWork')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimWereYouTravellingOrWorkValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfAppointmentPlace(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimAppointmentPlaceValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAppointmentPlace
			lreturn=this.inputSfClaimAppointmentPlace(elementIgniteClaimReportingFormRoot,lStrSfClaimAppointmentPlaceValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimAppointmentPlace(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAppointmentPlaceValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'surveyorData_accidentLocationLandmark')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAppointmentPlaceValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfIndependentWitness(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfIndependentWitness=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenWereYouTravellingToOrFromWork
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Were_You_Travelling_To_Or_From_Work')
			String lStrSfClaimIndependentWitnessValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfIndependentWitness)
			lreturn=this.inputSfClaimIndependentWitness(elementIgniteClaimReportingFormRoot,lStrSfClaimIndependentWitnessValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimIndependentWitness(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimIndependentWitnessValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimIndependentWitnessValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimIndependentWitnessValue=lStrClaimIndependentWitnessValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimIndependentWitnessValue,'incidentReportingData_independentWitness')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimIndependentWitnessValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfCarIsDrivable(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfCarIsDrivable=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenCarIsDrivable
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Car_Is_Drivable')
			String lStrSfClaimCarIsDrivableValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfCarIsDrivable)
			lreturn=this.inputSfClaimCarIsDrivable(elementIgniteClaimReportingFormRoot,lStrSfClaimCarIsDrivableValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimCarIsDrivable(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimCarIsDrivableValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimCarIsDrivableValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimCarIsDrivableValue=lStrClaimCarIsDrivableValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimCarIsDrivableValue,'surveyorData_vehicleIsDrivable')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimCarIsDrivableValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimDescription(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimDescriptionValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimDescription
			lreturn=this.inputSfClaimClaimDescription(elementIgniteClaimReportingFormRoot,lStrSfClaimDescriptionValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimClaimDescription(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimDescriptionValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'claimDescription')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimDescriptionValueValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfAnyInjury(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfAnyInjury=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenAnyInjury
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Any_Injury')
			String lStrSfClaimAnyInjuryValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfAnyInjury)
			lreturn=this.inputSfClaimAnyInjury(elementIgniteClaimReportingFormRoot,lStrSfClaimAnyInjuryValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimAnyInjury(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAnyInjuryValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimAnyInjuryValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimAnyInjuryValue=lStrClaimAnyInjuryValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimAnyInjuryValue,'anyInjury')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimAnyInjuryValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimReportDate(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimReportDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenClaimRequiredLossDate
			lreturn=this.inputSfClaimClaimReportDate(elementIgniteClaimReportingFormRoot,lStrSfClaimReportDateValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimClaimReportDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportDateValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimReportDateValue)){
			//return lreturn
		}
		String lStrSfClaimReportDateValue=strSfClaimReportDateValue.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimReportDateValue)){
			//return lreturn
		}
		try{
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-datepicker'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrReportDateValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrReportDateValue=lStrReportDateValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrReportDateValue,'claimReportDate')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeSetTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,'26 Nov 2024')
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Map inputSfSurveyorRequired(WebElement elementIgniteClaimReportingFormRoot){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lIsSurveyorRequired=false
		try{
			lreturn.put('IsSurveyorRequired',lIsSurveyorRequired)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
				return lreturn
			}
			WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfSurveyorRequired=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorRequiredToDo
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Surveyor_Required_To_Do')
			String lStrSfClaimSurveyorRequiredValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyorRequired)
			lIsSurveyorRequired=IGNUemaHelper.convertStringToBoolean(lStrSfClaimSurveyorRequiredValue)
			lResult=this.inputSfClaimSurveyorRequired(lElementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorRequiredValue)
			if(lResult){
				lreturn.put('IsSurveyorRequired',lIsSurveyorRequired)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyorRequired(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorRequiredValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyorRequiredValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyorRequiredValue=lStrClaimSurveyorRequiredValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorRequiredValue,'surveyorData_doYouRequireASurveyorAtTheScene')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyorRequiredValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfSurveyCompany(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyCompany=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyCompany
			lreturn=this.inputSfClaimSurveyCompany(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyCompany)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyCompany(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyCompany){
		Boolean lreturn=false
		Boolean lResult=false
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
			//lElementIgniteClaimReportingFormRoot.shadowRoot.querySelector('lightning-input-field').shadowRoot.querySelector('lightning-lookup').shadowRoot.querySelector('lightning-lookup-desktop').shadowRoot.querySelector('lightning-grouped-combobox').shadowRoot.querySelector('lightning-base-combobox').shadowRoot.querySelector('input')
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorCompany')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06)
				IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild06,lStrSfClaimSurveyCompany)
			}
			IGNUemaHelper.delayWebUISecond(5)
			lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild07){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,'data-value')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'actionAdvancedSearch')){
						IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
						break
					}
				}
			}
			//document.querySelector('div.DESKTOP.uiContainerManager').querySelector('div.forceSearchLookupAdvanced').querySelector('a.outputLookupLink')
			IGNUemaHelper.waitElementVisibleByLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			lElementSearch01InputLevel01IgniteClaimAddressFormParent=IGNUemaHelper.getWebElementFromCssLocator(this.webDriver,lLocatorSearch01InputLevel01IgniteClaimAddressFormParent)
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormParent){
				lElementSearch01InputLevel01IgniteClaimAddressFormChild01=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormParent,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild01,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimAddressFormChild01){
				IGNUemaHelper.delayWebUISecond(5)
				lListElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild01,lLocatorSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			if(lListElementSearch01InputLevel01IgniteClaimAddressFormChild02.size()>0){
				IGNUemaHelper.delayWebUISecond(5)
				lElementSearch01InputLevel01IgniteClaimAddressFormChild02=IGNUemaHelper.getWebElementRandomFromWebElementList(this.webDriver,lListElementSearch01InputLevel01IgniteClaimAddressFormChild02)
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimAddressFormChild02)
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfSurveyorName(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorName=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorName
			lreturn=this.inputSfClaimSurveyorName(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorName)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyorName(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorName){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorName')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorName)
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfSurveyorMobileNo(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorMobileNo=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorMobileNo
			lreturn=this.inputSfClaimSurveyorMobileNo(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorMobileNo)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyorMobileNo(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorMobileNo){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-input'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03='lightning-primitive-input-simple'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04='input'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild03=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild04=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorMobileNo')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
				lResult=IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lStrSfClaimSurveyorMobileNo)
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfSurveyType(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Survey_Type')
			String lStrSfClaimSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSurveyType)
			lreturn=this.inputSfClaimSurveyType(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyTypeValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyTypeValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimSurveyTypeValue=lStrClaimSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyTypeValue,'surveyorData_surveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimSurveyTypeValue,true)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfReasonForSurveyType(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfReasonForSurveyType=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReasonForSurveyType
			IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Reason_For_Survey_Type')
			//String lStrSfClaimReasonForSurveyTypeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfReasonForSurveyType)
			String lStrSfClaimReasonForSurveyTypeValue='Others'
			lreturn=this.inputSfClaimReasonForSurveyType(elementIgniteClaimReportingFormRoot,lStrSfClaimReasonForSurveyTypeValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimReasonForSurveyType(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReasonForSurveyTypeValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02='lightning-picklist'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild02=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimReasonForSurveyTypeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimReasonForSurveyTypeValue=lStrClaimReasonForSurveyTypeValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimReasonForSurveyTypeValue,'surveyorData_reasonForSurveyType')){
						lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							return lreturn
						}
						if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
							lResult=this.clickSfToTargetButton(lElementSearch01InputLevel01IgniteClaimReportingFormChild02)
						}
					}
					if(lResult){
						break
					}
				}
			}
			lResult=this.selectedValueSfToTargetBaseComboBoxItem(lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lStrSfClaimReasonForSurveyTypeValue,true)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfSurveyorAppointedDateAndTime(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			String lStrSfClaimSurveyorAppointedDateValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorAppointedDate
			String lStrSfClaimSurveyorAppointedTime=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenSurveyorAppointedTime
			/*
			 IGNTestManager lIGNTestManager01=IGNTestManagerHelperIDN.getIGNTestManagerInstance()
			 IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager01.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Open_Surveyor_Appointed_Time')
			 String lStrSfClaimSurveyorAppointedTimeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfClaimSurveyorAppointedTime)
			 */
			String lStrSfClaimSurveyorAppointedTimeValue=''
			lreturn=this.inputSfClaimSurveyorAppointedDate(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedDateValue)
			if(lreturn){
				lreturn=this.inputSfClaimSurveyorAppointedTime(elementIgniteClaimReportingFormRoot,lStrSfClaimSurveyorAppointedTimeValue)
			}
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyorAppointedDate(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedDateValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedDateValue)){
			//return lreturn
		}
		//String lStrSfClaimSurveyorAppointedDateValue=strSfClaimSurveyorAppointedDateValue.trim()
		String lStrSfClaimSurveyorAppointedDateValue=''
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedDateValue)){
			//return lreturn
		}
		try{
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05)
				lResult=IGNUemaHelper.typeTextByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,'28 Nov 2024')
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimSurveyorAppointedTime(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimSurveyorAppointedTimeValue){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		if(IGNUemaHelper.checkObjectNullOfObject(strSfClaimSurveyorAppointedTimeValue)){
			//return lreturn
		}
		String lStrSfClaimSurveyorAppointedTimeValue=strSfClaimSurveyorAppointedTimeValue
		lStrSfClaimSurveyorAppointedTimeValue='07.45'
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfClaimSurveyorAppointedTimeValue)){
			return lreturn
		}
		try{
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
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrIncidentDriverValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrIncidentDriverValue=lStrIncidentDriverValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrIncidentDriverValue,'surveyorData_surveyorAppointedDateTime')){
						break
					}
				}
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild02=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild02,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild02){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild03=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild02,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild03,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild03){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild04=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild03,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild04,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild04){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild05=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild05,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild05){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild06=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild06,true)
			}
			if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				return lreturn
			}
			if(lElementSearch01InputLevel01IgniteClaimReportingFormChild06){
				lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild04)
			}
			if(!lIsClaimSurveyorAppointedTimeClickOK){
				return lreturn
			}
			if(lIsClaimSurveyorAppointedTimeClickOK){
				lListElementSearch01InputLevel01IgniteClaimReportingFormChild07=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild05,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild07)
			}
			lIsClaimSurveyorAppointedTimeClickOK=false
			if(lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()>0){
				for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.size()-1;lIndex++){
					lElementSearch01InputLevel01IgniteClaimReportingFormChild07=lListElementSearch01InputLevel01IgniteClaimReportingFormChild07.get(lIndex)
					lElementSearch01InputLevel01IgniteClaimReportingFormChild08=IGNUemaHelper.getChildShadowWebElementOfWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild08,true)
					if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						return lreturn
					}
					if(lElementSearch01InputLevel01IgniteClaimReportingFormChild08){
						String lStrClaimSurveyorAppointedTimeValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild08,'title')
						lStrClaimSurveyorAppointedTimeValue=lStrClaimSurveyorAppointedTimeValue.toLowerCase()
						lStrSfClaimSurveyorAppointedTimeValue=lStrSfClaimSurveyorAppointedTimeValue.toLowerCase()
						if(IGNUemaHelper.checkStringContainString(lStrClaimSurveyorAppointedTimeValue,lStrSfClaimSurveyorAppointedTimeValue)){
							lIsClaimSurveyorAppointedTimeClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild07)
							lResult=lIsClaimSurveyorAppointedTimeClickOK
						}
						if(lIsClaimSurveyorAppointedTimeClickOK){
							break
						}
					}
				}
			}
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfReportedBy(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfClaimReportedByValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReportedByValue
			String lStrSfClaimReportedByValue='asdfdgfds'
			lreturn=this.inputSfClaimReportedBy(elementIgniteClaimReportingFormRoot,lStrSfClaimReportedByValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimReportedBy(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimReportedByValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			//document.querySelector('c-i-g-n-claim-flow').shadowRoot.querySelector('c-ign-claim-form-app').shadowRoot.querySelector('c-ign-claim-additional-info-form').shadowRoot.querySelectorAll('lightning-input-field')[13].shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'reportedBy')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetInputTextB(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimReportedByValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfChronologyAccident(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfChronologyAccidentValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenChronologyAccident
			String lStrSfChronologyAccidentValue='sdfsdfsdfsdf'
			lreturn=this.inputSfClaimChronologyAccident(elementIgniteClaimReportingFormRoot,lStrSfChronologyAccidentValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimChronologyAccident(WebElement elementIgniteClaimReportingFormRoot,String strSfChronologyAccidentValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'chronologyAccident')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetTextArea(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfChronologyAccidentValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimAccidentVillage(WebElement elementIgniteClaimReportingFormRoot){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(elementIgniteClaimReportingFormRoot)){
			return lreturn
		}
		WebElement lElementIgniteClaimReportingFormRoot=elementIgniteClaimReportingFormRoot
		try{
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			//String lStrSfClaimReportedByValue=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfOpenReportedByValue
			String lStrSfClaimAccidentVillageValue='d5556'
			lreturn=this.inputSfClaimClaimAccidentVillage(elementIgniteClaimReportingFormRoot,lStrSfClaimAccidentVillageValue)
			IGNUemaHelper.delayWebUISecond(5)
		}catch(Exception e){
		}
		return lreturn
	}
	public Boolean inputSfClaimClaimAccidentVillage(WebElement elementIgniteClaimReportingFormRoot,String strSfClaimAccidentVillageValue){
		Boolean lreturn=false
		Boolean lResult=false
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
			//document.querySelector('c-i-g-n-claim-flow').shadowRoot.querySelector('c-ign-claim-form-app').shadowRoot.querySelector('c-ign-claim-additional-info-form').shadowRoot.querySelectorAll('lightning-input-field')[13].shadowRoot.querySelector('lightning-input').shadowRoot.querySelector('lightning-primitive-input-simple').shadowRoot.querySelector('input')
			String lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01='lightning-input-field'
			WebElement lElementSearch01InputLevel01IgniteClaimReportingFormChild01=null
			List<WebElement> lListElementSearch01InputLevel01IgniteClaimReportingFormChild01=IGNUemaHelper.getChildShadowWebElementListOfWebElement(this.webDriver,lElementIgniteClaimReportingFormRoot,lLocatorSearch01InputLevel01IgniteClaimReportingFormChild01)
			for(Integer lIndex=0;lIndex<=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.size()-1;lIndex++){
				lElementSearch01InputLevel01IgniteClaimReportingFormChild01=lListElementSearch01InputLevel01IgniteClaimReportingFormChild01.get(lIndex)
				if(!lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					return lreturn
				}
				if(lElementSearch01InputLevel01IgniteClaimReportingFormChild01){
					String lStrClaimLiabilityValue=IGNUemaHelper.getElementAttributeByWebElement(this.webDriver,lElementSearch01InputLevel01IgniteClaimReportingFormChild01,'id')
					lStrClaimLiabilityValue=lStrClaimLiabilityValue.toLowerCase()
					if(IGNUemaHelper.checkStringContainString(lStrClaimLiabilityValue,'incidentLocationData_claimAccidentVillage')){
						break
					}
				}
			}
			lResult=this.inputValueSfToTargetInputTextB(lElementSearch01InputLevel01IgniteClaimReportingFormChild01,lStrSfClaimAccidentVillageValue)
			lreturn=lResult
		}catch(Exception e){
		}
		return lreturn
	}
}