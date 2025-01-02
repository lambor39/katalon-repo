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
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarCoreType
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarQuotationInputFactory
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarQuotationInputType
import org.roojai.tha.types.roojailowmileagecar.THALowMileageCarQuotationInputUtil
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
TestData dataInput=TestDataFactory.findTestData(THALowMileageCarQuotationInputType.INPUT_DATA_FILE_NAME)
TestData dataOutput=TestDataFactory.findTestData(THALowMileageCarQuotationInputType.OUTPUT_DATA_FILE_NAME)
THALowMileageCarQuotationInputFactory caseFactory=new THALowMileageCarQuotationInputFactory(dataInput)
caseFactory.CurrentCase=GlobalVariable.CaseNumber
THALowMileageCarQuotationInputType caseData=caseFactory.CaseData()
Map caseInput=caseData.Input
Map caseOutput=caseData.Output
WebDriver driver=null
WebDriver selenium=null
THALowMileageCarQuotationInputUtil caseUtil=null
Boolean runNext=false
/*Input
 caseInput.StartFromCmsAffiliateMain
 caseInput.StartFromCmsFormMain
 caseInput.StartFromCmsFormMini
 caseInput.CmsBaseUrlFormMain
 caseInput.CmsBaseUrlFormMini
 caseInput.CmsAffiliateBaseUrlFormMain
 caseInput.CmsAffiliateBaseNonce
 caseInput.CmsAffiliateBasePsnNumber
 caseInput.CmsMaximizeMode
 caseInput.CmsWithAuth
 caseInput.CmsAuthUser
 caseInput.CmsAuthPassword
 caseInput.CmsLanguage
 caseInput.CmsCarMake
 caseInput.CmsCarModel
 caseInput.CmsCarYear
 caseInput.CmsCarSubmodel
 caseInput.CmsKeepDetail
 caseInput.CmsAffiliateMaximizeMode
 caseInput.CmsAffiliateWithAuth
 caseInput.CmsAffiliateAuthUser
 caseInput.CmsAffiliateAuthPassword
 caseInput.CmsAffiliateLanguage
 caseInput.BaseUrl
 caseInput.MaximizeMode
 caseInput.WithAuth
 caseInput.AuthUser
 caseInput.AuthPassword
 caseInput.Version
 caseInput.Referrer
 caseInput.Language
 caseInput.CarMake
 caseInput.CarModel
 caseInput.CarYear
 caseInput.Submodel
 caseInput.GenderMain
 caseInput.MaritalStatus
 caseInput.BirthDateMain
 caseInput.YearDriving
 caseInput.ClaimsNo
 caseInput.VehicleUsage
 caseInput.VehicleUsageForCommercial
 caseInput.VehicleUsageDriveToWork
 caseInput.VehicleUsageDriveToWorkOften
 caseInput.TaxiOrVehicleForHire
 caseInput.RentalVehicle
 caseInput.GoodsTransportVehicle
 caseInput.LogisticsOrCourierCompany
 caseInput.GoodsTransportRoute
 caseInput.PostalCode
 caseInput.DeclaredNcb
 caseInput.CarCamera
 caseInput.UnderFinancing
 caseInput.Tentative
 caseInput.AlcoholFree
 caseInput.PositiveCase
 */
/*Output
 caseOutput.StartFromCmsAffiliateMain
 caseOutput.StartFromCmsFormMain
 caseOutput.StartFromCmsFormMini
 caseOutput.CmsBaseUrlFormMain
 caseOutput.CmsBaseUrlFormMini
 caseOutput.CmsAffiliateBaseUrlFormMain
 caseOutput.CmsAffiliateBaseNonce
 caseOutput.CmsAffiliateBasePsnNumber
 caseOutput.CmsMaximizeMode
 caseOutput.CmsWithAuth
 caseOutput.CmsAuthUser
 caseOutput.CmsAuthPassword
 caseOutput.CmsLanguage
 caseOutput.CmsCarMake
 caseOutput.CmsCarModel
 caseOutput.CmsCarYear
 caseOutput.CmsCarSubmodel
 caseOutput.CmsKeepDetail
 caseOutput.CmsAffiliateMaximizeMode
 caseOutput.CmsAffiliateWithAuth
 caseOutput.CmsAffiliateAuthUser
 caseOutput.CmsAffiliateAuthPassword
 caseOutput.CmsAffiliateLanguage
 caseOutput.BaseUrl
 caseOutput.MaximizeMode
 caseOutput.WithAuth
 caseOutput.AuthUser
 caseOutput.AuthPassword
 caseOutput.Version
 caseOutput.Referrer
 caseOutput.Language
 caseOutput.CarMake
 caseOutput.CarModel
 caseOutput.CarYear
 caseOutput.Submodel
 caseOutput.GenderMain
 caseOutput.MaritalStatus
 caseOutput.BirthDateMain
 caseOutput.YearDriving
 caseOutput.ClaimsNo
 caseOutput.VehicleUsage
 caseOutput.VehicleUsageForCommercial
 caseOutput.VehicleUsageDriveToWork
 caseOutput.VehicleUsageDriveToWorkOften
 caseOutput.TaxiOrVehicleForHire
 caseOutput.RentalVehicle
 caseOutput.GoodsTransportVehicle
 caseOutput.LogisticsOrCourierCompany
 caseOutput.GoodsTransportRoute
 caseOutput.PostalCode
 caseOutput.DeclaredNcb
 caseOutput.CarCamera
 caseOutput.UnderFinancing
 caseOutput.Tentative
 caseOutput.AlcoholFree
 caseOutput.PositiveCase
 caseOutput.ActualResult
 caseOutput.CmsPostLanguage
 caseOutput.CmsPostCarMake
 caseOutput.CmsPostCarModel
 caseOutput.CmsPostCarYear
 caseOutput.CmsPostCarSubmodel
 caseOutput.PolicyInsurer
 */
if(GlobalVariable.PrevStatus){
	IGNUemaHelper.printLog('GlobalVariable.PrevStatus:'+GlobalVariable.PrevStatus.toString())
	GlobalVariable.PrevStatus=false
	if(caseFactory.IsValid &&(caseFactory.CurrentCase>0)){
		IGNUemaHelper.printLog('caseFactory.IsValid=true')
		IGNUemaHelper.printLog(caseInput)
		String lStartFromCmsAffiliateMain=caseInput.StartFromCmsAffiliateMain.toString().trim()
		lStartFromCmsAffiliateMain='No'
		Boolean lIsStartFromCmsAffiliateMain=IGNUemaHelper.convertStringToBoolean(lStartFromCmsAffiliateMain)
		lStartFromCmsAffiliateMain=IGNUemaHelper.convertBooleanToYesNoString(lIsStartFromCmsAffiliateMain)
		caseOutput.StartFromCmsAffiliateMain=lStartFromCmsAffiliateMain
		String lStartFromCmsFormMain=caseInput.StartFromCmsFormMain.toString().trim()
		lStartFromCmsFormMain='No'
		Boolean lIsStartFromCmsFormMain=IGNUemaHelper.convertStringToBoolean(lStartFromCmsFormMain)
		lStartFromCmsFormMain=IGNUemaHelper.convertBooleanToYesNoString(lIsStartFromCmsFormMain)
		caseOutput.StartFromCmsFormMain=lStartFromCmsFormMain
		String lStartFromCmsFormMini=caseInput.StartFromCmsFormMini.toString().trim()
		lStartFromCmsFormMini='No'
		Boolean lIsStartFromCmsFormMini=IGNUemaHelper.convertStringToBoolean(lStartFromCmsFormMini)
		lStartFromCmsFormMini=IGNUemaHelper.convertBooleanToYesNoString(lIsStartFromCmsFormMini)
		caseOutput.StartFromCmsFormMini=lStartFromCmsFormMini
		caseFactory.SaveOutput()
		String lCmsAffiliateBaseUrlFormMain=caseInput.CmsAffiliateBaseUrlFormMain.toString().trim()+'/?nonce='+caseInput.CmsAffiliateBaseNonce.toString().trim()+'&psn='+caseInput.CmsAffiliateBasePsnNumber.toString().trim()
		if(!(GlobalVariable.BrowserInit)){
			IGNUemaHelper.printLog('BrowserInit Open')
			if(lIsStartFromCmsAffiliateMain){
				GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(lCmsAffiliateBaseUrlFormMain,IGNUemaHelper.convertStringToBoolean(caseInput.CmsAffiliateMaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.CmsAffiliateWithAuth),caseInput.CmsAffiliateAuthUser,caseInput.CmsAffiliateAuthPassword)
			}else{
				if(lIsStartFromCmsFormMain){
					if(lIsStartFromCmsFormMini){
						GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.CmsBaseUrlFormMini,IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth),caseInput.CmsAuthUser,caseInput.CmsAuthPassword)
						IGNUemaHelper.delayThreadSecond(1)
						if(!GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(2)
						}
						if(!GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(3)
						}
						IGNUemaHelper.delayThreadSecond(1)
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(2)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(1)
							WebUI.refresh()
							IGNUemaHelper.delayThreadSecond(3)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(1)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMini)
							IGNUemaHelper.delayThreadSecond(1)
							WebUI.refresh()
							IGNUemaHelper.delayThreadSecond(2)
						}
					}else{
						GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.CmsBaseUrlFormMain,IGNUemaHelper.convertStringToBoolean(caseInput.CmsMaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.CmsWithAuth),caseInput.CmsAuthUser,caseInput.CmsAuthPassword)
						IGNUemaHelper.delayThreadSecond(1)
						if(!GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(2)
						}
						if(!GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(3)
						}
						IGNUemaHelper.delayThreadSecond(1)
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(2)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(1)
							WebUI.refresh()
							IGNUemaHelper.delayThreadSecond(3)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(1)
						}
						if(GlobalVariable.BrowserInit){
							WebUI.navigateToUrl(caseInput.CmsBaseUrlFormMain)
							IGNUemaHelper.delayThreadSecond(1)
							WebUI.refresh()
							IGNUemaHelper.delayThreadSecond(2)
						}
					}
				}else{
					GlobalVariable.BrowserInit=IGNBrowserConfig.openBrowser(caseInput.BaseUrl,IGNUemaHelper.convertStringToBoolean(caseInput.MaximizeMode),IGNUemaHelper.convertStringToBoolean(caseInput.WithAuth),caseInput.AuthUser,caseInput.AuthPassword)
				}
			}
			if(GlobalVariable.BrowserInit){
				if(lIsStartFromCmsAffiliateMain){
					caseOutput.CmsAffiliateBaseUrlFormMain=lCmsAffiliateBaseUrlFormMain
					caseOutput.CmsAffiliateBaseNonce=caseInput.CmsAffiliateBaseNonce.toString().trim()
					caseOutput.CmsAffiliateBasePsnNumber=caseInput.CmsAffiliateBasePsnNumber.toString().trim()
					caseOutput.CmsAffiliateMaximizeMode=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsAffiliateMaximizeMode))
					caseOutput.CmsAffiliateWithAuth=IGNUemaHelper.convertBooleanToString(IGNUemaHelper.convertStringToBoolean(caseInput.CmsAffiliateWithAuth))
					caseOutput.CmsAffiliateAuthUser=caseInput.CmsAffiliateAuthUser
					caseOutput.CmsAffiliateAuthPassword=IGNUemaHelper.convertStringToPassword(caseInput.CmsAffiliateAuthPassword.toString())
				}else{
					if(lIsStartFromCmsFormMain){
						if(lIsStartFromCmsFormMini){
							caseOutput.CmsBaseUrlFormMini=caseInput.CmsBaseUrlFormMini
						}else{
							caseOutput.CmsBaseUrlFormMain=caseInput.CmsBaseUrlFormMain
						}
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
			caseUtil=null
			//TestName
			String lTestName='LowMileageCar_'+IGNUemaHelper.getExecutionProfile()+'_'+IGNUemaHelper.getCapabilityBrowserName(driver)+'_'+IGNUemaHelper.convertLocalDateTimeToString('yyyyMMddHHmmss')
			String lBaseUrl=''
			if(lIsStartFromCmsAffiliateMain){
				lBaseUrl=lCmsAffiliateBaseUrlFormMain
			}else{
				if(lIsStartFromCmsFormMain){
					if(lIsStartFromCmsFormMini){
						lBaseUrl=caseOutput.CmsBaseUrlFormMini.toString()
					}else{
						lBaseUrl=caseOutput.CmsBaseUrlFormMain.toString()
					}
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
			if(lIsStartFromCmsAffiliateMain){
				caseOutput.CmsAffiliateMaximizeMode=caseOutput.CmsAffiliateMaximizeMode+'|'+lTestName
			}else{
				if(lIsStartFromCmsFormMain){
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
			if(lIsStartFromCmsAffiliateMain){
				lLocatorToCheck1='.section .container .row'
				lBaseUrl=lCmsAffiliateBaseUrlFormMain
			}else{
				if(lIsStartFromCmsFormMain){
					lLocatorToCheck1='#step .top-car-brand'
					if(lIsStartFromCmsFormMini){
						lBaseUrl=caseInput.CmsBaseUrlFormMini
					}else{
						lBaseUrl=caseInput.CmsBaseUrlFormMain
					}
				}else{
					lLocatorToCheck1=IGNUemaHelper.getTagDataSeleniumKey('carBrand')
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
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck1)){
					WebUI.refresh()
				}
			}
			IGNUemaHelper.delayThreadSecond(0)
			Boolean ready1=false
			Boolean ready2=false
			if(lIsStartFromCmsAffiliateMain){
				ready1=IGNUemaHelper.checkElementPresentByLocator(driver,'.section .container .row',5)
				ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'.section .container .row',5)
			}else{
				if(lIsStartFromCmsFormMain){
					ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'main',5)
					ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#main',5)
				}else{
					ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'quotationInput',5)
					ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#quotationInput',5)
				}
			}
			runNext=(ready1&&ready2)
			IGNUemaHelper.delayThreadSecond(0)
			if(!runNext){
				KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
				IGNUemaHelper.FORCESTOP()
			}else{
				caseFactory.SaveOutput()
				caseUtil=new THALowMileageCarQuotationInputUtil(driver,selenium)
				//Check CmsLoaded
				if(lIsStartFromCmsFormMain){
					Map lMapCmsCarLanguage=[:]
					WebUI.navigateToUrl(lBaseUrl)
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.refresh()
					IGNUemaHelper.delayThreadSecond(2)
					lMapCmsCarLanguage=caseUtil.inputCmsLanguage('EN')
					if(!lMapCmsCarLanguage.Result){
						WebUI.navigateToUrl(lBaseUrl)
						lMapCmsCarLanguage=caseUtil.inputCmsLanguage('EN')
					}else{
						WebUI.refresh()
						IGNUemaHelper.delayThreadSecond(2)
					}
					WebUI.navigateToUrl(lBaseUrl)
					IGNUemaHelper.delayThreadSecond(1)
					WebUI.refresh()
					IGNUemaHelper.delayThreadSecond(2)
					if(!lMapCmsCarLanguage.Result){
						WebUI.navigateToUrl(lBaseUrl)
						lMapCmsCarLanguage=caseUtil.inputCmsLanguage('EN')
					}else{
						WebUI.refresh()
						IGNUemaHelper.delayThreadSecond(2)
					}
					WebUI.refresh()
					IGNUemaHelper.delayThreadSecond(2)
				}
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
				if(lIsStartFromCmsAffiliateMain){
					runNext=caseUtil.inputInputFromCmsAffiliate(caseInput,caseOutput)
				}else{
					if(lIsStartFromCmsFormMain){
						runNext=caseUtil.inputInputFromCmsRoojai(caseInput,caseOutput)
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