package org.roojai.tha.types.roojaigroundpartneragent.cancer
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARGPACancerQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARGPACancerQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveCancer01Input=false
		Boolean lIsCancer01Input=false
		String lCancer01Input=caseInput.Cancer01Input.toString().trim()
		Boolean lIsPositiveCancer02Result=false
		Boolean lIsCancer02Result=false
		String lCancer02Result=caseInput.Cancer02Result.toString().trim()
		Boolean lIsPositiveCancer03Detail1=false
		Boolean lIsCancer03Detail1=false
		String lCancer03Detail1=caseInput.Cancer03Detail1.toString().trim()
		Boolean lIsPositiveCancer04Payment=false
		Boolean lIsCancer04Payment=false
		String lCancer04Payment=caseInput.Cancer04Payment.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THARGPACancerQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACancerQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCancer01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveCancer01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveCancer01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsCancer01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsCancer01Input){
						lCancer01Input=lStatusTypes.get('1')
					}else{
						lCancer01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsCancer01Input
				}
				caseOutput.Cancer01Input=lCancer01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THARGPACancerQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACancerQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCancer02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveCancer02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lCancer02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsCancer02QuoteBy=false
						if(!lCancer02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsCancer02QuoteBy=true
						}
						if((!lIsPositiveCancer02Result)||(lIsCancer02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsCancer02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsCancer02Result){
						lCancer02Result=lStatusTypes.get('1')
					}else{
						lCancer02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCancer02Result
				}
				caseOutput.Cancer02Result=lCancer02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THARGPACancerQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACancerQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCancer03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositiveCancer03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositiveCancer03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsCancer03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsCancer03Detail1){
						lCancer03Detail1=lStatusTypes.get('1')
					}else{
						lCancer03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCancer03Detail1
				}
				caseOutput.Cancer03Detail1=lCancer03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THARGPACancerQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPACancerQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lCancer04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveCancer04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveCancer04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsCancer04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsCancer04Payment){
						lCancer04Payment=lStatusTypes.get('1')
					}else{
						lCancer04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsCancer04Payment
				}
				caseOutput.Cancer04Payment=lCancer04Payment
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