package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.types.motorcar.THAMotorCarCoreType as THAMotorCarCoreType
import org.roojai.tha.types.motorcar.THAMotorCarQuotationDetail2Type
import org.roojai.tha.types.motorcar.THAMotorCarQuotationDetail2Util
import org.roojai.tha.types.motorcar.THAMotorCarQuotationDetail2UtilOld
public class THAKumkaInsureCarResultUtilRoojaiPageDetail2{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lMotorCarQuotationDetail2Util=null
	public THAKumkaInsureCarResultUtilRoojaiPageDetail2(WebDriver newDriver,WebDriver newSelenium){
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
	private THAMotorCarQuotationDetail2Util getlMotorCarQuotationDetail2Util(){
		return this.lMotorCarQuotationDetail2Util
	}
	private void setlMotorCarQuotationDetail2Util(THAMotorCarQuotationDetail2Util newlMotorCarQuotationDetail2Util){
		//Do Nothing
		//this.lMotorCarQuotationDetail2Util=newlMotorCarQuotationDetail2Util
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
			//Check QuoteApplication
			THAKumkaInsureCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION=IGNUemaHelper.checkWebDriverURLTargetUnderQuoteApplication(driver)
			if(THAKumkaInsureCarCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
				this.lMotorCarQuotationDetail2Util=new THAMotorCarQuotationDetail2Util(this.driver,this.selenium)
			}else{
				this.lMotorCarQuotationDetail2Util=new THAMotorCarQuotationDetail2UtilOld(this.driver,this.selenium)
			}
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
			Boolean lIsActualResult=false
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			Boolean lIsSalesforceProceedRetrieveTodo=false
			if(lIsSalesforceProceedTodo){
				Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAKumkaInsureCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
					lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAKumkaInsureCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
				}
				THAKumkaInsureCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL=caseOutput.SalesforceVerifyDataOpportunityObjQuoteAccessUrlC
				THAKumkaInsureCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_PAYMENT=caseOutput.SalesforceVerifyDataOpportunityObjPayOnlineUrlC
				THAKumkaInsureCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_SOCIAL=caseOutput.SalesforceVerifyDataOpportunityObjCustomerRatingUrlC
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
						Map lMapSalesforceProceedRetrieveWebFromUrl=this.inputSalesforceProceedRetrieveWebFromUrl(THAKumkaInsureCarCoreType.CURRENT_QUOTATION_RETRIEVAL_URL_PAGE_GENERAL)
						lIsActualResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
						if(!lMapSalesforceProceedRetrieveWebFromUrl.Result){
							return lreturn
						}
					}
				}
			}
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			caseOutput.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
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
			THAKumkaInsureCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			lIsActualResult=lIsPositiveCase&&lIsActualResult
			if(lIsActualResult){
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAKumkaInsureCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAKumkaInsureCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage
		if(lLanguage.length()<=0){
			lLanguage=THAMotorCarQuotationDetail2Type.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lMotorCarQuotationDetail2Util.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lResult=lLanguage.length()>0
			if(lResult){
				lreturn.put('Language',lLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputUnderFinancing(String strUnderFinancing){
		String lreturn=''
		String lUnderFinancing=strUnderFinancing.trim()
		if(lUnderFinancing.length()<=0){
			lUnderFinancing=THAMotorCarQuotationDetail2Type.DEFAULT_UNDER_FINANCING
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputUnderFinancing(lUnderFinancing)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputFinancialOrganisation(String strFinancialOrganisation){
		String lreturn=''
		String lFinancialOrganisation=strFinancialOrganisation.trim()
		if(lFinancialOrganisation.length()<=0){
			lFinancialOrganisation=THAMotorCarQuotationDetail2Type.DEFAULT_FINANCIAL_ORGANISATION
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputFinancialOrganisation(lFinancialOrganisation)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputWithRedPlate(String strWithRedPlate){
		String lreturn=''
		String lWithRedPlate=strWithRedPlate.trim()
		if(lWithRedPlate.length()<=0){
			lWithRedPlate=THAMotorCarQuotationDetail2Type.DEFAULT_WITH_RED_PLATE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputWithRedPlate(lWithRedPlate)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputChassisNumber(String strChassisNumber){
		String lreturn=''
		String lChassisNumber=strChassisNumber.trim()
		if(lChassisNumber.length()<=0){
			lChassisNumber=THAMotorCarQuotationDetail2Type.DEFAULT_CHASSIS_NUMBER
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputChassisNumber(lChassisNumber)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceCovered(String strPrevInsuranceCovered){
		String lreturn=''
		String lPrevInsuranceCovered=strPrevInsuranceCovered.trim()
		if(lPrevInsuranceCovered.length()<=0){
			lPrevInsuranceCovered=THAMotorCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COVERED
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPrevInsuranceCovered(lPrevInsuranceCovered)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceCompany(String strPrevInsuranceCompany){
		String lreturn=''
		String lPrevInsuranceCompany=strPrevInsuranceCompany.trim()
		if(lPrevInsuranceCompany.length()<=0){
			lPrevInsuranceCompany=THAMotorCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COMPANY
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPrevInsuranceCompany(lPrevInsuranceCompany)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPrevInsuranceType(String strPrevInsuranceType){
		String lreturn=''
		String lPrevInsuranceType=strPrevInsuranceType.trim()
		if(lPrevInsuranceType.length()<=0){
			lPrevInsuranceType=THAMotorCarQuotationDetail2Type.DEFAULT_PREV_INSURANCE_TYPE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPrevInsuranceType(lPrevInsuranceType)
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
			lPolicyExpirationDayOffset=THAMotorCarQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DAY_OFFSET
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyExpirationDayOffset(lPolicyExpirationDayOffset)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyExpirationDate(String strPolicyExpirationDate,Integer numPolicyExpirationDayOffset){
		String lreturn=''
		String lPolicyExpirationDate=strPolicyExpirationDate.trim()
		if(lPolicyExpirationDate.length()<=0){
			lPolicyExpirationDate=THAMotorCarQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DATE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyExpirationDate(lPolicyExpirationDate,numPolicyExpirationDayOffset)
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
			lPolicyStartDayOffset=THAMotorCarQuotationDetail2Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyStartDayOffset(lPolicyStartDayOffset)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyStartDate(String strPolicyStartDate,Integer numPolicyStartDayOffset){
		String lreturn=''
		String lPolicyStartDate=strPolicyStartDate.trim()
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=THAMotorCarQuotationDetail2Type.DEFAULT_POLICY_START_DATE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyStartDate(lPolicyStartDate,numPolicyStartDayOffset)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToPostalCode(String strSendToPostalCode){
		String lreturn=''
		String lSendToPostalCode=strSendToPostalCode.trim()
		if(lSendToPostalCode.length()<=0){
			lSendToPostalCode=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_POSTAL_CODE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToPostalCode(lSendToPostalCode)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToProvince(String strSendToProvince){
		String lreturn=''
		String lSendToProvince=strSendToProvince.trim()
		if(lSendToProvince.length()<=0){
			lSendToProvince=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_PROVINCE
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToProvince(lSendToProvince)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToDistrict(String strSendToDistrict){
		String lreturn=''
		String lSendToDistrict=strSendToDistrict.trim()
		if(lSendToDistrict.length()<=0){
			lSendToDistrict=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_DISTRICT
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToDistrict(lSendToDistrict)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToSubDistrict(String strSendToSubDistrict){
		String lreturn=''
		String lSendToSubDistrict=strSendToSubDistrict.trim()
		if(lSendToSubDistrict.length()<=0){
			lSendToSubDistrict=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_SUB_DISTRICT
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToSubDistrict(lSendToSubDistrict)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToRoad(String strSendToRoad){
		String lreturn=''
		String lSendToRoad=strSendToRoad.trim()
		if(lSendToRoad.length()<=0){
			lSendToRoad=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_ROAD
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToRoad(lSendToRoad)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToBuildingName(String strSendToBuildingName){
		String lreturn=''
		String lSendToBuildingName=strSendToBuildingName.trim()
		if(lSendToBuildingName.length()<=0){
			lSendToBuildingName=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NAME
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToBuildingName(lSendToBuildingName)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputSendToBuildingNumber(String strSendToBuildingNumber){
		String lreturn=''
		String lSendToBuildingNumber=strSendToBuildingNumber.trim()
		if(lSendToBuildingNumber.length()<=0){
			lSendToBuildingNumber=THAMotorCarQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NUMBER
		}
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputSendToBuildingNumber(lSendToBuildingNumber)
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
				lPositiveCase=THAMotorCarQuotationDetail2Type.DEFAULT_POSITIVE_CASE
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
			lreturn=this.lMotorCarQuotationDetail2Util.inputActualResult(isPositiveCase)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputOpportunityNumber(){
		String lreturn=''
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputOpportunityNumber()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtYearly(){
		String lreturn=''
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyAmtYearly()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtInstalment(){
		String lreturn=''
		try{
			lreturn=this.lMotorCarQuotationDetail2Util.inputPolicyAmtInstalment()
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
			Map lMapPolicyInsurer=this.lMotorCarQuotationDetail2Util.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			lResult=lMapPolicyInsurer.Result
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THAMotorCarQuotationDetail2Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lMotorCarQuotationDetail2Util.inputSalesforceProceedTodo(lSalesforceProceedTodo)
			if(!lMapSalesforceProceedTodo.Result){
				lSalesforceProceedTodo=''
			}else{
				lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
			}
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
	public Map inputAutomationDataBefore(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapAutomationDataBefore=this.lMotorCarQuotationDetail2Util.inputAutomationDataBefore()
			lResult=lMapAutomationDataBefore.Result
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
			Map lMapAutomationDataAfter=this.lMotorCarQuotationDetail2Util.inputAutomationDataAfter()
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
			lResult=lMapAutomationDataAfter.Result
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
	public Map inputSalesforceProceedVerifyBefore(Map caseOutput){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyBefore=this.lMotorCarQuotationDetail2Util.inputSalesforceProceedVerifyBefore(caseOutput)
			lResult=lMapSalesforceProceedVerifyBefore.Result
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
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedVerifyAfter=this.lMotorCarQuotationDetail2Util.inputSalesforceProceedVerifyAfter(caseOutput)
			lResult=lMapSalesforceProceedVerifyAfter.Result
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
			lSalesforceProceedRetrieveTodo=THAMotorCarQuotationDetail2Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedRetrieveTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedRetrieveTodo=this.lMotorCarQuotationDetail2Util.inputSalesforceProceedRetrieveTodo(lSalesforceProceedRetrieveTodo,strAccountNameAnonymous)
			if(!lMapSalesforceProceedRetrieveTodo.Result){
				lSalesforceProceedRetrieveTodo=''
			}else{
				lSalesforceProceedRetrieveTodo=lMapSalesforceProceedRetrieveTodo.SalesforceProceedRetrieveTodo
			}
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
			Map lMapSalesforceProceedRetrieveWebFromUrl=this.lMotorCarQuotationDetail2Util.inputSalesforceProceedRetrieveWebFromUrl(lRetrievePageURL)
			lResult=lMapSalesforceProceedRetrieveWebFromUrl.Result
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