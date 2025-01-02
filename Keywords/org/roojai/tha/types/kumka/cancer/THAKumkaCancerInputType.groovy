package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAKumkaCancerInputType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaCancer/KumkaCancer_01_Input.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_Cancer_Kumka.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='Cancer_Input.Input'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=19
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=20
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/KumkaCancer/KumkaCancer_01_Input.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_Cancer_Kumka.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='Cancer_Input.Output'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=21
	public static final Integer OUTPUT_DATA_COL_BEGIN=2
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=22
	//Constant
	public static final String DEFAULT_BASE_URL='https://compare.uat-mrkumka.com/cancer'
	public static final String DEFAULT_MAXIMIZE_MODE='No'
	public static final String DEFAULT_WITH_AUTH='No'
	public static final String DEFAULT_AUTH_USER='demo'
	public static final String DEFAULT_AUTH_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_LOGIN_USER='demo'
	public static final String DEFAULT_LOGIN_PASSWORD='DemoRoojai#99'
	public static final String DEFAULT_VERSION='A'
	public static final String DEFAULT_LANGUAGE='TH'
	public static final String DEFAULT_HOLDER_GENDER='1'
	public static final String DEFAULT_HOLDER_DOB_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_DOB=''
	public static final String DEFAULT_HOLDER_HEIGHT_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_HEIGHT=''
	public static final String DEFAULT_HOLDER_WEIGHT_POSITIVE_CASE='No'
	public static final String DEFAULT_HOLDER_WEIGHT=''
	public static final String DEFAULT_HOLDER_SMOKING='No'
	public static final String DEFAULT_HOLDER_DRINKING='No'
	public static final String DEFAULT_HOLDER_HAVE_CANCER='No'
	public static final String DEFAULT_POSITIVE_CASE='Yes'
	public Map Input=[:]
	public Map Output=[:]
	public THAKumkaCancerInputType(){
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
		this.Input.put('LoginUser',this.DEFAULT_LOGIN_USER)
		this.Input.put('LoginPassword',this.DEFAULT_LOGIN_PASSWORD)
		this.Input.put('Version',this.DEFAULT_VERSION)
		this.Input.put('Language',this.DEFAULT_LANGUAGE)
		this.Input.put('HolderGender',this.DEFAULT_HOLDER_GENDER)
		this.Input.put('HolderDobPositiveCase',this.DEFAULT_HOLDER_DOB_POSITIVE_CASE)
		this.Input.put('HolderDob',this.DEFAULT_HOLDER_DOB)
		this.Input.put('HolderHeightPositiveCase',this.DEFAULT_HOLDER_HEIGHT_POSITIVE_CASE)
		this.Input.put('HolderHeight',this.DEFAULT_HOLDER_HEIGHT)
		this.Input.put('HolderWeightPositiveCase',this.DEFAULT_HOLDER_WEIGHT_POSITIVE_CASE)
		this.Input.put('HolderWeight',this.DEFAULT_HOLDER_WEIGHT)
		this.Input.put('HolderSmoking',this.DEFAULT_HOLDER_SMOKING)
		this.Input.put('HolderDrinking',this.DEFAULT_HOLDER_DRINKING)
		this.Input.put('HolderHaveCancer',this.DEFAULT_HOLDER_HAVE_CANCER)
		this.Input.put('PositiveCase',this.DEFAULT_POSITIVE_CASE)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('BaseUrl','')
		this.Output.put('MaximizeMode','')
		this.Output.put('WithAuth','')
		this.Output.put('AuthUser','')
		this.Output.put('AuthPassword','')
		this.Output.put('LoginUser','')
		this.Output.put('LoginPassword','')
		this.Output.put('Version','')
		this.Output.put('Language','')
		this.Output.put('HolderGender','')
		this.Output.put('HolderDobPositiveCase','')
		this.Output.put('HolderDob','')
		this.Output.put('HolderHeightPositiveCase','')
		this.Output.put('HolderHeight','')
		this.Output.put('HolderWeightPositiveCase','')
		this.Output.put('HolderWeight','')
		this.Output.put('HolderSmoking','')
		this.Output.put('HolderDrinking','')
		this.Output.put('HolderHaveCancer','')
		this.Output.put('PositiveCase','')
		this.Output.put('ActualResult','')
		this.Output.put('ResultMessage','')
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
			caseInput.put('LoginUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('LoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderHeightPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderHeight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderWeightPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderWeight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderSmoking',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderDrinking',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('HolderHaveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('LoginUser',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('LoginPassword',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Version',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('Language',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderGender',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderDobPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderDob',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderHeightPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderHeight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderWeightPositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderWeight',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderSmoking',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderDrinking',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('HolderHaveCancer',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('PositiveCase',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ResultMessage',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}