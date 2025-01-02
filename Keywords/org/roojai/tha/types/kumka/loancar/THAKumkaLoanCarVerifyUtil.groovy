package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaLoanCarVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveKumkaLoanCar01Input=false
		Boolean lIsKumkaLoanCar01Input=false
		String lKumkaLoanCar01Input=caseInput.KumkaLoanCar01Input.toString().trim()
		Boolean lIsPositiveKumkaLoanCar02Result=false
		Boolean lIsKumkaLoanCar02Result=false
		String lKumkaLoanCar02Result=caseInput.KumkaLoanCar02Result.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAKumkaLoanCarInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAKumkaLoanCarInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lKumkaLoanCar01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveKumkaLoanCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveKumkaLoanCar01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsKumkaLoanCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsKumkaLoanCar01Input){
						lKumkaLoanCar01Input=lStatusTypes.get('1')
					}else{
						lKumkaLoanCar01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsKumkaLoanCar01Input
				}
				caseOutput.KumkaLoanCar01Input=lKumkaLoanCar01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THAKumkaLoanCarResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAKumkaLoanCarResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lKumkaLoanCar02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveKumkaLoanCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						if(!lIsPositiveKumkaLoanCar02Result){
							lIsPrevPageSkipped=true
						}
					}
					lIsKumkaLoanCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsKumkaLoanCar02Result){
						lKumkaLoanCar02Result=lStatusTypes.get('1')
					}else{
						lKumkaLoanCar02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsKumkaLoanCar02Result
				}
				caseOutput.KumkaLoanCar02Result=lKumkaLoanCar02Result
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