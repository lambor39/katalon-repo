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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestMasterCaseGroupTypeSheet{
	private IGNTestMasterCaseGroupFactory parentIGNTestMasterCaseGroupFactory
	private String strIGNTestMasterCaseGroupTypeSheetMessage=''
	private Boolean isIGNTestMasterCaseGroupTypeSheetValid=false
	private Integer numSheetIndex=0
	private String strSheetName=''
	public TreeMap<Integer,IGNTestMasterCaseGroupTypeRow> MapIGNTestMasterCaseGroupTypeRow
	public IGNTestMasterCaseGroupTypeSheet(IGNTestMasterCaseGroupFactory ignTestMasterCaseGroupFactory,Integer numInitSheetIndex,String strInitSheetName){
		super()
		try{
			this.parentIGNTestMasterCaseGroupFactory=ignTestMasterCaseGroupFactory
			this.strIGNTestMasterCaseGroupTypeSheetMessage=''
			this.numSheetIndex=numInitSheetIndex
			this.strSheetName=strInitSheetName.trim()
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseGroupFactory)){
				this.initIGNTestMasterCaseGroupTypeSheet()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCaseGroupTypeSheet(){
		try{
			this.isIGNTestMasterCaseGroupTypeSheetValid=false
			Boolean lIsIGNTestMasterCaseGroupTypeSheetValid=true
			lIsIGNTestMasterCaseGroupTypeSheetValid=lIsIGNTestMasterCaseGroupTypeSheetValid&&(this.numSheetIndex>0)
			lIsIGNTestMasterCaseGroupTypeSheetValid=lIsIGNTestMasterCaseGroupTypeSheetValid&&(this.strSheetName.length()>0)
			lIsIGNTestMasterCaseGroupTypeSheetValid=lIsIGNTestMasterCaseGroupTypeSheetValid&&(this.strSheetName.length()<=31)
			if(lIsIGNTestMasterCaseGroupTypeSheetValid){
				lIsIGNTestMasterCaseGroupTypeSheetValid=this.prepareMapIGNTestMasterCaseGroupTypeRow()
			}
			this.isIGNTestMasterCaseGroupTypeSheetValid=lIsIGNTestMasterCaseGroupTypeSheetValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapIGNTestMasterCaseGroupTypeRow(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseGroupFactory.getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}

		try{
			Boolean lIsPrepareOK=true
			this.MapIGNTestMasterCaseGroupTypeRow=new TreeMap<Integer,IGNTestMasterCaseGroupTypeRow>()
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.MapIGNTestMasterCaseGroupTypeRow))
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseGroupFactory getParentIGNTestMasterCaseGroupFactory(){
		try{
			return this.parentIGNTestMasterCaseGroupFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseGroupFactory(IGNTestMasterCaseGroupFactory newParentIGNTestMasterCaseGroupFactory){
		//Do Nothing
		//this.parentIGNTestMasterCaseGroupFactory=newParentIGNTestMasterCaseGroupFactory
	}
	public String getStrIGNTestMasterCaseGroupTypeSheetMessage(){
		try{
			return this.strIGNTestMasterCaseGroupTypeSheetMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCaseGroupTypeSheetMessage(String newStrIGNTestMasterCaseGroupTypeSheetMessage){
		//Do Nothing
		//this.strIGNTestMasterCaseGroupTypeSheetMessage=newStrIGNTestMasterCaseGroupTypeSheetMessage
	}
	public Boolean getIsIGNTestMasterCaseGroupTypeSheetValid(){
		try{
			return this.isIGNTestMasterCaseGroupTypeSheetValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseGroupTypeSheetValid(Boolean newIsIGNTestMasterCaseGroupTypeSheetValid){
		//Do Nothing
		//this.isIGNTestMasterCaseGroupTypeSheetValid=newIsIGNTestMasterCaseGroupTypeSheetValid
	}
	public Integer getNumSheetIndex(){
		try{
			return this.numSheetIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setNumSheetIndex(Integer newNumSheetIndex){
		//Do Nothing
		//this.numSheetIndex=newNumSheetIndex
	}
	public String getStrSheetIndex(){
		try{
			return this.strSheetIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setStrSheetIndex(String newStrSheetIndex){
		//Do Nothing
		//this.strSheetIndex=newStrSheetIndex
	}
	public String getStrSheetName(){
		try{
			return this.strSheetName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setStrSheetName(String newStrSheetName){
		//Do Nothing
		//this.strSheetName=newStrSheetName
	}
	public TreeMap<Integer,IGNTestMasterCaseGroupTypeRow> getMapIGNTestMasterCaseGroupTypeRow(){
		try{
			return this.MapIGNTestMasterCaseGroupTypeRow
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterCaseGroupTypeRow(TreeMap<Integer,IGNTestMasterCaseGroupTypeRow> newMapIGNTestMasterCaseGroupTypeRow){
		//Do Nothing
		//this.MapIGNTestMasterCaseGroupTypeRow=newMapIGNTestMasterCaseGroupTypeRow
	}
	public IGNTestMasterCaseGroupTypeRow getIGNTestMasterCaseGroupTypeRow(Integer numRowIndex){
		IGNTestMasterCaseGroupTypeRow lreturn=null
		if(!this.isIGNTestMasterCaseGroupTypeSheetValid){
			return lreturn
		}
		if(numRowIndex<=0){
			return lreturn
		}
		try{
			if(this.MapIGNTestMasterCaseGroupTypeRow.containsKey(numRowIndex)){
				lreturn=this.MapIGNTestMasterCaseGroupTypeRow.get(numRowIndex)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Map<String,String> getIGNTestMasterCaseGroupTypeRowMapDataOutput(Integer numRowIndex){
		Map<String,String> lreturn=[:]
		if(!this.isIGNTestMasterCaseGroupTypeSheetValid){
			return lreturn
		}
		if(numRowIndex<=0){
			return lreturn
		}
		try{
			IGNTestMasterCaseGroupTypeRow lIGNTestMasterCaseGroupTypeRow=this.getIGNTestMasterCaseGroupTypeRow(numRowIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow)){
				if(lIGNTestMasterCaseGroupTypeRow.getIsIGNTestMasterCaseGroupTypeRowValid()){
					lreturn=lIGNTestMasterCaseGroupTypeRow.MapDataOutput
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseGroupTypeRow addIGNTestMasterCaseGroupTypeRow(){
		IGNTestMasterCaseGroupTypeRow lreturn=null
		if(!this.isIGNTestMasterCaseGroupTypeSheetValid){
			return lreturn
		}
		try{
			Integer lNumRowIndex=0
			if(IGNUemaHelper.checkObjectEmptyOfMap(this.MapIGNTestMasterCaseGroupTypeRow)){
				lNumRowIndex=1
			}else{
				Integer lNumRowMax=Collections.max(this.MapIGNTestMasterCaseGroupTypeRow.keySet())
				lNumRowIndex=lNumRowMax+1
			}
			IGNTestMasterCaseGroupTypeRow lIGNTestMasterCaseGroupTypeRow=new IGNTestMasterCaseGroupTypeRow(this,lNumRowIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow)){
				if(lIGNTestMasterCaseGroupTypeRow.getIsIGNTestMasterCaseGroupTypeRowValid()){
					this.MapIGNTestMasterCaseGroupTypeRow.put(lNumRowIndex,lIGNTestMasterCaseGroupTypeRow)
					lreturn=lIGNTestMasterCaseGroupTypeRow
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}