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
public class IGNTestMasterCaseTypeMain{
	private IGNTestMasterCaseFactory parentIGNTestMasterCaseFactory
	private String strIGNTestMasterCaseTypeMainMessage=''
	private Boolean isIGNTestMasterCaseTypeMainValid=false
	private Integer numCaseIndex=0
	private String strCaseIndex=''
	private Integer numCaseRefer=0
	private String strCaseRefer=''
	private Boolean isCaseRefer=false
	private IGNTestDataStoreMain ignTestDataStoreMainCurrent
	private IGNTestDataStoreMain ignTestDataStoreMainRefer
	public Map<String,String> MapCaseDataCurrentInput=[:]
	public Map<String,String> MapCaseDataCurrentOutput=[:]
	public Map<String,String> MapCaseDataReferInput=[:]
	public Map<String,String> MapCaseDataReferOutput=[:]
	public IGNTestMasterCaseGroupFactory CaseGroupFactory
	public IGNTestMasterCasePrevFactory CasePrevFactory
	public IGNTestMasterCaseTypeMain(IGNTestMasterCaseFactory ignTestMasterCaseFactory,Integer numInitCaseIndex,Integer numInitCaseRefer){
		super()
		try{
			this.parentIGNTestMasterCaseFactory=ignTestMasterCaseFactory
			this.strIGNTestMasterCaseTypeMainMessage=''
			this.numCaseIndex=numInitCaseIndex
			this.numCaseRefer=numInitCaseRefer
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseFactory)){
				this.initIGNTestMasterCaseTypeMain()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCaseTypeMain(){
		try{
			this.isIGNTestMasterCaseTypeMainValid=false
			Boolean lIsIGNTestMasterCaseTypeMainValid=true
			this.strCaseIndex=String.format('%04d',this.numCaseIndex)
			this.strCaseRefer=String.format('%04d',this.numCaseRefer)
			this.isCaseRefer=(this.numCaseRefer>0)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.numCaseIndex>0)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.numCaseIndex<=9999)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.strCaseIndex.length()>0)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.numCaseRefer>=0)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.numCaseRefer<=9999)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.strCaseRefer.length()>0)
			lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.numCaseRefer<this.numCaseIndex)
			if(lIsIGNTestMasterCaseTypeMainValid){
				lIsIGNTestMasterCaseTypeMainValid=this.prepareIGNTestDataStoreMain()
			}
			if(lIsIGNTestMasterCaseTypeMainValid){
				this.CaseGroupFactory=new IGNTestMasterCaseGroupFactory(this)
				lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(!IGNUemaHelper.checkObjectNullOfObject(this.CaseGroupFactory))
				lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.CaseGroupFactory.getIsIGNTestMasterCaseGroupFactoryReady())
			}
			if(lIsIGNTestMasterCaseTypeMainValid){
				this.CasePrevFactory=new IGNTestMasterCasePrevFactory(this)
				lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(!IGNUemaHelper.checkObjectNullOfObject(this.CasePrevFactory))
				lIsIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid&&(this.CasePrevFactory.getIsIGNTestMasterCasePrevFactoryReady())
			}
			this.isIGNTestMasterCaseTypeMainValid=lIsIGNTestMasterCaseTypeMainValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareIGNTestDataStoreMain(){
		Boolean lreturn=false
		if(!this.parentIGNTestMasterCaseFactory.getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			IGNTestDataStoreMain lIGNTestDataStoreMainCurrent=null
			IGNTestDataStoreMain lIGNTestDataStoreMainRefer=null
			lIGNTestDataStoreMainCurrent=this.getParentIGNTestMasterCaseFactory().getIGNTestDataStoreMainByCaseNumber(this.numCaseIndex)
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMainCurrent))
			if(this.isCaseRefer){
				lIGNTestDataStoreMainRefer=this.getParentIGNTestMasterCaseFactory().getIGNTestDataStoreMainByCaseNumber(this.numCaseRefer)
				lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMainRefer))
			}
			if(lIsPrepareOK){
				this.ignTestDataStoreMainCurrent=lIGNTestDataStoreMainCurrent
				this.ignTestDataStoreMainRefer=lIGNTestDataStoreMainRefer
				this.MapCaseDataCurrentInput=this.ignTestDataStoreMainCurrent.getMapDataInput()
				this.MapCaseDataCurrentOutput=this.ignTestDataStoreMainCurrent.getMapDataOutput()
				if(this.isCaseRefer){
					this.MapCaseDataReferInput=this.ignTestDataStoreMainRefer.getMapDataInput()
					this.MapCaseDataReferOutput=this.ignTestDataStoreMainRefer.getMapDataOutput()
				}
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseFactory getParentIGNTestMasterCaseFactory(){
		try{
			return this.parentIGNTestMasterCaseFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseFactory(IGNTestMasterCaseFactory newParentIGNTestMasterCaseFactory){
		//Do Nothing
		//this.parentIGNTestMasterCaseFactory=newParentIGNTestMasterCaseFactory
	}
	public String getStrIGNTestMasterCaseTypeMainMessage(){
		try{
			return this.strIGNTestMasterCaseTypeMainMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCaseTypeMainMessage(String newStrIGNTestMasterCaseTypeMainMessage){
		//Do Nothing
		//this.strIGNTestMasterCaseTypeMainMessage=newStrIGNTestMasterCaseTypeMainMessage
	}
	public Boolean getIsIGNTestMasterCaseTypeMainValid(){
		try{
			if(this.isIGNTestMasterCaseTypeMainValid){
				this.refreshMapCaseDataReferOutput()
			}
			return this.isIGNTestMasterCaseTypeMainValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseTypeMainValid(Boolean newIsIGNTestMasterCaseTypeMainValid){
		//Do Nothing
		//this.isIGNTestMasterCaseTypeMainValid=newIsIGNTestMasterCaseTypeMainValid
	}
	public Integer getNumCaseIndex(){
		try{
			return this.numCaseIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setNumCaseIndex(Integer newNumCaseIndex){
		//Do Nothing
		//this.numCaseIndex=newNumCaseIndex
	}
	public String getStrCaseIndex(){
		try{
			return this.strCaseIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setStrCaseIndex(String newStrCaseIndex){
		//Do Nothing
		//this.strCaseIndex=newStrCaseIndex
	}
	public Integer getNumCaseRefer(){
		try{
			return this.numCaseRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setNumCaseRefer(Integer newNumCaseRefer){
		//Do Nothing
		//this.numCaseRefer=newNumCaseRefer
	}
	public String getStrCaseRefer(){
		try{
			return this.strCaseRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setStrCaseRefer(String newStrCaseRefer){
		//Do Nothing
		//this.strCaseRefer=newStrCaseRefer
	}
	public Boolean getIsCaseRefer(){
		try{
			return this.isCaseRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIsCaseRefer(Boolean newIsCaseRefer){
		//Do Nothing
		//this.isCaseRefer=newIsCaseRefer
	}
	public IGNTestDataStoreMain getIGNTestDataStoreMainCurrent(){
		try{
			return this.ignTestDataStoreMainCurrent
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestDataStoreMainCurrent(IGNTestDataStoreMain newIGNTestDataStoreMainCurrent){
		//Do Nothing
		//this.ignTestDataStoreMainCurrent=newIGNTestDataStoreMainCurrent
	}
	public IGNTestDataStoreMain getIGNTestDataStoreMainRefer(){
		try{
			return this.ignTestDataStoreMainRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestDataStoreMainRefer(IGNTestDataStoreMain newIGNTestDataStoreMainRefer){
		//Do Nothing
		//this.ignTestDataStoreMainRefer=newIGNTestDataStoreMainRefer
	}
	public Map<String,String> getMapCaseDataCurrentInput(){
		try{
			return this.MapCaseDataCurrentInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapCaseDataCurrentInput(Map<String,String> newMapCaseDataCurrentInput){
		try{
			this.MapCaseDataCurrentInput.keySet().each{lKey->
				if(newMapCaseDataCurrentInput.containsKey(lKey.toString())){
					this.MapCaseDataCurrentInput[lKey]=newMapCaseDataCurrentInput.get(lKey).toString().trim()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public Map<String,String> getMapCaseDataCurrentOutput(){
		try{
			return this.MapCaseDataCurrentOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapCaseDataCurrentOutput(Map<String,String> newMapCaseDataCurrentOutput){
		try{
			this.MapCaseDataCurrentOutput.keySet().each{lKey->
				if(newMapCaseDataCurrentOutput.containsKey(lKey.toString())){
					this.MapCaseDataCurrentOutput[lKey]=newMapCaseDataCurrentOutput.get(lKey).toString().trim()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public Map<String,String> getMapCaseDataReferInput(){
		try{
			return this.MapCaseDataReferInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapCaseDataReferInput(Map<String,String> newMapCaseDataReferInput){
		try{
			this.MapCaseDataReferInput.keySet().each{lKey->
				if(newMapCaseDataReferInput.containsKey(lKey.toString())){
					this.MapCaseDataReferInput[lKey]=newMapCaseDataReferInput.get(lKey).toString().trim()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public Map<String,String> getMapCaseDataReferOutput(){
		try{
			return this.MapCaseDataReferOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapCaseDataReferOutput(Map<String,String> newMapCaseDataReferOutput){
		try{
			this.MapCaseDataReferOutput.keySet().each{lKey->
				if(newMapCaseDataReferOutput.containsKey(lKey.toString())){
					this.MapCaseDataReferOutput[lKey]=newMapCaseDataReferOutput.get(lKey).toString().trim()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestMasterCaseGroupFactory getCaseGroupFactory(){
		try{
			return this.CaseGroupFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setCaseGroupFactory(IGNTestMasterCaseGroupFactory newCaseGroupFactory){
		//Do Nothing
		//this.CaseGroupFactory=newCaseGroupFactory
	}
	public IGNTestMasterCasePrevFactory getCasePrevFactory(){
		try{
			return this.CasePrevFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
	}
	public void setCasePrevFactory(IGNTestMasterCasePrevFactory newCasePrevFactory){
		//Do Nothing
		//this.CasePrevFactory=newCasePrevFactory
	}
	public Boolean applyMapCaseDataCurrentOutputChanged(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestDataStoreMainCurrent)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.MapCaseDataCurrentOutput)){
			return lreturn
		}
		try{
			lreturn=this.ignTestDataStoreMainCurrent.applyMapDataOutputChanged(this.MapCaseDataCurrentOutput)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean refreshMapCaseDataReferOutput(){
		Boolean lreturn=false
		if(!this.isCaseRefer){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestDataStoreMainRefer)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.MapCaseDataReferOutput)){
			return lreturn
		}
		try{
			Boolean lIsRefreshToDo=false
			if(this.getParentIGNTestMasterCaseFactory().getIsIGNTestMasterCaseFactoryExcelSaving()){
				lIsRefreshToDo=true
			}else{
				lIsRefreshToDo=this.ignTestDataStoreMainRefer.getIsIGNTestDataStoreMainChanged()
			}
			if(lIsRefreshToDo){
				Map<String,String> lMapCaseDataReferOutput=this.ignTestDataStoreMainRefer.getMapDataOutput()
				this.MapCaseDataReferOutput.keySet().each{lKey->
					if(lMapCaseDataReferOutput.containsKey(lKey.toString())){
						this.MapCaseDataReferOutput[lKey]=lMapCaseDataReferOutput.get(lKey).toString().trim()
						lreturn=true
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseTypeMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseTypeMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}