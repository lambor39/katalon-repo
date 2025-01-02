package org.roojai.tha.types.roojaigroundpartneragent.personalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationDetail1Util
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentCoreType as THAPersonalAccidentCoreType
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THARGPAPersonalAccidentQuotationDetail1Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	private THAPersonalAccidentQuotationDetail1Util lTHAPersonalAccidentQuotationDetail1Util=null
	public THARGPAPersonalAccidentQuotationDetail1Util(WebDriver newDriver,WebDriver newSelenium){
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
	private THAPersonalAccidentQuotationDetail1Util getlTHAPersonalAccidentQuotationDetail1Util(){
		return this.lTHAPersonalAccidentQuotationDetail1Util
	}
	private void setlTHAPersonalAccidentQuotationDetail1Util(THAPersonalAccidentQuotationDetail1Util newlTHAPersonalAccidentQuotationDetail1Util){
		//Do Nothing
		//this.lTHAPersonalAccidentQuotationDetail1Util=newlTHAPersonalAccidentQuotationDetail1Util
	}
	public Boolean inputDetail1(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lHolderEmail=caseInput.HolderEmail.toString().trim()
		String lHolderNewsletter=caseInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=caseInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=caseInput.HolderCallMeNowToDo.toString().trim()
		String lHolderCallMeNow=caseInput.HolderCallMeNow.toString().trim()
		String lQueryPersonalAccidentInsurance=caseInput.QueryPersonalAccidentInsurance.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryAccidentOrInjury=caseInput.QueryAccidentOrInjury.toString().trim()
		String lQueryReceivedMedicalTreatment=caseInput.QueryReceivedMedicalTreatment.toString().trim()
		String lQueryHypertensionBloodPositive=caseInput.QueryHypertensionBloodPositive.toString().trim()
		String lQueryOtherQuestion01=caseInput.QueryOtherQuestion01.toString().trim()
		String lQueryOtherQuestion02=caseInput.QueryOtherQuestion02.toString().trim()
		String lQueryOtherQuestion03=caseInput.QueryOtherQuestion03.toString().trim()
		String lQueryOtherQuestion04=caseInput.QueryOtherQuestion04.toString().trim()
		String lQueryOtherQuestion05=caseInput.QueryOtherQuestion05.toString().trim()
		String lQueryOtherQuestion06=caseInput.QueryOtherQuestion06.toString().trim()
		String lQueryOtherQuestion07=caseInput.QueryOtherQuestion07.toString().trim()
		String lQueryOtherQuestion08=caseInput.QueryOtherQuestion08.toString().trim()
		String lQueryOtherQuestion09=caseInput.QueryOtherQuestion09.toString().trim()
		String lQueryOtherQuestion10=caseInput.QueryOtherQuestion10.toString().trim()
		String lInsuredEdit=caseInput.InsuredEdit.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredBirthDate=caseInput.InsuredBirthDate.toString().trim()
		String lNationalityThai=caseInput.NationalityThai.toString().trim()
		String lNationalityThaiId=caseInput.NationalityThaiId.toString().trim()
		String lNationalityPassportId=caseInput.NationalityPassportId.toString().trim()
		String lNationalityPassportCountry=caseInput.NationalityPassportCountry.toString().trim()
		String lHolderFirstName=caseInput.HolderFirstName.toString().trim()
		String lHolderLastName=caseInput.HolderLastName.toString().trim()
		String lPolicyStartDate=caseInput.PolicyStartDate.toString().trim()
		String lPolicyStartOffsetDay=caseInput.PolicyStartOffsetDay.toString().trim()
		String lAddressPostalCode=caseInput.AddressPostalCode.toString().trim()
		String lAddressProvince=caseInput.AddressProvince.toString().trim()
		String lAddressDistrict=caseInput.AddressDistrict.toString().trim()
		String lAddressSubdistrict=caseInput.AddressSubdistrict.toString().trim()
		String lAddressRoad=caseInput.AddressRoad.toString().trim()
		String lAddressBuildingName=caseInput.AddressBuildingName.toString().trim()
		String lAddressBuildingNumber=caseInput.AddressBuildingNumber.toString().trim()
		String lLegalHeir=caseInput.LegalHeir.toString().trim()
		String lBeneficiary1Add=caseInput.Beneficiary1Add.toString().trim()
		String lBeneficiary1FirstName=caseInput.Beneficiary1FirstName.toString().trim()
		String lBeneficiary1LastName=caseInput.Beneficiary1LastName.toString().trim()
		String lBeneficiary1Relationship=caseInput.Beneficiary1Relationship.toString().trim()
		String lBeneficiary1Percentage=caseInput.Beneficiary1Percentage.toString().trim()
		String lBeneficiary2Add=caseInput.Beneficiary2Add.toString().trim()
		String lBeneficiary2FirstName=caseInput.Beneficiary2FirstName.toString().trim()
		String lBeneficiary2LastName=caseInput.Beneficiary2LastName.toString().trim()
		String lBeneficiary2Relationship=caseInput.Beneficiary2Relationship.toString().trim()
		String lBeneficiary2Percentage=caseInput.Beneficiary2Percentage.toString().trim()
		String lBeneficiary3Add=caseInput.Beneficiary3Add.toString().trim()
		String lBeneficiary3FirstName=caseInput.Beneficiary3FirstName.toString().trim()
		String lBeneficiary3LastName=caseInput.Beneficiary3LastName.toString().trim()
		String lBeneficiary3Relationship=caseInput.Beneficiary3Relationship.toString().trim()
		String lBeneficiary3Percentage=caseInput.Beneficiary3Percentage.toString().trim()
		String lSubmitCallMeBack=caseInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=caseInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=caseInput.CallMeBackMobile.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lOpportunityNumber=''
		String lInsuredDetail=''
		String lAdditionBeneficiaryDetail=''
		String lPolicyInsurer=''
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
			this.lTHAPersonalAccidentQuotationDetail1Util=new THAPersonalAccidentQuotationDetail1Util(this.driver,this.selenium)
			//Check ABTesting
			String lTagABTesting='ABTesting'
			String lLocatorABTesting=IGNUemaHelper.getTagDataSeleniumKey(lTagABTesting)
			WebElement lElementABTesting=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagABTesting)
			if(!lElementABTesting){
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=false
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
			}else{
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementABTesting).trim().toUpperCase()
				if(IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>1){
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				}
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>0
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					IGNUemaHelper.printLog('IGNUemaHelper.CURRENT_AB_TESTING_VERSION='+IGNUemaHelper.CURRENT_AB_TESTING_VERSION)
					lVersion=IGNUemaHelper.CURRENT_AB_TESTING_VERSION
					caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,'ActualVersion:'+lVersion)
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
			Map lMapSubmitCallMeBack=this.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			caseOutput.SubmitCallMeBack=lSubmitCallMeBack
			caseOutput.CallMeBackEmail=lCallMeBackEmail
			caseOutput.CallMeBackMobile=lCallMeBackMobile
			if(!lMapSubmitCallMeBack.Result){
				return lreturn
			}
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail,lHolderNewsletter)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
				lHolderNewsletter=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
				lHolderNewsletter=lMapHolderEmail.HolderNewsletter
			}
			caseOutput.HolderEmail=lHolderEmail
			caseOutput.HolderNewsletter=lHolderNewsletter
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderPhoneNo=this.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			caseOutput.HolderPhoneNo=lHolderPhoneNo
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Map lMapHolderCallMeNowToDo=this.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			caseOutput.HolderCallMeNowToDo=lHolderCallMeNowToDo
			if(lHolderCallMeNowToDo.length()<=0){
				return lreturn
			}
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			if(!lIsHolderCallMeNowToDo){
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,false)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				caseOutput.ActualResult=lActualResult
				caseOutput.OpportunityNumber=lOpportunityNumber
				THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
				Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				if(lIsActualResult){
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
					Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
					if(lIsSalesforceProceedTodo){
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
					}
				}
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}else{
				Map lMapHolderCallMeNow=this.inputHolderCallMeNow(lHolderCallMeNow)
				if(!lMapHolderCallMeNow.Result){
					lHolderCallMeNow=''
				}else{
					lHolderCallMeNow=lMapHolderCallMeNow.HolderCallMeNow
				}
				caseOutput.HolderCallMeNow=lHolderCallMeNow
				if(lHolderCallMeNow.length()<=0){
					return lreturn
				}
				Map lMapQueryQuestion=this.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
				if(!lMapQueryQuestion.Result){
					lQueryPersonalAccidentInsurance=''
					lQueryInsuredDeniedCoverage=''
					lQueryAccidentOrInjury=''
					lQueryReceivedMedicalTreatment=''
					lQueryHypertensionBloodPositive=''
					lQueryOtherQuestion01=''
					lQueryOtherQuestion02=''
					lQueryOtherQuestion03=''
					lQueryOtherQuestion04=''
					lQueryOtherQuestion05=''
					lQueryOtherQuestion06=''
					lQueryOtherQuestion07=''
					lQueryOtherQuestion08=''
					lQueryOtherQuestion09=''
					lQueryOtherQuestion10=''
				}else{
					lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
					lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
					lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
					lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
					lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
					lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
					lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
					lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
					lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
					lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
					lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
					lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
					lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
					lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
					lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
				}
				caseOutput.QueryPersonalAccidentInsurance=lQueryPersonalAccidentInsurance
				caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
				caseOutput.QueryAccidentOrInjury=lQueryAccidentOrInjury
				caseOutput.QueryReceivedMedicalTreatment=lQueryReceivedMedicalTreatment
				caseOutput.QueryHypertensionBloodPositive=lQueryHypertensionBloodPositive
				caseOutput.QueryOtherQuestion01=lQueryOtherQuestion01
				caseOutput.QueryOtherQuestion02=lQueryOtherQuestion02
				caseOutput.QueryOtherQuestion03=lQueryOtherQuestion03
				caseOutput.QueryOtherQuestion04=lQueryOtherQuestion04
				caseOutput.QueryOtherQuestion05=lQueryOtherQuestion05
				caseOutput.QueryOtherQuestion06=lQueryOtherQuestion06
				caseOutput.QueryOtherQuestion07=lQueryOtherQuestion07
				caseOutput.QueryOtherQuestion08=lQueryOtherQuestion08
				caseOutput.QueryOtherQuestion09=lQueryOtherQuestion09
				caseOutput.QueryOtherQuestion10=lQueryOtherQuestion10
				if(!lMapQueryQuestion.Result){
					return lreturn
				}
				Map lMapInsuredEdit=this.inputInsuredEdit(lInsuredEdit,lInsuredGenderAndMaritalStatus,lInsuredBirthDate)
				if(!lMapInsuredEdit.Result){
					lInsuredEdit=''
					lInsuredGenderAndMaritalStatus=''
					lInsuredBirthDate=''
					lInsuredDetail=''
				}else{
					lInsuredEdit=lMapInsuredEdit.InsuredEdit
					lInsuredGenderAndMaritalStatus=lMapInsuredEdit.InsuredGenderAndMaritalStatus
					lInsuredBirthDate=lMapInsuredEdit.InsuredBirthDate
					lInsuredDetail=lMapInsuredEdit.InsuredDetail
				}
				caseOutput.InsuredEdit=lInsuredEdit
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				caseOutput.InsuredBirthDate=lInsuredBirthDate
				caseOutput.InsuredDetail=lInsuredDetail
				if(!lMapInsuredEdit.Result){
					return lreturn
				}
				Map lMapNationalityThai=this.inputNationality(lNationalityThai,lNationalityThaiId,lNationalityPassportId,lNationalityPassportCountry)
				if(!lMapNationalityThai.Result){
					lNationalityThai=''
					lNationalityThaiId=''
					lNationalityPassportId=''
					lNationalityPassportCountry=''
				}else{
					lNationalityThai=lMapNationalityThai.NationalityThai
					lNationalityThaiId=lMapNationalityThai.NationalityThaiId
					lNationalityPassportId=lMapNationalityThai.NationalityPassportId
					lNationalityPassportCountry=lMapNationalityThai.NationalityPassportCountry
				}
				caseOutput.NationalityThai=lNationalityThai
				caseOutput.NationalityThaiId=lNationalityThaiId
				caseOutput.NationalityPassportId=lNationalityPassportId
				caseOutput.NationalityPassportCountry=lNationalityPassportCountry
				if(!lMapNationalityThai.Result){
					return lreturn
				}
				Map lMapHolderFirstName=this.inputHolderFirstName(lHolderFirstName)
				if(!lMapHolderFirstName.Result){
					lHolderFirstName=''
				}else{
					lHolderFirstName=lMapHolderFirstName.HolderFirstName
				}
				caseOutput.HolderFirstName=lHolderFirstName
				if(lHolderFirstName.length()<=0){
					return lreturn
				}
				Map lMapHolderLastName=this.inputHolderLastName(lHolderLastName)
				if(!lMapHolderLastName.Result){
					lHolderLastName=''
				}else{
					lHolderLastName=lMapHolderLastName.HolderLastName
				}
				caseOutput.HolderLastName=lHolderLastName
				if(lHolderLastName.length()<=0){
					return lreturn
				}
				Map lMapPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartOffsetDay)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartOffsetDay=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartOffsetDay=lMapPolicyStartDate.PolicyStartOffsetDay
				}
				caseOutput.PolicyStartDate=lPolicyStartDate
				caseOutput.PolicyStartOffsetDay=lPolicyStartOffsetDay
				if(!lMapPolicyStartDate.Result){
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
				Map lMapAddressSubdistrict=this.inputAddressSubdistrict(lAddressSubdistrict)
				if(!lMapAddressSubdistrict.Result){
					lAddressSubdistrict=''
				}else{
					lAddressSubdistrict=lMapAddressSubdistrict.AddressSubdistrict
				}
				caseOutput.AddressSubdistrict=lAddressSubdistrict
				if(lAddressSubdistrict.length()<=0){
					return lreturn
				}
				Map lMapAddressRoad=this.inputAddressRoad(lAddressRoad)
				if(!lMapAddressRoad.Result){
					lAddressRoad=''
				}else{
					lAddressRoad=lMapAddressRoad.AddressRoad
				}
				caseOutput.AddressRoad=lAddressRoad
				if(lAddressRoad.length()<=0){
					return lreturn
				}
				Map lMapAddressBuildingName=this.inputAddressBuildingName(lAddressBuildingName)
				if(!lMapAddressBuildingName.Result){
					lAddressBuildingName=''
				}else{
					lAddressBuildingName=lMapAddressBuildingName.AddressBuildingName
				}
				caseOutput.AddressBuildingName=lAddressBuildingName
				if(lAddressBuildingName.length()<=0){
					return lreturn
				}
				Map lMapAddressBuildingNumber=this.inputAddressBuildingNumber(lAddressBuildingNumber)
				if(!lMapAddressBuildingNumber.Result){
					lAddressBuildingNumber=''
				}else{
					lAddressBuildingNumber=lMapAddressBuildingNumber.AddressBuildingNumber
				}
				caseOutput.AddressBuildingNumber=lAddressBuildingNumber
				if(lAddressBuildingNumber.length()<=0){
					return lreturn
				}
				Map lMapLegalHeir=this.inputLegalHeir(lLegalHeir)
				if(!lMapLegalHeir.Result){
					lLegalHeir=''
				}else{
					lLegalHeir=lMapLegalHeir.LegalHeir
				}
				caseOutput.LegalHeir=lLegalHeir
				if(lLegalHeir.length()<=0){
					return lreturn
				}
				Boolean lIsLegalHeir=IGNUemaHelper.convertStringToBoolean(lLegalHeir)
				if(!lIsLegalHeir){
					Map lMapBeneficiaryAdd=this.inputBeneficiaryAdd(lBeneficiary1Add,lBeneficiary1FirstName,lBeneficiary1LastName,lBeneficiary1Relationship,lBeneficiary1Percentage,lBeneficiary2Add,lBeneficiary2FirstName,lBeneficiary2LastName,lBeneficiary2Relationship,lBeneficiary2Percentage,lBeneficiary3Add,lBeneficiary3FirstName,lBeneficiary3LastName,lBeneficiary3Relationship,lBeneficiary3Percentage)
					if(!lMapBeneficiaryAdd.Result){
						lBeneficiary1Add=''
						lBeneficiary1FirstName=''
						lBeneficiary1LastName=''
						lBeneficiary1Relationship=''
						lBeneficiary1Percentage=''
						lBeneficiary2Add=''
						lBeneficiary2FirstName=''
						lBeneficiary2LastName=''
						lBeneficiary2Relationship=''
						lBeneficiary2Percentage=''
						lBeneficiary3Add=''
						lBeneficiary3FirstName=''
						lBeneficiary3LastName=''
						lBeneficiary3Relationship=''
						lBeneficiary3Percentage=''
						lAdditionBeneficiaryDetail=''
					}else{
						lBeneficiary1Add=lMapBeneficiaryAdd.Beneficiary1Add
						lBeneficiary1FirstName=lMapBeneficiaryAdd.Beneficiary1FirstName
						lBeneficiary1LastName=lMapBeneficiaryAdd.Beneficiary1LastName
						lBeneficiary1Relationship=lMapBeneficiaryAdd.Beneficiary1Relationship
						lBeneficiary1Percentage=lMapBeneficiaryAdd.Beneficiary1Percentage
						lBeneficiary2Add=lMapBeneficiaryAdd.Beneficiary2Add
						lBeneficiary2FirstName=lMapBeneficiaryAdd.Beneficiary2FirstName
						lBeneficiary2LastName=lMapBeneficiaryAdd.Beneficiary2LastName
						lBeneficiary2Relationship=lMapBeneficiaryAdd.Beneficiary2Relationship
						lBeneficiary2Percentage=lMapBeneficiaryAdd.Beneficiary2Percentage
						lBeneficiary3Add=lMapBeneficiaryAdd.Beneficiary3Add
						lBeneficiary3FirstName=lMapBeneficiaryAdd.Beneficiary3FirstName
						lBeneficiary3LastName=lMapBeneficiaryAdd.Beneficiary3LastName
						lBeneficiary3Relationship=lMapBeneficiaryAdd.Beneficiary3Relationship
						lBeneficiary3Percentage=lMapBeneficiaryAdd.Beneficiary3Percentage
						lAdditionBeneficiaryDetail=lMapBeneficiaryAdd.AdditionBeneficiaryDetail
					}
					caseOutput.Beneficiary1Add=lBeneficiary1Add
					caseOutput.Beneficiary1FirstName=lBeneficiary1FirstName
					caseOutput.Beneficiary1LastName=lBeneficiary1LastName
					caseOutput.Beneficiary1Relationship=lBeneficiary1Relationship
					caseOutput.Beneficiary1Percentage=lBeneficiary1Percentage
					caseOutput.Beneficiary2Add=lBeneficiary2Add
					caseOutput.Beneficiary2FirstName=lBeneficiary2FirstName
					caseOutput.Beneficiary2LastName=lBeneficiary2LastName
					caseOutput.Beneficiary2Relationship=lBeneficiary2Relationship
					caseOutput.Beneficiary2Percentage=lBeneficiary2Percentage
					caseOutput.Beneficiary3Add=lBeneficiary3Add
					caseOutput.Beneficiary3FirstName=lBeneficiary3FirstName
					caseOutput.Beneficiary3LastName=lBeneficiary3LastName
					caseOutput.Beneficiary3Relationship=lBeneficiary3Relationship
					caseOutput.Beneficiary3Percentage=lBeneficiary3Percentage
					caseOutput.AdditionBeneficiaryDetail=lAdditionBeneficiaryDetail
					if(!lMapBeneficiaryAdd.Result){
						return lreturn
					}
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,THARGPAPersonalAccidentCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				caseOutput.ActualResult=lActualResult
				caseOutput.OpportunityNumber=lOpportunityNumber
				THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=THAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER
				Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
				if(lIsActualResult){
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
					Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
					if(lIsSalesforceProceedTodo){
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAPersonalAccidentCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						}
						lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
						lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
						caseOutput.ActualResult=lActualResult
					}
				}
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
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
			lPositiveCase=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_POSITIVE_CASE
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			Map lMapLanguage=this.lTHAPersonalAccidentQuotationDetail1Util.inputLanguage(lLanguage)
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
	public Map inputSubmitCallMeBack(String strSubmitCallMeBack,String strCallMeBackEmail,String strCallMeBackMobile){
		Map lreturn=[:]
		String lSubmitCallMeBack=strSubmitCallMeBack.trim()
		if(lSubmitCallMeBack.length()<=0){
			lSubmitCallMeBack=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_SUBMIT_CALL_ME_BACK
		}
		String lCallMeBackEmail=strCallMeBackEmail.trim()
		if(lCallMeBackEmail.length()<=0){
			lCallMeBackEmail=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_CALL_ME_BACK_EMAIL
		}
		String lCallMeBackMobile=strCallMeBackMobile.trim()
		if(lCallMeBackMobile.length()<=0){
			lCallMeBackMobile=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_CALL_ME_BACK_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			Map lMapSubmitCallMeBack=this.lTHAPersonalAccidentQuotationDetail1Util.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			lResult=lMapSubmitCallMeBack.Result
			if(lResult){
				lreturn.put('SubmitCallMeBack',lSubmitCallMeBack)
				lreturn.put('CallMeBackMobile',lCallMeBackMobile)
				lreturn.put('CallMeBackEmail',lCallMeBackEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderEmail(String strHolderEmail,String strHolderNewsletter){
		Map lreturn=[:]
		String lHolderEmail=strHolderEmail.trim()
		if(lHolderEmail.length()<=0){
			lHolderEmail=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_EMAIL
		}
		String lHolderNewsletter=strHolderNewsletter.trim()
		if(lHolderNewsletter.length()<=0){
			lHolderNewsletter=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			Map lMapHolderEmail=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderEmail(lHolderEmail,lHolderNewsletter)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
				lHolderNewsletter=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
				lHolderNewsletter=lMapHolderEmail.HolderNewsletter
			}
			lResult=lMapHolderEmail.Result
			if(lResult){
				lreturn.put('HolderEmail',lHolderEmail)
				lreturn.put('HolderNewsletter',lHolderNewsletter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderPhoneNo(String strHolderPhoneNo){
		Map lreturn=[:]
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		if(lHolderPhoneNo.length()<=0){
			lHolderPhoneNo=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			Map lMapHolderPhoneNo=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			lResult=lHolderPhoneNo.length()>0
			if(lResult){
				lreturn.put('HolderPhoneNo',lHolderPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCallMeNowToDo(String strHolderCallMeNowToDo){
		Map lreturn=[:]
		String lHolderCallMeNowToDo=strHolderCallMeNowToDo.trim()
		if(lHolderCallMeNowToDo.length()<=0){
			lHolderCallMeNowToDo=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			Map lMapHolderCallMeNowToDo=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			lResult=lHolderCallMeNowToDo.length()>0
			if(lResult){
				lreturn.put('HolderCallMeNowToDo',lHolderCallMeNowToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCallMeNow(String strHolderCallMeNow){
		Map lreturn=[:]
		String lHolderCallMeNow=strHolderCallMeNow.toUpperCase().trim()
		if(lHolderCallMeNow.length()<=0){
			lHolderCallMeNow=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW.toUpperCase()
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNow','')
			lreturn.put('Result',lResult)
			Map lMapHolderCallMeNow=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderCallMeNow(lHolderCallMeNow)
			if(!lMapHolderCallMeNow.Result){
				lHolderCallMeNow=''
			}else{
				lHolderCallMeNow=lMapHolderCallMeNow.HolderCallMeNow
			}
			lResult=lHolderCallMeNow.length()>0
			if(lResult){
				lreturn.put('HolderCallMeNow',lHolderCallMeNow)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputQueryQuestion(String strQueryPersonalAccidentInsurance,String strQueryInsuredDeniedCoverage,String strQueryAccidentOrInjury,String strQueryReceivedMedicalTreatment,String strQueryHypertensionBloodPositive,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10){
		Map lreturn=[:]
		String lQueryPersonalAccidentInsurance=strQueryPersonalAccidentInsurance.trim()
		if(lQueryPersonalAccidentInsurance.length()<=0){
			lQueryPersonalAccidentInsurance=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_PERSONAL_ACCIDENT_INSURANCE
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryAccidentOrInjury=strQueryAccidentOrInjury.trim()
		if(lQueryAccidentOrInjury.length()<=0){
			lQueryAccidentOrInjury=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_ACCIDENT_OR_INJURY
		}
		String lQueryReceivedMedicalTreatment=strQueryReceivedMedicalTreatment.trim()
		if(lQueryReceivedMedicalTreatment.length()<=0){
			lQueryReceivedMedicalTreatment=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_RECEIVED_MEDICAL_TREATMENT
		}
		String lQueryHypertensionBloodPositive=strQueryHypertensionBloodPositive.trim().toUpperCase().trim()
		if(lQueryHypertensionBloodPositive.length()<=0){
			lQueryHypertensionBloodPositive=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_HYPERTENSION_BLOOD_POSITIVE
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.trim().toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.trim().toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.trim().toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.trim().toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.trim().toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.trim().toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.trim().toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.trim().toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.trim().toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.trim().toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		try{
			Boolean lResult=false
			lreturn.put('QueryPersonalAccidentInsurance','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryAccidentOrInjury','')
			lreturn.put('QueryReceivedMedicalTreatment','')
			lreturn.put('QueryHypertensionBloodPositive','')
			lreturn.put('QueryOtherQuestion01','')
			lreturn.put('QueryOtherQuestion02','')
			lreturn.put('QueryOtherQuestion03','')
			lreturn.put('QueryOtherQuestion04','')
			lreturn.put('QueryOtherQuestion05','')
			lreturn.put('QueryOtherQuestion06','')
			lreturn.put('QueryOtherQuestion07','')
			lreturn.put('QueryOtherQuestion08','')
			lreturn.put('QueryOtherQuestion09','')
			lreturn.put('QueryOtherQuestion10','')
			lreturn.put('Result',lResult)
			Map lMapQueryQuestion=this.lTHAPersonalAccidentQuotationDetail1Util.inputQueryQuestion(lQueryPersonalAccidentInsurance,lQueryInsuredDeniedCoverage,lQueryAccidentOrInjury,lQueryReceivedMedicalTreatment,lQueryHypertensionBloodPositive,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10)
			if(!lMapQueryQuestion.Result){
				lQueryPersonalAccidentInsurance=''
				lQueryInsuredDeniedCoverage=''
				lQueryAccidentOrInjury=''
				lQueryReceivedMedicalTreatment=''
				lQueryHypertensionBloodPositive=''
				lQueryOtherQuestion01=''
				lQueryOtherQuestion02=''
				lQueryOtherQuestion03=''
				lQueryOtherQuestion04=''
				lQueryOtherQuestion05=''
				lQueryOtherQuestion06=''
				lQueryOtherQuestion07=''
				lQueryOtherQuestion08=''
				lQueryOtherQuestion09=''
				lQueryOtherQuestion10=''
			}else{
				lQueryPersonalAccidentInsurance=lMapQueryQuestion.QueryPersonalAccidentInsurance
				lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
				lQueryAccidentOrInjury=lMapQueryQuestion.QueryAccidentOrInjury
				lQueryReceivedMedicalTreatment=lMapQueryQuestion.QueryReceivedMedicalTreatment
				lQueryHypertensionBloodPositive=lMapQueryQuestion.QueryHypertensionBloodPositive
				lQueryOtherQuestion01=lMapQueryQuestion.QueryOtherQuestion01
				lQueryOtherQuestion02=lMapQueryQuestion.QueryOtherQuestion02
				lQueryOtherQuestion03=lMapQueryQuestion.QueryOtherQuestion03
				lQueryOtherQuestion04=lMapQueryQuestion.QueryOtherQuestion04
				lQueryOtherQuestion05=lMapQueryQuestion.QueryOtherQuestion05
				lQueryOtherQuestion06=lMapQueryQuestion.QueryOtherQuestion06
				lQueryOtherQuestion07=lMapQueryQuestion.QueryOtherQuestion07
				lQueryOtherQuestion08=lMapQueryQuestion.QueryOtherQuestion08
				lQueryOtherQuestion09=lMapQueryQuestion.QueryOtherQuestion09
				lQueryOtherQuestion10=lMapQueryQuestion.QueryOtherQuestion10
			}
			lResult=lMapQueryQuestion.Result
			if(lResult){
				lreturn.put('QueryPersonalAccidentInsurance',lQueryPersonalAccidentInsurance)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryAccidentOrInjury',lQueryAccidentOrInjury)
				lreturn.put('QueryReceivedMedicalTreatment',lQueryReceivedMedicalTreatment)
				lreturn.put('QueryHypertensionBloodPositive',lQueryHypertensionBloodPositive)
				lreturn.put('QueryOtherQuestion01',lQueryOtherQuestion01)
				lreturn.put('QueryOtherQuestion02',lQueryOtherQuestion02)
				lreturn.put('QueryOtherQuestion03',lQueryOtherQuestion03)
				lreturn.put('QueryOtherQuestion04',lQueryOtherQuestion04)
				lreturn.put('QueryOtherQuestion05',lQueryOtherQuestion05)
				lreturn.put('QueryOtherQuestion06',lQueryOtherQuestion06)
				lreturn.put('QueryOtherQuestion07',lQueryOtherQuestion07)
				lreturn.put('QueryOtherQuestion08',lQueryOtherQuestion08)
				lreturn.put('QueryOtherQuestion09',lQueryOtherQuestion09)
				lreturn.put('QueryOtherQuestion10',lQueryOtherQuestion10)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredEdit(String strInsuredEdit,String strInsuredGenderAndMaritalStatus,String strInsuredBirthDate){
		Map lreturn=[:]
		String lInsuredEdit=strInsuredEdit.trim()
		if(lInsuredEdit.length()<=0){
			lInsuredEdit=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_INSURED_EDIT
		}
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.toUpperCase().trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		String lInsuredBirthDate=strInsuredBirthDate.trim()
		if(lInsuredBirthDate.length()<=0){
			lInsuredBirthDate=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_INSURED_BIRTH_DATE
		}
		String lInsuredDetail=''
		try{
			Boolean lResult=false
			lreturn.put('InsuredEdit','')
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('InsuredBirthDate','')
			lreturn.put('InsuredDetail','')
			lreturn.put('Result',lResult)
			Map lMapInsuredEdit=this.lTHAPersonalAccidentQuotationDetail1Util.inputInsuredEdit(lInsuredEdit,lInsuredGenderAndMaritalStatus,lInsuredBirthDate)
			if(!lMapInsuredEdit.Result){
				lInsuredEdit=''
				lInsuredGenderAndMaritalStatus=''
				lInsuredBirthDate=''
				lInsuredDetail=''
			}else{
				lInsuredEdit=lMapInsuredEdit.InsuredEdit
				lInsuredGenderAndMaritalStatus=lMapInsuredEdit.InsuredGenderAndMaritalStatus
				lInsuredBirthDate=lMapInsuredEdit.InsuredBirthDate
				lInsuredDetail=lMapInsuredEdit.InsuredDetail
			}
			lResult=lMapInsuredEdit.Result
			if(lResult){
				lreturn.put('InsuredEdit',lInsuredEdit)
				lreturn.put('InsuredGenderAndMaritalStatus',lInsuredGenderAndMaritalStatus)
				lreturn.put('InsuredBirthDate',lInsuredBirthDate)
				lreturn.put('InsuredDetail',lInsuredDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputNationality(String strNationalityThai,String strNationalityThaiId,String strNationalityPassportId,String strNationalityPassportCountry){
		Map lreturn=[:]
		String lNationalityThai=strNationalityThai.toUpperCase().trim()
		if(lNationalityThai.length()<=0){
			lNationalityThai=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_NATIONALITY_THAI
		}
		String lNationalityThaiId=strNationalityThaiId.trim()
		if(lNationalityThaiId.length()<=0){
			lNationalityThaiId=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_NATIONALITY_THAI_ID
		}
		String lNationalityPassportId=strNationalityPassportId.trim()
		if(lNationalityPassportId.length()<=0){
			lNationalityPassportId=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_NATIONALITY_PASSPORT_ID
		}
		String lNationalityPassportCountry=strNationalityPassportCountry.trim()
		if(lNationalityPassportCountry.length()<=0){
			lNationalityPassportCountry=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_NATIONALITY_PASSPORT_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('NationalityThai','')
			lreturn.put('NationalityThaiId','')
			lreturn.put('NationalityPassportId','')
			lreturn.put('NationalityPassportCountry','')
			lreturn.put('Result',lResult)
			Map lMapNationality=this.lTHAPersonalAccidentQuotationDetail1Util.inputNationality(lNationalityThai,lNationalityThaiId,lNationalityPassportId,lNationalityPassportCountry)
			if(!lMapNationality.Result){
				lNationalityThai=''
				lNationalityThaiId=''
				lNationalityPassportId=''
				lNationalityPassportCountry=''
			}else{
				lNationalityThai=lMapNationality.NationalityThai
				lNationalityThaiId=lMapNationality.NationalityThaiId
				lNationalityPassportId=lMapNationality.NationalityPassportId
				lNationalityPassportCountry=lMapNationality.NationalityPassportCountry
			}
			lResult=lMapNationality.Result
			if(lResult){
				lreturn.put('NationalityThai',lNationalityThai)
				lreturn.put('NationalityThaiId',lNationalityThaiId)
				lreturn.put('NationalityPassportId',lNationalityPassportId)
				lreturn.put('NationalityPassportCountry',lNationalityPassportCountry)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderFirstName(String strHolderFirstName){
		Map lreturn=[:]
		String lHolderFirstName=strHolderFirstName.trim()
		if(lHolderFirstName.length()<=0){
			lHolderFirstName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_FIRST_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderFirstName','')
			lreturn.put('Result',lResult)
			Map lMapHolderFirstName=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderFirstName(lHolderFirstName)
			if(!lMapHolderFirstName.Result){
				lHolderFirstName=''
			}else{
				lHolderFirstName=lMapHolderFirstName.HolderFirstName
			}
			lResult=lHolderFirstName.length()>0
			if(lResult){
				lreturn.put('HolderFirstName',lHolderFirstName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderLastName(String strHolderLastName){
		Map lreturn=[:]
		String lHolderLastName=strHolderLastName.trim()
		if(lHolderLastName.length()<=0){
			lHolderLastName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_HOLDER_LAST_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderLastName','')
			lreturn.put('Result',lResult)
			Map lMapHolderLastName=this.lTHAPersonalAccidentQuotationDetail1Util.inputHolderLastName(lHolderLastName)
			if(!lMapHolderLastName.Result){
				lHolderLastName=''
			}else{
				lHolderLastName=lMapHolderLastName.HolderLastName
			}
			lResult=lHolderLastName.length()>0
			if(lResult){
				lreturn.put('HolderLastName',lHolderLastName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyStartDate(String strPolicyStartDate,String strPolicyStartOffsetDay){
		Map lreturn=[:]
		String lPolicyStartDate=strPolicyStartDate.trim()
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_POLICY_START_DATE
		}
		String lPolicyStartOffsetDay=strPolicyStartOffsetDay.trim()
		if(lPolicyStartOffsetDay.length()<=0){
			lPolicyStartOffsetDay=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_POLICY_START_OFFSET_DAY
		}
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartOffsetDay','')
			lreturn.put('Result',lResult)
			Map lMapPolicyStartDate=this.lTHAPersonalAccidentQuotationDetail1Util.inputPolicyStartDate(lPolicyStartDate,lPolicyStartOffsetDay)
			if(!lMapPolicyStartDate.Result){
				lPolicyStartDate=''
				lPolicyStartOffsetDay=''
			}else{
				lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
				lPolicyStartOffsetDay=lMapPolicyStartDate.PolicyStartOffsetDay
			}
			lResult=lMapPolicyStartDate.Result
			if(lResult){
				lreturn.put('PolicyStartDate',lPolicyStartDate)
				lreturn.put('PolicyStartOffsetDay',lPolicyStartOffsetDay)
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
			lAddressPostalCode=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressPostalCode','')
			lreturn.put('Result',lResult)
			Map lMapAddressPostalCode=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressPostalCode(lAddressPostalCode)
			if(!lMapAddressPostalCode.Result){
				lAddressPostalCode=''
			}else{
				lAddressPostalCode=lMapAddressPostalCode.AddressPostalCode
			}
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
	public Map inputAddressProvince(String strAddressProvince){
		Map lreturn=[:]
		String lAddressProvince=strAddressProvince.trim()
		if(lAddressProvince.length()<=0){
			lAddressProvince=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressProvince','')
			lreturn.put('Result',lResult)
			Map lMapAddressProvince=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressProvince(lAddressProvince)
			if(!lMapAddressProvince.Result){
				lAddressProvince=''
			}else{
				lAddressProvince=lMapAddressProvince.AddressProvince
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
			lAddressDistrict=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_DISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressDistrict','')
			lreturn.put('Result',lResult)
			Map lMapAddressDistrict=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressDistrict(lAddressDistrict)
			if(!lMapAddressDistrict.Result){
				lAddressDistrict=''
			}else{
				lAddressDistrict=lMapAddressDistrict.AddressDistrict
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
	public Map inputAddressSubdistrict(String strAddressSubdistrict){
		Map lreturn=[:]
		String lAddressSubdistrict=strAddressSubdistrict.trim()
		if(lAddressSubdistrict.length()<=0){
			lAddressSubdistrict=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_SUBDISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressSubdistrict','')
			lreturn.put('Result',lResult)
			Map lMapAddressSubdistrict=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressSubdistrict(lAddressSubdistrict)
			if(!lMapAddressSubdistrict.Result){
				lAddressSubdistrict=''
			}else{
				lAddressSubdistrict=lMapAddressSubdistrict.AddressSubdistrict
			}
			lResult=lAddressSubdistrict.length()>0
			if(lResult){
				lreturn.put('AddressSubdistrict',lAddressSubdistrict)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressRoad(String strAddressRoad){
		Map lreturn=[:]
		String lAddressRoad=strAddressRoad.trim()
		if(lAddressRoad.length()<=0){
			lAddressRoad=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_ROAD
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressRoad','')
			lreturn.put('Result',lResult)
			Map lMapAddressRoad=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressRoad(lAddressRoad)
			if(!lMapAddressRoad.Result){
				lAddressRoad=''
			}else{
				lAddressRoad=lMapAddressRoad.AddressRoad
			}
			lResult=lAddressRoad.length()>0
			if(lResult){
				lreturn.put('AddressRoad',lAddressRoad)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressBuildingName(String strAddressBuildingName){
		Map lreturn=[:]
		String lAddressBuildingName=strAddressBuildingName.trim()
		if(lAddressBuildingName.length()<=0){
			lAddressBuildingName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_BUILDING_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressBuildingName','')
			lreturn.put('Result',lResult)
			Map lMapAddressBuildingName=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressBuildingName(lAddressBuildingName)
			if(!lMapAddressBuildingName.Result){
				lAddressBuildingName=''
			}else{
				lAddressBuildingName=lMapAddressBuildingName.AddressBuildingName
			}
			lResult=lAddressBuildingName.length()>0
			if(lResult){
				lreturn.put('AddressBuildingName',lAddressBuildingName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAddressBuildingNumber(String strAddressBuildingNumber){
		Map lreturn=[:]
		String lAddressBuildingNumber=strAddressBuildingNumber.trim()
		if(lAddressBuildingNumber.length()<=0){
			lAddressBuildingNumber=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_ADDRESS_BUILDING_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressBuildingNumber','')
			lreturn.put('Result',lResult)
			Map lMapAddressBuildingNumber=this.lTHAPersonalAccidentQuotationDetail1Util.inputAddressBuildingNumber(lAddressBuildingNumber)
			if(!lMapAddressBuildingNumber.Result){
				lAddressBuildingNumber=''
			}else{
				lAddressBuildingNumber=lMapAddressBuildingNumber.AddressBuildingNumber
			}
			lResult=lAddressBuildingNumber.length()>0
			if(lResult){
				lreturn.put('AddressBuildingNumber',lAddressBuildingNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLegalHeir(String strLegalHeir){
		Map lreturn=[:]
		String lLegalHeir=strLegalHeir.trim()
		if(lLegalHeir.length()<=0){
			lLegalHeir=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_LEGAL_HEIR
		}
		try{
			Boolean lResult=false
			lreturn.put('LegalHeir','')
			lreturn.put('Result',lResult)
			Map lMapLegalHeir=this.lTHAPersonalAccidentQuotationDetail1Util.inputLegalHeir(lLegalHeir)
			if(!lMapLegalHeir.Result){
				lLegalHeir=''
			}else{
				lLegalHeir=lMapLegalHeir.LegalHeir
			}
			lResult=lLegalHeir.length()>0
			if(lResult){
				lreturn.put('LegalHeir',lLegalHeir)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputBeneficiaryAdd(String strBeneficiary1Add,String strBeneficiary1FirstName,String strBeneficiary1LastName,String strBeneficiary1Relationship,String strBeneficiary1Percentage,String strBeneficiary2Add,String strBeneficiary2FirstName,String strBeneficiary2LastName,String strBeneficiary2Relationship,String strBeneficiary2Percentage,String strBeneficiary3Add,String strBeneficiary3FirstName,String strBeneficiary3LastName,String strBeneficiary3Relationship,String strBeneficiary3Percentage){
		Map lreturn=[:]
		String lBeneficiary1Add=strBeneficiary1Add.trim()
		if(lBeneficiary1Add.length()<=0){
			lBeneficiary1Add=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY1_ADD
		}
		String lBeneficiary1FirstName=strBeneficiary1FirstName.trim()
		if(lBeneficiary1FirstName.length()<=0){
			lBeneficiary1FirstName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY1_FIRST_NAME
		}
		String lBeneficiary1LastName=strBeneficiary1LastName.trim()
		if(lBeneficiary1LastName.length()<=0){
			lBeneficiary1LastName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY1_LAST_NAME
		}
		String lBeneficiary1Relationship=strBeneficiary1Relationship.trim()
		if(lBeneficiary1Relationship.length()<=0){
			lBeneficiary1Relationship=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY1_RELATIONSHIP
		}
		String lBeneficiary1Percentage=strBeneficiary1Percentage.trim()
		if(lBeneficiary1Percentage.length()<=0){
			lBeneficiary1Percentage=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY1_PERCENTAGE
		}
		String lBeneficiary2Add=strBeneficiary2Add.trim()
		if(lBeneficiary2Add.length()<=0){
			lBeneficiary2Add=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY2_ADD
		}
		String lBeneficiary2FirstName=strBeneficiary2FirstName.trim()
		if(lBeneficiary2FirstName.length()<=0){
			lBeneficiary2FirstName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY2_FIRST_NAME
		}
		String lBeneficiary2LastName=strBeneficiary2LastName.trim()
		if(lBeneficiary2LastName.length()<=0){
			lBeneficiary2LastName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY2_LAST_NAME
		}
		String lBeneficiary2Relationship=strBeneficiary2Relationship.trim()
		if(lBeneficiary2Relationship.length()<=0){
			lBeneficiary2Relationship=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY2_RELATIONSHIP
		}
		String lBeneficiary2Percentage=strBeneficiary2Percentage.trim()
		if(lBeneficiary2Percentage.length()<=0){
			lBeneficiary2Percentage=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY2_PERCENTAGE
		}
		String lBeneficiary3Add=strBeneficiary3Add.trim()
		if(lBeneficiary3Add.length()<=0){
			lBeneficiary3Add=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY3_ADD
		}
		String lBeneficiary3FirstName=strBeneficiary3FirstName.trim()
		if(lBeneficiary3FirstName.length()<=0){
			lBeneficiary3FirstName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY3_FIRST_NAME
		}
		String lBeneficiary3LastName=strBeneficiary3LastName.trim()
		if(lBeneficiary3LastName.length()<=0){
			lBeneficiary3LastName=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY3_LAST_NAME
		}
		String lBeneficiary3Relationship=strBeneficiary3Relationship.trim()
		if(lBeneficiary3Relationship.length()<=0){
			lBeneficiary3Relationship=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY3_RELATIONSHIP
		}
		String lBeneficiary3Percentage=strBeneficiary3Percentage.trim()
		if(lBeneficiary3Percentage.length()<=0){
			lBeneficiary3Percentage=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_BENEFICIARY3_PERCENTAGE
		}
		String lAdditionBeneficiaryDetail=''
		try{
			Boolean lResult=false
			lreturn.put('Beneficiary1Add','')
			lreturn.put('Beneficiary1FirstName','')
			lreturn.put('Beneficiary1LastName','')
			lreturn.put('Beneficiary1Relationship','')
			lreturn.put('Beneficiary1Percentage','')
			lreturn.put('Beneficiary2Add','')
			lreturn.put('Beneficiary2FirstName','')
			lreturn.put('Beneficiary2LastName','')
			lreturn.put('Beneficiary2Relationship','')
			lreturn.put('Beneficiary2Percentage','')
			lreturn.put('Beneficiary3Add','')
			lreturn.put('Beneficiary3FirstName','')
			lreturn.put('Beneficiary3LastName','')
			lreturn.put('Beneficiary3Relationship','')
			lreturn.put('Beneficiary3Percentage','')
			lreturn.put('AdditionBeneficiaryDetail','')
			lreturn.put('Result',lResult)
			Map lMapBeneficiaryAdd=this.lTHAPersonalAccidentQuotationDetail1Util.inputBeneficiaryAdd(lBeneficiary1Add,lBeneficiary1FirstName,lBeneficiary1LastName,lBeneficiary1Relationship,lBeneficiary1Percentage,lBeneficiary2Add,lBeneficiary2FirstName,lBeneficiary2LastName,lBeneficiary2Relationship,lBeneficiary2Percentage,lBeneficiary3Add,lBeneficiary3FirstName,lBeneficiary3LastName,lBeneficiary3Relationship,lBeneficiary3Percentage)
			if(!lMapBeneficiaryAdd.Result){
				lBeneficiary1Add=''
				lBeneficiary1FirstName=''
				lBeneficiary1LastName=''
				lBeneficiary1Relationship=''
				lBeneficiary1Percentage=''
				lBeneficiary2Add=''
				lBeneficiary2FirstName=''
				lBeneficiary2LastName=''
				lBeneficiary2Relationship=''
				lBeneficiary2Percentage=''
				lBeneficiary3Add=''
				lBeneficiary3FirstName=''
				lBeneficiary3LastName=''
				lBeneficiary3Relationship=''
				lBeneficiary3Percentage=''
				lAdditionBeneficiaryDetail=''
			}else{
				lBeneficiary1Add=lMapBeneficiaryAdd.Beneficiary1Add
				lBeneficiary1FirstName=lMapBeneficiaryAdd.Beneficiary1FirstName
				lBeneficiary1LastName=lMapBeneficiaryAdd.Beneficiary1LastName
				lBeneficiary1Relationship=lMapBeneficiaryAdd.Beneficiary1Relationship
				lBeneficiary1Percentage=lMapBeneficiaryAdd.Beneficiary1Percentage
				lBeneficiary2Add=lMapBeneficiaryAdd.Beneficiary2Add
				lBeneficiary2FirstName=lMapBeneficiaryAdd.Beneficiary2FirstName
				lBeneficiary2LastName=lMapBeneficiaryAdd.Beneficiary2LastName
				lBeneficiary2Relationship=lMapBeneficiaryAdd.Beneficiary2Relationship
				lBeneficiary2Percentage=lMapBeneficiaryAdd.Beneficiary2Percentage
				lBeneficiary3Add=lMapBeneficiaryAdd.Beneficiary3Add
				lBeneficiary3FirstName=lMapBeneficiaryAdd.Beneficiary3FirstName
				lBeneficiary3LastName=lMapBeneficiaryAdd.Beneficiary3LastName
				lBeneficiary3Relationship=lMapBeneficiaryAdd.Beneficiary3Relationship
				lBeneficiary3Percentage=lMapBeneficiaryAdd.Beneficiary3Percentage
				lAdditionBeneficiaryDetail=lMapBeneficiaryAdd.AdditionBeneficiaryDetail
			}
			lResult=lMapBeneficiaryAdd.Result
			if(lResult){
				lreturn.put('Beneficiary1Add',lBeneficiary1Add)
				lreturn.put('Beneficiary1FirstName',lBeneficiary1FirstName)
				lreturn.put('Beneficiary1LastName',lBeneficiary1LastName)
				lreturn.put('Beneficiary1Relationship',lBeneficiary1Relationship)
				lreturn.put('Beneficiary1Percentage',lBeneficiary1Percentage)
				lreturn.put('Beneficiary2Add',lBeneficiary2Add)
				lreturn.put('Beneficiary2FirstName',lBeneficiary2FirstName)
				lreturn.put('Beneficiary2LastName',lBeneficiary2LastName)
				lreturn.put('Beneficiary2Relationship',lBeneficiary2Relationship)
				lreturn.put('Beneficiary2Percentage',lBeneficiary2Percentage)
				lreturn.put('Beneficiary3Add',lBeneficiary3Add)
				lreturn.put('Beneficiary3FirstName',lBeneficiary3FirstName)
				lreturn.put('Beneficiary3LastName',lBeneficiary3LastName)
				lreturn.put('Beneficiary3Relationship',lBeneficiary3Relationship)
				lreturn.put('Beneficiary3Percentage',lBeneficiary3Percentage)
				lreturn.put('AdditionBeneficiaryDetail',lAdditionBeneficiaryDetail)
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
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			Map lMapPolicyInsurer=this.lTHAPersonalAccidentQuotationDetail1Util.inputPolicyInsurer(lPolicyInsurer)
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THARGPAPersonalAccidentQuotationDetail1Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			Map lMapSalesforceProceedTodo=this.lTHAPersonalAccidentQuotationDetail1Util.inputSalesforceProceedTodo(lSalesforceProceedTodo)
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
	public Map inputActualResult(Boolean isPositiveCase,String strHolderPhoneNo,Boolean isSkipOTP){
		Map lreturn=[:]
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		String lActualResult=''
		String lOpportunityNumber=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			Map lMapActualResult=this.lTHAPersonalAccidentQuotationDetail1Util.inputActualResult(isPositiveCase,strHolderPhoneNo,isSkipOTP)
			if(!lMapActualResult.Result){
				lActualResult=''
				lOpportunityNumber=''
			}else{
				lActualResult=lMapActualResult.ActualResult
				lOpportunityNumber=lMapActualResult.OpportunityNumber
			}
			lResult=lMapActualResult.Result
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('OpportunityNumber',lOpportunityNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}