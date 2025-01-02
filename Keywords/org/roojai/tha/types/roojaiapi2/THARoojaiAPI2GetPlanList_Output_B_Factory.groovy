package org.roojai.tha.types.roojaiapi2
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2GetPlanList_Output_B_Factory{
	private lOutputList=[]
	public String SuffixText=''
	public Integer CurrentCase=0
	public Boolean IsValidTemplate=false
	public THARoojaiAPI2GetPlanList_Output_B_Factory(String suffixText,Integer currentCase){
		super()
		this.setSuffixText(suffixText)
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
	public String getSuffixText(){
		return this.SuffixText
	}
	public void setSuffixText(String suffixText){
		this.SuffixText=suffixText.trim()
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
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_FILE_NAME)
			String lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=0
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			String lInsurerId=mapItemOutput.InsurerId.toString().trim()
			String lPartnerId=mapItemOutput.PartnerId.toString().trim()
			String lPlanId=mapItemOutput.PlanId.toString().trim()
			String lPlanName=mapItemOutput.PlanName.toString().trim()
			String lPlanNameTh=mapItemOutput.PlanNameTh.toString().trim()
			String lPlanType=mapItemOutput.PlanType.toString().trim()
			String lPricePerYear=mapItemOutput.PricePerYear.toString().trim()
			String lCompulsoryPerYear=mapItemOutput.CompulsoryPerYear.toString().trim()
			String lRoadsideAssistancePerYear=mapItemOutput.RoadsideAssistancePerYear.toString().trim()
			String lInstallmentPrice=mapItemOutput.InstallmentPrice.toString().trim()
			String lMonthOfInstallment=mapItemOutput.MonthOfInstallment.toString().trim()
			String lExcessAmount=mapItemOutput.ExcessAmount.toString().trim()
			String lCarCoverage=mapItemOutput.CarCoverage.toString().trim()
			String lCarCoverageFireNTheftAmount=mapItemOutput.CarCoverageFireNTheftAmount.toString().trim()
			String lCarCoverageFloodAmount=mapItemOutput.CarCoverageFloodAmount.toString().trim()
			String lCarCoverageVehicleSumInsuredAmount=mapItemOutput.CarCoverageVehicleSumInsuredAmount.toString().trim()
			String lFlagIsDashCam=mapItemOutput.FlagIsDashCam.toString().trim()
			String lFlagIsOnlinePayment=mapItemOutput.FlagIsOnlinePayment.toString().trim()
			String lFlagIsPanelWorkshop=mapItemOutput.FlagIsPanelWorkshop.toString().trim()
			String lLiability=mapItemOutput.Liability.toString().trim()
			String lLiabilityDeathPerPersonCoverage=mapItemOutput.LiabilityDeathPerPersonCoverage.toString().trim()
			String lLiabilityMaxDeathCoverage=mapItemOutput.LiabilityMaxDeathCoverage.toString().trim()
			String lLiabilityPropertyCoverage=mapItemOutput.LiabilityPropertyCoverage.toString().trim()
			String lOther=mapItemOutput.Other.toString().trim()
			String lOtherTh=mapItemOutput.OtherTh.toString().trim()
			String lPersonalCoverage=mapItemOutput.PersonalCoverage.toString().trim()
			String lPersonalCoverageBailbondCoverage=mapItemOutput.PersonalCoverageBailbondCoverage.toString().trim()
			String lPersonalCoverageDriverPlan=mapItemOutput.PersonalCoverageDriverPlan.toString().trim()
			String lPersonalCoverageMedicalCoverage=mapItemOutput.PersonalCoverageMedicalCoverage.toString().trim()
			String lPersonalCoveragePaCoverage=mapItemOutput.PersonalCoveragePaCoverage.toString().trim()
			String lPromotion=mapItemOutput.Promotion.toString().trim()
			String lPromotionBody=mapItemOutput.PromotionBody.toString().trim()
			String lPromotionHeader=mapItemOutput.PromotionHeader.toString().trim()
			String lPromotionFlagIsMain=mapItemOutput.PromotionFlagIsMain.toString().trim()
			String lPromotionTh=mapItemOutput.PromotionTh.toString().trim()
			String lPromotionThBody=mapItemOutput.PromotionThBody.toString().trim()
			String lPromotionThHeader=mapItemOutput.PromotionThHeader.toString().trim()
			String lPromotionThFlagIsMain=mapItemOutput.PromotionThFlagIsMain.toString().trim()
			String lRedirectUrl=mapItemOutput.RedirectUrl.toString().trim()
			String lSaveDataUrl=mapItemOutput.SaveDataUrl.toString().trim()
			if(!lInsurerId){
				return lreturn
			}
			if(lInsurerId.length()<=0){
				return lreturn
			}
			mapItemOutput.clear()
			mapItemOutput.put('InsurerId',lInsurerId)
			mapItemOutput.put('PartnerId',lPartnerId)
			mapItemOutput.put('PlanId',lPlanId)
			mapItemOutput.put('PlanName',lPlanName)
			mapItemOutput.put('PlanNameTh',lPlanNameTh)
			mapItemOutput.put('PlanType',lPlanType)
			mapItemOutput.put('PricePerYear',lPricePerYear)
			mapItemOutput.put('CompulsoryPerYear',lCompulsoryPerYear)
			mapItemOutput.put('RoadsideAssistancePerYear',lRoadsideAssistancePerYear)
			mapItemOutput.put('InstallmentPrice',lInstallmentPrice)
			mapItemOutput.put('MonthOfInstallment',lMonthOfInstallment)
			mapItemOutput.put('ExcessAmount',lExcessAmount)
			mapItemOutput.put('CarCoverage',lCarCoverage)
			mapItemOutput.put('CarCoverageFireNTheftAmount',lCarCoverageFireNTheftAmount)
			mapItemOutput.put('CarCoverageFloodAmount',lCarCoverageFloodAmount)
			mapItemOutput.put('CarCoverageVehicleSumInsuredAmount',lCarCoverageVehicleSumInsuredAmount)
			mapItemOutput.put('FlagIsDashCam',lFlagIsDashCam)
			mapItemOutput.put('FlagIsOnlinePayment',lFlagIsOnlinePayment)
			mapItemOutput.put('FlagIsPanelWorkshop',lFlagIsPanelWorkshop)
			mapItemOutput.put('Liability',lLiability)
			mapItemOutput.put('LiabilityDeathPerPersonCoverage',lLiabilityDeathPerPersonCoverage)
			mapItemOutput.put('LiabilityMaxDeathCoverage',lLiabilityMaxDeathCoverage)
			mapItemOutput.put('LiabilityPropertyCoverage',lLiabilityPropertyCoverage)
			mapItemOutput.put('Other',lOther)
			mapItemOutput.put('OtherTh',lOtherTh)
			mapItemOutput.put('PersonalCoverage',lPersonalCoverage)
			mapItemOutput.put('PersonalCoverageBailbondCoverage',lPersonalCoverageBailbondCoverage)
			mapItemOutput.put('PersonalCoverageDriverPlan',lPersonalCoverageDriverPlan)
			mapItemOutput.put('PersonalCoverageMedicalCoverage',lPersonalCoverageMedicalCoverage)
			mapItemOutput.put('PersonalCoveragePaCoverage',lPersonalCoveragePaCoverage)
			mapItemOutput.put('Promotion',lPromotion)
			mapItemOutput.put('PromotionBody',lPromotionBody)
			mapItemOutput.put('PromotionHeader',lPromotionHeader)
			mapItemOutput.put('PromotionFlagIsMain',lPromotionFlagIsMain)
			mapItemOutput.put('PromotionTh',lPromotionTh)
			mapItemOutput.put('PromotionThBody',lPromotionThBody)
			mapItemOutput.put('PromotionThHeader',lPromotionThHeader)
			mapItemOutput.put('PromotionThFlagIsMain',lPromotionThFlagIsMain)
			mapItemOutput.put('RedirectUrl',lRedirectUrl)
			mapItemOutput.put('SaveDataUrl',lSaveDataUrl)
			THARoojaiAPI2GetPlanList_Output_B_Type lOutputItem=new THARoojaiAPI2GetPlanList_Output_B_Type()
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
			lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber+'_'+this.SuffixText
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_FILE_NAME)
			if(!IGNUemaHelper.cloneExcelWorkSheet(xlsWorkbook,THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE,lOutputExcelSheetName)){
				return lreturn
			}
			Sheet lWorkSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
			if(lWorkSheet){
				Integer lItemIndex=0
				THARoojaiAPI2GetPlanList_Output_B_Type lOutputItem=null
				Integer lIndexRow=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_ROW_BEGIN
				Integer lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN
				for(lItemIndex=0;lItemIndex<lRowCount;lItemIndex++){
					lOutputItem=this.lOutputList.get(lItemIndex)
					lIndexRow=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_ROW_BEGIN+lItemIndex
					lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('InsurerId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PartnerId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanNameTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PricePerYear').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CompulsoryPerYear').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('RoadsideAssistancePerYear').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('InstallmentPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('MonthOfInstallment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('ExcessAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageFireNTheftAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageFloodAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageVehicleSumInsuredAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsDashCam').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsOnlinePayment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsPanelWorkshop').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('Liability').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityDeathPerPersonCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityMaxDeathCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityPropertyCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('Other').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('OtherTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PersonalCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PersonalCoverageBailbondCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PersonalCoverageDriverPlan').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PersonalCoverageMedicalCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PersonalCoveragePaCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('Promotion').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionBody').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionHeader').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionFlagIsMain').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionThBody').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionThHeader').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PromotionThFlagIsMain').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('RedirectUrl').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SaveDataUrl').toString())
				}
				IGNUemaHelper.saveExcelWorkbookByFileName(THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean readOutputListFromExcelFile(Integer caseNumber){
		Boolean lreturn=false
		this.setCurrentCase(caseNumber)
		if(this.CurrentCase<=0){
			return lreturn
		}
		try{
			String lStrCaseNumber=String.format('%02d',caseNumber)
			String lOutputExcelSheetName=''
			lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber+'_'+this.SuffixText
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_FILE_NAME)
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			lIndexRow=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_ROW_BEGIN
			lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN
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
			THARoojaiAPI2GetPlanList_Output_B_Type lOutputItem=new THARoojaiAPI2GetPlanList_Output_B_Type()
			while(lFoundNext){
				lOutputItem.initOutput()
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('InsurerId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PartnerId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanId',lCellStr)
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
					lOutputItem.Output.put('PlanNameTh',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanType',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PricePerYear',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CompulsoryPerYear',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('RoadsideAssistancePerYear',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('InstallmentPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('MonthOfInstallment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('ExcessAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarCoverageFireNTheftAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarCoverageFloodAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarCoverageVehicleSumInsuredAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsDashCam',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsOnlinePayment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsPanelWorkshop',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('Liability',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('LiabilityDeathPerPersonCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('LiabilityMaxDeathCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('LiabilityPropertyCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('Other',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('OtherTh',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PersonalCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PersonalCoverageBailbondCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PersonalCoverageDriverPlan',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PersonalCoverageMedicalCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PersonalCoveragePaCoverage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('Promotion',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionBody',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionHeader',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionFlagIsMain',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionTh',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionThBody',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionThHeader',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PromotionThFlagIsMain',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('RedirectUrl',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SaveDataUrl',lCellStr)
				}
				lIsValid=this.addMapItemToOutputList(lOutputItem.Output)
				if(!lIsValid){
					this.lOutputList.clear()
					lRowCount=0
					break
				}
				lRowCount+=1
				lIndexRow+=1
				lIndexColumn=THARoojaiAPI2GetPlanList_Output_B_Type.OUTPUT_EXCEL_COL_BEGIN
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