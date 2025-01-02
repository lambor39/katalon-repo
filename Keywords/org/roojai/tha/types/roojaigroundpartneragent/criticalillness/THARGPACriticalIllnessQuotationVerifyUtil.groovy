package org.roojai.tha.types.roojaigroundpartneragent.criticalillness
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARGPACriticalIllnessQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARGPACriticalIllnessQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveCriticalIllness01Input=false
		Boolean lIsCriticalIllness01Input=false
		String lCriticalIllness01Input=caseInput.CriticalIllness01Input.toString().trim()
		Boolean lIsPositiveCriticalIllness02Result=false
		Boolean lIsCriticalIllness02Result=false
		String lCriticalIllness02Result=caseInput.CriticalIllness02Result.toString().trim()
		Boolean lIsPositiveCriticalIllness03Detail1=false
		Boolean lIsCriticalIllness03Detail1=false
		String lCriticalIllness03Detail1=caseInput.CriticalIllness03Detail1.toString().trim()
		Boolean lIsPositiveCriticalIllness04Payment=false
		Boolean lIsCriticalIllness04Payment=false
		String lCriticalIllness04Payment=caseInput.CriticalIllness04Payment.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THARGPACriticalIllnessQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACriticalIllnessQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCriticalIllness01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveCriticalIllness01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveCriticalIllness01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsCriticalIllness01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsCriticalIllness01Input){
						lCriticalIllness01Input=lStatusTypes.get('1')
					}else{
						lCriticalIllness01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsCriticalIllness01Input
				}
				caseOutput.CriticalIllness01Input=lCriticalIllness01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THARGPACriticalIllnessQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACriticalIllnessQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCriticalIllness02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveCriticalIllness02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lCriticalIllness02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsCriticalIllness02QuoteBy=false
						if(!lCriticalIllness02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsCriticalIllness02QuoteBy=true
						}
						if((!lIsPositiveCriticalIllness02Result)||(lIsCriticalIllness02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsCriticalIllness02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsCriticalIllness02Result){
						lCriticalIllness02Result=lStatusTypes.get('1')
					}else{
						lCriticalIllness02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCriticalIllness02Result
				}
				caseOutput.CriticalIllness02Result=lCriticalIllness02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THARGPACriticalIllnessQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACriticalIllnessQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCriticalIllness03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositiveCriticalIllness03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositiveCriticalIllness03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsCriticalIllness03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsCriticalIllness03Detail1){
						lCriticalIllness03Detail1=lStatusTypes.get('1')
					}else{
						lCriticalIllness03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCriticalIllness03Detail1
				}
				caseOutput.CriticalIllness03Detail1=lCriticalIllness03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THARGPACriticalIllnessQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACriticalIllnessQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCriticalIllness04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveCriticalIllness04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveCriticalIllness04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsCriticalIllness04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsCriticalIllness04Payment){
						lCriticalIllness04Payment=lStatusTypes.get('1')
					}else{
						lCriticalIllness04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCriticalIllness04Payment
				}
				caseOutput.CriticalIllness04Payment=lCriticalIllness04Payment
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