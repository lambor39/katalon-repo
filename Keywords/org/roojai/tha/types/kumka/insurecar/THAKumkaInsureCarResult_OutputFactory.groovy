package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.apache.poi.ss.usermodel.*
public class THAKumkaInsureCarResult_OutputFactory{
	private lOutputList=[]
	public Boolean IsDefaultOutput=true
	public Integer CurrentCase=0
	public Boolean IsValidTemplate=false
	public THAKumkaInsureCarResult_OutputFactory(Boolean isDefaultOutput,Integer currentCase){
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
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			String lOutputExcelSheetName=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=0
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			String lDesignACardDisplayPlanId=mapItemOutput.DesignACardDisplayPlanId.toString().trim()
			String lDesignACardDisplayPlanType=mapItemOutput.DesignACardDisplayPlanType.toString().trim()
			String lDesignACardOpenScore=mapItemOutput.DesignACardOpenScore.toString().trim()
			String lDesignAModalScorePartnernameScore=mapItemOutput.DesignAModalScorePartnernameScore.toString().trim()
			String lDesignAModalScorePartnerName=mapItemOutput.DesignAModalScorePartnerName.toString().trim()
			String lDesignAModalScoreSuminsured=mapItemOutput.DesignAModalScoreSuminsured.toString().trim()
			String lDesignAModalScoreSuminsuredScore=mapItemOutput.DesignAModalScoreSuminsuredScore.toString().trim()
			String lDesignAModalScoreExcess=mapItemOutput.DesignAModalScoreExcess.toString().trim()
			String lDesignAModalScoreExcessScore=mapItemOutput.DesignAModalScoreExcessScore.toString().trim()
			String lDesignAModalScoreGarage=mapItemOutput.DesignAModalScoreGarage.toString().trim()
			String lDesignAModalScoreGarageScore=mapItemOutput.DesignAModalScoreGarageScore.toString().trim()
			String lDesignAModalScoreDriver=mapItemOutput.DesignAModalScoreDriver.toString().trim()
			String lDesignAModalScoreDriverScore=mapItemOutput.DesignAModalScoreDriverScore.toString().trim()
			String lDesignAModalScoreProperty=mapItemOutput.DesignAModalScoreProperty.toString().trim()
			String lDesignAModalScorePropertyScore=mapItemOutput.DesignAModalScorePropertyScore.toString().trim()
			String lDesignACardPromotionText=mapItemOutput.DesignACardPromotionText.toString().trim()
			String lDesignACardInsurerName=mapItemOutput.DesignACardInsurerName.toString().trim()
			String lDesignACardPartnerName=mapItemOutput.DesignACardPartnerName.toString().trim()
			String lDesignACardPlanName=mapItemOutput.DesignACardPlanName.toString().trim()
			String lDesignACardPrice=mapItemOutput.DesignACardPrice.toString().trim()
			String lDesignACardBasicPremium=mapItemOutput.DesignACardBasicPremium.toString().trim()
			String lDesignACardDiscountAmount=mapItemOutput.DesignACardDiscountAmount.toString().trim()
			String lDesignACardExcess=mapItemOutput.DesignACardExcess.toString().trim()
			String lDesignACardSumInsure=mapItemOutput.DesignACardSumInsure.toString().trim()
			String lDesignACardProperty=mapItemOutput.DesignACardProperty.toString().trim()
			String lDesignACardIsRoadside=mapItemOutput.DesignACardIsRoadside.toString().trim()
			String lDesignACardIsOnlinePayment=mapItemOutput.DesignACardIsOnlinePayment.toString().trim()
			String lDesignACardIsCompulsoryAvailable=mapItemOutput.DesignACardIsCompulsoryAvailable.toString().trim()
			String lDesignACardIsFlood=mapItemOutput.DesignACardIsFlood.toString().trim()
			String lDesignACardGarage=mapItemOutput.DesignACardGarage.toString().trim()
			String lDesignACardDriver=mapItemOutput.DesignACardDriver.toString().trim()
			String lDesignACardInstalmentPrice=mapItemOutput.DesignACardInstalmentPrice.toString().trim()
			String lDesignAOutboundButtonName=mapItemOutput.DesignAOutboundButtonName.toString().trim()
			String lDesignAModalDetailInsurerName=mapItemOutput.DesignAModalDetailInsurerName.toString().trim()
			String lDesignAModalDetailPartnerName=mapItemOutput.DesignAModalDetailPartnerName.toString().trim()
			String lDesignAModalDetailPrice=mapItemOutput.DesignAModalDetailPrice.toString().trim()
			String lDesignAModalDetailBasicPremium=mapItemOutput.DesignAModalDetailBasicPremium.toString().trim()
			String lDesignAModalDetailDiscountAmount=mapItemOutput.DesignAModalDetailDiscountAmount.toString().trim()
			String lDesignAModalDetailSuminsure=mapItemOutput.DesignAModalDetailSuminsure.toString().trim()
			String lDesignAModalDetailScore=mapItemOutput.DesignAModalDetailScore.toString().trim()
			String lDesignAModalDetailPromotion=mapItemOutput.DesignAModalDetailPromotion.toString().trim()
			String lDesignAModalDetailExcess=mapItemOutput.DesignAModalDetailExcess.toString().trim()
			String lDesignAModalDetailGarage=mapItemOutput.DesignAModalDetailGarage.toString().trim()
			String lDesignAModalDetailDriver=mapItemOutput.DesignAModalDetailDriver.toString().trim()
			String lDesignAModalDetailFire=mapItemOutput.DesignAModalDetailFire.toString().trim()
			String lDesignAModalDetailFlood=mapItemOutput.DesignAModalDetailFlood.toString().trim()
			String lDesignAModalDetailPersonal=mapItemOutput.DesignAModalDetailPersonal.toString().trim()
			String lDesignAModalDetailMedical=mapItemOutput.DesignAModalDetailMedical.toString().trim()
			String lDesignAModalDetailBail=mapItemOutput.DesignAModalDetailBail.toString().trim()
			String lDesignAModalDetailProperty=mapItemOutput.DesignAModalDetailProperty.toString().trim()
			String lDesignAModalDetailDeath=mapItemOutput.DesignAModalDetailDeath.toString().trim()
			String lDesignAModalDetailMaxDeath=mapItemOutput.DesignAModalDetailMaxDeath.toString().trim()
			String lDesignBCardDisplayPlanId=mapItemOutput.DesignBCardDisplayPlanId.toString().trim()
			String lDesignBCardDisplayPlanType=mapItemOutput.DesignBCardDisplayPlanType.toString().trim()
			String lDesignBCardOpenScore=mapItemOutput.DesignBCardOpenScore.toString().trim()
			String lDesignBModalScorePartnernameScore=mapItemOutput.DesignBModalScorePartnernameScore.toString().trim()
			String lDesignBModalScorePartnerName=mapItemOutput.DesignBModalScorePartnerName.toString().trim()
			String lDesignBModalScoreSuminsured=mapItemOutput.DesignBModalScoreSuminsured.toString().trim()
			String lDesignBModalScoreSuminsuredScore=mapItemOutput.DesignBModalScoreSuminsuredScore.toString().trim()
			String lDesignBModalScoreExcess=mapItemOutput.DesignBModalScoreExcess.toString().trim()
			String lDesignBModalScoreExcessScore=mapItemOutput.DesignBModalScoreExcessScore.toString().trim()
			String lDesignBModalScoreGarage=mapItemOutput.DesignBModalScoreGarage.toString().trim()
			String lDesignBModalScoreGarageScore=mapItemOutput.DesignBModalScoreGarageScore.toString().trim()
			String lDesignBModalScoreDriver=mapItemOutput.DesignBModalScoreDriver.toString().trim()
			String lDesignBModalScoreDriverScore=mapItemOutput.DesignBModalScoreDriverScore.toString().trim()
			String lDesignBModalScoreProperty=mapItemOutput.DesignBModalScoreProperty.toString().trim()
			String lDesignBModalScorePropertyScore=mapItemOutput.DesignBModalScorePropertyScore.toString().trim()
			String lDesignBCardPromotionText=mapItemOutput.DesignBCardPromotionText.toString().trim()
			String lDesignBCardInsurerName=mapItemOutput.DesignBCardInsurerName.toString().trim()
			String lDesignBCardPartnerName=mapItemOutput.DesignBCardPartnerName.toString().trim()
			String lDesignBCardPlanName=mapItemOutput.DesignBCardPlanName.toString().trim()
			String lDesignBCardPrice=mapItemOutput.DesignBCardPrice.toString().trim()
			String lDesignBCardBasicPremium=mapItemOutput.DesignBCardBasicPremium.toString().trim()
			String lDesignBCardDiscountAmount=mapItemOutput.DesignBCardDiscountAmount.toString().trim()
			String lDesignBCardExcess=mapItemOutput.DesignBCardExcess.toString().trim()
			String lDesignBCardSumInsure=mapItemOutput.DesignBCardSumInsure.toString().trim()
			String lDesignBCardProperty=mapItemOutput.DesignBCardProperty.toString().trim()
			String lDesignBCardIsRoadside=mapItemOutput.DesignBCardIsRoadside.toString().trim()
			String lDesignBCardIsOnlinePayment=mapItemOutput.DesignBCardIsOnlinePayment.toString().trim()
			String lDesignBCardIsCompulsoryAvailable=mapItemOutput.DesignBCardIsCompulsoryAvailable.toString().trim()
			String lDesignBCardIsFlood=mapItemOutput.DesignBCardIsFlood.toString().trim()
			String lDesignBCardGarage=mapItemOutput.DesignBCardGarage.toString().trim()
			String lDesignBCardDriver=mapItemOutput.DesignBCardDriver.toString().trim()
			String lDesignBCardInstalmentPrice=mapItemOutput.DesignBCardInstalmentPrice.toString().trim()
			String lDesignBOutboundButtonName=mapItemOutput.DesignBOutboundButtonName.toString().trim()
			String lDesignBModalDetailInsurerName=mapItemOutput.DesignBModalDetailInsurerName.toString().trim()
			String lDesignBModalDetailPartnerName=mapItemOutput.DesignBModalDetailPartnerName.toString().trim()
			String lDesignBModalDetailPrice=mapItemOutput.DesignBModalDetailPrice.toString().trim()
			String lDesignBModalDetailBasicPremium=mapItemOutput.DesignBModalDetailBasicPremium.toString().trim()
			String lDesignBModalDetailDiscountAmount=mapItemOutput.DesignBModalDetailDiscountAmount.toString().trim()
			String lDesignBModalDetailSuminsure=mapItemOutput.DesignBModalDetailSuminsure.toString().trim()
			String lDesignBModalDetailScore=mapItemOutput.DesignBModalDetailScore.toString().trim()
			String lDesignBModalDetailPromotion=mapItemOutput.DesignBModalDetailPromotion.toString().trim()
			String lDesignBModalDetailExcess=mapItemOutput.DesignBModalDetailExcess.toString().trim()
			String lDesignBModalDetailGarage=mapItemOutput.DesignBModalDetailGarage.toString().trim()
			String lDesignBModalDetailDriver=mapItemOutput.DesignBModalDetailDriver.toString().trim()
			String lDesignBModalDetailFire=mapItemOutput.DesignBModalDetailFire.toString().trim()
			String lDesignBModalDetailFlood=mapItemOutput.DesignBModalDetailFlood.toString().trim()
			String lDesignBModalDetailPersonal=mapItemOutput.DesignBModalDetailPersonal.toString().trim()
			String lDesignBModalDetailMedical=mapItemOutput.DesignBModalDetailMedical.toString().trim()
			String lDesignBModalDetailBail=mapItemOutput.DesignBModalDetailBail.toString().trim()
			String lDesignBModalDetailProperty=mapItemOutput.DesignBModalDetailProperty.toString().trim()
			String lDesignBModalDetailDeath=mapItemOutput.DesignBModalDetailDeath.toString().trim()
			String lDesignBModalDetailMaxDeath=mapItemOutput.DesignBModalDetailMaxDeath.toString().trim()
			//Check ResultPage
			if(!THAKumkaInsureCarCoreType.CURRENT_URL_UNDER_PAGE_RESULT_NEW){
				if(!lDesignACardDisplayPlanId){
					return lreturn
				}
				if(lDesignACardDisplayPlanId.length()<=0){
					return lreturn
				}
			}else{
				if(!lDesignBCardDisplayPlanId){
					return lreturn
				}
				if(lDesignBCardDisplayPlanId.length()<=0){
					return lreturn
				}
			}
			mapItemOutput.clear()
			mapItemOutput.put('DesignACardDisplayPlanId',lDesignACardDisplayPlanId)
			mapItemOutput.put('DesignACardDisplayPlanType',lDesignACardDisplayPlanType)
			mapItemOutput.put('DesignACardOpenScore',lDesignACardOpenScore)
			mapItemOutput.put('DesignAModalScorePartnernameScore',lDesignAModalScorePartnernameScore)
			mapItemOutput.put('DesignAModalScorePartnerName',lDesignAModalScorePartnerName)
			mapItemOutput.put('DesignAModalScoreSuminsured',lDesignAModalScoreSuminsured)
			mapItemOutput.put('DesignAModalScoreSuminsuredScore',lDesignAModalScoreSuminsuredScore)
			mapItemOutput.put('DesignAModalScoreExcess',lDesignAModalScoreExcess)
			mapItemOutput.put('DesignAModalScoreExcessScore',lDesignAModalScoreExcessScore)
			mapItemOutput.put('DesignAModalScoreGarage',lDesignAModalScoreGarage)
			mapItemOutput.put('DesignAModalScoreGarageScore',lDesignAModalScoreGarageScore)
			mapItemOutput.put('DesignAModalScoreDriver',lDesignAModalScoreDriver)
			mapItemOutput.put('DesignAModalScoreDriverScore',lDesignAModalScoreDriverScore)
			mapItemOutput.put('DesignAModalScoreProperty',lDesignAModalScoreProperty)
			mapItemOutput.put('DesignAModalScorePropertyScore',lDesignAModalScorePropertyScore)
			mapItemOutput.put('DesignACardPromotionText',lDesignACardPromotionText)
			mapItemOutput.put('DesignACardInsurerName',lDesignACardInsurerName)
			mapItemOutput.put('DesignACardPartnerName',lDesignACardPartnerName)
			mapItemOutput.put('DesignACardPlanName',lDesignACardPlanName)
			mapItemOutput.put('DesignACardPrice',lDesignACardPrice)
			mapItemOutput.put('DesignACardBasicPremium',lDesignACardBasicPremium)
			mapItemOutput.put('DesignACardDiscountAmount',lDesignACardDiscountAmount)
			mapItemOutput.put('DesignACardExcess',lDesignACardExcess)
			mapItemOutput.put('DesignACardSumInsure',lDesignACardSumInsure)
			mapItemOutput.put('DesignACardProperty',lDesignACardProperty)
			mapItemOutput.put('DesignACardIsRoadside',lDesignACardIsRoadside)
			mapItemOutput.put('DesignACardIsOnlinePayment',lDesignACardIsOnlinePayment)
			mapItemOutput.put('DesignACardIsCompulsoryAvailable',lDesignACardIsCompulsoryAvailable)
			mapItemOutput.put('DesignACardIsFlood',lDesignACardIsFlood)
			mapItemOutput.put('DesignACardGarage',lDesignACardGarage)
			mapItemOutput.put('DesignACardDriver',lDesignACardDriver)
			mapItemOutput.put('DesignACardInstalmentPrice',lDesignACardInstalmentPrice)
			mapItemOutput.put('DesignAOutboundButtonName',lDesignAOutboundButtonName)
			mapItemOutput.put('DesignAModalDetailInsurerName',lDesignAModalDetailInsurerName)
			mapItemOutput.put('DesignAModalDetailPartnerName',lDesignAModalDetailPartnerName)
			mapItemOutput.put('DesignAModalDetailPrice',lDesignAModalDetailPrice)
			mapItemOutput.put('DesignAModalDetailBasicPremium',lDesignAModalDetailBasicPremium)
			mapItemOutput.put('DesignAModalDetailDiscountAmount',lDesignAModalDetailDiscountAmount)
			mapItemOutput.put('DesignAModalDetailSuminsure',lDesignAModalDetailSuminsure)
			mapItemOutput.put('DesignAModalDetailScore',lDesignAModalDetailScore)
			mapItemOutput.put('DesignAModalDetailPromotion',lDesignAModalDetailPromotion)
			mapItemOutput.put('DesignAModalDetailExcess',lDesignAModalDetailExcess)
			mapItemOutput.put('DesignAModalDetailGarage',lDesignAModalDetailGarage)
			mapItemOutput.put('DesignAModalDetailDriver',lDesignAModalDetailDriver)
			mapItemOutput.put('DesignAModalDetailFire',lDesignAModalDetailFire)
			mapItemOutput.put('DesignAModalDetailFlood',lDesignAModalDetailFlood)
			mapItemOutput.put('DesignAModalDetailPersonal',lDesignAModalDetailPersonal)
			mapItemOutput.put('DesignAModalDetailMedical',lDesignAModalDetailMedical)
			mapItemOutput.put('DesignAModalDetailBail',lDesignAModalDetailBail)
			mapItemOutput.put('DesignAModalDetailProperty',lDesignAModalDetailProperty)
			mapItemOutput.put('DesignAModalDetailDeath',lDesignAModalDetailDeath)
			mapItemOutput.put('DesignAModalDetailMaxDeath',lDesignAModalDetailMaxDeath)
			mapItemOutput.put('DesignBCardDisplayPlanId',lDesignBCardDisplayPlanId)
			mapItemOutput.put('DesignBCardDisplayPlanType',lDesignBCardDisplayPlanType)
			mapItemOutput.put('DesignBCardOpenScore',lDesignBCardOpenScore)
			mapItemOutput.put('DesignBModalScorePartnernameScore',lDesignBModalScorePartnernameScore)
			mapItemOutput.put('DesignBModalScorePartnerName',lDesignBModalScorePartnerName)
			mapItemOutput.put('DesignBModalScoreSuminsured',lDesignBModalScoreSuminsured)
			mapItemOutput.put('DesignBModalScoreSuminsuredScore',lDesignBModalScoreSuminsuredScore)
			mapItemOutput.put('DesignBModalScoreExcess',lDesignBModalScoreExcess)
			mapItemOutput.put('DesignBModalScoreExcessScore',lDesignBModalScoreExcessScore)
			mapItemOutput.put('DesignBModalScoreGarage',lDesignBModalScoreGarage)
			mapItemOutput.put('DesignBModalScoreGarageScore',lDesignBModalScoreGarageScore)
			mapItemOutput.put('DesignBModalScoreDriver',lDesignBModalScoreDriver)
			mapItemOutput.put('DesignBModalScoreDriverScore',lDesignBModalScoreDriverScore)
			mapItemOutput.put('DesignBModalScoreProperty',lDesignBModalScoreProperty)
			mapItemOutput.put('DesignBModalScorePropertyScore',lDesignBModalScorePropertyScore)
			mapItemOutput.put('DesignBCardPromotionText',lDesignBCardPromotionText)
			mapItemOutput.put('DesignBCardInsurerName',lDesignBCardInsurerName)
			mapItemOutput.put('DesignBCardPartnerName',lDesignBCardPartnerName)
			mapItemOutput.put('DesignBCardPlanName',lDesignBCardPlanName)
			mapItemOutput.put('DesignBCardPrice',lDesignBCardPrice)
			mapItemOutput.put('DesignBCardBasicPremium',lDesignBCardBasicPremium)
			mapItemOutput.put('DesignBCardDiscountAmount',lDesignBCardDiscountAmount)
			mapItemOutput.put('DesignBCardExcess',lDesignBCardExcess)
			mapItemOutput.put('DesignBCardSumInsure',lDesignBCardSumInsure)
			mapItemOutput.put('DesignBCardProperty',lDesignBCardProperty)
			mapItemOutput.put('DesignBCardIsRoadside',lDesignBCardIsRoadside)
			mapItemOutput.put('DesignBCardIsOnlinePayment',lDesignBCardIsOnlinePayment)
			mapItemOutput.put('DesignBCardIsCompulsoryAvailable',lDesignBCardIsCompulsoryAvailable)
			mapItemOutput.put('DesignBCardIsFlood',lDesignBCardIsFlood)
			mapItemOutput.put('DesignBCardGarage',lDesignBCardGarage)
			mapItemOutput.put('DesignBCardDriver',lDesignBCardDriver)
			mapItemOutput.put('DesignBCardInstalmentPrice',lDesignBCardInstalmentPrice)
			mapItemOutput.put('DesignBOutboundButtonName',lDesignBOutboundButtonName)
			mapItemOutput.put('DesignBModalDetailInsurerName',lDesignBModalDetailInsurerName)
			mapItemOutput.put('DesignBModalDetailPartnerName',lDesignBModalDetailPartnerName)
			mapItemOutput.put('DesignBModalDetailPrice',lDesignBModalDetailPrice)
			mapItemOutput.put('DesignBModalDetailBasicPremium',lDesignBModalDetailBasicPremium)
			mapItemOutput.put('DesignBModalDetailDiscountAmount',lDesignBModalDetailDiscountAmount)
			mapItemOutput.put('DesignBModalDetailSuminsure',lDesignBModalDetailSuminsure)
			mapItemOutput.put('DesignBModalDetailScore',lDesignBModalDetailScore)
			mapItemOutput.put('DesignBModalDetailPromotion',lDesignBModalDetailPromotion)
			mapItemOutput.put('DesignBModalDetailExcess',lDesignBModalDetailExcess)
			mapItemOutput.put('DesignBModalDetailGarage',lDesignBModalDetailGarage)
			mapItemOutput.put('DesignBModalDetailDriver',lDesignBModalDetailDriver)
			mapItemOutput.put('DesignBModalDetailFire',lDesignBModalDetailFire)
			mapItemOutput.put('DesignBModalDetailFlood',lDesignBModalDetailFlood)
			mapItemOutput.put('DesignBModalDetailPersonal',lDesignBModalDetailPersonal)
			mapItemOutput.put('DesignBModalDetailMedical',lDesignBModalDetailMedical)
			mapItemOutput.put('DesignBModalDetailBail',lDesignBModalDetailBail)
			mapItemOutput.put('DesignBModalDetailProperty',lDesignBModalDetailProperty)
			mapItemOutput.put('DesignBModalDetailDeath',lDesignBModalDetailDeath)
			mapItemOutput.put('DesignBModalDetailMaxDeath',lDesignBModalDetailMaxDeath)
			THAKumkaInsureCarResult_OutputType lOutputItem=new THAKumkaInsureCarResult_OutputType()
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
				lOutputExcelSheetName=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaInsureCarInputType.OUTPUT_EXCEL_FILE_NAME)
			if(!IGNUemaHelper.cloneExcelWorkSheet(xlsWorkbook,THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_TEMPLATE,lOutputExcelSheetName)){
				return lreturn
			}
			Sheet lWorkSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
			if(lWorkSheet){
				Integer lItemIndex=0
				THAKumkaInsureCarResult_OutputType lOutputItem=null
				Integer lIndexRow=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
				Integer lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
				for(lItemIndex=0;lItemIndex<lRowCount;lItemIndex++){
					lOutputItem=this.lOutputList.get(lItemIndex)
					lIndexRow=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN+lItemIndex
					lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardDisplayPlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardDisplayPlanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardOpenScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScorePartnernameScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScorePartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreSuminsured').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreSuminsuredScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreExcessScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreGarageScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreDriverScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScoreProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalScorePropertyScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardPromotionText').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardInsurerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardPlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardBasicPremium').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardDiscountAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardSumInsure').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardIsRoadside').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardIsOnlinePayment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardIsCompulsoryAvailable').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardIsFlood').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignACardInstalmentPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAOutboundButtonName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailInsurerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailBasicPremium').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailDiscountAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailSuminsure').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailPromotion').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailFire').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailFlood').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailPersonal').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailMedical').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailBail').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailDeath').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignAModalDetailMaxDeath').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardDisplayPlanId').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardDisplayPlanType').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardOpenScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScorePartnernameScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScorePartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreSuminsured').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreSuminsuredScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreExcessScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreGarageScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreDriverScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScoreProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalScorePropertyScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardPromotionText').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardInsurerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardPlanName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardBasicPremium').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardDiscountAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardSumInsure').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardIsRoadside').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardIsOnlinePayment').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardIsCompulsoryAvailable').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardIsFlood').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBCardInstalmentPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBOutboundButtonName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailInsurerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailPartnerName').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailPrice').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailBasicPremium').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailDiscountAmount').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailSuminsure').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailScore').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailPromotion').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailExcess').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailGarage').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailDriver').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailFire').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailFlood').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailPersonal').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailMedical').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailBail').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailProperty').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailDeath').toString())
					lIndexColumn+=1
					ExcelKeywords.setValueToCellByIndex(lWorkSheet,lIndexRow,lIndexColumn,lOutputItem.Output.get('DesignBModalDetailMaxDeath').toString())
				}
				IGNUemaHelper.saveExcelWorkbookByFileName(THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
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
				lOutputExcelSheetName=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_DEFAULT+lStrCaseNumber
			}else{
				lOutputExcelSheetName=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_SHEET_NAME_PREFIX_FILTERED+lStrCaseNumber
			}
			Workbook xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_FILE_NAME)
			Boolean lFoundExcelSheetName=IGNUemaHelper.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,lOutputExcelSheetName)
			Sheet xlsSheet=null
			Cell lExcelCell=null
			String lCellStr=''
			Integer lIndexRow=0
			Integer lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
			Boolean lIsValid=false
			if(lFoundExcelSheetName){
				xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,lOutputExcelSheetName)
				for(lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN;lIndexColumn<=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_END;lIndexColumn++){
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
			lIndexRow=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_ROW_BEGIN
			lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
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
			THAKumkaInsureCarResult_OutputType lOutputItem=new THAKumkaInsureCarResult_OutputType()
			while(lFoundNext){
				lOutputItem.initOutput()
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardDisplayPlanId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardDisplayPlanType',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardOpenScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScorePartnernameScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScorePartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreSuminsured',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreSuminsuredScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreExcessScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreGarageScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreDriverScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScoreProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalScorePropertyScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardPromotionText',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardInsurerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardPlanName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardBasicPremium',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardDiscountAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardSumInsure',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardIsRoadside',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardIsOnlinePayment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardIsCompulsoryAvailable',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardIsFlood',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignACardInstalmentPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAOutboundButtonName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailInsurerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailBasicPremium',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailDiscountAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailSuminsure',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailPromotion',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailFire',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailFlood',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailPersonal',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailMedical',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailBail',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailDeath',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignAModalDetailMaxDeath',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardDisplayPlanId',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardDisplayPlanType',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardOpenScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScorePartnernameScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScorePartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreSuminsured',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreSuminsuredScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreExcessScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreGarageScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreDriverScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScoreProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalScorePropertyScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardPromotionText',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardInsurerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardPlanName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardBasicPremium',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardDiscountAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardSumInsure',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardIsRoadside',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardIsOnlinePayment',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardIsCompulsoryAvailable',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardIsFlood',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBCardInstalmentPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBOutboundButtonName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailInsurerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailPartnerName',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailPrice',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailBasicPremium',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailDiscountAmount',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailSuminsure',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailScore',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailPromotion',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailExcess',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailGarage',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailDriver',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailFire',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailFlood',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailPersonal',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailMedical',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailBail',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailProperty',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailDeath',lCellStr)
				}
				lIndexColumn+=1
				lExcelCell=ExcelKeywords.getCellByIndex(xlsSheet,lIndexRow,lIndexColumn)
				if(lExcelCell){
					lCellStr=lExcelCell.getStringCellValue().trim()
					lOutputItem.Output.put('DesignBModalDetailMaxDeath',lCellStr)
				}
				lIsValid=this.addMapItemToOutputList(lOutputItem.Output)
				if(!lIsValid){
					this.lOutputList.clear()
					lRowCount=0
					break
				}
				lRowCount+=1
				lIndexRow+=1
				lIndexColumn=THAKumkaInsureCarResult_OutputType.OUTPUT_EXCEL_COL_BEGIN
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