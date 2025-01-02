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
public class IGNTestMasterFieldFactory{
	private IGNTestDataAdapter parentIGNTestDataAdapter
	private String strIGNTestMasterFieldFactoryMessage=''
	private Boolean isIGNTestMasterFieldFactoryReady=false
	private Integer numConfigDataFileInputColMax=0
	private Integer numConfigDataFileInputRowMax=0
	private Integer numConfigDataFileOutputColMax=0
	private Integer numConfigDataFileOutputRowMax=0
	private Integer numConfigDataFileTemplateOutputColMax=0
	private Integer numConfigDataFileTemplateOutputRowMax=0
	private Integer numConfigExcelFileInputColMax=0
	private Integer numConfigExcelFileInputRowMax=0
	private Integer numConfigExcelFileOutputColMax=0
	private Integer numConfigExcelFileOutputRowMax=0
	private Integer numConfigExcelFileTemplateOutputColMax=0
	private Integer numConfigExcelFileTemplateOutputRowMax=0
	private TestData testDataFileInput=null
	private TestData testDataFileOutput=null
	private TestData testDataFileTemplateOutput=null
	private Workbook testExcelFileWorkBook=null
	private Sheet testExcelFileWorkSheetInput=null
	private Sheet testExcelFileWorkSheetOutput=null
	private Sheet testExcelFileWorkSheetTemplateOutput=null
	private List<IGNTestMasterFieldTypeSingle> listIGNTestMasterFieldTypeSingle
	private List<IGNTestMasterFieldTypeMultiple> listIGNTestMasterFieldTypeMultiple
	public IGNTestMasterFieldFactory(IGNTestDataAdapter ignTestDataAdapter){
		super()
		try{
			this.parentIGNTestDataAdapter=ignTestDataAdapter
			this.strIGNTestMasterFieldFactoryMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestDataAdapter)){
				this.initIGNTestMasterFieldFactory()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterFieldFactory(){
		try{
			this.isIGNTestMasterFieldFactoryReady=false
			Boolean lIsIGNTestMasterFieldFactoryReady=true
			if(lIsIGNTestMasterFieldFactoryReady){
				//lIsIGNTestMasterFieldFactoryReady=this.initDataFile()
				lIsIGNTestMasterFieldFactoryReady=this.initExcelFile()
				IGNUemaHelper.printLog('InitExcelFile='+lIsIGNTestMasterFieldFactoryReady.toString())
			}

			if(lIsIGNTestMasterFieldFactoryReady){
				//lIsIGNTestMasterFieldFactoryReady=this.initListIGNTestMasterFieldTypeSingleByDataFile()
				lIsIGNTestMasterFieldFactoryReady=this.initListIGNTestMasterFieldTypeSingleByExcelFile()
				IGNUemaHelper.printLog('InitListIGNTestMasterFieldTypeSingleByExcelFile='+lIsIGNTestMasterFieldFactoryReady.toString())
			}

			if(lIsIGNTestMasterFieldFactoryReady){
				//lIsIGNTestMasterFieldFactoryReady=this.initListIGNTestMasterFieldTypeMultipleByDataFile()
				lIsIGNTestMasterFieldFactoryReady=this.initListIGNTestMasterFieldTypeMultipleByExcelFile()
				IGNUemaHelper.printLog('initListIGNTestMasterFieldTypeMultipleByExcelFile='+lIsIGNTestMasterFieldFactoryReady.toString())
			}
			//this.testExcelFileWorkSheetTemplateOutput=null
			//this.testExcelFileWorkSheetOutput=null
			//this.testExcelFileWorkSheetInput=null
			//this.testExcelFileWorkBook=null
			IGNUemaHelper.printLog('InitIGNTestMasterFieldFactory='+lIsIGNTestMasterFieldFactoryReady.toString())
			this.isIGNTestMasterFieldFactoryReady=lIsIGNTestMasterFieldFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	private Boolean initDataFile(){
		Boolean lreturn=false
		try{
			Boolean lIsPrepareOK=true
			String lStrConfigDataFileNameInput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getStrConfigDataFileNameInput()
			String lStrConfigDataFileNameOutput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getStrConfigDataFileNameOutput()
			String lStrConfigDataFileNameTemplateOutput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getStrConfigDataFileNameTemplateOutput()
			TestData lTestDataFileInput=TestDataFactory.findTestData(lStrConfigDataFileNameInput)
			TestData lTestDataFileOutput=TestDataFactory.findTestData(lStrConfigDataFileNameOutput)
			TestData lTestDataFileTemplateOutput=TestDataFactory.findTestData(lStrConfigDataFileNameTemplateOutput)
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestDataFileInput))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestDataFileOutput))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestDataFileTemplateOutput))
			if(lIsPrepareOK){
				lIsPrepareOK=this.checkIntegrityOfTestDataFileInputOutputByDataFile(lTestDataFileInput,lTestDataFileOutput)
			}
			if(lIsPrepareOK){
				lIsPrepareOK=this.checkIntegrityOfTestDataFileTemplateOutputByDataFile(lTestDataFileTemplateOutput)
			}
			if(lIsPrepareOK){
				this.testDataFileInput=lTestDataFileInput
				this.testDataFileOutput=lTestDataFileOutput
				this.testDataFileTemplateOutput=lTestDataFileTemplateOutput
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean checkIntegrityOfTestDataFileInputOutputByDataFile(TestData dataInput,TestData dataOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getIsIGNTestMandatoryParameterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(dataInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(dataOutput)){
			return lreturn
		}
		try{
			Integer lNumDataFileInputTargetColMax=0
			Integer lNumDataFileInputTargetRowMax=0
			Integer lNumDataFileOutputTargetColMax=0
			Integer lNumDataFileOutputTargetRowMax=0
			List<String> lListIGNTestPreDefineParameterOneToOne=this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToOne()
			List<String> lListDataFileInputColumnName=new ArrayList<String>()
			List<String> lListDataFileOutputColumnName=new ArrayList<String>()
			TreeMap<Integer,String> lMapDataFileInputColumnName=new TreeMap<Integer,String>()
			TreeMap<Integer,String> lMapDataFileOutputColumnName=new TreeMap<Integer,String>()
			Integer lNumDataFileInputColMax=dataInput.getColumnNumbers()
			Integer lNumDataFileInputRowMax=dataInput.getRowNumbers()
			Integer lNumDataFileInputColIndex=1
			Integer lNumDataFileInputRowIndex=1
			Integer lNumDataFileOutputColMax=dataOutput.getColumnNumbers()
			Integer lNumDataFileOutputRowMax=dataOutput.getRowNumbers()
			Integer lNumDataFileOutputColIndex=1
			Integer lNumDataFileOutputRowIndex=1
			Boolean lIsScanOK=true
			for(Integer lIndexCol=lNumDataFileInputColIndex;lIndexCol<=lNumDataFileInputColMax;lIndexCol++){
				String lStrDataValue=dataInput.getValue(lIndexCol,lNumDataFileInputRowIndex).trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListDataFileInputColumnName)){
					lIsScanOK=false
					break
				}
				lMapDataFileInputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListDataFileInputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
				if(lListIGNTestPreDefineParameterOneToOne.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToOne){
						if(!lListDataFileInputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			for(Integer lIndexCol=lNumDataFileOutputColIndex;lIndexCol<=lNumDataFileOutputColMax;lIndexCol++){
				String lStrDataValue=dataOutput.getValue(lIndexCol,lNumDataFileOutputRowIndex).trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListDataFileOutputColumnName)){
					lIsScanOK=false
					break
				}
				lMapDataFileOutputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListDataFileOutputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
				if(lListIGNTestPreDefineParameterOneToOne.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToOne){
						if(!lListDataFileOutputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			Integer lNumCaseNo=1
			for(Integer lIndexRow=lNumDataFileInputRowIndex+1;lIndexRow<=lNumDataFileInputRowMax;lIndexRow++){
				String lStrDataValue=dataInput.getValue(lNumDataFileInputColIndex,lIndexRow).trim()
				if(lStrDataValue.isBlank()){
					break
				}
				String lStrCaseNo=String.format('%04d',lNumCaseNo)
				if(!lStrCaseNo.equals(lStrDataValue)){
					lIsScanOK=false
					break
				}
				lNumCaseNo=lNumCaseNo+1
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumCaseNo=1
			for(Integer lIndexRow=lNumDataFileOutputRowIndex+1;lIndexRow<=lNumDataFileOutputRowMax;lIndexRow++){
				String lStrDataValue=dataOutput.getValue(lNumDataFileOutputColIndex,lIndexRow).trim()
				if(lStrDataValue.isBlank()){
					break
				}
				String lStrCaseNo=String.format('%04d',lNumCaseNo)
				if(!lStrCaseNo.equals(lStrDataValue)){
					lIsScanOK=false
					break
				}
				lNumCaseNo=lNumCaseNo+1
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumDataFileInputTargetColMax=Collections.max(lMapDataFileInputColumnName.keySet())
			lNumDataFileInputTargetRowMax=lNumDataFileInputRowMax
			lNumDataFileOutputTargetColMax=Collections.max(lMapDataFileOutputColumnName.keySet())
			lNumDataFileOutputTargetRowMax=lNumDataFileOutputRowMax
			lIsScanOK=lIsScanOK&&(lNumDataFileInputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumDataFileInputTargetRowMax>=10008)
			lIsScanOK=lIsScanOK&&(lNumDataFileOutputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumDataFileOutputTargetRowMax>=10000)
			lIsScanOK=lIsScanOK&&(lNumDataFileInputTargetRowMax==lNumDataFileOutputTargetRowMax)
			if(!lIsScanOK){
				return lreturn
			}
			for(Integer lIndexRow=10005;lIndexRow<=10007;lIndexRow++){
				for(Integer lIndexCol=lNumDataFileInputColIndex;lIndexCol<=lNumDataFileInputTargetColMax;lIndexCol++){
					String lStrDataValue=dataInput.getValue(lIndexCol,lIndexRow).trim()
					if(lStrDataValue.isBlank()){
						lIsScanOK=false
						break
					}
					if(lIndexRow==10006){
						Boolean lIsCheckOK=false
						String lStrCheck=lStrDataValue.toUpperCase()
						switch(lStrCheck){
							case 'NO':
								lIsCheckOK=true
								break
							case 'YES':
								lIsCheckOK=true
								break
							default:
								lIsCheckOK=false
								break
						}
						if(!lIsCheckOK){
							lIsScanOK=false
							break
						}
					}
					if(lIndexRow==10007){
						Boolean lIsCheckOK=false
						String lStrCheck=lStrDataValue.toUpperCase()
						switch(lStrCheck){
							case '0001':
								lIsCheckOK=true
								break
							case '0002':
								lIsCheckOK=true
								break
							case '0003':
								lIsCheckOK=true
								break
							default:
								lIsCheckOK=false
								break
						}
						if(!lIsCheckOK){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(!(lMapDataFileInputColumnName.size()==lMapDataFileOutputColumnName.size())){
				return lreturn
			}
			for(Map.Entry lEntryDataFileInputColumnName in lMapDataFileInputColumnName){
				String lStrValueInput=lEntryDataFileInputColumnName.value
				String lStrValueOutput=lMapDataFileOutputColumnName.get(lEntryDataFileInputColumnName.key)
				if(!lStrValueOutput){
					lIsScanOK=false
					break
				}
				if(!lStrValueInput.equals(lStrValueOutput)){
					lIsScanOK=false
					break
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			this.numConfigDataFileInputColMax=lNumDataFileInputTargetColMax
			this.numConfigDataFileInputRowMax=lNumDataFileInputTargetRowMax
			this.numConfigDataFileOutputColMax=lNumDataFileOutputTargetColMax
			this.numConfigDataFileOutputRowMax=lNumDataFileOutputTargetRowMax
			this.numConfigExcelFileInputColMax=lNumDataFileInputTargetColMax-1
			this.numConfigExcelFileInputRowMax=lNumDataFileInputTargetRowMax-1
			this.numConfigExcelFileOutputColMax=lNumDataFileOutputTargetColMax-1
			this.numConfigExcelFileOutputRowMax=lNumDataFileOutputTargetRowMax-1
			lreturn=lIsScanOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean checkIntegrityOfTestDataFileTemplateOutputByDataFile(TestData dataTemplateOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getIsIGNTestMandatoryParameterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(dataTemplateOutput)){
			return lreturn
		}
		try{
			Integer lNumDataFileTemplateOutputTargetColMax=0
			Integer lNumDataFileTemplateOutputTargetRowMax=0
			List<String> lListIGNTestPreDefineParameterOneToMany=this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToMany()
			List<String> lListDataFileTemplateOutputColumnName=new ArrayList<String>()
			TreeMap<Integer,String> lMapDataFileTemplateOutputColumnName=new TreeMap<Integer,String>()
			Integer lNumDataFileTemplateOutputColMax=dataTemplateOutput.getColumnNumbers()
			Integer lNumDataFileTemplateOutputRowMax=dataTemplateOutput.getRowNumbers()
			Integer lNumDataFileTemplateOutputColIndex=1
			Integer lNumDataFileTemplateOutputRowIndex=1
			Boolean lIsScanOK=true
			for(Integer lIndexCol=lNumDataFileTemplateOutputColIndex;lIndexCol<=lNumDataFileTemplateOutputColMax;lIndexCol++){
				String lStrDataValue=dataTemplateOutput.getValue(lIndexCol,lNumDataFileTemplateOutputRowIndex).trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListDataFileTemplateOutputColumnName)){
					lIsScanOK=false
					break
				}
				lMapDataFileTemplateOutputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListDataFileTemplateOutputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToMany)){
				if(lListIGNTestPreDefineParameterOneToMany.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToMany){
						if(!lListDataFileTemplateOutputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumDataFileTemplateOutputTargetColMax=Collections.max(lMapDataFileTemplateOutputColumnName.keySet())
			lNumDataFileTemplateOutputTargetRowMax=lNumDataFileTemplateOutputRowMax
			lIsScanOK=lIsScanOK&&(lNumDataFileTemplateOutputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumDataFileTemplateOutputTargetRowMax>0)
			if(!lIsScanOK){
				return lreturn
			}
			this.numConfigDataFileTemplateOutputColMax=lNumDataFileTemplateOutputTargetColMax
			this.numConfigDataFileTemplateOutputRowMax=lNumDataFileTemplateOutputTargetRowMax
			this.numConfigExcelFileTemplateOutputColMax=lNumDataFileTemplateOutputTargetColMax-1
			this.numConfigExcelFileTemplateOutputRowMax=lNumDataFileTemplateOutputTargetRowMax-1
			lreturn=lIsScanOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestMasterFieldTypeSingleByDataFile(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.testDataFileInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.testDataFileOutput)){
			return lreturn
		}
		try{
			this.listIGNTestMasterFieldTypeSingle=new ArrayList<IGNTestMasterFieldTypeSingle>()
			Integer lNumDataFileInputColMax=this.numConfigDataFileInputColMax
			Integer lNumDataFileInputRowMax=this.numConfigDataFileInputRowMax
			Integer lNumDataFileInputColIndex=1
			Integer lNumDataFileInputRowIndex=1
			Boolean lIsPrepareOK=true
			for(Integer lIndexCol=lNumDataFileInputColIndex;lIndexCol<=lNumDataFileInputColMax;lIndexCol++){
				Integer lNumExcelCellColIndex=lIndexCol
				String lStrProductGroupListName=''
				String lStrProjectFieldListFieldName=''
				String lStrProjectFieldListFieldMasterTypeKey=''
				Integer lNumProjectFieldListFieldMasterTypeNum=0
				String lStrProjectFieldListFieldMasterDefaultValue=''
				Map lMapProjectFieldListFieldMasterPair=[:]
				String lStrDataValue=''
				lNumDataFileInputRowIndex=1
				lStrDataValue=this.testDataFileInput.getValue(lIndexCol,lNumDataFileInputRowIndex).trim()
				lStrProjectFieldListFieldName=lStrDataValue
				lNumDataFileInputRowIndex=10005
				lStrDataValue=this.testDataFileInput.getValue(lIndexCol,lNumDataFileInputRowIndex).trim()
				lStrProductGroupListName=lStrDataValue
				lNumDataFileInputRowIndex=10007
				lStrDataValue=this.testDataFileInput.getValue(lIndexCol,lNumDataFileInputRowIndex).trim()
				lStrProjectFieldListFieldMasterTypeKey=lStrDataValue
				lNumProjectFieldListFieldMasterTypeNum=IGNUemaHelper.convertStringToInteger(lStrProjectFieldListFieldMasterTypeKey,0)
				if(lNumProjectFieldListFieldMasterTypeNum==0){
					lIsPrepareOK=false
					break
				}
				lNumDataFileInputRowIndex=10008
				lStrDataValue=this.testDataFileInput.getValue(lIndexCol,lNumDataFileInputRowIndex).trim()
				lStrProjectFieldListFieldMasterDefaultValue=lStrDataValue
				if(lNumProjectFieldListFieldMasterTypeNum==2){
					for(Integer lIndexRow=10009;lIndexRow<=lNumDataFileInputRowMax;lIndexRow++){
						String lStrDataText=this.testDataFileInput.getValue(lIndexCol,lIndexRow).trim()
						if(lStrDataText.isBlank()){
							break
						}
						String lDelimitedText='||=||'
						String lDelimitedRegex='\\|\\|=\\|\\|'
						if(!lStrDataText.contains(lDelimitedText)){
							lIsPrepareOK=false
							break
						}
						String[] lListSplitText=lStrDataText.split(lDelimitedRegex)
						if(lListSplitText.size()<2){
							lIsPrepareOK=false
							break
						}
						String lStrKey=lListSplitText[0].trim()
						Integer lNumKey=IGNUemaHelper.convertStringToInteger(lStrKey,0)
						if(lNumKey==0){
							lIsPrepareOK=false
							break
						}
						lStrKey=lNumKey.toString()
						String lStrValue=lListSplitText[1].trim()
						lMapProjectFieldListFieldMasterPair.put(lStrKey,lStrValue)
					}
					if(lIsPrepareOK){
						lIsPrepareOK=lMapProjectFieldListFieldMasterPair.size()>0
					}
				}
				if(!lIsPrepareOK){
					break
				}
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=new IGNTestMasterFieldTypeSingle(this,lNumExcelCellColIndex,lStrProductGroupListName,lStrProjectFieldListFieldName,lStrProjectFieldListFieldMasterTypeKey,lNumProjectFieldListFieldMasterTypeNum,lStrProjectFieldListFieldMasterDefaultValue,lMapProjectFieldListFieldMasterPair)
				lIsPrepareOK=lIGNTestMasterFieldTypeSingle.getIsIGNTestMasterFieldTypeSingleValid()
				if(!lIsPrepareOK){
					break
				}
				this.listIGNTestMasterFieldTypeSingle.add(lIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestMasterFieldTypeMultipleByDataFile(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.testDataFileTemplateOutput)){
			return lreturn
		}
		try{
			this.listIGNTestMasterFieldTypeMultiple=new ArrayList<IGNTestMasterFieldTypeMultiple>()
			Integer lNumDataFileTemplateOutputColMax=this.numConfigDataFileTemplateOutputColMax
			Integer lNumDataFileTemplateOutputRowMax=this.numConfigDataFileTemplateOutputRowMax
			Integer lNumDataFileTemplateOutputColIndex=1
			Integer lNumDataFileTemplateOutputRowIndex=1
			Boolean lIsPrepareOK=true
			for(Integer lIndexCol=lNumDataFileTemplateOutputColIndex;lIndexCol<=lNumDataFileTemplateOutputColMax;lIndexCol++){
				Integer lNumExcelCellColIndex=lIndexCol
				String lStrProjectFieldListFieldName=''
				String lStrDataValue=''
				lNumDataFileTemplateOutputRowIndex=1
				lStrDataValue=this.testDataFileTemplateOutput.getValue(lIndexCol,lNumDataFileTemplateOutputRowIndex).trim()
				lStrProjectFieldListFieldName=lStrDataValue
				IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple=new IGNTestMasterFieldTypeMultiple(this,lNumExcelCellColIndex,lStrProjectFieldListFieldName)
				lIsPrepareOK=lIGNTestMasterFieldTypeMultiple.getIsIGNTestMasterFieldTypeMultipleValid()
				if(!lIsPrepareOK){
					break
				}
				this.listIGNTestMasterFieldTypeMultiple.add(lIGNTestMasterFieldTypeMultiple)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initExcelFile(){
		Boolean lreturn=false
		try{
			Boolean lIsPrepareOK=true
			IGNUemaHelper.printLog('Excel:getExcelWorkbook')
			Workbook lTestExcelFileWorkBook=this.parentIGNTestDataAdapter.getParentIGNTestManager().getExcelWorkbook()
			IGNUemaHelper.printLog('Excel:getExcelWorkSheetInput')
			Sheet lTestExcelFileWorkSheetInput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getExcelWorkSheetInput(lTestExcelFileWorkBook)
			IGNUemaHelper.printLog('Excel:getExcelWorkSheetOutput')
			Sheet lTestExcelFileWorkSheetOutput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getExcelWorkSheetOutput(lTestExcelFileWorkBook)
			IGNUemaHelper.printLog('Excel:getExcelWorkSheetTemplateOutput')
			Sheet lTestExcelFileWorkSheetTemplateOutput=this.parentIGNTestDataAdapter.getParentIGNTestManager().getExcelWorkSheetTemplateOutput(lTestExcelFileWorkBook)
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkBook))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetInput))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetOutput))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(lTestExcelFileWorkSheetTemplateOutput))
			IGNUemaHelper.printLog('Excel:Ready='+IGNUemaHelper.convertBooleanToYesNoString(lIsPrepareOK))
			if(lIsPrepareOK){
				lIsPrepareOK=this.checkIntegrityOfTestExcelFileInputOutputByExcelFile(lTestExcelFileWorkSheetInput,lTestExcelFileWorkSheetOutput)
			}
			if(lIsPrepareOK){
				lIsPrepareOK=this.checkIntegrityOfTestExcelFileTemplateOutputByExcelFile(lTestExcelFileWorkSheetTemplateOutput)
			}
			if(lIsPrepareOK){
				this.testExcelFileWorkBook=lTestExcelFileWorkBook
				this.testExcelFileWorkSheetInput=lTestExcelFileWorkSheetInput
				this.testExcelFileWorkSheetOutput=lTestExcelFileWorkSheetOutput
				this.testExcelFileWorkSheetTemplateOutput=lTestExcelFileWorkSheetTemplateOutput
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean checkIntegrityOfTestExcelFileInputOutputByExcelFile(Sheet excelWorkSheetInput,Sheet excelWorkSheetOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getIsIGNTestMandatoryParameterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(excelWorkSheetInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(excelWorkSheetOutput)){
			return lreturn
		}
		Integer lNumConstExcelRowMax=16384
		try{
			Integer lNumExcelFileInputTargetColMax=0
			Integer lNumExcelFileInputTargetRowMax=0
			Integer lNumExcelFileOutputTargetColMax=0
			Integer lNumExcelFileOutputTargetRowMax=0
			List<String> lListIGNTestPreDefineParameterOneToOne=this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToOne()
			List<String> lListExcelFileInputColumnName=new ArrayList<String>()
			List<String> lListExcelFileOutputColumnName=new ArrayList<String>()
			TreeMap<Integer,String> lMapExcelFileInputColumnName=new TreeMap<Integer,String>()
			TreeMap<Integer,String> lMapExcelFileOutputColumnName=new TreeMap<Integer,String>()
			Integer lNumExcelFileInputColIndex=0
			Integer lNumExcelFileInputRowIndex=0
			Integer lNumExcelFileInputColMax=0
			for(Integer lIndexCol=0;lIndexCol<=lNumConstExcelRowMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				lNumExcelFileInputColMax=lIndexCol
			}
			Integer lNumExcelFileInputRowMax=excelWorkSheetInput.getLastRowNum()
			Integer lNumExcelFileOutputColIndex=0
			Integer lNumExcelFileOutputRowIndex=0
			Integer lNumExcelFileOutputColMax=0
			for(Integer lIndexCol=0;lIndexCol<=lNumConstExcelRowMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetOutput,lNumExcelFileOutputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				lNumExcelFileOutputColMax=lIndexCol
			}
			Integer lNumExcelFileOutputRowMax=excelWorkSheetOutput.getLastRowNum()
			Boolean lIsScanOK=true
			for(Integer lIndexCol=lNumExcelFileInputColIndex;lIndexCol<=lNumExcelFileInputColMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListExcelFileInputColumnName)){
					lIsScanOK=false
					break
				}
				lMapExcelFileInputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListExcelFileInputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
				if(lListIGNTestPreDefineParameterOneToOne.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToOne){
						if(!lListExcelFileInputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			for(Integer lIndexCol=lNumExcelFileOutputColIndex;lIndexCol<=lNumExcelFileOutputColMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetOutput,lNumExcelFileOutputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListExcelFileOutputColumnName)){
					lIsScanOK=false
					break
				}
				lMapExcelFileOutputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListExcelFileOutputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
				if(lListIGNTestPreDefineParameterOneToOne.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToOne){
						if(!lListExcelFileOutputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			Integer lNumCaseNo=1
			for(Integer lIndexRow=lNumExcelFileInputRowIndex+1;lIndexRow<=lNumExcelFileInputRowMax;lIndexRow++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetInput,lIndexRow,lNumExcelFileInputColIndex)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				String lStrCaseNo=String.format('%04d',lNumCaseNo)
				if(!lStrCaseNo.equals(lStrDataValue)){
					lIsScanOK=false
					break
				}
				lNumCaseNo=lNumCaseNo+1
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumCaseNo=1
			for(Integer lIndexRow=lNumExcelFileOutputRowIndex+1;lIndexRow<=lNumExcelFileOutputRowMax;lIndexRow++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetOutput,lIndexRow,lNumExcelFileOutputColIndex)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				String lStrCaseNo=String.format('%04d',lNumCaseNo)
				if(!lStrCaseNo.equals(lStrDataValue)){
					lIsScanOK=false
					break
				}
				lNumCaseNo=lNumCaseNo+1
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumExcelFileInputTargetColMax=Collections.max(lMapExcelFileInputColumnName.keySet())
			lNumExcelFileInputTargetRowMax=lNumExcelFileInputRowMax
			lNumExcelFileOutputTargetColMax=Collections.max(lMapExcelFileOutputColumnName.keySet())
			lNumExcelFileOutputTargetRowMax=lNumExcelFileOutputRowMax
			lIsScanOK=lIsScanOK&&(lNumExcelFileInputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumExcelFileInputTargetRowMax>=10007)
			lIsScanOK=lIsScanOK&&(lNumExcelFileOutputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumExcelFileOutputTargetRowMax>=9999)
			lIsScanOK=lIsScanOK&&(lNumExcelFileInputTargetColMax==lNumExcelFileOutputTargetColMax)
			if(!lIsScanOK){
				return lreturn
			}
			for(Integer lIndexRow=10004;lIndexRow<=10006;lIndexRow++){
				for(Integer lIndexCol=lNumExcelFileInputColIndex;lIndexCol<=lNumExcelFileInputTargetColMax;lIndexCol++){
					String lStrDataValue=''
					try{
						lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetInput,lIndexRow,lIndexCol)
					}catch(Exception ex){
					}
					if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
						lIsScanOK=false
						break
					}
					lStrDataValue=lStrDataValue.trim()
					if(lStrDataValue.isBlank()){
						lIsScanOK=false
						break
					}
					if(lIndexRow==10005){
						Boolean lIsCheckOK=false
						String lStrCheck=lStrDataValue.toUpperCase()
						switch(lStrCheck){
							case 'NO':
								lIsCheckOK=true
								break
							case 'YES':
								lIsCheckOK=true
								break
							default:
								lIsCheckOK=false
								break
						}
						if(!lIsCheckOK){
							lIsScanOK=false
							break
						}
					}
					if(lIndexRow==10006){
						Boolean lIsCheckOK=false
						String lStrCheck=lStrDataValue.toUpperCase()
						switch(lStrCheck){
							case '0001':
								lIsCheckOK=true
								break
							case '0002':
								lIsCheckOK=true
								break
							case '0003':
								lIsCheckOK=true
								break
							default:
								lIsCheckOK=false
								break
						}
						if(!lIsCheckOK){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(!(lMapExcelFileInputColumnName.size()==lMapExcelFileOutputColumnName.size())){
				return lreturn
			}
			for(Map.Entry lEntryExcelFileInputColumnName in lMapExcelFileInputColumnName){
				String lStrValueInput=lEntryExcelFileInputColumnName.value
				String lStrValueOutput=lMapExcelFileOutputColumnName.get(lEntryExcelFileInputColumnName.key)
				if(!lStrValueOutput){
					lIsScanOK=false
					break
				}
				if(!lStrValueInput.equals(lStrValueOutput)){
					lIsScanOK=false
					break
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			this.numConfigExcelFileInputColMax=lNumExcelFileInputTargetColMax
			this.numConfigExcelFileInputRowMax=lNumExcelFileInputTargetRowMax
			this.numConfigExcelFileOutputColMax=lNumExcelFileOutputTargetColMax
			this.numConfigExcelFileOutputRowMax=lNumExcelFileOutputTargetRowMax
			this.numConfigDataFileInputColMax=lNumExcelFileInputTargetColMax+1
			this.numConfigDataFileInputRowMax=lNumExcelFileInputTargetRowMax+1
			this.numConfigDataFileOutputColMax=lNumExcelFileOutputTargetColMax+1
			this.numConfigDataFileOutputRowMax=lNumExcelFileOutputTargetRowMax+1
			lreturn=lIsScanOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean checkIntegrityOfTestExcelFileTemplateOutputByExcelFile(Sheet excelWorkSheetTemplateOutput){
		Boolean lreturn=false
		if(!this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getIsIGNTestMandatoryParameterReady()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(excelWorkSheetTemplateOutput)){
			return lreturn
		}
		Integer lNumConstExcelRowMax=16384
		try{
			Integer lNumExcelFileTemplateOutputTargetColMax=0
			Integer lNumExcelFileTemplateOutputTargetRowMax=0
			List<String> lListIGNTestPreDefineParameterOneToMany=this.parentIGNTestDataAdapter.getParentIGNTestManager().getIGNTestMandatoryParameter().getListIGNTestPreDefineParameterOneToMany()
			List<String> lListExcelFileTemplateOutputColumnName=new ArrayList<String>()
			TreeMap<Integer,String> lMapExcelFileTemplateOutputColumnName=new TreeMap<Integer,String>()
			Integer lNumExcelFileTemplateOutputColIndex=0
			Integer lNumExcelFileTemplateOutputRowIndex=0
			Integer lNumExcelFileTemplateOutputColMax=0
			for(Integer lIndexCol=0;lIndexCol<=lNumConstExcelRowMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetTemplateOutput,lNumExcelFileTemplateOutputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				lNumExcelFileTemplateOutputColMax=lIndexCol
			}
			Integer lNumExcelFileTemplateOutputRowMax=excelWorkSheetTemplateOutput.getLastRowNum()
			Boolean lIsScanOK=true
			for(Integer lIndexCol=lNumExcelFileTemplateOutputColIndex;lIndexCol<=lNumExcelFileTemplateOutputColMax;lIndexCol++){
				String lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(excelWorkSheetTemplateOutput,lNumExcelFileTemplateOutputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				if(!IGNUemaHelper.addStringToListOfString(true,lStrDataValue,lListExcelFileTemplateOutputColumnName)){
					lIsScanOK=false
					break
				}
				lMapExcelFileTemplateOutputColumnName.put(lIndexCol,lStrDataValue)
			}
			if(!lIsScanOK){
				return lreturn
			}
			if(lListExcelFileTemplateOutputColumnName.size()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToMany)){
				if(lListIGNTestPreDefineParameterOneToMany.size()>0){
					for(String lStrItem in lListIGNTestPreDefineParameterOneToMany){
						if(!lListExcelFileTemplateOutputColumnName.contains(lStrItem)){
							lIsScanOK=false
							break
						}
					}
				}
			}
			if(!lIsScanOK){
				return lreturn
			}
			lNumExcelFileTemplateOutputTargetColMax=Collections.max(lMapExcelFileTemplateOutputColumnName.keySet())
			lNumExcelFileTemplateOutputTargetRowMax=lNumExcelFileTemplateOutputRowMax
			lIsScanOK=lIsScanOK&&(lNumExcelFileTemplateOutputTargetColMax>0)
			lIsScanOK=lIsScanOK&&(lNumExcelFileTemplateOutputTargetRowMax>0)
			if(!lIsScanOK){
				return lreturn
			}
			this.numConfigExcelFileTemplateOutputColMax=lNumExcelFileTemplateOutputTargetColMax
			this.numConfigExcelFileTemplateOutputRowMax=lNumExcelFileTemplateOutputTargetRowMax
			this.numConfigDataFileTemplateOutputColMax=lNumExcelFileTemplateOutputTargetColMax+1
			this.numConfigDataFileTemplateOutputRowMax=lNumExcelFileTemplateOutputTargetRowMax+1
			lreturn=lIsScanOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestMasterFieldTypeSingleByExcelFile(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.testExcelFileWorkBook)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.testExcelFileWorkSheetInput)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.testExcelFileWorkSheetOutput)){
			return lreturn
		}
		try{
			this.listIGNTestMasterFieldTypeSingle=new ArrayList<IGNTestMasterFieldTypeSingle>()
			Integer lNumExcelFileInputColMax=this.numConfigExcelFileInputColMax
			Integer lNumExcelFileInputRowMax=this.numConfigExcelFileInputRowMax
			Integer lNumExcelFileInputColIndex=0
			Integer lNumExcelFileInputRowIndex=0
			Boolean lIsPrepareOK=true
			for(Integer lIndexCol=lNumExcelFileInputColIndex;lIndexCol<=lNumExcelFileInputColMax;lIndexCol++){
				Integer lNumDataCellColIndex=lIndexCol+1
				String lStrProductGroupListName=''
				String lStrProjectFieldListFieldName=''
				String lStrProjectFieldListFieldMasterTypeKey=''
				Integer lNumProjectFieldListFieldMasterTypeNum=0
				String lStrProjectFieldListFieldMasterDefaultValue=''
				Map lMapProjectFieldListFieldMasterPair=[:]
				String lStrDataValue=''
				lNumExcelFileInputRowIndex=0
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					lIsPrepareOK=false
					break
				}
				lStrProjectFieldListFieldName=lStrDataValue
				lNumExcelFileInputRowIndex=10004
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					lIsPrepareOK=false
					break
				}
				lStrProductGroupListName=lStrDataValue
				lNumExcelFileInputRowIndex=10006
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					lIsPrepareOK=false
					break
				}
				lStrProjectFieldListFieldMasterTypeKey=lStrDataValue
				lNumProjectFieldListFieldMasterTypeNum=IGNUemaHelper.convertStringToInteger(lStrProjectFieldListFieldMasterTypeKey,0)
				if(lNumProjectFieldListFieldMasterTypeNum==0){
					lIsPrepareOK=false
					break
				}
				lNumExcelFileInputRowIndex=10007
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetInput,lNumExcelFileInputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOfObject(lStrDataValue)){
					lIsPrepareOK=false
					break
				}
				lStrDataValue=lStrDataValue.trim()
				lStrProjectFieldListFieldMasterDefaultValue=lStrDataValue
				if(lNumProjectFieldListFieldMasterTypeNum==2){
					for(Integer lIndexRow=10008;lIndexRow<=lNumExcelFileInputRowMax;lIndexRow++){
						String lStrDataText=''
						try{
							lStrDataText=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetInput,lIndexRow,lIndexCol)
						}catch(Exception ex){
						}
						if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
							break
						}
						lStrDataText=lStrDataText.trim()
						if(lStrDataText.isBlank()){
							break
						}
						String lDelimitedText='||=||'
						String lDelimitedRegex='\\|\\|=\\|\\|'
						if(!lStrDataText.contains(lDelimitedText)){
							lIsPrepareOK=false
							break
						}
						String[] lListSplitText=lStrDataText.split(lDelimitedRegex)
						if(lListSplitText.size()<2){
							lIsPrepareOK=false
							break
						}
						String lStrKey=lListSplitText[0].trim()
						Integer lNumKey=IGNUemaHelper.convertStringToInteger(lStrKey,0)
						if(lNumKey==0){
							lIsPrepareOK=false
							break
						}
						lStrKey=lNumKey.toString()
						String lStrValue=lListSplitText[1].trim()
						lMapProjectFieldListFieldMasterPair.put(lStrKey,lStrValue)
					}
					if(lIsPrepareOK){
						lIsPrepareOK=lMapProjectFieldListFieldMasterPair.size()>0
					}
				}
				if(!lIsPrepareOK){
					break
				}
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=new IGNTestMasterFieldTypeSingle(this,lNumDataCellColIndex,lStrProductGroupListName,lStrProjectFieldListFieldName,lStrProjectFieldListFieldMasterTypeKey,lNumProjectFieldListFieldMasterTypeNum,lStrProjectFieldListFieldMasterDefaultValue,lMapProjectFieldListFieldMasterPair)
				lIsPrepareOK=lIGNTestMasterFieldTypeSingle.getIsIGNTestMasterFieldTypeSingleValid()
				if(!lIsPrepareOK){
					break
				}
				this.listIGNTestMasterFieldTypeSingle.add(lIGNTestMasterFieldTypeSingle)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestMasterFieldTypeMultipleByExcelFile(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.testExcelFileWorkBook)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.testExcelFileWorkSheetTemplateOutput)){
			return lreturn
		}
		try{
			this.listIGNTestMasterFieldTypeMultiple=new ArrayList<IGNTestMasterFieldTypeMultiple>()
			Integer lNumExcelFileTemplateOutputColMax=this.numConfigExcelFileTemplateOutputColMax
			Integer lNumExcelFileTemplateOutputRowMax=this.numConfigExcelFileTemplateOutputRowMax
			Integer lNumExcelFileTemplateOutputColIndex=0
			Integer lNumExcelFileTemplateOutputRowIndex=0
			Boolean lIsPrepareOK=true
			for(Integer lIndexCol=lNumExcelFileTemplateOutputColIndex;lIndexCol<=lNumExcelFileTemplateOutputColMax;lIndexCol++){
				Integer lNumDataCellColIndex=lIndexCol+1
				String lStrProjectFieldListFieldName=''
				String lStrDataValue=''
				lNumExcelFileTemplateOutputRowIndex=0
				lStrDataValue=''
				try{
					lStrDataValue=ExcelKeywords.getCellValueByIndex(this.testExcelFileWorkSheetTemplateOutput,lNumExcelFileTemplateOutputRowIndex,lIndexCol)
				}catch(Exception ex){
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrDataValue)){
					break
				}
				lStrDataValue=lStrDataValue.trim()
				if(lStrDataValue.isBlank()){
					break
				}
				lStrProjectFieldListFieldName=lStrDataValue
				IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple=new IGNTestMasterFieldTypeMultiple(this,lNumDataCellColIndex,lStrProjectFieldListFieldName)
				lIsPrepareOK=lIGNTestMasterFieldTypeMultiple.getIsIGNTestMasterFieldTypeMultipleValid()
				if(!lIsPrepareOK){
					break
				}
				this.listIGNTestMasterFieldTypeMultiple.add(lIGNTestMasterFieldTypeMultiple)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
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
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestDataAdapter(IGNTestDataAdapter newParentIGNTestDataAdapter){
		//Do Nothing
		//this.parentIGNTestDataAdapter=newParentIGNTestDataAdapter
	}
	public String getStrIGNTestMasterFieldFactoryMessage(){
		try{
			return this.strIGNTestMasterFieldFactoryMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterFieldFactoryMessage(String newStrIGNTestMasterFieldFactoryMessage){
		//Do Nothing
		//this.strIGNTestMasterFieldFactoryMessage=newStrIGNTestMasterFieldFactoryMessage
	}
	public Boolean getIsIGNTestMasterFieldFactoryReady(){
		try{
			return this.isIGNTestMasterFieldFactoryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterFieldFactoryReady(Boolean newIsIGNTestMasterFieldFactoryReady){
		//Do Nothing
		//this.isIGNTestMasterFieldFactoryReady=newIsIGNTestMasterFieldFactoryReady
	}
	public Integer getNumConfigDataFileInputColMax(){
		try{
			return this.numConfigDataFileInputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileInputColMax(Integer newNumConfigDataFileInputColMax){
		//Do Nothing
		//this.numConfigDataFileInputColMax=newNumConfigDataFileInputColMax
	}
	public Integer getNumConfigDataFileInputRowMax(){
		try{
			return this.numConfigDataFileInputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileInputRowMax(Integer newNumConfigDataFileInputRowMax){
		//Do Nothing
		//this.numConfigDataFileInputRowMax=newNumConfigDataFileInputRowMax
	}
	public Integer getNumConfigDataFileOutputColMax(){
		try{
			return this.numConfigDataFileOutputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileOutputColMax(Integer newNumConfigDataFileOutputColMax){
		//Do Nothing
		//this.numConfigDataFileOutputColMax=newNumConfigDataFileOutputColMax
	}
	public Integer getNumConfigDataFileOutputRowMax(){
		try{
			return this.numConfigDataFileOutputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileOutputRowMax(Integer newNumConfigDataFileOutputRowMax){
		//Do Nothing
		//this.numConfigDataFileOutputRowMax=newNumConfigDataFileOutputRowMax
	}
	public Integer getNumConfigDataFileTemplateOutputColMax(){
		try{
			return this.numConfigDataFileTemplateOutputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileTemplateOutputColMax(Integer newNumConfigDataFileTemplateOutputColMax){
		//Do Nothing
		//this.numConfigDataFileTemplateOutputColMax=newNumConfigDataFileTemplateOutputColMax
	}
	public Integer getNumConfigDataFileTemplateOutputRowMax(){
		try{
			return this.numConfigDataFileTemplateOutputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigDataFileTemplateOutputRowMax(Integer newNumConfigDataFileTemplateOutputRowMax){
		//Do Nothing
		//this.numConfigDataFileTemplateOutputRowMax=newNumConfigDataFileTemplateOutputRowMax
	}
	public Integer getNumConfigExcelFileInputColMax(){
		try{
			return this.numConfigExcelFileInputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileInputColMax(Integer newNumConfigExcelFileInputColMax){
		//Do Nothing
		//this.numConfigExcelFileInputColMax=newNumConfigExcelFileInputColMax
	}
	public Integer getNumConfigExcelFileInputRowMax(){
		try{
			return this.numConfigExcelFileInputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileInputRowMax(Integer newNumConfigExcelFileInputRowMax){
		//Do Nothing
		//this.numConfigExcelFileInputRowMax=newNumConfigExcelFileInputRowMax
	}
	public Integer getNumConfigExcelFileOutputColMax(){
		try{
			return this.numConfigExcelFileOutputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileOutputColMax(Integer newNumConfigExcelFileOutputColMax){
		//Do Nothing
		//this.numConfigExcelFileOutputColMax=newNumConfigExcelFileOutputColMax
	}
	public Integer getNumConfigExcelFileOutputRowMax(){
		try{
			return this.numConfigExcelFileOutputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileOutputRowMax(Integer newNumConfigExcelFileOutputRowMax){
		//Do Nothing
		//this.numConfigExcelFileOutputRowMax=newNumConfigExcelFileOutputRowMax
	}
	public Integer getNumConfigExcelFileTemplateOutputColMax(){
		try{
			return this.numConfigExcelFileTemplateOutputColMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileTemplateOutputColMax(Integer newNumConfigExcelFileTemplateOutputColMax){
		//Do Nothing
		//this.numConfigExcelFileTemplateOutputColMax=newNumConfigExcelFileTemplateOutputColMax
	}
	public Integer getNumConfigExcelFileTemplateOutputRowMax(){
		try{
			return this.numConfigExcelFileTemplateOutputRowMax
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setNumConfigExcelFileTemplateOutputRowMax(Integer newNumConfigExcelFileTemplateOutputRowMax){
		//Do Nothing
		//this.numConfigExcelFileTemplateOutputRowMax=newNumConfigExcelFileTemplateOutputRowMax
	}
	public TestData getTestDataFileInput(){
		try{
			return this.testDataFileInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestDataFileInput(TestData newTestDataFileInput){
		//Do Nothing
		//this.testDataFileInput=newTestDataFileInput
	}
	public TestData getTestDataFileOutput(){
		try{
			return this.testDataFileOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestDataFileOutput(TestData newTestDataFileOutput){
		//Do Nothing
		//this.testDataFileOutput=newTestDataFileOutput
	}
	public TestData getTestDataFileTemplateOutput(){
		try{
			return this.testDataFileTemplateOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestDataFileTemplateOutput(TestData newTestDataFileTemplateOutput){
		//Do Nothing
		//this.testDataFileTemplateOutput=newTestDataFileTemplateOutput
	}
	public Workbook getTestExcelFileWorkBook(){
		try{
			return this.testExcelFileWorkBook
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestExcelFileWorkBook(Workbook newTestExcelFileWorkBook){
		//Do Nothing
		//this.testExcelFileWorkBook=newTestExcelFileWorkBook
	}
	public Sheet getTestExcelFileWorkSheetInput(){
		try{
			return this.testExcelFileWorkSheetInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestExcelFileWorkSheetInput(Sheet newTestExcelFileWorkSheetInput){
		//Do Nothing
		//this.testExcelFileWorkSheetInput=newTestExcelFileWorkSheetInput
	}
	public Sheet getTestExcelFileWorkSheetOutput(){
		try{
			return this.testExcelFileWorkSheetOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestExcelFileWorkSheetOutput(Sheet newTestExcelFileWorkSheetOutput){
		//Do Nothing
		//this.testExcelFileWorkSheetOutput=newTestExcelFileWorkSheetOutput
	}
	public Sheet getTestExcelFileWorkSheetTemplateOutput(){
		try{
			return this.testExcelFileWorkSheetTemplateOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setTestExcelFileWorkSheetTemplateOutput(Sheet newTestExcelFileWorkSheetTemplateOutput){
		//Do Nothing
		//this.testExcelFileWorkSheetTemplateOutput=newTestExcelFileWorkSheetTemplateOutput
	}
	public List<IGNTestMasterFieldTypeSingle> getListIGNTestMasterFieldTypeSingle(){
		try{
			return this.listIGNTestMasterFieldTypeSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestMasterFieldTypeSingle(List<IGNTestMasterFieldTypeSingle> newListIGNTestMasterFieldTypeSingle){
		//Do Nothing
		//this.listIGNTestMasterFieldTypeSingle=newListIGNTestMasterFieldTypeSingle
	}
	public List<IGNTestMasterFieldTypeMultiple> getListIGNTestMasterFieldTypeMultiple(){
		try{
			return this.listIGNTestMasterFieldTypeMultiple
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestMasterFieldTypeMultiple(List<IGNTestMasterFieldTypeMultiple> newListIGNTestMasterFieldTypeMultiple){
		//Do Nothing
		//this.listIGNTestMasterFieldTypeMultiple=newListIGNTestMasterFieldTypeMultiple
	}
	public IGNTestMasterFieldTypeSingle getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName(String strProjectFieldListFieldName){
		IGNTestMasterFieldTypeSingle lreturn=null
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProjectFieldListFieldName)){
			return lreturn
		}
		String lStrProjectFieldListFieldName=strProjectFieldListFieldName.trim()
		if(lStrProjectFieldListFieldName.isBlank()){
			return lreturn
		}
		try{
			for(IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle in this.listIGNTestMasterFieldTypeSingle){
				if(lIGNTestMasterFieldTypeSingle.getStrProjectFieldListFieldName().equals(lStrProjectFieldListFieldName)){
					lreturn=lIGNTestMasterFieldTypeSingle
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterFieldTypeSingle getIGNTestMasterFieldTypeSingleByProgramParameterName(String strProgramParameterName){
		IGNTestMasterFieldTypeSingle lreturn=null
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProgramParameterName)){
			return lreturn
		}
		String lStrProgramParameterName=strProgramParameterName.trim()
		if(lStrProgramParameterName.isBlank()){
			return lreturn
		}
		try{
			for(IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle in this.listIGNTestMasterFieldTypeSingle){
				if(lIGNTestMasterFieldTypeSingle.getStrProgramParameterName().equals(lStrProgramParameterName)){
					lreturn=lIGNTestMasterFieldTypeSingle
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterFieldTypeMultiple getIGNTestMasterFieldTypeMultipleByProjectFieldListFieldName(String strProjectFieldListFieldName){
		IGNTestMasterFieldTypeMultiple lreturn=null
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProjectFieldListFieldName)){
			return lreturn
		}
		String lStrProjectFieldListFieldName=strProjectFieldListFieldName.trim()
		if(lStrProjectFieldListFieldName.isBlank()){
			return lreturn
		}
		try{
			for(IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple in this.listIGNTestMasterFieldTypeMultiple){
				if(lIGNTestMasterFieldTypeMultiple.getStrProjectFieldListFieldName().equals(lStrProjectFieldListFieldName)){
					lreturn=lIGNTestMasterFieldTypeMultiple
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMasterFieldTypeMultiple getIGNTestMasterFieldTypeMultipleByProgramParameterName(String strProgramParameterName){
		IGNTestMasterFieldTypeMultiple lreturn=null
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProgramParameterName)){
			return lreturn
		}
		String lStrProgramParameterName=strProgramParameterName.trim()
		if(lStrProgramParameterName.isBlank()){
			return lreturn
		}
		try{
			for(IGNTestMasterFieldTypeMultiple lIGNTestMasterFieldTypeMultiple in this.listIGNTestMasterFieldTypeMultiple){
				if(lIGNTestMasterFieldTypeMultiple.getStrProgramParameterName().equals(lStrProgramParameterName)){
					lreturn=lIGNTestMasterFieldTypeMultiple
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Map<String,String> getMapProjectFieldListFieldMasterPairByProjectFieldListFieldName(String strProjectFieldListFieldName){
		Map<String,String> lreturn=[:]
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProjectFieldListFieldName)){
			return lreturn
		}
		String lStrProjectFieldListFieldName=strProjectFieldListFieldName.trim()
		if(lStrProjectFieldListFieldName.isBlank()){
			return lreturn
		}
		try{
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName(strProjectFieldListFieldName)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			lreturn=lIGNTestMasterFieldTypeSingle.getMapProjectFieldListFieldMasterPair()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Map<String,String> getMapProjectFieldListFieldMasterPairByProgramParameterName(String strProgramParameterName){
		Map<String,String> lreturn=[:]
		if(!this.isIGNTestMasterFieldFactoryReady){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strProgramParameterName)){
			return lreturn
		}
		String lStrProgramParameterName=strProgramParameterName.trim()
		if(lStrProgramParameterName.isBlank()){
			return lreturn
		}
		try{
			IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle=this.getIGNTestMasterFieldTypeSingleByProgramParameterName(strProgramParameterName)
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterFieldTypeSingle)){
				return lreturn
			}
			lreturn=lIGNTestMasterFieldTypeSingle.getMapProjectFieldListFieldMasterPair()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldFactoryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldFactoryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}