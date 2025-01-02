package org.roojai.ignite.types.testmanager
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.keyword.excel.ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestMasterCasePrevFactory{
	private IGNTestMasterCaseTypeMain parentIGNTestMasterCaseTypeMain
	private String strIGNTestMasterCasePrevFactoryMessage=''
	private Boolean isIGNTestMasterCasePrevFactoryReady=false
	public TreeMap<Integer,IGNTestMasterCasePrevTypeSheet> MapIGNTestMasterCasePrevTypeSheet
	public IGNTestMasterCasePrevFactory(IGNTestMasterCaseTypeMain ignTestMasterCaseTypeMain){
		super()
		try{
			this.parentIGNTestMasterCaseTypeMain=ignTestMasterCaseTypeMain
			this.strIGNTestMasterCasePrevFactoryMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseTypeMain)){
				this.initIGNTestMasterCasePrevFactory()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCasePrevFactory(){
		try{
			this.isIGNTestMasterCasePrevFactoryReady=false
			Boolean lIsIGNTestMasterCasePrevFactoryReady=true
			if(lIsIGNTestMasterCasePrevFactoryReady){
				lIsIGNTestMasterCasePrevFactoryReady=this.prepareMapIGNTestMasterCasePrevTypeSheet()
			}
			this.isIGNTestMasterCasePrevFactoryReady=lIsIGNTestMasterCasePrevFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapIGNTestMasterCasePrevTypeSheet(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.MapIGNTestMasterCasePrevTypeSheet=new TreeMap<Integer,IGNTestMasterCasePrevTypeSheet>()
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.MapIGNTestMasterCasePrevTypeSheet))
			if(lIsPrepareOK){
				lIsPrepareOK=this.addMapIGNTestMasterCasePrevTypeSheetMemberList()
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean addMapIGNTestMasterCasePrevTypeSheetMemberList(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsAddOK=true
			Workbook lTestExcelFileWorkBook=this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getTestExcelFileWorkBook()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkBook)){
				return lreturn
			}
			List<String> lExcelSheetNameListAll=ExcelKeywords.getSheetNames(lTestExcelFileWorkBook)
			Integer lNumExcelSheetNameListAll=lExcelSheetNameListAll.size()
			TreeMap<Integer,String> lMapExcelSheetNameTarget=new TreeMap<Integer,String>()
			TreeMap<String,String> lMapExcelSheetNameSort=new TreeMap<String,String>()
			TreeMap<String,Sheet> lMapExcelSheetTarget=new TreeMap<String,Sheet>()
			Integer lNumMapExcelSheetNameTargetSize=lMapExcelSheetNameTarget.size()
			Boolean lIsAddToDo=lNumExcelSheetNameListAll>3
			if(lIsAddToDo){
				List<String> lExcelSheetNameListMain=new ArrayList<String>()
				lExcelSheetNameListMain.add(this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getParentIGNTestManager().getStrConfigExcelWorkSheetNameInput())
				lExcelSheetNameListMain.add(this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getParentIGNTestManager().getStrConfigExcelWorkSheetNameOutput())
				lExcelSheetNameListMain.add(this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getParentIGNTestManager().getStrConfigExcelWorkSheetNameTemplateOutput())
				lExcelSheetNameListAll.removeAll(lExcelSheetNameListMain)
				lNumExcelSheetNameListAll=lExcelSheetNameListAll.size()
				lIsAddToDo=lNumExcelSheetNameListAll>0
			}
			if(lIsAddToDo){
				for(String lExcelSheetNameItemAll in lExcelSheetNameListAll){
					Integer lNumSheetNameLength=lExcelSheetNameItemAll.length()
					if(lNumSheetNameLength<11){
						continue
					}
					String lStrCaseNumber=lExcelSheetNameItemAll.substring(0,4).trim()
					Integer lNumCaseNumber=IGNUemaHelper.convertStringToInteger(lStrCaseNumber,0)
					if(!(lNumCaseNumber==this.parentIGNTestMasterCaseTypeMain.getNumCaseIndex())){
						continue
					}
					String lStrSheetIndex=lExcelSheetNameItemAll.substring(5,9).trim()
					Integer lNumSheetIndex=IGNUemaHelper.convertStringToInteger(lStrSheetIndex,0)
					if(lNumSheetIndex<=0){
						continue
					}
					if(lMapExcelSheetNameTarget.isEmpty()){
						lNumSheetIndex=1
					}else{
						lNumSheetIndex=Collections.max(lMapExcelSheetNameTarget.keySet())
						lNumSheetIndex=lNumSheetIndex+1
					}
					lMapExcelSheetNameTarget.put(lNumSheetIndex,lExcelSheetNameItemAll)
				}
				lNumMapExcelSheetNameTargetSize=lMapExcelSheetNameTarget.size()
				lIsAddToDo=lNumMapExcelSheetNameTargetSize>0
			}
			if(lIsAddToDo){
				lMapExcelSheetNameTarget.sort(null)
				for(Map.Entry lEntryMapExcelSheetNameTarget in lMapExcelSheetNameTarget){
					String lExcelSheetNameFull=lEntryMapExcelSheetNameTarget.value
					lMapExcelSheetNameSort.put(lExcelSheetNameFull,lExcelSheetNameFull)
				}
				lNumMapExcelSheetNameTargetSize=lMapExcelSheetNameSort.size()
				lIsAddToDo=lNumMapExcelSheetNameTargetSize>0
			}
			if(lIsAddToDo){
				lMapExcelSheetNameSort.sort(null)
				lMapExcelSheetNameTarget.clear()
				for(Map.Entry lEntryMapExcelSheetNameSort in lMapExcelSheetNameSort){
					String lExcelSheetNameFull=lEntryMapExcelSheetNameSort.key
					Integer lNumSheetIndex=0
					if(lMapExcelSheetNameTarget.isEmpty()){
						lNumSheetIndex=1
					}else{
						lNumSheetIndex=Collections.max(lMapExcelSheetNameTarget.keySet())
						lNumSheetIndex=lNumSheetIndex+1
					}
					lMapExcelSheetNameTarget.put(lNumSheetIndex,lExcelSheetNameFull)
				}
				lNumMapExcelSheetNameTargetSize=lMapExcelSheetNameTarget.size()
				lIsAddToDo=lNumMapExcelSheetNameTargetSize>0
			}
			if(lIsAddToDo){
				lMapExcelSheetNameTarget.sort(null)
				for(Map.Entry lEntryMapExcelSheetNameTarget in lMapExcelSheetNameTarget){
					String lExcelSheetNameFull=lEntryMapExcelSheetNameTarget.value
					Sheet lExcelSheet=IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(lTestExcelFileWorkBook,lExcelSheetNameFull)
					if(IGNUemaHelper.checkObjectNullOfObject(lExcelSheet)){
						lIsAddOK=false
						break
					}
					lIsAddOK=this.checkIntegrityOfTestExcelFileTemplateOutputByExcelFile(lExcelSheet)
					if(!lIsAddOK){
						break
					}
					lMapExcelSheetTarget.put(lExcelSheetNameFull,lExcelSheet)
				}
				lIsAddToDo=lIsAddOK
				if(lIsAddToDo){
					lNumMapExcelSheetNameTargetSize=lMapExcelSheetTarget.size()
					lIsAddToDo=lNumMapExcelSheetNameTargetSize>0
				}
			}
			if(lIsAddToDo){
				for(Map.Entry lEntryMapExcelSheetTarget in lMapExcelSheetTarget){
					String lExcelSheetNameFull=lEntryMapExcelSheetTarget.key
					Sheet lExcelSheet=lEntryMapExcelSheetTarget.value
					IGNTestMasterCasePrevTypeSheet lIGNTestMasterCasePrevTypeSheet=this.addIGNTestMasterCasePrevTypeSheet(lExcelSheetNameFull)
					if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeSheet)){
						lIsAddOK=false
						break
					}
					lIsAddOK=this.addDataRowOfIGNTestMasterCasePrevTypeSheetByExcelSheet(lExcelSheet,lIGNTestMasterCasePrevTypeSheet)
					if(!lIsAddOK){
						break
					}
				}
			}
			lreturn=lIsAddOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean checkIntegrityOfTestExcelFileTemplateOutputByExcelFile(Sheet excelWorkSheetTemplateOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(excelWorkSheetTemplateOutput)){
			return lreturn
		}
		try{
			Boolean lIsScanOK=true
			List<IGNTestMasterFieldTypeMultiple> lListIGNTestMasterFieldTypeMultiple=this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeMultiple()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListIGNTestMasterFieldTypeMultiple)){
				return lreturn
			}
			Integer lNumExcelCellRowIndex=0
			for(IGNTestMasterFieldTypeMultiple lItemIGNTestMasterFieldTypeMultiple in lListIGNTestMasterFieldTypeMultiple){
				Integer lNumExcelCellColIndex=lItemIGNTestMasterFieldTypeMultiple.getNumExcelCellColIndex()
				String lStrProjectFieldListFieldName=lItemIGNTestMasterFieldTypeMultiple.getStrProjectFieldListFieldName()
				String lStrCellText=''
				try{
					lStrCellText=ExcelKeywords.getCellValueByIndex(excelWorkSheetTemplateOutput,lNumExcelCellRowIndex,lNumExcelCellColIndex)
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				lStrCellText=lStrCellText.trim()
				if(lStrCellText.isBlank()){
					lIsScanOK=false
					break
				}
				if(!lStrCellText.equals(lStrProjectFieldListFieldName)){
					lIsScanOK=false
					break
				}
			}
			lreturn=lIsScanOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean addDataRowOfIGNTestMasterCasePrevTypeSheetByExcelSheet(Sheet excelWorkSheetTemplateOutput,IGNTestMasterCasePrevTypeSheet targetIGNTestMasterCasePrevTypeSheet){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(excelWorkSheetTemplateOutput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(targetIGNTestMasterCasePrevTypeSheet)){
			return lreturn
		}
		try{
			Boolean lIsAddOK=true
			List<IGNTestMasterFieldTypeMultiple> lListIGNTestMasterFieldTypeMultiple=this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeMultiple()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListIGNTestMasterFieldTypeMultiple)){
				return lreturn
			}
			Integer lNumExcelCellRowMax=excelWorkSheetTemplateOutput.getLastRowNum()
			Integer lNumExcelCellRowIndex=0
			for(lNumExcelCellRowIndex=1;lNumExcelCellRowIndex<=lNumExcelCellRowMax;lNumExcelCellRowIndex++){
				String lStrRowIndexText=''
				try{
					lStrRowIndexText=ExcelKeywords.getCellValueByIndex(excelWorkSheetTemplateOutput,lNumExcelCellRowIndex,0)
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				lStrRowIndexText=lStrRowIndexText.trim()
				if(lStrRowIndexText.isBlank()){
					break
				}
				IGNTestMasterCasePrevTypeRow lIGNTestMasterCasePrevTypeRow=targetIGNTestMasterCasePrevTypeSheet.addIGNTestMasterCasePrevTypeRow()
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeRow)){
					lIsAddOK=false
					break
				}
				if(!lIGNTestMasterCasePrevTypeRow.getIsIGNTestMasterCasePrevTypeRowValid()){
					lIsAddOK=false
					break
				}
				for(IGNTestMasterFieldTypeMultiple lItemIGNTestMasterFieldTypeMultiple in lListIGNTestMasterFieldTypeMultiple){
					Integer lNumExcelCellColIndex=lItemIGNTestMasterFieldTypeMultiple.getNumExcelCellColIndex()
					String lStrProgramParameterName=lItemIGNTestMasterFieldTypeMultiple.getStrProgramParameterName()
					String lStrCellText=''
					try{
						lStrCellText=ExcelKeywords.getCellValueByIndex(excelWorkSheetTemplateOutput,lNumExcelCellRowIndex,lNumExcelCellColIndex)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					lStrCellText=lStrCellText.trim()
					if(!lIGNTestMasterCasePrevTypeRow.MapDataOutput.containsKey(lStrProgramParameterName)){
						lIsAddOK=false
						break
					}
					lIGNTestMasterCasePrevTypeRow.MapDataOutput.put(lStrProgramParameterName,lStrCellText)
				}
				if(!lIsAddOK){
					break
				}
			}
			lreturn=lIsAddOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private IGNTestMasterCasePrevTypeSheet addIGNTestMasterCasePrevTypeSheet(String strSheetName){
		IGNTestMasterCasePrevTypeSheet lreturn=null
		if(IGNUemaHelper.checkObjectNullOfObject(this.MapIGNTestMasterCasePrevTypeSheet)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSheetName)){
			return lreturn
		}
		String lStrSheetName=strSheetName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSheetName)){
			return lreturn
		}
		if(lStrSheetName.length()>31){
			return lreturn
		}
		try{
			Integer lNumSheetIndex=0
			Boolean lAddToDo=false
			IGNTestMasterCasePrevTypeSheet lIGNTestMasterCasePrevTypeSheet=null
			if(IGNUemaHelper.checkObjectEmptyOfMap(this.MapIGNTestMasterCasePrevTypeSheet)){
				lNumSheetIndex=1
				lAddToDo=lStrSheetName.length()<=31
				if(lAddToDo){
					lIGNTestMasterCasePrevTypeSheet=new IGNTestMasterCasePrevTypeSheet(this,lNumSheetIndex,lStrSheetName)
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeSheet)){
						if(lIGNTestMasterCasePrevTypeSheet.getIsIGNTestMasterCasePrevTypeSheetValid()){
							this.MapIGNTestMasterCasePrevTypeSheet.put(lNumSheetIndex,lIGNTestMasterCasePrevTypeSheet)
						}
					}
				}
			}else{
				Integer lNumSheetMax=Collections.max(this.MapIGNTestMasterCasePrevTypeSheet.keySet())
				lNumSheetIndex=lNumSheetMax+1
				lAddToDo=lStrSheetName.length()<=31
				if(lAddToDo){
					Boolean lIsFoundSheetName=false
					for(Map.Entry lEntryIGNTestMasterCasePrevTypeSheet in this.MapIGNTestMasterCasePrevTypeSheet){
						IGNTestMasterCasePrevTypeSheet lIGNTestMasterCasePrevTypeSheetItem=lEntryIGNTestMasterCasePrevTypeSheet.value
						if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeSheetItem)){
							if(lIGNTestMasterCasePrevTypeSheetItem.getStrSheetName().equalsIgnoreCase(lStrSheetName)){
								lIsFoundSheetName=true
								lIGNTestMasterCasePrevTypeSheet=lIGNTestMasterCasePrevTypeSheetItem
								break
							}
						}
					}
					if(!lIsFoundSheetName){
						lIGNTestMasterCasePrevTypeSheet=new IGNTestMasterCasePrevTypeSheet(this,lNumSheetIndex,lStrSheetName)
						if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeSheet)){
							if(lIGNTestMasterCasePrevTypeSheet.getIsIGNTestMasterCasePrevTypeSheetValid()){
								this.MapIGNTestMasterCasePrevTypeSheet.put(lNumSheetIndex,lIGNTestMasterCasePrevTypeSheet)
							}
						}
					}
				}
			}
			lreturn=lIGNTestMasterCasePrevTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseTypeMain getParentIGNTestMasterCaseTypeMain(){
		try{
			return this.parentIGNTestMasterCaseTypeMain
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseTypeMain(IGNTestMasterCaseTypeMain newParentIGNTestMasterCaseTypeMain){
		//Do Nothing
		//this.parentIGNTestMasterCaseTypeMain=newParentIGNTestMasterCaseTypeMain
	}
	public String getStrIGNTestMasterCasePrevFactoryMessage(){
		try{
			return this.strIGNTestMasterCasePrevFactoryMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCasePrevFactoryMessage(String newStrIGNTestMasterCasePrevFactoryMessage){
		//Do Nothing
		//this.strIGNTestMasterCasePrevFactoryMessage=newStrIGNTestMasterCasePrevFactoryMessage
	}
	public Boolean getIsIGNTestMasterCasePrevFactoryReady(){
		try{
			return this.isIGNTestMasterCasePrevFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCasePrevFactoryReady(Boolean newIsIGNTestMasterCasePrevFactoryReady){
		//Do Nothing
		//this.isIGNTestMasterCasePrevFactoryReady=newIsIGNTestMasterCasePrevFactoryReady
	}
	public TreeMap<Integer,IGNTestMasterCasePrevTypeSheet> getMapIGNTestMasterCasePrevTypeSheet(){
		try{
			return this.MapIGNTestMasterCasePrevTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterCasePrevTypeSheet(TreeMap<Integer,IGNTestMasterCasePrevTypeSheet> newMapIGNTestMasterCasePrevTypeSheet){
		//Do Nothing
		//this.MapIGNTestMasterCasePrevTypeSheet=newMapIGNTestMasterCasePrevTypeSheet
	}
	public IGNTestMasterCasePrevTypeSheet getIGNTestMasterCasePrevTypeSheet(Integer numSheetIndex){
		IGNTestMasterCasePrevTypeSheet lreturn=null
		if(!this.isIGNTestMasterCasePrevFactoryReady){
			return lreturn
		}
		if(numSheetIndex<=0){
			return lreturn
		}
		try{
			if(this.MapIGNTestMasterCasePrevTypeSheet.containsKey(numSheetIndex)){
				lreturn=this.MapIGNTestMasterCasePrevTypeSheet.get(numSheetIndex)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public TreeMap<Integer,IGNTestMasterCasePrevTypeRow> getIGNTestMasterCasePrevTypeSheetMapIGNTestMasterCasePrevTypeRow(Integer numSheetIndex){
		TreeMap<Integer,IGNTestMasterCasePrevTypeRow> lreturn=null
		if(!this.isIGNTestMasterCasePrevFactoryReady){
			return lreturn
		}
		if(numSheetIndex<=0){
			return lreturn
		}
		try{
			IGNTestMasterCasePrevTypeSheet lIGNTestMasterCasePrevTypeSheet=this.getIGNTestMasterCasePrevTypeSheet(numSheetIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeSheet)){
				if(lIGNTestMasterCasePrevTypeSheet.getIsIGNTestMasterCasePrevTypeSheetValid()){
					lreturn=lIGNTestMasterCasePrevTypeSheet.MapIGNTestMasterCasePrevTypeRow
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}