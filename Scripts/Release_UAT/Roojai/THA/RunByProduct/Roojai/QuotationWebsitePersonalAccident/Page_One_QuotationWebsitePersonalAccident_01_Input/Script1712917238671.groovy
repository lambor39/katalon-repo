import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Point as Point
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.By as By
import internal.GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationInputFactory
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationInputType
import org.roojai.tha.types.roojaipersonalaccident.THAPersonalAccidentQuotationInputUtil
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
String lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
	GlobalVariable.CaseDateTimeBegin=lDateTimeNow
}
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Start>>'+GlobalVariable.CaseDateTimeBegin)
if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
	IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=true')
	if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true')
		IGNUemaHelper.switchSmartWaitDelay(true)
	}else{
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=false')
		IGNUemaHelper.switchSmartWaitDelay(false)
	}
}else{
	IGNUemaHelper.printLog('CURRENT_BROWSER_IS_SAFARI=false')
	if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS){
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=true')
		IGNUemaHelper.switchSmartWaitDelay(true)
	}else{
		IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=false')
		IGNUemaHelper.switchSmartWaitDelay(false)
	}
}
IGNUemaHelper.printLog('GlobalVariable.CaseNumber:'+GlobalVariable.CaseNumber)
TestData dataInput=TestDataFactory.findTestData(THAPersonalAccidentQuotationInputType.INPUT_DATA_FILE_NAME)
TestData dataOutput=TestDataFactory.findTestData(THAPersonalAccidentQuotationInputType.OUTPUT_DATA_FILE_NAME)
THAPersonalAccidentQuotationInputFactory caseFactory=new THAPersonalAccidentQuotationInputFactory(dataInput)
caseFactory.CurrentCase=GlobalVariable.CaseNumber
THAPersonalAccidentQuotationInputType caseData=caseFactory.CaseData()
Map caseInput=caseData.Input
Map caseOutput=caseData.Output
WebDriver driver=null
WebDriver selenium=null
THAPersonalAccidentQuotationInputUtil caseUtil=null
Boolean runNext=false
/*Input
 caseInput.StartFromCmsFormMain
 caseInput.StartFromCmsFormMini
 caseInput.CmsBaseUrlFormMain
 caseInput.CmsBaseUrlFormMini
 caseInput.CmsMaximizeMode
 caseInput.CmsWithAuth
 caseInput.CmsAuthUser
 caseInput.CmsAuthPassword
 caseInput.CmsLanguage
 caseInput.CmsGenderAndMaritalStatus
 caseInput.CmsBirthDateMain
 caseInput.CmsInsuredOccupation
 caseInput.CmsInsuredSalary
 caseInput.CmsKeepDetail
 caseInput.BaseUrl
 caseInput.MaximizeMode
 caseInput.WithAuth
 caseInput.AuthUser
 caseInput.AuthPassword
 caseInput.Version
 caseInput.Language
 caseInput.InsuredGender
 caseInput.InsuredBirthDate
 caseInput.InsuredOccupation
 caseInput.InsuredSalary
 caseInput.QueryPersonalAccidentInsurance
 caseInput.QueryInsuredDeniedCoverage
 caseInput.QueryAccidentOrInjury
 caseInput.QueryReceivedMedicalTreatment
 caseInput.QueryHypertensionBloodPositive
 caseInput.QueryOtherQuestion01
 caseInput.QueryOtherQuestion02
 caseInput.QueryOtherQuestion03
 caseInput.QueryOtherQuestion04
 caseInput.QueryOtherQuestion05
 caseInput.QueryOtherQuestion06
 caseInput.QueryOtherQuestion07
 caseInput.QueryOtherQuestion08
 caseInput.QueryOtherQuestion09
 caseInput.QueryOtherQuestion10
 caseInput.PositiveCase
 */
/*Output
 caseOutput.StartFromCmsFormMain
 caseOutput.StartFromCmsFormMini
 caseOutput.CmsBaseUrlFormMain
 caseOutput.CmsBaseUrlFormMini
 caseOutput.CmsMaximizeMode
 caseOutput.CmsWithAuth
 caseOutput.CmsAuthUser
 caseOutput.CmsAuthPassword
 caseOutput.CmsLanguage
 caseOutput.CmsGenderAndMaritalStatus
 caseOutput.CmsBirthDateMain
 caseOutput.CmsInsuredOccupation
 caseOutput.CmsInsuredSalary
 caseOutput.CmsKeepDetail
 caseOutput.BaseUrl
 caseOutput.MaximizeMode
 caseOutput.WithAuth
 caseOutput.AuthUser
 caseOutput.AuthPassword
 caseOutput.Version
 caseOutput.Language
 caseOutput.InsuredGender
 caseOutput.InsuredBirthDate
 caseOutput.InsuredOccupation
 caseOutput.InsuredSalary
 caseOutput.QueryPersonalAccidentInsurance
 caseOutput.QueryInsuredDeniedCoverage
 caseOutput.QueryAccidentOrInjury
 caseOutput.QueryReceivedMedicalTreatment
 caseOutput.QueryHypertensionBloodPositive
 caseOutput.QueryOtherQuestion01
 caseOutput.QueryOtherQuestion02
 caseOutput.QueryOtherQuestion03
 caseOutput.QueryOtherQuestion04
 caseOutput.QueryOtherQuestion05
 caseOutput.QueryOtherQuestion06
 caseOutput.QueryOtherQuestion07
 caseOutput.QueryOtherQuestion08
 caseOutput.QueryOtherQuestion09
 caseOutput.QueryOtherQuestion10
 caseOutput.PositiveCase
 caseOutput.ActualResult
 caseOutput.ResultMessage
 caseOutput.CmsPostLanguage
 caseOutput.CmsPostGenderAndMaritalStatus
 caseOutput.CmsPostBirthDateMain
 caseOutput.CmsPostInsuredOccupation
 caseOutput.CmsPostInsuredSalary
 caseOutput.PolicyInsurer
 */
if(GlobalVariable.PrevStatus){
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	GlobalVariable.PrevStatus=false
	if(caseFactory.IsValid &&(caseFactory.CurrentCase>0)){
		IGNUemaHelper.printLog('caseFactory.IsValid=true')
		IGNUemaHelper.printLog(caseInput)
		String lStartFromCmsFormMain=caseInput.StartFromCmsFormMain.toString().trim()
		Boolean lIsStartFromCmsFormMain=IGNUemaHelper.convertStringToBoolean(lStartFromCmsFormMain)
		lStartFromCmsFormMain=IGNUemaHelper.convertBooleanToYesNoString(lIsStartFromCmsFormMain)
		caseOutput.StartFromCmsFormMain=lStartFromCmsFormMain
		String lStartFromCmsFormMini=caseInput.StartFromCmsFormMini.toString().trim()
		Boolean lIsStartFromCmsFormMini=IGNUemaHelper.convertStringToBoolean(lStartFromCmsFormMini)
		lStartFromCmsFormMini=IGNUemaHelper.convertBooleanToYesNoString(lIsStartFromCmsFormMini)
		caseOutput.StartFromCmsFormMini=lStartFromCmsFormMini
		if(!(GlobalVariable.BrowserInit)){
			IGNUemaHelper.printLog('BrowserInit Open')
			if(lIsStartFromCmsFormMain){
				GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.CmsBaseUrlFormMain,IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth),caseInput.CmsAuthUser,caseInput.CmsAuthPassword)
			}else{
				if(lIsStartFromCmsFormMini){
					GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.CmsBaseUrlFormMini,IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth),caseInput.CmsAuthUser,caseInput.CmsAuthPassword)
				}else{
					GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.BaseUrl,IGNUemaHelper.convertStringToBoolean(caseInput.MaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.WithAuth),caseInput.AuthUser,caseInput.AuthPassword)
				}
			}
			if(GlobalVariable.BrowserInit){
				if(lIsStartFromCmsFormMain){
					caseOutput.CmsBaseUrlFormMain=caseInput.CmsBaseUrlFormMain
					caseOutput.CmsMaximizeMode=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode))
					caseOutput.CmsWithAuth=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth))
					caseOutput.CmsAuthUser=caseInput.CmsAuthUser
					caseOutput.CmsAuthPassword=IGNUemaHelper.convertStringToPassword(caseInput.CmsAuthPassword.toString())
				}else{
					if(lIsStartFromCmsFormMini){
						caseOutput.CmsBaseUrlFormMini=caseInput.CmsBaseUrlFormMini
						caseOutput.CmsMaximizeMode=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode))
						caseOutput.CmsWithAuth=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth))
						caseOutput.CmsAuthUser=caseInput.CmsAuthUser
						caseOutput.CmsAuthPassword=IGNUemaHelper.convertStringToPassword(caseInput.CmsAuthPassword.toString())
					}else{
						caseOutput.BaseUrl=caseInput.BaseUrl
						caseOutput.MaximizeMode=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.MaximizeMode))
						caseOutput.WithAuth=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.WithAuth))
						caseOutput.AuthUser=caseInput.AuthUser
						caseOutput.AuthPassword=IGNUemaHelper.convertStringToPassword(caseInput.AuthPassword.toString())
					}
				}
				caseFactory.SaveOutput()
			}
		}
		if(GlobalVariable.BrowserInit){
			IGNUemaHelper.printLog('BrowserInit=true')
			IGNUemaHelper.printLog('Script Start')
			driver=DriverFactory.getWebDriver()
			selenium=driver
			caseUtil=new THAPersonalAccidentQuotationInputUtil(driver,selenium)
			//TestName
			String lTestName='PersonalAccident_'+IGNUemaHelper.getExecutionProfile()+'_'+IGNUemaHelper.getCapabilityBrowserName(driver)+'_'+IGNUemaHelper.convertLocalDateTimeToString('yyyyMMddHHmmss')
			String lBaseUrl=caseOutput.BaseUrl.toString()
			if(lIsStartFromCmsFormMain){
				lBaseUrl=caseOutput.CmsBaseUrlFormMain.toString()
			}else{
				if(lIsStartFromCmsFormMini){
					lBaseUrl=caseOutput.CmsBaseUrlFormMini.toString()
				}else{
					lBaseUrl=caseOutput.BaseUrl.toString()
				}
			}
			if(IGNUemaHelper.checkStringContainString(lBaseUrl,'UAT')){
				lTestName='UAT_'+lTestName
			}else{
				lTestName='PROD_'+lTestName
			}
			IGNUemaHelper.printLog('TestName:'+lTestName)
			if(lIsStartFromCmsFormMain){
				caseOutput.CmsMaximizeMode=caseOutput.CmsMaximizeMode+'|'+lTestName
			}else{
				if(lIsStartFromCmsFormMini){
					caseOutput.CmsMaximizeMode=caseOutput.CmsMaximizeMode+'|'+lTestName
				}else{
					caseOutput.MaximizeMode=caseOutput.MaximizeMode+'|'+lTestName
				}
			}
			String lJsLambdaTestName='lambda-name='+lTestName
			if(IGNUemaHelper.checkRemoteTargetDriverExecution()){
				try{
					((JavascriptExecutor)driver).executeScript(lJsLambdaTestName,'')
				}catch(Exception ex){
					//ex.printStackTrace()
					try{
						WebUI.executeJavaScript(lJsLambdaTestName,[''])
					}catch(Exception exx){
						//exx.printStackTrace()
					}
				}
			}
			String lLocatorToCheck1=''
			if(lIsStartFromCmsFormMain){
				lLocatorToCheck1='#main .justify-content-center'
				lBaseUrl=caseInput.CmsBaseUrlFormMain
			}else{
				if(lIsStartFromCmsFormMini){
					lLocatorToCheck1='#main .section-header'
					lBaseUrl=caseInput.CmsBaseUrlFormMain
				}else{
					lLocatorToCheck1=IGNUemaHelper.getTagDataSeleniumKey('gender')
					lBaseUrl=caseInput.BaseUrl
				}
			}
			if(IGNUemaHelper.CURRENT_BROWSER_IS_SAFARI){
				IGNUemaHelper.switchSmartWaitDelay(true)
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,3)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,5)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,8)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,13)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,21)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,34)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,55)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,89)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,144)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,233)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,377)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.waitElementVisibleByLocator(driver,lLocatorToCheck1,610)){
					WebUI.refresh()
				}
				if(IGNUemaHelper.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true')
					IGNUemaHelper.switchSmartWaitDelay(true)
				}else{
					IGNUemaHelper.printLog('CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=false')
					IGNUemaHelper.switchSmartWaitDelay(false)
				}
			}else{
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(caseInput.BaseUrl)
					IGNUemaHelper.delayWebUISecond(3)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
					IGNUemaHelper.delayWebUISecond(5)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(caseInput.BaseUrl)
					IGNUemaHelper.delayWebUISecond(8)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
					IGNUemaHelper.delayWebUISecond(13)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(caseInput.BaseUrl)
					IGNUemaHelper.delayWebUISecond(21)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
					IGNUemaHelper.delayWebUISecond(34)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(caseInput.BaseUrl)
					IGNUemaHelper.delayWebUISecond(55)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
					IGNUemaHelper.delayWebUISecond(89)
				}
			}
			IGNUemaHelper.delayThreadSecond(0)
			Boolean ready1=false
			Boolean ready2=false
			if(lIsStartFromCmsFormMain){
				ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'main',5)
				ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#main',5)
			}else{
				if(lIsStartFromCmsFormMini){
					ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'main .section-header',5)
					ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#main .section-header',5)
				}else{
					ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'pa-input',10)
					ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#pa-input',10)
				}
			}
			runNext=(ready1&&ready2)
			IGNUemaHelper.delayThreadSecond(0)
			if(!runNext){
				KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
				IGNUemaHelper.FORCESTOP()
			}
			if(runNext){
				caseFactory.SaveOutput()
				//Check ABTesting
				String lTagABTesting='ABTesting'
				String lLocatorABTesting=IGNUemaHelper.getTagDataSeleniumKey(lTagABTesting)
				WebElement lElementABTesting=IGNUemaHelper.getWebElementFromDataSeleniumKey(driver,lTagABTesting)
				if(!lElementABTesting){
					IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=false
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
					IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
				}else{
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=IGNUemaHelper.getDataSeleniumValueWebElement(driver,lElementABTesting).trim().toUpperCase()
					if(IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>1){
						IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
					}
					IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>0
					IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
					if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
						IGNUemaHelper.printLog('IGNUemaHelper.CURRENT_AB_TESTING_VERSION='+IGNUemaHelper.CURRENT_AB_TESTING_VERSION)
					}
				}
				if(lIsStartFromCmsFormMain){
					runNext=caseUtil.inputInputFromCmsMain(caseInput,caseOutput)
				}else{
					if(lIsStartFromCmsFormMini){
						runNext=caseUtil.inputInputFromCmsMini(caseInput,caseOutput)
					}else{
						runNext=caseUtil.inputInputFromProduct(caseInput,caseOutput)
					}
				}
				if(caseOutput.PositiveCase.toString().length()>0){
					if((!IGNUemaHelper.convertStringToBoolean(caseOutput.PositiveCase.toString()))&&(caseOutput.ActualResult.toString().length()<=0)){
						caseOutput.ActualResult=IGNUemaHelper.convertBooleanToString(true)
					}
				}
				caseFactory.SaveOutput()
				//Check For Retry Case
				if(caseOutput.PositiveCase.toString().length()>0){
					if(!IGNUemaHelper.convertStringToBoolean(caseOutput.ActualResult)){
						if(IGNUemaHelper.convertStringToBoolean(caseOutput.PositiveCase)){
							KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
							IGNUemaHelper.FORCESTOP()
						}
					}
				}
				GlobalVariable.PrevStatus=runNext
			}
			IGNUemaHelper.printLog(caseOutput)
			IGNUemaHelper.delayThreadSecond(0)
			IGNUemaHelper.printLog('Script Stop')
			KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
		}else{
			IGNUemaHelper.printLog('BrowserInit=false')
			caseFactory.SaveOutput()
			KeywordUtil.markError(GlobalVariable.TestCaseFullName)
			IGNUemaHelper.FORCESTOP()
		}
	}else{
		IGNUemaHelper.printLog('caseFactory.IsValid=false')
		KeywordUtil.markError(GlobalVariable.TestCaseFullName)
		IGNUemaHelper.FORCESTOP()
	}
}else{
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	if(caseFactory.IsValid &&(caseFactory.CurrentCase>0)){
		IGNUemaHelper.printLog('caseFactory.IsValid=true')
		caseFactory.SaveOutput()
		KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
	}else{
		IGNUemaHelper.printLog('caseFactory.IsValid=false')
		KeywordUtil.markError(GlobalVariable.TestCaseFullName)
		IGNUemaHelper.FORCESTOP()
	}
}
lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
return null