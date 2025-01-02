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
public class IGNTestMasterCasePrevTypeSheet{
	private IGNTestMasterCasePrevFactory parentIGNTestMasterCasePrevFactory
	private String strIGNTestMasterCasePrevTypeSheetMessage=''
	private Boolean isIGNTestMasterCasePrevTypeSheetValid=false
	private Integer numSheetIndex=0
	private String strSheetName=''
	public TreeMap<Integer,IGNTestMasterCasePrevTypeRow> MapIGNTestMasterCasePrevTypeRow
	public IGNTestMasterCasePrevTypeSheet(IGNTestMasterCasePrevFactory ignTestMasterCasePrevFactory,Integer numInitSheetIndex,String strInitSheetName){
		super()
		try{
			this.parentIGNTestMasterCasePrevFactory=ignTestMasterCasePrevFactory
			this.strIGNTestMasterCasePrevTypeSheetMessage=''
			this.numSheetIndex=numInitSheetIndex
			this.strSheetName=strInitSheetName.trim()
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCasePrevFactory)){
				this.initIGNTestMasterCasePrevTypeSheet()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCasePrevTypeSheet(){
		try{
			this.isIGNTestMasterCasePrevTypeSheetValid=false
			Boolean lIsIGNTestMasterCasePrevTypeSheetValid=true
			lIsIGNTestMasterCasePrevTypeSheetValid=lIsIGNTestMasterCasePrevTypeSheetValid&&(this.numSheetIndex>0)
			lIsIGNTestMasterCasePrevTypeSheetValid=lIsIGNTestMasterCasePrevTypeSheetValid&&(this.strSheetName.length()>0)
			lIsIGNTestMasterCasePrevTypeSheetValid=lIsIGNTestMasterCasePrevTypeSheetValid&&(this.strSheetName.length()<=31)
			if(lIsIGNTestMasterCasePrevTypeSheetValid){
				lIsIGNTestMasterCasePrevTypeSheetValid=this.prepareMapIGNTestMasterCasePrevTypeRow()
			}
			this.isIGNTestMasterCasePrevTypeSheetValid=lIsIGNTestMasterCasePrevTypeSheetValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapIGNTestMasterCasePrevTypeRow(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCasePrevFactory.getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}

		try{
			Boolean lIsPrepareOK=true
			this.MapIGNTestMasterCasePrevTypeRow=new TreeMap<Integer,IGNTestMasterCasePrevTypeRow>()
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.MapIGNTestMasterCasePrevTypeRow))
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCasePrevFactory getParentIGNTestMasterCasePrevFactory(){
		try{
			return this.parentIGNTestMasterCasePrevFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCasePrevFactory(IGNTestMasterCasePrevFactory newParentIGNTestMasterCasePrevFactory){
		//Do Nothing
		//this.parentIGNTestMasterCasePrevFactory=newParentIGNTestMasterCasePrevFactory
	}
	public String getStrIGNTestMasterCasePrevTypeSheetMessage(){
		try{
			return this.strIGNTestMasterCasePrevTypeSheetMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCasePrevTypeSheetMessage(String newStrIGNTestMasterCasePrevTypeSheetMessage){
		//Do Nothing
		//this.strIGNTestMasterCasePrevTypeSheetMessage=newStrIGNTestMasterCasePrevTypeSheetMessage
	}
	public Boolean getIsIGNTestMasterCasePrevTypeSheetValid(){
		try{
			return this.isIGNTestMasterCasePrevTypeSheetValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCasePrevTypeSheetValid(Boolean newIsIGNTestMasterCasePrevTypeSheetValid){
		//Do Nothing
		//this.isIGNTestMasterCasePrevTypeSheetValid=newIsIGNTestMasterCasePrevTypeSheetValid
	}
	public Integer getNumSheetIndex(){
		try{
			return this.numSheetIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
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
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
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
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setStrSheetName(String newStrSheetName){
		//Do Nothing
		//this.strSheetName=newStrSheetName
	}
	public TreeMap<Integer,IGNTestMasterCasePrevTypeRow> getMapIGNTestMasterCasePrevTypeRow(){
		try{
			return this.MapIGNTestMasterCasePrevTypeRow
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterCasePrevTypeRow(TreeMap<Integer,IGNTestMasterCasePrevTypeRow> newMapIGNTestMasterCasePrevTypeRow){
		//Do Nothing
		//this.MapIGNTestMasterCasePrevTypeRow=newMapIGNTestMasterCasePrevTypeRow
	}
	public IGNTestMasterCasePrevTypeRow getIGNTestMasterCasePrevTypeRow(Integer numRowIndex){
		IGNTestMasterCasePrevTypeRow lreturn=null
		if(!this.isIGNTestMasterCasePrevTypeSheetValid){
			return lreturn
		}
		if(numRowIndex<=0){
			return lreturn
		}
		try{
			if(this.MapIGNTestMasterCasePrevTypeRow.containsKey(numRowIndex)){
				lreturn=this.MapIGNTestMasterCasePrevTypeRow.get(numRowIndex)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Map<String,String> getIGNTestMasterCasePrevTypeRowMapDataOutput(Integer numRowIndex){
		Map<String,String> lreturn=[:]
		if(!this.isIGNTestMasterCasePrevTypeSheetValid){
			return lreturn
		}
		if(numRowIndex<=0){
			return lreturn
		}
		try{
			IGNTestMasterCasePrevTypeRow lIGNTestMasterCasePrevTypeRow=this.getIGNTestMasterCasePrevTypeRow(numRowIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeRow)){
				if(lIGNTestMasterCasePrevTypeRow.getIsIGNTestMasterCasePrevTypeRowValid()){
					lreturn=lIGNTestMasterCasePrevTypeRow.MapDataOutput
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCasePrevTypeRow addIGNTestMasterCasePrevTypeRow(){
		IGNTestMasterCasePrevTypeRow lreturn=null
		if(!this.isIGNTestMasterCasePrevTypeSheetValid){
			return lreturn
		}
		try{
			Integer lNumRowIndex=0
			if(IGNUemaHelper.checkObjectEmptyOfMap(this.MapIGNTestMasterCasePrevTypeRow)){
				lNumRowIndex=1
			}else{
				Integer lNumRowMax=Collections.max(this.MapIGNTestMasterCasePrevTypeRow.keySet())
				lNumRowIndex=lNumRowMax+1
			}
			IGNTestMasterCasePrevTypeRow lIGNTestMasterCasePrevTypeRow=new IGNTestMasterCasePrevTypeRow(this,lNumRowIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCasePrevTypeRow)){
				if(lIGNTestMasterCasePrevTypeRow.getIsIGNTestMasterCasePrevTypeRowValid()){
					this.MapIGNTestMasterCasePrevTypeRow.put(lNumRowIndex,lIGNTestMasterCasePrevTypeRow)
					lreturn=lIGNTestMasterCasePrevTypeRow
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeSheetMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeSheetMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}