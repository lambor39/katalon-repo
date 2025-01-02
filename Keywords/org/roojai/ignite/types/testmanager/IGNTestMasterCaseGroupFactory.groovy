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
public class IGNTestMasterCaseGroupFactory{
	private IGNTestMasterCaseTypeMain parentIGNTestMasterCaseTypeMain
	private String strIGNTestMasterCaseGroupFactoryMessage=''
	private Boolean isIGNTestMasterCaseGroupFactoryReady=false
	public TreeMap<Integer,IGNTestMasterCaseGroupTypeSheet> MapIGNTestMasterCaseGroupTypeSheet
	public IGNTestMasterCaseGroupFactory(IGNTestMasterCaseTypeMain ignTestMasterCaseTypeMain){
		super()
		try{
			this.parentIGNTestMasterCaseTypeMain=ignTestMasterCaseTypeMain
			this.strIGNTestMasterCaseGroupFactoryMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseTypeMain)){
				this.initIGNTestMasterCaseGroupFactory()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCaseGroupFactory(){
		try{
			this.isIGNTestMasterCaseGroupFactoryReady=false
			Boolean lIsIGNTestMasterCaseGroupFactoryReady=true
			if(lIsIGNTestMasterCaseGroupFactoryReady){
				lIsIGNTestMasterCaseGroupFactoryReady=this.prepareMapIGNTestMasterCaseGroupTypeSheet()
			}
			this.isIGNTestMasterCaseGroupFactoryReady=lIsIGNTestMasterCaseGroupFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapIGNTestMasterCaseGroupTypeSheet(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.MapIGNTestMasterCaseGroupTypeSheet=new TreeMap<Integer,IGNTestMasterCaseGroupTypeSheet>()
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.MapIGNTestMasterCaseGroupTypeSheet))
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
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
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseTypeMain(IGNTestMasterCaseTypeMain newParentIGNTestMasterCaseTypeMain){
		//Do Nothing
		//this.parentIGNTestMasterCaseTypeMain=newParentIGNTestMasterCaseTypeMain
	}
	public String getStrIGNTestMasterCaseGroupFactoryMessage(){
		try{
			return this.strIGNTestMasterCaseGroupFactoryMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCaseGroupFactoryMessage(String newStrIGNTestMasterCaseGroupFactoryMessage){
		//Do Nothing
		//this.strIGNTestMasterCaseGroupFactoryMessage=newStrIGNTestMasterCaseGroupFactoryMessage
	}
	public Boolean getIsIGNTestMasterCaseGroupFactoryReady(){
		try{
			return this.isIGNTestMasterCaseGroupFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseGroupFactoryReady(Boolean newIsIGNTestMasterCaseGroupFactoryReady){
		//Do Nothing
		//this.isIGNTestMasterCaseGroupFactoryReady=newIsIGNTestMasterCaseGroupFactoryReady
	}
	public TreeMap<Integer,IGNTestMasterCaseGroupTypeSheet> getMapIGNTestMasterCaseGroupTypeSheet(){
		try{
			return this.MapIGNTestMasterCaseGroupTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterCaseGroupTypeSheet(TreeMap<Integer,IGNTestMasterCaseGroupTypeSheet> newMapIGNTestMasterCaseGroupTypeSheet){
		//Do Nothing
		//this.MapIGNTestMasterCaseGroupTypeSheet=newMapIGNTestMasterCaseGroupTypeSheet
	}
	public IGNTestMasterCaseGroupTypeSheet getIGNTestMasterCaseGroupTypeSheet(Integer numSheetIndex){
		IGNTestMasterCaseGroupTypeSheet lreturn=null
		if(!this.isIGNTestMasterCaseGroupFactoryReady){
			return lreturn
		}
		if(numSheetIndex<=0){
			return lreturn
		}
		try{
			if(this.MapIGNTestMasterCaseGroupTypeSheet.containsKey(numSheetIndex)){
				lreturn=this.MapIGNTestMasterCaseGroupTypeSheet.get(numSheetIndex)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public TreeMap<Integer,IGNTestMasterCaseGroupTypeRow> getIGNTestMasterCaseGroupTypeSheetMapIGNTestMasterCaseGroupTypeRow(Integer numSheetIndex){
		TreeMap<Integer,IGNTestMasterCaseGroupTypeRow> lreturn=null
		if(!this.isIGNTestMasterCaseGroupFactoryReady){
			return lreturn
		}
		if(numSheetIndex<=0){
			return lreturn
		}
		try{
			IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheet=this.getIGNTestMasterCaseGroupTypeSheet(numSheetIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet)){
				if(lIGNTestMasterCaseGroupTypeSheet.getIsIGNTestMasterCaseGroupTypeSheetValid()){
					lreturn=lIGNTestMasterCaseGroupTypeSheet.MapIGNTestMasterCaseGroupTypeRow
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseGroupTypeSheet addIGNTestMasterCaseGroupTypeSheet(String strSheetName){
		IGNTestMasterCaseGroupTypeSheet lreturn=null
		if(!this.isIGNTestMasterCaseGroupFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strSheetName)){
			return lreturn
		}
		String lStrSheetName=strSheetName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrSheetName)){
			return lreturn
		}
		if(lStrSheetName.length()>20){
			return lreturn
		}
		try{
			Integer lNumSheetIndex=0
			Boolean lAddToDo=false
			IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheet=null
			if(IGNUemaHelper.checkObjectEmptyOfMap(this.MapIGNTestMasterCaseGroupTypeSheet)){
				lNumSheetIndex=1
				lStrSheetName=this.parentIGNTestMasterCaseTypeMain.getStrCaseIndex()+'.'+lNumSheetIndex.toString().padLeft(4,'0')+'.'+lStrSheetName
				lStrSheetName=lStrSheetName.trim()
				lAddToDo=lStrSheetName.length()<=31
				if(lAddToDo){
					lIGNTestMasterCaseGroupTypeSheet=new IGNTestMasterCaseGroupTypeSheet(this,lNumSheetIndex,lStrSheetName)
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet)){
						if(lIGNTestMasterCaseGroupTypeSheet.getIsIGNTestMasterCaseGroupTypeSheetValid()){
							this.MapIGNTestMasterCaseGroupTypeSheet.put(lNumSheetIndex,lIGNTestMasterCaseGroupTypeSheet)
						}
					}
				}
			}else{
				Integer lNumSheetMax=Collections.max(this.MapIGNTestMasterCaseGroupTypeSheet.keySet())
				lNumSheetIndex=lNumSheetMax+1
				lStrSheetName=this.parentIGNTestMasterCaseTypeMain.getStrCaseIndex()+'.'+lNumSheetIndex.toString().padLeft(4,'0')+'.'+lStrSheetName
				lStrSheetName=lStrSheetName.trim()
				lAddToDo=lStrSheetName.length()<=31
				if(lAddToDo){
					Boolean lIsFoundSheetName=false
					for(Map.Entry lEntryIGNTestMasterCaseGroupTypeSheet in this.MapIGNTestMasterCaseGroupTypeSheet){
						IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheetItem=lEntryIGNTestMasterCaseGroupTypeSheet.value
						if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheetItem)){
							if(lIGNTestMasterCaseGroupTypeSheetItem.getStrSheetName().equalsIgnoreCase(lStrSheetName)){
								lIsFoundSheetName=true
								lIGNTestMasterCaseGroupTypeSheet=lIGNTestMasterCaseGroupTypeSheetItem
								break
							}
						}
					}
					if(!lIsFoundSheetName){
						lIGNTestMasterCaseGroupTypeSheet=new IGNTestMasterCaseGroupTypeSheet(this,lNumSheetIndex,lStrSheetName)
						if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet)){
							if(lIGNTestMasterCaseGroupTypeSheet.getIsIGNTestMasterCaseGroupTypeSheetValid()){
								this.MapIGNTestMasterCaseGroupTypeSheet.put(lNumSheetIndex,lIGNTestMasterCaseGroupTypeSheet)
							}
						}
					}
				}
			}
			lreturn=lIGNTestMasterCaseGroupTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}