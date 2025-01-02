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
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationDetail1Factory
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationDetail1Type
import org.roojai.tha.types.roojaigroundpartneragent.roojaiquote.extendedwarranty.THARGPAExtendedWarrantyQuotationDetail1Util
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
TestData dataInput=TestDataFactory.findTestData(THARGPAExtendedWarrantyQuotationDetail1Type.INPUT_DATA_FILE_NAME)
TestData dataOutput=TestDataFactory.findTestData(THARGPAExtendedWarrantyQuotationDetail1Type.OUTPUT_DATA_FILE_NAME)
THARGPAExtendedWarrantyQuotationDetail1Factory caseFactory=new THARGPAExtendedWarrantyQuotationDetail1Factory(dataInput)
caseFactory.CurrentCase=GlobalVariable.CaseNumber
THARGPAExtendedWarrantyQuotationDetail1Type caseData=caseFactory.CaseData()
Map caseInput=caseData.Input
Map caseOutput=caseData.Output
WebDriver driver=null
WebDriver selenium=null
THARGPAExtendedWarrantyQuotationDetail1Util caseUtil=null
Boolean runNext=false
/*Input
 caseInput.BaseUrl
 caseInput.MaximizeMode
 caseInput.WithAuth
 caseInput.AuthUser
 caseInput.AuthPassword
 caseInput.Language
 caseInput.HolderEmail
 caseInput.HolderNewsletter
 caseInput.HolderPhoneNo
 caseInput.HolderCallMeNowToDo
 caseInput.CallMeNow
 caseInput.HolderIsPerson
 caseInput.HolderIsMain
 caseInput.CarForCommercial
 caseInput.CarPlateNumber
 caseInput.CarPlateProvince
 caseInput.BlueBookWarantyExpiryDate
 caseInput.BlueBookWarantyExpiryOffsetDate
 caseInput.BlueBookWarantyOdometer
 caseInput.HolderStatus
 caseInput.HolderDob
 caseInput.HolderIsThai
 caseInput.HolderThaiId
 caseInput.HolderOccupation
 caseInput.HolderPassport
 caseInput.HolderCountry
 caseInput.HolderName
 caseInput.HolderSurname
 caseInput.HolderCompId
 caseInput.HolderCompName
 caseInput.MainStatus
 caseInput.MainDob
 caseInput.MainIsThai
 caseInput.MainThaiId
 caseInput.MainOccupation
 caseInput.MainPassport
 caseInput.MainCountry
 caseInput.MainName
 caseInput.MainSurname
 caseInput.MainEmail
 caseInput.MainPhoneNo
 caseInput.AdditionDrivers
 caseInput.DriversHaveLicense
 caseInput.Driver1Status
 caseInput.Driver1Dob
 caseInput.Driver1IsThai
 caseInput.Driver1ThaiId
 caseInput.Driver1Passport
 caseInput.Driver1Country
 caseInput.Driver1Name
 caseInput.Driver1Surname
 caseInput.Driver1YearDriving
 caseInput.Driver1ClaimsNo
 caseInput.Driver1Occupation
 caseInput.Driver2Status
 caseInput.Driver2Dob
 caseInput.Driver2IsThai
 caseInput.Driver2ThaiId
 caseInput.Driver2Passport
 caseInput.Driver2Country
 caseInput.Driver2Name
 caseInput.Driver2Surname
 caseInput.Driver2YearDriving
 caseInput.Driver2ClaimsNo
 caseInput.Driver2Occupation
 caseInput.Driver3Status
 caseInput.Driver3Dob
 caseInput.Driver3IsThai
 caseInput.Driver3ThaiId
 caseInput.Driver3Passport
 caseInput.Driver3Country
 caseInput.Driver3Name
 caseInput.Driver3Surname
 caseInput.Driver3YearDriving
 caseInput.Driver3ClaimsNo
 caseInput.Driver3Occupation
 caseInput.PolicyStartDayOffset
 caseInput.PolicyStartDate
 caseInput.SubmitCallMeBack
 caseInput.CallMeBackEmail
 caseInput.CallMeBackMobile
 caseInput.PositiveCase
 */
/*Output
 caseOutput.BaseUrl
 caseOutput.MaximizeMode
 caseOutput.WithAuth
 caseOutput.AuthUser
 caseOutput.AuthPassword
 caseOutput.Language
 caseOutput.HolderEmail
 caseOutput.HolderNewsletter
 caseOutput.HolderPhoneNo
 caseOutput.HolderCallMeNowToDo
 caseOutput.CallMeNow
 caseOutput.HolderIsPerson
 caseOutput.HolderIsMain
 caseOutput.CarForCommercial
 caseOutput.CarPlateNumber
 caseOutput.CarPlateProvince
 caseOutput.BlueBookWarantyExpiryDate
 caseOutput.BlueBookWarantyExpiryOffsetDate
 caseOutput.BlueBookWarantyOdometer
 caseOutput.HolderStatus
 caseOutput.HolderDob
 caseOutput.HolderIsThai
 caseOutput.HolderThaiId
 caseOutput.HolderOccupation
 caseOutput.HolderPassport
 caseOutput.HolderCountry
 caseOutput.HolderName
 caseOutput.HolderSurname
 caseOutput.HolderCompId
 caseOutput.HolderCompName
 caseOutput.MainStatus
 caseOutput.MainDob
 caseOutput.MainIsThai
 caseOutput.MainThaiId
 caseOutput.MainOccupation
 caseOutput.MainPassport
 caseOutput.MainCountry
 caseOutput.MainName
 caseOutput.MainSurname
 caseOutput.MainEmail
 caseOutput.MainPhoneNo
 caseOutput.AdditionDrivers
 caseOutput.DriversHaveLicense
 caseOutput.Driver1Status
 caseOutput.Driver1Dob
 caseOutput.Driver1IsThai
 caseOutput.Driver1ThaiId
 caseOutput.Driver1Passport
 caseOutput.Driver1Country
 caseOutput.Driver1Name
 caseOutput.Driver1Surname
 caseOutput.Driver1YearDriving
 caseOutput.Driver1ClaimsNo
 caseOutput.Driver1Occupation
 caseOutput.Driver2Status
 caseOutput.Driver2Dob
 caseOutput.Driver2IsThai
 caseOutput.Driver2ThaiId
 caseOutput.Driver2Passport
 caseOutput.Driver2Country
 caseOutput.Driver2Name
 caseOutput.Driver2Surname
 caseOutput.Driver2YearDriving
 caseOutput.Driver2ClaimsNo
 caseOutput.Driver2Occupation
 caseOutput.Driver3Status
 caseOutput.Driver3Dob
 caseOutput.Driver3IsThai
 caseOutput.Driver3ThaiId
 caseOutput.Driver3Passport
 caseOutput.Driver3Country
 caseOutput.Driver3Name
 caseOutput.Driver3Surname
 caseOutput.Driver3YearDriving
 caseOutput.Driver3ClaimsNo
 caseOutput.Driver3Occupation
 caseOutput.PolicyStartDayOffset
 caseOutput.PolicyStartDate
 caseOutput.SubmitCallMeBack
 caseOutput.CallMeBackEmail
 caseOutput.CallMeBackMobile
 caseOutput.Positivecase
 caseOutput.ActualResult
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
				caseFactory.SaveOutput()
			}
		}
		if(GlobalVariable.BrowserInit){
			IGNUemaHelper.printLog('BrowserInit=true')
			IGNUemaHelper.printLog('Script Start')
			driver=DriverFactory.getWebDriver()
			selenium=driver
			caseUtil=new THARGPAExtendedWarrantyQuotationDetail1Util(driver,selenium)
			IGNUemaHelper.delayThreadSecond(0)
			Boolean ready1=IGNUemaHelper.checkElementPresentByElementId(driver,'policy1-v3',10)
			Boolean ready2=IGNUemaHelper.checkElementPresentByLocator(driver,'#policy1-v3',10)
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
				runNext=caseUtil.inputDetail1(caseInput,caseOutput)
				if(caseOutput.PositiveCase.toString().length()>0){
					if(!IGNUemaHelper.convertStringToBoolean(caseOutput.PositiveCase.toString())){
						String lPolicyInsurer=''
						Map lMapPolicyInsurer=caseUtil.inputPolicyInsurer(lPolicyInsurer)
						if(!lMapPolicyInsurer.Result){
							lPolicyInsurer=''
						}else{
							lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
						}
						caseOutput.PolicyInsurer=lPolicyInsurer
						String lOpportunityNumber=''
						Map lMapActualResult=caseUtil.inputActualResult(IGNUemaHelper.convertStringToBoolean(caseOutput.PositiveCase.toString()),caseOutput.HolderPhoneNo,false)
						if(!lMapActualResult.Result){
							lOpportunityNumber=''
						}else{
							lOpportunityNumber=lMapActualResult.OpportunityNumber
						}
						caseOutput.OpportunityNumber=lOpportunityNumber
					}
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