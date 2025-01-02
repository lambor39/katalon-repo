package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarResult_OutputFactory{
	private lOutputList=[]
	public Boolean IsDefaultOutput=true
	public Integer CurrentCase=0
	public Boolean IsValidTemplate=false
	public THAKumkaLoanCarResult_OutputFactory(Boolean isDefaultOutput,Integer currentCase){
		super()
		this.setIsDefaultOutput(isDefaultOutput)
		this.setCurrentCase(currentCase)
		this.initOutputList()
	}
	private void setlOutputList(java.lang.Object newlOutputList){
		//Do Nothing
		//this.lOutputList=lOutputList
	}
	private java.lang.Object getlOutputList(){
		return this.lOutputList
	}
	public Boolean getIsDefaultOutput(){
		return this.IsDefaultOutput
	}
	public void setIsDefaultOutput(Boolean isDefaultOutput){
		this.IsDefaultOutput=isDefaultOutput
	}
	public Integer getCurrentCase(){
		return this.CurrentCase
	}
	public void setCurrentCase(Integer currentCase){
		if((currentCase>=1)&&(currentCase<=99)){
			this.CurrentCase=currentCase
		}
	}
	public Boolean getIsValidTemplate(){
		return this.IsValidTemplate
	}
	public void setIsValidTemplate(Boolean isValidTemplate){
		//Do Nothing
		//this.IsValidTemplate=isValidTemplate
	}
	public Boolean validateTemplate(){
		Boolean lreturn=false
		if(this.CurrentCase<=0){
			return lreturn
		}
		try{
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			String lOutputExcelSheetName=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=0
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
					lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
					if(!lExcelCell){
						lIsValid=false
						break
					}
					lCellStr=lExcelCell.getStringCellValue().trim()
					if(lCellStr.length()>0){
						lIsValid=true
					}else{
						lIsValid=false
						break
					}
				}
				lreturn=lIsValid
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public void initOutputList(){
		Boolean lIsValidTemplate=this.validateTemplate()
		try{
			this.lOutputList.clear()
			this.IsValidTemplate=lIsValidTemplate
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	public Boolean addMapItemToOutputList(Map mapItemOutput){
		Boolean lreturn=false
		if(!mapItemOutput){
			return lreturn
		}
		try{
			String lDisplayPlanId=mapItemOutput.DisplayPlanId.toString().trim()
			String lItemDisabled=mapItemOutput.ItemDisabled.toString().trim()
			String lBankName=mapItemOutput.BankName.toString().trim()
			String lPlanName=mapItemOutput.PlanName.toString().trim()
			String lPlanLoanType=mapItemOutput.PlanLoanType.toString().trim()
			String lGuarantorRequired=mapItemOutput.GuarantorRequired.toString().trim()
			String lCarInspectionRequired=mapItemOutput.CarInspectionRequired.toString().trim()
			String lCarInsuranceRequired=mapItemOutput.CarInsuranceRequired.toString().trim()
			String lPromotionText=mapItemOutput.PromotionText.toString().trim()
			String lLoanAmount=mapItemOutput.LoanAmount.toString().trim()
			String lMaxLoanAmount=mapItemOutput.MaxLoanAmount.toString().trim()
			String lLoanTerm=mapItemOutput.LoanTerm.toString().trim()
			String lMonthlyInstalment=mapItemOutput.MonthlyInstalment.toString().trim()
			String lRatePerMonth=mapItemOutput.RatePerMonth.toString().trim()
			String lTotalInterest=mapItemOutput.TotalInterest.toString().trim()
			String lTotalVat=mapItemOutput.TotalVat.toString().trim()
			String lTotalPayment=mapItemOutput.TotalPayment.toString().trim()
			String lTotalFee=mapItemOutput.TotalFee.toString().trim()
			String lApprovalDateMessage=mapItemOutput.ApprovalDateMessage.toString().trim()
			String lSelectedLoanAmount=mapItemOutput.SelectedLoanAmount.toString().trim()
			String lSelectedMaxLoanAmount=mapItemOutput.SelectedMaxLoanAmount.toString().trim()
			String lSelectedLoanTerm=mapItemOutput.SelectedLoanTerm.toString().trim()
			String lSelectedMonthlyInstalment=mapItemOutput.SelectedMonthlyInstalment.toString().trim()
			String lSelectedRatePerMonth=mapItemOutput.SelectedRatePerMonth.toString().trim()
			String lDetailGurantorRequired=mapItemOutput.DetailGurantorRequired.toString().trim()
			String lDetailCarInspectionRequired=mapItemOutput.DetailCarInspectionRequired.toString().trim()
			String lDetailCarInsuranceRequired=mapItemOutput.DetailCarInsuranceRequired.toString().trim()
			String lSelectedStampDutyFeePercent=mapItemOutput.SelectedStampDutyFeePercent.toString().trim()
			String lSelectedStampDutyFee=mapItemOutput.SelectedStampDutyFee.toString().trim()
			String lSelectedCarInspectionFee=mapItemOutput.SelectedCarInspectionFee.toString().trim()
			String lSelectedAdministrationFee=mapItemOutput.SelectedAdministrationFee.toString().trim()
			String lSelectedContractTransferFee=mapItemOutput.SelectedContractTransferFee.toString().trim()
			String lSelectedTotalVat=mapItemOutput.SelectedTotalVat.toString().trim()
			String lSelectedTotalFee=mapItemOutput.SelectedTotalFee.toString().trim()
			String lDetailQualificaiton=mapItemOutput.DetailQualificaiton.toString().trim()
			String lQualificationRequired=mapItemOutput.QualificationRequired.toString().trim()
			String lDetailDocumentRequire=mapItemOutput.DetailDocumentRequire.toString().trim()
			String lDocumentRequired=mapItemOutput.DocumentRequired.toString().trim()
			String lDetailPromotionText=mapItemOutput.DetailPromotionText.toString().trim()
			if(!lDisplayPlanId){
				return lreturn
			}
			if(lDisplayPlanId.length()<=0){
				return lreturn
			}
			mapItemOutput.clear()
			mapItemOutput.put('DisplayPlanId',lDisplayPlanId)
			mapItemOutput.put('ItemDisabled',lItemDisabled)
			mapItemOutput.put('BankName',lBankName)
			mapItemOutput.put('PlanName',lPlanName)
			mapItemOutput.put('PlanLoanType',lPlanLoanType)
			mapItemOutput.put('GuarantorRequired',lGuarantorRequired)
			mapItemOutput.put('CarInspectionRequired',lCarInspectionRequired)
			mapItemOutput.put('CarInsuranceRequired',lCarInsuranceRequired)
			mapItemOutput.put('PromotionText',lPromotionText)
			mapItemOutput.put('LoanAmount',lLoanAmount)
			mapItemOutput.put('MaxLoanAmount',lMaxLoanAmount)
			mapItemOutput.put('LoanTerm',lLoanTerm)
			mapItemOutput.put('MonthlyInstalment',lMonthlyInstalment)
			mapItemOutput.put('RatePerMonth',lRatePerMonth)
			mapItemOutput.put('TotalInterest',lTotalInterest)
			mapItemOutput.put('TotalVat',lTotalVat)
			mapItemOutput.put('TotalPayment',lTotalPayment)
			mapItemOutput.put('TotalFee',lTotalFee)
			mapItemOutput.put('ApprovalDateMessage',lApprovalDateMessage)
			mapItemOutput.put('SelectedLoanAmount',lSelectedLoanAmount)
			mapItemOutput.put('SelectedMaxLoanAmount',lSelectedMaxLoanAmount)
			mapItemOutput.put('SelectedLoanTerm',lSelectedLoanTerm)
			mapItemOutput.put('SelectedMonthlyInstalment',lSelectedMonthlyInstalment)
			mapItemOutput.put('SelectedRatePerMonth',lSelectedRatePerMonth)
			mapItemOutput.put('DetailGurantorRequired',lDetailGurantorRequired)
			mapItemOutput.put('DetailCarInspectionRequired',lDetailCarInspectionRequired)
			mapItemOutput.put('DetailCarInsuranceRequired',lDetailCarInsuranceRequired)
			mapItemOutput.put('SelectedStampDutyFeePercent',lSelectedStampDutyFeePercent)
			mapItemOutput.put('SelectedStampDutyFee',lSelectedStampDutyFee)
			mapItemOutput.put('SelectedCarInspectionFee',lSelectedCarInspectionFee)
			mapItemOutput.put('SelectedAdministrationFee',lSelectedAdministrationFee)
			mapItemOutput.put('SelectedContractTransferFee',lSelectedContractTransferFee)
			mapItemOutput.put('SelectedTotalVat',lSelectedTotalVat)
			mapItemOutput.put('SelectedTotalFee',lSelectedTotalFee)
			mapItemOutput.put('DetailQualificaiton',lDetailQualificaiton)
			mapItemOutput.put('QualificationRequired',lQualificationRequired)
			mapItemOutput.put('DetailDocumentRequire',lDetailDocumentRequire)
			mapItemOutput.put('DocumentRequired',lDocumentRequired)
			mapItemOutput.put('DetailPromotionText',lDetailPromotionText)
			THAKumkaLoanCarResult_OutputType lOutputItem=new THAKumkaLoanCarResult_OutputType()
			lOutputItem.initOutput()
			lOutputItem.setOutput(mapItemOutput)
			this.lOutputList.add(lOutputItem)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean saveOutputList(){
		Boolean lreturn=false
		if(!this.IsValidTemplate){
			return lreturn
		}
		Integer lRowCount=this.lOutputList.size()
		try{
			String lStrCaseNumber=String.format('%02d',this.CurrentCase)
			String lOutputExcelSheetName=''
			if(this.IsDefaultOutput){
				lOutputExcelSheetName=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaLoanCarInputType.OUTPUT_EXCEL_FILE_NAME)
			if(!IGNUemaHelper.cloneExcelWorkSheet(xlsWorkbook,THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE,lOutputExcelSheetName)){
				return lreturn
			}
			Sheet lWorkSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
			if(lWorkSheet){
				Integer lItemIndex=0
				THAKumkaLoanCarResult_OutputType lOutputItem=null
				Integer lIndexRow=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
				Integer lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
				for(lItemIndex=0;lItemIndex<lRowCount;lItemIndex++){
					lOutputItem=this.lOutputList.get(lItemIndex)
					lIndexRow=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN+lItemIndex
					lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DisplayPlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('ItemDisabled').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('BankName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanLoanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('GuarantorRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarInspectionRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarInsuranceRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionText').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LoanAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('MaxLoanAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LoanTerm').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('MonthlyInstalment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('RatePerMonth').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('TotalInterest').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('TotalVat').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('TotalPayment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('TotalFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('ApprovalDateMessage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedLoanAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedMaxLoanAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedLoanTerm').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedMonthlyInstalment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedRatePerMonth').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailGurantorRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailCarInspectionRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailCarInsuranceRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedStampDutyFeePercent').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedStampDutyFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedCarInspectionFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedAdministrationFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedContractTransferFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedTotalVat').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SelectedTotalFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailQualificaiton').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('QualificationRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailDocumentRequire').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DocumentRequired').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DetailPromotionText').toString())
				}
				IGNUemaHelper.saveExcelWorkbookByFileName(THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean readOutputListFromExcelFile(Boolean isDefaultCase,Integer caseNumber){
		Boolean lreturn=false
		this.setIsDefaultOutput(isDefaultOutput)
		this.setCurrentCase(caseNumber)
		if(this.CurrentCase<=0){
			return lreturn
		}
		try{
			String lStrCaseNumber=String.format('%02d',caseNumber)
			String lOutputExcelSheetName=''
			if(isDefaultCase){
				lOutputExcelSheetName=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
					lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
					if(!lExcelCell){
						lIsValid=false
						break
					}
					lCellStr=lExcelCell.getStringCellValue().trim()
					if(lCellStr.length()>0){
						lIsValid=true
					}else{
						lIsValid=false
						break
					}
				}
			}
			if(!lIsValid){
				return lreturn
			}
			Integer lRowCount=0
			Boolean lFoundNext=false
			lIndexRow=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
			lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
			lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
			if(!lExcelCell){
				return lreturn
			}
			lCellStr=lExcelCell.getStringCellValue().trim()
			if(lCellStr.length()>0){
				lFoundNext=true
			}else{
				return lreturn
			}
			this.lOutputList.clear()
			THAKumkaLoanCarResult_OutputType lOutputItem=new THAKumkaLoanCarResult_OutputType()
			while(lFoundNext){
				lOutputItem.initOutput()
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DisplayPlanId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('ItemDisabled',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('BankName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanLoanType',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('GuarantorRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarInspectionRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarInsuranceRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionText',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('LoanAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('MaxLoanAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('LoanTerm',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('MonthlyInstalment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('RatePerMonth',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('TotalInterest',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('TotalVat',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('TotalPayment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('TotalFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('ApprovalDateMessage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedLoanAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedMaxLoanAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedLoanTerm',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedMonthlyInstalment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedRatePerMonth',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailGurantorRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailCarInspectionRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailCarInsuranceRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedStampDutyFeePercent',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedStampDutyFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedCarInspectionFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedAdministrationFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedContractTransferFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedTotalVat',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SelectedTotalFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailQualificaiton',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('QualificationRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailDocumentRequire',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DocumentRequired',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DetailPromotionText',lCellStr)
				}
				lIsValid=this.addMapItemToOutputList(lOutputItem.Output)
				if(!lIsValid){
					this.lOutputList.clear()
					lRowCount=0
					break
				}
				lRowCount+=1
				lIndexRow+=1
				lIndexColumn=THAKumkaLoanCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(!lExcelCell){
					lFoundNext=false
					break
				}
				lCellStr=lExcelCell.getStringCellValue().trim()
				if(lCellStr.length()<=0){
					lFoundNext=false
					break
				}
			}
			lreturn=lRowCount>0
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}