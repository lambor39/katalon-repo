package org.roojai.tha.types.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAExtendedWarrantyQuotationInputFactory{
	public Boolean IsValid=false
	private lCaseList=[]
	public Integer CurrentCase=0
	public THAExtendedWarrantyQuotationInputFactory(TestData dataInput){
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
			lreturn=(dataColNum>=THAExtendedWarrantyQuotationInputType.INPUT_DATA_COL_BEGIN)&&(dataRowNum>=THAExtendedWarrantyQuotationInputType.INPUT_DATA_ROW_END)
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
			Integer dataColIndex=THAExtendedWarrantyQuotationInputType.INPUT_DATA_COL_BEGIN
			Integer dataRowIndex=THAExtendedWarrantyQuotationInputType.INPUT_DATA_ROW_BEGIN
			THAExtendedWarrantyQuotationInputType dataCase
			Map caseInput=[:]
			caseInput.clear()
			String cellVal=''
			for(dataColIndex=THAExtendedWarrantyQuotationInputType.INPUT_DATA_COL_BEGIN;dataColIndex<=dataColNum;dataColIndex++){
				dataCase=new THAExtendedWarrantyQuotationInputType()
				dataCase.initInput()
				dataCase.initOutput()
				caseInput.clear()
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('StartFromCmsFormMain',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('StartFromCmsFormMini',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsBaseUrlFormMain',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsBaseUrlFormMini',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsMaximizeMode',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsWithAuth',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsAuthUser',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsAuthPassword',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsLanguage',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsCarMake',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsCarModel',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsCarYear',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsCarSubmodel',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsKeepDetail',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('BaseUrl',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('MaximizeMode',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('WithAuth',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('AuthUser',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('AuthPassword',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('Version',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('Referrer',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('Language',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CarMake',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CarModel',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CarYear',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CarSubmodel',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CarOdometerReading',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredGenderAndMaritalStatus',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredPostalCode',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('PositiveCase',cellVal)
				}
				dataRowIndex=THAExtendedWarrantyQuotationInputType.INPUT_DATA_ROW_BEGIN
				dataCase.setInput(caseInput)
				this.lCaseList.add(dataCase)
			}
			this.IsValid=isValid
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public THAExtendedWarrantyQuotationInputType CaseData(){
		if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
			return this.lCaseList.get(this.CurrentCase-1)
		}
	}
	public Boolean SaveOutput(){
		Boolean lreturn=false
		THAExtendedWarrantyQuotationInputType caseData
		try{
			Integer dataColIndex=THAExtendedWarrantyQuotationInputType.OUTPUT_EXCEL_COL_BEGIN+(this.CurrentCase-1)
			Integer dataRowIndex=THAExtendedWarrantyQuotationInputType.OUTPUT_EXCEL_ROW_BEGIN
			if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
				caseData=this.lCaseList.get(this.CurrentCase-1)
				def xlsWorkbook=ExcelKeywords.getWorkbook(THAExtendedWarrantyQuotationInputType.OUTPUT_EXCEL_FILE_NAME)
				def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,THAExtendedWarrantyQuotationInputType.OUTPUT_EXCEL_SHEET_NAME)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('StartFromCmsFormMain').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('StartFromCmsFormMini').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsBaseUrlFormMain').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsBaseUrlFormMini').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsMaximizeMode').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsWithAuth').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsAuthUser').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsAuthPassword').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsLanguage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsCarMake').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsCarModel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsCarYear').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsCarSubmodel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsKeepDetail').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('BaseUrl').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('MaximizeMode').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('WithAuth').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('AuthUser').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('AuthPassword').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Version').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Referrer').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Language').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CarMake').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CarModel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CarYear').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CarSubmodel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CarOdometerReading').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredGenderAndMaritalStatus').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredPostalCode').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PositiveCase').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ActualResult').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostLanguage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostCarMake').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostCarModel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostCarYear').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostCarSubmodel').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PolicyInsurer').toString())
				dataRowIndex+=1
				IGNUemaHelper.saveExcelWorkbookByFileName(THAExtendedWarrantyQuotationInputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}