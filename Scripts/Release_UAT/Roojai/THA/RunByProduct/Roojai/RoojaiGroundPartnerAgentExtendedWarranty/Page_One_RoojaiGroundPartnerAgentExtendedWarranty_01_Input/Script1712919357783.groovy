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
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyCoreType
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationInputFactory
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationInputType
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationInputUtil
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
TestData dataInput=TestDataFactory.findTestData(THARGPAExtendedWarrantyQuotationInputType.INPUT_DATA_FILE_NAME)
TestData dataOutput=TestDataFactory.findTestData(THARGPAExtendedWarrantyQuotationInputType.OUTPUT_DATA_FILE_NAME)
THARGPAExtendedWarrantyQuotationInputFactory caseFactory=new THARGPAExtendedWarrantyQuotationInputFactory(dataInput)
caseFactory.CurrentCase=GlobalVariable.CaseNumber
THARGPAExtendedWarrantyQuotationInputType caseData=caseFactory.CaseData()
Map caseInput=caseData.Input
Map caseOutput=caseData.Output
WebDriver driver=null
WebDriver selenium=null
THARGPAExtendedWarrantyQuotationInputUtil caseUtil=null
Boolean runNext=false
/*Input
 caseInput.BaseUrl
 caseInput.MaximizeMode
 caseInput.WithAuth
 caseInput.AuthUser
 caseInput.AuthPassword
 caseInput.GroundPartnerAgentLoginMethod
 caseInput.GroundPartnerAgentAccountSource
 caseInput.GroundPartnerAgentUrlProductSelect
 caseInput.GroundPartnerAgentUser
 caseInput.GroundPartnerAgentPassword
 caseInput.GroundPartnerAgentLanguage
 caseInput.Version
 caseInput.Referrer
 caseInput.Language
 caseInput.CarMake
 caseInput.CarModel
 caseInput.CarYear
 caseInput.CarSubmodel
 caseInput.CarOdometerReading
 caseInput.InsuredGenderAndMaritalStatus
 caseInput.InsuredPostalCode
 caseInput.PositiveCase
 */
/*Output
 caseOutput.BaseUrl
 caseOutput.MaximizeMode
 caseOutput.WithAuth
 caseOutput.AuthUser
 caseOutput.AuthPassword
 caseOutput.GroundPartnerAgentLoginMethod
 caseOutput.GroundPartnerAgentAccountSource
 caseOutput.GroundPartnerAgentUrlProductSelect
 caseOutput.GroundPartnerAgentUser
 caseOutput.GroundPartnerAgentPassword
 caseOutput.GroundPartnerAgentLanguage
 caseOutput.Version
 caseOutput.Referrer
 caseOutput.Language
 caseOutput.CarMake
 caseOutput.CarModel
 caseOutput.CarYear
 caseOutput.CarSubmodel
 caseOutput.CarOdometerReading
 caseOutput.InsuredGenderAndMaritalStatus
 caseOutput.InsuredPostalCode
 caseOutput.PositiveCase
 caseOutput.ActualResult
 caseOutput.GroundPartnerAgentSkipLoginUrl
 caseOutput.PolicyInsurer
 */
if(GlobalVariable.PrevStatus){
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	GlobalVariable.PrevStatus=false
	if(caseFactory.IsValid &&(caseFactory.CurrentCase>0)){
		IGNUemaHelper.printLog('caseFactory.IsValid=true')
		IGNUemaHelper.printLog(caseInput)
		if(!(GlobalVariable.BrowserInit)){
			IGNUemaHelper.printLog('BrowserInit Open')
			GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.BaseUrl,IGNUemaHelper.convertStringToBoolean(caseInput.MaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.WithAuth),caseInput.AuthUser,caseInput.AuthPassword)
			if(GlobalVariable.BrowserInit){
				caseOutput.BaseUrl=caseInput.BaseUrl
				caseOutput.MaximizeMode=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.MaximizeMode))
				caseOutput.WithAuth=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.WithAuth))
				caseOutput.AuthUser=caseInput.AuthUser
				caseOutput.AuthPassword=IGNUemaHelper.convertStringToPassword(caseInput.AuthPassword.toString())
				THARGPAExtendedWarrantyCoreType.CURRENT_GROUND_PARTNER_AGENT_URL_PORTAL=caseOutput.BaseUrl
				caseFactory.SaveOutput()
			}
		}
		if(GlobalVariable.BrowserInit){
			IGNUemaHelper.printLog('BrowserInit=true')
			IGNUemaHelper.printLog('Script Start')
			driver=DriverFactory.getWebDriver()
			selenium=driver
			caseUtil=new THARGPAExtendedWarrantyQuotationInputUtil(driver,selenium)
			//TestName
			String lTestName='RGPAExtendedWarranty_'+IGNUemaHelper.getExecutionProfile()+'_'+IGNUemaHelper.getCapabilityBrowserName(driver)+'_'+IGNUemaHelper.convertLocalDateTimeToString('yyyyMMddHHmmss')
			String lBaseUrl=caseOutput.BaseUrl.toString()
			if(IGNUemaHelper.checkStringContainString(lBaseUrl,'UAT')){
				lTestName='UAT_'+lTestName
			}else{
				lTestName='PROD_'+lTestName
			}
			IGNUemaHelper.printLog('TestName:'+lTestName)
			caseOutput.MaximizeMode=caseOutput.MaximizeMode+'|'+lTestName
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
			String lLocatorToCheck1='#app form button'
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
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(caseInput.BaseUrl)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
				}
			}
			IGNUemaHelper.delayThreadSecond(0)
			Boolean ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'app',5)
			Boolean ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#app',5)
			runNext=(ready1&&ready2)
			IGNUemaHelper.delayThreadSecond(0)
			if(!runNext){
				KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
				IGNUemaHelper.FORCESTOP()
			}else{
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
				runNext=caseUtil.inputInput(caseInput,caseOutput)
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