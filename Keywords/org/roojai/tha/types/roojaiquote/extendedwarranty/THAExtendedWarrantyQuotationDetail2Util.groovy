package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAExtendedWarrantyQuotationDetail2Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAExtendedWarrantyQuotationDetail2Util(WebDriver newDriver,WebDriver newSelenium){
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
				lLanguageItem=lLanguageList.get(THAExtendedWarrantyQuotationDetail2Type.DEFAULT_LANGUAGE.toUpperCase())
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
	public String inputUnderFinancing(String strUnderFinancing){
		String lreturn=''
		String lUnderFinancing=strUnderFinancing.trim()
		try{
			String lText=''
			if(lUnderFinancing.length()<=0){
				lUnderFinancing=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_UNDER_FINANCING
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
				lFinancialOrganisation=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_FINANCIAL_ORGANISATION
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
				lWithRedPlate=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_WITH_RED_PLATE
			}
			Boolean lIsWithRedPlate=IGNUemaHelper.convertStringToBoolean(lWithRedPlate)
			String lTagButton='hdIsRedCarPlate'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
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
			if(!lElementText){
				lText='No Option'
			}else{
				lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lChassisNumber)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'btn-hdChassisNumber-next')
				if(lElementButton){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
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
				lPrevInsuranceCovered=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COVERED
			}
			Boolean lIsPrevInsuranceCovered=IGNUemaHelper.convertStringToBoolean(lPrevInsuranceCovered)
			String lTagButton='havePolicy'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPrevInsuranceCovered='No Option'
			}else{
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
				lPrevInsuranceCompany=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_COMPANY
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
				lPrevInsuranceType=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_PREV_INSURANCE_TYPE
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
			lPolicyExpirationDayOffset=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DAY_OFFSET
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
				lPolicyExpirationDate=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_EXPIRATION_DATE
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
			lPolicyStartDayOffset=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_START_DAY_OFFSET
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
				lPolicyStartDate=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_POLICY_START_DATE
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
				lSendToPostalCode=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_POSTAL_CODE
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
				lSendToProvince=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_PROVINCE
			}
			String lTagButton='selected-province'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='province'
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
				lSendToProvince='No Option'
			}else{
				lSendToProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToProvince,true)
				if(lSendToProvince.length()<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lSendToProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToProvince,true)
				}
				if(lSendToProvince.length()<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lSendToProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToProvince,true)
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
				lSendToDistrict=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_DISTRICT
			}
			String lTagButton='selected-district'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='district'
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
				lSendToDistrict='No Option'
			}else{
				lSendToDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToDistrict,true)
				if(lSendToDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(3)
					lSendToDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToDistrict,true)
				}
				if(lSendToDistrict.length()<=0){
					IGNUemaHelper.delayThreadSecond(5)
					lSendToDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lSendToDistrict,true)
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
				lSendToSubDistrict=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_SUB_DISTRICT
			}
			String lTagButton='selected-suddistrict'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='suddistrict'
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
				lSendToRoad=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_ROAD
			}
			String lTagText='hdRoadorSOI'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToRoad)
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
				lSendToBuildingName=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NAME
			}
			String lTagText='hdVillageorBulding'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToBuildingName)
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
				lSendToBuildingNumber=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_SEND_TO_BUILDING_NUMBER
			}
			String lTagText='hdHousingNumber'
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagText))){
				lreturn='No Option'
				return lreturn
			}
			WebElement lElementText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagText)
			lText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementText,lSendToBuildingNumber)
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
				lPositiveCase=THAExtendedWarrantyQuotationDetail2Type.DEFAULT_POSITIVE_CASE
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
				if(lInfoText.length()>0){
					THAExtendedWarrantyCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lInfoText
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
}