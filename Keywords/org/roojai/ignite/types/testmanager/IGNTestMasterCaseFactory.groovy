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
public class IGNTestMasterCaseFactory{
	private IGNTestDataAdapter parentIGNTestDataAdapter
	private String strIGNTestMasterCaseFactoryMessage=''
	private Boolean isIGNTestMasterCaseFactoryReady=false
	private Map<String,String> mapIGNTestMasterFieldTypeSingle=[:]
	private Map<String,String> mapIGNTestMasterFieldTypeMultiple=[:]
	private TreeMap<Integer,IGNTestDataStoreMain> mapIGNTestDataStoreMain
	private TreeMap<Integer,IGNTestMasterCaseTypeMain> mapIGNTestMasterCaseTypeMain
	private Boolean isIGNTestMasterCaseFactoryExcelSaving=false
	public IGNTestMasterCaseFactory(IGNTestDataAdapter ignTestDataAdapter){
		super()
		try{
			this.parentIGNTestDataAdapter=ignTestDataAdapter
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestDataAdapter)){
				this.initIGNTestMasterCaseFactory()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterCaseFactory(){
		try{
			this.isIGNTestMasterCaseFactoryReady=false
			Boolean lIsIGNTestMasterCaseFactoryReady=true
			if(lIsIGNTestMasterCaseFactoryReady){
				lIsIGNTestMasterCaseFactoryReady=this.prepareIGNTestMasterFieldType()
			}
			if(lIsIGNTestMasterCaseFactoryReady){
				lIsIGNTestMasterCaseFactoryReady=this.prepareMapIGNTestDataStoreMain()
			}
			if(lIsIGNTestMasterCaseFactoryReady){
				lIsIGNTestMasterCaseFactoryReady=this.prepareMapIGNTestMasterCaseTypeMain()
			}
			this.isIGNTestMasterCaseFactoryReady=lIsIGNTestMasterCaseFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareIGNTestMasterFieldType(){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			List<IGNTestMasterFieldTypeSingle> lListIGNTestMasterFieldTypeSingle=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeSingle()
			List<IGNTestMasterFieldTypeMultiple> lListIGNTestMasterFieldTypeMultiple=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getListIGNTestMasterFieldTypeMultiple()
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListIGNTestMasterFieldTypeMultiple)){
				return lreturn
			}
			for(IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle in lListIGNTestMasterFieldTypeSingle){
				this.mapIGNTestMasterFieldTypeSingle.put(lIGNTestMasterFieldTypeSingle.getStrProgramParameterName(),'')
			}
			for(IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple in lListIGNTestMasterFieldTypeMultiple){
				this.mapIGNTestMasterFieldTypeMultiple.put(lIGNTestMasterFieldTypeMultiple.getStrProgramParameterName(),'')
			}
			lreturn=(this.mapIGNTestMasterFieldTypeSingle.size()>0)&&(this.mapIGNTestMasterFieldTypeMultiple.size()>0)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapIGNTestDataStoreMain(){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber='GroupAllGlobalShareControlStage01MainFieldTestCaseNumber'
		String lStrGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=''
		Integer lNumGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=0
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseToDo='GroupAllGlobalShareControlStage01MainFieldTestCaseToDo'
		String lStrGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=''
		Boolean lIsGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=false
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid='GroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid'
		String lStrGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=''
		Boolean lIsGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=false
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldReferCaseValid='GroupAllGlobalShareControlStage01MainFieldReferCaseValid'
		String lStrGroupAllGlobalShareControlStage01MainFieldReferCaseValid=''
		Boolean lIsGroupAllGlobalShareControlStage01MainFieldReferCaseValid=false
		String lStrParameterGroupAllGlobalShareControlStage01MainFieldReferCaseNumber='GroupAllGlobalShareControlStage01MainFieldReferCaseNumber'
		String lStrGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=''
		Integer lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=0
		try{
			Boolean lIsPrepareOK=true
			this.mapIGNTestDataStoreMain=new TreeMap<Integer,IGNTestDataStoreMain>()
			List<Integer> lListToDoCaseNum=new ArrayList<Integer>()
			TreeMap<Integer,Integer> lMapCaseIndexRefer=new TreeMap<Integer,Integer>()
			Sheet lTestExcelFileWorkSheetInput=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getTestExcelFileWorkSheetInput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetInput)){
				return lreturn
			}
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseNumber)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle01)){
				return lreturn
			}
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle02=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseToDo)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle02)){
				return lreturn
			}
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle03=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrParameterGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle03)){
				return lreturn
			}
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle04=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrParameterGroupAllGlobalShareControlStage01MainFieldReferCaseValid)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle04)){
				return lreturn
			}
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle05=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lStrParameterGroupAllGlobalShareControlStage01MainFieldReferCaseNumber)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle05)){
				return lreturn
			}
			for(Integer lIndex=1;lIndex<=9999;lIndex++){
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=''
				lNumGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=0
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=''
				lIsGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=false
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=''
				lIsGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=false
				lStrGroupAllGlobalShareControlStage01MainFieldReferCaseValid=''
				lIsGroupAllGlobalShareControlStage01MainFieldReferCaseValid=false
				lStrGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=''
				lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=0
				String lStrDataValue=''
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lIndex,lIGNTestMasterFieldTypeSingle01.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=lStrDataValue.trim()
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=lStrDataValue
				lNumGroupAllGlobalShareControlStage01MainFieldTestCaseNumber=IGNUemaHelper.convertStringToInteger(lStrGroupAllGlobalShareControlStage01MainFieldTestCaseNumber,0)
				if(!(lIndex==lNumGroupAllGlobalShareControlStage01MainFieldTestCaseNumber)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lIndex,lIGNTestMasterFieldTypeSingle02.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					continue
				}
				lStrDataValue=lStrDataValue.trim()
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=lStrDataValue
				lIsGroupAllGlobalShareControlStage01MainFieldTestCaseToDo=IGNUemaHelper.convertStringToBoolean(lStrGroupAllGlobalShareControlStage01MainFieldTestCaseToDo)
				if(!lIsGroupAllGlobalShareControlStage01MainFieldTestCaseToDo){
					continue
				}
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lIndex,lIGNTestMasterFieldTypeSingle03.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					continue
				}
				lStrDataValue=lStrDataValue.trim()
				lStrGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=lStrDataValue
				lIsGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid=IGNUemaHelper.convertStringToBoolean(lStrGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid)
				if(!lIsGroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid){
					continue
				}
				IGNUemaHelper.addIntegerToListOfInteger(true,lIndex,lListToDoCaseNum)
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lIndex,lIGNTestMasterFieldTypeSingle04.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					continue
				}
				lStrDataValue=lStrDataValue.trim()
				lStrGroupAllGlobalShareControlStage01MainFieldReferCaseValid=lStrDataValue
				lIsGroupAllGlobalShareControlStage01MainFieldReferCaseValid=IGNUemaHelper.convertStringToBoolean(lStrGroupAllGlobalShareControlStage01MainFieldReferCaseValid)
				if(!lIsGroupAllGlobalShareControlStage01MainFieldReferCaseValid){
					continue
				}
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(lTestExcelFileWorkSheetInput,lIndex,lIGNTestMasterFieldTypeSingle05.getNumExcelCellColIndex())
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					continue
				}
				lStrDataValue=lStrDataValue.trim()
				lStrGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=lStrDataValue
				lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber=IGNUemaHelper.convertStringToInteger(lStrGroupAllGlobalShareControlStage01MainFieldReferCaseNumber,0)
				if(lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber>0){
					IGNUemaHelper.addIntegerToListOfInteger(true,lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber,lListToDoCaseNum)
					lMapCaseIndexRefer.put(lNumGroupAllGlobalShareControlStage01MainFieldTestCaseNumber,lNumGroupAllGlobalShareControlStage01MainFieldReferCaseNumber)
				}
			}
			if(lIsPrepareOK){
				if(lListToDoCaseNum.size()>0){
					for(Integer lNumToDoCaseNum in lListToDoCaseNum){
						Integer lNumCaseRefer=0
						if(lMapCaseIndexRefer.size()>0){
							if(lMapCaseIndexRefer.containsKey(lNumToDoCaseNum)){
								lNumCaseRefer=lMapCaseIndexRefer.get(lNumToDoCaseNum)
							}
						}
						IGNTestDataStoreMain lIGNTestDataStoreMain=new IGNTestDataStoreMain(this,lNumToDoCaseNum,lNumCaseRefer)
						lIsPrepareOK=lIGNTestDataStoreMain.getIsIGNTestDataStoreMainValid()
						if(!lIsPrepareOK){
							break
						}
						this.mapIGNTestDataStoreMain.put(lNumToDoCaseNum,lIGNTestDataStoreMain)
					}
				}
			}
			if(lIsPrepareOK){
				this.mapIGNTestDataStoreMain.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapIGNTestMasterCaseTypeMain(){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.mapIGNTestMasterCaseTypeMain=new TreeMap<Integer,IGNTestMasterCaseTypeMain>()
			if(this.mapIGNTestDataStoreMain.size()>0){
				for(Map.Entry lEntryIGNTestDataStoreMain in this.mapIGNTestDataStoreMain){
					IGNTestDataStoreMain lIGNTestDataStoreMain=lEntryIGNTestDataStoreMain.value
					if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMain)){
						lIsPrepareOK=false
						break
					}
					IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=new IGNTestMasterCaseTypeMain(this,lIGNTestDataStoreMain.getNumCaseIndex(),lIGNTestDataStoreMain.getNumCaseRefer())
					lIsPrepareOK=lIGNTestMasterCaseTypeMain.getIsIGNTestMasterCaseTypeMainValid()
					if(!lIsPrepareOK){
						this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'prepareMapIGNTestMasterCaseTypeMain','CaseIndex='+lIGNTestDataStoreMain.getNumCaseIndex().toString())
						this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'prepareMapIGNTestMasterCaseTypeMain','CaseIndex='+lIGNTestDataStoreMain.getNumCaseRefer().toString())
						break
					}
					this.mapIGNTestMasterCaseTypeMain.put(lIGNTestDataStoreMain.getNumCaseIndex(),lIGNTestMasterCaseTypeMain)
				}
			}
			if(lIsPrepareOK){
				this.mapIGNTestMasterCaseTypeMain.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestDataAdapter getParentIGNTestDataAdapter(){
		try{
			return this.parentIGNTestDataAdapter
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestDataAdapter(IGNTestDataAdapter newParentIGNTestDataAdapter){
		//Do Nothing
		//this.parentIGNTestDataAdapter=newParentIGNTestDataAdapter
	}
	public String getStrIGNTestMasterCaseFactoryMessage(){
		try{
			return this.strIGNTestMasterCaseFactoryMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterCaseFactoryMessage(String newStrIGNTestMasterCaseFactoryMessage){
		//Do Nothing
		//this.strIGNTestMasterCaseFactoryMessage=newStrIGNTestMasterCaseFactoryMessage
	}
	public Boolean getIsIGNTestMasterCaseFactoryReady(){
		try{
			return this.isIGNTestMasterCaseFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseFactoryReady(Boolean newIsIGNTestMasterCaseFactoryReady){
		//Do Nothing
		//this.isIGNTestMasterCaseFactoryReady=newIsIGNTestMasterCaseFactoryReady
	}
	public Map<String,String> getMapIGNTestMasterFieldTypeSingle(){
		try{
			Map<String,String> lMapIGNTestMasterFieldTypeSingle=[:]
			lMapIGNTestMasterFieldTypeSingle.putAll(this.mapIGNTestMasterFieldTypeSingle)
			return lMapIGNTestMasterFieldTypeSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterFieldTypeSingle(Map<String,String> newMapIGNTestMasterFieldTypeSingle){
		//Do Nothing
		//this.mapIGNTestMasterFieldTypeSingle=newMapIGNTestMasterFieldTypeSingle
	}
	public Map<String,String> getMapIGNTestMasterFieldTypeMultiple(){
		try{
			Map<String,String> lMapIGNTestMasterFieldTypeMultiple=[:]
			lMapIGNTestMasterFieldTypeMultiple.putAll(this.mapIGNTestMasterFieldTypeMultiple)
			return lMapIGNTestMasterFieldTypeMultiple
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterFieldTypeMultiple(Map<String,String> newMapIGNTestMasterFieldTypeMultiple){
		//Do Nothing
		//this.mapIGNTestMasterFieldTypeMultiple=newMapIGNTestMasterFieldTypeMultiple
	}
	public TreeMap<Integer,IGNTestDataStoreMain> getMapIGNTestDataStoreMain(){
		try{
			return this.mapIGNTestDataStoreMain
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestDataStoreMain(TreeMap<Integer,IGNTestDataStoreMain> newMapIGNTestDataStoreMain){
		//Do Nothing
		//this.mapIGNTestDataStoreMain=newMapIGNTestDataStoreMain
	}
	public TreeMap<Integer,IGNTestMasterCaseTypeMain> getMapIGNTestMasterCaseTypeMain(){
		try{
			return this.mapIGNTestMasterCaseTypeMain
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestMasterCaseTypeMain(TreeMap<Integer,IGNTestMasterCaseTypeMain> newMapIGNTestMasterCaseTypeMain){
		//Do Nothing
		//this.mapIGNTestMasterCaseTypeMain=newMapIGNTestMasterCaseTypeMain
	}
	public Boolean getIsIGNTestMasterCaseFactoryExcelSaving(){
		try{
			return this.isIGNTestMasterCaseFactoryExcelSaving
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterCaseFactoryExcelSaving(Boolean newIsIGNTestMasterCaseFactoryExcelSaving){
		//Do Nothing
		//this.isIGNTestMasterCaseFactoryExcelSaving=newIsIGNTestMasterCaseFactoryExcelSaving
	}
	public IGNTestDataStoreMain getIGNTestDataStoreMainByCaseNumber(Integer numCaseNumber){
		IGNTestDataStoreMain lreturn=null
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestDataStoreMain.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestDataStoreMain.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean applyIGNTestDataStoreMainMapDataOutputChanged(Integer numCaseNumber,Map<String,String> newMapDataOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(newMapDataOutput)){
			return lreturn
		}
		try{
			IGNTestDataStoreMain lIGNTestDataStoreMain=this.getIGNTestDataStoreMainByCaseNumber(numCaseNumber)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMain)){
				lreturn=lIGNTestDataStoreMain.applyMapDataOutputChanged(newMapDataOutput)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterCaseTypeMain getIGNTestMasterCaseTypeMainByCaseNumber(Integer numCaseNumber){
		IGNTestMasterCaseTypeMain lreturn=null
		if(!this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIsIGNTestMasterFieldFactoryReady()){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestMasterCaseTypeMain.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestMasterCaseTypeMain.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean saveIGNTestMasterCaseFactory(){
		Boolean lreturn=false
		if(!this.isIGNTestMasterCaseFactoryReady){
			return lreturn
		}
		if(this.mapIGNTestDataStoreMain.size()<=0){
			return lreturn
		}
		try{
			Boolean lIsSaveOK=true
			Boolean lIsFoundChangedSingle=false
			Boolean lIsFoundChangedMultiple=false
			Workbook lTestExcelFileWorkbok=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getTestExcelFileWorkBook()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkbok)){
				return lreturn
			}
			Sheet lTestExcelFileWorkSheetOutput=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getTestExcelFileWorkSheetOutput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetOutput)){
				return lreturn
			}
			Sheet lTestExcelFileWorkSheetTemplateOutput=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getTestExcelFileWorkSheetTemplateOutput()
			if(IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetTemplateOutput)){
				return lreturn
			}
			List<Integer> lListToDoCaseNumSingle=new ArrayList<Integer>()
			List<Integer> lListToDoCaseNumMultiple=new ArrayList<Integer>()
			for(Map.Entry lEntryIGNTestDataStoreMain in this.mapIGNTestDataStoreMain){
				IGNTestDataStoreMain lIGNTestDataStoreMain=lEntryIGNTestDataStoreMain.value
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMain)){
					lIsSaveOK=false
					break
				}
				if(lIGNTestDataStoreMain.getIsIGNTestDataStoreMainChanged()){
					if(!lIsFoundChangedSingle){
						lIsFoundChangedSingle=true
					}
					lListToDoCaseNumSingle.add(lEntryIGNTestDataStoreMain.key)
				}
			}
			for(Map.Entry lEntryIGNTestMasterCaseTypeMain in this.mapIGNTestMasterCaseTypeMain){
				IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lEntryIGNTestMasterCaseTypeMain.value
				if(IGNUemaHelper.checkObjectNullOfObject(IGNTestMasterCaseTypeMain)){
					lIsSaveOK=false
					break
				}
				if(lIGNTestMasterCaseTypeMain.CaseGroupFactory.MapIGNTestMasterCaseGroupTypeSheet.size()>0){
					if(!lIsFoundChangedMultiple){
						lIsFoundChangedMultiple=true
					}
					lListToDoCaseNumMultiple.add(lEntryIGNTestMasterCaseTypeMain.key)
				}
			}
			if(lIsFoundChangedSingle){
				if(lListToDoCaseNumSingle.size()>0){
					this.isIGNTestMasterCaseFactoryExcelSaving=true
					for(Integer lNumToDoCaseNumSingle in lListToDoCaseNumSingle){
						IGNTestDataStoreMain lIGNTestDataStoreMain=this.getIGNTestDataStoreMainByCaseNumber(lNumToDoCaseNumSingle)
						if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestDataStoreMain)){
							IGNUemaHelper.printLog('lIGNTestDataStoreMain=null')
							lIsSaveOK=false
							break
						}
						Map<String,String> lMapDataOutput=lIGNTestDataStoreMain.getMapDataOutput()
						if(!lIGNTestDataStoreMain.applyMapDataOutputChanged(lMapDataOutput)){
							IGNUemaHelper.printLog('applyMapDataOutputChangedFailed')
							lIsSaveOK=false
							break
						}
						for(Map.Entry lEntryDataOutput in lMapDataOutput){
							IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProgramParameterName(lEntryDataOutput.key)
							if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
								IGNUemaHelper.printLog('lIGNTestMasterFieldTypeSingle=null')
								lIsSaveOK=false
								break
							}
							try{
								String lStrDataOutputValue=lEntryDataOutput.value
								if(IGNUemaHelper.checkObjectNullOfObject(lStrDataOutputValue)){
									lStrDataOutputValue=''
								}
								lStrDataOutputValue=IGNUemaHelper.copyStringFitForExcelCell(lStrDataOutputValue)
								lStrDataOutputValue=lStrDataOutputValue.trim()
								ExcelKeywords.setValueToCellByIndex(lTestExcelFileWorkSheetOutput,lNumToDoCaseNumSingle,lIGNTestMasterFieldTypeSingle.getNumExcelCellColIndex(),lStrDataOutputValue)
							}catch(Exception ex){
								try{
									this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,ex.getStackTrace()[0].getMethodName(),ex.getMessage())
									IGNUemaHelper.printLog(this.strIGNTestMasterCaseFactoryMessage)
								}catch(Exception exx){
									//ex.printStackTrace()
									this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',ex.getMessage())
									IGNUemaHelper.printLog(this.strIGNTestMasterCaseFactoryMessage)
									lIsSaveOK=false
									break
								}
							}
						}
						if(!lIsSaveOK){
							break
						}
					}
					this.isIGNTestMasterCaseFactoryExcelSaving=false
				}
			}
			if(lIsFoundChangedMultiple){
				if(lListToDoCaseNumMultiple.size()>0){
					for(Integer lNumToDoCaseNumMultiple in lListToDoCaseNumMultiple){
						IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=this.getIGNTestMasterCaseTypeMainByCaseNumber(lNumToDoCaseNumMultiple)
						if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseTypeMain)){
							IGNUemaHelper.printLog('lIGNTestMasterCaseTypeMain=null')
							lIsSaveOK=false
							break
						}
						for(Map.Entry lEntryIGNTestMasterCaseGroupTypeSheet in lIGNTestMasterCaseTypeMain.CaseGroupFactory.MapIGNTestMasterCaseGroupTypeSheet){
							IGNTestMasterCaseGroupTypeSheet lIGNTestMasterCaseGroupTypeSheet=lEntryIGNTestMasterCaseGroupTypeSheet.value
							if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeSheet)){
								IGNUemaHelper.printLog('lIGNTestMasterCaseGroupTypeSheet=null')
								lIsSaveOK=false
								break
							}
							IGNUemaHelper.printLog('Excel:Cloning')
							if(!IGNUemaHelper.cloneExcelWorkSheet(lTestExcelFileWorkbok,'IgniteProgramOutput0000',lIGNTestMasterCaseGroupTypeSheet.getStrSheetName())){
								IGNUemaHelper.printLog('Excel:CloningFailed')
								lIsSaveOK=false
								break
							}
							IGNUemaHelper.printLog('Excel:Cloned')
							IGNUemaHelper.printLog('Excel:WorkSheetNew='+lIGNTestMasterCaseGroupTypeSheet.getStrSheetName())
							Sheet lWorkSheetNew=ExcelKeywords.getExcelSheet(lTestExcelFileWorkbok,lIGNTestMasterCaseGroupTypeSheet.getStrSheetName())
							if(IGNUemaHelper.checkObjectNullOfObject(lWorkSheetNew)){
								IGNUemaHelper.printLog('Excel:WorkSheetNew='+lIGNTestMasterCaseGroupTypeSheet.getStrSheetName()+'Failed')
								lIsSaveOK=false
								break
							}
							if(lIGNTestMasterCaseGroupTypeSheet.MapIGNTestMasterCaseGroupTypeRow.size()>0){
								for(Map.Entry lEntryIGNTestMasterCaseGroupTypeRow in lIGNTestMasterCaseGroupTypeSheet.MapIGNTestMasterCaseGroupTypeRow){
									IGNTestMasterCaseGroupTypeRow lIGNTestMasterCaseGroupTypeRow=lEntryIGNTestMasterCaseGroupTypeRow.value
									if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseGroupTypeRow)){
										IGNUemaHelper.printLog('lIGNTestMasterCaseGroupTypeRow=null')
										lIsSaveOK=false
										break
									}
									if(!lIGNTestMasterCaseGroupTypeRow.validateMapDataOutput()){
										IGNUemaHelper.printLog('lIGNTestMasterCaseGroupTypeRowValidateMapDataOutputFailed')
										lIsSaveOK=false
										break
									}
									for(Map.Entry lEntryDataOutput in lIGNTestMasterCaseGroupTypeRow.MapDataOutput){
										IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple=this.parentIGNTestDataAdapter.getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeMultipleByProgramParameterName(lEntryDataOutput.key)
										if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeMultiple)){
											IGNUemaHelper.printLog('lIGNTestMasterFieldTypeMultiple=null')
											lIsSaveOK=false
											break
										}
										try{
											String lStrDataOutputValue=lEntryDataOutput.value
											if(IGNUemaHelper.checkObjectNullOfObject(lStrDataOutputValue)){
												lStrDataOutputValue=''
											}
											lStrDataOutputValue=IGNUemaHelper.copyStringFitForExcelCell(lStrDataOutputValue)
											lStrDataOutputValue=lStrDataOutputValue.trim()
											ExcelKeywords.setValueToCellByIndex(lWorkSheetNew,lIGNTestMasterCaseGroupTypeRow.getNumRowIndex(),lIGNTestMasterFieldTypeMultiple.getNumExcelCellColIndex(),lStrDataOutputValue)
										}catch(Exception ex){
											try{
												this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,ex.getStackTrace()[0].getMethodName(),ex.getMessage())
												IGNUemaHelper.printLog(this.strIGNTestMasterCaseFactoryMessage)
											}catch(Exception exx){
												//ex.printStackTrace()
												this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',ex.getMessage())
												IGNUemaHelper.printLog(this.strIGNTestMasterCaseFactoryMessage)
												lIsSaveOK=false
												break
											}
										}
									}
									if(!lIsSaveOK){
										break
									}
								}
								if(!lIsSaveOK){
									break
								}
							}
							if(!lIsSaveOK){
								break
							}
						}
						if(!lIsSaveOK){
							break
						}
					}
				}
			}
			if(lIsSaveOK){
				try{
					IGNUemaHelper.printLog('Excel:Saving')
					IGNUemaHelper.saveExcelWorkbookByFileName(this.parentIGNTestDataAdapter.getParentIGNTestManager().getStrConfigExcelFileName(),lTestExcelFileWorkbok)
				}catch(Exception ex){
					try{
						this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,ex.getStackTrace()[0].getMethodName(),ex.getMessage())
						IGNUemaHelper.printLog('Excel:SavingException='+this.strIGNTestMasterCaseFactoryMessage)
					}catch(Exception exx){
						//ex.printStackTrace()
						this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',ex.getMessage())
						IGNUemaHelper.printLog('Excel:SavingException='+this.strIGNTestMasterCaseFactoryMessage)
					}
				}
				IGNUemaHelper.printLog('Excel:Saved')
			}
			lreturn=lIsSaveOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterCaseFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterCaseFactoryMessage,'',e.getMessage())
			}
		}
		this.isIGNTestMasterCaseFactoryExcelSaving=false
		return lreturn
	}
}