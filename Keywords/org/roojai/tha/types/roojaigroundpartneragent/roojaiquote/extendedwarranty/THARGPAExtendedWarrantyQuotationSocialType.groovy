package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
import org.roojai.tha.core.THAGlobalConst
public class THARGPAExtendedWarrantyQuotationSocialType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_06_Social.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Social.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=15
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=16
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_06_Social.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Social.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=18
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=19
	//Constant
	public static final String DEFAULT_BASE_URL='https://portal.uat-roojaipartners.com'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_RATING_FOR_OVERALL='5'
	public static final String DEFAULT_RATING_FOR_WEBSITE='5'
	public static final String DEFAULT_RATING_FOR_CALL_CENTER='5'
	public static final String DEFAULT_RATING_FOR_PRODUCT='5'
	public static final String DEFAULT_RATING_TEXT='RGPAExtendedWarranty Great Products and Services'
	public static final String DEFAULT_WITH_FACEBOOK='Yes'
	public static final String DEFAULT_FACEBOOK_LOGIN_ID=THAGlobalConst.DEFAULT_FACEBOOK_ACCOUNT
	public static final String DEFAULT_FACEBOOK_LOGIN_PASSWORD=THAGlobalConst.DEFAULT_FACEBOOK_PASSWORD
	public static final String DEFAULT_SHARE_FACEBOOK='No'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THARGPAExtendedWarrantyQuotationSocialType(){
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
		this.Input.put('RatingForOverall',this.DEFAULT_RATING_FOR_OVERALL)
		this.Input.put('RatingForWebsite',this.DEFAULT_RATING_FOR_WEBSITE)
		this.Input.put('RatingForCallCenter',this.DEFAULT_RATING_FOR_CALL_CENTER)
		this.Input.put('RatingForProduct',this.DEFAULT_RATING_FOR_PRODUCT)
		this.Input.put('RatingText',this.DEFAULT_RATING_TEXT)
		this.Input.put('WithFacebook',this.DEFAULT_WITH_FACEBOOK)
		this.Input.put('FacebookLoginId',this.DEFAULT_FACEBOOK_LOGIN_ID)
		this.Input.put('FacebookLoginPassword',this.DEFAULT_FACEBOOK_LOGIN_PASSWORD)
		this.Input.put('ShareFacebook',this.DEFAULT_SHARE_FACEBOOK)
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
		this.Output.put('RatingForOverall','')
		this.Output.put('RatingForWebsite','')
		this.Output.put('RatingForCallCenter','')
		this.Output.put('RatingForProduct','')
		this.Output.put('RatingText','')
		this.Output.put('WithFacebook','')
		this.Output.put('FacebookLoginId','')
		this.Output.put('FacebookLoginPassword','')
		this.Output.put('ShareFacebook','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('PolicyInsurer','')
		this.Output.put('PolicyPaymentDetail','')
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
			caseInput.put('RatingForOverall',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RatingForWebsite',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RatingForCallCenter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RatingForProduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('RatingText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('WithFacebook',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FacebookLoginId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('FacebookLoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ShareFacebook',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('RatingForOverall',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RatingForWebsite',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RatingForCallCenter',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RatingForProduct',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('RatingText',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('WithFacebook',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FacebookLoginId',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('FacebookLoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ShareFacebook',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyInsurer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PolicyPaymentDetail',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}