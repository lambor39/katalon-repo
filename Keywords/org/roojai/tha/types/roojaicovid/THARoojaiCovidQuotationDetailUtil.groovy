package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiCovidQuotationDetailUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiCovidQuotationDetailUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputDetail(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lHolderBasicInfoPositiveCase=caseInput.HolderBasicInfoPositiveCase.toString().trim()
		String lHolderGenderStatus=caseInput.HolderGenderStatus.toString().trim()
		String lHolderName=caseInput.HolderName.toString().trim()
		String lHolderSurname=caseInput.HolderSurname.toString().trim()
		String lHolderDob=caseInput.HolderDob.toString().trim()
		String lHolderIsThai=caseInput.HolderIsThai.toString().trim()
		String lHolderIdPositiveCase=caseInput.HolderIdPositiveCase.toString().trim()
		String lHolderThaiId=caseInput.HolderThaiId.toString().trim()
		String lHolderPassport=caseInput.HolderPassport.toString().trim()
		String lHolderEmailPositiveCase=caseInput.HolderEmailPositiveCase.toString().trim()
		String lHolderEmail=caseInput.HolderEmail.toString().trim()
		String lHolderMobilePositiveCase=caseInput.HolderMobilePositiveCase.toString().trim()
		String lHolderMobile=caseInput.HolderMobile.toString().trim()
		String lAddressPostalCode=caseInput.AddressPostalCode.toString().trim()
		String lAddressProvince=caseInput.AddressProvince.toString().trim()
		String lAddressDistrict=caseInput.AddressDistrict.toString().trim()
		String lAddressSubDistrict=caseInput.AddressSubDistrict.toString().trim()
		String lAddressHouseNoPositiveCase=caseInput.AddressHouseNoPositiveCase.toString().trim()
		String lAddressHouseNo=caseInput.AddressHouseNo.toString().trim()
		String lAddressBuilding=caseInput.AddressBuilding.toString().trim()
		String lAddressRoad=caseInput.AddressRoad.toString().trim()
		String lAddressMooPositiveCase=caseInput.AddressMooPositiveCase.toString().trim()
		String lAddressMoo=caseInput.AddressMoo.toString().trim()
		String lBeneficiaryLegal=caseInput.BeneficiaryLegal.toString().trim()
		String lBeneficiaryOtherPositiveCase=caseInput.BeneficiaryOtherPositiveCase.toString().trim()
		String lBeneficiaryOtherRelation=caseInput.BeneficiaryOtherRelation.toString().trim()
		String lBeneficiaryOtherName=caseInput.BeneficiaryOtherName.toString().trim()
		String lBeneficiaryOtherSurname=caseInput.BeneficiaryOtherSurname.toString().trim()
		String lConfirmInfo=caseInput.ConfirmInfo.toString().trim()
		String lConfirmDisclosure=caseInput.ConfirmDisclosure.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lPolicyDetail=''
		String lSummaryPrice=''
		String lPolicyInsurer=''
		String lCoveragePeriod=''
		try{
			Map lMapPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(!lMapPositiveCase.Result){
				lPositiveCase=''
			}else{
				lPositiveCase=lMapPositiveCase.PositiveCase
			}
			caseOutput.PositiveCase=lPositiveCase
			if(lPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
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
			Map lMapHolderBasicInfoPositiveCase=this.inputHolderBasicInfoPositiveCase(lHolderBasicInfoPositiveCase)
			if(!lMapHolderBasicInfoPositiveCase.Result){
				lHolderBasicInfoPositiveCase=''
			}else{
				lHolderBasicInfoPositiveCase=lMapHolderBasicInfoPositiveCase.HolderBasicInfoPositiveCase
			}
			caseOutput.HolderBasicInfoPositiveCase=lHolderBasicInfoPositiveCase
			if(lHolderBasicInfoPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderBasicInfoPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderBasicInfoPositiveCase)
			Map lMapHolderBasicInfo=this.inputHolderBasicInfo(lHolderGenderStatus,lHolderName,lHolderSurname,lHolderDob,lIsHolderBasicInfoPositiveCase)
			if(!lMapHolderBasicInfo.Result){
				lHolderGenderStatus=''
				lHolderName=''
				lHolderSurname=''
				lHolderDob=''
			}else{
				lHolderGenderStatus=lMapHolderBasicInfo.HolderGenderStatus
				lHolderName=lMapHolderBasicInfo.HolderName
				lHolderSurname=lMapHolderBasicInfo.HolderSurname
				lHolderDob=lMapHolderBasicInfo.HolderDob
			}
			caseOutput.HolderGenderStatus=lHolderGenderStatus
			caseOutput.HolderName=lHolderName
			caseOutput.HolderSurname=lHolderSurname
			caseOutput.HolderDob=lHolderDob
			if(!lMapHolderBasicInfo.Result){
				return lreturn
			}
			Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
			if(!lMapHolderIsThai.Result){
				lHolderIsThai=''
			}else{
				lHolderIsThai=lMapHolderIsThai.HolderIsThai
			}
			caseOutput.HolderIsThai=lHolderIsThai
			if(lHolderIsThai.length()<=0){
				return lreturn
			}
			Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
			Map lMapHolderIdPositiveCase=this.inputHolderIdPositiveCase(lHolderIdPositiveCase)
			if(!lMapHolderIdPositiveCase.Result){
				lHolderIdPositiveCase=''
			}else{
				lHolderIdPositiveCase=lMapHolderIdPositiveCase.HolderIdPositiveCase
			}
			caseOutput.HolderIdPositiveCase=lHolderIdPositiveCase
			if(lHolderIdPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderIdPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderIdPositiveCase)
			Map lMapHolderNationalityId=this.inputHolderNationalityId(lHolderThaiId,lHolderPassport,lIsHolderIsThai,lIsHolderIdPositiveCase)
			if(!lMapHolderNationalityId.Result){
				lHolderThaiId=''
				lHolderPassport=''
			}else{
				lHolderThaiId=lMapHolderNationalityId.HolderThaiId
				lHolderPassport=lMapHolderNationalityId.HolderPassport
			}
			caseOutput.HolderThaiId=lHolderThaiId
			caseOutput.HolderPassport=lHolderPassport
			if(!lMapHolderNationalityId.Result){
				return lreturn
			}
			Map lMapHolderEmailPositiveCase=this.inputHolderEmailPositiveCase(lHolderEmailPositiveCase)
			if(!lMapHolderEmailPositiveCase.Result){
				lHolderEmailPositiveCase=''
			}else{
				lHolderEmailPositiveCase=lMapHolderEmailPositiveCase.HolderEmailPositiveCase
			}
			caseOutput.HolderEmailPositiveCase=lHolderEmailPositiveCase
			if(lHolderEmailPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderEmailPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderEmailPositiveCase)
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail,lIsHolderEmailPositiveCase)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
			}
			caseOutput.HolderEmail=lHolderEmail
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderMobilePositiveCase=this.inputHolderMobilePositiveCase(lHolderMobilePositiveCase)
			if(!lMapHolderMobilePositiveCase.Result){
				lHolderMobilePositiveCase=''
			}else{
				lHolderMobilePositiveCase=lMapHolderMobilePositiveCase.HolderMobilePositiveCase
			}
			caseOutput.HolderMobilePositiveCase=lHolderMobilePositiveCase
			if(lHolderMobilePositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsHolderMobilePositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderMobilePositiveCase)
			Map lMapHolderMobile=this.inputHolderMobile(lHolderMobile,lIsHolderMobilePositiveCase)
			if(!lMapHolderMobile.Result){
				lHolderMobile=''
			}else{
				lHolderMobile=lMapHolderMobile.HolderMobile
			}
			caseOutput.HolderMobile=lHolderMobile
			if(lHolderMobile.length()<=0){
				return lreturn
			}
			Map lMapAddressPostalCode=this.inputAddressPostalCode(lAddressPostalCode)
			if(!lMapAddressPostalCode.Result){
				lAddressPostalCode=''
			}else{
				lAddressPostalCode=lMapAddressPostalCode.AddressPostalCode
			}
			caseOutput.AddressPostalCode=lAddressPostalCode
			if(lAddressPostalCode.length()<=0){
				return lreturn
			}
			Map lMapAddressProvince=this.inputAddressProvince(lAddressProvince)
			if(!lMapAddressProvince.Result){
				lAddressProvince=''
			}else{
				lAddressProvince=lMapAddressProvince.AddressProvince
			}
			caseOutput.AddressProvince=lAddressProvince
			if(lAddressProvince.length()<=0){
				return lreturn
			}
			Map lMapAddressDistrict=this.inputAddressDistrict(lAddressDistrict)
			if(!lMapAddressDistrict.Result){
				lAddressDistrict=''
			}else{
				lAddressDistrict=lMapAddressDistrict.AddressDistrict
			}
			caseOutput.AddressDistrict=lAddressDistrict
			if(lAddressDistrict.length()<=0){
				return lreturn
			}
			Map lMapAddressSubDistrict=this.inputAddressSubDistrict(lAddressSubDistrict)
			if(!lMapAddressSubDistrict.Result){
				lAddressSubDistrict=''
			}else{
				lAddressSubDistrict=lMapAddressSubDistrict.AddressSubDistrict
			}
			caseOutput.AddressSubDistrict=lAddressSubDistrict
			if(lAddressSubDistrict.length()<=0){
				return lreturn
			}
			Map lMapAddressHouseNoPositiveCase=this.inputAddressHouseNoPositiveCase(lAddressHouseNoPositiveCase)
			if(!lMapAddressHouseNoPositiveCase.Result){
				lAddressHouseNoPositiveCase=''
			}else{
				lAddressHouseNoPositiveCase=lMapAddressHouseNoPositiveCase.AddressHouseNoPositiveCase
			}
			caseOutput.AddressHouseNoPositiveCase=lAddressHouseNoPositiveCase
			if(lAddressHouseNoPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsAddressHouseNoPositiveCase=IGNUemaHelper.convertStringToBoolean(lAddressHouseNoPositiveCase)

			Map lMapAddressMooPositiveCase=this.inputAddressMooPositiveCase(lAddressMooPositiveCase)
			if(!lMapAddressMooPositiveCase.Result){
				lAddressMooPositiveCase=''
			}else{
				lAddressMooPositiveCase=lMapAddressMooPositiveCase.AddressMooPositiveCase
			}
			caseOutput.AddressMooPositiveCase=lAddressMooPositiveCase
			if(lAddressMooPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsAddressMooPositiveCase=IGNUemaHelper.convertStringToBoolean(lAddressMooPositiveCase)
			Map lMapResidence=this.inputResidence(lAddressHouseNo,lAddressBuilding,lAddressRoad,lAddressMoo,lIsAddressHouseNoPositiveCase,lIsAddressMooPositiveCase)
			if(!lMapResidence.Result){
				lAddressHouseNo=''
				lAddressBuilding=''
				lAddressRoad=''
				lAddressMoo=''
			}else{
				lAddressHouseNo=lMapResidence.AddressHouseNo
				lAddressBuilding=lMapResidence.AddressBuilding
				lAddressRoad=lMapResidence.AddressRoad
				lAddressMoo=lMapResidence.AddressMoo
			}
			caseOutput.AddressHouseNo=lAddressHouseNo
			caseOutput.AddressBuilding=lAddressBuilding
			caseOutput.AddressRoad=lAddressRoad
			caseOutput.AddressMoo=lAddressMoo
			if(!lMapResidence.Result){
				return lreturn
			}
			Map lMapBeneficiaryLegal=this.inputBeneficiaryLegal(lBeneficiaryLegal)
			if(!lMapBeneficiaryLegal.Result){
				lBeneficiaryLegal=''
			}else{
				lBeneficiaryLegal=lMapBeneficiaryLegal.BeneficiaryLegal
			}
			caseOutput.BeneficiaryLegal=lBeneficiaryLegal
			if(lBeneficiaryLegal.length()<=0){
				return lreturn
			}
			Boolean lIsBeneficiaryLegal=IGNUemaHelper.convertStringToBoolean(lBeneficiaryLegal)
			if(!lIsBeneficiaryLegal){
				Map lMapBeneficiaryOtherPositiveCase=this.inputBeneficiaryOtherPositiveCase(lBeneficiaryOtherPositiveCase)
				if(!lMapBeneficiaryOtherPositiveCase.Result){
					lBeneficiaryOtherPositiveCase=''
				}else{
					lBeneficiaryOtherPositiveCase=lMapBeneficiaryOtherPositiveCase.BeneficiaryOtherPositiveCase
				}
				caseOutput.BeneficiaryOtherPositiveCase=lBeneficiaryOtherPositiveCase
				if(lBeneficiaryOtherPositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsBeneficiaryOtherPositiveCase=IGNUemaHelper.convertStringToBoolean(lBeneficiaryOtherPositiveCase)
				Map lMapBeneficiary=this.inputBeneficiaryOther(lBeneficiaryOtherRelation,lBeneficiaryOtherName,lBeneficiaryOtherSurname,lIsBeneficiaryOtherPositiveCase)
				if(!lMapBeneficiary.Result){
					lBeneficiaryOtherRelation=''
					lBeneficiaryOtherName=''
					lBeneficiaryOtherSurname=''
				}else{
					lBeneficiaryOtherRelation=lMapBeneficiary.BeneficiaryOtherRelation
					lBeneficiaryOtherName=lMapBeneficiary.BeneficiaryOtherName
					lBeneficiaryOtherSurname=lMapBeneficiary.BeneficiaryOtherSurname
				}
				caseOutput.BeneficiaryOtherRelation=lBeneficiaryOtherRelation
				caseOutput.BeneficiaryOtherName=lBeneficiaryOtherName
				caseOutput.BeneficiaryOtherSurname=lBeneficiaryOtherSurname
				if(!lMapBeneficiary.Result){
					return lreturn
				}
			}
			Map lMapConfirmInfo=this.inputConfirmInfo(lConfirmInfo)
			if(!lMapConfirmInfo.Result){
				lConfirmInfo=''
			}else{
				lConfirmInfo=lMapConfirmInfo.ConfirmInfo
			}
			caseOutput.ConfirmInfo=lConfirmInfo
			if(lConfirmInfo.length()<=0){
				return lreturn
			}
			Map lMapConfirmDisclosure=this.inputConfirmDisclosure(lConfirmDisclosure)
			if(!lMapConfirmDisclosure.Result){
				lConfirmDisclosure=''
			}else{
				lConfirmDisclosure=lMapConfirmDisclosure.ConfirmDisclosure
			}
			caseOutput.ConfirmDisclosure=lConfirmDisclosure
			if(lConfirmDisclosure.length()<=0){
				return lreturn
			}
			Map lMapPolicyDetail=this.inputPolicyDetail(lPolicyDetail)
			if(!lMapPolicyDetail.Result){
				lPolicyDetail=''
			}else{
				lPolicyDetail=lMapPolicyDetail.PolicyDetail
			}
			caseOutput.PolicyDetail=lPolicyDetail
			if(lPolicyDetail.length()<=0){
				return lreturn
			}
			Map lMapSummaryPrice=this.inputSummaryPrice(lSummaryPrice)
			if(!lMapSummaryPrice.Result){
				lSummaryPrice=''
			}else{
				lSummaryPrice=lMapSummaryPrice.SummaryPrice
			}
			caseOutput.SummaryPrice=lSummaryPrice
			if(lSummaryPrice.length()<=0){
				return lreturn
			}
			Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			caseOutput.PolicyInsurer=lPolicyInsurer
			Map lMapCoveragePeriod=this.inputCoveragePeriod(lCoveragePeriod)
			if(!lMapCoveragePeriod.Result){
				lCoveragePeriod=''
			}else{
				lCoveragePeriod=lMapCoveragePeriod.CoveragePeriod
			}
			caseOutput.CoveragePeriod=lCoveragePeriod
			if(lCoveragePeriod.length()<=0){
				return lreturn
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARoojaiCovidQuotationDetailType.DEFAULT_LANGUAGE.toUpperCase())
			}
			lLanguage=''
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguage=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THARoojaiCovidQuotationDetailType.DEFAULT_LANGUAGE
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
	public Map inputHolderBasicInfoPositiveCase(String strHolderBasicInfoPositiveCase){
		Map lreturn=[:]
		String lHolderBasicInfoPositiveCase=strHolderBasicInfoPositiveCase.trim()
		if(lHolderBasicInfoPositiveCase.length()<=0){
			lHolderBasicInfoPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_BASIC_INFO_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderBasicInfoPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderBasicInfoPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderBasicInfoPositiveCase)
			lHolderBasicInfoPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderBasicInfoPositiveCase)
			lResult=lHolderBasicInfoPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderBasicInfoPositiveCase',lHolderBasicInfoPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final Map DEFAULT_LIST_SEX_MARITAL_STATUS=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
	public Map inputHolderBasicInfo(String strHolderGenderStatus,String strHolderName,String strHolderSurname,String strHolderDob,Boolean isHolderBasicInfoPositiveCase){
		Map lreturn=[:]
		String lHolderGenderStatus=strHolderGenderStatus.trim()
		if(lHolderGenderStatus.length()<=0){
			lHolderGenderStatus=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_GENDER_STATUS
		}
		String lHolderName=strHolderName.trim()
		if(lHolderName.length()<=0){
			lHolderName=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_NAME
		}
		String lHolderSurname=strHolderSurname.trim()
		if(lHolderSurname.length()<=0){
			lHolderSurname=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_SURNAME
		}
		String lHolderDob=strHolderDob.trim()
		if(lHolderDob.length()<=0){
			lHolderDob=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderGenderStatus','')
			lreturn.put('HolderName','')
			lreturn.put('HolderSurname','')
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			String lHolderGenderStatusTarget=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lHolderGenderStatus)
			if(!lHolderGenderStatusTarget){
				lHolderGenderStatusTarget=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_GENDER_STATUS)
			}
			lHolderGenderStatus=''
			String lTagHolderGenderStatusButtonGroup='covid_gender'
			String lLocatorHolderGenderStatusButtonGroup=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderGenderStatusButtonGroup)
			String lLocatorHolderGenderStatusButtonTarget=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagHolderGenderStatusButtonGroup,lHolderGenderStatusTarget)
			WebElement lElementHolderGenderStatusButtonTarget=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagHolderGenderStatusButtonGroup,lHolderGenderStatusTarget)
			if(lElementHolderGenderStatusButtonTarget){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderGenderStatusButtonTarget)
				String lLocatorHolderGenderStatusButtonSelected=lLocatorHolderGenderStatusButtonGroup+'.choose4yes'
				WebElement lElementHolderGenderStatusButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderGenderStatusButtonSelected)
				if(lElementHolderGenderStatusButtonSelected){
					lHolderGenderStatus=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementHolderGenderStatusButtonSelected)
				}
			}
			String lTagHolderNameInputText='covid_firstname'
			String lLocatorHolderNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderNameInputText)
			WebElement lElementHolderNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderNameInputText)
			lHolderName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderNameInputText,lHolderName)
			String lTagHolderSurnameInputText='covid_lastname'
			String lLocatorHolderSurnameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderSurnameInputText)
			WebElement lElementHolderSurNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderSurnameInputText)
			lHolderSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderSurNameInputText,lHolderSurname)
			String lTagHolderDobInputText='covid_dob'
			String lLocatorHolderDobInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderDobInputText)
			WebElement lElementHolderDobInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderDobInputText)
			lHolderDob=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderDobInputText,lHolderDob)
			String lTagHolderBasicInfoButtonNext='covid_dob_next'
			String lLocatorHolderBasicInfoButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderBasicInfoButtonNext)
			WebElement lElementHolderBasicInfoButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderBasicInfoButtonNext)
			Boolean lIsHolderBasicInfoButtonNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderBasicInfoButtonNext)
			if(isHolderBasicInfoPositiveCase){
				lResult=lIsHolderBasicInfoButtonNextClicked
			}else{
				lResult=!lIsHolderBasicInfoButtonNextClicked
			}
			if(lResult){
				lreturn.put('HolderGenderStatus',lHolderGenderStatus)
				lreturn.put('HolderName',lHolderName)
				lreturn.put('HolderSurname',lHolderSurname)
				lreturn.put('HolderDob',lHolderDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsThai(String strHolderIsThai){
		Map lreturn=[:]
		String lHolderIsThai=strHolderIsThai.trim()
		if(lHolderIsThai.length()<=0){
			lHolderIsThai=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
			lHolderIsThai=''
			String lTagHolderIsThaiButton='covid_residentialStatus_thai'
			String lTagHolderIsOtherButton='covid_residentialStatus_other'
			String lLocatorHolderButton=''
			WebElement lElementHolderButton=null
			if(lIsHolderIsThai){
				lLocatorHolderButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderIsThaiButton)
				lElementHolderButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderIsThaiButton)
			}else{
				lLocatorHolderButton=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderIsOtherButton)
				lElementHolderButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderIsOtherButton)
			}
			if(lElementHolderButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderButton)
				String lLocatorHolderButtonSelected=lLocatorHolderButton+'.choose4yes'
				WebElement lElementHolderButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorHolderButtonSelected)
				if(lElementHolderButtonSelected){
					lHolderIsThai=IGNUemaHelper.convertBooleanToString(lIsHolderIsThai)
				}
			}
			lResult=lHolderIsThai.length()>0
			if(lResult){
				lreturn.put('HolderIsThai',lHolderIsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIdPositiveCase(String strHolderIdPositiveCase){
		Map lreturn=[:]
		String lHolderIdPositiveCase=strHolderIdPositiveCase.trim()
		if(lHolderIdPositiveCase.length()<=0){
			lHolderIdPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_ID_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIdPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIdPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderIdPositiveCase)
			lHolderIdPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderIdPositiveCase)
			lResult=lHolderIdPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderIdPositiveCase',lHolderIdPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderNationalityId(String strHolderThaiId,String strHolderPassport,Boolean isHolderIsThai,Boolean isHolderIdPositiveCase){
		Map lreturn=[:]
		String lHolderThaiId=strHolderThaiId.trim()
		if(lHolderThaiId.length()<=0){
			lHolderThaiId=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_THAI_ID
		}
		String lHolderPassport=strHolderPassport.trim()
		if(lHolderPassport.length()<=0){
			lHolderPassport=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderThaiId','')
			lreturn.put('HolderPassport','')
			lreturn.put('Result',lResult)
			String lTagHolderNationalityIdInputText='covid_idcard'
			String lLocatorHolderNationalityIdInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderNationalityIdInputText)
			WebElement lElementHolderNationalityIdInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderNationalityIdInputText)
			if(!lElementHolderNationalityIdInputText){
				lHolderThaiId=''
				lHolderPassport=''
			}else{
				if(isHolderIsThai){
					lHolderThaiId=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderNationalityIdInputText,lHolderThaiId)
					lHolderPassport=''
				}else{
					lHolderThaiId=''
					lHolderPassport=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderNationalityIdInputText,lHolderPassport)
				}
			}
			String lTagNationalityIdButtonNext='covid_idcard_next'
			String lLocatorNationalityIdButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityIdButtonNext)
			WebElement lElementNationalityIdButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagNationalityIdButtonNext)
			Boolean lIsNationalityIdButtonNextVisibled=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementNationalityIdButtonNext)
			if(!lIsNationalityIdButtonNextVisibled){
				if(isHolderIdPositiveCase){
					lResult=lIsNationalityIdButtonNextVisibled
				}else{
					lResult=!lIsNationalityIdButtonNextVisibled
				}
			}else{
				if(lElementNationalityIdButtonNext){
					Boolean lIsNationalityIdButtonNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNationalityIdButtonNext)
					if(isHolderIdPositiveCase){
						lResult=lIsNationalityIdButtonNextClicked
					}else{
						lResult=!lIsNationalityIdButtonNextClicked
					}
				}
			}
			if(lResult){
				lreturn.put('HolderThaiId',lHolderThaiId)
				lreturn.put('HolderPassport',lHolderPassport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderEmailPositiveCase(String strHolderEmailPositiveCase){
		Map lreturn=[:]
		String lHolderEmailPositiveCase=strHolderEmailPositiveCase.trim()
		if(lHolderEmailPositiveCase.length()<=0){
			lHolderEmailPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_EMAIL_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmailPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderEmailPositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderEmailPositiveCase)
			lHolderEmailPositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderEmailPositiveCase)
			lResult=lHolderEmailPositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderEmailPositiveCase',lHolderEmailPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderEmail(String strHolderEmail,Boolean isHolderEmailPositiveCase){
		Map lreturn=[:]
		String lHolderEmail=strHolderEmail.trim()
		if(lHolderEmail.length()<=0){
			lHolderEmail=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('Result',lResult)
			String lTagHolderEmailInputText='covid_email'
			String lLocatorHolderEmailInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderEmailInputText)
			WebElement lElementHolderEmailInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderEmailInputText)
			lHolderEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderEmailInputText,lHolderEmail)
			String lTagHolderEmailButtonNext='covid_email_next'
			String lLocatorHolderEmailButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderEmailButtonNext)
			WebElement lElementHolderEmailButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderEmailButtonNext)
			Boolean lIsHolderEmailButtonNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderEmailButtonNext)
			if(isHolderEmailPositiveCase){
				lResult=lIsHolderEmailButtonNextClicked
			}else{
				lResult=!lIsHolderEmailButtonNextClicked
			}
			if(lResult){
				lreturn.put('HolderEmail',lHolderEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderMobilePositiveCase(String strHolderMobilePositiveCase){
		Map lreturn=[:]
		String lHolderMobilePositiveCase=strHolderMobilePositiveCase.trim()
		if(lHolderMobilePositiveCase.length()<=0){
			lHolderMobilePositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_MOBILE_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderMobilePositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderMobilePositiveCase=IGNUemaHelper.convertStringToBoolean(lHolderMobilePositiveCase)
			lHolderMobilePositiveCase=IGNUemaHelper.convertBooleanToString(lIsHolderMobilePositiveCase)
			lResult=lHolderMobilePositiveCase.length()>0
			if(lResult){
				lreturn.put('HolderMobilePositiveCase',lHolderMobilePositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderMobile(String strHolderMobile,Boolean isHolderMobilePositiveCase){
		Map lreturn=[:]
		String lHolderMobile=strHolderMobile.trim()
		if(lHolderMobile.length()<=0){
			lHolderMobile=THARoojaiCovidQuotationDetailType.DEFAULT_HOLDER_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderMobile','')
			lreturn.put('Result',lResult)
			String lTagHolderMobileInputText='covid_mobile'
			String lLocatorHolderMobileInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderMobileInputText)
			WebElement lElementHolderMobileInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderMobileInputText)
			lHolderMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderMobileInputText,lHolderMobile)
			String lTagHolderMobileButtonNext='covid_mobile_next'
			String lLocatorHolderMobileButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderMobileButtonNext)
			WebElement lElementHolderMobileButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderMobileButtonNext)
			Boolean lIsHolderMobileButtonNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderMobileButtonNext)
			if(isHolderMobilePositiveCase){
				lResult=lIsHolderMobileButtonNextClicked
			}else{
				lResult=!lIsHolderMobileButtonNextClicked
			}
			if(lResult){
				lreturn.put('HolderMobile',lHolderMobile)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressPostalCode(String strAddressPostalCode){
		Map lreturn=[:]
		String lAddressPostalCode=strAddressPostalCode.trim()
		if(lAddressPostalCode.length()<=0){
			lAddressPostalCode=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressPostalCode','')
			lreturn.put('Result',lResult)
			String lTagAddressPostalCodeInputText='covid_postcode'
			String lLocatorAddressPostalCodeInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressPostalCodeInputText)
			WebElement lElementAddressPostalCodeInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressPostalCodeInputText)
			lAddressPostalCode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressPostalCodeInputText,lAddressPostalCode)
			lResult=lAddressPostalCode.length()>0
			if(lResult){
				lreturn.put('AddressPostalCode',lAddressPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final String CONST_LOCATOR_FORM_PLEASE_WAIT='#myPleaseWait'
	public Map inputAddressProvince(String strAddressProvince){
		Map lreturn=[:]
		String lAddressProvince=strAddressProvince.toUpperCase().trim()
		if(lAddressProvince.length()<=0){
			lAddressProvince=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressProvince','')
			lreturn.put('Result',lResult)
			String lTagAddressProvinceDropdownButton='covid_province'
			String lLocatorAddressProvinceDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressProvinceDropdownButton)
			String lTagAddressProvinceDropdownList='covid_province_item'
			String lLocatorAddressProvinceDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressProvinceDropdownList)
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,this.CONST_LOCATOR_FORM_PLEASE_WAIT,5)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorAddressProvinceDropdownButton)
			if(!lValid){
				lAddressProvince=''
			}else{
				lAddressProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressProvinceDropdownButton,lTagAddressProvinceDropdownList,lAddressProvince,true)
			}
			lResult=lAddressProvince.length()>0
			if(lResult){
				lreturn.put('AddressProvince',lAddressProvince)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressDistrict(String strAddressDistrict){
		Map lreturn=[:]
		String lAddressDistrict=strAddressDistrict.trim()
		if(lAddressDistrict.length()<=0){
			lAddressDistrict=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_DISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressDistrict','')
			lreturn.put('Result',lResult)
			String lTagAddressDistrictButton='covid_district'
			String lLocatorAddressDistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressDistrictButton)
			String lTagAddressDistrictDropdownList='covid_district_item'
			String lLocatorAddressDistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressDistrictDropdownList)
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,this.CONST_LOCATOR_FORM_PLEASE_WAIT,5)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorAddressDistrictButton)
			if(!lValid){
				lAddressDistrict=''
			}else{
				lAddressDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressDistrictButton,lTagAddressDistrictDropdownList,lAddressDistrict,true)
			}
			lResult=lAddressDistrict.length()>0
			if(lResult){
				lreturn.put('AddressDistrict',lAddressDistrict)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressSubDistrict(String strAddressSubDistrict){
		Map lreturn=[:]
		String lAddressSubDistrict=strAddressSubDistrict.trim()
		if(lAddressSubDistrict.length()<=0){
			lAddressSubDistrict=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_SUB_DISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressSubDistrict','')
			lreturn.put('Result',lResult)
			String lTagAddressSubDistrictButton='covid_subdistrict'
			String lLocatorAddressSubDistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressSubDistrictButton)
			String lTagAddressSubDistrictDropdownList='covid_subdistrict_item'
			String lLocatorAddressSubDistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressSubDistrictDropdownList)
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,this.CONST_LOCATOR_FORM_PLEASE_WAIT,5)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorAddressSubDistrictButton)
			if(!lValid){
				lAddressSubDistrict=''
			}else{
				lAddressSubDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressSubDistrictButton,lTagAddressSubDistrictDropdownList,lAddressSubDistrict,true)
			}
			lResult=lAddressSubDistrict.length()>0
			if(lResult){
				lreturn.put('AddressSubDistrict',lAddressSubDistrict)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressHouseNoPositiveCase(String strAddressHouseNoPositiveCase){
		Map lreturn=[:]
		String lAddressHouseNoPositiveCase=strAddressHouseNoPositiveCase.trim()
		if(lAddressHouseNoPositiveCase.length()<=0){
			lAddressHouseNoPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_HOUSE_NO_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressHouseNoPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsAddressHouseNoPositiveCase=IGNUemaHelper.convertStringToBoolean(lAddressHouseNoPositiveCase)
			lAddressHouseNoPositiveCase=IGNUemaHelper.convertBooleanToString(lIsAddressHouseNoPositiveCase)
			lResult=lAddressHouseNoPositiveCase.length()>0
			if(lResult){
				lreturn.put('AddressHouseNoPositiveCase',lAddressHouseNoPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressMooPositiveCase(String strAddressMooPositiveCase){
		Map lreturn=[:]
		String lAddressMooPositiveCase=strAddressMooPositiveCase.trim()
		if(lAddressMooPositiveCase.length()<=0){
			lAddressMooPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_MOO_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressMooPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsAddressMooPositiveCase=IGNUemaHelper.convertStringToBoolean(lAddressMooPositiveCase)
			lAddressMooPositiveCase=IGNUemaHelper.convertBooleanToString(lIsAddressMooPositiveCase)
			lResult=lAddressMooPositiveCase.length()>0
			if(lResult){
				lreturn.put('AddressMooPositiveCase',lAddressMooPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputResidence(String strAddressHouseNo,String strAddressBuilding,String strAddressRoad,String strAddressMoo,Boolean isAddressHouseNoPositiveCase,Boolean isAddressMooPositiveCase){
		Map lreturn=[:]
		String lAddressHouseNo=strAddressHouseNo.trim()
		if(lAddressHouseNo.length()<=0){
			lAddressHouseNo=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_HOUSE_NO
		}
		String lAddressBuilding=strAddressBuilding.trim()
		if(lAddressBuilding.length()<=0){
			lAddressBuilding=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_BUILDING
		}
		String lAddressRoad=strAddressRoad.trim()
		if(lAddressRoad.length()<=0){
			lAddressRoad=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_ROAD
		}
		String lAddressMoo=strAddressMoo.trim()
		if(lAddressMoo.length()<=0){
			lAddressMoo=THARoojaiCovidQuotationDetailType.DEFAULT_ADDRESS_MOO
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressHouseNo','')
			lreturn.put('AddressBuilding','')
			lreturn.put('AddressRoad','')
			lreturn.put('AddressMoo','')
			lreturn.put('Result',lResult)
			String lTagAddressHouseNoInputText='covid_houseno'
			String lLocatorAddressHouseNoInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressHouseNoInputText)
			WebElement lElementAddressHouseNoInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressHouseNoInputText)
			lAddressHouseNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressHouseNoInputText,lAddressHouseNo)
			String lTagAddressBuildingInputText='covid_buildingVillage'
			String lLocatorAddressBuildingInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressBuildingInputText)
			WebElement lElementAddressBuildingInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressBuildingInputText)
			lAddressBuilding=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressBuildingInputText,lAddressBuilding)
			String lTagAddressRoadInputText='covid_road_soi'
			String lLocatorAddressRoadInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressRoadInputText)
			WebElement lElementAddressRoadInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressRoadInputText)
			lAddressRoad=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementAddressRoadInputText,lAddressRoad)
			String lTagAddressMooInputText='covid_moo'
			String lLocatorAddressMooInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressMooInputText)
			WebElement lElementAddressMooInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressMooInputText)
			lAddressMoo=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lElementAddressMooInputText,lAddressMoo)
			String lTagAddressButtonNext='covid_moo_next'
			String lLocatorAddressButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressButtonNext)
			WebElement lElementAddressButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressButtonNext)
			Boolean lIsAddressButtonNextClicked=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementAddressButtonNext)
			if(isAddressHouseNoPositiveCase&&isAddressMooPositiveCase){
				lResult=lIsAddressButtonNextClicked
			}else{
				lResult=!lIsAddressButtonNextClicked
			}
			if(lResult){
				lreturn.put('AddressHouseNo',lAddressHouseNo)
				lreturn.put('AddressBuilding',lAddressBuilding)
				lreturn.put('AddressRoad',lAddressRoad)
				lreturn.put('AddressMoo',lAddressMoo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBeneficiaryLegal(String strBeneficiaryLegal){
		Map lreturn=[:]
		String lBeneficiaryLegal=strBeneficiaryLegal.trim()
		if(lBeneficiaryLegal.length()<=0){
			lBeneficiaryLegal=THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_LEGAL
		}
		try{
			Boolean lResult=false
			lreturn.put('lBeneficiaryLegal','')
			lreturn.put('Result',lResult)
			Boolean lIsBeneficiaryLegal=IGNUemaHelper.convertStringToBoolean(lBeneficiaryLegal)
			lBeneficiaryLegal=''
			String lTagBeneficiaryLegalButton='covid_beneficiary_legal_heirs'
			String lTagBeneficiaryOtherButton='covid_beneficiary_others'
			String lLocatorBeneficiaryLegalButton=''
			WebElement lElementBeneficiaryLegalButton=null
			if(lIsBeneficiaryLegal){
				lLocatorBeneficiaryLegalButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryLegalButton)
				lElementBeneficiaryLegalButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryLegalButton)
			}else{
				lLocatorBeneficiaryLegalButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherButton)
				lElementBeneficiaryLegalButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryOtherButton)
			}
			if(lElementBeneficiaryLegalButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBeneficiaryLegalButton)
				String lLocatorBeneficiaryLegalButtonSelected=lLocatorBeneficiaryLegalButton+'.choose4yes'
				WebElement lElementBeneficiaryLegalButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorBeneficiaryLegalButtonSelected)
				if(lElementBeneficiaryLegalButtonSelected){
					lBeneficiaryLegal=IGNUemaHelper.convertBooleanToString(lIsBeneficiaryLegal)
				}
			}
			lResult=lBeneficiaryLegal.length()>0
			if(lResult){
				lreturn.put('BeneficiaryLegal',lBeneficiaryLegal)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBeneficiaryOtherPositiveCase(String strBeneficiaryOtherPositiveCase){
		Map lreturn=[:]
		String lBeneficiaryOtherPositiveCase=strBeneficiaryOtherPositiveCase.trim()
		if(lBeneficiaryOtherPositiveCase.length()<=0){
			lBeneficiaryOtherPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_OTHER_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('BeneficiaryOtherPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsBeneficiaryOtherPositiveCase=IGNUemaHelper.convertStringToBoolean(lBeneficiaryOtherPositiveCase)
			lBeneficiaryOtherPositiveCase=IGNUemaHelper.convertBooleanToString(lIsBeneficiaryOtherPositiveCase)
			lResult=lBeneficiaryOtherPositiveCase.length()>0
			if(lResult){
				lreturn.put('BeneficiaryOtherPositiveCase',lBeneficiaryOtherPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBeneficiaryOther(String strBeneficiaryOtherRelation,String strBeneficiaryOtherName,String strBeneficiaryOtherSurname,Boolean isBeneficiaryOtherPositiveCase){
		Map lreturn=[:]
		Map lBeneficiaryOtherRelationList=['1':'0','2':'1','3':'2','4':'3','5':'4','6':'5','7':'6','8':'7','9':'8']
		String lBeneficiaryOtherRelation=strBeneficiaryOtherRelation.trim()
		if(lBeneficiaryOtherRelation.length()<=0){
			lBeneficiaryOtherRelation=THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_OTHER_RELATION
		}
		String lBeneficiaryOtherName=strBeneficiaryOtherName.trim()
		if(lBeneficiaryOtherName.length()<=0){
			lBeneficiaryOtherName=THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_OTHER_NAME
		}
		String lBeneficiaryOtherSurname=strBeneficiaryOtherSurname.trim()
		if(lBeneficiaryOtherSurname.length()<=0){
			lBeneficiaryOtherSurname=THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_OTHER_SURNAME
		}
		Integer lBeneficiaryOtherRelationDefault=0
		try{
			Boolean lResult=false
			lreturn.put('BeneficiaryOtherRelation','')
			lreturn.put('BeneficiaryOtherName','')
			lreturn.put('BeneficiaryOtherSurname','')
			lreturn.put('Result',lResult)
			String lBeneficiaryOtherRelationItem=lBeneficiaryOtherRelationList.get(lBeneficiaryOtherRelation)
			if(!lBeneficiaryOtherRelationItem){
				lBeneficiaryOtherRelationItem=lBeneficiaryOtherRelationList.get(THARoojaiCovidQuotationDetailType.DEFAULT_BENEFICIARY_OTHER_RELATION)
			}
			Integer lBeneficiaryOtherRelationNum=IGNUemaHelper.convertStringToInteger(lBeneficiaryOtherRelationItem,lBeneficiaryOtherRelationDefault)
			lBeneficiaryOtherRelation=''
			String lTagBeneficiaryOtherRelationshipButton='covid_beneficiary_relationship'
			String lLocatorBeneficiaryOtherRelationshipButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherRelationshipButton)
			String lTagBeneficiaryOtherRelationshipDropdownList='covid_beneficiary_relationship_item'
			String lLocatorBeneficiaryOtherRelationshipDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherRelationshipDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorBeneficiaryOtherRelationshipButton)
			if(!lValid){
				lBeneficiaryOtherRelation='No Option'
			}else{
				lBeneficiaryOtherRelation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV4(this.driver,lTagBeneficiaryOtherRelationshipButton,lTagBeneficiaryOtherRelationshipDropdownList,lBeneficiaryOtherRelationNum,true)
			}
			String lTagBeneficiaryOtherNameInputText='covid_beneficiary_firstname'
			String lLocatorBeneficiaryOtherNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherNameInputText)
			WebElement lElementBeneficiaryOtherNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryOtherNameInputText)
			lBeneficiaryOtherName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementBeneficiaryOtherNameInputText,lBeneficiaryOtherName)
			String lTagBeneficiaryOtherSurnameInputText='covid_beneficiary_lastname'
			String lLocatorBeneficiaryOtherSurnameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherSurnameInputText)
			WebElement lElementBeneficiaryOtherSurnameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryOtherSurnameInputText)
			lBeneficiaryOtherSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementBeneficiaryOtherSurnameInputText,lBeneficiaryOtherSurname)
			String lTagBeneficiaryOtherButtonNext='covid_beneficiary_lastname_next'
			String lLocatorBeneficiaryOtherButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryOtherButtonNext)
			WebElement lElementBeneficiaryOtherButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryOtherButtonNext)
			Boolean lIsBeneficiaryOtherButtonNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBeneficiaryOtherButtonNext)
			if(isBeneficiaryOtherPositiveCase){
				lResult=lIsBeneficiaryOtherButtonNextClicked
			}else{
				lResult=!lIsBeneficiaryOtherButtonNextClicked
			}
			if(lResult){
				lreturn.put('BeneficiaryOtherRelation',lBeneficiaryOtherRelation)
				lreturn.put('BeneficiaryOtherName',lBeneficiaryOtherName)
				lreturn.put('BeneficiaryOtherSurname',lBeneficiaryOtherSurname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputConfirmInfo(String strConfirmInfo){
		Map lreturn=[:]
		String lConfirmInfo=strConfirmInfo.trim()
		if(lConfirmInfo.length()<=0){
			lConfirmInfo=THARoojaiCovidQuotationDetailType.DEFAULT_CONFIRM_INFO
		}
		try{
			Boolean lResult=false
			lreturn.put('ConfirmInfo','')
			lreturn.put('Result',lResult)
			Boolean lIsConfirmInfo=IGNUemaHelper.convertStringToBoolean(lConfirmInfo)
			String lTagConfirmInfoButton='addition_14abroad'
			String lLocatorConfirmInfoButton=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmInfoButton)
			WebElement lElementConfirmInfoButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagConfirmInfoButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(lElementConfirmInfoButton){
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementConfirmInfoButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsConfirmInfo){
						String lTagConfirmInfoButtonNo='addition_14abroad_no'
						String lLocatorConfirmInfoButtonNo=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmInfoButtonNo)
						WebElement lElementConfirmInfoButtonNo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagConfirmInfoButtonNo)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementConfirmInfoButtonNo)
					}
				}else{
					if(lIsConfirmInfo){
						String lTagConfirmInfoButtonUYes='addition_14abroad_yes'
						String lLocatorConfirmInfoButtonYes=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmInfoButtonUYes)
						WebElement lElementConfirmInfoButtonYes=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagConfirmInfoButtonUYes)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementConfirmInfoButtonYes)
					}
				}
				lConfirmInfo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementConfirmInfoButton)
				lResult=lConfirmInfo.length()>0
				String lTagConfirmInfoButtonNext='additional_info_next'
				String lLocatorConfirmInfoButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmInfoButtonNext)
				WebElement lElementConfirmInfoButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagConfirmInfoButtonNext)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementConfirmInfoButtonNext)
			}
			if(lResult){
				lreturn.put('ConfirmInfo',lConfirmInfo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputConfirmDisclosure(String strConfirmDisclosure){
		Map lreturn=[:]
		String lConfirmDisclosure=strConfirmDisclosure.trim()
		if(lConfirmDisclosure.length()<=0){
			lConfirmDisclosure=THARoojaiCovidQuotationDetailType.DEFAULT_CONFIRM_DISCLOSURE
		}
		try{
			Boolean lResult=false
			lreturn.put('ConfirmDisclosure','')
			lreturn.put('Result',lResult)
			Boolean lIsConfirmDisclosure=IGNUemaHelper.convertStringToBoolean(lConfirmDisclosure)
			lConfirmDisclosure=''
			String lTagConfirmDisclosureButton='disclosureAccepted'
			String lLocatorConfirmDisclosureButton=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmDisclosureButton)
			WebElement lElementConfirmDisclosureButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagConfirmDisclosureButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(lElementConfirmDisclosureButton){
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementConfirmDisclosureButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsConfirmDisclosure){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementConfirmDisclosureButton)
					}
				}else{
					if(lIsConfirmDisclosure){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementConfirmDisclosureButton)
					}
				}
				lConfirmDisclosure=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementConfirmDisclosureButton)
			}
			lResult=lConfirmDisclosure.length()>0
			if(lResult){
				lreturn.put('ConfirmDisclosure',lConfirmDisclosure)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THARoojaiCovidQuotationDetailType.DEFAULT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('PositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lPositiveCase=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lResult=lPositiveCase.length()>0
			if(lResult){
				lreturn.put('PositiveCase',lPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyDetail(String strPolicyDetail){
		Map lreturn=[:]
		String lPolicyDetail=strPolicyDetail.trim()
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetail','')
			lreturn.put('Result',lResult)
			lPolicyDetail=''
			String lTagPolicyDetailButtonOpen='covid-modal-btn'
			String lLocatorPolicyDetailButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailButtonOpen)
			WebElement lElementPolicyDetailButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailButtonOpen)
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPolicyDetailButtonOpen)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagPolicyDetailInfo='covid-modal'
			String lLocatorPolicyDetailInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailInfo)
			WebElement lElementPolicyDetailInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailInfo)
			if(lElementPolicyDetailInfo){
				lPolicyDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyDetailInfo)
				String lTagPolicyDetailButtonClose='covid-modal-close-btn'
				String lLocatorPolicyDetailButtonClose=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailButtonClose)
				WebElement lElementPolicyDetailButtonClose=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailButtonClose)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPolicyDetailButtonClose)
			}
			lResult=lPolicyDetail.length()>0
			if(lResult){
				lreturn.put('PolicyDetail',lPolicyDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSummaryPrice(String strSummaryPrice){
		Map lreturn=[:]
		String lSummaryPrice=strSummaryPrice.trim()
		try{
			Boolean lResult=false
			lreturn.put('SummaryPrice','')
			lreturn.put('Result',lResult)
			lSummaryPrice=''
			String lTagSummaryPrice='summaryPrice'
			String lLocatorSummaryPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagSummaryPrice)
			WebElement lElementSummaryPrice=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSummaryPrice)
			if(!lElementSummaryPrice){
				lSummaryPrice=''
			}else{
				lSummaryPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSummaryPrice)
			}
			lResult=lSummaryPrice.length()>0
			if(lResult){
				lreturn.put('SummaryPrice',lSummaryPrice)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String	lPolicyInsurer=strPolicyInsurer.trim()
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			lPolicyInsurer=''
			String lTagButton=''
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
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
	public Map inputCoveragePeriod(String strCoveragePeriod){
		Map lreturn=[:]
		String lCoveragePeriod=strCoveragePeriod.trim()
		try{
			Boolean lResult=false
			lreturn.put('CoveragePeriod','')
			lreturn.put('Result',lResult)
			lCoveragePeriod=''
			Boolean lIsOK=false
			String lTagCoveragePeriodStart='covid_start_date'
			String lLocatorCoveragePeriodStart=IGNUemaHelper.getTagDataSeleniumKey(lTagCoveragePeriodStart)
			WebElement lElementCoveragePeriodStart=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCoveragePeriodStart)
			String lCoveragePeriodStart=''
			if(lElementCoveragePeriodStart){
				lCoveragePeriodStart=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCoveragePeriodStart)
				lIsOK=lCoveragePeriodStart.length()>0
			}
			String lTagCoveragePeriodEnd='covid_end_date'
			String lLocatorCoveragePeriodEnd=IGNUemaHelper.getTagDataSeleniumKey(lTagCoveragePeriodEnd)
			WebElement lElementCoveragePeriodEnd=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCoveragePeriodEnd)
			String lCoveragePeriodEnd=''
			if(lElementCoveragePeriodEnd){
				lCoveragePeriodEnd=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCoveragePeriodStart)
				lIsOK=lIsOK&&(lCoveragePeriodEnd.length()>0)
			}
			if(lIsOK){
				lCoveragePeriod=IGNUemaHelper.concatMessageLeftRightByPipe(lCoveragePeriodStart,lCoveragePeriodEnd)
			}
			lResult=lCoveragePeriod.length()>0
			if(lResult){
				lreturn.put('CoveragePeriod',lCoveragePeriod)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			lActualResult=''
			String lTagButtonBuy='buyOnline'
			String lLocatorButtonBuy=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonBuy)
			WebElement lElementBuyButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonBuy)
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementBuyButton)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButtonBuy)
			if(lValid){
				Boolean lRedirected=false
				Boolean lIsDone=false
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBuyButton)
				String lTagPaymentPage='covid_payment'
				String lLocatorPaymentPage=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentPage)
				lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentPage,30)
				if(isPositiveCase){
					lIsDone=lRedirected
				}else{
					lIsDone=!lRedirected
				}
				lActualResult=IGNUemaHelper.convertBooleanToString(lIsDone)
			}
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}