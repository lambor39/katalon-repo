package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAKumkaCancerResultType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaCancer/KumkaCancer_02_Result.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_Cancer_Kumka.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='Cancer_Result.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=39
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=40
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaCancer/KumkaCancer_02_Result.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_Cancer_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='Cancer_Result.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=178
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=179
	//Constant
	public static final String DEFAULT_BASE_URL='https://compare.uat-mrkumka.com/cancer'
	public static final String DEFAULT_MAXIMIZE_OPTION='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_EMAIL_TO_SAVE='oohhooworld.th@outlook.com'
	public static final String DEFAULT_APPLY_FILTER='No'
	public static final String DEFAULT_FILL_PLAN_CUSTOM_CHEMO_THERAPY='No'
	public static final String DEFAULT_PLAN_CUSTOM_CHEMO_THERAPY='Yes'
	public static final String DEFAULT_FILL_PLAN_CUSTOM_HOSPITAL_CASH='No'
	public static final String DEFAULT_PLAN_CUSTOM_HOSPITAL_CASH='Yes'
	public static final String DEFAULT_FILL_PLAN_CUSTOM_BENEFITS_PA='No'
	public static final String DEFAULT_PLAN_CUSTOM_BENEFITS_PA='Yes'
	public static final String DEFAULT_FILL_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE='No'
	public static final String DEFAULT_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE='Yes'
	public static final String DEFAULT_FILL_SORTING_BY='No'
	public static final String DEFAULT_FILL_SORTING_PREMIUM_MIN_MAX='No'
	public static final String DEFAULT_SORTING_PREMIUM_MIN='0'
	public static final String DEFAULT_SORTING_PREMIUM_MAX='11'
	public static final String DEFAULT_FILL_SORTING_SUM_INSURED_MIN_MAX='No'
	public static final String DEFAULT_SORTING_SUM_INSURED_MIN='0'
	public static final String DEFAULT_SORTING_SUM_INSURED_MAX='11'
	public static final String DEFAULT_FILL_INSURANCE_COMPANY='No'
	public static final String DEFAULT_FILL_INSURANCE_COMPANY_A='No'
	public static final String DEFAULT_INSURANCE_COMPANY_A=''
	public static final String DEFAULT_FILL_INSURANCE_COMPANY_B='No'
	public static final String DEFAULT_INSURANCE_COMPANY_B=''
	public static final String DEFAULT_OUTBOUND_SAVE='No'
	public static final String DEFAULT_OUTBOUND_PREFIX_NAME='5'
	public static final String DEFAULT_OUTBOUND_NAME='TestName'
	public static final String DEFAULT_OUTBOUND_SURNAME='TestSurname'
	public static final String DEFAULT_OUTBOUND_MOBILE_NUMBER='0809591611'
	public static final String DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS='Yes'
	public static final String DEFAULT_OUTBOUND_EMAIL_ADDRESS='oohhooworld.th@outlook.com'
	public static final String DEFAULT_OUTBOUND_CALL_BACK_TIME='1'
	public static final String DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION='Yes'
	public static final String DEFAULT_CALL_ME_BACK='Yes'
	public static final String DEFAULT_CALL_ME_BACK_PHONE_NO='0809591611'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAKumkaCancerResultType(){
		super()
		this.initInput()
		this.initOutput()
	}
	public Map getInput(){
		return this.Input
	}
	public void setInput(Map newInput){
		this.Input.keySet().each{prop->
			if(newInput.containsKey(prop.toString())){
				this.Input[prop]=newInput.get(prop).toString().trim()
			}
		}
	}
	public Map getOutput(){
		return this.Output
	}
	public void setOutput(Map newOutput){
		this.Output.keySet().each{prop->
			if(newOutput.containsKey(prop.toString())){
				this.Output[prop]=newOutput.get(prop).toString().trim()
			}
		}
	}
	public void initInput(){
		this.Input.clear()
		this.Input.put('BaseUrl',this.DEFAULT_BASE_URL)
		this.Input.put('MaximizeOption',this.DEFAULT_MAXIMIZE_OPTION)
		this.Input.put('WithAuth',this.DEFAULT_WITH_AUTH)
		this.Input.put('AuthUser',this.DEFAULT_AUTH_USER)
		this.Input.put('AuthPassword',this.DEFAULT_AUTH_PASSWORD)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('EmailToSave',this.DEFAULT_EMAIL_TO_SAVE)
		this.Input.put('ApplyFilter',this.DEFAULT_APPLY_FILTER)
		this.Input.put('FillPlanCustomChemoTherapy',this.DEFAULT_FILL_PLAN_CUSTOM_CHEMO_THERAPY)
		this.Input.put('PlanCustomChemoTherapy',this.DEFAULT_PLAN_CUSTOM_CHEMO_THERAPY)
		this.Input.put('FillPlanCustomHospitalCash',this.DEFAULT_FILL_PLAN_CUSTOM_HOSPITAL_CASH)
		this.Input.put('PlanCustomHospitalCash',this.DEFAULT_PLAN_CUSTOM_HOSPITAL_CASH)
		this.Input.put('FillPlanCustomBenefitsPa',this.DEFAULT_FILL_PLAN_CUSTOM_BENEFITS_PA)
		this.Input.put('PlanCustomBenefitsPa',this.DEFAULT_PLAN_CUSTOM_BENEFITS_PA)
		this.Input.put('FillPlanCustomPurchaseWithLifeinsure',this.DEFAULT_FILL_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE)
		this.Input.put('PlanCustomPurchaseWithLifeinsure',this.DEFAULT_PLAN_CUSTOM_PURCHASE_WITH_LIFEINSURE)
		this.Input.put('FillSortingBy',this.DEFAULT_FILL_SORTING_BY)
		this.Input.put('FillSortingPremiumMinMax',this.DEFAULT_FILL_SORTING_PREMIUM_MIN_MAX)
		this.Input.put('SortingPremiumMin',this.DEFAULT_SORTING_PREMIUM_MIN)
		this.Input.put('SortingPremiumMax',this.DEFAULT_SORTING_PREMIUM_MAX)
		this.Input.put('FillSortingSumInsuredMinMax',this.DEFAULT_FILL_SORTING_SUM_INSURED_MIN_MAX)
		this.Input.put('SortingSumInsuredMin',this.DEFAULT_SORTING_SUM_INSURED_MIN)
		this.Input.put('SortingSumInsuredMax',this.DEFAULT_SORTING_SUM_INSURED_MAX)
		this.Input.put('FillInsuranceCompany',this.DEFAULT_FILL_INSURANCE_COMPANY)
		this.Input.put('FillInsuranceCompanyA',this.DEFAULT_FILL_INSURANCE_COMPANY_A)
		this.Input.put('InsuranceCompanyA',this.DEFAULT_INSURANCE_COMPANY_A)
		this.Input.put('FillInsuranceCompanyB',this.DEFAULT_FILL_INSURANCE_COMPANY_B)
		this.Input.put('InsuranceCompanyB',this.DEFAULT_INSURANCE_COMPANY_B)
		this.Input.put('OutboundSave',this.DEFAULT_OUTBOUND_SAVE)
		this.Input.put('OutboundPrefixName',this.DEFAULT_OUTBOUND_PREFIX_NAME)
		this.Input.put('OutboundName',this.DEFAULT_OUTBOUND_NAME)
		this.Input.put('OutboundSurname',this.DEFAULT_OUTBOUND_SURNAME)
		this.Input.put('OutboundMobileNumber',this.DEFAULT_OUTBOUND_MOBILE_NUMBER)
		this.Input.put('OutboundFillEmailAddress',this.DEFAULT_OUTBOUND_FILL_EMAIL_ADDRESS)
		this.Input.put('OutboundEmailAddress',this.DEFAULT_OUTBOUND_EMAIL_ADDRESS)
		this.Input.put('OutboundCallBackTime',this.DEFAULT_OUTBOUND_CALL_BACK_TIME)
		this.Input.put('OutboundAcceptTermAndCondition',this.DEFAULT_OUTBOUND_ACCEPT_TERM_AND_CONDITION)
		this.Input.put('CallMeBack',this.DEFAULT_CALL_ME_BACK)
		this.Input.put('CallMeBackPhoneNo',this.DEFAULT_CALL_ME_BACK_PHONE_NO)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeOption','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Language','')
		this.Output.put('EmailToSave','')
		this.Output.put('ApplyFilter','')
		this.Output.put('FillPlanCustomChemoTherapy','')
		this.Output.put('PlanCustomChemoTherapy','')
		this.Output.put('FillPlanCustomHospitalCash','')
		this.Output.put('PlanCustomHospitalCash','')
		this.Output.put('FillPlanCustomBenefitsPa','')
		this.Output.put('PlanCustomBenefitsPa','')
		this.Output.put('FillPlanCustomPurchaseWithLifeinsure','')
		this.Output.put('PlanCustomPurchaseWithLifeinsure','')
		this.Output.put('FillSortingBy','')
		this.Output.put('FillSortingPremiumMinMax','')
		this.Output.put('SortingPremiumMin','')
		this.Output.put('SortingPremiumMax','')
		this.Output.put('FillSortingSumInsuredMinMax','')
		this.Output.put('SortingSumInsuredMin','')
		this.Output.put('SortingSumInsuredMax','')
		this.Output.put('FillInsuranceCompany','')
		this.Output.put('FillInsuranceCompanyA','')
		this.Output.put('InsuranceCompanyA','')
		this.Output.put('FillInsuranceCompanyB','')
		this.Output.put('InsuranceCompanyB','')
		this.Output.put('OutboundSave','')
		this.Output.put('OutboundPrefixName','')
		this.Output.put('OutboundName','')
		this.Output.put('OutboundSurname','')
		this.Output.put('OutboundMobileNumber','')
		this.Output.put('OutboundFillEmailAddress','')
		this.Output.put('OutboundEmailAddress','')
		this.Output.put('OutboundCallBackTime','')
		this.Output.put('OutboundAcceptTermAndCondition','')
		this.Output.put('CallMeBack','')
		this.Output.put('CallMeBackPhoneNo','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('DefaultPlanPersonInfo','')
		this.Output.put('DefaultSaveQuoteId','')
		this.Output.put('DefaultNumberOfCards','')
		this.Output.put('DefaultSortingPremiumMinMax','')
		this.Output.put('DefaultSortingSumInsuredMinMax','')
		this.Output.put('DefaultInsuranceCompany','')
		this.Output.put('DefaultPlanCustomChemoTherapy','')
		this.Output.put('DefaultPlanCustomHospitalCash','')
		this.Output.put('DefaultPlanCustomBenefitsPa','')
		this.Output.put('DefaultPlanCustomPurchaseWithLifeinsure','')
		this.Output.put('FilteredSaveQuoteId','')
		this.Output.put('FilteredNumberOfCards','')
		this.Output.put('FilteredSortingPremiumMinMax','')
		this.Output.put('FilteredSortingSumInsuredMinMax','')
		this.Output.put('FilteredInsuranceCompany','')
		this.Output.put('FilteredPlanCustomChemoTherapy','')
		this.Output.put('FilteredPlanCustomHospitalCash','')
		this.Output.put('FilteredPlanCustomBenefitsPa','')
		this.Output.put('FilteredPlanCustomPurchaseWithLifeinsure','')
		this.Output.put('OutboundCpcFormMoreCardDisplayPlanId','')
		this.Output.put('OutboundCpcFormMoreCardPlanType','')
		this.Output.put('OutboundCpcFormMoreCardPlanPartnerName','')
		this.Output.put('OutboundCpcFormMoreCardPlanName','')
		this.Output.put('OutboundCpcFormMoreCardPlanCoverage','')
		this.Output.put('OutboundCpcFormMoreCardPlanPaymentOptionAmount','')
		this.Output.put('OutboundCpcFormMoreCardPlanPaymentInstalment','')
		this.Output.put('OutboundCpcFormMoreCardModalPaymentInstalment','')
		this.Output.put('OutboundCpcFormMoreCardPlanTaxDeduct','')
		this.Output.put('OutboundCpcFormMoreCardPlanChemoTherapy','')
		this.Output.put('OutboundCpcFormMoreCardPlanHospitalCash','')
		this.Output.put('OutboundCpcFormMoreCardPlanBenefitsPa','')
		this.Output.put('OutboundCpcFormMoreCardPlanRenew','')
		this.Output.put('OutboundCpcFormMoreCardPlanActive','')
		this.Output.put('OutboundCpcFormMoreCardPlanWait','')
		this.Output.put('OutboundCpcFormMoreCardPromoText','')
		this.Output.put('OutboundCpcFormMoreOutboundButtonName','')
		this.Output.put('OutboundCpcFormMoreCardDetailPartnerName','')
		this.Output.put('OutboundCpcFormMoreCardDetailPlanName','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsCoverOpd','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsAddBenefitsForGender','')
		this.Output.put('OutboundCpcFormMoreCardDetailIsOtherCovid','')
		this.Output.put('OutboundCpcFormMoreCardDetailTermAndCondition','')
		this.Output.put('OutboundCpcFormMorePlanResultText','')
		this.Output.put('OutboundCpcCardDisplayPlanId','')
		this.Output.put('OutboundCpcCardPlanType','')
		this.Output.put('OutboundCpcCardPlanPartnerName','')
		this.Output.put('OutboundCpcCardPlanName','')
		this.Output.put('OutboundCpcCardPlanCoverage','')
		this.Output.put('OutboundCpcCardPlanPaymentOptionAmount','')
		this.Output.put('OutboundCpcCardPlanPaymentInstalment','')
		this.Output.put('OutboundCpcCardModalPaymentInstalment','')
		this.Output.put('OutboundCpcCardPlanTaxDeduct','')
		this.Output.put('OutboundCpcCardPlanChemoTherapy','')
		this.Output.put('OutboundCpcCardPlanHospitalCash','')
		this.Output.put('OutboundCpcCardPlanBenefitsPa','')
		this.Output.put('OutboundCpcCardPlanRenew','')
		this.Output.put('OutboundCpcCardPlanActive','')
		this.Output.put('OutboundCpcCardPlanWait','')
		this.Output.put('OutboundCpcCardPromoText','')
		this.Output.put('OutboundCpcOutboundButtonName','')
		this.Output.put('OutboundCpcCardDetailPartnerName','')
		this.Output.put('OutboundCpcCardDetailPlanName','')
		this.Output.put('OutboundCpcCardDetailIsLumpsumAllInvasiveCancer','')
		this.Output.put('OutboundCpcCardDetailIsLumpsumNonInvasiveCancer','')
		this.Output.put('OutboundCpcCardDetailIsLumpsumAddInvasiveCancer','')
		this.Output.put('OutboundCpcCardDetailIsAddBenefitsSkinCancer','')
		this.Output.put('OutboundCpcCardDetailIsAddBenefitsFuneralFee','')
		this.Output.put('OutboundCpcCardDetailIsAddBenefitsSecondExamFee','')
		this.Output.put('OutboundCpcCardDetailIsCoverOpd','')
		this.Output.put('OutboundCpcCardDetailIsAddBenefitsForGender','')
		this.Output.put('OutboundCpcCardDetailIsOtherCovid','')
		this.Output.put('OutboundCpcCardDetailTermAndCondition','')
		this.Output.put('OutboundCpcOutboundPlanResultText','')
		this.Output.put('OutboundCplFormMoreCardDisplayPlanId','')
		this.Output.put('OutboundCplFormMoreCardPlanType','')
		this.Output.put('OutboundCplFormMoreCardPlanPartnerName','')
		this.Output.put('OutboundCplFormMoreCardPlanName','')
		this.Output.put('OutboundCplFormMoreCardPlanCoverage','')
		this.Output.put('OutboundCplFormMoreCardPlanPaymentOptionAmount','')
		this.Output.put('OutboundCplFormMoreCardPlanPaymentInstalment','')
		this.Output.put('OutboundCplFormMoreCardModalPaymentInstalment','')
		this.Output.put('OutboundCplFormMoreCardPlanTaxDeduct','')
		this.Output.put('OutboundCplFormMoreCardPlanChemoTherapy','')
		this.Output.put('OutboundCplFormMoreCardPlanHospitalCash','')
		this.Output.put('OutboundCplFormMoreCardPlanBenefitsPa','')
		this.Output.put('OutboundCplFormMoreCardPlanRenew','')
		this.Output.put('OutboundCplFormMoreCardPlanActive','')
		this.Output.put('OutboundCplFormMoreCardPlanWait','')
		this.Output.put('OutboundCplFormMoreCardPromoText','')
		this.Output.put('OutboundCplFormMoreOutboundButtonName','')
		this.Output.put('OutboundCplFormMoreCardDetailPartnerName','')
		this.Output.put('OutboundCplFormMoreCardDetailPlanName','')
		this.Output.put('OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer','')
		this.Output.put('OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer','')
		this.Output.put('OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer','')
		this.Output.put('OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer','')
		this.Output.put('OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee','')
		this.Output.put('OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee','')
		this.Output.put('OutboundCplFormMoreCardDetailIsCoverOpd','')
		this.Output.put('OutboundCplFormMoreCardDetailIsAddBenefitsForGender','')
		this.Output.put('OutboundCplFormMoreCardDetailIsOtherCovid','')
		this.Output.put('OutboundCplFormMoreCardDetailTermAndCondition','')
		this.Output.put('OutboundCplPopupFormCardDisplayPlanId','')
		this.Output.put('OutboundCplPopupFormCardPlanType','')
		this.Output.put('OutboundCplPopupFormCardPlanPartnerName','')
		this.Output.put('OutboundCplPopupFormCardPlanName','')
		this.Output.put('OutboundCplPopupFormCardPlanCoverage','')
		this.Output.put('OutboundCplPopupFormCardPlanPaymentOptionAmount','')
		this.Output.put('OutboundCplPopupFormCardPlanPaymentInstalment','')
		this.Output.put('OutboundCplPopupFormCardModalPaymentInstalment','')
		this.Output.put('OutboundCplPopupFormCardPlanTaxDeduct','')
		this.Output.put('OutboundCplPopupFormCardPlanChemoTherapy','')
		this.Output.put('OutboundCplPopupFormCardPlanHospitalCash','')
		this.Output.put('OutboundCplPopupFormCardPlanBenefitsPa','')
		this.Output.put('OutboundCplPopupFormCardPlanRenew','')
		this.Output.put('OutboundCplPopupFormCardPlanActive','')
		this.Output.put('OutboundCplPopupFormCardPlanWait','')
		this.Output.put('OutboundCplPopupFormCardPromoText','')
		this.Output.put('OutboundCplPopupFormOutboundButtonName','')
		this.Output.put('OutboundCplPopupFormCardDetailPartnerName','')
		this.Output.put('OutboundCplPopupFormCardDetailPlanName','')
		this.Output.put('OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer','')
		this.Output.put('OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer','')
		this.Output.put('OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer','')
		this.Output.put('OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer','')
		this.Output.put('OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee','')
		this.Output.put('OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee','')
		this.Output.put('OutboundCplPopupFormCardDetailIsCoverOpd','')
		this.Output.put('OutboundCplPopupFormCardDetailIsAddBenefitsForGender','')
		this.Output.put('OutboundCplPopupFormCardDetailIsOtherCovid','')
		this.Output.put('OutboundCplPopupFormCardDetailTermAndCondition','')
	}
	public static Boolean readInputFromDataFile(Integer caseNumber,Map caseInput){
		Boolean lreturn=false
		if(caseNumber<1){
			return lreturn
		}
		try{
			TestData lTestData=TestDataFactory.findTestData(this.INPUT_DATA_FILE_NAME)
			Integer dataColIndex=this.INPUT_DATA_COL_BEGIN+(caseNumber-1)
			Integer dataRowIndex=this.INPUT_DATA_ROW_BEGIN
			caseInput.put('BaseUrl',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('MaximizeOption',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('EmailToSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ApplyFilter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillPlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillPlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillPlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillPlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillSortingPremiumMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SortingPremiumMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SortingPremiumMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillSortingSumInsuredMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SortingSumInsuredMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('SortingSumInsuredMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillInsuranceCompanyA',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuranceCompanyA',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FillInsuranceCompanyB',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('InsuranceCompanyB',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundPrefixName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundMobileNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundFillEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundCallBackTime',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('OutboundAcceptTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CallMeBack',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('CallMeBackPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Boolean readOutputFromDataFile(Integer caseNumber,Map caseOutput){
		Boolean lreturn=false
		if(caseNumber<1){
			return lreturn
		}
		try{
			TestData lTestData=TestDataFactory.findTestData(this.OUTPUT_DATA_FILE_NAME)
			Integer dataColIndex=this.OUTPUT_DATA_COL_BEGIN+(caseNumber-1)
			Integer dataRowIndex=this.OUTPUT_DATA_ROW_BEGIN
			caseOutput.put('BaseUrl',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('MaximizeOption',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('EmailToSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ApplyFilter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillPlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillPlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillPlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillPlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillSortingBy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillSortingPremiumMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SortingPremiumMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SortingPremiumMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillSortingSumInsuredMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SortingSumInsuredMin',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SortingSumInsuredMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillInsuranceCompanyA',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuranceCompanyA',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FillInsuranceCompanyB',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('InsuranceCompanyB',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSave',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundPrefixName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundMobileNumber',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundFillEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundEmailAddress',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCallBackTime',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundAcceptTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CallMeBack',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CallMeBackPhoneNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultPlanPersonInfo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultSaveQuoteId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultNumberOfCards',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultSortingPremiumMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultSortingSumInsuredMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultPlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultPlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultPlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('DefaultPlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredSaveQuoteId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredNumberOfCards',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredSortingPremiumMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredSortingSumInsuredMinMax',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredInsuranceCompany',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredPlanCustomChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredPlanCustomHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredPlanCustomBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FilteredPlanCustomPurchaseWithLifeinsure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDisplayPlanId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanPaymentOptionAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardModalPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanTaxDeduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanActive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPlanWait',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardPromoText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreOutboundButtonName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsLumpsumAllInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsLumpsumNonInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsLumpsumAddInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSkinCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsAddBenefitsFuneralFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsAddBenefitsSecondExamFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsCoverOpd',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsAddBenefitsForGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailIsOtherCovid',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMoreCardDetailTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcFormMorePlanResultText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDisplayPlanId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanPaymentOptionAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardModalPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanTaxDeduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanActive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPlanWait',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardPromoText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcOutboundButtonName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsLumpsumAllInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsLumpsumNonInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsLumpsumAddInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsAddBenefitsSkinCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsAddBenefitsFuneralFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsAddBenefitsSecondExamFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsCoverOpd',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsAddBenefitsForGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailIsOtherCovid',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcCardDetailTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCpcOutboundPlanResultText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDisplayPlanId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanPaymentOptionAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardModalPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanTaxDeduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanActive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPlanWait',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardPromoText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreOutboundButtonName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsLumpsumAllInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsLumpsumNonInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsLumpsumAddInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsAddBenefitsSkinCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsAddBenefitsFuneralFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsAddBenefitsSecondExamFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsCoverOpd',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsAddBenefitsForGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailIsOtherCovid',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplFormMoreCardDetailTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDisplayPlanId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanType',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanCoverage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanPaymentOptionAmount',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardModalPaymentInstalment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanTaxDeduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanChemoTherapy',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanHospitalCash',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanBenefitsPa',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanRenew',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanActive',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPlanWait',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardPromoText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormOutboundButtonName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailPartnerName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailPlanName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsLumpsumAllInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsLumpsumNonInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsLumpsumAddInvasiveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsAddBenefitsSkinCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsAddBenefitsFuneralFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsAddBenefitsSecondExamFee',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsCoverOpd',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsAddBenefitsForGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailIsOtherCovid',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('OutboundCplPopupFormCardDetailTermAndCondition',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}