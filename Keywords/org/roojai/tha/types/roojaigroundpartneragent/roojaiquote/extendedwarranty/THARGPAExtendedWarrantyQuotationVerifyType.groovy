package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData
public class THARGPAExtendedWarrantyQuotationVerifyType{
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_00_Verify.Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Verify'
	public static final Integer INPUT_EXCEL_COL_BEGIN=2
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=6
	public static final Integer INPUT_DATA_COL_BEGIN=3
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=7
	public static final String OUTPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGroundPartnerAgentExtendedWarranty/RGPAExtendedWarranty_Quotation_00_Verify.Output'
	public static final String OUTPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RGPAExtendedWarranty_Quotation_Website.xlsx'
	public static final String OUTPUT_EXCEL_SHEET_NAME='ExtendedWarranty_Verify'
	public static final Integer OUTPUT_EXCEL_COL_BEGIN=2
	public static final Integer OUTPUT_EXCEL_ROW_BEGIN=1
	public static final Integer OUTPUT_EXCEL_ROW_END=6
	public static final Integer OUTPUT_DATA_COL_BEGIN=3
	public static final Integer OUTPUT_DATA_ROW_BEGIN=1
	public static final Integer OUTPUT_DATA_ROW_END=7
	//Constant
	public static final String DEFAULT_EXTENDED_WARRANTY_01_INPUT=''
	public static final String DEFAULT_EXTENDED_WARRANTY_02_RESULT=''
	public static final String DEFAULT_EXTENDED_WARRANTY_03_DETAIL1=''
	public static final String DEFAULT_EXTENDED_WARRANTY_04_PAYMENT=''
	public static final String DEFAULT_EXTENDED_WARRANTY_05_DETAIL2=''
	public static final String DEFAULT_EXTENDED_WARRANTY_06_SOCIAL=''
	public static final String DEFAULT_ACTUAL_RESULT=''
	public Map Input=[:]
	public Map Output=[:]
	public THARGPAExtendedWarrantyQuotationVerifyType(){
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
		this.Input.put('ExtendedWarranty01Input',this.DEFAULT_EXTENDED_WARRANTY_01_INPUT)
		this.Input.put('ExtendedWarranty02Result',this.DEFAULT_EXTENDED_WARRANTY_02_RESULT)
		this.Input.put('ExtendedWarranty03Detail1',this.DEFAULT_EXTENDED_WARRANTY_03_DETAIL1)
		this.Input.put('ExtendedWarranty04Payment',this.DEFAULT_EXTENDED_WARRANTY_04_PAYMENT)
		this.Input.put('ExtendedWarranty05Detail2',this.DEFAULT_EXTENDED_WARRANTY_05_DETAIL2)
		this.Input.put('ExtendedWarranty06Social',this.DEFAULT_EXTENDED_WARRANTY_06_SOCIAL)
		this.Input.put('ActualResult',this.DEFAULT_ACTUAL_RESULT)
	}
	public void initOutput(){
		this.Output.clear()
		this.Output.put('ExtendedWarranty01Input','')
		this.Output.put('ExtendedWarranty02Result','')
		this.Output.put('ExtendedWarranty03Detail1','')
		this.Output.put('ExtendedWarranty04Payment','')
		this.Output.put('ExtendedWarranty05Detail2','')
		this.Output.put('ExtendedWarranty06Social','')
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
			caseInput.put('ExtendedWarranty01Input',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExtendedWarranty02Result',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExtendedWarranty03Detail1',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExtendedWarranty04Payment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExtendedWarranty05Detail2',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseInput.put('ExtendedWarranty06Social',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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
			caseOutput.put('ExtendedWarranty01Input',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExtendedWarranty02Result',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExtendedWarranty03Detail1',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExtendedWarranty04Payment',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExtendedWarranty05Detail2',lTestData.getValue(dataColIndex,dataRowIndex).trim())
			dataRowIndex+=1
			caseOutput.put('ExtendedWarranty06Social',lTestData.getValue(dataColIndex,dataRowIndex).trim())
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