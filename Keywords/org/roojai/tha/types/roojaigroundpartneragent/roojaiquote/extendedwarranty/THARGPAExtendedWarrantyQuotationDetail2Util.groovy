package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaiquote.extendedwarranty.THAExtendedWarrantyQuotationDetail2Util
public class THARGPAExtendedWarrantyQuotationDetail2Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAExtendedWarrantyQuotationDetail2Util lTHAExtendedWarrantyQuotationDetail2Util=null
	public THARGPAExtendedWarrantyQuotationDetail2Util(WebDriver newDriver,WebDriver newSelenium){
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
	private THAExtendedWarrantyQuotationDetail2Util getlTHAExtendedWarrantyQuotationDetail2Util(){
		return this.lTHAExtendedWarrantyQuotationDetail2Util
	}
	private void setlTHAExtendedWarrantyQuotationDetail2Util(THAExtendedWarrantyQuotationDetail2Util newlTHAExtendedWarrantyQuotationDetail2Util){
		//Do Nothing
		//this.lTHAExtendedWarrantyQuotationDetail2Util=newlTHAExtendedWarrantyQuotationDetail2Util
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
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lOpportunityNumber=''
		String lPolicyAmtYearly=''
		String lPolicyAmtInstalment=''
		String lPolicyInsurer=''
		try{
			lPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(lPositiveCase.length()<=0){
				return lreturn
			}else{
				caseOutput.PositiveCase=lPositiveCase
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			this.lTHAExtendedWarrantyQuotationDetail2Util=new THAExtendedWarrantyQuotationDetail2Util(this.driver,this.selenium)
			lLanguage=this.inputLanguage(lLanguage)
			if(lLanguage.length()<=0){
				return lreturn
			}else{
				caseOutput.Language=lLanguage
			}
			lOpportunityNumber=this.inputOpportunityNumber()
			if(lOpportunityNumber.length()<=0){
				return lreturn
			}else{
				caseOutput.OpportunityNumber=lOpportunityNumber
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
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputLanguage(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_LANGUAGE.toUpperCase()
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputLanguage(lLanguage)
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
			lUnderFinancing=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_UNDER_FINANCING
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputUnderFinancing(lUnderFinancing)
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
			lFinancialOrganisation=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_FINANCIAL_ORGANISATION
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputFinancialOrganisation(lFinancialOrganisation)
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
			lWithRedPlate=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_WITH_RED_PLATE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputWithRedPlate(lWithRedPlate)
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
			lChassisNumber=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_CHASSIS_NUMBER
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputChassisNumber(lChassisNumber)
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
			lPrevInsuranceCovered=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COVERED
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPrevInsuranceCovered(lPrevInsuranceCovered)
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
			lPrevInsuranceCompany=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COMPANY
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPrevInsuranceCompany(lPrevInsuranceCompany)
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
			lPrevInsuranceType=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_TYPE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPrevInsuranceType(lPrevInsuranceType)
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
			lPolicyExpirationDayOffset=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DAY_OFFSET
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyExpirationDayOffset(lPolicyExpirationDayOffset)
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
			lPolicyExpirationDate=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DATE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyExpirationDate(lPolicyExpirationDate,numPolicyExpirationDayOffset)
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
			lPolicyStartDayOffset=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyStartDayOffset(lPolicyStartDayOffset)
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
			lPolicyStartDate=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_START_DATE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyStartDate(lPolicyStartDate,numPolicyStartDayOffset)
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
			lSendToPostalCode=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_POSTAL_CODE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToPostalCode(lSendToPostalCode)
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
			lSendToProvince=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_PROVINCE
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToProvince(lSendToProvince)
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
			lSendToDistrict=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_DISTRICT
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToDistrict(lSendToDistrict)
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
			lSendToSubDistrict=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_SUB_DISTRICT
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToSubDistrict(lSendToSubDistrict)
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
			lSendToRoad=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_ROAD
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToRoad(lSendToRoad)
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
			lSendToBuildingName=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NAME
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToBuildingName(lSendToBuildingName)
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
			lSendToBuildingNumber=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NUMBER
		}
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputSendToBuildingNumber(lSendToBuildingNumber)
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
				lPositiveCase=THARGPAExtendedWarrantyQuotationDetail2Type.DEFAULT_POSITIVE_CASE
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
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputActualResult(isPositiveCase)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputOpportunityNumber(){
		String lreturn=''
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputOpportunityNumber()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtYearly(){
		String lreturn=''
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyAmtYearly()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputPolicyAmtInstalment(){
		String lreturn=''
		try{
			lreturn=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyAmtInstalment()
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
			Map lMapPolicyInsurer=this.lTHAExtendedWarrantyQuotationDetail2Util.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			lResult=lPolicyInsurer.length()>0
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
}