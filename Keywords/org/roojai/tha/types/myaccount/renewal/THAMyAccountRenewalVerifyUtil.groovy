package org.roojai.tha.types.myaccount.renewal
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAMyAccountRenewalVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMyAccountRenewalVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
		super()
		this.driver=newDriver
		this.selenium=newSelenium
	}
	private WebDriver getDriver(){
		return this.driver
	}
	private void setDriver(WebDriver newDriver){
		//Do Nothing
		//this.driver=newDriver
	}
	private WebDriver getSelenium(){
		return this.selenium
	}
	private void setSelenium(WebDriver newSelenium){
		//Do Nothing
		//this.selenium=newSelenium
	}
	public Boolean inputVerify(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		Boolean lIsPrevPageSkipped=false
		Boolean lIsPositiveMyAccountRenewal01Input=false
		Boolean lIsMyAccountRenewal01Input=false
		String lMyAccountRenewal01Input=caseInput.MyAccountRenewal01Input.toString().trim()
		Boolean lIsPositiveMyAccountRenewal02Main=false
		Boolean lIsMyAccountRenewal02Main=false
		String lMyAccountRenewal02Main=caseInput.MyAccountRenewal02Main.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAMyAccountRenewalInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAMyAccountRenewalInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lMyAccountRenewal01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveMyAccountRenewal01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveMyAccountRenewal01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsMyAccountRenewal01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsMyAccountRenewal01Input){
						lMyAccountRenewal01Input=lStatusTypes.get('1')
					}else{
						lMyAccountRenewal01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsMyAccountRenewal01Input
				}
				caseOutput.MyAccountRenewal01Input=lMyAccountRenewal01Input
			}
			Map lCaseMainInput=[:]
			Map lCaseMainOutput=[:]
			lReadOK=THAMyAccountRenewalMainType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseMainInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAMyAccountRenewalMainType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseMainOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lMyAccountRenewal02Main=lStatusTypes.get('3')
				}else{
					if(lCaseMainOutput.PositiveCase.toString().length()>0){
						lIsPositiveMyAccountRenewal02Main=IGNUemaHelper.convertStringToBoolean(lCaseMainOutput.PositiveCase.toString())
						if(!lIsPositiveMyAccountRenewal02Main){
							lIsPrevPageSkipped=true
						}
					}
					lIsMyAccountRenewal02Main=IGNUemaHelper.convertStringToBoolean(lCaseMainOutput.ActualResult.toString())
					if(lIsMyAccountRenewal02Main){
						lMyAccountRenewal02Main=lStatusTypes.get('1')
					}else{
						lMyAccountRenewal02Main=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsMyAccountRenewal02Main
				}
				caseOutput.MyAccountRenewal02Main=lMyAccountRenewal02Main
			}
			//Verify
			String lLambdaTestStatusPassed='lambda-status=passed'
			String lLambdaTestStatusFailed='lambda-status=failed'
			if(IGNUemaHelper.checkRemoteTargetDriverExecution()){
				try{
					if(lIsActualResult){
						((JavascriptExecutor)this.driver).executeScript(lLambdaTestStatusPassed,'')
					}else{
						((JavascriptExecutor)this.driver).executeScript(lLambdaTestStatusFailed,'')
					}
				}catch(Exception ex){
					//ex.printStackTrace()
					try{
						if(lIsActualResult){
							WebUI.executeJavaScript(lLambdaTestStatusPassed,[''])
						}else{
							WebUI.executeJavaScript(lLambdaTestStatusFailed,[''])
						}
					}catch(Exception exx){
						//exx.printStackTrace()
					}
				}
			}
			IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_FLAG=true
			IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_RESULT=lIsActualResult
			if(lIsActualResult){
				lActualResult=lStatusTypes.get('1')
			}else{
				lActualResult=lStatusTypes.get('2')
			}
			caseOutput.ActualResult=lActualResult
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}