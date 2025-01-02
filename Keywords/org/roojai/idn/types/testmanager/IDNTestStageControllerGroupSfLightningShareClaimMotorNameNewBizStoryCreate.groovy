package org.roojai.idn.types.testmanager
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
import internal.GlobalVariable as GlobalVariable
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
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestExecutorTypeItem
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestStoryAfterToDo
import org.roojai.ignite.types.testmanager.IGNTestLibUtilitySuper
import org.roojai.ignite.types.testmanager.*
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.idn.core.IDNGlobalConst as IDNGlobalConst
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperCommon
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreType
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCreateUtil
public class IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate extends IGNTestLibUtilitySuper{
	public IDNSalesforceLightningClaimMotorCarNewbizCreateUtil Stage01MainUtil
	private IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate(IGNTestExecutorTypeItem ignTestExecutorTypeItem,Integer numInitTestStoryKey,String strInitTestStoryName,IGNTestStoryAfterToDo enumInitIGNTestStoryAfterToDo){
		super(ignTestExecutorTypeItem,numInitTestStoryKey,strInitTestStoryName,enumInitIGNTestStoryAfterToDo)
		try{
			if(this.isIGNTestLibUtilitySuperValid){
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
	public Boolean proceedTestDataReferClassification(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsProceedTestDataReferClassification=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItemCurrent=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainCurrent=lIGNTestExecutorTypeItemCurrent.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMainCurrent.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMainCurrent.MapCaseDataCurrentOutput
			if(lIGNTestMasterCaseTypeMainCurrent.isCaseRefer){
				IGNTestExecutorTypeItem lIGNTestExecutorTypeItemRefer=lIGNTestExecutorTypeItemCurrent.getParentIGNTestExecutorFactory().getIGNTestExecutorTypeItemStoreByCaseNumber(lIGNTestMasterCaseTypeMainCurrent.getNumCaseRefer())
				IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMainRefer=lIGNTestExecutorTypeItemRefer.getIGNTestMasterCaseTypeMain()
				Map<String,String> lMapCaseDataReferInput=lIGNTestMasterCaseTypeMainRefer.MapCaseDataReferInput
				Map<String,String> MapCaseDataReferOutput=lIGNTestMasterCaseTypeMainRefer.MapCaseDataReferOutput
				Boolean lIsStoryKeySupported=lIGNTestExecutorTypeItemCurrent.getIsIGNTestExecutorTypeItemValid()
				if(!lIsStoryKeySupported){
					return lreturn
				}
				if(!lIGNTestExecutorTypeItemRefer.getIsTestCaseExecuted()){
					return lreturn
				}
				Boolean lIsReferCaseActualResult=IGNUemaHelper.convertStringToBoolean(lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldActualResult)
				if(!lIsReferCaseActualResult){
					return lreturn
				}
				String lStrTestCaseDataCurrentOutputTestStoryCaseKey=lIGNTestExecutorTypeItemRefer.getStrTestCaseDataCurrentOutputTestStoryCaseKey()
				switch(lStrTestCaseDataCurrentOutputTestStoryCaseKey){
					case '12':
						lIsProceedTestDataReferClassification=true
						break
					default:
						break
				}
			}
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
			IGNUemaHelper.addMapValueFromMapToMapByPrefixKey(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			String lStrTestCaseDataCurrentStoreTestCaseResultMessage=''
			String lStrTestCaseDataCurrentStoreTestCaseStoryDetail=''
			if(IGNUemaHelper.checkObjectEmptyOfString(lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchToMode)){
				lStrTestCaseDataCurrentStoreTestCaseResultMessage='User Input Missing'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
				lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Please input value in GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchToMode'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDefaultObject)){
				lStrTestCaseDataCurrentStoreTestCaseResultMessage='User Input Missing'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
				lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Please input value in GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDefaultObject'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailContinueStep)){
				lStrTestCaseDataCurrentStoreTestCaseResultMessage='User Input Missing'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
				lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Please input value in GroupSfLightningShareClaimMotorStage02DoManageFieldSfSearchByDetailContinueStep'
				lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
				return lreturn
			}
			lStrTestCaseDataCurrentStoreTestCaseResultMessage='User Input Ok'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
			lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Passed'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
			lIsProceedTestDataCurrentPrerequisite=true
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
		Boolean lIsOpenedBrowser=false
		try{
			//YOUR CODE HERE BEGIN
			//INIT YOUR UTILITY CLASS AND PROCEED YOUR CODE
			IGNTestExecutorTypeItem lIGNTestExecutorTypeItem=this.parentIGNTestExecutorTypeItem
			IGNTestMasterCaseTypeMain lIGNTestMasterCaseTypeMain=lIGNTestExecutorTypeItem.getIGNTestMasterCaseTypeMain()
			Map<String,String> lMapCaseDataCurrentInput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=lIGNTestMasterCaseTypeMain.MapCaseDataCurrentOutput
			IGNUemaHelper.addMapValueFromMapToMapByPrefixKey(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			String lStrTestCaseDataCurrentStoreTestCaseResultMessage='Search claim'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseResultMessage,lStrTestCaseDataCurrentStoreTestCaseResultMessage)
			String lStrTestCaseDataCurrentStoreTestCaseStoryDetail='Search claim'
			lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail=IGNUemaHelper.concatMessageLeftRightByEnter(lIGNTestExecutorTypeItem.strTestCaseDataCurrentStoreTestCaseStoryDetail,lStrTestCaseDataCurrentStoreTestCaseStoryDetail)
			Boolean lIsOk=IGNSalesforceRestAPIHelper.setIGNSalesforceRestAPICountry(IGNTestDataCountry.Indonesia)
			String lStrDefaultSalesforceEndPointUrl=IGNSalesforceRestAPIHelper.getConfigurationSalesforceServerURI()
			Boolean lIsBrowserOpenOK=this.browserInit(lStrDefaultSalesforceEndPointUrl,true)
			lIsBrowserOpenOK=this.getIsWebBrowserInit()
			if(lIsBrowserOpenOK){
				String lStrSfLoginUserName=lMapCaseDataCurrentInput.GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountName
				String lStrSfLoginPassword=lMapCaseDataCurrentInput.GroupAllGlobalShareControlStage02SfConfigFieldSfLoginAccountPassword
				String lStrSfSwitchMode=lMapCaseDataCurrentInput.GroupSfLightningShareClaimMotorStage02DoManageFieldSfSwitchToMode
				WebDriver lDriver=this.getWebDriver()
				Boolean lIsLoginWithCredentialOK=IDNSalesforceLightningCoreHelperUI.initSalesforceLightningLoginWithCredential(lDriver,lStrSfLoginUserName,lStrSfLoginPassword)
				IGNTestManager lIGNTestManager=this.parentIGNTestExecutorTypeItem.parentIGNTestExecutorFactory.getParentIGNTestConductor().getParentIGNTestManager()
				IGNTestMasterFieldTypeSingle lIGNTestMasterFieldTypeSingle01=lIGNTestManager.getIGNTestDataAdapter().getIGNTestMasterFieldFactory().getIGNTestMasterFieldTypeSingleByProjectFieldListFieldName('Group_Sf_Lightning_Share_Claim_Motor_Stage_02_Do_Manage_Field_Sf_Switch_To_Mode')
				String lStrStrSfSwitchModeValue=lIGNTestMasterFieldTypeSingle01.getMasterPairValueByKey(lStrSfSwitchMode)
				Boolean lIsSfModeLightningOK=IDNSalesforceLightningCoreHelperUI.checkTargetSalesforceModeIsLightning(lStrStrSfSwitchModeValue)
				Boolean lIsSfSwitchToModeOK=IDNSalesforceLightningCoreHelperUI.inputSalesforceSwitchUIMode(lDriver,lIsSfModeLightningOK)
				if(IGNUemaHelper.checkObjectNullOfObject(this.Stage01MainUtil)){
					this.Stage01MainUtil=new IDNSalesforceLightningClaimMotorCarNewbizCreateUtil(this)
					Boolean lIsCreateNewBizQuoteOK=this.Stage01MainUtil.inputClaimCreate(lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
					lIsProceedTestMainOK=true
				}
			}
			//YOUR CODE HERE END
			lreturn=lIsProceedTestMainOK
		}catch(Exception e){
			e.printStackTrace()
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
	public String getStrDefaultSalesforceEndPointUrl(){
		try{
			return this.strDefaultSalesforceEndPointUrl
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
	public void setStrDefaultSalesforceEndPointUrl(String newStrDefaultSalesforceEndPointUrl){
		//Do Nothing
	}
}