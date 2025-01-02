package org.roojai.tha.types.kumka.cancer
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaCancerResult_OutputFactory{
	private lOutputList=[]
	public Boolean IsDefaultOutput=true
	public Integer CurrentCase=0
	public Boolean IsValidTemplate=false
	public THAKumkaCancerResult_OutputFactory(Boolean isDefaultOutput,Integer currentCase){
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
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			String lOutputExcelSheetName=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=0
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			String lCardDisplayPlanId=mapItemOutput.CardDisplayPlanId.toString().trim()
			String lCardPlanType=mapItemOutput.CardPlanType.toString().trim()
			String lCardPlanPartnerName=mapItemOutput.CardPlanPartnerName.toString().trim()
			String lCardPlanName=mapItemOutput.CardPlanName.toString().trim()
			String lCardPlanCoverage=mapItemOutput.CardPlanCoverage.toString().trim()
			String lCardPlanPaymentOptionAmount=mapItemOutput.CardPlanPaymentOptionAmount.toString().trim()
			String lCardPlanPaymentInstalment=mapItemOutput.CardPlanPaymentInstalment.toString().trim()
			String lCardModalPaymentInstalment=mapItemOutput.CardModalPaymentInstalment.toString().trim()
			String lCardPlanTaxDeduct=mapItemOutput.CardPlanTaxDeduct.toString().trim()
			String lCardPlanChemoTherapy=mapItemOutput.CardPlanChemoTherapy.toString().trim()
			String lCardPlanHospitalCash=mapItemOutput.CardPlanHospitalCash.toString().trim()
			String lCardPlanBenefitsPa=mapItemOutput.CardPlanBenefitsPa.toString().trim()
			String lCardPlanRenew=mapItemOutput.CardPlanRenew.toString().trim()
			String lCardPlanActive=mapItemOutput.CardPlanActive.toString().trim()
			String lCardPlanWait=mapItemOutput.CardPlanWait.toString().trim()
			String lCardPromoText=mapItemOutput.CardPromoText.toString().trim()
			String lOutboundButtonName=mapItemOutput.OutboundButtonName.toString().trim()
			String lCardDetailPartnerName=mapItemOutput.CardDetailPartnerName.toString().trim()
			String lCardDetailPlanName=mapItemOutput.CardDetailPlanName.toString().trim()
			String lCardDetailIsLumpsumAllInvasiveCancer=mapItemOutput.CardDetailIsLumpsumAllInvasiveCancer.toString().trim()
			String lCardDetailIsLumpsumNonInvasiveCancer=mapItemOutput.CardDetailIsLumpsumNonInvasiveCancer.toString().trim()
			String lCardDetailIsLumpsumAddInvasiveCancer=mapItemOutput.CardDetailIsLumpsumAddInvasiveCancer.toString().trim()
			String lCardDetailIsAddBenefitsSkinCancer=mapItemOutput.CardDetailIsAddBenefitsSkinCancer.toString().trim()
			String lCardDetailIsAddBenefitsFuneralFee=mapItemOutput.CardDetailIsAddBenefitsFuneralFee.toString().trim()
			String lCardDetailIsAddBenefitsSecondExamFee=mapItemOutput.CardDetailIsAddBenefitsSecondExamFee.toString().trim()
			String lCardDetailIsCoverOpd=mapItemOutput.CardDetailIsCoverOpd.toString().trim()
			String lCardDetailIsAddBenefitsForGender=mapItemOutput.CardDetailIsAddBenefitsForGender.toString().trim()
			String lCardDetailIsOtherCovid=mapItemOutput.CardDetailIsOtherCovid.toString().trim()
			String lCardDetailTermAndCondition=mapItemOutput.CardDetailTermAndCondition.toString().trim()
			if(!lCardDisplayPlanId){
				return lreturn
			}
			if(lCardDisplayPlanId.length()<=0){
				return lreturn
			}
			mapItemOutput.clear()
			mapItemOutput.put('CardDisplayPlanId',lCardDisplayPlanId)
			mapItemOutput.put('CardPlanType',lCardPlanType)
			mapItemOutput.put('CardPlanPartnerName',lCardPlanPartnerName)
			mapItemOutput.put('CardPlanName',lCardPlanName)
			mapItemOutput.put('CardPlanCoverage',lCardPlanCoverage)
			mapItemOutput.put('CardPlanPaymentOptionAmount',lCardPlanPaymentOptionAmount)
			mapItemOutput.put('CardPlanPaymentInstalment',lCardPlanPaymentInstalment)
			mapItemOutput.put('CardModalPaymentInstalment',lCardModalPaymentInstalment)
			mapItemOutput.put('CardPlanTaxDeduct',lCardPlanTaxDeduct)
			mapItemOutput.put('CardPlanChemoTherapy',lCardPlanChemoTherapy)
			mapItemOutput.put('CardPlanHospitalCash',lCardPlanHospitalCash)
			mapItemOutput.put('CardPlanBenefitsPa',lCardPlanBenefitsPa)
			mapItemOutput.put('CardPlanRenew',lCardPlanRenew)
			mapItemOutput.put('CardPlanActive',lCardPlanActive)
			mapItemOutput.put('CardPlanWait',lCardPlanWait)
			mapItemOutput.put('CardPromoText',lCardPromoText)
			mapItemOutput.put('OutboundButtonName',lOutboundButtonName)
			mapItemOutput.put('CardDetailPartnerName',lCardDetailPartnerName)
			mapItemOutput.put('CardDetailPlanName',lCardDetailPlanName)
			mapItemOutput.put('CardDetailIsLumpsumAllInvasiveCancer',lCardDetailIsLumpsumAllInvasiveCancer)
			mapItemOutput.put('CardDetailIsLumpsumNonInvasiveCancer',lCardDetailIsLumpsumNonInvasiveCancer)
			mapItemOutput.put('CardDetailIsLumpsumAddInvasiveCancer',lCardDetailIsLumpsumAddInvasiveCancer)
			mapItemOutput.put('CardDetailIsAddBenefitsSkinCancer',lCardDetailIsAddBenefitsSkinCancer)
			mapItemOutput.put('CardDetailIsAddBenefitsFuneralFee',lCardDetailIsAddBenefitsFuneralFee)
			mapItemOutput.put('CardDetailIsAddBenefitsSecondExamFee',lCardDetailIsAddBenefitsSecondExamFee)
			mapItemOutput.put('CardDetailIsCoverOpd',lCardDetailIsCoverOpd)
			mapItemOutput.put('CardDetailIsAddBenefitsForGender',lCardDetailIsAddBenefitsForGender)
			mapItemOutput.put('CardDetailIsOtherCovid',lCardDetailIsOtherCovid)
			mapItemOutput.put('CardDetailTermAndCondition',lCardDetailTermAndCondition)
			THAKumkaCancerResult_OutputType lOutputItem=new THAKumkaCancerResult_OutputType()
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
				lOutputExcelSheetName=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaCancerInputType.OUTPUT_EXCEL_FILE_NAME)
			if(!IGNUemaHelper.cloneExcelWorkSheet(xlsWorkbook,THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE,lOutputExcelSheetName)){
				return lreturn
			}
			Sheet lWorkSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
			if(lWorkSheet){
				Integer lItemIndex=0
				THAKumkaCancerResult_OutputType lOutputItem=null
				Integer lIndexRow=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
				Integer lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
				for(lItemIndex=0;lItemIndex<lRowCount;lItemIndex++){
					lOutputItem=this.lOutputList.get(lItemIndex)
					lIndexRow=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN+lItemIndex
					lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDisplayPlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanPaymentOptionAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanPaymentInstalment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardModalPaymentInstalment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanTaxDeduct').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanChemoTherapy').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanHospitalCash').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanBenefitsPa').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanRenew').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanActive').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPlanWait').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardPromoText').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('OutboundButtonName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailPlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsLumpsumAllInvasiveCancer').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsLumpsumNonInvasiveCancer').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsLumpsumAddInvasiveCancer').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsAddBenefitsSkinCancer').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsAddBenefitsFuneralFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsAddBenefitsSecondExamFee').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsCoverOpd').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsAddBenefitsForGender').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailIsOtherCovid').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CardDetailTermAndCondition').toString())
				}
				IGNUemaHelper.saveExcelWorkbookByFileName(THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
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
				lOutputExcelSheetName=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			lIndexRow=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
			lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
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
			THAKumkaCancerResult_OutputType lOutputItem=new THAKumkaCancerResult_OutputType()
			while(lFoundNext){
				lOutputItem.initOutput()
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDisplayPlanId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanType',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanPaymentOptionAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanPaymentInstalment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardModalPaymentInstalment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanTaxDeduct',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanChemoTherapy',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanHospitalCash',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanBenefitsPa',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanRenew',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanActive',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPlanWait',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardPromoText',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('OutboundButtonName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailPlanName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsLumpsumAllInvasiveCancer',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsLumpsumNonInvasiveCancer',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsLumpsumAddInvasiveCancer',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsAddBenefitsSkinCancer',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsAddBenefitsFuneralFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsAddBenefitsSecondExamFee',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsCoverOpd',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsAddBenefitsForGender',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailIsOtherCovid',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CardDetailTermAndCondition',lCellStr)
				}
				lIsValid=this.addMapItemToOutputList(lOutputItem.Output)
				if(!lIsValid){
					this.lOutputList.clear()
					lRowCount=0
					break
				}
				lRowCount+=1
				lIndexRow+=1
				lIndexColumn=THAKumkaCancerResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
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