package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiCovidQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiCovidQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveRoojaiCovidInput=false
		Boolean lIsRoojaiCovidInput=false
		String lRoojaiCovidInput=caseInput.RoojaiCovidInput.toString().trim()
		Boolean lIsPositiveRoojaiCovidDetail=false
		Boolean lIsRoojaiCovidDetail=false
		String lRoojaiCovidDetail=caseInput.RoojaiCovidDetail.toString().trim()
		Boolean lIsPositiveRoojaiCovidPayment=false
		Boolean lIsRoojaiCovidPayment=false
		String lRoojaiCovidPayment=caseInput.RoojaiCovidPayment.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THARoojaiCovidQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARoojaiCovidQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lRoojaiCovidInput=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveRoojaiCovidInput=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveRoojaiCovidInput){
							lIsPrevPageSkipped=true
						}
					}
					lIsRoojaiCovidInput=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsRoojaiCovidInput){
						lRoojaiCovidInput=lStatusTypes.get('1')
					}else{
						lRoojaiCovidInput=lStatusTypes.get('2')
					}
					lIsActualResult=lIsRoojaiCovidInput
				}
				caseOutput.RoojaiCovidInput=lRoojaiCovidInput
			}
			Map lCaseDetailInput=[:]
			Map lCaseDetailOutput=[:]
			lReadOK=THARoojaiCovidQuotationDetailType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetailInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARoojaiCovidQuotationDetailType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetailOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lRoojaiCovidDetail=lStatusTypes.get('3')
				}else{
					if(lCaseDetailOutput.PositiveCase.toString().length()>0){
						lIsPositiveRoojaiCovidDetail=IGNUemaHelper.convertStringToBoolean(lCaseDetailOutput.PositiveCase.toString())
						if(!lIsPositiveRoojaiCovidDetail){
							lIsPrevPageSkipped=true
						}
					}
					lIsRoojaiCovidDetail=IGNUemaHelper.convertStringToBoolean(lCaseDetailOutput.ActualResult.toString())
					if(lIsRoojaiCovidDetail){
						lRoojaiCovidDetail=lStatusTypes.get('1')
					}else{
						lRoojaiCovidDetail=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsRoojaiCovidDetail
				}
				caseOutput.RoojaiCovidDetail=lRoojaiCovidDetail
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THARoojaiCovidQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARoojaiCovidQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lRoojaiCovidPayment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveRoojaiCovidPayment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveRoojaiCovidPayment){
							lIsPrevPageSkipped=true
						}
					}
					lIsRoojaiCovidPayment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsRoojaiCovidPayment){
						lRoojaiCovidPayment=lStatusTypes.get('1')
					}else{
						lRoojaiCovidPayment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsRoojaiCovidPayment
				}
				caseOutput.RoojaiCovidPayment=lRoojaiCovidPayment
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