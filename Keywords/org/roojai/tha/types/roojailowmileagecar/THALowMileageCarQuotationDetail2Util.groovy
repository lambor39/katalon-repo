package org.roojai.tha.types.roojailowmileagecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THALowMileageCarQuotationDetail2Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THALowMileageCarQuotationDetail2Util(WebDriver newDriver,WebDriver newSelenium){
		super()
		this.driver=newDriver
		this.selenium=newSelenium
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
	public String inputLanguage(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THALowMileageCarQuotationDetail2Type.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			String lResultText=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lResultText='No Option'
			}else{
				lResultText=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			lreturn=lResultText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String checkOpportunityNumber(String strOpportunityNumber){
		String lreturn=''
		String lOpportunityNumber=strOpportunityNumber.trim()
		try{
			Boolean lIsOK=true
			String lInfoTag=''
			String lInfoLocator=''
			String lInfoText=''
			WebElement lElementInfo=null
			IGNUemaHelper.webJsScrollToTop(this.driver)
			String lTagOpportunityNumber='qotation-no'
			String lOpportunityNumberOld=lOpportunityNumber
			if(lOpportunityNumberOld.length()>0){
				for(Integer lIndex=1;lIndex<=10;lIndex++){
					lInfoTag=lTagOpportunityNumber
					lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
					lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					if(!lElementInfo){
						IGNUemaHelper.delayThreadSecond(3)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					}
					if(!lElementInfo){
						lIsOK=false
					}else{
						lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
						lOpportunityNumber=lInfoText
						lIsOK=lIsOK&&(lInfoText.length()>0)
					}
					if(!lIsOK){
						IGNUemaHelper.delayThreadSecond(3)
						lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
						if(lElementInfo){
							lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
							lOpportunityNumber=lInfoText
							lIsOK=lIsOK&&(lInfoText.length()>0)
						}
					}
					lOpportunityNumber=lOpportunityNumber.trim()
					if(lOpportunityNumber.length()>0){
						if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumber)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}
				}
			}
			lreturn=lOpportunityNumber
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputDetail2(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lUnderFinancing=caseInput.UnderFinancing.toString().trim()
		String lFinancialOrganisation=caseInput.FinancialOrganisation.toString().trim()
		String lWithRedPlate=caseInput.WithRedPlate.toString().trim()
		String lChassisNumber=caseInput.ChassisNumber.toString().trim()
		String lPrevInsuranceCovered=caseInput.PrevInsuranceCovered.toString().trim()
		String lPrevInsuranceCompany=caseInput.PrevInsuranceCompany.toString().trim()
		String lPrevInsuranceType=caseInput.PrevInsuranceType.toString().trim()
		String lPolicyExpirationDayOffset=caseInput.PolicyExpirationDayOffset.toString().trim()
		String lPolicyExpirationDate=caseInput.PolicyExpirationDate.toString().trim()
		String lPolicyStartDayOffset=caseInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=caseInput.PolicyStartDate.toString().trim()
		String lSendToPostalCode=caseInput.SendToPostalCode.toString().trim()
		String lSendToProvince=caseInput.SendToProvince.toString().trim()
		String lSendToDistrict=caseInput.SendToDistrict.toString().trim()
		String lSendToSubDistrict=caseInput.SendToSubDistrict.toString().trim()
		String lSendToRoad=caseInput.SendToRoad.toString().trim()
		String lSendToBuildingName=caseInput.SendToBuildingName.toString().trim()
		String lSendToBuildingNumber=caseInput.SendToBuildingNumber.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lPolicyAmtYearly=''
		String lPolicyAmtInstalment=''
		String lPolicyInsurer=''
		String lSalesforceRetrieveDataOpportunityNumber=''
		String lSalesforceRetrieveDataPremiumYearly=''
		String lSalesforceRetrieveDataPremiumDeposit=''
		String lSalesforceRetrieveDataPremiumMonthly=''
		String lSalesforceRetrieveDataPremiumInstalment=''
		String lSalesforceRetrieveDataPremiumNoDepositAmount=''
		String lSalesforceRetrieveDataPremiumNoDepositTotal=''
		String lSalesforceRetrieveDataPremiumQuarterlyAmount=''
		String lSalesforceRetrieveDataPremiumQuarterlyTotal=''
		try{
			lPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(lPositiveCase.length()<=0){
				return lreturn
			}else{
				caseOutput.PositiveCase=lPositiveCase
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lOpportunityNumber=this.inputOpportunityNumber()
			if(lOpportunityNumber.length()<=0){
				return lreturn
			}else{
				caseOutput.OpportunityNumber=lOpportunityNumber
			}
			Map lMapAutomationDataBefore=this.inputAutomationDataBefore()
			if(!lMapAutomationDataBefore.Result){
				return lreturn
			}
			Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
			if(!lMapSalesforceProceedTodo.Result){
				lSalesforceProceedTodo=''
			}else{
				lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
			}
			caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
			if(lSalesforceProceedTodo.length()<=0){
				return lreturn
			}
			Boolean lIsActualResult=false
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			Boolean lIsSalesforceProceedRetrieveTodo=false
			if(lIsSalesforceProceedTodo){
				Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
					lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				}
				THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
				THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
				THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
				lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
				lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
				caseOutput.ActualResult=lActualResult
				if(lIsActualResult){
					Map lMapSalesforceProceedRetrieveTodo=this.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,caseOutput.SalesforceVerifyDataOpportunityObjAccountid)
					if(!lMapSalesforceProceedRetrieveTodo.Result){
						lSalesforceProceedRetrieveTodo=''
					}else{
						lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
					}
					caseOutput.SalesforceProceedRetrieveTodo=lSalesforceProceedRetrieveTodo
					if(lSalesforceProceedRetrieveTodo.length()<=0){
						return lreturn
					}
					lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
					if(lIsSalesforceProceedRetrieveTodo){
						Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THALowMileageCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
						lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
							return lreturn
						}
					}
				}
			}
			lLanguage=this.inputLanguage(lLanguage)
			if(lLanguage.length()<=0){
				return lreturn
			}else{
				caseOutput.Language=lLanguage
			}
			if(lIsSalesforceProceedRetrieveTodo){
				if(lIsActualResult){
					Map lMapAutomationDataAfter=this.inputAutomationDataAfter()
					if(!lMapAutomationDataAfter.Result){
						lSalesforceRetrieveDataOpportunityNumber=''
						lSalesforceRetrieveDataPremiumYearly=''
						lSalesforceRetrieveDataPremiumDeposit=''
						lSalesforceRetrieveDataPremiumMonthly=''
						lSalesforceRetrieveDataPremiumInstalment=''
						lSalesforceRetrieveDataPremiumNoDepositAmount=''
						lSalesforceRetrieveDataPremiumNoDepositTotal=''
						lSalesforceRetrieveDataPremiumQuarterlyAmount=''
						lSalesforceRetrieveDataPremiumQuarterlyTotal=''
					}else{
						lSalesforceRetrieveDataOpportunityNumber=lMapAutomationDataAfter.SalesforceRetrieveDataOpportunityNumber
						lSalesforceRetrieveDataPremiumYearly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumYearly
						lSalesforceRetrieveDataPremiumDeposit=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumDeposit
						lSalesforceRetrieveDataPremiumMonthly=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumMonthly
						lSalesforceRetrieveDataPremiumInstalment=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumInstalment
						lSalesforceRetrieveDataPremiumNoDepositAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositAmount
						lSalesforceRetrieveDataPremiumNoDepositTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumNoDepositTotal
						lSalesforceRetrieveDataPremiumQuarterlyAmount=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyAmount
						lSalesforceRetrieveDataPremiumQuarterlyTotal=lMapAutomationDataAfter.SalesforceRetrieveDataPremiumQuarterlyTotal
					}
					caseOutput.SalesforceRetrieveDataOpportunityNumber=lSalesforceRetrieveDataOpportunityNumber
					caseOutput.SalesforceRetrieveDataPremiumYearly=lSalesforceRetrieveDataPremiumYearly
					caseOutput.SalesforceRetrieveDataPremiumDeposit=lSalesforceRetrieveDataPremiumDeposit
					caseOutput.SalesforceRetrieveDataPremiumMonthly=lSalesforceRetrieveDataPremiumMonthly
					caseOutput.SalesforceRetrieveDataPremiumInstalment=lSalesforceRetrieveDataPremiumInstalment
					caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount=lSalesforceRetrieveDataPremiumNoDepositAmount
					caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal=lSalesforceRetrieveDataPremiumNoDepositTotal
					caseOutput.SalesforceRetrieveDataPremiumQuarterlyAmount=lSalesforceRetrieveDataPremiumQuarterlyAmount
					caseOutput.SalesforceRetrieveDataPremiumQuarterlyTotal=lSalesforceRetrieveDataPremiumQuarterlyTotal
					if(!lMapAutomationDataAfter.Result){
						return lreturn
					}
				}
			}
			lPolicyAmtYearly=this.inputPolicyAmtYearly()
			if(lPolicyAmtYearly.length()<=0){
				return lreturn
			}else{
				caseOutput.PolicyAmtYearly=lPolicyAmtYearly
			}
			lPolicyAmtInstalment=this.inputPolicyAmtInstalment()
			if(lPolicyAmtInstalment.length()<=0){
				return lreturn
			}else{
				caseOutput.PolicyAmtInstalment=lPolicyAmtInstalment
			}
			lUnderFinancing=this.inputUnderFinancing(lUnderFinancing)
			if(lUnderFinancing.length()<=0){
				return lreturn
			}else{
				caseOutput.UnderFinancing=lUnderFinancing
			}
			Boolean lIsUnderFinancing=IGNUemaHelper.convertStringToBoolean(lUnderFinancing)
			if(lIsUnderFinancing){
				lFinancialOrganisation=this.inputFinancialOrganisation(lFinancialOrganisation)
				if(lFinancialOrganisation.length()<=0){
					return lreturn
				}else{
					caseOutput.FinancialOrganisation=lFinancialOrganisation
				}
			}
			lWithRedPlate=this.inputWithRedPlate(lWithRedPlate)
			if(lWithRedPlate.length()<=0){
				return lreturn
			}else{
				caseOutput.WithRedPlate=lWithRedPlate
			}
			lChassisNumber=this.inputChassisNumber(lChassisNumber)
			if(lChassisNumber.length()<=0){
				return lreturn
			}else{
				caseOutput.ChassisNumber=lChassisNumber
			}
			lPrevInsuranceCovered=this.inputPrevInsuranceCovered(lPrevInsuranceCovered)
			if(lPrevInsuranceCovered.length()<=0){
				return lreturn
			}else{
				caseOutput.PrevInsuranceCovered=lPrevInsuranceCovered
			}
			Boolean lIsPrevInsuranceCovered=IGNUemaHelper.convertStringToBoolean(lPrevInsuranceCovered)
			if(lIsPrevInsuranceCovered){
				lPrevInsuranceCompany=this.inputPrevInsuranceCompany(lPrevInsuranceCompany)
				if(lPrevInsuranceCompany.length()<=0){
					return lreturn
				}else{
					caseOutput.PrevInsuranceCompany=lPrevInsuranceCompany
				}
				lPrevInsuranceType=this.inputPrevInsuranceType(lPrevInsuranceType)
				if(lPrevInsuranceType.length()<=0){
					return lreturn
				}else{
					caseOutput.PrevInsuranceType=lPrevInsuranceType
				}
				lPolicyExpirationDayOffset=this.inputPolicyExpirationDayOffset(lPolicyExpirationDayOffset)
				if(lPolicyExpirationDayOffset.length()<=0){
					return lreturn
				}else{
					caseOutput.PolicyExpirationDayOffset=lPolicyExpirationDayOffset
				}
				Integer lPolicyExpirationDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyExpirationDayOffset,0)
				lPolicyExpirationDate=this.inputPolicyExpirationDate(lPolicyExpirationDate,lPolicyExpirationDayOffsetNum)
				if(lPolicyExpirationDate.length()<=0){
					return lreturn
				}else{
					caseOutput.PolicyExpirationDate=lPolicyExpirationDate
				}
			}
			lPolicyStartDayOffset=this.inputPolicyStartDayOffset(lPolicyStartDayOffset)
			if(lPolicyStartDayOffset.length()<=0){
				return lreturn
			}else{
				caseOutput.PolicyStartDayOffset=lPolicyStartDayOffset
			}
			Integer lPolicyStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyStartDayOffset,0)
			lPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffsetNum)
			if(lPolicyStartDate.length()<=0){
				return lreturn
			}else{
				caseOutput.PolicyStartDate=lPolicyStartDate
			}
			IGNUemaHelper.delayThreadSecond(1)
			lSendToPostalCode=this.inputSendToPostalCode(lSendToPostalCode)
			if(lSendToPostalCode.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToPostalCode=lSendToPostalCode
			}
			IGNUemaHelper.delayThreadSecond(3)
			lSendToProvince=this.inputSendToProvince(lSendToProvince)
			if(lSendToProvince.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToProvince=lSendToProvince
			}
			IGNUemaHelper.delayThreadSecond(1)
			lSendToDistrict=this.inputSendToDistrict(lSendToDistrict)
			if(lSendToDistrict.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToDistrict=lSendToDistrict
			}
			IGNUemaHelper.delayThreadSecond(1)
			lSendToSubDistrict=this.inputSendToSubDistrict(lSendToSubDistrict)
			if(lSendToSubDistrict.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToSubDistrict=lSendToSubDistrict
			}
			lSendToRoad=this.inputSendToRoad(lSendToRoad)
			if(lSendToRoad.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToRoad=lSendToRoad
			}
			lSendToBuildingName=this.inputSendToBuildingName(lSendToBuildingName)
			if(lSendToBuildingName.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToBuildingName=lSendToBuildingName
			}
			lSendToBuildingNumber=this.inputSendToBuildingNumber(lSendToBuildingNumber)
			if(lSendToBuildingNumber.length()<=0){
				return lreturn
			}else{
				caseOutput.SendToBuildingNumber=lSendToBuildingNumber
			}
			Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			caseOutput.PolicyInsurer=lPolicyInsurer
			if(!lMapPolicyInsurer.Result){
				return lreturn
			}
			lActualResult=this.inputActualResult(lIsPositiveCase)
			if(lActualResult.length()<=0){
				return lreturn
			}else{
				caseOutput.ActualResult=lActualResult
			}
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			lIsActualResult=lIsPositiveCase&&lIsActualResult
			if(lIsActualResult){
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
					if(lIsActualResult){
						Map lMapSalesforceProceedVerifyBefore=this.inputSalesforceProceedVerifyBefore(caseOutput)
						lIsActualResult=lMapSalesforceProceedVerifyBefore.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedVerifyBefore.Result){
							return lreturn
						}
					}
					if(lIsActualResult){
						if(lIsSalesforceProceedRetrieveTodo){
							Map lMapSalesforceProceedVerifyAfter=this.inputSalesforceProceedVerifyAfter(caseOutput)
							lIsActualResult=lMapSalesforceProceedVerifyAfter.Result
							lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
							caseOutput.ActualResult=lActualResult
							if(!lMapSalesforceProceedVerifyAfter.Result){
								return lreturn
							}
						}
					}
				}
			}
			lreturn=lIsActualResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputUnderFinancing(String strUnderFinancing){
		String lreturn=''
		String lUnderFinancing=strUnderFinancing.trim()
		try{
			String lText=''
			if(lUnderFinancing.length()<=0){
				lUnderFinancing=THALowMileageCarQuotationDetail2Type.DEFAULT_UNDER_FINANCING
			}
			Boolean lIsUnderFinancing=IGNUemaHelper.convertStringToBoolean(lUnderFinancing)
			String lTagUploadDocumentButtonNext='upload-document-next'
			String lLocatorUploadDocumentButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagUploadDocumentButtonNext)
			WebElement lElementUploadDocumentButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagUploadDocumentButtonNext)
			if(lElementUploadDocumentButtonNext){
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementUploadDocumentButtonNext)
			}
			String lTagButton='isBeneficiary'
			WebElement lElementButton=null
			if(lIsUnderFinancing){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				lreturn='No Option'
				return lreturn
			}
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
				lUnderFinancing=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lreturn=lUnderFinancing
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputFinancialOrganisation(String strFinancialOrganisation){
		String lreturn=''
		String lFinancialOrganisation=strFinancialOrganisation.trim()
		try{
			String lText=''
			if(lFinancialOrganisation.length()<=0){
				lFinancialOrganisation=THALowMileageCarQuotationDetail2Type.DEFAULT_FINANCIAL_ORGANISATION
			}
			String lTagButton='selected-Beneficiary'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='Beneficiary-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lFinancialOrganisation='No Option'
			}else{
				lFinancialOrganisation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lFinancialOrganisation,true)
			}
			lreturn=lFinancialOrganisation
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputWithRedPlate(String strWithRedPlate){
		String lreturn=''
		String lWithRedPlate=strWithRedPlate.trim()
		try{
			String lText=''
			if(lWithRedPlate.length()<=0){
				lWithRedPlate=THALowMileageCarQuotationDetail2Type.DEFAULT_WITH_RED_PLATE
			}
			Boolean lIsWithRedPlate=IGNUemaHelper.convertStringToBoolean(lWithRedPlate)
			String lTagButton='hdIsRedCarPlate'
			WebElement lElementButton=null
			if(lIsWithRedPlate){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
				lWithRedPlate=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lreturn=lWithRedPlate
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputChassisNumber(String strChassisNumber){
		String lreturn=''
		String lChassisNumber=strChassisNumber.trim()
		try{
			String lText=''
			if(lChassisNumber.length()<=0){
				lChassisNumber=IGNUemaHelper.randomChasisNumber()
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'hdChassisNumber')
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lChassisNumber)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdChassisNumber-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceCovered(String strPrevInsuranceCovered){
		String lreturn=''
		String lPrevInsuranceCovered=strPrevInsuranceCovered.trim()
		try{
			String lText=''
			if(lPrevInsuranceCovered.length()<=0){
				lPrevInsuranceCovered=THALowMileageCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COVERED
			}
			Boolean lIsPrevInsuranceCovered=IGNUemaHelper.convertStringToBoolean(lPrevInsuranceCovered)
			String lTagButton='havePolicy'
			WebElement lElementButton=null
			if(lIsPrevInsuranceCovered){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
				lPrevInsuranceCovered=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lreturn=lPrevInsuranceCovered
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceCompany(String strPrevInsuranceCompany){
		String lreturn=''
		String lPrevInsuranceCompany=strPrevInsuranceCompany.trim()
		try{
			String lText=''
			if(lPrevInsuranceCompany.length()<=0){
				lPrevInsuranceCompany=THALowMileageCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COMPANY
			}
			String lTagButton='hdPreviousInsurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='hdPreviousInsurer-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lPrevInsuranceCompany='No Option'
			}else{
				lPrevInsuranceCompany=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPrevInsuranceCompany,true)
			}
			lreturn=lPrevInsuranceCompany
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceType(String strPrevInsuranceType){
		String lreturn=''
		String lPrevInsuranceType=strPrevInsuranceType.trim()
		try{
			String lText=''
			if(lPrevInsuranceType.length()<=0){
				lPrevInsuranceType=THALowMileageCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_TYPE
			}
			String lTagButton='hdPreviousCurrentCoverType'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='hdPreviousCurrentCoverType-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lPrevInsuranceType='No Option'
			}else{
				lPrevInsuranceType=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lPrevInsuranceType,true)
			}
			lreturn=lPrevInsuranceType
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyExpirationDayOffset(String strPolicyExpirationDayOffset){
		String lreturn=''
		String lPolicyExpirationDayOffset=strPolicyExpirationDayOffset.trim()
		if(lPolicyExpirationDayOffset.length()<=0){
			lPolicyExpirationDayOffset=THALowMileageCarQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DAY_OFFSET
		}
		try{
			String lText=''
			Integer lPolicyExpirationDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyExpirationDayOffset,0)
			lText=lPolicyExpirationDayOffsetNum.toString()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyExpirationDate(String strPolicyExpirationDate,Integer numPolicyExpirationDayOffset){
		String lreturn=''
		String lPolicyExpirationDate=strPolicyExpirationDate.trim()
		try{
			String lText=''
			if(lPolicyExpirationDate.length()<=0){
				lPolicyExpirationDate=THALowMileageCarQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DATE
			}
			String lFormatDate='dd/MM/yyyy'
			if(lPolicyExpirationDate.length()<=0){
				lPolicyExpirationDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
			}
			lPolicyExpirationDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lPolicyExpirationDate,numPolicyExpirationDayOffset)
			String lTagText='currentPolicyExpiryDate'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyExpirationDate)
			if(lText.length()<10){
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyExpirationDate)
			}
			if(lText.length()<10){
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyExpirationDate)
			}
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-currentPolicyExpiryDate-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyStartDayOffset(String strPolicyStartDayOffset){
		String lreturn=''
		String lPolicyStartDayOffset=strPolicyStartDayOffset.trim()
		if(lPolicyStartDayOffset.length()<=0){
			lPolicyStartDayOffset=THALowMileageCarQuotationDetail2Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		try{
			String lText=''
			Integer lPolicyStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyStartDayOffset,0)
			lText=lPolicyStartDayOffsetNum.toString()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyStartDate(String strPolicyStartDate,Integer numPolicyStartDayOffset){
		String lreturn=''
		String lPolicyStartDate=strPolicyStartDate.trim()
		try{
			String lText=''
			if(lPolicyStartDate.length()<=0){
				lPolicyStartDate=THALowMileageCarQuotationDetail2Type.DEFAULT_POLICY_START_DATE
			}
			String lTagText='hdPolicyStartDate'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			String lPolicyStartDateDefault=IGNUemaHelper.getTextByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))
			String lFormatDate='dd/MM/yyyy'
			String lStrTodayDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
			if(lPolicyStartDate.length()<=0){
				if(lPolicyStartDateDefault.length()<=0){
					lPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lStrTodayDate,numPolicyStartDayOffset)
				}else{
					if(lPolicyStartDateDefault.equalsIgnoreCase(lStrTodayDate)){
						lPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lStrTodayDate,numPolicyStartDayOffset)
					}else{
						lPolicyStartDate=lPolicyStartDateDefault
					}
				}
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyStartDate)
			if(lText.length()<10){
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyStartDate)
			}
			if(lText.length()<10){
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lPolicyStartDate)
			}
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdPolicyStartDate-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToPostalCode(String strSendToPostalCode){
		String lreturn=''
		String lSendToPostalCode=strSendToPostalCode.trim()
		try{
			String lText=''
			if(lSendToPostalCode.length()<=0){
				lSendToPostalCode=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_POSTAL_CODE
			}
			String lTagText='hdPostalCode'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToPostalCode)
			if(lText.length()<5){
				IGNUemaHelper.delayThreadSecond(1)
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToPostalCode)
			}
			if(lText.length()<5){
				IGNUemaHelper.delayThreadSecond(2)
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToPostalCode)
			}
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdPostalCode-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		if(lreturn.length()>0){
			IGNUemaHelper.delayThreadSecond(1)
		}
		return lreturn
	}
	public String inputSendToProvince(String strSendToProvince){
		String lreturn=''
		String lSendToProvince=strSendToProvince.trim()
		try{
			String lText=''
			if(lSendToProvince.length()<=0){
				lSendToProvince=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_PROVINCE
			}
			String lTagButton='hdProvince'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='hdProvince-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lLocatorButton='#block-hdProvince'
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				lSendToProvince='No Option'
			}else{
				lSendToProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToProvince,true)
				if(lSendToProvince.length()<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lSendToProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToProvince,true)
				}
				if(lSendToProvince.length()<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lSendToProvince=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorButton).trim()
				}
			}
			lreturn=lSendToProvince
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		if(lreturn.length()>0){
			IGNUemaHelper.delayThreadSecond(1)
		}
		return lreturn
	}
	public String inputSendToDistrict(String strSendToDistrict){
		String lreturn=''
		String lSendToDistrict=strSendToDistrict.trim()
		try{
			String lText=''
			if(lSendToDistrict.length()<=0){
				lSendToDistrict=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_DISTRICT
			}
			String lTagButton='hdDistrict'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='hdDistrict-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lLocatorButton='#block-hdDistrict'
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				lSendToDistrict='No Option'
			}else{
				lSendToDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToDistrict,true)
				if(lSendToDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lSendToDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToDistrict,true)
				}
				if(lSendToDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lSendToDistrict=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorButton).trim()
				}
			}
			lreturn=lSendToDistrict
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		if(lreturn.length()>0){
			IGNUemaHelper.delayThreadSecond(1)
		}
		return lreturn
	}
	public String inputSendToSubDistrict(String strSendToSubDistrict){
		String lreturn=''
		String lSendToSubDistrict=strSendToSubDistrict.trim()
		try{
			String lText=''
			if(lSendToSubDistrict.length()<=0){
				lSendToSubDistrict=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_SUB_DISTRICT
			}
			String lTagButton='hdSubDistrict'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='hdSubDistrict-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(3)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				IGNUemaHelper.delayThreadSecond(5)
				lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			}
			if(!lValid){
				lSendToSubDistrict='No Option'
			}else{
				lSendToSubDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToSubDistrict,true)
				if(lSendToSubDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lSendToSubDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToSubDistrict,true)
				}
				if(lSendToSubDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lSendToSubDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToSubDistrict,true)
				}
			}
			lreturn=lSendToSubDistrict
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		if(lreturn.length()>0){
			IGNUemaHelper.delayThreadSecond(1)
		}
		return lreturn
	}
	public String inputSendToRoad(String strSendToRoad){
		String lreturn=''
		String lSendToRoad=strSendToRoad.trim()
		try{
			String lText=''
			if(lSendToRoad.length()<=0){
				lSendToRoad=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_ROAD
			}
			String lTagText='hdRoadorSOI'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lElementText,lSendToRoad)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdRoadorSOI-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToBuildingName(String strSendToBuildingName){
		String lreturn=''
		String lSendToBuildingName=strSendToBuildingName.trim()
		try{
			String lText=''
			if(lSendToBuildingName.length()<=0){
				lSendToBuildingName=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NAME
			}
			String lTagText='hdVillageorBulding'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lElementText,lSendToBuildingName)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdVillageorBulding-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToBuildingNumber(String strSendToBuildingNumber){
		String lreturn=''
		String lSendToBuildingNumber=strSendToBuildingNumber.trim()
		try{
			String lText=''
			if(lSendToBuildingNumber.length()<=0){
				lSendToBuildingNumber=THALowMileageCarQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NUMBER
			}
			String lTagText='hdHousingNumber'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lElementText,lSendToBuildingNumber)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdHousingNumber-next')
			if(lElementButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPositiveCase(String strPositiveCase){
		String lreturn=''
		String lPositiveCase=strPositiveCase.trim()
		try{
			String lText=''
			if(lPositiveCase.length()<=0){
				lPositiveCase=THALowMileageCarQuotationDetail2Type.DEFAULT_POSITIVE_CASE
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lText=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputActualResult(Boolean isPositiveCase){
		String lreturn=''
		try{
			Boolean lActualResult=false
			String lText=''
			Boolean lRedirected=false
			Boolean lIsDone=false
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('enter-payment'))){
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,'#new-paymentComplete',5)
				if(isPositiveCase){
					lIsDone=lRedirected
				}else{
					lIsDone=!lRedirected
				}
				if(!lRedirected){
					if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('nextProcess'))){
						lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,'#new-paymentComplete',15)
						if(isPositiveCase){
							lIsDone=lRedirected
						}else{
							lIsDone=!lRedirected
						}
					}
				}
			}else if(!isPositiveCase){
				lIsDone=true
			}
			lText=IGNUemaHelper.convertBooleanToString(lIsDone)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputOpportunityNumber(){
		String lreturn=''
		try{
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			lInfoTag='qotation-no'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(lElementInfo){
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				lInfoText=this.checkOpportunityNumber(lInfoText)
				if(lInfoText.length()>0){
					THALowMileageCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lInfoText
					lreturn=lInfoText
					lInfoTag='rewards2words'
					lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
					lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
					if(lElementInfo){
						lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
						if(lInfoText.length()>0){
							lreturn=lreturn+'|Roojai Rewards='+lInfoText
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtYearly(){
		String lreturn=''
		try{
			String lInfoTag=''
			String lInfoLocator=''
			WebElement lElementInfo=null
			String lInfoText=''
			lInfoTag='summaryPrice'
			lInfoLocator=IGNUemaHelper.getTagDataSeleniumKey(lInfoTag)
			lElementInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lInfoTag)
			if(lElementInfo){
				lInfoText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInfo)
				if(lInfoText.length()>0){
					lreturn=lInfoText
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtInstalment(){
		String lreturn=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			String lTagInstalmentOpen='btn-head-installment'
			String lLocatorInstalmentOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagInstalmentOpen)
			if(!IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstalmentOpen)){
				lreturn='No Option'
			}else{
				IGNUemaHelper.delayThreadSecond(3)
				lPremiumDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first'))
				lPremiumMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment'))
				lPremiumInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice'))
				lPremiumNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment'))
				lPremiumNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice'))
				lPremiumQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment'))
				lPremiumQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice'))
				String lTagInstallmentSelectOptionSelected='selected-installment-option'
				String lLocatorInstallmentSelectOptionSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentSelectOptionSelected)
				WebElement lElementInstallmentSelectOptionSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInstallmentSelectOptionSelected)
				if(lElementInstallmentSelectOptionSelected){
					String lInstallmentSelectOptionSelectedValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementInstallmentSelectOptionSelected)
					String lTagInstallmentSelectOptionButtonKey='installment-option'
					String lLocatorInstallmentSelectOptionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagInstallmentSelectOptionButtonKey,lInstallmentSelectOptionSelectedValue)
					WebElement lElementInstallmentSelectOptionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagInstallmentSelectOptionButtonKey,lInstallmentSelectOptionSelectedValue)
					if(lElementInstallmentSelectOptionButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
					}
				}
				String lLocatorInstallmentPanelActive='.panel.installment-option.active'
				WebElement lElementInstallmentPanelActive=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorInstallmentPanelActive)
				if(lElementInstallmentPanelActive){
					String lTagInstallmentSelectOptionButton='installment-option'
					String lLocatorInstallmentSelectOptionButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentSelectOptionButton)
					WebElement lElementInstallmentSelectOptionButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementInstallmentPanelActive,lTagInstallmentSelectOptionButton)
					if(lElementInstallmentSelectOptionButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.delayThreadSecond(1)
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentSelectOptionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentSelectOptionButton)
					}
				}
				String lTagInstallmentCloseButton='installment-modal-close-btn'
				String lLocatorInstallmentCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInstallmentCloseButton)
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstallmentCloseButton)
				WebElement lElementInstallmentCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInstallmentCloseButton)
				if(lElementInstallmentCloseButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementInstallmentCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInstallmentCloseButton)
				}
				lreturn='PremiumDeposit='+lPremiumDeposit
				lreturn=lreturn+'\n'+'PremiumMonthly='+lPremiumMonthly
				lreturn=lreturn+'\n'+'PremiumInstalment='+lPremiumInstalment
				lreturn=lreturn+'\n'+'PremiumNoDepositAmount='+lPremiumNoDepositAmount
				lreturn=lreturn+'\n'+'PremiumNoDepositTotal='+lPremiumNoDepositTotal
				lreturn=lreturn+'\n'+'PremiumQuarterlyAmount='+lPremiumQuarterlyAmount
				lreturn=lreturn+'\n'+'PremiumQuarterlyTotal='+lPremiumQuarterlyTotal
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=true
			if(lResult){
				lreturn.put('PolicyInsurer',lPolicyInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAutomationDataBefore(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			String lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-head-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lStrPremiumAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'fullPayment')).trim()
			String lStrPremiumAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumAmtMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumAmtQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(!lElementPaymentInstalmentOptionModalFormCloseButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE=lOpportunityNumber
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE=lStrPremiumAmtYearly
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_DEPOSIT_VALUE=lStrPremiumAmtDeposit
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_MONTHLY_VALUE=lStrPremiumAmtMonthly
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_INSTALMENT_VALUE=lStrPremiumAmtInstalment
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE=lStrPremiumAmtNoDepositAmount
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE=lStrPremiumAmtNoDepositTotal
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_AMOUNT_VALUE=lStrPremiumAmtQuarterlyAmount
			THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_QUARTERLY_TOTAL_VALUE=lStrPremiumAmtQuarterlyTotal
			lResult=lOpportunityNumber.length()>0
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAutomationDataAfter(){
		Map lreturn=[:]
		String lSalesforceRetrieveDataOpportunityNumber=''
		String lSalesforceRetrieveDataPremiumYearly=''
		String lSalesforceRetrieveDataPremiumDeposit=''
		String lSalesforceRetrieveDataPremiumMonthly=''
		String lSalesforceRetrieveDataPremiumInstalment=''
		String lSalesforceRetrieveDataPremiumNoDepositAmount=''
		String lSalesforceRetrieveDataPremiumNoDepositTotal=''
		String lSalesforceRetrieveDataPremiumQuarterlyAmount=''
		String lSalesforceRetrieveDataPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('SalesforceRetrieveDataOpportunityNumber','')
			lreturn.put('SalesforceRetrieveDataPremiumYearly','')
			lreturn.put('SalesforceRetrieveDataPremiumDeposit','')
			lreturn.put('SalesforceRetrieveDataPremiumMonthly','')
			lreturn.put('SalesforceRetrieveDataPremiumInstalment','')
			lreturn.put('SalesforceRetrieveDataPremiumNoDepositAmount','')
			lreturn.put('SalesforceRetrieveDataPremiumNoDepositTotal','')
			lreturn.put('SalesforceRetrieveDataPremiumQuarterlyAmount','')
			lreturn.put('SalesforceRetrieveDataPremiumQuarterlyTotal','')
			lreturn.put('Result',lResult)
			lSalesforceRetrieveDataOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'qotation-no'))
			String lTagPaymentInstalmentOptionModalFormOpenButton='btn-head-installment'
			String lLocatorPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormOpenButton)
			WebElement lElementPaymentInstalmentOptionModalFormOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormOpenButton)
			if(!lElementPaymentInstalmentOptionModalFormOpenButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
			String lTagPaymentInstalmentOptionModalForm=''
			String lLocatorPaymentInstalmentOptionModalForm='#installment-detail-modal'
			WebElement lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			Boolean lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
			lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				IGNUemaHelper.delayThreadSecond(1)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormOpenButton)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm,10)
				lIsPaymentInstalmentOptionModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			}
			if(!lIsPaymentInstalmentOptionModalFormDisplayed){
				return lreturn
			}
			lElementPaymentInstalmentOptionModalForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPaymentInstalmentOptionModalForm)
			if(!lElementPaymentInstalmentOptionModalForm){
				return lreturn
			}
			String lStrPremiumAmtYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'fullPayment')).trim()
			String lStrPremiumAmtDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-first')).trim()
			String lStrPremiumAmtMonthly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-instalment')).trim()
			String lStrPremiumAmtInstalment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-deposit-totalPrice')).trim()
			String lStrPremiumAmtNoDepositAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-instalment')).trim()
			String lStrPremiumAmtNoDepositTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'monthly-nodeposit-totalPrice')).trim()
			String lStrPremiumAmtQuarterlyAmount=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-instalment')).trim()
			String lStrPremiumAmtQuarterlyTotal=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'quarterly-totalPrice')).trim()
			String lTagPaymentInstalmentOptionModalFormCloseButton='installment-modal-close'
			String lLocatorPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentOptionModalFormCloseButton)
			WebElement lElementPaymentInstalmentOptionModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentOptionModalFormCloseButton)
			if(!lElementPaymentInstalmentOptionModalFormCloseButton){
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentOptionModalFormCloseButton)
			lSalesforceRetrieveDataPremiumYearly=lStrPremiumAmtYearly
			lSalesforceRetrieveDataPremiumDeposit=lStrPremiumAmtDeposit
			lSalesforceRetrieveDataPremiumMonthly=lStrPremiumAmtMonthly
			lSalesforceRetrieveDataPremiumInstalment=lStrPremiumAmtInstalment
			lSalesforceRetrieveDataPremiumNoDepositAmount=lStrPremiumAmtNoDepositAmount
			lSalesforceRetrieveDataPremiumNoDepositTotal=lStrPremiumAmtNoDepositTotal
			lSalesforceRetrieveDataPremiumQuarterlyAmount=lStrPremiumAmtQuarterlyAmount
			lSalesforceRetrieveDataPremiumQuarterlyTotal=lStrPremiumAmtQuarterlyTotal
			lResult=lSalesforceRetrieveDataOpportunityNumber.length()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('SalesforceRetrieveDataOpportunityNumber',lSalesforceRetrieveDataOpportunityNumber)
				lreturn.put('SalesforceRetrieveDataPremiumYearly',lSalesforceRetrieveDataPremiumYearly)
				lreturn.put('SalesforceRetrieveDataPremiumDeposit',lSalesforceRetrieveDataPremiumDeposit)
				lreturn.put('SalesforceRetrieveDataPremiumMonthly',lSalesforceRetrieveDataPremiumMonthly)
				lreturn.put('SalesforceRetrieveDataPremiumInstalment',lSalesforceRetrieveDataPremiumInstalment)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositAmount',lSalesforceRetrieveDataPremiumNoDepositAmount)
				lreturn.put('SalesforceRetrieveDataPremiumNoDepositTotal',lSalesforceRetrieveDataPremiumNoDepositTotal)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyAmount',lSalesforceRetrieveDataPremiumQuarterlyAmount)
				lreturn.put('SalesforceRetrieveDataPremiumQuarterlyTotal',lSalesforceRetrieveDataPremiumQuarterlyTotal)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THALowMileageCarQuotationDetail2Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			IGNUemaHelper.delayThreadSecond(30)
			lResult=lSalesforceProceedTodo.length()>0
			if(lResult){
				lreturn.put('SalesforceProceedTodo',lSalesforceProceedTodo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
		Map lreturn=[:]
		String lSalesforceVerifyCompareDetail=''
		String lSalesforceVerifyCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE
			String lSalesforceOpportunityNumber=caseOutput.SalesforceVerifyDataOpportunityObjName
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
			}
			String lAutomationPaymentFrequency=''
			String lSalesforcePaymentFrequency=''
			Boolean lIsPaymentFrequency=false
			String lAutomationYearly=''
			String lSalesforceYearly=''
			Float lAutomationYearlyNumber=0
			Float lSalesforceYearlyNumber=0
			Float lYearlyPrice=0
			String lAutomationPremiumNoDepositAmount=''
			String lSalesforcePremiumNoDepositAmount=''
			Float lAutomationPremiumNoDepositAmountNumber=0
			Float lSalesforcePremiumNoDepositAmountNumber=0
			Float lPremiumNoDepositAmountPrice=0
			String lAutomationPremiumNoDepositTotal=''
			String lSalesforcePremiumNoDepositTotal=''
			Float lAutomationPremiumNoDepositTotalNumber=0
			Float lSalesforcePremiumNoDepositTotalNumber=0
			Float lPremiumNoDepositTotalPrice=0
			switch(THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD){
				case '2':
					lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '3':
					lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
					lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
					if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
						lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
						lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
						lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
						if(lYearlyPrice>1){
							lIsOK=false
							lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
							lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
						}
					}
					break
				case '4':
					lAutomationPaymentFrequency=THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_TRUE_MONEY_IS_YEARLY
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				case '5':
					lAutomationPaymentFrequency=THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_RABBIT_LINE_PAY_IS_YEARLY
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
				default:
					lAutomationPaymentFrequency=THALowMileageCarCoreType.CURRENT_QUOTATION_PREMIUM_CC_IS_YEARLY
					lSalesforcePaymentFrequency=caseOutput.SalesforceVerifyDataOpportunityObjPaymentFrequencyC
					lIsPaymentFrequency=IGNUemaHelper.convertStringToBoolean(lAutomationPaymentFrequency)
					if(lIsPaymentFrequency){
						lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
						lSalesforceYearly=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
							lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
							lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
							lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
							if(lYearlyPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}else{
						lAutomationPremiumNoDepositAmount=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE
						lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
							lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
							lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
							lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
							if(lPremiumNoDepositAmountPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
						lAutomationPremiumNoDepositTotal=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE
						lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC
						if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
							lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
							lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
							lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
							if(lPremiumNoDepositTotalPrice>1){
								lIsOK=false
								lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
								lSalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail+lText+'\n'
							}
						}
					}
					break
			}
			if(lIsOK){
				caseOutput.SalesforceVerifyCompareDetail='Passed'
				caseOutput.SalesforceVerifyCompareResult='Passed'
			}else{
				caseOutput.SalesforceVerifyCompareDetail=lSalesforceVerifyCompareDetail.trim()
				caseOutput.SalesforceVerifyCompareResult='Failed'
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedVerifyAfter(Map caseOutput){
		Map lreturn=[:]
		String lSalesforceRetrieveCompareDetail=''
		String lSalesforceRetrieveCompareResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('Result','')
			String lText=''
			String lAutomationOpportunityNumber=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_OPPORTUNITY_NUMBER_VALUE
			String lSalesforceOpportunityNumber=caseOutput.SalesforceRetrieveDataOpportunityNumber
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationOpportunityNumber,lSalesforceOpportunityNumber)){
				lIsOK=false
				lText=IGNUemaHelper.concatMessageLeftRightByPipe('OpportunityNumber='+lAutomationOpportunityNumber,lSalesforceOpportunityNumber)
				lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
			}
			String lAutomationYearly=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_YEARLY_VALUE
			String lSalesforceYearly=caseOutput.SalesforceRetrieveDataPremiumYearly
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationYearly,lSalesforceYearly)){
				Float lAutomationYearlyNumber=IGNUemaHelper.convertStringToFloat(lAutomationYearly,0)
				Float lSalesforceYearlyNumber=IGNUemaHelper.convertStringToFloat(lSalesforceYearly,0)
				Float lYearlyPrice=Math.abs(lAutomationYearlyNumber-lSalesforceYearlyNumber)
				if(lYearlyPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('Yearly='+lAutomationYearly,lSalesforceYearly)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositAmount=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_AMOUNT_VALUE
			String lSalesforcePremiumNoDepositAmount=caseOutput.SalesforceRetrieveDataPremiumNoDepositAmount
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)){
				Float lAutomationPremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositAmount,0)
				Float lSalesforcePremiumNoDepositAmountNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositAmount,0)
				Float lPremiumNoDepositAmountPrice=Math.abs(lAutomationPremiumNoDepositAmountNumber-lSalesforcePremiumNoDepositAmountNumber)
				if(lPremiumNoDepositAmountPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositAmount='+lAutomationPremiumNoDepositAmount,lSalesforcePremiumNoDepositAmount)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			String lAutomationPremiumNoDepositTotal=THALowMileageCarCoreType.CURRENT_QUOTATION_AUTOMATION_PREMIUM_NO_DEPOSIT_TOTAL_VALUE
			String lSalesforcePremiumNoDepositTotal=caseOutput.SalesforceRetrieveDataPremiumNoDepositTotal
			if(!IGNUemaHelper.checkStringContainStringRemoveWhitespace(lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)){
				Float lAutomationPremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lAutomationPremiumNoDepositTotal,0)
				Float lSalesforcePremiumNoDepositTotalNumber=IGNUemaHelper.convertStringToFloat(lSalesforcePremiumNoDepositTotal,0)
				Float lPremiumNoDepositTotalPrice=Math.abs(lAutomationPremiumNoDepositTotalNumber-lSalesforcePremiumNoDepositTotalNumber)
				if(lPremiumNoDepositTotalPrice>1){
					lIsOK=false
					lText=IGNUemaHelper.concatMessageLeftRightByPipe('PremiumNoDepositTotal='+lAutomationPremiumNoDepositTotal,lSalesforcePremiumNoDepositTotal)
					lSalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail+lText+'\n'
				}
			}
			if(lIsOK){
				caseOutput.SalesforceRetrieveCompareDetail='Passed'
				caseOutput.SalesforceRetrieveCompareResult='Passed'
			}else{
				caseOutput.SalesforceRetrieveCompareDetail=lSalesforceRetrieveCompareDetail.trim()
				caseOutput.SalesforceRetrieveCompareResult='Failed'
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedRetrieveTodo(String strSalesforceProceedRetrieveTodo,String strAccountNameAnonymous){
		Map lreturn=[:]
		String lSalesforceProceedRetrieveTodo=strSalesforceProceedRetrieveTodo.trim()
		if(lSalesforceProceedRetrieveTodo.length()<=0){
			lSalesforceProceedRetrieveTodo=THALowMileageCarQuotationDetail2Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Boolean lIsAccountNameAnonymous=IGNUemaHelper.checkStringContainString(strAccountNameAnonymous,'001p000000pE3R9AAK')
			if(lIsAccountNameAnonymous){
				lSalesforceProceedRetrieveTodo='No'
			}
			Boolean lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
			if(lIsSalesforceProceedRetrieveTodo){
				switch(THALowMileageCarCoreType.CURRENT_QUOTATION_PAYMENT_METHOD){
					case '2':
						lSalesforceProceedRetrieveTodo='No'
						break
					case '3':
						lSalesforceProceedRetrieveTodo='No'
						break
					case '4':
						lSalesforceProceedRetrieveTodo='No'
						break
					case '5':
						lSalesforceProceedRetrieveTodo='No'
						break
					default:
						lSalesforceProceedRetrieveTodo='Yes'
						break
				}
			}
			lIsSalesforceProceedRetrieveTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedRetrieveTodo)
			lSalesforceProceedRetrieveTodo=IGNUemaHelper.convertBooleanToYesNoString(lIsSalesforceProceedRetrieveTodo)
			lResult=lSalesforceProceedRetrieveTodo.length()>0
			if(lResult){
				lreturn.put('SalesforceProceedRetrieveTodo',lSalesforceProceedRetrieveTodo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSalesforceProceedRetrieveWebFromUrl(String strRetrievePageURL){
		Map lreturn=[:]
		String lRetrievePageURL=strRetrievePageURL.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			String lMainWindow=this.driver.getWindowHandle()
			String lUrlToNavigate=lRetrievePageURL
			Boolean lIsOpenNewBrowserTab=IGNUemaHelper.openNewBrowserTab(this.driver,lUrlToNavigate)
			if(!lIsOpenNewBrowserTab){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				if(!lSetWinHandle){
					IGNUemaHelper.delayThreadSecond(1)
					lSetWinHandle=this.driver.getWindowHandles()
				}else{
					if(lSetWinHandle.size()<=1){
						IGNUemaHelper.delayThreadSecond(1)
						lSetWinHandle=this.driver.getWindowHandles()
					}
				}
				if(!lSetWinHandle){
					IGNUemaHelper.delayThreadSecond(2)
					lSetWinHandle=this.driver.getWindowHandles()
				}else{
					if(lSetWinHandle.size()<=1){
						IGNUemaHelper.delayThreadSecond(2)
						lSetWinHandle=this.driver.getWindowHandles()
					}
				}
				if(!lSetWinHandle){
					IGNUemaHelper.delayThreadSecond(3)
					lSetWinHandle=this.driver.getWindowHandles()
				}else{
					if(lSetWinHandle.size()<=1){
						IGNUemaHelper.delayThreadSecond(3)
						lSetWinHandle=this.driver.getWindowHandles()
					}
				}
				if(!lSetWinHandle){
					return lreturn
				}else{
					if(lSetWinHandle.size()<=1){
						return lreturn
					}
				}
				for(String lWindowHandle:lSetWinHandle){
					if(lMainWindow.equals(lWindowHandle)){
						this.driver.close()
					}
				}
				lSetWinHandle=this.driver.getWindowHandles()
				if(!lSetWinHandle){
					return lreturn
				}else{
					if(lSetWinHandle.size()>1){
						return lreturn
					}
				}
				for(String lWindowHandle:lSetWinHandle){
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
					this.driver.switchTo().window(lWindowHandle)
					IGNUemaHelper.delayThreadSecond(3)
				}
				String lLocatorResultPage='#policy2-v3'
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(!lRedirected){
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.navigateToUrl(lUrlToNavigate)
					lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorResultPage,15)
				}
				if(lRedirected){
					String lCurrentURL=WebUI.getUrl()
					IGNUemaHelper.printLog(lCurrentURL)
					lRedirected=lCurrentURL.toUpperCase().contains('POLICYDETAILS2')
				}
				lResult=lRedirected
			}catch(Exception ex){
				return lreturn
			}
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}