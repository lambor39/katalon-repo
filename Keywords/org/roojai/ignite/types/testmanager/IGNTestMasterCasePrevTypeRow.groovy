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
public class IGNTestMasterCasePrevTypeRow{
	private IGNTestMasterCasePrevTypeSheet parentIGNTestMasterCasePrevTypeSheet
	private String strIGNTestMasterCasePrevTypeRowMessage=''
	private Boolean isIGNTestMasterCasePrevTypeRowValid=false
	private Integer numRowIndex=0
	private String strRowIndex=''
	public Map<String,String> MapDataOutput=[:]
	public IGNTestMasterCasePrevTypeRow(IGNTestMasterCasePrevTypeSheet ignTestMasterCasePrevTypeSheet,Integer numInitRowIndex){
		super()
		try{
			this.parentIGNTestMasterCasePrevTypeSheet=ignTestMasterCasePrevTypeSheet
			this.strIGNTestMasterCasePrevTypeRowMessage=''
			this.numRowIndex=numInitRowIndex
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCasePrevTypeSheet)){
				this.initIGNTestMasterCasePrevTypeRow()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCasePrevTypeRow(){
		try{
			this.isIGNTestMasterCasePrevTypeRowValid=false
			Boolean lIsIGNTestMasterCasePrevTypeRowValid=true
			this.strRowIndex=String.format('%06d',this.numRowIndex)
			lIsIGNTestMasterCasePrevTypeRowValid=lIsIGNTestMasterCasePrevTypeRowValid&&(this.numRowIndex>0)
			lIsIGNTestMasterCasePrevTypeRowValid=lIsIGNTestMasterCasePrevTypeRowValid&&(this.strRowIndex.length()>0)
			if(lIsIGNTestMasterCasePrevTypeRowValid){
				lIsIGNTestMasterCasePrevTypeRowValid=this.prepareMapDataOutput()
			}
			this.isIGNTestMasterCasePrevTypeRowValid=lIsIGNTestMasterCasePrevTypeRowValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapDataOutput(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCasePrevTypeSheet.getParentIGNTestMasterCasePrevFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Map<String,String> lMapDataOutput=this.parentIGNTestMasterCasePrevTypeSheet.getParentIGNTestMasterCasePrevFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeMultiple()
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapDataOutput))
			if(lIsPrepareOK){
				lMapDataOutput.put('GroupAllGlobalShareControlStage01MainOutputItemIndex',this.strRowIndex)
				this.MapDataOutput.putAll(lMapDataOutput)
				lIsPrepareOK=lIsPrepareOK&&(!this.MapDataOutput.isEmpty())
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCasePrevTypeSheet getParentIGNTestMasterCasePrevTypeSheet(){
		try{
			return this.parentIGNTestMasterCasePrevTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCasePrevTypeSheet(IGNTestMasterCasePrevTypeSheet newParentIGNTestMasterCasePrevTypeSheet){
		//Do Nothing
		//this.parentIGNTestMasterCasePrevTypeSheet=newParentIGNTestMasterCasePrevTypeSheet
	}
	public String getStrIGNTestMasterCasePrevTypeRowMessage(){
		try{
			return this.strIGNTestMasterCasePrevTypeRowMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCasePrevTypeRowMessage(String newStrIGNTestMasterCasePrevTypeRowMessage){
		//Do Nothing
		//this.strIGNTestMasterCasePrevTypeRowMessage=newStrIGNTestMasterCasePrevTypeRowMessage
	}
	public Boolean getIsIGNTestMasterCasePrevTypeRowValid(){
		try{
			return this.isIGNTestMasterCasePrevTypeRowValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCasePrevTypeRowValid(Boolean newIsIGNTestMasterCasePrevTypeRowValid){
		//Do Nothing
		//this.isIGNTestMasterCasePrevTypeRowValid=newIsIGNTestMasterCasePrevTypeRowValid
	}
	public Integer getNumRowIndex(){
		try{
			return this.numRowIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setNumRowIndex(Integer newNumRowIndex){
		//Do Nothing
		//this.numRowIndex=newNumRowIndex
	}
	public String getStrRowIndex(){
		try{
			return this.strRowIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setStrRowIndex(String newStrRowIndex){
		//Do Nothing
		//this.strRowIndex=newStrRowIndex
	}
	public Map<String,String> getMapDataOutput(){
		try{
			return this.MapDataOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setMapDataOutput(Map<String,String> newMapDataOutput){
		try{
			this.MapDataOutput.keySet().each{lKey->
				if(newMapDataOutput.containsKey(lKey.toString())){
					this.MapDataOutput[lKey]=newMapDataOutput.get(lKey).toString().trim()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public Boolean validateMapDataOutput(){
		Boolean lreturn=false
		if(!this.isIGNTestMasterCasePrevTypeRowValid){
			return lreturn
		}
		try{
			Boolean lIsValidateOK=true
			Map<String,String> lMapDataOutputTemp=this.parentIGNTestMasterCasePrevTypeSheet.getParentIGNTestMasterCasePrevFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeMultiple()
			lIsValidateOK=IGNUemaHelper.addMapValueFromMapToMapByPreferDstKey(this.MapDataOutput,lMapDataOutputTemp)
			lIsValidateOK=lIsValidateOK&&(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapDataOutputTemp))
			if(lIsValidateOK){
				lMapDataOutputTemp.put('GroupAllGlobalShareControlStage01MainOutputItemIndex',this.strRowIndex)
				this.MapDataOutput.clear()
				this.MapDataOutput.putAll(lMapDataOutputTemp)
				lIsValidateOK=lIsValidateOK&&(!this.MapDataOutput.isEmpty())
			}
			lreturn=lIsValidateOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCasePrevTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCasePrevTypeRowMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}