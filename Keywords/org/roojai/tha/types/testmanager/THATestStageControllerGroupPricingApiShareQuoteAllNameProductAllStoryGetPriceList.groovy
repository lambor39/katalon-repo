package org.roojai.tha.types.testmanager
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Point as Point
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.By as By
import internal.GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.ignite.core.IGNSendEmail as IGNSendEmail
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestExecutorTypeItem
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestStoryAfterToDo
import org.roojai.ignite.types.testmanager.IGNTestLibUtilitySuper
import org.roojai.ignite.types.testmanager.*
import org.roojai.tha.core.THAGlobalConst
import org.roojai.tha.core.THAUemaHelper
import org.roojai.tha.types.pricingapi.THAPricingApiGetPriceListCoreType
import org.roojai.tha.types.pricingapi.THAPricingApiGetPriceListMainUtil
import org.roojai.tha.types.pricingapi.THAPricingApiGetPriceListVerifyUtil
public class THATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList extends IGNTestLibUtilitySuper{
	public THAPricingApiGetPriceListVerifyUtil Stage00VerifyUtil
	public THAPricingApiGetPriceListMainUtil Stage01MainUtil
	public THATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList(IGNTestExecutorTypeItem ignTestExecutorTypeItem,Integer numInitTestStoryKey,String strInitTestStoryName,IGNTestStoryAfterToDo enumInitIGNTestStoryAfterToDo){
		super(ignTestExecutorTypeItem,numInitTestStoryKey,strInitTestStoryName,enumInitIGNTestStoryAfterToDo)
		try{
			if(this.isIGNTestLibUtilitySuperValid){
				this.initTHATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	private void initTHATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList(){
		try{
			Boolean lIsTHATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceListValid=true
			if(lIsTHATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceListValid){
			}
			this.isIGNTestLibUtilitySuperValid=lIsTHATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceListValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public Boolean proceedTestDataReferClassification(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestDataReferClassification=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			lIsProceedTestDataReferClassification=true
			//YOUR CODE HERE END
			lreturn=lIsProceedTestDataReferClassification
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestDataCurrentPrerequisite(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestDataCurrentPrerequisite=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			//Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			//Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			IGNUemaHelper.addMapValueFromMapToMapByPrefixKey(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			String lStrTestCaseDataCurrentStoreTestCaseResultMessage='Sample TestCaseResultMessage'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
			String lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Sample TestCaseStoryDetail'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
			lIsProceedTestDataCurrentPrerequisite=true
			if(IGNUemaHelper.checkObjectNullOfObject(this.Stage01MainUtil)){
				this.Stage01MainUtil=new THAPricingApiGetPriceListMainUtil(this)
			}
			//Boolean lIsGetPriceListOK=this.Stage01MainUtil.inputCurrentTestDataPrerequisite()
			//YOUR CODE HERE END
			lreturn=lIsProceedTestDataCurrentPrerequisite
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestMainWithRefer(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestMainOK=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			IGNUemaHelper.addMapValueFromMapToMapByPrefixKey(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			String lStrTestCaseDataCurrentStoreTestCaseResultMessage='Sample TestCaseResultMessage'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
			String lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Sample TestCaseStoryDetail'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
			lIsProceedTestMainOK=true
			if(IGNUemaHelper.checkObjectNullOfObject(this.Stage01MainUtil)){
				this.Stage01MainUtil=new THAPricingApiGetPriceListMainUtil(this)
			}
			Boolean lIsGetPriceListOK=this.Stage01MainUtil.inputCase()
			//YOUR CODE HERE END
			lreturn=lIsProceedTestMainOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestMainNoRefer(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestMainOK=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			//Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			//Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			IGNUemaHelper.addMapValueFromMapToMapByPrefixKey(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			String lStrTestCaseDataCurrentStoreTestCaseResultMessage='Sample TestCaseResultMessage'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
			String lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Sample TestCaseStoryDetail'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
			lIsProceedTestMainOK=true
			if(IGNUemaHelper.checkObjectNullOfObject(this.Stage01MainUtil)){
				this.Stage01MainUtil=new THAPricingApiGetPriceListMainUtil(this)
			}
			Boolean lIsPricingApiGetPriceListMainUtilInputCaseOK=this.Stage01MainUtil.inputCase()
			//YOUR CODE HERE END
			lreturn=lIsProceedTestMainOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestMainVerify(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestMainVerify=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			//Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			//Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			lIsProceedTestMainVerify=true
			if(IGNUemaHelper.checkObjectNullOfObject(this.Stage00VerifyUtil)){
				//this.Stage00VerifyUtil=new THAPricingApiGetPriceListVerifyUtil(this)
			}
			//Boolean lIsPricingApiGetPriceListVerifyUtilInputCaseOK=this.Stage00VerifyUtil.inputCase()
			//YOUR CODE HERE END
			lreturn=lIsProceedTestMainVerify
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestAfterSingleTestSuite(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestAfterSingleTestSuiteOK=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			String lStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail='Sample TestStoryDetailAfterSingle'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestStoryAfterSingleDetail,lStrTestCaseDataCurrentStoreTestStoryAfterSingleDetail)
			lIsProceedTestAfterSingleTestSuiteOK=true
			if(IGNUemaHelper.checkObjectNullOfObject(this.Stage01MainUtil)){
				this.Stage01MainUtil=new THAPricingApiGetPriceListMainUtil(this)
			}
			Boolean lIsPricingApiGetPriceListMainUtilInputTestReportOK=this.Stage01MainUtil.inputTestReport()
			//YOUR CODE HERE END
			lreturn=lIsProceedTestAfterSingleTestSuiteOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean proceedTestAfterBatchTestCollection(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestAfterBatchTestCollectionOK=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMain.MapCaseDataReferInput
			Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMain.MapCaseDataReferOutput
			String lStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail='Sample TestStoryDetailAfterBatch'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestStoryAfterBatchDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestStoryAfterBatchDetail,lStrTestCaseDataCurrentStoreTestStoryAfterBatchDetail)
			lIsProceedTestAfterBatchTestCollectionOK=true
			String lstrDatetime=IGNUemaHelper.convertLocalDateTimeToString('yyyy/MM/dd HH:mm')
			String lSubject='Pricing API'+' '+'('+THAPricingApiGetPriceListCoreType.PRICINGAPI_PRODUCT_TYPE+')'+': Automation report ['+lstrDatetime+'].'
			String lEmailBodyStr=THAUemaHelper.getEmailBodyForReport(lSubject,IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS(),THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES,THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES_PASSED,THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES_FAILED,THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES_ERROR)
			IGNUemaHelper.printLog('THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES_SUBSET')
			IGNUemaHelper.printLog(THAPricingApiGetPriceListCoreType.NUMBER_OF_TESTCASES_SUBSET)
			String[] lEmailAttachFileList=new String[1]
			lEmailAttachFileList[0]=THAPricingApiGetPriceListCoreType.PRICINGAPI_GENERIC_DATA_FILE_NAME
			if(IGNSendEmail.sendRoojaiReportTHA(THAGlobalConst.DEFAULT_EMAIL_TO_ME,lSubject,lEmailBodyStr,lEmailAttachFileList)){
				IGNUemaHelper.printLog('Email Sent')
			}
			else{
				IGNUemaHelper.printLog('Email Not Sent')
			}
			//YOUR CODE HERE END
			lreturn=lIsProceedTestAfterBatchTestCollectionOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}