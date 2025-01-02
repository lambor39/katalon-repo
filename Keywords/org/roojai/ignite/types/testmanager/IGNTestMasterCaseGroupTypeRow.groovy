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
public class IGNTestMasterCaseGroupTypeRow{
	private IGNTestMasterCaseGroupTypeSheet parentIGNTestMasterCaseGroupTypeSheet
	private String strIGNTestMasterCaseGroupTypeRowMessage=''
	private Boolean isIGNTestMasterCaseGroupTypeRowValid=false
	private Integer numRowIndex=0
	private String strRowIndex=''
	public Map<String,String> MapDataOutput=[:]
	public IGNTestMasterCaseGroupTypeRow(IGNTestMasterCaseGroupTypeSheet ignTestMasterCaseGroupTypeSheet,Integer numInitRowIndex){
		super()
		try{
			this.parentIGNTestMasterCaseGroupTypeSheet=ignTestMasterCaseGroupTypeSheet
			this.strIGNTestMasterCaseGroupTypeRowMessage=''
			this.numRowIndex=numInitRowIndex
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseGroupTypeSheet)){
				this.initIGNTestMasterCaseGroupTypeRow()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCaseGroupTypeRow(){
		try{
			this.isIGNTestMasterCaseGroupTypeRowValid=false
			Boolean lIsIGNTestMasterCaseGroupTypeRowValid=true
			this.strRowIndex=String.format('%06d',this.numRowIndex)
			lIsIGNTestMasterCaseGroupTypeRowValid=lIsIGNTestMasterCaseGroupTypeRowValid&&(this.numRowIndex>0)
			lIsIGNTestMasterCaseGroupTypeRowValid=lIsIGNTestMasterCaseGroupTypeRowValid&&(this.strRowIndex.length()>0)
			if(lIsIGNTestMasterCaseGroupTypeRowValid){
				lIsIGNTestMasterCaseGroupTypeRowValid=this.prepareMapDataOutput()
			}
			this.isIGNTestMasterCaseGroupTypeRowValid=lIsIGNTestMasterCaseGroupTypeRowValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapDataOutput(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseGroupTypeSheet.getParentIGNTestMasterCaseGroupFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Map<String,String> lMapDataOutput=this.parentIGNTestMasterCaseGroupTypeSheet.getParentIGNTestMasterCaseGroupFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeMultiple()
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
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseGroupTypeSheet getParentIGNTestMasterCaseGroupTypeSheet(){
		try{
			return this.parentIGNTestMasterCaseGroupTypeSheet
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseGroupTypeSheet(IGNTestMasterCaseGroupTypeSheet newParentIGNTestMasterCaseGroupTypeSheet){
		//Do Nothing
		//this.parentIGNTestMasterCaseGroupTypeSheet=newParentIGNTestMasterCaseGroupTypeSheet
	}
	public String getStrIGNTestMasterCaseGroupTypeRowMessage(){
		try{
			return this.strIGNTestMasterCaseGroupTypeRowMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCaseGroupTypeRowMessage(String newStrIGNTestMasterCaseGroupTypeRowMessage){
		//Do Nothing
		//this.strIGNTestMasterCaseGroupTypeRowMessage=newStrIGNTestMasterCaseGroupTypeRowMessage
	}
	public Boolean getIsIGNTestMasterCaseGroupTypeRowValid(){
		try{
			return this.isIGNTestMasterCaseGroupTypeRowValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseGroupTypeRowValid(Boolean newIsIGNTestMasterCaseGroupTypeRowValid){
		//Do Nothing
		//this.isIGNTestMasterCaseGroupTypeRowValid=newIsIGNTestMasterCaseGroupTypeRowValid
	}
	public Integer getNumRowIndex(){
		try{
			return this.numRowIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
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
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
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
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
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
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
	}
	public Boolean validateMapDataOutput(){
		Boolean lreturn=false
		if(!this.isIGNTestMasterCaseGroupTypeRowValid){
			return lreturn
		}
		try{
			Boolean lIsValidateOK=true
			Map<String,String> lMapDataOutputTemp=this.parentIGNTestMasterCaseGroupTypeSheet.getParentIGNTestMasterCaseGroupFactory().getParentIGNTestMasterCaseTypeMain().getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeMultiple()
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
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseGroupTypeRowMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseGroupTypeRowMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}