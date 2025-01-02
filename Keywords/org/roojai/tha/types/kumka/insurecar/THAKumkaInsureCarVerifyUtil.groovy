package org.roojai.tha.types.kumka.insurecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaInsureCarVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaInsureCarVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveKumkaInsureCar01Input=false
		Boolean lIsKumkaInsureCar01Input=false
		String lKumkaInsureCar01Input=caseInput.KumkaInsureCar01Input.toString().trim()
		Boolean lIsPositiveKumkaInsureCar02Result=false
		Boolean lIsKumkaInsureCar02Result=false
		String lKumkaInsureCar02Result=caseInput.KumkaInsureCar02Result.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAKumkaInsureCarInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAKumkaInsureCarInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lKumkaInsureCar01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveKumkaInsureCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveKumkaInsureCar01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsKumkaInsureCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsKumkaInsureCar01Input){
						lKumkaInsureCar01Input=lStatusTypes.get('1')
					}else{
						lKumkaInsureCar01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsKumkaInsureCar01Input
				}
				caseOutput.KumkaInsureCar01Input=lKumkaInsureCar01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THAKumkaInsureCarResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAKumkaInsureCarResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lKumkaInsureCar02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveKumkaInsureCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						if(!lIsPositiveKumkaInsureCar02Result){
							lIsPrevPageSkipped=true
						}
					}
					lIsKumkaInsureCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsKumkaInsureCar02Result){
						lKumkaInsureCar02Result=lStatusTypes.get('1')
					}else{
						lKumkaInsureCar02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsKumkaInsureCar02Result
				}
				caseOutput.KumkaInsureCar02Result=lKumkaInsureCar02Result
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