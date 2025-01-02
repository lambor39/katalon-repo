package org.roojai.tha.types.myaccount.newbiz
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THAMyAccountNewbizVerifyType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/MyAccountNewbiz/MyAccountNewbiz_00_Verify.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MyAccount_Newbiz.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='MyAccount_Newbiz_Verify'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=2
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=3
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/MyAccountNewbiz/MyAccountNewbiz_00_Verify.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_MyAccount_Newbiz.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='MyAccount_Newbiz_Verify'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=2
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=2
	public static final Integer OUTPUT_DATA_COL_BEGIN=3
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=3
	//Constant
	public static final String DEFAULT_MY_ACCOUNT_NEWBIZ_01_INPUT=''
	public static final String DEFAULT_MY_ACCOUNT_NEWBIZ_02_MAIN=''
	public static final String DEFAULT_ACTUAL_RESULT=''
	public Map Input=[:]
	public Map Output=[:]
	public THAMyAccountNewbizVerifyType(){
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
		this.Input.put('MyAccountNewbiz01Input',this.DEFAULT_MY_ACCOUNT_NEWBIZ_01_INPUT)
		this.Input.put('MyAccountNewbiz02Main',this.DEFAULT_MY_ACCOUNT_NEWBIZ_02_MAIN)
		this.Input.put('ActualResult',this.DEFAULT_ACTUAL_RESULT)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('MyAccountNewbiz01Input','')
		this.Output.put('MyAccountNewbiz02Main','')
		this.Output.put('ActualResult','')
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
			caseInput.put('MyAccountNewbiz01Input',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('MyAccountNewbiz02Main',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('MyAccountNewbiz01Input',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('MyAccountNewbiz02Main',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ActualResult',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}