import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import java.util.List
import java.util.stream.Collectors
import java.util.stream.Stream
import org.apache.commons.collections.MultiMap
import org.apache.commons.collections.map.MultiValueMap
import org.dhatim.fastexcel.*
import org.dhatim.fastexcel.BorderSide
import org.dhatim.fastexcel.BorderStyle
import org.dhatim.fastexcel.Range
import org.dhatim.fastexcel.reader.*
import org.dhatim.fastexcel.reader.Cell
import org.dhatim.fastexcel.reader.ReadableWorkbook
import org.dhatim.fastexcel.reader.Row
import org.dhatim.fastexcel.reader.Sheet
import org.dhatim.fastexcel.StyleSetter
import org.dhatim.fastexcel.Workbook
import org.dhatim.fastexcel.Worksheet
import org.openqa.selenium.By as By
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.Point as Point
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.roojai.ignite.core.IGNGlobalConst
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultActual
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultExpected
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNRobotAuth as IGNRobotAuth
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.tha.types.kumka.loancar.THAKumkaLoanCarInputType
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNTestResultActual lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	Boolean lIsRunNext=true
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lIGNTestResultActualThisCase=IGNTestResultActual.PassedNoWarning
	}
	Map lMapParameterLeft=[:]
	Map lMapParameterRight=[:]
	Map lMapParameterFieldMappingSingleValue=[:]
	MultiMap lMultiMapParameterFieldMappingMultiValue=new MultiValueMap()
	Map lMapParameterMerge=[:]
	lMapParameterLeft.put('A','LA')
	lMapParameterLeft.put('B','LB')
	lMapParameterLeft.put('C','LC')
	lMapParameterLeft.put('D','')
	lMapParameterLeft.put('E','LE')
	lMapParameterLeft.put('F','LF')
	lMapParameterRight.put('B','')
	lMapParameterRight.put('C','')
	lMapParameterRight.put('D','RB')
	lMapParameterRight.put('E','')
	lMapParameterRight.put('F','RF')
	lMapParameterRight.put('G','RG')
	Boolean lIsMergeMapParameterMappingDirect=IGNUemaHelper.mergeMapParameterMappingDirect(true,true,true,true,true,lMapParameterLeft,lMapParameterRight,lMapParameterMerge)
	IGNUemaHelper.printLog('lIsMergeMapParameterMappingDirect='+IGNUemaHelper.convertBooleanToYesNoString(lIsMergeMapParameterMappingDirect))
	IGNUemaHelper.printLog(lMapParameterLeft)
	IGNUemaHelper.printLog(lMapParameterRight)
	IGNUemaHelper.printLog(lMapParameterMerge)
	lMapParameterFieldMappingSingleValue.put('A','B')
	lMapParameterFieldMappingSingleValue.put('B','C')
	lMapParameterFieldMappingSingleValue.put('E','H')
	Boolean lIsMergeMapParameterMappingIndirectSingleValue=IGNUemaHelper.mergeMapParameterMappingIndirectSingleValue(true,true,true,true,lMapParameterFieldMappingSingleValue,lMapParameterLeft,lMapParameterRight,lMapParameterMerge)
	IGNUemaHelper.printLog('lIsMergeMapParameterMappingIndirectSingleValue='+IGNUemaHelper.convertBooleanToYesNoString(lIsMergeMapParameterMappingIndirectSingleValue))
	IGNUemaHelper.printLog(lMapParameterLeft)
	IGNUemaHelper.printLog(lMapParameterRight)
	IGNUemaHelper.printLog(lMapParameterFieldMappingSingleValue)
	IGNUemaHelper.printLog(lMapParameterMerge)
	lMultiMapParameterFieldMappingMultiValue.put('A','B')
	lMultiMapParameterFieldMappingMultiValue.put('A','E')
	lMultiMapParameterFieldMappingMultiValue.put('B','C')
	lMultiMapParameterFieldMappingMultiValue.put('E','H')
	Boolean lIsMergeMapParameterMappingIndirectMultiValue=IGNUemaHelper.mergeMapParameterMappingIndirectMultiValue(true,true,true,true,lMultiMapParameterFieldMappingMultiValue,lMapParameterLeft,lMapParameterRight,lMapParameterMerge)
	IGNUemaHelper.printLog('lIsMergeMapParameterMappingIndirectMultiValue='+IGNUemaHelper.convertBooleanToYesNoString(lIsMergeMapParameterMappingIndirectMultiValue))
	IGNUemaHelper.printLog(lMapParameterLeft)
	IGNUemaHelper.printLog(lMapParameterRight)
	IGNUemaHelper.printLog(lMultiMapParameterFieldMappingMultiValue)
	IGNUemaHelper.printLog(lMapParameterMerge)
	try{
		IGNTestDataCountry lIGNTestDataCountry01=IGNTestDataCountry.valueOf('Indonesia')
		IGNUemaHelper.printLog(lIGNTestDataCountry01.equalsName('Indonesia'))
		IGNUemaHelper.printLog(lIGNTestDataCountry01.toString())
		IGNUemaHelper.printLog(lIGNTestDataCountry01.toRefString())
		IGNTestDataCountry lIGNTestDataCountry02=IGNTestDataCountry.fromRefNameToEnum('Thailand')
		IGNUemaHelper.printLog(IGNTestDataCountry.fromRefNameToString(lIGNTestDataCountry02.toString()))
	}catch(Exception e){
		IGNUemaHelper.printLog(e.getMessage())
	}
	IGNUemaHelper.printLog(IGNUemaHelper.restoreDataFileByCountryCompanyTypeProduct(IGNTestDataCountry.Thailand,IGNTestDataCompany.Roojai,IGNTestDataExcelStoreType.MultipleProductMultipleUser,'Regression','Cycle01'))
	IGNUemaHelper.printLog(IGNUemaHelper.restoreDataFileFromTestBlank())
	IGNUemaHelper.printLog(null)
	String lStrJsonText01=''
	String lStrJsonText02='Invalid_Json'
	String lStrJsonText03='{\"email\": \"example@com\", \"name\": \"John\"}'
	String lStrJsonText04='[{\"email\": \"example@com\", \"name\": \"John\"}]'
	IGNUemaHelper.printLog(IGNUemaHelper.checkStringJsonTextValid(lStrJsonText01))
	IGNUemaHelper.printLog(IGNUemaHelper.checkStringJsonTextValid(lStrJsonText02))
	IGNUemaHelper.printLog(IGNUemaHelper.checkStringJsonTextValid(lStrJsonText03))
	IGNUemaHelper.printLog(IGNUemaHelper.checkStringJsonTextValid(lStrJsonText04))
	IGNUemaHelper.printLog(IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText03))
	IGNUemaHelper.printLog(IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText04))
	lStrJsonText01='''{"Product_Type":"MotorCarX","root":{"Quote":{"Covers":[],"Health_Questions":null,"Policy_Auto_renewal_Flag":"","Policy_Start_Date":"0","Policy_End_Date":"3/6/25","Quote_Date_of_First_Quote":"0","Policy_Renewal_Invite_Count":"0","Endorsement_Effective_Date":"0","Policy_Number":"","Transaction_Type":"New Biz","Product_Type":"MotorCar","Geo_Postal_Code":"","Approved_Code":"","Question_Set_Code":"","Endorsement_Reason":"","Quote_Date_of_Quote":"2024-03-07T17:30:32.000533314Z","Insured_List":[{"Accidents":"0","Driving_Experience":"4","Gender":"Male","Marital_Status":"Married","Occupation":"Student","Occupation_Group":"null","Age":"30","DOB":"35208","Is_Main_Insured":"1"}],"Vehicle_Data":{"Red_Book_List_FamilyCode":"AVANZA","Red_Book_List_KerbWeight":"1045","Red_Book_List_Power":"97","Red_Book_List_Value_NewPrice":"140000000","Red_Book_List_SeatCapacity":"7","Cubic_Capacity":"1329","Odometer_Reading":"60000","Manufacture_Year":"2020","Car_Plate_Province":"B","Default_Value":"140000000","UW_Vehicle_Type":"110","Usage_Type":"SPT","Red_Book_List_Vehicle_Type_Code":"TOYO191000074334_19","Red_Book_List_BodyStyleDescription":"Mpv","UW_Premium_Class":"25","UW_Premium_Group":"18","Redbook_SI":"20000000","Vehicle_Accessories":[{"vehicleAccessoryName":"CarCamera","vehicleAccessoryValue":"1"}]}}}}'''
	lStrJsonText02='''{"Product_Type":"MotorCar","root":{"Quote":{"Covers":[],"Health_Questions":null,"Policy_Auto_renewal_Flag":"","Policy_Start_Date":"","Policy_End_Date":"","Quote_Date_of_First_Quote":"","Policy_Renewal_Invite_Count":"","Endorsement_Effective_Date":"","Policy_Number":"","Transaction_Type":"Endorsement","Product_Type":"MotorCar","Geo_Postal_Code":"","Approved_Code":"","Question_Set_Code":"","Endorsement_Reason":"","Quote_Date_of_Quote":"2024-03-07T17:30:32.000062544Z","Insured_List":[{"Accidents":"None","Driving_Experience":"None","Gender":"Female","Marital_Status":"Single","Occupation":"Teacher","Occupation_Group":"None","Age":"None","DOB":"None","Is_Main_Insured":"None"}],"Vehicle_Data":{"Red_Book_List_FamilyCode":"None","Red_Book_List_KerbWeight":"None","Red_Book_List_Power":"None","Red_Book_List_Value_NewPrice":"None","Red_Book_List_SeatCapacity":"None","Cubic_Capacity":"None","Odometer_Reading":"None","Manufacture_Year":"None","Car_Plate_Province":"None","Default_Value":"None","UW_Vehicle_Type":"None","Usage_Type":"None","Red_Book_List_Vehicle_Type_Code":"None","Red_Book_List_BodyStyleDescription":"None","UW_Premium_Class":"None","UW_Premium_Group":"None","Redbook_SI":"None","Vehicle_Accessories":[],"ZNew":"NewValue"}}}}'''
	lStrJsonText01=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText01)
	IGNUemaHelper.printLog(lStrJsonText01)
	lStrJsonText02=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText02)
	IGNUemaHelper.printLog(lStrJsonText02)
	lStrJsonText03=IGNUemaHelper.mergeStringJsonTextFromOrgByUpdForGeneric(lStrJsonText01,lStrJsonText02,true,true,true)
	lStrJsonText03=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText03)
	IGNUemaHelper.printLog(lStrJsonText03)
	lStrJsonText03=IGNUemaHelper.mergeStringJsonTextFromOrgByUpdForGeneric(lStrJsonText01,lStrJsonText02,true,true,false)
	lStrJsonText03=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText03)
	IGNUemaHelper.printLog(lStrJsonText03)
	lStrJsonText03=IGNUemaHelper.mergeStringJsonTextFromOrgByUpdForPricingAPI(lStrJsonText01,lStrJsonText02,true,true,true)
	lStrJsonText03=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText03)
	IGNUemaHelper.printLog(lStrJsonText03)
	lStrJsonText03=IGNUemaHelper.mergeStringJsonTextFromOrgByUpdForPricingAPI(lStrJsonText01,lStrJsonText02,true,true,false)
	lStrJsonText03=IGNUemaHelper.getStringJsonTextPrettyPrintFromString(lStrJsonText03)
	IGNUemaHelper.printLog(lStrJsonText03)
	String lStr01=' 00045 sdfj '
	IGNUemaHelper.printLog(IGNUemaHelper.trimStringLeft(lStr01))
	IGNUemaHelper.printLog(IGNUemaHelper.trimStringRight(lStr01))
	List<String> lList01=IGNUemaHelper.getStringEncodedForExcelCell(lStr01)
	IGNUemaHelper.printLog(lList01)
	lStr01=IGNUemaHelper.getStringDecodedForExcelCell(lList01)
	IGNUemaHelper.printLog(lStr01)
	Float lVarFloat=10.05
	lStr01=lVarFloat.toString()
	IGNUemaHelper.printLog(lStr01)
	Integer lVarInteger=IGNUemaHelper.convertStringValueToDataTypeByStringDataType(lStr01,'Integer')
	lStr01=lVarInteger.toString()
	IGNUemaHelper.printLog(lStr01)
	String lStrExcelFileName='Data Files/Release_UAT/Roojai/IDN/IGNGenericTemplatePricingAPI_MotorCar.xlsm'
	IGNUemaHelper.printLog(IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS())
	Boolean lIsOpenExcelApplication=IGNUemaHelper.runExcelMacroFromExcelFileName(lStrExcelFileName,'SpillWorksheetPricingAPI')
	IGNUemaHelper.printLog('lIsOpenExcelApplication='+IGNUemaHelper.convertBooleanToYesNoString(lIsOpenExcelApplication))
	IGNUemaHelper.printLog(IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS())
	Boolean lIsBoolean=false
	lIsBoolean=IGNUemaHelper.checkStringContainString('https://insure.uat-roojai.com/motorbike/#/quotationInput','/QUOTE/')
	IGNUemaHelper.printLog(IGNUemaHelper.convertBooleanToYesNoString(lIsBoolean))
	lIsBoolean=IGNUemaHelper.checkStringContainString('https://insure.uat-roojai.com/quote/#/?productType=Motorbike','/QUOTE/')
	List<Integer> lArrayListOfInteger1=[]
	Integer lRandomInteger1=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lArrayListOfInteger1)
	IGNUemaHelper.printLog(lRandomInteger1.toString())
	lArrayListOfInteger1.add(5)
	lArrayListOfInteger1.add(8)
	lRandomInteger1=IGNUemaHelper.getRandomIntegerFromArrayListOfInteger(lArrayListOfInteger1)
	IGNUemaHelper.printLog(lRandomInteger1.toString())
	Set<Integer> lArraySetOfInteger1=[]
	Integer lRandomInteger2=IGNUemaHelper.getRandomIntegerFromArraySetOfInteger(lArraySetOfInteger1)
	IGNUemaHelper.printLog(lRandomInteger2.toString())
	lArraySetOfInteger1.add(5)
	lArraySetOfInteger1.add(8)
	lRandomInteger2=IGNUemaHelper.getRandomIntegerFromArraySetOfInteger(lArraySetOfInteger1)
	IGNUemaHelper.printLog(lRandomInteger2.toString())
	List<String> lArrayListOfString1=[]
	String lRandomString1=IGNUemaHelper.getRandomStringFromArrayListOfString(lArrayListOfString1)
	IGNUemaHelper.printLog(lRandomString1.toString())
	lArrayListOfString1.add('auhfd5')
	lArrayListOfString1.add('opidfds')
	lRandomString1=IGNUemaHelper.getRandomStringFromArrayListOfString(lArrayListOfString1)
	IGNUemaHelper.printLog(lRandomString1.toString())
	Set<String> lArraySetOfString1=[]
	String lRandomString2=IGNUemaHelper.getRandomStringFromArraySetOfString(lArraySetOfString1)
	IGNUemaHelper.printLog(lRandomString2.toString())
	lArraySetOfString1.add('okfdd')
	lArraySetOfString1.add('iejre')
	lRandomString2=IGNUemaHelper.getRandomStringFromArraySetOfString(lArraySetOfString1)
	IGNUemaHelper.printLog(lRandomString2.toString())
	IGNUemaHelper.printLog(IGNUemaHelper.convertBooleanToYesNoString(lIsBoolean))
	IGNUemaHelper.printLog(IGNUemaHelper.randomIDThaiOrPassportNumber(false,true))
	IGNUemaHelper.printLog(IGNUemaHelper.randomIDThaiOrPassportNumber(true,true))
	IGNUemaHelper.printLog(IGNUemaHelper.randomIDThaiOrPassportNumber(true,false))
	IGNUemaHelper.printLog(IGNUemaHelper.validateVersionString('','A'))
	IGNUemaHelper.printLog(IGNUemaHelper.validateVersionString('-a-x-c  -','A'))
	IGNUemaHelper.printLog(IGNUemaHelper.convertStringToPassword('1234567'))
	IGNUemaHelper.printLog(IGNUemaHelper.convertStringToBoolean('OOK').toString())
	IGNUemaHelper.printLog(IGNUemaHelper.convertStringToInteger('A78',7).toString())
	IGNUemaHelper.printLog(IGNUemaHelper.randomCarPlateNumberThailand())
	IGNUemaHelper.printLog(IGNUemaHelper.randomCarPlateNumberGeneral())
	IGNUemaHelper.printLog(IGNUemaHelper.randomStringAlphabetEngAndNum(17,false))
	IGNUemaHelper.printLog(IGNUemaHelper.randomStringAlphabetEngAndNum(17,true))
	IGNUemaHelper.printLog(IGNUemaHelper.randomChasisNumber())
	IGNUemaHelper.printLog(IGNUemaHelper.extractStringArrayFromDateStringSlashDDMMYYYY('1/1/2020/1/1/2020'))
	IGNUemaHelper.printLog(IGNUemaHelper.extractStringArrayFromDateStringSlashDDMMYYYY('01/01/2020'))
	IGNUemaHelper.printLog(IGNUemaHelper.convertDateStringFromEngToThai(''))
	IGNUemaHelper.printLog(IGNUemaHelper.convertDateStringFromEngToThai('0/0/0'))
	IGNUemaHelper.printLog(IGNUemaHelper.convertDateStringFromThaiToEng(''))
	IGNUemaHelper.printLog(IGNUemaHelper.convertDateStringFromThaiToEng('0/0/0'))
	String lText='Auto / 1.2 / E T2+ '
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringToURLEncodedString(lText)
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringToURLDecodedString(lText)
	IGNUemaHelper.printLog(lText)
	lText='holder@@mail.com'
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringEmailToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	lText='chatchai.bun@rail.mail.com'
	IGNUemaHelper.printLog(lText)
	IGNUemaHelper.printLog(lText.length())
	lText=IGNUemaHelper.convertStringEmailToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	IGNUemaHelper.printLog(lText.length())
	lText='chatchai.bun@roojai.com'
	IGNUemaHelper.printLog(lText)
	IGNUemaHelper.printLog(lText.length())
	lText=IGNUemaHelper.convertStringEmailToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	IGNUemaHelper.printLog(lText.length())
	lText='786'
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringPhoneToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	lText='1786'
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringPhoneToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	lText='0638961786'
	IGNUemaHelper.printLog(lText)
	lText=IGNUemaHelper.convertStringPhoneToMyAccountMaskText(lText)
	IGNUemaHelper.printLog(lText)
	try{
		IGNUemaHelper.FORCESTOP()
	}catch(Exception e){
		//e.printStackTrace()
	}
	def xlsWorkbook
	try{
		xlsWorkbook=ExcelKeywords.getWorkbook(THAKumkaLoanCarInputType.OUTPUT_EXCEL_FILE_NAME)
	}catch(Exception e){
	}
	def xlsSheetOrg
	def xlsSheetNew
	def xlsSheetClone
	try{
		xlsSheetOrg=ExcelKeywords.getExcelSheet(xlsWorkbook,THAKumkaLoanCarInputType.OUTPUT_EXCEL_SHEET_NAME)
	}catch(Exception e){
	}
	try{
		if(xlsSheetOrg){
			xlsSheetClone=xlsWorkbook.cloneSheet(xlsWorkbook.getSheetIndex(xlsSheetOrg))
			if(xlsSheetClone){
				xlsWorkbook.setSheetName(xlsWorkbook.getSheetIndex(xlsSheetClone),THAKumkaLoanCarInputType.OUTPUT_EXCEL_SHEET_NAME+'.Case00Def')
				IGNUemaHelper.printLog('Cloned')
				xlsWorkbook.removeSheetAt(xlsWorkbook.getNumberOfSheets()-1)
				IGNUemaHelper.printLog('Removed')
			}else{
				IGNUemaHelper.printLog('Cannot Clone')
			}
		}
	}catch(Exception e){
	}
	try{
		if(xlsWorkbook){
			IGNUemaHelper.saveExcelWorkbookByFileName(THAKumkaLoanCarInputType.OUTPUT_EXCEL_FILE_NAME,xlsWorkbook)
		}
	}catch(Exception e){
	}
	IGNBrowserConfig.openBrowser('https://www.google.com',true,false,'','')
	ldriver=DriverFactory.getWebDriver()
	List<WebElement> lElementListA=IGNUemaHelper.getWebElementListFromCssLocator(ldriver,'*')
	List<WebElement> lElementListB=IGNUemaHelper.getWebElementListFromCssLocator(ldriver,'html>*')
	Boolean lCloneWebElementListFromWebElementList=IGNUemaHelper.cloneWebElementListFromWebElementList(lElementListB,lElementListA)
	IGNUemaHelper.printLog('lCloneWebElementListFromWebElementList:'+lCloneWebElementListFromWebElementList)
	lMapSetBrowserWindowModeSize=IGNUemaHelper.setBrowserWindowModeSize(ldriver,false,500,500)
	IGNUemaHelper.printLog('lMapSetBrowserWindowModeSize='+lMapSetBrowserWindowModeSize.toString())
	String lMainWindow=ldriver.getWindowHandle()
	if(lMainWindow.length()<=0){
		lMainWindow=ldriver.getWindowHandle()
	}
	String lUrlToNavigate=''
	Boolean lIsOpenNewBrowserTab=IGNUemaHelper.openNewBrowserTab(ldriver,lUrlToNavigate)
	IGNUemaHelper.printLog('lIsOpenNewBrowserTab='+lIsOpenNewBrowserTab.toString())
	try{
		Set<String> lSetWinHandle=ldriver.getWindowHandles()
		if(!lSetWinHandle){
			IGNUemaHelper.delayThreadSecond(1)
			lSetWinHandle=ldriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(1)
				lSetWinHandle=ldriver.getWindowHandles()
			}
		}
		if(!lSetWinHandle){
			IGNUemaHelper.delayThreadSecond(2)
			lSetWinHandle=ldriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(2)
				lSetWinHandle=ldriver.getWindowHandles()
			}
		}
		if(!lSetWinHandle){
			IGNUemaHelper.delayThreadSecond(3)
			lSetWinHandle=ldriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(3)
				lSetWinHandle=ldriver.getWindowHandles()
			}
		}
		if(!lSetWinHandle){
			IGNUemaHelper.delayThreadSecond(4)
			lSetWinHandle=ldriver.getWindowHandles()
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.delayThreadSecond(4)
				lSetWinHandle=ldriver.getWindowHandles()
			}
		}
		if(!lSetWinHandle){
			IGNUemaHelper.printLog('lSetWinHandle=null')
		}else{
			if(lSetWinHandle.size()<=1){
				IGNUemaHelper.printLog('lSetWinHandle<=1')
			}
		}
		for(String lWindowHandle:lSetWinHandle){
			if(lMainWindow.equals(lWindowHandle)){
				ldriver.close()
				IGNUemaHelper.delayThreadSecond(1)
			}
		}
		lSetWinHandle=ldriver.getWindowHandles()
		if(!lSetWinHandle){
			IGNUemaHelper.printLog('lSetWinHandle=null')
		}else{
			if(lSetWinHandle.size()<1){
				IGNUemaHelper.printLog('lSetWinHandle<1')
			}
		}
		for(String lWindowHandle:lSetWinHandle){
			ldriver.switchTo().window(lWindowHandle)
			IGNUemaHelper.delayThreadSecond(2)
			IGNUemaHelper.setBrowserWindowPosition(ldriver,0,0)
			IGNUemaHelper.delayThreadSecond(1)
		}
	}catch(Exception ex){
	}
	try{
		((JavascriptExecutor)ldriver).executeScript('lambda-status=passed','')
	}catch(Exception ex){
	}
	IGNUemaHelper.delayThreadSecond(10)
	IGNBrowserConfig.closeBrowser()
	IGNBrowserConfig.killBrowserAll()
	IGNBrowserConfig.killBrowserGlobal()
	Map lMapQuery=IGNUemaHelper.extractURLStringToMapQuery('https://insure.uat-roojai.com/motorbike/#/paymentComplete?opportunityNumber=jzre3Iid4o23ObkMj8wg%2FQ%3D%3D&lang=TH',false,false)
	IGNUemaHelper.printLog(lMapQuery.toString())
	InputStream lFileInputStreamExcelSrc=new FileInputStream('!!!Master_Files!!!/!!!!!Roojai/IGN/Data Files/Test/LargeFileForTest.xlsx')
	ReadableWorkbook lReadableWorkbookExcelSrc=new ReadableWorkbook(lFileInputStreamExcelSrc)
	Map<String,Table> lMapExcelSheetListSrc=new HashMap<String,Table>()
	List<Sheet> lSheetListSrc=lReadableWorkbookExcelSrc.getSheets().collect(Collectors.toList())
	if(!IGNUemaHelper.checkObjectNullOfObject(lSheetListSrc)){
		lSheetListSrc.removeAll(Collections.singletonList(null))
		lSheetListSrc.eachWithIndex{lSheetItemSrc,lSheetIndexSrc->
			if(!IGNUemaHelper.checkObjectNullOfObject(lSheetItemSrc)){
				Table<Integer,Integer,String> lTableExcelSheetSrc=HashBasedTable.create()
				List<Row> lRowListSrc=lSheetItemSrc.openStream().collect(Collectors.toList())
				lRowListSrc.removeAll(Collections.singletonList(null))
				lRowListSrc.eachWithIndex{lRowItemSrc,lRowIndexSrc->
					if(!IGNUemaHelper.checkObjectNullOfObject(lRowListSrc)){
						Integer lRowIndexSrcNum=lRowItemSrc.getRowNum()-1
						Integer lCellCount=lRowItemSrc.getPhysicalCellCount()
						List<Cell> lCellListSrc=lRowItemSrc.getCells(0,lCellCount)
						lCellListSrc.removeAll(Collections.singletonList(null))
						lCellListSrc.eachWithIndex{lCellItemSrc,lCellIndexSrc->
							if(!IGNUemaHelper.checkObjectNullOfObject(lCellItemSrc)){
								if(!IGNUemaHelper.checkObjectNullOrEmptyOfString(lCellItemSrc.getRawValue())){
									lTableExcelSheetSrc.put(lRowIndexSrcNum,lCellItemSrc.getColumnIndex(),lCellItemSrc.getRawValue())
								}
							}
						}
					}
				}
				lMapExcelSheetListSrc.put(lSheetItemSrc.getName(),lTableExcelSheetSrc)
			}
		}
	}
	lReadableWorkbookExcelSrc.close()
	lFileInputStreamExcelSrc.close()
	if(lMapExcelSheetListSrc.size()>0){
		OutputStream lFileOutputStreamExcelDst=new FileOutputStream('Reports/LargeFileForTest.xlsx')
		Workbook lWorkbookExcelDst=new Workbook(lFileOutputStreamExcelDst,'IgniteExcel','1.1')
		for(Map.Entry lEntryExcelSheetItemSrc in lMapExcelSheetListSrc){
			Worksheet lWorksheetDst=lWorkbookExcelDst.newWorksheet(lEntryExcelSheetItemSrc.key)
			Boolean lIsWorksheetInput=lEntryExcelSheetItemSrc.key.toString().contains('.Input')
			Integer lTableExcelRowMaxSrc=0
			Integer lTableExcelColMaxSrc=0
			if(!IGNUemaHelper.checkObjectNullOfObject(lEntryExcelSheetItemSrc.value)){
				Table<Integer,Integer,String> lTableExcelSheetSrc=HashBasedTable.create(lEntryExcelSheetItemSrc.value)
				lTableExcelRowMaxSrc=Collections.max(lTableExcelSheetSrc.rowKeySet())
				lTableExcelColMaxSrc=Collections.max(lTableExcelSheetSrc.columnKeySet())
				if(lTableExcelColMaxSrc>0){
					lWorksheetDst.range(0,0,0,lTableExcelColMaxSrc).style().bold().set()
					if(lTableExcelRowMaxSrc>0){
						//lWorksheetDst.range(1,1,lTableExcelRowMaxSrc,lTableExcelColMaxSrc).style().verticalAlignment('top').horizontalAlignment('left').wrapText(true).set()
					}
				}
				if(lIsWorksheetInput){
					lWorksheetDst.freezePane(2,1)
					lWorksheetDst.width(1,20)
				}else{
					lWorksheetDst.freezePane(1,1)
				}
				Set<Table.Cell<Integer,Integer,String>> lSetExcelCellListSrc=lTableExcelSheetSrc.cellSet()
				for(Table.Cell<Integer,Integer,String> lSetExcelCellItemSrc in lSetExcelCellListSrc){
					Integer lExcelCellRowSrc=lSetExcelCellItemSrc.getRowKey()
					Integer lExcelCellColSrc=lSetExcelCellItemSrc.getColumnKey()
					String lExcelCellTextSrc=lSetExcelCellItemSrc.getValue()
					lWorksheetDst.value(lExcelCellRowSrc,lExcelCellColSrc,lExcelCellTextSrc)
					//lWorksheetDst.range(lExcelCellRowSrc,lExcelCellColSrc,lExcelCellRowSrc,lExcelCellColSrc).style().verticalAlignment('top').horizontalAlignment('left').set()
					if(lExcelCellRowSrc>0){
						if(lExcelCellColSrc>0){
							//lWorksheetDst.range(lExcelCellRowSrc,lExcelCellColSrc,lExcelCellRowSrc,lExcelCellColSrc).style().verticalAlignment('top').horizontalAlignment('left').wrapText(true).set()
						}
					}
				}
			}
			lWorksheetDst.close()
			break
		}
		try{
			lWorkbookExcelDst.finish()
			lFileOutputStreamExcelDst.flush()
			lFileOutputStreamExcelDst.close()
		}catch(Exception e){
		}
	}
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
	try{
		IGNUemaHelper.printLog('PageException='+e.message)
	}catch(Exception ex){
		IGNUemaHelper.printLog('PageExceptionOfException='+ex.message)
	}
	lIGNTestResultActualThisCase=IGNTestResultActual.Error
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
try{
	switch(lIGNTestResultActualThisCase){
		case IGNTestResultActual.PassedNoWarning:
			KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.PassedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedNoWarning:
			KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		default:
			KeywordUtil.markError(GlobalVariable.TestCaseFullName)
			break
	}
}catch(Exception e){
}
return null