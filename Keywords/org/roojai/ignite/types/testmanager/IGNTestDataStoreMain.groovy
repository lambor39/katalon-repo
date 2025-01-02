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
public class IGNTestDataStoreMain{
	private IGNTestMasterCaseFactory parentIGNTestMasterCaseFactory
	private String strIGNTestDataStoreMainMessage=''
	private Boolean isIGNTestDataStoreMainValid=false
	private Integer numCaseIndex=0
	private String strCaseIndex=''
	private Integer numCaseRefer=0
	private String strCaseRefer=''
	private Map<String,String> mapDataInput=[:]
	private Map<String,String> mapDataOutput=[:]
	private Boolean isIGNTestDataStoreMainChanged=false
	public IGNTestDataStoreMain(IGNTestMasterCaseFactory ignTestMasterCaseFactory,Integer numInitCaseIndex,Integer numInitCaseRefer){
		super()
		try{
			this.parentIGNTestMasterCaseFactory=ignTestMasterCaseFactory
			this.strIGNTestDataStoreMainMessage=''
			this.numCaseIndex=numInitCaseIndex
			this.numCaseRefer=numInitCaseRefer
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterCaseFactory)){
				this.initIGNTestDataStoreMain()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestDataStoreMain(){
		try{
			this.isIGNTestDataStoreMainValid=false
			Boolean lIsIGNTestDataStoreMainValid=true
			this.strCaseIndex=String.format('%04d',this.numCaseIndex)
			this.strCaseRefer=String.format('%04d',this.numCaseRefer)
			this.isIGNTestDataStoreMainChanged=false
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.numCaseIndex>0)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.numCaseIndex<=9999)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.strCaseIndex.length()>0)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.numCaseRefer>=0)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.numCaseRefer<=9999)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.strCaseIndex.length()>0)
			lIsIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid&&(this.numCaseRefer<this.numCaseIndex)
			if(lIsIGNTestDataStoreMainValid){
				//lIsIGNTestDataStoreMainValid=this.prepareMapDataInputByDataFile()
				lIsIGNTestDataStoreMainValid=this.prepareMapDataInputByExcelFile()
			}
			if(lIsIGNTestDataStoreMainValid){
				//lIsIGNTestDataStoreMainValid=this.prepareMapDataOutputByDataFile()
				lIsIGNTestDataStoreMainValid=this.prepareMapDataOutputByExcelFile()
			}
			this.isIGNTestDataStoreMainValid=lIsIGNTestDataStoreMainValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapDataInputByDataFile(){
		Boolean lreturn=false
		if(!this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Integer lNumDataFileRowIndex=this.numCaseIndex+1
			TestData lTestDataFileInput=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getTestDataFileInput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestDataFileInput)){
				return lreturn
			}
			Map<String,String> lMapIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			for(Map.Entry lEntryIGNTestMasterFieldTypeSingle in lMapIGNTestMasterFieldTypeSingle){
				String lStrProgramParameterName=lEntryIGNTestMasterFieldTypeSingle.key
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrProgramParameterName)
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
					lIsPrepareOK=false
					break
				}
				String lStrDataValue=lTestDataFileInput.getValue(lIGNTestMasterFieldTypeSingle.getNumDataCellColIndex(),lNumDataFileRowIndex)
				lEntryIGNTestMasterFieldTypeSingle.value=lStrDataValue
			}
			if(lIsPrepareOK){
				this.mapDataInput.putAll(lMapIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapDataOutputByDataFile(){
		Boolean lreturn=false
		if(!this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Integer lNumDataFileRowIndex=this.numCaseIndex+1
			TestData lTestDataFileOutput=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getTestDataFileOutput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestDataFileOutput)){
				return lreturn
			}
			Map<String,String> lMapIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			for(Map.Entry lEntryIGNTestMasterFieldTypeSingle in lMapIGNTestMasterFieldTypeSingle){
				String lStrProgramParameterName=lEntryIGNTestMasterFieldTypeSingle.key
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrProgramParameterName)
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
					lIsPrepareOK=false
					break
				}
				String lStrDataValue=lTestDataFileOutput.getValue(lIGNTestMasterFieldTypeSingle.getNumDataCellColIndex(),lNumDataFileRowIndex)
				lEntryIGNTestMasterFieldTypeSingle.value=lStrDataValue
			}
			if(lIsPrepareOK){
				this.mapDataOutput.putAll(lMapIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapDataInputByExcelFile(){
		Boolean lreturn=false
		if(!this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber='GroupAllGlobalShareControlStage01MainFieldTestCaseNumber'
		try{
			Boolean lIsPrepareOK=true
			IGNUemaHelper.printLog('prepareMapDataInputByExcelFile:Case'+this.strCaseIndex)
			Integer lNumExcelFileRowIndex=this.numCaseIndex
			Sheet lTestExcelFileWorkSheetInput=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getTestExcelFileWorkSheetInput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetInput)){
				return lreturn
			}
			Map<String,String> lMapIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			for(Map.Entry lEntryIGNTestMasterFieldTypeSingle in lMapIGNTestMasterFieldTypeSingle){
				String lStrProgramParameterName=lEntryIGNTestMasterFieldTypeSingle.key
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrProgramParameterName)
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
					lIsPrepareOK=false
					break
				}
				String lStrDataValue=''
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lNumExcelFileRowIndex,lIGNTestMasterFieldTypeSingle.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lStrDataValue=''
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrProgramParameterName.equals(lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber)){
					if(!this.strCaseIndex.equals(lStrDataValue)){
						lIsPrepareOK=false
						break
					}
				}
				String lStrFieldDataValue=lIGNTestMasterFieldTypeSingle.getStrValidatedValueFromIGNTestDataFiledType(lStrDataValue)
				if(IGNUemaHelper.checkObjectNullOfObject(lStrFieldDataValue)){
					lStrDataValue=lIGNTestMasterFieldTypeSingle.getStrProjectFieldListFieldMasterDefaultValue()
				}
				if(IGNUemaHelper.checkObjectNullOfObject(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lEntryIGNTestMasterFieldTypeSingle.value=lStrDataValue
			}
			if(lIsPrepareOK){
				this.mapDataInput.putAll(lMapIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapDataOutputByExcelFile(){
		Boolean lreturn=false
		if(!this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber='GroupAllGlobalShareControlStage01MainFieldTestCaseNumber'
		try{
			Boolean lIsPrepareOK=true
			IGNUemaHelper.printLog('prepareMapDataOutputByExcelFile:Case'+this.strCaseIndex)
			Integer lNumExcelFileRowIndex=this.numCaseIndex
			Sheet lTestExcelFileWorkSheetOutput=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getTestExcelFileWorkSheetOutput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetOutput)){
				return lreturn
			}
			Map<String,String> lMapIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			for(Map.Entry lEntryIGNTestMasterFieldTypeSingle in lMapIGNTestMasterFieldTypeSingle){
				String lStrProgramParameterName=lEntryIGNTestMasterFieldTypeSingle.key
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getParentIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrProgramParameterName)
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
					lIsPrepareOK=false
					break
				}
				String lStrDataValue=''
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetOutput,lNumExcelFileRowIndex,lIGNTestMasterFieldTypeSingle.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lStrDataValue=''
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrProgramParameterName.equals(lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber)){
					if(!this.strCaseIndex.equals(lStrDataValue)){
						lIsPrepareOK=false
						break
					}
				}
				lEntryIGNTestMasterFieldTypeSingle.value=lStrDataValue
			}
			if(lIsPrepareOK){
				this.mapDataOutput.putAll(lMapIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
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
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterCaseFactory(IGNTestMasterCaseFactory newParentIGNTestMasterCaseFactory){
		//Do Nothing
		//this.parentIGNTestMasterCaseFactory=newParentIGNTestMasterCaseFactory
	}
	public String getStrIGNTestDataStoreMainMessage(){
		try{
			return this.strIGNTestDataStoreMainMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestDataStoreMainMessage(String newStrIGNTestDataStoreMainMessage){
		//Do Nothing
		//this.strIGNTestDataStoreMainMessage=newStrIGNTestDataStoreMainMessage
	}
	public Boolean getIsIGNTestDataStoreMainValid(){
		try{
			return this.isIGNTestDataStoreMainValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDataStoreMainValid(Boolean newIsIGNTestDataStoreMainValid){
		//Do Nothing
		//this.isIGNTestDataStoreMainValid=newIsIGNTestDataStoreMainValid
	}
	public Integer getNumCaseIndex(){
		try{
			return this.numCaseIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
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
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
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
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
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
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setStrCaseRefer(String newStrCaseRefer){
		//Do Nothing
		//this.strCaseRefer=newStrCaseRefer
	}
	public Map<String,String> getMapDataInput(){
		try{
			Map<String,String> lMapDataInput=[:]
			lMapDataInput.putAll(this.mapDataInput)
			return lMapDataInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapDataInput(Map<String,String> newMapDataInput){
		//Do Nothing
		//this.mapDataInput=newMapDataInput
	}
	public Map<String,String> getMapDataOutput(){
		try{
			Map<String,String> lMapDataOutput=[:]
			lMapDataOutput.putAll(this.mapDataOutput)
			return lMapDataOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setMapDataOutput(Map<String,String> newMapDataOutput){
		//Do Nothing
		//this.mapDataOutput=newMapDataOutput
	}
	public Boolean getIsIGNTestDataStoreMainChanged(){
		try{
			return this.isIGNTestDataStoreMainChanged
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDataStoreMainChanged(Boolean newIsIGNTestDataStoreMainChanged){
		//Do Nothing
		//this.isIGNTestDataStoreMainChanged=newIsIGNTestDataStoreMainChanged
	}
	public Boolean applyMapDataOutputChanged(Map<String,String> newMapDataOutput){
		Boolean lreturn=false
		if(!this.isIGNTestDataStoreMainValid){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(newMapDataOutput)){
			return lreturn
		}
		try{
			Boolean lIsApplyOK=false
			Map lMapTest=this.mapDataOutput
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(newMapDataOutput)){
				Map<String,String> lMapIGNTestMasterFieldTypeSingle=this.getParentIGNTestMasterCaseFactory().getMapIGNTestMasterFieldTypeSingle()
				if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapIGNTestMasterFieldTypeSingle)){
					for(Map.Entry lEntryIGNTestMasterFieldTypeSingle in lMapIGNTestMasterFieldTypeSingle){
						if(newMapDataOutput.containsKey(lEntryIGNTestMasterFieldTypeSingle.key)){
							this.mapDataOutput.put(lEntryIGNTestMasterFieldTypeSingle.key,newMapDataOutput.get(lEntryIGNTestMasterFieldTypeSingle.key))
							lIsApplyOK=true
						}
					}
				}
			}
			if(this.getParentIGNTestMasterCaseFactory().getIsIGNTestMasterCaseFactoryExcelSaving()){
				this.isIGNTestDataStoreMainChanged=false
			}else{
				if(lIsApplyOK){
					if(!this.isIGNTestDataStoreMainChanged){
						this.isIGNTestDataStoreMainChanged=lIsApplyOK
					}
				}
			}
			lreturn=lIsApplyOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataStoreMainMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataStoreMainMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}