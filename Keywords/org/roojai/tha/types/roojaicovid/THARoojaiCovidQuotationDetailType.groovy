package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THARoojaiCovidQuotationDetailType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiCovid/RoojaiCovid_02_Detail.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiCovid.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='RoojaiCovid_Detail.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=36
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=37
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiCovid/RoojaiCovid_02_Detail.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiCovid.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='RoojaiCovid_Detail.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=42
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=43
	//Constant
	public static final String DEFAULT_BASE_URL='https://www.uat-roojai.com/covid'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='EN'
	public static final String DEFAULT_HOLDER_BASIC_INFO_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_GENDER_STATUS='1'
	public static final String DEFAULT_HOLDER_NAME=''
	public static final String DEFAULT_HOLDER_SURNAME=''
	public static final String DEFAULT_HOLDER_DOB='01/01/1988'
	public static final String DEFAULT_HOLDER_IS_THAI='Yes'
	public static final String DEFAULT_HOLDER_ID_POSITIVE_CASE='Yes'
	public static final String DEFAULT_HOLDER_THAI_ID='8659331161743'
	public static final String DEFAULT_HOLDER_PASSPORT='KMHD25LE1DU'
	public static final String DEFAULT_HOLDER_EMAIL_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_EMAIL=''
	public static final String DEFAULT_HOLDER_MOBILE_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_MOBILE=''
	public static final String DEFAULT_ADDRESS_POSTAL_CODE='10260'
	public static final String DEFAULT_ADDRESS_PROVINCE='Bangkok'
	public static final String DEFAULT_ADDRESS_DISTRICT='Bangna'
	public static final String DEFAULT_ADDRESS_SUB_DISTRICT='Bangna'
	public static final String DEFAULT_ADDRESS_HOUSE_NO_POSITIVE_CASE='No'
	public static final String DEFAULT_ADDRESS_HOUSE_NO=''
	public static final String DEFAULT_ADDRESS_BUILDING=''
	public static final String DEFAULT_ADDRESS_ROAD=''
	public static final String DEFAULT_ADDRESS_MOO_POSITIVE_CASE='No'
	public static final String DEFAULT_ADDRESS_MOO=''
	public static final String DEFAULT_BENEFICIARY_LEGAL='Yes'
	public static final String DEFAULT_BENEFICIARY_OTHER_POSITIVE_CASE='No'
	public static final String DEFAULT_BENEFICIARY_OTHER_RELATION='1'
	public static final String DEFAULT_BENEFICIARY_OTHER_NAME=''
	public static final String DEFAULT_BENEFICIARY_OTHER_SURNAME=''
	public static final String DEFAULT_CONFIRM_INFO='Yes'
	public static final String DEFAULT_CONFIRM_DISCLOSURE='Yes'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THARoojaiCovidQuotationDetailType(){
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
		this.Input.put('MaximizeMode',this.DEFAULT_MAXIMIZE_MODE)
		this.Input.put('WithAuth',this.DEFAULT_WITH_AUTH)
		this.Input.put('AuthUser',this.DEFAULT_AUTH_USER)
		this.Input.put('AuthPassword',this.DEFAULT_AUTH_PASSWORD)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('HolderBasicInfoPositiveCase',this.DEFAULT_HOLDER_BASIC_INFO_POSITIVE_CASE)
		this.Input.put('HolderGenderStatus',this.DEFAULT_HOLDER_GENDER_STATUS)
		this.Input.put('HolderName',this.DEFAULT_HOLDER_NAME)
		this.Input.put('HolderSurname',this.DEFAULT_HOLDER_SURNAME)
		this.Input.put('HolderDob',this.DEFAULT_HOLDER_DOB)
		this.Input.put('HolderIsThai',this.DEFAULT_HOLDER_IS_THAI)
		this.Input.put('HolderIdPositiveCase',this.DEFAULT_HOLDER_ID_POSITIVE_CASE)
		this.Input.put('HolderThaiId',this.DEFAULT_HOLDER_THAI_ID)
		this.Input.put('HolderPassport',this.DEFAULT_HOLDER_PASSPORT)
		this.Input.put('HolderEmailPositiveCase',this.DEFAULT_HOLDER_EMAIL_POSITIVE_CASE)
		this.Input.put('HolderEmail',this.DEFAULT_HOLDER_EMAIL)
		this.Input.put('HolderMobilePositiveCase',this.DEFAULT_HOLDER_MOBILE_POSITIVE_CASE)
		this.Input.put('HolderMobile',this.DEFAULT_HOLDER_MOBILE)
		this.Input.put('AddressPostalCode',this.DEFAULT_ADDRESS_POSTAL_CODE)
		this.Input.put('AddressProvince',this.DEFAULT_ADDRESS_PROVINCE)
		this.Input.put('AddressDistrict',this.DEFAULT_ADDRESS_DISTRICT)
		this.Input.put('AddressSubDistrict',this.DEFAULT_ADDRESS_SUB_DISTRICT)
		this.Input.put('AddressHouseNoPositiveCase',this.DEFAULT_ADDRESS_HOUSE_NO_POSITIVE_CASE)
		this.Input.put('AddressHouseNo',this.DEFAULT_ADDRESS_HOUSE_NO)
		this.Input.put('AddressBuilding',this.DEFAULT_ADDRESS_BUILDING)
		this.Input.put('AddressRoad',this.DEFAULT_ADDRESS_ROAD)
		this.Input.put('AddressMooPositiveCase',this.DEFAULT_ADDRESS_MOO_POSITIVE_CASE)
		this.Input.put('AddressMoo',this.DEFAULT_ADDRESS_MOO)
		this.Input.put('BeneficiaryLegal',this.DEFAULT_BENEFICIARY_LEGAL)
		this.Input.put('BeneficiaryOtherPositiveCase',this.DEFAULT_BENEFICIARY_OTHER_POSITIVE_CASE)
		this.Input.put('BeneficiaryOtherRelation',this.DEFAULT_BENEFICIARY_OTHER_RELATION)
		this.Input.put('BeneficiaryOtherName',this.DEFAULT_BENEFICIARY_OTHER_NAME)
		this.Input.put('BeneficiaryOtherSurname',this.DEFAULT_BENEFICIARY_OTHER_SURNAME)
		this.Input.put('ConfirmInfo',this.DEFAULT_CONFIRM_INFO)
		this.Input.put('ConfirmDisclosure',this.DEFAULT_CONFIRM_DISCLOSURE)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Language','')
		this.Output.put('HolderBasicInfoPositiveCase','')
		this.Output.put('HolderGenderStatus','')
		this.Output.put('HolderName','')
		this.Output.put('HolderSurname','')
		this.Output.put('HolderDob','')
		this.Output.put('HolderIsThai','')
		this.Output.put('HolderIdPositiveCase','')
		this.Output.put('HolderThaiId','')
		this.Output.put('HolderPassport','')
		this.Output.put('HolderEmailPositiveCase','')
		this.Output.put('HolderEmail','')
		this.Output.put('HolderMobilePositiveCase','')
		this.Output.put('HolderMobile','')
		this.Output.put('AddressPostalCode','')
		this.Output.put('AddressProvince','')
		this.Output.put('AddressDistrict','')
		this.Output.put('AddressSubDistrict','')
		this.Output.put('AddressHouseNoPositiveCase','')
		this.Output.put('AddressHouseNo','')
		this.Output.put('AddressBuilding','')
		this.Output.put('AddressRoad','')
		this.Output.put('AddressMooPositiveCase','')
		this.Output.put('AddressMoo','')
		this.Output.put('BeneficiaryLegal','')
		this.Output.put('BeneficiaryOtherPositiveCase','')
		this.Output.put('BeneficiaryOtherRelation','')
		this.Output.put('BeneficiaryOtherName','')
		this.Output.put('BeneficiaryOtherSurname','')
		this.Output.put('ConfirmInfo','')
		this.Output.put('ConfirmDisclosure','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('PolicyDetail','')
		this.Output.put('SummaryPrice','')
		this.Output.put('PolicyInsurer','')
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('Language','')
		this.Output.put('HolderBasicInfoPositiveCase','')
		this.Output.put('HolderGenderStatus','')
		this.Output.put('HolderName','')
		this.Output.put('HolderSurname','')
		this.Output.put('HolderDob','')
		this.Output.put('HolderIsThai','')
		this.Output.put('HolderIdPositiveCase','')
		this.Output.put('HolderThaiId','')
		this.Output.put('HolderPassport','')
		this.Output.put('HolderEmailPositiveCase','')
		this.Output.put('HolderEmail','')
		this.Output.put('HolderMobilePositiveCase','')
		this.Output.put('HolderMobile','')
		this.Output.put('AddressPostalCode','')
		this.Output.put('AddressProvince','')
		this.Output.put('AddressDistrict','')
		this.Output.put('AddressSubDistrict','')
		this.Output.put('AddressHouseNoPositiveCase','')
		this.Output.put('AddressHouseNo','')
		this.Output.put('AddressBuilding','')
		this.Output.put('AddressRoad','')
		this.Output.put('BeneficiaryLegal','')
		this.Output.put('BeneficiaryOtherPositiveCase','')
		this.Output.put('BeneficiaryOtherRelation','')
		this.Output.put('BeneficiaryOtherName','')
		this.Output.put('BeneficiaryOtherSurname','')
		this.Output.put('ConfirmInfo','')
		this.Output.put('ConfirmDisclosure','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
		this.Output.put('PolicyDetail','')
		this.Output.put('SummaryPrice','')
		this.Output.put('PolicyInsurer','')
		this.Output.put('CoveragePeriod','')
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
			caseInput.put('MaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderBasicInfoPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderGenderStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderIsThai',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderIdPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderThaiId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderPassport',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderEmailPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderMobilePositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderMobile',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressProvince',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressSubDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressHouseNoPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressHouseNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressBuilding',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressRoad',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressMooPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('AddressMoo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BeneficiaryLegal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BeneficiaryOtherPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BeneficiaryOtherRelation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BeneficiaryOtherName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('BeneficiaryOtherSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ConfirmInfo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ConfirmDisclosure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('MaximizeMode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('WithAuth',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AuthPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderBasicInfoPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderGenderStatus',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderIsThai',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderIdPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderThaiId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderPassport',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderEmailPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderEmail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderMobilePositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderMobile',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressPostalCode',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressProvince',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressSubDistrict',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressHouseNoPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressHouseNo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressBuilding',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressRoad',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressMooPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('AddressMoo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BeneficiaryLegal',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BeneficiaryOtherPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BeneficiaryOtherRelation',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BeneficiaryOtherName',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('BeneficiaryOtherSurname',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ConfirmInfo',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ConfirmDisclosure',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyDetail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('SummaryPrice',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('CoveragePeriod',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}