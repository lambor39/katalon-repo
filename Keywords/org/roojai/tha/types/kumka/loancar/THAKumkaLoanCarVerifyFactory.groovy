package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarVerifyFactory{
	public Boolean IsValid=false
	private lCaseList=[]
	public Integer CurrentCase=0
	public THAKumkaLoanCarVerifyFactory(TestData dataInput){
		super()
		this.initCaseList(dataInput)
	}
	public Boolean getIsValid(){
		return this.IsValid
	}
	public void setIsValid(Boolean isValid){
		//Do Nothing
		//this.IsValid=isValid
	}
	private void setlCaseList(java.lang.Object lCaseList){
		//Do Nothing
		//this.lCaseList=lCaseList
	}
	private java.lang.Object getlCaseList(){
		return lCaseList
	}
	public Integer getCurrentCase(){
		return this.CurrentCase
	}
	public void setCurrentCase(Integer currentCase){
		if(this.IsValid){
			if(currentCase<=this.lCaseList.size()){
				this.CurrentCase=currentCase
			}
		}
	}
	public Boolean validateDataInput(TestData dataInput){
		Boolean lreturn=false
		try{
			Integer dataColNum=dataInput.getColumnNumbers()
			Integer dataRowNum=dataInput.getRowNumbers()
			lreturn=(dataColNum>=THAKumkaLoanCarVerifyType.INPUT_DATA_COL_BEGIN)&&(dataRowNum>=THAKumkaLoanCarVerifyType.INPUT_DATA_ROW_END)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public void initCaseList(TestData dataInput){
		Boolean isValid=this.validateDataInput(dataInput)
		try{
			this.lCaseList.clear()
			Integer dataColNum=dataInput.getColumnNumbers()
			Integer dataRowNum=dataInput.getRowNumbers()
			Integer dataColIndex=THAKumkaLoanCarVerifyType.INPUT_DATA_COL_BEGIN
			Integer dataRowIndex=THAKumkaLoanCarVerifyType.INPUT_DATA_ROW_BEGIN
			THAKumkaLoanCarVerifyType dataCase
			Map caseInput=[:]
			caseInput.clear()
			String cellVal=''
			for(dataColIndex=THAKumkaLoanCarVerifyType.INPUT_DATA_COL_BEGIN;dataColIndex<=dataColNum;dataColIndex++){
				dataCase=new THAKumkaLoanCarVerifyType()
				dataCase.initInput()
				dataCase.initOutput()
				caseInput.clear()
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('KumkaLoanCar01Input',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('KumkaLoanCar02Result',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ActualResult',cellVal)
				}
				dataRowIndex=THAKumkaLoanCarVerifyType.INPUT_DATA_ROW_BEGIN
				dataCase.setInput(caseInput)
				this.lCaseList.add(dataCase)
			}
			this.IsValid=isValid
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public THAKumkaLoanCarVerifyType CaseData(){
		if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
			return this.lCaseList.get(this.CurrentCase-1)
		}
	}
	public Boolean SaveOutput(){
		Boolean lreturn=false
		THAKumkaLoanCarVerifyType caseData
		try{
			Integer dataColIndex=THAKumkaLoanCarVerifyType.OUTPUT_EXCEL_COL_BEGIN+(this.CurrentCase-1)
			Integer dataRowIndex=THAKumkaLoanCarVerifyType.OUTPUT_EXCEL_ROW_BEGIN
			if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
				caseData=this.lCaseList.get(this.CurrentCase-1)
				def xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaLoanCarVerifyType.OUTPUT_EXCEL_FILE_NAME)
				def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,THAKumkaLoanCarVerifyType.OUTPUT_EXCEL_SHEET_NAME)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('KumkaLoanCar01Input').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('KumkaLoanCar02Result').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ActualResult').toString())
				dataRowIndex+=1
				IGNUemaHelper.saveExcelWorkbookByFileName(THAKumkaLoanCarVerifyType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}