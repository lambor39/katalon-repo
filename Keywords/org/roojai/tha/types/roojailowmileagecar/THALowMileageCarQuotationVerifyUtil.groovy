package org.roojai.tha.types.roojailowmileagecar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THALowMileageCarQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THALowMileageCarQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveLowMileageCar01Input=false
		Boolean lIsLowMileageCar01Input=false
		String lLowMileageCar01Input=caseInput.LowMileageCar01Input.toString().trim()
		Boolean lIsPositiveLowMileageCar02Result=false
		Boolean lIsLowMileageCar02Result=false
		String lLowMileageCar02Result=caseInput.LowMileageCar02Result.toString().trim()
		Boolean lIsPositiveLowMileageCar03Detail1=false
		Boolean lIsLowMileageCar03Detail1=false
		String lLowMileageCar03Detail1=caseInput.LowMileageCar03Detail1.toString().trim()
		Boolean lIsPositiveLowMileageCar04Payment=false
		Boolean lIsLowMileageCar04Payment=false
		String lLowMileageCar04Payment=caseInput.LowMileageCar04Payment.toString().trim()
		Boolean lIsPositiveLowMileageCar05Detail2=false
		Boolean lIsLowMileageCar05Detail2=false
		String lLowMileageCar05Detail2=caseInput.LowMileageCar05Detail2.toString().trim()
		Boolean lIsPositiveLowMileageCar06Social=false
		Boolean lIsLowMileageCar06Social=false
		String lLowMileageCar06Social=caseInput.LowMileageCar06Social.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THALowMileageCarQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveLowMileageCar01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsLowMileageCar01Input){
						lLowMileageCar01Input=lStatusTypes.get('1')
					}else{
						lLowMileageCar01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsLowMileageCar01Input
				}
				caseOutput.LowMileageCar01Input=lLowMileageCar01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THALowMileageCarQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lLowMileageCar02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsLowMileageCar02QuoteBy=false
						if(!lLowMileageCar02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsLowMileageCar02QuoteBy=true
						}
						if((!lIsPositiveLowMileageCar02Result)||(lIsLowMileageCar02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsLowMileageCar02Result){
						lLowMileageCar02Result=lStatusTypes.get('1')
					}else{
						lLowMileageCar02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsLowMileageCar02Result
				}
				caseOutput.LowMileageCar02Result=lLowMileageCar02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THALowMileageCarQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositiveLowMileageCar03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsLowMileageCar03Detail1){
						lLowMileageCar03Detail1=lStatusTypes.get('1')
					}else{
						lLowMileageCar03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsLowMileageCar03Detail1
				}
				caseOutput.LowMileageCar03Detail1=lLowMileageCar03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THALowMileageCarQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveLowMileageCar04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsLowMileageCar04Payment){
						lLowMileageCar04Payment=lStatusTypes.get('1')
					}else{
						lLowMileageCar04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsLowMileageCar04Payment
				}
				caseOutput.LowMileageCar04Payment=lLowMileageCar04Payment
			}
			Map lCaseDetail2Input=[:]
			Map lCaseDetail2Output=[:]
			lReadOK=THALowMileageCarQuotationDetail2Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationDetail2Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar05Detail2=lStatusTypes.get('3')
				}else{
					if(lCaseDetail2Output.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.PositiveCase.toString())
						if(!lIsPositiveLowMileageCar05Detail2){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.ActualResult.toString())
					if(lIsLowMileageCar05Detail2){
						lLowMileageCar05Detail2=lStatusTypes.get('1')
					}else{
						lLowMileageCar05Detail2=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsLowMileageCar05Detail2
				}
				caseOutput.LowMileageCar05Detail2=lLowMileageCar05Detail2
			}
			Map lCaseSocialInput=[:]
			Map lCaseSocialOutput=[:]
			lReadOK=THALowMileageCarQuotationSocialType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THALowMileageCarQuotationSocialType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lLowMileageCar06Social=lStatusTypes.get('3')
				}else{
					if(lCaseSocialOutput.PositiveCase.toString().length()>0){
						lIsPositiveLowMileageCar06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.PositiveCase.toString())
						if(!lIsPositiveLowMileageCar06Social){
							lIsPrevPageSkipped=true
						}
					}
					lIsLowMileageCar06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.ActualResult.toString())
					if(lIsLowMileageCar06Social){
						lLowMileageCar06Social=lStatusTypes.get('1')
					}else{
						lLowMileageCar06Social=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsLowMileageCar06Social
				}
				caseOutput.LowMileageCar06Social=lLowMileageCar06Social
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