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
import internal.GlobalVariable
import org.apache.poi.ss.usermodel.*
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestStoryAfterToDo
public class IGNTestExecutorFactory{
	private IGNTestConductor parentIGNTestConductor
	private String strIGNTestExecutorFactoryMessage=''
	private Boolean isIGNTestExecutorFactoryReady=false
	private TreeMap<Integer,IGNTestExecutorTypeItem> mapIGNTestExecutorTypeItemStore
	private TreeMap<Integer,IGNTestExecutorTypeItem> mapIGNTestExecutorTypeItemNoRun
	private TreeMap<Integer,IGNTestExecutorTypeItem> mapIGNTestExecutorTypeItemToRun
	private List<String> listIGNTestExecutorTypeItemDoAfterBatch
	private TreeMap<Integer,IGNTestExecutorTypeItem> mapIGNTestExecutorTypeItemDoAfterBatch
	private TreeMap<Integer,String> mapTestMessageAfterBatch
	private Boolean isIGNTestExecutorFactoryExecutedSingle=false
	private Boolean isIGNTestExecutorFactoryExecutedBatch=false
	private String strIGNTestExecutorFactoryTestStoryDetailAfterSingle=''
	private String strIGNTestExecutorFactoryTestStoryDetailAfterBatch=''
	private Boolean isIGNTestExecutorFactoryFailedInBatch=false
	private Boolean isIGNTestExecutorFactoryFailedInAfterBatch=false
	public IGNTestExecutorFactory(IGNTestConductor ignTestConductor){
		super()
		try{
			this.parentIGNTestConductor=ignTestConductor
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestConductor)){
				this.initIGNTestExecutorFactory()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestExecutorFactory(){
		try{
			this.isIGNTestExecutorFactoryReady=false
			Boolean lIsIGNTestExecutorFactoryReady=true
			if(lIsIGNTestExecutorFactoryReady){
				lIsIGNTestExecutorFactoryReady=this.prepareMapIGNTestExecutorTypeItemStore()
			}
			if(lIsIGNTestExecutorFactoryReady){
				lIsIGNTestExecutorFactoryReady=this.classifyMapIGNTestExecutorTypeItem()
			}
			this.isIGNTestExecutorFactoryReady=lIsIGNTestExecutorFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapIGNTestExecutorTypeItemStore(){
		Boolean lreturn=false
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.mapIGNTestExecutorTypeItemStore=new TreeMap<Integer,IGNTestExecutorTypeItem>()
			TreeMap<Integer,IGNTestMasterCaseTypeMain> lMapIGNTestMasterCaseTypeMain=this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getMapIGNTestMasterCaseTypeMain()
			if(lMapIGNTestMasterCaseTypeMain.size()>0){
				for(Map.Entry lEntryIGNTestMasterCaseTypeMain in lMapIGNTestMasterCaseTypeMain){
					Integer lNumCaseIndex=lEntryIGNTestMasterCaseTypeMain.key
					IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=new IGNTestExecutorTypeItem(this,lNumCaseIndex)
					lIsPrepareOK=lIGNTestExecutorTypeItem.getIsIGNTestExecutorTypeItemValid()
					if(!lIsPrepareOK){
						this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'prepareMapIGNTestExecutorTypeItemStore','CaseIndex='+lNumCaseIndex.toString())
						break
					}
					this.mapIGNTestExecutorTypeItemStore.put(lNumCaseIndex,lIGNTestExecutorTypeItem)
				}
			}
			if(lIsPrepareOK){
				this.mapIGNTestExecutorTypeItemStore.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean classifyMapIGNTestExecutorTypeItem(){
		Boolean lreturn=false
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNTestExecutorTypeItemStore)){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.mapIGNTestExecutorTypeItemNoRun=new TreeMap<Integer,IGNTestExecutorTypeItem>()
			this.mapIGNTestExecutorTypeItemToRun=new TreeMap<Integer,IGNTestExecutorTypeItem>()
			this.listIGNTestExecutorTypeItemDoAfterBatch=new ArrayList<String>()
			this.mapIGNTestExecutorTypeItemDoAfterBatch=new TreeMap<Integer,IGNTestExecutorTypeItem>()
			this.mapTestMessageAfterBatch=new TreeMap<Integer,String>()
			if(this.mapIGNTestExecutorTypeItemStore.size()>0){
				for(Map.Entry lEntryIGNTestExecutorTypeItem in this.mapIGNTestExecutorTypeItemStore){
					Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
					IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=lEntryIGNTestExecutorTypeItem.value
					if(!lIGNTestExecutorTypeItem.getIsTestCaseDataCurrentStoreTestCaseToDo()){
						this.mapIGNTestExecutorTypeItemNoRun.put(lNumCaseIndex,lIGNTestExecutorTypeItem)
					}else{
						this.mapIGNTestExecutorTypeItemToRun.put(lNumCaseIndex,lIGNTestExecutorTypeItem)
						IGNTestStoryAfterToDo lEnumIGNTestStoryAfterToDo=lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().getEnumIGNTestStoryAfterToDo()
						if((lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestCollectionOnly)||(lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)){
							IGNUemaHelper.addStringToListOfString(true,lIGNTestExecutorTypeItem.getStrTestCaseDataCurrentInputTestStoryCaseName(),this.listIGNTestExecutorTypeItemDoAfterBatch)
						}
					}
				}
			}
			Boolean lIsTestAfterBatchTodo=true
			lIsTestAfterBatchTodo=lIsTestAfterBatchTodo&&(this.mapIGNTestExecutorTypeItemToRun.size()>0)
			lIsTestAfterBatchTodo=lIsTestAfterBatchTodo&&(this.listIGNTestExecutorTypeItemDoAfterBatch.size()>0)
			if(lIsTestAfterBatchTodo){
				List<String> lListIGNTestExecutorTypeItemDoAfterBatch=new ArrayList<String>()
				NavigableMap lMapDescendingIGNTestExecutorTypeItemToRun=this.mapIGNTestExecutorTypeItemToRun.descendingMap()
				for(Map.Entry lEntryIGNTestExecutorTypeItem in lMapDescendingIGNTestExecutorTypeItemToRun){
					Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
					IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=lEntryIGNTestExecutorTypeItem.value
					String lStrTestCaseDataCurrentInputTestStoryCaseName=lIGNTestExecutorTypeItem.getStrTestCaseDataCurrentInputTestStoryCaseName()
					if(this.listIGNTestExecutorTypeItemDoAfterBatch.contains(lStrTestCaseDataCurrentInputTestStoryCaseName)){
						if(!lListIGNTestExecutorTypeItemDoAfterBatch.contains(lStrTestCaseDataCurrentInputTestStoryCaseName)){
							lListIGNTestExecutorTypeItemDoAfterBatch.add(lStrTestCaseDataCurrentInputTestStoryCaseName)
							this.mapIGNTestExecutorTypeItemDoAfterBatch.put(lNumCaseIndex,lIGNTestExecutorTypeItem)
							this.mapTestMessageAfterBatch.put(lNumCaseIndex,'')
						}
					}
				}
			}
			if(this.mapIGNTestExecutorTypeItemNoRun.size()>0){
				this.mapIGNTestExecutorTypeItemNoRun.sort(null)
			}
			if(this.mapIGNTestExecutorTypeItemToRun.size()>0){
				this.mapIGNTestExecutorTypeItemToRun.sort(null)
			}
			if(this.mapIGNTestExecutorTypeItemDoAfterBatch.size()>0){
				this.mapIGNTestExecutorTypeItemDoAfterBatch.sort(null)
			}
			if(this.mapTestMessageAfterBatch.size()>0){
				this.mapTestMessageAfterBatch.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestConductor getParentIGNTestConductor(){
		try{
			return this.parentIGNTestConductor
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestConductor(IGNTestConductor newParentIGNTestConductor){
		//Do Nothing
		//this.parentIGNTestConductor=newParentIGNTestConductor
	}
	public String getStrIGNTestExecutorFactoryMessage(){
		try{
			return this.strIGNTestExecutorFactoryMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorFactoryMessage(String newStrIGNTestExecutorFactoryMessage){
		//Do Nothing
		//this.strIGNTestExecutorFactoryMessage=newStrIGNTestExecutorFactoryMessage
	}
	public Boolean getIsIGNTestExecutorFactoryReady(){
		try{
			return this.isIGNTestExecutorFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorFactoryReady(Boolean newIsIGNTestExecutorFactoryReady){
		//Do Nothing
		//this.isIGNTestExecutorFactoryReady=newIsIGNTestExecutorFactoryReady
	}
	public TreeMap<Integer,IGNTestExecutorTypeItem> getMapIGNTestExecutorTypeItemStore(){
		try{
			return this.mapIGNTestExecutorTypeItemStore
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestExecutorTypeItemStore(TreeMap<Integer,IGNTestExecutorTypeItem> newMapIGNTestExecutorTypeItemStore){
		//Do Nothing
		//this.mapIGNTestExecutorTypeItemStore=newMapIGNTestExecutorTypeItemStore
	}
	public TreeMap<Integer,IGNTestExecutorTypeItem> getMmapIGNTestExecutorTypeItemNoRun(){
		try{
			return this.mapIGNTestExecutorTypeItemNoRun
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMmapIGNTestExecutorTypeItemNoRun(TreeMap<Integer,IGNTestExecutorTypeItem> newMmapIGNTestExecutorTypeItemNoRun){
		try{
			this.mapIGNTestExecutorTypeItemNoRun=newMmapIGNTestExecutorTypeItemNoRun
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public TreeMap<Integer,IGNTestExecutorTypeItem> getMapIGNTestExecutorTypeItemToRun(){
		try{
			return this.mapIGNTestExecutorTypeItemToRun
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestExecutorTypeItemToRun(TreeMap<Integer,IGNTestExecutorTypeItem> newMapIGNTestExecutorTypeItemToRun){
		try{
			this.mapIGNTestExecutorTypeItemToRun=newMapIGNTestExecutorTypeItemToRun
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public List<String> getListIGNTestExecutorTypeItemDoAfterBatch(){
		try{
			return this.listIGNTestExecutorTypeItemDoAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestExecutorTypeItemDoAfterBatch(List<String> newListIGNTestExecutorTypeItemDoAfterBatch){
		try{
			//this.listIGNTestExecutorTypeItemDoAfterBatch=newListIGNTestExecutorTypeItemDoAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public TreeMap<Integer,IGNTestExecutorTypeItem> getMapIGNTestExecutorTypeItemDoAfterBatch(){
		try{
			return this.mapIGNTestExecutorTypeItemDoAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapIGNTestExecutorTypeItemDoAfterBatch(TreeMap<Integer,IGNTestExecutorTypeItem> newMapIGNTestExecutorTypeItemDoAfterBatch){
		try{
			this.mapIGNTestExecutorTypeItemDoAfterBatch=newMapIGNTestExecutorTypeItemDoAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public TreeMap<Integer,String> getMapTestMessageAfterBatch(){
		try{
			TreeMap<Integer,String> lMapTestMessageAfterBatch=new TreeMap<String,String>()
			lMapTestMessageAfterBatch.putAll(this.mapTestMessageAfterBatch)
			return lMapTestMessageAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setMapTestMessageAfterBatch(TreeMap<String,String> newMapTestMessageAfterBatch){
		try{
			//this.mapTestMessageAfterBatch=newMapTestMessageAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestExecutorFactoryExecutedSingle(){
		try{
			return this.isIGNTestExecutorFactoryExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorFactoryExecutedSingle(Boolean newIsIGNTestExecutorFactoryExecutedSingle){
		try{
			this.isIGNTestExecutorFactoryExecutedSingle=newIsIGNTestExecutorFactoryExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestExecutorFactoryExecutedBatch(){
		try{
			return this.isIGNTestExecutorFactoryExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorFactoryExecutedBatch(Boolean newIsIGNTestExecutorFactoryExecutedBatch){
		try{
			this.isIGNTestExecutorFactoryExecutedBatch=newIsIGNTestExecutorFactoryExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestExecutorFactoryTestStoryDetailAfterSingle(){
		try{
			return this.strIGNTestExecutorFactoryTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorFactoryTestStoryDetailAfterSingle(String newStrIGNTestExecutorFactoryTestStoryDetailAfterSingle){
		try{
			//this.strIGNTestExecutorFactoryTestStoryDetailAfterSingle=newStrIGNTestExecutorFactoryTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestExecutorFactoryTestStoryDetailAfterBatch(){
		try{
			return this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorFactoryTestStoryDetailAfterBatch(String newStrIGNTestExecutorFactoryTestStoryDetailAfterBatch){
		try{
			//this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch=newStrIGNTestExecutorFactoryTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestExecutorFactoryFailedInBatch(){
		try{
			return this.isIGNTestExecutorFactoryFailedInBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorFactoryFailedInBatch(Boolean newIsIGNTestExecutorFactoryFailedInBatch){
		try{
			//this.isIGNTestExecutorFactoryFailedInBatch=newIsIGNTestExecutorFactoryFailedInBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestExecutorFactoryFailedInAfterBatch(){
		try{
			return this.isIGNTestExecutorFactoryFailedInAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorFactoryFailedInAfterBatch(Boolean newIsIGNTestExecutorFactoryFailedInAfterBatch){
		try{
			//this.isIGNTestExecutorFactoryFailedInAfterBatch=newIsIGNTestExecutorFactoryFailedInAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestExecutorTypeItem getIGNTestExecutorTypeItemStoreByCaseNumber(Integer numCaseNumber){
		IGNTestExecutorTypeItem lreturn=null
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemStore)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestExecutorTypeItemStore.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestExecutorTypeItemStore.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestExecutorTypeItem getIGNTestExecutorTypeItemNoRunByCaseNumber(Integer numCaseNumber){
		IGNTestExecutorTypeItem lreturn=null
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemNoRun)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestExecutorTypeItemNoRun.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestExecutorTypeItemNoRun.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestExecutorTypeItem getIGNTestExecutorTypeItemToRunByCaseNumber(Integer numCaseNumber){
		IGNTestExecutorTypeItem lreturn=null
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemToRun)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestExecutorTypeItemToRun.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestExecutorTypeItemToRun.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestExecutorTypeItem getIGNTestExecutorTypeItemDoAfterBatchByCaseNumber(Integer numCaseNumber){
		IGNTestExecutorTypeItem lreturn=null
		if(!this.parentIGNTestConductor.getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemDoAfterBatch)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapIGNTestExecutorTypeItemDoAfterBatch.containsKey(numCaseNumber)){
				lreturn=this.mapIGNTestExecutorTypeItemDoAfterBatch.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public String getStrTestMessageAfterBatchByCaseNumber(Integer numCaseNumber){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapTestMessageAfterBatch)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			if(this.mapTestMessageAfterBatch.containsKey(numCaseNumber)){
				lreturn=this.mapTestMessageAfterBatch.get(numCaseNumber)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean commitIGNTestExecutorFactoryOutputChanged(){
		Boolean lreturn=false
		if(!this.isIGNTestExecutorFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemToRun)){
			return lreturn
		}
		try{
			Boolean lIsCommitIGNTestExecutorFactoryOutputChanged=true
			for(Map.Entry lEntryIGNTestExecutorTypeItem in this.mapIGNTestExecutorTypeItemToRun){
				Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
				IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=lEntryIGNTestExecutorTypeItem.value
				lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain().refreshMapCaseDataReferOutput()
				lIsCommitIGNTestExecutorFactoryOutputChanged=lIsCommitIGNTestExecutorFactoryOutputChanged&&lIGNTestExecutorTypeItem.commitTestExecutionOutputChanged()
			}
			lreturn=lIsCommitIGNTestExecutorFactoryOutputChanged
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestExecutionSingle(Integer numCaseNumber){
		Boolean lreturn=false
		if(!this.isIGNTestExecutorFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemToRun)){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		Integer lGlobalVariableCaseNumber=GlobalVariable.CaseNumber
		try{
			Boolean lIsProceedTestExecutionSingle=false
			this.isIGNTestExecutorFactoryExecutedSingle=true
			this.strIGNTestExecutorFactoryTestStoryDetailAfterSingle=''
			this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch=''
			this.isIGNTestExecutorFactoryFailedInBatch=false
			this.isIGNTestExecutorFactoryFailedInAfterBatch=false
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.getIGNTestExecutorTypeItemToRunByCaseNumber(numCaseNumber)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestExecutorTypeItem)){
				return lreturn
			}
			IGNUemaHelper.printLog('ProceedTestExecutionSingleCaseNumber='+numCaseNumber.toString()+':Start')
			lIsProceedTestExecutionSingle=lIGNTestExecutorTypeItem.proceedTestExecution()
			if(lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().getIsWebBrowserInit()){
				lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().browserClose()
			}
			if(lIsProceedTestExecutionSingle){
				IGNTestStoryAfterToDo lEnumIGNTestStoryAfterToDo=lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().getEnumIGNTestStoryAfterToDo()
				if((lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestSuiteOnly)||(lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)){
					this.strIGNTestExecutorFactoryTestStoryDetailAfterSingle=lIGNTestExecutorTypeItem.getStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail()
				}
				GlobalVariable.CaseNumber=lGlobalVariableCaseNumber
				if(this.mapIGNTestExecutorTypeItemDoAfterBatch.size()>0){
					for(Map.Entry lEntryTestMessageAfterBatch in this.mapTestMessageAfterBatch){
						lEntryTestMessageAfterBatch.value=''
					}
				}
				if(this.mapIGNTestExecutorTypeItemDoAfterBatch.size()>0){
					for(Map.Entry lEntryIGNTestExecutorTypeItem in this.mapIGNTestExecutorTypeItemDoAfterBatch){
						Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
						IGNTestExecutorTypeItem lIGNTestExecutorTypeItemAfterBatch=lEntryIGNTestExecutorTypeItem.value
						GlobalVariable.CaseNumber=lNumCaseIndex
						Boolean lIsTestExecutionSingleOK=false
						IGNUemaHelper.printLog('ProceedTestExecutionBatchAfterCaseNumber='+lNumCaseIndex.toString()+':Start')
						lIGNTestExecutorTypeItemAfterBatch.getIGNTestMasterCaseTypeMain().refreshMapCaseDataReferOutput()
						lIsTestExecutionSingleOK=lIGNTestExecutorTypeItemAfterBatch.getIGNTestLibUtilitySuper().proceedTestAfterBatchTestCollection()
						if(!lIsTestExecutionSingleOK){
							if(!this.isIGNTestExecutorFactoryFailedInAfterBatch){
								this.isIGNTestExecutorFactoryFailedInAfterBatch=true
							}
						}
						lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle||lIsTestExecutionSingleOK
						String lStrTestCaseDataCurrentInputTestStoryCaseName=lIGNTestExecutorTypeItemAfterBatch.getStrTestCaseDataCurrentInputTestStoryCaseName()
						String lStrTestMessageAfterBatch=lStrTestCaseDataCurrentInputTestStoryCaseName+'='+lIGNTestExecutorTypeItemAfterBatch.getStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail().trim()
						if(this.mapTestMessageAfterBatch.containsKey(lNumCaseIndex)){
							this.mapTestMessageAfterBatch.put(lNumCaseIndex,lStrTestMessageAfterBatch)
						}
						this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch=IGNUemaHelper.concatMessageLeftRightByEnter(this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch,lStrTestMessageAfterBatch)
						lIsTestExecutionSingleOK=this.commitIGNTestExecutorFactoryOutputChanged()
						lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle&&lIsTestExecutionSingleOK
						IGNUemaHelper.printLog('ProceedTestExecutionBatchAfterCaseNumber='+lNumCaseIndex.toString()+':Stop')
					}
				}
				GlobalVariable.CaseNumber=lGlobalVariableCaseNumber
			}
			if(!this.commitIGNTestExecutorFactoryOutputChanged()){
				lIsProceedTestExecutionSingle=false
			}
			IGNUemaHelper.printLog('ProceedTestExecutionSingleCaseNumber='+numCaseNumber.toString()+':Stop:'+IGNUemaHelper.convertBooleanToYesNoString(lIsProceedTestExecutionSingle))
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestExecutionBatch(){
		Boolean lreturn=false
		if(!this.isIGNTestExecutorFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(this.mapIGNTestExecutorTypeItemToRun)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNTestExecutorTypeItemDoAfterBatch)){
			return lreturn
		}
		Integer lGlobalVariableCaseNumber=GlobalVariable.CaseNumber
		try{
			Boolean lIsProceedTestExecutionBatch=true
			Boolean lIsProceedTestExecutionSingle=false
			this.isIGNTestExecutorFactoryExecutedBatch=true
			this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch=''
			this.isIGNTestExecutorFactoryFailedInBatch=false
			this.isIGNTestExecutorFactoryFailedInAfterBatch=false
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			for(Map.Entry lEntryIGNTestExecutorTypeItem in this.mapIGNTestExecutorTypeItemToRun){
				Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
				IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=lEntryIGNTestExecutorTypeItem.value
				GlobalVariable.CaseNumber=lNumCaseIndex
				Boolean lIsTestExecutionSingleOK=false
				IGNUemaHelper.printLog('ProceedTestExecutionBatchCaseNumber='+lNumCaseIndex.toString()+':Start')
				lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain().refreshMapCaseDataReferOutput()
				lIsTestExecutionSingleOK=lIGNTestExecutorTypeItem.proceedTestExecution()
				if(!lIsTestExecutionSingleOK){
					if(!this.isIGNTestExecutorFactoryFailedInBatch){
						this.isIGNTestExecutorFactoryFailedInBatch=true
					}
				}
				lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle||lIsTestExecutionSingleOK
				if(lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().getIsWebBrowserInit()){
					lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().browserClose()
				}
				lIsTestExecutionSingleOK=this.commitIGNTestExecutorFactoryOutputChanged()
				lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle&&lIsTestExecutionSingleOK
				IGNUemaHelper.printLog('ProceedTestExecutionBatchCaseNumber='+lNumCaseIndex.toString()+':Stop')
			}
			GlobalVariable.CaseNumber=lGlobalVariableCaseNumber
			lIsProceedTestExecutionBatch=lIsProceedTestExecutionSingle
			lIsProceedTestExecutionSingle=true
			if(this.mapIGNTestExecutorTypeItemDoAfterBatch.size()>0){
				for(Map.Entry lEntryTestMessageAfterBatch in this.mapTestMessageAfterBatch){
					lEntryTestMessageAfterBatch.value=''
				}
			}
			if(this.mapIGNTestExecutorTypeItemDoAfterBatch.size()>0){
				for(Map.Entry lEntryIGNTestExecutorTypeItem in this.mapIGNTestExecutorTypeItemDoAfterBatch){
					Integer lNumCaseIndex=lEntryIGNTestExecutorTypeItem.key
					IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=lEntryIGNTestExecutorTypeItem.value
					GlobalVariable.CaseNumber=lNumCaseIndex
					Boolean lIsTestExecutionSingleOK=false
					IGNUemaHelper.printLog('ProceedTestExecutionBatchAfterCaseNumber='+lNumCaseIndex.toString()+':Start')
					lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain().refreshMapCaseDataReferOutput()
					lIsTestExecutionSingleOK=lIGNTestExecutorTypeItem.getIGNTestLibUtilitySuper().proceedTestAfterBatchTestCollection()
					if(!lIsTestExecutionSingleOK){
						if(!this.isIGNTestExecutorFactoryFailedInAfterBatch){
							this.isIGNTestExecutorFactoryFailedInAfterBatch=true
						}
					}
					lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle||lIsTestExecutionSingleOK
					String lStrTestCaseDataCurrentInputTestStoryCaseName=lIGNTestExecutorTypeItem.getStrTestCaseDataCurrentInputTestStoryCaseName()
					String lStrTestMessageAfterBatch=lStrTestCaseDataCurrentInputTestStoryCaseName+'='+lIGNTestExecutorTypeItem.getStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail().trim()
					if(this.mapTestMessageAfterBatch.containsKey(lNumCaseIndex)){
						this.mapTestMessageAfterBatch.put(lNumCaseIndex,lStrTestMessageAfterBatch)
					}
					this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch=IGNUemaHelper.concatMessageLeftRightByEnter(this.strIGNTestExecutorFactoryTestStoryDetailAfterBatch,lStrTestMessageAfterBatch)
					lIsTestExecutionSingleOK=this.commitIGNTestExecutorFactoryOutputChanged()
					lIsProceedTestExecutionSingle=lIsProceedTestExecutionSingle&&lIsTestExecutionSingleOK
					IGNUemaHelper.printLog('ProceedTestExecutionBatchAfterCaseNumber='+lNumCaseIndex.toString()+':Stop')
				}
			}
			GlobalVariable.CaseNumber=lGlobalVariableCaseNumber
			lIsProceedTestExecutionBatch=lIsProceedTestExecutionBatch&&lIsProceedTestExecutionSingle
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionBatch
		}catch(Exception e){
			//e.printStackTrace()
			GlobalVariable.CaseNumber=lGlobalVariableCaseNumber
			try{
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}