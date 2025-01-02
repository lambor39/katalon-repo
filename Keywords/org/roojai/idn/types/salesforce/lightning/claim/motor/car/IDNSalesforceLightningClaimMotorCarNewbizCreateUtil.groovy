package org.roojai.idn.types.salesforce.lightning.claim.motor.car
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.openqa.selenium.*
import org.roojai.ignite.types.testmanager.*
import org.roojai.ignite.types.testmanager.IGNTestManagerHelperIDN
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate
import org.roojai.idn.types.salesforce.lightning.claim.motor.car.IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceObjectDriverType
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningClaimMotorCarNewbizCreateUtil {
	public WebDriver webDriver
	private IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate parentStageController=null
	public IDNSalesforceLightningClaimMotorCarNewbizCreateUtil(WebDriver webDriver,IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate initStageController){
		super()
		try{
			this.webDriver=webDriver
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate newParentStageController){
		//Do Nothing
		//this.parentStageController=newParentStageController
	}
	public Boolean inputCase(){
		Boolean lreturn=false
		try{
			String lStrSalesforceRecordID=''
			Map<String,String> lMapCaseDataCurrentInput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentInput
			Map<String,String> lMapCaseDataCurrentOutput=this.parentStageController.getParentIGNTestExecutorTypeItem().getIGNTestMasterCaseTypeMain().MapCaseDataCurrentOutput
			Map lMapSearchDefaultObjectResult=this.inputSearchBySfObject(lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObjectResult.StrSalesforceRecordID
			}
			IGNUemaHelper.delayWebUISecond(5)
			lreturn=lMapSearchDefaultObjectResult.Result
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public Map inputSearchBySfObject(Map mapCaseDataCurrentInput,Map mapCaseDataCurrentOutput){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordID=''
		try{
			lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentInput)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapCaseDataCurrentOutput)){
				return lreturn
			}
			Map lMapCaseDataCurrentInput=mapCaseDataCurrentInput
			Map lMapCaseDataCurrentOutput=mapCaseDataCurrentOutput
			Map lMapSearchDefaultObjectResult=IDNSalesforceLightningClaimMotorCarNewbizCoreSearchUtil.inputSearchBySfObject(this.webDriver,lMapCaseDataCurrentInput,lMapCaseDataCurrentOutput)
			if(!lMapSearchDefaultObjectResult.Result){
				return lreturn
			}else{
				lStrSalesforceRecordID=lMapSearchDefaultObjectResult.StrSalesforceRecordId
			}
			lResult=lStrSalesforceRecordID.length()>0
			IGNUemaHelper.printLog(lResult)
			if(lResult){
				lreturn.put('StrSalesforceRecordId',lStrSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
}
