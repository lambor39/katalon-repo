package org.roojai.tha.types.roojaigroundpartneragent.criticalillness
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARGPACriticalIllnessQuotationInputFactory{
	public Boolean IsValid=false
	private lCaseList=[]
	public Integer CurrentCase=0
	public THARGPACriticalIllnessQuotationInputFactory(TestData dataInput){
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
			lreturn=(dataColNum>=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_COL_BEGIN)&&(dataRowNum>=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_ROW_END)
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
			Integer dataColIndex=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_COL_BEGIN
			Integer dataRowIndex=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_ROW_BEGIN
			THARGPACriticalIllnessQuotationInputType dataCase
			Map caseInput=[:]
			caseInput.clear()
			String cellVal=''
			for(dataColIndex=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_COL_BEGIN;dataColIndex<=dataColNum;dataColIndex++){
				dataCase=new THARGPACriticalIllnessQuotationInputType()
				dataCase.initInput()
				dataCase.initOutput()
				caseInput.clear()
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
					caseInput.put('GroundPartnerAgentLoginMethod',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('GroundPartnerAgentAccountSource',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('GroundPartnerAgentUrlProductSelect',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('GroundPartnerAgentUser',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('GroundPartnerAgentPassword',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('GroundPartnerAgentLanguage',cellVal)
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
					caseInput.put('GenderAndMaritalStatus',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('BirthDateMain',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('Height',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('Weight',cellVal)
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
					caseInput.put('SmokingHabbit',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHealthCondition',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryInsuredDeniedCoverage',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryDiedFromCriticalIllnesses',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryIndustry',cellVal)
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
					caseInput.put('QueryHospitalIncomeBenefitToDo',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion01',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion02',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion03',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion04',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion05',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion06',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion07',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion08',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion09',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('QueryHospitalIncomeBenefitQuestion10',cellVal)
				}
				dataRowIndex+=1
				cellVal=dataInput.getValue(dataColIndex,dataRowIndex).trim()
				if(cellVal.length()>0){
					caseInput.put('PositiveCase',cellVal)
				}
				dataRowIndex=THARGPACriticalIllnessQuotationInputType.INPUT_DATA_ROW_BEGIN
				dataCase.setInput(caseInput)
				this.lCaseList.add(dataCase)
			}
			this.IsValid=isValid
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public THARGPACriticalIllnessQuotationInputType CaseData(){
		if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
			return this.lCaseList.get(this.CurrentCase-1)
		}
	}
	public Boolean SaveOutput(){
		Boolean lreturn=false
		THARGPACriticalIllnessQuotationInputType caseData
		try{
			Integer dataColIndex=THARGPACriticalIllnessQuotationInputType.OUTPUT_EXCEL_COL_BEGIN+(this.CurrentCase-1)
			Integer dataRowIndex=THARGPACriticalIllnessQuotationInputType.OUTPUT_EXCEL_ROW_BEGIN
			if((this.CurrentCase>0)&&(this.lCaseList.size()>0)){
				caseData=this.lCaseList.get(this.CurrentCase-1)
				def xlsWorkbook=ExcelKeywords.getWorkbook(THARGPACriticalIllnessQuotationInputType.OUTPUT_EXCEL_FILE_NAME)
				def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,THARGPACriticalIllnessQuotationInputType.OUTPUT_EXCEL_SHEET_NAME)
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
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentLoginMethod').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentAccountSource').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentUrlProductSelect').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentUser').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentPassword').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentLanguage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Version').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Language').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GenderAndMaritalStatus').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('BirthDateMain').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Height').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('Weight').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredOccupation').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('InsuredSalary').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('SmokingHabbit').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHealthCondition').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryInsuredDeniedCoverage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryDiedFromCriticalIllnesses').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryIndustry').toString())
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
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitToDo').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion01').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion02').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion03').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion04').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion05').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion06').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion07').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion08').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion09').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('QueryHospitalIncomeBenefitQuestion10').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PositiveCase').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ActualResult').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('ResultMessage').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('GroundPartnerAgentSkipLoginUrl').toString())
				dataRowIndex+=1
				ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,dataColIndex,caseData.Output.get('PolicyInsurer').toString())
				dataRowIndex+=1
				IGNUemaHelper.saveExcelWorkbookByFileName(THARGPACriticalIllnessQuotationInputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}