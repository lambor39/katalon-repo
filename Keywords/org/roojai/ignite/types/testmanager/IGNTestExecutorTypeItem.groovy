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
public class IGNTestExecutorTypeItem{
	private IGNTestExecutorFactory parentIGNTestExecutorFactory
	private String strIGNTestExecutorTypeItemMessage=''
	private Boolean isIGNTestExecutorTypeItemValid=false
	private Integer numCaseIndex=0
	private String strCaseIndex=''
	private IGNTestMasterCaseTypeMain ignTestMasterCaseTypeMain
	private String strTestCaseDataCurrentInputTestStoryGroupName=''
	private String strTestCaseDataCurrentInputTestStoryCaseText=''
	private String strTestCaseDataCurrentInputTestStoryCaseKey=''
	private String strTestCaseDataCurrentInputTestStoryCaseName=''
	private String strTestCaseDataCurrentInputTestStoryCaseDescription=''
	private String strTestCaseDataCurrentInputTestCaseToDo=''
	private String strTestCaseDataCurrentInputTestCaseConfigValid=''
	private String strTestCaseDataCurrentInputTestCaseReferCaseNumber=''
	private String strTestCaseDataCurrentInputTestCaseReferCaseValid=''
	private String strTestCaseDataCurrentInputTestCaseForceStartToDo=''
	private String strTestCaseDataCurrentInputTestCaseActualResult=''
	private String strTestCaseDataCurrentInputTestCaseResultMessage=''
	private String strTestCaseDataCurrentInputTestCaseStoryDetail=''
	private String strTestCaseDataCurrentInputTestCaseSfLoginAccountName=''
	private String strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword=''
	private String strTestCaseDataCurrentOutputTestStoryGroupName=''
	private String strTestCaseDataCurrentOutputTestStoryCaseText=''
	private String strTestCaseDataCurrentOutputTestStoryCaseKey=''
	private String strTestCaseDataCurrentOutputTestStoryCaseName=''
	private String strTestCaseDataCurrentOutputTestStoryCaseDescription=''
	private String strTestCaseDataCurrentOutputTestCaseToDo=''
	private String strTestCaseDataCurrentOutputTestCaseConfigValid=''
	private String strTestCaseDataCurrentOutputTestCaseReferCaseNumber=''
	private String strTestCaseDataCurrentOutputTestCaseReferCaseValid=''
	private String strTestCaseDataCurrentOutputTestCaseForceStartToDo=''
	private String strTestCaseDataCurrentOutputTestCaseActualResult=''
	private String strTestCaseDataCurrentOutputTestCaseResultMessage=''
	private String strTestCaseDataCurrentOutputTestCaseStoryDetail=''
	private String strTestCaseDataCurrentOutputTestCaseSfLoginAccountName=''
	private String strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword=''
	private String strTestStoryGroupName=''
	private Boolean isTestCaseRefer=false
	private Boolean isTestCaseExecuted=false
	private Integer numTestCaseDataCurrentStoreTestStoryCaseKey=0
	private Boolean isTestCaseDataCurrentStoreTestCaseToDo=false
	private Boolean isTestCaseDataCurrentStoreTestCaseConfigValid=false
	private Boolean isTestCaseDataCurrentStoreTestCaseForceStartToDo=false
	private Boolean isTestCaseDataCurrentStoreTestCaseActualResult=false
	private String strTestCaseDataCurrentStoreTestCaseResultMessage=''
	private String strTestCaseDataCurrentStoreTestCaseStoryDetail=''
	private String strTestCaseDataCurrentStoreTestCaseDateTimeStart=''
	private String strTestCaseDataCurrentStoreTestCaseDateTimeStop=''
	private Boolean isTestCaseDataCurrentStoreTestStoryAfterSingleExecuted=false
	private Boolean isTestCaseDataCurrentStoreTestStoryAfterSingleResult=false
	private String strTestCaseDataCurrentStoreTestStoryAfterSingleDetail=''
	private Boolean isTestCaseDataCurrentStoreTestStoryAfterBatchExecuted=false
	private Boolean isTestCaseDataCurrentStoreTestStoryAfterBatchResult=false
	private String strTestCaseDataCurrentStoreTestStoryAfterBatchDetail=''
	private IGNTestLibUtilitySuper ignTestLibUtilitySuper
	public IGNTestExecutorTypeItem(IGNTestExecutorFactory ignTestExecutorFactory,Integer numInitCaseIndex){
		super()
		try{
			this.parentIGNTestExecutorFactory=ignTestExecutorFactory
			this.strIGNTestExecutorTypeItemMessage=''
			this.numCaseIndex=numInitCaseIndex
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestExecutorFactory)){
				this.initIGNTestExecutorTypeItem()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestExecutorTypeItem(){
		try{
			this.isIGNTestExecutorTypeItemValid=false
			Boolean lIsIGNTestExecutorTypeItemValid=true
			this.strCaseIndex=String.format('%04d',this.numCaseIndex)
			lIsIGNTestExecutorTypeItemValid=lIsIGNTestExecutorTypeItemValid&&(this.numCaseIndex>0)
			lIsIGNTestExecutorTypeItemValid=lIsIGNTestExecutorTypeItemValid&&(this.numCaseIndex<=9999)
			lIsIGNTestExecutorTypeItemValid=lIsIGNTestExecutorTypeItemValid&&(this.strCaseIndex.length()>0)
			if(lIsIGNTestExecutorTypeItemValid){
				lIsIGNTestExecutorTypeItemValid=this.prepareIGNTestMasterCaseTypeMain()
			}
			if(lIsIGNTestExecutorTypeItemValid){
				lIsIGNTestExecutorTypeItemValid=this.proceedTestCaseDataCurrentReadInputOutput()
			}
			if(lIsIGNTestExecutorTypeItemValid){
				lIsIGNTestExecutorTypeItemValid=this.prepareIGNTestLibUtilitySuper()
			}
			if(lIsIGNTestExecutorTypeItemValid){
				lIsIGNTestExecutorTypeItemValid=this.proceedTestCaseDataCurrentWriteOutput()
			}
			this.isIGNTestExecutorTypeItemValid=lIsIGNTestExecutorTypeItemValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareIGNTestMasterCaseTypeMain(){
		Boolean lreturn=false
		if(!this.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager().getIGNTestDataAdapter().getIsIGNTestDataAdapterReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			this.ignTestMasterCaseTypeMain=this.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager().getIGNTestDataAdapter().getIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(this.numCaseIndex)
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.ignTestMasterCaseTypeMain))
			if(lIsPrepareOK){
				if(this.ignTestMasterCaseTypeMain.getIsCaseRefer()){
					lIsPrepareOK=lIsPrepareOK&&(this.ignTestMasterCaseTypeMain.refreshMapCaseDataReferOutput())
				}
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean proceedTestCaseDataCurrentReadInput(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestMasterCaseTypeMain)){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Map<String,String> lMapCaseDataCurrentInput=this.ignTestMasterCaseTypeMain.MapCaseDataCurrentInput
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapCaseDataCurrentInput)){
				return lreturn
			}
			this.strTestCaseDataCurrentInputTestStoryGroupName=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListName')
			this.strTestCaseDataCurrentInputTestStoryCaseText=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldText')
			this.strTestCaseDataCurrentInputTestStoryCaseKey=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldKey')
			this.strTestCaseDataCurrentInputTestStoryCaseName=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldValue')
			this.strTestCaseDataCurrentInputTestStoryCaseDescription=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductStoryUserDescription')
			this.strTestCaseDataCurrentInputTestCaseToDo=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldTestCaseToDo')
			this.strTestCaseDataCurrentInputTestCaseConfigValid=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid')
			this.strTestCaseDataCurrentInputTestCaseReferCaseNumber=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldReferCaseNumber')
			this.strTestCaseDataCurrentInputTestCaseReferCaseValid=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldReferCaseValid')
			this.strTestCaseDataCurrentInputTestCaseForceStartToDo=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldForceStartToDo')
			this.strTestCaseDataCurrentInputTestCaseActualResult=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldActualResult')
			this.strTestCaseDataCurrentInputTestCaseResultMessage=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldResultMessage')
			this.strTestCaseDataCurrentInputTestCaseStoryDetail=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage01MainFieldProductStoryTextDetail')
			this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountName')
			this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword=lMapCaseDataCurrentInput.get('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountPassword')
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryGroupName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryCaseText))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryCaseKey))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryCaseName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryCaseDescription))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseToDo))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseConfigValid))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseReferCaseNumber))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseReferCaseValid))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseForceStartToDo))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseActualResult))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseResultMessage))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseStoryDetail))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword))
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean proceedTestCaseDataCurrentReadOutput(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestMasterCaseTypeMain)){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Map<String,String> lMapCaseDataCurrentOutput=this.ignTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapCaseDataCurrentOutput)){
				return lreturn
			}
			this.strTestCaseDataCurrentOutputTestStoryGroupName=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListName')
			this.strTestCaseDataCurrentOutputTestStoryCaseText=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldText')
			this.strTestCaseDataCurrentOutputTestStoryCaseKey=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldKey')
			this.strTestCaseDataCurrentOutputTestStoryCaseName=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldValue')
			this.strTestCaseDataCurrentOutputTestStoryCaseDescription=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductStoryUserDescription')
			this.strTestCaseDataCurrentOutputTestCaseToDo=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldTestCaseToDo')
			this.strTestCaseDataCurrentOutputTestCaseConfigValid=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid')
			this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldReferCaseNumber')
			this.strTestCaseDataCurrentOutputTestCaseReferCaseValid=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldReferCaseValid')
			this.strTestCaseDataCurrentOutputTestCaseForceStartToDo=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldForceStartToDo')
			this.strTestCaseDataCurrentOutputTestCaseActualResult=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldActualResult')
			this.strTestCaseDataCurrentOutputTestCaseResultMessage=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldResultMessage')
			this.strTestCaseDataCurrentOutputTestCaseStoryDetail=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage01MainFieldProductStoryTextDetail')
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountName')
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword=lMapCaseDataCurrentOutput.get('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountPassword')
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentInputTestStoryGroupName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestStoryCaseText))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestStoryCaseKey))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestStoryCaseName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestStoryCaseDescription))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseToDo))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseConfigValid))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseReferCaseValid))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseForceStartToDo))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseActualResult))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseResultMessage))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseStoryDetail))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName))
			lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword))
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean proceedTestCaseDataCurrentReadInputOutput(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestMasterCaseTypeMain)){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			lIsPrepareOK=lIsPrepareOK&&(this.proceedTestCaseDataCurrentReadInput())
			lIsPrepareOK=lIsPrepareOK&&(this.proceedTestCaseDataCurrentReadOutput())
			this.strTestCaseDataCurrentInputTestStoryGroupName=this.strTestCaseDataCurrentInputTestStoryGroupName.trim()
			this.strTestCaseDataCurrentInputTestStoryCaseText=this.strTestCaseDataCurrentInputTestStoryCaseText.trim()
			this.strTestCaseDataCurrentInputTestStoryCaseKey=this.strTestCaseDataCurrentInputTestStoryCaseKey.trim()
			this.strTestCaseDataCurrentInputTestStoryCaseName=this.strTestCaseDataCurrentInputTestStoryCaseName.trim()
			this.strTestCaseDataCurrentInputTestStoryCaseDescription=this.strTestCaseDataCurrentInputTestStoryCaseDescription.trim()
			this.strTestCaseDataCurrentInputTestCaseToDo=this.strTestCaseDataCurrentInputTestCaseToDo.trim()
			this.strTestCaseDataCurrentInputTestCaseConfigValid=this.strTestCaseDataCurrentInputTestCaseConfigValid.trim()
			this.strTestCaseDataCurrentInputTestCaseReferCaseNumber=this.strTestCaseDataCurrentInputTestCaseReferCaseNumber.trim()
			this.strTestCaseDataCurrentInputTestCaseReferCaseValid=this.strTestCaseDataCurrentInputTestCaseReferCaseValid.trim()
			this.strTestCaseDataCurrentOutputTestCaseForceStartToDo=this.strTestCaseDataCurrentOutputTestCaseForceStartToDo.trim()
			this.strTestCaseDataCurrentInputTestCaseActualResult=this.strTestCaseDataCurrentInputTestCaseActualResult.trim()
			this.strTestCaseDataCurrentInputTestCaseResultMessage=this.strTestCaseDataCurrentInputTestCaseResultMessage.trim()
			this.strTestCaseDataCurrentInputTestCaseStoryDetail=this.strTestCaseDataCurrentInputTestCaseStoryDetail.trim()
			this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName=this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName.trim()
			this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword=this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword.trim()
			this.strTestCaseDataCurrentOutputTestStoryGroupName=this.strTestCaseDataCurrentOutputTestStoryGroupName.trim()
			this.strTestCaseDataCurrentOutputTestStoryCaseText=this.strTestCaseDataCurrentOutputTestStoryCaseText.trim()
			this.strTestCaseDataCurrentOutputTestStoryCaseKey=this.strTestCaseDataCurrentOutputTestStoryCaseKey.trim()
			this.strTestCaseDataCurrentOutputTestStoryCaseName=this.strTestCaseDataCurrentOutputTestStoryCaseName.trim()
			this.strTestCaseDataCurrentOutputTestStoryCaseDescription=this.strTestCaseDataCurrentOutputTestStoryCaseDescription.trim()
			this.strTestCaseDataCurrentOutputTestCaseToDo=this.strTestCaseDataCurrentOutputTestCaseToDo.trim()
			this.strTestCaseDataCurrentOutputTestCaseConfigValid=this.strTestCaseDataCurrentOutputTestCaseConfigValid.trim()
			this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber=this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber.trim()
			this.strTestCaseDataCurrentOutputTestCaseReferCaseValid=this.strTestCaseDataCurrentOutputTestCaseReferCaseValid.trim()
			this.strTestCaseDataCurrentOutputTestCaseForceStartToDo=this.strTestCaseDataCurrentOutputTestCaseForceStartToDo.trim()
			this.strTestCaseDataCurrentOutputTestCaseActualResult=this.strTestCaseDataCurrentOutputTestCaseActualResult.trim()
			this.strTestCaseDataCurrentOutputTestCaseResultMessage=this.strTestCaseDataCurrentOutputTestCaseResultMessage.trim()
			this.strTestCaseDataCurrentOutputTestCaseStoryDetail=this.strTestCaseDataCurrentOutputTestCaseStoryDetail.trim()
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName=this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName.trim()
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword=this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword.trim()
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestStoryGroupName.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestStoryCaseText.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestStoryCaseKey.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestStoryCaseName.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestStoryCaseDescription.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseToDo.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseConfigValid.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseReferCaseNumber.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseReferCaseValid.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseForceStartToDo.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseActualResult.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseResultMessage.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseStoryDetail.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword.length()>0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestStoryGroupName.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestStoryCaseText.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestStoryCaseKey.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestStoryCaseName.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestStoryCaseDescription.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseToDo.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseConfigValid.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseReferCaseValid.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseForceStartToDo.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseActualResult.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseResultMessage.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseStoryDetail.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName.length()>=0)
			lIsPrepareOK=lIsPrepareOK&&(this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword.length()>=0)
			if(!lIsPrepareOK){
				return lreturn
			}
			this.strTestStoryGroupName=this.strTestCaseDataCurrentInputTestStoryGroupName.replaceAll('_','').trim()
			this.isTestCaseRefer=this.ignTestMasterCaseTypeMain.getIsCaseRefer()
			this.strTestCaseDataCurrentOutputTestStoryGroupName=this.strTestCaseDataCurrentInputTestStoryGroupName
			this.strTestCaseDataCurrentOutputTestStoryCaseText=this.strTestCaseDataCurrentInputTestStoryCaseText
			this.numTestCaseDataCurrentStoreTestStoryCaseKey=IGNUemaHelper.convertStringToInteger(this.strTestCaseDataCurrentInputTestStoryCaseKey,0)
			if(this.numTestCaseDataCurrentStoreTestStoryCaseKey<=0){
				return lreturn
			}
			this.strTestCaseDataCurrentOutputTestStoryCaseKey=String.format('%04d',this.numTestCaseDataCurrentStoreTestStoryCaseKey)
			if(this.strTestCaseDataCurrentOutputTestStoryCaseKey.length()<=0){
				return lreturn
			}
			this.isTestCaseDataCurrentStoreTestCaseConfigValid=IGNUemaHelper.convertStringToBoolean(this.strTestCaseDataCurrentInputTestCaseConfigValid)
			Integer lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber=0
			Boolean lIsTestCaseDataCurrentOutputTestCaseReferCaseValid=false
			if(!this.isTestCaseRefer){
				this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber=''
				this.strTestCaseDataCurrentOutputTestCaseReferCaseValid=''
			}else{
				lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber=this.ignTestMasterCaseTypeMain.getNumCaseRefer()
				if((lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber>0)&&(lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber<this.numCaseIndex)){
					IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=this.ignTestMasterCaseTypeMain.getParentIGNTestMasterCaseFactory().getIGNTestMasterCaseTypeMainByCaseNumber(lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber)
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNTestMasterCaseTypeMain)){
						lIsTestCaseDataCurrentOutputTestCaseReferCaseValid=lIGNTestMasterCaseTypeMain.getIsIGNTestMasterCaseTypeMainValid()
					}
				}
				this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber=String.format('%04d',lNumTestCaseDataCurrentOutputTestCaseReferCaseNumber)
				this.strTestCaseDataCurrentOutputTestCaseReferCaseValid=IGNUemaHelper.convertBooleanToYesNoString(lIsTestCaseDataCurrentOutputTestCaseReferCaseValid)
				this.isTestCaseDataCurrentStoreTestCaseConfigValid=this.isTestCaseDataCurrentStoreTestCaseConfigValid&&lIsTestCaseDataCurrentOutputTestCaseReferCaseValid
			}
			this.strTestCaseDataCurrentOutputTestCaseConfigValid=IGNUemaHelper.convertBooleanToYesNoString(this.isTestCaseDataCurrentStoreTestCaseConfigValid)
			this.isTestCaseDataCurrentStoreTestCaseForceStartToDo=IGNUemaHelper.convertStringToBoolean(this.strTestCaseDataCurrentInputTestCaseForceStartToDo)
			this.strTestCaseDataCurrentOutputTestCaseForceStartToDo=IGNUemaHelper.convertBooleanToYesNoString(this.isTestCaseDataCurrentStoreTestCaseForceStartToDo)
			this.strTestCaseDataCurrentOutputTestStoryCaseName=this.strTestCaseDataCurrentInputTestStoryCaseName
			this.strTestCaseDataCurrentOutputTestStoryCaseDescription=this.strTestCaseDataCurrentInputTestStoryCaseDescription
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName=this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName
			this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword=this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword
			Boolean lIsTestCaseDataCurrentStoreTestCaseToDo=IGNUemaHelper.convertStringToBoolean(this.strTestCaseDataCurrentInputTestCaseToDo)
			lIsTestCaseDataCurrentStoreTestCaseToDo=lIsTestCaseDataCurrentStoreTestCaseToDo&&this.isTestCaseDataCurrentStoreTestCaseConfigValid
			this.isTestCaseDataCurrentStoreTestCaseToDo=lIsTestCaseDataCurrentStoreTestCaseToDo
			this.strTestCaseDataCurrentOutputTestCaseToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsTestCaseDataCurrentStoreTestCaseToDo)
			if(!IGNUemaHelper.checkObjectEmptyOfString(this.strTestCaseDataCurrentOutputTestCaseActualResult)){
				this.isTestCaseExecuted=true
				Boolean lIsTestCaseDataCurrentStoreTestCaseActualResult=IGNUemaHelper.convertStringToBoolean(this.strTestCaseDataCurrentOutputTestCaseActualResult)
				this.isTestCaseDataCurrentStoreTestCaseActualResult=lIsTestCaseDataCurrentStoreTestCaseActualResult
				this.strTestCaseDataCurrentOutputTestCaseActualResult=IGNUemaHelper.convertBooleanToString(this.isTestCaseDataCurrentStoreTestCaseActualResult)
				this.strTestCaseDataCurrentStoreTestCaseResultMessage=this.strTestCaseDataCurrentOutputTestCaseResultMessage
				this.strTestCaseDataCurrentStoreTestCaseStoryDetail=this.strTestCaseDataCurrentOutputTestCaseStoryDetail
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean proceedTestCaseDataCurrentWriteOutput(){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.ignTestMasterCaseTypeMain)){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			Map<String,String> lMapCaseDataCurrentOutput=this.ignTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapCaseDataCurrentOutput)){
				return lreturn
			}
			if(this.isTestCaseExecuted){
				this.strTestCaseDataCurrentOutputTestCaseActualResult=IGNUemaHelper.convertBooleanToString(this.isTestCaseDataCurrentStoreTestCaseActualResult)
				this.strTestCaseDataCurrentOutputTestCaseResultMessage=this.strTestCaseDataCurrentStoreTestCaseResultMessage.trim()
				this.strTestCaseDataCurrentOutputTestCaseStoryDetail=this.strTestCaseDataCurrentStoreTestCaseStoryDetail.trim()
			}
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListName',this.strTestCaseDataCurrentOutputTestStoryGroupName)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldText',this.strTestCaseDataCurrentOutputTestStoryCaseText)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldKey',this.strTestCaseDataCurrentOutputTestStoryCaseKey)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductGroupListFieldValue',this.strTestCaseDataCurrentOutputTestStoryCaseName)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductStoryUserDescription',this.strTestCaseDataCurrentOutputTestStoryCaseDescription)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldTestCaseToDo',this.strTestCaseDataCurrentOutputTestCaseToDo)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldTestCaseConfigValid',this.strTestCaseDataCurrentOutputTestCaseConfigValid)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldReferCaseNumber',this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldReferCaseValid',this.strTestCaseDataCurrentOutputTestCaseReferCaseValid)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldForceStartToDo',this.strTestCaseDataCurrentOutputTestCaseForceStartToDo)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldActualResult',this.strTestCaseDataCurrentOutputTestCaseActualResult)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldResultMessage',this.strTestCaseDataCurrentOutputTestCaseResultMessage)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage01MainFieldProductStoryTextDetail',this.strTestCaseDataCurrentOutputTestCaseStoryDetail)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountName',this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName)
			lMapCaseDataCurrentOutput.put('GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountPassword',this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword)
			lIsPrepareOK=lIsPrepareOK&&(this.ignTestMasterCaseTypeMain.applyMapCaseDataCurrentOutputChanged())
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareIGNTestLibUtilitySuper(){
		Boolean lreturn=false
		if(!this.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager().getIGNTestLibConfigRegister().getIsIGNTestLibConfigRegisterReady()){
			return lreturn
		}
		try{
			Boolean lIsPrepareOK=true
			IGNTestLibConfigRegister lIGNTestLibConfigRegister=this.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager().getIGNTestLibConfigRegister()
			if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestLibConfigRegister)){
				return lreturn
			}
			if(this.isTestCaseDataCurrentStoreTestCaseToDo){
				Boolean lIsTestCaseDataCurrentStoreTestCaseToDo=lIGNTestLibConfigRegister.checkTestStoryKeyExist(this.numTestCaseDataCurrentStoreTestStoryCaseKey)
				if(!lIsTestCaseDataCurrentStoreTestCaseToDo){
					this.isTestCaseDataCurrentStoreTestCaseToDo=lIsTestCaseDataCurrentStoreTestCaseToDo
				}else{
					if(this.isTestCaseRefer){
						IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorFactory.getIGNTestExecutorTypeItemStoreByCaseNumber(this.ignTestMasterCaseTypeMain.getNumCaseRefer())
						if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestExecutorTypeItem)){
							return lreturn
						}
						if(!lIGNTestExecutorTypeItem.getIsTestCaseDataCurrentStoreTestCaseToDo()){
							if(!lIGNTestExecutorTypeItem.getIsTestCaseExecuted()){
								lIsTestCaseDataCurrentStoreTestCaseToDo=false
							}else{
								lIsTestCaseDataCurrentStoreTestCaseToDo=lIGNTestExecutorTypeItem.getIsTestCaseDataCurrentStoreTestCaseActualResult()
							}
							this.isTestCaseDataCurrentStoreTestCaseToDo=lIsTestCaseDataCurrentStoreTestCaseToDo
						}
					}
				}
			}
			this.strTestCaseDataCurrentOutputTestCaseToDo=IGNUemaHelper.convertBooleanToYesNoString(this.isTestCaseDataCurrentStoreTestCaseToDo)
			if(!this.isTestCaseDataCurrentStoreTestCaseToDo){
				this.ignTestLibUtilitySuper=null
			}else{
				this.ignTestLibUtilitySuper=this.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager().getIGNTestLibConfigRegister().getIGNTestLibUtilitySuperInstance(this,this.numTestCaseDataCurrentStoreTestStoryCaseKey)
				lIsPrepareOK=lIsPrepareOK&&(!IGNUemaHelper.checkObjectNullOfObject(this.ignTestLibUtilitySuper))
				if(lIsPrepareOK){
					lIsPrepareOK=lIsPrepareOK&&(this.ignTestLibUtilitySuper.getIsIGNTestLibUtilitySuperValid())
				}
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestExecutorFactory getParentIGNTestExecutorFactory(){
		try{
			return this.parentIGNTestExecutorFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestExecutorFactory(IGNTestExecutorFactory newParentIGNTestExecutorFactory){
		//Do Nothing
		//this.parentIGNTestExecutorFactory=newParentIGNTestExecutorFactory
	}
	public String getStrIGNTestExecutorTypeItemMessage(){
		try{
			return this.strIGNTestExecutorTypeItemMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorTypeItemMessage(String newStrIGNTestExecutorTypeItemMessage){
		//Do Nothing
		//this.strIGNTestExecutorTypeItemMessage=newStrIGNTestExecutorTypeItemMessage
	}
	public Boolean getIsIGNTestExecutorTypeItemValid(){
		try{
			return this.isIGNTestExecutorTypeItemValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestExecutorTypeItemValid(Boolean newIsIGNTestExecutorTypeItemValid){
		//Do Nothing
		//this.isIGNTestExecutorTypeItemValid=newIsIGNTestExecutorTypeItemValid
	}
	public Integer getNumCaseIndex(){
		try{
			return this.numCaseIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
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
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrCaseIndex(String newStrCaseIndex){
		//Do Nothing
		//this.strCaseIndex=newStrCaseIndex
	}
	public IGNTestMasterCaseTypeMain getIGNTestMasterCaseTypeMain(){
		try{
			return this.ignTestMasterCaseTypeMain
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestMasterCaseTypeMain(IGNTestMasterCaseTypeMain newIGNTestMasterCaseTypeMain){
		//Do Nothing
		//this.ignTestMasterCaseTypeMain=newIGNTestMasterCaseTypeMain
	}
	public String getStrTestCaseDataCurrentInputTestStoryGroupName(){
		try{
			return this.strTestCaseDataCurrentInputTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestStoryGroupName(String newStrTestCaseDataCurrentInputTestStoryGroupName){
		try{
			//this.strTestCaseDataCurrentInputTestStoryGroupName=newStrTestCaseDataCurrentInputTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestStoryCaseText(){
		try{
			return this.strTestCaseDataCurrentInputTestStoryCaseText
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestStoryCaseText(String newStrTestCaseDataCurrentInputTestStoryCaseText){
		try{
			//this.strTestCaseDataCurrentInputTestStoryCaseText=newStrTestCaseDataCurrentInputTestStoryCaseText
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestStoryCaseKey(){
		try{
			return this.strTestCaseDataCurrentInputTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestStoryCaseKey(String newStrTestCaseDataCurrentInputTestStoryCaseKey){
		try{
			//this.strTestCaseDataCurrentInputTestStoryCaseKey=newStrTestCaseDataCurrentInputTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestStoryCaseName(){
		try{
			return this.strTestCaseDataCurrentInputTestStoryCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestStoryCaseName(String newStrTestCaseDataCurrentInputTestStoryCaseName){
		try{
			//this.strTestCaseDataCurrentInputTestStoryCaseName=newStrTestCaseDataCurrentInputTestStoryCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestStoryCaseDescription(){
		try{
			return this.strTestCaseDataCurrentInputTestStoryCaseDescription
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestStoryCaseDescription(String newStrTestCaseDataCurrentInputTestStoryCaseDescription){
		try{
			//this.strTestCaseDataCurrentInputTestStoryCaseDescription=newStrTestCaseDataCurrentInputTestStoryCaseDescription
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseToDo(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseToDo(String newStrTestCaseDataCurrentInputTestCaseToDo){
		try{
			//this.strTestCaseDataCurrentInputTestCaseToDo=newStrTestCaseDataCurrentInputTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseConfigValid(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseConfigValid(String newStrTestCaseDataCurrentInputTestCaseConfigValid){
		try{
			//this.strTestCaseDataCurrentInputTestCaseConfigValid=newStrTestCaseDataCurrentInputTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseReferCaseNumber(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseReferCaseNumber
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseReferCaseNumber(String newStrTestCaseDataCurrentInputTestCaseReferCaseNumber){
		try{
			//this.strTestCaseDataCurrentInputTestCaseReferCaseNumber=newStrTestCaseDataCurrentInputTestCaseReferCaseNumber
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseReferCaseValid(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseReferCaseValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseReferCaseValid(String newStrTestCaseDataCurrentInputTestCaseReferCaseValid){
		try{
			//this.strTestCaseDataCurrentInputTestCaseReferCaseValid=newStrTestCaseDataCurrentInputTestCaseReferCaseValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseForceStartToDo(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseForceStartToDo(String newStrTestCaseDataCurrentInputTestCaseForceStartToDo){
		try{
			//this.strTestCaseDataCurrentInputTestCaseForceStartToDo=newStrTestCaseDataCurrentInputTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseActualResult(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseActualResult(String newStrTestCaseDataCurrentInputTestCaseActualResult){
		try{
			//this.strTestCaseDataCurrentInputTestCaseActualResult=newStrTestCaseDataCurrentInputTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseResultMessage(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseResultMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseResultMessage(String newStrTestCaseDataCurrentInputTestCaseResultMessage){
		try{
			//this.strTestCaseDataCurrentInputTestCaseResultMessage=newStrTestCaseDataCurrentInputTestCaseResultMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseStoryDetail(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseStoryDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseStoryDetail(String newStrTestCaseDataCurrentInputTestCaseStoryDetail){
		try{
			//this.strTestCaseDataCurrentInputTestCaseStoryDetail=newStrTestCaseDataCurrentInputTestCaseStoryDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseSfLoginAccountName(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseSfLoginAccountName(String newStrTestCaseDataCurrentInputTestCaseSfLoginAccountName){
		try{
			//this.strTestCaseDataCurrentInputTestCaseSfLoginAccountName=newStrTestCaseDataCurrentInputTestCaseSfLoginAccountName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentInputTestCaseSfLoginAccountPassword(){
		try{
			return this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentInputTestCaseSfLoginAccountPassword(String newStrTestCaseDataCurrentInputTestCaseSfLoginAccountPassword){
		try{
			//this.strTestCaseDataCurrentInputTestCaseSfLoginAccountPassword=newStrTestCaseDataCurrentInputTestCaseSfLoginAccountPassword
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestStoryGroupName(){
		try{
			return this.strTestCaseDataCurrentOutputTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestStoryGroupName(String newStrTestCaseDataCurrentOutputTestStoryGroupName){
		try{
			//this.strTestCaseDataCurrentOutputTestStoryGroupName=newStrTestCaseDataCurrentOutputTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestStoryCaseText(){
		try{
			return this.strTestCaseDataCurrentOutputTestStoryCaseText
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestStoryCaseText(String newStrTestCaseDataCurrentOutputTestStoryCaseText){
		try{
			//this.strTestCaseDataCurrentOutputTestStoryCaseText=newStrTestCaseDataCurrentOutputTestStoryCaseText
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestStoryCaseKey(){
		try{
			return this.strTestCaseDataCurrentOutputTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestStoryCaseKey(String newStrTestCaseDataCurrentOutputTestStoryCaseKey){
		try{
			//this.strTestCaseDataCurrentOutputTestStoryCaseKey=newStrTestCaseDataCurrentOutputTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestStoryCaseName(){
		try{
			return this.strTestCaseDataCurrentOutputTestStoryCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestStoryCaseName(String newStrTestCaseDataCurrentOutputTestStoryCaseName){
		try{
			//this.strTestCaseDataCurrentOutputTestStoryCaseName=newStrTestCaseDataCurrentOutputTestStoryCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestStoryCaseDescription(){
		try{
			return this.strTestCaseDataCurrentOutputTestStoryCaseDescription
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestStoryCaseDescription(String newStrTestCaseDataCurrentOutputTestStoryCaseDescription){
		try{
			//this.strTestCaseDataCurrentOutputTestStoryCaseDescription=newStrTestCaseDataCurrentOutputTestStoryCaseDescription
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseToDo(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseToDo(String newStrTestCaseDataCurrentOutputTestCaseToDo){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseToDo=newStrTestCaseDataCurrentOutputTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseConfigValid(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseConfigValid(String newStrTestCaseDataCurrentOutputTestCaseConfigValid){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseConfigValid=newStrTestCaseDataCurrentOutputTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseReferCaseNumber(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseReferCaseNumber(String newStrTestCaseDataCurrentOutputTestCaseReferCaseNumber){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseReferCaseNumber=newStrTestCaseDataCurrentOutputTestCaseReferCaseNumber
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseReferCaseValid(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseReferCaseValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseReferCaseValid(String newStrTestCaseDataCurrentOutputTestCaseReferCaseValid){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseReferCaseValid=newStrTestCaseDataCurrentOutputTestCaseReferCaseValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseForceStartToDo(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseForceStartToDo(String newStrTestCaseDataCurrentOutputTestCaseForceStartToDo){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseForceStartToDo=newStrTestCaseDataCurrentOutputTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseActualResult(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseActualResult(String newStrTestCaseDataCurrentOutputTestCaseActualResult){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseActualResult=newStrTestCaseDataCurrentOutputTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseResultMessage(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseResultMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseResultMessage(String newStrTestCaseDataCurrentOutputTestCaseResultMessage){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseResultMessage=newStrTestCaseDataCurrentOutputTestCaseResultMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseStoryDetail(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseStoryDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseStoryDetail(String newStrTestCaseDataCurrentOutputTestCaseStoryDetail){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseStoryDetail=newStrTestCaseDataCurrentOutputTestCaseStoryDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseSfLoginAccountName(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseSfLoginAccountName(String newStrTestCaseDataCurrentOutputTestCaseSfLoginAccountName){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountName=newStrTestCaseDataCurrentOutputTestCaseSfLoginAccountName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword(){
		try{
			return this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword(String newStrTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword){
		try{
			//this.strTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword=newStrTestCaseDataCurrentOutputTestCaseSfLoginAccountPassword
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestStoryGroupName(){
		try{
			return this.strTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestStoryGroupName(String newStrTestStoryGroupName){
		try{
			this.strTestStoryGroupName=newStrTestStoryGroupName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseRefer(){
		try{
			return this.isTestCaseRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseRefer(Boolean newIsTestCaseRefer){
		try{
			//this.isTestCaseRefer=newIsTestCaseRefer
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseExecuted(){
		try{
			return this.isTestCaseExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseExecuted(Boolean newIsTestCaseExecuted){
		try{
			//this.isTestCaseExecuted=newIsTestCaseExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Integer getNumTestCaseDataCurrentStoreTestStoryCaseKey(){
		try{
			return this.numTestCaseDataCurrentStoreTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setNumTestCaseDataCurrentStoreTestStoryCaseKey(Integer newNumTestCaseDataCurrentStoreTestStoryCaseKey){
		try{
			//this.numTestCaseDataCurrentStoreTestStoryCaseKey=newNumTestCaseDataCurrentStoreTestStoryCaseKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestCaseToDo(){
		try{
			return this.isTestCaseDataCurrentStoreTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestCaseToDo(Boolean newIsTestCaseDataCurrentStoreTestCaseToDo){
		try{
			//this.isTestCaseDataCurrentStoreTestCaseToDo=newIsTestCaseDataCurrentStoreTestCaseToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestCaseConfigValid(){
		try{
			return this.isTestCaseDataCurrentStoreTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestCaseConfigValid(Boolean newIsTestCaseDataCurrentStoreTestCaseConfigValid){
		try{
			//this.isTestCaseDataCurrentStoreTestCaseConfigValid=newIsTestCaseDataCurrentStoreTestCaseConfigValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestCaseForceStartToDo(){
		try{
			return this.isTestCaseDataCurrentStoreTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestCaseForceStartToDo(Boolean newIsTestCaseDataCurrentStoreTestCaseForceStartToDo){
		try{
			this.isTestCaseDataCurrentStoreTestCaseForceStartToDo=newIsTestCaseDataCurrentStoreTestCaseForceStartToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestCaseActualResult(){
		try{
			return this.isTestCaseDataCurrentStoreTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestCaseActualResult(Boolean newIsTestCaseDataCurrentStoreTestCaseActualResult){
		try{
			this.isTestCaseDataCurrentStoreTestCaseActualResult=newIsTestCaseDataCurrentStoreTestCaseActualResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestCaseResultMessage(){
		try{
			return this.strTestCaseDataCurrentStoreTestCaseResultMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestCaseResultMessage(String newStrTestCaseDataCurrentStoreTestCaseResultMessage){
		try{
			this.strTestCaseDataCurrentStoreTestCaseResultMessage=newStrTestCaseDataCurrentStoreTestCaseResultMessage.trim()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestCaseStoryDetail(){
		try{
			return this.strTestCaseDataCurrentStoreTestCaseStoryDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestCaseStoryDetail(String newStrTestCaseDataCurrentStoreTestCaseStoryDetail){
		try{
			this.strTestCaseDataCurrentStoreTestCaseStoryDetail=newStrTestCaseDataCurrentStoreTestCaseStoryDetail.trim()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestCaseDateTimeStart(){
		try{
			return this.strTestCaseDataCurrentStoreTestCaseDateTimeStart
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestCaseDateTimeStart(String newStrTestCaseDataCurrentStoreTestCaseDateTimeStart){
		try{
			//this.strTestCaseDataCurrentStoreTestCaseDateTimeStart=newStrTestCaseDataCurrentStoreTestCaseDateTimeStart
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestCaseDateTimeStop(){
		try{
			return this.strTestCaseDataCurrentStoreTestCaseDateTimeStop
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestCaseDateTimeStop(String newStrTestCaseDataCurrentStoreTestCaseDateTimeStop){
		try{
			//this.strTestCaseDataCurrentStoreTestCaseDateTimeStop=newStrTestCaseDataCurrentStoreTestCaseDateTimeStop
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestStoryAfterSingleExecuted(){
		try{
			return this.isTestCaseDataCurrentStoreTestStoryAfterSingleExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestStoryAfterSingleExecuted(Boolean newIsTestCaseDataCurrentStoreTestStoryAfterSingleExecuted){
		try{
			this.isTestCaseDataCurrentStoreTestStoryAfterSingleExecuted=newIsTestCaseDataCurrentStoreTestStoryAfterSingleExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestStoryAfterSingleResult(){
		try{
			return this.isTestCaseDataCurrentStoreTestStoryAfterSingleResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestStoryAfterSingleResult(Boolean newIsTestCaseDataCurrentStoreTestStoryAfterSingleResult){
		try{
			this.isTestCaseDataCurrentStoreTestStoryAfterSingleResult=newIsTestCaseDataCurrentStoreTestStoryAfterSingleResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail(){
		try{
			return this.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail(String newStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail){
		try{
			this.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail=newStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail.trim()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestStoryAfterBatchExecuted(){
		try{
			return this.isTestCaseDataCurrentStoreTestStoryAfterBatchExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestStoryAfterBatchExecuted(Boolean newIsTestCaseDataCurrentStoreTestStoryAfterBatchExecuted){
		try{
			this.isTestCaseDataCurrentStoreTestStoryAfterBatchExecuted=newIsTestCaseDataCurrentStoreTestStoryAfterBatchExecuted
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsTestCaseDataCurrentStoreTestStoryAfterBatchResult(){
		try{
			return this.isTestCaseDataCurrentStoreTestStoryAfterBatchResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIsTestCaseDataCurrentStoreTestStoryAfterBatchResult(Boolean newIsTestCaseDataCurrentStoreTestStoryAfterBatchResult){
		try{
			this.isTestCaseDataCurrentStoreTestStoryAfterBatchResult=newIsTestCaseDataCurrentStoreTestStoryAfterBatchResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public String getStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail(){
		try{
			return this.strTestCaseDataCurrentStoreTestStoryAfterBatchDetail
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail(String newStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail){
		try{
			this.strTestCaseDataCurrentStoreTestStoryAfterBatchDetail=newStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail.trim()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestLibUtilitySuper getIGNTestLibUtilitySuper(){
		try{
			return this.ignTestLibUtilitySuper
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestLibUtilitySuper(IGNTestLibUtilitySuper newIGNTestLibUtilitySuper){
		//Do Nothing
		//this.ignTestLibUtilitySuper=newIGNTestLibUtilitySuper
	}
	public Boolean commitTestExecutionOutputChanged(){
		Boolean lreturn=false
		if(!this.isIGNTestExecutorTypeItemValid){
			return lreturn
		}
		try{
			lreturn=this.proceedTestCaseDataCurrentWriteOutput()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestExecution(){
		Boolean lreturn=false
		if(!this.isIGNTestExecutorTypeItemValid){
			return lreturn
		}
		if(!this.isTestCaseDataCurrentStoreTestCaseToDo){
			return lreturn
		}
		try{
			IGNUemaHelper.printLog('ProceedTestExecutionCaseNumber='+this.strCaseIndex+':Start')
			Boolean lIsTestExecutionOK=true
			Boolean lIsTestExecutionToDo=true
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			this.strTestCaseDataCurrentStoreTestCaseDateTimeStart=lDateTimeNow
			this.strTestCaseDataCurrentStoreTestCaseDateTimeStop=lDateTimeNow
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			this.isTestCaseDataCurrentStoreTestStoryAfterSingleExecuted=false
			this.isTestCaseDataCurrentStoreTestStoryAfterSingleResult=false
			this.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail=''
			this.isTestCaseDataCurrentStoreTestStoryAfterBatchExecuted=false
			this.isTestCaseDataCurrentStoreTestStoryAfterBatchResult=false
			this.strTestCaseDataCurrentStoreTestStoryAfterBatchDetail=''
			if(!this.isTestCaseDataCurrentStoreTestCaseForceStartToDo){
				if(this.isTestCaseExecuted){
					if(this.isTestCaseDataCurrentStoreTestCaseActualResult){
						lIsTestExecutionToDo=false
					}
				}
			}
			if(!lIsTestExecutionToDo){
				IGNUemaHelper.printLog('IsTestExecutionToDo=No')
				lIsTestExecutionOK=this.isTestCaseDataCurrentStoreTestCaseActualResult
			}else{
				IGNUemaHelper.printLog('IsTestExecutionToDo=Yes')
				this.isTestCaseDataCurrentStoreTestCaseActualResult=false
				this.strTestCaseDataCurrentStoreTestCaseResultMessage=''
				this.strTestCaseDataCurrentStoreTestCaseStoryDetail=''
				if(this.isTestCaseRefer){
					lIsTestExecutionOK=this.ignTestMasterCaseTypeMain.refreshMapCaseDataReferOutput()
					IGNUemaHelper.printLog('ValidateTestCaseReferStart')
					IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorFactory.getIGNTestExecutorTypeItemStoreByCaseNumber(this.ignTestMasterCaseTypeMain.getNumCaseRefer())
					if(IGNUemaHelper.checkObjectNullOfObject(lIGNTestExecutorTypeItem)){
						lIsTestExecutionOK=false
					}
					if(lIsTestExecutionOK){
						if(!lIGNTestExecutorTypeItem.getIsTestCaseDataCurrentStoreTestCaseActualResult()){
							lIsTestExecutionOK=false
						}
					}
					if(lIsTestExecutionOK){
						IGNUemaHelper.printLog('ValidateTestCaseReferPassed')
						IGNUemaHelper.printLog('ProceedTestDataReferClassification')
						lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestDataReferClassification()
						if(lIsTestExecutionOK){
							IGNUemaHelper.printLog('ProceedTestDataReferClassificationPassed')
							IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisite')
							lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestDataCurrentPrerequisite()
							if(lIsTestExecutionOK){
								IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisitePassed')
								IGNUemaHelper.printLog('ProceedTestMainWithRefer')
								lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestMainWithRefer()
								this.isTestCaseExecuted=true
								if(lIsTestExecutionOK){
									IGNUemaHelper.printLog('ProceedTestMainWithReferPassed')
								}else{
									IGNUemaHelper.printLog('ProceedTestMainWithReferFailed')
								}
							}else{
								IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisiteFailed')
							}
						}else{
							IGNUemaHelper.printLog('ProceedTestDataReferClassificationFailed')
						}
					}else{
						IGNUemaHelper.printLog('ValidateTestCaseReferFailed')
					}
				}else{
					IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisite')
					lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestDataCurrentPrerequisite()
					if(lIsTestExecutionOK){
						IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisitePassed')
						IGNUemaHelper.printLog('ProceedTestMainNoRefer')
						lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestMainNoRefer()
						this.isTestCaseExecuted=true
						if(lIsTestExecutionOK){
							IGNUemaHelper.printLog('ProceedTestMainNoReferPassed')
						}else{
							IGNUemaHelper.printLog('ProceedTestMainNoReferFailed')
						}
					}else{
						IGNUemaHelper.printLog('ProceedTestDataCurrentPrerequisiteFailed')
					}
				}
				if(lIsTestExecutionOK){
					IGNUemaHelper.printLog('ProceedTestMainVerify')
					lIsTestExecutionOK=this.ignTestLibUtilitySuper.proceedTestMainVerify()
					if(lIsTestExecutionOK){
						IGNUemaHelper.printLog('ProceedTestMainVerifyPassed')
					}else{
						IGNUemaHelper.printLog('ProceedTestMainVerifyFailed')
					}
				}
				this.isTestCaseDataCurrentStoreTestCaseActualResult=lIsTestExecutionOK
			}
			IGNUemaHelper.printLog('IsTestExecutionOK='+IGNUemaHelper.convertBooleanToYesNoString(lIsTestExecutionOK)+':'+this.strTestCaseDataCurrentStoreTestCaseStoryDetail)
			if(this.ignTestLibUtilitySuper.getIsWebBrowserInit()){
				this.ignTestLibUtilitySuper.browserClose()
			}
			if(lIsTestExecutionOK){
				IGNTestStoryAfterToDo lEnumIGNTestStoryAfterToDo=this.ignTestLibUtilitySuper.getEnumIGNTestStoryAfterToDo()
				if((lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestSuiteOnly)||(lEnumIGNTestStoryAfterToDo=IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)){
					IGNUemaHelper.printLog('ProceedTestAfterSingleTestSuite=Start')
					this.isTestCaseDataCurrentStoreTestStoryAfterSingleResult=this.ignTestLibUtilitySuper.proceedTestAfterSingleTestSuite()
					this.isTestCaseDataCurrentStoreTestStoryAfterSingleExecuted=true
					lIsTestExecutionOK=lIsTestExecutionOK&&this.isTestCaseDataCurrentStoreTestStoryAfterSingleResult
					IGNUemaHelper.printLog('ProceedTestAfterSingleTestSuite=Stop:'+IGNUemaHelper.convertBooleanToYesNoString(lIsTestExecutionOK)+':'+this.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail)
					this.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(this.strTestCaseDataCurrentStoreTestCaseStoryDetail,this.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail)
					this.isTestCaseDataCurrentStoreTestCaseActualResult=lIsTestExecutionOK
					IGNUemaHelper.printLog('IsTestExecutionOKAfterSingle='+IGNUemaHelper.convertBooleanToYesNoString(lIsTestExecutionOK)+':'+this.strTestCaseDataCurrentStoreTestCaseStoryDetail)
				}
			}
			if(!this.commitTestExecutionOutputChanged()){
				lIsTestExecutionOK=false
			}
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			this.strTestCaseDataCurrentStoreTestCaseDateTimeStop=lDateTimeNow
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			IGNUemaHelper.printLog('ProceedTestExecutionCaseNumber='+this.strCaseIndex+':Stop:'+IGNUemaHelper.convertBooleanToString(lIsTestExecutionOK))
			lreturn=lIsTestExecutionOK
		}catch(Exception e){
			//e.printStackTrace()
			IGNUemaHelper.printLog('ProceedTestExecutionCaseNumber='+this.strCaseIndex+':Exception')
			try{
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestExecutorTypeItemMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestExecutorTypeItemMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}