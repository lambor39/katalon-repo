package org.roojai.tha.types.myaccount.newbiz
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAMyAccountNewbizMainUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMyAccountNewbizMainUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputCase(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseInput.BaseUrl.toString().trim()
		String lMaximizeMode=caseInput.MaximizeMode.toString().trim()
		String lWithAuth=caseInput.WithAuth.toString().trim()
		String lAuthUser=caseInput.AuthUser.toString().trim()
		String lAuthPassword=caseInput.AuthPassword.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lMenuPaymentToDo=caseInput.MenuPaymentToDo.toString().trim()
		String lMenuPaymentOpenTermAndCondition=caseInput.MenuPaymentOpenTermAndCondition.toString().trim()
		String lMenuPaymentChangeCreditCard=caseInput.MenuPaymentChangeCreditCard.toString().trim()
		String lMenuPaymentMakePaymentCardOld=caseInput.MenuPaymentMakePaymentCardOld.toString().trim()
		String lMenuPaymentMakePaymentCardNew=caseInput.MenuPaymentMakePaymentCardNew.toString().trim()
		String lMenuProfileToDo=caseInput.MenuProfileToDo.toString().trim()
		String lMenuProfilePositiveCase=caseInput.MenuProfilePositiveCase.toString().trim()
		String lProfileMaritalStatus=caseInput.ProfileMaritalStatus.toString().trim()
		String lProfilePreferredLanguage=caseInput.ProfilePreferredLanguage.toString().trim()
		String lProfileOccupation=caseInput.ProfileOccupation.toString().trim()
		String lProfileAddressHouseBuildingNumber=caseInput.ProfileAddressHouseBuildingNumber.toString().trim()
		String lProfileAddressVillage=caseInput.ProfileAddressVillage.toString().trim()
		String lProfileAddressSoiRoad=caseInput.ProfileAddressSoiRoad.toString().trim()
		String lProfileAddressPostcode=caseInput.ProfileAddressPostcode.toString().trim()
		String lProfileAddressProvince=caseInput.ProfileAddressProvince.toString().trim()
		String lProfileAddressDistrict=caseInput.ProfileAddressDistrict.toString().trim()
		String lProfileAddressSubdistrict=caseInput.ProfileAddressSubdistrict.toString().trim()
		String lProfileTelephoneNumber=caseInput.ProfileTelephoneNumber.toString().trim()
		String lProfileEmail=caseInput.ProfileEmail.toString().trim()
		String lMenuPolicyToDo=caseInput.MenuPolicyToDo.toString().trim()
		String lMenuPolicyCardSelectProductMotor=caseInput.MenuPolicyCardSelectProductMotor.toString().trim()
		String lMenuPolicyCardSelectProductHealth=caseInput.MenuPolicyCardSelectProductHealth.toString().trim()
		String lMenuPolicyDetailHistoryToDo=caseInput.MenuPolicyDetailHistoryToDo.toString().trim()
		String lMenuPolicyDetailDocDownloadToDo=caseInput.MenuPolicyDetailDocDownloadToDo.toString().trim()
		String lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=caseInput.MenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo.toString().trim()
		String lMenuPolicyDetailPaymentToDo=caseInput.MenuPolicyDetailPaymentToDo.toString().trim()
		String lMenuPolicyDetailPaymentOpenTermAndConditionToDo=caseInput.MenuPolicyDetailPaymentOpenTermAndConditionToDo.toString().trim()
		String lMenuPolicyDetailTaxDeductionToDo=caseInput.MenuPolicyDetailTaxDeductionToDo.toString().trim()
		String lMenuPolicyDetailTaxDeductionAccept=caseInput.MenuPolicyDetailTaxDeductionAccept.toString().trim()
		String lMenuPolicyDetailTaxDeductionEditToDo=caseInput.MenuPolicyDetailTaxDeductionEditToDo.toString().trim()
		String lMenuPolicyDetailTaxDeductionEditHolderIsThai=caseInput.MenuPolicyDetailTaxDeductionEditHolderIsThai.toString().trim()
		String lMenuPolicyDetailTaxDeductionEditName=caseInput.MenuPolicyDetailTaxDeductionEditName.toString().trim()
		String lMenuPolicyDetailTaxDeductionEditSurname=caseInput.MenuPolicyDetailTaxDeductionEditSurname.toString().trim()
		String lMenuPolicyDetailTaxDeductionEditIdentificationNumber=caseInput.MenuPolicyDetailTaxDeductionEditIdentificationNumber.toString().trim()
		String lMenuPolicyDetailECareCardToDo=caseInput.MenuPolicyDetailECareCardToDo.toString().trim()
		String lMenuPolicyCompulsoryBuyCardToDo=caseInput.MenuPolicyCompulsoryBuyCardToDo.toString().trim()
		String lMenuClaimToDo=caseInput.MenuClaimToDo.toString().trim()
		String lMenuClaimDetailNonClosureToDo=caseInput.MenuClaimDetailNonClosureToDo.toString().trim()
		String lMenuClaimDetailClosureStatusToDo=caseInput.MenuClaimDetailClosureStatusToDo.toString().trim()
		String lMenuClaimDetailClosureStatusUpdate=caseInput.MenuClaimDetailClosureStatusUpdate.toString().trim()
		String lMenuDocDownloadToDo=caseInput.MenuDocDownloadToDo.toString().trim()
		String lMenuDocDownloadOpenInsuranceHandbook=caseInput.MenuDocDownloadOpenInsuranceHandbook.toString().trim()
		String lMenuDocDownloadCardToDo=caseInput.MenuDocDownloadCardToDo.toString().trim()
		String lMenuContactSupportToDo=caseInput.MenuContactSupportToDo.toString().trim()
		String lMenuContactSupportSubjectRenewalToDo=caseInput.MenuContactSupportSubjectRenewalToDo.toString().trim()
		String lMenuContactSupportSubjectPolicyToDo=caseInput.MenuContactSupportSubjectPolicyToDo.toString().trim()
		String lMenuContactSupportSubjectClaimToDo=caseInput.MenuContactSupportSubjectClaimToDo.toString().trim()
		String lMenuContactSupportSubjectEnquiryClaimHandlerToDo=caseInput.MenuContactSupportSubjectEnquiryClaimHandlerToDo.toString().trim()
		String lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=caseInput.MenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.toString().trim()
		String lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=caseInput.MenuContactSupportSubjectEnquiryReimbursementStatusToDo.toString().trim()
		String lMenuContactSupportSubjectDeleteAccountToDo=caseInput.MenuContactSupportSubjectDeleteAccountToDo.toString().trim()
		String lMenuContactSupportSubjectRequestPolicyDocumentsToDo=caseInput.MenuContactSupportSubjectRequestPolicyDocumentsToDo.toString().trim()
		String lMenuInspectionToDo=caseInput.MenuInspectionToDo.toString().trim()
		String lMenuFindGarageToDo=caseInput.MenuFindGarageToDo.toString().trim()
		String lMenuGetQuoteToDo=caseInput.MenuGetQuoteToDo.toString().trim()
		String lMenuGetQuoteSelectProductMotor=caseInput.MenuGetQuoteSelectProductMotor.toString().trim()
		String lMenuGetQuoteSelectProductHealth=caseInput.MenuGetQuoteSelectProductHealth.toString().trim()
		String lMenuReferFriendToDo=caseInput.MenuReferFriendToDo.toString().trim()
		String lMenuReferFriendName=caseInput.MenuReferFriendName.toString().trim()
		String lMenuReferFriendMobile=caseInput.MenuReferFriendMobile.toString().trim()
		String lMenuReferFriendEmail=caseInput.MenuReferFriendEmail.toString().trim()
		String lMenuFindNetworkHospitalToDo=caseInput.MenuFindNetworkHospitalToDo.toString().trim()
		String lMenuRoojaiRewardToDo=caseInput.MenuRoojaiRewardToDo.toString().trim()
		String lMenuRoojaiRewardName=caseInput.MenuRoojaiRewardName.toString().trim()
		String lMenuRoojaiRewardMobile=caseInput.MenuRoojaiRewardMobile.toString().trim()
		String lMenuRoojaiRewardEmail=caseInput.MenuRoojaiRewardEmail.toString().trim()
		String lMenuRoojaiRewardVoucherAllToDo=caseInput.MenuRoojaiRewardVoucherAllToDo.toString().trim()
		String lMenuRoojaiRewardVoucherInsuranceProductToDo=caseInput.MenuRoojaiRewardVoucherInsuranceProductToDo.toString().trim()
		String lMenuRoojaiRewardVoucherCharityToDo=caseInput.MenuRoojaiRewardVoucherCharityToDo.toString().trim()
		String lMenuRoojaiRewardVoucherPetrolToDo=caseInput.MenuRoojaiRewardVoucherPetrolToDo.toString().trim()
		String lMenuRoojaiRewardVoucherKangarooToDo=caseInput.MenuRoojaiRewardVoucherKangarooToDo.toString().trim()
		String lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=caseInput.MenuRoojaiRewardVoucherTravelAndLifestyleToDo.toString().trim()
		String lMenuRoojaiRewardVoucherFoodAndBeverageToDo=caseInput.MenuRoojaiRewardVoucherFoodAndBeverageToDo.toString().trim()
		String lMenuRoojaiRewardVoucherShoppingToDo=caseInput.MenuRoojaiRewardVoucherShoppingToDo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lActualAccountName=''
		String lPaymentTermAndCondition=''
		String lPaymentCardItemDetail=''
		String lPaymentCardItemChangeCreditCardDetail=''
		String lPaymentCardItemChangeCreditCardResult=''
		String lPaymentCardItemMakePaymentCardOldDetail=''
		String lPaymentCardItemMakePaymentCardOldResult=''
		String lPaymentCardItemMakePaymentCardNewDetail=''
		String lPaymentCardItemMakePaymentCardNewResult=''
		String lProfileEditDetail=''
		String lProfileEditResult=''
		String lPolicyItem01DetailCardSelectedProductName=''
		String lPolicyItem01DetailCardSelectedId=''
		String lPolicyItem01DetailCardSelectedDetail=''
		String lPolicyItem01DetailAdditionalDetail=''
		String lPolicyItem01DetailHistoryToDo=''
		String lPolicyItem01DetailHistoryDetail=''
		String lPolicyItem01DetailPaymentToDo=''
		String lPolicyItem01DetailPaymentCardId=''
		String lPolicyItem01DetailPaymentDetail=''
		String lPolicyItem01DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem01DetailPaymentTermAndCondition=''
		String lPolicyItem01DetailDocDownloadToDo=''
		String lPolicyItem01DetailDocDownloadDetail=''
		String lPolicyItem01DetailDocDownloadResult=''
		String lPolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem01DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem01DetailTaxDeductionToDo=''
		String lPolicyItem01DetailTaxDeductionDetail=''
		String lPolicyItem01DetailTaxDeductionResult=''
		String lPolicyItem01DetailECareCardToDo=''
		String lPolicyItem01DetailECareCardDetail=''
		String lPolicyItem01DetailECareCardResult=''
		String lPolicyItem02DetailCardSelectedProductName=''
		String lPolicyItem02DetailCardSelectedId=''
		String lPolicyItem02DetailCardSelectedDetail=''
		String lPolicyItem02DetailAdditionalDetail=''
		String lPolicyItem02DetailHistoryToDo=''
		String lPolicyItem02DetailHistoryDetail=''
		String lPolicyItem02DetailPaymentToDo=''
		String lPolicyItem02DetailPaymentCardId=''
		String lPolicyItem02DetailPaymentDetail=''
		String lPolicyItem02DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem02DetailPaymentTermAndCondition=''
		String lPolicyItem02DetailDocDownloadToDo=''
		String lPolicyItem02DetailDocDownloadDetail=''
		String lPolicyItem02DetailDocDownloadResult=''
		String lPolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem02DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem02DetailTaxDeductionToDo=''
		String lPolicyItem02DetailTaxDeductionDetail=''
		String lPolicyItem02DetailTaxDeductionResult=''
		String lPolicyItem02DetailECareCardToDo=''
		String lPolicyItem02DetailECareCardDetail=''
		String lPolicyItem02DetailECareCardResult=''
		String lPolicyItem03DetailCardSelectedProductName=''
		String lPolicyItem03DetailCardSelectedId=''
		String lPolicyItem03DetailCardSelectedDetail=''
		String lPolicyItem03DetailAdditionalDetail=''
		String lPolicyItem03DetailHistoryToDo=''
		String lPolicyItem03DetailHistoryDetail=''
		String lPolicyItem03DetailPaymentToDo=''
		String lPolicyItem03DetailPaymentCardId=''
		String lPolicyItem03DetailPaymentDetail=''
		String lPolicyItem03DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem03DetailPaymentTermAndCondition=''
		String lPolicyItem03DetailDocDownloadToDo=''
		String lPolicyItem03DetailDocDownloadDetail=''
		String lPolicyItem03DetailDocDownloadResult=''
		String lPolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem03DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem03DetailTaxDeductionToDo=''
		String lPolicyItem03DetailTaxDeductionDetail=''
		String lPolicyItem03DetailTaxDeductionResult=''
		String lPolicyItem03DetailECareCardToDo=''
		String lPolicyItem03DetailECareCardDetail=''
		String lPolicyItem03DetailECareCardResult=''
		String lPolicyItem04DetailCardSelectedProductName=''
		String lPolicyItem04DetailCardSelectedId=''
		String lPolicyItem04DetailCardSelectedDetail=''
		String lPolicyItem04DetailAdditionalDetail=''
		String lPolicyItem04DetailHistoryToDo=''
		String lPolicyItem04DetailHistoryDetail=''
		String lPolicyItem04DetailPaymentToDo=''
		String lPolicyItem04DetailPaymentCardId=''
		String lPolicyItem04DetailPaymentDetail=''
		String lPolicyItem04DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem04DetailPaymentTermAndCondition=''
		String lPolicyItem04DetailDocDownloadToDo=''
		String lPolicyItem04DetailDocDownloadDetail=''
		String lPolicyItem04DetailDocDownloadResult=''
		String lPolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem04DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem04DetailTaxDeductionToDo=''
		String lPolicyItem04DetailTaxDeductionDetail=''
		String lPolicyItem04DetailTaxDeductionResult=''
		String lPolicyItem04DetailECareCardToDo=''
		String lPolicyItem04DetailECareCardDetail=''
		String lPolicyItem04DetailECareCardResult=''
		String lPolicyItem05DetailCardSelectedProductName=''
		String lPolicyItem05DetailCardSelectedId=''
		String lPolicyItem05DetailCardSelectedDetail=''
		String lPolicyItem05DetailAdditionalDetail=''
		String lPolicyItem05DetailHistoryToDo=''
		String lPolicyItem05DetailHistoryDetail=''
		String lPolicyItem05DetailPaymentToDo=''
		String lPolicyItem05DetailPaymentCardId=''
		String lPolicyItem05DetailPaymentDetail=''
		String lPolicyItem05DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem05DetailPaymentTermAndCondition=''
		String lPolicyItem05DetailDocDownloadToDo=''
		String lPolicyItem05DetailDocDownloadDetail=''
		String lPolicyItem05DetailDocDownloadResult=''
		String lPolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem05DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem05DetailTaxDeductionToDo=''
		String lPolicyItem05DetailTaxDeductionDetail=''
		String lPolicyItem05DetailTaxDeductionResult=''
		String lPolicyItem05DetailECareCardToDo=''
		String lPolicyItem05DetailECareCardDetail=''
		String lPolicyItem05DetailECareCardResult=''
		String lPolicyItem06DetailCardSelectedProductName=''
		String lPolicyItem06DetailCardSelectedId=''
		String lPolicyItem06DetailCardSelectedDetail=''
		String lPolicyItem06DetailAdditionalDetail=''
		String lPolicyItem06DetailHistoryToDo=''
		String lPolicyItem06DetailHistoryDetail=''
		String lPolicyItem06DetailPaymentToDo=''
		String lPolicyItem06DetailPaymentCardId=''
		String lPolicyItem06DetailPaymentDetail=''
		String lPolicyItem06DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem06DetailPaymentTermAndCondition=''
		String lPolicyItem06DetailDocDownloadToDo=''
		String lPolicyItem06DetailDocDownloadDetail=''
		String lPolicyItem06DetailDocDownloadResult=''
		String lPolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem06DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem06DetailTaxDeductionToDo=''
		String lPolicyItem06DetailTaxDeductionDetail=''
		String lPolicyItem06DetailTaxDeductionResult=''
		String lPolicyItem06DetailECareCardToDo=''
		String lPolicyItem06DetailECareCardDetail=''
		String lPolicyItem06DetailECareCardResult=''
		String lPolicyItem07DetailCardSelectedProductName=''
		String lPolicyItem07DetailCardSelectedId=''
		String lPolicyItem07DetailCardSelectedDetail=''
		String lPolicyItem07DetailAdditionalDetail=''
		String lPolicyItem07DetailHistoryToDo=''
		String lPolicyItem07DetailHistoryDetail=''
		String lPolicyItem07DetailPaymentToDo=''
		String lPolicyItem07DetailPaymentCardId=''
		String lPolicyItem07DetailPaymentDetail=''
		String lPolicyItem07DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem07DetailPaymentTermAndCondition=''
		String lPolicyItem07DetailDocDownloadToDo=''
		String lPolicyItem07DetailDocDownloadDetail=''
		String lPolicyItem07DetailDocDownloadResult=''
		String lPolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem07DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem07DetailTaxDeductionToDo=''
		String lPolicyItem07DetailTaxDeductionDetail=''
		String lPolicyItem07DetailTaxDeductionResult=''
		String lPolicyItem07DetailECareCardToDo=''
		String lPolicyItem07DetailECareCardDetail=''
		String lPolicyItem07DetailECareCardResult=''
		String lPolicyItem08DetailCardSelectedProductName=''
		String lPolicyItem08DetailCardSelectedId=''
		String lPolicyItem08DetailCardSelectedDetail=''
		String lPolicyItem08DetailAdditionalDetail=''
		String lPolicyItem08DetailHistoryToDo=''
		String lPolicyItem08DetailHistoryDetail=''
		String lPolicyItem08DetailPaymentToDo=''
		String lPolicyItem08DetailPaymentCardId=''
		String lPolicyItem08DetailPaymentDetail=''
		String lPolicyItem08DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem08DetailPaymentTermAndCondition=''
		String lPolicyItem08DetailDocDownloadToDo=''
		String lPolicyItem08DetailDocDownloadDetail=''
		String lPolicyItem08DetailDocDownloadResult=''
		String lPolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem08DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem08DetailTaxDeductionToDo=''
		String lPolicyItem08DetailTaxDeductionDetail=''
		String lPolicyItem08DetailTaxDeductionResult=''
		String lPolicyItem08DetailECareCardToDo=''
		String lPolicyItem08DetailECareCardDetail=''
		String lPolicyItem08DetailECareCardResult=''
		String lPolicyItem09DetailCardSelectedProductName=''
		String lPolicyItem09DetailCardSelectedId=''
		String lPolicyItem09DetailCardSelectedDetail=''
		String lPolicyItem09DetailAdditionalDetail=''
		String lPolicyItem09DetailHistoryToDo=''
		String lPolicyItem09DetailHistoryDetail=''
		String lPolicyItem09DetailPaymentToDo=''
		String lPolicyItem09DetailPaymentCardId=''
		String lPolicyItem09DetailPaymentDetail=''
		String lPolicyItem09DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem09DetailPaymentTermAndCondition=''
		String lPolicyItem09DetailDocDownloadToDo=''
		String lPolicyItem09DetailDocDownloadDetail=''
		String lPolicyItem09DetailDocDownloadResult=''
		String lPolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem09DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem09DetailTaxDeductionToDo=''
		String lPolicyItem09DetailTaxDeductionDetail=''
		String lPolicyItem09DetailTaxDeductionResult=''
		String lPolicyItem09DetailECareCardToDo=''
		String lPolicyItem09DetailECareCardDetail=''
		String lPolicyItem09DetailECareCardResult=''
		String lPolicyItem10DetailCardSelectedProductName=''
		String lPolicyItem10DetailCardSelectedId=''
		String lPolicyItem10DetailCardSelectedDetail=''
		String lPolicyItem10DetailAdditionalDetail=''
		String lPolicyItem10DetailHistoryToDo=''
		String lPolicyItem10DetailHistoryDetail=''
		String lPolicyItem10DetailPaymentToDo=''
		String lPolicyItem10DetailPaymentCardId=''
		String lPolicyItem10DetailPaymentDetail=''
		String lPolicyItem10DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem10DetailPaymentTermAndCondition=''
		String lPolicyItem10DetailDocDownloadToDo=''
		String lPolicyItem10DetailDocDownloadDetail=''
		String lPolicyItem10DetailDocDownloadResult=''
		String lPolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem10DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem10DetailTaxDeductionToDo=''
		String lPolicyItem10DetailTaxDeductionDetail=''
		String lPolicyItem10DetailTaxDeductionResult=''
		String lPolicyItem10DetailECareCardToDo=''
		String lPolicyItem10DetailECareCardDetail=''
		String lPolicyItem10DetailECareCardResult=''
		String lPolicyCardSelectProductLineResult=''
		String lPolicyCompulsoryBuyCardId=''
		String lPolicyCompulsoryBuyCardDetail=''
		String lPolicyCompulsoryBuyPaymentDetail=''
		String lPolicyCompulsoryBuyPaymentResult=''
		String lClaimDetailNonClosureCardSelectedId=''
		String lClaimDetailNonClosureCardSelectedDetail=''
		String lClaimDetailClosureStatusCardSelectedId=''
		String lClaimDetailClosureStatusCardSelectedDetail=''
		String lDocDownloadInsuranceHandbook=''
		String lDocDownloadCardSelectedId=''
		String lDocDownloadCardSelectedDetail=''
		String lDocDownloadCardSelectedResult=''
		String lContactSupportSubjectRenewalDetail=''
		String lContactSupportSubjectRenewalResult=''
		String lContactSupportSubjectPolicyDetail=''
		String lContactSupportSubjectPolicyResult=''
		String lContactSupportSubjectClaimDetail=''
		String lContactSupportSubjectClaimResult=''
		String lContactSupportSubjectEnquiryClaimHandlerDetail=''
		String lContactSupportSubjectEnquiryClaimHandlerResult=''
		String lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=''
		String lContactSupportSubjectEnquiryVehicleAssessmentStatusResult=''
		String lContactSupportSubjectEnquiryReimbursementStatusDetail=''
		String lContactSupportSubjectEnquiryReimbursementStatusResult=''
		String lContactSupportSubjectDeleteAccountDetail=''
		String lContactSupportSubjectDeleteAccountResult=''
		String lContactSupportSubjectRequestPolicyDocumentsDetail=''
		String lContactSupportSubjectRequestPolicyDocumentsResult=''
		String lInspectionDetail=''
		String lInspectionResult=''
		String lFindGarageDetail=''
		String lFindGarageResult=''
		String lGetQuoteItem01Detail=''
		String lGetQuoteItem01Result=''
		String lGetQuoteItem02Detail=''
		String lGetQuoteItem02Result=''
		String lGetQuoteItem03Detail=''
		String lGetQuoteItem03Result=''
		String lGetQuoteItem04Detail=''
		String lGetQuoteItem04Result=''
		String lGetQuoteItem05Detail=''
		String lGetQuoteItem05Result=''
		String lGetQuoteItem06Detail=''
		String lGetQuoteItem06Result=''
		String lGetQuoteItem07Detail=''
		String lGetQuoteItem07Result=''
		String lGetQuoteItem08Detail=''
		String lGetQuoteItem08Result=''
		String lGetQuoteItem09Detail=''
		String lGetQuoteItem09Result=''
		String lGetQuoteItem10Detail=''
		String lGetQuoteItem10Result=''
		String lGetQuoteSelectProductLineResult=''
		String lReferFriendDetail=''
		String lReferFriendReferLink=''
		String lReferFriendReferCode=''
		String lReferFriendResult=''
		String lFindNetworkHospitalDetail=''
		String lFindNetworkHospitalResult=''
		String lRoojaiRewardMyPointSummaryBefore=''
		String lRoojaiRewardMyPointBalanceBefore=''
		String lRoojaiRewardMyPointPendingBefore=''
		String lRoojaiRewardMyPointAvailableBefore=''
		String lRoojaiRewardMyPointTotalBefore=''
		String lRoojaiRewardMyRewardBefore=''
		String lRoojaiRewardMyHistoryBefore=''
		String lRoojaiRewardMyPointSummaryAfter=''
		String lRoojaiRewardMyPointBalanceAfter=''
		String lRoojaiRewardMyPointPendingAfter=''
		String lRoojaiRewardMyPointAvailableAfter=''
		String lRoojaiRewardMyPointTotalAfter=''
		String lRoojaiRewardMyRewardAfter=''
		String lRoojaiRewardMyHistoryAfter=''
		String lRoojaiRewardVoucherAllDetail=''
		String lRoojaiRewardVoucherAllAdditional=''
		String lRoojaiRewardVoucherAllResult=''
		String lRoojaiRewardVoucherInsuranceProductDetail=''
		String lRoojaiRewardVoucherInsuranceProductAdditional=''
		String lRoojaiRewardVoucherInsuranceProductResult=''
		String lRoojaiRewardVoucherCharityDetail=''
		String lRoojaiRewardVoucherCharityAdditional=''
		String lRoojaiRewardVoucherCharityResult=''
		String lRoojaiRewardVoucherPetrolDetail=''
		String lRoojaiRewardVoucherPetrolAdditional=''
		String lRoojaiRewardVoucherPetrolResult=''
		String lRoojaiRewardVoucherKangarooDetail=''
		String lRoojaiRewardVoucherKangarooAdditional=''
		String lRoojaiRewardVoucherKangarooResult=''
		String lRoojaiRewardVoucherTravelAndLifestyleDetail=''
		String lRoojaiRewardVoucherTravelAndLifestyleAdditional=''
		String lRoojaiRewardVoucherTravelAndLifestyleResult=''
		String lRoojaiRewardVoucherFoodAndBeverageDetail=''
		String lRoojaiRewardVoucherFoodAndBeverageAdditional=''
		String lRoojaiRewardVoucherFoodAndBeverageResult=''
		String lRoojaiRewardVoucherShoppingDetail=''
		String lRoojaiRewardVoucherShoppingAdditional=''
		String lRoojaiRewardVoucherShoppingResult=''
		String lRoojaiRewardResult=''
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
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapActualAccountName=this.inputActualAccountName(lActualAccountName)
			if(!lMapActualAccountName.Result){
				lActualAccountName=''
			}else{
				lActualAccountName=lMapActualAccountName.ActualAccountName
			}
			caseOutput.ActualAccountName=lActualAccountName
			if(lActualAccountName.length()<=0){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
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
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuPaymentToDo=this.inputMenuPaymentToDo(lMenuPaymentToDo)
			if(!lMapMenuPaymentToDo.Result){
				lMenuPaymentToDo=''
			}else{
				lMenuPaymentToDo=lMapMenuPaymentToDo.MenuPaymentToDo
			}
			caseOutput.MenuPaymentToDo=lMenuPaymentToDo
			if(lMenuPaymentToDo.length()<=0){
				return lreturn
			}
			Boolean lIsMenuPaymentToDo=IGNUemaHelper.convertStringToBoolean(lMenuPaymentToDo)
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			if(lIsMenuPaymentToDo){
				Map lMapMenuPaymentOpenTermAndCondition=this.inputMenuPaymentOpenTermAndCondition(lMenuPaymentOpenTermAndCondition,lPaymentTermAndCondition)
				if(!lMapMenuPaymentOpenTermAndCondition.Result){
					lMenuPaymentOpenTermAndCondition=''
					lPaymentTermAndCondition=''
				}else{
					lMenuPaymentOpenTermAndCondition=lMapMenuPaymentOpenTermAndCondition.MenuPaymentOpenTermAndCondition
					lPaymentTermAndCondition=lMapMenuPaymentOpenTermAndCondition.PaymentTermAndCondition
				}
				caseOutput.MenuPaymentOpenTermAndCondition=lMenuPaymentOpenTermAndCondition
				caseOutput.PaymentTermAndCondition=lPaymentTermAndCondition
				if(!lMapMenuPaymentOpenTermAndCondition.Result){
					return lreturn
				}
				Boolean lIsMenuPaymentOpenTermAndCondition=IGNUemaHelper.convertStringToBoolean(lMenuPaymentOpenTermAndCondition)
				if(lIsMenuPaymentOpenTermAndCondition){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPaymentOpenTermAndCondition
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPaymentTermAndCondition.length()>0
				}
				Map lMapPaymentCardItemDetail=this.inputPaymentCardItemDetail(lPaymentCardItemDetail)
				if(!lMapPaymentCardItemDetail.Result){
					lPaymentCardItemDetail=''
				}else{
					lPaymentCardItemDetail=lMapPaymentCardItemDetail.PaymentCardItemDetail
				}
				caseOutput.PaymentCardItemDetail=lPaymentCardItemDetail
				Map lMapMenuPaymentChangeCreditCard=this.inputMenuPaymentChangeCreditCard(lMenuPaymentChangeCreditCard)
				if(!lMapMenuPaymentChangeCreditCard.Result){
					lMenuPaymentChangeCreditCard=''
					lPaymentCardItemChangeCreditCardDetail=''
					lPaymentCardItemChangeCreditCardResult=''
				}else{
					lMenuPaymentChangeCreditCard=lMapMenuPaymentChangeCreditCard.MenuPaymentChangeCreditCard
					lPaymentCardItemChangeCreditCardDetail=lMapMenuPaymentChangeCreditCard.PaymentCardItemChangeCreditCardDetail
					lPaymentCardItemChangeCreditCardResult=lMapMenuPaymentChangeCreditCard.PaymentCardItemChangeCreditCardResult
				}
				caseOutput.MenuPaymentChangeCreditCard=lMenuPaymentChangeCreditCard
				caseOutput.PaymentCardItemChangeCreditCardDetail=lPaymentCardItemChangeCreditCardDetail
				caseOutput.PaymentCardItemChangeCreditCardResult=lPaymentCardItemChangeCreditCardResult
				if(!lMapMenuPaymentChangeCreditCard.Result){
					return lreturn
				}
				Boolean lIsMenuPaymentChangeCreditCard=IGNUemaHelper.convertStringToBoolean(lMenuPaymentChangeCreditCard)
				if(lIsMenuPaymentChangeCreditCard){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPaymentChangeCreditCard
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPaymentCardItemChangeCreditCardResult.length()>0
				}
				Map lMapMenuPaymentMakePaymentCardOld=this.inputMenuPaymentMakePaymentCardOld(lMenuPaymentMakePaymentCardOld)
				if(!lMapMenuPaymentMakePaymentCardOld.Result){
					lMenuPaymentMakePaymentCardOld=''
					lPaymentCardItemMakePaymentCardOldDetail=''
					lPaymentCardItemMakePaymentCardOldResult=''
				}else{
					lMenuPaymentMakePaymentCardOld=lMapMenuPaymentMakePaymentCardOld.MenuPaymentMakePaymentCardOld
					lPaymentCardItemMakePaymentCardOldDetail=lMapMenuPaymentMakePaymentCardOld.PaymentCardItemMakePaymentCardOldDetail
					lPaymentCardItemMakePaymentCardOldResult=lMapMenuPaymentMakePaymentCardOld.PaymentCardItemMakePaymentCardOldResult
				}
				caseOutput.MenuPaymentMakePaymentCardOld=lMenuPaymentMakePaymentCardOld
				caseOutput.PaymentCardItemMakePaymentCardOldDetail=lPaymentCardItemMakePaymentCardOldDetail
				caseOutput.PaymentCardItemMakePaymentCardOldResult=lPaymentCardItemMakePaymentCardOldResult
				if(!lMapMenuPaymentMakePaymentCardOld.Result){
					return lreturn
				}
				Boolean lIsMenuPaymentMakePaymentCardOld=IGNUemaHelper.convertStringToBoolean(lMenuPaymentMakePaymentCardOld)
				if(lIsMenuPaymentMakePaymentCardOld){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPaymentMakePaymentCardOld
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPaymentCardItemMakePaymentCardOldResult.length()>0
				}
				Map lMapMenuPaymentMakePaymentCardNew=this.inputMenuPaymentMakePaymentCardNew(lMenuPaymentMakePaymentCardNew)
				if(!lMapMenuPaymentMakePaymentCardNew.Result){
					lMenuPaymentMakePaymentCardNew=''
					lPaymentCardItemMakePaymentCardNewDetail=''
					lPaymentCardItemMakePaymentCardNewResult=''
				}else{
					lMenuPaymentMakePaymentCardNew=lMapMenuPaymentMakePaymentCardNew.MenuPaymentMakePaymentCardNew
					lPaymentCardItemMakePaymentCardNewDetail=lMapMenuPaymentMakePaymentCardNew.PaymentCardItemMakePaymentCardNewDetail
					lPaymentCardItemMakePaymentCardNewResult=lMapMenuPaymentMakePaymentCardNew.PaymentCardItemMakePaymentCardNewResult
				}
				caseOutput.MenuPaymentMakePaymentCardNew=lMenuPaymentMakePaymentCardNew
				caseOutput.PaymentCardItemMakePaymentCardNewDetail=lPaymentCardItemMakePaymentCardNewDetail
				caseOutput.PaymentCardItemMakePaymentCardNewResult=lPaymentCardItemMakePaymentCardNewResult
				if(!lMapMenuPaymentMakePaymentCardNew.Result){
					return lreturn
				}
				Boolean lIsMenuPaymentMakePaymentCardNew=IGNUemaHelper.convertStringToBoolean(lMenuPaymentMakePaymentCardNew)
				if(lIsMenuPaymentMakePaymentCardNew){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPaymentMakePaymentCardNew
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPaymentCardItemMakePaymentCardNewResult.length()>0
				}
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuProfileToDo=this.inputMenuProfileToDo(lMenuProfileToDo,lMenuProfilePositiveCase,lProfileMaritalStatus,lProfilePreferredLanguage,lProfileOccupation,lProfileAddressHouseBuildingNumber,lProfileAddressVillage,lProfileAddressSoiRoad,lProfileAddressPostcode,lProfileAddressProvince,lProfileAddressDistrict,lProfileAddressSubdistrict,lProfileTelephoneNumber,lProfileEmail)
			if(!lMapMenuProfileToDo.Result){
				lMenuProfileToDo=''
				lMenuProfilePositiveCase=''
				lProfileMaritalStatus=''
				lProfilePreferredLanguage=''
				lProfileOccupation=''
				lProfileAddressHouseBuildingNumber=''
				lProfileAddressVillage=''
				lProfileAddressSoiRoad=''
				lProfileAddressPostcode=''
				lProfileAddressProvince=''
				lProfileAddressDistrict=''
				lProfileAddressSubdistrict=''
				lProfileTelephoneNumber=''
				lProfileEmail=''
				lProfileEditDetail=''
				lProfileEditResult=''
			}else{
				lMenuProfileToDo=lMapMenuProfileToDo.MenuProfileToDo
				lMenuProfilePositiveCase=lMapMenuProfileToDo.MenuProfilePositiveCase
				lProfileMaritalStatus=lMapMenuProfileToDo.ProfileMaritalStatus
				lProfilePreferredLanguage=lMapMenuProfileToDo.ProfilePreferredLanguage
				lProfileOccupation=lMapMenuProfileToDo.ProfileOccupation
				lProfileAddressHouseBuildingNumber=lMapMenuProfileToDo.ProfileAddressHouseBuildingNumber
				lProfileAddressVillage=lMapMenuProfileToDo.ProfileAddressVillage
				lProfileAddressSoiRoad=lMapMenuProfileToDo.ProfileAddressSoiRoad
				lProfileAddressPostcode=lMapMenuProfileToDo.ProfileAddressPostcode
				lProfileAddressProvince=lMapMenuProfileToDo.ProfileAddressProvince
				lProfileAddressDistrict=lMapMenuProfileToDo.ProfileAddressDistrict
				lProfileAddressSubdistrict=lMapMenuProfileToDo.ProfileAddressSubdistrict
				lProfileTelephoneNumber=lMapMenuProfileToDo.ProfileTelephoneNumber
				lProfileEmail=lMapMenuProfileToDo.ProfileEmail
				lProfileEditDetail=lMapMenuProfileToDo.ProfileEditDetail
				lProfileEditResult=lMapMenuProfileToDo.ProfileEditResult
			}
			caseOutput.MenuProfileToDo=lMenuProfileToDo
			caseOutput.MenuProfilePositiveCase=lMenuProfilePositiveCase
			caseOutput.ProfileMaritalStatus=lProfileMaritalStatus
			caseOutput.ProfilePreferredLanguage=lProfilePreferredLanguage
			caseOutput.ProfileOccupation=lProfileOccupation
			caseOutput.ProfileAddressHouseBuildingNumber=lProfileAddressHouseBuildingNumber
			caseOutput.ProfileAddressVillage=lProfileAddressVillage
			caseOutput.ProfileAddressSoiRoad=lProfileAddressSoiRoad
			caseOutput.ProfileAddressPostcode=lProfileAddressPostcode
			caseOutput.ProfileAddressProvince=lProfileAddressProvince
			caseOutput.ProfileAddressDistrict=lProfileAddressDistrict
			caseOutput.ProfileAddressSubdistrict=lProfileAddressSubdistrict
			caseOutput.ProfileTelephoneNumber=lProfileTelephoneNumber
			caseOutput.ProfileEmail=lProfileEmail
			caseOutput.ProfileEditDetail=lProfileEditDetail
			caseOutput.ProfileEditResult=lProfileEditResult
			if(!lMapMenuProfileToDo.Result){
				return lreturn
			}
			Boolean lIsMenuProfileToDo=IGNUemaHelper.convertStringToBoolean(lMenuProfileToDo)
			if(lIsMenuProfileToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuProfileToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lProfileEditResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuPolicyToDo=this.inputMenuPolicyToDo(lMenuPolicyToDo,lMenuPolicyCardSelectProductMotor,lMenuPolicyCardSelectProductHealth,lMenuPolicyDetailHistoryToDo,lMenuPolicyDetailDocDownloadToDo,lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo,lMenuPolicyDetailPaymentToDo,lMenuPolicyDetailPaymentOpenTermAndConditionToDo,lMenuPolicyDetailTaxDeductionToDo,lMenuPolicyDetailTaxDeductionAccept,lMenuPolicyDetailTaxDeductionEditToDo,lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lMenuPolicyDetailECareCardToDo)
			if(!lMapMenuPolicyToDo.Result){
				lMenuPolicyToDo=''
				lMenuPolicyCardSelectProductMotor=''
				lMenuPolicyCardSelectProductHealth=''
				lMenuPolicyDetailHistoryToDo=''
				lMenuPolicyDetailDocDownloadToDo=''
				lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=''
				lMenuPolicyDetailPaymentToDo=''
				lMenuPolicyDetailPaymentOpenTermAndConditionToDo=''
				lMenuPolicyDetailTaxDeductionToDo=''
				lMenuPolicyDetailTaxDeductionAccept=''
				lMenuPolicyDetailTaxDeductionEditToDo=''
				lMenuPolicyDetailTaxDeductionEditHolderIsThai=''
				lMenuPolicyDetailTaxDeductionEditName=''
				lMenuPolicyDetailTaxDeductionEditSurname=''
				lMenuPolicyDetailTaxDeductionEditIdentificationNumber=''
				lMenuPolicyDetailECareCardToDo=''
				lPolicyItem01DetailCardSelectedProductName=''
				lPolicyItem01DetailCardSelectedId=''
				lPolicyItem01DetailCardSelectedDetail=''
				lPolicyItem01DetailAdditionalDetail=''
				lPolicyItem01DetailHistoryToDo=''
				lPolicyItem01DetailHistoryDetail=''
				lPolicyItem01DetailPaymentToDo=''
				lPolicyItem01DetailPaymentCardId=''
				lPolicyItem01DetailPaymentDetail=''
				lPolicyItem01DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem01DetailPaymentTermAndCondition=''
				lPolicyItem01DetailDocDownloadToDo=''
				lPolicyItem01DetailDocDownloadDetail=''
				lPolicyItem01DetailDocDownloadResult=''
				lPolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem01DetailDocDownloadInsuranceHandbook=''
				lPolicyItem01DetailTaxDeductionToDo=''
				lPolicyItem01DetailTaxDeductionDetail=''
				lPolicyItem01DetailTaxDeductionResult=''
				lPolicyItem01DetailECareCardToDo=''
				lPolicyItem01DetailECareCardDetail=''
				lPolicyItem01DetailECareCardResult=''
				lPolicyItem02DetailCardSelectedProductName=''
				lPolicyItem02DetailCardSelectedId=''
				lPolicyItem02DetailCardSelectedDetail=''
				lPolicyItem02DetailAdditionalDetail=''
				lPolicyItem02DetailHistoryToDo=''
				lPolicyItem02DetailHistoryDetail=''
				lPolicyItem02DetailPaymentToDo=''
				lPolicyItem02DetailPaymentCardId=''
				lPolicyItem02DetailPaymentDetail=''
				lPolicyItem02DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem02DetailPaymentTermAndCondition=''
				lPolicyItem02DetailDocDownloadToDo=''
				lPolicyItem02DetailDocDownloadDetail=''
				lPolicyItem02DetailDocDownloadResult=''
				lPolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem02DetailDocDownloadInsuranceHandbook=''
				lPolicyItem02DetailTaxDeductionToDo=''
				lPolicyItem02DetailTaxDeductionDetail=''
				lPolicyItem02DetailTaxDeductionResult=''
				lPolicyItem02DetailECareCardToDo=''
				lPolicyItem02DetailECareCardDetail=''
				lPolicyItem02DetailECareCardResult=''
				lPolicyItem03DetailCardSelectedProductName=''
				lPolicyItem03DetailCardSelectedId=''
				lPolicyItem03DetailCardSelectedDetail=''
				lPolicyItem03DetailAdditionalDetail=''
				lPolicyItem03DetailHistoryToDo=''
				lPolicyItem03DetailHistoryDetail=''
				lPolicyItem03DetailPaymentToDo=''
				lPolicyItem03DetailPaymentCardId=''
				lPolicyItem03DetailPaymentDetail=''
				lPolicyItem03DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem03DetailPaymentTermAndCondition=''
				lPolicyItem03DetailDocDownloadToDo=''
				lPolicyItem03DetailDocDownloadDetail=''
				lPolicyItem03DetailDocDownloadResult=''
				lPolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem03DetailDocDownloadInsuranceHandbook=''
				lPolicyItem03DetailTaxDeductionToDo=''
				lPolicyItem03DetailTaxDeductionDetail=''
				lPolicyItem03DetailTaxDeductionResult=''
				lPolicyItem03DetailECareCardToDo=''
				lPolicyItem03DetailECareCardDetail=''
				lPolicyItem03DetailECareCardResult=''
				lPolicyItem04DetailCardSelectedProductName=''
				lPolicyItem04DetailCardSelectedId=''
				lPolicyItem04DetailCardSelectedDetail=''
				lPolicyItem04DetailAdditionalDetail=''
				lPolicyItem04DetailHistoryToDo=''
				lPolicyItem04DetailHistoryDetail=''
				lPolicyItem04DetailPaymentToDo=''
				lPolicyItem04DetailPaymentCardId=''
				lPolicyItem04DetailPaymentDetail=''
				lPolicyItem04DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem04DetailPaymentTermAndCondition=''
				lPolicyItem04DetailDocDownloadToDo=''
				lPolicyItem04DetailDocDownloadDetail=''
				lPolicyItem04DetailDocDownloadResult=''
				lPolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem04DetailDocDownloadInsuranceHandbook=''
				lPolicyItem04DetailTaxDeductionToDo=''
				lPolicyItem04DetailTaxDeductionDetail=''
				lPolicyItem04DetailTaxDeductionResult=''
				lPolicyItem04DetailECareCardToDo=''
				lPolicyItem04DetailECareCardDetail=''
				lPolicyItem04DetailECareCardResult=''
				lPolicyItem05DetailCardSelectedProductName=''
				lPolicyItem05DetailCardSelectedId=''
				lPolicyItem05DetailCardSelectedDetail=''
				lPolicyItem05DetailAdditionalDetail=''
				lPolicyItem05DetailHistoryToDo=''
				lPolicyItem05DetailHistoryDetail=''
				lPolicyItem05DetailPaymentToDo=''
				lPolicyItem05DetailPaymentCardId=''
				lPolicyItem05DetailPaymentDetail=''
				lPolicyItem05DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem05DetailPaymentTermAndCondition=''
				lPolicyItem05DetailDocDownloadToDo=''
				lPolicyItem05DetailDocDownloadDetail=''
				lPolicyItem05DetailDocDownloadResult=''
				lPolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem05DetailDocDownloadInsuranceHandbook=''
				lPolicyItem05DetailTaxDeductionToDo=''
				lPolicyItem05DetailTaxDeductionDetail=''
				lPolicyItem05DetailTaxDeductionResult=''
				lPolicyItem05DetailECareCardToDo=''
				lPolicyItem05DetailECareCardDetail=''
				lPolicyItem05DetailECareCardResult=''
				lPolicyItem06DetailCardSelectedProductName=''
				lPolicyItem06DetailCardSelectedId=''
				lPolicyItem06DetailCardSelectedDetail=''
				lPolicyItem06DetailAdditionalDetail=''
				lPolicyItem06DetailHistoryToDo=''
				lPolicyItem06DetailHistoryDetail=''
				lPolicyItem06DetailPaymentToDo=''
				lPolicyItem06DetailPaymentCardId=''
				lPolicyItem06DetailPaymentDetail=''
				lPolicyItem06DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem06DetailPaymentTermAndCondition=''
				lPolicyItem06DetailDocDownloadToDo=''
				lPolicyItem06DetailDocDownloadDetail=''
				lPolicyItem06DetailDocDownloadResult=''
				lPolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem06DetailDocDownloadInsuranceHandbook=''
				lPolicyItem06DetailTaxDeductionToDo=''
				lPolicyItem06DetailTaxDeductionDetail=''
				lPolicyItem06DetailTaxDeductionResult=''
				lPolicyItem06DetailECareCardToDo=''
				lPolicyItem06DetailECareCardDetail=''
				lPolicyItem06DetailECareCardResult=''
				lPolicyItem07DetailCardSelectedProductName=''
				lPolicyItem07DetailCardSelectedId=''
				lPolicyItem07DetailCardSelectedDetail=''
				lPolicyItem07DetailAdditionalDetail=''
				lPolicyItem07DetailHistoryToDo=''
				lPolicyItem07DetailHistoryDetail=''
				lPolicyItem07DetailPaymentToDo=''
				lPolicyItem07DetailPaymentCardId=''
				lPolicyItem07DetailPaymentDetail=''
				lPolicyItem07DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem07DetailPaymentTermAndCondition=''
				lPolicyItem07DetailDocDownloadToDo=''
				lPolicyItem07DetailDocDownloadDetail=''
				lPolicyItem07DetailDocDownloadResult=''
				lPolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem07DetailDocDownloadInsuranceHandbook=''
				lPolicyItem07DetailTaxDeductionToDo=''
				lPolicyItem07DetailTaxDeductionDetail=''
				lPolicyItem07DetailTaxDeductionResult=''
				lPolicyItem07DetailECareCardToDo=''
				lPolicyItem07DetailECareCardDetail=''
				lPolicyItem07DetailECareCardResult=''
				lPolicyItem08DetailCardSelectedProductName=''
				lPolicyItem08DetailCardSelectedId=''
				lPolicyItem08DetailCardSelectedDetail=''
				lPolicyItem08DetailAdditionalDetail=''
				lPolicyItem08DetailHistoryToDo=''
				lPolicyItem08DetailHistoryDetail=''
				lPolicyItem08DetailPaymentToDo=''
				lPolicyItem08DetailPaymentCardId=''
				lPolicyItem08DetailPaymentDetail=''
				lPolicyItem08DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem08DetailPaymentTermAndCondition=''
				lPolicyItem08DetailDocDownloadToDo=''
				lPolicyItem08DetailDocDownloadDetail=''
				lPolicyItem08DetailDocDownloadResult=''
				lPolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem08DetailDocDownloadInsuranceHandbook=''
				lPolicyItem08DetailTaxDeductionToDo=''
				lPolicyItem08DetailTaxDeductionDetail=''
				lPolicyItem08DetailTaxDeductionResult=''
				lPolicyItem08DetailECareCardToDo=''
				lPolicyItem08DetailECareCardDetail=''
				lPolicyItem08DetailECareCardResult=''
				lPolicyItem09DetailCardSelectedProductName=''
				lPolicyItem09DetailCardSelectedId=''
				lPolicyItem09DetailCardSelectedDetail=''
				lPolicyItem09DetailAdditionalDetail=''
				lPolicyItem09DetailHistoryToDo=''
				lPolicyItem09DetailHistoryDetail=''
				lPolicyItem09DetailPaymentToDo=''
				lPolicyItem09DetailPaymentCardId=''
				lPolicyItem09DetailPaymentDetail=''
				lPolicyItem09DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem09DetailPaymentTermAndCondition=''
				lPolicyItem09DetailDocDownloadToDo=''
				lPolicyItem09DetailDocDownloadDetail=''
				lPolicyItem09DetailDocDownloadResult=''
				lPolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem09DetailDocDownloadInsuranceHandbook=''
				lPolicyItem09DetailTaxDeductionToDo=''
				lPolicyItem09DetailTaxDeductionDetail=''
				lPolicyItem09DetailTaxDeductionResult=''
				lPolicyItem09DetailECareCardToDo=''
				lPolicyItem09DetailECareCardDetail=''
				lPolicyItem09DetailECareCardResult=''
				lPolicyItem10DetailCardSelectedProductName=''
				lPolicyItem10DetailCardSelectedId=''
				lPolicyItem10DetailCardSelectedDetail=''
				lPolicyItem10DetailAdditionalDetail=''
				lPolicyItem10DetailHistoryToDo=''
				lPolicyItem10DetailHistoryDetail=''
				lPolicyItem10DetailPaymentToDo=''
				lPolicyItem10DetailPaymentCardId=''
				lPolicyItem10DetailPaymentDetail=''
				lPolicyItem10DetailPaymentOpenTermAndConditionToDo=''
				lPolicyItem10DetailPaymentTermAndCondition=''
				lPolicyItem10DetailDocDownloadToDo=''
				lPolicyItem10DetailDocDownloadDetail=''
				lPolicyItem10DetailDocDownloadResult=''
				lPolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo=''
				lPolicyItem10DetailDocDownloadInsuranceHandbook=''
				lPolicyItem10DetailTaxDeductionToDo=''
				lPolicyItem10DetailTaxDeductionDetail=''
				lPolicyItem10DetailTaxDeductionResult=''
				lPolicyItem10DetailECareCardToDo=''
				lPolicyItem10DetailECareCardDetail=''
				lPolicyItem10DetailECareCardResult=''
				lPolicyCardSelectProductLineResult=''
			}else{
				lMenuPolicyToDo=lMapMenuPolicyToDo.MenuPolicyToDo
				lMenuPolicyCardSelectProductMotor=lMapMenuPolicyToDo.MenuPolicyCardSelectProductMotor
				lMenuPolicyCardSelectProductHealth=lMapMenuPolicyToDo.MenuPolicyCardSelectProductHealth
				lMenuPolicyDetailHistoryToDo=lMapMenuPolicyToDo.MenuPolicyDetailHistoryToDo
				lMenuPolicyDetailDocDownloadToDo=lMapMenuPolicyToDo.MenuPolicyDetailDocDownloadToDo
				lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.MenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo
				lMenuPolicyDetailPaymentToDo=lMapMenuPolicyToDo.MenuPolicyDetailPaymentToDo
				lMenuPolicyDetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.MenuPolicyDetailPaymentOpenTermAndConditionToDo
				lMenuPolicyDetailTaxDeductionToDo=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionToDo
				lMenuPolicyDetailTaxDeductionAccept=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionAccept
				lMenuPolicyDetailTaxDeductionEditToDo=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionEditToDo
				lMenuPolicyDetailTaxDeductionEditHolderIsThai=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionEditHolderIsThai
				lMenuPolicyDetailTaxDeductionEditName=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionEditName
				lMenuPolicyDetailTaxDeductionEditSurname=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionEditSurname
				lMenuPolicyDetailTaxDeductionEditIdentificationNumber=lMapMenuPolicyToDo.MenuPolicyDetailTaxDeductionEditIdentificationNumber
				lMenuPolicyDetailECareCardToDo=lMapMenuPolicyToDo.MenuPolicyDetailECareCardToDo
				lPolicyItem01DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem01DetailCardSelectedProductName
				lPolicyItem01DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem01DetailCardSelectedId
				lPolicyItem01DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem01DetailCardSelectedDetail
				lPolicyItem01DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem01DetailAdditionalDetail
				lPolicyItem01DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem01DetailHistoryToDo
				lPolicyItem01DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem01DetailHistoryDetail
				lPolicyItem01DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem01DetailPaymentToDo
				lPolicyItem01DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem01DetailPaymentCardId
				lPolicyItem01DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem01DetailPaymentDetail
				lPolicyItem01DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem01DetailPaymentOpenTermAndConditionToDo
				lPolicyItem01DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem01DetailPaymentTermAndCondition
				lPolicyItem01DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem01DetailDocDownloadToDo
				lPolicyItem01DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem01DetailDocDownloadDetail
				lPolicyItem01DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem01DetailDocDownloadResult
				lPolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem01DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem01DetailDocDownloadInsuranceHandbook
				lPolicyItem01DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem01DetailTaxDeductionToDo
				lPolicyItem01DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem01DetailTaxDeductionDetail
				lPolicyItem01DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem01DetailTaxDeductionResult
				lPolicyItem01DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem01DetailECareCardToDo
				lPolicyItem01DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem01DetailECareCardDetail
				lPolicyItem01DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem01DetailECareCardResult
				lPolicyItem02DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem02DetailCardSelectedProductName
				lPolicyItem02DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem02DetailCardSelectedId
				lPolicyItem02DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem02DetailCardSelectedDetail
				lPolicyItem02DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem02DetailAdditionalDetail
				lPolicyItem02DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem02DetailHistoryToDo
				lPolicyItem02DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem02DetailHistoryDetail
				lPolicyItem02DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem02DetailPaymentToDo
				lPolicyItem02DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem02DetailPaymentCardId
				lPolicyItem02DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem02DetailPaymentDetail
				lPolicyItem02DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem02DetailPaymentOpenTermAndConditionToDo
				lPolicyItem02DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem02DetailPaymentTermAndCondition
				lPolicyItem02DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem02DetailDocDownloadToDo
				lPolicyItem02DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem02DetailDocDownloadDetail
				lPolicyItem02DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem02DetailDocDownloadResult
				lPolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem02DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem02DetailDocDownloadInsuranceHandbook
				lPolicyItem02DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem02DetailTaxDeductionToDo
				lPolicyItem02DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem02DetailTaxDeductionDetail
				lPolicyItem02DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem02DetailTaxDeductionResult
				lPolicyItem02DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem02DetailECareCardToDo
				lPolicyItem02DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem02DetailECareCardDetail
				lPolicyItem02DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem02DetailECareCardResult
				lPolicyItem03DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem03DetailCardSelectedProductName
				lPolicyItem03DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem03DetailCardSelectedId
				lPolicyItem03DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem03DetailCardSelectedDetail
				lPolicyItem03DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem03DetailAdditionalDetail
				lPolicyItem03DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem03DetailHistoryToDo
				lPolicyItem03DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem03DetailHistoryDetail
				lPolicyItem03DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem03DetailPaymentToDo
				lPolicyItem03DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem03DetailPaymentCardId
				lPolicyItem03DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem03DetailPaymentDetail
				lPolicyItem03DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem03DetailPaymentOpenTermAndConditionToDo
				lPolicyItem03DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem03DetailPaymentTermAndCondition
				lPolicyItem03DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem03DetailDocDownloadToDo
				lPolicyItem03DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem03DetailDocDownloadDetail
				lPolicyItem03DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem03DetailDocDownloadResult
				lPolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem03DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem03DetailDocDownloadInsuranceHandbook
				lPolicyItem03DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem03DetailTaxDeductionToDo
				lPolicyItem03DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem03DetailTaxDeductionDetail
				lPolicyItem03DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem03DetailTaxDeductionResult
				lPolicyItem03DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem03DetailECareCardToDo
				lPolicyItem03DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem03DetailECareCardDetail
				lPolicyItem03DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem03DetailECareCardResult
				lPolicyItem04DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem04DetailCardSelectedProductName
				lPolicyItem04DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem04DetailCardSelectedId
				lPolicyItem04DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem04DetailCardSelectedDetail
				lPolicyItem04DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem04DetailAdditionalDetail
				lPolicyItem04DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem04DetailHistoryToDo
				lPolicyItem04DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem04DetailHistoryDetail
				lPolicyItem04DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem04DetailPaymentToDo
				lPolicyItem04DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem04DetailPaymentCardId
				lPolicyItem04DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem04DetailPaymentDetail
				lPolicyItem04DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem04DetailPaymentOpenTermAndConditionToDo
				lPolicyItem04DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem04DetailPaymentTermAndCondition
				lPolicyItem04DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem04DetailDocDownloadToDo
				lPolicyItem04DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem04DetailDocDownloadDetail
				lPolicyItem04DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem04DetailDocDownloadResult
				lPolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem04DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem04DetailDocDownloadInsuranceHandbook
				lPolicyItem04DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem04DetailTaxDeductionToDo
				lPolicyItem04DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem04DetailTaxDeductionDetail
				lPolicyItem04DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem04DetailTaxDeductionResult
				lPolicyItem04DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem04DetailECareCardToDo
				lPolicyItem04DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem04DetailECareCardDetail
				lPolicyItem04DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem04DetailECareCardResult
				lPolicyItem05DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem05DetailCardSelectedProductName
				lPolicyItem05DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem05DetailCardSelectedId
				lPolicyItem05DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem05DetailCardSelectedDetail
				lPolicyItem05DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem05DetailAdditionalDetail
				lPolicyItem05DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem05DetailHistoryToDo
				lPolicyItem05DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem05DetailHistoryDetail
				lPolicyItem05DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem05DetailPaymentToDo
				lPolicyItem05DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem05DetailPaymentCardId
				lPolicyItem05DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem05DetailPaymentDetail
				lPolicyItem05DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem05DetailPaymentOpenTermAndConditionToDo
				lPolicyItem05DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem05DetailPaymentTermAndCondition
				lPolicyItem05DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem05DetailDocDownloadToDo
				lPolicyItem05DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem05DetailDocDownloadDetail
				lPolicyItem05DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem05DetailDocDownloadResult
				lPolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem05DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem05DetailDocDownloadInsuranceHandbook
				lPolicyItem05DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem05DetailTaxDeductionToDo
				lPolicyItem05DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem05DetailTaxDeductionDetail
				lPolicyItem05DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem05DetailTaxDeductionResult
				lPolicyItem05DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem05DetailECareCardToDo
				lPolicyItem05DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem05DetailECareCardDetail
				lPolicyItem05DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem05DetailECareCardResult
				lPolicyItem06DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem06DetailCardSelectedProductName
				lPolicyItem06DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem06DetailCardSelectedId
				lPolicyItem06DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem06DetailCardSelectedDetail
				lPolicyItem06DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem06DetailAdditionalDetail
				lPolicyItem06DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem06DetailHistoryToDo
				lPolicyItem06DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem06DetailHistoryDetail
				lPolicyItem06DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem06DetailPaymentToDo
				lPolicyItem06DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem06DetailPaymentCardId
				lPolicyItem06DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem06DetailPaymentDetail
				lPolicyItem06DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem06DetailPaymentOpenTermAndConditionToDo
				lPolicyItem06DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem06DetailPaymentTermAndCondition
				lPolicyItem06DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem06DetailDocDownloadToDo
				lPolicyItem06DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem06DetailDocDownloadDetail
				lPolicyItem06DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem06DetailDocDownloadResult
				lPolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem06DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem06DetailDocDownloadInsuranceHandbook
				lPolicyItem06DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem06DetailTaxDeductionToDo
				lPolicyItem06DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem06DetailTaxDeductionDetail
				lPolicyItem06DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem06DetailTaxDeductionResult
				lPolicyItem06DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem06DetailECareCardToDo
				lPolicyItem06DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem06DetailECareCardDetail
				lPolicyItem06DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem06DetailECareCardResult
				lPolicyItem07DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem07DetailCardSelectedProductName
				lPolicyItem07DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem07DetailCardSelectedId
				lPolicyItem07DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem07DetailCardSelectedDetail
				lPolicyItem07DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem07DetailAdditionalDetail
				lPolicyItem07DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem07DetailHistoryToDo
				lPolicyItem07DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem07DetailHistoryDetail
				lPolicyItem07DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem07DetailPaymentToDo
				lPolicyItem07DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem07DetailPaymentCardId
				lPolicyItem07DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem07DetailPaymentDetail
				lPolicyItem07DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem07DetailPaymentOpenTermAndConditionToDo
				lPolicyItem07DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem07DetailPaymentTermAndCondition
				lPolicyItem07DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem07DetailDocDownloadToDo
				lPolicyItem07DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem07DetailDocDownloadDetail
				lPolicyItem07DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem07DetailDocDownloadResult
				lPolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem07DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem07DetailDocDownloadInsuranceHandbook
				lPolicyItem07DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem07DetailTaxDeductionToDo
				lPolicyItem07DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem07DetailTaxDeductionDetail
				lPolicyItem07DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem07DetailTaxDeductionResult
				lPolicyItem07DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem07DetailECareCardToDo
				lPolicyItem07DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem07DetailECareCardDetail
				lPolicyItem07DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem07DetailECareCardResult
				lPolicyItem08DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem08DetailCardSelectedProductName
				lPolicyItem08DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem08DetailCardSelectedId
				lPolicyItem08DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem08DetailCardSelectedDetail
				lPolicyItem08DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem08DetailAdditionalDetail
				lPolicyItem08DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem08DetailHistoryToDo
				lPolicyItem08DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem08DetailHistoryDetail
				lPolicyItem08DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem08DetailPaymentToDo
				lPolicyItem08DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem08DetailPaymentCardId
				lPolicyItem08DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem08DetailPaymentDetail
				lPolicyItem08DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem08DetailPaymentOpenTermAndConditionToDo
				lPolicyItem08DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem08DetailPaymentTermAndCondition
				lPolicyItem08DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem08DetailDocDownloadToDo
				lPolicyItem08DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem08DetailDocDownloadDetail
				lPolicyItem08DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem08DetailDocDownloadResult
				lPolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem08DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem08DetailDocDownloadInsuranceHandbook
				lPolicyItem08DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem08DetailTaxDeductionToDo
				lPolicyItem08DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem08DetailTaxDeductionDetail
				lPolicyItem08DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem08DetailTaxDeductionResult
				lPolicyItem08DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem08DetailECareCardToDo
				lPolicyItem08DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem08DetailECareCardDetail
				lPolicyItem08DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem08DetailECareCardResult
				lPolicyItem09DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem09DetailCardSelectedProductName
				lPolicyItem09DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem09DetailCardSelectedId
				lPolicyItem09DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem09DetailCardSelectedDetail
				lPolicyItem09DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem09DetailAdditionalDetail
				lPolicyItem09DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem09DetailHistoryToDo
				lPolicyItem09DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem09DetailHistoryDetail
				lPolicyItem09DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem09DetailPaymentToDo
				lPolicyItem09DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem09DetailPaymentCardId
				lPolicyItem09DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem09DetailPaymentDetail
				lPolicyItem09DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem09DetailPaymentOpenTermAndConditionToDo
				lPolicyItem09DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem09DetailPaymentTermAndCondition
				lPolicyItem09DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem09DetailDocDownloadToDo
				lPolicyItem09DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem09DetailDocDownloadDetail
				lPolicyItem09DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem09DetailDocDownloadResult
				lPolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem09DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem09DetailDocDownloadInsuranceHandbook
				lPolicyItem09DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem09DetailTaxDeductionToDo
				lPolicyItem09DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem09DetailTaxDeductionDetail
				lPolicyItem09DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem09DetailTaxDeductionResult
				lPolicyItem09DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem09DetailECareCardToDo
				lPolicyItem09DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem09DetailECareCardDetail
				lPolicyItem09DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem09DetailECareCardResult
				lPolicyItem10DetailCardSelectedProductName=lMapMenuPolicyToDo.PolicyItem10DetailCardSelectedProductName
				lPolicyItem10DetailCardSelectedId=lMapMenuPolicyToDo.PolicyItem10DetailCardSelectedId
				lPolicyItem10DetailCardSelectedDetail=lMapMenuPolicyToDo.PolicyItem10DetailCardSelectedDetail
				lPolicyItem10DetailAdditionalDetail=lMapMenuPolicyToDo.PolicyItem10DetailAdditionalDetail
				lPolicyItem10DetailHistoryToDo=lMapMenuPolicyToDo.PolicyItem10DetailHistoryToDo
				lPolicyItem10DetailHistoryDetail=lMapMenuPolicyToDo.PolicyItem10DetailHistoryDetail
				lPolicyItem10DetailPaymentToDo=lMapMenuPolicyToDo.PolicyItem10DetailPaymentToDo
				lPolicyItem10DetailPaymentCardId=lMapMenuPolicyToDo.PolicyItem10DetailPaymentCardId
				lPolicyItem10DetailPaymentDetail=lMapMenuPolicyToDo.PolicyItem10DetailPaymentDetail
				lPolicyItem10DetailPaymentOpenTermAndConditionToDo=lMapMenuPolicyToDo.PolicyItem10DetailPaymentOpenTermAndConditionToDo
				lPolicyItem10DetailPaymentTermAndCondition=lMapMenuPolicyToDo.PolicyItem10DetailPaymentTermAndCondition
				lPolicyItem10DetailDocDownloadToDo=lMapMenuPolicyToDo.PolicyItem10DetailDocDownloadToDo
				lPolicyItem10DetailDocDownloadDetail=lMapMenuPolicyToDo.PolicyItem10DetailDocDownloadDetail
				lPolicyItem10DetailDocDownloadResult=lMapMenuPolicyToDo.PolicyItem10DetailDocDownloadResult
				lPolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo=lMapMenuPolicyToDo.PolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo
				lPolicyItem10DetailDocDownloadInsuranceHandbook=lMapMenuPolicyToDo.PolicyItem10DetailDocDownloadInsuranceHandbook
				lPolicyItem10DetailTaxDeductionToDo=lMapMenuPolicyToDo.PolicyItem10DetailTaxDeductionToDo
				lPolicyItem10DetailTaxDeductionDetail=lMapMenuPolicyToDo.PolicyItem10DetailTaxDeductionDetail
				lPolicyItem10DetailTaxDeductionResult=lMapMenuPolicyToDo.PolicyItem10DetailTaxDeductionResult
				lPolicyItem10DetailECareCardToDo=lMapMenuPolicyToDo.PolicyItem10DetailECareCardToDo
				lPolicyItem10DetailECareCardDetail=lMapMenuPolicyToDo.PolicyItem10DetailECareCardDetail
				lPolicyItem10DetailECareCardResult=lMapMenuPolicyToDo.PolicyItem10DetailECareCardResult
				lPolicyCardSelectProductLineResult=lMapMenuPolicyToDo.PolicyCardSelectProductLineResult
			}
			caseOutput.MenuPolicyToDo=lMenuPolicyToDo
			caseOutput.MenuPolicyCardSelectProductMotor=lMenuPolicyCardSelectProductMotor
			caseOutput.MenuPolicyCardSelectProductHealth=lMenuPolicyCardSelectProductHealth
			caseOutput.MenuPolicyDetailHistoryToDo=lMenuPolicyDetailHistoryToDo
			caseOutput.MenuPolicyDetailDocDownloadToDo=lMenuPolicyDetailDocDownloadToDo
			caseOutput.MenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.MenuPolicyDetailPaymentToDo=lMenuPolicyDetailPaymentToDo
			caseOutput.MenuPolicyDetailPaymentOpenTermAndConditionToDo=lMenuPolicyDetailPaymentOpenTermAndConditionToDo
			caseOutput.MenuPolicyDetailTaxDeductionToDo=lMenuPolicyDetailTaxDeductionToDo
			caseOutput.MenuPolicyDetailTaxDeductionAccept=lMenuPolicyDetailTaxDeductionAccept
			caseOutput.MenuPolicyDetailTaxDeductionEditToDo=lMenuPolicyDetailTaxDeductionEditToDo
			caseOutput.MenuPolicyDetailTaxDeductionEditHolderIsThai=lMenuPolicyDetailTaxDeductionEditHolderIsThai
			caseOutput.MenuPolicyDetailTaxDeductionEditName=lMenuPolicyDetailTaxDeductionEditName
			caseOutput.MenuPolicyDetailTaxDeductionEditSurname=lMenuPolicyDetailTaxDeductionEditSurname
			caseOutput.MenuPolicyDetailTaxDeductionEditIdentificationNumber=lMenuPolicyDetailTaxDeductionEditIdentificationNumber
			caseOutput.MenuPolicyDetailECareCardToDo=lMenuPolicyDetailECareCardToDo
			caseOutput.PolicyItem01DetailCardSelectedProductName=lPolicyItem01DetailCardSelectedProductName
			caseOutput.PolicyItem01DetailCardSelectedId=lPolicyItem01DetailCardSelectedId
			caseOutput.PolicyItem01DetailCardSelectedDetail=lPolicyItem01DetailCardSelectedDetail
			caseOutput.PolicyItem01DetailAdditionalDetail=lPolicyItem01DetailAdditionalDetail
			caseOutput.PolicyItem01DetailHistoryToDo=lPolicyItem01DetailHistoryToDo
			caseOutput.PolicyItem01DetailHistoryDetail=lPolicyItem01DetailHistoryDetail
			caseOutput.PolicyItem01DetailPaymentToDo=lPolicyItem01DetailPaymentToDo
			caseOutput.PolicyItem01DetailPaymentCardId=lPolicyItem01DetailPaymentCardId
			caseOutput.PolicyItem01DetailPaymentDetail=lPolicyItem01DetailPaymentDetail
			caseOutput.PolicyItem01DetailPaymentOpenTermAndConditionToDo=lPolicyItem01DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem01DetailPaymentTermAndCondition=lPolicyItem01DetailPaymentTermAndCondition
			caseOutput.PolicyItem01DetailDocDownloadToDo=lPolicyItem01DetailDocDownloadToDo
			caseOutput.PolicyItem01DetailDocDownloadDetail=lPolicyItem01DetailDocDownloadDetail
			caseOutput.PolicyItem01DetailDocDownloadResult=lPolicyItem01DetailDocDownloadResult
			caseOutput.PolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem01DetailDocDownloadInsuranceHandbook=lPolicyItem01DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem01DetailTaxDeductionToDo=lPolicyItem01DetailTaxDeductionToDo
			caseOutput.PolicyItem01DetailTaxDeductionDetail=lPolicyItem01DetailTaxDeductionDetail
			caseOutput.PolicyItem01DetailTaxDeductionResult=lPolicyItem01DetailTaxDeductionResult
			caseOutput.PolicyItem01DetailECareCardToDo=lPolicyItem01DetailECareCardToDo
			caseOutput.PolicyItem01DetailECareCardDetail=lPolicyItem01DetailECareCardDetail
			caseOutput.PolicyItem01DetailECareCardResult=lPolicyItem01DetailECareCardResult
			caseOutput.PolicyItem02DetailCardSelectedProductName=lPolicyItem02DetailCardSelectedProductName
			caseOutput.PolicyItem02DetailCardSelectedId=lPolicyItem02DetailCardSelectedId
			caseOutput.PolicyItem02DetailCardSelectedDetail=lPolicyItem02DetailCardSelectedDetail
			caseOutput.PolicyItem02DetailAdditionalDetail=lPolicyItem02DetailAdditionalDetail
			caseOutput.PolicyItem02DetailHistoryToDo=lPolicyItem02DetailHistoryToDo
			caseOutput.PolicyItem02DetailHistoryDetail=lPolicyItem02DetailHistoryDetail
			caseOutput.PolicyItem02DetailPaymentToDo=lPolicyItem02DetailPaymentToDo
			caseOutput.PolicyItem02DetailPaymentCardId=lPolicyItem02DetailPaymentCardId
			caseOutput.PolicyItem02DetailPaymentDetail=lPolicyItem02DetailPaymentDetail
			caseOutput.PolicyItem02DetailPaymentOpenTermAndConditionToDo=lPolicyItem02DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem02DetailPaymentTermAndCondition=lPolicyItem02DetailPaymentTermAndCondition
			caseOutput.PolicyItem02DetailDocDownloadToDo=lPolicyItem02DetailDocDownloadToDo
			caseOutput.PolicyItem02DetailDocDownloadDetail=lPolicyItem02DetailDocDownloadDetail
			caseOutput.PolicyItem02DetailDocDownloadResult=lPolicyItem02DetailDocDownloadResult
			caseOutput.PolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem02DetailDocDownloadInsuranceHandbook=lPolicyItem02DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem02DetailTaxDeductionToDo=lPolicyItem02DetailTaxDeductionToDo
			caseOutput.PolicyItem02DetailTaxDeductionDetail=lPolicyItem02DetailTaxDeductionDetail
			caseOutput.PolicyItem02DetailTaxDeductionResult=lPolicyItem02DetailTaxDeductionResult
			caseOutput.PolicyItem02DetailECareCardToDo=lPolicyItem02DetailECareCardToDo
			caseOutput.PolicyItem02DetailECareCardDetail=lPolicyItem02DetailECareCardDetail
			caseOutput.PolicyItem02DetailECareCardResult=lPolicyItem02DetailECareCardResult
			caseOutput.PolicyItem03DetailCardSelectedProductName=lPolicyItem03DetailCardSelectedProductName
			caseOutput.PolicyItem03DetailCardSelectedId=lPolicyItem03DetailCardSelectedId
			caseOutput.PolicyItem03DetailCardSelectedDetail=lPolicyItem03DetailCardSelectedDetail
			caseOutput.PolicyItem03DetailAdditionalDetail=lPolicyItem03DetailAdditionalDetail
			caseOutput.PolicyItem03DetailHistoryToDo=lPolicyItem03DetailHistoryToDo
			caseOutput.PolicyItem03DetailHistoryDetail=lPolicyItem03DetailHistoryDetail
			caseOutput.PolicyItem03DetailPaymentToDo=lPolicyItem03DetailPaymentToDo
			caseOutput.PolicyItem03DetailPaymentCardId=lPolicyItem03DetailPaymentCardId
			caseOutput.PolicyItem03DetailPaymentDetail=lPolicyItem03DetailPaymentDetail
			caseOutput.PolicyItem03DetailPaymentOpenTermAndConditionToDo=lPolicyItem03DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem03DetailPaymentTermAndCondition=lPolicyItem03DetailPaymentTermAndCondition
			caseOutput.PolicyItem03DetailDocDownloadToDo=lPolicyItem03DetailDocDownloadToDo
			caseOutput.PolicyItem03DetailDocDownloadDetail=lPolicyItem03DetailDocDownloadDetail
			caseOutput.PolicyItem03DetailDocDownloadResult=lPolicyItem03DetailDocDownloadResult
			caseOutput.PolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem03DetailDocDownloadInsuranceHandbook=lPolicyItem03DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem03DetailTaxDeductionToDo=lPolicyItem03DetailTaxDeductionToDo
			caseOutput.PolicyItem03DetailTaxDeductionDetail=lPolicyItem03DetailTaxDeductionDetail
			caseOutput.PolicyItem03DetailTaxDeductionResult=lPolicyItem03DetailTaxDeductionResult
			caseOutput.PolicyItem03DetailECareCardToDo=lPolicyItem03DetailECareCardToDo
			caseOutput.PolicyItem03DetailECareCardDetail=lPolicyItem03DetailECareCardDetail
			caseOutput.PolicyItem03DetailECareCardResult=lPolicyItem03DetailECareCardResult
			caseOutput.PolicyItem04DetailCardSelectedProductName=lPolicyItem04DetailCardSelectedProductName
			caseOutput.PolicyItem04DetailCardSelectedId=lPolicyItem04DetailCardSelectedId
			caseOutput.PolicyItem04DetailCardSelectedDetail=lPolicyItem04DetailCardSelectedDetail
			caseOutput.PolicyItem04DetailAdditionalDetail=lPolicyItem04DetailAdditionalDetail
			caseOutput.PolicyItem04DetailHistoryToDo=lPolicyItem04DetailHistoryToDo
			caseOutput.PolicyItem04DetailHistoryDetail=lPolicyItem04DetailHistoryDetail
			caseOutput.PolicyItem04DetailPaymentToDo=lPolicyItem04DetailPaymentToDo
			caseOutput.PolicyItem04DetailPaymentCardId=lPolicyItem04DetailPaymentCardId
			caseOutput.PolicyItem04DetailPaymentDetail=lPolicyItem04DetailPaymentDetail
			caseOutput.PolicyItem04DetailPaymentOpenTermAndConditionToDo=lPolicyItem04DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem04DetailPaymentTermAndCondition=lPolicyItem04DetailPaymentTermAndCondition
			caseOutput.PolicyItem04DetailDocDownloadToDo=lPolicyItem04DetailDocDownloadToDo
			caseOutput.PolicyItem04DetailDocDownloadDetail=lPolicyItem04DetailDocDownloadDetail
			caseOutput.PolicyItem04DetailDocDownloadResult=lPolicyItem04DetailDocDownloadResult
			caseOutput.PolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem04DetailDocDownloadInsuranceHandbook=lPolicyItem04DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem04DetailTaxDeductionToDo=lPolicyItem04DetailTaxDeductionToDo
			caseOutput.PolicyItem04DetailTaxDeductionDetail=lPolicyItem04DetailTaxDeductionDetail
			caseOutput.PolicyItem04DetailTaxDeductionResult=lPolicyItem04DetailTaxDeductionResult
			caseOutput.PolicyItem04DetailECareCardToDo=lPolicyItem04DetailECareCardToDo
			caseOutput.PolicyItem04DetailECareCardDetail=lPolicyItem04DetailECareCardDetail
			caseOutput.PolicyItem04DetailECareCardResult=lPolicyItem04DetailECareCardResult
			caseOutput.PolicyItem05DetailCardSelectedProductName=lPolicyItem05DetailCardSelectedProductName
			caseOutput.PolicyItem05DetailCardSelectedId=lPolicyItem05DetailCardSelectedId
			caseOutput.PolicyItem05DetailCardSelectedDetail=lPolicyItem05DetailCardSelectedDetail
			caseOutput.PolicyItem05DetailAdditionalDetail=lPolicyItem05DetailAdditionalDetail
			caseOutput.PolicyItem05DetailHistoryToDo=lPolicyItem05DetailHistoryToDo
			caseOutput.PolicyItem05DetailHistoryDetail=lPolicyItem05DetailHistoryDetail
			caseOutput.PolicyItem05DetailPaymentToDo=lPolicyItem05DetailPaymentToDo
			caseOutput.PolicyItem05DetailPaymentCardId=lPolicyItem05DetailPaymentCardId
			caseOutput.PolicyItem05DetailPaymentDetail=lPolicyItem05DetailPaymentDetail
			caseOutput.PolicyItem05DetailPaymentOpenTermAndConditionToDo=lPolicyItem05DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem05DetailPaymentTermAndCondition=lPolicyItem05DetailPaymentTermAndCondition
			caseOutput.PolicyItem05DetailDocDownloadToDo=lPolicyItem05DetailDocDownloadToDo
			caseOutput.PolicyItem05DetailDocDownloadDetail=lPolicyItem05DetailDocDownloadDetail
			caseOutput.PolicyItem05DetailDocDownloadResult=lPolicyItem05DetailDocDownloadResult
			caseOutput.PolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem05DetailDocDownloadInsuranceHandbook=lPolicyItem05DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem05DetailTaxDeductionToDo=lPolicyItem05DetailTaxDeductionToDo
			caseOutput.PolicyItem05DetailTaxDeductionDetail=lPolicyItem05DetailTaxDeductionDetail
			caseOutput.PolicyItem05DetailTaxDeductionResult=lPolicyItem05DetailTaxDeductionResult
			caseOutput.PolicyItem05DetailECareCardToDo=lPolicyItem05DetailECareCardToDo
			caseOutput.PolicyItem05DetailECareCardDetail=lPolicyItem05DetailECareCardDetail
			caseOutput.PolicyItem05DetailECareCardResult=lPolicyItem05DetailECareCardResult
			caseOutput.PolicyItem06DetailCardSelectedProductName=lPolicyItem06DetailCardSelectedProductName
			caseOutput.PolicyItem06DetailCardSelectedId=lPolicyItem06DetailCardSelectedId
			caseOutput.PolicyItem06DetailCardSelectedDetail=lPolicyItem06DetailCardSelectedDetail
			caseOutput.PolicyItem06DetailAdditionalDetail=lPolicyItem06DetailAdditionalDetail
			caseOutput.PolicyItem06DetailHistoryToDo=lPolicyItem06DetailHistoryToDo
			caseOutput.PolicyItem06DetailHistoryDetail=lPolicyItem06DetailHistoryDetail
			caseOutput.PolicyItem06DetailPaymentToDo=lPolicyItem06DetailPaymentToDo
			caseOutput.PolicyItem06DetailPaymentCardId=lPolicyItem06DetailPaymentCardId
			caseOutput.PolicyItem06DetailPaymentDetail=lPolicyItem06DetailPaymentDetail
			caseOutput.PolicyItem06DetailPaymentOpenTermAndConditionToDo=lPolicyItem06DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem06DetailPaymentTermAndCondition=lPolicyItem06DetailPaymentTermAndCondition
			caseOutput.PolicyItem06DetailDocDownloadToDo=lPolicyItem06DetailDocDownloadToDo
			caseOutput.PolicyItem06DetailDocDownloadDetail=lPolicyItem06DetailDocDownloadDetail
			caseOutput.PolicyItem06DetailDocDownloadResult=lPolicyItem06DetailDocDownloadResult
			caseOutput.PolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem06DetailDocDownloadInsuranceHandbook=lPolicyItem06DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem06DetailTaxDeductionToDo=lPolicyItem06DetailTaxDeductionToDo
			caseOutput.PolicyItem06DetailTaxDeductionDetail=lPolicyItem06DetailTaxDeductionDetail
			caseOutput.PolicyItem06DetailTaxDeductionResult=lPolicyItem06DetailTaxDeductionResult
			caseOutput.PolicyItem06DetailECareCardToDo=lPolicyItem06DetailECareCardToDo
			caseOutput.PolicyItem06DetailECareCardDetail=lPolicyItem06DetailECareCardDetail
			caseOutput.PolicyItem06DetailECareCardResult=lPolicyItem06DetailECareCardResult
			caseOutput.PolicyItem07DetailCardSelectedProductName=lPolicyItem07DetailCardSelectedProductName
			caseOutput.PolicyItem07DetailCardSelectedId=lPolicyItem07DetailCardSelectedId
			caseOutput.PolicyItem07DetailCardSelectedDetail=lPolicyItem07DetailCardSelectedDetail
			caseOutput.PolicyItem07DetailAdditionalDetail=lPolicyItem07DetailAdditionalDetail
			caseOutput.PolicyItem07DetailHistoryToDo=lPolicyItem07DetailHistoryToDo
			caseOutput.PolicyItem07DetailHistoryDetail=lPolicyItem07DetailHistoryDetail
			caseOutput.PolicyItem07DetailPaymentToDo=lPolicyItem07DetailPaymentToDo
			caseOutput.PolicyItem07DetailPaymentCardId=lPolicyItem07DetailPaymentCardId
			caseOutput.PolicyItem07DetailPaymentDetail=lPolicyItem07DetailPaymentDetail
			caseOutput.PolicyItem07DetailPaymentOpenTermAndConditionToDo=lPolicyItem07DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem07DetailPaymentTermAndCondition=lPolicyItem07DetailPaymentTermAndCondition
			caseOutput.PolicyItem07DetailDocDownloadToDo=lPolicyItem07DetailDocDownloadToDo
			caseOutput.PolicyItem07DetailDocDownloadDetail=lPolicyItem07DetailDocDownloadDetail
			caseOutput.PolicyItem07DetailDocDownloadResult=lPolicyItem07DetailDocDownloadResult
			caseOutput.PolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem07DetailDocDownloadInsuranceHandbook=lPolicyItem07DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem07DetailTaxDeductionToDo=lPolicyItem07DetailTaxDeductionToDo
			caseOutput.PolicyItem07DetailTaxDeductionDetail=lPolicyItem07DetailTaxDeductionDetail
			caseOutput.PolicyItem07DetailTaxDeductionResult=lPolicyItem07DetailTaxDeductionResult
			caseOutput.PolicyItem07DetailECareCardToDo=lPolicyItem07DetailECareCardToDo
			caseOutput.PolicyItem07DetailECareCardDetail=lPolicyItem07DetailECareCardDetail
			caseOutput.PolicyItem07DetailECareCardResult=lPolicyItem07DetailECareCardResult
			caseOutput.PolicyItem08DetailCardSelectedProductName=lPolicyItem08DetailCardSelectedProductName
			caseOutput.PolicyItem08DetailCardSelectedId=lPolicyItem08DetailCardSelectedId
			caseOutput.PolicyItem08DetailCardSelectedDetail=lPolicyItem08DetailCardSelectedDetail
			caseOutput.PolicyItem08DetailAdditionalDetail=lPolicyItem08DetailAdditionalDetail
			caseOutput.PolicyItem08DetailHistoryToDo=lPolicyItem08DetailHistoryToDo
			caseOutput.PolicyItem08DetailHistoryDetail=lPolicyItem08DetailHistoryDetail
			caseOutput.PolicyItem08DetailPaymentToDo=lPolicyItem08DetailPaymentToDo
			caseOutput.PolicyItem08DetailPaymentCardId=lPolicyItem08DetailPaymentCardId
			caseOutput.PolicyItem08DetailPaymentDetail=lPolicyItem08DetailPaymentDetail
			caseOutput.PolicyItem08DetailPaymentOpenTermAndConditionToDo=lPolicyItem08DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem08DetailPaymentTermAndCondition=lPolicyItem08DetailPaymentTermAndCondition
			caseOutput.PolicyItem08DetailDocDownloadToDo=lPolicyItem08DetailDocDownloadToDo
			caseOutput.PolicyItem08DetailDocDownloadDetail=lPolicyItem08DetailDocDownloadDetail
			caseOutput.PolicyItem08DetailDocDownloadResult=lPolicyItem08DetailDocDownloadResult
			caseOutput.PolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem08DetailDocDownloadInsuranceHandbook=lPolicyItem08DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem08DetailTaxDeductionToDo=lPolicyItem08DetailTaxDeductionToDo
			caseOutput.PolicyItem08DetailTaxDeductionDetail=lPolicyItem08DetailTaxDeductionDetail
			caseOutput.PolicyItem08DetailTaxDeductionResult=lPolicyItem08DetailTaxDeductionResult
			caseOutput.PolicyItem08DetailECareCardToDo=lPolicyItem08DetailECareCardToDo
			caseOutput.PolicyItem08DetailECareCardDetail=lPolicyItem08DetailECareCardDetail
			caseOutput.PolicyItem08DetailECareCardResult=lPolicyItem08DetailECareCardResult
			caseOutput.PolicyItem09DetailCardSelectedProductName=lPolicyItem09DetailCardSelectedProductName
			caseOutput.PolicyItem09DetailCardSelectedId=lPolicyItem09DetailCardSelectedId
			caseOutput.PolicyItem09DetailCardSelectedDetail=lPolicyItem09DetailCardSelectedDetail
			caseOutput.PolicyItem09DetailAdditionalDetail=lPolicyItem09DetailAdditionalDetail
			caseOutput.PolicyItem09DetailHistoryToDo=lPolicyItem09DetailHistoryToDo
			caseOutput.PolicyItem09DetailHistoryDetail=lPolicyItem09DetailHistoryDetail
			caseOutput.PolicyItem09DetailPaymentToDo=lPolicyItem09DetailPaymentToDo
			caseOutput.PolicyItem09DetailPaymentCardId=lPolicyItem09DetailPaymentCardId
			caseOutput.PolicyItem09DetailPaymentDetail=lPolicyItem09DetailPaymentDetail
			caseOutput.PolicyItem09DetailPaymentOpenTermAndConditionToDo=lPolicyItem09DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem09DetailPaymentTermAndCondition=lPolicyItem09DetailPaymentTermAndCondition
			caseOutput.PolicyItem09DetailDocDownloadToDo=lPolicyItem09DetailDocDownloadToDo
			caseOutput.PolicyItem09DetailDocDownloadDetail=lPolicyItem09DetailDocDownloadDetail
			caseOutput.PolicyItem09DetailDocDownloadResult=lPolicyItem09DetailDocDownloadResult
			caseOutput.PolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem09DetailDocDownloadInsuranceHandbook=lPolicyItem09DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem09DetailTaxDeductionToDo=lPolicyItem09DetailTaxDeductionToDo
			caseOutput.PolicyItem09DetailTaxDeductionDetail=lPolicyItem09DetailTaxDeductionDetail
			caseOutput.PolicyItem09DetailTaxDeductionResult=lPolicyItem09DetailTaxDeductionResult
			caseOutput.PolicyItem09DetailECareCardToDo=lPolicyItem09DetailECareCardToDo
			caseOutput.PolicyItem09DetailECareCardDetail=lPolicyItem09DetailECareCardDetail
			caseOutput.PolicyItem09DetailECareCardResult=lPolicyItem09DetailECareCardResult
			caseOutput.PolicyItem10DetailCardSelectedProductName=lPolicyItem10DetailCardSelectedProductName
			caseOutput.PolicyItem10DetailCardSelectedId=lPolicyItem10DetailCardSelectedId
			caseOutput.PolicyItem10DetailCardSelectedDetail=lPolicyItem10DetailCardSelectedDetail
			caseOutput.PolicyItem10DetailAdditionalDetail=lPolicyItem10DetailAdditionalDetail
			caseOutput.PolicyItem10DetailHistoryToDo=lPolicyItem10DetailHistoryToDo
			caseOutput.PolicyItem10DetailHistoryDetail=lPolicyItem10DetailHistoryDetail
			caseOutput.PolicyItem10DetailPaymentToDo=lPolicyItem10DetailPaymentToDo
			caseOutput.PolicyItem10DetailPaymentCardId=lPolicyItem10DetailPaymentCardId
			caseOutput.PolicyItem10DetailPaymentDetail=lPolicyItem10DetailPaymentDetail
			caseOutput.PolicyItem10DetailPaymentOpenTermAndConditionToDo=lPolicyItem10DetailPaymentOpenTermAndConditionToDo
			caseOutput.PolicyItem10DetailPaymentTermAndCondition=lPolicyItem10DetailPaymentTermAndCondition
			caseOutput.PolicyItem10DetailDocDownloadToDo=lPolicyItem10DetailDocDownloadToDo
			caseOutput.PolicyItem10DetailDocDownloadDetail=lPolicyItem10DetailDocDownloadDetail
			caseOutput.PolicyItem10DetailDocDownloadResult=lPolicyItem10DetailDocDownloadResult
			caseOutput.PolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo=lPolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo
			caseOutput.PolicyItem10DetailDocDownloadInsuranceHandbook=lPolicyItem10DetailDocDownloadInsuranceHandbook
			caseOutput.PolicyItem10DetailTaxDeductionToDo=lPolicyItem10DetailTaxDeductionToDo
			caseOutput.PolicyItem10DetailTaxDeductionDetail=lPolicyItem10DetailTaxDeductionDetail
			caseOutput.PolicyItem10DetailTaxDeductionResult=lPolicyItem10DetailTaxDeductionResult
			caseOutput.PolicyItem10DetailECareCardToDo=lPolicyItem10DetailECareCardToDo
			caseOutput.PolicyItem10DetailECareCardDetail=lPolicyItem10DetailECareCardDetail
			caseOutput.PolicyItem10DetailECareCardResult=lPolicyItem10DetailECareCardResult
			caseOutput.PolicyCardSelectProductLineResult=lPolicyCardSelectProductLineResult
			if(!lMapMenuPolicyToDo.Result){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Boolean lIsMenuPolicyToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyToDo)
			if(lIsMenuPolicyToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPolicyToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPolicyCardSelectProductLineResult.length()>0
				Boolean lIsPolicyCardSelectProductLineResult=IGNUemaHelper.convertStringToBoolean(lPolicyCardSelectProductLineResult)
				if(!lIsPolicyCardSelectProductLineResult){
					return lreturn
				}
			}
			Map lMapMenuPolicyCompulsoryBuyCardToDo=this.inputMenuPolicyCompulsoryBuyCardToDo(lMenuPolicyCompulsoryBuyCardToDo)
			if(!lMapMenuPolicyCompulsoryBuyCardToDo.Result){
				lMenuPolicyCompulsoryBuyCardToDo=''
				lPolicyCompulsoryBuyCardId=''
				lPolicyCompulsoryBuyCardDetail=''
				lPolicyCompulsoryBuyPaymentDetail=''
				lPolicyCompulsoryBuyPaymentResult=''
			}else{
				lMenuPolicyCompulsoryBuyCardToDo=lMapMenuPolicyCompulsoryBuyCardToDo.MenuPolicyCompulsoryBuyCardToDo
				lPolicyCompulsoryBuyCardId=lMapMenuPolicyCompulsoryBuyCardToDo.PolicyCompulsoryBuyCardId
				lPolicyCompulsoryBuyCardDetail=lMapMenuPolicyCompulsoryBuyCardToDo.PolicyCompulsoryBuyCardDetail
				lPolicyCompulsoryBuyPaymentDetail=lMapMenuPolicyCompulsoryBuyCardToDo.PolicyCompulsoryBuyPaymentDetail
				lPolicyCompulsoryBuyPaymentResult=lMapMenuPolicyCompulsoryBuyCardToDo.PolicyCompulsoryBuyPaymentResult
			}
			caseOutput.MenuPolicyCompulsoryBuyCardToDo=lMenuPolicyCompulsoryBuyCardToDo
			caseOutput.PolicyCompulsoryBuyCardId=lPolicyCompulsoryBuyCardId
			caseOutput.PolicyCompulsoryBuyCardDetail=lPolicyCompulsoryBuyCardDetail
			caseOutput.PolicyCompulsoryBuyPaymentDetail=lPolicyCompulsoryBuyPaymentDetail
			caseOutput.PolicyCompulsoryBuyPaymentResult=lPolicyCompulsoryBuyPaymentResult
			if(!lMapMenuPolicyCompulsoryBuyCardToDo.Result){
				return lreturn
			}
			Boolean lIsMenuPolicyCompulsoryBuyCardToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyCompulsoryBuyCardToDo)
			if(lIsMenuPolicyCompulsoryBuyCardToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuPolicyCompulsoryBuyCardToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lPolicyCompulsoryBuyPaymentResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuDocDownloadToDo=this.inputMenuDocDownloadToDo(lMenuDocDownloadToDo)
			if(!lMapMenuDocDownloadToDo.Result){
				lMenuDocDownloadToDo=''
			}else{
				lMenuDocDownloadToDo=lMapMenuDocDownloadToDo.MenuDocDownloadToDo
			}
			caseOutput.MenuDocDownloadToDo=lMenuDocDownloadToDo
			if(lMenuDocDownloadToDo.length()<=0){
				return lreturn
			}
			Boolean lIsMenuDocDownloadToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadToDo)
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			if(lIsMenuDocDownloadToDo){
				Map lMapMenuDocDownloadOpenInsuranceHandbook=this.inputMenuDocDownloadOpenInsuranceHandbook(lMenuDocDownloadOpenInsuranceHandbook)
				if(!lMapMenuDocDownloadOpenInsuranceHandbook.Result){
					lMenuDocDownloadOpenInsuranceHandbook=''
					lDocDownloadInsuranceHandbook=''
				}else{
					lMenuDocDownloadOpenInsuranceHandbook=lMapMenuDocDownloadOpenInsuranceHandbook.MenuDocDownloadOpenInsuranceHandbook
					lDocDownloadInsuranceHandbook=lMapMenuDocDownloadOpenInsuranceHandbook.DocDownloadInsuranceHandbook
				}
				caseOutput.MenuDocDownloadOpenInsuranceHandbook=lMenuDocDownloadOpenInsuranceHandbook
				caseOutput.DocDownloadInsuranceHandbook=lDocDownloadInsuranceHandbook
				if(!lMapMenuDocDownloadOpenInsuranceHandbook.Result){
					return lreturn
				}
				Boolean lIsMenuDocDownloadOpenInsuranceHandbook=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadOpenInsuranceHandbook)
				if(lIsMenuDocDownloadOpenInsuranceHandbook){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuDocDownloadOpenInsuranceHandbook
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lDocDownloadInsuranceHandbook.length()>0
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapMenuDocDownloadCardToDo=this.inputMenuDocDownloadCardToDo(lMenuDocDownloadCardToDo)
				if(!lMapMenuDocDownloadCardToDo.Result){
					lMenuDocDownloadCardToDo=''
					lDocDownloadCardSelectedId=''
					lDocDownloadCardSelectedDetail=''
					lDocDownloadCardSelectedResult=''
				}else{
					lMenuDocDownloadCardToDo=lMapMenuDocDownloadCardToDo.MenuDocDownloadCardToDo
					lDocDownloadCardSelectedId=lMapMenuDocDownloadCardToDo.DocDownloadCardSelectedId
					lDocDownloadCardSelectedDetail=lMapMenuDocDownloadCardToDo.DocDownloadCardSelectedDetail
					lDocDownloadCardSelectedResult=lMapMenuDocDownloadCardToDo.DocDownloadCardSelectedResult
				}
				caseOutput.MenuDocDownloadCardToDo=lMenuDocDownloadCardToDo
				caseOutput.DocDownloadCardSelectedId=lDocDownloadCardSelectedId
				caseOutput.DocDownloadCardSelectedDetail=lDocDownloadCardSelectedDetail
				caseOutput.DocDownloadCardSelectedResult=lDocDownloadCardSelectedResult
				if(!lMapMenuDocDownloadCardToDo.Result){
					return lreturn
				}
				Boolean lIsMenuDocDownloadCardToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuDocDownloadCardToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuDocDownloadCardToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lDocDownloadCardSelectedResult.length()>0
				}
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuContactSupportToDo=this.inputMenuContactSupportToDo(lMenuContactSupportToDo)
			if(!lMapMenuContactSupportToDo.Result){
				lMenuContactSupportToDo=''
			}else{
				lMenuContactSupportToDo=lMapMenuContactSupportToDo.MenuContactSupportToDo
			}
			caseOutput.MenuContactSupportToDo=lMenuContactSupportToDo
			if(lMenuContactSupportToDo.length()<=0){
				return lreturn
			}
			Boolean lIsMenuContactSupportToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportToDo)
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			if(lIsMenuContactSupportToDo){
				lMenuContactSupportSubjectRenewalToDo='No'
				Map lMapMenuContactSupportSubjectRenewalToDo=this.inputMenuContactSupportSubjectRenewalToDo(lMenuContactSupportSubjectRenewalToDo)
				if(!lMapMenuContactSupportSubjectRenewalToDo.Result){
					lMenuContactSupportSubjectRenewalToDo=''
					lContactSupportSubjectRenewalDetail=''
					lContactSupportSubjectRenewalResult=''
				}else{
					lMenuContactSupportSubjectRenewalToDo=lMapMenuContactSupportSubjectRenewalToDo.MenuContactSupportSubjectRenewalToDo
					lContactSupportSubjectRenewalDetail=lMapMenuContactSupportSubjectRenewalToDo.ContactSupportSubjectRenewalDetail
					lContactSupportSubjectRenewalResult=lMapMenuContactSupportSubjectRenewalToDo.ContactSupportSubjectRenewalResult
				}
				caseOutput.MenuContactSupportSubjectRenewalToDo=lMenuContactSupportSubjectRenewalToDo
				caseOutput.ContactSupportSubjectRenewalDetail=lContactSupportSubjectRenewalDetail
				caseOutput.ContactSupportSubjectRenewalResult=lContactSupportSubjectRenewalResult
				if(!lMapMenuContactSupportSubjectRenewalToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectRenewalToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectRenewalToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectRenewalToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectRenewalResult.length()>0
				}
				Map lMapMenuContactSupportSubjectPolicyToDo=this.inputMenuContactSupportSubjectPolicyToDo(lMenuContactSupportSubjectPolicyToDo)
				if(!lMapMenuContactSupportSubjectPolicyToDo.Result){
					lMenuContactSupportSubjectPolicyToDo=''
					lContactSupportSubjectPolicyDetail=''
					lContactSupportSubjectPolicyResult=''
				}else{
					lMenuContactSupportSubjectPolicyToDo=lMapMenuContactSupportSubjectPolicyToDo.MenuContactSupportSubjectPolicyToDo
					lContactSupportSubjectPolicyDetail=lMapMenuContactSupportSubjectPolicyToDo.ContactSupportSubjectPolicyDetail
					lContactSupportSubjectPolicyResult=lMapMenuContactSupportSubjectPolicyToDo.ContactSupportSubjectPolicyResult
				}
				caseOutput.MenuContactSupportSubjectPolicyToDo=lMenuContactSupportSubjectPolicyToDo
				caseOutput.ContactSupportSubjectPolicyDetail=lContactSupportSubjectPolicyDetail
				caseOutput.ContactSupportSubjectPolicyResult=lContactSupportSubjectPolicyResult
				if(!lMapMenuContactSupportSubjectPolicyToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectPolicyToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectPolicyToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectPolicyToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectPolicyResult.length()>0
				}
				Map lMapMenuContactSupportSubjectClaimToDo=this.inputMenuContactSupportSubjectClaimToDo(lMenuContactSupportSubjectClaimToDo)
				if(!lMapMenuContactSupportSubjectClaimToDo.Result){
					lMenuContactSupportSubjectClaimToDo=''
					lContactSupportSubjectClaimDetail=''
					lContactSupportSubjectClaimResult=''
				}else{
					lMenuContactSupportSubjectClaimToDo=lMapMenuContactSupportSubjectClaimToDo.MenuContactSupportSubjectClaimToDo
					lContactSupportSubjectClaimDetail=lMapMenuContactSupportSubjectClaimToDo.ContactSupportSubjectClaimDetail
					lContactSupportSubjectClaimResult=lMapMenuContactSupportSubjectClaimToDo.ContactSupportSubjectClaimResult
				}
				caseOutput.MenuContactSupportSubjectClaimToDo=lMenuContactSupportSubjectClaimToDo
				caseOutput.ContactSupportSubjectClaimDetail=lContactSupportSubjectClaimDetail
				caseOutput.ContactSupportSubjectClaimResult=lContactSupportSubjectClaimResult
				if(!lMapMenuContactSupportSubjectClaimToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectClaimToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectClaimToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectClaimToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectClaimResult.length()>0
				}
				Map lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo=this.inputMenuContactSupportSubjectEnquiryClaimHandlerToDo(lMenuContactSupportSubjectEnquiryClaimHandlerToDo)
				if(!lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo.Result){
					lMenuContactSupportSubjectEnquiryClaimHandlerToDo=''
					lContactSupportSubjectEnquiryClaimHandlerDetail=''
					lContactSupportSubjectEnquiryClaimHandlerResult=''
				}else{
					lMenuContactSupportSubjectEnquiryClaimHandlerToDo=lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo.MenuContactSupportSubjectEnquiryClaimHandlerToDo
					lContactSupportSubjectEnquiryClaimHandlerDetail=lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo.ContactSupportSubjectEnquiryClaimHandlerDetail
					lContactSupportSubjectEnquiryClaimHandlerResult=lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo.ContactSupportSubjectEnquiryClaimHandlerResult
				}
				caseOutput.MenuContactSupportSubjectEnquiryClaimHandlerToDo=lMenuContactSupportSubjectEnquiryClaimHandlerToDo
				caseOutput.ContactSupportSubjectEnquiryClaimHandlerDetail=lContactSupportSubjectEnquiryClaimHandlerDetail
				caseOutput.ContactSupportSubjectEnquiryClaimHandlerResult=lContactSupportSubjectEnquiryClaimHandlerResult
				if(!lMapMenuContactSupportSubjectEnquiryClaimHandlerToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectEnquiryClaimHandlerResult.length()>0
				}
				Map lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=this.inputMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo(lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo)
				if(!lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.Result){
					lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=''
					lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=''
					lContactSupportSubjectEnquiryVehicleAssessmentStatusResult=''
				}else{
					lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.MenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo
					lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.ContactSupportSubjectEnquiryVehicleAssessmentStatusDetail
					lContactSupportSubjectEnquiryVehicleAssessmentStatusResult=lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.ContactSupportSubjectEnquiryVehicleAssessmentStatusResult
				}
				caseOutput.MenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo
				caseOutput.ContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail
				caseOutput.ContactSupportSubjectEnquiryVehicleAssessmentStatusResult=lContactSupportSubjectEnquiryVehicleAssessmentStatusResult
				if(!lMapMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectEnquiryVehicleAssessmentStatusResult.length()>0
				}
				Map lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo=this.inputMenuContactSupportSubjectEnquiryReimbursementStatusToDo(lMenuContactSupportSubjectEnquiryReimbursementStatusToDo)
				if(!lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo.Result){
					lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=''
					lContactSupportSubjectEnquiryReimbursementStatusDetail=''
					lContactSupportSubjectEnquiryReimbursementStatusResult=''
				}else{
					lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo.MenuContactSupportSubjectEnquiryReimbursementStatusToDo
					lContactSupportSubjectEnquiryReimbursementStatusDetail=lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo.ContactSupportSubjectEnquiryReimbursementStatusDetail
					lContactSupportSubjectEnquiryReimbursementStatusResult=lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo.ContactSupportSubjectEnquiryReimbursementStatusResult
				}
				caseOutput.MenuContactSupportSubjectEnquiryReimbursementStatusToDo=lMenuContactSupportSubjectEnquiryReimbursementStatusToDo
				caseOutput.ContactSupportSubjectEnquiryReimbursementStatusDetail=lContactSupportSubjectEnquiryReimbursementStatusDetail
				caseOutput.ContactSupportSubjectEnquiryReimbursementStatusResult=lContactSupportSubjectEnquiryReimbursementStatusResult
				if(!lMapMenuContactSupportSubjectEnquiryReimbursementStatusToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectEnquiryReimbursementStatusResult.length()>0
				}
				Map lMapMenuContactSupportSubjectDeleteAccountToDo=this.inputMenuContactSupportSubjectDeleteAccountToDo(lMenuContactSupportSubjectDeleteAccountToDo)
				if(!lMapMenuContactSupportSubjectDeleteAccountToDo.Result){
					lMenuContactSupportSubjectDeleteAccountToDo=''
					lContactSupportSubjectDeleteAccountDetail=''
					lContactSupportSubjectDeleteAccountResult=''
				}else{
					lMenuContactSupportSubjectDeleteAccountToDo=lMapMenuContactSupportSubjectDeleteAccountToDo.MenuContactSupportSubjectDeleteAccountToDo
					lContactSupportSubjectDeleteAccountDetail=lMapMenuContactSupportSubjectDeleteAccountToDo.ContactSupportSubjectDeleteAccountDetail
					lContactSupportSubjectDeleteAccountResult=lMapMenuContactSupportSubjectDeleteAccountToDo.ContactSupportSubjectDeleteAccountResult
				}
				caseOutput.MenuContactSupportSubjectDeleteAccountToDo=lMenuContactSupportSubjectDeleteAccountToDo
				caseOutput.ContactSupportSubjectDeleteAccountDetail=lContactSupportSubjectDeleteAccountDetail
				caseOutput.ContactSupportSubjectDeleteAccountResult=lContactSupportSubjectDeleteAccountResult
				if(!lMapMenuContactSupportSubjectDeleteAccountToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectDeleteAccountToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectDeleteAccountToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectDeleteAccountToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectDeleteAccountResult.length()>0
				}
				Map lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo=this.inputMenuContactSupportSubjectRequestPolicyDocumentsToDo(lMenuContactSupportSubjectRequestPolicyDocumentsToDo)
				if(!lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo.Result){
					lMenuContactSupportSubjectRequestPolicyDocumentsToDo=''
					lContactSupportSubjectRequestPolicyDocumentsDetail=''
					lContactSupportSubjectRequestPolicyDocumentsResult=''
				}else{
					lMenuContactSupportSubjectRequestPolicyDocumentsToDo=lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo.MenuContactSupportSubjectRequestPolicyDocumentsToDo
					lContactSupportSubjectRequestPolicyDocumentsDetail=lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo.ContactSupportSubjectRequestPolicyDocumentsDetail
					lContactSupportSubjectRequestPolicyDocumentsResult=lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo.ContactSupportSubjectRequestPolicyDocumentsResult
				}
				caseOutput.MenuContactSupportSubjectRequestPolicyDocumentsToDo=lMenuContactSupportSubjectRequestPolicyDocumentsToDo
				caseOutput.ContactSupportSubjectRequestPolicyDocumentsDetail=lContactSupportSubjectRequestPolicyDocumentsDetail
				caseOutput.ContactSupportSubjectRequestPolicyDocumentsResult=lContactSupportSubjectRequestPolicyDocumentsResult
				if(!lMapMenuContactSupportSubjectRequestPolicyDocumentsToDo.Result){
					return lreturn
				}
				Boolean lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
				if(lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo){
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo
					THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lContactSupportSubjectRequestPolicyDocumentsResult.length()>0
				}
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuClaimToDo=this.inputMenuClaimToDo(lMenuClaimToDo)
			if(!lMapMenuClaimToDo.Result){
				lMenuClaimToDo=''
			}else{
				lMenuClaimToDo=lMapMenuClaimToDo.MenuClaimToDo
			}
			caseOutput.MenuClaimToDo=lMenuClaimToDo
			if(!lMapMenuClaimToDo.Result){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Boolean lIsMenuClaimToDo=IGNUemaHelper.convertStringToBoolean(lMenuClaimToDo)
			if(lIsMenuClaimToDo){
				Map lMapMenuClaimDetailNonClosureToDo=this.inputMenuClaimDetailNonClosureToDo(lMenuClaimDetailNonClosureToDo)
				if(!lMapMenuClaimDetailNonClosureToDo.Result){
					lMenuClaimDetailNonClosureToDo=''
					lClaimDetailNonClosureCardSelectedId=''
					lClaimDetailNonClosureCardSelectedDetail=''
				}else{
					lMenuClaimDetailNonClosureToDo=lMapMenuClaimDetailNonClosureToDo.MenuClaimDetailNonClosureToDo
					lClaimDetailNonClosureCardSelectedId=lMapMenuClaimDetailNonClosureToDo.ClaimDetailNonClosureCardSelectedId
					lClaimDetailNonClosureCardSelectedDetail=lMapMenuClaimDetailNonClosureToDo.ClaimDetailNonClosureCardSelectedDetail
				}
				caseOutput.MenuClaimDetailNonClosureToDo=lMenuClaimDetailNonClosureToDo
				caseOutput.ClaimDetailNonClosureCardSelectedId=lClaimDetailNonClosureCardSelectedId
				caseOutput.ClaimDetailNonClosureCardSelectedDetail=lClaimDetailNonClosureCardSelectedDetail
				if(!lMapMenuClaimDetailNonClosureToDo.Result){
					return lreturn
				}
				Map lMapMenuClaimDetailClosureStatusToDo=this.inputMenuClaimDetailClosureStatusToDo(lMenuClaimDetailClosureStatusToDo,lMenuClaimDetailClosureStatusUpdate)
				if(!lMapMenuClaimDetailClosureStatusToDo.Result){
					lMenuClaimDetailClosureStatusToDo=''
					lMenuClaimDetailClosureStatusUpdate=''
					lClaimDetailClosureStatusCardSelectedId=''
					lClaimDetailClosureStatusCardSelectedDetail=''
				}else{
					lMenuClaimDetailClosureStatusToDo=lMapMenuClaimDetailClosureStatusToDo.MenuClaimDetailClosureStatusToDo
					lMenuClaimDetailClosureStatusUpdate=lMapMenuClaimDetailClosureStatusToDo.MenuClaimDetailClosureStatusUpdate
					lClaimDetailClosureStatusCardSelectedId=lMapMenuClaimDetailClosureStatusToDo.ClaimDetailClosureStatusCardSelectedId
					lClaimDetailClosureStatusCardSelectedDetail=lMapMenuClaimDetailClosureStatusToDo.ClaimDetailClosureStatusCardSelectedDetail
				}
				caseOutput.MenuClaimDetailClosureStatusToDo=lMenuClaimDetailClosureStatusToDo
				caseOutput.MenuClaimDetailClosureStatusUpdate=lMenuClaimDetailClosureStatusUpdate
				caseOutput.ClaimDetailClosureStatusCardSelectedId=lClaimDetailClosureStatusCardSelectedId
				caseOutput.ClaimDetailClosureStatusCardSelectedDetail=lClaimDetailClosureStatusCardSelectedDetail
				if(!lMapMenuClaimDetailClosureStatusToDo.Result){
					return lreturn
				}
			}
			Map lMapMenuInspectionToDo=this.inputMenuInspectionToDo(lMenuInspectionToDo)
			if(!lMapMenuInspectionToDo.Result){
				lMenuInspectionToDo=''
				lInspectionDetail=''
				lInspectionResult=''
			}else{
				lMenuInspectionToDo=lMapMenuInspectionToDo.MenuInspectionToDo
				lInspectionDetail=lMapMenuInspectionToDo.InspectionDetail
				lInspectionResult=lMapMenuInspectionToDo.InspectionResult
			}
			caseOutput.MenuInspectionToDo=lMenuInspectionToDo
			caseOutput.InspectionDetail=lInspectionDetail
			caseOutput.InspectionResult=lInspectionResult
			if(!lMapMenuInspectionToDo.Result){
				return lreturn
			}
			Boolean lIsMenuInspectionToDo=IGNUemaHelper.convertStringToBoolean(lMenuInspectionToDo)
			if(lIsMenuInspectionToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuInspectionToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lInspectionResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuFindGarageToDo=this.inputMenuFindGarageToDo(lMenuFindGarageToDo)
			if(!lMapMenuFindGarageToDo.Result){
				lMenuFindGarageToDo=''
				lFindGarageDetail=''
				lFindGarageResult=''
			}else{
				lMenuFindGarageToDo=lMapMenuFindGarageToDo.MenuFindGarageToDo
				lFindGarageDetail=lMapMenuFindGarageToDo.FindGarageDetail
				lFindGarageResult=lMapMenuFindGarageToDo.FindGarageResult
			}
			caseOutput.MenuFindGarageToDo=lMenuFindGarageToDo
			caseOutput.FindGarageDetail=lFindGarageDetail
			caseOutput.FindGarageResult=lFindGarageResult
			if(!lMapMenuFindGarageToDo.Result){
				return lreturn
			}
			Boolean lIsMenuFindGarageToDo=IGNUemaHelper.convertStringToBoolean(lMenuFindGarageToDo)
			if(lIsMenuFindGarageToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuFindGarageToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lFindGarageResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuGetQuoteToDo=this.inputMenuGetQuoteToDo(lMenuGetQuoteToDo,lMenuGetQuoteSelectProductMotor,lMenuGetQuoteSelectProductHealth)
			if(!lMapMenuGetQuoteToDo.Result){
				lMenuGetQuoteToDo=''
				lMenuGetQuoteSelectProductMotor=''
				lMenuGetQuoteSelectProductHealth=''
				lGetQuoteItem01Detail=''
				lGetQuoteItem01Result=''
				lGetQuoteItem02Detail=''
				lGetQuoteItem02Result=''
				lGetQuoteItem03Detail=''
				lGetQuoteItem03Result=''
				lGetQuoteItem04Detail=''
				lGetQuoteItem04Result=''
				lGetQuoteItem05Detail=''
				lGetQuoteItem05Result=''
				lGetQuoteItem06Detail=''
				lGetQuoteItem06Result=''
				lGetQuoteItem07Detail=''
				lGetQuoteItem07Result=''
				lGetQuoteItem08Detail=''
				lGetQuoteItem08Result=''
				lGetQuoteItem09Detail=''
				lGetQuoteItem09Result=''
				lGetQuoteItem10Detail=''
				lGetQuoteItem10Result=''
				lGetQuoteSelectProductLineResult=''
			}else{
				lMenuGetQuoteToDo=lMapMenuGetQuoteToDo.MenuGetQuoteToDo
				lMenuGetQuoteSelectProductMotor=lMapMenuGetQuoteToDo.MenuGetQuoteSelectProductMotor
				lMenuGetQuoteSelectProductHealth=lMapMenuGetQuoteToDo.MenuGetQuoteSelectProductHealth
				lGetQuoteItem01Detail=lMapMenuGetQuoteToDo.GetQuoteItem01Detail
				lGetQuoteItem01Result=lMapMenuGetQuoteToDo.GetQuoteItem01Result
				lGetQuoteItem02Detail=lMapMenuGetQuoteToDo.GetQuoteItem02Detail
				lGetQuoteItem02Result=lMapMenuGetQuoteToDo.GetQuoteItem02Result
				lGetQuoteItem03Detail=lMapMenuGetQuoteToDo.GetQuoteItem03Detail
				lGetQuoteItem03Result=lMapMenuGetQuoteToDo.GetQuoteItem03Result
				lGetQuoteItem04Detail=lMapMenuGetQuoteToDo.GetQuoteItem04Detail
				lGetQuoteItem04Result=lMapMenuGetQuoteToDo.GetQuoteItem04Result
				lGetQuoteItem05Detail=lMapMenuGetQuoteToDo.GetQuoteItem05Detail
				lGetQuoteItem05Result=lMapMenuGetQuoteToDo.GetQuoteItem05Result
				lGetQuoteItem06Detail=lMapMenuGetQuoteToDo.GetQuoteItem06Detail
				lGetQuoteItem06Result=lMapMenuGetQuoteToDo.GetQuoteItem06Result
				lGetQuoteItem07Detail=lMapMenuGetQuoteToDo.GetQuoteItem07Detail
				lGetQuoteItem07Result=lMapMenuGetQuoteToDo.GetQuoteItem07Result
				lGetQuoteItem08Detail=lMapMenuGetQuoteToDo.GetQuoteItem08Detail
				lGetQuoteItem08Result=lMapMenuGetQuoteToDo.GetQuoteItem08Result
				lGetQuoteItem09Detail=lMapMenuGetQuoteToDo.GetQuoteItem09Detail
				lGetQuoteItem09Result=lMapMenuGetQuoteToDo.GetQuoteItem09Result
				lGetQuoteItem10Detail=lMapMenuGetQuoteToDo.GetQuoteItem10Detail
				lGetQuoteItem10Result=lMapMenuGetQuoteToDo.GetQuoteItem10Result
				lGetQuoteSelectProductLineResult=lMapMenuGetQuoteToDo.GetQuoteSelectProductLineResult
			}
			caseOutput.MenuGetQuoteToDo=lMenuGetQuoteToDo
			caseOutput.MenuGetQuoteSelectProductMotor=lMenuGetQuoteSelectProductMotor
			caseOutput.MenuGetQuoteSelectProductHealth=lMenuGetQuoteSelectProductHealth
			caseOutput.GetQuoteItem01Detail=lGetQuoteItem01Detail
			caseOutput.GetQuoteItem01Result=lGetQuoteItem01Result
			caseOutput.GetQuoteItem02Detail=lGetQuoteItem02Detail
			caseOutput.GetQuoteItem02Result=lGetQuoteItem02Result
			caseOutput.GetQuoteItem03Detail=lGetQuoteItem03Detail
			caseOutput.GetQuoteItem03Result=lGetQuoteItem03Result
			caseOutput.GetQuoteItem04Detail=lGetQuoteItem04Detail
			caseOutput.GetQuoteItem04Result=lGetQuoteItem04Result
			caseOutput.GetQuoteItem05Detail=lGetQuoteItem05Detail
			caseOutput.GetQuoteItem05Result=lGetQuoteItem05Result
			caseOutput.GetQuoteItem06Detail=lGetQuoteItem06Detail
			caseOutput.GetQuoteItem06Result=lGetQuoteItem06Result
			caseOutput.GetQuoteItem07Detail=lGetQuoteItem07Detail
			caseOutput.GetQuoteItem07Result=lGetQuoteItem07Result
			caseOutput.GetQuoteItem08Detail=lGetQuoteItem08Detail
			caseOutput.GetQuoteItem08Result=lGetQuoteItem08Result
			caseOutput.GetQuoteItem09Detail=lGetQuoteItem09Detail
			caseOutput.GetQuoteItem09Result=lGetQuoteItem09Result
			caseOutput.GetQuoteItem10Detail=lGetQuoteItem10Detail
			caseOutput.GetQuoteItem10Result=lGetQuoteItem10Result
			caseOutput.GetQuoteSelectProductLineResult=lGetQuoteSelectProductLineResult
			Boolean lIsMenuGetQuoteToDo=IGNUemaHelper.convertStringToBoolean(lMenuGetQuoteToDo)
			if(lIsMenuGetQuoteToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuGetQuoteToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lGetQuoteSelectProductLineResult.length()>0
				Boolean lIsGetQuoteSelectProductLineResult=IGNUemaHelper.convertStringToBoolean(lGetQuoteSelectProductLineResult)
				if(!lIsGetQuoteSelectProductLineResult){
					return lreturn
				}
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuReferFriendToDo=this.inputMenuReferFriendToDo(lMenuReferFriendToDo,lMenuReferFriendName,lMenuReferFriendMobile,lMenuReferFriendEmail)
			if(!lMapMenuReferFriendToDo.Result){
				lMenuReferFriendToDo=''
				lMenuReferFriendName=''
				lMenuReferFriendMobile=''
				lMenuReferFriendEmail=''
				lReferFriendDetail=''
				lReferFriendReferLink=''
				lReferFriendReferCode=''
				lReferFriendResult=''
			}else{
				lMenuReferFriendToDo=lMapMenuReferFriendToDo.MenuReferFriendToDo
				lMenuReferFriendName=lMapMenuReferFriendToDo.MenuReferFriendName
				lMenuReferFriendMobile=lMapMenuReferFriendToDo.MenuReferFriendMobile
				lMenuReferFriendEmail=lMapMenuReferFriendToDo.MenuReferFriendEmail
				lReferFriendDetail=lMapMenuReferFriendToDo.ReferFriendDetail
				lReferFriendReferLink=lMapMenuReferFriendToDo.ReferFriendReferLink
				lReferFriendReferCode=lMapMenuReferFriendToDo.ReferFriendReferCode
				lReferFriendResult=lMapMenuReferFriendToDo.ReferFriendResult
			}
			caseOutput.MenuReferFriendToDo=lMenuReferFriendToDo
			caseOutput.MenuReferFriendName=lMenuReferFriendName
			caseOutput.MenuReferFriendMobile=lMenuReferFriendMobile
			caseOutput.MenuReferFriendEmail=lMenuReferFriendEmail
			caseOutput.ReferFriendDetail=lReferFriendDetail
			caseOutput.ReferFriendReferLink=lReferFriendReferLink
			caseOutput.ReferFriendReferCode=lReferFriendReferCode
			caseOutput.ReferFriendResult=lReferFriendResult
			if(!lMapMenuReferFriendToDo.Result){
				return lreturn
			}
			Boolean lIsMenuReferFriendToDo=IGNUemaHelper.convertStringToBoolean(lMenuReferFriendToDo)
			if(lIsMenuReferFriendToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuReferFriendToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lReferFriendResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuFindNetworkHospitalToDo=this.inputMenuFindNetworkHospitalToDo(lMenuFindNetworkHospitalToDo)
			if(!lMapMenuFindNetworkHospitalToDo.Result){
				lMenuFindNetworkHospitalToDo=''
				lFindNetworkHospitalDetail=''
				lFindNetworkHospitalResult=''
			}else{
				lMenuFindNetworkHospitalToDo=lMapMenuFindNetworkHospitalToDo.MenuFindNetworkHospitalToDo
				lFindNetworkHospitalDetail=lMapMenuFindNetworkHospitalToDo.FindNetworkHospitalDetail
				lFindNetworkHospitalResult=lMapMenuFindNetworkHospitalToDo.FindNetworkHospitalResult
			}
			caseOutput.MenuFindNetworkHospitalToDo=lMenuFindNetworkHospitalToDo
			caseOutput.FindNetworkHospitalDetail=lFindNetworkHospitalDetail
			caseOutput.FindNetworkHospitalResult=lFindNetworkHospitalResult
			if(!lMapMenuFindNetworkHospitalToDo.Result){
				return lreturn
			}
			Boolean lIsMenuFindNetworkHospitalToDo=IGNUemaHelper.convertStringToBoolean(lMenuFindNetworkHospitalToDo)
			if(lIsMenuFindNetworkHospitalToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuFindNetworkHospitalToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lFindNetworkHospitalResult.length()>0
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapMenuRoojaiRewardToDo=this.inputMenuRoojaiRewardToDo(lMenuRoojaiRewardToDo,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail,lMenuRoojaiRewardVoucherAllToDo,lMenuRoojaiRewardVoucherInsuranceProductToDo,lMenuRoojaiRewardVoucherCharityToDo,lMenuRoojaiRewardVoucherPetrolToDo,lMenuRoojaiRewardVoucherKangarooToDo,lMenuRoojaiRewardVoucherTravelAndLifestyleToDo,lMenuRoojaiRewardVoucherFoodAndBeverageToDo,lMenuRoojaiRewardVoucherShoppingToDo)
			if(!lMapMenuRoojaiRewardToDo.Result){
				lMenuRoojaiRewardToDo=''
				lMenuRoojaiRewardName=''
				lMenuRoojaiRewardMobile=''
				lMenuRoojaiRewardEmail=''
				lMenuRoojaiRewardVoucherAllToDo=''
				lMenuRoojaiRewardVoucherInsuranceProductToDo=''
				lMenuRoojaiRewardVoucherCharityToDo=''
				lMenuRoojaiRewardVoucherPetrolToDo=''
				lMenuRoojaiRewardVoucherKangarooToDo=''
				lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=''
				lMenuRoojaiRewardVoucherFoodAndBeverageToDo=''
				lMenuRoojaiRewardVoucherShoppingToDo=''
				lRoojaiRewardMyPointSummaryBefore=''
				lRoojaiRewardMyPointBalanceBefore=''
				lRoojaiRewardMyPointPendingBefore=''
				lRoojaiRewardMyPointAvailableBefore=''
				lRoojaiRewardMyPointTotalBefore=''
				lRoojaiRewardMyRewardBefore=''
				lRoojaiRewardMyHistoryBefore=''
				lRoojaiRewardMyPointSummaryAfter=''
				lRoojaiRewardMyPointBalanceAfter=''
				lRoojaiRewardMyPointPendingAfter=''
				lRoojaiRewardMyPointAvailableAfter=''
				lRoojaiRewardMyPointTotalAfter=''
				lRoojaiRewardMyRewardAfter=''
				lRoojaiRewardMyHistoryAfter=''
				lRoojaiRewardVoucherAllDetail=''
				lRoojaiRewardVoucherAllAdditional=''
				lRoojaiRewardVoucherAllResult=''
				lRoojaiRewardVoucherInsuranceProductDetail=''
				lRoojaiRewardVoucherInsuranceProductAdditional=''
				lRoojaiRewardVoucherInsuranceProductResult=''
				lRoojaiRewardVoucherCharityDetail=''
				lRoojaiRewardVoucherCharityAdditional=''
				lRoojaiRewardVoucherCharityResult=''
				lRoojaiRewardVoucherPetrolDetail=''
				lRoojaiRewardVoucherPetrolAdditional=''
				lRoojaiRewardVoucherPetrolResult=''
				lRoojaiRewardVoucherKangarooDetail=''
				lRoojaiRewardVoucherKangarooAdditional=''
				lRoojaiRewardVoucherKangarooResult=''
				lRoojaiRewardVoucherTravelAndLifestyleDetail=''
				lRoojaiRewardVoucherTravelAndLifestyleAdditional=''
				lRoojaiRewardVoucherTravelAndLifestyleResult=''
				lRoojaiRewardVoucherFoodAndBeverageDetail=''
				lRoojaiRewardVoucherFoodAndBeverageAdditional=''
				lRoojaiRewardVoucherFoodAndBeverageResult=''
				lRoojaiRewardVoucherShoppingDetail=''
				lRoojaiRewardVoucherShoppingAdditional=''
				lRoojaiRewardVoucherShoppingResult=''
				lRoojaiRewardResult=''
			}else{
				lMenuRoojaiRewardToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardToDo
				lMenuRoojaiRewardName=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardName
				lMenuRoojaiRewardMobile=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardMobile
				lMenuRoojaiRewardEmail=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardEmail
				lMenuRoojaiRewardVoucherAllToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherAllToDo
				lMenuRoojaiRewardVoucherInsuranceProductToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherInsuranceProductToDo
				lMenuRoojaiRewardVoucherCharityToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherCharityToDo
				lMenuRoojaiRewardVoucherPetrolToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherPetrolToDo
				lMenuRoojaiRewardVoucherKangarooToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherKangarooToDo
				lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherTravelAndLifestyleToDo
				lMenuRoojaiRewardVoucherFoodAndBeverageToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherFoodAndBeverageToDo
				lMenuRoojaiRewardVoucherShoppingToDo=lMapMenuRoojaiRewardToDo.MenuRoojaiRewardVoucherShoppingToDo
				lRoojaiRewardMyPointSummaryBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointSummaryBefore
				lRoojaiRewardMyPointBalanceBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointBalanceBefore
				lRoojaiRewardMyPointPendingBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointPendingBefore
				lRoojaiRewardMyPointAvailableBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointAvailableBefore
				lRoojaiRewardMyPointTotalBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointTotalBefore
				lRoojaiRewardMyRewardBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyRewardBefore
				lRoojaiRewardMyHistoryBefore=lMapMenuRoojaiRewardToDo.RoojaiRewardMyHistoryBefore
				lRoojaiRewardMyPointSummaryAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointSummaryAfter
				lRoojaiRewardMyPointBalanceAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointBalanceAfter
				lRoojaiRewardMyPointPendingAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointPendingAfter
				lRoojaiRewardMyPointAvailableAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointAvailableAfter
				lRoojaiRewardMyPointTotalAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyPointTotalAfter
				lRoojaiRewardMyRewardAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyRewardAfter
				lRoojaiRewardMyHistoryAfter=lMapMenuRoojaiRewardToDo.RoojaiRewardMyHistoryAfter
				lRoojaiRewardVoucherAllDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherAllDetail
				lRoojaiRewardVoucherAllAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherAllAdditional
				lRoojaiRewardVoucherAllResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherAllResult
				lRoojaiRewardVoucherInsuranceProductDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherInsuranceProductDetail
				lRoojaiRewardVoucherInsuranceProductAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherInsuranceProductAdditional
				lRoojaiRewardVoucherInsuranceProductResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherInsuranceProductResult
				lRoojaiRewardVoucherCharityDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherCharityDetail
				lRoojaiRewardVoucherCharityAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherCharityAdditional
				lRoojaiRewardVoucherCharityResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherCharityResult
				lRoojaiRewardVoucherPetrolDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherPetrolDetail
				lRoojaiRewardVoucherPetrolAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherPetrolAdditional
				lRoojaiRewardVoucherPetrolResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherPetrolResult
				lRoojaiRewardVoucherKangarooDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherKangarooDetail
				lRoojaiRewardVoucherKangarooAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherKangarooAdditional
				lRoojaiRewardVoucherKangarooResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherKangarooResult
				lRoojaiRewardVoucherTravelAndLifestyleDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherTravelAndLifestyleDetail
				lRoojaiRewardVoucherTravelAndLifestyleAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherTravelAndLifestyleAdditional
				lRoojaiRewardVoucherTravelAndLifestyleResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherTravelAndLifestyleResult
				lRoojaiRewardVoucherFoodAndBeverageDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherFoodAndBeverageDetail
				lRoojaiRewardVoucherFoodAndBeverageAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherFoodAndBeverageAdditional
				lRoojaiRewardVoucherFoodAndBeverageResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherFoodAndBeverageResult
				lRoojaiRewardVoucherShoppingDetail=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherShoppingDetail
				lRoojaiRewardVoucherShoppingAdditional=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherShoppingAdditional
				lRoojaiRewardVoucherShoppingResult=lMapMenuRoojaiRewardToDo.RoojaiRewardVoucherShoppingResult
				lRoojaiRewardResult=lMapMenuRoojaiRewardToDo.RoojaiRewardResult
			}
			caseOutput.MenuRoojaiRewardToDo=lMenuRoojaiRewardToDo
			caseOutput.MenuRoojaiRewardName=lMenuRoojaiRewardName
			caseOutput.MenuRoojaiRewardMobile=lMenuRoojaiRewardMobile
			caseOutput.MenuRoojaiRewardEmail=lMenuRoojaiRewardEmail
			caseOutput.MenuRoojaiRewardVoucherAllToDo=lMenuRoojaiRewardVoucherAllToDo
			caseOutput.MenuRoojaiRewardVoucherInsuranceProductToDo=lMenuRoojaiRewardVoucherInsuranceProductToDo
			caseOutput.MenuRoojaiRewardVoucherCharityToDo=lMenuRoojaiRewardVoucherCharityToDo
			caseOutput.MenuRoojaiRewardVoucherPetrolToDo=lMenuRoojaiRewardVoucherPetrolToDo
			caseOutput.MenuRoojaiRewardVoucherKangarooToDo=lMenuRoojaiRewardVoucherKangarooToDo
			caseOutput.MenuRoojaiRewardVoucherTravelAndLifestyleToDo=lMenuRoojaiRewardVoucherTravelAndLifestyleToDo
			caseOutput.MenuRoojaiRewardVoucherFoodAndBeverageToDo=lMenuRoojaiRewardVoucherFoodAndBeverageToDo
			caseOutput.MenuRoojaiRewardVoucherShoppingToDo=lMenuRoojaiRewardVoucherShoppingToDo
			caseOutput.RoojaiRewardMyPointSummaryBefore=lRoojaiRewardMyPointSummaryBefore
			caseOutput.RoojaiRewardMyPointBalanceBefore=lRoojaiRewardMyPointBalanceBefore
			caseOutput.RoojaiRewardMyPointPendingBefore=lRoojaiRewardMyPointPendingBefore
			caseOutput.RoojaiRewardMyPointAvailableBefore=lRoojaiRewardMyPointAvailableBefore
			caseOutput.RoojaiRewardMyPointTotalBefore=lRoojaiRewardMyPointTotalBefore
			caseOutput.RoojaiRewardMyRewardBefore=lRoojaiRewardMyRewardBefore
			caseOutput.RoojaiRewardMyHistoryBefore=lRoojaiRewardMyHistoryBefore
			caseOutput.RoojaiRewardMyPointSummaryAfter=lRoojaiRewardMyPointSummaryAfter
			caseOutput.RoojaiRewardMyPointBalanceAfter=lRoojaiRewardMyPointBalanceAfter
			caseOutput.RoojaiRewardMyPointPendingAfter=lRoojaiRewardMyPointPendingAfter
			caseOutput.RoojaiRewardMyPointAvailableAfter=lRoojaiRewardMyPointAvailableAfter
			caseOutput.RoojaiRewardMyPointTotalAfter=lRoojaiRewardMyPointTotalAfter
			caseOutput.RoojaiRewardMyRewardAfter=lRoojaiRewardMyRewardAfter
			caseOutput.RoojaiRewardMyHistoryAfter=lRoojaiRewardMyHistoryAfter
			caseOutput.RoojaiRewardVoucherAllDetail=lRoojaiRewardVoucherAllDetail
			caseOutput.RoojaiRewardVoucherAllAdditional=lRoojaiRewardVoucherAllAdditional
			caseOutput.RoojaiRewardVoucherAllResult=lRoojaiRewardVoucherAllResult
			caseOutput.RoojaiRewardVoucherInsuranceProductDetail=lRoojaiRewardVoucherInsuranceProductDetail
			caseOutput.RoojaiRewardVoucherInsuranceProductAdditional=lRoojaiRewardVoucherInsuranceProductAdditional
			caseOutput.RoojaiRewardVoucherInsuranceProductResult=lRoojaiRewardVoucherInsuranceProductResult
			caseOutput.RoojaiRewardVoucherCharityDetail=lRoojaiRewardVoucherCharityDetail
			caseOutput.RoojaiRewardVoucherCharityAdditional=lRoojaiRewardVoucherCharityAdditional
			caseOutput.RoojaiRewardVoucherCharityResult=lRoojaiRewardVoucherCharityResult
			caseOutput.RoojaiRewardVoucherPetrolDetail=lRoojaiRewardVoucherPetrolDetail
			caseOutput.RoojaiRewardVoucherPetrolAdditional=lRoojaiRewardVoucherPetrolAdditional
			caseOutput.RoojaiRewardVoucherPetrolResult=lRoojaiRewardVoucherPetrolResult
			caseOutput.RoojaiRewardVoucherKangarooDetail=lRoojaiRewardVoucherKangarooDetail
			caseOutput.RoojaiRewardVoucherKangarooAdditional=lRoojaiRewardVoucherKangarooAdditional
			caseOutput.RoojaiRewardVoucherKangarooResult=lRoojaiRewardVoucherKangarooResult
			caseOutput.RoojaiRewardVoucherTravelAndLifestyleDetail=lRoojaiRewardVoucherTravelAndLifestyleDetail
			caseOutput.RoojaiRewardVoucherTravelAndLifestyleAdditional=lRoojaiRewardVoucherTravelAndLifestyleAdditional
			caseOutput.RoojaiRewardVoucherTravelAndLifestyleResult=lRoojaiRewardVoucherTravelAndLifestyleResult
			caseOutput.RoojaiRewardVoucherFoodAndBeverageDetail=lRoojaiRewardVoucherFoodAndBeverageDetail
			caseOutput.RoojaiRewardVoucherFoodAndBeverageAdditional=lRoojaiRewardVoucherFoodAndBeverageAdditional
			caseOutput.RoojaiRewardVoucherFoodAndBeverageResult=lRoojaiRewardVoucherFoodAndBeverageResult
			caseOutput.RoojaiRewardVoucherShoppingDetail=lRoojaiRewardVoucherShoppingDetail
			caseOutput.RoojaiRewardVoucherShoppingAdditional=lRoojaiRewardVoucherShoppingAdditional
			caseOutput.RoojaiRewardVoucherShoppingResult=lRoojaiRewardVoucherShoppingResult
			caseOutput.RoojaiRewardResult=lRoojaiRewardResult
			if(!lMapMenuRoojaiRewardToDo.Result){
				return lreturn
			}
			Boolean lIsMenuRoojaiRewardToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardToDo)
			if(lIsMenuRoojaiRewardToDo){
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG=lIsMenuRoojaiRewardToDo
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT=lRoojaiRewardResult.length()>0
			}
			if(!this.waitUntilLoaded()){
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
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lLocatorLoadingForm='#app #processing'
			String lLocatorErrorModalForm='#app #errmsgModal'
			String lLocatorErrorModalFormCloseButton='#app #errmsgModal button'
			Boolean lIsError=false
			WebElement lElementErrorModalFormCloseButton=null
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
			if(lIsError){
				lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
				if(lElementErrorModalFormCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
				if(lIsError){
					lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
					if(lElementErrorModalFormCloseButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorLoadingForm,60)
			}
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorLoadingForm)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lIsError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorErrorModalForm)
				if(lIsError){
					lElementErrorModalFormCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorErrorModalFormCloseButton)
					if(lElementErrorModalFormCloseButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormCloseButton)
						IGNUemaHelper.delayThreadSecond(1)
					}
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
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THAMyAccountNewbizMainType.DEFAULT_POSITIVE_CASE
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
	public Map inputActualAccountName(String strActualAccountName){
		Map lreturn=[:]
		String lActualAccountName=''
		try{
			Boolean lResult=false
			lreturn.put('ActualAccountName','')
			lreturn.put('Result',lResult)
			String lTagActualAccountNameButton='customer-name'
			String lLocatorActualAccountNameButton=IGNUemaHelper.getTagDataSeleniumKey(lTagActualAccountNameButton)
			WebElement lElementActualAccountNameButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagActualAccountNameButton)
			if(!lElementActualAccountNameButton){
				return lreturn
			}
			lActualAccountName=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementActualAccountNameButton)
			lResult=lActualAccountName.length()>0
			if(lResult){
				lreturn.put('ActualAccountName',lActualAccountName)
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
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMyAccountNewbizMainType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagLanguageButtonItem='language'
			String lLocatorLanguageButtonItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagLanguageButtonItem,lLanguageItem)
			WebElement lElementLanguageButtonItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagLanguageButtonItem,lLanguageItem)
			if(!lElementLanguageButtonItem){
				lLanguage='No Option'
			}else{
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementLanguageButtonItem)
				String lTagLanguageButtonSelected='select-language'
				String lLocatorLanguageButtonSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagLanguageButtonSelected)
				WebElement lElementLanguageButtonSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagLanguageButtonSelected)
				if(!lElementLanguageButtonSelected){
					lLanguage=lLanguageItem
				}else{
					lLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementLanguageButtonSelected)
				}
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAMyAccountNewbizMainType.DEFAULT_LANGUAGE
			}
			lLanguage=lLanguage.toUpperCase().trim()
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
	public static final String CONST_TAG_MAIN_MENU_LIST='sticky-menu'
	public static final String CONST_TAG_MAIN_MENU_ITEM_HOME='home'
	public static final String CONST_TAG_MAIN_MENU_ITEM_POLICY='policy'
	public static final String CONST_TAG_MAIN_MENU_ITEM_PAYMENT='payments'
	public static final String CONST_TAG_MAIN_MENU_ITEM_CLAIM='claims'
	public static final String CONST_TAG_MAIN_MENU_ITEM_PROFILE='profile'
	public static final String CONST_TAG_MAIN_MENU_ITEM_DOC_DOWNLOAD='downloadDocument'
	public static final String CONST_TAG_MAIN_MENU_ITEM_CONTACT_SUPPORT='contactSupport'
	public static final String CONST_TAG_MAIN_MENU_ITEM_INSPECTION='carInspection'
	public static final String CONST_TAG_MAIN_MENU_ITEM_FIND_GARAGE='findAGarage'
	public static final String CONST_TAG_MAIN_MENU_ITEM_GET_QUOTE='get quote'
	public static final String CONST_TAG_MAIN_MENU_ITEM_REFER_FRIEND='Refer Friends'
	public static final String CONST_TAG_MAIN_MENU_ITEM_FIND_NETWORK_HOSPITAL='findAHospital'
	public static final String CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD='rewards'
	public static final String CONST_TAG_MENU_PAYMENT_CARD_LIST='card-list'
	public static final String CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL='payment-details-btn'
	public static final String CONST_TAG_MENU_PAYMENT_BUTTON_CHANGE_CARD='change-card-btn'
	public static final String CONST_TAG_MENU_PAYMENT_BUTTON_PAY_NOW='paynow-btn'
	public static final String CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION='download-document'
	public static final String CONST_TAG_MENU_PAYMENT_INSTALMENT_LIST='payment-list'
	public static final String CONST_TAG_MENU_PROFILE_BUTTON_EDIT='edit-profile'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_MAIN='vehicles'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_MOTOR_CAR='MotorCar'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_MOTOR_BIKE='MotorBike'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_EXTENDED_WARRANTY='extendedWarranty'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_LOW_MILEAGE='LowMileage'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_LIST='card-list'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST='card-datail'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_CARD_COMPULSORY_LIST='card-compulsory'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_BUTTON_HISTORY='history-btn'
	public static final String CONST_TAG_MENU_POLICY_VEHICLE_BUTTON_COMPULSORY='goto-compulsory-btn'
	public static final String CONST_TAG_MENU_DOC_DOWNLOAD_CARD_LIST='card-list'
	public static final String CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK='epolicy-handbook-document-btn'
	public static final String CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_SELECT_SUBJECT='subject-ticket'
	public static final String CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_SELECT_POLICY='policies-list'
	public static final String CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_INPUT_MESSAGE='write-msg'
	public static final String CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_BUTTON_SUBMIT='submit-btn'
	public static final String CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_BUTTON_SUBMIT_CLOSE='info-modal-1-close'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_CANCER='health'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_CRITICAL_ILLNESS='ci'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_PERSONAL_ACCIDENT='personal-accident'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_COVID='covid19'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_LIST='card-list'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_DECK_LIST='card-deck-list'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_DECK_ITEM='card-deck'
	public static final String CONST_TAG_MENU_POLICY_HEALTH_CARD_DETAIL_LIST='card-datail'
	public static final String CONST_TAG_MENU_GET_QUOTE_CHECK_BRAND='carBrand'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_OPEN_BUTTON='my-points-details'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_FORM='my-points-modal'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_MY_REWARD_OPEN_BUTTON='myWallet'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_HISTORY_OPEN_BUTTON='myHistory'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON='rewardsStore'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON='click-categories'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST='select-categories'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST='voucher-item'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO='kangaroo'
	public static final String CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON='loadmore-btn'
	public Map inputMenuPaymentToDo(String strMenuPaymentToDo){
		Map lreturn=[:]
		String lMenuPaymentToDo=strMenuPaymentToDo.trim()
		if(lMenuPaymentToDo.length()<=0){
			lMenuPaymentToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuPaymentToDo=IGNUemaHelper.convertStringToBoolean(lMenuPaymentToDo)
			if(lIsMenuPaymentToDo){
				String lTagMenuPaymentButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuPaymentButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_PAYMENT
				String lLocatorMenuPaymentButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
				WebElement lElementMenuPaymentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
				if(!lElementMenuPaymentButton){
					lIsMenuPaymentToDo=false
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentButton)
					this.waitUntilLoaded()
				}
			}
			lMenuPaymentToDo=IGNUemaHelper.convertBooleanToString(lIsMenuPaymentToDo)
			lResult=lMenuPaymentToDo.length()>0
			if(lResult){
				lreturn.put('MenuPaymentToDo',lMenuPaymentToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentOpenTermAndCondition(String strMenuPaymentOpenTermAndCondition,String strPaymentCardItemDetail){
		Map lreturn=[:]
		String lMenuPaymentOpenTermAndCondition=strMenuPaymentOpenTermAndCondition.trim()
		if(lMenuPaymentOpenTermAndCondition.length()<=0){
			lMenuPaymentOpenTermAndCondition=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_OPEN_TERM_AND_CONDITION
		}
		String lPaymentTermAndCondition=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentOpenTermAndCondition','')
			lreturn.put('PaymentTermAndCondition','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuPaymentOpenTermAndCondition=IGNUemaHelper.convertStringToBoolean(lMenuPaymentOpenTermAndCondition)
			lMenuPaymentOpenTermAndCondition=''
			String lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
			String lLocatorOpenTermAndConditionButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenTermAndConditionButton)
			WebElement lElementOpenTermAndConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenTermAndConditionButton)
			if(!lElementOpenTermAndConditionButton){
				lIsMenuPaymentOpenTermAndCondition=false
			}
			if(lIsMenuPaymentOpenTermAndCondition){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementOpenTermAndConditionButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenTermAndConditionButton)
				String lMainWindow=this.driver.getWindowHandle()
				IGNUemaHelper.delayThreadSecond(3)
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
				}
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
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
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							IGNUemaHelper.delayThreadSecond(1)
							lPaymentTermAndCondition='Passed'
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
				IGNUemaHelper.delayThreadSecond(1)
			}
			lMenuPaymentOpenTermAndCondition=IGNUemaHelper.convertBooleanToString(lIsMenuPaymentOpenTermAndCondition)
			lResult=lMenuPaymentOpenTermAndCondition.length()>0
			if(lResult){
				lreturn.put('MenuPaymentOpenTermAndCondition',lMenuPaymentOpenTermAndCondition)
				lreturn.put('PaymentTermAndCondition',lPaymentTermAndCondition)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentCardItemDetail(String strPaymentCardItemDetail){
		Map lreturn=[:]
		String lPaymentCardItemDetail=''
		try{
			Boolean lResult=false
			lreturn.put('PaymentCardItemDetail','')
			lreturn.put('Result',lResult)
			String lTagMenuPaymentCardList=this.CONST_TAG_MENU_PAYMENT_CARD_LIST
			String lLocatorMenuPaymentCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardList)
			List<WebElement> lElementMenuPaymentCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagMenuPaymentCardList)
			WebElement lElementMenuPaymentCardItem=null
			if(lElementMenuPaymentCardList){
				lElementMenuPaymentCardItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementMenuPaymentCardList)
			}
			if(!lElementMenuPaymentCardItem){
				lPaymentCardItemDetail='No Option'
			}else{
				String lTagPaymentDetailButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL
				String lLocatorPaymentDetailButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDetailButton)
				WebElement lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
				if(!lElementPaymentDetailButton){
					lPaymentCardItemDetail='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.delayThreadSecond(1)
					lPaymentCardItemDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMenuPaymentCardItem)+'\n'
					lPaymentCardItemDetail=lPaymentCardItemDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
				}
			}
			lResult=lPaymentCardItemDetail.length()>0
			if(lResult){
				lreturn.put('PaymentCardItemDetail',lPaymentCardItemDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentChangeCreditCard(String strMenuPaymentChangeCreditCard){
		Map lreturn=[:]
		String lMenuPaymentChangeCreditCard=strMenuPaymentChangeCreditCard.trim()
		if(lMenuPaymentChangeCreditCard.length()<=0){
			lMenuPaymentChangeCreditCard=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_CHANGE_CREDIT_CARD
		}
		String lPaymentCardItemChangeCreditCardDetail=''
		String lPaymentCardItemChangeCreditCardResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentChangeCreditCard','')
			lreturn.put('PaymentCardItemChangeCreditCardDetail','')
			lreturn.put('PaymentCardItemChangeCreditCardResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuPaymentChangeCreditCard=IGNUemaHelper.convertStringToBoolean(lMenuPaymentChangeCreditCard)
			lMenuPaymentChangeCreditCard=''
			WebElement lElementMenuPaymentCardItem=null
			String lTagMenuPaymentCardChangeButtonOpen=this.CONST_TAG_MENU_PAYMENT_BUTTON_CHANGE_CARD
			String lLocatorMenuPaymentCardChangeButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardChangeButtonOpen)
			WebElement lElementMenuPaymentCardChangeButtonOpen=null
			if(lIsMenuPaymentChangeCreditCard){
				String lTagMenuPaymentCardList=this.CONST_TAG_MENU_PAYMENT_CARD_LIST
				String lLocatorMenuPaymentCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardList)
				List<WebElement> lElementMenuPaymentCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagMenuPaymentCardList)
				if(lElementMenuPaymentCardList){
					for(WebElement lElementMenuPaymentCardItemFind in lElementMenuPaymentCardList){
						lElementMenuPaymentCardChangeButtonOpen=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementMenuPaymentCardItemFind,lLocatorMenuPaymentCardChangeButtonOpen,false)
						if(lElementMenuPaymentCardChangeButtonOpen){
							lElementMenuPaymentCardItem=lElementMenuPaymentCardItemFind
							break
						}
					}
				}
			}
			if(!lElementMenuPaymentCardItem){
				lPaymentCardItemChangeCreditCardDetail='No Option'
				lIsMenuPaymentChangeCreditCard=false
			}
			if(lIsMenuPaymentChangeCreditCard){
				String lOpportunityNumber=''
				String lTagPaymentDetailButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL
				String lLocatorPaymentDetailButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDetailButton)
				WebElement lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
				if(!lElementPaymentDetailButton){
					lPaymentCardItemChangeCreditCardDetail='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMenuPaymentCardItem)
					lPaymentCardItemChangeCreditCardDetail=lOpportunityNumber+'\n'
					lPaymentCardItemChangeCreditCardDetail=lPaymentCardItemChangeCreditCardDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentCardChangeButtonOpen)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentCardChangeButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					String lLocatorChangeCardFormModal='#change-card-modal'
					if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorChangeCardFormModal)){
						IGNUemaHelper.delayThreadSecond(1)
						if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorChangeCardFormModal)){
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
					Boolean lIsChangeCardFormModalDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorChangeCardFormModal,10)
					if(lIsChangeCardFormModalDisplayed){
						String lTagCreditCardNumberInput='card-number'
						String lLocatorCreditCardNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCreditCardNumberInput)
						WebElement lElementCreditCardNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCreditCardNumberInput)
						if(lElementCreditCardNumberInput){
							String lCreditCardNumberText='5454545454545454'
							lCreditCardNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardNumberInput,lCreditCardNumberText)
						}
						String lTagCardHolderNameInput='card-name'
						String lLocatorCardHolderNameInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCardHolderNameInput)
						WebElement lElementCardHolderNameInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardHolderNameInput)
						if(lElementCardHolderNameInput){
							String lCardHolderNameText='MyAccount ChangeCard'
							lCardHolderNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardHolderNameInput,lCardHolderNameText)
						}
						String lTagSelectCcExpiryMonth='card-exp-month'
						String lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
						WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
						if(lElementSelectCcExpiryMonth){
							String lCcExpiryMonthText='12'
							Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
							lSelectCcExpiryMonth.selectByVisibleText(lCcExpiryMonthText)
							WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
							lCcExpiryMonthText=lElementSelectCcExpiryMonthSelected.getText()
						}
						String lTagSelectCcExpiryYear='card-exp-year'
						String lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
						WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
						if(lElementSelectCcExpiryYear){
							String lCcExpiryYearText='2027'
							Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
							lSelectCcExpiryYear.selectByVisibleText(lCcExpiryYearText)
							WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
							lCcExpiryYearText=lElementSelectCcExpiryYearSelected.getText()
						}
						String lTagCreditCardCvvNumberInput='card-cvv'
						String lLocatorCreditCardCvvNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCreditCardCvvNumberInput)
						WebElement lElementCreditCardCvvNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCreditCardCvvNumberInput)
						if(lElementCreditCardCvvNumberInput){
							String lCreditCardCvvNumberText='789'
							lCreditCardCvvNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardCvvNumberInput,lCreditCardCvvNumberText)
						}
						String lTagCardBankNameInput='card-bank'
						String lLocatorCardBankNameInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCardBankNameInput)
						WebElement lElementCardBankNameInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardBankNameInput)
						if(lElementCardBankNameInput){
							String lCardBankNameText='MyAccount ChangeBank'
							lCardBankNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardBankNameInput,lCardBankNameText)
						}
						String lTagCardChangeSubmitButton='change-card-save-btn'
						String lLocatorCardChangeSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCardChangeSubmitButton)
						WebElement lElementCardChangeSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardChangeSubmitButton)
						if(lElementCardChangeSubmitButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementCardChangeSubmitButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCardChangeSubmitButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
						if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorChangeCardFormModal)){
							IGNUemaHelper.delayThreadSecond(1)
							if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorChangeCardFormModal)){
								IGNUemaHelper.delayThreadSecond(3)
							}
						}
						Boolean lIsChangeCardFormModalNotDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorChangeCardFormModal,10)
						if(lIsChangeCardFormModalNotDisplayed){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagFormChangeCardDismiss='info-modal-1'
							String lLocatorFormChangeCardDismiss=IGNUemaHelper.getTagDataSeleniumKey(lTagFormChangeCardDismiss)
							WebElement lElementFormChangeCardDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormChangeCardDismiss)
							if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormChangeCardDismiss)){
								IGNUemaHelper.delayThreadSecond(1)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormChangeCardDismiss)){
									IGNUemaHelper.delayThreadSecond(3)
								}
							}
							Boolean lIsFormChangeCardDismissDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormChangeCardDismiss,20)
							lElementFormChangeCardDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormChangeCardDismiss)
							if(!lElementFormChangeCardDismiss){
								lIsFormChangeCardDismissDisplayed=false
							}
							if(lIsFormChangeCardDismissDisplayed){
								String lTagCardChangeDismissButton='info-modal-1-submit'
								String lLocatorCardChangeDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCardChangeDismissButton)
								WebElement lElementCardChangeDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementFormChangeCardDismiss,lTagCardChangeDismissButton)
								if(lElementCardChangeDismissButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementCardChangeDismissButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCardChangeDismissButton)
									IGNUemaHelper.delayThreadSecond(1)
									Boolean lIsDoneChangeCard=this.waitUntilLoaded()
									lPaymentCardItemChangeCreditCardResult=IGNUemaHelper.convertBooleanToString(lIsDoneChangeCard)
									if(lIsDoneChangeCard){
										lElementMenuPaymentCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,this.CONST_TAG_MENU_PAYMENT_CARD_LIST,lOpportunityNumber)
										if(lElementMenuPaymentCardItem){
											lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
											if(lElementPaymentDetailButton){
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
												IGNUemaHelper.delayThreadSecond(1)
												lPaymentCardItemChangeCreditCardDetail=lPaymentCardItemChangeCreditCardDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
											}
										}
									}
								}
							}
						}
					}
				}
			}
			lMenuPaymentChangeCreditCard=IGNUemaHelper.convertBooleanToString(lIsMenuPaymentChangeCreditCard)
			if(!lIsMenuPaymentChangeCreditCard){
				lResult=lMenuPaymentChangeCreditCard.length()>0
			}else{
				lResult=lPaymentCardItemChangeCreditCardResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuPaymentChangeCreditCard',lMenuPaymentChangeCreditCard)
				lreturn.put('PaymentCardItemChangeCreditCardDetail',lPaymentCardItemChangeCreditCardDetail)
				lreturn.put('PaymentCardItemChangeCreditCardResult',lPaymentCardItemChangeCreditCardResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentMakePaymentCardOld(String strMenuPaymentMakePaymentCardOld){
		Map lreturn=[:]
		String lMenuPaymentMakePaymentCardOld=strMenuPaymentMakePaymentCardOld.trim()
		if(lMenuPaymentMakePaymentCardOld.length()<=0){
			lMenuPaymentMakePaymentCardOld=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_MAKE_PAYMENT_CARD_OLD
		}
		String lPaymentCardItemMakePaymentCardOldDetail=''
		String lPaymentCardItemMakePaymentCardOldResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentMakePaymentCardOld','')
			lreturn.put('PaymentCardItemMakePaymentCardOldDetail','')
			lreturn.put('PaymentCardItemMakePaymentCardOldResult','')
			lreturn.put('Result',lResult)
			Integer lIndexTry=0
			Map lMapMenuPaymentMakePaymentCardOldTry=[:]
			for(lIndexTry=1;lIndexTry<=5;lIndexTry++){
				lMapMenuPaymentMakePaymentCardOldTry=this.inputMenuPaymentMakePaymentCardOldTry(lMenuPaymentMakePaymentCardOld)
				if(!lMapMenuPaymentMakePaymentCardOldTry.Result){
					String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
					String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
					String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
					WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
					if(lElementMenuPolicyButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
						this.waitUntilLoaded()
						IGNUemaHelper.delayThreadSecond(lIndexTry*3)
					}
				}else{
					break
				}
			}
			if(!lMapMenuPaymentMakePaymentCardOldTry.Result){
				lMenuPaymentMakePaymentCardOld=''
				lPaymentCardItemMakePaymentCardOldDetail=''
				lPaymentCardItemMakePaymentCardOldResult=''
			}else{
				lMenuPaymentMakePaymentCardOld=lMapMenuPaymentMakePaymentCardOldTry.MenuPaymentMakePaymentCardOld
				lPaymentCardItemMakePaymentCardOldDetail=lMapMenuPaymentMakePaymentCardOldTry.PaymentCardItemMakePaymentCardOldDetail
				lPaymentCardItemMakePaymentCardOldResult=lMapMenuPaymentMakePaymentCardOldTry.PaymentCardItemMakePaymentCardOldResult
			}
			lResult=lMapMenuPaymentMakePaymentCardOldTry.Result
			if(lResult){
				lreturn.put('MenuPaymentMakePaymentCardOld',lMenuPaymentMakePaymentCardOld)
				lreturn.put('PaymentCardItemMakePaymentCardOldDetail',lPaymentCardItemMakePaymentCardOldDetail)
				lreturn.put('PaymentCardItemMakePaymentCardOldResult',lPaymentCardItemMakePaymentCardOldResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentMakePaymentCardOldTry(String strMenuPaymentMakePaymentCardOld){
		Map lreturn=[:]
		String lMenuPaymentMakePaymentCardOld=strMenuPaymentMakePaymentCardOld.trim()
		if(lMenuPaymentMakePaymentCardOld.length()<=0){
			lMenuPaymentMakePaymentCardOld=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_MAKE_PAYMENT_CARD_OLD
		}
		String lPaymentCardItemMakePaymentCardOldDetail=''
		String lPaymentCardItemMakePaymentCardOldResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentMakePaymentCardOld','')
			lreturn.put('PaymentCardItemMakePaymentCardOldDetail','')
			lreturn.put('PaymentCardItemMakePaymentCardOldResult','')
			lreturn.put('Result',lResult)
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorButtonMenuPolicy=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(lElementMenuPolicyButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
				this.waitUntilLoaded()
			}
			String lTagMenuPaymentButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPaymentButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_PAYMENT
			String lLocatorMenuPaymentButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
			WebElement lElementMenuPaymentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
			if(lElementMenuPaymentButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentButton)
				this.waitUntilLoaded()
			}
			Boolean lIsMenuPaymentMakePaymentCardOld=IGNUemaHelper.convertStringToBoolean(lMenuPaymentMakePaymentCardOld)
			lMenuPaymentMakePaymentCardOld=''
			WebElement lElementMenuPaymentCardItem=null
			String lTagMenuPaymentCardPayNowButtonOpen=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAY_NOW
			String lLocatorMenuPaymentCardPayNowButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardPayNowButtonOpen)
			WebElement lElementMenuPaymentCardPayNowButtonOpen=null
			if(lIsMenuPaymentMakePaymentCardOld){
				String lTagMenuPaymentCardList=this.CONST_TAG_MENU_PAYMENT_CARD_LIST
				String lLocatorMenuPaymentCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardList)
				List<WebElement> lElementMenuPaymentCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagMenuPaymentCardList)
				if(lElementMenuPaymentCardList){
					for(WebElement lElementMenuPaymentCardItemFind in lElementMenuPaymentCardList){
						lElementMenuPaymentCardPayNowButtonOpen=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementMenuPaymentCardItemFind,lLocatorMenuPaymentCardPayNowButtonOpen,false)
						if(lElementMenuPaymentCardPayNowButtonOpen){
							lElementMenuPaymentCardItem=lElementMenuPaymentCardItemFind
							break
						}
					}
				}
			}
			if(!lElementMenuPaymentCardItem){
				lPaymentCardItemMakePaymentCardOldDetail='No Option'
				lIsMenuPaymentMakePaymentCardOld=false
			}
			if(lIsMenuPaymentMakePaymentCardOld){
				String lOpportunityNumber=''
				String lTagPaymentDetailButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL
				String lLocatorPaymentDetailButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDetailButton)
				WebElement lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
				if(!lElementPaymentDetailButton){
					lPaymentCardItemMakePaymentCardOldDetail='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMenuPaymentCardItem)
					lPaymentCardItemMakePaymentCardOldDetail=lOpportunityNumber+'\n'
					lPaymentCardItemMakePaymentCardOldDetail=lPaymentCardItemMakePaymentCardOldDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentCardPayNowButtonOpen)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentCardPayNowButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					this.waitUntilLoaded()
					String lLocatorFormInstalmentModal='#paymentDropdown'
					if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormInstalmentModal)){
						IGNUemaHelper.delayThreadSecond(1)
						if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormInstalmentModal)){
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
					Boolean lIsFormInstalmentModalDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormInstalmentModal,10)
					if(lIsFormInstalmentModalDisplayed){
						String lTagPaymentInstalmentItemKey=this.CONST_TAG_MENU_PAYMENT_INSTALMENT_LIST
						String lTagPaymentInstalmentItemValue='0'
						String lLocatorPaymentInstalmentItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
						WebElement lElementPaymentInstalmentItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
						if(lElementPaymentInstalmentItem){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentItem)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentItem)
							IGNUemaHelper.delayThreadSecond(1)
							lTagPaymentInstalmentItemValue='1'
							lLocatorPaymentInstalmentItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
							lElementPaymentInstalmentItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
							if(lElementPaymentInstalmentItem){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentItem)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentItem)
								IGNUemaHelper.delayThreadSecond(1)
							}
							WebElement lElementFormInstalmentModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormInstalmentModal)
							if(lElementFormInstalmentModal){
								lPaymentCardItemMakePaymentCardOldDetail=lPaymentCardItemMakePaymentCardOldDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementFormInstalmentModal).trim()
								String lTagPaymentInstalmentConfirmNextButton='payable-confirm-btn'
								String lLocatorPaymentInstalmentConfirmNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentConfirmNextButton)
								WebElement lElementPaymentInstalmentConfirmNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentConfirmNextButton)
								if(lElementPaymentInstalmentConfirmNextButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentConfirmNextButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentConfirmNextButton)
									IGNUemaHelper.delayThreadSecond(1)
									String lTagPaymentCardOldItem='existing-card'
									String lLocatorPaymentCardOldItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentCardOldItem)
									WebElement lElementPaymentCardOldItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentCardOldItem)
									if(lElementPaymentCardOldItem){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentCardOldItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentCardOldItem)
										IGNUemaHelper.delayThreadSecond(1)
										String lTagPaymentCardConfirmNextButton='confirm-payment-btn'
										String lLocatorPaymentCardConfirmNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentCardConfirmNextButton)
										WebElement lElementPaymentCardConfirmNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentCardConfirmNextButton)
										if(lElementPaymentCardConfirmNextButton){
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentCardConfirmNextButton)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentCardConfirmNextButton)
											IGNUemaHelper.delayThreadSecond(1)
											String lTagFormPaymentDismiss='info-modal-1'
											String lLocatorFormPaymentDismiss=IGNUemaHelper.getTagDataSeleniumKey(lTagFormPaymentDismiss)
											WebElement lElementFormPaymentDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormPaymentDismiss)
											if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormPaymentDismiss)){
												IGNUemaHelper.delayThreadSecond(1)
												if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormPaymentDismiss)){
													IGNUemaHelper.delayThreadSecond(3)
												}
											}
											Boolean lIsFormPaymentDismissDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormPaymentDismiss,20)
											lElementFormPaymentDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormPaymentDismiss)
											if(!lElementFormPaymentDismiss){
												lIsFormPaymentDismissDisplayed=false
											}
											if(lIsFormPaymentDismissDisplayed){
												String lTagPaymentDismissButton='info-modal-1-submit'
												String lLocatorPaymentDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDismissButton)
												WebElement lElementPaymentDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementFormPaymentDismiss,lTagPaymentDismissButton)
												if(lElementPaymentDismissButton){
													IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDismissButton)
													IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDismissButton)
													IGNUemaHelper.delayThreadSecond(1)
													Boolean lIsDonePayment=this.waitUntilLoaded()
													lPaymentCardItemMakePaymentCardOldResult=IGNUemaHelper.convertBooleanToString(lIsDonePayment)
													if(lIsDonePayment){
														lElementMenuPaymentCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,this.CONST_TAG_MENU_PAYMENT_CARD_LIST,lOpportunityNumber)
														if(lElementMenuPaymentCardItem){
															lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
															if(lElementPaymentDetailButton){
																IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
																IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
																IGNUemaHelper.delayThreadSecond(1)
																lPaymentCardItemMakePaymentCardOldDetail=lPaymentCardItemMakePaymentCardOldDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
																IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			lMenuPaymentMakePaymentCardOld=IGNUemaHelper.convertBooleanToString(lIsMenuPaymentMakePaymentCardOld)
			if(!lIsMenuPaymentMakePaymentCardOld){
				lResult=lMenuPaymentMakePaymentCardOld.length()>0
			}else{
				lResult=lPaymentCardItemMakePaymentCardOldResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuPaymentMakePaymentCardOld',lMenuPaymentMakePaymentCardOld)
				lreturn.put('PaymentCardItemMakePaymentCardOldDetail',lPaymentCardItemMakePaymentCardOldDetail)
				lreturn.put('PaymentCardItemMakePaymentCardOldResult',lPaymentCardItemMakePaymentCardOldResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentMakePaymentCardNew(String strMenuPaymentMakePaymentCardNew){
		Map lreturn=[:]
		String lMenuPaymentMakePaymentCardNew=strMenuPaymentMakePaymentCardNew.trim()
		if(lMenuPaymentMakePaymentCardNew.length()<=0){
			lMenuPaymentMakePaymentCardNew=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_MAKE_PAYMENT_CARD_NEW
		}
		String lPaymentCardItemMakePaymentCardNewDetail=''
		String lPaymentCardItemMakePaymentCardNewResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentMakePaymentCardNew','')
			lreturn.put('PaymentCardItemMakePaymentCardNewDetail','')
			lreturn.put('PaymentCardItemMakePaymentCardNewResult','')
			lreturn.put('Result',lResult)
			Integer lIndexTry=0
			Map lMapMenuPaymentMakePaymentCardNewTry=[:]
			for(lIndexTry=1;lIndexTry<=5;lIndexTry++){
				lMapMenuPaymentMakePaymentCardNewTry=this.inputMenuPaymentMakePaymentCardNewTry(lMenuPaymentMakePaymentCardNew)
				if(!lMapMenuPaymentMakePaymentCardNewTry.Result){
					String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
					String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
					String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
					WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
					if(lElementMenuPolicyButton){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
						this.waitUntilLoaded()
						IGNUemaHelper.delayThreadSecond(lIndexTry*3)
					}
				}else{
					break
				}
			}
			if(!lMapMenuPaymentMakePaymentCardNewTry.Result){
				lMenuPaymentMakePaymentCardNew=''
				lPaymentCardItemMakePaymentCardNewDetail=''
				lPaymentCardItemMakePaymentCardNewResult=''
			}else{
				lMenuPaymentMakePaymentCardNew=lMapMenuPaymentMakePaymentCardNewTry.MenuPaymentMakePaymentCardNew
				lPaymentCardItemMakePaymentCardNewDetail=lMapMenuPaymentMakePaymentCardNewTry.PaymentCardItemMakePaymentCardNewDetail
				lPaymentCardItemMakePaymentCardNewResult=lMapMenuPaymentMakePaymentCardNewTry.PaymentCardItemMakePaymentCardNewResult
			}
			lResult=lMapMenuPaymentMakePaymentCardNewTry.Result
			if(lResult){
				lreturn.put('MenuPaymentMakePaymentCardNew',lMenuPaymentMakePaymentCardNew)
				lreturn.put('PaymentCardItemMakePaymentCardNewDetail',lPaymentCardItemMakePaymentCardNewDetail)
				lreturn.put('PaymentCardItemMakePaymentCardNewResult',lPaymentCardItemMakePaymentCardNewResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPaymentMakePaymentCardNewTry(String strMenuPaymentMakePaymentCardNew){
		Map lreturn=[:]
		String lMenuPaymentMakePaymentCardNew=strMenuPaymentMakePaymentCardNew.trim()
		if(lMenuPaymentMakePaymentCardNew.length()<=0){
			lMenuPaymentMakePaymentCardNew=THAMyAccountNewbizMainType.DEFAULT_MENU_PAYMENT_MAKE_PAYMENT_CARD_NEW
		}
		String lPaymentCardItemMakePaymentCardNewDetail=''
		String lPaymentCardItemMakePaymentCardNewResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPaymentMakePaymentCardNew','')
			lreturn.put('PaymentCardItemMakePaymentCardNewDetail','')
			lreturn.put('PaymentCardItemMakePaymentCardNewResult','')
			lreturn.put('Result',lResult)
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(lElementMenuPolicyButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
				this.waitUntilLoaded()
			}
			String lTagMenuPaymentButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPaymentButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_PAYMENT
			String lLocatorMenuPaymentButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
			WebElement lElementMenuPaymentButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPaymentButtonKey,lTagMenuPaymentButtonValue)
			if(lElementMenuPaymentButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentButton)
				this.waitUntilLoaded()
			}
			Boolean lIsMenuPaymentMakePaymentCardNew=IGNUemaHelper.convertStringToBoolean(lMenuPaymentMakePaymentCardNew)
			lMenuPaymentMakePaymentCardNew=''
			WebElement lElementMenuPaymentCardItem=null
			String lTagMenuPaymentCardPayNowButtonOpen=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAY_NOW
			String lLocatorMenuPaymentCardPayNowButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardPayNowButtonOpen)
			WebElement lElementMenuPaymentCardPayNowButtonOpen=null
			if(lIsMenuPaymentMakePaymentCardNew){
				String lTagMenuPaymentCardList=this.CONST_TAG_MENU_PAYMENT_CARD_LIST
				String lLocatorMenuPaymentCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPaymentCardList)
				List<WebElement> lElementMenuPaymentCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagMenuPaymentCardList)
				if(lElementMenuPaymentCardList){
					for(WebElement lElementMenuPaymentCardItemFind in lElementMenuPaymentCardList){
						lElementMenuPaymentCardPayNowButtonOpen=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementMenuPaymentCardItemFind,lLocatorMenuPaymentCardPayNowButtonOpen,false)
						if(lElementMenuPaymentCardPayNowButtonOpen){
							lElementMenuPaymentCardItem=lElementMenuPaymentCardItemFind
							break
						}
					}
				}
			}
			if(!lElementMenuPaymentCardItem){
				lPaymentCardItemMakePaymentCardNewDetail='No Option'
				lIsMenuPaymentMakePaymentCardNew=false
			}
			if(lIsMenuPaymentMakePaymentCardNew){
				String lOpportunityNumber=''
				String lTagPaymentDetailButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL
				String lLocatorPaymentDetailButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDetailButton)
				WebElement lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
				if(!lElementPaymentDetailButton){
					lPaymentCardItemMakePaymentCardNewDetail='No Option'
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.delayThreadSecond(1)
					lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMenuPaymentCardItem)
					lPaymentCardItemMakePaymentCardNewDetail=lOpportunityNumber+'\n'
					lPaymentCardItemMakePaymentCardNewDetail=lPaymentCardItemMakePaymentCardNewDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPaymentCardPayNowButtonOpen)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPaymentCardPayNowButtonOpen)
					IGNUemaHelper.delayThreadSecond(1)
					this.waitUntilLoaded()
					String lLocatorFormInstalmentModal='#paymentDropdown'
					if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormInstalmentModal)){
						IGNUemaHelper.delayThreadSecond(1)
						if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormInstalmentModal)){
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
					Boolean lIsFormInstalmentModalDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormInstalmentModal,10)
					if(lIsFormInstalmentModalDisplayed){
						String lTagPaymentInstalmentItemKey=this.CONST_TAG_MENU_PAYMENT_INSTALMENT_LIST
						String lTagPaymentInstalmentItemValue='0'
						String lLocatorPaymentInstalmentItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
						WebElement lElementPaymentInstalmentItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
						if(lElementPaymentInstalmentItem){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentItem)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentItem)
							IGNUemaHelper.delayThreadSecond(1)
							lTagPaymentInstalmentItemValue='1'
							lLocatorPaymentInstalmentItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
							lElementPaymentInstalmentItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagPaymentInstalmentItemKey,lTagPaymentInstalmentItemValue)
							if(lElementPaymentInstalmentItem){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentItem)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentItem)
								IGNUemaHelper.delayThreadSecond(1)
							}
							WebElement lElementFormInstalmentModal=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFormInstalmentModal)
							if(lElementFormInstalmentModal){
								lPaymentCardItemMakePaymentCardNewDetail=lPaymentCardItemMakePaymentCardNewDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementFormInstalmentModal).trim()
								String lTagPaymentInstalmentConfirmNextButton='payable-confirm-btn'
								String lLocatorPaymentInstalmentConfirmNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentInstalmentConfirmNextButton)
								WebElement lElementPaymentInstalmentConfirmNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentInstalmentConfirmNextButton)
								if(lElementPaymentInstalmentConfirmNextButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentInstalmentConfirmNextButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentInstalmentConfirmNextButton)
									IGNUemaHelper.delayThreadSecond(1)
									String lTagPaymentCardNewItem='other-card'
									String lLocatorPaymentCardNewItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentCardNewItem)
									WebElement lElementPaymentCardNewItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentCardNewItem)
									if(lElementPaymentCardNewItem){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentCardNewItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentCardNewItem)
										IGNUemaHelper.delayThreadSecond(1)
										String lTagCreditCardNumberInput='other-card-number'
										String lLocatorCreditCardNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCreditCardNumberInput)
										WebElement lElementCreditCardNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCreditCardNumberInput)
										if(lElementCreditCardNumberInput){
											String lCreditCardNumberText='4111111111111111'
											lCreditCardNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardNumberInput,lCreditCardNumberText)
										}
										String lTagCardHolderNameInput='other-card-name'
										String lLocatorCardHolderNameInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCardHolderNameInput)
										WebElement lElementCardHolderNameInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardHolderNameInput)
										if(lElementCardHolderNameInput){
											String lCardHolderNameText='MyAccount NewCard'
											lCardHolderNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardHolderNameInput,lCardHolderNameText)
										}
										String lTagSelectCcExpiryMonth='other-card-month'
										String lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
										WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
										if(lElementSelectCcExpiryMonth){
											String lCcExpiryMonthText='12'
											Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
											lSelectCcExpiryMonth.selectByVisibleText(lCcExpiryMonthText)
											WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
											lCcExpiryMonthText=lElementSelectCcExpiryMonthSelected.getText()
										}
										String lTagSelectCcExpiryYear='other-card-year'
										String lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
										WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
										if(lElementSelectCcExpiryYear){
											String lCcExpiryYearText='2027'
											Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
											lSelectCcExpiryYear.selectByVisibleText(lCcExpiryYearText)
											WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
											lCcExpiryYearText=lElementSelectCcExpiryYearSelected.getText()
										}
										String lTagCreditCardCvvNumberInput='other-card-cvv'
										String lLocatorCreditCardCvvNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCreditCardCvvNumberInput)
										WebElement lElementCreditCardCvvNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCreditCardCvvNumberInput)
										if(lElementCreditCardCvvNumberInput){
											String lCreditCardCvvNumberText='789'
											lCreditCardCvvNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardCvvNumberInput,lCreditCardCvvNumberText)
										}
										String lTagCardBankNameInput='other-card-bank'
										String lLocatorCardBankNameInput=IGNUemaHelper.getTagDataSeleniumKey(lTagCardBankNameInput)
										WebElement lElementCardBankNameInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCardBankNameInput)
										if(lElementCardBankNameInput){
											String lCardBankNameText='MyAccount NewBank'
											lCardBankNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardBankNameInput,lCardBankNameText)
										}
										String lTagPaymentCardConfirmNextButton='confirm-payment-btn'
										String lLocatorPaymentCardConfirmNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentCardConfirmNextButton)
										WebElement lElementPaymentCardConfirmNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPaymentCardConfirmNextButton)
										if(lElementPaymentCardConfirmNextButton){
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentCardConfirmNextButton)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentCardConfirmNextButton)
											IGNUemaHelper.delayThreadSecond(1)
											String lTagFormPaymentDismiss='info-modal-1'
											String lLocatorFormPaymentDismiss=IGNUemaHelper.getTagDataSeleniumKey(lTagFormPaymentDismiss)
											WebElement lElementFormPaymentDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormPaymentDismiss)
											if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormPaymentDismiss)){
												IGNUemaHelper.delayThreadSecond(1)
												if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormPaymentDismiss)){
													IGNUemaHelper.delayThreadSecond(3)
												}
											}
											Boolean lIsFormPaymentDismissDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormPaymentDismiss,20)
											lElementFormPaymentDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormPaymentDismiss)
											if(!lElementFormPaymentDismiss){
												lIsFormPaymentDismissDisplayed=false
											}
											if(lIsFormPaymentDismissDisplayed){
												String lTagPaymentDismissButton='info-modal-1-submit'
												String lLocatorPaymentDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDismissButton)
												WebElement lElementPaymentDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementFormPaymentDismiss,lTagPaymentDismissButton)
												if(lElementPaymentDismissButton){
													IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDismissButton)
													IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDismissButton)
													IGNUemaHelper.delayThreadSecond(1)
													Boolean lIsDonePayment=this.waitUntilLoaded()
													lPaymentCardItemMakePaymentCardNewResult=IGNUemaHelper.convertBooleanToString(lIsDonePayment)
													if(lIsDonePayment){
														lElementMenuPaymentCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,this.CONST_TAG_MENU_PAYMENT_CARD_LIST,lOpportunityNumber)
														if(lElementMenuPaymentCardItem){
															lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
															if(lElementPaymentDetailButton){
																IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
																IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
																IGNUemaHelper.delayThreadSecond(1)
																lPaymentCardItemMakePaymentCardNewDetail=lPaymentCardItemMakePaymentCardNewDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
																IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			lMenuPaymentMakePaymentCardNew=IGNUemaHelper.convertBooleanToString(lIsMenuPaymentMakePaymentCardNew)
			if(!lIsMenuPaymentMakePaymentCardNew){
				lResult=lMenuPaymentMakePaymentCardNew.length()>0
			}else{
				lResult=lPaymentCardItemMakePaymentCardNewResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuPaymentMakePaymentCardNew',lMenuPaymentMakePaymentCardNew)
				lreturn.put('PaymentCardItemMakePaymentCardNewDetail',lPaymentCardItemMakePaymentCardNewDetail)
				lreturn.put('PaymentCardItemMakePaymentCardNewResult',lPaymentCardItemMakePaymentCardNewResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuProfileToDo(String strMenuProfileToDo,String strMenuProfilePositiveCase,String strProfileMaritalStatus,String strProfilePreferredLanguage,String strProfileOccupation,String strProfileAddressHouseBuildingNumber,String strProfileAddressVillage,String strProfileAddressSoiRoad,String strProfileAddressPostcode,String strProfileAddressProvince,String strProfileAddressDistrict,String strProfileAddressSubdistrict,String strProfileTelephoneNumber,String strProfileEmail){
		Map lreturn=[:]
		String lMenuProfileToDo=strMenuProfileToDo.trim()
		if(lMenuProfileToDo.length()<=0){
			lMenuProfileToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_PROFILE_TO_DO
		}
		String lMenuProfilePositiveCase=strMenuProfilePositiveCase.trim()
		if(lMenuProfilePositiveCase.length()<=0){
			lMenuProfilePositiveCase=THAMyAccountNewbizMainType.DEFAULT_MENU_PROFILE_POSITIVE_CASE
		}
		String lProfileMaritalStatus=strProfileMaritalStatus.trim()
		if(lProfileMaritalStatus.length()<=0){
			lProfileMaritalStatus=THAMyAccountNewbizMainType.DEFAULT_PROFILE_MARITAL_STATUS
		}
		Map lProfileMaritalStatusList=['1':'Single','2':'Married']
		String lProfilePreferredLanguage=strProfilePreferredLanguage.toUpperCase().trim()
		if(lProfilePreferredLanguage.length()<=0){
			lProfilePreferredLanguage=THAMyAccountNewbizMainType.DEFAULT_PROFILE_PREFERRED_LANGUAGE.toUpperCase()
		}
		Map lProfilePreferredLanguageList=['1':'EN','2':'TH']
		String lProfileOccupation=strProfileOccupation.trim()
		if(lProfileOccupation.length()<=0){
			lProfileOccupation=THAMyAccountNewbizMainType.DEFAULT_PROFILE_OCCUPATION
		}
		String lProfileAddressHouseBuildingNumber=strProfileAddressHouseBuildingNumber.trim()
		if(lProfileAddressHouseBuildingNumber.length()<=0){
			lProfileAddressHouseBuildingNumber=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_HOUSE_BUILDING_NUMBER
		}
		String lProfileAddressVillage=strProfileAddressVillage.trim()
		if(lProfileAddressVillage.length()<=0){
			lProfileAddressVillage=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_VILLAGE
		}
		String lProfileAddressSoiRoad=strProfileAddressSoiRoad.trim()
		if(lProfileAddressSoiRoad.length()<=0){
			lProfileAddressSoiRoad=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_SOI_ROAD
		}
		String lProfileAddressPostcode=strProfileAddressPostcode.trim()
		if(lProfileAddressPostcode.length()<=0){
			lProfileAddressPostcode=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_POSTCODE
		}
		String lProfileAddressProvince=strProfileAddressProvince.trim()
		if(lProfileAddressProvince.length()<=0){
			lProfileAddressProvince=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_PROVINCE
		}
		String lProfileAddressDistrict=strProfileAddressDistrict.trim()
		if(lProfileAddressDistrict.length()<=0){
			lProfileAddressDistrict=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_DISTRICT
		}
		String lProfileAddressSubdistrict=strProfileAddressSubdistrict.trim()
		if(lProfileAddressSubdistrict.length()<=0){
			lProfileAddressSubdistrict=THAMyAccountNewbizMainType.DEFAULT_PROFILE_ADDRESS_SUBDISTRICT
		}
		String lProfileTelephoneNumber=strProfileTelephoneNumber.trim()
		if(lProfileTelephoneNumber.length()<=0){
			lProfileTelephoneNumber=THAMyAccountNewbizMainType.DEFAULT_PROFILE_TELEPHONE_NUMBER
		}
		String lProfileEmail=strProfileEmail.trim()
		if(lProfileEmail.length()<=0){
			lProfileEmail=THAMyAccountNewbizMainType.DEFAULT_PROFILE_EMAIL
		}
		String lProfileEditDetail=''
		String lProfileEditResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuProfileToDo','')
			lreturn.put('MenuProfilePositiveCase','')
			lreturn.put('ProfileMaritalStatus','')
			lreturn.put('ProfilePreferredLanguage','')
			lreturn.put('ProfileOccupation','')
			lreturn.put('ProfileAddressHouseBuildingNumber','')
			lreturn.put('ProfileAddressVillage','')
			lreturn.put('ProfileAddressSoiRoad','')
			lreturn.put('ProfileAddressPostcode','')
			lreturn.put('ProfileAddressProvince','')
			lreturn.put('ProfileAddressDistrict','')
			lreturn.put('ProfileAddressSubdistrict','')
			lreturn.put('ProfileTelephoneNumber','')
			lreturn.put('ProfileEmail','')
			lreturn.put('ProfileEditDetail','')
			lreturn.put('ProfileEditResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuProfileToDo=IGNUemaHelper.convertStringToBoolean(lMenuProfileToDo)
			lMenuProfileToDo=''
			String lLocatorMenuProfileCardItem='#app main .card-profile'
			WebElement lElementMenuProfileCardItem=null
			String lTagMenuProfileCardEditButtonOpen=this.CONST_TAG_MENU_PROFILE_BUTTON_EDIT
			String lLocatorMenuProfileCardEditButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuProfileCardEditButtonOpen)
			WebElement lElementMenuProfileCardEditButtonOpen=null
			if(lIsMenuProfileToDo){
				String lTagMenuPolicyKeyButton=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
				String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyKeyButton,lTagMenuPolicyButtonValue)
				WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyKeyButton,lTagMenuPolicyButtonValue)
				if(lElementMenuPolicyButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
					this.waitUntilLoaded()
				}
				String lTagMenuProfileButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuProfileButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_PROFILE
				String lLocatorMenuProfileButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuProfileButtonKey,lTagMenuProfileButtonValue)
				WebElement lElementMenuProfileButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuProfileButtonKey,lTagMenuProfileButtonValue)
				if(lElementMenuProfileButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuProfileButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuProfileButton)
					this.waitUntilLoaded()
				}
				lElementMenuProfileCardItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuProfileCardItem)
				lElementMenuProfileCardEditButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagMenuProfileCardEditButtonOpen)
			}
			if(!lElementMenuProfileCardItem){
				if(lIsMenuProfileToDo){
					lProfileEditDetail='No Option'
				}
				lIsMenuProfileToDo=false
			}else{
				lProfileEditDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuProfileCardItem).trim()
			}
			if(!lElementMenuProfileCardEditButtonOpen){
				lIsMenuProfileToDo=false
			}
			lMenuProfileToDo=IGNUemaHelper.convertBooleanToString(lIsMenuProfileToDo)
			if(!lIsMenuProfileToDo){
				lMenuProfilePositiveCase=''
				lProfileMaritalStatus=''
				lProfilePreferredLanguage=''
				lProfileOccupation=''
				lProfileAddressHouseBuildingNumber=''
				lProfileAddressVillage=''
				lProfileAddressSoiRoad=''
				lProfileAddressPostcode=''
				lProfileAddressProvince=''
				lProfileAddressDistrict=''
				lProfileAddressSubdistrict=''
				lProfileTelephoneNumber=''
				lProfileEmail=''
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuProfileCardEditButtonOpen)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuProfileCardEditButtonOpen)
				this.waitUntilLoaded()
				Boolean lIsMenuProfilePositiveCase=IGNUemaHelper.convertStringToBoolean(lMenuProfilePositiveCase)
				lMenuProfilePositiveCase=IGNUemaHelper.convertBooleanToString(lIsMenuProfilePositiveCase)
				String lProfileMaritalStatusItem=lProfileMaritalStatusList.get(lProfileMaritalStatus)
				lProfileMaritalStatus=''
				if(!lProfileMaritalStatusItem){
					lProfileMaritalStatusItem=lProfileMaritalStatusList.get(THAMyAccountNewbizMainType.DEFAULT_PROFILE_MARITAL_STATUS.toUpperCase())
				}
				String lProfilePreferredLanguageItem=lProfilePreferredLanguageList.get(lProfilePreferredLanguage)
				lProfilePreferredLanguage=''
				if(!lProfilePreferredLanguageItem){
					lProfilePreferredLanguageItem=lProfilePreferredLanguageList.get(THAMyAccountNewbizMainType.DEFAULT_PROFILE_PREFERRED_LANGUAGE.toUpperCase())
				}
				String lTagProfileMaritalStatusButtonKey='maritalstatus'
				String lTagProfileMaritalStatusButtonValue='No'
				String lLocatorProfileMaritalStatusButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagProfileMaritalStatusButtonKey,lTagProfileMaritalStatusButtonValue)
				WebElement lElementProfileMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagProfileMaritalStatusButtonKey,lTagProfileMaritalStatusButtonValue)
				if(!lElementProfileMaritalStatusButton){
					return lreturn
				}else{
					String lProfileMaritalStatusCurrent=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementProfileMaritalStatusButton,'value').trim()
					if(lProfileMaritalStatusCurrent.length()<=0){
						return lreturn
					}else{
						if(lProfileMaritalStatusCurrent.equalsIgnoreCase(lProfileMaritalStatusItem)){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementProfileMaritalStatusButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementProfileMaritalStatusButton)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
				lTagProfileMaritalStatusButtonValue='Yes'
				lElementProfileMaritalStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagProfileMaritalStatusButtonKey,lTagProfileMaritalStatusButtonValue)
				if(!lElementProfileMaritalStatusButton){
					return lreturn
				}else{
					lProfileMaritalStatus=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementProfileMaritalStatusButton,'value')
				}
				String lTagProfilePreferredLanguageKey='preferredLanguage'
				String lTagProfilePreferredLanguageValue='No'
				String lLocatorProfilePreferredLanguage=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagProfilePreferredLanguageKey,lTagProfilePreferredLanguageValue)
				WebElement lElementProfilePreferredLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagProfilePreferredLanguageKey,lTagProfilePreferredLanguageValue)
				if(!lElementProfilePreferredLanguage){
					return lreturn
				}else{
					String lProfilePreferredLanguageCurrent=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementProfilePreferredLanguage,'value').trim()
					if(lProfilePreferredLanguageCurrent.length()<=0){
						return lreturn
					}else{
						if(lProfilePreferredLanguageCurrent.equalsIgnoreCase(lProfilePreferredLanguageItem)){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementProfilePreferredLanguage)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementProfilePreferredLanguage)
							IGNUemaHelper.delayThreadSecond(1)
						}
					}
				}
				lTagProfilePreferredLanguageValue='Yes'
				lElementProfilePreferredLanguage=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagProfilePreferredLanguageKey,lTagProfilePreferredLanguageValue)
				if(!lElementProfilePreferredLanguage){
					return lreturn
				}else{
					lProfilePreferredLanguage=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementProfilePreferredLanguage,'value')
				}
				String lTagProfileOccupationButton='selected-occupation'
				String lLocatorProfileOccupationButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileOccupationButton)
				String lTagProfileOccupationDropdownList='occupation'
				String lLocatorProfileOccupationDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileOccupationDropdownList)
				Boolean lIsProfileOccupationValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorProfileOccupationButton)
				if(!lIsProfileOccupationValid){
					String lTagProfileOccupationSelect=''
					String lLocatorProfileOccupationSelect='#profile-edit-box .dropdown-occupation'
					WebElement lElementProfileOccupationSelect=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorProfileOccupationSelect)
					if(lElementProfileOccupationSelect){
						lProfileOccupation=IGNUemaHelper.getTextByWebElement(this.driver,lElementProfileOccupationSelect).trim()
					}else{
						lProfileOccupation='No Option'
					}
				}else{
					lProfileOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagProfileOccupationButton,lTagProfileOccupationDropdownList,lProfileOccupation,true)
				}
				String lTagProfileAddressHouseBuildingNumberInput='houseNumber'
				String lLocatorProfileAddressHouseBuildingNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressHouseBuildingNumberInput)
				WebElement lElementProfileAddressHouseBuildingNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileAddressHouseBuildingNumberInput)
				if(lElementProfileAddressHouseBuildingNumberInput){
					lProfileAddressHouseBuildingNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileAddressHouseBuildingNumberInput,lProfileAddressHouseBuildingNumber)
					if(lProfileAddressHouseBuildingNumber.length()<=0){
						String lRandomText=IGNUemaHelper.randomIDThaiOrPassportNumber(true,false)
						Integer lRandomNumber=IGNUemaHelper.convertStringToInteger(lRandomText.substring(8,lRandomText.length()),0)
						lProfileAddressHouseBuildingNumber=lRandomNumber.toString()
						lProfileAddressHouseBuildingNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileAddressHouseBuildingNumberInput,lProfileAddressHouseBuildingNumber)
					}
				}
				String lTagProfileAddressVillageInput='village'
				String lLocatorProfileAddressVillageInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressVillageInput)
				WebElement lElementProfileAddressVillageInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileAddressVillageInput)
				if(lElementProfileAddressVillageInput){
					lProfileAddressVillage=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileAddressVillageInput,lProfileAddressVillage)
				}
				String lTagProfileAddressSoiRoadInput='soi'
				String lLocatorProfileAddressSoiRoadInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressSoiRoadInput)
				WebElement lElementProfileAddressSoiRoadInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileAddressSoiRoadInput)
				if(lElementProfileAddressSoiRoadInput){
					lProfileAddressSoiRoad=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileAddressSoiRoadInput,lProfileAddressSoiRoad)
				}
				String lTagProfileAddressPostcodeInput='postcode'
				String lLocatorProfileAddressPostcodeInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressPostcodeInput)
				WebElement lElementProfileAddressPostcodeInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileAddressPostcodeInput)
				if(lElementProfileAddressPostcodeInput){
					lProfileAddressPostcode=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileAddressPostcodeInput,lProfileAddressPostcode)
					IGNUemaHelper.delayThreadSecond(5)
					this.waitUntilLoaded()
				}
				String lTagProfileAddressProvinceButton='selected-province'
				String lLocatorProfileAddressProvinceButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressProvinceButton)
				String lTagProfileAddressProvinceDropdownList='province'
				String lLocatorProfileAddressProvinceDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressProvinceDropdownList)
				Boolean lIsProfileAddressProvinceValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorProfileAddressProvinceButton)
				if(!lIsProfileAddressProvinceValid){
					lProfileAddressProvince='No Option'
				}else{
					lProfileAddressProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagProfileAddressProvinceButton,lTagProfileAddressProvinceDropdownList,lProfileAddressProvince,true)
					IGNUemaHelper.delayThreadSecond(3)
					this.waitUntilLoaded()
				}
				String lTagProfileAddressDistrictButton='selected-district'
				String lLocatorProfileAddressDistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressDistrictButton)
				String lTagProfileAddressDistrictDropdownList='district'
				String lLocatorProfileAddressDistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressDistrictDropdownList)
				Boolean lIsProfileAddressDistrictValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorProfileAddressDistrictButton)
				if(!lIsProfileAddressDistrictValid){
					lProfileAddressDistrict='No Option'
				}else{
					lProfileAddressDistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagProfileAddressDistrictButton,lTagProfileAddressDistrictDropdownList,lProfileAddressDistrict,true)
					IGNUemaHelper.delayThreadSecond(1)
					this.waitUntilLoaded()
				}
				String lTagProfileAddressSubdistrictButton='selected-subdistrict'
				String lLocatorProfileAddressSubdistrictButton=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressSubdistrictButton)
				String lTagProfileAddressSubdistrictDropdownList='subDistrict'
				String lLocatorProfileAddressSubdistrictDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileAddressSubdistrictDropdownList)
				Boolean lIsProfileAddressSubdistrictValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorProfileAddressSubdistrictButton)
				if(!lIsProfileAddressSubdistrictValid){
					lProfileAddressSubdistrict='No Option'
				}else{
					lProfileAddressSubdistrict=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagProfileAddressSubdistrictButton,lTagProfileAddressSubdistrictDropdownList,lProfileAddressSubdistrict,true)
					IGNUemaHelper.delayThreadSecond(1)
					this.waitUntilLoaded()
				}
				String lTagProfileTelephoneNumberInput='mobilenumber'
				String lLocatorProfileTelephoneNumberInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileTelephoneNumberInput)
				WebElement lElementProfileTelephoneNumberInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileTelephoneNumberInput)
				if(lElementProfileTelephoneNumberInput){
					lProfileTelephoneNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileTelephoneNumberInput,lProfileTelephoneNumber)
				}
				String lTagProfileEmailInput='email'
				String lLocatorProfileEmailInput=IGNUemaHelper.getTagDataSeleniumKey(lTagProfileEmailInput)
				WebElement lElementProfileEmailInput=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagProfileEmailInput)
				if(lElementProfileEmailInput){
					lProfileEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementProfileEmailInput,lProfileEmail)
				}
				Boolean lIsProfileEditResultOK=false
				String lTagMenuProfileEditButtonSubmit='submit-edit'
				String lLocatoMenuProfileEditButtonSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuProfileEditButtonSubmit)
				WebElement lElementMenuProfileEditButtonSubmit=null
				String lTagMenuProfileEditButtonCancel='cancel-edit'
				String lLocatoMenuProfileEditButtonCancel=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuProfileEditButtonCancel)
				WebElement lElementMenuProfileEditButtonCancel=null
				lElementMenuProfileEditButtonSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagMenuProfileEditButtonSubmit)
				Boolean lIsMenuProfileEditButtonSubmitDisabled=false
				if(lElementMenuProfileEditButtonSubmit){
					String lStrAttributeDisabled=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementMenuProfileEditButtonSubmit,'disabled')
					lIsMenuProfileEditButtonSubmitDisabled=lStrAttributeDisabled.length()>0
				}
				if(lIsMenuProfilePositiveCase){
					if(!lIsMenuProfileEditButtonSubmitDisabled){
						lIsProfileEditResultOK=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuProfileEditButtonSubmit)
					}
				}else{
					if(lIsMenuProfileEditButtonSubmitDisabled){
						lElementMenuProfileEditButtonCancel=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagMenuProfileEditButtonCancel)
						if(lElementMenuProfileEditButtonCancel){
							lIsProfileEditResultOK=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuProfileEditButtonCancel)
						}
					}
				}
				this.waitUntilLoaded()
				lElementMenuProfileCardItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuProfileCardItem)
				if(lElementMenuProfileCardItem){
					lProfileEditDetail=lProfileEditDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuProfileCardItem).trim()
				}
				lProfileEditResult=IGNUemaHelper.convertBooleanToString(lIsProfileEditResultOK)
			}
			if(!lIsMenuProfileToDo){
				lResult=lMenuProfileToDo.length()>0
			}else{
				lResult=lProfileEditResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuProfileToDo',lMenuProfileToDo)
				lreturn.put('MenuProfilePositiveCase',lMenuProfilePositiveCase)
				lreturn.put('ProfileMaritalStatus',lProfileMaritalStatus)
				lreturn.put('ProfilePreferredLanguage',lProfilePreferredLanguage)
				lreturn.put('ProfileOccupation',lProfileOccupation)
				lreturn.put('ProfileAddressHouseBuildingNumber',lProfileAddressHouseBuildingNumber)
				lreturn.put('ProfileAddressVillage',lProfileAddressVillage)
				lreturn.put('ProfileAddressSoiRoad',lProfileAddressSoiRoad)
				lreturn.put('ProfileAddressPostcode',lProfileAddressPostcode)
				lreturn.put('ProfileAddressProvince',lProfileAddressProvince)
				lreturn.put('ProfileAddressDistrict',lProfileAddressDistrict)
				lreturn.put('ProfileAddressSubdistrict',lProfileAddressSubdistrict)
				lreturn.put('ProfileTelephoneNumber',lProfileTelephoneNumber)
				lreturn.put('ProfileEmail',lProfileEmail)
				lreturn.put('ProfileEditDetail',lProfileEditDetail)
				lreturn.put('ProfileEditResult',lProfileEditResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPolicyToDo(String strMenuPolicyToDo,String strMenuPolicyCardSelectProductMotor,String strMenuPolicyCardSelectProductHealth,String strMenuPolicyDetailHistoryToDo,String strMenuPolicyDetailDocDownloadToDo,String strMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo,String strMenuPolicyDetailPaymentToDo,String strMenuPolicyDetailPaymentOpenTermAndConditionToDo,String strMenuPolicyDetailTaxDeductionToDo,String strMenuPolicyDetailTaxDeductionAccept,String strMenuPolicyDetailTaxDeductionEditToDo,String strMenuPolicyDetailTaxDeductionEditHolderIsThai,String strMenuPolicyDetailTaxDeductionEditName,String strMenuPolicyDetailTaxDeductionEditSurname,String strMenuPolicyDetailTaxDeductionEditIdentificationNumber,String strMenuPolicyDetailECareCardToDo){
		Map lreturn=[:]
		String lMenuPolicyToDo=strMenuPolicyToDo.trim()
		if(lMenuPolicyToDo.length()<=0){
			lMenuPolicyToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_TO_DO
		}
		String lMenuPolicyCardSelectProductMotor=strMenuPolicyCardSelectProductMotor.trim()
		if(lMenuPolicyCardSelectProductMotor.length()<=0){
			lMenuPolicyCardSelectProductMotor=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_CARD_SELECT_PRODUCT_MOTOR
		}
		String lMenuPolicyCardSelectProductHealth=strMenuPolicyCardSelectProductHealth.trim()
		if(lMenuPolicyCardSelectProductHealth.length()<=0){
			lMenuPolicyCardSelectProductHealth=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_CARD_SELECT_PRODUCT_HEALTH
		}
		String lMenuPolicyDetailHistoryToDo=strMenuPolicyDetailHistoryToDo.trim()
		if(lMenuPolicyDetailHistoryToDo.length()<=0){
			lMenuPolicyDetailHistoryToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_HISTORY_TO_DO
		}
		String lMenuPolicyDetailDocDownloadToDo=strMenuPolicyDetailDocDownloadToDo.trim()
		if(lMenuPolicyDetailDocDownloadToDo.length()<=0){
			lMenuPolicyDetailDocDownloadToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_DOC_DOWNLOAD_TO_DO
		}
		String lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=strMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo.trim()
		if(lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo.length()<=0){
			lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_DOC_DOWNLOAD_OPEN_INSURANCE_HANDBOOK_TO_DO
		}
		String lMenuPolicyDetailPaymentToDo=strMenuPolicyDetailPaymentToDo.trim()
		if(lMenuPolicyDetailPaymentToDo.length()<=0){
			lMenuPolicyDetailPaymentToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_PAYMENT_TO_DO
		}
		String lMenuPolicyDetailPaymentOpenTermAndConditionToDo=strMenuPolicyDetailPaymentOpenTermAndConditionToDo.trim()
		if(lMenuPolicyDetailPaymentOpenTermAndConditionToDo.length()<=0){
			lMenuPolicyDetailPaymentOpenTermAndConditionToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_PAYMENT_OPEN_TERM_AND_CONDITION_TO_DO
		}
		String lMenuPolicyDetailTaxDeductionToDo=strMenuPolicyDetailTaxDeductionToDo.trim()
		if(lMenuPolicyDetailTaxDeductionToDo.length()<=0){
			lMenuPolicyDetailTaxDeductionToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_TO_DO
		}
		String lMenuPolicyDetailTaxDeductionAccept=strMenuPolicyDetailTaxDeductionAccept.toUpperCase().trim()
		if(lMenuPolicyDetailTaxDeductionAccept.length()<=0){
			lMenuPolicyDetailTaxDeductionAccept=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_ACCEPT
		}
		String lMenuPolicyDetailTaxDeductionEditToDo=strMenuPolicyDetailTaxDeductionEditToDo.trim()
		if(lMenuPolicyDetailTaxDeductionEditToDo.length()<=0){
			lMenuPolicyDetailTaxDeductionEditToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_EDIT_TO_DO
		}
		String lMenuPolicyDetailTaxDeductionEditHolderIsThai=strMenuPolicyDetailTaxDeductionEditHolderIsThai.trim()
		if(lMenuPolicyDetailTaxDeductionEditHolderIsThai.length()<=0){
			lMenuPolicyDetailTaxDeductionEditHolderIsThai=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_EDIT_HOLDER_IS_THAI
		}
		String lMenuPolicyDetailTaxDeductionEditName=strMenuPolicyDetailTaxDeductionEditName.trim()
		if(lMenuPolicyDetailTaxDeductionEditName.length()<=0){
			lMenuPolicyDetailTaxDeductionEditName=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_EDIT_NAME
		}
		String lMenuPolicyDetailTaxDeductionEditSurname=strMenuPolicyDetailTaxDeductionEditSurname.trim()
		if(lMenuPolicyDetailTaxDeductionEditSurname.length()<=0){
			lMenuPolicyDetailTaxDeductionEditSurname=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_EDIT_SURNAME
		}
		String lMenuPolicyDetailTaxDeductionEditIdentificationNumber=strMenuPolicyDetailTaxDeductionEditIdentificationNumber.trim()
		if(lMenuPolicyDetailTaxDeductionEditIdentificationNumber.length()<=0){
			lMenuPolicyDetailTaxDeductionEditIdentificationNumber=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_EDIT_IDENTIFICATION_NUMBER
		}
		String lMenuPolicyDetailECareCardToDo=strMenuPolicyDetailECareCardToDo.trim()
		if(lMenuPolicyDetailECareCardToDo.length()<=0){
			lMenuPolicyDetailECareCardToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_E_CARE_CARD_TO_DO
		}
		String lPolicyItem01DetailCardSelectedProductName=''
		String lPolicyItem01DetailCardSelectedId=''
		String lPolicyItem01DetailCardSelectedDetail=''
		String lPolicyItem01DetailAdditionalDetail=''
		String lPolicyItem01DetailHistoryToDo=''
		String lPolicyItem01DetailHistoryDetail=''
		String lPolicyItem01DetailPaymentToDo=''
		String lPolicyItem01DetailPaymentCardId=''
		String lPolicyItem01DetailPaymentDetail=''
		String lPolicyItem01DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem01DetailPaymentTermAndCondition=''
		String lPolicyItem01DetailDocDownloadToDo=''
		String lPolicyItem01DetailDocDownloadDetail=''
		String lPolicyItem01DetailDocDownloadResult=''
		String lPolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem01DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem01DetailTaxDeductionToDo=''
		String lPolicyItem01DetailTaxDeductionDetail=''
		String lPolicyItem01DetailTaxDeductionResult=''
		String lPolicyItem01DetailECareCardToDo=''
		String lPolicyItem01DetailECareCardDetail=''
		String lPolicyItem01DetailECareCardResult=''
		String lPolicyItem02DetailCardSelectedProductName=''
		String lPolicyItem02DetailCardSelectedId=''
		String lPolicyItem02DetailCardSelectedDetail=''
		String lPolicyItem02DetailAdditionalDetail=''
		String lPolicyItem02DetailHistoryToDo=''
		String lPolicyItem02DetailHistoryDetail=''
		String lPolicyItem02DetailPaymentToDo=''
		String lPolicyItem02DetailPaymentCardId=''
		String lPolicyItem02DetailPaymentDetail=''
		String lPolicyItem02DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem02DetailPaymentTermAndCondition=''
		String lPolicyItem02DetailDocDownloadToDo=''
		String lPolicyItem02DetailDocDownloadDetail=''
		String lPolicyItem02DetailDocDownloadResult=''
		String lPolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem02DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem02DetailTaxDeductionToDo=''
		String lPolicyItem02DetailTaxDeductionDetail=''
		String lPolicyItem02DetailTaxDeductionResult=''
		String lPolicyItem02DetailECareCardToDo=''
		String lPolicyItem02DetailECareCardDetail=''
		String lPolicyItem02DetailECareCardResult=''
		String lPolicyItem03DetailCardSelectedProductName=''
		String lPolicyItem03DetailCardSelectedId=''
		String lPolicyItem03DetailCardSelectedDetail=''
		String lPolicyItem03DetailAdditionalDetail=''
		String lPolicyItem03DetailHistoryToDo=''
		String lPolicyItem03DetailHistoryDetail=''
		String lPolicyItem03DetailPaymentToDo=''
		String lPolicyItem03DetailPaymentCardId=''
		String lPolicyItem03DetailPaymentDetail=''
		String lPolicyItem03DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem03DetailPaymentTermAndCondition=''
		String lPolicyItem03DetailDocDownloadToDo=''
		String lPolicyItem03DetailDocDownloadDetail=''
		String lPolicyItem03DetailDocDownloadResult=''
		String lPolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem03DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem03DetailTaxDeductionToDo=''
		String lPolicyItem03DetailTaxDeductionDetail=''
		String lPolicyItem03DetailTaxDeductionResult=''
		String lPolicyItem03DetailECareCardToDo=''
		String lPolicyItem03DetailECareCardDetail=''
		String lPolicyItem03DetailECareCardResult=''
		String lPolicyItem04DetailCardSelectedProductName=''
		String lPolicyItem04DetailCardSelectedId=''
		String lPolicyItem04DetailCardSelectedDetail=''
		String lPolicyItem04DetailAdditionalDetail=''
		String lPolicyItem04DetailHistoryToDo=''
		String lPolicyItem04DetailHistoryDetail=''
		String lPolicyItem04DetailPaymentToDo=''
		String lPolicyItem04DetailPaymentCardId=''
		String lPolicyItem04DetailPaymentDetail=''
		String lPolicyItem04DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem04DetailPaymentTermAndCondition=''
		String lPolicyItem04DetailDocDownloadToDo=''
		String lPolicyItem04DetailDocDownloadDetail=''
		String lPolicyItem04DetailDocDownloadResult=''
		String lPolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem04DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem04DetailTaxDeductionToDo=''
		String lPolicyItem04DetailTaxDeductionDetail=''
		String lPolicyItem04DetailTaxDeductionResult=''
		String lPolicyItem04DetailECareCardToDo=''
		String lPolicyItem04DetailECareCardDetail=''
		String lPolicyItem04DetailECareCardResult=''
		String lPolicyItem05DetailCardSelectedProductName=''
		String lPolicyItem05DetailCardSelectedId=''
		String lPolicyItem05DetailCardSelectedDetail=''
		String lPolicyItem05DetailAdditionalDetail=''
		String lPolicyItem05DetailHistoryToDo=''
		String lPolicyItem05DetailHistoryDetail=''
		String lPolicyItem05DetailPaymentToDo=''
		String lPolicyItem05DetailPaymentCardId=''
		String lPolicyItem05DetailPaymentDetail=''
		String lPolicyItem05DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem05DetailPaymentTermAndCondition=''
		String lPolicyItem05DetailDocDownloadToDo=''
		String lPolicyItem05DetailDocDownloadDetail=''
		String lPolicyItem05DetailDocDownloadResult=''
		String lPolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem05DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem05DetailTaxDeductionToDo=''
		String lPolicyItem05DetailTaxDeductionDetail=''
		String lPolicyItem05DetailTaxDeductionResult=''
		String lPolicyItem05DetailECareCardToDo=''
		String lPolicyItem05DetailECareCardDetail=''
		String lPolicyItem05DetailECareCardResult=''
		String lPolicyItem06DetailCardSelectedProductName=''
		String lPolicyItem06DetailCardSelectedId=''
		String lPolicyItem06DetailCardSelectedDetail=''
		String lPolicyItem06DetailAdditionalDetail=''
		String lPolicyItem06DetailHistoryToDo=''
		String lPolicyItem06DetailHistoryDetail=''
		String lPolicyItem06DetailPaymentToDo=''
		String lPolicyItem06DetailPaymentCardId=''
		String lPolicyItem06DetailPaymentDetail=''
		String lPolicyItem06DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem06DetailPaymentTermAndCondition=''
		String lPolicyItem06DetailDocDownloadToDo=''
		String lPolicyItem06DetailDocDownloadDetail=''
		String lPolicyItem06DetailDocDownloadResult=''
		String lPolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem06DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem06DetailTaxDeductionToDo=''
		String lPolicyItem06DetailTaxDeductionDetail=''
		String lPolicyItem06DetailTaxDeductionResult=''
		String lPolicyItem06DetailECareCardToDo=''
		String lPolicyItem06DetailECareCardDetail=''
		String lPolicyItem06DetailECareCardResult=''
		String lPolicyItem07DetailCardSelectedProductName=''
		String lPolicyItem07DetailCardSelectedId=''
		String lPolicyItem07DetailCardSelectedDetail=''
		String lPolicyItem07DetailAdditionalDetail=''
		String lPolicyItem07DetailHistoryToDo=''
		String lPolicyItem07DetailHistoryDetail=''
		String lPolicyItem07DetailPaymentToDo=''
		String lPolicyItem07DetailPaymentCardId=''
		String lPolicyItem07DetailPaymentDetail=''
		String lPolicyItem07DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem07DetailPaymentTermAndCondition=''
		String lPolicyItem07DetailDocDownloadToDo=''
		String lPolicyItem07DetailDocDownloadDetail=''
		String lPolicyItem07DetailDocDownloadResult=''
		String lPolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem07DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem07DetailTaxDeductionToDo=''
		String lPolicyItem07DetailTaxDeductionDetail=''
		String lPolicyItem07DetailTaxDeductionResult=''
		String lPolicyItem07DetailECareCardToDo=''
		String lPolicyItem07DetailECareCardDetail=''
		String lPolicyItem07DetailECareCardResult=''
		String lPolicyItem08DetailCardSelectedProductName=''
		String lPolicyItem08DetailCardSelectedId=''
		String lPolicyItem08DetailCardSelectedDetail=''
		String lPolicyItem08DetailAdditionalDetail=''
		String lPolicyItem08DetailHistoryToDo=''
		String lPolicyItem08DetailHistoryDetail=''
		String lPolicyItem08DetailPaymentToDo=''
		String lPolicyItem08DetailPaymentCardId=''
		String lPolicyItem08DetailPaymentDetail=''
		String lPolicyItem08DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem08DetailPaymentTermAndCondition=''
		String lPolicyItem08DetailDocDownloadToDo=''
		String lPolicyItem08DetailDocDownloadDetail=''
		String lPolicyItem08DetailDocDownloadResult=''
		String lPolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem08DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem08DetailTaxDeductionToDo=''
		String lPolicyItem08DetailTaxDeductionDetail=''
		String lPolicyItem08DetailTaxDeductionResult=''
		String lPolicyItem08DetailECareCardToDo=''
		String lPolicyItem08DetailECareCardDetail=''
		String lPolicyItem08DetailECareCardResult=''
		String lPolicyItem09DetailCardSelectedProductName=''
		String lPolicyItem09DetailCardSelectedId=''
		String lPolicyItem09DetailCardSelectedDetail=''
		String lPolicyItem09DetailAdditionalDetail=''
		String lPolicyItem09DetailHistoryToDo=''
		String lPolicyItem09DetailHistoryDetail=''
		String lPolicyItem09DetailPaymentToDo=''
		String lPolicyItem09DetailPaymentCardId=''
		String lPolicyItem09DetailPaymentDetail=''
		String lPolicyItem09DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem09DetailPaymentTermAndCondition=''
		String lPolicyItem09DetailDocDownloadToDo=''
		String lPolicyItem09DetailDocDownloadDetail=''
		String lPolicyItem09DetailDocDownloadResult=''
		String lPolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem09DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem09DetailTaxDeductionToDo=''
		String lPolicyItem09DetailTaxDeductionDetail=''
		String lPolicyItem09DetailTaxDeductionResult=''
		String lPolicyItem09DetailECareCardToDo=''
		String lPolicyItem09DetailECareCardDetail=''
		String lPolicyItem09DetailECareCardResult=''
		String lPolicyItem10DetailCardSelectedProductName=''
		String lPolicyItem10DetailCardSelectedId=''
		String lPolicyItem10DetailCardSelectedDetail=''
		String lPolicyItem10DetailAdditionalDetail=''
		String lPolicyItem10DetailHistoryToDo=''
		String lPolicyItem10DetailHistoryDetail=''
		String lPolicyItem10DetailPaymentToDo=''
		String lPolicyItem10DetailPaymentCardId=''
		String lPolicyItem10DetailPaymentDetail=''
		String lPolicyItem10DetailPaymentOpenTermAndConditionToDo=''
		String lPolicyItem10DetailPaymentTermAndCondition=''
		String lPolicyItem10DetailDocDownloadToDo=''
		String lPolicyItem10DetailDocDownloadDetail=''
		String lPolicyItem10DetailDocDownloadResult=''
		String lPolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyItem10DetailDocDownloadInsuranceHandbook=''
		String lPolicyItem10DetailTaxDeductionToDo=''
		String lPolicyItem10DetailTaxDeductionDetail=''
		String lPolicyItem10DetailTaxDeductionResult=''
		String lPolicyItem10DetailECareCardToDo=''
		String lPolicyItem10DetailECareCardDetail=''
		String lPolicyItem10DetailECareCardResult=''
		String lPolicyCardSelectProductLineResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuPolicyToDo','')
			lreturn.put('MenuPolicyCardSelectProductMotor','')
			lreturn.put('MenuPolicyCardSelectProductHealth','')
			lreturn.put('MenuPolicyCardSelectProductMainNonMotor','')
			lreturn.put('MenuPolicyDetailHistoryToDo','')
			lreturn.put('MenuPolicyDetailDocDownloadToDo','')
			lreturn.put('MenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('MenuPolicyDetailPaymentToDo','')
			lreturn.put('MenuPolicyDetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('MenuPolicyDetailTaxDeductionToDo','')
			lreturn.put('MenuPolicyDetailTaxDeductionAccept','')
			lreturn.put('MenuPolicyDetailTaxDeductionEditToDo','')
			lreturn.put('MenuPolicyDetailTaxDeductionEditHolderIsThai','')
			lreturn.put('MenuPolicyDetailTaxDeductionEditName','')
			lreturn.put('MenuPolicyDetailTaxDeductionEditSurname','')
			lreturn.put('MenuPolicyDetailTaxDeductionEditIdentificationNumber','')
			lreturn.put('MenuPolicyDetailECareCardToDo','')
			lreturn.put('PolicyItem01DetailCardSelectedProductName','')
			lreturn.put('PolicyItem01DetailCardSelectedId','')
			lreturn.put('PolicyItem01DetailCardSelectedDetail','')
			lreturn.put('PolicyItem01DetailAdditionalDetail','')
			lreturn.put('PolicyItem01DetailHistoryToDo','')
			lreturn.put('PolicyItem01DetailHistoryDetail','')
			lreturn.put('PolicyItem01DetailPaymentToDo','')
			lreturn.put('PolicyItem01DetailPaymentCardId','')
			lreturn.put('PolicyItem01DetailPaymentDetail','')
			lreturn.put('PolicyItem01DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem01DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem01DetailDocDownloadToDo','')
			lreturn.put('PolicyItem01DetailDocDownloadDetail','')
			lreturn.put('PolicyItem01DetailDocDownloadResult','')
			lreturn.put('PolicyItem01DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem01DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem01DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem01DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem01DetailTaxDeductionResult','')
			lreturn.put('PolicyItem01DetailECareCardToDo','')
			lreturn.put('PolicyItem01DetailECareCardDetail','')
			lreturn.put('PolicyItem01DetailECareCardResult','')
			lreturn.put('PolicyItem02DetailCardSelectedProductName','')
			lreturn.put('PolicyItem02DetailCardSelectedId','')
			lreturn.put('PolicyItem02DetailCardSelectedDetail','')
			lreturn.put('PolicyItem02DetailAdditionalDetail','')
			lreturn.put('PolicyItem02DetailHistoryToDo','')
			lreturn.put('PolicyItem02DetailHistoryDetail','')
			lreturn.put('PolicyItem02DetailPaymentToDo','')
			lreturn.put('PolicyItem02DetailPaymentCardId','')
			lreturn.put('PolicyItem02DetailPaymentDetail','')
			lreturn.put('PolicyItem02DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem02DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem02DetailDocDownloadToDo','')
			lreturn.put('PolicyItem02DetailDocDownloadDetail','')
			lreturn.put('PolicyItem02DetailDocDownloadResult','')
			lreturn.put('PolicyItem02DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem02DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem02DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem02DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem02DetailTaxDeductionResult','')
			lreturn.put('PolicyItem02DetailECareCardToDo','')
			lreturn.put('PolicyItem02DetailECareCardDetail','')
			lreturn.put('PolicyItem02DetailECareCardResult','')
			lreturn.put('PolicyItem03DetailCardSelectedProductName','')
			lreturn.put('PolicyItem03DetailCardSelectedId','')
			lreturn.put('PolicyItem03DetailCardSelectedDetail','')
			lreturn.put('PolicyItem03DetailAdditionalDetail','')
			lreturn.put('PolicyItem03DetailHistoryToDo','')
			lreturn.put('PolicyItem03DetailHistoryDetail','')
			lreturn.put('PolicyItem03DetailPaymentToDo','')
			lreturn.put('PolicyItem03DetailPaymentCardId','')
			lreturn.put('PolicyItem03DetailPaymentDetail','')
			lreturn.put('PolicyItem03DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem03DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem03DetailDocDownloadToDo','')
			lreturn.put('PolicyItem03DetailDocDownloadDetail','')
			lreturn.put('PolicyItem03DetailDocDownloadResult','')
			lreturn.put('PolicyItem03DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem03DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem03DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem03DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem03DetailTaxDeductionResult','')
			lreturn.put('PolicyItem03DetailECareCardToDo','')
			lreturn.put('PolicyItem03DetailECareCardDetail','')
			lreturn.put('PolicyItem03DetailECareCardResult','')
			lreturn.put('PolicyItem04DetailCardSelectedProductName','')
			lreturn.put('PolicyItem04DetailCardSelectedId','')
			lreturn.put('PolicyItem04DetailCardSelectedDetail','')
			lreturn.put('PolicyItem04DetailAdditionalDetail','')
			lreturn.put('PolicyItem04DetailHistoryToDo','')
			lreturn.put('PolicyItem04DetailHistoryDetail','')
			lreturn.put('PolicyItem04DetailPaymentToDo','')
			lreturn.put('PolicyItem04DetailPaymentCardId','')
			lreturn.put('PolicyItem04DetailPaymentDetail','')
			lreturn.put('PolicyItem04DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem04DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem04DetailDocDownloadToDo','')
			lreturn.put('PolicyItem04DetailDocDownloadDetail','')
			lreturn.put('PolicyItem04DetailDocDownloadResult','')
			lreturn.put('PolicyItem04DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem04DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem04DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem04DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem04DetailTaxDeductionResult','')
			lreturn.put('PolicyItem04DetailECareCardToDo','')
			lreturn.put('PolicyItem04DetailECareCardDetail','')
			lreturn.put('PolicyItem04DetailECareCardResult','')
			lreturn.put('PolicyItem05DetailCardSelectedProductName','')
			lreturn.put('PolicyItem05DetailCardSelectedId','')
			lreturn.put('PolicyItem05DetailCardSelectedDetail','')
			lreturn.put('PolicyItem05DetailAdditionalDetail','')
			lreturn.put('PolicyItem05DetailHistoryToDo','')
			lreturn.put('PolicyItem05DetailHistoryDetail','')
			lreturn.put('PolicyItem05DetailPaymentToDo','')
			lreturn.put('PolicyItem05DetailPaymentCardId','')
			lreturn.put('PolicyItem05DetailPaymentDetail','')
			lreturn.put('PolicyItem05DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem05DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem05DetailDocDownloadToDo','')
			lreturn.put('PolicyItem05DetailDocDownloadDetail','')
			lreturn.put('PolicyItem05DetailDocDownloadResult','')
			lreturn.put('PolicyItem05DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem05DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem05DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem05DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem05DetailTaxDeductionResult','')
			lreturn.put('PolicyItem05DetailECareCardToDo','')
			lreturn.put('PolicyItem05DetailECareCardDetail','')
			lreturn.put('PolicyItem05DetailECareCardResult','')
			lreturn.put('PolicyItem06DetailCardSelectedProductName','')
			lreturn.put('PolicyItem06DetailCardSelectedId','')
			lreturn.put('PolicyItem06DetailCardSelectedDetail','')
			lreturn.put('PolicyItem06DetailAdditionalDetail','')
			lreturn.put('PolicyItem06DetailHistoryToDo','')
			lreturn.put('PolicyItem06DetailHistoryDetail','')
			lreturn.put('PolicyItem06DetailPaymentToDo','')
			lreturn.put('PolicyItem06DetailPaymentCardId','')
			lreturn.put('PolicyItem06DetailPaymentDetail','')
			lreturn.put('PolicyItem06DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem06DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem06DetailDocDownloadToDo','')
			lreturn.put('PolicyItem06DetailDocDownloadDetail','')
			lreturn.put('PolicyItem06DetailDocDownloadResult','')
			lreturn.put('PolicyItem06DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem06DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem06DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem06DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem06DetailTaxDeductionResult','')
			lreturn.put('PolicyItem06DetailECareCardToDo','')
			lreturn.put('PolicyItem06DetailECareCardDetail','')
			lreturn.put('PolicyItem06DetailECareCardResult','')
			lreturn.put('PolicyItem07DetailCardSelectedProductName','')
			lreturn.put('PolicyItem07DetailCardSelectedId','')
			lreturn.put('PolicyItem07DetailCardSelectedDetail','')
			lreturn.put('PolicyItem07DetailAdditionalDetail','')
			lreturn.put('PolicyItem07DetailHistoryToDo','')
			lreturn.put('PolicyItem07DetailHistoryDetail','')
			lreturn.put('PolicyItem07DetailPaymentToDo','')
			lreturn.put('PolicyItem07DetailPaymentCardId','')
			lreturn.put('PolicyItem07DetailPaymentDetail','')
			lreturn.put('PolicyItem07DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem07DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem07DetailDocDownloadToDo','')
			lreturn.put('PolicyItem07DetailDocDownloadDetail','')
			lreturn.put('PolicyItem07DetailDocDownloadResult','')
			lreturn.put('PolicyItem07DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem07DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem07DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem07DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem07DetailTaxDeductionResult','')
			lreturn.put('PolicyItem07DetailECareCardToDo','')
			lreturn.put('PolicyItem07DetailECareCardDetail','')
			lreturn.put('PolicyItem07DetailECareCardResult','')
			lreturn.put('PolicyItem08DetailCardSelectedProductName','')
			lreturn.put('PolicyItem08DetailCardSelectedId','')
			lreturn.put('PolicyItem08DetailCardSelectedDetail','')
			lreturn.put('PolicyItem08DetailAdditionalDetail','')
			lreturn.put('PolicyItem08DetailHistoryToDo','')
			lreturn.put('PolicyItem08DetailHistoryDetail','')
			lreturn.put('PolicyItem08DetailPaymentToDo','')
			lreturn.put('PolicyItem08DetailPaymentCardId','')
			lreturn.put('PolicyItem08DetailPaymentDetail','')
			lreturn.put('PolicyItem08DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem08DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem08DetailDocDownloadToDo','')
			lreturn.put('PolicyItem08DetailDocDownloadDetail','')
			lreturn.put('PolicyItem08DetailDocDownloadResult','')
			lreturn.put('PolicyItem08DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem08DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem08DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem08DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem08DetailTaxDeductionResult','')
			lreturn.put('PolicyItem08DetailECareCardToDo','')
			lreturn.put('PolicyItem08DetailECareCardDetail','')
			lreturn.put('PolicyItem08DetailECareCardResult','')
			lreturn.put('PolicyItem09DetailCardSelectedProductName','')
			lreturn.put('PolicyItem09DetailCardSelectedId','')
			lreturn.put('PolicyItem09DetailCardSelectedDetail','')
			lreturn.put('PolicyItem09DetailAdditionalDetail','')
			lreturn.put('PolicyItem09DetailHistoryToDo','')
			lreturn.put('PolicyItem09DetailHistoryDetail','')
			lreturn.put('PolicyItem09DetailPaymentToDo','')
			lreturn.put('PolicyItem09DetailPaymentCardId','')
			lreturn.put('PolicyItem09DetailPaymentDetail','')
			lreturn.put('PolicyItem09DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem09DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem09DetailDocDownloadToDo','')
			lreturn.put('PolicyItem09DetailDocDownloadDetail','')
			lreturn.put('PolicyItem09DetailDocDownloadResult','')
			lreturn.put('PolicyItem09DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem09DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem09DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem09DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem09DetailTaxDeductionResult','')
			lreturn.put('PolicyItem09DetailECareCardToDo','')
			lreturn.put('PolicyItem09DetailECareCardDetail','')
			lreturn.put('PolicyItem09DetailECareCardResult','')
			lreturn.put('PolicyItem10DetailCardSelectedProductName','')
			lreturn.put('PolicyItem10DetailCardSelectedId','')
			lreturn.put('PolicyItem10DetailCardSelectedDetail','')
			lreturn.put('PolicyItem10DetailAdditionalDetail','')
			lreturn.put('PolicyItem10DetailHistoryToDo','')
			lreturn.put('PolicyItem10DetailHistoryDetail','')
			lreturn.put('PolicyItem10DetailPaymentToDo','')
			lreturn.put('PolicyItem10DetailPaymentCardId','')
			lreturn.put('PolicyItem10DetailPaymentDetail','')
			lreturn.put('PolicyItem10DetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyItem10DetailPaymentTermAndCondition','')
			lreturn.put('PolicyItem10DetailDocDownloadToDo','')
			lreturn.put('PolicyItem10DetailDocDownloadDetail','')
			lreturn.put('PolicyItem10DetailDocDownloadResult','')
			lreturn.put('PolicyItem10DetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyItem10DetailDocDownloadInsuranceHandbook','')
			lreturn.put('PolicyItem10DetailTaxDeductionToDo','')
			lreturn.put('PolicyItem10DetailTaxDeductionDetail','')
			lreturn.put('PolicyItem10DetailTaxDeductionResult','')
			lreturn.put('PolicyItem10DetailECareCardToDo','')
			lreturn.put('PolicyItem10DetailECareCardDetail','')
			lreturn.put('PolicyItem10DetailECareCardResult','')
			lreturn.put('PolicyCardSelectProductLineResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuPolicyResult=true
			Boolean lIsMenuPolicyToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyToDo)
			lMenuPolicyToDo=''
			Boolean lIsMenuPolicyCardSelectProductMotor=IGNUemaHelper.convertStringToBoolean(lMenuPolicyCardSelectProductMotor)
			lMenuPolicyCardSelectProductMotor=''
			Boolean lIsMenuPolicyCardSelectProductHealth=IGNUemaHelper.convertStringToBoolean(lMenuPolicyCardSelectProductHealth)
			lMenuPolicyCardSelectProductHealth=''
			Boolean lIsMenuPolicyDetailHistoryToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailHistoryToDo)
			lMenuPolicyDetailHistoryToDo=''
			Boolean lIsMenuPolicyDetailDocDownloadToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailDocDownloadToDo)
			lMenuPolicyDetailDocDownloadToDo=''
			Boolean lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
			lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=''
			Boolean lIsMenuPolicyDetailPaymentToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailPaymentToDo)
			lMenuPolicyDetailPaymentToDo=''
			Boolean lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailPaymentOpenTermAndConditionToDo)
			lMenuPolicyDetailPaymentOpenTermAndConditionToDo=''
			Boolean lIsMenuPolicyDetailTaxDeductionToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailTaxDeductionToDo)
			lMenuPolicyDetailTaxDeductionToDo=''
			Boolean lIsMenuPolicyDetailTaxDeductionAccept=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailTaxDeductionAccept)
			lMenuPolicyDetailTaxDeductionAccept=''
			Boolean lIsMenuPolicyDetailTaxDeductionEditToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailTaxDeductionEditToDo)
			lMenuPolicyDetailTaxDeductionEditToDo=''
			Boolean lIsMenuPolicyECareCardToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyDetailECareCardToDo)
			lMenuPolicyDetailECareCardToDo=''
			if(!lIsMenuPolicyToDo){
				lMenuPolicyToDo=IGNUemaHelper.convertBooleanToString(lIsMenuPolicyToDo)
				lResult=lMenuPolicyToDo.length()>0
				lreturn.put('MenuPolicyToDo',lMenuPolicyToDo)
				lreturn.put('Result',lResult)
				return lreturn
			}
			if(!lIsMenuPolicyDetailTaxDeductionToDo){
				lIsMenuPolicyDetailTaxDeductionAccept=false
				lIsMenuPolicyDetailTaxDeductionEditToDo=false
				lMenuPolicyDetailTaxDeductionEditHolderIsThai=''
				lMenuPolicyDetailTaxDeductionEditName=''
				lMenuPolicyDetailTaxDeductionEditSurname=''
				lMenuPolicyDetailTaxDeductionEditIdentificationNumber=''
			}
			if(!lIsMenuPolicyDetailTaxDeductionAccept){
				lIsMenuPolicyDetailTaxDeductionEditToDo=false
				lMenuPolicyDetailTaxDeductionEditHolderIsThai=''
				lMenuPolicyDetailTaxDeductionEditName=''
				lMenuPolicyDetailTaxDeductionEditSurname=''
				lMenuPolicyDetailTaxDeductionEditIdentificationNumber=''
			}
			if(!lIsMenuPolicyDetailTaxDeductionEditToDo){
				lMenuPolicyDetailTaxDeductionEditHolderIsThai=''
				lMenuPolicyDetailTaxDeductionEditName=''
				lMenuPolicyDetailTaxDeductionEditSurname=''
				lMenuPolicyDetailTaxDeductionEditIdentificationNumber=''
			}
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(!lElementMenuPolicyButton){
				lMenuPolicyToDo=IGNUemaHelper.convertBooleanToString(lIsMenuPolicyToDo)
				lResult=lMenuPolicyToDo.length()>0
				lreturn.put('MenuPolicyToDo',lMenuPolicyToDo)
				lreturn.put('Result',lResult)
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
			this.waitUntilLoaded()
			Integer lPolicyNumberOfCardNum=0
			String lTagPolicyCardList='card-list'
			String lLocatorPolicyCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyCardList)
			List<WebElement> lElementPolicyCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagPolicyCardList)
			if(lElementPolicyCardList){
				lPolicyNumberOfCardNum=lElementPolicyCardList.size()
			}
			if(lPolicyNumberOfCardNum<=0){
				lMenuPolicyToDo=IGNUemaHelper.convertBooleanToString(lIsMenuPolicyToDo)
				lResult=lMenuPolicyToDo.length()>0
				lreturn.put('MenuPolicyToDo',lMenuPolicyToDo)
				lreturn.put('Result',lResult)
				return lreturn
			}
			lMenuPolicyToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyToDo)
			List<String> lPolicyCardProductTypeListAll=[]
			List<Integer> lPolicyCardProductTypeListMotorAll=[]
			List<Integer> lPolicyCardProductTypeListMotorCar=[]
			List<Integer> lPolicyCardProductTypeListMotorBike=[]
			List<Integer> lPolicyCardProductTypeListMotorExtendedWarranty=[]
			List<Integer> lPolicyCardProductTypeListMotorLowMileage=[]
			List<Integer> lPolicyCardProductTypeListHealthAll=[]
			List<Integer> lPolicyCardProductTypeListHealthCancer=[]
			List<Integer> lPolicyCardProductTypeListHealthCriticalIllness=[]
			List<Integer> lPolicyCardProductTypeListHealthPersonalAccident=[]
			List<Integer> lPolicyCardProductTypeListHealthCovid=[]
			Integer lIndexItem=0
			Boolean lIsProductTypeMotorAll=false
			Boolean lIsProductTypeMotorBike=false
			Boolean lIsProductTypeMotorCar=false
			Boolean lIsProductTypeMotorEW=false
			Boolean lIsProductTypeMotorLowMileage=false
			Boolean lIsProductTypeHealthAll=false
			Boolean lIsProductTypeHealthCancer=false
			Boolean lIsProductTypeHealthPA=false
			Boolean lIsProductTypeHealthCriticalIllness=false
			Boolean lIsProductTypeHealthCovid=false
			for(WebElement lElementPolicyCardItem in lElementPolicyCardList){
				String lPolicyCardItemValueText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyCardItem)
				String lPolicyCardItemProductType=lPolicyCardItemValueText.toUpperCase().trim()
				lPolicyCardProductTypeListAll.add(lPolicyCardItemProductType)
				lIsProductTypeMotorBike=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'MOTORBIKE')
				lIsProductTypeMotorCar=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'MOTORCAR')
				lIsProductTypeMotorEW=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'EW')
				lIsProductTypeMotorLowMileage=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'LOWMILEAGE')
				lIsProductTypeMotorAll=lIsProductTypeMotorBike||lIsProductTypeMotorCar||lIsProductTypeMotorEW||lIsProductTypeMotorLowMileage
				lIsProductTypeHealthCancer=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'CANCER')
				lIsProductTypeHealthPA=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'PA')
				lIsProductTypeHealthCriticalIllness=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'CRITICALILLNESS')
				lIsProductTypeHealthCovid=IGNUemaHelper.checkStringContainString(lPolicyCardItemProductType,'COVID')
				lIsProductTypeHealthAll=lIsProductTypeHealthCancer||lIsProductTypeHealthPA||lIsProductTypeHealthCriticalIllness||lIsProductTypeHealthCovid
				if(lIsProductTypeMotorAll){
					lPolicyCardProductTypeListMotorAll.add(lIndexItem)
				}
				if(lIsProductTypeMotorBike){
					lPolicyCardProductTypeListMotorBike.add(lIndexItem)
				}
				if(lIsProductTypeMotorCar){
					lPolicyCardProductTypeListMotorCar.add(lIndexItem)
				}
				if(lIsProductTypeMotorEW){
					lPolicyCardProductTypeListMotorExtendedWarranty.add(lIndexItem)
				}
				if(lIsProductTypeMotorLowMileage){
					lPolicyCardProductTypeListMotorLowMileage.add(lIndexItem)
				}
				if(lIsProductTypeHealthAll){
					lPolicyCardProductTypeListHealthAll.add(lIndexItem)
				}
				if(lIsProductTypeHealthCancer){
					lPolicyCardProductTypeListHealthCancer.add(lIndexItem)
				}
				if(lIsProductTypeHealthCriticalIllness){
					lPolicyCardProductTypeListHealthCriticalIllness.add(lIndexItem)
				}
				if(lIsProductTypeHealthPA){
					lPolicyCardProductTypeListHealthPersonalAccident.add(lIndexItem)
				}
				if(lIsProductTypeHealthCovid){
					lPolicyCardProductTypeListHealthCovid.add(lIndexItem)
				}
				lIndexItem=lIndexItem+1
			}
			if(lPolicyCardProductTypeListMotorAll.size()<=0){
				lIsMenuPolicyCardSelectProductMotor=false
			}
			if(lPolicyCardProductTypeListHealthAll.size()<=0){
				lIsMenuPolicyCardSelectProductHealth=false
			}
			lMenuPolicyCardSelectProductMotor=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyCardSelectProductMotor)
			lMenuPolicyCardSelectProductHealth=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyCardSelectProductHealth)
			lMenuPolicyDetailHistoryToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailHistoryToDo)
			lMenuPolicyDetailDocDownloadToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailDocDownloadToDo)
			lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
			lMenuPolicyDetailPaymentToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailPaymentToDo)
			lMenuPolicyDetailPaymentOpenTermAndConditionToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
			lMenuPolicyDetailTaxDeductionToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailTaxDeductionToDo)
			lMenuPolicyDetailTaxDeductionAccept=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailTaxDeductionAccept)
			lMenuPolicyDetailTaxDeductionEditToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailTaxDeductionEditToDo)
			lMenuPolicyDetailECareCardToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyECareCardToDo)
			Integer lOutputItemIndex=1
			String lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
			Boolean lIsPolicyCardStepAll=false
			Boolean lIsPolicyCardStepProductType=false
			Boolean lIsPolicyCardStepHistoryToDo=false
			Boolean lIsPolicyCardStepDocDownloadToDo=false
			Boolean lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=false
			Boolean lIsPolicyCardStepPaymentToDo=false
			Boolean lIsPolicyCardStepPaymentOpenTermAndCondition=false
			Boolean lIsPolicyCardStepTaxDeductionToDo=false
			Boolean lIsPolicyCardStepDetailECareCard=false
			if(lIsMenuPolicyCardSelectProductMotor){
				if(lPolicyCardProductTypeListMotorBike.size()>0){
					Integer lPolicyCardProductTypeItemMotorBikeIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListMotorBike)
					Map lMapProcessPolicyCardProductTypeMotorBike=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemMotorBikeIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailHistoryProductTypeMotorBike=inputProcessPolicyDetailHistoryToDo('ProductMotor',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeMotorBike=inputProcessPolicyDetailDocDownloadToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorBike=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailPaymentProductTypeMotorBike=inputProcessPolicyDetailPaymentToDo('ProductMotor',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorBike=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('ProductMotor',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeMotorBike=inputProcessPolicyDetailTaxDeductionToDo('ProductMotor',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeMotorBike.Result
					Map lMapProcessPolicyDetailECareCardProductTypeMotorBike=inputProcessPolicyDetailECareCardToDo('ProductMotor',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeMotorBike.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeMotorBike,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeMotorBike,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Motor Bike||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListMotorCar.size()>0){
					Integer lPolicyCardProductTypeItemMotorCarIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListMotorCar)
					Map lMapProcessPolicyCardProductTypeMotorCar=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemMotorCarIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailHistoryProductTypeMotorCar=inputProcessPolicyDetailHistoryToDo('ProductMotor',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeMotorCar=inputProcessPolicyDetailDocDownloadToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorCar=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailPaymentProductTypeMotorCar=inputProcessPolicyDetailPaymentToDo('ProductMotor',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorCar=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('ProductMotor',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeMotorCar=inputProcessPolicyDetailTaxDeductionToDo('ProductMotor',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeMotorCar.Result
					Map lMapProcessPolicyDetailECareCardProductTypeMotorCar=inputProcessPolicyDetailECareCardToDo('ProductMotor',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeMotorCar.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeMotorCar,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeMotorCar,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Motor Car||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListMotorExtendedWarranty.size()>0){
					Integer lPolicyCardProductTypeItemMotorExtendedWarrantyIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListMotorExtendedWarranty)
					Map lMapProcessPolicyCardProductTypeMotorExtendedWarranty=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemMotorExtendedWarrantyIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailHistoryProductTypeMotorExtendedWarranty=inputProcessPolicyDetailHistoryToDo('ProductMotor',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeMotorExtendedWarranty=inputProcessPolicyDetailDocDownloadToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorExtendedWarranty=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailPaymentProductTypeMotorExtendedWarranty=inputProcessPolicyDetailPaymentToDo('ProductMotor',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorExtendedWarranty=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('ProductMotor',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeMotorExtendedWarranty=inputProcessPolicyDetailTaxDeductionToDo('ProductMotor',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeMotorExtendedWarranty.Result
					Map lMapProcessPolicyDetailECareCardProductTypeMotorExtendedWarranty=inputProcessPolicyDetailECareCardToDo('ProductMotor',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeMotorExtendedWarranty.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeMotorExtendedWarranty,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeMotorExtendedWarranty,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Motor ExtendedWarranty||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListMotorLowMileage.size()>0){
					Integer lPolicyCardProductTypeItemMotorLowMileageIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListMotorLowMileage)
					Map lMapProcessPolicyCardProductTypeMotorLowMileage=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemMotorLowMileageIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailHistoryProductTypeMotorLowMileage=inputProcessPolicyDetailHistoryToDo('ProductMotor',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeMotorLowMileage=inputProcessPolicyDetailDocDownloadToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorLowMileage=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('ProductMotor',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailPaymentProductTypeMotorLowMileage=inputProcessPolicyDetailPaymentToDo('ProductMotor',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorLowMileage=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('ProductMotor',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeMotorLowMileage=inputProcessPolicyDetailTaxDeductionToDo('ProductMotor',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeMotorLowMileage.Result
					Map lMapProcessPolicyDetailECareCardProductTypeMotorLowMileage=inputProcessPolicyDetailECareCardToDo('ProductMotor',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeMotorLowMileage.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeMotorLowMileage,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeMotorLowMileage,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Motor LowMileage||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
			}
			if(lIsMenuPolicyCardSelectProductHealth){
				if(lPolicyCardProductTypeListHealthCancer.size()>0){
					Integer lPolicyCardProductTypeItemHealthCancerIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListHealthCancer)
					Map lMapProcessPolicyCardProductTypeHealthCancer=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemHealthCancerIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailHistoryProductTypeHealthCancer=inputProcessPolicyDetailHistoryToDo('Cancer',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeHealthCancer=inputProcessPolicyDetailDocDownloadToDo('Cancer',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCancer=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('Cancer',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailPaymentProductTypeHealthCancer=inputProcessPolicyDetailPaymentToDo('Cancer',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCancer=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('Cancer',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeHealthCancer=inputProcessPolicyDetailTaxDeductionToDo('Cancer',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeHealthCancer.Result
					Map lMapProcessPolicyDetailECareCardProductTypeHealthCancer=inputProcessPolicyDetailECareCardToDo('Cancer',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeHealthCancer.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeHealthCancer,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeHealthCancer,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Health Cancer||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListHealthCriticalIllness.size()>0){
					Integer lPolicyCardProductTypeItemHealthCriticalIllnessIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListHealthCriticalIllness)
					Map lMapProcessPolicyCardProductTypeHealthCriticalIllness=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemHealthCriticalIllnessIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailHistoryProductTypeHealthCriticalIllness=inputProcessPolicyDetailHistoryToDo('CriticalIllness',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeHealthCriticalIllness=inputProcessPolicyDetailDocDownloadToDo('CriticalIllness',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCriticalIllness=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('CriticalIllness',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailPaymentProductTypeHealthCriticalIllness=inputProcessPolicyDetailPaymentToDo('CriticalIllness',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCriticalIllness=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('CriticalIllness',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeHealthCriticalIllness=inputProcessPolicyDetailTaxDeductionToDo('CriticalIllness',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeHealthCriticalIllness.Result
					Map lMapProcessPolicyDetailECareCardProductTypeHealthCriticalIllness=inputProcessPolicyDetailECareCardToDo('CriticalIllness',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeHealthCriticalIllness.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeHealthCriticalIllness,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeHealthCriticalIllness,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Health CriticalIllness||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListHealthPersonalAccident.size()>0){
					Integer lPolicyCardProductTypeItemHealthPersonalAccidentIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListHealthPersonalAccident)
					Map lMapProcessPolicyCardProductTypeHealthPersonalAccident=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemHealthPersonalAccidentIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailHistoryProductTypeHealthPersonalAccident=inputProcessPolicyDetailHistoryToDo('PersonalAccident',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeHealthPersonalAccident=inputProcessPolicyDetailDocDownloadToDo('PersonalAccident',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthPersonalAccident=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('PersonalAccident',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailPaymentProductTypeHealthPersonalAccident=inputProcessPolicyDetailPaymentToDo('PersonalAccident',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthPersonalAccident=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('PersonalAccident',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeHealthPersonalAccident=inputProcessPolicyDetailTaxDeductionToDo('PersonalAccident',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeHealthPersonalAccident.Result
					Map lMapProcessPolicyDetailECareCardProductTypeHealthPersonalAccident=inputProcessPolicyDetailECareCardToDo('PersonalAccident',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeHealthPersonalAccident.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeHealthPersonalAccident,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeHealthPersonalAccident,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Health PersonalAccident||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lPolicyCardProductTypeListHealthCovid.size()>0){
					Integer lPolicyCardProductTypeItemHealthCovidIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyCardProductTypeListHealthCovid)
					Map lMapProcessPolicyCardProductTypeHealthCovid=inputProcessPolicyCardProductType(lPolicyCardProductTypeItemHealthCovidIndex)
					lIsPolicyCardStepProductType=lMapProcessPolicyCardProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailHistoryProductTypeHealthCovid=inputProcessPolicyDetailHistoryToDo('Covid',lIsMenuPolicyDetailHistoryToDo)
					lIsPolicyCardStepHistoryToDo=lMapProcessPolicyDetailHistoryProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailDocDownloadProductTypeHealthCovid=inputProcessPolicyDetailDocDownloadToDo('Covid',lIsMenuPolicyDetailDocDownloadToDo)
					lIsPolicyCardStepDocDownloadToDo=lMapProcessPolicyDetailDocDownloadProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCovid=inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo('Covid',lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
					lIsPolicyCardStepDocDownloadOpenInsuranceHandbook=lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailPaymentProductTypeHealthCovid=inputProcessPolicyDetailPaymentToDo('Covid',lIsMenuPolicyDetailPaymentToDo)
					lIsPolicyCardStepPaymentToDo=lMapProcessPolicyDetailPaymentProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCovid=inputProcessPolicyDetailPaymentOpenTermAndConditionToDo('Covid',lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
					lIsPolicyCardStepPaymentOpenTermAndCondition=lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailTaxDeductionProductTypeHealthCovid=inputProcessPolicyDetailTaxDeductionToDo('Covid',lMenuPolicyDetailTaxDeductionEditHolderIsThai,lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditIdentificationNumber,lIsMenuPolicyDetailTaxDeductionToDo,lIsMenuPolicyDetailTaxDeductionAccept,lIsMenuPolicyDetailTaxDeductionEditToDo)
					lIsPolicyCardStepTaxDeductionToDo=lMapProcessPolicyDetailTaxDeductionProductTypeHealthCovid.Result
					Map lMapProcessPolicyDetailECareCardProductTypeHealthCovid=inputProcessPolicyDetailECareCardToDo('Covid',lIsMenuPolicyECareCardToDo)
					lIsPolicyCardStepDetailECareCard=lMapProcessPolicyDetailECareCardProductTypeHealthCovid.Result
					lIsPolicyCardStepAll=lIsPolicyCardStepProductType&&lIsPolicyCardStepHistoryToDo&&lIsPolicyCardStepDocDownloadToDo&&lIsPolicyCardStepDocDownloadOpenInsuranceHandbook&&lIsPolicyCardStepPaymentToDo&&lIsPolicyCardStepPaymentOpenTermAndCondition&&lIsPolicyCardStepTaxDeductionToDo&&lIsPolicyCardStepDetailECareCard
					this.outputWriteOutputFromMapProductType(lOutputItemIndex,lMapProcessPolicyCardProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapHistory(lOutputItemIndex,lMapProcessPolicyDetailHistoryProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapDocDownloadToDo(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(lOutputItemIndex,lMapProcessPolicyDetailDocDownloadOpenInsuranceHandbookProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapPaymentToDo(lOutputItemIndex,lMapProcessPolicyDetailPaymentProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapPaymentOpenTermAndCondition(lOutputItemIndex,lMapProcessPolicyDetailPaymentOpenTermAndConditionProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapTaxDeduction(lOutputItemIndex,lMapProcessPolicyDetailTaxDeductionProductTypeHealthCovid,lreturn)
					this.outputWriteOutputFromMapECareCard(lOutputItemIndex,lMapProcessPolicyDetailECareCardProductTypeHealthCovid,lreturn)
					if(!lIsPolicyCardStepAll){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName','Health Covid||Falied')
						lIsMenuPolicyResult=lIsPolicyCardStepAll
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
			}
			lPolicyCardSelectProductLineResult=IGNUemaHelper.convertBooleanToString(lIsMenuPolicyResult)
			lResult=lPolicyCardSelectProductLineResult.length()>0
			if(lResult){
				lreturn.put('MenuPolicyToDo',lMenuPolicyToDo)
				lreturn.put('MenuPolicyCardSelectProductMotor',lMenuPolicyCardSelectProductMotor)
				lreturn.put('MenuPolicyCardSelectProductHealth',lMenuPolicyCardSelectProductHealth)
				lreturn.put('MenuPolicyDetailHistoryToDo',lMenuPolicyDetailHistoryToDo)
				lreturn.put('MenuPolicyDetailDocDownloadToDo',lMenuPolicyDetailDocDownloadToDo)
				lreturn.put('MenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo',lMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
				lreturn.put('MenuPolicyDetailPaymentToDo',lMenuPolicyDetailPaymentToDo)
				lreturn.put('MenuPolicyDetailPaymentOpenTermAndConditionToDo',lMenuPolicyDetailPaymentOpenTermAndConditionToDo)
				lreturn.put('MenuPolicyDetailTaxDeductionToDo',lMenuPolicyDetailTaxDeductionToDo)
				lreturn.put('MenuPolicyDetailTaxDeductionAccept',lMenuPolicyDetailTaxDeductionAccept)
				lreturn.put('MenuPolicyDetailTaxDeductionEditToDo',lMenuPolicyDetailTaxDeductionEditToDo)
				lreturn.put('MenuPolicyDetailTaxDeductionEditHolderIsThai',lMenuPolicyDetailTaxDeductionEditHolderIsThai)
				lreturn.put('MenuPolicyDetailTaxDeductionEditName',lMenuPolicyDetailTaxDeductionEditName)
				lreturn.put('MenuPolicyDetailTaxDeductionEditSurname',lMenuPolicyDetailTaxDeductionEditSurname)
				lreturn.put('MenuPolicyDetailTaxDeductionEditIdentificationNumber',lMenuPolicyDetailTaxDeductionEditIdentificationNumber)
				lreturn.put('MenuPolicyDetailECareCardToDo',lMenuPolicyDetailECareCardToDo)
				lreturn.put('PolicyCardSelectProductLineResult',lPolicyCardSelectProductLineResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyCardProductType(Integer intPolicyCardProductTypeItem){
		Map lreturn=[:]
		Integer lPolicyCardProductTypeItem=intPolicyCardProductTypeItem
		String lPolicyDetailCardSelectedProductName=''
		String lPolicyDetailCardSelectedId=''
		String lPolicyDetailCardSelectedDetail=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailCardSelectedProductName','')
			lreturn.put('PolicyDetailCardSelectedId','')
			lreturn.put('PolicyDetailCardSelectedDetail','')
			lreturn.put('Result',lResult)
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(!lElementMenuPolicyButton){
				return lreturn
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
				this.waitUntilLoaded()
				Integer lPolicyNumberOfCardNum=0
				String lTagPolicyCardList='card-list'
				String lLocatorPolicyCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyCardList)
				List<WebElement> lElementPolicyCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagPolicyCardList)
				if(lElementPolicyCardList){
					lPolicyNumberOfCardNum=lElementPolicyCardList.size()
				}
				if(lPolicyNumberOfCardNum<=0){
					return lreturn
				}
				lPolicyDetailCardSelectedProductName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyCardList[lPolicyCardProductTypeItem])
				lPolicyDetailCardSelectedId=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyCardList[lPolicyCardProductTypeItem])
				lPolicyDetailCardSelectedDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCardList[lPolicyCardProductTypeItem]).trim()
				WebElement lElementPolicyCardItemOpenButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPolicyCardList[lPolicyCardProductTypeItem],'a',true)
				if(lElementPolicyCardItemOpenButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyCardItemOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyCardItemOpenButton)
					this.waitUntilLoaded()
				}
				String lTagErrorModalForm='error-modal'
				String lLocatorErrorModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagErrorModalForm)
				WebElement lElementErrorModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagErrorModalForm)
				if(lElementErrorModalForm){
					Boolean lErrorModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByElementJs(this.driver,lElementErrorModalForm)
					if(lErrorModalFormDisplayed){
						String lTagErrorModalFormClose='error-modal-close'
						String lLocatorErrorModalFormClose=IGNUemaHelper.getTagDataSeleniumKey(lTagErrorModalFormClose)
						WebElement lElementErrorModalFormClose=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagErrorModalFormClose)
						if(lElementErrorModalForm){
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormClose)
							this.waitUntilLoaded()
						}
						return lreturn
					}
				}
			}
			lResult=lPolicyDetailCardSelectedId.length()>0
			if(lResult){
				lreturn.put('PolicyDetailCardSelectedProductName',lPolicyDetailCardSelectedProductName)
				lreturn.put('PolicyDetailCardSelectedId',lPolicyDetailCardSelectedId)
				lreturn.put('PolicyDetailCardSelectedDetail',lPolicyDetailCardSelectedDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailHistoryToDo(String strPolicyCardProductType,Boolean isMenuPolicyDetailHistoryToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailHistoryToDo=isMenuPolicyDetailHistoryToDo
		String lPolicyDetailHistoryToDo=''
		String lPolicyDetailHistoryDetail=''
		String lPolicyDetailAdditionalDetail=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailHistoryToDo','')
			lreturn.put('PolicyDetailHistoryDetail','')
			lreturn.put('PolicyDetailAdditionalDetail','')
			lreturn.put('Result',lResult)
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagPolicyDetailHistoryItem=''
			String lLocatorPolicyDetailHistoryItem=''
			Boolean lIsPolicyDetailHistoryItem=false
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagPolicyDetailHistoryItem='cancer-detail'
					lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
					lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					if(!lIsPolicyDetailHistoryItem){
						lTagPolicyDetailHistoryItem=''
						lLocatorPolicyDetailHistoryItem='.card-illness-policy'
						lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					}
					break
				case '3':
					lTagPolicyDetailHistoryItem='ci-details'
					lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
					lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					break
				case '4':
					lTagPolicyDetailHistoryItem='pa-details'
					lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
					lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					break
				case '5':
					lTagPolicyDetailHistoryItem='covid19-detail'
					lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
					lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					if(!lIsPolicyDetailHistoryItem){
						lTagPolicyDetailHistoryItem='pa-details'
						lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
						lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					}
					break
				default:
					lTagPolicyDetailHistoryItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
					lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					if(!lIsPolicyDetailHistoryItem){
						lTagPolicyDetailHistoryItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_COMPULSORY_LIST
						lLocatorPolicyDetailHistoryItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailHistoryItem)
						lIsPolicyDetailHistoryItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailHistoryItem)
					}
					break
			}
			lPolicyDetailHistoryToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailHistoryToDo)
			if(!lIsPolicyDetailHistoryItem){
				lIsMenuPolicyDetailHistoryToDo=false
				lPolicyDetailHistoryToDo='No Option'
			}
			if(lIsMenuPolicyDetailHistoryToDo){
				switch(lPolicyCardProductTypeItem){
					case '2':
						WebElement lElementPolicyCancerDetailCardItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyDetailHistoryItem)
						if(!lElementPolicyCancerDetailCardItem){
							return lreturn
						}
						lPolicyDetailHistoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCancerDetailCardItem).trim()
						String lTagPolicyCancerDetailCardDeckList=this.CONST_TAG_MENU_POLICY_HEALTH_CARD_DECK_ITEM
						String lLocatorPolicyCancerDetailCardDeckList=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyCancerDetailCardDeckList)
						List<WebElement> lElementPolicyCancerDetailCardDeckList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagPolicyCancerDetailCardDeckList)
						String lStrPolicyCancerDetailCardDeckItemText=''
						String lStrPolicyCancerDetailCardDeckItemOpportunityNumber=''
						if(lElementPolicyCancerDetailCardDeckList.size()>0){
							for(WebElement lElementPolicyCancerDetailCardDeckItem in lElementPolicyCancerDetailCardDeckList){
								lStrPolicyCancerDetailCardDeckItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCancerDetailCardDeckItem).trim()
								lPolicyDetailHistoryDetail=lPolicyDetailHistoryDetail+'\n'+lStrPolicyCancerDetailCardDeckItemText
								lPolicyDetailHistoryDetail=lPolicyDetailHistoryDetail.trim()
								lStrPolicyCancerDetailCardDeckItemOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyCancerDetailCardDeckItem)
							}
						}
						break
					case '3':
						WebElement lElementPolicyCriticalIllnessDetailCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailHistoryItem)
						if(!lElementPolicyCriticalIllnessDetailCardItem){
							return lreturn
						}
						lPolicyDetailHistoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCriticalIllnessDetailCardItem).trim()
						break
					case '4':
						WebElement lElementPolicyPersonalAccidentDetailCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailHistoryItem)
						if(!lElementPolicyPersonalAccidentDetailCardItem){
							return lreturn
						}
						lPolicyDetailHistoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyPersonalAccidentDetailCardItem).trim()
						break
					case '5':
						WebElement lElementPolicyCovidDetailCardItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyDetailHistoryItem)
						if(!lElementPolicyCovidDetailCardItem){
							return lreturn
						}
						lPolicyDetailHistoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCovidDetailCardItem).trim()
						break
					default:
						WebElement lElementPolicyVehicleDetailCard=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailHistoryItem)
						if(!lElementPolicyVehicleDetailCard){
							return lreturn
						}
						String lStrPolicyVehicleCardOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyVehicleDetailCard).trim()
						lPolicyDetailHistoryDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleDetailCard).trim()
						lPolicyDetailHistoryDetail=IGNUemaHelper.concatMessageLeftRightByPipe(lStrPolicyVehicleCardOpportunityNumber,lPolicyDetailHistoryDetail)
						String lTagPolicyVehicleCardDetailItemHistoryButton=this.CONST_TAG_MENU_POLICY_VEHICLE_BUTTON_HISTORY
						String lLocatorPolicyVehicleCardDetailItemHistoryButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCardDetailItemHistoryButton)
						WebElement lElementPolicyVehicleCardDetailItemHistoryButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPolicyVehicleDetailCard,lTagPolicyVehicleCardDetailItemHistoryButton)
						if(lElementPolicyVehicleCardDetailItemHistoryButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCardDetailItemHistoryButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCardDetailItemHistoryButton)
							this.waitUntilLoaded()
							String lTagPolicyVehicleCardAdditionalDetailList='history-detail-btn'
							String lLocatorPolicyVehicleCardAdditionalDetailList=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCardAdditionalDetailList)
							List<WebElement> lElementPolicyVehicleCardAdditionalDetailList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagPolicyVehicleCardAdditionalDetailList)
							if(lElementPolicyVehicleCardAdditionalDetailList.size()>0){
								for(WebElement lElementPolicyVehicleCardOpenAdditionalDetailItem in lElementPolicyVehicleCardAdditionalDetailList){
									String lStrPolicyVehicleCardOpenAdditionalDetailItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleCardOpenAdditionalDetailItem).trim()
									lPolicyDetailAdditionalDetail=lPolicyDetailAdditionalDetail+'\n'+lStrPolicyVehicleCardOpenAdditionalDetailItemText
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCardOpenAdditionalDetailItem)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCardOpenAdditionalDetailItem)
									this.waitUntilLoaded()
									String lTagPolicyCardDetailAdditionalDetailFormDisplayed=''
									String lLocatorPolicyCardDetailAdditionalDetailFormDisplayed='#historyModal'
									Boolean lIsPolicyCardDetailAdditionalDetailFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorPolicyCardDetailAdditionalDetailFormDisplayed)
									if(!lIsPolicyCardDetailAdditionalDetailFormDisplayed){
										return lreturn
									}
									String lTagPolicyCardDetailAdditionalDetailButtonClose=''
									String lLocatorPolicyCardDetailAdditionalDetailButtonClose='#historyModal button'
									WebElement lElementPolicyCardDetailAdditionalDetailButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyCardDetailAdditionalDetailButtonClose)
									if(lElementPolicyCardDetailAdditionalDetailButtonClose){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyCardDetailAdditionalDetailButtonClose)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyCardDetailAdditionalDetailButtonClose)
										this.waitUntilLoaded()
									}
								}
							}
						}
						break
				}
			}
			lResult=lPolicyDetailHistoryToDo.length()>0
			if(lResult){
				lreturn.put('PolicyDetailHistoryToDo',lPolicyDetailHistoryToDo)
				lreturn.put('PolicyDetailHistoryDetail',lPolicyDetailHistoryDetail)
				lreturn.put('PolicyDetailAdditionalDetail',lPolicyDetailAdditionalDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailDocDownloadToDo(String strPolicyCardProductType,Boolean isMenuPolicyDetailDocDownloadToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailDocDownloadToDo=isMenuPolicyDetailDocDownloadToDo
		String lPolicyDetailDocDownloadToDo=''
		String lPolicyDetailDocDownloadDetail=''
		String lPolicyDetailDocDownloadResult=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailDocDownloadToDo','')
			lreturn.put('PolicyDetailDocDownloadDetail','')
			lreturn.put('PolicyDetailDocDownloadResult','')
			lreturn.put('Result',lResult)
			Boolean lIsPolicyDetailDocDownloadResult=true
			String lTagPolicyDetailDocDownloadItem=''
			String lLocatorPolicyDetailDocDownloadItem=''
			Boolean lIsPolicyDetailDocDownloadItem=false
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagPolicyDetailDocDownloadItem='cancer-detail'
					lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
					lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					if(!lIsPolicyDetailDocDownloadItem){
						lTagPolicyDetailDocDownloadItem=''
						lLocatorPolicyDetailDocDownloadItem='.card-illness-policy'
						lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					}
					break
				case '3':
					lTagPolicyDetailDocDownloadItem='ci-details'
					lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
					lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					break
				case '4':
					lTagPolicyDetailDocDownloadItem='pa-details'
					lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
					lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					break
				case '5':
					lTagPolicyDetailDocDownloadItem='covid19-detail'
					lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
					lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					if(!lIsPolicyDetailDocDownloadItem){
						lTagPolicyDetailDocDownloadItem='pa-details'
						lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
						lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					}
					break
				default:
					lTagPolicyDetailDocDownloadItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					lLocatorPolicyDetailDocDownloadItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailDocDownloadItem)
					lIsPolicyDetailDocDownloadItem=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
					break
			}
			lPolicyDetailDocDownloadToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailDocDownloadToDo)
			if(!lIsPolicyDetailDocDownloadItem){
				lIsMenuPolicyDetailDocDownloadToDo=false
				lPolicyDetailDocDownloadToDo='No Option'
			}
			if(lIsMenuPolicyDetailDocDownloadToDo){
				switch(lPolicyCardProductTypeItem){
					case '2':
						WebElement lElementPolicyCancerCardDetailItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyDetailDocDownloadItem)
						if(!lElementPolicyCancerCardDetailItem){
							return lreturn
						}
						List<WebElement> lElementPolicyCancerDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyCancerCardDetailItem,'a')
						if(lElementPolicyCancerDetailDocDownloadList){
							if(lElementPolicyCancerDetailDocDownloadList.size()>0){
								Boolean lIsOK=false
								for(WebElement lElementPolicyCancerDetailDocDownloadItem in lElementPolicyCancerDetailDocDownloadList){
									if(lElementPolicyCancerDetailDocDownloadItem){
										lIsOK=false
										String lStrPolicyCancerDetailDocDownloadItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCancerDetailDocDownloadItem).trim()
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail+'\n'+lStrPolicyCancerDetailDocDownloadItemText
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail.trim()
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyCancerDetailDocDownloadItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyCancerDetailDocDownloadItem)
										String lMainWindow=this.driver.getWindowHandle()
										IGNUemaHelper.delayThreadSecond(3)
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
										}
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
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
											for(String lWindowHandle:lSetWinHandle){
												if(!lMainWindow.equals(lWindowHandle)){
													this.driver.switchTo().window(lWindowHandle)
													IGNUemaHelper.delayThreadSecond(1)
													lIsOK=true
													this.driver.close()
													WebUI.switchToDefaultContent()
													this.driver.switchTo().window(lMainWindow)
												}
											}
										}catch(Exception ex){
											try{
												WebUI.switchToDefaultContent()
												this.driver.switchTo().window(lMainWindow)
											}catch(Exception exx){
												this.driver.switchTo().window(lMainWindow)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
										lIsPolicyDetailDocDownloadResult=lIsPolicyDetailDocDownloadResult&&lIsOK
									}
								}
							}else{
								lIsMenuPolicyDetailDocDownloadToDo=false
								lPolicyDetailDocDownloadToDo='No Option'
							}
						}else{
							lIsMenuPolicyDetailDocDownloadToDo=false
							lPolicyDetailDocDownloadToDo='No Option'
						}
						break
					case '3':
						WebElement lElementPolicyCriticalIllnessCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailDocDownloadItem)
						if(!lElementPolicyCriticalIllnessCardDetailItem){
							return lreturn
						}
						List<WebElement> lElementPolicyCriticalIllnessDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyCriticalIllnessCardDetailItem,'a')
						if(lElementPolicyCriticalIllnessDetailDocDownloadList){
							if(lElementPolicyCriticalIllnessDetailDocDownloadList.size()>0){
								Boolean lIsOK=false
								for(WebElement lElementPolicyCriticalIllnessDetailDocDownloadItem in lElementPolicyCriticalIllnessDetailDocDownloadList){
									if(lElementPolicyCriticalIllnessDetailDocDownloadItem){
										lIsOK=false
										String lStrPolicyCriticalIllnessDetailDocDownloadItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCriticalIllnessDetailDocDownloadItem).trim()
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail+'\n'+lStrPolicyCriticalIllnessDetailDocDownloadItemText
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail.trim()
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyCriticalIllnessDetailDocDownloadItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyCriticalIllnessDetailDocDownloadItem)
										String lMainWindow=this.driver.getWindowHandle()
										IGNUemaHelper.delayThreadSecond(3)
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
										}
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
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
											for(String lWindowHandle:lSetWinHandle){
												if(!lMainWindow.equals(lWindowHandle)){
													this.driver.switchTo().window(lWindowHandle)
													IGNUemaHelper.delayThreadSecond(1)
													lIsOK=true
													this.driver.close()
													WebUI.switchToDefaultContent()
													this.driver.switchTo().window(lMainWindow)
												}
											}
										}catch(Exception ex){
											try{
												WebUI.switchToDefaultContent()
												this.driver.switchTo().window(lMainWindow)
											}catch(Exception exx){
												this.driver.switchTo().window(lMainWindow)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
										lIsPolicyDetailDocDownloadResult=lIsPolicyDetailDocDownloadResult&&lIsOK
									}
								}
							}else{
								lIsMenuPolicyDetailDocDownloadToDo=false
								lPolicyDetailDocDownloadToDo='No Option'
							}
						}else{
							lIsMenuPolicyDetailDocDownloadToDo=false
							lPolicyDetailDocDownloadToDo='No Option'
						}
						break
					case '4':
						WebElement lElementPolicyPersonalAccidentCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailDocDownloadItem)
						if(!lElementPolicyPersonalAccidentCardDetailItem){
							return lreturn
						}
						List<WebElement> lElementPolicyPersonalAccidentDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyPersonalAccidentCardDetailItem,'a')
						if(lElementPolicyPersonalAccidentDetailDocDownloadList){
							if(lElementPolicyPersonalAccidentDetailDocDownloadList.size()>0){
								Boolean lIsOK=false
								for(WebElement lElementPolicyPersonalAccidentDetailDocDownloadItem in lElementPolicyPersonalAccidentDetailDocDownloadList){
									if(lElementPolicyPersonalAccidentDetailDocDownloadItem){
										lIsOK=false
										String lStrPolicyPersonalAccidentDetailDocDownloadItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyPersonalAccidentDetailDocDownloadItem).trim()
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail+'\n'+lStrPolicyPersonalAccidentDetailDocDownloadItemText
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail.trim()
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyPersonalAccidentDetailDocDownloadItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyPersonalAccidentDetailDocDownloadItem)
										String lMainWindow=this.driver.getWindowHandle()
										IGNUemaHelper.delayThreadSecond(3)
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
										}
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
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
											for(String lWindowHandle:lSetWinHandle){
												if(!lMainWindow.equals(lWindowHandle)){
													this.driver.switchTo().window(lWindowHandle)
													IGNUemaHelper.delayThreadSecond(1)
													lIsOK=true
													this.driver.close()
													WebUI.switchToDefaultContent()
													this.driver.switchTo().window(lMainWindow)
												}
											}
										}catch(Exception ex){
											try{
												WebUI.switchToDefaultContent()
												this.driver.switchTo().window(lMainWindow)
											}catch(Exception exx){
												this.driver.switchTo().window(lMainWindow)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
										lIsPolicyDetailDocDownloadResult=lIsPolicyDetailDocDownloadResult&&lIsOK
									}
								}
							}else{
								lIsMenuPolicyDetailDocDownloadToDo=false
								lPolicyDetailDocDownloadToDo='No Option'
							}
						}else{
							lIsMenuPolicyDetailDocDownloadToDo=false
							lPolicyDetailDocDownloadToDo='No Option'
						}
						break
					case '5':
						WebElement lElementPolicyCovidCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailDocDownloadItem)
						if(!lElementPolicyCovidCardDetailItem){
							return lreturn
						}
						List<WebElement> lElementPolicyCovidDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyCovidCardDetailItem,'a')
						if(lElementPolicyCovidDetailDocDownloadList){
							if(lElementPolicyCovidDetailDocDownloadList.size()>0){
								Boolean lIsOK=false
								for(WebElement lElementPolicyCovidDetailDocDownloadItem in lElementPolicyCovidDetailDocDownloadList){
									if(lElementPolicyCovidDetailDocDownloadItem){
										lIsOK=false
										String lStrPolicyCovidDetailDocDownloadItemText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyCovidDetailDocDownloadItem).trim()
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail+'\n'+lStrPolicyCovidDetailDocDownloadItemText
										lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail.trim()
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyCovidDetailDocDownloadItem)
										IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyCovidDetailDocDownloadItem)
										String lMainWindow=this.driver.getWindowHandle()
										IGNUemaHelper.delayThreadSecond(3)
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
										}
										if(!this.waitUntilLoaded()){
											this.waitUntilLoaded()
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
											for(String lWindowHandle:lSetWinHandle){
												if(!lMainWindow.equals(lWindowHandle)){
													this.driver.switchTo().window(lWindowHandle)
													IGNUemaHelper.delayThreadSecond(1)
													lIsOK=true
													this.driver.close()
													WebUI.switchToDefaultContent()
													this.driver.switchTo().window(lMainWindow)
												}
											}
										}catch(Exception ex){
											try{
												WebUI.switchToDefaultContent()
												this.driver.switchTo().window(lMainWindow)
											}catch(Exception exx){
												this.driver.switchTo().window(lMainWindow)
											}
										}
										IGNUemaHelper.delayThreadSecond(1)
										lIsPolicyDetailDocDownloadResult=lIsPolicyDetailDocDownloadResult&&lIsOK
									}
								}
							}else{
								lIsMenuPolicyDetailDocDownloadToDo=false
								lPolicyDetailDocDownloadToDo='No Option'
							}
						}else{
							lIsMenuPolicyDetailDocDownloadToDo=false
							lPolicyDetailDocDownloadToDo='No Option'
						}
						break
					default:
						WebElement lElementPolicyVehicleCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailDocDownloadItem)
						if(!lElementPolicyVehicleCardDetailItem){
							return lreturn
						}
						String lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyVehicleCardDetailItem)
						THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
						String lTagPolicyVehicleDownloadDetail='download-btn'
						String lLocatorPolicyVehicleDownloadDetail=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleDownloadDetail)
						WebElement lElementPolicyVehicleDownloadDetail=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyVehicleDownloadDetail)
						if(!lElementPolicyVehicleDownloadDetail){
							return lreturn
						}else{
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleDownloadDetail)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleDownloadDetail)
							this.waitUntilLoaded()
							String lTagMenuPolicyVehicleDocDownloadCardDetailkey=this.CONST_TAG_MENU_DOC_DOWNLOAD_CARD_LIST
							String lTagMenuPolicyVehicleDocDownloadCardDetailValue=lOpportunityNumber
							String lLocatorMenuPolicyVehicleDocDownloadCardDetail=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyVehicleDocDownloadCardDetailkey,lTagMenuPolicyVehicleDocDownloadCardDetailValue)
							WebElement lElementPolicyVehicleDocDownloadCardDetail=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyVehicleDocDownloadCardDetailkey,lTagMenuPolicyVehicleDocDownloadCardDetailValue)
							if(!lElementPolicyVehicleDocDownloadCardDetail){
								return lreturn
							}else{
								lPolicyDetailDocDownloadDetail=lOpportunityNumber+'\n'
								lPolicyDetailDocDownloadDetail=lPolicyDetailDocDownloadDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleDocDownloadCardDetail).trim()
							}
							if(lElementPolicyVehicleDocDownloadCardDetail){
								List<WebElement> lElementPolicyVehicleDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyVehicleDocDownloadCardDetail,'a')
								if(lElementPolicyVehicleDetailDocDownloadList){
									if(lElementPolicyVehicleDetailDocDownloadList.size()>0){
										Boolean lIsOK=false
										for(WebElement lElementPolicyVehicleDetailDocDownloadItem in lElementPolicyVehicleDetailDocDownloadList){
											if(lElementPolicyVehicleDetailDocDownloadItem){
												lIsOK=false
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleDetailDocDownloadItem)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleDetailDocDownloadItem)
												String lMainWindow=this.driver.getWindowHandle()
												IGNUemaHelper.delayThreadSecond(3)
												if(!this.waitUntilLoaded()){
													this.waitUntilLoaded()
												}
												if(!this.waitUntilLoaded()){
													this.waitUntilLoaded()
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
													for(String lWindowHandle:lSetWinHandle){
														if(!lMainWindow.equals(lWindowHandle)){
															this.driver.switchTo().window(lWindowHandle)
															IGNUemaHelper.delayThreadSecond(1)
															lIsOK=true
															this.driver.close()
															WebUI.switchToDefaultContent()
															this.driver.switchTo().window(lMainWindow)
														}
													}
												}catch(Exception ex){
													try{
														WebUI.switchToDefaultContent()
														this.driver.switchTo().window(lMainWindow)
													}catch(Exception exx){
														this.driver.switchTo().window(lMainWindow)
													}
												}
												IGNUemaHelper.delayThreadSecond(1)
												lIsPolicyDetailDocDownloadResult=lIsPolicyDetailDocDownloadResult&&lIsOK
											}
										}
									}
								}
							}
						}
						break
				}
			}
			if(!lIsMenuPolicyDetailDocDownloadToDo){
				lResult=lPolicyDetailDocDownloadToDo.length()>0
			}else{
				if(lIsPolicyDetailDocDownloadResult){
					lPolicyDetailDocDownloadResult='Passed'
				}
				lResult=lPolicyDetailDocDownloadResult.length()>0
			}
			if(lResult){
				lreturn.put('PolicyDetailDocDownloadToDo',lPolicyDetailDocDownloadToDo)
				lreturn.put('PolicyDetailDocDownloadDetail',lPolicyDetailDocDownloadDetail)
				lreturn.put('PolicyDetailDocDownloadResult',lPolicyDetailDocDownloadResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailDocDownloadOpenInsuranceHandbookToDo(String strPolicyCardProductType,Boolean isMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=isMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo
		String lPolicyDetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyDetailDocDownloadInsuranceHandbook=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailDocDownloadOpenInsuranceHandbookToDo','')
			lreturn.put('PolicyDetailDocDownloadInsuranceHandbook','')
			lreturn.put('Result',lResult)
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagOpenInsuranceHandbookButton=''
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
					break
				case '3':
					lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
					break
				case '4':
					lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
					break
				case '5':
					lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
					break
				default:
					lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
					break
			}
			lPolicyDetailDocDownloadOpenInsuranceHandbookToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
			String lLocatorOpenInsuranceHandbookButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenInsuranceHandbookButton)
			WebElement lElementOpenInsuranceHandbookButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenInsuranceHandbookButton)
			if(!lElementOpenInsuranceHandbookButton){
				lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo=false
				lPolicyDetailDocDownloadOpenInsuranceHandbookToDo='No Option'
			}
			if(lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementOpenInsuranceHandbookButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenInsuranceHandbookButton)
				String lMainWindow=this.driver.getWindowHandle()
				IGNUemaHelper.delayThreadSecond(3)
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
				}
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
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
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							IGNUemaHelper.delayThreadSecond(1)
							lPolicyDetailDocDownloadInsuranceHandbook='Passed'
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
				WebUI.back()
				this.waitUntilLoaded()
			}
			if(!lIsMenuPolicyDetailDocDownloadOpenInsuranceHandbookToDo){
				lResult=lPolicyDetailDocDownloadOpenInsuranceHandbookToDo.length()>0
			}else{
				lResult=lPolicyDetailDocDownloadInsuranceHandbook.length()>0
			}
			if(lResult){
				lreturn.put('PolicyDetailDocDownloadOpenInsuranceHandbookToDo',lPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
				lreturn.put('PolicyDetailDocDownloadInsuranceHandbook',lPolicyDetailDocDownloadInsuranceHandbook)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailPaymentToDo(String strPolicyCardProductType,Boolean isMenuPolicyDetailPaymentToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailPaymentToDo=isMenuPolicyDetailPaymentToDo
		String lPolicyDetailPaymentToDo=''
		String lPolicyDetailPaymentCardId=''
		String lPolicyDetailPaymentDetail=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailPaymentToDo','')
			lreturn.put('PolicyDetailPaymentCardId','')
			lreturn.put('PolicyDetailPaymentDetail','')
			lreturn.put('Result',lResult)
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagPolicyVehicleCardDetailItem=''
			String lLocatorPolicyVehicleCardDetailItem=''
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagPolicyVehicleCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					break
				case '3':
					lTagPolicyVehicleCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					break
				case '4':
					lTagPolicyVehicleCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					break
				case '5':
					lTagPolicyVehicleCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					break
				default:
					lTagPolicyVehicleCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					break
			}
			lPolicyDetailPaymentToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailPaymentToDo)
			lLocatorPolicyVehicleCardDetailItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCardDetailItem)
			WebElement lElementPolicyVehicleCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyVehicleCardDetailItem)
			if(!lElementPolicyVehicleCardDetailItem){
				lIsMenuPolicyDetailPaymentToDo=false
				lPolicyDetailPaymentToDo='No Option'
			}
			if(lIsMenuPolicyDetailPaymentToDo){
				String lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyVehicleCardDetailItem)
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
				lPolicyDetailPaymentCardId=lOpportunityNumber
				String lTagPolicyVehicleCardDetailItemPaymentOpenButton='payment-btn'
				String lLocatorPolicyVehicleCardDetailItemPaymentOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCardDetailItemPaymentOpenButton)
				WebElement lElementPolicyVehicleCardDetailItemPaymentOpenButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPolicyVehicleCardDetailItem,lTagPolicyVehicleCardDetailItemPaymentOpenButton)
				if(!lElementPolicyVehicleCardDetailItemPaymentOpenButton){
					return lreturn
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCardDetailItemPaymentOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCardDetailItemPaymentOpenButton)
					this.waitUntilLoaded()
					String lTagMenuPaymentCardItemKey=this.CONST_TAG_MENU_PAYMENT_CARD_LIST
					String lTagMenuPaymentCardItemValue=lOpportunityNumber
					String lLocatorMenuPaymentCardItem=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPaymentCardItemKey,lTagMenuPaymentCardItemValue)
					WebElement lElementMenuPaymentCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPaymentCardItemKey,lTagMenuPaymentCardItemValue)
					if(!lElementMenuPaymentCardItem){
						lPolicyDetailPaymentCardId=''
					}else{
						String lTagPaymentDetailButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_PAYMENT_DETAIL
						String lLocatorPaymentDetailButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentDetailButton)
						WebElement lElementPaymentDetailButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementMenuPaymentCardItem,lTagPaymentDetailButton)
						if(lElementPaymentDetailButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPaymentDetailButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPaymentDetailButton)
							this.waitUntilLoaded()
						}
						lPolicyDetailPaymentDetail=lOpportunityNumber+'\n'
						lPolicyDetailPaymentDetail=lPolicyDetailPaymentDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementMenuPaymentCardItem).trim()
					}
				}
			}
			lResult=lPolicyDetailPaymentToDo.length()>0
			if(lResult){
				lreturn.put('PolicyDetailPaymentToDo',lPolicyDetailPaymentToDo)
				lreturn.put('PolicyDetailPaymentCardId',lPolicyDetailPaymentCardId)
				lreturn.put('PolicyDetailPaymentDetail',lPolicyDetailPaymentDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailPaymentOpenTermAndConditionToDo(String strPolicyCardProductType,Boolean isMenuPolicyDetailPaymentOpenTermAndConditionToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo=isMenuPolicyDetailPaymentOpenTermAndConditionToDo
		String lPolicyDetailPaymentOpenTermAndConditionToDo=''
		String lPolicyDetailPaymentTermAndCondition=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailPaymentOpenTermAndConditionToDo','')
			lreturn.put('PolicyDetailPaymentTermAndCondition','')
			lreturn.put('Result',lResult)
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagOpenTermAndConditionButton=''
			String lLocatorOpenTermAndConditionButton=''
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
					break
				case '3':
					lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
					break
				case '4':
					lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
					break
				case '5':
					lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
					break
				default:
					lTagOpenTermAndConditionButton=this.CONST_TAG_MENU_PAYMENT_BUTTON_OPEN_TERM_AND_CONDITION
					break
			}
			lPolicyDetailPaymentOpenTermAndConditionToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo)
			lLocatorOpenTermAndConditionButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenTermAndConditionButton)
			WebElement lElementOpenTermAndConditionButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenTermAndConditionButton)
			if(!lElementOpenTermAndConditionButton){
				lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo=false
				lPolicyDetailPaymentOpenTermAndConditionToDo='No Option'
			}
			if(lIsMenuPolicyDetailPaymentOpenTermAndConditionToDo){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementOpenTermAndConditionButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenTermAndConditionButton)
				String lMainWindow=this.driver.getWindowHandle()
				IGNUemaHelper.delayThreadSecond(3)
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
				}
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
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
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							IGNUemaHelper.delayThreadSecond(1)
							lPolicyDetailPaymentTermAndCondition='Passed'
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
			}
			lResult=lPolicyDetailPaymentOpenTermAndConditionToDo.length()>0
			if(lResult){
				lreturn.put('PolicyDetailPaymentOpenTermAndConditionToDo',lPolicyDetailPaymentOpenTermAndConditionToDo)
				lreturn.put('PolicyDetailPaymentTermAndCondition',lPolicyDetailPaymentTermAndCondition)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailTaxDeductionToDo(String strPolicyCardProductType,String strMenuPolicyDetailTaxDeductionEditHolderIsThai,String strMenuPolicyDetailTaxDeductionEditName,String strMenuPolicyDetailTaxDeductionEditSurname,String strMenuPolicyDetailTaxDeductionEditIdentificationNumber,Boolean isMenuPolicyDetailTaxDeductionToDo,Boolean isMenuPolicyDetailTaxDeductionAccept,Boolean isMenuPolicyDetailTaxDeductionEditToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailTaxDeductionToDo=isMenuPolicyDetailTaxDeductionToDo
		Boolean lIsTaxDeductionAccept=isMenuPolicyDetailTaxDeductionAccept
		Boolean lIsTaxDeductionEditToDo=isMenuPolicyDetailTaxDeductionEditToDo
		String lMenuPolicyDetailTaxDeductionEditHolderIsThai=strMenuPolicyDetailTaxDeductionEditHolderIsThai.trim()
		String lMenuPolicyDetailTaxDeductionEditName=strMenuPolicyDetailTaxDeductionEditName.trim()
		String lMenuPolicyDetailTaxDeductionEditSurname=strMenuPolicyDetailTaxDeductionEditSurname.trim()
		String lMenuPolicyDetailTaxDeductionEditIdentificationNumber=strMenuPolicyDetailTaxDeductionEditIdentificationNumber.trim()
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		Map lMapPolicyDetailTaxDeductionAccept=['Yes':'1','No':'2']
		Map lMapPolicyDetailTaxDeductionEditHolderIsThai=['1':'Random','2':'Yes','3':'No']
		String lPolicyDetailTaxDeductionToDo=''
		String lPolicyDetailTaxDeductionDetail=''
		String lPolicyDetailTaxDeductionResult=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailTaxDeductionToDo','')
			lreturn.put('PolicyDetailTaxDeductionDetail','')
			lreturn.put('PolicyDetailTaxDeductionResult','')
			lreturn.put('Result',lResult)
			Boolean lIsPolicyDetailTaxDeductionResult=true
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagTaxDeductionButton=''
			String lLocatorTaxDeductionButton=''
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagTaxDeductionButton='tax-deduction-button'
					break
				case '3':
					lTagTaxDeductionButton='tax-deduction-button'
					break
				case '4':
					lTagTaxDeductionButton='tax-deduction-button'
					break
				case '5':
					lTagTaxDeductionButton='tax-deduction-button'
					break
				default:
					lTagTaxDeductionButton='tax-deduction-button'
					break
			}
			lPolicyDetailTaxDeductionToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailTaxDeductionToDo)
			lLocatorTaxDeductionButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionButton)
			WebElement lElementTaxDeductionButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionButton)
			if(!lElementTaxDeductionButton){
				lIsMenuPolicyDetailTaxDeductionToDo=false
				lPolicyDetailTaxDeductionToDo='No Option'
			}
			if(lIsMenuPolicyDetailTaxDeductionToDo){
				switch(lPolicyCardProductTypeItem){
					case '2':
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionButton)
						this.waitUntilLoaded()
						String lTagTaxDeductionFormDisplayed=''
						String lLocatorTaxDeductionFormDisplayed='#tax-modal'
						Boolean lIsTaxDeductionFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionFormDisplayed)
						if(!lIsTaxDeductionFormDisplayed){
							lIsPolicyDetailTaxDeductionResult=false
						}else{
							String lMenuPolicyDetailTaxDeductionAccept=IGNUemaHelper.convertBooleanToYesNoString(lIsTaxDeductionAccept)
							lPolicyDetailTaxDeductionDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorTaxDeductionFormDisplayed)
							String lTagTaxDeductionAcceptOptionKey='tax-deduction-accept'
							String lLocatorTaxDeductionAcceptOptionKey=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionAcceptOptionKey)
							String lTaxDeductionAcceptItemValue=lMapPolicyDetailTaxDeductionAccept.get(lMenuPolicyDetailTaxDeductionAccept)
							if(!lTaxDeductionAcceptItemValue){
								lTaxDeductionAcceptItemValue=lMapPolicyDetailTaxDeductionAccept.get(THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_ACCEPT)
							}
							String lTagTaxDeductionAcceptOptionValue=lTaxDeductionAcceptItemValue
							String lLocatorTaxDeductionAcceptOptionValue=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionAcceptOptionValue)
							WebElement lElementTaxDeductionAcceptOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagTaxDeductionAcceptOptionKey,lTagTaxDeductionAcceptOptionValue)
							if(!lElementTaxDeductionAcceptOption){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionAcceptOption)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionAcceptOption)
							this.waitUntilLoaded()
							String lTagTaxDeductionNextButton='tax-deduction-next-button'
							String lLocatorTaxDeductionNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionButton)
							WebElement lElementTaxDeductionNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionNextButton)
							if(!lElementTaxDeductionNextButton){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionNextButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionNextButton)
							this.waitUntilLoaded()
							if(lIsTaxDeductionAccept){
								String lTagTaxDeductionPayerName='tax-payer-name'
								String lLocatorTaxDeductionPayerName=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionPayerName)
								WebElement lElementTaxDeductionPayerName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionPayerName)
								if(!lElementTaxDeductionPayerName){
									lIsPolicyDetailTaxDeductionResult=false
								}
								String lTextTaxDeductionPayerName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTaxDeductionPayerName)
								String lTagTaxDeductionPayerID='tax-payer-id'
								String lLocatorTaxDeductionPayerID=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionPayerID)
								WebElement lElementTaxDeductionPayerID=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionPayerID)
								if(!lElementTaxDeductionPayerID){
									lIsPolicyDetailTaxDeductionResult=false
								}
								String lTextTaxDeductionPayerID=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTaxDeductionPayerID)
								String lTextTaxDeductionAccept=IGNUemaHelper.concatMessageLeftRightByPipe(lTextTaxDeductionPayerName,lTextTaxDeductionPayerID)
								lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lTextTaxDeductionAccept
								if(lIsTaxDeductionEditToDo){
									String lTagTaxDeductionEditButton='edit-tax-payer-button'
									String lLocatorTaxDeductionEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionEditButton)
									WebElement lElementTaxDeductionEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditButton)
									if(!lElementTaxDeductionEditButton){
										lIsPolicyDetailTaxDeductionResult=false
									}
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionEditButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionEditButton)
									this.waitUntilLoaded()
									String lTagTaxDeductionEditHolderIsThaiOptionKey='edit-tax-payer-thai-id'
									String lLocatorTaxDeductionEditHolderIsThaiOptionKey=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionEditHolderIsThaiOptionKey)
									String lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(lMenuPolicyDetailTaxDeductionEditHolderIsThai)
									if(!lTaxDeductionEditHolderIsThaiItemValue){
										lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_ACCEPT)
									}
									Boolean lIsTaxDeductionEditHolderIsThaiItemValue=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItemValue,'Random')
									if(lIsTaxDeductionEditHolderIsThaiItemValue){
										String lTaxDeductionEditHolderIsThaiItem1=THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_HEALTH_POLICY_HOLDER_NATIONALITY_FLAG
										String lTaxDeductionEditHolderIsThaiItem2=''
										if(lTaxDeductionEditHolderIsThaiItem1.length()<=0){
											lTaxDeductionEditHolderIsThaiItem1=IGNUemaHelper.getRandomCharacterTextFromString('23')
										}
										lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
										Boolean lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(lTaxDeductionEditHolderIsThaiItem2)
										THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_HEALTH_POLICY_HOLDER_NATIONALITY_FLAG=lTaxDeductionEditHolderIsThaiItem2
									}
									String lTagTaxDeductionEditHolderIsThaiOptionValue=lTaxDeductionEditHolderIsThaiItemValue
									String lLocatorTaxDeductionEditHolderIsThaiOptionValue=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditHolderIsThaiOptionValue)
									WebElement lElementTaxDeductionEditHolderIsThaiOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagTaxDeductionEditHolderIsThaiOptionKey,lTagTaxDeductionEditHolderIsThaiOptionValue)
									if(!lElementTaxDeductionEditHolderIsThaiOption){
										lIsPolicyDetailTaxDeductionResult=false
									}
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionEditHolderIsThaiOption)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionEditHolderIsThaiOption)
									this.waitUntilLoaded()
									String lTaxDeductionEditHolderIsThaiText=IGNUemaHelper.getTextByWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementTaxDeductionEditHolderIsThaiOption))
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lTaxDeductionEditHolderIsThaiText
									String lTagTaxDeductionEditName='edit-tax-payer-name'
									String lLocatorTaxDeductionEditName=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditName)
									WebElement lElementTaxDeductionEditName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditName)
									if(!lElementTaxDeductionEditName){
										lTagTaxDeductionEditName='edit-tax-payer-firstname'
										lLocatorTaxDeductionEditName=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditName)
										lElementTaxDeductionEditName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditName)
									}
									if(!lElementTaxDeductionEditName){
										lIsPolicyDetailTaxDeductionResult=false
									}else{
										lMenuPolicyDetailTaxDeductionEditName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditName)
										String lTagTaxDeductionEditSurname='edit-tax-payer-last-name'
										String lLocatorTaxDeductionEditSurname=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditSurname)
										WebElement lElementTaxDeductionEditSurname=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditSurname)
										if(lElementTaxDeductionEditSurname){
											lMenuPolicyDetailTaxDeductionEditSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditSurname)
											lMenuPolicyDetailTaxDeductionEditName=IGNUemaHelper.concatMessageLeftRightByPipe(lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname)
										}
									}
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lMenuPolicyDetailTaxDeductionEditName
									String lTagTaxDeductionEditIdentificationNumber='edit-tax-payer-id'
									String lLocatorTaxDeductionEditIdentificationNumber=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditIdentificationNumber)
									WebElement lElementTaxDeductionEditIdentificationNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditIdentificationNumber)
									if(!lElementTaxDeductionEditIdentificationNumber){
										lIsPolicyDetailTaxDeductionResult=false
									}
									if(lMenuPolicyDetailTaxDeductionEditIdentificationNumber.length()<=0){
										Boolean lIsPolicyDetailTaxDeductionEditHolderIsThai=IGNUemaHelper.convertStringToBoolean(lTaxDeductionEditHolderIsThaiItemValue)
										if(lIsPolicyDetailTaxDeductionEditHolderIsThai){
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.randomIDThaiOrPassportNumber(true,true)
										}else{
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.randomIDThaiOrPassportNumber(true,true)
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=lMenuPolicyDetailTaxDeductionEditIdentificationNumber.substring(3,lMenuPolicyDetailTaxDeductionEditIdentificationNumber.length())
										}
									}
									lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditIdentificationNumber,lMenuPolicyDetailTaxDeductionEditIdentificationNumber)
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lMenuPolicyDetailTaxDeductionEditIdentificationNumber
								}
								String lTagTaxDeductionSubmitButton='tax-submit-button'
								String lLocatorTaxDeductionSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionSubmitButton)
								WebElement lElementTaxDeductionSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionSubmitButton)
								if(!lElementTaxDeductionSubmitButton){
									lIsPolicyDetailTaxDeductionResult=false
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionSubmitButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionSubmitButton)
								this.waitUntilLoaded()
								String lTagTaxDeductionConfirmFormDisplayed=''
								String lLocatorTaxDeductionConfirmFormDisplayed='#tax-completed'
								Boolean lIsTaxDeductionConfirmFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionConfirmFormDisplayed)
								if(!lIsTaxDeductionConfirmFormDisplayed){
									lIsPolicyDetailTaxDeductionResult=false
								}
							}else{
								String lTagTaxDeductionConfirmFormDisplayed=''
								String lLocatorTaxDeductionConfirmFormDisplayed='#tax-disclaim'
								Boolean lIsTaxDeductionConfirmFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionConfirmFormDisplayed)
								if(!lIsTaxDeductionConfirmFormDisplayed){
									lIsPolicyDetailTaxDeductionResult=false
								}
							}
							String lTagTaxDeductionConfirmButton='tax-confirm-button'
							String lLocatorTaxDeductionConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionConfirmButton)
							WebElement lElementTaxDeductionConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionConfirmButton)
							if(!lElementTaxDeductionConfirmButton){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionConfirmButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionConfirmButton)
							this.waitUntilLoaded()
						}
						break
					case '3':
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionButton)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionButton)
						this.waitUntilLoaded()
						String lTagTaxDeductionFormDisplayed=''
						String lLocatorTaxDeductionFormDisplayed='#tax-modal'
						Boolean lIsTaxDeductionFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionFormDisplayed)
						if(!lIsTaxDeductionFormDisplayed){
							lIsPolicyDetailTaxDeductionResult=false
						}else{
							String lMenuPolicyDetailTaxDeductionAccept=IGNUemaHelper.convertBooleanToYesNoString(lIsTaxDeductionAccept)
							lPolicyDetailTaxDeductionDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorTaxDeductionFormDisplayed)
							String lTagTaxDeductionAcceptOptionKey='tax-deduction-accept'
							String lLocatorTaxDeductionAcceptOptionKey=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionAcceptOptionKey)
							String lTaxDeductionAcceptItemValue=lMapPolicyDetailTaxDeductionAccept.get(lMenuPolicyDetailTaxDeductionAccept)
							if(!lTaxDeductionAcceptItemValue){
								lTaxDeductionAcceptItemValue=lMapPolicyDetailTaxDeductionAccept.get(THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_ACCEPT)
							}
							String lTagTaxDeductionAcceptOptionValue=lTaxDeductionAcceptItemValue
							String lLocatorTaxDeductionAcceptOptionValue=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionAcceptOptionValue)
							WebElement lElementTaxDeductionAcceptOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagTaxDeductionAcceptOptionKey,lTagTaxDeductionAcceptOptionValue)
							if(!lElementTaxDeductionAcceptOption){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionAcceptOption)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionAcceptOption)
							this.waitUntilLoaded()
							String lTagTaxDeductionNextButton='tax-deduction-next-button'
							String lLocatorTaxDeductionNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionButton)
							WebElement lElementTaxDeductionNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionNextButton)
							if(!lElementTaxDeductionNextButton){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionNextButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionNextButton)
							this.waitUntilLoaded()
							if(lIsTaxDeductionAccept){
								String lTagTaxDeductionPayerName='tax-payer-name'
								String lLocatorTaxDeductionPayerName=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionPayerName)
								WebElement lElementTaxDeductionPayerName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionPayerName)
								if(!lElementTaxDeductionPayerName){
									lIsPolicyDetailTaxDeductionResult=false
								}
								String lTextTaxDeductionPayerName=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTaxDeductionPayerName)
								String lTagTaxDeductionPayerID='tax-payer-id'
								String lLocatorTaxDeductionPayerID=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionPayerID)
								WebElement lElementTaxDeductionPayerID=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionPayerID)
								if(!lElementTaxDeductionPayerID){
									lIsPolicyDetailTaxDeductionResult=false
								}
								String lTextTaxDeductionPayerID=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTaxDeductionPayerID)
								String lTextTaxDeductionAccept=IGNUemaHelper.concatMessageLeftRightByPipe(lTextTaxDeductionPayerName,lTextTaxDeductionPayerID)
								lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lTextTaxDeductionAccept
								if(lIsTaxDeductionEditToDo){
									String lTagTaxDeductionEditButton='edit-tax-payer-button'
									String lLocatorTaxDeductionEditButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionEditButton)
									WebElement lElementTaxDeductionEditButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditButton)
									if(!lElementTaxDeductionEditButton){
										lIsPolicyDetailTaxDeductionResult=false
									}
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionEditButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionEditButton)
									this.waitUntilLoaded()
									String lTagTaxDeductionEditHolderIsThaiOptionKey='edit-tax-payer-thai-id'
									String lLocatorTaxDeductionEditHolderIsThaiOptionKey=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionEditHolderIsThaiOptionKey)
									String lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(lMenuPolicyDetailTaxDeductionEditHolderIsThai)
									if(!lTaxDeductionEditHolderIsThaiItemValue){
										lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_DETAIL_TAX_DEDUCTION_ACCEPT)
									}
									Boolean lIsTaxDeductionEditHolderIsThaiItemValue=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItemValue,'Random')
									if(lIsTaxDeductionEditHolderIsThaiItemValue){
										String lTaxDeductionEditHolderIsThaiItem1=THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_HEALTH_POLICY_HOLDER_NATIONALITY_FLAG
										String lTaxDeductionEditHolderIsThaiItem2=''
										if(lTaxDeductionEditHolderIsThaiItem1.length()<=0){
											lTaxDeductionEditHolderIsThaiItem1=IGNUemaHelper.getRandomCharacterTextFromString('23')
										}
										lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
										Boolean lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										if(lIsTaxDeductionEditHolderIsThaiItemRandom){
											lTaxDeductionEditHolderIsThaiItem2=IGNUemaHelper.getRandomCharacterTextFromString('23')
											lIsTaxDeductionEditHolderIsThaiItemRandom=IGNUemaHelper.checkStringContainString(lTaxDeductionEditHolderIsThaiItem2,lTaxDeductionEditHolderIsThaiItem1)
										}
										lTaxDeductionEditHolderIsThaiItemValue=lMapPolicyDetailTaxDeductionEditHolderIsThai.get(lTaxDeductionEditHolderIsThaiItem2)
										THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_HEALTH_POLICY_HOLDER_NATIONALITY_FLAG=lTaxDeductionEditHolderIsThaiItem2
									}
									String lTagTaxDeductionEditHolderIsThaiOptionValue=lTaxDeductionEditHolderIsThaiItemValue
									String lLocatorTaxDeductionEditHolderIsThaiOptionValue=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditHolderIsThaiOptionValue)
									WebElement lElementTaxDeductionEditHolderIsThaiOption=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagTaxDeductionEditHolderIsThaiOptionKey,lTagTaxDeductionEditHolderIsThaiOptionValue)
									if(!lElementTaxDeductionEditHolderIsThaiOption){
										lIsPolicyDetailTaxDeductionResult=false
									}
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionEditHolderIsThaiOption)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionEditHolderIsThaiOption)
									this.waitUntilLoaded()
									String lTaxDeductionEditHolderIsThaiText=IGNUemaHelper.getTextByWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementTaxDeductionEditHolderIsThaiOption))
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lTaxDeductionEditHolderIsThaiText
									String lTagTaxDeductionEditName='edit-tax-payer-name'
									String lLocatorTaxDeductionEditName=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditName)
									WebElement lElementTaxDeductionEditName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditName)
									if(!lElementTaxDeductionEditName){
										lTagTaxDeductionEditName='edit-tax-payer-firstname'
										lLocatorTaxDeductionEditName=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditName)
										lElementTaxDeductionEditName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditName)
									}
									if(!lElementTaxDeductionEditName){
										lIsPolicyDetailTaxDeductionResult=false
									}else{
										lMenuPolicyDetailTaxDeductionEditName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditName)
										String lTagTaxDeductionEditSurname='edit-tax-payer-last-name'
										String lLocatorTaxDeductionEditSurname=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditSurname)
										WebElement lElementTaxDeductionEditSurname=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditSurname)
										if(lElementTaxDeductionEditSurname){
											lMenuPolicyDetailTaxDeductionEditSurname=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditSurname,lMenuPolicyDetailTaxDeductionEditSurname)
											lMenuPolicyDetailTaxDeductionEditName=IGNUemaHelper.concatMessageLeftRightByPipe(lMenuPolicyDetailTaxDeductionEditName,lMenuPolicyDetailTaxDeductionEditSurname)
										}
									}
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lMenuPolicyDetailTaxDeductionEditName
									String lTagTaxDeductionEditIdentificationNumber='edit-tax-payer-id'
									String lLocatorTaxDeductionEditIdentificationNumber=IGNUemaHelper.getTagDataSeleniumValueEqual(lTagTaxDeductionEditIdentificationNumber)
									WebElement lElementTaxDeductionEditIdentificationNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionEditIdentificationNumber)
									if(!lElementTaxDeductionEditIdentificationNumber){
										lIsPolicyDetailTaxDeductionResult=false
									}
									if(lMenuPolicyDetailTaxDeductionEditIdentificationNumber.length()<=0){
										Boolean lIsPolicyDetailTaxDeductionEditHolderIsThai=IGNUemaHelper.convertStringToBoolean(lTaxDeductionEditHolderIsThaiItemValue)
										if(lIsPolicyDetailTaxDeductionEditHolderIsThai){
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.randomIDThaiOrPassportNumber(true,true)
										}else{
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.randomIDThaiOrPassportNumber(true,true)
											lMenuPolicyDetailTaxDeductionEditIdentificationNumber=lMenuPolicyDetailTaxDeductionEditIdentificationNumber.substring(3,lMenuPolicyDetailTaxDeductionEditIdentificationNumber.length())
										}
									}
									lMenuPolicyDetailTaxDeductionEditIdentificationNumber=IGNUemaHelper.typeTextByWebElement(this.driver,lElementTaxDeductionEditIdentificationNumber,lMenuPolicyDetailTaxDeductionEditIdentificationNumber)
									lPolicyDetailTaxDeductionDetail=lPolicyDetailTaxDeductionDetail+'\n'+lMenuPolicyDetailTaxDeductionEditIdentificationNumber
								}
								String lTagTaxDeductionSubmitButton='tax-submit-button'
								String lLocatorTaxDeductionSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionSubmitButton)
								WebElement lElementTaxDeductionSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionSubmitButton)
								if(!lElementTaxDeductionSubmitButton){
									lIsPolicyDetailTaxDeductionResult=false
								}
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionSubmitButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionSubmitButton)
								this.waitUntilLoaded()
								String lTagTaxDeductionConfirmFormDisplayed=''
								String lLocatorTaxDeductionConfirmFormDisplayed='#tax-completed'
								Boolean lIsTaxDeductionConfirmFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionConfirmFormDisplayed)
								if(!lIsTaxDeductionConfirmFormDisplayed){
									lIsPolicyDetailTaxDeductionResult=false
								}
							}else{
								String lTagTaxDeductionConfirmFormDisplayed=''
								String lLocatorTaxDeductionConfirmFormDisplayed='#tax-disclaim'
								Boolean lIsTaxDeductionConfirmFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorTaxDeductionConfirmFormDisplayed)
								if(!lIsTaxDeductionConfirmFormDisplayed){
									lIsPolicyDetailTaxDeductionResult=false
								}
							}
							String lTagTaxDeductionConfirmButton='tax-confirm-button'
							String lLocatorTaxDeductionConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagTaxDeductionConfirmButton)
							WebElement lElementTaxDeductionConfirmButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTaxDeductionConfirmButton)
							if(!lElementTaxDeductionConfirmButton){
								lIsPolicyDetailTaxDeductionResult=false
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementTaxDeductionConfirmButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementTaxDeductionConfirmButton)
							this.waitUntilLoaded()
						}
						break
					case '4':
						lIsMenuPolicyDetailTaxDeductionToDo=false
						break
					case '5':
						lIsMenuPolicyDetailTaxDeductionToDo=false
						break
					default:
						lIsMenuPolicyDetailTaxDeductionToDo=false
						break
				}
			}
			if(!lIsMenuPolicyDetailTaxDeductionToDo){
				lResult=lPolicyDetailTaxDeductionToDo.length()>0
			}else{
				if(lIsPolicyDetailTaxDeductionResult){
					lPolicyDetailTaxDeductionResult='Passed'
				}
				lResult=lPolicyDetailTaxDeductionResult.length()>0
			}
			if(lResult){
				lreturn.put('PolicyDetailTaxDeductionToDo',lPolicyDetailTaxDeductionToDo)
				lreturn.put('PolicyDetailTaxDeductionDetail',lPolicyDetailTaxDeductionDetail)
				lreturn.put('PolicyDetailTaxDeductionResult',lPolicyDetailTaxDeductionResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessPolicyDetailECareCardToDo(String strPolicyCardProductType,Boolean isMenuPolicyECareCardDetailToDo){
		Map lreturn=[:]
		String lPolicyCardProductTypeStr=strPolicyCardProductType
		Boolean lIsMenuPolicyDetailECareCardToDo=isMenuPolicyECareCardDetailToDo
		String lPolicyDetailECareCardToDo=''
		String lPolicyDetailECareCardDetail=''
		String lPolicyDetailECareCardResult=''
		Map lMapPolicyCardProductTypeList=['ProductMotor':'1','Cancer':'2','CriticalIllness':'3','PersonalAccident':'4','Covid':'5']
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetailECareCardToDo','')
			lreturn.put('PolicyDetailECareCardDetail','')
			lreturn.put('PolicyDetailECareCardResult','')
			lreturn.put('Result',lResult)
			Boolean lIsPolicyDetailECareCardResult=true
			String lPolicyCardProductTypeItem=lMapPolicyCardProductTypeList.get(lPolicyCardProductTypeStr)
			if(!lPolicyCardProductTypeItem){
				return lreturn
			}
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(!lElementMenuPolicyButton){
				return lreturn
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
				this.waitUntilLoaded()
			}
			switch(lPolicyCardProductTypeItem){
				case '2':
					lIsMenuPolicyDetailECareCardToDo=false
					break
				case '3':
					lIsMenuPolicyDetailECareCardToDo=false
					break
				case '4':
					break
				case '5':
					break
				default:
					lIsMenuPolicyDetailECareCardToDo=false
					break
			}
			String lTagPolicyDetailECareCardItem=''
			String lLocatorPolicyDetailECareCardItem=''
			List<WebElement> lElementPolicyDetailECareCardList=[]
			switch(lPolicyCardProductTypeItem){
				case '2':
					lTagPolicyDetailECareCardItem=this.CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_CANCER
					break
				case '3':
					lTagPolicyDetailECareCardItem=this.CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_CRITICAL_ILLNESS
					break
				case '4':
					lTagPolicyDetailECareCardItem=this.CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_PERSONAL_ACCIDENT
					break
				case '5':
					lTagPolicyDetailECareCardItem=this.CONST_TAG_MENU_POLICY_HEALTH_CARD_ITEM_COVID
					break
				default:
					lTagPolicyDetailECareCardItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_MAIN
					break
			}
			lPolicyDetailECareCardToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyDetailECareCardToDo)
			lLocatorPolicyDetailECareCardItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailECareCardItem)
			WebElement lElementPolicyDetailECareCardItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailECareCardItem)
			if(!lElementPolicyDetailECareCardItem){
				lIsMenuPolicyDetailECareCardToDo=false
				lPolicyDetailECareCardToDo='No Option'
			}else{
				Integer lPolicyDetailECareCardNumber=0
				String lTagPolicyDetailECareCardButton='button-eCard'
				String lLocatorPolicyDetailECareCardButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailECareCardButton)
				lElementPolicyDetailECareCardList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorPolicyDetailECareCardItem,lLocatorPolicyDetailECareCardButton))
				if(lElementPolicyDetailECareCardList){
					lPolicyDetailECareCardNumber=lElementPolicyDetailECareCardList.size()
				}
				if(lPolicyDetailECareCardNumber<=0){
					lIsMenuPolicyDetailECareCardToDo=false
					lPolicyDetailECareCardToDo='No Option'
				}
			}
			if(lIsMenuPolicyDetailECareCardToDo){
				WebElement lElementPolicyPersonalAccidentDetailECareCardButton=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementPolicyDetailECareCardList)
				if(!lElementPolicyPersonalAccidentDetailECareCardButton){
					return lreturn
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyPersonalAccidentDetailECareCardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyPersonalAccidentDetailECareCardButton)
					this.waitUntilLoaded()
					String lTagPolicyPersonalAccidentDetailECareCardModal='pa-eCard'
					String lLocatorPolicyPersonalAccidentDetailECareCardModal=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyPersonalAccidentDetailECareCardModal)
					Boolean lIsPolicyPersonalAccidentDetailECareCardModalDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPolicyPersonalAccidentDetailECareCardModal,20)
					lIsPolicyPersonalAccidentDetailECareCardModalDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorPolicyPersonalAccidentDetailECareCardModal)
					if(!lIsPolicyPersonalAccidentDetailECareCardModalDisplayed){
						return lreturn
					}
					if(lIsPolicyPersonalAccidentDetailECareCardModalDisplayed){
						String lTagPolicyPersonalAccidentDetailECareCardText=''
						String lLocatorPolicyPersonalAccidentDetailECareCardText='.modal-body'
						lPolicyDetailECareCardDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorPolicyPersonalAccidentDetailECareCardText).trim()
						String lTagPolicyPersonalAccidentDetailECareCardButtonClose=''
						String lLocatorPolicyPersonalAccidentDetailECareCardButtonClose='#ecareModal button'
						WebElement lElementPolicyPersonalAccidentDetailECareCardButtonClose=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyPersonalAccidentDetailECareCardButtonClose)
						if(lElementPolicyPersonalAccidentDetailECareCardButtonClose){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyPersonalAccidentDetailECareCardButtonClose)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyPersonalAccidentDetailECareCardButtonClose)
							this.waitUntilLoaded()
						}
						lPolicyDetailECareCardResult='Passed'
					}
				}
			}
			if(!lIsMenuPolicyDetailECareCardToDo){
				lResult=lPolicyDetailECareCardToDo.length()>0
			}else{
				lResult=lPolicyDetailECareCardResult.length()>0
			}
			if(lResult){
				lreturn.put('PolicyDetailECareCardToDo',lPolicyDetailECareCardToDo)
				lreturn.put('PolicyDetailECareCardDetail',lPolicyDetailECareCardDetail)
				lreturn.put('PolicyDetailECareCardResult',lPolicyDetailECareCardResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapProductType(Integer indexOutputItem,Map mapProductType,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapProductType)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailCardSelectedProductName=''
		String lPolicyDetailCardSelectedId=''
		String lPolicyDetailCardSelectedDetail=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailCardSelectedProductName=mapProductType.PolicyDetailCardSelectedProductName
			lPolicyDetailCardSelectedId=mapProductType.PolicyDetailCardSelectedId
			lPolicyDetailCardSelectedDetail=mapProductType.PolicyDetailCardSelectedDetail
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedProductName',lPolicyDetailCardSelectedProductName)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedId',lPolicyDetailCardSelectedId)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailCardSelectedDetail',lPolicyDetailCardSelectedDetail)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapHistory(Integer indexOutputItem,Map mapHistory,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapHistory)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailHistoryToDo=''
		String lPolicyDetailHistoryDetail=''
		String lPolicyDetailAdditionalDetail=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailHistoryToDo=mapHistory.PolicyDetailHistoryToDo
			lPolicyDetailHistoryDetail=mapHistory.PolicyDetailHistoryDetail
			lPolicyDetailAdditionalDetail=mapHistory.PolicyDetailAdditionalDetail
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailHistoryToDo',lPolicyDetailHistoryToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailHistoryDetail',lPolicyDetailHistoryDetail)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailAdditionalDetail',lPolicyDetailAdditionalDetail)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapDocDownloadToDo(Integer indexOutputItem,Map mapDocDownloadToDo,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapDocDownloadToDo)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailDocDownloadToDo=''
		String lPolicyDetailDocDownloadDetail=''
		String lPolicyDetailDocDownloadResult=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailDocDownloadToDo=mapDocDownloadToDo.PolicyDetailDocDownloadToDo
			lPolicyDetailDocDownloadDetail=mapDocDownloadToDo.PolicyDetailDocDownloadDetail
			lPolicyDetailDocDownloadResult=mapDocDownloadToDo.PolicyDetailDocDownloadResult
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailDocDownloadToDo',lPolicyDetailDocDownloadToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailDocDownloadDetail',lPolicyDetailDocDownloadDetail)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailDocDownloadResult',lPolicyDetailDocDownloadResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapDocDownloadOpenInsuranceHandbook(Integer indexOutputItem,Map mapDocDownloadOpenInsuranceHandbook,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapDocDownloadOpenInsuranceHandbook)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailDocDownloadOpenInsuranceHandbookToDo=''
		String lPolicyDetailDocDownloadInsuranceHandbook=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailDocDownloadOpenInsuranceHandbookToDo=mapDocDownloadOpenInsuranceHandbook.PolicyDetailDocDownloadOpenInsuranceHandbookToDo
			lPolicyDetailDocDownloadInsuranceHandbook=mapDocDownloadOpenInsuranceHandbook.PolicyDetailDocDownloadInsuranceHandbook
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailDocDownloadOpenInsuranceHandbookToDo',lPolicyDetailDocDownloadOpenInsuranceHandbookToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailDocDownloadInsuranceHandbook',lPolicyDetailDocDownloadInsuranceHandbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapPaymentToDo(Integer indexOutputItem,Map mapPaymentToDo,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapPaymentToDo)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailPaymentToDo=''
		String lPolicyDetailPaymentCardId=''
		String lPolicyDetailPaymentDetail=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailPaymentToDo=mapPaymentToDo.PolicyDetailPaymentToDo
			lPolicyDetailPaymentCardId=mapPaymentToDo.PolicyDetailPaymentCardId
			lPolicyDetailPaymentDetail=mapPaymentToDo.PolicyDetailPaymentDetail
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailPaymentToDo',lPolicyDetailPaymentToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailPaymentCardId',lPolicyDetailPaymentCardId)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailPaymentDetail',lPolicyDetailPaymentDetail)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapPaymentOpenTermAndCondition(Integer indexOutputItem,Map mapPaymentOpenTermAndCondition,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapPaymentOpenTermAndCondition)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailPaymentOpenTermAndConditionToDo=''
		String lPolicyDetailPaymentTermAndCondition=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailPaymentOpenTermAndConditionToDo=mapPaymentOpenTermAndCondition.PolicyDetailPaymentOpenTermAndConditionToDo
			lPolicyDetailPaymentTermAndCondition=mapPaymentOpenTermAndCondition.PolicyDetailPaymentTermAndCondition
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailPaymentOpenTermAndConditionToDo',lPolicyDetailPaymentOpenTermAndConditionToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailPaymentTermAndCondition',lPolicyDetailPaymentTermAndCondition)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapTaxDeduction(Integer indexOutputItem,Map mapTaxDeduction,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapTaxDeduction)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailTaxDeductionToDo=''
		String lPolicyDetailTaxDeductionDetail=''
		String lPolicyDetailTaxDeductionResult=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailTaxDeductionToDo=mapTaxDeduction.PolicyDetailTaxDeductionToDo
			lPolicyDetailTaxDeductionDetail=mapTaxDeduction.PolicyDetailTaxDeductionDetail
			lPolicyDetailTaxDeductionResult=mapTaxDeduction.PolicyDetailTaxDeductionResult
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailTaxDeductionToDo',lPolicyDetailTaxDeductionToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailTaxDeductionDetail',lPolicyDetailTaxDeductionDetail)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailTaxDeductionResult',lPolicyDetailTaxDeductionResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputFromMapECareCard(Integer indexOutputItem,Map mapECareCard,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapECareCard)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lPolicyDetailECareCardToDo=''
		String lPolicyDetailECareCardDetail=''
		String lPolicyDetailECareCardResult=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lPolicyDetailECareCardToDo=mapECareCard.PolicyDetailECareCardToDo
			lPolicyDetailECareCardDetail=mapECareCard.PolicyDetailECareCardDetail
			lPolicyDetailECareCardResult=mapECareCard.PolicyDetailECareCardResult
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailECareCardToDo',lPolicyDetailECareCardToDo)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailECareCardDetail',lPolicyDetailECareCardDetail)
			tartgetMap.put('PolicyItem'+lStrIndexOutputItem+'DetailECareCardResult',lPolicyDetailECareCardResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuPolicyCompulsoryBuyCardToDo(String strMenuPolicyCompulsoryBuyCardToDo){
		Map lreturn=[:]
		String lMenuPolicyCompulsoryBuyCardToDo=strMenuPolicyCompulsoryBuyCardToDo.trim()
		if(lMenuPolicyCompulsoryBuyCardToDo.length()<=0){
			lMenuPolicyCompulsoryBuyCardToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_POLICY_COMPULSORY_BUY_CARD_TO_DO
		}
		String lPolicyCompulsoryBuyCardId=''
		String lPolicyCompulsoryBuyCardDetail=''
		String lPolicyCompulsoryBuyPaymentDetail=''
		String lPolicyCompulsoryBuyPaymentResult=''
		try{
			Boolean lResult=false
			Boolean lIsOK=true
			lreturn.put('MenuPolicyCompulsoryBuyCardToDo','')
			lreturn.put('PolicyCompulsoryBuyCardId','')
			lreturn.put('PolicyCompulsoryBuyCardDetail','')
			lreturn.put('PolicyCompulsoryBuyPaymentDetail','')
			lreturn.put('PolicyCompulsoryBuyPaymentResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuPolicyCompulsoryBuyCardToDo=IGNUemaHelper.convertStringToBoolean(lMenuPolicyCompulsoryBuyCardToDo)
			lMenuPolicyCompulsoryBuyCardToDo=''
			lMenuPolicyCompulsoryBuyCardToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuPolicyCompulsoryBuyCardToDo)
			Boolean lIsPolicyCompulsoryBuyPaymentResult=false
			String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
			String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
			if(!lElementMenuPolicyButton){
				lIsMenuPolicyCompulsoryBuyCardToDo=false
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
				this.waitUntilLoaded()
			}
			String lTagMenuPolicyVehicle=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_ITEM_MAIN
			String lLocatorMenuPolicyVehicle=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuPolicyVehicle)
			String lTagPolicyVehicleCardList=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_LIST
			String lLocatorPolicyVehicleCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCardList)
			List<WebElement> lElementPolicyVehicleCardList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorMenuPolicyVehicle,lLocatorPolicyVehicleCardList))
			List<Integer> lPolicyVehicleCompulsoryCardList=new ArrayList<Integer>()
			WebElement lElementPolicyVehicleCompulsoryCardItem=null
			WebElement lElementPolicyVehicleCompulsoryCardItemOpenDetailButton=null
			WebElement lElementPolicyVehicleCompulsoryCardItemOpenDetailButton0=null
			WebElement lElementPolicyVehicleCompulsoryCardItemOpenDetailButton1=null
			WebElement lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton=null
			Integer lPolicyVehicleCompulsoryNumberOfCardNum=0
			Integer lPolicyVehicleCompulsoryCardItem=0
			if(lElementPolicyVehicleCardList){
				lPolicyVehicleCompulsoryNumberOfCardNum=lElementPolicyVehicleCardList.size()
			}
			if(lPolicyVehicleCompulsoryNumberOfCardNum<=0){
				lIsMenuPolicyCompulsoryBuyCardToDo=false
				lMenuPolicyCompulsoryBuyCardToDo='No Option'
			}else{
				Integer lIndexPolicyVehicleCompulsory=0
				for(lIndexPolicyVehicleCompulsory=0;lIndexPolicyVehicleCompulsory<lPolicyVehicleCompulsoryNumberOfCardNum;lIndexPolicyVehicleCompulsory++){
					List<WebElement> lElementPolicyVehicleCardItemTagAList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyVehicleCardList[lIndexPolicyVehicleCompulsory],'a')
					if(lElementPolicyVehicleCardItemTagAList){
						if(lElementPolicyVehicleCardItemTagAList.size()>1){
							WebElement lElementPolicyVehicleCardItemTagAItem=lElementPolicyVehicleCardItemTagAList[1]
							String lStrPolicyVehicleCardItemText=lElementPolicyVehicleCardItemTagAItem.getText()
							lStrPolicyVehicleCardItemText=lStrPolicyVehicleCardItemText.toUpperCase().trim()
							if(lStrPolicyVehicleCardItemText.length()>0){
								if(lStrPolicyVehicleCardItemText.contains('COMPULSORY')){
									lPolicyVehicleCompulsoryCardList.add(lIndexPolicyVehicleCompulsory)
								}
								if(lStrPolicyVehicleCardItemText.contains('พ.ร.บ.')){
									lPolicyVehicleCompulsoryCardList.add(lIndexPolicyVehicleCompulsory)
								}
							}
						}
					}
				}
			}
			if(lPolicyVehicleCompulsoryCardList.size()<=0){
				lIsMenuPolicyCompulsoryBuyCardToDo=false
				lMenuPolicyCompulsoryBuyCardToDo='No Option'
			}
			if(lIsMenuPolicyCompulsoryBuyCardToDo){
				lPolicyVehicleCompulsoryCardItem=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lPolicyVehicleCompulsoryCardList)
				List<WebElement> lElementPolicyVehicleCompulsoryCardItemTagAList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyVehicleCardList[lPolicyVehicleCompulsoryCardItem],'a')
				if(lElementPolicyVehicleCompulsoryCardItemTagAList){
					if(lElementPolicyVehicleCompulsoryCardItemTagAList.size()>1){
						lElementPolicyVehicleCompulsoryCardItemOpenDetailButton=lElementPolicyVehicleCompulsoryCardItemTagAList[0]
						lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton=lElementPolicyVehicleCompulsoryCardItemTagAList[1]
					}
				}
				lElementPolicyVehicleCompulsoryCardItemOpenDetailButton0=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementPolicyVehicleCompulsoryCardItemOpenDetailButton)
				lElementPolicyVehicleCompulsoryCardItemOpenDetailButton1=IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementPolicyVehicleCompulsoryCardItemOpenDetailButton0)
				lPolicyCompulsoryBuyCardId=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyVehicleCompulsoryCardItemOpenDetailButton1)
				lPolicyCompulsoryBuyCardDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleCardList[lPolicyVehicleCompulsoryCardItem]).trim()
				if(lElementPolicyVehicleCompulsoryCardItemOpenDetailButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCompulsoryCardItemOpenDetailButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCompulsoryCardItemOpenDetailButton)
					this.waitUntilLoaded()
					String lTagPolicyVehicleCompulsoryCardDetailItem=this.CONST_TAG_MENU_POLICY_VEHICLE_CARD_DETAIL_LIST
					String lLocatorPolicyVehicleCompulsoryCardDetailItem=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCompulsoryCardDetailItem)
					WebElement lElementPolicyVehicleCompulsoryCardDetailItem=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyVehicleCompulsoryCardDetailItem)
					if(!lElementPolicyVehicleCompulsoryCardDetailItem){
						lIsOK=false
					}else{
						lPolicyCompulsoryBuyPaymentDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPolicyVehicleCompulsoryCardDetailItem).trim()
						THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_VEHICLE_OPPORTUNITY_NUMBER=lPolicyCompulsoryBuyPaymentDetail
						String lTagPolicyVehicleCompulsoryCardDetailItemHistoryButton=this.CONST_TAG_MENU_POLICY_VEHICLE_BUTTON_HISTORY
						String lLocatorPolicyVehicleCompulsoryCardDetailItemHistoryButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyVehicleCompulsoryCardDetailItemHistoryButton)
						WebElement lElementPolicyVehicleCompulsoryCardDetailItemHistoryButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPolicyVehicleCompulsoryCardDetailItem,lTagPolicyVehicleCompulsoryCardDetailItemHistoryButton)
						if(lElementPolicyVehicleCompulsoryCardDetailItemHistoryButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCompulsoryCardDetailItemHistoryButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCompulsoryCardDetailItemHistoryButton)
							this.waitUntilLoaded()
							lPolicyCompulsoryBuyPaymentDetail=lPolicyCompulsoryBuyPaymentDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleCompulsoryCardDetailItem)
						}else{
							lPolicyCompulsoryBuyPaymentDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleCompulsoryCardDetailItem)
						}
						lPolicyCompulsoryBuyPaymentDetail=lPolicyCompulsoryBuyPaymentDetail.trim()
					}
					WebUI.back()
					this.waitUntilLoaded()
				}
				lElementPolicyVehicleCardList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorMenuPolicyVehicle,lLocatorPolicyVehicleCardList))
				lElementPolicyVehicleCompulsoryCardItemTagAList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementPolicyVehicleCardList[lPolicyVehicleCompulsoryCardItem],'a')
				if(lElementPolicyVehicleCompulsoryCardItemTagAList){
					if(lElementPolicyVehicleCompulsoryCardItemTagAList.size()>1){
						lElementPolicyVehicleCompulsoryCardItemOpenDetailButton=lElementPolicyVehicleCompulsoryCardItemTagAList[0]
						lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton=lElementPolicyVehicleCompulsoryCardItemTagAList[1]
					}
				}
				if(lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPolicyVehicleCompulsoryCardItemBuyCompulsoryButton)
					this.waitUntilLoaded()
					String lLocatorMakePaymentForm='#make-payment-modal'
					Boolean lIsMakePaymentFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorMakePaymentForm)
					if(lIsMakePaymentFormDisplayed){
						String lTagPolicyVehicleCompulsoryBuyProductStartDate=''
						String lLocatorPolicyVehicleCompulsoryBuyProductStartDate=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#product-start-date')
						WebElement lElementPolicyVehicleCompulsoryBuyProductStartDate=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyVehicleCompulsoryBuyProductStartDate)
						if(lElementPolicyVehicleCompulsoryBuyProductStartDate){
							String lStrPolicyVehicleCompulsoryBuyProductStartDate=IGNUemaHelper.getStringCurrentDateSlashDDMMYYYY()
							lStrPolicyVehicleCompulsoryBuyProductStartDate=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPolicyVehicleCompulsoryBuyProductStartDate,lStrPolicyVehicleCompulsoryBuyProductStartDate)
							lPolicyCompulsoryBuyPaymentDetail=lPolicyCompulsoryBuyPaymentDetail+'\nCompulsory Start Date:'+lStrPolicyVehicleCompulsoryBuyProductStartDate
						}
						String lTagCreditCardNumberInput=''
						String lLocatorCreditCardNumberInput=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-number')
						WebElement lElementCreditCardNumberInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCreditCardNumberInput)
						if(lElementCreditCardNumberInput){
							String lCreditCardNumberText='3530111333300000'
							lCreditCardNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardNumberInput,lCreditCardNumberText)
						}
						String lTagCardHolderNameInput=''
						String lLocatorCardHolderNameInput=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-name')
						WebElement lElementCardHolderNameInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardHolderNameInput)
						if(lElementCardHolderNameInput){
							String lCardHolderNameText='MyAccount CompulsoryBuy'
							lCardHolderNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardHolderNameInput,lCardHolderNameText)
						}
						String lTagSelectCcExpiryMonth=''
						String lLocatorSelectCcExpiryMonth=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-exp-month')
						WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSelectCcExpiryMonth)
						if(lElementSelectCcExpiryMonth){
							String lCcExpiryMonthText='12'
							Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
							lSelectCcExpiryMonth.selectByVisibleText(lCcExpiryMonthText)
							WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
							lCcExpiryMonthText=lElementSelectCcExpiryMonthSelected.getText()
						}
						String lTagSelectCcExpiryYear=''
						String lLocatorSelectCcExpiryYear=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-exp-year')
						WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSelectCcExpiryYear)
						if(lElementSelectCcExpiryYear){
							String lCcExpiryYearText='2027'
							Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
							lSelectCcExpiryYear.selectByVisibleText(lCcExpiryYearText)
							WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
							lCcExpiryYearText=lElementSelectCcExpiryYearSelected.getText()
						}
						String lTagCreditCardCvvNumberInput=''
						String lLocatorCreditCardCvvNumberInput=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-cvv')
						WebElement lElementCreditCardCvvNumberInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCreditCardCvvNumberInput)
						if(lElementCreditCardCvvNumberInput){
							String lCreditCardCvvNumberText='432'
							lCreditCardCvvNumberText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCreditCardCvvNumberInput,lCreditCardCvvNumberText)
						}
						String lTagCardBankNameInput=''
						String lLocatorCardBankNameInput=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#card-bank')
						WebElement lElementCardBankNameInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCardBankNameInput)
						if(lElementCardBankNameInput){
							String lCardBankNameText='MyAccount CompulsoryBank'
							lCardBankNameText=IGNUemaHelper.typeTextByWebElement(this.driver,lElementCardBankNameInput,lCardBankNameText)
						}
						String lTagVehicleCompulsoryBuyEPolicyCheckbox=''
						String lLocatorVehicleCompulsoryBuyEPolicyCheckbox=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'#js-selected-e-policy')
						WebElement lElementVehicleCompulsoryBuyEPolicyCheckbox=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorVehicleCompulsoryBuyEPolicyCheckbox)
						if(lElementVehicleCompulsoryBuyEPolicyCheckbox){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementVehicleCompulsoryBuyEPolicyCheckbox)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementVehicleCompulsoryBuyEPolicyCheckbox)
						}
						String lTagPolicyVehicleCompulsoryBuyProductPrice=''
						String lLocatorPolicyVehicleCompulsoryBuyProductPrice=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'.clr-orange')
						WebElement lElementPolicyVehicleCompulsoryBuyProductPrice=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPolicyVehicleCompulsoryBuyProductPrice)
						if(lElementPolicyVehicleCompulsoryBuyProductPrice){
							String lStrPolicyVehicleCompulsoryBuyProductPrice=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyVehicleCompulsoryBuyProductPrice).trim()
							lPolicyCompulsoryBuyPaymentDetail=lPolicyCompulsoryBuyPaymentDetail+'\nCompulsory Price:'+lStrPolicyVehicleCompulsoryBuyProductPrice
						}
						String lTagVehicleCompulsoryBuySubmitButton=''
						String lLocatorVehicleCompulsoryBuySubmitButton=IGNUemaHelper.concatCssLocatorParentChild(lLocatorMakePaymentForm,'.modal-footer .btn-orange')
						WebElement lElementVehicleCompulsoryBuySubmitButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorVehicleCompulsoryBuySubmitButton)
						if(lElementVehicleCompulsoryBuySubmitButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementVehicleCompulsoryBuySubmitButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementVehicleCompulsoryBuySubmitButton)
							this.waitUntilLoaded()
						}
						if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorMakePaymentForm)){
							IGNUemaHelper.delayThreadSecond(1)
							if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorMakePaymentForm)){
								IGNUemaHelper.delayThreadSecond(3)
							}
						}
						Boolean lIsVehicleCompulsoryBuyCompleteFormModalNotDisplayed=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorMakePaymentForm,10)
						if(lIsVehicleCompulsoryBuyCompleteFormModalNotDisplayed){
							IGNUemaHelper.delayThreadSecond(1)
							String lTagVehicleCompulsoryBuyCompleteFormDismiss='info-modal-1'
							String lLocatorVehicleCompulsoryBuyCompleteFormDismiss=IGNUemaHelper.getTagDataSeleniumKey(lTagVehicleCompulsoryBuyCompleteFormDismiss)
							WebElement lElementVehicleCompulsoryBuyCompleteFormDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagVehicleCompulsoryBuyCompleteFormDismiss)
							if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorVehicleCompulsoryBuyCompleteFormDismiss)){
								IGNUemaHelper.delayThreadSecond(1)
								if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorVehicleCompulsoryBuyCompleteFormDismiss)){
									IGNUemaHelper.delayThreadSecond(3)
								}
							}
							Boolean lIsVehicleCompulsoryBuyCompleteFormDismissDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorVehicleCompulsoryBuyCompleteFormDismiss,20)
							lElementVehicleCompulsoryBuyCompleteFormDismiss=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagVehicleCompulsoryBuyCompleteFormDismiss)
							if(!lElementVehicleCompulsoryBuyCompleteFormDismiss){
								lIsVehicleCompulsoryBuyCompleteFormDismissDisplayed=false
							}
							if(lIsVehicleCompulsoryBuyCompleteFormDismissDisplayed){
								String lTagCardChangeDismissButton='info-modal-1-submit'
								String lLocatorCardChangeDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCardChangeDismissButton)
								WebElement lElementCardChangeDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementVehicleCompulsoryBuyCompleteFormDismiss,lTagCardChangeDismissButton)
								if(lElementCardChangeDismissButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementCardChangeDismissButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCardChangeDismissButton)
									IGNUemaHelper.delayThreadSecond(1)
									Boolean lIsDoneVehicleCompulsoryBuyComplete=this.waitUntilLoaded()
									lIsPolicyCompulsoryBuyPaymentResult=lIsDoneVehicleCompulsoryBuyComplete
								}
							}
						}
					}
				}
			}
			if(!lIsMenuPolicyCompulsoryBuyCardToDo){
				lResult=lMenuPolicyCompulsoryBuyCardToDo.length()>0
			}else{
				if(lIsPolicyCompulsoryBuyPaymentResult){
					lPolicyCompulsoryBuyPaymentResult='Passed'
				}
				lResult=lPolicyCompulsoryBuyPaymentResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuPolicyCompulsoryBuyCardToDo',lMenuPolicyCompulsoryBuyCardToDo)
				lreturn.put('PolicyCompulsoryBuyCardId',lPolicyCompulsoryBuyCardId)
				lreturn.put('PolicyCompulsoryBuyCardDetail',lPolicyCompulsoryBuyCardDetail)
				lreturn.put('PolicyCompulsoryBuyPaymentDetail',lPolicyCompulsoryBuyPaymentDetail)
				lreturn.put('PolicyCompulsoryBuyPaymentResult',lPolicyCompulsoryBuyPaymentResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuDocDownloadToDo(String strMenuDocDownloadToDo){
		Map lreturn=[:]
		String lMenuDocDownloadToDo=strMenuDocDownloadToDo.trim()
		if(lMenuDocDownloadToDo.length()<=0){
			lMenuDocDownloadToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_DOC_DOWNLOAD_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('MenuDocDownloadToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuDocDownloadToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadToDo)
			if(lIsMenuDocDownloadToDo){
				String lTagMenuPolicyButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuPolicyButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_POLICY
				String lLocatorMenuPolicyButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
				WebElement lElementMenuPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuPolicyButtonKey,lTagMenuPolicyButtonValue)
				if(lElementMenuPolicyButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuPolicyButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuPolicyButton)
					this.waitUntilLoaded()
				}
				String lTagMenuDocDownloadButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuDocDownloadButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_DOC_DOWNLOAD
				String lLocatorMenuDocDownloadButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuDocDownloadButtonKey,lTagMenuDocDownloadButtonValue)
				WebElement lElementMenuDocDownloadButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuDocDownloadButtonKey,lTagMenuDocDownloadButtonValue)
				if(!lElementMenuDocDownloadButton){
					lIsMenuDocDownloadToDo=false
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuDocDownloadButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuDocDownloadButton)
					this.waitUntilLoaded()
					String lTagErrorModalForm='error-modal'
					String lLocatorErrorModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagErrorModalForm)
					WebElement lElementErrorModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagErrorModalForm)
					if(lElementErrorModalForm){
						Boolean lErrorModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByElementJs(this.driver,lElementErrorModalForm)
						if(lErrorModalFormDisplayed){
							String lTagErrorModalFormClose='error-modal-close'
							String lLocatorErrorModalFormClose=IGNUemaHelper.getTagDataSeleniumKey(lTagErrorModalFormClose)
							WebElement lElementErrorModalFormClose=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagErrorModalFormClose)
							if(lElementErrorModalForm){
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementErrorModalFormClose)
								this.waitUntilLoaded()
							}
							return lreturn
						}
					}
				}
			}
			lMenuDocDownloadToDo=IGNUemaHelper.convertBooleanToString(lIsMenuDocDownloadToDo)
			lResult=lMenuDocDownloadToDo.length()>0
			if(lResult){
				lreturn.put('MenuDocDownloadToDo',lMenuDocDownloadToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuDocDownloadOpenInsuranceHandbook(String strMenuDocDownloadOpenInsuranceHandbook){
		Map lreturn=[:]
		String lMenuDocDownloadOpenInsuranceHandbook=strMenuDocDownloadOpenInsuranceHandbook.trim()
		if(lMenuDocDownloadOpenInsuranceHandbook.length()<=0){
			lMenuDocDownloadOpenInsuranceHandbook=THAMyAccountNewbizMainType.DEFAULT_MENU_DOC_DOWNLOAD_OPEN_INSURANCE_HANDBOOK
		}
		String lDocDownloadInsuranceHandbook=''
		try{
			Boolean lResult=false
			lreturn.put('MenuDocDownloadOpenInsuranceHandbook','')
			lreturn.put('DocDownloadInsuranceHandbook','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuDocDownloadOpenInsuranceHandbook=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadOpenInsuranceHandbook)
			if(lIsMenuDocDownloadOpenInsuranceHandbook){
				String lTagOpenInsuranceHandbookButton=this.CONST_TAG_MENU_DOC_DOWNLOAD_BUTTON_INSURACE_HANDBOOK
				String lLocatorOpenInsuranceHandbookButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOpenInsuranceHandbookButton)
				WebElement lElementOpenInsuranceHandbookButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpenInsuranceHandbookButton)
				if(!lElementOpenInsuranceHandbookButton){
					lIsMenuDocDownloadOpenInsuranceHandbook=false
				}
				if(lIsMenuDocDownloadOpenInsuranceHandbook){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementOpenInsuranceHandbookButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOpenInsuranceHandbookButton)
					String lMainWindow=this.driver.getWindowHandle()
					IGNUemaHelper.delayThreadSecond(3)
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
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
						for(String lWindowHandle:lSetWinHandle){
							if(!lMainWindow.equals(lWindowHandle)){
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(1)
								lDocDownloadInsuranceHandbook='Passed'
								this.driver.close()
								WebUI.switchToDefaultContent()
								this.driver.switchTo().window(lMainWindow)
							}
						}
					}catch(Exception ex){
						try{
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lMenuDocDownloadOpenInsuranceHandbook=IGNUemaHelper.convertBooleanToString(lIsMenuDocDownloadOpenInsuranceHandbook)
			if(!lIsMenuDocDownloadOpenInsuranceHandbook){
				lResult=lMenuDocDownloadOpenInsuranceHandbook.length()>0
			}else{
				lResult=lDocDownloadInsuranceHandbook.length()>0
			}
			if(lResult){
				lreturn.put('MenuDocDownloadOpenInsuranceHandbook',lMenuDocDownloadOpenInsuranceHandbook)
				lreturn.put('DocDownloadInsuranceHandbook',lDocDownloadInsuranceHandbook)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuDocDownloadCardToDo(String strMenuDocDownloadCardToDo){
		Map lreturn=[:]
		String lMenuDocDownloadCardToDo=strMenuDocDownloadCardToDo.trim()
		if(lMenuDocDownloadCardToDo.length()<=0){
			lMenuDocDownloadCardToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_DOC_DOWNLOAD_CARD_TO_DO
		}
		String lDocDownloadCardSelectedId=''
		String lDocDownloadCardSelectedDetail=''
		String lDocDownloadCardSelectedResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuDocDownloadCardToDo','')
			lreturn.put('DocDownloadCardSelectedId','')
			lreturn.put('DocDownloadCardSelectedDetail','')
			lreturn.put('DocDownloadCardSelectedResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuDocDownloadCardToDo=IGNUemaHelper.convertStringToBoolean(lMenuDocDownloadCardToDo)
			Boolean lIsDocDownloadResult=true
			String lTagMenuDocDownloadCardListkey=this.CONST_TAG_MENU_DOC_DOWNLOAD_CARD_LIST
			String lLocatorMenuDocDownloadCardList=IGNUemaHelper.getTagDataSeleniumKey(lTagMenuDocDownloadCardListkey)
			List<WebElement> lElementMenuDocDownloadCardList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagMenuDocDownloadCardListkey)
			WebElement lElementMenuDocDownloadCardItem=null
			if(lElementMenuDocDownloadCardList){
				lElementMenuDocDownloadCardItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementMenuDocDownloadCardList)
			}
			if(!lElementMenuDocDownloadCardItem){
				lIsMenuDocDownloadCardToDo=false
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuDocDownloadCardItem)
				String lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMenuDocDownloadCardItem)
				THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
				lDocDownloadCardSelectedId=lOpportunityNumber
			}
			String lTagMenuDocDownloadCardDetailValue=lDocDownloadCardSelectedId
			String lLocatorMenuDocDownloadCardDetail=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuDocDownloadCardListkey,lTagMenuDocDownloadCardDetailValue)
			WebElement lElementDocDownloadCardDetail=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuDocDownloadCardListkey,lTagMenuDocDownloadCardDetailValue)
			if(!lElementDocDownloadCardDetail){
				lIsMenuDocDownloadCardToDo=false
			}else{
				lDocDownloadCardSelectedDetail=lDocDownloadCardSelectedId+'\n'
				lDocDownloadCardSelectedDetail=lDocDownloadCardSelectedDetail+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementDocDownloadCardDetail).trim()
			}
			if(lElementDocDownloadCardDetail){
				List<WebElement> lElementDetailDocDownloadList=IGNUemaHelper.getChildWebElementListOfWebElement(this.driver,lElementDocDownloadCardDetail,'a')
				if(lElementDetailDocDownloadList){
					if(lElementDetailDocDownloadList.size()>0){
						Boolean lIsOK=false
						for(WebElement lElementDocDownloadItem in lElementDetailDocDownloadList){
							if(lElementDocDownloadItem){
								lIsOK=false
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementDocDownloadItem)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDocDownloadItem)
								String lMainWindow=this.driver.getWindowHandle()
								IGNUemaHelper.delayThreadSecond(3)
								if(!this.waitUntilLoaded()){
									this.waitUntilLoaded()
								}
								if(!this.waitUntilLoaded()){
									this.waitUntilLoaded()
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
									for(String lWindowHandle:lSetWinHandle){
										if(!lMainWindow.equals(lWindowHandle)){
											this.driver.switchTo().window(lWindowHandle)
											IGNUemaHelper.delayThreadSecond(1)
											lIsOK=true
											this.driver.close()
											WebUI.switchToDefaultContent()
											this.driver.switchTo().window(lMainWindow)
										}
									}
								}catch(Exception ex){
									try{
										WebUI.switchToDefaultContent()
										this.driver.switchTo().window(lMainWindow)
									}catch(Exception exx){
										this.driver.switchTo().window(lMainWindow)
									}
								}
								IGNUemaHelper.delayThreadSecond(1)
								lIsDocDownloadResult=lIsDocDownloadResult&&lIsOK
							}
						}
					}
				}
			}
			lMenuDocDownloadCardToDo=IGNUemaHelper.convertBooleanToString(lIsMenuDocDownloadCardToDo)
			if(!lIsMenuDocDownloadCardToDo){
				lResult=lMenuDocDownloadCardToDo.length()>0
			}else{
				lResult=lIsDocDownloadResult
				if(lIsDocDownloadResult){
					lDocDownloadCardSelectedResult='Passed'
				}else{
					lDocDownloadCardSelectedResult='Failed'
				}
			}
			if(lResult){
				lreturn.put('MenuDocDownloadCardToDo',lMenuDocDownloadCardToDo)
				lreturn.put('DocDownloadCardSelectedId',lDocDownloadCardSelectedId)
				lreturn.put('DocDownloadCardSelectedDetail',lDocDownloadCardSelectedDetail)
				lreturn.put('DocDownloadCardSelectedResult',lDocDownloadCardSelectedResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportToDo(String strMenuContactSupportToDo){
		Map lreturn=[:]
		String lMenuContactSupportToDo=strMenuContactSupportToDo.trim()
		if(lMenuContactSupportToDo.length()<=0){
			lMenuContactSupportToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuContactSupportToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportToDo)
			if(lIsMenuContactSupportToDo){
				String lTagMenuContactSupportButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuContactSupportButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_CONTACT_SUPPORT
				String lLocatorMenuContactSupportButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuContactSupportButtonKey,lTagMenuContactSupportButtonValue)
				WebElement lElementMenContactSupportButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuContactSupportButtonKey,lTagMenuContactSupportButtonValue)
				if(!lElementMenContactSupportButton){
					lIsMenuContactSupportToDo=false
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenContactSupportButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenContactSupportButton)
					this.waitUntilLoaded()
				}
			}
			lMenuContactSupportToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportToDo)
			lResult=lMenuContactSupportToDo.length()>0
			if(lResult){
				lreturn.put('MenuContactSupportToDo',lMenuContactSupportToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map validateMenuContactSupportSubjectItem(String strMenuContactSupportSelectValue){
		Map lreturn=[:]
		String lMenuContactSupportSelectValue=strMenuContactSupportSelectValue.trim()
		try{
			Boolean lResult=false
			Integer lIndexSubject=0
			lreturn.put('IndexSubject',lIndexSubject)
			lreturn.put('Result',lResult)
			Boolean lFoundSubject=false
			def lOptionItemSubject=null
			String lOptionFindSubject=''
			Map lMenuContactSupportSubjectList=['1':'Report a claim','2':'Claim enquiry / Contact claim handler','3':'Vehicle assessment status enquiry','4':'Reimbursement status enquiry','5':'Delete Account','6':'Request policy documents']
			String lMenuContactSupportSubjectItem=lMenuContactSupportSubjectList.get(lMenuContactSupportSelectValue)
			if(!lMenuContactSupportSubjectItem){
				return lreturn
			}
			String lTagContactSupportSubjectButton=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_SELECT_SUBJECT
			String lLocatorContactSupportSubjectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportSubjectButton)
			WebElement lElementContactSupportSubjectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContactSupportSubjectButton)
			if(!lElementContactSupportSubjectButton){
				return lreturn
			}
			Select lSelectSubject=new Select(lElementContactSupportSubjectButton)
			def lOptionListSubject=lSelectSubject.getOptions()
			if(lOptionListSubject.size()<=0){
				return lreturn
			}else{
				for(Integer lOptionIndexSubject=0;lOptionIndexSubject<=lOptionListSubject.size()-1;lOptionIndexSubject++){
					lOptionItemSubject=lOptionListSubject.get(lOptionIndexSubject)
					lOptionFindSubject=lOptionItemSubject.getAttribute('value')
					if(lOptionFindSubject.contains(lMenuContactSupportSubjectItem)){
						lFoundSubject=true
						lIndexSubject=lOptionIndexSubject
						break
					}
				}
				lResult=lFoundSubject
			}
			if(lResult){
				lreturn.put('IndexSubject',lIndexSubject)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupport(Integer numItemIndex){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('ContactSupportDetail','')
			lreturn.put('Result',lResult)
			String lContactSupportDetail=''
			String lContactSupportResult=''
			Boolean lIsContactSupportResult=false
			String lTagContactSupportSubjectButton=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_SELECT_SUBJECT
			String lLocatorContactSupportSubjectButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportSubjectButton)
			WebElement lElementContactSupportSubjectButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContactSupportSubjectButton)
			if(!lElementContactSupportSubjectButton){
				return lreturn
			}
			Select lSelectSubject=new Select(lElementContactSupportSubjectButton)
			lSelectSubject.selectByIndex(numItemIndex)
			WebElement lElementSelectSubjectSelected=lSelectSubject.getFirstSelectedOption()
			if(!lElementSelectSubjectSelected){
				return lreturn
			}
			lContactSupportDetail=lElementSelectSubjectSelected.getText().trim()+'|'
			String lTagContactSupportPolicy=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_SELECT_POLICY
			String lLocatorContactSupportPolicyButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportPolicy)
			WebElement lElementContactSupportPolicyButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContactSupportPolicy)
			if(lElementContactSupportPolicyButton){
				String lLocatorContactSupportPolicyOptionList=IGNUemaHelper.concatCssLocatorParentChild(lLocatorContactSupportPolicyButton,'option')
				List<WebElement> lElementContactSupportPolicyOptionList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorContactSupportPolicyOptionList)
				if(!lElementContactSupportPolicyOptionList){
					return lreturn
				}
				WebElement lElementContactSupportPolicyOptionItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementContactSupportPolicyOptionList)
				if(!lElementContactSupportPolicyOptionItem){
					return lreturn
				}
				String lStrPolicyFind=lElementContactSupportPolicyOptionItem.getText()
				Select lSelectPolicy=new Select(lElementContactSupportPolicyButton)
				lSelectPolicy.selectByVisibleText(lStrPolicyFind)
				lElementContactSupportPolicyOptionItem=lSelectPolicy.getFirstSelectedOption()
				if(!lElementContactSupportPolicyOptionItem){
					return lreturn
				}
				lContactSupportDetail=lContactSupportDetail+lElementContactSupportPolicyOptionItem.getText().trim()
			}
			String lStrDatetimeCurrent=IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS()
			lContactSupportDetail=lContactSupportDetail+'|'+lStrDatetimeCurrent
			String lTagContactSupportInputText=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_INPUT_MESSAGE
			String lLocatorContactSupportInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportInputText)
			WebElement lElementContactSupportInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContactSupportInputText)
			if(!lElementContactSupportInputText){
				return lreturn
			}
			lContactSupportDetail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementContactSupportInputText,lContactSupportDetail)
			String lTagContactSupportSubmitButton=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_BUTTON_SUBMIT
			String lLocatorContactSupportnSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportSubmitButton)
			WebElement lElementContactSupportSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagContactSupportSubmitButton)
			if(!lElementContactSupportSubmitButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementContactSupportSubmitButton)
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			String lTagFormSubmitComplete='info-modal-1'
			String lLocatorFormSubmitComplete=IGNUemaHelper.getTagDataSeleniumKey(lTagFormSubmitComplete)
			WebElement lElementFormSubmitComplete=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormSubmitComplete)
			Boolean lIsFormSubmitCompleteDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormSubmitComplete,10)
			lIsFormSubmitCompleteDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorFormSubmitComplete)
			lElementFormSubmitComplete=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagFormSubmitComplete)
			if(!lElementFormSubmitComplete){
				lIsFormSubmitCompleteDisplayed=false
			}
			if(lIsFormSubmitCompleteDisplayed){
				String lTagContactSupportSubmitCloseButton=this.CONST_TAG_MAIN_MENU_CONTACT_SUPPORT_BUTTON_SUBMIT_CLOSE
				String lLocatorContactSupportnSubmitCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagContactSupportSubmitCloseButton)
				WebElement lElementContactSupportSubmitCloseButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementFormSubmitComplete,lTagContactSupportSubmitCloseButton)
				if(!lElementContactSupportSubmitCloseButton){
					return lreturn
				}
				lIsContactSupportResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementContactSupportSubmitCloseButton)
				IGNUemaHelper.delayThreadSecond(1)
			}
			lResult=lIsContactSupportResult
			if(lResult){
				lreturn.put('ContactSupportDetail',lContactSupportDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectRenewalToDo(String strMenuContactSupportSubjectRenewalToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectRenewalToDo=strMenuContactSupportSubjectRenewalToDo.trim()
		if(lMenuContactSupportSubjectRenewalToDo.length()<=0){
			lMenuContactSupportSubjectRenewalToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_RENEWAL_TO_DO
		}
		String lContactSupportSubjectRenewalDetail=''
		String lContactSupportSubjectRenewalResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectRenewalToDo','')
			lreturn.put('ContactSupportSubjectRenewalDetail','')
			lreturn.put('ContactSupportSubjectRenewalResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='0'
			Boolean lIsMenuContactSupportSubjectRenewalToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectRenewalToDo)
			Boolean lIsContactSupportSubjectRenewalResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectRenewalToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectRenewalToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectRenewalDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectRenewalResult=lMapMenuContactSupport.Result
				lContactSupportSubjectRenewalResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectRenewalResult)
			}
			lMenuContactSupportSubjectRenewalToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectRenewalToDo)
			if(!lIsMenuContactSupportSubjectRenewalToDo){
				lResult=lMenuContactSupportSubjectRenewalToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectRenewalResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectRenewalToDo',lMenuContactSupportSubjectRenewalToDo)
				lreturn.put('ContactSupportSubjectRenewalDetail',lContactSupportSubjectRenewalDetail)
				lreturn.put('ContactSupportSubjectRenewalResult',lContactSupportSubjectRenewalResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectPolicyToDo(String strMenuContactSupportSubjectPolicyToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectPolicyToDo=strMenuContactSupportSubjectPolicyToDo.trim()
		if(lMenuContactSupportSubjectPolicyToDo.length()<=0){
			lMenuContactSupportSubjectPolicyToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_POLICY_TO_DO
		}
		String lContactSupportSubjectPolicyDetail=''
		String lContactSupportSubjectPolicyResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectPolicyToDo','')
			lreturn.put('ContactSupportSubjectPolicyDetail','')
			lreturn.put('ContactSupportSubjectPolicyResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='0'
			Boolean lIsMenuContactSupportSubjectPolicyToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectPolicyToDo)
			Boolean lIsContactSupportSubjectPolicyResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectPolicyToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectPolicyToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectPolicyDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectPolicyResult=lMapMenuContactSupport.Result
				lContactSupportSubjectPolicyResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectPolicyResult)
			}
			lMenuContactSupportSubjectPolicyToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectPolicyToDo)
			if(!lIsMenuContactSupportSubjectPolicyToDo){
				lResult=lMenuContactSupportSubjectPolicyToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectPolicyResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectPolicyToDo',lMenuContactSupportSubjectPolicyToDo)
				lreturn.put('ContactSupportSubjectPolicyDetail',lContactSupportSubjectPolicyDetail)
				lreturn.put('ContactSupportSubjectPolicyResult',lContactSupportSubjectPolicyResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectClaimToDo(String strMenuContactSupportSubjectClaimToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectClaimToDo=strMenuContactSupportSubjectClaimToDo.trim()
		if(lMenuContactSupportSubjectClaimToDo.length()<=0){
			lMenuContactSupportSubjectClaimToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_CLAIM_TO_DO
		}
		String lContactSupportSubjectClaimDetail=''
		String lContactSupportSubjectClaimResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectClaimToDo','')
			lreturn.put('ContactSupportSubjectClaimDetail','')
			lreturn.put('ContactSupportSubjectClaimResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='1'
			Boolean lIsMenuContactSupportSubjectClaimToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectClaimToDo)
			Boolean lIsContactSupportSubjectClaimResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectClaimToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectClaimToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectClaimDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectClaimResult=lMapMenuContactSupport.Result
				lContactSupportSubjectClaimResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectClaimResult)
			}
			lMenuContactSupportSubjectClaimToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectClaimToDo)
			if(!lIsMenuContactSupportSubjectClaimToDo){
				lResult=lMenuContactSupportSubjectClaimToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectClaimResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectClaimToDo',lMenuContactSupportSubjectClaimToDo)
				lreturn.put('ContactSupportSubjectClaimDetail',lContactSupportSubjectClaimDetail)
				lreturn.put('ContactSupportSubjectClaimResult',lContactSupportSubjectClaimResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectEnquiryClaimHandlerToDo(String strMenuContactSupportSubjectEnquiryClaimHandlerToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectEnquiryClaimHandlerToDo=strMenuContactSupportSubjectEnquiryClaimHandlerToDo.trim()
		if(lMenuContactSupportSubjectEnquiryClaimHandlerToDo.length()<=0){
			lMenuContactSupportSubjectEnquiryClaimHandlerToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_ENQUIRY_CLAIM_HANDLER_TO_DO
		}
		String lContactSupportSubjectEnquiryClaimHandlerDetail=''
		String lContactSupportSubjectEnquiryClaimHandlerResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectEnquiryClaimHandlerToDo','')
			lreturn.put('ContactSupportSubjectEnquiryClaimHandlerDetail','')
			lreturn.put('ContactSupportSubjectEnquiryClaimHandlerResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='2'
			Boolean lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectEnquiryClaimHandlerToDo)
			Boolean lIsContactSupportSubjectEnquiryClaimHandlerResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectEnquiryClaimHandlerDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectEnquiryClaimHandlerResult=lMapMenuContactSupport.Result
				lContactSupportSubjectEnquiryClaimHandlerResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectEnquiryClaimHandlerResult)
			}
			lMenuContactSupportSubjectEnquiryClaimHandlerToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo)
			if(!lIsMenuContactSupportSubjectEnquiryClaimHandlerToDo){
				lResult=lMenuContactSupportSubjectEnquiryClaimHandlerToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectEnquiryClaimHandlerResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectEnquiryClaimHandlerToDo',lMenuContactSupportSubjectEnquiryClaimHandlerToDo)
				lreturn.put('ContactSupportSubjectEnquiryClaimHandlerDetail',lContactSupportSubjectEnquiryClaimHandlerDetail)
				lreturn.put('ContactSupportSubjectEnquiryClaimHandlerResult',lContactSupportSubjectEnquiryClaimHandlerResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo(String strMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=strMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.trim()
		if(lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.length()<=0){
			lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_ENQUIRY_VEHICLE_ASSESSMENT_STATUS_TO_DO
		}
		String lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=''
		String lContactSupportSubjectEnquiryVehicleAssessmentStatusResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo','')
			lreturn.put('ContactSupportSubjectEnquiryVehicleAssessmentStatusDetail','')
			lreturn.put('ContactSupportSubjectEnquiryVehicleAssessmentStatusResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='3'
			Boolean lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo)
			Boolean lIsContactSupportSubjectEnquiryVehicleAssessmentStatusResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectEnquiryVehicleAssessmentStatusResult=lMapMenuContactSupport.Result
				lContactSupportSubjectEnquiryVehicleAssessmentStatusResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectEnquiryVehicleAssessmentStatusResult)
			}
			lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo)
			if(!lIsMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo){
				lResult=lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectEnquiryVehicleAssessmentStatusResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo',lMenuContactSupportSubjectEnquiryVehicleAssessmentStatusToDo)
				lreturn.put('ContactSupportSubjectEnquiryVehicleAssessmentStatusDetail',lContactSupportSubjectEnquiryVehicleAssessmentStatusDetail)
				lreturn.put('ContactSupportSubjectEnquiryVehicleAssessmentStatusResult',lContactSupportSubjectEnquiryVehicleAssessmentStatusResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectEnquiryReimbursementStatusToDo(String strMenuContactSupportSubjectEnquiryReimbursementStatusToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=strMenuContactSupportSubjectEnquiryReimbursementStatusToDo.trim()
		if(lMenuContactSupportSubjectEnquiryReimbursementStatusToDo.length()<=0){
			lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_ENQUIRY_REIMBURSEMENT_STATUS_TO_DO
		}
		String lContactSupportSubjectEnquiryReimbursementStatusDetail=''
		String lContactSupportSubjectEnquiryReimbursementStatusResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectEnquiryReimbursementStatusToDo','')
			lreturn.put('ContactSupportSubjectEnquiryReimbursementStatusDetail','')
			lreturn.put('ContactSupportSubjectEnquiryReimbursementStatusResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='4'
			Boolean lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectEnquiryReimbursementStatusToDo)
			Boolean lIsContactSupportSubjectEnquiryReimbursementStatusResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectEnquiryReimbursementStatusDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectEnquiryReimbursementStatusResult=lMapMenuContactSupport.Result
				lContactSupportSubjectEnquiryReimbursementStatusResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectEnquiryReimbursementStatusResult)
			}
			lMenuContactSupportSubjectEnquiryReimbursementStatusToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo)
			if(!lIsMenuContactSupportSubjectEnquiryReimbursementStatusToDo){
				lResult=lMenuContactSupportSubjectEnquiryReimbursementStatusToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectEnquiryReimbursementStatusResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectEnquiryReimbursementStatusToDo',lMenuContactSupportSubjectEnquiryReimbursementStatusToDo)
				lreturn.put('ContactSupportSubjectEnquiryReimbursementStatusDetail',lContactSupportSubjectEnquiryReimbursementStatusDetail)
				lreturn.put('ContactSupportSubjectEnquiryReimbursementStatusResult',lContactSupportSubjectEnquiryReimbursementStatusResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectDeleteAccountToDo(String strMenuContactSupportSubjectDeleteAccountToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectDeleteAccountToDo=strMenuContactSupportSubjectDeleteAccountToDo.trim()
		if(lMenuContactSupportSubjectDeleteAccountToDo.length()<=0){
			lMenuContactSupportSubjectDeleteAccountToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_DELETE_ACCOUNT_TO_DO
		}
		String lContactSupportSubjectDeleteAccountDetail=''
		String lContactSupportSubjectDeleteAccountResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectDeleteAccountToDo','')
			lreturn.put('ContactSupportSubjectDeleteAccountDetail','')
			lreturn.put('ContactSupportSubjectDeleteAccountResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='5'
			Boolean lIsMenuContactSupportSubjectDeleteAccountToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectDeleteAccountToDo)
			Boolean lIsContactSupportSubjectDeleteAccountResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectDeleteAccountToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectDeleteAccountToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectDeleteAccountDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectDeleteAccountResult=lMapMenuContactSupport.Result
				lContactSupportSubjectDeleteAccountResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectDeleteAccountResult)
			}
			lMenuContactSupportSubjectDeleteAccountToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectDeleteAccountToDo)
			if(!lIsMenuContactSupportSubjectDeleteAccountToDo){
				lResult=lMenuContactSupportSubjectDeleteAccountToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectDeleteAccountResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectDeleteAccountToDo',lMenuContactSupportSubjectDeleteAccountToDo)
				lreturn.put('ContactSupportSubjectDeleteAccountDetail',lContactSupportSubjectDeleteAccountDetail)
				lreturn.put('ContactSupportSubjectDeleteAccountResult',lContactSupportSubjectDeleteAccountResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuContactSupportSubjectRequestPolicyDocumentsToDo(String strMenuContactSupportSubjectRequestPolicyDocumentsToDo){
		Map lreturn=[:]
		String lMenuContactSupportSubjectRequestPolicyDocumentsToDo=strMenuContactSupportSubjectRequestPolicyDocumentsToDo.trim()
		if(lMenuContactSupportSubjectRequestPolicyDocumentsToDo.length()<=0){
			lMenuContactSupportSubjectRequestPolicyDocumentsToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CONTACT_SUPPORT_SUBJECT_REQUEST_POLICY_DOCUMENTS_TO_DO
		}
		String lContactSupportSubjectRequestPolicyDocumentsDetail=''
		String lContactSupportSubjectRequestPolicyDocumentsResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuContactSupportSubjectRequestPolicyDocumentsToDo','')
			lreturn.put('ContactSupportSubjectRequestPolicyDocumentsDetail','')
			lreturn.put('ContactSupportSubjectRequestPolicyDocumentsResult','')
			lreturn.put('Result',lResult)
			String lMenuContactSupportSubjectValue='6'
			Boolean lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo=IGNUemaHelper.convertStringToBoolean(lMenuContactSupportSubjectRequestPolicyDocumentsToDo)
			Boolean lIsContactSupportSubjectRequestPolicyDocumentsResult=false
			Integer lMenuContactSupportSubjectIndex=0
			Map lMapValidateMenuContactSupportSubjectItem=this.validateMenuContactSupportSubjectItem(lMenuContactSupportSubjectValue)
			lMenuContactSupportSubjectIndex=lMapValidateMenuContactSupportSubjectItem.IndexSubject
			lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo=lMapValidateMenuContactSupportSubjectItem.Result
			if(lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo){
				Map lMapMenuContactSupport=this.inputMenuContactSupport(lMenuContactSupportSubjectIndex)
				lContactSupportSubjectRequestPolicyDocumentsDetail=lMapMenuContactSupport.ContactSupportDetail
				lIsContactSupportSubjectRequestPolicyDocumentsResult=lMapMenuContactSupport.Result
				lContactSupportSubjectRequestPolicyDocumentsResult=IGNUemaHelper.convertBooleanToString(lIsContactSupportSubjectRequestPolicyDocumentsResult)
			}
			lMenuContactSupportSubjectRequestPolicyDocumentsToDo=IGNUemaHelper.convertBooleanToString(lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo)
			if(!lIsMenuContactSupportSubjectRequestPolicyDocumentsToDo){
				lResult=lMenuContactSupportSubjectRequestPolicyDocumentsToDo.length()>0
			}else{
				lResult=lIsContactSupportSubjectRequestPolicyDocumentsResult
			}
			if(lResult){
				lreturn.put('MenuContactSupportSubjectRequestPolicyDocumentsToDo',lMenuContactSupportSubjectRequestPolicyDocumentsToDo)
				lreturn.put('ContactSupportSubjectRequestPolicyDocumentsDetail',lContactSupportSubjectRequestPolicyDocumentsDetail)
				lreturn.put('ContactSupportSubjectRequestPolicyDocumentsResult',lContactSupportSubjectRequestPolicyDocumentsResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuClaimToDo(String strMenuClaimToDo){
		Map lreturn=[:]
		String lMenuClaimToDo=strMenuClaimToDo.trim()
		if(lMenuClaimToDo.length()<=0){
			lMenuClaimToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CLAIM_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('MenuClaimToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuClaimToDo=IGNUemaHelper.convertStringToBoolean(lMenuClaimToDo)
			if(lIsMenuClaimToDo){
				String lTagMenuClaimButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuClaimButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_CLAIM
				String lLocatorMenuClaimButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
				WebElement lElementMenuClaimButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
				if(!lElementMenuClaimButton){
					lIsMenuClaimToDo=false
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuClaimButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuClaimButton)
					this.waitUntilLoaded()
				}
			}
			lMenuClaimToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuClaimToDo)
			lResult=lMenuClaimToDo.length()>0
			if(lResult){
				lreturn.put('MenuClaimToDo',lMenuClaimToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuClaimDetailNonClosureToDo(String strMenuClaimDetailNonClosureToDo){
		Map lreturn=[:]
		String lMenuClaimDetailNonClosureToDo=strMenuClaimDetailNonClosureToDo.trim()
		if(lMenuClaimDetailNonClosureToDo.length()<=0){
			lMenuClaimDetailNonClosureToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CLAIM_DETAIL_NON_CLOSURE_TO_DO
		}
		String lClaimDetailNonClosureCardSelectedId=''
		String lClaimDetailNonClosureCardSelectedDetail=''
		try{
			Boolean lResult=false
			lreturn.put('MenuClaimDetailNonClosureToDo','')
			lreturn.put('ClaimDetailNonClosureCardSelectedId','')
			lreturn.put('ClaimDetailNonClosureCardSelectedDetail','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuClaimDetailNonClosureToDo=IGNUemaHelper.convertStringToBoolean(lMenuClaimDetailNonClosureToDo)
			lMenuClaimDetailNonClosureToDo=''
			String lTagMenuClaimButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuClaimButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_CLAIM
			String lLocatorMenuClaimButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
			WebElement lElementMenuClaimButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
			if(!lElementMenuClaimButton){
				lMenuClaimDetailNonClosureToDo=false
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuClaimButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuClaimButton)
				this.waitUntilLoaded()
			}
			lMenuClaimDetailNonClosureToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuClaimDetailNonClosureToDo)
			if(!lIsMenuClaimDetailNonClosureToDo){
				lIsMenuClaimDetailNonClosureToDo=false
				lMenuClaimDetailNonClosureToDo='No Option'
			}else{
				def lElementClaimDetailListOfCard=[]
				List<Integer> lListClaimDetailNonClosure=new ArrayList<Integer>()
				Integer lClaimDetailNumberOfCardNum=0
				String lTagClaimDetailListOfCard='card-car'
				String lLocatorClaimDetailListOfCard=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailListOfCard)
				lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
				if(lElementClaimDetailListOfCard){
					lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
				}
				if(lClaimDetailNumberOfCardNum<=0){
					lIsMenuClaimDetailNonClosureToDo=false
					lMenuClaimDetailNonClosureToDo='No Option'
				}
				if(lIsMenuClaimDetailNonClosureToDo){
					Integer lIndexClaimDetail=0
					String lTagClaimDetailCardDisplayed=''
					String lLocatorClaimDetailCardDisplayed='#content-2021 .policy-detail'
					Boolean lIsClaimDetailCardDisplayed=false
					String lTagClaimDetailClosureStatusButton='closeclaim-button'
					String lLocatorClaimDetailClosureStatusButton=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailClosureStatusButton)
					WebElement lElementClaimDetailClosureStatusButton=null
					for(lIndexClaimDetail=0;lIndexClaimDetail<lClaimDetailNumberOfCardNum;lIndexClaimDetail++){
						lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
						if(lElementClaimDetailListOfCard){
							lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
						}
						if(lClaimDetailNumberOfCardNum<=0){
							lIsMenuClaimDetailNonClosureToDo=false
							lMenuClaimDetailNonClosureToDo='No Option'
						}
						if(lIsMenuClaimDetailNonClosureToDo){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailListOfCard[lIndexClaimDetail])
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailListOfCard[lIndexClaimDetail])
							this.waitUntilLoaded()
							lIsClaimDetailCardDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorClaimDetailCardDisplayed,10)
							if(lIsClaimDetailCardDisplayed){
								lElementClaimDetailClosureStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusButton)
								if(!lElementClaimDetailClosureStatusButton){
									lListClaimDetailNonClosure.add(lIndexClaimDetail)
								}
								WebUI.back()
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					if(lListClaimDetailNonClosure.size()<=0){
						lIsMenuClaimDetailNonClosureToDo=false
						lMenuClaimDetailNonClosureToDo='No Option'
					}
					if(lIsMenuClaimDetailNonClosureToDo){
						Integer lSelectAtClaimDetailNonClosure=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lListClaimDetailNonClosure)
						lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
						if(lElementClaimDetailListOfCard){
							lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
						}
						if(lClaimDetailNumberOfCardNum<=0){
							lIsMenuClaimDetailNonClosureToDo=false
							lMenuClaimDetailNonClosureToDo='No Option'
						}
						if(lIsMenuClaimDetailNonClosureToDo){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailListOfCard[lSelectAtClaimDetailNonClosure])
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailListOfCard[lSelectAtClaimDetailNonClosure])
							this.waitUntilLoaded()
							lIsClaimDetailCardDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorClaimDetailCardDisplayed,10)
							if(lIsClaimDetailCardDisplayed){
								lElementClaimDetailClosureStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusButton)
								if(!lElementClaimDetailClosureStatusButton){
									lClaimDetailNonClosureCardSelectedId=IGNUemaHelper.getTextByLocator(this.driver,'.card-header')
									lClaimDetailNonClosureCardSelectedDetail=IGNUemaHelper.getTextByLocator(this.driver,'.card-car')
								}
							}
						}
					}
				}
			}
			lResult=lMenuClaimDetailNonClosureToDo.length()>0
			if(lResult){
				lreturn.put('MenuClaimDetailNonClosureToDo',lMenuClaimDetailNonClosureToDo)
				lreturn.put('ClaimDetailNonClosureCardSelectedId',lClaimDetailNonClosureCardSelectedId)
				lreturn.put('ClaimDetailNonClosureCardSelectedDetail',lClaimDetailNonClosureCardSelectedDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuClaimDetailClosureStatusToDo(String strMenuClaimDetailClosureStatusToDo,String strMenuClaimDetailClosureStatusUpdate){
		Map lreturn=[:]
		String lMenuClaimDetailClosureStatusToDo=strMenuClaimDetailClosureStatusToDo.trim()
		if(lMenuClaimDetailClosureStatusToDo.length()<=0){
			lMenuClaimDetailClosureStatusToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_CLAIM_DETAIL_CLOSURE_STATUS_TO_DO
		}
		String lMenuClaimDetailClosureStatusUpdate=strMenuClaimDetailClosureStatusUpdate.trim()
		if(lMenuClaimDetailClosureStatusUpdate.length()<=0){
			lMenuClaimDetailClosureStatusUpdate=THAMyAccountNewbizMainType.DEFAULT_MENU_CLAIM_DETAIL_CLOSURE_STATUS_UPDATE
		}
		String lClaimDetailClosureStatusCardSelectedId=''
		String lClaimDetailClosureStatusCardSelectedDetail=''
		Map lMapClaimDetailClosureStatus=['1':'touchPoint-0','2':'touchPoint-1','3':'touchPoint-2']
		try{
			Boolean lResult=false
			lreturn.put('MenuClaimDetailClosureStatusToDo','')
			lreturn.put('MenuClaimDetailClosureStatusUpdate','')
			lreturn.put('ClaimDetailClosureStatusCardSelectedId','')
			lreturn.put('ClaimDetailClosureStatusCardSelectedDetail','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuClaimDetailClosureStatusToDo=IGNUemaHelper.convertStringToBoolean(lMenuClaimDetailClosureStatusToDo)
			lMenuClaimDetailClosureStatusToDo=''
			String lStrClaimDetailClosureStatusUpdate=lMenuClaimDetailClosureStatusUpdate
			lMenuClaimDetailClosureStatusUpdate=''
			String lClaimDetailClosureStatusCardItemValue=lMapClaimDetailClosureStatus.get(lStrClaimDetailClosureStatusUpdate)
			if(!lClaimDetailClosureStatusCardItemValue){
				lStrClaimDetailClosureStatusUpdate=IGNUemaHelper.getRandomCharacterTextFromString('12')
				lClaimDetailClosureStatusCardItemValue=lMapClaimDetailClosureStatus.get(lStrClaimDetailClosureStatusUpdate)
			}
			String lTagMenuClaimButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuClaimButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_CLAIM
			String lLocatorMenuClaimButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
			WebElement lElementMenuClaimButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuClaimButtonKey,lTagMenuClaimButtonValue)
			if(!lElementMenuClaimButton){
				lMenuClaimDetailClosureStatusToDo=false
			}else{
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuClaimButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuClaimButton)
				this.waitUntilLoaded()
			}
			lMenuClaimDetailClosureStatusToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuClaimDetailClosureStatusToDo)
			if(!lIsMenuClaimDetailClosureStatusToDo){
				lIsMenuClaimDetailClosureStatusToDo=false
			}else{
				def lElementClaimDetailListOfCard=[]
				List<Integer> lListClaimDetailClosure=new ArrayList<Integer>()
				Integer lClaimDetailNumberOfCardNum=0
				String lTagClaimDetailListOfCard='card-car'
				String lLocatorClaimDetailListOfCard=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailListOfCard)
				lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
				if(lElementClaimDetailListOfCard){
					lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
				}
				if(lClaimDetailNumberOfCardNum<=0){
					lIsMenuClaimDetailClosureStatusToDo=false
					lMenuClaimDetailClosureStatusToDo='No Option'
				}
				if(lIsMenuClaimDetailClosureStatusToDo){
					Integer lIndexClaimDetail=0
					String lTagClaimDetailCardDisplayed=''
					String lLocatorClaimDetailCardDisplayed='#content-2021 .policy-detail'
					Boolean lIsClaimDetailCardDisplayed=false
					String lTagClaimDetailClosureStatusButton='closeclaim-button'
					String lLocatorClaimDetailClosureStatusButton=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailClosureStatusButton)
					WebElement lElementClaimDetailClosureStatusButton=null
					for(lIndexClaimDetail=0;lIndexClaimDetail<lClaimDetailNumberOfCardNum;lIndexClaimDetail++){
						lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
						if(lElementClaimDetailListOfCard){
							lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
						}
						if(lClaimDetailNumberOfCardNum<=0){
							lIsMenuClaimDetailClosureStatusToDo=false
							lMenuClaimDetailClosureStatusToDo='No Option'
						}
						if(lIsMenuClaimDetailClosureStatusToDo){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailListOfCard[lIndexClaimDetail])
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailListOfCard[lIndexClaimDetail])
							this.waitUntilLoaded()
							lIsClaimDetailCardDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorClaimDetailCardDisplayed,10)
							if(lIsClaimDetailCardDisplayed){
								lElementClaimDetailClosureStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusButton)
								if(lElementClaimDetailClosureStatusButton){
									lListClaimDetailClosure.add(lIndexClaimDetail)
								}
								WebUI.back()
								IGNUemaHelper.delayThreadSecond(1)
							}
						}
					}
					if(lListClaimDetailClosure.size()<=0){
						lIsMenuClaimDetailClosureStatusToDo=false
						lMenuClaimDetailClosureStatusToDo='No Option'
					}
					if(lIsMenuClaimDetailClosureStatusToDo){
						Integer lSelectAtClaimDetailClosure=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lListClaimDetailClosure)
						lElementClaimDetailListOfCard=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorClaimDetailListOfCard,'a'))
						if(lElementClaimDetailListOfCard){
							lClaimDetailNumberOfCardNum=lElementClaimDetailListOfCard.size()
						}
						if(lClaimDetailNumberOfCardNum<=0){
							lIsMenuClaimDetailClosureStatusToDo=false
							lMenuClaimDetailClosureStatusToDo='No Option'
						}
						if(lIsMenuClaimDetailClosureStatusToDo){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailListOfCard[lSelectAtClaimDetailClosure])
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailListOfCard[lSelectAtClaimDetailClosure])
							this.waitUntilLoaded()
							lIsClaimDetailCardDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorClaimDetailCardDisplayed,10)
							if(lIsClaimDetailCardDisplayed){
								lElementClaimDetailClosureStatusButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusButton)
								if(lElementClaimDetailClosureStatusButton){
									lClaimDetailClosureStatusCardSelectedId=IGNUemaHelper.getTextByLocator(this.driver,'.card-header')
									lClaimDetailClosureStatusCardSelectedDetail=IGNUemaHelper.getTextByLocator(this.driver,'.card-car')
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailClosureStatusButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailClosureStatusButton)
									this.waitUntilLoaded()
									String lLocatorClaimDetailClosureStatusForm='#closeclaim-modal .modal-body'
									Boolean lIsClaimDetailClosureStatusFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorJs(this.driver,lLocatorClaimDetailClosureStatusForm)
									if(!lIsClaimDetailClosureStatusFormDisplayed){
										lMenuClaimDetailClosureStatusUpdate='No Option'
									}else{
										lMenuClaimDetailClosureStatusUpdate=lStrClaimDetailClosureStatusUpdate
										String lTagClaimDetailClosureStatusUpdate=lClaimDetailClosureStatusCardItemValue
										String lLocatorClaimDetailClosureStatusUpdate=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailClosureStatusUpdate)
										WebElement lElementClaimDetailClosureStatusUpdate=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusUpdate)
										if(!lElementClaimDetailClosureStatusUpdate){
											lMenuClaimDetailClosureStatusUpdate='No Option'
										}else{
											IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailClosureStatusUpdate)
											IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailClosureStatusUpdate)
											this.waitUntilLoaded()
											String lLocatorClaimDetailClosureStatusUpdateTermAccepted='#closeClaimTermAccepted'
											WebElement lElementClaimDetailClosureStatusUpdateTermAccepted=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorClaimDetailClosureStatusUpdateTermAccepted)
											if(lElementClaimDetailClosureStatusUpdateTermAccepted){
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailClosureStatusButton)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailClosureStatusButton)
												this.waitUntilLoaded()
											}
											String lTagClaimDetailClosureStatusUpdateConfirm='btn-confirm-yes'
											String lLocatorClaimDetailClosureStatusUpdateConfirm=IGNUemaHelper.getTagDataSeleniumKey(lTagClaimDetailClosureStatusButton)
											WebElement lElementClaimDetailClosureStatusUpdateConfirm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagClaimDetailClosureStatusUpdateConfirm)
											if(!lElementClaimDetailClosureStatusButton){
												return lreturn
											}else{
												IGNUemaHelper.webJsScrollToElement(this.driver,lElementClaimDetailClosureStatusButton)
												IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementClaimDetailClosureStatusButton)
												this.waitUntilLoaded()
											}
										}
									}
								}
							}
						}
					}
				}
			}
			lResult=lMenuClaimDetailClosureStatusToDo.length()>0
			if(lResult){
				lreturn.put('MenuClaimDetailClosureStatusToDo',lMenuClaimDetailClosureStatusToDo)
				lreturn.put('MenuClaimDetailClosureStatusUpdate',lMenuClaimDetailClosureStatusUpdate)
				lreturn.put('ClaimDetailClosureStatusCardSelectedId',lClaimDetailClosureStatusCardSelectedId)
				lreturn.put('ClaimDetailClosureStatusCardSelectedDetail',lClaimDetailClosureStatusCardSelectedDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuInspectionToDo(String strMenuInspectionToDo){
		Map lreturn=[:]
		String lMenuInspectionToDo=strMenuInspectionToDo.trim()
		if(lMenuInspectionToDo.length()<=0){
			lMenuInspectionToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_INSPECTION_TO_DO
		}
		String lInspectionDetail=''
		String lInspectionResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuInspectionToDo','')
			lreturn.put('InspectionDetail','')
			lreturn.put('InspectionResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuInspectionToDo=IGNUemaHelper.convertStringToBoolean(lMenuInspectionToDo)
			if(lIsMenuInspectionToDo){
				String lTagMenuInspectionButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuInspectionButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_INSPECTION
				String lLocatorMenuInspectionButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuInspectionButtonKey,lTagMenuInspectionButtonValue)
				WebElement lElementMenuInspectionButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuInspectionButtonKey,lTagMenuInspectionButtonValue)
				if(!lElementMenuInspectionButton){
					lIsMenuInspectionToDo=false
				}
				if(lElementMenuInspectionButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuInspectionButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuInspectionButton)
					String lMainWindow=this.driver.getWindowHandle()
					IGNUemaHelper.delayThreadSecond(3)
					if(this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					if(this.waitUntilLoaded()){
						this.waitUntilLoaded()
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
						for(String lWindowHandle:lSetWinHandle){
							if(!lMainWindow.equals(lWindowHandle)){
								this.driver.switchTo().window(lWindowHandle)
								String lLocatorInspectionCheck='#primary #main .section-header'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorInspectionCheck,10)){
									IGNUemaHelper.delayThreadSecond(1)
									lInspectionDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorInspectionCheck).trim()
									lInspectionResult='Passed'
								}
								this.driver.close()
								WebUI.switchToDefaultContent()
								this.driver.switchTo().window(lMainWindow)
							}
						}
					}catch(Exception ex){
						try{
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lMenuInspectionToDo=IGNUemaHelper.convertBooleanToString(lIsMenuInspectionToDo)
			lResult=lMenuInspectionToDo.length()>0
			if(lResult){
				lreturn.put('MenuInspectionToDo',lMenuInspectionToDo)
				lreturn.put('InspectionDetail',lInspectionDetail)
				lreturn.put('InspectionResult',lInspectionResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuFindGarageToDo(String strMenuFindGarageToDo){
		Map lreturn=[:]
		String lMenuFindGarageToDo=strMenuFindGarageToDo.trim()
		if(lMenuFindGarageToDo.length()<=0){
			lMenuFindGarageToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_FIND_GARAGE_TO_DO
		}
		String lFindGarageDetail=''
		String lFindGarageResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuFindGarageToDo','')
			lreturn.put('FindGarageDetail','')
			lreturn.put('FindGarageResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuFindGarageToDo=IGNUemaHelper.convertStringToBoolean(lMenuFindGarageToDo)
			if(lIsMenuFindGarageToDo){
				String lTagMenuFindGarageButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuFindGarageButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_FIND_GARAGE
				String lLocatorMenuFindGarageButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuFindGarageButtonKey,lTagMenuFindGarageButtonValue)
				WebElement lElementMenuFindGarageButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuFindGarageButtonKey,lTagMenuFindGarageButtonValue)
				if(!lElementMenuFindGarageButton){
					lIsMenuFindGarageToDo=false
				}
				if(lElementMenuFindGarageButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuFindGarageButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuFindGarageButton)
					String lMainWindow=this.driver.getWindowHandle()
					IGNUemaHelper.delayThreadSecond(3)
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
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
						for(String lWindowHandle:lSetWinHandle){
							if(!lMainWindow.equals(lWindowHandle)){
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(1)
								String lLocatorFindGarageCheckButton='#btn-search-nearby'
								String lLocatorFindGarageTextSearch='.text-lg-start'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFindGarageCheckButton,10)){
									IGNUemaHelper.delayThreadSecond(1)
									lFindGarageDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorFindGarageTextSearch).trim()
									lFindGarageResult='Passed'
								}
								this.driver.close()
								WebUI.switchToDefaultContent()
								this.driver.switchTo().window(lMainWindow)
							}
						}
					}catch(Exception ex){
						try{
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lMenuFindGarageToDo=IGNUemaHelper.convertBooleanToString(lIsMenuFindGarageToDo)
			lResult=lMenuFindGarageToDo.length()>0
			if(lResult){
				lreturn.put('MenuFindGarageToDo',lMenuFindGarageToDo)
				lreturn.put('FindGarageDetail',lFindGarageDetail)
				lreturn.put('FindGarageResult',lFindGarageResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuGetQuoteToDo(String strMenuGetQuoteToDo,String strMenuGetQuoteSelectProductMotor,String strMenuGetQuoteSelectProductHealth){
		Map lreturn=[:]
		String lMenuGetQuoteToDo=strMenuGetQuoteToDo.trim()
		if(lMenuGetQuoteToDo.length()<=0){
			lMenuGetQuoteToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_GET_QUOTE_TO_DO
		}
		String lMenuGetQuoteSelectProductMotor=strMenuGetQuoteSelectProductMotor.trim()
		if(lMenuGetQuoteSelectProductMotor.length()<=0){
			lMenuGetQuoteSelectProductMotor=THAMyAccountNewbizMainType.DEFAULT_MENU_GET_QUOTE_SELECT_PRODUCT_MOTOR
		}
		String lMenuGetQuoteSelectProductHealth=strMenuGetQuoteSelectProductHealth.trim()
		if(lMenuGetQuoteSelectProductHealth.length()<=0){
			lMenuGetQuoteSelectProductHealth=THAMyAccountNewbizMainType.DEFAULT_MENU_GET_QUOTE_SELECT_PRODUCT_HEALTH
		}
		String lGetQuoteItem01Detail=''
		String lGetQuoteItem01Result=''
		String lGetQuoteItem02Detail=''
		String lGetQuoteItem02Result=''
		String lGetQuoteItem03Detail=''
		String lGetQuoteItem03Result=''
		String lGetQuoteItem04Detail=''
		String lGetQuoteItem04Result=''
		String lGetQuoteItem05Detail=''
		String lGetQuoteItem05Result=''
		String lGetQuoteItem06Detail=''
		String lGetQuoteItem06Result=''
		String lGetQuoteItem07Detail=''
		String lGetQuoteItem07Result=''
		String lGetQuoteItem08Detail=''
		String lGetQuoteItem08Result=''
		String lGetQuoteItem09Detail=''
		String lGetQuoteItem09Result=''
		String lGetQuoteItem10Detail=''
		String lGetQuoteItem10Result=''
		String lGetQuoteSelectProductLineResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuGetQuoteToDo','')
			lreturn.put('MenuGetQuoteSelectProductMotor','')
			lreturn.put('MenuGetQuoteSelectProductHealth','')
			lreturn.put('GetQuoteItem01Detail','')
			lreturn.put('GetQuoteItem01Result','')
			lreturn.put('GetQuoteItem02Detail','')
			lreturn.put('GetQuoteItem02Result','')
			lreturn.put('GetQuoteItem03Detail','')
			lreturn.put('GetQuoteItem03Result','')
			lreturn.put('GetQuoteItem04Detail','')
			lreturn.put('GetQuoteItem04Result','')
			lreturn.put('GetQuoteItem05Detail','')
			lreturn.put('GetQuoteItem05Result','')
			lreturn.put('GetQuoteItem06Detail','')
			lreturn.put('GetQuoteItem06Result','')
			lreturn.put('GetQuoteItem07Detail','')
			lreturn.put('GetQuoteItem07Result','')
			lreturn.put('GetQuoteItem08Detail','')
			lreturn.put('GetQuoteItem08Result','')
			lreturn.put('GetQuoteItem09Detail','')
			lreturn.put('GetQuoteItem09Result','')
			lreturn.put('GetQuoteItem10Detail','')
			lreturn.put('GetQuoteItem10Result','')
			lreturn.put('GetQuoteSelectProductLineResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuGetQuoteResult=true
			Boolean lIsMenuGetQuoteToDo=IGNUemaHelper.convertStringToBoolean(lMenuGetQuoteToDo)
			lMenuGetQuoteToDo=''
			Boolean lIsMenuGetQuoteSelectProductMotor=IGNUemaHelper.convertStringToBoolean(lMenuGetQuoteSelectProductMotor)
			lMenuGetQuoteSelectProductMotor=''
			Boolean lIsMenuGetQuoteSelectProductHealth=IGNUemaHelper.convertStringToBoolean(lMenuGetQuoteSelectProductHealth)
			lMenuGetQuoteSelectProductHealth=''
			lMenuGetQuoteToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsMenuGetQuoteToDo)
			if(!lIsMenuGetQuoteToDo){
				lMenuGetQuoteToDo=IGNUemaHelper.convertBooleanToString(lIsMenuGetQuoteToDo)
				lResult=lMenuGetQuoteToDo.length()>0
				lreturn.put('MenuPolicyToDo',lMenuGetQuoteToDo)
				lreturn.put('Result',lResult)
				return lreturn
			}
			List<String> lGetQuoteProductTypeListAll=[]
			List<Integer> lGetQuoteProductTypeListMotorAll=[]
			List<Integer> lGetQuoteProductTypeListMotorCar=[]
			List<Integer> lGetQuoteProductTypeListMotorBike=[]
			List<Integer> lGetQuoteProductTypeListMotorExtendedWarranty=[]
			List<Integer> lGetQuoteProductTypeListMotorLowMileage=[]
			List<Integer> lGetQuoteProductTypeListHealthAll=[]
			List<Integer> lGetQuoteProductTypeListHealthCancer=[]
			List<Integer> lGetQuoteProductTypeListHealthCriticalIllness=[]
			List<Integer> lGetQuoteProductTypeListHealthPersonalAccident=[]
			List<Integer> lGetQuoteProductTypeListHealthCovid=[]
			Integer lIndexItem=0
			Boolean lIsGetQuoteProductTypeMotorAll=false
			Boolean lIsGetQuoteProductMotorCar=false
			Boolean lIsGetQuoteProductMotorBike=false
			Boolean lIsGetQuoteProductExtendedWarranty=false
			Boolean lIsGetQuoteProductLowMileage=false
			Boolean lIsGetQuoteProductTypeHealthAll=false
			Boolean lIsGetQuoteProductCancer=false
			Boolean lIsGetQuoteProductCriticalIllness=false
			Boolean lIsGetQuoteProductPersonalAccident=false
			Boolean lIsGetQuoteProductCovid=false
			String lTagMenuGetQuoteButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuGetQuoteButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_GET_QUOTE
			String lLocatorMenuGetQuoteButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuGetQuoteButtonKey,lTagMenuGetQuoteButtonValue)
			WebElement lElementMenuGetQuoteButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuGetQuoteButtonKey,lTagMenuGetQuoteButtonValue)
			if(!lElementMenuGetQuoteButton){
				lMenuGetQuoteToDo=IGNUemaHelper.convertBooleanToString(lIsMenuGetQuoteToDo)
				lResult=lMenuGetQuoteToDo.length()>0
				lreturn.put('MenuPolicyToDo',lMenuGetQuoteToDo)
				lreturn.put('Result',lResult)
				return lreturn
			}
			IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuGetQuoteButton)
			IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuGetQuoteButton)
			if(!this.waitUntilLoaded()){
				this.waitUntilLoaded()
			}
			String lMainWindow=this.driver.getWindowHandle()
			IGNUemaHelper.delayThreadSecond(3)
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
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						String lTagGetQuoteProductButton=''
						String lLocatorGetQuoteProductButton='#product-link p'
						List<WebElement> lElementGetQuoteProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorGetQuoteProductButton)
						if(lElementGetQuoteProductButtontList){
							for(WebElement lElementGetQuoteProductButtontItem in lElementGetQuoteProductButtontList){
								String lGetQuoteProductButtontText=lElementGetQuoteProductButtontItem.getText()
								lGetQuoteProductButtontText=lGetQuoteProductButtontText.toUpperCase().trim()
								lIsGetQuoteProductMotorCar=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'CAR INSURANCE')
								lIsGetQuoteProductMotorBike=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'MOTORBIKE')
								lIsGetQuoteProductExtendedWarranty=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'EXTENDED WARRANTY')
								lIsGetQuoteProductLowMileage=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'LOW MILEAGE')
								lIsGetQuoteProductTypeMotorAll=lIsGetQuoteProductMotorCar||lIsGetQuoteProductMotorBike||lIsGetQuoteProductExtendedWarranty||lIsGetQuoteProductLowMileage
								lIsGetQuoteProductCancer=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'CANCER')
								lIsGetQuoteProductCriticalIllness=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'CRITICAL')
								lIsGetQuoteProductPersonalAccident=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'PERSONAL ACCIDENT')
								lIsGetQuoteProductCovid=IGNUemaHelper.checkStringContainString(lGetQuoteProductButtontText,'COVID')
								lIsGetQuoteProductTypeHealthAll=lIsGetQuoteProductCancer||lIsGetQuoteProductCriticalIllness||lIsGetQuoteProductPersonalAccident||lIsGetQuoteProductCovid
								if(lIsGetQuoteProductTypeMotorAll){
									lGetQuoteProductTypeListMotorAll.add(lIndexItem)
								}
								if(lIsGetQuoteProductMotorCar){
									lGetQuoteProductTypeListMotorCar.add(lIndexItem)
								}
								if(lIsGetQuoteProductMotorBike){
									lGetQuoteProductTypeListMotorBike.add(lIndexItem)
								}
								if(lIsGetQuoteProductExtendedWarranty){
									lGetQuoteProductTypeListMotorExtendedWarranty.add(lIndexItem)
								}
								if(lIsGetQuoteProductLowMileage){
									lGetQuoteProductTypeListMotorLowMileage.add(lIndexItem)
								}
								if(lIsGetQuoteProductTypeHealthAll){
									lGetQuoteProductTypeListHealthAll.add(lIndexItem)
								}
								if(lIsGetQuoteProductCancer){
									lGetQuoteProductTypeListHealthCancer.add(lIndexItem)
								}
								if(lIsGetQuoteProductCriticalIllness){
									lGetQuoteProductTypeListHealthCriticalIllness.add(lIndexItem)
								}
								if(lIsGetQuoteProductPersonalAccident){
									lGetQuoteProductTypeListHealthPersonalAccident.add(lIndexItem)
								}
								if(lIsGetQuoteProductCovid){
									lGetQuoteProductTypeListHealthCovid.add(lIndexItem)
								}
								lIndexItem=lIndexItem+1
							}
						}
						this.driver.close()
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			IGNUemaHelper.delayThreadSecond(1)
			if(lGetQuoteProductTypeListMotorAll.size()<=0){
				lIsMenuGetQuoteSelectProductMotor=false
			}
			if(lGetQuoteProductTypeListHealthAll.size()<=0){
				lIsMenuGetQuoteSelectProductHealth=false
			}
			Integer lOutputItemIndex=1
			String lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
			Boolean lIsGetQuoteStepProductType=false
			if(lIsMenuGetQuoteSelectProductMotor){
				if(lGetQuoteProductTypeListMotorBike.size()>0){
					Integer lGetQuoteProductTypeItemMotorBikeIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListMotorBike)
					Map lMapProcessGetQuoteProductTypeMotorBike=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemMotorBikeIndex,'Motor Bike')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeMotorBike.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeMotorBike,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Motor Bike||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListMotorCar.size()>0){
					Integer lGetQuoteProductTypeItemMotorCarIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListMotorCar)
					Map lMapProcessGetQuoteProductTypeMotorCar=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemMotorCarIndex,'Motor Car')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeMotorCar.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeMotorCar,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Motor Car||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListMotorExtendedWarranty.size()>0){
					Integer lGetQuoteProductTypeItemMotorExtendedWarrantyIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListMotorExtendedWarranty)
					Map lMapProcessGetQuoteProductTypeMotorExtendedWarranty=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemMotorExtendedWarrantyIndex,'Motor ExtendedWarranty')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeMotorExtendedWarranty.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeMotorExtendedWarranty,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Motor ExtendedWarranty||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListMotorLowMileage.size()>0){
					Integer lGetQuoteProductTypeItemMotorLowMileageIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListMotorLowMileage)
					Map lMapProcessGetQuoteProductTypeMotorLowMileage=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemMotorLowMileageIndex,'Motor LowMileage')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeMotorLowMileage.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeMotorLowMileage,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Motor LowMileage||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
			}
			if(lIsMenuGetQuoteSelectProductHealth){
				if(lGetQuoteProductTypeListHealthCancer.size()>0){
					Integer lGetQuoteProductTypeItemHealthCancerIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListHealthCancer)
					Map lMapProcessGetQuoteProductTypeHealthCancer=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemHealthCancerIndex,'Health Cancer')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeHealthCancer.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeHealthCancer,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Health Cancer||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListHealthCriticalIllness.size()>0){
					Integer lGetQuoteProductTypeItemHealthCriticalIllnessIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListHealthCriticalIllness)
					Map lMapProcessGetQuoteProductTypeHealthCriticalIllness=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemHealthCriticalIllnessIndex,'Health CriticalIllness')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeHealthCriticalIllness.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeHealthCriticalIllness,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Health CriticalIllness||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListHealthPersonalAccident.size()>0){
					Integer lGetQuoteProductTypeItemHealthPersonalAccidentIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListHealthPersonalAccident)
					Map lMapProcessGetQuoteProductTypeHealthPersonalAccident=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemHealthPersonalAccidentIndex,'Health PersonalAccident')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeHealthPersonalAccident.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeHealthPersonalAccident,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Health PersonalAccident||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
				if(lGetQuoteProductTypeListHealthCovid.size()>0){
					Integer lGetQuoteProductTypeItemHealthCovidIndex=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lGetQuoteProductTypeListHealthCovid)
					Map lMapProcessGetQuoteProductTypeHealthCovid=inputProcessGetQuoteProductType(lGetQuoteProductTypeItemHealthCovidIndex,'Health Covid')
					lIsGetQuoteStepProductType=lMapProcessGetQuoteProductTypeHealthCovid.Result
					this.outputWriteOutputGetQuoteFromMapProductType(lOutputItemIndex,lMapProcessGetQuoteProductTypeHealthCovid,lreturn)
					if(!lIsGetQuoteStepProductType){
						lStrIndexOutputItem=lOutputItemIndex.toString().padLeft(2,'0')
						lreturn.put('GetQuoteItem'+lStrIndexOutputItem+'Detail','Health Covid||Falied')
						lIsMenuGetQuoteResult=lIsGetQuoteStepProductType
					}
					lOutputItemIndex=lOutputItemIndex+1
				}
			}
			lGetQuoteSelectProductLineResult=IGNUemaHelper.convertBooleanToString(lIsMenuGetQuoteResult)
			lResult=lGetQuoteSelectProductLineResult.length()>0
			if(lResult){
				lreturn.put('MenuGetQuoteToDo',lMenuGetQuoteToDo)
				lreturn.put('MenuGetQuoteSelectProductMotor',lMenuGetQuoteSelectProductMotor)
				lreturn.put('MenuGetQuoteSelectProductHealth',lMenuGetQuoteSelectProductHealth)
				lreturn.put('GetQuoteSelectProductLineResult',lGetQuoteSelectProductLineResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputProcessGetQuoteProductType(Integer intGetQuoteProductTypeIndex,String strGetQuoteProductType){
		Map lreturn=[:]
		Integer lGetQuoteProductTypeIndex=intGetQuoteProductTypeIndex
		String lGetQuoteProductTypeStr=strGetQuoteProductType
		String lGetQuoteDetail=''
		String lGetQuoteResult=''
		Map lMapGetQuoteProductTypeList=['Motor Car':'1','Motor Bike':'2','Motor ExtendedWarranty':'3','Motor LowMileage':'4','Health Cancer':'5','Health CriticalIllness':'6','Health PersonalAccident':'7','Health Covid':'8']
		try{
			Boolean lResult=false
			lreturn.put('GetQuoteDetail','')
			lreturn.put('GetQuoteResult','')
			lreturn.put('Result',lResult)
			String lGetQuoteProductTypeItem=lMapGetQuoteProductTypeList.get(lGetQuoteProductTypeStr)
			if(!lGetQuoteProductTypeItem){
				return lreturn
			}
			String lTagMenuGetQuoteButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuGetQuoteButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_GET_QUOTE
			String lLocatorMenuGetQuoteButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuGetQuoteButtonKey,lTagMenuGetQuoteButtonValue)
			WebElement lElementMenuGetQuoteButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuGetQuoteButtonKey,lTagMenuGetQuoteButtonValue)
			if(lElementMenuGetQuoteButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuGetQuoteButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuGetQuoteButton)
				if(!this.waitUntilLoaded()){
					this.waitUntilLoaded()
				}
				String lMainWindow=this.driver.getWindowHandle()
				IGNUemaHelper.delayThreadSecond(3)
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
					for(String lWindowHandle:lSetWinHandle){
						if(!lMainWindow.equals(lWindowHandle)){
							this.driver.switchTo().window(lWindowHandle)
							IGNUemaHelper.delayThreadSecond(1)
							Integer lGetQuoteNumber=0
							String lTagCmsMainProductButton=''
							String lLocatorCmsMainProductButton='#product-link p'
							List<WebElement> lElementCmsMainProductButtontList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorCmsMainProductButton)
							if(lElementCmsMainProductButtontList){
								lGetQuoteNumber=lElementCmsMainProductButtontList.size()
							}
							if(lGetQuoteNumber<=0){
								return lreturn
							}
							WebElement lElementGetQuoteCardItemOpenButton=IGNUemaHelper.getWebElementByIndexItemFromWebElementList(this.driver,lGetQuoteProductTypeIndex,lElementCmsMainProductButtontList)
							if(lElementGetQuoteCardItemOpenButton){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementGetQuoteCardItemOpenButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementGetQuoteCardItemOpenButton)
								this.waitUntilLoaded()
							}
							String lTagGetQuoteCheckItem=''
							String lLocatorGetQuoteCheckItem=''
							switch(lGetQuoteProductTypeItem){
								case '2':
									lTagGetQuoteCheckItem=this.CONST_TAG_MENU_GET_QUOTE_CHECK_BRAND
									lLocatorGetQuoteCheckItem=IGNUemaHelper.getTagDataSeleniumKey(lTagGetQuoteCheckItem)
									break
								case '3':
									lTagGetQuoteCheckItem=this.CONST_TAG_MENU_GET_QUOTE_CHECK_BRAND
									lLocatorGetQuoteCheckItem=IGNUemaHelper.getTagDataSeleniumKey(lTagGetQuoteCheckItem)
									break
								case '4':
									lTagGetQuoteCheckItem=this.CONST_TAG_MENU_GET_QUOTE_CHECK_BRAND
									lLocatorGetQuoteCheckItem=IGNUemaHelper.getTagDataSeleniumKey(lTagGetQuoteCheckItem)
									break
								case '5':
									lTagGetQuoteCheckItem=''
									lLocatorGetQuoteCheckItem='#info-gender-marital'
									break
								case '6':
									lTagGetQuoteCheckItem=''
									lLocatorGetQuoteCheckItem='#info-gender-marital'
									break
								case '7':
									lTagGetQuoteCheckItem=''
									lLocatorGetQuoteCheckItem='#input-gender'
									break
								case '8':
									lTagGetQuoteCheckItem=''
									lLocatorGetQuoteCheckItem='#input-gender'
									break
								default:
									lTagGetQuoteCheckItem=this.CONST_TAG_MENU_GET_QUOTE_CHECK_BRAND
									lLocatorGetQuoteCheckItem=IGNUemaHelper.getTagDataSeleniumKey(lTagGetQuoteCheckItem)
									break
							}
							if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorGetQuoteCheckItem,10)){
								switch(lGetQuoteProductTypeItem){
									case '2':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Motor Bike',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '3':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Motor ExtendedWarranty',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '4':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Motor LowMileage',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '5':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Health Cancer',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '6':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Health CriticalIllness',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '7':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Health PersonalAccident',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									case '8':
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Health Covid',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
									default:
										lGetQuoteDetail=IGNUemaHelper.getChildTextByLocator(this.driver,lLocatorGetQuoteCheckItem).trim()
										lGetQuoteDetail=IGNUemaHelper.concatMessageLeftRightByPipe('Motor Car',lGetQuoteDetail)
										lGetQuoteResult='Passed'
										break
								}
							}
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}catch(Exception ex){
					try{
						WebUI.switchToDefaultContent()
						this.driver.switchTo().window(lMainWindow)
					}catch(Exception exx){
						this.driver.switchTo().window(lMainWindow)
					}
				}
				IGNUemaHelper.delayThreadSecond(1)
			}
			lResult=lGetQuoteResult.length()>0
			if(lResult){
				lreturn.put('GetQuoteDetail',lGetQuoteDetail)
				lreturn.put('GetQuoteResult',lGetQuoteResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean outputWriteOutputGetQuoteFromMapProductType(Integer indexOutputItem,Map mapProductType,Map tartgetMap){
		Boolean lreturn=false
		if(indexOutputItem<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapProductType)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(tartgetMap)){
			return lreturn
		}
		String lGetQuoteDetail=''
		String lGetQuoteResult=''
		try{
			String lStrIndexOutputItem=indexOutputItem.toString().padLeft(2,'0')
			lGetQuoteDetail=mapProductType.GetQuoteDetail
			lGetQuoteResult=mapProductType.GetQuoteResult
			tartgetMap.put('GetQuoteItem'+lStrIndexOutputItem+'Detail',lGetQuoteDetail)
			tartgetMap.put('GetQuoteItem'+lStrIndexOutputItem+'Result',lGetQuoteResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuReferFriendToDo(String strMenuReferFriendToDo,String strMenuReferFriendName,String strMenuReferFriendMobile,String strMenuReferFriendEmail){
		Map lreturn=[:]
		String lMenuReferFriendToDo=strMenuReferFriendToDo.trim()
		if(lMenuReferFriendToDo.length()<=0){
			lMenuReferFriendToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_REFER_FRIEND_TO_DO
		}
		String lMenuReferFriendName=strMenuReferFriendName.trim()
		if(lMenuReferFriendName.length()<=0){
			lMenuReferFriendName=THAMyAccountNewbizMainType.DEFAULT_MENU_REFER_FRIEND_NAME
		}
		String lMenuReferFriendMobile=strMenuReferFriendMobile.trim()
		if(lMenuReferFriendMobile.length()<=0){
			lMenuReferFriendMobile=THAMyAccountNewbizMainType.DEFAULT_MENU_REFER_FRIEND_MOBILE
		}
		String lMenuReferFriendEmail=strMenuReferFriendEmail.trim()
		if(lMenuReferFriendEmail.length()<=0){
			lMenuReferFriendEmail=THAMyAccountNewbizMainType.DEFAULT_MENU_REFER_FRIEND_EMAIL
		}
		String lReferFriendDetail=''
		String lReferFriendReferLink=''
		String lReferFriendReferCode=''
		String lReferFriendResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuReferFriendToDo','')
			lreturn.put('MenuReferFriendName','')
			lreturn.put('MenuReferFriendMobile','')
			lreturn.put('MenuReferFriendEmail','')
			lreturn.put('ReferFriendDetail','')
			lreturn.put('ReferFriendReferLink','')
			lreturn.put('ReferFriendReferCode','')
			lreturn.put('ReferFriendResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuReferFriendToDo=IGNUemaHelper.convertStringToBoolean(lMenuReferFriendToDo)
			if(lIsMenuReferFriendToDo){
				String lTagMenuReferFriendButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuReferFriendButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_REFER_FRIEND
				String lLocatorMenuReferFriendButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuReferFriendButtonKey,lTagMenuReferFriendButtonValue)
				WebElement lElementMenuReferFriendButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuReferFriendButtonKey,lTagMenuReferFriendButtonValue)
				if(!lElementMenuReferFriendButton){
					lIsMenuReferFriendToDo=false
				}
				if(lElementMenuReferFriendButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuReferFriendButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuReferFriendButton)
					String lMainWindow=this.driver.getWindowHandle()
					IGNUemaHelper.delayThreadSecond(3)
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
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
						for(String lWindowHandle:lSetWinHandle){
							if(!lMainWindow.equals(lWindowHandle)){
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(1)
								String lLocatorMenuReferFriendName='#last-name'
								String lLocatorMenuReferFriendMobile='#phone'
								String lLocatorMenuReferFriendEmail='#email'
								String lLocatorMenuReferFriendButtonSubmit='#submit-referral'
								String lLocatorMenuReferFriendButtonConfirm='#confirm-button'
								String lLocatorReferFriendCheck='#copy-url-lg'
								String lLocatorReferFriendLink='#url-ref'
								String lLocatorReferFriendCode='#ref-code'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorReferFriendCheck,10)){
									IGNUemaHelper.delayThreadSecond(1)
									WebElement lElementMenuReferFriendNameInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuReferFriendName)
									if(lElementMenuReferFriendNameInput){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuReferFriendNameInput)
										lMenuReferFriendName=IGNUemaHelper.typeTextByWebElement(this.driver,lElementMenuReferFriendNameInput,lMenuReferFriendName)
									}
									WebElement lElementMenuReferFriendMobileInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuReferFriendMobile)
									if(lElementMenuReferFriendMobileInput){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuReferFriendMobileInput)
										lMenuReferFriendMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementMenuReferFriendMobileInput,lMenuReferFriendMobile)
									}
									WebElement lElementMenuReferFriendEmailInput=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorMenuReferFriendEmail)
									if(lElementMenuReferFriendEmailInput){
										IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuReferFriendEmailInput)
										lMenuReferFriendEmail=IGNUemaHelper.typeTextByWebElement(this.driver,lElementMenuReferFriendEmailInput,lMenuReferFriendEmail)
									}
									Boolean lIsDone=false
									if(IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorMenuReferFriendButtonSubmit)){
										if(IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorMenuReferFriendButtonConfirm,30)){
											lIsDone=IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorMenuReferFriendButtonConfirm)
										}
										IGNUemaHelper.delayThreadSecond(2)
									}
									if(lIsDone){
										lReferFriendReferLink=IGNUemaHelper.getElementAttributeByLocator(this.driver,lLocatorReferFriendLink,'value')
										lReferFriendReferCode=IGNUemaHelper.getElementAttributeByLocator(this.driver,lLocatorReferFriendCode,'value')
										lReferFriendDetail=lReferFriendReferCode+'\n'+lMenuReferFriendName+'\n'+lMenuReferFriendMobile+'\n'+lMenuReferFriendEmail
										lReferFriendResult='Passed'
									}
								}
								this.driver.close()
								WebUI.switchToDefaultContent()
								this.driver.switchTo().window(lMainWindow)
							}
						}
					}catch(Exception ex){
						try{
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lMenuReferFriendToDo=IGNUemaHelper.convertBooleanToString(lIsMenuReferFriendToDo)
			if(!lIsMenuReferFriendToDo){
				lMenuReferFriendName=''
				lMenuReferFriendMobile=''
				lMenuReferFriendEmail=''
				lResult=lMenuReferFriendToDo.length()>0
			}else{
				lResult=lReferFriendResult.length()>0
			}
			if(lResult){
				lreturn.put('MenuReferFriendToDo',lMenuReferFriendToDo)
				lreturn.put('MenuReferFriendName',lMenuReferFriendName)
				lreturn.put('MenuReferFriendMobile',lMenuReferFriendMobile)
				lreturn.put('MenuReferFriendEmail',lMenuReferFriendEmail)
				lreturn.put('ReferFriendDetail',lReferFriendDetail)
				lreturn.put('ReferFriendReferLink',lReferFriendReferLink)
				lreturn.put('ReferFriendReferCode',lReferFriendReferCode)
				lreturn.put('ReferFriendResult',lReferFriendResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuFindNetworkHospitalToDo(String strMenuFindNetworkHospitalToDo){
		Map lreturn=[:]
		String lMenuFindNetworkHospitalToDo=strMenuFindNetworkHospitalToDo.trim()
		if(lMenuFindNetworkHospitalToDo.length()<=0){
			lMenuFindNetworkHospitalToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_FIND_NETWORK_HOSPITAL_TO_DO
		}
		String lFindNetworkHospitalDetail=''
		String lFindNetworkHospitalResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuFindNetworkHospitalToDo','')
			lreturn.put('FindNetworkHospitalDetail','')
			lreturn.put('FindNetworkHospitalResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuFindNetworkHospitalToDo=IGNUemaHelper.convertStringToBoolean(lMenuFindNetworkHospitalToDo)
			if(lIsMenuFindNetworkHospitalToDo){
				String lTagMenuFindNetworkHospitalButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuFindNetworkHospitalButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_FIND_NETWORK_HOSPITAL
				String lLocatorMenuFindNetworkHospitalButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuFindNetworkHospitalButtonKey,lTagMenuFindNetworkHospitalButtonValue)
				WebElement lElementMenuFindNetworkHospitalButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuFindNetworkHospitalButtonKey,lTagMenuFindNetworkHospitalButtonValue)
				if(!lElementMenuFindNetworkHospitalButton){
					lIsMenuFindNetworkHospitalToDo=false
				}
				if(lElementMenuFindNetworkHospitalButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuFindNetworkHospitalButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuFindNetworkHospitalButton)
					String lMainWindow=this.driver.getWindowHandle()
					IGNUemaHelper.delayThreadSecond(3)
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
					}
					if(!this.waitUntilLoaded()){
						this.waitUntilLoaded()
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
						for(String lWindowHandle:lSetWinHandle){
							if(!lMainWindow.equals(lWindowHandle)){
								this.driver.switchTo().window(lWindowHandle)
								IGNUemaHelper.delayThreadSecond(1)
								String lLocatorFindNetworkHospitalCheckButton='#main button'
								String lLocatorFindNetworkHospitalTextSearch='#main .container'
								if(IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorFindNetworkHospitalCheckButton,20)){
									IGNUemaHelper.delayThreadSecond(1)
									lFindNetworkHospitalDetail=IGNUemaHelper.getTextByLocator(this.driver,lLocatorFindNetworkHospitalTextSearch).trim()
									lFindNetworkHospitalResult='Passed'
								}
								this.driver.close()
								WebUI.switchToDefaultContent()
								this.driver.switchTo().window(lMainWindow)
							}
						}
					}catch(Exception ex){
						try{
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lMenuFindNetworkHospitalToDo=IGNUemaHelper.convertBooleanToString(lIsMenuFindNetworkHospitalToDo)
			lResult=lMenuFindNetworkHospitalToDo.length()>0
			if(lResult){
				lreturn.put('MenuFindNetworkHospitalToDo',lMenuFindNetworkHospitalToDo)
				lreturn.put('FindNetworkHospitalDetail',lFindNetworkHospitalDetail)
				lreturn.put('FindNetworkHospitalResult',lFindNetworkHospitalResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardToDo(String strMenuRoojaiRewardToDo,String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail,String strMenuRoojaiRewardVoucherAllToDo,String strMenuRoojaiRewardVoucherInsuranceProductToDo,String strMenuRoojaiRewardVoucherCharityToDo,String strMenuRoojaiRewardVoucherPetrolToDo,String strMenuRoojaiRewardVoucherKangarooToDo,String strMenuRoojaiRewardVoucherTravelAndLifestyleToDo,String strMenuRoojaiRewardVoucherFoodAndBeverageToDo,String strMenuRoojaiRewardVoucherShoppingToDo){
		Map lreturn=[:]
		String lMenuRoojaiRewardToDo=strMenuRoojaiRewardToDo.trim()
		if(lMenuRoojaiRewardToDo.length()<=0){
			lMenuRoojaiRewardToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_TO_DO
		}
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		if(lMenuRoojaiRewardName.length()<=0){
			lMenuRoojaiRewardName=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_NAME
		}
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		if(lMenuRoojaiRewardMobile.length()<=0){
			lMenuRoojaiRewardMobile=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_MOBILE
		}
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		if(lMenuRoojaiRewardEmail.length()<=0){
			lMenuRoojaiRewardEmail=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_EMAIL
		}
		String lMenuRoojaiRewardVoucherAllToDo=strMenuRoojaiRewardVoucherAllToDo.trim()
		if(lMenuRoojaiRewardVoucherAllToDo.length()<=0){
			lMenuRoojaiRewardVoucherAllToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_ALL_TO_DO
		}
		String lMenuRoojaiRewardVoucherInsuranceProductToDo=strMenuRoojaiRewardVoucherInsuranceProductToDo.trim()
		if(lMenuRoojaiRewardVoucherInsuranceProductToDo.length()<=0){
			lMenuRoojaiRewardVoucherInsuranceProductToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_INSURANCE_PRODUCT_TO_DO
		}
		String lMenuRoojaiRewardVoucherCharityToDo=strMenuRoojaiRewardVoucherCharityToDo.trim()
		if(lMenuRoojaiRewardVoucherCharityToDo.length()<=0){
			lMenuRoojaiRewardVoucherCharityToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_CHARITY_TO_DO
		}
		String lMenuRoojaiRewardVoucherPetrolToDo=strMenuRoojaiRewardVoucherPetrolToDo.trim()
		if(lMenuRoojaiRewardVoucherPetrolToDo.length()<=0){
			lMenuRoojaiRewardVoucherPetrolToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_PETROL_TO_DO
		}
		String lMenuRoojaiRewardVoucherKangarooToDo=strMenuRoojaiRewardVoucherKangarooToDo.trim()
		if(lMenuRoojaiRewardVoucherKangarooToDo.length()<=0){
			lMenuRoojaiRewardVoucherKangarooToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_KANGAROO_TO_DO
		}
		String lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=strMenuRoojaiRewardVoucherTravelAndLifestyleToDo.trim()
		if(lMenuRoojaiRewardVoucherTravelAndLifestyleToDo.length()<=0){
			lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_TRAVEL_AND_LIFESTYLE_TO_DO
		}
		String lMenuRoojaiRewardVoucherFoodAndBeverageToDo=strMenuRoojaiRewardVoucherFoodAndBeverageToDo.trim()
		if(lMenuRoojaiRewardVoucherFoodAndBeverageToDo.length()<=0){
			lMenuRoojaiRewardVoucherFoodAndBeverageToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_FOOD_AND_BEVERAGE_TO_DO
		}
		String lMenuRoojaiRewardVoucherShoppingToDo=strMenuRoojaiRewardVoucherShoppingToDo.trim()
		if(lMenuRoojaiRewardVoucherShoppingToDo.length()<=0){
			lMenuRoojaiRewardVoucherShoppingToDo=THAMyAccountNewbizMainType.DEFAULT_MENU_ROOJAI_REWARD_VOUCHER_SHOPPING_TO_DO
		}
		String lRoojaiRewardMyPointSummaryBefore=''
		String lRoojaiRewardMyPointBalanceBefore=''
		String lRoojaiRewardMyPointPendingBefore=''
		String lRoojaiRewardMyPointAvailableBefore=''
		String lRoojaiRewardMyPointTotalBefore=''
		String lRoojaiRewardMyRewardBefore=''
		String lRoojaiRewardMyHistoryBefore=''
		String lRoojaiRewardMyPointSummaryAfter=''
		String lRoojaiRewardMyPointBalanceAfter=''
		String lRoojaiRewardMyPointPendingAfter=''
		String lRoojaiRewardMyPointAvailableAfter=''
		String lRoojaiRewardMyPointTotalAfter=''
		String lRoojaiRewardMyRewardAfter=''
		String lRoojaiRewardMyHistoryAfter=''
		String lRoojaiRewardVoucherAllDetail=''
		String lRoojaiRewardVoucherAllAdditional=''
		String lRoojaiRewardVoucherAllResult=''
		String lRoojaiRewardVoucherInsuranceProductDetail=''
		String lRoojaiRewardVoucherInsuranceProductAdditional=''
		String lRoojaiRewardVoucherInsuranceProductResult=''
		String lRoojaiRewardVoucherCharityDetail=''
		String lRoojaiRewardVoucherCharityAdditional=''
		String lRoojaiRewardVoucherCharityResult=''
		String lRoojaiRewardVoucherPetrolDetail=''
		String lRoojaiRewardVoucherPetrolAdditional=''
		String lRoojaiRewardVoucherPetrolResult=''
		String lRoojaiRewardVoucherKangarooDetail=''
		String lRoojaiRewardVoucherKangarooAdditional=''
		String lRoojaiRewardVoucherKangarooResult=''
		String lRoojaiRewardVoucherTravelAndLifestyleDetail=''
		String lRoojaiRewardVoucherTravelAndLifestyleAdditional=''
		String lRoojaiRewardVoucherTravelAndLifestyleResult=''
		String lRoojaiRewardVoucherFoodAndBeverageDetail=''
		String lRoojaiRewardVoucherFoodAndBeverageAdditional=''
		String lRoojaiRewardVoucherFoodAndBeverageResult=''
		String lRoojaiRewardVoucherShoppingDetail=''
		String lRoojaiRewardVoucherShoppingAdditional=''
		String lRoojaiRewardVoucherShoppingResult=''
		String lRoojaiRewardResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardToDo','')
			lreturn.put('MenuRoojaiRewardName','')
			lreturn.put('MenuRoojaiRewardMobile','')
			lreturn.put('MenuRoojaiRewardEmail','')
			lreturn.put('MenuRoojaiRewardVoucherAllToDo','')
			lreturn.put('MenuRoojaiRewardVoucherInsuranceProductToDo','')
			lreturn.put('MenuRoojaiRewardVoucherCharityToDo','')
			lreturn.put('MenuRoojaiRewardVoucherPetrolToDo','')
			lreturn.put('MenuRoojaiRewardVoucherKangarooToDo','')
			lreturn.put('MenuRoojaiRewardVoucherTravelAndLifestyleToDo','')
			lreturn.put('MenuRoojaiRewardVoucherFoodAndBeverageToDo','')
			lreturn.put('MenuRoojaiRewardVoucherShoppingToDo','')
			lreturn.put('RoojaiRewardMyPointSummaryBefore','')
			lreturn.put('RoojaiRewardMyPointBalanceBefore','')
			lreturn.put('RoojaiRewardMyPointPendingBefore','')
			lreturn.put('RoojaiRewardMyPointAvailableBefore','')
			lreturn.put('RoojaiRewardMyPointTotalBefore','')
			lreturn.put('RoojaiRewardMyRewardBefore','')
			lreturn.put('RoojaiRewardMyHistoryBefore','')
			lreturn.put('RoojaiRewardMyPointSummaryAfter','')
			lreturn.put('RoojaiRewardMyPointBalanceAfter','')
			lreturn.put('RoojaiRewardMyPointPendingAfter','')
			lreturn.put('RoojaiRewardMyPointAvailableAfter','')
			lreturn.put('RoojaiRewardMyPointTotalAfter','')
			lreturn.put('RoojaiRewardMyRewardAfter','')
			lreturn.put('RoojaiRewardMyHistoryAfter','')
			lreturn.put('RoojaiRewardVoucherAllDetail','')
			lreturn.put('RoojaiRewardVoucherAllAdditional','')
			lreturn.put('RoojaiRewardVoucherAllResult','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductDetail','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductAdditional','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductResult','')
			lreturn.put('RoojaiRewardVoucherCharityDetail','')
			lreturn.put('RoojaiRewardVoucherCharityAdditional','')
			lreturn.put('RoojaiRewardVoucherCharityResult','')
			lreturn.put('RoojaiRewardVoucherPetrolDetail','')
			lreturn.put('RoojaiRewardVoucherPetrolAdditional','')
			lreturn.put('RoojaiRewardVoucherPetrolResult','')
			lreturn.put('RoojaiRewardVoucherKangarooDetail','')
			lreturn.put('RoojaiRewardVoucherKangarooAdditional','')
			lreturn.put('RoojaiRewardVoucherKangarooResult','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleDetail','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleAdditional','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleResult','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageDetail','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageAdditional','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageResult','')
			lreturn.put('RoojaiRewardVoucherShoppingDetail','')
			lreturn.put('RoojaiRewardVoucherShoppingAdditional','')
			lreturn.put('RoojaiRewardVoucherShoppingResult','')
			lreturn.put('RoojaiRewardResult','')
			lreturn.put('Result',lResult)
			Boolean lIsMenuRoojaiRewardToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardToDo)
			Boolean lIsRoojaiRewardResult=false
			if(lIsMenuRoojaiRewardToDo){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(!lElementMenuRoojaiRewardButton){
					lIsMenuRoojaiRewardToDo=false
				}else{
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
			}
			if(lIsMenuRoojaiRewardToDo){
				lRoojaiRewardMyPointSummaryBefore=this.outputRoojaiRewardMyPointSummary(true)
				lRoojaiRewardMyPointBalanceBefore=this.outputRoojaiRewardMyPointBalance(true)
				lRoojaiRewardMyPointPendingBefore=this.outputRoojaiRewardMyPointPending(true)
				lRoojaiRewardMyPointAvailableBefore=this.outputRoojaiRewardMyPointAvailable(true)
				lRoojaiRewardMyPointTotalBefore=this.outputRoojaiRewardMyPointTotal(true)
				lRoojaiRewardMyRewardBefore=this.outputRoojaiRewardMyReward(true)
				lRoojaiRewardMyHistoryBefore=this.outputRoojaiRewardMyHistory(true)
				String lRoojaiRewardMyPointBalance=lRoojaiRewardMyPointBalanceBefore
				Integer lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
				lIsRoojaiRewardResult=true
				this.waitUntilLoaded()
				Boolean lIsMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherAllToDo)
				lMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherAllToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherAllToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherAllToDo=false
						lMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherAllToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherAllToDo=this.inputMenuRoojaiRewardVoucherAllToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherAllToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherAllToDo=lMapMenuRoojaiRewardVoucherAllToDo.MenuRoojaiRewardVoucherAllToDo
							lRoojaiRewardVoucherAllDetail=lMapMenuRoojaiRewardVoucherAllToDo.RoojaiRewardVoucherAllDetail
							lRoojaiRewardVoucherAllAdditional=lMapMenuRoojaiRewardVoucherAllToDo.RoojaiRewardVoucherAllAdditional
							lRoojaiRewardVoucherAllResult=lMapMenuRoojaiRewardVoucherAllToDo.RoojaiRewardVoucherAllResult
							Boolean lIsRoojaiRewardVoucherAllResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherAllResult)
							lIsMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherAllToDo)
							if(lIsMenuRoojaiRewardVoucherAllToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherAllResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherInsuranceProductToDo)
				lMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherInsuranceProductToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherInsuranceProductToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
						lMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherInsuranceProductToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherInsuranceProductToDo=this.inputMenuRoojaiRewardVoucherInsuranceProductToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherInsuranceProductToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherInsuranceProductToDo=lMapMenuRoojaiRewardVoucherInsuranceProductToDo.MenuRoojaiRewardVoucherInsuranceProductToDo
							lRoojaiRewardVoucherInsuranceProductDetail=lMapMenuRoojaiRewardVoucherInsuranceProductToDo.RoojaiRewardVoucherInsuranceProductDetail
							lRoojaiRewardVoucherInsuranceProductAdditional=lMapMenuRoojaiRewardVoucherInsuranceProductToDo.RoojaiRewardVoucherInsuranceProductAdditional
							lRoojaiRewardVoucherInsuranceProductResult=lMapMenuRoojaiRewardVoucherInsuranceProductToDo.RoojaiRewardVoucherInsuranceProductResult
							Boolean lIsRoojaiRewardVoucherInsuranceProductResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherInsuranceProductResult)
							lIsMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherInsuranceProductToDo)
							if(lIsMenuRoojaiRewardVoucherInsuranceProductToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherInsuranceProductResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherCharityToDo)
				lMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherCharityToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherCharityToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherCharityToDo=false
						lMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherCharityToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherCharityToDo=this.inputMenuRoojaiRewardVoucherCharityToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherCharityToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherCharityToDo=lMapMenuRoojaiRewardVoucherCharityToDo.MenuRoojaiRewardVoucherCharityToDo
							lRoojaiRewardVoucherCharityDetail=lMapMenuRoojaiRewardVoucherCharityToDo.RoojaiRewardVoucherCharityDetail
							lRoojaiRewardVoucherCharityAdditional=lMapMenuRoojaiRewardVoucherCharityToDo.RoojaiRewardVoucherCharityAdditional
							lRoojaiRewardVoucherCharityResult=lMapMenuRoojaiRewardVoucherCharityToDo.RoojaiRewardVoucherCharityResult
							Boolean lIsRoojaiRewardVoucherCharityResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherCharityResult)
							lIsMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherCharityToDo)
							if(lIsMenuRoojaiRewardVoucherCharityToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherCharityResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherPetrolToDo)
				lMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherPetrolToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherPetrolToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherPetrolToDo=false
						lMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherPetrolToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherPetrolToDo=this.inputMenuRoojaiRewardVoucherPetrolToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherPetrolToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherPetrolToDo=lMapMenuRoojaiRewardVoucherPetrolToDo.MenuRoojaiRewardVoucherPetrolToDo
							lRoojaiRewardVoucherPetrolDetail=lMapMenuRoojaiRewardVoucherPetrolToDo.RoojaiRewardVoucherPetrolDetail
							lRoojaiRewardVoucherPetrolAdditional=lMapMenuRoojaiRewardVoucherPetrolToDo.RoojaiRewardVoucherPetrolAdditional
							lRoojaiRewardVoucherPetrolResult=lMapMenuRoojaiRewardVoucherPetrolToDo.RoojaiRewardVoucherPetrolResult
							Boolean lIsRoojaiRewardVoucherPetrolResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherPetrolResult)
							lIsMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherPetrolToDo)
							if(lIsMenuRoojaiRewardVoucherPetrolToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherPetrolResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherKangarooToDo)
				lMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherKangarooToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherKangarooToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherKangarooToDo=false
						lMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherKangarooToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherKangarooToDo=this.inputMenuRoojaiRewardVoucherKangarooToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherKangarooToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherKangarooToDo=lMapMenuRoojaiRewardVoucherKangarooToDo.MenuRoojaiRewardVoucherKangarooToDo
							lRoojaiRewardVoucherKangarooDetail=lMapMenuRoojaiRewardVoucherKangarooToDo.RoojaiRewardVoucherKangarooDetail
							lRoojaiRewardVoucherKangarooAdditional=lMapMenuRoojaiRewardVoucherKangarooToDo.RoojaiRewardVoucherKangarooAdditional
							lRoojaiRewardVoucherKangarooResult=lMapMenuRoojaiRewardVoucherKangarooToDo.RoojaiRewardVoucherKangarooResult
							Boolean lIsRoojaiRewardVoucherKangarooResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherKangarooResult)
							lIsMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherKangarooToDo)
							if(lIsMenuRoojaiRewardVoucherKangarooToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherKangarooResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
				lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
						lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo=this.inputMenuRoojaiRewardVoucherTravelAndLifestyleToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo.MenuRoojaiRewardVoucherTravelAndLifestyleToDo
							lRoojaiRewardVoucherTravelAndLifestyleDetail=lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo.RoojaiRewardVoucherTravelAndLifestyleDetail
							lRoojaiRewardVoucherTravelAndLifestyleAdditional=lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo.RoojaiRewardVoucherTravelAndLifestyleAdditional
							lRoojaiRewardVoucherTravelAndLifestyleResult=lMapMenuRoojaiRewardVoucherTravelAndLifestyleToDo.RoojaiRewardVoucherTravelAndLifestyleResult
							Boolean lIsRoojaiRewardVoucherTravelAndLifestyleResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherTravelAndLifestyleResult)
							lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
							if(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherTravelAndLifestyleResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherFoodAndBeverageToDo)
				lMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
						lMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo=this.inputMenuRoojaiRewardVoucherFoodAndBeverageToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherFoodAndBeverageToDo=lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo.MenuRoojaiRewardVoucherFoodAndBeverageToDo
							lRoojaiRewardVoucherFoodAndBeverageDetail=lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo.RoojaiRewardVoucherFoodAndBeverageDetail
							lRoojaiRewardVoucherFoodAndBeverageAdditional=lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo.RoojaiRewardVoucherFoodAndBeverageAdditional
							lRoojaiRewardVoucherFoodAndBeverageResult=lMapMenuRoojaiRewardVoucherFoodAndBeverageToDo.RoojaiRewardVoucherFoodAndBeverageResult
							Boolean lIsRoojaiRewardVoucherFoodAndBeverageResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherFoodAndBeverageResult)
							lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherFoodAndBeverageToDo)
							if(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherFoodAndBeverageResult
							}
						}
					}
				}
				Boolean lIsMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherShoppingToDo)
				lMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherShoppingToDo)
				if(lIsRoojaiRewardResult&&lIsMenuRoojaiRewardVoucherShoppingToDo){
					lRoojaiRewardMyPointBalance=this.outputRoojaiRewardStoreMyPointBalance()
					lRoojaiRewardMyPointBalanceNum=IGNUemaHelper.convertStringToInteger(lRoojaiRewardMyPointBalance,0)
					if(lRoojaiRewardMyPointBalanceNum<=0){
						lIsMenuRoojaiRewardVoucherShoppingToDo=false
						lMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherShoppingToDo)
					}else{
						Map lMapMenuRoojaiRewardVoucherShoppingToDo=this.inputMenuRoojaiRewardVoucherShoppingToDo(lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
						if(!lMapMenuRoojaiRewardVoucherShoppingToDo.Result){
							lIsRoojaiRewardResult=false
						}else{
							lMenuRoojaiRewardVoucherShoppingToDo=lMapMenuRoojaiRewardVoucherShoppingToDo.MenuRoojaiRewardVoucherShoppingToDo
							lRoojaiRewardVoucherShoppingDetail=lMapMenuRoojaiRewardVoucherShoppingToDo.RoojaiRewardVoucherShoppingDetail
							lRoojaiRewardVoucherShoppingAdditional=lMapMenuRoojaiRewardVoucherShoppingToDo.RoojaiRewardVoucherShoppingAdditional
							lRoojaiRewardVoucherShoppingResult=lMapMenuRoojaiRewardVoucherShoppingToDo.RoojaiRewardVoucherShoppingResult
							Boolean lIsRoojaiRewardVoucherShoppingResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherShoppingResult)
							lIsMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherShoppingToDo)
							if(lIsMenuRoojaiRewardVoucherShoppingToDo){
								lIsRoojaiRewardResult=lIsRoojaiRewardVoucherShoppingResult
							}
						}
					}
				}
				lRoojaiRewardMyPointSummaryAfter=this.outputRoojaiRewardMyPointSummary(false)
				lRoojaiRewardMyPointBalanceAfter=this.outputRoojaiRewardMyPointBalance(false)
				lRoojaiRewardMyPointPendingAfter=this.outputRoojaiRewardMyPointPending(false)
				lRoojaiRewardMyPointAvailableAfter=this.outputRoojaiRewardMyPointAvailable(false)
				lRoojaiRewardMyPointTotalAfter=this.outputRoojaiRewardMyPointTotal(false)
				lRoojaiRewardMyRewardAfter=this.outputRoojaiRewardMyReward(false)
				lRoojaiRewardMyHistoryAfter=this.outputRoojaiRewardMyHistory(false)
			}
			lMenuRoojaiRewardToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardToDo)
			if(!lIsMenuRoojaiRewardToDo){
				lMenuRoojaiRewardName=''
				lMenuRoojaiRewardMobile=''
				lMenuRoojaiRewardEmail=''
				lMenuRoojaiRewardVoucherAllToDo=''
				lMenuRoojaiRewardVoucherInsuranceProductToDo=''
				lMenuRoojaiRewardVoucherCharityToDo=''
				lMenuRoojaiRewardVoucherPetrolToDo=''
				lMenuRoojaiRewardVoucherKangarooToDo=''
				lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=''
				lMenuRoojaiRewardVoucherFoodAndBeverageToDo=''
				lMenuRoojaiRewardVoucherShoppingToDo=''
				lResult=lMenuRoojaiRewardToDo.length()>0
			}else{
				if(lIsRoojaiRewardResult){
					lRoojaiRewardResult='Passed'
				}else{
					lRoojaiRewardResult='Failed'
				}
				lResult=lIsRoojaiRewardResult
			}
			if(lResult){
				lreturn.put('MenuRoojaiRewardToDo',lMenuRoojaiRewardToDo)
				lreturn.put('MenuRoojaiRewardName',lMenuRoojaiRewardName)
				lreturn.put('MenuRoojaiRewardMobile',lMenuRoojaiRewardMobile)
				lreturn.put('MenuRoojaiRewardEmail',lMenuRoojaiRewardEmail)
				lreturn.put('MenuRoojaiRewardVoucherAllToDo',lMenuRoojaiRewardVoucherAllToDo)
				lreturn.put('MenuRoojaiRewardVoucherInsuranceProductToDo',lMenuRoojaiRewardVoucherInsuranceProductToDo)
				lreturn.put('MenuRoojaiRewardVoucherCharityToDo',lMenuRoojaiRewardVoucherCharityToDo)
				lreturn.put('MenuRoojaiRewardVoucherPetrolToDo',lMenuRoojaiRewardVoucherPetrolToDo)
				lreturn.put('MenuRoojaiRewardVoucherKangarooToDo',lMenuRoojaiRewardVoucherKangarooToDo)
				lreturn.put('MenuRoojaiRewardVoucherTravelAndLifestyleToDo',lMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
				lreturn.put('MenuRoojaiRewardVoucherFoodAndBeverageToDo',lMenuRoojaiRewardVoucherFoodAndBeverageToDo)
				lreturn.put('MenuRoojaiRewardVoucherShoppingToDo',lMenuRoojaiRewardVoucherShoppingToDo)
				lreturn.put('RoojaiRewardMyPointSummaryBefore',lRoojaiRewardMyPointSummaryBefore)
				lreturn.put('RoojaiRewardMyPointBalanceBefore',lRoojaiRewardMyPointBalanceBefore)
				lreturn.put('RoojaiRewardMyPointPendingBefore',lRoojaiRewardMyPointPendingBefore)
				lreturn.put('RoojaiRewardMyPointAvailableBefore',lRoojaiRewardMyPointAvailableBefore)
				lreturn.put('RoojaiRewardMyPointTotalBefore',lRoojaiRewardMyPointTotalBefore)
				lreturn.put('RoojaiRewardMyRewardBefore',lRoojaiRewardMyRewardBefore)
				lreturn.put('RoojaiRewardMyHistoryBefore',lRoojaiRewardMyHistoryBefore)
				lreturn.put('RoojaiRewardMyPointSummaryAfter',lRoojaiRewardMyPointSummaryAfter)
				lreturn.put('RoojaiRewardMyPointBalanceAfter',lRoojaiRewardMyPointBalanceAfter)
				lreturn.put('RoojaiRewardMyPointPendingAfter',lRoojaiRewardMyPointPendingAfter)
				lreturn.put('RoojaiRewardMyPointAvailableAfter',lRoojaiRewardMyPointAvailableAfter)
				lreturn.put('RoojaiRewardMyPointTotalAfter',lRoojaiRewardMyPointTotalAfter)
				lreturn.put('RoojaiRewardMyRewardAfter',lRoojaiRewardMyRewardAfter)
				lreturn.put('RoojaiRewardMyHistoryAfter',lRoojaiRewardMyHistoryAfter)
				lreturn.put('RoojaiRewardVoucherAllDetail',lRoojaiRewardVoucherAllDetail)
				lreturn.put('RoojaiRewardVoucherAllAdditional',lRoojaiRewardVoucherAllAdditional)
				lreturn.put('RoojaiRewardVoucherAllResult',lRoojaiRewardVoucherAllResult)
				lreturn.put('RoojaiRewardVoucherInsuranceProductDetail',lRoojaiRewardVoucherInsuranceProductDetail)
				lreturn.put('RoojaiRewardVoucherInsuranceProductAdditional',lRoojaiRewardVoucherInsuranceProductAdditional)
				lreturn.put('RoojaiRewardVoucherInsuranceProductResult',lRoojaiRewardVoucherInsuranceProductResult)
				lreturn.put('RoojaiRewardVoucherCharityDetail',lRoojaiRewardVoucherCharityDetail)
				lreturn.put('RoojaiRewardVoucherCharityAdditional',lRoojaiRewardVoucherCharityAdditional)
				lreturn.put('RoojaiRewardVoucherCharityResult',lRoojaiRewardVoucherCharityResult)
				lreturn.put('RoojaiRewardVoucherPetrolDetail',lRoojaiRewardVoucherPetrolDetail)
				lreturn.put('RoojaiRewardVoucherPetrolAdditional',lRoojaiRewardVoucherPetrolAdditional)
				lreturn.put('RoojaiRewardVoucherPetrolResult',lRoojaiRewardVoucherPetrolResult)
				lreturn.put('RoojaiRewardVoucherKangarooDetail',lRoojaiRewardVoucherKangarooDetail)
				lreturn.put('RoojaiRewardVoucherKangarooAdditional',lRoojaiRewardVoucherKangarooAdditional)
				lreturn.put('RoojaiRewardVoucherKangarooResult',lRoojaiRewardVoucherKangarooResult)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleDetail',lRoojaiRewardVoucherTravelAndLifestyleDetail)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleAdditional',lRoojaiRewardVoucherTravelAndLifestyleAdditional)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleResult',lRoojaiRewardVoucherTravelAndLifestyleResult)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageDetail',lRoojaiRewardVoucherFoodAndBeverageDetail)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageAdditional',lRoojaiRewardVoucherFoodAndBeverageAdditional)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageResult',lRoojaiRewardVoucherFoodAndBeverageResult)
				lreturn.put('RoojaiRewardVoucherShoppingDetail',lRoojaiRewardVoucherShoppingDetail)
				lreturn.put('RoojaiRewardVoucherShoppingAdditional',lRoojaiRewardVoucherShoppingAdditional)
				lreturn.put('RoojaiRewardVoucherShoppingResult',lRoojaiRewardVoucherShoppingResult)
				lreturn.put('RoojaiRewardResult',lRoojaiRewardResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyPointSummary(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyPointSummary='my-points-card'
				String lLocatorRoojaiRewardMyPointSummary='.rewards-info'
				WebElement lElementRoojaiRewardMyPointSummary=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointSummary)
				if(lElementRoojaiRewardMyPointSummary){
					lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementRoojaiRewardMyPointSummary).trim()
				}
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyPointBalance(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyPointBalance='my-available-points'
				String lLocatorRoojaiRewardMyPointBalance=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointBalance)
				WebElement lElementRoojaiRewardMyPointBalance=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointBalance)
				if(lElementRoojaiRewardMyPointBalance){
					lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyPointBalance).trim()
				}
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyPointPending(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyPointDetailForm=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_FORM
				String lLocatorRoojaiRewardMyPointDetailForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailForm)
				Boolean lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRoojaiRewardMyPointDetailForm,10)
				if(!lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed){
					String lTagRoojaiRewardMyPointDetailOpenButton=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_OPEN_BUTTON
					String lLocatorRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailOpenButton)
					WebElement lElementRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
				}
				String lTagRoojaiRewardMyPointPending='credited-points'
				String lLocatorRoojaiRewardMyPointPending=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointPending)
				WebElement lElementRoojaiRewardMyPointPending=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointPending)
				if(lElementRoojaiRewardMyPointPending){
					lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyPointPending).trim()
				}
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyPointAvailable(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyPointDetailForm=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_FORM
				String lLocatorRoojaiRewardMyPointDetailForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailForm)
				Boolean lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRoojaiRewardMyPointDetailForm,10)
				if(!lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed){
					String lTagRoojaiRewardMyPointDetailOpenButton=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_OPEN_BUTTON
					String lLocatorRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailOpenButton)
					WebElement lElementRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
				}
				String lTagRoojaiRewardMyPointAvailable='available-points'
				String lLocatorRoojaiRewardMyPointAvailable=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointAvailable)
				WebElement lElementRoojaiRewardMyPointAvailable=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointAvailable)
				if(lElementRoojaiRewardMyPointAvailable){
					lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyPointAvailable).trim()
				}
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyPointTotal(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyPointDetailForm=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_FORM
				String lLocatorRoojaiRewardMyPointDetailForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailForm)
				Boolean lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRoojaiRewardMyPointDetailForm,10)
				if(!lIsRoojaiRewardMyRewardMyPointDetailFormDisplayed){
					String lTagRoojaiRewardMyPointDetailOpenButton=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_POINT_DETAIL_OPEN_BUTTON
					String lLocatorRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailOpenButton)
					WebElement lElementRoojaiRewardMyPointDetailOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyPointDetailOpenButton)
				}
				String lTagRoojaiRewardMyPointTotal='total-points'
				String lLocatorRoojaiRewardMyPointTotal=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointTotal)
				WebElement lElementRoojaiRewardMyPointTotal=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointTotal)
				if(lElementRoojaiRewardMyPointTotal){
					lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyPointTotal).trim()
				}
				String lTagRoojaiRewardMyPointDetailCloseButton='my-points-close-modal'
				String lLocatorRoojaiRewardMyPointDetailCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyPointDetailCloseButton)
				WebElement lElementRoojaiRewardMyPointDetailCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyPointDetailCloseButton)
				if(lElementRoojaiRewardMyPointDetailCloseButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyPointDetailCloseButton)
					this.waitUntilLoaded()
				}
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyReward(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagRoojaiRewardMenuButtonMyReward=this.CONST_TAG_MENU_ROOJAI_REWARD_MY_REWARD_OPEN_BUTTON
			String lLocatorRoojaiRewardMenuButtonMyReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonMyReward)
			WebElement lElementRoojaiRewardMenuButtonMyReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonMyReward)
			if(lElementRoojaiRewardMenuButtonMyReward){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonMyReward)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonMyReward)
				this.waitUntilLoaded()
				String lTagRoojaiRewardLoadMoreButton='loadmore-btn'
				String lLocatorRoojaiRewardLoadMoreButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardLoadMoreButton)
				WebElement lElementRoojaiRewardLoadMoreButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardLoadMoreButton)
				if(lElementRoojaiRewardLoadMoreButton){
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardLoadMoreButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMyRewardList='wallet-items'
				String lLocatorRoojaiRewardMyRewardList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyRewardList)
				List<WebElement> lElementRoojaiRewardMyRewardList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorRoojaiRewardMyRewardList)
				if(lElementRoojaiRewardMyRewardList){
					for(WebElement lElementRoojaiRewardMyRewardItem in lElementRoojaiRewardMyRewardList){
						String lRoojaiRewardMyRewardItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyRewardItem)
						String lRoojaiRewardMyRewardItemText=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagRoojaiRewardMyRewardList,lRoojaiRewardMyRewardItemValue)
						WebElement lElementRoojaiRewardMyRewardItemText=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagRoojaiRewardMyRewardList,lRoojaiRewardMyRewardItemValue)
						if(lElementRoojaiRewardMyRewardItemText){
							String lMyRewardText=IGNUemaHelper.getTextByWebElement(this.driver,lElementRoojaiRewardMyRewardItemText)
							lText=lText+'\n'+lMyRewardText
							lText=lText.trim()
						}
					}
					if(!isBefore){
						WebElement lElementRoojaiRewardMyRewardItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardMyRewardList)
						if(lElementRoojaiRewardMyRewardItem){
							String lTagRoojaiRewardMyRewardQrFormOpenButton='showQr'
							String lLocatorRoojaiRewardMyRewardQrFormOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyRewardQrFormOpenButton)
							WebElement lElementRoojaiRewardMyRewardQrFormOpenButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRoojaiRewardMyRewardItem,lTagRoojaiRewardMyRewardQrFormOpenButton)
							if(lElementRoojaiRewardMyRewardQrFormOpenButton){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyRewardQrFormOpenButton)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyRewardQrFormOpenButton)
								this.waitUntilLoaded()
							}
							String lTagRoojaiRewardMyRewardQrForm='qr-modal'
							String lLocatorRoojaiRewardMyRewardQrForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyRewardQrForm)
							Boolean lIsRoojaiRewardMyRewardQrFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRoojaiRewardMyRewardQrForm,10)
							if(lIsRoojaiRewardMyRewardQrFormDisplayed){
								String lTagRoojaiRewardMyRewardQrFormCloseButton='qr-modal-close'
								String lLocatorRoojaiRewardMyRewardQrFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyRewardQrFormCloseButton)
								WebElement lElementRoojaiRewardMyRewardQrFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyRewardQrFormCloseButton)
								if(lElementRoojaiRewardMyRewardQrFormCloseButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyRewardQrFormCloseButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyRewardQrFormCloseButton)
									this.waitUntilLoaded()
								}
							}
						}
					}
				}
			}
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
			}
			lText=IGNUemaHelper.copyStringFitForExcelCell(lText)
			lText=lText.trim()
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardMyHistory(Boolean isBefore){
		String lreturn=''
		try{
			String lText=''
			String lTagRoojaiRewardMenuButtonHistory=this.CONST_TAG_MENU_ROOJAI_REWARD_HISTORY_OPEN_BUTTON
			String lLocatorRoojaiRewardMenuButtonHistory=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonHistory)
			WebElement lElementRoojaiRewardMenuButtonHistory=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonHistory)
			if(lElementRoojaiRewardMenuButtonHistory){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonHistory)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonHistory)
				this.waitUntilLoaded()
				String lTagRoojaiRewardMyHistoryRedeemButton='redeem'
				String lLocatorRoojaiRewardMyHistoryRedeemButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyHistoryRedeemButton)
				WebElement lElementRoojaiRewardMyHistoryRedeemButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMyHistoryRedeemButton)
				if(lElementRoojaiRewardMyHistoryRedeemButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMyHistoryRedeemButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMyHistoryRedeemButton)
					String lTagRoojaiRewardMyHistoryList='redeem-items'
					String lLocatorRoojaiRewardMyHistoryList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMyHistoryList)
					List<WebElement> lElementRoojaiRewardMyHistoryList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorRoojaiRewardMyHistoryList)
					if(lElementRoojaiRewardMyHistoryList){
						for(WebElement lElementRoojaiRewardMyHistoryItem in lElementRoojaiRewardMyHistoryList){
							String lRoojaiRewardMyHistoryItemValue=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardMyHistoryItem)
							String lRoojaiRewardMyHistoryItemText=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagRoojaiRewardMyHistoryList,lRoojaiRewardMyHistoryItemValue)
							WebElement lElementRoojaiRewardMyHistoryItemText=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagRoojaiRewardMyHistoryList,lRoojaiRewardMyHistoryItemValue)
							if(lElementRoojaiRewardMyHistoryItemText){
								String lMyHistoryText=IGNUemaHelper.getTextByWebElement(this.driver,lElementRoojaiRewardMyHistoryItemText)
								lText=lText+'\n'+lMyHistoryText
								lText=lText.trim()
							}
						}
					}
				}
				lText=IGNUemaHelper.copyStringFitForExcelCell(lText)
				lText=lText.trim()
				lreturn=lText
			}
			String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
			String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
			if(lElementMenuRoojaiRewardButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
				this.waitUntilLoaded()
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRoojaiRewardStoreMyPointBalance(){
		String lreturn=''
		try{
			String lText=''
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			String lTagRoojaiRewardStoreMyPointBalance=''
			String lLocatorRoojaiRewardStoreMyPointBalance='.roojai-rewards-store span'
			WebElement lElementRoojaiRewardStoreMyPointBalance=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRoojaiRewardStoreMyPointBalance)
			if(lElementRoojaiRewardStoreMyPointBalance){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementRoojaiRewardStoreMyPointBalance)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherAllToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherAllToDo=''
		String lRoojaiRewardVoucherAllDetail=''
		String lRoojaiRewardVoucherAllAdditional=''
		String lRoojaiRewardVoucherAllResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherAllToDo','')
			lreturn.put('RoojaiRewardVoucherAllDetail','')
			lreturn.put('RoojaiRewardVoucherAllAdditional','')
			lreturn.put('RoojaiRewardVoucherAllResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherAllToDo=true
			Boolean lIslRoojaiRewardVoucherAllResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'All Deals',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherAllToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherAllToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherAllList=[]
			if(lIsMenuRoojaiRewardVoucherAllToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherAllToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherAllToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherAllList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherAllList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherAllList){
						lIsMenuRoojaiRewardVoucherAllToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherAllToDo=lElementRoojaiRewardVoucherAllList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherAllItem=null
			if(lIsMenuRoojaiRewardVoucherAllToDo){
				lElementRoojaiRewardVoucherAllItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherAllList)
			}
			if(lElementRoojaiRewardVoucherAllItem){
				lRoojaiRewardVoucherAllDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherAllItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherAllItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherAllToDo=false
					lRoojaiRewardVoucherAllDetail=''
					lRoojaiRewardVoucherAllAdditional=''
					lRoojaiRewardVoucherAllResult=''
				}else{
					lMenuRoojaiRewardVoucherAllToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherAllToDo)
					lRoojaiRewardVoucherAllDetail=lRoojaiRewardVoucherAllDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherAllAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherAllResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherAllResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherAllResult)
				}
			}
			lMenuRoojaiRewardVoucherAllToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherAllToDo)
			lRoojaiRewardVoucherAllResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherAllResult)
			lResult=lMenuRoojaiRewardVoucherAllToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherAllToDo',lMenuRoojaiRewardVoucherAllToDo)
				lreturn.put('RoojaiRewardVoucherAllDetail',lRoojaiRewardVoucherAllDetail)
				lreturn.put('RoojaiRewardVoucherAllAdditional',lRoojaiRewardVoucherAllAdditional)
				lreturn.put('RoojaiRewardVoucherAllResult',lRoojaiRewardVoucherAllResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherInsuranceProductToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherInsuranceProductToDo=''
		String lRoojaiRewardVoucherInsuranceProductDetail=''
		String lRoojaiRewardVoucherInsuranceProductAdditional=''
		String lRoojaiRewardVoucherInsuranceProductResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherInsuranceProductToDo','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductDetail','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductAdditional','')
			lreturn.put('RoojaiRewardVoucherInsuranceProductResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherInsuranceProductToDo=true
			Boolean lIslRoojaiRewardVoucherInsuranceProductResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Insurance products',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherInsuranceProductList=[]
			if(lIsMenuRoojaiRewardVoucherInsuranceProductToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherInsuranceProductList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherInsuranceProductList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherInsuranceProductList){
						lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherInsuranceProductToDo=lElementRoojaiRewardVoucherInsuranceProductList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherInsuranceProductItem=null
			if(lIsMenuRoojaiRewardVoucherInsuranceProductToDo){
				lElementRoojaiRewardVoucherInsuranceProductItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherInsuranceProductList)
			}
			if(lElementRoojaiRewardVoucherInsuranceProductItem){
				lRoojaiRewardVoucherInsuranceProductDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherInsuranceProductItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherInsuranceProductItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherInsuranceProductToDo=false
					lRoojaiRewardVoucherInsuranceProductDetail=''
					lRoojaiRewardVoucherInsuranceProductAdditional=''
					lRoojaiRewardVoucherInsuranceProductResult=''
				}else{
					lMenuRoojaiRewardVoucherInsuranceProductToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherInsuranceProductToDo)
					lRoojaiRewardVoucherInsuranceProductDetail=lRoojaiRewardVoucherInsuranceProductDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherInsuranceProductAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherInsuranceProductResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherInsuranceProductResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherInsuranceProductResult)
				}
			}
			lMenuRoojaiRewardVoucherInsuranceProductToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherInsuranceProductToDo)
			lRoojaiRewardVoucherInsuranceProductResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherInsuranceProductResult)
			lResult=lMenuRoojaiRewardVoucherInsuranceProductToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherInsuranceProductToDo',lMenuRoojaiRewardVoucherInsuranceProductToDo)
				lreturn.put('RoojaiRewardVoucherInsuranceProductDetail',lRoojaiRewardVoucherInsuranceProductDetail)
				lreturn.put('RoojaiRewardVoucherInsuranceProductAdditional',lRoojaiRewardVoucherInsuranceProductAdditional)
				lreturn.put('RoojaiRewardVoucherInsuranceProductResult',lRoojaiRewardVoucherInsuranceProductResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherCharityToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherCharityToDo=''
		String lRoojaiRewardVoucherCharityDetail=''
		String lRoojaiRewardVoucherCharityAdditional=''
		String lRoojaiRewardVoucherCharityResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherCharityToDo','')
			lreturn.put('RoojaiRewardVoucherCharityDetail','')
			lreturn.put('RoojaiRewardVoucherCharityAdditional','')
			lreturn.put('RoojaiRewardVoucherCharityResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherCharityToDo=true
			Boolean lIslRoojaiRewardVoucherCharityResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Charity',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherCharityToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherCharityToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherCharityList=[]
			if(lIsMenuRoojaiRewardVoucherCharityToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherCharityToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherCharityToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherCharityList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherCharityList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherCharityList){
						lIsMenuRoojaiRewardVoucherCharityToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherCharityToDo=lElementRoojaiRewardVoucherCharityList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherCharityItem=null
			if(lIsMenuRoojaiRewardVoucherCharityToDo){
				lElementRoojaiRewardVoucherCharityItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherCharityList)
			}
			if(lElementRoojaiRewardVoucherCharityItem){
				lRoojaiRewardVoucherCharityDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherCharityItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherCharityItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherCharityToDo=false
					lRoojaiRewardVoucherCharityDetail=''
					lRoojaiRewardVoucherCharityAdditional=''
					lRoojaiRewardVoucherCharityResult=''
				}else{
					lMenuRoojaiRewardVoucherCharityToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherCharityToDo)
					lRoojaiRewardVoucherCharityDetail=lRoojaiRewardVoucherCharityDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherCharityAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherCharityResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherCharityResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherCharityResult)
				}
			}
			lMenuRoojaiRewardVoucherCharityToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherCharityToDo)
			lRoojaiRewardVoucherCharityResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherCharityResult)
			lResult=lMenuRoojaiRewardVoucherCharityToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherCharityToDo',lMenuRoojaiRewardVoucherCharityToDo)
				lreturn.put('RoojaiRewardVoucherCharityDetail',lRoojaiRewardVoucherCharityDetail)
				lreturn.put('RoojaiRewardVoucherCharityAdditional',lRoojaiRewardVoucherCharityAdditional)
				lreturn.put('RoojaiRewardVoucherCharityResult',lRoojaiRewardVoucherCharityResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherPetrolToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherPetrolToDo=''
		String lRoojaiRewardVoucherPetrolDetail=''
		String lRoojaiRewardVoucherPetrolAdditional=''
		String lRoojaiRewardVoucherPetrolResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherPetrolToDo','')
			lreturn.put('RoojaiRewardVoucherPetrolDetail','')
			lreturn.put('RoojaiRewardVoucherPetrolAdditional','')
			lreturn.put('RoojaiRewardVoucherPetrolResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherPetrolToDo=true
			Boolean lIslRoojaiRewardVoucherPetrolResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Petrol',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherPetrolToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherPetrolToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherPetrolList=[]
			if(lIsMenuRoojaiRewardVoucherPetrolToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherPetrolToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherPetrolToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherPetrolList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherPetrolList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherPetrolList){
						lIsMenuRoojaiRewardVoucherPetrolToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherPetrolToDo=lElementRoojaiRewardVoucherPetrolList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherPetrolItem=null
			if(lIsMenuRoojaiRewardVoucherPetrolToDo){
				lElementRoojaiRewardVoucherPetrolItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherPetrolList)
			}
			if(lElementRoojaiRewardVoucherPetrolItem){
				lRoojaiRewardVoucherPetrolDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherPetrolItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherPetrolItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherPetrolToDo=false
					lRoojaiRewardVoucherPetrolDetail=''
					lRoojaiRewardVoucherPetrolAdditional=''
					lRoojaiRewardVoucherPetrolResult=''
				}else{
					lMenuRoojaiRewardVoucherPetrolToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherPetrolToDo)
					lRoojaiRewardVoucherPetrolDetail=lRoojaiRewardVoucherPetrolDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherPetrolAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherPetrolResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherPetrolResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherPetrolResult)
				}
			}
			lMenuRoojaiRewardVoucherPetrolToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherPetrolToDo)
			lRoojaiRewardVoucherPetrolResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherPetrolResult)
			lResult=lMenuRoojaiRewardVoucherPetrolToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherPetrolToDo',lMenuRoojaiRewardVoucherPetrolToDo)
				lreturn.put('RoojaiRewardVoucherPetrolDetail',lRoojaiRewardVoucherPetrolDetail)
				lreturn.put('RoojaiRewardVoucherPetrolAdditional',lRoojaiRewardVoucherPetrolAdditional)
				lreturn.put('RoojaiRewardVoucherPetrolResult',lRoojaiRewardVoucherPetrolResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherKangarooToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherKangarooToDo=''
		String lRoojaiRewardVoucherKangarooDetail=''
		String lRoojaiRewardVoucherKangarooAdditional=''
		String lRoojaiRewardVoucherKangarooResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherKangarooToDo','')
			lreturn.put('RoojaiRewardVoucherKangarooDetail','')
			lreturn.put('RoojaiRewardVoucherKangarooAdditional','')
			lreturn.put('RoojaiRewardVoucherKangarooResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherKangarooToDo=true
			Boolean lIslRoojaiRewardVoucherKangarooResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Kangaroo',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherKangarooToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherKangarooToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherKangarooList=[]
			if(lIsMenuRoojaiRewardVoucherKangarooToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherKangarooToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherKangarooToDo=false
					}else{
						for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
							String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
							if(lRoojaiRewardVoucherFilterItemText.length()>0){
								lElementRoojaiRewardVoucherKangarooList.add(lElementRoojaiRewardVoucherFilterItem)
							}
						}
					}
					if(!lElementRoojaiRewardVoucherKangarooList){
						lIsMenuRoojaiRewardVoucherKangarooToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherKangarooToDo=lElementRoojaiRewardVoucherKangarooList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherKangarooItem=null
			if(lIsMenuRoojaiRewardVoucherKangarooToDo){
				lElementRoojaiRewardVoucherKangarooItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherKangarooList)
			}
			if(lElementRoojaiRewardVoucherKangarooItem){
				lRoojaiRewardVoucherKangarooDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherKangarooItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherKangarooItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherKangarooToDo=false
					lRoojaiRewardVoucherKangarooDetail=''
					lRoojaiRewardVoucherKangarooAdditional=''
					lRoojaiRewardVoucherKangarooResult=''
				}else{
					lMenuRoojaiRewardVoucherKangarooToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherKangarooToDo)
					lRoojaiRewardVoucherKangarooDetail=lRoojaiRewardVoucherKangarooDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherKangarooAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherKangarooResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherKangarooResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherKangarooResult)
				}
			}
			lMenuRoojaiRewardVoucherKangarooToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherKangarooToDo)
			lRoojaiRewardVoucherKangarooResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherKangarooResult)
			lResult=lMenuRoojaiRewardVoucherKangarooToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherKangarooToDo',lMenuRoojaiRewardVoucherKangarooToDo)
				lreturn.put('RoojaiRewardVoucherKangarooDetail',lRoojaiRewardVoucherKangarooDetail)
				lreturn.put('RoojaiRewardVoucherKangarooAdditional',lRoojaiRewardVoucherKangarooAdditional)
				lreturn.put('RoojaiRewardVoucherKangarooResult',lRoojaiRewardVoucherKangarooResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherTravelAndLifestyleToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=''
		String lRoojaiRewardVoucherTravelAndLifestyleDetail=''
		String lRoojaiRewardVoucherTravelAndLifestyleAdditional=''
		String lRoojaiRewardVoucherTravelAndLifestyleResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherTravelAndLifestyleToDo','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleDetail','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleAdditional','')
			lreturn.put('RoojaiRewardVoucherTravelAndLifestyleResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=true
			Boolean lIslRoojaiRewardVoucherTravelAndLifestyleResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Travel & Lifestyle',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherTravelAndLifestyleList=[]
			if(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherTravelAndLifestyleList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherTravelAndLifestyleList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherTravelAndLifestyleList){
						lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=lElementRoojaiRewardVoucherTravelAndLifestyleList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherTravelAndLifestyleItem=null
			if(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo){
				lElementRoojaiRewardVoucherTravelAndLifestyleItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherTravelAndLifestyleList)
			}
			if(lElementRoojaiRewardVoucherTravelAndLifestyleItem){
				lRoojaiRewardVoucherTravelAndLifestyleDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherTravelAndLifestyleItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherTravelAndLifestyleItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=false
					lRoojaiRewardVoucherTravelAndLifestyleDetail=''
					lRoojaiRewardVoucherTravelAndLifestyleAdditional=''
					lRoojaiRewardVoucherTravelAndLifestyleResult=''
				}else{
					lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
					lRoojaiRewardVoucherTravelAndLifestyleDetail=lRoojaiRewardVoucherTravelAndLifestyleDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherTravelAndLifestyleAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherTravelAndLifestyleResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherTravelAndLifestyleResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherTravelAndLifestyleResult)
				}
			}
			lMenuRoojaiRewardVoucherTravelAndLifestyleToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
			lRoojaiRewardVoucherTravelAndLifestyleResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherTravelAndLifestyleResult)
			lResult=lMenuRoojaiRewardVoucherTravelAndLifestyleToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherTravelAndLifestyleToDo',lMenuRoojaiRewardVoucherTravelAndLifestyleToDo)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleDetail',lRoojaiRewardVoucherTravelAndLifestyleDetail)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleAdditional',lRoojaiRewardVoucherTravelAndLifestyleAdditional)
				lreturn.put('RoojaiRewardVoucherTravelAndLifestyleResult',lRoojaiRewardVoucherTravelAndLifestyleResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherFoodAndBeverageToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherFoodAndBeverageToDo=''
		String lRoojaiRewardVoucherFoodAndBeverageDetail=''
		String lRoojaiRewardVoucherFoodAndBeverageAdditional=''
		String lRoojaiRewardVoucherFoodAndBeverageResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherFoodAndBeverageToDo','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageDetail','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageAdditional','')
			lreturn.put('RoojaiRewardVoucherFoodAndBeverageResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=true
			Boolean lIslRoojaiRewardVoucherFoodAndBeverageResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Food & Beverage',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherFoodAndBeverageList=[]
			if(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherFoodAndBeverageList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherFoodAndBeverageList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherFoodAndBeverageList){
						lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=lElementRoojaiRewardVoucherFoodAndBeverageList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherFoodAndBeverageItem=null
			if(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo){
				lElementRoojaiRewardVoucherFoodAndBeverageItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherFoodAndBeverageList)
			}
			if(lElementRoojaiRewardVoucherFoodAndBeverageItem){
				lRoojaiRewardVoucherFoodAndBeverageDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFoodAndBeverageItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherFoodAndBeverageItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=false
					lRoojaiRewardVoucherFoodAndBeverageDetail=''
					lRoojaiRewardVoucherFoodAndBeverageAdditional=''
					lRoojaiRewardVoucherFoodAndBeverageResult=''
				}else{
					lMenuRoojaiRewardVoucherFoodAndBeverageToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherFoodAndBeverageToDo)
					lRoojaiRewardVoucherFoodAndBeverageDetail=lRoojaiRewardVoucherFoodAndBeverageDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherFoodAndBeverageAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherFoodAndBeverageResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherFoodAndBeverageResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherFoodAndBeverageResult)
				}
			}
			lMenuRoojaiRewardVoucherFoodAndBeverageToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherFoodAndBeverageToDo)
			lRoojaiRewardVoucherFoodAndBeverageResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherFoodAndBeverageResult)
			lResult=lMenuRoojaiRewardVoucherFoodAndBeverageToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherFoodAndBeverageToDo',lMenuRoojaiRewardVoucherFoodAndBeverageToDo)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageDetail',lRoojaiRewardVoucherFoodAndBeverageDetail)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageAdditional',lRoojaiRewardVoucherFoodAndBeverageAdditional)
				lreturn.put('RoojaiRewardVoucherFoodAndBeverageResult',lRoojaiRewardVoucherFoodAndBeverageResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherShoppingToDo(String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherShoppingToDo=''
		String lRoojaiRewardVoucherShoppingDetail=''
		String lRoojaiRewardVoucherShoppingAdditional=''
		String lRoojaiRewardVoucherShoppingResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherShoppingToDo','')
			lreturn.put('RoojaiRewardVoucherShoppingDetail','')
			lreturn.put('RoojaiRewardVoucherShoppingAdditional','')
			lreturn.put('RoojaiRewardVoucherShoppingResult','')
			lreturn.put('Result',lResult)
			String lTagRoojaiRewardStoreMyPoint='rewards-store'
			String lLocatorRoojaiRewardStoreMyPoint=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreMyPoint)
			WebElement lElementRoojaiRewardStoreMyPoint=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreMyPoint)
			if(!lElementRoojaiRewardStoreMyPoint){
				String lTagMenuRoojaiRewardButtonKey=this.CONST_TAG_MAIN_MENU_LIST
				String lTagMenuRoojaiRewardButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_ROOJAI_REWARD
				String lLocatorMenuRoojaiRewardButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				WebElement lElementMenuRoojaiRewardButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuRoojaiRewardButtonKey,lTagMenuRoojaiRewardButtonValue)
				if(lElementMenuRoojaiRewardButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuRoojaiRewardButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuRoojaiRewardButton)
					this.waitUntilLoaded()
				}
				String lTagRoojaiRewardMenuButtonRoojaiReward=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_OPEN_BUTTON
				String lLocatorRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardMenuButtonRoojaiReward)
				WebElement lElementRoojaiRewardMenuButtonRoojaiReward=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardMenuButtonRoojaiReward)
				if(lElementRoojaiRewardMenuButtonRoojaiReward){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardMenuButtonRoojaiReward)
					this.waitUntilLoaded()
				}
			}
			Boolean lIsMenuRoojaiRewardVoucherShoppingToDo=true
			Boolean lIslRoojaiRewardVoucherShoppingResult=false
			String lTagRoojaiRewardStoreSelectDropdownButton=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON
			String lLocatorRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreSelectDropdownButton)
			WebElement lElementRoojaiRewardStoreSelectDropdownButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreSelectDropdownButton)
			if(lElementRoojaiRewardStoreSelectDropdownButton){
				String lTextRoojaiRewardCategorySelected=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_BUTTON,this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_CATEGORY_DROPDOWN_LIST,'Shopping',false)
				if(lTextRoojaiRewardCategorySelected.length()>0){
					this.waitUntilLoaded()
				}else{
					lIsMenuRoojaiRewardVoucherShoppingToDo=false
				}
			}else{
				lIsMenuRoojaiRewardVoucherShoppingToDo=false
			}
			String lTagRoojaiRewardStoreButtonShowMore=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_CARD_SHOW_MORE_OPEN_BUTTON
			String lLocatorRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardStoreButtonShowMore)
			WebElement lElementRoojaiRewardStoreButtonShowMore=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRoojaiRewardStoreButtonShowMore)
			if(lElementRoojaiRewardStoreButtonShowMore){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRoojaiRewardStoreButtonShowMore)
				this.waitUntilLoaded()
			}
			String lTagRoojaiRewardVoucherList=this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_LIST
			String lLocatorRoojaiRewardVoucherList=IGNUemaHelper.getTagDataSeleniumKey(lTagRoojaiRewardVoucherList)
			def lElementRoojaiRewardVoucherShoppingList=[]
			if(lIsMenuRoojaiRewardVoucherShoppingToDo){
				List<WebElement> lElementRoojaiRewardVoucherList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagRoojaiRewardVoucherList)
				if(!lElementRoojaiRewardVoucherList){
					lIsMenuRoojaiRewardVoucherShoppingToDo=false
				}else{
					def lElementRoojaiRewardVoucherFilterList=[]
					for(WebElement lElementRoojaiRewardVoucherItem in lElementRoojaiRewardVoucherList){
						Boolean lIsDisplayed=IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementRoojaiRewardVoucherItem)
						if(lIsDisplayed){
							lElementRoojaiRewardVoucherFilterList.add(lElementRoojaiRewardVoucherItem)
						}
					}
					if(!lElementRoojaiRewardVoucherFilterList){
						lIsMenuRoojaiRewardVoucherShoppingToDo=false
					}else{
						if(lElementRoojaiRewardVoucherFilterList.size()>1){
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									Boolean lIsKangaroo=lRoojaiRewardVoucherFilterItemText.contains(this.CONST_TAG_MENU_ROOJAI_REWARD_STORE_VOUCHER_NAME_KANGAROO)
									if(!lIsKangaroo){
										lElementRoojaiRewardVoucherShoppingList.add(lElementRoojaiRewardVoucherFilterItem)
									}
								}
							}
						}else{
							for(WebElement lElementRoojaiRewardVoucherFilterItem in lElementRoojaiRewardVoucherFilterList){
								String lRoojaiRewardVoucherFilterItemText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherFilterItem).toLowerCase().trim()
								if(lRoojaiRewardVoucherFilterItemText.length()>0){
									lElementRoojaiRewardVoucherShoppingList.add(lElementRoojaiRewardVoucherFilterItem)
								}
							}
						}
					}
					if(!lElementRoojaiRewardVoucherShoppingList){
						lIsMenuRoojaiRewardVoucherShoppingToDo=false
					}else{
						lIsMenuRoojaiRewardVoucherShoppingToDo=lElementRoojaiRewardVoucherShoppingList.size()>0
					}
				}
			}
			WebElement lElementRoojaiRewardVoucherShoppingItem=null
			if(lIsMenuRoojaiRewardVoucherShoppingToDo){
				lElementRoojaiRewardVoucherShoppingItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementRoojaiRewardVoucherShoppingList)
			}
			if(lElementRoojaiRewardVoucherShoppingItem){
				lRoojaiRewardVoucherShoppingDetail=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRoojaiRewardVoucherShoppingItem).trim()
				Map lMapMenuRoojaiRewardVoucherTry=this.inputMenuRoojaiRewardVoucherTry(lElementRoojaiRewardVoucherShoppingItem,lMenuRoojaiRewardName,lMenuRoojaiRewardMobile,lMenuRoojaiRewardEmail)
				if(!lMapMenuRoojaiRewardVoucherTry.Result){
					lIsMenuRoojaiRewardVoucherShoppingToDo=false
					lRoojaiRewardVoucherShoppingDetail=''
					lRoojaiRewardVoucherShoppingAdditional=''
					lRoojaiRewardVoucherShoppingResult=''
				}else{
					lMenuRoojaiRewardVoucherShoppingToDo=lMapMenuRoojaiRewardVoucherTry.MenuRoojaiRewardVoucherToDo
					lIsMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertStringToBoolean(lMenuRoojaiRewardVoucherShoppingToDo)
					lRoojaiRewardVoucherShoppingDetail=lRoojaiRewardVoucherShoppingDetail+'\n'+lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherDetail
					lRoojaiRewardVoucherShoppingAdditional=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherAdditional
					lRoojaiRewardVoucherShoppingResult=lMapMenuRoojaiRewardVoucherTry.RoojaiRewardVoucherResult
					lIslRoojaiRewardVoucherShoppingResult=IGNUemaHelper.convertStringToBoolean(lRoojaiRewardVoucherShoppingResult)
				}
			}
			lMenuRoojaiRewardVoucherShoppingToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherShoppingToDo)
			lRoojaiRewardVoucherShoppingResult=IGNUemaHelper.convertBooleanToString(lIslRoojaiRewardVoucherShoppingResult)
			lResult=lMenuRoojaiRewardVoucherShoppingToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherShoppingToDo',lMenuRoojaiRewardVoucherShoppingToDo)
				lreturn.put('RoojaiRewardVoucherShoppingDetail',lRoojaiRewardVoucherShoppingDetail)
				lreturn.put('RoojaiRewardVoucherShoppingAdditional',lRoojaiRewardVoucherShoppingAdditional)
				lreturn.put('RoojaiRewardVoucherShoppingResult',lRoojaiRewardVoucherShoppingResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMenuRoojaiRewardVoucherTry(WebElement elementRoojaiRewardVoucherItem,String strMenuRoojaiRewardName,String strMenuRoojaiRewardMobile,String strMenuRoojaiRewardEmail){
		Map lreturn=[:]
		String lMenuRoojaiRewardName=strMenuRoojaiRewardName.trim()
		String lMenuRoojaiRewardMobile=strMenuRoojaiRewardMobile.trim()
		String lMenuRoojaiRewardEmail=strMenuRoojaiRewardEmail.trim()
		String lMenuRoojaiRewardVoucherToDo=''
		String lRoojaiRewardVoucherDetail=''
		String lRoojaiRewardVoucherAdditional=''
		String lRoojaiRewardVoucherResult=''
		try{
			Boolean lResult=false
			lreturn.put('MenuRoojaiRewardVoucherToDo','')
			lreturn.put('RoojaiRewardVoucherDetail','')
			lreturn.put('RoojaiRewardVoucherAdditional','')
			lreturn.put('RoojaiRewardVoucherResult','')
			lreturn.put('Result',lResult)
			if(!elementRoojaiRewardVoucherItem){
				return lreturn
			}
			Boolean lIsMenuRoojaiRewardVoucherToDo=true
			Boolean lIsRoojaiRewardVoucherError=false
			Boolean lIsRoojaiRewardVoucherResult=false
			String lTagRedeemDetailOpenButton='select-voucher'
			String lLocatorRedeemDetailOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemDetailOpenButton)
			WebElement lElementRedeemDetailOpenButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,elementRoojaiRewardVoucherItem,lTagRedeemDetailOpenButton)
			if(lElementRedeemDetailOpenButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemDetailOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemDetailOpenButton)
			}
			String lTagRedeemModalForm='redeem-modal'
			String lLocatorRedeemModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalForm)
			WebElement lElementRedeemModalForm=null
			Boolean lIsRedeemModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRedeemModalForm,15)
			if(!lIsRedeemModalFormDisplayed){
				lIsRedeemModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRedeemModalForm)
			}
			if(!lIsRedeemModalFormDisplayed){
				lIsMenuRoojaiRewardVoucherToDo=false
			}else{
				lElementRedeemModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRedeemModalForm)
			}
			if(lElementRedeemModalForm){
				String lTextRedeemPrice=''
				String lTextRedeemQuantity=''
				String lTextRedeemTotalPoint=''
				String lTagRedeemPriceButton='display-price'
				String lLocatorRedeemPriceButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemPriceButton)
				String lTagRedeemPriceDropdownList='select-price'
				String lLocatorRedeemPriceDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemPriceDropdownList)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				lTextRedeemPrice=IGNUemaHelper.selectChildDropdownByDataSeleniumLocatorV4(this.driver,lElementRedeemModalForm,lTagRedeemPriceButton,lTagRedeemPriceDropdownList,0,false).trim()
				if(lTextRedeemPrice.length()<=0){
					lTextRedeemPrice='No Price'
				}
				String lTagRedeemQuantityButton='displan-quantity'
				String lLocatorRedeemQuantityButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemQuantityButton)
				String lTagRedeemQuantityDropdownList='select-quantity'
				String lLocatorRedeemQuantityDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemQuantityDropdownList)
				IGNUemaHelper.webJsScrollToTop(this.driver)
				lTextRedeemQuantity=IGNUemaHelper.selectChildDropdownByDataSeleniumLocatorV4(this.driver,lElementRedeemModalForm,lTagRedeemQuantityButton,lTagRedeemQuantityDropdownList,0,false).trim()
				if(lTextRedeemQuantity.length()<=0){
					lTextRedeemQuantity='No Quantity'
				}
				String lTagRedeemTotalPointText='total-redeem-points'
				String lLocatorRedeemTotalPointText=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemTotalPointText)
				WebElement lElementRedeemTotalPointText=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemTotalPointText)
				if(lElementRedeemTotalPointText){
					lTextRedeemTotalPoint=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRedeemTotalPointText).trim()
				}
				if(lTextRedeemTotalPoint.length()<=0){
					lTextRedeemTotalPoint='No TotalPoint'
				}
				lRoojaiRewardVoucherAdditional=IGNUemaHelper.concatMessageLeftRightByPipe(lTextRedeemPrice,lTextRedeemQuantity)
				lRoojaiRewardVoucherAdditional=IGNUemaHelper.concatMessageLeftRightByPipe(lRoojaiRewardVoucherAdditional,lTextRedeemTotalPoint)
				lRoojaiRewardVoucherAdditional=lRoojaiRewardVoucherAdditional.trim()
				String lTagRedeemRequiredMobile='phone-input'
				String lLocatorRedeemRequiredMobile=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemRequiredMobile)
				WebElement lElementRedeemRequiredMobile=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemRequiredMobile)
				if(lElementRedeemRequiredMobile){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemRequiredMobile)
					lMenuRoojaiRewardMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementRedeemRequiredMobile,lMenuRoojaiRewardMobile)
					lRoojaiRewardVoucherAdditional=lRoojaiRewardVoucherAdditional+'\n'+lMenuRoojaiRewardMobile
					lRoojaiRewardVoucherAdditional=lRoojaiRewardVoucherAdditional.trim()
				}
				String lTagRedeemRequiredAgreeTermAndConditionCheckbox='accept-tc'
				String lLocatorRedeemRequiredAgreeTermAndConditionCheckbox=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemRequiredAgreeTermAndConditionCheckbox)
				WebElement lElementRedeemRequiredAgreeTermAndConditionCheckbox=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemRequiredAgreeTermAndConditionCheckbox)
				if(lElementRedeemRequiredAgreeTermAndConditionCheckbox){
					Boolean lIsRedeemRequiredAgreeTermAndConditionCheckboxChecked=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,lElementRedeemRequiredAgreeTermAndConditionCheckbox)
					if(!lIsRedeemRequiredAgreeTermAndConditionCheckboxChecked){
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemRequiredAgreeTermAndConditionCheckbox)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemRequiredAgreeTermAndConditionCheckbox)
					}
				}
				String lTagRedeemVoucherSummaryDetail='summary-box'
				String lLocatorRedeemVoucherSummaryDetail=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemVoucherSummaryDetail)
				WebElement lElementRedeemVoucherSummaryDetail=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemVoucherSummaryDetail)
				if(lElementRedeemVoucherSummaryDetail){
					lRoojaiRewardVoucherDetail=lRoojaiRewardVoucherDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementRedeemVoucherSummaryDetail).trim()
					lRoojaiRewardVoucherDetail=lRoojaiRewardVoucherDetail.trim()
				}
				lRoojaiRewardVoucherDetail=lRoojaiRewardVoucherDetail+'\n'+IGNUemaHelper.getChildTextByWebElement(this.driver,lElementRedeemModalForm).trim()
				lRoojaiRewardVoucherDetail=lRoojaiRewardVoucherDetail.trim()
				String lTagRedeemModalFormConfirmButton='redeem-btn'
				String lLocatorRedeemModalFormConfirmButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalFormConfirmButton)
				WebElement lElementRedeemModalFormConfirmButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemModalFormConfirmButton)
				if(lElementRedeemModalFormConfirmButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemModalFormConfirmButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemModalFormConfirmButton)
					this.waitUntilLoaded()
					String lTagRedeemModalSuccessForm='info-modal-1'
					String lLocatorRedeemModalSuccessForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalSuccessForm)
					WebElement lElementRedeemModalSuccessForm=null
					Boolean lIsRedeemModalSuccessFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorRedeemModalSuccessForm,20)
					lIsRedeemModalSuccessFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRedeemModalSuccessForm)
					if(!lIsRedeemModalSuccessFormDisplayed){
						lIsMenuRoojaiRewardVoucherToDo=false
						lIsRoojaiRewardVoucherError=true
						String lTagRedeemModalFailForm='fail-modal'
						String lLocatorRedeemModalFailForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalFailForm)
						WebElement lElementRedeemModalFailForm=null
						Boolean lIsRedeemModalFailFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRedeemModalFailForm)
						if(lIsRedeemModalFailFormDisplayed){
							lElementRedeemModalFailForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRedeemModalFailForm)
							if(lElementRedeemModalFailForm){
								String lTagRedeemModalFailFormDismissButton='fail-btn'
								String lLocatorRedeemModalFailFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalFailFormDismissButton)
								WebElement lElementRedeemModalFailFormDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalFailForm,lTagRedeemModalFailFormDismissButton)
								if(lElementRedeemModalFailFormDismissButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemModalFailFormDismissButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemModalFailFormDismissButton)
								}
							}
						}
						String lTagRedeemModalErrorForm='error-modal'
						String lLocatorRedeemModalErrorForm=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalErrorForm)
						WebElement lElementRedeemModalErrorForm=null
						Boolean lIsRedeemModalErrorFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRedeemModalErrorForm)
						if(lIsRedeemModalErrorFormDisplayed){
							lElementRedeemModalErrorForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRedeemModalErrorForm)
							if(lElementRedeemModalErrorForm){
								String lTagRedeemModalErrorFormDismissButton='error-btn'
								String lLocatorRedeemModalErrorFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalErrorFormDismissButton)
								WebElement lElementRedeemModalErrorFormDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalErrorForm,lTagRedeemModalErrorFormDismissButton)
								if(lElementRedeemModalErrorFormDismissButton){
									IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemModalErrorFormDismissButton)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemModalErrorFormDismissButton)
								}
							}
						}
					}else{
						lElementRedeemModalSuccessForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRedeemModalSuccessForm)
						if(!lElementRedeemModalSuccessForm){
							lIsMenuRoojaiRewardVoucherToDo=false
						}else{
							String lTagRedeemModalSuccessFormDismissButton='info-modal-1-submit'
							String lLocatorRedeemModalSuccessFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalSuccessFormDismissButton)
							WebElement lElementRedeemModalSuccessFormDismissButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalSuccessForm,lTagRedeemModalSuccessFormDismissButton)
							if(lElementRedeemModalSuccessFormDismissButton){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemModalSuccessFormDismissButton)
								lIsRoojaiRewardVoucherResult=IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemModalSuccessFormDismissButton)
							}
						}
					}
					IGNUemaHelper.delayThreadSecond(1)
				}
				lElementRedeemModalForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagRedeemModalForm)
				if(lElementRedeemModalForm){
					lIsRedeemModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorRedeemModalForm)
					if(lIsRedeemModalFormDisplayed){
						String lTagRedeemModalFormCloseButton='redeem-close-modal'
						String lLocatorRedeemModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagRedeemModalFormCloseButton)
						WebElement lElementRedeemModalFormCloseButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementRedeemModalForm,lTagRedeemModalFormCloseButton)
						if(lElementRedeemModalFormCloseButton){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementRedeemModalFormCloseButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementRedeemModalFormCloseButton)
						}
						IGNUemaHelper.delayThreadSecond(1)
					}
				}
			}
			lMenuRoojaiRewardVoucherToDo=IGNUemaHelper.convertBooleanToString(lIsMenuRoojaiRewardVoucherToDo)
			if(!lIsMenuRoojaiRewardVoucherToDo){
				if(!lIsRoojaiRewardVoucherError){
					lRoojaiRewardVoucherDetail=''
					lRoojaiRewardVoucherAdditional=''
					lIsRoojaiRewardVoucherResult=true
				}
			}
			lRoojaiRewardVoucherResult=IGNUemaHelper.convertBooleanToString(lIsRoojaiRewardVoucherResult)
			lResult=lMenuRoojaiRewardVoucherToDo.length()>0
			if(lResult){
				lreturn.put('MenuRoojaiRewardVoucherToDo',lMenuRoojaiRewardVoucherToDo)
				lreturn.put('RoojaiRewardVoucherDetail',lRoojaiRewardVoucherDetail)
				lreturn.put('RoojaiRewardVoucherAdditional',lRoojaiRewardVoucherAdditional)
				lreturn.put('RoojaiRewardVoucherResult',lRoojaiRewardVoucherResult)
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
			String lTagMenuHomeButtonKey=this.CONST_TAG_MAIN_MENU_LIST
			String lTagMenuHomeButtonValue=this.CONST_TAG_MAIN_MENU_ITEM_HOME
			String lLocatorMenuHomeButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagMenuHomeButtonKey,lTagMenuHomeButtonValue)
			WebElement lElementMenuHomeButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagMenuHomeButtonKey,lTagMenuHomeButtonValue)
			if(lElementMenuHomeButton){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementMenuHomeButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementMenuHomeButton)
				this.waitUntilLoaded()
			}
			Boolean lRedirected=false
			Boolean lIsDone=false
			if(!THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_FLAG){
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app',30)
				lIsDone=lRedirected
			}else{
				lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app',30)
				if(lRedirected){
					if(isPositiveCase){
						lIsDone=THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT
					}else{
						lIsDone=!THAMyAccountNewbizCoreType.CURRENT_MYACCOUNT_NEWBIZ_MAIN_UTIL_ACTUAL_RESULT
					}
				}
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsDone)
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