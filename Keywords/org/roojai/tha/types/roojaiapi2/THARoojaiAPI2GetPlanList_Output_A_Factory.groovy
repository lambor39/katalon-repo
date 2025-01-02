package org.roojai.tha.types.roojaiapi2
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2GetPlanList_Output_A_Factory{
	private lOutputList=[]
	public String SuffixText=''
	public Integer CurrentCase=0
	public Boolean IsValidTemplate=false
	public THARoojaiAPI2GetPlanList_Output_A_Factory(String suffixText,Integer currentCase){
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
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_FILE_NAME)
			String lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=0
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			String lModel=mapItemOutput.Model.toString().trim()
			String lPlanType=mapItemOutput.PlanType.toString().trim()
			String lPlanName=mapItemOutput.PlanName.toString().trim()
			String lPlanNameTh=mapItemOutput.PlanNameTh.toString().trim()
			String lPlanShortDescription=mapItemOutput.PlanShortDescription.toString().trim()
			String lPlanShortDescriptionTh=mapItemOutput.PlanShortDescriptionTh.toString().trim()
			String lPlanLongDescription=mapItemOutput.PlanLongDescription.toString().trim()
			String lPlanLongDescriptionTh=mapItemOutput.PlanLongDescriptionTh.toString().trim()
			String lPricePerYear=mapItemOutput.PricePerYear.toString().trim()
			String lCompulsoryPerYear=mapItemOutput.CompulsoryPerYear.toString().trim()
			String lExcessAmount=mapItemOutput.ExcessAmount.toString().trim()
			String lInstallmentMessage=mapItemOutput.InstallmentMessage.toString().trim()
			String lFlagIsBuynowAvailable=mapItemOutput.FlagIsBuynowAvailable.toString().trim()
			String lFlagIsCompulsoryAvailable=mapItemOutput.FlagIsCompulsoryAvailable.toString().trim()
			String lFlagIsInstallment=mapItemOutput.FlagIsInstallment.toString().trim()
			String lFlagIsOnlinePayment=mapItemOutput.FlagIsOnlinePayment.toString().trim()
			String lFlagIsPanelWorkshop=mapItemOutput.FlagIsPanelWorkshop.toString().trim()
			String lFlagIsPromotion=mapItemOutput.FlagIsPromotion.toString().trim()
			String lFlagIsRoadside=mapItemOutput.FlagIsRoadside.toString().trim()
			String lCarCoverage=mapItemOutput.CarCoverage.toString().trim()
			String lCarCoverageFlagIsFireNTheft=mapItemOutput.CarCoverageFlagIsFireNTheft.toString().trim()
			String lCarCoverageFlagIsFlood=mapItemOutput.CarCoverageFlagIsFlood.toString().trim()
			String lCarCoverageVehicleSumInsuredAmount=mapItemOutput.CarCoverageVehicleSumInsuredAmount.toString().trim()
			String lLiability=mapItemOutput.Liability.toString().trim()
			String lLiabilityDeathPerPersonCoverage=mapItemOutput.LiabilityDeathPerPersonCoverage.toString().trim()
			String lLiabilityMaxDeathCoverage=mapItemOutput.LiabilityMaxDeathCoverage.toString().trim()
			String lLiabilityPropertyCoverage=mapItemOutput.LiabilityPropertyCoverage.toString().trim()
			String lPersonalCoverage=mapItemOutput.PersonalCoverage.toString().trim()
			String lPersonalCoverageBailbondCoverage=mapItemOutput.PersonalCoverageBailbondCoverage.toString().trim()
			String lPersonalCoverageDriverPlan=mapItemOutput.PersonalCoverageDriverPlan.toString().trim()
			String lPersonalCoverageMedicalCoverage=mapItemOutput.PersonalCoverageMedicalCoverage.toString().trim()
			String lPersonalCoveragePaCoverage=mapItemOutput.PersonalCoveragePaCoverage.toString().trim()
			String lBuyNowUrl=mapItemOutput.BuyNowUrl.toString().trim()
			String lCallBackUrl=mapItemOutput.CallBackUrl.toString().trim()
			String lSeatCapacity=mapItemOutput.SeatCapacity.toString().trim()
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
			mapItemOutput.put('Model',lModel)
			mapItemOutput.put('PlanType',lPlanType)
			mapItemOutput.put('PlanName',lPlanName)
			mapItemOutput.put('PlanNameTh',lPlanNameTh)
			mapItemOutput.put('PlanShortDescription',lPlanShortDescription)
			mapItemOutput.put('PlanShortDescriptionTh',lPlanShortDescriptionTh)
			mapItemOutput.put('PlanLongDescription',lPlanLongDescription)
			mapItemOutput.put('PlanLongDescriptionTh',lPlanLongDescriptionTh)
			mapItemOutput.put('PricePerYear',lPricePerYear)
			mapItemOutput.put('CompulsoryPerYear',lCompulsoryPerYear)
			mapItemOutput.put('ExcessAmount',lExcessAmount)
			mapItemOutput.put('InstallmentMessage',lInstallmentMessage)
			mapItemOutput.put('FlagIsBuynowAvailable',lFlagIsBuynowAvailable)
			mapItemOutput.put('FlagIsCompulsoryAvailable',lFlagIsCompulsoryAvailable)
			mapItemOutput.put('FlagIsInstallment',lFlagIsInstallment)
			mapItemOutput.put('FlagIsOnlinePayment',lFlagIsOnlinePayment)
			mapItemOutput.put('FlagIsPanelWorkshop',lFlagIsPanelWorkshop)
			mapItemOutput.put('FlagIsPromotion',lFlagIsPromotion)
			mapItemOutput.put('FlagIsRoadside',lFlagIsRoadside)
			mapItemOutput.put('CarCoverage',lCarCoverage)
			mapItemOutput.put('CarCoverageFlagIsFireNTheft',lCarCoverageFlagIsFireNTheft)
			mapItemOutput.put('CarCoverageFlagIsFlood',lCarCoverageFlagIsFlood)
			mapItemOutput.put('CarCoverageVehicleSumInsuredAmount',lCarCoverageVehicleSumInsuredAmount)
			mapItemOutput.put('Liability',lLiability)
			mapItemOutput.put('LiabilityDeathPerPersonCoverage',lLiabilityDeathPerPersonCoverage)
			mapItemOutput.put('LiabilityMaxDeathCoverage',lLiabilityMaxDeathCoverage)
			mapItemOutput.put('LiabilityPropertyCoverage',lLiabilityPropertyCoverage)
			mapItemOutput.put('PersonalCoverage',lPersonalCoverage)
			mapItemOutput.put('PersonalCoverageBailbondCoverage',lPersonalCoverageBailbondCoverage)
			mapItemOutput.put('PersonalCoverageDriverPlan',lPersonalCoverageDriverPlan)
			mapItemOutput.put('PersonalCoverageMedicalCoverage',lPersonalCoverageMedicalCoverage)
			mapItemOutput.put('PersonalCoveragePaCoverage',lPersonalCoveragePaCoverage)
			mapItemOutput.put('BuyNowUrl',lBuyNowUrl)
			mapItemOutput.put('CallBackUrl',lCallBackUrl)
			mapItemOutput.put('SeatCapacity',lSeatCapacity)
			THARoojaiAPI2GetPlanList_Output_A_Type lOutputItem=new THARoojaiAPI2GetPlanList_Output_A_Type()
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
			lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber+'_'+this.SuffixText
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_FILE_NAME)
			if(!IGNUemaHelper.cloneExcelWorkSheet(xlsWorkbook,THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE,lOutputExcelSheetName)){
				return lreturn
			}
			Sheet lWorkSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
			if(lWorkSheet){
				Integer lItemIndex=0
				THARoojaiAPI2GetPlanList_Output_A_Type lOutputItem=null
				Integer lIndexRow=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_ROW_BEGIN
				Integer lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN
				for(lItemIndex=0;lItemIndex<lRowCount;lItemIndex++){
					lOutputItem=this.lOutputList.get(lItemIndex)
					lIndexRow=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_ROW_BEGIN+lItemIndex
					lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('InsurerId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PartnerId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('Model').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanNameTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanShortDescription').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanShortDescriptionTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanLongDescription').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PlanLongDescriptionTh').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('PricePerYear').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CompulsoryPerYear').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('ExcessAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('InstallmentMessage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsBuynowAvailable').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsCompulsoryAvailable').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsInstallment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsOnlinePayment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsPanelWorkshop').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsPromotion').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('FlagIsRoadside').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageFlagIsFireNTheft').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageFlagIsFlood').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CarCoverageVehicleSumInsuredAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('Liability').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityDeathPerPersonCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityMaxDeathCoverage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('LiabilityPropertyCoverage').toString())
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
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('BuyNowUrl').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('CallBackUrl').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('SeatCapacity').toString())
				}
				IGNUemaHelper.saveExcelWorkbookByFileName(THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
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
			lOutputExcelSheetName=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber+'_'+this.SuffixText
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_FILE_NAME)
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			lIndexRow=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_ROW_BEGIN
			lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN
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
			THARoojaiAPI2GetPlanList_Output_A_Type lOutputItem=new THARoojaiAPI2GetPlanList_Output_A_Type()
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
					lOutputItem.Output.put('Model',lCellStr)
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
					lOutputItem.Output.put('PlanShortDescription',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanShortDescriptionTh',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanLongDescription',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('PlanLongDescriptionTh',lCellStr)
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
					lOutputItem.Output.put('ExcessAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('InstallmentMessage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsBuynowAvailable',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsCompulsoryAvailable',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsInstallment',lCellStr)
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
					lOutputItem.Output.put('FlagIsPromotion',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('FlagIsRoadside',lCellStr)
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
					lOutputItem.Output.put('CarCoverageFlagIsFireNTheft',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CarCoverageFlagIsFlood',lCellStr)
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
					lOutputItem.Output.put('BuyNowUrl',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('CallBackUrl',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('SeatCapacity',lCellStr)
				}
				lIsValid=this.addMapItemToOutputList(lOutputItem.Output)
				if(!lIsValid){
					this.lOutputList.clear()
					lRowCount=0
					break
				}
				lRowCount+=1
				lIndexRow+=1
				lIndexColumn=THARoojaiAPI2GetPlanList_Output_A_Type.OUTPUT_EXCEL_COL_BEGIN
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