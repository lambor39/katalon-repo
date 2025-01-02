package org.roojai.tha.types.roojaipersonalaccident
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAPersonalAccidentQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAPersonalAccidentQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositivePersonalAccident01Input=false
		Boolean lIsPersonalAccident01Input=false
		String lPersonalAccident01Input=caseInput.PersonalAccident01Input.toString().trim()
		Boolean lIsPositivePersonalAccident02Result=false
		Boolean lIsPersonalAccident02Result=false
		String lPersonalAccident02Result=caseInput.PersonalAccident02Result.toString().trim()
		Boolean lIsPositivePersonalAccident03Detail1=false
		Boolean lIsPersonalAccident03Detail1=false
		String lPersonalAccident03Detail1=caseInput.PersonalAccident03Detail1.toString().trim()
		Boolean lIsPositivePersonalAccident04Payment=false
		Boolean lIsPersonalAccident04Payment=false
		String lPersonalAccident04Payment=caseInput.PersonalAccident04Payment.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAPersonalAccidentQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAPersonalAccidentQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lPersonalAccident01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositivePersonalAccident01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositivePersonalAccident01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsPersonalAccident01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsPersonalAccident01Input){
						lPersonalAccident01Input=lStatusTypes.get('1')
					}else{
						lPersonalAccident01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsPersonalAccident01Input
				}
				caseOutput.PersonalAccident01Input=lPersonalAccident01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THAPersonalAccidentQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAPersonalAccidentQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lPersonalAccident02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositivePersonalAccident02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lPersonalAccident02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsPersonalAccident02QuoteBy=false
						if(!lPersonalAccident02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsPersonalAccident02QuoteBy=true
						}
						if((!lIsPositivePersonalAccident02Result)||(lIsPersonalAccident02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsPersonalAccident02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsPersonalAccident02Result){
						lPersonalAccident02Result=lStatusTypes.get('1')
					}else{
						lPersonalAccident02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsPersonalAccident02Result
				}
				caseOutput.PersonalAccident02Result=lPersonalAccident02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THAPersonalAccidentQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAPersonalAccidentQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lPersonalAccident03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositivePersonalAccident03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositivePersonalAccident03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsPersonalAccident03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsPersonalAccident03Detail1){
						lPersonalAccident03Detail1=lStatusTypes.get('1')
					}else{
						lPersonalAccident03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsPersonalAccident03Detail1
				}
				caseOutput.PersonalAccident03Detail1=lPersonalAccident03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THAPersonalAccidentQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAPersonalAccidentQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lPersonalAccident04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositivePersonalAccident04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositivePersonalAccident04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsPersonalAccident04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsPersonalAccident04Payment){
						lPersonalAccident04Payment=lStatusTypes.get('1')
					}else{
						lPersonalAccident04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsPersonalAccident04Payment
				}
				caseOutput.PersonalAccident04Payment=lPersonalAccident04Payment
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