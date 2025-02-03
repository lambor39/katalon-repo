package org.roojai.idn.types.pricingapi
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.*
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import internal.GlobalVariable
import groovy.json.JsonSlurper
import groovy.sql.*
public class IDNPricingApiLibraryGetPriceListMainUtil{
	public static WebDriver driver=null
	public static Boolean inputPricingApiLibraryRequest(WebDriver webDriver,Map mapCaseDataCurrentInput,Map mapCollectedPricingApiDetailResult){
		Boolean lreturn=false
		Boolean lResult=false
		try{
			if(!webDriver){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
				return lreturn
			}
			Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			String lStrPricingApiLibraryJsonQuotationInput=lMapCollectedPricingApiDetailResult.StrPricingApiLibraryJsonQuotationInput
			this.driver=webDriver
			Boolean lIsOK=true
			WebElement lElementPricingApiCalculateMultiPlanButton=null
			String lStrLocatorToCheck1='select#paymentFrequency'
			Boolean lIsPricingApiLibraryPageLoadedOK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck1,3)
			if(!lIsPricingApiLibraryPageLoadedOK){
				lIsPricingApiLibraryPageLoadedOK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck1,5)
			}
			if(!lIsPricingApiLibraryPageLoadedOK){
				lIsPricingApiLibraryPageLoadedOK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck1,7)
			}
			if(!lIsPricingApiLibraryPageLoadedOK){
				lIsPricingApiLibraryPageLoadedOK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck1,10)
			}
			if(!lIsPricingApiLibraryPageLoadedOK){
				lIsPricingApiLibraryPageLoadedOK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck1,12)
			}
			WebElement lElementPricingInput=null
			if(lIsPricingApiLibraryPageLoadedOK){
				lElementPricingInput=this.getElementRootPricingInput('Pricing Input')
			}
			if(!lElementPricingInput){
				return lreturn
			}
			lStrPricingApiLibraryJsonQuotationInput=IGNUemaHelper.typeSetTextByWebElement(this.driver,lElementPricingInput,lStrPricingApiLibraryJsonQuotationInput)
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				lElementPricingApiCalculateMultiPlanButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate Multiplan')
			}
			else{
				lElementPricingApiCalculateMultiPlanButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate EndtMultiplan')
			}
			Boolean lIsPricingApiCalculateMultiPlanButtonClickOK=false
			if(lElementPricingApiCalculateMultiPlanButton){
				lIsPricingApiCalculateMultiPlanButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateMultiPlanButton)
			}
			if(!lIsPricingApiCalculateMultiPlanButtonClickOK){
				lIsPricingApiCalculateMultiPlanButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateMultiPlanButton)
			}
			String lStrLocatorToCheck02='p'
			Boolean lIsPricingApiVisibleLocatorToCheck02OK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck02,3)
			if(!lIsPricingApiVisibleLocatorToCheck02OK){
				lIsPricingApiVisibleLocatorToCheck02OK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck02,4)
			}
			if(!lIsPricingApiVisibleLocatorToCheck02OK){
				lIsPricingApiVisibleLocatorToCheck02OK=IGNUemaHelper.waitElementVisibleByLocator(driver,lStrLocatorToCheck02,8)
			}
			if(lIsPricingApiVisibleLocatorToCheck02OK){
				WebElement lElementPricingApiLibraryTotalPremium=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lStrLocatorToCheck02)
				if(!lElementPricingApiLibraryTotalPremium){
					return lreturn
				}
				String lStrElementPricingApiLibraryTotalPremiumText=lElementPricingApiLibraryTotalPremium.getText()
				if(lStrElementPricingApiLibraryTotalPremiumText.contains('Total Premium')){
					lResult=true
				}
			}
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiLibraryCoverAndCoverage(WebDriver webDriver,Map mapCaseDataCurrentInput,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		Boolean lResult=false
		if(!webDriver){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
			return lreturn
		}
		Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		try{
			Boolean lIsOK=true
			List<GroovyRowResult> lListPricingApiDependencyCoverageMappingResultSet=[]
			String lStrPricingApiQuoteRequiredProductType=lMapCollectedPricingApiDetailResult.StrPricingApiRequestProductTypeName
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiCoverageName=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageName
			List lListCollectedPricingApiCoverageSA=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageSA
			List lListCollectedPricingApiPlanOption=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiPlanOption
			String lStrPricingApiMultiPlanPricingApiResponse=mapPricingApiInputOutput.MultiplePlanPriceResponseText
			Map lMapPricingApiMultiPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiMultiPlanPricingApiResponse)
			String lStrPricingModelVersion=lMapPricingApiMultiPlanPriceResponse.root.Quote.Pricing_Model_Version
			Boolean lIsPricingApiLibraryInputPlanOptionOK=false
			if(lStrPricingApiQuoteRequiredProductType.contains('Motor')){
				lIsPricingApiLibraryInputPlanOptionOK=this.inputPricingApiLibraryPlanOptionA(lMapCollectedPricingApiDetailResult)
			}
			else{
				lIsPricingApiLibraryInputPlanOptionOK=this.inputPricingApiLibraryPlanOptionB(lMapCollectedPricingApiDetailResult,lMapPricingApiInputOutput)
			}
			Boolean lIsInputPricingApiLibraryCoverageOK=false
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				List lListCurrentPricingApiCoverageName=lListCollectedPricingApiCoverageName.get(lIndex)
				IGNUemaHelper.printLog(lListCurrentPricingApiCoverageName)
				IGNUemaHelper.printLog('lListCurrentPricingApiCoverageName')
				List lListCurrentPricingApiCoverageSA=lListCollectedPricingApiCoverageSA.get(lIndex)
				if(lListCurrentPricingApiCoverageName.size()>0){
					for(Integer lCoverageIndex=0;lCoverageIndex<=lListCurrentPricingApiCoverageName.size()-1;lCoverageIndex++){
						String lStrCoverageName=lListCurrentPricingApiCoverageName.get(lCoverageIndex)
						String lStrCoverageSA=lListCurrentPricingApiCoverageSA.get(lCoverageIndex)
						Map lMapPricingApiCoverageDependencyResult=IDNPricingApiHelper.getDependencyTable(lStrPricingModelVersion,lStrPricingApiQuoteRequiredProductType,lStrCoverageName)
						if(!lMapPricingApiCoverageDependencyResult.Result){
							return lreturn
						}
						lListPricingApiDependencyCoverageMappingResultSet=lMapPricingApiCoverageDependencyResult.DependencyCodeMappingResultSet
						if(lListPricingApiDependencyCoverageMappingResultSet.size()==0){
							return lreturn
						}
						String lStrPricingApiCoverageOptionSequence=lListPricingApiDependencyCoverageMappingResultSet.get(0).option_name
						String lStrPricingApiCoverageSelectionDependentCode=lListPricingApiDependencyCoverageMappingResultSet.get(0).selection_dependent_code
						if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageSelectionDependentCode)){
							if(lStrPricingApiCoverageOptionSequence.contains('SumAssured')){
								lIsInputPricingApiLibraryCoverageOK=this.inputPricingApiLibraryAdditionalCoverageBySelectButton(lStrPricingApiCoverageOptionSequence,lStrCoverageName,lStrCoverageSA)
							}else{
								lIsInputPricingApiLibraryCoverageOK=this.inputPricingApiLibraryAdditionalCoverageByCheckBoxButton(lStrCoverageName)
							}
						}else{
							lIsInputPricingApiLibraryCoverageOK=this.inputPricingApiLibraryAdditionalCoverageByCheckBoxButton(lStrCoverageName)
						}
						if(!lIsInputPricingApiLibraryCoverageOK){
							lIsOK=false
						}
					}
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiLibraryAdditionalCoverageBySelectButton(String strPricingApiAdditionalCoverageOptionName,String strPricingApiCoverageName,String strPricingApiCoverageSA){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiAdditionalCoverageOptionName)){
			return lreturn
		}
		String lStrPricingApiAdditionalCoverageOptionName=strPricingApiAdditionalCoverageOptionName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiAdditionalCoverageOptionName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiCoverageName)){
			return lreturn
		}
		String lStrPricingApiCoverageName=strPricingApiCoverageName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiCoverageSA)){
			return lreturn
		}
		String lStrPricingApiCoverageSA=strPricingApiCoverageSA.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiCoverageSA)){
			return lreturn
		}
		try{
			String lStrPricingApiPlanOptionValue=''
			String lLocatorPricingApiPlanOptionButton='select[name='+lStrPricingApiAdditionalCoverageOptionName+']'
			WebElement lElementPricingApiLibrarySelectedPlanOptionButton=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPricingApiPlanOptionButton,3)){
				lElementPricingApiLibrarySelectedPlanOptionButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPricingApiPlanOptionButton)
				if(lElementPricingApiLibrarySelectedPlanOptionButton){
					IGNUemaHelper.printLog('Coverage Select'+lStrPricingApiCoverageSA+' '+lStrPricingApiCoverageName)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPricingApiLibrarySelectedPlanOptionButton)
					lStrPricingApiPlanOptionValue=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lElementPricingApiLibrarySelectedPlanOptionButton,lStrPricingApiCoverageSA,false,false)
					IGNUemaHelper.printLog('Library Select Coverage'+lStrPricingApiPlanOptionValue)
				}
			}
			lResult=lStrPricingApiPlanOptionValue.length()>0
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiLibraryAdditionalCoverageByCheckBoxButton(String strPricingApiAdditionalCoverageName){
		Boolean lreturn=false
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strPricingApiAdditionalCoverageName)){
			return lreturn
		}
		String lStrPricingApiAdditionalCoverageName=strPricingApiAdditionalCoverageName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrPricingApiAdditionalCoverageName)){
			return lreturn
		}
		try{
			WebElement lElementTargetAdditionalCoverage=null
			Boolean lIsPricingApiCoverageCheckBoxButtonClickedOK=false
			String lLocatorPricingApiCoverage='input[type="checkbox"]'
			List<WebElement> lListElementPricingApiCoverage=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPricingApiCoverage,15)){
				IGNUemaHelper.printLog('Found')
				lListElementPricingApiCoverage=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiCoverage)
				if(lListElementPricingApiCoverage.size()>0){
					for(Integer lWebIndex=0;lWebIndex<=lListElementPricingApiCoverage.size()-1;lWebIndex++){
						WebElement lElementPricingApiCoverage=lListElementPricingApiCoverage.get(lWebIndex)
						WebElement lElementSearchInput01InputLevel01PricingApiCoverageParent01=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementPricingApiCoverage)
						WebElement lElementSearchInput01InputLevel01PricingApiCoverageParent02=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementSearchInput01InputLevel01PricingApiCoverageParent01)
						WebElement lElementSearchInput01InputLevel01PricingApiCoverageChild01=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementSearchInput01InputLevel01PricingApiCoverageParent02,'td',true)
						String lStrPricingApiCoverageNameText=lElementSearchInput01InputLevel01PricingApiCoverageChild01.getText()
						if(lStrPricingApiCoverageNameText==lStrPricingApiAdditionalCoverageName){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPricingApiCoverage)
							lIsPricingApiCoverageCheckBoxButtonClickedOK=IGNUemaHelper.clickByWebElementNoScroll(this.driver,lElementPricingApiCoverage)
						}
					}
				}
			}
			lResult=lIsPricingApiCoverageCheckBoxButtonClickedOK
			if(lResult){
				lreturn=lResult
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiLibraryPlanOptionA(Map mapCollectedPricingApiDetailResult){
		Boolean lreturn=false
		Boolean lResult=true
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		try{
			Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiPlanOption=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiPlanOption
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				Map lMapPricingApiPlanOption=lListCollectedPricingApiPlanOption.get(lIndex)
				for(Map.Entry lEntry in lMapPricingApiPlanOption){
					String lStrPricingApiLibrarySelectedPlanName=lEntry.key.toString()
					String lStrPricingApiLibrarySelectedOptionValue=lEntry.value.toString()
					lStrPricingApiLibrarySelectedPlanName=lStrCoverName+lStrPricingApiLibrarySelectedPlanName
					String lLocatorPricingApiPlanOptionButton='select[name='+lStrPricingApiLibrarySelectedPlanName+']'
					WebElement lElementPricingApiLibrarySelectedPlanOptionButton=null
					if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPricingApiPlanOptionButton,3)){
						lElementPricingApiLibrarySelectedPlanOptionButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPricingApiPlanOptionButton)
						if(lElementPricingApiLibrarySelectedPlanOptionButton){
							lStrPricingApiLibrarySelectedOptionValue=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lElementPricingApiLibrarySelectedPlanOptionButton,lStrPricingApiLibrarySelectedOptionValue,true,false)
						}
						else{
							lResult=false
						}
					}
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiLibraryPlanOptionB(Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
			return lreturn
		}
		Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
			return lreturn
		}
		Map lMapPricingApiInputOutput=mapPricingApiInputOutput
		try{
			String lStrPricingApiMultiPlanPricingApiResponse=mapPricingApiInputOutput.MultiplePlanPriceResponseText
			Map lMapPricingApiMultiPlanPriceResponse=new JsonSlurper().parseText(lStrPricingApiMultiPlanPricingApiResponse)
			String lStrPolicyProductVersion=lMapPricingApiMultiPlanPriceResponse.root.Quote.Policy_Product_Version
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiPlanOption=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiPlanOption
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				Map lMapPricingApiPlanOption=lListCollectedPricingApiPlanOption.get(lIndex)
				for(Map.Entry lEntry in lMapPricingApiPlanOption){
					String lStrPricingApiLibrarySelectedPlanName=lEntry.key.toString()
					String lStrPricingApiLibrarySelectedOptionValue=lEntry.value.toString()
					lStrPricingApiLibrarySelectedPlanName=lStrCoverName+lStrPricingApiLibrarySelectedPlanName
					String lLocatorPricingApiPlanOptionButton='select[name='+lStrPricingApiLibrarySelectedPlanName+']'
					WebElement lElementPricingApiLibrarySelectedPlanOptionButton=null
					if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPricingApiPlanOptionButton,3)){
						lElementPricingApiLibrarySelectedPlanOptionButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPricingApiPlanOptionButton)
						if(lElementPricingApiLibrarySelectedPlanOptionButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPricingApiLibrarySelectedPlanOptionButton)
							lStrPricingApiLibrarySelectedOptionValue=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lElementPricingApiLibrarySelectedPlanOptionButton,lStrPricingApiLibrarySelectedOptionValue,false,false)
						}
					}
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Map getPricingApiLibraryGetPlanPricePremiumResult(WebDriver webDriver,Map mapCaseDataCurrentInput,Map mapCollectedPricingApiDetailResult,Map mapPricingApiInputOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiLibraryGetPlanPriceTotalPremium=''
		String lStrPricingApiLibraryGetPlanPriceDownPayment=''
		String lStrPricingApiLibraryGetPlanPriceInstallmentAmount=''
		List lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium=new ArrayList()
		String lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium=''
		String lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment=''
		String lStrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount=''
		List lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium=new ArrayList()
		List lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail=new ArrayList()
		try{
			lreturn.put('StrPricingApiLibraryGetPlanPriceTotalPremium',lStrPricingApiLibraryGetPlanPriceTotalPremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceDownPayment',lStrPricingApiLibraryGetPlanPriceDownPayment)
			lreturn.put('StrPricingApiLibraryGetPlanPriceInstallmentAmount',lStrPricingApiLibraryGetPlanPriceInstallmentAmount)
			lreturn.put('ListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium',lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium)
			lreturn.put('ListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium',lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium',lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment',lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount',lStrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount)
			lreturn.put('ListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail',lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail)
			if(!webDriver){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCollectedPricingApiDetailResult)){
				return lreturn
			}
			Map lMapCollectedPricingApiDetailResult=mapCollectedPricingApiDetailResult
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiInputOutput)){
				return lreturn
			}
			Map lMapPricingApiInputOutput=mapPricingApiInputOutput
			List lListCollectedPricingApiCover=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCover
			List lListCollectedPricingApiCoverageName=lMapCollectedPricingApiDetailResult.ListCollectedPricingApiCoverageName
			String lStrPricingApiQuoteRequiredTransactionType=lMapCaseDataCurrentInput.GroupPricingApiShareQuoteAllStage02DoGetPriceListFieldPricingApiQuoteRequiredTransactionType
			WebElement lElementPricingApiCalculateGetPlanPriceButton=null
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				lElementPricingApiCalculateGetPlanPriceButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate GetPlanPrice')
			}
			else{
				lElementPricingApiCalculateGetPlanPriceButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate EndtMultiplan')
			}
			Boolean lIsPricingApiCalculateGetPlanPriceButtonClickOK=false
			if(lElementPricingApiCalculateGetPlanPriceButton){
				lIsPricingApiCalculateGetPlanPriceButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateGetPlanPriceButton)
			}
			if(!lIsPricingApiCalculateGetPlanPriceButtonClickOK){
				lIsPricingApiCalculateGetPlanPriceButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateGetPlanPriceButton)
			}
			Boolean lIsPricingApiLibraryPremiumLoadedOK=false
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			Boolean lIsFlagApplyLoadingFactorOK=lMapCollectedPricingApiDetailResult.BoolIsPricingApiFlagApplyLoadingFactor
			if(!lIsFlagApplyLoadingFactorOK){
				Map lMapPricingApiGetPlanPriceTotalPremiumResult=this.getPricingApiLibraryTotalPremium()
				if(!lMapPricingApiGetPlanPriceTotalPremiumResult.Result){
					return lreturn
				}
				lStrPricingApiLibraryGetPlanPriceTotalPremium=lMapPricingApiGetPlanPriceTotalPremiumResult.StrPricingApiLibraryTotalPremium
				lStrPricingApiLibraryGetPlanPriceDownPayment=lMapPricingApiGetPlanPriceTotalPremiumResult.StrPricingApiLibraryTotalDownPayment
				lStrPricingApiLibraryGetPlanPriceInstallmentAmount=lMapPricingApiGetPlanPriceTotalPremiumResult.StrPricingApiLibraryInstallmentAmount
				for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
					String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
					List lListCurrentPricingApiCoverageName=lListCollectedPricingApiCoverageName.get(lIndex)
					Map lMapPricingApiLibraryAdditionalCoveragePremiumResult=this.getPricingApiLibraryAdditionalCoveragePremium(lListCurrentPricingApiCoverageName)
					List lListCurrentPricingApiLibraryAdditionalCoveragePremium=lMapPricingApiLibraryAdditionalCoveragePremiumResult.ListPricingApiLibraryAdditionalCoveragePremium
					lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium.add(lListCurrentPricingApiLibraryAdditionalCoveragePremium)
				}
			}
			WebElement lElementPricingApiCalculateGetPlanPriceWithInstallmentButton=null
			if(lStrPricingApiQuoteRequiredTransactionType=='New Biz'){
				lElementPricingApiCalculateGetPlanPriceWithInstallmentButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate GetPlanPriceInst')
			}
			else{
				lElementPricingApiCalculateGetPlanPriceWithInstallmentButton=this.getElementPricingApiCalculatePlanPriceButton('Calculate EndtPlanPriceInst')
			}
			Boolean lIsPricingApiCalculateGetPlanPriceWithInstallmentButtonClickOK=false
			if(lIsPricingApiCalculateGetPlanPriceWithInstallmentButtonClickOK){
				lIsPricingApiCalculateGetPlanPriceWithInstallmentButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateGetPlanPriceWithInstallmentButton)
			}
			if(!lIsPricingApiCalculateGetPlanPriceWithInstallmentButtonClickOK){
				lIsPricingApiCalculateGetPlanPriceWithInstallmentButtonClickOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPricingApiCalculateGetPlanPriceWithInstallmentButton)
			}
			Boolean lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK=false
			if(!lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK){
				lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK){
				lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK){
				lIsPricingApiLibraryGetPlanPriceWithInstallmentPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			IGNUemaHelper.delayThreadSecond(5)
			Map lMapPricingApiGetPlanPriceWithInstallmentTotalPremiumResult=this.getPricingApiLibraryTotalPremium()
			if(!lMapPricingApiGetPlanPriceWithInstallmentTotalPremiumResult.Result){
				return lreturn
			}
			lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium=lMapPricingApiGetPlanPriceWithInstallmentTotalPremiumResult.StrPricingApiLibraryTotalPremium
			lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment=lMapPricingApiGetPlanPriceWithInstallmentTotalPremiumResult.StrPricingApiLibraryTotalDownPayment
			lStrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount=lMapPricingApiGetPlanPriceWithInstallmentTotalPremiumResult.StrPricingApiLibraryInstallmentAmount
			for(Integer lIndex=0;lIndex<=lListCollectedPricingApiCover.size()-1;lIndex++){
				String lStrCoverName=lListCollectedPricingApiCover.get(lIndex)
				List lListCurrentPricingApiCoverageName=lListCollectedPricingApiCoverageName.get(lIndex)
				Map lMapPricingApiLibraryAdditionalCoveragePremiumResult=this.getPricingApiLibraryAdditionalCoveragePremium(lListCurrentPricingApiCoverageName)
				List lListCurrentPricingApiLibraryAdditionalCoveragePremium=lMapPricingApiLibraryAdditionalCoveragePremiumResult.ListPricingApiLibraryAdditionalCoveragePremium
				lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium.add(lListCurrentPricingApiLibraryAdditionalCoveragePremium)
			}
			Map lMapPricingApiLibraryPaymentDetailResult=this.getPricingApiLibraryPaymentDetail()
			lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail=lMapPricingApiLibraryPaymentDetailResult.ListPricingApiLibraryPaymentDetail
			lreturn.put('StrPricingApiLibraryGetPlanPriceTotalPremium',lStrPricingApiLibraryGetPlanPriceTotalPremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceDownPayment',lStrPricingApiLibraryGetPlanPriceDownPayment)
			lreturn.put('StrPricingApiLibraryGetPlanPriceInstallmentAmount',lStrPricingApiLibraryGetPlanPriceInstallmentAmount)
			lreturn.put('ListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium',lListPricingApiLibraryGetPlanPriceAdditionalCoveragePremium)
			lreturn.put('ListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium',lListPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium',lStrPricingApiLibraryGetPlanPriceWithInstallmentTotalPremium)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment',lStrPricingApiLibraryGetPlanPriceWithInstallmentDownPayment)
			lreturn.put('StrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount',lStrPricingApiLibraryGetPlanPriceWithInstallmentInstallmentAmount)
			lreturn.put('ListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail',lListPricingApiLibraryGetPlanPriceWithInstallmentPaymentDetail)
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static WebElement getElementPricingApiCalculatePlanPriceButton(String strLocatorPlanPriceButtonName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strLocatorPlanPriceButtonName)){
			return lreturn
		}
		String lLocatorPlanPriceButtonName=strLocatorPlanPriceButtonName.trim()
		try{
			String lLocatorPricingApiCalculatePlanPriceButton='button'
			List<WebElement> lListElementPricingApiCalculatePlanPriceButton=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiCalculatePlanPriceButton)
			WebElement lTargetElement=null
			for(Integer lWebIndex=0;lWebIndex<=lListElementPricingApiCalculatePlanPriceButton.size()-1;lWebIndex++){
				WebElement lElementPricingApiCalculatePlanPriceButton=lListElementPricingApiCalculatePlanPriceButton.get(lWebIndex)
				String lLocatorCalculatePlanPriceButtonText=lElementPricingApiCalculatePlanPriceButton.getText()
				if(lLocatorCalculatePlanPriceButtonText==lLocatorPlanPriceButtonName){
					lreturn=lElementPricingApiCalculatePlanPriceButton
					return lreturn
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPaymentFrequency(String strPaymentFrquency){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strPaymentFrquency)){
			return lreturn
		}
		String lPaymentFrquency=strPaymentFrquency
		try{
			Boolean lResult=true
			String lLocatorPaymentFrequencyButton='select[name=paymentFrequency]'
			WebElement lElementPaymentFrequencyButton=null
			if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentFrequencyButton,15)){
				lElementPaymentFrequencyButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentFrequencyButton)
				if(lElementPaymentFrequencyButton){
					lPaymentFrquency=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lElementPaymentFrequencyButton,lPaymentFrquency,false,false)
				}
			}
			else{
				lResult=false
			}
			lreturn=lResult
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static WebElement getElementRootPricingInput(String strPricingInput){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strPricingInput)){
			return lreturn
		}
		String lStrPricingInput=strPricingInput
		try{
			String lLocatorPricingApiInputTextArea='textarea'
			List<WebElement> lListElementPricingApiInputTextArea=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiInputTextArea)
			WebElement lTargetElement=null
			if(lListElementPricingApiInputTextArea.size()>0){
				for(Integer lWebIndex=0;lWebIndex<=lListElementPricingApiInputTextArea.size()-1;lWebIndex++){
					WebElement lElementPricingApiInputTextArea=lListElementPricingApiInputTextArea.get(lWebIndex)
					WebElement lElementParent01PricingApiInputTextArea=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementPricingApiInputTextArea)
					WebElement lElementParent02PricingApiInputTextArea=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementParent01PricingApiInputTextArea)
					List<WebElement>  lListElementChild01PricingApiInputTextArea=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementParent02PricingApiInputTextArea,'td')
					for(Integer lWebChildIndex=0;lWebChildIndex<=lListElementChild01PricingApiInputTextArea.size()-1;lWebChildIndex++){
						WebElement lElementChild01PricingApiInputTextArea=lListElementChild01PricingApiInputTextArea.get(lWebChildIndex)
						String lStrElementChild01PricingApiInputTextArea=lElementChild01PricingApiInputTextArea.getText()
						if(lStrPricingInput.contains(lStrElementChild01PricingApiInputTextArea)){
							lreturn=lElementPricingApiInputTextArea
							return lreturn
						}
					}
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean waitUntilPricingApiLibraryPremiumLoaded(Integer seconds=5){
		Boolean lreturn=false
		try{
			Integer count=0
			while(count<seconds){
				if(this.checkPricingApiLibraryPremiumLoaded()){
					lreturn=true
					return lreturn
				}
				count++
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Boolean checkPricingApiLibraryPremiumLoaded(){
		Boolean lreturn=false
		try{
			String lLocatorPricingApiPremium='div'
			List<WebElement> lListElementPricingApiPremium=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiPremium)
			for(Integer lWebMainIndex=1;lWebMainIndex<=lListElementPricingApiPremium.size()-1;lWebMainIndex++){
				WebElement lElementSearch01InputLevel01PricingApiPremiumParent=lListElementPricingApiPremium.get(lWebMainIndex)
				String lStrElementSearch01InputLevel01PricingApiPremiumParentText=lElementSearch01InputLevel01PricingApiPremiumParent.getText()
				if(lStrElementSearch01InputLevel01PricingApiPremiumParentText.contains('Additional Coverages')){
					lreturn=true
					return lreturn
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Map getPricingApiLibraryTotalPremium(){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrPricingApiLibraryTotalPremium=''
		String lStrPricingApiLibraryTotalDownPayment=''
		String lStrPricingApiLibraryInstallmentAmount=''
		try{
			lreturn.put('StrPricingApiLibraryTotalPremium',lStrPricingApiLibraryTotalPremium)
			lreturn.put('StrPricingApiLibraryTotalDownPayment',lStrPricingApiLibraryTotalDownPayment)
			lreturn.put('StrPricingApiLibraryInstallmentAmount',lStrPricingApiLibraryInstallmentAmount)
			lreturn.put('Result',lResult)
			String lLocatorPricingApiPremium='div'
			Boolean lIsPricingApiLibraryPremiumLoadedOK=true

			if(lIsPricingApiLibraryPremiumLoadedOK){
				List<WebElement> lListElementPricingApiPremium=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiPremium)
				for(Integer lWebMainIndex=1;lWebMainIndex<=lListElementPricingApiPremium.size()-1;lWebMainIndex++){
					WebElement lElementSearch01InputLevel01PricingApiPremiumParent=lListElementPricingApiPremium.get(lWebMainIndex)
					String lStrElementSearch01InputLevel01PricingApiPremiumParentText=lElementSearch01InputLevel01PricingApiPremiumParent.getText()
					WebElement lElementSearch01InputLevel01PricingApiPremiumChild01=null
					if(lStrElementSearch01InputLevel01PricingApiPremiumParentText.contains('Total Premium')){
						List<WebElement> lListElementSearch01InputLevel01PricingApiPremiumChild01=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementSearch01InputLevel01PricingApiPremiumParent,'')
						for(Integer lWebChildIndex=0;lWebChildIndex<=lListElementSearch01InputLevel01PricingApiPremiumChild01.size()-1;lWebChildIndex++){
							lElementSearch01InputLevel01PricingApiPremiumChild01=lListElementSearch01InputLevel01PricingApiPremiumChild01.get(lWebChildIndex)
							String lStrElementSearch01InputLevel01PricingApiPremiumChild01Text=lElementSearch01InputLevel01PricingApiPremiumChild01.getText().trim()
							if(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text.contains('Total Premium')){
								lStrPricingApiLibraryTotalPremium=this.getStringPricingApiTotalPremiumBySplit(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text)
							}
							if(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text.contains('First Installment Premium')){
								lStrPricingApiLibraryInstallmentAmount=this.getStringPricingApiTotalPremiumBySplit(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text)
							}
							if(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text.contains('Recurring Premium')){
								lStrPricingApiLibraryTotalDownPayment=this.getStringPricingApiTotalPremiumBySplit(lStrElementSearch01InputLevel01PricingApiPremiumChild01Text)
							}
						}
					}
					if(lElementSearch01InputLevel01PricingApiPremiumChild01){
						break
					}
				}
			}
			lResult=(lStrPricingApiLibraryTotalPremium.length()>0)
			if(lResult){
				lreturn.put('StrPricingApiLibraryTotalPremium',lStrPricingApiLibraryTotalPremium)
				lreturn.put('StrPricingApiLibraryTotalDownPayment',lStrPricingApiLibraryTotalDownPayment)
				lreturn.put('StrPricingApiLibraryInstallmentAmount',lStrPricingApiLibraryInstallmentAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static String getStringPricingApiTotalPremiumBySplit(String strPricingApiLibraryPremiumValue){
		String lreturn=''
		if(IGNUemaHelper.checkObjectEmptyOfString(strPricingApiLibraryPremiumValue)){
			return lreturn
		}
		String lStrPricingApiLibraryPremiumValue=strPricingApiLibraryPremiumValue
		try{
			String[] lArrayPricingApiLibraryPremiumValue=lStrPricingApiLibraryPremiumValue.split(':')
			lreturn=lArrayPricingApiLibraryPremiumValue[1]
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Map getPricingApiLibraryAdditionalCoveragePremium(List strCoverageList){
		Map lreturn=[:]
		Boolean lResult=false
		List lListPricingApiLibraryAdditionalCoveragePremium=new ArrayList()
		try{
			lreturn.put('ListPricingApiLibraryAdditionalCoveragePremium',lListPricingApiLibraryAdditionalCoveragePremium)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverageList)){
				return lreturn
			}
			List lListPricingApiCoverage=strCoverageList
			Boolean lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			if(!lIsPricingApiLibraryPremiumLoadedOK){
				lIsPricingApiLibraryPremiumLoadedOK=this.waitUntilPricingApiLibraryPremiumLoaded()
			}
			IGNUemaHelper.delayThreadSecond(5)
			List lListPricingApiAdditionalCoveragePremium=new ArrayList()
			if(lIsPricingApiLibraryPremiumLoadedOK){
				String lLocatorPricingApiLibraryAdditionalCoverage='div.column'
				List<WebElement> lListElementPricingApiLibraryAdditionalCoverage=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiLibraryAdditionalCoverage)
				for(Integer lWebMainIndex=0;lWebMainIndex<=lListElementPricingApiLibraryAdditionalCoverage.size()-1;lWebMainIndex++){
					WebElement lElementPricingApiLibraryAdditionalCoverage=lListElementPricingApiLibraryAdditionalCoverage.get(lWebMainIndex)
					if(lElementPricingApiLibraryAdditionalCoverage){
						String lStrPricingApiLibraryAdditionalCoverageText=lElementPricingApiLibraryAdditionalCoverage.getText()
						if(lStrPricingApiLibraryAdditionalCoverageText.contains('Premium')){
							lListPricingApiAdditionalCoveragePremium.add(lStrPricingApiLibraryAdditionalCoverageText)
						}
					}
				}
			}
			if(lListPricingApiAdditionalCoveragePremium.size()>0){
				for(Integer lCoverageIndex=0;lCoverageIndex<=lListPricingApiCoverage.size()-1;lCoverageIndex++){
					String lStrCoverageName=lListPricingApiCoverage.get(lCoverageIndex)
					for(Integer lIndex=0;lIndex<=lListPricingApiAdditionalCoveragePremium.size()-1;lIndex++){
						String lStrPricingApiLibraryCoverageNameWithPremiumText=lListPricingApiAdditionalCoveragePremium.get(lIndex)
						String[] lArrayPricingApiLibraryCoverageNameWithPremiumText=lStrPricingApiLibraryCoverageNameWithPremiumText.split(':')
						String lStrPricingApiLibraryExtractCoverageName=lArrayPricingApiLibraryCoverageNameWithPremiumText[0]
						lStrPricingApiLibraryExtractCoverageName=lStrPricingApiLibraryExtractCoverageName.replace('SumAssured','')
						lStrPricingApiLibraryExtractCoverageName=lStrPricingApiLibraryExtractCoverageName.trim()
						if(lStrPricingApiLibraryExtractCoverageName==lStrCoverageName){
							String lStrPricingApiLibraryCoveragePremium=this.getStringPricingApiAdditionalCoveragePremiumBySplit(lStrPricingApiLibraryCoverageNameWithPremiumText)
							lListPricingApiLibraryAdditionalCoveragePremium.add(lStrPricingApiLibraryCoveragePremium)
						}
					}
				}
			}
			lResult=lListPricingApiLibraryAdditionalCoveragePremium.size()>0
			if(lResult){
				lreturn.put('ListPricingApiLibraryAdditionalCoveragePremium',lListPricingApiLibraryAdditionalCoveragePremium)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static String getStringPricingApiAdditionalCoveragePremiumBySplit(String strPricingApiLibraryPremiumValue){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strPricingApiLibraryPremiumValue)){
			return lreturn
		}
		String lStrPricingApiLibraryPremiumValue=strPricingApiLibraryPremiumValue
		try{
			String lStrAdditionalCoveragePremiumValue=''
			String[] lArrayPricingApiLibraryPremiumValue=lStrPricingApiLibraryPremiumValue.split(',')
			for(Integer lIndex=0;lIndex<=lArrayPricingApiLibraryPremiumValue.size()-1;lIndex++){
				String lStrPricingApiLibraryPremiumText=lArrayPricingApiLibraryPremiumValue[lIndex]
				if(lStrPricingApiLibraryPremiumText.contains('Premium')){
					lStrAdditionalCoveragePremiumValue=this.getStringPricingApiTotalPremiumBySplit(lStrPricingApiLibraryPremiumText)
				}
			}
			lResult=lStrAdditionalCoveragePremiumValue.length()>0
			if(lResult){
				lreturn=lStrAdditionalCoveragePremiumValue
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public static Map getPricingApiLibraryPaymentDetail(){
		Map lreturn=[:]
		Boolean lResult=false
		List lListPricingApiLibraryPaymentDetail=new ArrayList()
		try{
			lreturn.put('ListPricingApiLibraryPaymentDetail',lListPricingApiLibraryPaymentDetail)
			lreturn.put('Result',lResult)
			String lLocatorPricingApiLibraryPaymentDetail='div'
			IGNUemaHelper.delayThreadSecond(5)
			List<WebElement> lListElementPricingApiLibraryPayment=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorPricingApiLibraryPaymentDetail)
			WebElement lElementTargetMain=lListElementPricingApiLibraryPayment.get(1)
			for(Integer lWebMainIndex=1;lWebMainIndex<=lListElementPricingApiLibraryPayment.size()-1;lWebMainIndex++){
				WebElement lElementSearchInput01Level01PricingApiLibraryPaymentParent=lListElementPricingApiLibraryPayment.get(lWebMainIndex)
				String lStrElementSearchInput01Level01PricingApiLibraryPaymentParentText=lElementSearchInput01Level01PricingApiLibraryPaymentParent.getText()
				WebElement lElementSearchInput01Level01PricingApiLibraryPaymentChild01=null
				if(lStrElementSearchInput01Level01PricingApiLibraryPaymentParentText.contains('Payment Details')){
					List<WebElement> lListElementSearchInput01Level01PricingApiLibraryPaymentChild01=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementSearchInput01Level01PricingApiLibraryPaymentParent,'div')
					for(Integer lWebChildIndex=0;lWebChildIndex<=lListElementSearchInput01Level01PricingApiLibraryPaymentChild01.size()-1;lWebChildIndex++){
						lElementSearchInput01Level01PricingApiLibraryPaymentChild01=lListElementSearchInput01Level01PricingApiLibraryPaymentChild01.get(lWebChildIndex)
						List<WebElement> lListElementSearchInput01Level01PricingApiLibraryPaymentChild02=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementSearchInput01Level01PricingApiLibraryPaymentChild01,'div')
						Map lMapPricingApiLibraryPaymentDetail=[:]
						for(Integer lNestedWebChildIndex=0;lNestedWebChildIndex<=lListElementSearchInput01Level01PricingApiLibraryPaymentChild02.size()-1;lNestedWebChildIndex++){
							WebElement lElementSearchInput01Level01PricingApiLibraryPaymentChild02=lListElementSearchInput01Level01PricingApiLibraryPaymentChild02.get(lNestedWebChildIndex)
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementSearchInput01Level01PricingApiLibraryPaymentChild02)
							String lStrSearchInput01Level01PricingApiLibraryPaymentChild02Text=lElementSearchInput01Level01PricingApiLibraryPaymentChild02.getText().trim()
							String[] lArraySearchInput01Level01PricingApiLibraryPaymentChild02=lStrSearchInput01Level01PricingApiLibraryPaymentChild02Text.split(':')
							String lStrPricingApiLibraryPaymentNestedKey=''
							String lStrPricingApiLibraryPaymentNestedValue=''
							if(lArraySearchInput01Level01PricingApiLibraryPaymentChild02.size()==1){
								lStrPricingApiLibraryPaymentNestedKey=lArraySearchInput01Level01PricingApiLibraryPaymentChild02[0].trim()
								lStrPricingApiLibraryPaymentNestedValue=''
							}
							else{
								lStrPricingApiLibraryPaymentNestedKey=lArraySearchInput01Level01PricingApiLibraryPaymentChild02[0].trim()
								lStrPricingApiLibraryPaymentNestedValue=lArraySearchInput01Level01PricingApiLibraryPaymentChild02[1].trim()
							}
							lMapPricingApiLibraryPaymentDetail.put(lStrPricingApiLibraryPaymentNestedKey,lStrPricingApiLibraryPaymentNestedValue)
						}
						if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapPricingApiLibraryPaymentDetail)){
							lListPricingApiLibraryPaymentDetail.add(lMapPricingApiLibraryPaymentDetail)
						}
					}
				}
				if(lElementSearchInput01Level01PricingApiLibraryPaymentChild01){
					break
				}
			}
			lResult=lListPricingApiLibraryPaymentDetail.size()>0
			if(lResult){
				lreturn.put('PricingApiLibraryPaymentDetail',lListPricingApiLibraryPaymentDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
}