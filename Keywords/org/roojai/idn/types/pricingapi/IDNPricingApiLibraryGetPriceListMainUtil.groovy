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
public class IDNPricingApiLibraryGetPriceListMainUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public IDNPricingApiLibraryGetPriceListMainUtil(){
		super()
	}
	private WebDriver getDriver(){
		return this.driver
	}
	private void setDriver(WebDriver newDriver){
		//Do Nothing
		//this.driver=newDriver
	}
	private WebDriver getSelenium(){
		return this.selenium
	}
	private void setSelenium(WebDriver newSelenium){
		//Do Nothing
		//this.selenium=newSelenium
	}
	public String inputCase(String strTransactionType,Map mapPricingApiLibraryInput,Map mapPricingApiLibraryOutput){
		String lreturn=''
		try{
			IGNUemaHelper.printLog(strTransactionType)
			if(IGNUemaHelper.checkObjectEmptyOfString(strTransactionType)){
				return lreturn
			}
			String lPricingApiTransactionType=strTransactionType.trim()
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibraryInput)){
				return lreturn
			}
			Map lMapPricingApiLibraryInput=mapPricingApiLibraryInput
			Map lMapPricingApiLibraryOutput=mapPricingApiLibraryOutput
			String lPricingApiLibraryUrl=lMapPricingApiLibraryInput.PricingApiLibraryHostUrl
			if(!GlobalVariable.BrowserInit){
				GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(lPricingApiLibraryUrl,true)
				IGNUemaHelper.delayThreadSecond(1)
			}
			if(!GlobalVariable.BrowserInit){
				WebUI.navigateToUrl(lPricingApiLibraryUrl)
				IGNUemaHelper.delayThreadSecond(2)
			}
			if(!GlobalVariable.BrowserInit){
				WebUI.navigateToUrl(lPricingApiLibraryUrl)
				IGNUemaHelper.delayThreadSecond(3)
			}
			if(GlobalVariable.BrowserInit){
				WebUI.refresh()
				this.driver=DriverFactory.getWebDriver()
				this.selenium=this.driver
				Map lMapPricingApiLibraryRequestResult=this.inputPricingApiLibraryRequest(lPricingApiTransactionType,lMapPricingApiLibraryInput,lMapPricingApiLibraryOutput)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map inputPricingApiLibraryRequest(String strPricingApiTransactionType,Map mapPricingApiLibraryInput,Map mapPricingApiLibraryOutput){
		Map lreturn=[:]
		Boolean lResult=false
		List lPricingApiLibraryGetPlanPriceAdditionalCoverageNameList=new ArrayList()
		List lPricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList=new ArrayList()
		List lPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList=new ArrayList()
		String lPricingApiLibraryGetPlanPriceTotalPremium=''
		String lPricingApiLibraryGetPlanPriceDownPayment=''
		String lPricingApiLibraryGetPlanPriceInstallmentAmount=''
		String lPricingApiLibraryGetPlanWithInstallmentPriceTotalPremium=''
		String lPricingApiLibraryGetPlanWithInstallmentPriceDownPayment=''
		String lPricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount=''
		List lPricingApiLibraryGetPlanWithInstallmentPaymentDetailList=[]
		try{
			lreturn.put('PricingApiLibraryGetPlanPriceAdditionalCoverageNameList',lPricingApiLibraryGetPlanPriceAdditionalCoverageNameList)
			lreturn.put('PricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList',lPricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList)
			lreturn.put('PricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList',lPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapPricingApiLibraryInput)){
				return lreturn
			}
			Map lMapPricingApiLibraryInput=mapPricingApiLibraryInput
			Map lMapPricingApiLibraryOutput=mapPricingApiLibraryOutput
			String lPricingApiMultiPlanRequest=lMapPricingApiLibraryInput.PricingApiLibraryMultiPlanRequest
			String lPaymentFrequency=lMapPricingApiLibraryInput.PolicyPaymentFrequency
			List lCoverageNameList=lMapPricingApiLibraryInput.PricingApiLibrarySelectedCoverageNameList
			List lCoverageSequenceList=lMapPricingApiLibraryInput.PricingApiLibrarySelectedCoverageSequenceList
			List lCoverageSAList=lMapPricingApiLibraryInput.PricingApiLibrarySelectedCoverageSAList
			List lCoverList=lMapPricingApiLibraryInput.PricingApiLibraryCoverList
			Map lMapPlanOption=lMapPricingApiLibraryInput.PricingApiLibraryPlanOption
			if(IGNUemaHelper.checkObjectEmptyOfString(lPricingApiMultiPlanRequest)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lPaymentFrequency)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lCoverageNameList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lCoverageSAList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(lCoverList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(lMapPlanOption)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(strPricingApiTransactionType)){
				return lreturn
			}
			String lPricingApiTransactionType=strPricingApiTransactionType.trim()
			WebElement lElementPricingInput=this.getPricingInputElement('Pricing Input')
			if(lElementPricingInput){
				lPricingApiMultiPlanRequest=IGNUemaHelper.typeSetTextByWebElement(this.driver,lElementPricingInput,lPricingApiMultiPlanRequest)
				String lLocatorCalculateMultiPlanButton=''
				IGNUemaHelper.printLog('StartButtonAction')
				WebElement lElementCalculateMultiPlan=null
				if(lPricingApiTransactionType=='New Biz'){
					lElementCalculateMultiPlan=this.getCalculatePlanPriceButtonElement('Calculate Multiplan')
				}
				else{
					lElementCalculateMultiPlan=this.getCalculatePlanPriceButtonElement('Calculate EndtMultiplan')
				}
				if(lElementCalculateMultiPlan){
					IGNUemaHelper.printLog('Element found')
					Boolean lIsCalculateMultiPlanButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCalculateMultiPlan)
					IGNUemaHelper.printLog(lIsCalculateMultiPlanButtonClicked)
					IGNUemaHelper.printLog('lIsCalculateMultiPlanButtonClicked')
					if(!lIsCalculateMultiPlanButtonClicked){
						lIsCalculateMultiPlanButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCalculateMultiPlan)
					}
					if(!lIsCalculateMultiPlanButtonClicked){
						lIsCalculateMultiPlanButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCalculateMultiPlan)
					}
					if(lIsCalculateMultiPlanButtonClicked){
						IGNUemaHelper.printLog(lCoverList)
						for(Integer lCoverIndex=0;lCoverIndex<=lCoverList.size()-1;lCoverIndex++){
							String lCoverName=lCoverList.get(lCoverIndex)
							Boolean lIsPlanOptionEnteredOK=this.inputPlanOption(lMapPlanOption,lCoverName)
							if(!lIsPlanOptionEnteredOK){
								return lreturn
							}
							Boolean lIsPaymentFrequencyEnteredOK=this.inputPaymentFrequency(lPaymentFrequency)
							if(!lIsPaymentFrequencyEnteredOK){
								return lreturn
							}
							if(lCoverageNameList.size()>0){
								String lLocatorCoverage=''
								lLocatorCoverage='input[type="checkbox"]'
								List<WebElement>  lElementCoverageList=null
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorCoverage,15)){
									IGNUemaHelper.printLog('Found')
									lElementCoverageList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCoverage)
									for(Integer lIndex=0;lIndex<=lCoverageNameList.size()-1;lIndex++){
										List lSelectedCoverageNameList=lCoverageNameList.getAt(lIndex)
										List lSelectedCoverageSequenceList=lCoverageSequenceList.getAt(lIndex)
										List lSelectedCoverageSAList=lCoverageSAList.get(lIndex)
										for(Integer lCoverageIndex=0;lCoverageIndex<=lSelectedCoverageNameList.size()-1;lCoverageIndex++){
											WebElement lTargetElementCoverage=null
											IGNUemaHelper.printLog('Get Coverage name SA List Inside Library')
											IGNUemaHelper.printLog(lSelectedCoverageNameList.get(lCoverageIndex))
											IGNUemaHelper.printLog(lSelectedCoverageSequenceList.get(lCoverageIndex))
											String lCoverageName=lSelectedCoverageNameList.get(lCoverageIndex)
											if(lElementCoverageList.size()>0){
												for(Integer lWebIndex=0;lWebIndex<=lElementCoverageList.size()-1;lWebIndex++){
													WebElement lElementCoverage=lElementCoverageList.get(lWebIndex)
													WebElement lFirstParentElementCoverage=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementCoverage)
													WebElement lSecondParentElementCoverage=IGNUemaHelper.getParentElementOfWebElement(this.driver,lFirstParentElementCoverage)
													WebElement lChildOfSecondParentElementCoverage=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lSecondParentElementCoverage,'td',true)
													IGNUemaHelper.printLog('CoverageElement found')
													IGNUemaHelper.printLog(lSecondParentElementCoverage.getText())
													String lChildCoverageSequence=lChildOfSecondParentElementCoverage.getText()
													IGNUemaHelper.printLog(lChildCoverageSequence)
													if(lCoverageName.contains(lChildCoverageSequence)){
														IGNUemaHelper.printLog('Matching Coverage')
														IGNUemaHelper.printLog(lChildCoverageSequence)
														IGNUemaHelper.printLog(lCoverageName)
														lTargetElementCoverage=lElementCoverage
													}
												}
											}
											if(!IGNUemaHelper.checkObjectNullOfObject(lTargetElementCoverage)){
												IGNUemaHelper.clickByWebElementWithScroll(this.driver,lTargetElementCoverage)
											}
											else{
												IGNUemaHelper.printLog('Non Matching Coverage')
												IGNUemaHelper.printLog(lCoverageName)
												String lCoverageSequence=lSelectedCoverageSequenceList.get(lCoverageIndex)
												String lCoverageSA=lSelectedCoverageSAList.get(lCoverageIndex)
												lLocatorCoverage='select[name='+lCoverageSequence+']'
												lTargetElementCoverage=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCoverage)
												if(lTargetElementCoverage){
													IGNUemaHelper.printLog('Non Matching Coverage-Drop Down')
													String lSelectedOptionValue=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lTargetElementCoverage,lCoverageSA,false,false)
												}
											}
										}
									}
								}
							}
						}
						WebElement lElementCalculateGetPlanPriceButton=null
						if(lPricingApiTransactionType=='New Biz'){
							lElementCalculateGetPlanPriceButton=this.getCalculatePlanPriceButtonElement('Calculate GetPlanPrice')
						}
						else{
							lElementCalculateGetPlanPriceButton=this.getCalculatePlanPriceButtonElement('Calculate EndtMultiplan')
						}
						if(lElementCalculateGetPlanPriceButton){
							IGNUemaHelper.printLog('Element found')
							Boolean lIsCalculateGetPlanPriceButtonClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCalculateGetPlanPriceButton)
							if(lIsCalculateGetPlanPriceButtonClicked){
								Map lMapPricingApiGetPlanPriceTotalPremiumResult=this.getTotalPremium()
								if(lMapPricingApiGetPlanPriceTotalPremiumResult.Result){
									lPricingApiLibraryGetPlanPriceTotalPremium=lMapPricingApiGetPlanPriceTotalPremiumResult.TotalPremium
									lPricingApiLibraryGetPlanPriceDownPayment=lMapPricingApiGetPlanPriceTotalPremiumResult.TotalDownPayment
									lPricingApiLibraryGetPlanPriceInstallmentAmount=lMapPricingApiGetPlanPriceTotalPremiumResult.InstallmentAmount
									IGNUemaHelper.printLog('lPricingApiLibraryGetPlanPriceTotalPremium')
									IGNUemaHelper.printLog(lPricingApiLibraryGetPlanPriceTotalPremium)
								}
								else{
									return lreturn
								}
								if(lCoverageNameList.size()>0){
									for(Integer lIndex=0;lIndex<=lCoverageNameList.size()-1;lIndex++){
										List lSelectedCoverageNameList=lCoverageNameList.getAt(lIndex)
										Map lMapGetPlanPriceAdditionalCoveragePremiumResult=this.getTotalAdditionalCoveragePremium(lSelectedCoverageNameList)
										if(lMapGetPlanPriceAdditionalCoveragePremiumResult.Result){
											List lGetPlanPriceAdditionalCoveragePremiumList=lMapGetPlanPriceAdditionalCoveragePremiumResult.AdditionalCoveragePremiumList
											lPricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList.add(lGetPlanPriceAdditionalCoveragePremiumList)
											List lGetPlanPriceAdditionalCoverageNameList=lMapGetPlanPriceAdditionalCoveragePremiumResult.AdditionalCoverageNameList
											lPricingApiLibraryGetPlanPriceAdditionalCoverageNameList.add(lGetPlanPriceAdditionalCoverageNameList)
										}
									}
									WebElement lElementCalculateGetPlanWithInstallmentPriceButton=null
									if(lPricingApiTransactionType=='New Biz'){
										lElementCalculateGetPlanWithInstallmentPriceButton=this.getCalculatePlanPriceButtonElement('Calculate GetPlanPriceInst')
									}
									else{
										lElementCalculateGetPlanWithInstallmentPriceButton=this.getCalculatePlanPriceButtonElement('Calculate EndtPlanPriceInst')
									}
									Boolean lIsCalculateGetPlanPriceWithInstallmentButtonClickedOK=false
									if(lElementCalculateGetPlanWithInstallmentPriceButton){
										IGNUemaHelper.printLog('lElementCalculateGetPlanWithInstallment found')
										lIsCalculateGetPlanPriceWithInstallmentButtonClickedOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCalculateGetPlanWithInstallmentPriceButton)
									}
									if(lIsCalculateGetPlanPriceWithInstallmentButtonClickedOK){
										Map lMapPricingApiGetPlanWithInstallmentPriceTotalPremiumResult=this.getTotalPremium()
										if(lMapPricingApiGetPlanWithInstallmentPriceTotalPremiumResult.Result){
											lPricingApiLibraryGetPlanWithInstallmentPriceTotalPremium=lMapPricingApiGetPlanWithInstallmentPriceTotalPremiumResult.TotalPremium
											lPricingApiLibraryGetPlanWithInstallmentPriceDownPayment=lMapPricingApiGetPlanWithInstallmentPriceTotalPremiumResult.TotalDownPayment
											lPricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount=lMapPricingApiGetPlanWithInstallmentPriceTotalPremiumResult.InstallmentAmount
										}
										else{
											return lreturn
										}
										for(Integer lIndex=0;lIndex<=lCoverageNameList.size()-1;lIndex++){
											List lSelectedCoverageNameList=lCoverageNameList.getAt(lIndex)
											Map lMapGetPlanWithInstallmentPriceAdditionalCoveragePremiumResult=this.getTotalAdditionalCoveragePremium(lSelectedCoverageNameList)
											if(lMapGetPlanWithInstallmentPriceAdditionalCoveragePremiumResult.Result){
												List lGetPlanWithInstallmentPriceAdditionalCoveragePremiumList=lMapGetPlanWithInstallmentPriceAdditionalCoveragePremiumResult.AdditionalCoveragePremiumList
												lPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList.add(lGetPlanWithInstallmentPriceAdditionalCoveragePremiumList)
											}
										}
										Map lMapGetPlanWithInstallmentPaymentDetailResult=this.getPaymentDetail()
										if(lMapGetPlanWithInstallmentPaymentDetailResult.Result){
											lPricingApiLibraryGetPlanWithInstallmentPaymentDetailList=lMapGetPlanWithInstallmentPaymentDetailResult.PricingApiLibraryPaymentDetail
										}
									}
								}
							}
						}
					}
				}
			}
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceTotalPremium=lPricingApiLibraryGetPlanPriceTotalPremium
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceDownPayment=lPricingApiLibraryGetPlanPriceDownPayment
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceInstallmentAmount=lPricingApiLibraryGetPlanPriceInstallmentAmount
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanWithInstallmentPriceTotalPremium=lPricingApiLibraryGetPlanWithInstallmentPriceTotalPremium
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanWithInstallmentPriceDownPayment=lPricingApiLibraryGetPlanWithInstallmentPriceDownPayment
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount=lPricingApiLibraryGetPlanWithInstallmentPriceInstallmentAmount
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceAdditionalCoverageNameList=lPricingApiLibraryGetPlanPriceAdditionalCoverageNameList
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList=lPricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList=lPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList
			lMapPricingApiLibraryOutput.PricingApiLibraryGetPlanPriceWithInstallmentPaymentDetailList=lPricingApiLibraryGetPlanWithInstallmentPaymentDetailList
			IGNUemaHelper.printLog('PricingApiLibrary-TestResult')
			IGNUemaHelper.printLog(lMapPricingApiLibraryOutput)
			if(lResult){
				lreturn.put('PricingApiLibraryGetPlanPriceAdditionalCoverageNameList',lPricingApiLibraryGetPlanPriceAdditionalCoverageNameList)
				lreturn.put('PricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList',lPricingApiLibraryGetPlanPriceAdditionalCoveragePremiumList)
				lreturn.put('PricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList',lPricingApiLibraryGetPlanPriceWithInstallmentAdditionalCoveragePremiumList)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public WebElement getCalculatePlanPriceButtonElement(String strLocatorPlanPriceButtonName){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strLocatorPlanPriceButtonName)){
			return lreturn
		}
		String lLocatorPlanPriceButtonName=strLocatorPlanPriceButtonName.trim()
		try{
			String lLocatorButton='button'
			List<WebElement> lElementCalculatePlanPriceButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorButton)
			WebElement lTargetElement=null
			for(Integer lWebIndex=0;lWebIndex<=lElementCalculatePlanPriceButtonList.size()-1;lWebIndex++){
				WebElement lElementCalculatePlanPriceButton=lElementCalculatePlanPriceButtonList.get(lWebIndex)
				String lLocatorCalculatePlanPriceButtonText=lElementCalculatePlanPriceButton.getText()
				IGNUemaHelper.printLog(lLocatorCalculatePlanPriceButtonText)
				IGNUemaHelper.printLog(lLocatorPlanPriceButtonName)
				if(lLocatorCalculatePlanPriceButtonText==lLocatorPlanPriceButtonName){
					IGNUemaHelper.printLog('Calculate Plan Price Button Found')
					lTargetElement=lElementCalculatePlanPriceButton
				}
			}
			if(lTargetElement){
				lResult=true
			}
			if(lResult){
				lreturn=lTargetElement
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPaymentFrequency(String strPaymentFrquency){
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
	public Boolean inputPlanOption(Map mapPlanOption,String strCoverName){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectEmptyOfMap(mapPlanOption)){
			return lreturn
		}
		Map lMapPlanOption=mapPlanOption
		if(IGNUemaHelper.checkObjectEmptyOfString(strCoverName)){
			return lreturn
		}
		String lCoverName=strCoverName
		try{
			Boolean lResult=true
			for(Map.Entry lEntry in lMapPlanOption){
				String lSelectedPlanName=lEntry.key.toString()
				String lSelectedOptionValue=lEntry.value.toString()
				lSelectedPlanName=lCoverName+lSelectedPlanName
				IGNUemaHelper.printLog('Input Plan In Library')
				IGNUemaHelper.printLog(lSelectedPlanName)
				IGNUemaHelper.printLog(lCoverName)
				String lLocatorPlanOptionButton='select[name='+lSelectedPlanName+']'
				WebElement lElementSelectedPlanOptionButton=null
				if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPlanOptionButton,15)){
					IGNUemaHelper.printLog('PlanOption Present')
				}
				lElementSelectedPlanOptionButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPlanOptionButton)
				if(lElementSelectedPlanOptionButton){
					IGNUemaHelper.printLog('PlanOptionFound')
					lSelectedOptionValue=IGNUemaHelper.selectOptionSelectByWebElementV1(this.driver,lElementSelectedPlanOptionButton,lSelectedOptionValue,false,false)
				}
				else{
					lResult=false
				}
			}
			lreturn=lResult
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public WebElement getPricingInputElement(String strPricingInput){
		WebElement lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfString(strPricingInput)){
			return lreturn
		}
		String lPricingInput=strPricingInput
		try{
			String lLocatorInputTag='textarea'
			List<WebElement> lElementPricingInputTextAreaList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorInputTag)
			WebElement lTargetElement=null
			if(lElementPricingInputTextAreaList.size()>0){
				for(Integer lWebIndex=0;lWebIndex<=lElementPricingInputTextAreaList.size()-1;lWebIndex++){
					WebElement lElementInput=lElementPricingInputTextAreaList.get(lWebIndex)
					WebElement lElementFirstParentInput=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementInput)
					WebElement lElementSecondParentInput=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementFirstParentInput)
					List<WebElement>  lElementChildOfSecondParentInputList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementSecondParentInput,'td')
					for(Integer lWebChildIndex=0;lWebChildIndex<=lElementChildOfSecondParentInputList.size()-1;lWebChildIndex++){
						WebElement lElementChildInput=lElementChildOfSecondParentInputList.get(lWebChildIndex)
						String lElementChildText=lElementChildInput.getText()
						if(lPricingInput.contains(lElementChildText)){
							lTargetElement=lElementInput
							break
						}
					}
					if(!IGNUemaHelper.checkObjectNullOfObject(lTargetElement)){
						break
					}
				}
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lTargetElement)){
				lResult=true
				IGNUemaHelper.printLog('Target found')
			}
			if(lResult){
				lreturn=lTargetElement
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map getTotalPremium(){
		Map lreturn=[:]
		Boolean lResult=false
		String lTotalPremium=''
		String lTotalDownPayment=''
		String lInstallmentAmount=''
		try{
			lreturn.put('TotalPremium',lTotalPremium)
			lreturn.put('TotalDownPayment',lTotalDownPayment)
			lreturn.put('InstallmentAmount',lInstallmentAmount)
			lreturn.put('Result',lResult)
			String lLocatorTargetMainTag='div'
			List<WebElement> lElementMainList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorTargetMainTag)
			WebElement lElementTargetMain=lElementMainList.get(1)
			for(Integer lWebMainIndex=1;lWebMainIndex<=lElementMainList.size()-1;lWebMainIndex++){
				WebElement lElementTargetMainParent=lElementMainList.get(lWebMainIndex)
				IGNUemaHelper.printLog('lElementTargetMainChild found')
				IGNUemaHelper.printLog('WebMainIndex'+lWebMainIndex)
				IGNUemaHelper.printLog(lElementTargetMainParent.getText())
				String lElementTargetMainParentText=lElementTargetMainParent.getText()
				WebElement lElementTargetMainChild=null
				if(lElementTargetMainParentText.contains('Total Premium')){
					List<WebElement> lElementTargetMainChildList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementTargetMainParent,'')
					for(Integer lWebChildIndex=0;lWebChildIndex<=lElementTargetMainChildList.size()-1;lWebChildIndex++){
						lElementTargetMainChild=lElementTargetMainChildList.get(lWebChildIndex)
						String lElementChildText=lElementTargetMainChild.getText().trim()
						if(lElementChildText.contains('Total Premium')){
							String[] lChildElementSubListText=lElementChildText.split(':')
							lTotalPremium=lChildElementSubListText[1]
							IGNUemaHelper.printLog(lTotalPremium)
						}
						if(lElementChildText.contains('First Installment Premium')){
							String[] lChildElementSubListText=lElementChildText.split(':')
							lInstallmentAmount=lChildElementSubListText[1]
							IGNUemaHelper.printLog(lInstallmentAmount)
						}
						if(lElementChildText.contains('Recurring Premium')){
							String[] lChildElementSubListText=lElementChildText.split(':')
							lTotalDownPayment=lChildElementSubListText[1]
							IGNUemaHelper.printLog(lTotalDownPayment)
						}
					}
				}
				if(lElementTargetMainChild){
					break
				}
			}
			lResult=(lTotalPremium.length()>0)
			if(lResult){
				lreturn.put('TotalPremium',lTotalPremium)
				lreturn.put('TotalDownPayment',lTotalDownPayment)
				lreturn.put('InstallmentAmount',lInstallmentAmount)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map getTotalAdditionalCoveragePremium(List strCoverageList){
		Map lreturn=[:]
		Boolean lResult=false
		List lLibraryCoveragePremiumList=[]
		List lLibraryCoverageNameList=[]
		try{
			lreturn.put('AdditionalCoverageNameList',lLibraryCoverageNameList)
			lreturn.put('AdditionalCoveragePremiumList',lLibraryCoveragePremiumList)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfList(strCoverageList)){
				return lreturn
			}
			List lCoverageList=strCoverageList
			String lLocatorTargetMainTag='div[class=row]'
			List<WebElement> lElementMainList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorTargetMainTag)
			WebElement lElementTargetMain=lElementMainList.get(1)
			List lAdditionalCoveragePremiumList=[]
			for(Integer lWebMainIndex=1;lWebMainIndex<=lElementMainList.size()-1;lWebMainIndex++){
				WebElement lElementTargetMainParent=lElementMainList.get(lWebMainIndex)
				IGNUemaHelper.printLog('lElementTargetMainChild found')
				IGNUemaHelper.printLog('WebMainIndex'+lWebMainIndex)
				IGNUemaHelper.printLog(lElementTargetMainParent.getText())
				String lElementTargetMainParentText=lElementTargetMainParent.getText()
				if(lElementTargetMainParentText.contains('Premium')){
					IGNUemaHelper.printLog('Additional Coverage ParentFound')
					lAdditionalCoveragePremiumList.add(lElementTargetMainParentText)
				}
			}
			IGNUemaHelper.printLog('lAdditionalCoveragePremiumList-Library')
			IGNUemaHelper.printLog(lAdditionalCoveragePremiumList.size())
			IGNUemaHelper.printLog(lCoverageList.size())
			if(lAdditionalCoveragePremiumList.size()>0){
				for(Integer lCoverageIndex=0;lCoverageIndex<=lCoverageList.size()-1;lCoverageIndex++){
					String lCoverageName=lCoverageList.get(lCoverageIndex)
					String lCoverageNameWithPremiumText=lAdditionalCoveragePremiumList.get(lCoverageIndex)
					String[] lCoverageNameWithPremiumTextList=lCoverageNameWithPremiumText.split(' ')
					String lLibraryCoverageName=lCoverageNameWithPremiumTextList[0]
					Integer lLastIndex=lCoverageNameWithPremiumTextList.size()
					String lCoveragePremium=lCoverageNameWithPremiumTextList[lLastIndex-1]
					lLibraryCoverageNameList.add(lLibraryCoverageName)
					lLibraryCoveragePremiumList.add(lCoveragePremium)
				}
			}
			IGNUemaHelper.printLog('lAdditionalCoveragePremiumList-In List')
			IGNUemaHelper.printLog(lLibraryCoverageNameList)
			IGNUemaHelper.printLog(lLibraryCoveragePremiumList)
			IGNUemaHelper.printLog(lCoverageList)
			lResult=lLibraryCoveragePremiumList.size()>0
			if(lResult){
				lreturn.put('AdditionalCoverageNameList',lLibraryCoverageNameList)
				lreturn.put('AdditionalCoveragePremiumList',lLibraryCoveragePremiumList)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map getPaymentDetail(){
		Map lreturn=[:]
		Boolean lResult=false
		List lLibraryPaymentDetailList=[]
		try{
			lreturn.put('PricingApiLibraryPaymentDetail',lLibraryPaymentDetailList)
			lreturn.put('Result',lResult)
			String lLocatorTargetMainTag='div'
			List<WebElement> lElementMainList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorTargetMainTag)
			WebElement lElementTargetMain=lElementMainList.get(1)
			for(Integer lWebMainIndex=1;lWebMainIndex<=lElementMainList.size()-1;lWebMainIndex++){
				WebElement lElementTargetMainParent=lElementMainList.get(lWebMainIndex)
				IGNUemaHelper.printLog('Payment Detail-lElementTargetMainChild found')
				IGNUemaHelper.printLog('WebMainIndex'+lWebMainIndex)
				IGNUemaHelper.printLog(lElementTargetMainParent.getText())
				String lElementTargetMainParentText=lElementTargetMainParent.getText()
				WebElement lElementTargetMainChild=null
				if(lElementTargetMainParentText.contains('Payment Details')){
					IGNUemaHelper.printLog('Payment Detail ParentFound')
					List<WebElement> lElementTargetMainChildList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementTargetMainParent,'div')
					for(Integer lWebChildIndex=0;lWebChildIndex<=lElementTargetMainChildList.size()-1;lWebChildIndex++){
						lElementTargetMainChild=lElementTargetMainChildList.get(lWebChildIndex)
						List<WebElement> lElementTargetNestedChildList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementTargetMainChild,'div')
						Map lMapPaymentDetail=[:]
						for(Integer lNestedWebChildIndex=0;lNestedWebChildIndex<=lElementTargetNestedChildList.size()-1;lNestedWebChildIndex++){
							WebElement lElementNestedChild=lElementTargetNestedChildList.get(lNestedWebChildIndex)
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementNestedChild)
							String lElementChildText=lElementNestedChild.getText().trim()
							String[] lNestedChildTextList=lElementChildText.split(':')
							String lNestedKey=''
							String lNestedValue=''
							if(lNestedChildTextList.size()==1){
								lNestedKey=lNestedChildTextList[0].trim()
								lNestedValue=''
							}
							else{
								lNestedKey=lNestedChildTextList[0].trim()
								lNestedValue=lNestedChildTextList[1].trim()
							}
							lMapPaymentDetail.put(lNestedKey,lNestedValue)
						}
						if(!IGNUemaHelper.checkObjectEmptyOfMap(lMapPaymentDetail)){
							lLibraryPaymentDetailList.add(lMapPaymentDetail)
						}
					}
				}
				if(lElementTargetMainChild){
					break
				}
			}
			IGNUemaHelper.printLog('LibraryPaymentList')
			IGNUemaHelper.printLog(lLibraryPaymentDetailList)
			lResult=lLibraryPaymentDetailList.size()>0
			if(lResult){
				lreturn.put('PricingApiLibraryPaymentDetail',lLibraryPaymentDetailList)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
}