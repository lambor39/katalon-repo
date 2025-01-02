package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARGPAExtendedWarrantyQuotationVerifyFactory{
	public Boolean IsValid=false
	private lCaseList=[]
	public Integer CurrentCase=0
	public THARGPAExtendedWarrantyQuotationVerifyFactory(TestData dataInput){
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
			lreturn=(dataColNum>=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_COL_BEGIN)&&(dataRowNum>=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_ROW_END)
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
			Integer dataColIndex=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_COL_BEGIN
			Integer dataRowIndex=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_ROW_BEGIN
			THARGPAExtendedWarrantyQuotationVerifyType dataCase
			Map caseInput=[:]
			caseInput.clear()
			String cellVal=''
			for(dataColIndex=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_COL_BEGIN;dataColIndex<=dataColNum;dataColIndex++){
				dataCase=new THARGPAExtendedWarrantyQuotationVerifyType()
				dataCase.initInput()
				dataCase.initOutput()
				caseInput.clear()
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty01Input',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty02Result',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty03Detail1',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty04Payment',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty05Detail2',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ExtendedWarranty06Social',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('ActualResult',cellVal)
				}
				dataRowIndex=THARGPAExtendedWarrantyQuotationVerifyType.INPUT_DATA_ROW_BEGIN
				dataCase.setInput(caseInput)
				this.lCaseList.add(dataCase)
			}
			this.IsValid=isValid
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public THARGPAExtendedWarrantyQuotationVerifyType CaseData(){
		if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
			return this.lCaseList.get(this.CurrentCase-1)
		}
	}
	public Boolean SaveOutput(){
		Boolean lreturn=false
		THARGPAExtendedWarrantyQuotationVerifyType caseData
		try{
			Integer dataColIndex=THARGPAExtendedWarrantyQuotationVerifyType.OUTPUT_EXCEL_COL_BEGIN+(this.CurrentCase-1)
			Integer dataRowIndex=THARGPAExtendedWarrantyQuotationVerifyType.OUTPUT_EXCEL_ROW_BEGIN
			if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
				caseData=this.lCaseList.get(this.CurrentCase-1)
				def xlsWorkbook=ExcelKeywords.getWorkbook(THARGPAExtendedWarrantyQuotationVerifyType.OUTPUT_EXCEL_FILE_NAME)
				def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,THARGPAExtendedWarrantyQuotationVerifyType.OUTPUT_EXCEL_SHEET_NAME)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty01Input').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty02Result').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty03Detail1').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty04Payment').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty05Detail2').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ExtendedWarranty06Social').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ActualResult').toString())
				dataRowIndex+=1
				IGNUemaHelper.saveExcelWorkbookByFileName(THARGPAExtendedWarrantyQuotationVerifyType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}