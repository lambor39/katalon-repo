package org.roojai.tha.types.roojaipersonalaccident
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAPersonalAccidentQuotationInputFactory{
	public Boolean IsValid=false
	private lCaseList=[]
	public Integer CurrentCase=0
	public THAPersonalAccidentQuotationInputFactory(TestData dataInput){
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
			lreturn=(dataColNum>=THAPersonalAccidentQuotationInputType.INPUT_DATA_COL_BEGIN)&&(dataRowNum>=THAPersonalAccidentQuotationInputType.INPUT_DATA_ROW_END)
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
			Integer dataColIndex=THAPersonalAccidentQuotationInputType.INPUT_DATA_COL_BEGIN
			Integer dataRowIndex=THAPersonalAccidentQuotationInputType.INPUT_DATA_ROW_BEGIN
			THAPersonalAccidentQuotationInputType dataCase
			Map caseInput=[:]
			caseInput.clear()
			String cellVal=''
			for(dataColIndex=THAPersonalAccidentQuotationInputType.INPUT_DATA_COL_BEGIN;dataColIndex<=dataColNum;dataColIndex++){
				dataCase=new THAPersonalAccidentQuotationInputType()
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
					caseInput.put('CmsGenderAndMaritalStatus',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsBirthDateMain',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsInsuredOccupation',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('CmsInsuredSalary',cellVal)
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
					caseInput.put('Language',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredGenderAndMaritalStatus',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredBirthDate',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredOccupation',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('InsuredSalary',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryPersonalAccidentInsurance',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryInsuredDeniedCoverage',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryAccidentOrInjury',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryReceivedMedicalTreatment',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHypertensionBloodPositive',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion01',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion02',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion03',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion04',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion05',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion06',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion07',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion08',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion09',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryOtherQuestion10',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('PositiveCase',cellVal)
				}
				dataRowIndex=THAPersonalAccidentQuotationInputType.INPUT_DATA_ROW_BEGIN
				dataCase.setInput(caseInput)
				this.lCaseList.add(dataCase)
			}
			this.IsValid=isValid
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public THAPersonalAccidentQuotationInputType CaseData(){
		if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
			return this.lCaseList.get(this.CurrentCase-1)
		}
	}
	public Boolean SaveOutput(){
		Boolean lreturn=false
		THAPersonalAccidentQuotationInputType caseData
		try{
			Integer dataColIndex=THAPersonalAccidentQuotationInputType.OUTPUT_EXCEL_COL_BEGIN+(this.CurrentCase-1)
			Integer dataRowIndex=THAPersonalAccidentQuotationInputType.OUTPUT_EXCEL_ROW_BEGIN
			if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
				caseData=this.lCaseList.get(this.CurrentCase-1)
				def xlsWorkbook=ExcelKeywords.getWorkbook(THAPersonalAccidentQuotationInputType.OUTPUT_EXCEL_FILE_NAME)
				def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,THAPersonalAccidentQuotationInputType.OUTPUT_EXCEL_SHEET_NAME)
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
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsGenderAndMaritalStatus').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsBirthDateMain').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsInsuredOccupation').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsInsuredSalary').toString())
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
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Language').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredGenderAndMaritalStatus').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredBirthDate').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredOccupation').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredSalary').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryPersonalAccidentInsurance').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryInsuredDeniedCoverage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryAccidentOrInjury').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryReceivedMedicalTreatment').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHypertensionBloodPositive').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion01').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion02').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion03').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion04').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion05').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion06').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion07').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion08').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion09').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryOtherQuestion10').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PositiveCase').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ActualResult').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ResultMessage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostLanguage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostGenderAndMaritalStatus').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostBirthDateMain').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostInsuredOccupation').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('CmsPostInsuredSalary').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PolicyInsurer').toString())
				dataRowIndex+=1
				IGNUemaHelper.saveExcelWorkbookByFileName(THAPersonalAccidentQuotationInputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}