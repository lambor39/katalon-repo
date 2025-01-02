package org.roojai.tha.types.electricmotorcar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAElectricMotorCarQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAElectricMotorCarQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveQuotation01Input=false
		Boolean lIsQuotation01Input=false
		String lQuotation01Input=caseInput.Quotation01Input.toString().trim()
		Boolean lIsPositiveQuotation02Result=false
		Boolean lIsQuotation02Result=false
		String lQuotation02Result=caseInput.Quotation02Result.toString().trim()
		Boolean lIsPositiveQuotation03Detail1=false
		Boolean lIsQuotation03Detail1=false
		String lQuotation03Detail1=caseInput.Quotation03Detail1.toString().trim()
		Boolean lIsPositiveQuotation04Payment=false
		Boolean lIsQuotation04Payment=false
		String lQuotation04Payment=caseInput.Quotation04Payment.toString().trim()
		Boolean lIsPositiveQuotation05Detail2=false
		Boolean lIsQuotation05Detail2=false
		String lQuotation05Detail2=caseInput.Quotation05Detail2.toString().trim()
		Boolean lIsPositiveQuotation06Social=false
		Boolean lIsQuotation06Social=false
		String lQuotation06Social=caseInput.Quotation06Social.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THAElectricMotorCarQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveQuotation01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveQuotation01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsQuotation01Input){
						lQuotation01Input=lStatusTypes.get('1')
					}else{
						lQuotation01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsQuotation01Input
				}
				caseOutput.Quotation01Input=lQuotation01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THAElectricMotorCarQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveQuotation02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lQuotation02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsQuotation02QuoteBy=false
						if(!lQuotation02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsQuotation02QuoteBy=true
						}
						if((!lIsPositiveQuotation02Result)||(lIsQuotation02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsQuotation02Result){
						lQuotation02Result=lStatusTypes.get('1')
					}else{
						lQuotation02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsQuotation02Result
				}
				caseOutput.Quotation02Result=lQuotation02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THAElectricMotorCarQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositiveQuotation03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositiveQuotation03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsQuotation03Detail1){
						lQuotation03Detail1=lStatusTypes.get('1')
					}else{
						lQuotation03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsQuotation03Detail1
				}
				caseOutput.Quotation03Detail1=lQuotation03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THAElectricMotorCarQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveQuotation04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveQuotation04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsQuotation04Payment){
						lQuotation04Payment=lStatusTypes.get('1')
					}else{
						lQuotation04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsQuotation04Payment
				}
				caseOutput.Quotation04Payment=lQuotation04Payment
			}
			Map lCaseDetail2Input=[:]
			Map lCaseDetail2Output=[:]
			lReadOK=THAElectricMotorCarQuotationDetail2Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationDetail2Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation05Detail2=lStatusTypes.get('3')
				}else{
					if(lCaseDetail2Output.PositiveCase.toString().length()>0){
						lIsPositiveQuotation05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.PositiveCase.toString())
						if(!lIsPositiveQuotation05Detail2){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.ActualResult.toString())
					if(lIsQuotation05Detail2){
						lQuotation05Detail2=lStatusTypes.get('1')
					}else{
						lQuotation05Detail2=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsQuotation05Detail2
				}
				caseOutput.Quotation05Detail2=lQuotation05Detail2
			}
			Map lCaseSocialInput=[:]
			Map lCaseSocialOutput=[:]
			lReadOK=THAElectricMotorCarQuotationSocialType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THAElectricMotorCarQuotationSocialType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lQuotation06Social=lStatusTypes.get('3')
				}else{
					if(lCaseSocialOutput.PositiveCase.toString().length()>0){
						lIsPositiveQuotation06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.PositiveCase.toString())
						if(!lIsPositiveQuotation06Social){
							lIsPrevPageSkipped=true
						}
					}
					lIsQuotation06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.ActualResult.toString())
					if(lIsQuotation06Social){
						lQuotation06Social=lStatusTypes.get('1')
					}else{
						lQuotation06Social=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsQuotation06Social
				}
				caseOutput.Quotation06Social=lQuotation06Social
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