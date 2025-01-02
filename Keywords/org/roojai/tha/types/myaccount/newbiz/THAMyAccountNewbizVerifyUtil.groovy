package org.roojai.tha.types.myaccount.newbiz
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAMyAccountNewbizVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMyAccountNewbizVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveMyAccountNewbiz01Input=false
		Boolean lIsMyAccountNewbiz01Input=false
		String lMyAccountNewbiz01Input=caseInput.MyAccountNewbiz01Input.toString().trim()
		Boolean lIsPositiveMyAccountNewbiz02Main=false
		Boolean lIsMyAccountNewbiz02Main=false
		String lMyAccountNewbiz02Main=caseInput.MyAccountNewbiz02Main.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAMyAccountNewbizInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAMyAccountNewbizInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lMyAccountNewbiz01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveMyAccountNewbiz01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveMyAccountNewbiz01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsMyAccountNewbiz01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsMyAccountNewbiz01Input){
						lMyAccountNewbiz01Input=lStatusTypes.get('1')
					}else{
						lMyAccountNewbiz01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsMyAccountNewbiz01Input
				}
				caseOutput.MyAccountNewbiz01Input=lMyAccountNewbiz01Input
			}
			Map lCaseMainInput=[:]
			Map lCaseMainOutput=[:]
			lReadOK=THAMyAccountNewbizMainType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseMainInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAMyAccountNewbizMainType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseMainOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lMyAccountNewbiz02Main=lStatusTypes.get('3')
				}else{
					if(lCaseMainOutput.PositiveCase.toString().length()>0){
						lIsPositiveMyAccountNewbiz02Main=IGNUemaHelper.convertStringToBoolean(lCaseMainOutput.PositiveCase.toString())
						if(!lIsPositiveMyAccountNewbiz02Main){
							lIsPrevPageSkipped=true
						}
					}
					lIsMyAccountNewbiz02Main=IGNUemaHelper.convertStringToBoolean(lCaseMainOutput.ActualResult.toString())
					if(lIsMyAccountNewbiz02Main){
						lMyAccountNewbiz02Main=lStatusTypes.get('1')
					}else{
						lMyAccountNewbiz02Main=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsMyAccountNewbiz02Main
				}
				caseOutput.MyAccountNewbiz02Main=lMyAccountNewbiz02Main
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