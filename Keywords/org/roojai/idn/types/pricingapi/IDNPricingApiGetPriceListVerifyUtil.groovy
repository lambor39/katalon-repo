package org.roojai.idn.types.pricingapi
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import org.roojai.ignite.types.testmanager.*
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList
public class IDNPricingApiGetPriceListVerifyUtil{
	private IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList parentStageController
	public IDNPricingApiGetPriceListVerifyUtil(IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList initStageController){
		super()
		try{
			this.parentStageController=initStageController
		}catch(Exception e){
		}
	}
	public IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList getParentStageController(){
		try{
			return this.parentStageController
		}catch(Exception e){
		}
	}
	public void setParentStageController(IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList newParentStageController){
		//Do Nothing
		//this.parentStageController=newParentStageController
	}
	public Boolean inputVerify(){
		Boolean lreturn=false
		Boolean lIsPrevPageSkipped=false
		Boolean lIsActualResult=false
		String lActualResult=''
		String lResultMessage=''
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped','4':'Error']
		try{
			String lPricingApiSubStage01RegisterClientApiDetail=''
			String lPricingApiSubStage01RegisterClientApiResult='Passed'
			String lPricingApiSubStage01RegisterClientApiResultMessage=''
			String lPricingApiSubStage01RegisterClientApiActualResult=''
			String lPositiveCase='Yes'
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			Boolean lIsPricingApiRegisterClientApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lPricingApiSubStage01RegisterClientApiResult)
			if(lIsPricingApiRegisterClientApiResultEmpty){
				lPricingApiSubStage01RegisterClientApiResultMessage='Error!,The Api have been failed on their Call Request'
				lPricingApiSubStage01RegisterClientApiActualResult=lStatusTypes.get('4')
			}
			else{
				Boolean lIsPricingApiRegisterClientApiResult=IGNUemaHelper.convertStringToBoolean(lPricingApiSubStage01RegisterClientApiResult)
				if(lIsPricingApiRegisterClientApiResult){
					lPricingApiSubStage01RegisterClientApiActualResult=lStatusTypes.get('1')
					lPricingApiSubStage01RegisterClientApiResultMessage=this.inputGenericResultMessageA(lPositiveCase)
				}
				else{
					lPricingApiSubStage01RegisterClientApiActualResult=lStatusTypes.get('2')
					lPricingApiSubStage01RegisterClientApiResultMessage=this.inputGenericResultMessageB(lPricingApiSubStage01RegisterClientApiDetail)
				}
				if(!lIsPositiveCase){
					lIsPrevPageSkipped=true
				}
			}
			lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			String lSubStage01Message=this.inputStage01ResultMessage('01','RegisterClient',lPricingApiSubStage01RegisterClientApiActualResult,lPricingApiSubStage01RegisterClientApiResultMessage)
			IGNUemaHelper.printLog(lSubStage01Message)
			String lPricingApiSubStage01MultiPlanPriceApiDetail=''
			String lPricingApiSubStage01MultiPlanPriceApiResult='Passed'
			String lPricingApiSubStage01MultiPlanPriceApiResultMessage=''
			String lPricingApiSubStage01MultiPlanPriceApiActualResult=''
			Boolean lIsPricingApiStage01MultiPlanPriceApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lPricingApiSubStage01MultiPlanPriceApiResult)
			if(lIsPricingApiStage01MultiPlanPriceApiResultEmpty){
				if((!lIsPositiveCase) && lIsPrevPageSkipped){
					lPricingApiSubStage01MultiPlanPriceApiActualResult=lStatusTypes.get('3')
					lPricingApiSubStage01MultiPlanPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
				else{
					lPricingApiSubStage01MultiPlanPriceApiActualResult=lStatusTypes.get('4')
					lPricingApiSubStage01MultiPlanPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
			}
			else{
				Boolean lIsPricingApiMultiPlanPriceApiResult=IGNUemaHelper.convertStringToBoolean(lPricingApiSubStage01MultiPlanPriceApiResult)
				if(lIsPricingApiMultiPlanPriceApiResult){
					lPricingApiSubStage01MultiPlanPriceApiActualResult=lStatusTypes.get('1')
					lPricingApiSubStage01MultiPlanPriceApiResultMessage=this.inputGenericResultMessageA(lPositiveCase)
				}
				else{
					lPricingApiSubStage01MultiPlanPriceApiActualResult=lStatusTypes.get('2')
					lPricingApiSubStage01MultiPlanPriceApiResultMessage=this.inputGenericResultMessageB(lPricingApiSubStage01MultiPlanPriceApiDetail)
				}
			}
			String lSubStage02Message=this.inputStage01ResultMessage('02','MultiPlanPrice',lPricingApiSubStage01MultiPlanPriceApiActualResult,lPricingApiSubStage01MultiPlanPriceApiResultMessage)
			IGNUemaHelper.printLog(lSubStage02Message)
			String lPricingApiSubStage01GetPlanPriceApiDetail='StatusCodeFailed'
			String lPricingApiSubStage01GetPlanPriceApiResult='Failed'
			String lPricingApiSubStage01GetPlanPriceApiResultMessage=''
			String lPricingApiSubStage01GetPlanPriceApiActualResult=''
			Boolean lIsPricingApiStage01GetPlanPriceApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lPricingApiSubStage01GetPlanPriceApiResult)
			if(lIsPricingApiStage01GetPlanPriceApiResultEmpty){
				if((!lIsPositiveCase) && lIsPrevPageSkipped){
					lPricingApiSubStage01GetPlanPriceApiActualResult=lStatusTypes.get('3')
					lPricingApiSubStage01GetPlanPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
				else{
					lPricingApiSubStage01GetPlanPriceApiActualResult=lStatusTypes.get('4')
					lPricingApiSubStage01GetPlanPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
			}
			else{
				Boolean lIsPricingApiGetPlanPriceApiResult=IGNUemaHelper.convertStringToBoolean(lPricingApiSubStage01GetPlanPriceApiResult)
				if(lIsPricingApiGetPlanPriceApiResult){
					lPricingApiSubStage01GetPlanPriceApiActualResult=lStatusTypes.get('1')
					lPricingApiSubStage01GetPlanPriceApiResultMessage=this.inputGenericResultMessageA(lPositiveCase)
				}
				else{
					lPricingApiSubStage01GetPlanPriceApiActualResult=lStatusTypes.get('2')
					lPricingApiSubStage01GetPlanPriceApiResultMessage=this.inputGenericResultMessageB(lPricingApiSubStage01GetPlanPriceApiDetail)
				}
			}
			String lSubStage03Message=this.inputStage01ResultMessage('03','GetPlanPrice',lPricingApiSubStage01GetPlanPriceApiActualResult,lPricingApiSubStage01GetPlanPriceApiResultMessage)
			IGNUemaHelper.printLog(lSubStage03Message)
			String lPricingApiSubStage01GetPlanWithInstallmentPriceApiDetail=''
			String lPricingApiSubStage01GetPlanWithInstallmentPriceApiResult=''
			String lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage=''
			String lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult=''
			Boolean lIsPricingApiStage01GetPlanWithInstallmentPriceApiResultEmpty=IGNUemaHelper.checkObjectEmptyOfString(lPricingApiSubStage01GetPlanWithInstallmentPriceApiResult)
			if(lIsPricingApiStage01GetPlanWithInstallmentPriceApiResultEmpty){
				if((!lIsPositiveCase) && lIsPrevPageSkipped){
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult=lStatusTypes.get('3')
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
				else{
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult=lStatusTypes.get('4')
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage=this.inputGenericResultMessageC(lPositiveCase)
				}
			}
			else{
				Boolean lIsPricingApiGetPlanWithInstallmentPriceApiResult=IGNUemaHelper.convertStringToBoolean(lPricingApiSubStage01GetPlanWithInstallmentPriceApiResult)
				if(lIsPricingApiGetPlanWithInstallmentPriceApiResult){
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult=lStatusTypes.get('1')
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage=this.inputGenericResultMessageA(lPositiveCase)
				}
				else{
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult=lStatusTypes.get('2')
					lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage=this.inputGenericResultMessageB(lPricingApiSubStage01GetPlanWithInstallmentPriceApiDetail)
				}
			}
			String lSubStage04Message=this.inputStage01ResultMessage('04','GetPlanWithInstallmentPrice',lPricingApiSubStage01GetPlanWithInstallmentPriceApiActualResult,lPricingApiSubStage01GetPlanWithInstallmentPriceApiResultMessage)
			String FinalMessage=lSubStage01Message+lSubStage02Message+lSubStage03Message+lSubStage04Message
			IGNUemaHelper.printLog(lSubStage04Message)
			IGNUemaHelper.printLog('FinalMessage')
			IGNUemaHelper.printLog(FinalMessage)
			//Verify
			//caseOutput.ActualResult=lActualResult\\
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputStage01ResultMessage(String strStageNumber,String strStageName,String strActualResult,String strResultMessage){
		String lResultMessage=strResultMessage.trim()
		String lActualResult=strActualResult.trim()
		String lStageNumber=strStageNumber.toString()
		String lStageName=strStageName.trim()
		String lreturn=''
		try{
			String lActualResultText=''
			String lSubStageNumberWithNameText='SubStage'+lStageNumber+'"'+lStageName+'"'
			String lSubStageActualResult='ActualResult'+'='+lActualResult
			lActualResultText=IGNUemaHelper.concatMessageLeftRightByEnter(lSubStageNumberWithNameText,lSubStageActualResult)
			String lResultMessageText=''
			String lSubStageResultMessage='ResultMessage'+'='+lResultMessage
			lResultMessageText=IGNUemaHelper.concatMessageLeftRightByEnter(lActualResultText,lSubStageResultMessage)
			lreturn =lResultMessageText
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public String inputGenericResultMessageA(String strPositiveCase){
		String lreturn=''
		String lResultMessage=''
		String lPositiveCase=strPositiveCase.trim()
		try{
			String lMessage=''
			String lResult=''
			if(lPositiveCase){
				lMessage='The Api have been Successfully verified against the Positive Response'
			}
			else{
				lMessage='The Api have been Successfully verified the Error Message against the Negative Response'
			}
			lreturn=lMessage
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputGenericResultMessageB(String strVerifyApiResult){
		String lreturn=''
		Boolean lResult=false
		String lActualResult=''
		String lVerifyApiResult=strVerifyApiResult.trim()
		try{
			String lMessage=''
			if( lVerifyApiResult.contains('StatusCodeFailed')){
				lMessage='The Api have Failed in Response Status Code'
			}
			else if(lVerifyApiResult.contains('ResponseValidationFailed')){
				lMessage='The Api have Failed in Response Validation'
			}
			lResult=lMessage.length()>0
			if(lResult){
				lreturn=lMessage
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputGenericResultMessageC(String strPositiveCase){
		String lreturn=''
		String lResultMessage=''
		String lPositiveCase=strPositiveCase.trim()
		try{
			String lMessage=''
			String lResult=''
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			System.out.println('lIsPositiveCase')
			System.out.println(lIsPositiveCase)
			if(lIsPositiveCase){
				lMessage='Error!,The Api have been failed on their Call Request'
			}
			else{
				lMessage='The Api Call have been Skipped'
			}
			lreturn=lMessage
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}