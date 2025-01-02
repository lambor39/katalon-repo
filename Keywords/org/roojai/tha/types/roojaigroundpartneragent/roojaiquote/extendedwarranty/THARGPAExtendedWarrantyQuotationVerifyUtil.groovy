package org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARGPAExtendedWarrantyQuotationVerifyUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARGPAExtendedWarrantyQuotationVerifyUtil(WebDriver newDriver,WebDriver newSelenium){
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
		Boolean lIsPositiveExtendedWarranty01Input=false
		Boolean lIsExtendedWarranty01Input=false
		String lExtendedWarranty01Input=caseInput.ExtendedWarranty01Input.toString().trim()
		Boolean lIsPositiveExtendedWarranty02Result=false
		Boolean lIsExtendedWarranty02Result=false
		String lExtendedWarranty02Result=caseInput.ExtendedWarranty02Result.toString().trim()
		Boolean lIsPositiveExtendedWarranty03Detail1=false
		Boolean lIsExtendedWarranty03Detail1=false
		String lExtendedWarranty03Detail1=caseInput.ExtendedWarranty03Detail1.toString().trim()
		Boolean lIsPositiveExtendedWarranty04Payment=false
		Boolean lIsExtendedWarranty04Payment=false
		String lExtendedWarranty04Payment=caseInput.ExtendedWarranty04Payment.toString().trim()
		Boolean lIsPositiveExtendedWarranty05Detail2=false
		Boolean lIsExtendedWarranty05Detail2=false
		String lExtendedWarranty05Detail2=caseInput.ExtendedWarranty05Detail2.toString().trim()
		Boolean lIsPositiveExtendedWarranty06Social=false
		Boolean lIsExtendedWarranty06Social=false
		String lExtendedWarranty06Social=caseInput.ExtendedWarranty06Social.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseInputInput=[:]
			Map lCaseInputOutput=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationInputType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseInputInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationInputType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseInputOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty01Input=lStatusTypes.get('3')
				}else{
					if(lCaseInputOutput.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.PositiveCase.toString())
						if(!lIsPositiveExtendedWarranty01Input){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty01Input=IGNUemaHelper.convertStringToBoolean(lCaseInputOutput.ActualResult.toString())
					if(lIsExtendedWarranty01Input){
						lExtendedWarranty01Input=lStatusTypes.get('1')
					}else{
						lExtendedWarranty01Input=lStatusTypes.get('2')
					}
					lIsActualResult=lIsExtendedWarranty01Input
				}
				caseOutput.ExtendedWarranty01Input=lExtendedWarranty01Input
			}
			Map lCaseResultInput=[:]
			Map lCaseResultOutput=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationResultType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseResultInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationResultType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseResultOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty02Result=lStatusTypes.get('3')
				}else{
					if(lCaseResultOutput.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.PositiveCase.toString())
						String lExtendedWarranty02QuoteBy=lCaseResultOutput.QuoteBy.toString()
						Boolean lIsExtendedWarranty02QuoteBy=false
						if(!lExtendedWarranty02QuoteBy.toString().equalsIgnoreCase('NONE')){
							lIsExtendedWarranty02QuoteBy=true
						}
						if((!lIsPositiveExtendedWarranty02Result)||(lIsExtendedWarranty02QuoteBy)){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty02Result=IGNUemaHelper.convertStringToBoolean(lCaseResultOutput.ActualResult.toString())
					if(lIsExtendedWarranty02Result){
						lExtendedWarranty02Result=lStatusTypes.get('1')
					}else{
						lExtendedWarranty02Result=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsExtendedWarranty02Result
				}
				caseOutput.ExtendedWarranty02Result=lExtendedWarranty02Result
			}
			Map lCaseDetail1Input=[:]
			Map lCaseDetail1Output=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationDetail1Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationDetail1Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail1Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty03Detail1=lStatusTypes.get('3')
				}else{
					if(lCaseDetail1Output.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.PositiveCase.toString())
						if(!lIsPositiveExtendedWarranty03Detail1){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty03Detail1=IGNUemaHelper.convertStringToBoolean(lCaseDetail1Output.ActualResult.toString())
					if(lIsExtendedWarranty03Detail1){
						lExtendedWarranty03Detail1=lStatusTypes.get('1')
					}else{
						lExtendedWarranty03Detail1=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsExtendedWarranty03Detail1
				}
				caseOutput.ExtendedWarranty03Detail1=lExtendedWarranty03Detail1
			}
			Map lCasePaymentInput=[:]
			Map lCasePaymentOutput=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationPaymentType.readInputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationPaymentType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCasePaymentOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty04Payment=lStatusTypes.get('3')
				}else{
					if(lCasePaymentOutput.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.PositiveCase.toString())
						if(!lIsPositiveExtendedWarranty04Payment){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty04Payment=IGNUemaHelper.convertStringToBoolean(lCasePaymentOutput.ActualResult.toString())
					if(lIsExtendedWarranty04Payment){
						lExtendedWarranty04Payment=lStatusTypes.get('1')
					}else{
						lExtendedWarranty04Payment=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsExtendedWarranty04Payment
				}
				caseOutput.ExtendedWarranty04Payment=lExtendedWarranty04Payment
			}
			Map lCaseDetail2Input=[:]
			Map lCaseDetail2Output=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationDetail2Type.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Input)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationDetail2Type.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseDetail2Output)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty05Detail2=lStatusTypes.get('3')
				}else{
					if(lCaseDetail2Output.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.PositiveCase.toString())
						if(!lIsPositiveExtendedWarranty05Detail2){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty05Detail2=IGNUemaHelper.convertStringToBoolean(lCaseDetail2Output.ActualResult.toString())
					if(lIsExtendedWarranty05Detail2){
						lExtendedWarranty05Detail2=lStatusTypes.get('1')
					}else{
						lExtendedWarranty05Detail2=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsExtendedWarranty05Detail2
				}
				caseOutput.ExtendedWarranty05Detail2=lExtendedWarranty05Detail2
			}
			Map lCaseSocialInput=[:]
			Map lCaseSocialOutput=[:]
			lReadOK=THARGPAExtendedWarrantyQuotationSocialType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARGPAExtendedWarrantyQuotationSocialType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseSocialOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lExtendedWarranty06Social=lStatusTypes.get('3')
				}else{
					if(lCaseSocialOutput.PositiveCase.toString().length()>0){
						lIsPositiveExtendedWarranty06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.PositiveCase.toString())
						if(!lIsPositiveExtendedWarranty06Social){
							lIsPrevPageSkipped=true
						}
					}
					lIsExtendedWarranty06Social=IGNUemaHelper.convertStringToBoolean(lCaseSocialOutput.ActualResult.toString())
					if(lIsExtendedWarranty06Social){
						lExtendedWarranty06Social=lStatusTypes.get('1')
					}else{
						lExtendedWarranty06Social=lStatusTypes.get('2')
					}
					lIsActualResult=lIsActualResult&&lIsExtendedWarranty06Social
				}
				caseOutput.ExtendedWarranty06Social=lExtendedWarranty06Social
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