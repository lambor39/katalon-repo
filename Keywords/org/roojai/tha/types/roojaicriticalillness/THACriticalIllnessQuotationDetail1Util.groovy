package org.roojai.tha.types.roojaicriticalillness
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
public class THACriticalIllnessQuotationDetail1Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THACriticalIllnessQuotationDetail1Util(WebDriver newDriver,WebDriver newSelenium){
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
		String lQueryHealthCondition=caseInput.QueryHealthCondition.toString().trim()
		String lQueryInsuredDeniedCoverage=caseInput.QueryInsuredDeniedCoverage.toString().trim()
		String lQueryDiedFromCriticalIllnesses=caseInput.QueryDiedFromCriticalIllnesses.toString().trim()
		String lQueryIndustry=caseInput.QueryIndustry.toString().trim()
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
		String lQueryHospitalIncomeBenefitQuestion01=caseInput.QueryHospitalIncomeBenefitQuestion01.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion02=caseInput.QueryHospitalIncomeBenefitQuestion02.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion03=caseInput.QueryHospitalIncomeBenefitQuestion03.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion04=caseInput.QueryHospitalIncomeBenefitQuestion04.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion05=caseInput.QueryHospitalIncomeBenefitQuestion05.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion06=caseInput.QueryHospitalIncomeBenefitQuestion06.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion07=caseInput.QueryHospitalIncomeBenefitQuestion07.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion08=caseInput.QueryHospitalIncomeBenefitQuestion08.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion09=caseInput.QueryHospitalIncomeBenefitQuestion09.toString().trim()
		String lQueryHospitalIncomeBenefitQuestion10=caseInput.QueryHospitalIncomeBenefitQuestion10.toString().trim()
		String lInsuredEdit=caseInput.InsuredEdit.toString().trim()
		String lInsuredGenderAndMaritalStatus=caseInput.InsuredGenderAndMaritalStatus.toString().trim()
		String lInsuredBirthDateMain=caseInput.InsuredBirthDateMain.toString().trim()
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
				Map lMapInsuredEdit=this.inputInsuredEdit(lInsuredEdit,lInsuredGenderAndMaritalStatus,lInsuredBirthDateMain)
				if(!lMapInsuredEdit.Result){
					lInsuredEdit=''
					lInsuredGenderAndMaritalStatus=''
					lInsuredBirthDateMain=''
					lInsuredDetail=''
				}else{
					lInsuredEdit=lMapInsuredEdit.InsuredEdit
					lInsuredGenderAndMaritalStatus=lMapInsuredEdit.InsuredGenderAndMaritalStatus
					lInsuredBirthDateMain=lMapInsuredEdit.InsuredBirthDateMain
					lInsuredDetail=lMapInsuredEdit.InsuredDetail
				}
				caseOutput.InsuredEdit=lInsuredEdit
				caseOutput.InsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatus
				caseOutput.InsuredBirthDateMain=lInsuredBirthDateMain
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
				Map lMapQueryQuestion=this.inputQueryQuestion(lQueryHealthCondition,lQueryInsuredDeniedCoverage,lQueryDiedFromCriticalIllnesses,lQueryIndustry,lQueryOtherQuestion01,lQueryOtherQuestion02,lQueryOtherQuestion03,lQueryOtherQuestion04,lQueryOtherQuestion05,lQueryOtherQuestion06,lQueryOtherQuestion07,lQueryOtherQuestion08,lQueryOtherQuestion09,lQueryOtherQuestion10,lQueryHospitalIncomeBenefitQuestion01,lQueryHospitalIncomeBenefitQuestion02,lQueryHospitalIncomeBenefitQuestion03,lQueryHospitalIncomeBenefitQuestion04,lQueryHospitalIncomeBenefitQuestion05,lQueryHospitalIncomeBenefitQuestion06,lQueryHospitalIncomeBenefitQuestion07,lQueryHospitalIncomeBenefitQuestion08,lQueryHospitalIncomeBenefitQuestion09,lQueryHospitalIncomeBenefitQuestion10)
				if(!lMapQueryQuestion.Result){
					lQueryHealthCondition=''
					lQueryInsuredDeniedCoverage=''
					lQueryDiedFromCriticalIllnesses=''
					lQueryIndustry=''
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
					lQueryHospitalIncomeBenefitQuestion01=''
					lQueryHospitalIncomeBenefitQuestion02=''
					lQueryHospitalIncomeBenefitQuestion03=''
					lQueryHospitalIncomeBenefitQuestion04=''
					lQueryHospitalIncomeBenefitQuestion05=''
					lQueryHospitalIncomeBenefitQuestion06=''
					lQueryHospitalIncomeBenefitQuestion07=''
					lQueryHospitalIncomeBenefitQuestion08=''
					lQueryHospitalIncomeBenefitQuestion09=''
					lQueryHospitalIncomeBenefitQuestion10=''
				}else{
					lQueryHealthCondition=lMapQueryQuestion.QueryHealthCondition
					lQueryInsuredDeniedCoverage=lMapQueryQuestion.QueryInsuredDeniedCoverage
					lQueryDiedFromCriticalIllnesses=lMapQueryQuestion.QueryDiedFromCriticalIllnesses
					lQueryIndustry=lMapQueryQuestion.QueryIndustry
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
					lQueryHospitalIncomeBenefitQuestion01=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion01
					lQueryHospitalIncomeBenefitQuestion02=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion02
					lQueryHospitalIncomeBenefitQuestion03=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion03
					lQueryHospitalIncomeBenefitQuestion04=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion04
					lQueryHospitalIncomeBenefitQuestion05=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion05
					lQueryHospitalIncomeBenefitQuestion06=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion06
					lQueryHospitalIncomeBenefitQuestion07=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion07
					lQueryHospitalIncomeBenefitQuestion08=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion08
					lQueryHospitalIncomeBenefitQuestion09=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion09
					lQueryHospitalIncomeBenefitQuestion10=lMapQueryQuestion.QueryHospitalIncomeBenefitQuestion10
				}
				caseOutput.QueryHealthCondition=lQueryHealthCondition
				caseOutput.QueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverage
				caseOutput.QueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnesses
				caseOutput.QueryIndustry=lQueryIndustry
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
				caseOutput.QueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01
				caseOutput.QueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02
				caseOutput.QueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03
				caseOutput.QueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04
				caseOutput.QueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05
				caseOutput.QueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06
				caseOutput.QueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07
				caseOutput.QueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08
				caseOutput.QueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09
				caseOutput.QueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10
				if(!lMapQueryQuestion.Result){
					return lreturn
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
						Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
						if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
							lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER,caseOutput)
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
			lPositiveCase=THACriticalIllnessQuotationDetail1Type.DEFAULT_POSITIVE_CASE
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
	public Boolean waitUntilOpportunityNumberUpdated(){
		Boolean lreturn=false
		try{
			String lOpportunityNumber=''
			String lOpportunityNumberNew=''
			String lOpportunityNumberOld=THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.trim()
			String lTagOpportunityNumberNew='qotation-no'
			String lLocatorOpportunityNumberNew=IGNUemaHelper.getTagDataSeleniumKey(lTagOpportunityNumberNew)
			for(Integer lIndex=1;lIndex<=10;lIndex++){
				WebElement lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
				if(lElementOpportunityNumberNew){
					lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
					lOpportunityNumberNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOpportunityNumberNew).trim()
					if(lOpportunityNumberNew.length()>0){
						if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumberNew)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndex)
					}
				}else{
					IGNUemaHelper.delayThreadSecond(lIndex)
				}
			}
			lOpportunityNumber=lOpportunityNumberNew
			if(lOpportunityNumber.length()>0){
				lreturn=true
				THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER=lOpportunityNumber
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagLoadingForm='loading'
			String lLocatorLoadingForm=IGNUemaHelper.getTagDataSeleniumKey(lTagLoadingForm)
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			}
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
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
			lLanguage=THACriticalIllnessQuotationDetail1Type.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				if(lLanguageItem.length()<=0){
					lLanguageItem=lLanguageList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
				}
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
			lSubmitCallMeBack=THACriticalIllnessQuotationDetail1Type.DEFAULT_SUBMIT_CALL_ME_BACK
		}
		String lCallMeBackEmail=strCallMeBackEmail.trim()
		if(lCallMeBackEmail.length()<=0){
			lCallMeBackEmail=THACriticalIllnessQuotationDetail1Type.DEFAULT_CALL_ME_BACK_EMAIL
		}
		String lCallMeBackMobile=strCallMeBackMobile.trim()
		if(lCallMeBackMobile.length()<=0){
			lCallMeBackMobile=THACriticalIllnessQuotationDetail1Type.DEFAULT_CALL_ME_BACK_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			Boolean lIsSubmitCallMeBack=IGNUemaHelper.convertStringToBoolean(lSubmitCallMeBack)
			String lCallMeBackEmailText=lCallMeBackEmail
			String lCallMeBackMobileText=lCallMeBackMobile
			lSubmitCallMeBack=''
			lCallMeBackEmail=''
			lCallMeBackMobile=''
			Boolean lIsOK=false
			String lTagSubmitCallMeBackOpenButton='a-callmeback-img'
			String lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
			WebElement lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			if(!lElementSubmitCallMeBackOpenButton){
				lTagSubmitCallMeBackOpenButton='a-callmeback-text'
				lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
				lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			}
			if(!lElementSubmitCallMeBackOpenButton){
				lIsSubmitCallMeBack=false
			}
			if(lIsSubmitCallMeBack){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackOpenButton)
				this.waitUntilLoaded()
				String lTagSubmitCallMeBackModalForm=''
				String lLocatorSubmitCallMeBackModalForm='#pd1-call-back-modal'
				Boolean lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackModalForm,10)
				lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackModalForm)
				if(!lIsSubmitCallMeBackModalFormDisplayed){
					lElementSubmitCallMeBackOpenButton=null
					lIsSubmitCallMeBack=false
				}
			}
			if(lIsSubmitCallMeBack){
				String lTagSubmitCallMeBackMobileInputText='callMeBack-mobile'
				String lLocatoSubmitCallMeBackMobileInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackMobileInputText)
				WebElement lElementSubmitCallMeBackMobileInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackMobileInputText)
				if(lElementSubmitCallMeBackMobileInputText){
					lCallMeBackMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementSubmitCallMeBackMobileInputText,lCallMeBackMobileText)
				}
				String lTagCheckboxCallMeBackConsent='pd1-call-back-modal-userAcceptConsent'
				String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
				WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
				if(lElementCheckboxCallMeBackConsent){
					String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
					Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
					if(!lIsCheckboxCallMeBackConsentStage){
						IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
					}
				}
				String lTagSubmitCallMeBackModalFormSubmitButton='callmeback-submit'
				String lLocatoSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormSubmitButton)
				WebElement lElementSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormSubmitButton)
				if(lElementSubmitCallMeBackModalFormSubmitButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					this.waitUntilLoaded()
					String lTagSubmitCallMeBackSuccessForm=''
					String lLocatorSubmitCallMeBackSuccessForm='#response-call-back-modal'
					Boolean lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackSuccessForm,10)
					lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackSuccessForm)
					if(lIsSubmitCallMeBackSuccessFormDisplayed){
						String lTagSubmitCallMeBackSuccessFormDismissButton='response-callmeback-close'
						String lLocatoSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackSuccessFormDismissButton)
						WebElement lElementSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackSuccessFormDismissButton)
						if(lElementSubmitCallMeBackSuccessFormDismissButton){
							lIsOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubmitCallMeBackSuccessFormDismissButton)
							this.waitUntilLoaded()
						}
					}
				}
				String lTagSubmitCallMeBackModalFormCloseButton='callmeback-close'
				String lLocatoSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormCloseButton)
				WebElement lElementSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormCloseButton)
				if(lElementSubmitCallMeBackModalFormCloseButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					this.waitUntilLoaded()
				}
			}
			this.waitUntilOpportunityNumberUpdated()
			lSubmitCallMeBack=IGNUemaHelper.convertBooleanToYesNoString(lIsSubmitCallMeBack)
			if(!lElementSubmitCallMeBackOpenButton){
				lSubmitCallMeBack='No Option'
			}
			if(!lIsSubmitCallMeBack){
				lResult=lSubmitCallMeBack.length()>0
			}else{
				lResult=lIsOK
			}
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
			lHolderEmail=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_EMAIL
		}
		String lHolderNewsletter=strHolderNewsletter.trim()
		if(lHolderNewsletter.length()<=0){
			lHolderNewsletter=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			String lTagHolderEmailInput='email'
			String lLocatorHolderEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderEmailInput)
			WebElement lElementHolderEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderEmailInput)
			if(!lElementHolderEmailInput){
				lHolderEmail='No Option'
			}else{
				lHolderEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderEmailInput,lHolderEmail)
				Boolean lIsHolderNewsletter=IGNUemaHelper.convertStringToBoolean(lHolderNewsletter)
				String lTagButton='pd1-userAcceptConsent'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				String lStageStr=''
				Boolean lStageBool=false
				if(!lElementButton){
					lHolderNewsletter='No Option'
				}else{
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
					lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
					if(lStageBool){
						if(!lIsHolderNewsletter){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
						}
					}else{
						if(lIsHolderNewsletter){
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
						}
					}
					lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
					lHolderNewsletter=lStageStr
				}
				String lTagHolderEmailNext='email-next'
				String lLocatorHolderEmailNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderEmailNext)
				WebElement lElementHolderEmailNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderEmailNext)
				if(lElementHolderEmailNext){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementHolderEmailNext)
				}
			}
			this.waitUntilOpportunityNumberUpdated()
			lResult=lHolderEmail.length()>0
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
			lHolderPhoneNo=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			String lTagHolderPhoneNoInput='mobile'
			String lLocatorHolderPhoneNoInput=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderPhoneNoInput)
			WebElement lElementHolderPhoneNoInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderPhoneNoInput)
			if(!lElementHolderPhoneNoInput){
				lHolderPhoneNo='No Option'
			}else{
				lHolderPhoneNo=IGNUemaHelper.typeTextByWebElement(this.driver,lElementHolderPhoneNoInput,lHolderPhoneNo)
			}
			String lTagHolderPhoneNoNext='mobile-next'
			String lLocatorHolderPhoneNoNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderPhoneNoNext)
			WebElement lElementHolderPhoneNoNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderPhoneNoNext)
			if(lElementHolderPhoneNoNext){
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementHolderPhoneNoNext)
			}
			this.waitUntilOpportunityNumberUpdated()
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
			lHolderCallMeNowToDo=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			lHolderCallMeNowToDo=IGNUemaHelper.convertBooleanToString(lIsHolderCallMeNowToDo)
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
		String lHolderCallMeNow=strHolderCallMeNow
		if(lHolderCallMeNow.length()<=0){
			lHolderCallMeNow=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW.toUpperCase()
		}
		Map lHolderCallMeNowList=['1':'No','2':'Yes','3':'Later']
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNow','')
			lreturn.put('Result',lResult)
			String lHolderCallMeNowItem=lHolderCallMeNowList.get(lHolderCallMeNow)
			if(!lHolderCallMeNowItem){
				lHolderCallMeNowItem=lHolderCallMeNowList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW.toUpperCase())
			}
			lHolderCallMeNow=''
			String lTagCallMeNowButtonKey='callmebacknow'
			String lTagCallMeNowButtonValue=lHolderCallMeNowItem
			String lLocatorCallMeNowButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCallMeNowButtonKey,lTagCallMeNowButtonValue)
			WebElement lElementCallMeNowButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCallMeNowButtonKey,lTagCallMeNowButtonValue)
			if(!lElementCallMeNowButton){
				lHolderCallMeNowItem=lHolderCallMeNowList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW)
				lLocatorCallMeNowButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCallMeNowButtonKey,lHolderCallMeNowItem)
				lElementCallMeNowButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCallMeNowButtonKey,lHolderCallMeNowItem)
			}
			if(!lElementCallMeNowButton){
				lHolderCallMeNow='No Option'
			}else{
				Boolean lIsHolderCallMeNow=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowItem)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCallMeNowButton)
				if(lIsHolderCallMeNow){
					String lLocatorCallMeNowModalForm='#response-call-back-modal'
					Boolean lIsCallMeNowModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorCallMeNowModalForm,15)
					lIsCallMeNowModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorCallMeNowModalForm)
					String lTagCallMeNowButtonClose='response-callmeback-close'
					String lLocatorCallMeNowButtonClose=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeNowButtonClose)
					WebElement lElementCallMeNowButtonClose=null
					if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorCallMeNowButtonClose,15)){
						lElementCallMeNowButtonClose=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeNowButtonClose)
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCallMeNowButtonClose)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCallMeNowButtonClose)
					}
				}
				lHolderCallMeNow=lHolderCallMeNowItem
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
	public Map inputQueryQuestion(String strQueryHealthCondition,String strQueryInsuredDeniedCoverage,String strQueryDiedFromCriticalIllnesses,String strQueryIndustry,String strQueryOtherQuestion01,String strQueryOtherQuestion02,String strQueryOtherQuestion03,String strQueryOtherQuestion04,String strQueryOtherQuestion05,String strQueryOtherQuestion06,String strQueryOtherQuestion07,String strQueryOtherQuestion08,String strQueryOtherQuestion09,String strQueryOtherQuestion10,String strQueryHospitalIncomeBenefitQuestion01,String strQueryHospitalIncomeBenefitQuestion02,String strQueryHospitalIncomeBenefitQuestion03,String strQueryHospitalIncomeBenefitQuestion04,String strQueryHospitalIncomeBenefitQuestion05,String strQueryHospitalIncomeBenefitQuestion06,String strQueryHospitalIncomeBenefitQuestion07,String strQueryHospitalIncomeBenefitQuestion08,String strQueryHospitalIncomeBenefitQuestion09,String strQueryHospitalIncomeBenefitQuestion10){
		Map lreturn=[:]
		String lQueryHealthCondition=strQueryHealthCondition.toUpperCase().trim()
		if(lQueryHealthCondition.length()<=0){
			lQueryHealthCondition=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HEALTH_CONDITION
		}
		String lQueryInsuredDeniedCoverage=strQueryInsuredDeniedCoverage.toUpperCase().trim()
		if(lQueryInsuredDeniedCoverage.length()<=0){
			lQueryInsuredDeniedCoverage=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_INSURED_DENIED_COVERAGE
		}
		String lQueryDiedFromCriticalIllnesses=strQueryDiedFromCriticalIllnesses.toUpperCase().trim()
		if(lQueryDiedFromCriticalIllnesses.length()<=0){
			lQueryDiedFromCriticalIllnesses=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES
		}
		String lQueryIndustry=strQueryIndustry.toUpperCase().trim()
		if(lQueryIndustry.length()<=0){
			lQueryIndustry=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_INDUSTRY
		}
		String lQueryOtherQuestion01=strQueryOtherQuestion01.toUpperCase().trim()
		if(lQueryOtherQuestion01.length()<=0){
			lQueryOtherQuestion01=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_01
		}
		String lQueryOtherQuestion02=strQueryOtherQuestion02.toUpperCase().trim()
		if(lQueryOtherQuestion02.length()<=0){
			lQueryOtherQuestion02=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_02
		}
		String lQueryOtherQuestion03=strQueryOtherQuestion03.toUpperCase().trim()
		if(lQueryOtherQuestion03.length()<=0){
			lQueryOtherQuestion03=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_03
		}
		String lQueryOtherQuestion04=strQueryOtherQuestion04.toUpperCase().trim()
		if(lQueryOtherQuestion04.length()<=0){
			lQueryOtherQuestion04=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_04
		}
		String lQueryOtherQuestion05=strQueryOtherQuestion05.toUpperCase().trim()
		if(lQueryOtherQuestion05.length()<=0){
			lQueryOtherQuestion05=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_05
		}
		String lQueryOtherQuestion06=strQueryOtherQuestion06.toUpperCase().trim()
		if(lQueryOtherQuestion06.length()<=0){
			lQueryOtherQuestion06=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06
		}
		String lQueryOtherQuestion07=strQueryOtherQuestion07.toUpperCase().trim()
		if(lQueryOtherQuestion07.length()<=0){
			lQueryOtherQuestion07=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07
		}
		String lQueryOtherQuestion08=strQueryOtherQuestion08.toUpperCase().trim()
		if(lQueryOtherQuestion08.length()<=0){
			lQueryOtherQuestion08=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08
		}
		String lQueryOtherQuestion09=strQueryOtherQuestion09.toUpperCase().trim()
		if(lQueryOtherQuestion09.length()<=0){
			lQueryOtherQuestion09=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09
		}
		String lQueryOtherQuestion10=strQueryOtherQuestion10.toUpperCase().trim()
		if(lQueryOtherQuestion10.length()<=0){
			lQueryOtherQuestion10=THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10
		}
		String lQueryHospitalIncomeBenefitQuestion01=strQueryHospitalIncomeBenefitQuestion01.trim()
		if(lQueryHospitalIncomeBenefitQuestion01.length()<=0){
			lQueryHospitalIncomeBenefitQuestion01=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01
		}
		String lQueryHospitalIncomeBenefitQuestion02=strQueryHospitalIncomeBenefitQuestion02.trim()
		if(lQueryHospitalIncomeBenefitQuestion02.length()<=0){
			lQueryHospitalIncomeBenefitQuestion02=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02
		}
		String lQueryHospitalIncomeBenefitQuestion03=strQueryHospitalIncomeBenefitQuestion03.trim()
		if(lQueryHospitalIncomeBenefitQuestion03.length()<=0){
			lQueryHospitalIncomeBenefitQuestion03=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03
		}
		String lQueryHospitalIncomeBenefitQuestion04=strQueryHospitalIncomeBenefitQuestion04.trim()
		if(lQueryHospitalIncomeBenefitQuestion04.length()<=0){
			lQueryHospitalIncomeBenefitQuestion04=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04
		}
		String lQueryHospitalIncomeBenefitQuestion05=strQueryHospitalIncomeBenefitQuestion05.trim()
		if(lQueryHospitalIncomeBenefitQuestion05.length()<=0){
			lQueryHospitalIncomeBenefitQuestion05=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05
		}
		String lQueryHospitalIncomeBenefitQuestion06=strQueryHospitalIncomeBenefitQuestion06.trim()
		if(lQueryHospitalIncomeBenefitQuestion06.length()<=0){
			lQueryHospitalIncomeBenefitQuestion06=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06
		}
		String lQueryHospitalIncomeBenefitQuestion07=strQueryHospitalIncomeBenefitQuestion07.trim()
		if(lQueryHospitalIncomeBenefitQuestion07.length()<=0){
			lQueryHospitalIncomeBenefitQuestion07=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07
		}
		String lQueryHospitalIncomeBenefitQuestion08=strQueryHospitalIncomeBenefitQuestion08.trim()
		if(lQueryHospitalIncomeBenefitQuestion08.length()<=0){
			lQueryHospitalIncomeBenefitQuestion08=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08
		}
		String lQueryHospitalIncomeBenefitQuestion09=strQueryHospitalIncomeBenefitQuestion09.trim()
		if(lQueryHospitalIncomeBenefitQuestion09.length()<=0){
			lQueryHospitalIncomeBenefitQuestion09=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09
		}
		String lQueryHospitalIncomeBenefitQuestion10=strQueryHospitalIncomeBenefitQuestion10.trim()
		if(lQueryHospitalIncomeBenefitQuestion10.length()<=0){
			lQueryHospitalIncomeBenefitQuestion10=THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10
		}
		Map lQueryQuestionListAnswerTypeAnswerType1=['1':'0|Yes','2':'1|No']
		try{
			Boolean lResult=false
			lreturn.put('QueryHealthCondition','')
			lreturn.put('QueryInsuredDeniedCoverage','')
			lreturn.put('QueryDiedFromCriticalIllnesses','')
			lreturn.put('QueryIndustry','')
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
			lreturn.put('QueryHospitalIncomeBenefitQuestion01','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion02','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion03','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion04','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion05','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion06','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion07','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion08','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion09','')
			lreturn.put('QueryHospitalIncomeBenefitQuestion10','')
			lreturn.put('Result',lResult)
			String lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHealthCondition)
			if(!lQueryHealthConditionItem){
				lQueryHealthConditionItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_HEALTH_CONDITION.toUpperCase())
			}
			lQueryHealthCondition=''
			Boolean lIsQueryHealthCondition=IGNUemaHelper.checkStringContainString(lQueryHealthConditionItem,'YES')
			String lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryInsuredDeniedCoverage)
			if(!lQueryInsuredDeniedCoverageItem){
				lQueryInsuredDeniedCoverageItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_INSURED_DENIED_COVERAGE.toUpperCase())
			}
			lQueryInsuredDeniedCoverage=''
			Boolean lIsQueryInsuredDeniedCoverage=IGNUemaHelper.checkStringContainString(lQueryInsuredDeniedCoverageItem,'YES')
			String lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryDiedFromCriticalIllnesses)
			if(!lQueryDiedFromCriticalIllnessesItem){
				lQueryDiedFromCriticalIllnessesItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_DIED_FROM_CRITICAL_ILLNESSES.toUpperCase())
			}
			lQueryDiedFromCriticalIllnesses=''
			Boolean lIsQueryDiedFromCriticalIllnesses=IGNUemaHelper.checkStringContainString(lQueryDiedFromCriticalIllnessesItem,'YES')
			String lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryIndustry)
			if(!lQueryIndustryItem){
				lQueryIndustryItem=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_INDUSTRY.toUpperCase())
			}
			lQueryIndustry=''
			Boolean lIsQueryIndustry=IGNUemaHelper.checkStringContainString(lQueryIndustryItem,'YES')
			String lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion01)
			if(!lQueryOtherQuestion01Item){
				lQueryOtherQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_01.toUpperCase())
			}
			lQueryOtherQuestion01=''
			Boolean lIsQueryOtherQuestion01=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion01Item,'YES')
			String lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion02)
			if(!lQueryOtherQuestion02Item){
				lQueryOtherQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_02.toUpperCase())
			}
			lQueryOtherQuestion02=''
			Boolean lIsQueryOtherQuestion02=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion02Item,'YES')
			String lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion03)
			if(!lQueryOtherQuestion03Item){
				lQueryOtherQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_03.toUpperCase())
			}
			lQueryOtherQuestion03=''
			Boolean lIsQueryOtherQuestion03=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion03Item,'YES')
			String lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion04)
			if(!lQueryOtherQuestion04Item){
				lQueryOtherQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_04.toUpperCase())
			}
			lQueryOtherQuestion04=''
			Boolean lIsQueryOtherQuestion04=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion04Item,'YES')
			String lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion05)
			if(!lQueryOtherQuestion05Item){
				lQueryOtherQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_QUERY_OTHER_QUESTION_05.toUpperCase())
			}
			lQueryOtherQuestion05=''
			Boolean lIsQueryOtherQuestion05=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion05Item,'YES')
			String lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion06)
			if(!lQueryOtherQuestion06Item){
				lQueryOtherQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_06.toUpperCase())
			}
			lQueryOtherQuestion06=''
			Boolean lIsQueryOtherQuestion06=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion06Item,'YES')
			String lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion07)
			if(!lQueryOtherQuestion07Item){
				lQueryOtherQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_07.toUpperCase())
			}
			lQueryOtherQuestion07=''
			Boolean lIsQueryOtherQuestion07=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion07Item,'YES')
			String lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion08)
			if(!lQueryOtherQuestion08Item){
				lQueryOtherQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_08.toUpperCase())
			}
			lQueryOtherQuestion08=''
			Boolean lIsQueryOtherQuestion08=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion08Item,'YES')
			String lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion09)
			if(!lQueryOtherQuestion09Item){
				lQueryOtherQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_09.toUpperCase())
			}
			lQueryOtherQuestion09=''
			Boolean lIsQueryOtherQuestion09=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion09Item,'YES')
			String lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryOtherQuestion10)
			if(!lQueryOtherQuestion10Item){
				lQueryOtherQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationInputType.DEFAULT_QUERY_OTHER_QUESTION_10.toUpperCase())
			}
			lQueryOtherQuestion10=''
			Boolean lIsQueryOtherQuestion10=IGNUemaHelper.checkStringContainString(lQueryOtherQuestion10Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion01)
			if(!lQueryHospitalIncomeBenefitQuestion01Item){
				lQueryHospitalIncomeBenefitQuestion01Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_01.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion01=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion01Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion02)
			if(!lQueryHospitalIncomeBenefitQuestion02Item){
				lQueryHospitalIncomeBenefitQuestion02Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_02.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion02=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion02Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion03)
			if(!lQueryHospitalIncomeBenefitQuestion03Item){
				lQueryHospitalIncomeBenefitQuestion03Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_03.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion03=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion03Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion04)
			if(!lQueryHospitalIncomeBenefitQuestion04Item){
				lQueryHospitalIncomeBenefitQuestion04Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_04.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion04=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion04Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion05)
			if(!lQueryHospitalIncomeBenefitQuestion05Item){
				lQueryHospitalIncomeBenefitQuestion05Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_05.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion05=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion05Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion06)
			if(!lQueryHospitalIncomeBenefitQuestion06Item){
				lQueryHospitalIncomeBenefitQuestion06Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_06.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion06=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion06Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion07)
			if(!lQueryHospitalIncomeBenefitQuestion07Item){
				lQueryHospitalIncomeBenefitQuestion07Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_07.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion07=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion07Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion08)
			if(!lQueryHospitalIncomeBenefitQuestion08Item){
				lQueryHospitalIncomeBenefitQuestion08Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_08.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion08=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion08Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion09)
			if(!lQueryHospitalIncomeBenefitQuestion09Item){
				lQueryHospitalIncomeBenefitQuestion09Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_09.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion09=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion09Item,'YES')
			String lQueryHospitalIncomeBenefitQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(lQueryHospitalIncomeBenefitQuestion10)
			if(!lQueryHospitalIncomeBenefitQuestion10Item){
				lQueryHospitalIncomeBenefitQuestion10Item=lQueryQuestionListAnswerTypeAnswerType1.get(THACriticalIllnessQuotationResultType.DEFAULT_QUERY_HOSPITAL_INCOME_BENEFIT_QUESTION_10.toUpperCase())
			}
			lQueryHospitalIncomeBenefitQuestion10=''
			Boolean lIsQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.checkStringContainString(lQueryHospitalIncomeBenefitQuestion10Item,'YES')
			Boolean lIsDoneQueryAll=false
			Boolean lIsDoneQueryHealthCondition=false
			Boolean lIsDoneQueryInsuredDeniedCoverage=false
			Boolean lIsDoneQueryDiedFromCriticalIllnesses=false
			Boolean lIsDoneQueryIndustry=false
			Boolean lIsDoneQueryOtherQuestion01=false
			Boolean lIsDoneQueryOtherQuestion02=false
			Boolean lIsDoneQueryOtherQuestion03=false
			Boolean lIsDoneQueryOtherQuestion04=false
			Boolean lIsDoneQueryOtherQuestion05=false
			Boolean lIsDoneQueryOtherQuestion06=false
			Boolean lIsDoneQueryOtherQuestion07=false
			Boolean lIsDoneQueryOtherQuestion08=false
			Boolean lIsDoneQueryOtherQuestion09=false
			Boolean lIsDoneQueryOtherQuestion10=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion01=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion02=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion03=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion04=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion05=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion06=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion07=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion08=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion09=false
			Boolean lIsDoneQueryHospitalIncomeBenefitQuestion10=false
			String lTagQueryHealthConditionButtonKey='productQuestion-QCI002'
			String lTagQueryHealthConditionButtonValue=lQueryHealthConditionItem
			String lLocatorQueryHealthConditionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			WebElement lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
			String lTagQueryInsuredDeniedCoverageButtonKey='productQuestion-TMQ006'
			String lTagQueryInsuredDeniedCoverageButtonValue=lQueryInsuredDeniedCoverageItem
			String lLocatorQueryInsuredDeniedCoverageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			WebElement lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
			String lTagQueryDiedFromCriticalIllnessesButtonKey='productQuestion-QCI003'
			String lTagQueryDiedFromCriticalIllnessesButtonValue=lQueryDiedFromCriticalIllnessesItem
			String lLocatorQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			WebElement lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
			String lTagQueryIndustryButtonKey='productQuestion-RJQ001'
			String lTagQueryIndustryButtonValue=lQueryIndustryItem
			String lLocatorQueryIndustryButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
			WebElement lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
			String lTagQueryOtherQuestion01ButtonKey='productQuestion-RJCIQ020'
			String lTagQueryOtherQuestion01ButtonValue=lQueryOtherQuestion01Item
			String lLocatorQueryOtherQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			WebElement lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
			String lTagQueryOtherQuestion02ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion02ButtonValue=lQueryOtherQuestion02Item
			String lLocatorQueryOtherQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			WebElement lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
			String lTagQueryOtherQuestion03ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion03ButtonValue=lQueryOtherQuestion03Item
			String lLocatorQueryOtherQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			WebElement lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
			String lTagQueryOtherQuestion04ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion04ButtonValue=lQueryOtherQuestion04Item
			String lLocatorQueryOtherQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			WebElement lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
			String lTagQueryOtherQuestion05ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion05ButtonValue=lQueryOtherQuestion05Item
			String lLocatorQueryOtherQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			WebElement lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
			String lTagQueryOtherQuestion06ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion06ButtonValue=lQueryOtherQuestion06Item
			String lLocatorQueryOtherQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			WebElement lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
			String lTagQueryOtherQuestion07ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion07ButtonValue=lQueryOtherQuestion07Item
			String lLocatorQueryOtherQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			WebElement lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
			String lTagQueryOtherQuestion08ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion08ButtonValue=lQueryOtherQuestion08Item
			String lLocatorQueryOtherQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			WebElement lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
			String lTagQueryOtherQuestion09ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion09ButtonValue=lQueryOtherQuestion09Item
			String lLocatorQueryOtherQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			WebElement lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
			String lTagQueryOtherQuestion10ButtonKey='productQuestion-'
			String lTagQueryOtherQuestion10ButtonValue=lQueryOtherQuestion10Item
			String lLocatorQueryOtherQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			WebElement lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonKey='productQuestion-TMQ005'
			String lTagQueryHospitalIncomeBenefitQuestion01ButtonValue=lQueryHospitalIncomeBenefitQuestion01Item
			String lLocatorQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonKey='productQuestion-HIR01Q01'
			String lTagQueryHospitalIncomeBenefitQuestion02ButtonValue=lQueryHospitalIncomeBenefitQuestion02Item
			String lLocatorQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonKey='productQuestion-HIR01Q03'
			String lTagQueryHospitalIncomeBenefitQuestion03ButtonValue=lQueryHospitalIncomeBenefitQuestion03Item
			String lLocatorQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonKey='productQuestion-HIR01Q04'
			String lTagQueryHospitalIncomeBenefitQuestion04ButtonValue=lQueryHospitalIncomeBenefitQuestion04Item
			String lLocatorQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonKey='productQuestion-HIR01Q05'
			String lTagQueryHospitalIncomeBenefitQuestion05ButtonValue=lQueryHospitalIncomeBenefitQuestion05Item
			String lLocatorQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion06ButtonValue=lQueryHospitalIncomeBenefitQuestion06Item
			String lLocatorQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion07ButtonValue=lQueryHospitalIncomeBenefitQuestion07Item
			String lLocatorQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion08ButtonValue=lQueryHospitalIncomeBenefitQuestion08Item
			String lLocatorQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion09ButtonValue=lQueryHospitalIncomeBenefitQuestion09Item
			String lLocatorQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonKey='productQuestion-'
			String lTagQueryHospitalIncomeBenefitQuestion10ButtonValue=lQueryHospitalIncomeBenefitQuestion10Item
			String lLocatorQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			WebElement lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
			String lTagCheckPointNextButton='genderEdit'
			String lLocatorCheckPointNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckPointNextButton)
			WebElement lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
			if(lElementCheckPointNextButton){
				lQueryHealthCondition='No Option'
				lQueryInsuredDeniedCoverage='No Option'
				lQueryDiedFromCriticalIllnesses='No Option'
				lQueryIndustry='No Option'
				lQueryOtherQuestion01='No Option'
				lQueryOtherQuestion02='No Option'
				lQueryOtherQuestion03='No Option'
				lQueryOtherQuestion04='No Option'
				lQueryOtherQuestion05='No Option'
				lQueryOtherQuestion06='No Option'
				lQueryOtherQuestion07='No Option'
				lQueryOtherQuestion08='No Option'
				lQueryOtherQuestion09='No Option'
				lQueryOtherQuestion10='No Option'
				lQueryHospitalIncomeBenefitQuestion01='No Option'
				lQueryHospitalIncomeBenefitQuestion02='No Option'
				lQueryHospitalIncomeBenefitQuestion03='No Option'
				lQueryHospitalIncomeBenefitQuestion04='No Option'
				lQueryHospitalIncomeBenefitQuestion05='No Option'
				lQueryHospitalIncomeBenefitQuestion06='No Option'
				lQueryHospitalIncomeBenefitQuestion07='No Option'
				lQueryHospitalIncomeBenefitQuestion08='No Option'
				lQueryHospitalIncomeBenefitQuestion09='No Option'
				lQueryHospitalIncomeBenefitQuestion10='No Option'
				lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				if(!lElementQueryHealthConditionButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
				}
				if(lElementQueryHealthConditionButton){
					if(!lIsDoneQueryHealthCondition){
						lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
						if(lIsDoneQueryHealthCondition){
							lQueryHealthCondition=lQueryHealthConditionItem
							lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
						}
						if(lIsQueryHealthCondition){
							String lTagQueryHealthConditionButtonClose=''
							String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
								WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				if(!lElementQueryInsuredDeniedCoverageButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
				}
				if(lElementQueryInsuredDeniedCoverageButton){
					if(!lIsDoneQueryInsuredDeniedCoverage){
						lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
						if(lIsDoneQueryInsuredDeniedCoverage){
							lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
							lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
						}
						if(lIsQueryInsuredDeniedCoverage){
							String lTagQueryInsuredDeniedCoverageButtonClose=''
							String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
								WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				if(!lElementQueryDiedFromCriticalIllnessesButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
				}
				if(lElementQueryDiedFromCriticalIllnessesButton){
					if(!lIsDoneQueryDiedFromCriticalIllnesses){
						lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
						if(lIsDoneQueryDiedFromCriticalIllnesses){
							lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
							lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
						}
						if(lIsQueryDiedFromCriticalIllnesses){
							String lTagQueryDiedFromCriticalIllnessesButtonClose=''
							String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
								WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				if(!lElementQueryIndustryButton){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
				}
				if(lElementQueryIndustryButton){
					if(!lIsDoneQueryIndustry){
						lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
						if(lIsDoneQueryIndustry){
							lQueryIndustry=lQueryIndustryItem
							lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
						}
						if(lIsQueryIndustry){
							String lTagQueryIndustryButtonClose=''
							String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
								WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				if(!lElementQueryOtherQuestion01Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
				}
				if(lElementQueryOtherQuestion01Button){
					if(!lIsDoneQueryOtherQuestion01){
						lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
						if(lIsDoneQueryOtherQuestion01){
							lQueryOtherQuestion01=lQueryOtherQuestion01Item
							lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
						}
						if(lIsQueryOtherQuestion01){
							String lTagQueryOtherQuestion01ButtonClose=''
							String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
								WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				if(!lElementQueryOtherQuestion02Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
				}
				if(lElementQueryOtherQuestion02Button){
					if(!lIsDoneQueryOtherQuestion02){
						lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
						if(lIsDoneQueryOtherQuestion02){
							lQueryOtherQuestion02=lQueryOtherQuestion02Item
							lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
						}
						if(lIsQueryOtherQuestion02){
							String lTagQueryOtherQuestion02ButtonClose=''
							String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
								WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				if(!lElementQueryOtherQuestion03Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
				}
				if(lElementQueryOtherQuestion03Button){
					if(!lIsDoneQueryOtherQuestion03){
						lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
						if(lIsDoneQueryOtherQuestion03){
							lQueryOtherQuestion03=lQueryOtherQuestion03Item
							lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
						}
						if(lIsQueryOtherQuestion03){
							String lTagQueryOtherQuestion03ButtonClose=''
							String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
								WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				if(!lElementQueryOtherQuestion04Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
				}
				if(lElementQueryOtherQuestion04Button){
					if(!lIsDoneQueryOtherQuestion04){
						lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
						if(lIsDoneQueryOtherQuestion04){
							lQueryOtherQuestion04=lQueryOtherQuestion04Item
							lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
						}
						if(lIsQueryOtherQuestion04){
							String lTagQueryOtherQuestion04ButtonClose=''
							String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
								WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				if(!lElementQueryOtherQuestion05Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
				}
				if(lElementQueryOtherQuestion05Button){
					if(!lIsDoneQueryOtherQuestion05){
						lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
						if(lIsDoneQueryOtherQuestion05){
							lQueryOtherQuestion05=lQueryOtherQuestion05Item
							lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
						}
						if(lIsQueryOtherQuestion05){
							String lTagQueryOtherQuestion05ButtonClose=''
							String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
								WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				if(!lElementQueryOtherQuestion06Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
				}
				if(lElementQueryOtherQuestion06Button){
					if(!lIsDoneQueryOtherQuestion06){
						lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
						if(lIsDoneQueryOtherQuestion06){
							lQueryOtherQuestion06=lQueryOtherQuestion06Item
							lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
						}
						if(lIsQueryOtherQuestion06){
							String lTagQueryOtherQuestion06ButtonClose=''
							String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
								WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				if(!lElementQueryOtherQuestion07Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
				}
				if(lElementQueryOtherQuestion07Button){
					if(!lIsDoneQueryOtherQuestion07){
						lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
						if(lIsDoneQueryOtherQuestion07){
							lQueryOtherQuestion07=lQueryOtherQuestion07Item
							lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
						}
						if(lIsQueryOtherQuestion07){
							String lTagQueryOtherQuestion07ButtonClose=''
							String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
								WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				if(!lElementQueryOtherQuestion08Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
				}
				if(lElementQueryOtherQuestion08Button){
					if(!lIsDoneQueryOtherQuestion08){
						lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
						if(lIsDoneQueryOtherQuestion08){
							lQueryOtherQuestion08=lQueryOtherQuestion08Item
							lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
						}
						if(lIsQueryOtherQuestion08){
							String lTagQueryOtherQuestion08ButtonClose=''
							String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
								WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				if(!lElementQueryOtherQuestion09Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
				}
				if(lElementQueryOtherQuestion09Button){
					if(!lIsDoneQueryOtherQuestion09){
						lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
						if(lIsDoneQueryOtherQuestion09){
							lQueryOtherQuestion09=lQueryOtherQuestion09Item
							lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
						}
						if(lIsQueryOtherQuestion09){
							String lTagQueryOtherQuestion09ButtonClose=''
							String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
								WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				if(!lElementQueryOtherQuestion10Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
				}
				if(lElementQueryOtherQuestion10Button){
					if(!lIsDoneQueryOtherQuestion10){
						lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
						if(lIsDoneQueryOtherQuestion10){
							lQueryOtherQuestion10=lQueryOtherQuestion10Item
							lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
						}
						if(lIsQueryOtherQuestion10){
							String lTagQueryOtherQuestion10ButtonClose=''
							String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
								WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion01Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
						lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
							lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
							lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion01){
							String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion02Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
						lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
							lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
							lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion02){
							String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion03Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
						lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
							lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
							lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion03){
							String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion04Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
						lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
							lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
							lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion04){
							String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion05Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
						lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
							lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
							lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion05){
							String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion06Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
						lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
							lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
							lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion06){
							String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion07Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
						lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
							lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
							lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion07){
							String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion08Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
						lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
							lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
							lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion08){
							String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion09Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
						lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
							lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
							lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion09){
							String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
					IGNUemaHelper.delayThreadSecond(2)
					lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
				}
				if(lElementQueryHospitalIncomeBenefitQuestion10Button){
					if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
						lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
						if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
							lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
							lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
						}
						if(lIsQueryHospitalIncomeBenefitQuestion10){
							String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
							String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
								WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
							}
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
			}else{
				Boolean lIsFoundNewQuestion=false
				Integer lIndexNoNewQuestionRound=0
				Integer lIndexTry=0
				for(lIndexTry=1;lIndexTry<=35;lIndexTry++){
					lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					if(!lElementQueryHealthConditionButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHealthConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHealthConditionButtonKey,lTagQueryHealthConditionButtonValue)
					}
					if(lElementQueryHealthConditionButton){
						if(!lIsDoneQueryHealthCondition){
							lIsDoneQueryHealthCondition=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHealthConditionButton)
							if(lIsDoneQueryHealthCondition){
								lQueryHealthCondition=lQueryHealthConditionItem
								lQueryHealthCondition=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHealthCondition,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHealthConditionButton))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHealthCondition){
								String lTagQueryHealthConditionButtonClose=''
								String lLocatorQueryHealthConditionButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHealthConditionButtonClose,15)){
									WebElement lElementQueryHealthConditionButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHealthConditionButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHealthConditionButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					if(!lElementQueryInsuredDeniedCoverageButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryInsuredDeniedCoverageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryInsuredDeniedCoverageButtonKey,lTagQueryInsuredDeniedCoverageButtonValue)
					}
					if(lElementQueryInsuredDeniedCoverageButton){
						if(!lIsDoneQueryInsuredDeniedCoverage){
							lIsDoneQueryInsuredDeniedCoverage=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButton)
							if(lIsDoneQueryInsuredDeniedCoverage){
								lQueryInsuredDeniedCoverage=lQueryInsuredDeniedCoverageItem
								lQueryInsuredDeniedCoverage=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryInsuredDeniedCoverage,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryInsuredDeniedCoverageButton))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryInsuredDeniedCoverage){
								String lTagQueryInsuredDeniedCoverageButtonClose=''
								String lLocatorQueryInsuredDeniedCoverageButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose,15)){
									WebElement lElementQueryInsuredDeniedCoverageButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryInsuredDeniedCoverageButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					if(!lElementQueryDiedFromCriticalIllnessesButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryDiedFromCriticalIllnessesButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryDiedFromCriticalIllnessesButtonKey,lTagQueryDiedFromCriticalIllnessesButtonValue)
					}
					if(lElementQueryDiedFromCriticalIllnessesButton){
						if(!lIsDoneQueryDiedFromCriticalIllnesses){
							lIsDoneQueryDiedFromCriticalIllnesses=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButton)
							if(lIsDoneQueryDiedFromCriticalIllnesses){
								lQueryDiedFromCriticalIllnesses=lQueryDiedFromCriticalIllnessesItem
								lQueryDiedFromCriticalIllnesses=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryDiedFromCriticalIllnesses,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryDiedFromCriticalIllnessesButton))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryDiedFromCriticalIllnesses){
								String lTagQueryDiedFromCriticalIllnessesButtonClose=''
								String lLocatorQueryDiedFromCriticalIllnessesButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose,15)){
									WebElement lElementQueryDiedFromCriticalIllnessesButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryDiedFromCriticalIllnessesButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					if(!lElementQueryIndustryButton){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryIndustryButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryIndustryButtonKey,lTagQueryIndustryButtonValue)
					}
					if(lElementQueryIndustryButton){
						if(!lIsDoneQueryIndustry){
							lIsDoneQueryIndustry=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryIndustryButton)
							if(lIsDoneQueryIndustry){
								lQueryIndustry=lQueryIndustryItem
								lQueryIndustry=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryIndustry,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryIndustryButton))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryIndustry){
								String lTagQueryIndustryButtonClose=''
								String lLocatorQueryIndustryButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryIndustryButtonClose,15)){
									WebElement lElementQueryIndustryButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryIndustryButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryIndustryButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryIndustryButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					if(!lElementQueryOtherQuestion01Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion01ButtonKey,lTagQueryOtherQuestion01ButtonValue)
					}
					if(lElementQueryOtherQuestion01Button){
						if(!lIsDoneQueryOtherQuestion01){
							lIsDoneQueryOtherQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion01Button)
							if(lIsDoneQueryOtherQuestion01){
								lQueryOtherQuestion01=lQueryOtherQuestion01Item
								lQueryOtherQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion01Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion01){
								String lTagQueryOtherQuestion01ButtonClose=''
								String lLocatorQueryOtherQuestion01ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose,15)){
									WebElement lElementQueryOtherQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion01ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion01ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					if(!lElementQueryOtherQuestion02Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion02ButtonKey,lTagQueryOtherQuestion02ButtonValue)
					}
					if(lElementQueryOtherQuestion02Button){
						if(!lIsDoneQueryOtherQuestion02){
							lIsDoneQueryOtherQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion02Button)
							if(lIsDoneQueryOtherQuestion02){
								lQueryOtherQuestion02=lQueryOtherQuestion02Item
								lQueryOtherQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion02Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion02){
								String lTagQueryOtherQuestion02ButtonClose=''
								String lLocatorQueryOtherQuestion02ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose,15)){
									WebElement lElementQueryOtherQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion02ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion02ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					if(!lElementQueryOtherQuestion03Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion03ButtonKey,lTagQueryOtherQuestion03ButtonValue)
					}
					if(lElementQueryOtherQuestion03Button){
						if(!lIsDoneQueryOtherQuestion03){
							lIsDoneQueryOtherQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion03Button)
							if(lIsDoneQueryOtherQuestion03){
								lQueryOtherQuestion03=lQueryOtherQuestion03Item
								lQueryOtherQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion03Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion03){
								String lTagQueryOtherQuestion03ButtonClose=''
								String lLocatorQueryOtherQuestion03ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose,15)){
									WebElement lElementQueryOtherQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion03ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion03ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					if(!lElementQueryOtherQuestion04Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion04ButtonKey,lTagQueryOtherQuestion04ButtonValue)
					}
					if(lElementQueryOtherQuestion04Button){
						if(!lIsDoneQueryOtherQuestion04){
							lIsDoneQueryOtherQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion04Button)
							if(lIsDoneQueryOtherQuestion04){
								lQueryOtherQuestion04=lQueryOtherQuestion04Item
								lQueryOtherQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion04Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion04){
								String lTagQueryOtherQuestion04ButtonClose=''
								String lLocatorQueryOtherQuestion04ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose,15)){
									WebElement lElementQueryOtherQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion04ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion04ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					if(!lElementQueryOtherQuestion05Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion05ButtonKey,lTagQueryOtherQuestion05ButtonValue)
					}
					if(lElementQueryOtherQuestion05Button){
						if(!lIsDoneQueryOtherQuestion05){
							lIsDoneQueryOtherQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion05Button)
							if(lIsDoneQueryOtherQuestion05){
								lQueryOtherQuestion05=lQueryOtherQuestion05Item
								lQueryOtherQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion05Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion05){
								String lTagQueryOtherQuestion05ButtonClose=''
								String lLocatorQueryOtherQuestion05ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose,15)){
									WebElement lElementQueryOtherQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion05ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion05ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					if(!lElementQueryOtherQuestion06Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion06ButtonKey,lTagQueryOtherQuestion06ButtonValue)
					}
					if(lElementQueryOtherQuestion06Button){
						if(!lIsDoneQueryOtherQuestion06){
							lIsDoneQueryOtherQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion06Button)
							if(lIsDoneQueryOtherQuestion06){
								lQueryOtherQuestion06=lQueryOtherQuestion06Item
								lQueryOtherQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion06Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion06){
								String lTagQueryOtherQuestion06ButtonClose=''
								String lLocatorQueryOtherQuestion06ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose,15)){
									WebElement lElementQueryOtherQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion06ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion06ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					if(!lElementQueryOtherQuestion07Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion07ButtonKey,lTagQueryOtherQuestion07ButtonValue)
					}
					if(lElementQueryOtherQuestion07Button){
						if(!lIsDoneQueryOtherQuestion07){
							lIsDoneQueryOtherQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion07Button)
							if(lIsDoneQueryOtherQuestion07){
								lQueryOtherQuestion07=lQueryOtherQuestion07Item
								lQueryOtherQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion07Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion07){
								String lTagQueryOtherQuestion07ButtonClose=''
								String lLocatorQueryOtherQuestion07ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose,15)){
									WebElement lElementQueryOtherQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion07ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion07ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					if(!lElementQueryOtherQuestion08Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion08ButtonKey,lTagQueryOtherQuestion08ButtonValue)
					}
					if(lElementQueryOtherQuestion08Button){
						if(!lIsDoneQueryOtherQuestion08){
							lIsDoneQueryOtherQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion08Button)
							if(lIsDoneQueryOtherQuestion08){
								lQueryOtherQuestion08=lQueryOtherQuestion08Item
								lQueryOtherQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion08Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion08){
								String lTagQueryOtherQuestion08ButtonClose=''
								String lLocatorQueryOtherQuestion08ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose,15)){
									WebElement lElementQueryOtherQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion08ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion08ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					if(!lElementQueryOtherQuestion09Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion09ButtonKey,lTagQueryOtherQuestion09ButtonValue)
					}
					if(lElementQueryOtherQuestion09Button){
						if(!lIsDoneQueryOtherQuestion09){
							lIsDoneQueryOtherQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion09Button)
							if(lIsDoneQueryOtherQuestion09){
								lQueryOtherQuestion09=lQueryOtherQuestion09Item
								lQueryOtherQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion09Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion09){
								String lTagQueryOtherQuestion09ButtonClose=''
								String lLocatorQueryOtherQuestion09ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose,15)){
									WebElement lElementQueryOtherQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion09ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion09ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					if(!lElementQueryOtherQuestion10Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryOtherQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryOtherQuestion10ButtonKey,lTagQueryOtherQuestion10ButtonValue)
					}
					if(lElementQueryOtherQuestion10Button){
						if(!lIsDoneQueryOtherQuestion10){
							lIsDoneQueryOtherQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryOtherQuestion10Button)
							if(lIsDoneQueryOtherQuestion10){
								lQueryOtherQuestion10=lQueryOtherQuestion10Item
								lQueryOtherQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryOtherQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryOtherQuestion10Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryOtherQuestion10){
								String lTagQueryOtherQuestion10ButtonClose=''
								String lLocatorQueryOtherQuestion10ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose,15)){
									WebElement lElementQueryOtherQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryOtherQuestion10ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryOtherQuestion10ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion01Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion01ButtonKey,lTagQueryHospitalIncomeBenefitQuestion01ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion01Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion01){
							lIsDoneQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion01){
								lQueryHospitalIncomeBenefitQuestion01=lQueryHospitalIncomeBenefitQuestion01Item
								lQueryHospitalIncomeBenefitQuestion01=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion01,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion01){
								String lTagQueryHospitalIncomeBenefitQuestion01ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion01ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion01ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion01ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion02Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion02ButtonKey,lTagQueryHospitalIncomeBenefitQuestion02ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion02Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion02){
							lIsDoneQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion02){
								lQueryHospitalIncomeBenefitQuestion02=lQueryHospitalIncomeBenefitQuestion02Item
								lQueryHospitalIncomeBenefitQuestion02=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion02,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion02){
								String lTagQueryHospitalIncomeBenefitQuestion02ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion02ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion02ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion02ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion03Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion03ButtonKey,lTagQueryHospitalIncomeBenefitQuestion03ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion03Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion03){
							lIsDoneQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion03){
								lQueryHospitalIncomeBenefitQuestion03=lQueryHospitalIncomeBenefitQuestion03Item
								lQueryHospitalIncomeBenefitQuestion03=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion03,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion03){
								String lTagQueryHospitalIncomeBenefitQuestion03ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion03ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion03ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion03ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion04Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion04ButtonKey,lTagQueryHospitalIncomeBenefitQuestion04ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion04Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion04){
							lIsDoneQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion04){
								lQueryHospitalIncomeBenefitQuestion04=lQueryHospitalIncomeBenefitQuestion04Item
								lQueryHospitalIncomeBenefitQuestion04=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion04,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion04){
								String lTagQueryHospitalIncomeBenefitQuestion04ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion04ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion04ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion04ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion05Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion05ButtonKey,lTagQueryHospitalIncomeBenefitQuestion05ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion05Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion05){
							lIsDoneQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion05){
								lQueryHospitalIncomeBenefitQuestion05=lQueryHospitalIncomeBenefitQuestion05Item
								lQueryHospitalIncomeBenefitQuestion05=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion05,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion05){
								String lTagQueryHospitalIncomeBenefitQuestion05ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion05ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion05ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion05ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion06Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion06ButtonKey,lTagQueryHospitalIncomeBenefitQuestion06ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion06Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion06){
							lIsDoneQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion06){
								lQueryHospitalIncomeBenefitQuestion06=lQueryHospitalIncomeBenefitQuestion06Item
								lQueryHospitalIncomeBenefitQuestion06=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion06,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion06){
								String lTagQueryHospitalIncomeBenefitQuestion06ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion06ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion06ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion06ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion07Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion07ButtonKey,lTagQueryHospitalIncomeBenefitQuestion07ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion07Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion07){
							lIsDoneQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion07){
								lQueryHospitalIncomeBenefitQuestion07=lQueryHospitalIncomeBenefitQuestion07Item
								lQueryHospitalIncomeBenefitQuestion07=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion07,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion07){
								String lTagQueryHospitalIncomeBenefitQuestion07ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion07ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion07ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion07ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion08Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion08ButtonKey,lTagQueryHospitalIncomeBenefitQuestion08ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion08Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion08){
							lIsDoneQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion08){
								lQueryHospitalIncomeBenefitQuestion08=lQueryHospitalIncomeBenefitQuestion08Item
								lQueryHospitalIncomeBenefitQuestion08=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion08,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion08){
								String lTagQueryHospitalIncomeBenefitQuestion08ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion08ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion08ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion08ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion09Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion09ButtonKey,lTagQueryHospitalIncomeBenefitQuestion09ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion09Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion09){
							lIsDoneQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion09){
								lQueryHospitalIncomeBenefitQuestion09=lQueryHospitalIncomeBenefitQuestion09Item
								lQueryHospitalIncomeBenefitQuestion09=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion09,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion09){
								String lTagQueryHospitalIncomeBenefitQuestion09ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion09ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion09ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion09ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
					if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
						IGNUemaHelper.delayThreadSecond(2)
						lElementQueryHospitalIncomeBenefitQuestion10Button=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagQueryHospitalIncomeBenefitQuestion10ButtonKey,lTagQueryHospitalIncomeBenefitQuestion10ButtonValue)
					}
					if(lElementQueryHospitalIncomeBenefitQuestion10Button){
						if(!lIsDoneQueryHospitalIncomeBenefitQuestion10){
							lIsDoneQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button)
							if(lIsDoneQueryHospitalIncomeBenefitQuestion10){
								lQueryHospitalIncomeBenefitQuestion10=lQueryHospitalIncomeBenefitQuestion10Item
								lQueryHospitalIncomeBenefitQuestion10=IGNUemaHelper.concatMessageLeftRightByPipe(lQueryHospitalIncomeBenefitQuestion10,IGNUemaHelper.getChildTextByWebElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10Button))
								lIsFoundNewQuestion=true
							}
							if(lIsQueryHospitalIncomeBenefitQuestion10){
								String lTagQueryHospitalIncomeBenefitQuestion10ButtonClose=''
								String lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose='#thankyou-modal button'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose,15)){
									WebElement lElementQueryHospitalIncomeBenefitQuestion10ButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorQueryHospitalIncomeBenefitQuestion10ButtonClose)
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementQueryHospitalIncomeBenefitQuestion10ButtonClose)
								}
							}
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
					lElementCheckPointNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckPointNextButton)
					if(lElementCheckPointNextButton){
						break
					}
					if(lIsFoundNewQuestion){
						lIsFoundNewQuestion=false
						lIndexNoNewQuestionRound=0
					}else{
						lIndexNoNewQuestionRound=lIndexNoNewQuestionRound+1
						if(lIndexNoNewQuestionRound>1){
							break
						}
					}
				}
			}
			lIsDoneQueryAll=true
			if(!lElementQueryHealthConditionButton){
				lQueryHealthCondition='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHealthCondition
			}
			if(!lElementQueryInsuredDeniedCoverageButton){
				lQueryInsuredDeniedCoverage='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryInsuredDeniedCoverage
			}
			if(!lElementQueryDiedFromCriticalIllnessesButton){
				lQueryDiedFromCriticalIllnesses='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryDiedFromCriticalIllnesses
			}
			if(!lElementQueryIndustryButton){
				lQueryIndustry='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryIndustry
			}
			if(!lElementQueryOtherQuestion01Button){
				lQueryOtherQuestion01='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion01
			}
			if(!lElementQueryOtherQuestion02Button){
				lQueryOtherQuestion02='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion02
			}
			if(!lElementQueryOtherQuestion03Button){
				lQueryOtherQuestion03='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion03
			}
			if(!lElementQueryOtherQuestion04Button){
				lQueryOtherQuestion04='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion04
			}
			if(!lElementQueryOtherQuestion05Button){
				lQueryOtherQuestion05='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion05
			}
			if(!lElementQueryOtherQuestion06Button){
				lQueryOtherQuestion06='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion06
			}
			if(!lElementQueryOtherQuestion07Button){
				lQueryOtherQuestion07='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion07
			}
			if(!lElementQueryOtherQuestion08Button){
				lQueryOtherQuestion08='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion08
			}
			if(!lElementQueryOtherQuestion09Button){
				lQueryOtherQuestion09='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion09
			}
			if(!lElementQueryOtherQuestion10Button){
				lQueryOtherQuestion10='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryOtherQuestion10
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion01Button){
				lQueryHospitalIncomeBenefitQuestion01='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion01
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion02Button){
				lQueryHospitalIncomeBenefitQuestion02='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion02
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion03Button){
				lQueryHospitalIncomeBenefitQuestion03='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion03
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion04Button){
				lQueryHospitalIncomeBenefitQuestion04='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion04
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion05Button){
				lQueryHospitalIncomeBenefitQuestion05='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion05
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion06Button){
				lQueryHospitalIncomeBenefitQuestion06='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion06
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion07Button){
				lQueryHospitalIncomeBenefitQuestion07='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion07
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion08Button){
				lQueryHospitalIncomeBenefitQuestion08='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion08
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion09Button){
				lQueryHospitalIncomeBenefitQuestion09='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion09
			}
			if(!lElementQueryHospitalIncomeBenefitQuestion10Button){
				lQueryHospitalIncomeBenefitQuestion10='No Option'
			}else{
				lIsDoneQueryAll=lIsDoneQueryAll&&lIsDoneQueryHospitalIncomeBenefitQuestion10
			}
			lResult=lIsDoneQueryAll
			if(lResult){
				lreturn.put('QueryHealthCondition',lQueryHealthCondition)
				lreturn.put('QueryInsuredDeniedCoverage',lQueryInsuredDeniedCoverage)
				lreturn.put('QueryDiedFromCriticalIllnesses',lQueryDiedFromCriticalIllnesses)
				lreturn.put('QueryIndustry',lQueryIndustry)
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
				lreturn.put('QueryHospitalIncomeBenefitQuestion01',lQueryHospitalIncomeBenefitQuestion01)
				lreturn.put('QueryHospitalIncomeBenefitQuestion02',lQueryHospitalIncomeBenefitQuestion02)
				lreturn.put('QueryHospitalIncomeBenefitQuestion03',lQueryHospitalIncomeBenefitQuestion03)
				lreturn.put('QueryHospitalIncomeBenefitQuestion04',lQueryHospitalIncomeBenefitQuestion04)
				lreturn.put('QueryHospitalIncomeBenefitQuestion05',lQueryHospitalIncomeBenefitQuestion05)
				lreturn.put('QueryHospitalIncomeBenefitQuestion06',lQueryHospitalIncomeBenefitQuestion06)
				lreturn.put('QueryHospitalIncomeBenefitQuestion07',lQueryHospitalIncomeBenefitQuestion07)
				lreturn.put('QueryHospitalIncomeBenefitQuestion08',lQueryHospitalIncomeBenefitQuestion08)
				lreturn.put('QueryHospitalIncomeBenefitQuestion09',lQueryHospitalIncomeBenefitQuestion09)
				lreturn.put('QueryHospitalIncomeBenefitQuestion10',lQueryHospitalIncomeBenefitQuestion10)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputInsuredEdit(String strInsuredEdit,String strInsuredGenderAndMaritalStatus,String strInsuredBirthDateMain){
		Map lreturn=[:]
		String lInsuredEdit=strInsuredEdit.trim()
		if(lInsuredEdit.length()<=0){
			lInsuredEdit=THACriticalIllnessQuotationDetail1Type.DEFAULT_INSURED_EDIT
		}
		String lInsuredGenderAndMaritalStatus=strInsuredGenderAndMaritalStatus.toUpperCase().trim()
		if(lInsuredGenderAndMaritalStatus.length()<=0){
			lInsuredGenderAndMaritalStatus=THACriticalIllnessQuotationDetail1Type.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS
		}
		String lInsuredBirthDateMain=strInsuredBirthDateMain.trim()
		if(lInsuredBirthDateMain.length()<=0){
			lInsuredBirthDateMain=THACriticalIllnessQuotationDetail1Type.DEFAULT_INSURED_BIRTH_DATE_MAIN
		}
		Map lInsuredGenderAndMaritalStatusList=['1':'Male-Single','2':'Male-Married','3':'Female-Single','4':'Female-Married']
		String lInsuredDetail=''
		try{
			Boolean lResult=false
			lreturn.put('InsuredEdit','')
			lreturn.put('InsuredGenderAndMaritalStatus','')
			lreturn.put('InsuredBirthDateMain','')
			lreturn.put('InsuredDetail','')
			lreturn.put('Result',lResult)
			String lTagInsuredEditButton='genderEdit'
			String lLocatorInsuredEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredEditButton)
			WebElement lElementInsuredEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredEditButton)
			if(!lElementInsuredEditButton){
				return lreturn
			}
			Boolean lIsInsuredEdit=IGNUemaHelper.convertStringToBoolean(lInsuredEdit)
			lInsuredEdit=IGNUemaHelper.convertBooleanToYesNoString(lIsInsuredEdit)
			String lGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(lInsuredGenderAndMaritalStatus)
			if(!lGenderAndMaritalStatusItem){
				lGenderAndMaritalStatusItem=lInsuredGenderAndMaritalStatusList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_INSURED_GENDER_AND_MARITAL_STATUS)
			}
			if(lIsInsuredEdit){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementInsuredEditButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementInsuredEditButton)
				lInsuredGenderAndMaritalStatus=''
				String lTagInsuredGenderAndMaritalStatusButtonKey='gender'
				String lTagInsuredGenderAndMaritalStatusButtonValue=lGenderAndMaritalStatusItem
				String lLocatorInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
				WebElement lElementInsuredGenderAndMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagInsuredGenderAndMaritalStatusButtonKey,lTagInsuredGenderAndMaritalStatusButtonValue)
				if(!lElementInsuredGenderAndMaritalStatusButton){
					return lreturn
				}else{
					String lInsuredGenderAndMaritalStatusText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementInsuredGenderAndMaritalStatusButton).trim()
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredGenderAndMaritalStatusButton)){
						lInsuredGenderAndMaritalStatus=lInsuredGenderAndMaritalStatusText
					}
				}
				String lInsuredBirthDateMainText=lInsuredBirthDateMain
				lInsuredBirthDateMain=''
				String lTagInsuredBirthDateMainInput='dob'
				String lLocatorInsuredBirthDateMainInput=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredBirthDateMainInput)
				WebElement lElementInsuredBirthDateMainInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredBirthDateMainInput)
				if(lElementInsuredBirthDateMainInput){
					lInsuredBirthDateMainText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInsuredBirthDateMainInput,lInsuredBirthDateMainText)
				}
				lElementInsuredBirthDateMainInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredBirthDateMainInput)
				if(lElementInsuredBirthDateMainInput){
					lInsuredBirthDateMainText=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementInsuredBirthDateMainInput,'value')
					lInsuredBirthDateMain=lInsuredBirthDateMainText
				}
			}else{
				lInsuredGenderAndMaritalStatus=''
				lInsuredBirthDateMain=''
				String lTagInsuredEditButtonKey=''
				String lLocatorInsuredEditButtonList='.mariatal-status h5'
				List<WebElement> lElementInsuredEditButtonList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorInsuredEditButtonList)
				WebElement lElementInsuredGenderAndMaritalStatus=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,0,lElementInsuredEditButtonList)
				if(lElementInsuredGenderAndMaritalStatus){
					lInsuredGenderAndMaritalStatus=IGNUemaHelper.getTextByWebElement(this.driver,lElementInsuredGenderAndMaritalStatus)
				}
				WebElement lElementInsuredBirthDateMain=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,1,lElementInsuredEditButtonList)
				if(lElementInsuredBirthDateMain){
					lInsuredBirthDateMain=IGNUemaHelper.getTextByWebElement(this.driver,lElementInsuredBirthDateMain)
				}
			}
			String lTagInsuredBirthDateMainButtonNext='dob-next'
			String lLocatorInsuredBirthDateMainButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagInsuredBirthDateMainButtonNext)
			WebElement lElementInsuredBirthDateMainButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInsuredBirthDateMainButtonNext)
			if(lElementInsuredBirthDateMainButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementInsuredBirthDateMainButtonNext)
			}
			lInsuredDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lInsuredGenderAndMaritalStatus,lInsuredBirthDateMain)
			lResult=(lInsuredGenderAndMaritalStatus.length()>0)&&(lInsuredGenderAndMaritalStatus.length()>0)
			if(lResult){
				lreturn.put('InsuredEdit',lInsuredEdit)
				lreturn.put('InsuredGenderAndMaritalStatus',lInsuredGenderAndMaritalStatus)
				lreturn.put('InsuredBirthDateMain',lInsuredBirthDateMain)
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
			lNationalityThai=THACriticalIllnessQuotationDetail1Type.DEFAULT_NATIONALITY_THAI
		}
		String lNationalityThaiId=strNationalityThaiId.trim()
		if(lNationalityThaiId.length()<=0){
			lNationalityThaiId=THACriticalIllnessQuotationDetail1Type.DEFAULT_NATIONALITY_THAI_ID
		}
		String lNationalityPassportId=strNationalityPassportId.trim()
		if(lNationalityPassportId.length()<=0){
			lNationalityPassportId=THACriticalIllnessQuotationDetail1Type.DEFAULT_NATIONALITY_PASSPORT_ID
		}
		String lNationalityPassportCountry=strNationalityPassportCountry.trim()
		if(lNationalityPassportCountry.length()<=0){
			lNationalityPassportCountry=THACriticalIllnessQuotationDetail1Type.DEFAULT_NATIONALITY_PASSPORT_COUNTRY
		}
		Map lNationalityThaiList=['NO':'No','YES':'Yes']
		try{
			Boolean lResult=false
			lreturn.put('NationalityThai','')
			lreturn.put('NationalityThaiId','')
			lreturn.put('NationalityPassportId','')
			lreturn.put('NationalityPassportCountry','')
			lreturn.put('Result',lResult)
			String lNationalityThaiItem=lNationalityThaiList.get(lNationalityThai)
			if(!lNationalityThaiItem){
				lNationalityThaiItem=lNationalityThaiList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_NATIONALITY_THAI.toUpperCase())
			}
			lNationalityThai=''
			Boolean lIsNationalityThai=IGNUemaHelper.convertStringToBoolean(lNationalityThaiItem)
			String lTagNationalityThaiButtonKey='thaiNationality'
			String lTagNationalityThaiButtonValue=lNationalityThaiItem
			String lLocatorNationalityThaiButton=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityThaiButtonKey)
			WebElement lElementNationalityThaiButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagNationalityThaiButtonKey,lTagNationalityThaiButtonValue)
			if(!lElementNationalityThaiButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNationalityThaiButton)
			lNationalityThai=lNationalityThaiItem
			if(lIsNationalityThai){
				String lTagNationalityThaiIdInputText='idcard'
				String lLocatorNationalityThaiIdInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityThaiIdInputText)
				if(lNationalityThaiId.length()<=0){
					lNationalityThaiId=IGNUemaHelper.randomIDThaiOrPassportNumber(true,true)
				}
				lNationalityThaiId=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorNationalityThaiIdInputText,lNationalityThaiId)
				String lTagNationalityThaiIdButtonNext='idcard-next'
				String lLocatorNationalityThaiIdButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityThaiIdButtonNext)
				WebElement lElementNationalityThaiIdButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagNationalityThaiIdButtonNext)
				if(lElementNationalityThaiIdButtonNext){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNationalityThaiIdButtonNext)
				}
				lNationalityPassportId=''
				lNationalityPassportCountry=''
			}else{
				lNationalityThaiId=''
				String lTagNationalityPassportIdInputText='passport'
				String lLocatorNationalityPassportIdInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityPassportIdInputText)
				if(lNationalityPassportId.length()<=0){
					lNationalityPassportId=IGNUemaHelper.randomIDThaiOrPassportNumber(false,true)
				}
				lNationalityPassportId=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorNationalityPassportIdInputText,lNationalityPassportId)
				String lTagNationalityPassportCountryButton='selected-passport-country'
				String lLocatorNationalityPassportCountryButton=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityPassportCountryButton)
				String lTagNationalityPassportCountryDropdownList='passport-country'
				String lLocatorNationalityPassportCountryDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityPassportCountryDropdownList)
				Boolean lIsNationalityPassportCountryButtonValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorNationalityPassportCountryButton)
				if(!lIsNationalityPassportCountryButtonValid){
					return lreturn
				}else{
					lNationalityPassportCountry=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagNationalityPassportCountryButton,lTagNationalityPassportCountryDropdownList,lNationalityPassportCountry,true)
				}
				String lTagNationalityPassportButtonNext='passport-next'
				String lLocatorNationalityPassportButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagNationalityPassportButtonNext)
				WebElement lElementNationalityPassportButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagNationalityPassportButtonNext)
				if(lElementNationalityPassportButtonNext){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementNationalityPassportButtonNext)
				}
			}
			lResult=lNationalityThai.length()>0
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
			lHolderFirstName=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_FIRST_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderFirstName','')
			lreturn.put('Result',lResult)
			String lTagHolderFirstNameInputText='firstName'
			String lLocatorHolderFirstNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderFirstNameInputText)
			lHolderFirstName=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorHolderFirstNameInputText,lHolderFirstName)
			String lTagHolderFirstNameButtonNext='name-next'
			String lLocatorHolderFirstNameButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderFirstNameButtonNext)
			WebElement lElementHolderFirstNameButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderFirstNameButtonNext)
			if(lElementHolderFirstNameButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderFirstNameButtonNext)
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
			lHolderLastName=THACriticalIllnessQuotationDetail1Type.DEFAULT_HOLDER_LAST_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderLastName','')
			lreturn.put('Result',lResult)
			String lTagHolderLastNameInputText='lastName'
			String lLocatorHolderLastNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderLastNameInputText)
			lHolderLastName=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorHolderLastNameInputText,lHolderLastName)
			String lTagHolderLastNameButtonNext='name-next'
			String lLocatorHolderLastNameButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagHolderLastNameButtonNext)
			WebElement lElementHolderLastNameButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagHolderLastNameButtonNext)
			if(lElementHolderLastNameButtonNext){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementHolderLastNameButtonNext)
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
			lPolicyStartDate=THACriticalIllnessQuotationDetail1Type.DEFAULT_POLICY_START_DATE
		}
		String lFormatDate='dd/MM/yyyy'
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
		}
		String lPolicyStartOffsetDay=strPolicyStartOffsetDay.trim()
		if(lPolicyStartOffsetDay.length()<=0){
			lPolicyStartOffsetDay=THACriticalIllnessQuotationDetail1Type.DEFAULT_POLICY_START_OFFSET_DAY
		}
		Integer lPolicyStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyStartOffsetDay,0)
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartOffsetDay','')
			lreturn.put('Result',lResult)
			lPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lPolicyStartDate,lPolicyStartDayOffsetNum)
			String lTagInputText='startDate'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			Boolean lInputTextVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorInputText)
			Boolean lInputTextEnable=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorInputText)
			if(lInputTextVisible&&lInputTextEnable){
				lPolicyStartDate=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lPolicyStartDate)
			}else{
				lPolicyStartDate='No Option'
			}
			lPolicyStartOffsetDay=lPolicyStartDayOffsetNum.toString()
			lResult=lPolicyStartOffsetDay.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('startDate-next'))
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
			lAddressPostalCode=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressPostalCode','')
			lreturn.put('Result',lResult)
			String lTagAddressPostalCodeInputText='postalCode'
			String lLocatorAddressPostalCodeInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressPostalCodeInputText)
			WebElement lElementAddressPostalCodeInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressPostalCodeInputText)
			if(!lElementAddressPostalCodeInputText){
				return lreturn
			}
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
	public Map inputAddressProvince(String strAddressProvince){
		Map lreturn=[:]
		String lAddressProvince=strAddressProvince.trim()
		if(lAddressProvince.length()<=0){
			lAddressProvince=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressProvince','')
			lreturn.put('Result',lResult)
			String lTagAddressProvinceButton='selected-province'
			String lLocatorAddressProvinceButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressProvinceButton)
			String lTagAddressProvinceDropdownList='province'
			String lLocatorAddressProvinceDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressProvinceDropdownList)
			lAddressProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressProvinceButton,lTagAddressProvinceDropdownList,lAddressProvince,true)
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
			lAddressDistrict=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_DISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressDistrict','')
			lreturn.put('Result',lResult)
			String lTagAddressDistrictButton='selected-district'
			String lLocatorAddressDistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressDistrictButton)
			String lTagAddressDistrictDropdownList='district'
			String lLocatorAddressDistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressDistrictDropdownList)
			lAddressDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressDistrictButton,lTagAddressDistrictDropdownList,lAddressDistrict,true)
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
			lAddressSubdistrict=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_SUBDISTRICT
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressSubdistrict','')
			lreturn.put('Result',lResult)
			String lTagAddressSubdistrictButton='selected-suddistrict'
			String lLocatorAddressSubdistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressSubdistrictButton)
			String lTagAddressSubdistrictDropdownList='suddistrict'
			String lLocatorAddressSubdistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressSubdistrictDropdownList)
			lAddressSubdistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagAddressSubdistrictButton,lTagAddressSubdistrictDropdownList,lAddressSubdistrict,true)
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
			lAddressRoad=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_ROAD
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressRoad','')
			lreturn.put('Result',lResult)
			String lTagAddressRoadInputText='roadsoi'
			String lLocatorAddressRoadInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressRoadInputText)
			WebElement lElementAddressRoadInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressRoadInputText)
			if(!lElementAddressRoadInputText){
				return lreturn
			}
			lAddressRoad=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressRoadInputText,lAddressRoad)
			lResult=lAddressRoad.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('roadsoi-next'))
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
			lAddressBuildingName=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_BUILDING_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressBuildingName','')
			lreturn.put('Result',lResult)
			String lTagAddressBuildingNameInputText='village'
			String lLocatorAddressBuildingNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressBuildingNameInputText)
			WebElement lElementAddressBuildingNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressBuildingNameInputText)
			if(!lElementAddressBuildingNameInputText){
				return lreturn
			}
			lAddressBuildingName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressBuildingNameInputText,lAddressBuildingName)
			lResult=lAddressBuildingName.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('village-next'))
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
			lAddressBuildingNumber=THACriticalIllnessQuotationDetail1Type.DEFAULT_ADDRESS_BUILDING_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('AddressBuildingNumber','')
			lreturn.put('Result',lResult)
			String lTagAddressBuildingNumberInputText='houseNumber'
			String lLocatorAddressBuildingNumberInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagAddressBuildingNumberInputText)
			WebElement lElementAddressBuildingNumberInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagAddressBuildingNumberInputText)
			if(!lElementAddressBuildingNumberInputText){
				return lreturn
			}
			lAddressBuildingNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementAddressBuildingNumberInputText,lAddressBuildingNumber)
			lResult=lAddressBuildingNumber.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('houseNumber-next'))
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
			lLegalHeir=THACriticalIllnessQuotationDetail1Type.DEFAULT_LEGAL_HEIR
		}
		try{
			Boolean lResult=false
			lreturn.put('LegalHeir','')
			lreturn.put('Result',lResult)
			Boolean lIsLegalHeir=IGNUemaHelper.convertStringToBoolean(lLegalHeir)
			String lTagLegalHeirButton='skip-beneficiary'
			String lLocatorLegalHeirButton=IGNUemaHelper.getTagDataSeleniumKey(lTagLegalHeirButton)
			WebElement lElementLegalHeirButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagLegalHeirButton)
			if(!lElementLegalHeirButton){
				lIsLegalHeir=false
			}
			if(lIsLegalHeir){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementLegalHeirButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementLegalHeirButton)
				IGNUemaHelper.delayThreadSecond(1)
			}
			lLegalHeir=IGNUemaHelper.convertBooleanToYesNoString(lIsLegalHeir)
			if(!lElementLegalHeirButton){
				lLegalHeir='No Option'
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
			lBeneficiary1Add=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_ADD
		}
		String lBeneficiary1FirstName=strBeneficiary1FirstName.trim()
		if(lBeneficiary1FirstName.length()<=0){
			lBeneficiary1FirstName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_FIRST_NAME
		}
		String lBeneficiary1LastName=strBeneficiary1LastName.trim()
		if(lBeneficiary1LastName.length()<=0){
			lBeneficiary1LastName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_LAST_NAME
		}
		String lBeneficiary1Relationship=strBeneficiary1Relationship.trim()
		if(lBeneficiary1Relationship.length()<=0){
			lBeneficiary1Relationship=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_RELATIONSHIP
		}
		String lBeneficiary1Percentage=strBeneficiary1Percentage.trim()
		if(lBeneficiary1Percentage.length()<=0){
			lBeneficiary1Percentage=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_PERCENTAGE
		}
		String lBeneficiary2Add=strBeneficiary2Add.trim()
		if(lBeneficiary2Add.length()<=0){
			lBeneficiary2Add=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_ADD
		}
		String lBeneficiary2FirstName=strBeneficiary2FirstName.trim()
		if(lBeneficiary2FirstName.length()<=0){
			lBeneficiary2FirstName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_FIRST_NAME
		}
		String lBeneficiary2LastName=strBeneficiary2LastName.trim()
		if(lBeneficiary2LastName.length()<=0){
			lBeneficiary2LastName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_LAST_NAME
		}
		String lBeneficiary2Relationship=strBeneficiary2Relationship.trim()
		if(lBeneficiary2Relationship.length()<=0){
			lBeneficiary2Relationship=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_RELATIONSHIP
		}
		String lBeneficiary2Percentage=strBeneficiary2Percentage.trim()
		if(lBeneficiary2Percentage.length()<=0){
			lBeneficiary2Percentage=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_PERCENTAGE
		}
		String lBeneficiary3Add=strBeneficiary3Add.trim()
		if(lBeneficiary3Add.length()<=0){
			lBeneficiary3Add=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_ADD
		}
		String lBeneficiary3FirstName=strBeneficiary3FirstName.trim()
		if(lBeneficiary3FirstName.length()<=0){
			lBeneficiary3FirstName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_FIRST_NAME
		}
		String lBeneficiary3LastName=strBeneficiary3LastName.trim()
		if(lBeneficiary3LastName.length()<=0){
			lBeneficiary3LastName=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_LAST_NAME
		}
		String lBeneficiary3Relationship=strBeneficiary3Relationship.trim()
		if(lBeneficiary3Relationship.length()<=0){
			lBeneficiary3Relationship=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_RELATIONSHIP
		}
		String lBeneficiary3Percentage=strBeneficiary3Percentage.trim()
		if(lBeneficiary3Percentage.length()<=0){
			lBeneficiary3Percentage=THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_PERCENTAGE
		}
		String lAdditionBeneficiaryDetail=''
		String lAdditionBeneficiary1Detail=''
		String lAdditionBeneficiary2Detail=''
		String lAdditionBeneficiary3Detail=''
		Map lBeneficiaryRelationshipList=['1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7']
		Map lBeneficiaryPercentageList=['1':'1','2':'2','3':'3','4':'4','5':'5','6':'6','7':'7','8':'8','9':'9','10':'10']
		Integer lBeneficiary1RelationshipDefault=1
		Integer lBeneficiary2RelationshipDefault=1
		Integer lBeneficiary3RelationshipDefault=1
		Integer lBeneficiary1PercentageDefault=10
		Integer lBeneficiary2PercentageDefault=10
		Integer lBeneficiary3PercentageDefault=10
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
			String lTagBeneficiaryAddButton='addBeneficiary'
			String lLocatorBeneficiaryAddButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryAddButton)
			WebElement lElementBeneficiaryAddButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryAddButton)
			if(!lElementBeneficiaryAddButton){
				return lreturn
			}
			Boolean lIsBeneficiaryAdd=false
			Boolean lIsBeneficiary1Add=IGNUemaHelper.convertStringToBoolean(lBeneficiary1Add)
			String lBeneficiary1RelationshipItem=lBeneficiaryRelationshipList.get(lBeneficiary1Relationship)
			if(!lBeneficiary1RelationshipItem){
				lBeneficiary1RelationshipItem=lBeneficiaryRelationshipList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_RELATIONSHIP)
			}
			Integer lBeneficiary1RelationshipNum=IGNUemaHelper.convertStringToInteger(lBeneficiary1RelationshipItem,lBeneficiary1RelationshipDefault)
			String lBeneficiary1PercentageItem=lBeneficiaryPercentageList.get(lBeneficiary1Percentage)
			if(!lBeneficiary1PercentageItem){
				lBeneficiary1PercentageItem=lBeneficiaryPercentageList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY1_PERCENTAGE)
			}
			Integer lBeneficiary1PercentageNum=IGNUemaHelper.convertStringToInteger(lBeneficiary1PercentageItem,lBeneficiary1PercentageDefault)
			Boolean lIsBeneficiary2Add=IGNUemaHelper.convertStringToBoolean(lBeneficiary2Add)
			String lBeneficiary2RelationshipItem=lBeneficiaryRelationshipList.get(lBeneficiary2Relationship)
			if(!lBeneficiary2RelationshipItem){
				lBeneficiary2RelationshipItem=lBeneficiaryRelationshipList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_RELATIONSHIP)
			}
			Integer lBeneficiary2RelationshipNum=IGNUemaHelper.convertStringToInteger(lBeneficiary2RelationshipItem,lBeneficiary2RelationshipDefault)
			String lBeneficiary2PercentageItem=lBeneficiaryPercentageList.get(lBeneficiary2Percentage)
			if(!lBeneficiary2PercentageItem){
				lBeneficiary2PercentageItem=lBeneficiaryPercentageList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY2_PERCENTAGE)
			}
			Integer lBeneficiary2PercentageNum=IGNUemaHelper.convertStringToInteger(lBeneficiary2PercentageItem,lBeneficiary2PercentageDefault)
			Boolean lIsBeneficiary3Add=IGNUemaHelper.convertStringToBoolean(lBeneficiary3Add)
			String lBeneficiary3RelationshipItem=lBeneficiaryRelationshipList.get(lBeneficiary3Relationship)
			if(!lBeneficiary3RelationshipItem){
				lBeneficiary3RelationshipItem=lBeneficiaryRelationshipList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_RELATIONSHIP)
			}
			Integer lBeneficiary3RelationshipNum=IGNUemaHelper.convertStringToInteger(lBeneficiary3RelationshipItem,lBeneficiary3RelationshipDefault)
			String lBeneficiary3PercentageItem=lBeneficiaryPercentageList.get(lBeneficiary3Percentage)
			if(!lBeneficiary3PercentageItem){
				lBeneficiary3PercentageItem=lBeneficiaryPercentageList.get(THACriticalIllnessQuotationDetail1Type.DEFAULT_BENEFICIARY3_PERCENTAGE)
			}
			Integer lBeneficiary3PercentageNum=IGNUemaHelper.convertStringToInteger(lBeneficiary3PercentageItem,lBeneficiary3PercentageDefault)
			if(lIsBeneficiary1Add){
				Map lMapBeneficiary1AddTry=this.inputBeneficiaryAddTry(lBeneficiary1FirstName,lBeneficiary1LastName,lBeneficiary1RelationshipNum,lBeneficiary1PercentageNum)
				if(!lMapBeneficiary1AddTry.Result){
					lIsBeneficiary1Add=false
				}else{
					lBeneficiary1Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary1Add)
					lBeneficiary1FirstName=lMapBeneficiary1AddTry.BeneficiaryFirstName
					lBeneficiary1LastName=lMapBeneficiary1AddTry.BeneficiaryLastName
					lBeneficiary1Relationship=lMapBeneficiary1AddTry.BeneficiaryRelationship
					lBeneficiary1Percentage=lMapBeneficiary1AddTry.BeneficiaryPercentage
					lAdditionBeneficiary1Detail=lMapBeneficiary1AddTry.AdditionBeneficiaryDetail
					lIsBeneficiaryAdd=true
				}
			}
			if(!lIsBeneficiary1Add){
				lBeneficiary1Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary1Add)
				lBeneficiary1FirstName=''
				lBeneficiary1LastName=''
				lBeneficiary1Relationship=''
				lBeneficiary1Percentage=''
				lAdditionBeneficiary1Detail=''
			}
			if(lIsBeneficiary2Add){
				Map lMapBeneficiary2AddTry=this.inputBeneficiaryAddTry(lBeneficiary2FirstName,lBeneficiary2LastName,lBeneficiary2RelationshipNum,lBeneficiary2PercentageNum)
				if(!lMapBeneficiary2AddTry.Result){
					lIsBeneficiary2Add=false
				}else{
					lBeneficiary2Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary2Add)
					lBeneficiary2FirstName=lMapBeneficiary2AddTry.BeneficiaryFirstName
					lBeneficiary2LastName=lMapBeneficiary2AddTry.BeneficiaryLastName
					lBeneficiary2Relationship=lMapBeneficiary2AddTry.BeneficiaryRelationship
					lBeneficiary2Percentage=lMapBeneficiary2AddTry.BeneficiaryPercentage
					lAdditionBeneficiary2Detail=lMapBeneficiary2AddTry.AdditionBeneficiaryDetail
					lIsBeneficiaryAdd=true
				}
			}
			if(!lIsBeneficiary2Add){
				lBeneficiary2Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary2Add)
				lBeneficiary2FirstName=''
				lBeneficiary2LastName=''
				lBeneficiary2Relationship=''
				lBeneficiary2Percentage=''
				lAdditionBeneficiary2Detail=''
			}
			if(lIsBeneficiary3Add){
				Map lMapBeneficiary3AddTry=this.inputBeneficiaryAddTry(lBeneficiary3FirstName,lBeneficiary3LastName,lBeneficiary3RelationshipNum,lBeneficiary3PercentageNum)
				if(!lMapBeneficiary3AddTry.Result){
					lIsBeneficiary3Add=false
				}else{
					lBeneficiary3Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary3Add)
					lBeneficiary3FirstName=lMapBeneficiary3AddTry.BeneficiaryFirstName
					lBeneficiary3LastName=lMapBeneficiary3AddTry.BeneficiaryLastName
					lBeneficiary3Relationship=lMapBeneficiary3AddTry.BeneficiaryRelationship
					lBeneficiary3Percentage=lMapBeneficiary3AddTry.BeneficiaryPercentage
					lAdditionBeneficiary3Detail=lMapBeneficiary3AddTry.AdditionBeneficiaryDetail
					lIsBeneficiaryAdd=true
				}
			}
			if(!lIsBeneficiary3Add){
				lBeneficiary3Add=IGNUemaHelper.convertBooleanToString(lIsBeneficiary3Add)
				lBeneficiary3FirstName=''
				lBeneficiary3LastName=''
				lBeneficiary3Relationship=''
				lBeneficiary3Percentage=''
				lAdditionBeneficiary3Detail=''
			}
			if(lIsBeneficiaryAdd){
				String lAdditionBeneficiaryDetailSummary='Summary:'
				String lTagAdditionBeneficiaryDetailList='beneficiary-btn'
				String lLocatorAdditionBeneficiaryDetailList=IGNUemaHelper.getTagDataSeleniumKey(lTagAdditionBeneficiaryDetailList)
				List<WebElement> lElementAdditionBeneficiaryDetailList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagAdditionBeneficiaryDetailList)
				if(lElementAdditionBeneficiaryDetailList){
					for(WebElement lElementAdditionBeneficiaryDetailItem in lElementAdditionBeneficiaryDetailList){
						String lAdditionBeneficiaryDetailSummaryItem=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementAdditionBeneficiaryDetailItem).trim()
						lAdditionBeneficiaryDetailSummary=lAdditionBeneficiaryDetailSummary+'\n'+lAdditionBeneficiaryDetailSummaryItem
					}
					lAdditionBeneficiaryDetailSummary=lAdditionBeneficiaryDetailSummary.trim()
					lAdditionBeneficiaryDetail=lAdditionBeneficiaryDetailSummary
				}
				if(lIsBeneficiary1Add){
					lAdditionBeneficiaryDetail=lAdditionBeneficiaryDetail+'\n'+lAdditionBeneficiary1Detail
				}
				if(lIsBeneficiary2Add){
					lAdditionBeneficiaryDetail=lAdditionBeneficiaryDetail+'\n'+lAdditionBeneficiary2Detail
				}
				if(lIsBeneficiary3Add){
					lAdditionBeneficiaryDetail=lAdditionBeneficiaryDetail+'\n'+lAdditionBeneficiary3Detail
				}
				lAdditionBeneficiaryDetail=lAdditionBeneficiaryDetail.trim()
			}
			lResult=lIsBeneficiaryAdd
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
	public Map inputBeneficiaryAddTry(String strBeneficiaryFirstName,String strBeneficiaryLastName,Integer numBeneficiaryRelationship,Integer numBeneficiaryPercentage){
		Map lreturn=[:]
		String lBeneficiaryFirstName=strBeneficiaryFirstName.trim()
		String lBeneficiaryLastName=strBeneficiaryLastName.trim()
		String lBeneficiaryRelationship=''
		String lBeneficiaryPercentage=''
		String lAdditionBeneficiaryDetail=''
		try{
			Boolean lResult=false
			lreturn.put('BeneficiaryFirstName','')
			lreturn.put('BeneficiaryLastName','')
			lreturn.put('BeneficiaryRelationship','')
			lreturn.put('BeneficiaryPercentage','')
			lreturn.put('AdditionBeneficiaryDetail','')
			lreturn.put('Result',lResult)
			String lTagBeneficiaryAddButton='addBeneficiary'
			String lLocatorBeneficiaryAddButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryAddButton)
			WebElement lElementBeneficiaryAddButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryAddButton)
			if(!lElementBeneficiaryAddButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBeneficiaryAddButton)
			IGNUemaHelper.delayThreadSecond(3)
			String lTagBeneficiaryFirstNameInputText='beneficiary-firstName'
			String lLocatorBeneficiaryFirstNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryFirstNameInputText)
			WebElement lElementBeneficiaryFirstNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryFirstNameInputText)
			if(!lElementBeneficiaryFirstNameInputText){
				return lreturn
			}
			lBeneficiaryFirstName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementBeneficiaryFirstNameInputText,lBeneficiaryFirstName)
			lAdditionBeneficiaryDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionBeneficiaryDetail,lBeneficiaryFirstName)
			String lTagBeneficiaryLastNameInputText='beneficiary-lastName'
			String lLocatorBeneficiaryLastNameInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryLastNameInputText)
			WebElement lElementBeneficiaryLastNameInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryLastNameInputText)
			if(!lElementBeneficiaryLastNameInputText){
				return lreturn
			}
			lBeneficiaryLastName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementBeneficiaryLastNameInputText,lBeneficiaryLastName)
			lAdditionBeneficiaryDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionBeneficiaryDetail,lBeneficiaryLastName)
			String lTagBeneficiaryRelationshipButton='beneficiary-relationship'
			String lLocatorBeneficiaryRelationshipButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryRelationshipButton)
			WebElement lElementBeneficiaryRelationshipButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryRelationshipButton)
			if(!lElementBeneficiaryRelationshipButton){
				return lreturn
			}
			Select lSelectBeneficiaryRelationship=new Select(lElementBeneficiaryRelationshipButton)
			lSelectBeneficiaryRelationship.selectByIndex(numBeneficiaryRelationship)
			WebElement lElementSelectBeneficiaryRelationshipSelected=lSelectBeneficiaryRelationship.getFirstSelectedOption()
			lBeneficiaryRelationship=lElementSelectBeneficiaryRelationshipSelected.getText().trim()
			lAdditionBeneficiaryDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionBeneficiaryDetail,lBeneficiaryRelationship)
			String lTagBeneficiaryPercentageButton='beneficiary-percentage'
			String lLocatorBeneficiaryPercentageButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryPercentageButton)
			WebElement lElementBeneficiaryPercentageButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryPercentageButton)
			if(!lElementBeneficiaryPercentageButton){
				return lreturn
			}
			Select lSelectBeneficiaryPercentage=new Select(lElementBeneficiaryPercentageButton)
			lSelectBeneficiaryPercentage.selectByIndex(numBeneficiaryPercentage)
			WebElement lElementSelectBeneficiaryPercentageSelected=lSelectBeneficiaryPercentage.getFirstSelectedOption()
			lBeneficiaryPercentage=lElementSelectBeneficiaryPercentageSelected.getText().trim()
			lAdditionBeneficiaryDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lAdditionBeneficiaryDetail,lBeneficiaryPercentage)
			String lTagBeneficiaryAddConfirmButton='beneficiary-confirm'
			String lLocatorBeneficiaryAddConfirmButtonButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryAddConfirmButton)
			WebElement lElementBeneficiaryAddConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryAddConfirmButton)
			if(!lElementBeneficiaryAddConfirmButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBeneficiaryAddConfirmButton)
			IGNUemaHelper.delayThreadSecond(3)
			lElementBeneficiaryAddConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryAddConfirmButton)
			lResult=!lElementBeneficiaryAddConfirmButton
			if(!lResult){
				String lTagBeneficiaryAddCancelButton='beneficiary-cancel'
				String lLocatorBeneficiaryAddCancelButtonButton=IGNUemaHelper.getTagDataSeleniumKey(lTagBeneficiaryAddCancelButton)
				WebElement lElementBeneficiaryAddCancelButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagBeneficiaryAddCancelButton)
				if(lElementBeneficiaryAddCancelButton){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementBeneficiaryAddCancelButton)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			if(lResult){
				lreturn.put('BeneficiaryFirstName',lBeneficiaryFirstName)
				lreturn.put('BeneficiaryLastName',lBeneficiaryLastName)
				lreturn.put('BeneficiaryRelationship',lBeneficiaryRelationship)
				lreturn.put('BeneficiaryPercentage',lBeneficiaryPercentage)
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
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THACriticalIllnessQuotationDetail1Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			this.waitUntilOpportunityNumberUpdated()
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
		String lPremiumYearly=''
		String lPremiumDeposit=''
		String lPremiumMonthly=''
		String lPremiumInstalment=''
		String lPremiumNoDepositAmount=''
		String lPremiumNoDepositTotal=''
		String lPremiumQuarterlyAmount=''
		String lPremiumQuarterlyTotal=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('OpportunityNumber','')
			lreturn.put('Result',lResult)
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Boolean lIsActualResult=false
			IGNUemaHelper.webJsScrollToTop(this.driver)
			this.waitUntilOpportunityNumberUpdated()
			lOpportunityNumber=THACriticalIllnessCoreType.CURRENT_QUOTATION_HEALTH_OPPORTUNITY_NUMBER.trim()
			String lTagSelectedPremiumPaymentFrequency='paymentFrequency'
			String lLocatorSelectedPremiumPaymentFrequency=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumPaymentFrequency)
			WebElement lElementSelectedPremiumPaymentFrequency=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumPaymentFrequency)
			if(!lElementSelectedPremiumPaymentFrequency){
				return lreturn
			}
			String lTagSelectedPremiumAmountTotal='totalPremium'
			String lLocatorSelectedPremiumAmountTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountTotal)
			WebElement lElementSelectedPremiumAmountTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountTotal)
			if(!lElementSelectedPremiumAmountTotal){
				return lreturn
			}
			String lTagSelectedPremiumAmountFirst='firstInstalment'
			String lLocatorSelectedPremiumAmountFirst=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountFirst)
			WebElement lElementSelectedPremiumAmountFirst=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountFirst)
			if(!lElementSelectedPremiumAmountFirst){
				return lreturn
			}
			String lTagSelectedPremiumAmountNext='instalment'
			String lLocatorSelectedPremiumAmountNext=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedPremiumAmountNext)
			WebElement lElementSelectedPremiumAmountNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedPremiumAmountNext)
			if(!lElementSelectedPremiumAmountNext){
				return lreturn
			}
			Boolean lIsSelectedPremiumPaymentFrequencyAsYearly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('YEARLY')
			lPremiumYearly='No Option'
			lPremiumDeposit='No Option'
			lPremiumMonthly='No Option'
			lPremiumInstalment='No Option'
			lPremiumNoDepositAmount='No Option'
			lPremiumNoDepositTotal='No Option'
			lPremiumQuarterlyAmount='No Option'
			lPremiumQuarterlyTotal='No Option'
			if(lIsSelectedPremiumPaymentFrequencyAsYearly){
				String lPremiumYearlyTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lPremiumYearlyTotalValueFloat=IGNUemaHelper.convertStringToFloat(lPremiumYearlyTotalValueText,0)
				String lPremiumYearlyTotalString='YearlyTotal='+lPremiumYearlyTotalValueText
				lPremiumYearly=lPremiumYearlyTotalString
			}else{
				Boolean lIsSelectedPremiumPaymentFrequencyAsWithDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('MONTHLY')
				Boolean lIsSelectedPremiumPaymentFrequencyAsNoDeposit=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('NO DEPOSIT')
				Boolean lIsSelectedPremiumPaymentFrequencyAsQuarterly=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumPaymentFrequency).toUpperCase().contains('QUARTERLY')
				String lSelectedPremiumAmountTotalValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountTotal).trim()
				Float lSelectedPremiumAmountTotalValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountTotalValueText,0)
				Float lSelectedPremiumAmountTotalValueNumCal=0
				String lSelectedPremiumAmountFirstValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountFirst).trim()
				Float lSelectedPremiumAmountFirstValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountFirstValueText,0)
				String lSelectedPremiumAmountNextValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedPremiumAmountNext).trim()
				Float lSelectedPremiumAmountNextValueFloat=IGNUemaHelper.convertStringToFloat(lSelectedPremiumAmountNextValueText,0)
				if(lIsSelectedPremiumPaymentFrequencyAsWithDeposit){
					lPremiumDeposit=lSelectedPremiumAmountFirstValueText
					lPremiumMonthly=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=lSelectedPremiumAmountFirstValueFloat+(lSelectedPremiumAmountNextValueFloat*11)
					lPremiumInstalment=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsNoDeposit){
					lPremiumNoDepositAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*12)
					lPremiumNoDepositTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else if(lIsSelectedPremiumPaymentFrequencyAsQuarterly){
					lPremiumQuarterlyAmount=lSelectedPremiumAmountNextValueText
					lSelectedPremiumAmountTotalValueNumCal=(lSelectedPremiumAmountNextValueFloat*4)
					lPremiumQuarterlyTotal=IGNUemaHelper.concatMessageLeftRightByPipe('Total='+lSelectedPremiumAmountTotalValueText,'Cal='+lSelectedPremiumAmountTotalValueNumCal.toString())
				}else{
					return lreturn
				}
			}
			String lTagInstalmentOpen='btn-head-installment'
			String lLocatorInstalmentOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagInstalmentOpen)
			if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorInstalmentOpen)){
				IGNUemaHelper.delayThreadSecond(3)
				String lTagInstallmentCloseButton='installment-modal-close'
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
			}
			lOpportunityNumber=lOpportunityNumber+'\nPremiumYearly:'+lPremiumYearly
			lOpportunityNumber=lOpportunityNumber+'\nPremiumDeposit:'+lPremiumDeposit
			lOpportunityNumber=lOpportunityNumber+'\nPremiumMonthly:'+lPremiumMonthly
			lOpportunityNumber=lOpportunityNumber+'\nPremiumInstalment:'+lPremiumInstalment
			lOpportunityNumber=lOpportunityNumber+'\nPremiumNoDepositAmount:'+lPremiumNoDepositAmount
			lOpportunityNumber=lOpportunityNumber+'\nPremiumNoDepositTotal:'+lPremiumNoDepositTotal
			lOpportunityNumber=lOpportunityNumber+'\nPremiumQuarterlyAmount:'+lPremiumQuarterlyAmount
			lOpportunityNumber=lOpportunityNumber+'\nPremiumQuarterlyTotal:'+lPremiumQuarterlyTotal
			lOpportunityNumber=lOpportunityNumber.trim()
			IGNUemaHelper.webJsScrollToBottom(this.driver)
			String lTagDisclaimerButton='disclaimer'
			String lLocatorDisclaimerButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDisclaimerButton)
			WebElement lElementDisclaimerButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDisclaimerButton)
			if(lElementDisclaimerButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementDisclaimerButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDisclaimerButton)
			}
			String lTagEnterPaymentButton='enter-payment'
			String lLocatorEnterPaymentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagEnterPaymentButton)
			WebElement lElementEnterPaymentButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagEnterPaymentButton)
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementEnterPaymentButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementEnterPaymentButton)
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			String lLocatorPriceChangeModalForm='#price-change-modal'
			Boolean lIsPriceChangeModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPriceChangeModalForm,10)
			lIsPriceChangeModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPriceChangeModalForm)
			if(lIsPriceChangeModalFormDisplayed){
				String lPriceChangeMessageText=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorPriceChangeModalForm).trim()
				lOpportunityNumber=lOpportunityNumber+'\n'+lPriceChangeMessageText
				lOpportunityNumber=lOpportunityNumber.trim()
				String lTagPriceChangeConfirmButton='priceChanged-confirm'
				String lLocatorPriceChangeConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPriceChangeConfirmButton)
				WebElement lElementPriceChangeConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPriceChangeConfirmButton)
				if(lElementPriceChangeConfirmButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPriceChangeConfirmButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPriceChangeConfirmButton)
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
				}
			}
			String lLocatorPaymentDocument='#illness-payment'
			if(!isSkipOTP){
				String lTagOTPModalForm='otp-modal'
				String lLocatorOTPModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPModalForm)
				Boolean lIsOTPModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOTPModalForm,15)
				lIsOTPModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorOTPModalForm)
				if(!lIsOTPModalFormDisplayed){
					if(isPositiveCase){
						lIsActualResult=false
					}else{
						lIsActualResult=true
					}
				}else{
					String lOTPMessageText=THARoojaiWebsite.OTPRoojaiWebsiteByPhoneNo(lHolderPhoneNo,true)
					String lTagOTPInputText='otp'
					String lLocatorOTPInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPInputText)
					String lOTPResponseText=IGNUemaHelper.typeTextByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorOTPModalForm,lLocatorOTPInputText),lOTPMessageText)
					if(lOTPResponseText.length()>0){
						String lTagOTPConfirmButton='otp-verify'
						String lLocatorOTPConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPConfirmButton)
						if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorOTPModalForm,lLocatorOTPConfirmButton))){
							IGNUemaHelper.delayThreadSecond(1)
							Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
							if(isPositiveCase){
								lIsActualResult=lRedirected
							}else{
								String lTagValidateQuote='refuse-modal'
								String lLocatorValidateQuote=IGNUemaHelper.getTagDataSeleniumKey(lTagValidateQuote)
								Boolean lIsValidateQuoteModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorValidateQuote,15)
								lIsValidateQuoteModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorValidateQuote)
								if(lIsValidateQuoteModalFormDisplayed){
									return lreturn
								}else{
									lIsActualResult=!lRedirected
								}
							}
						}else{
							if(isPositiveCase){
								lIsActualResult=false
							}else{
								lIsActualResult=true
							}
						}
					}else{
						if(isPositiveCase){
							lIsActualResult=false
						}else{
							lIsActualResult=true
						}
					}
				}
			}else{
				IGNUemaHelper.delayThreadSecond(1)
				Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
				if(isPositiveCase){
					lIsActualResult=lRedirected
				}else{
					lIsActualResult=!lRedirected
				}
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
			lResult=lActualResult.length()>0
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