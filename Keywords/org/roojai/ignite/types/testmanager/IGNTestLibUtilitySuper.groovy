package org.roojai.ignite.types.testmanager
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
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestStoryAfterToDo
public abstract class IGNTestLibUtilitySuper{
	protected IGNTestExecutorTypeItem parentIGNTestExecutorTypeItem
	protected Integer numTestStoryKey=0
	protected String strTestStoryKey=''
	protected String strTestStoryName=''
	protected IGNTestStoryAfterToDo enumIGNTestStoryAfterToDo
	protected String strIGNTestLibUtilitySuperMessage=''
	protected Boolean isIGNTestLibUtilitySuperValid=false
	protected String strIGNTestExecutorTypeItemTestStoryGroupNameFull=''
	protected String strIGNTestExecutorTypeItemTestStoryGroupNameProg=''
	protected String strIGNTestExecutorTypeItemTestStoryCaseNameFull=''
	protected String strIGNTestExecutorTypeItemTestStoryCaseNameProg=''
	protected WebDriver webDriver=null
	protected WebDriver webSelenium=null
	protected Boolean isWebBrowserInit=false
	protected String strLamdaTestCaseName=''
	protected Boolean isLamdaTestResult=false
	protected String strLamdaTestResult=''
	public IGNTestLibUtilitySuper(IGNTestExecutorTypeItem ignTestExecutorTypeItem,Integer numInitTestStoryKey,String strInitTestStoryName,IGNTestStoryAfterToDo enumInitIGNTestStoryAfterToDo){
		super()
		try{
			this.parentIGNTestExecutorTypeItem=ignTestExecutorTypeItem
			this.numTestStoryKey=numInitTestStoryKey
			this.strTestStoryName=strInitTestStoryName.trim()
			this.enumIGNTestStoryAfterToDo=enumInitIGNTestStoryAfterToDo
			this.strIGNTestLibUtilitySuperMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestExecutorTypeItem)){
				this.initIGNTestLibUtilitySuper()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestLibUtilitySuper(){
		try{
			this.isIGNTestLibUtilitySuperValid=false
			Boolean lIsIGNTestLibUtilitySuperValid=true
			this.strTestStoryKey=String.format('%04d',this.numTestStoryKey)
			this.strIGNTestExecutorTypeItemTestStoryGroupNameFull=this.parentIGNTestExecutorTypeItem.getStrTestCaseDataCurrentInputTestStoryGroupName()
			this.strIGNTestExecutorTypeItemTestStoryGroupNameProg=this.parentIGNTestExecutorTypeItem.getStrTestStoryGroupName()
			this.strIGNTestExecutorTypeItemTestStoryCaseNameFull=this.parentIGNTestExecutorTypeItem.getStrTestCaseDataCurrentInputTestStoryCaseName()
			this.strIGNTestExecutorTypeItemTestStoryCaseNameProg=this.strIGNTestExecutorTypeItemTestStoryCaseNameFull.replaceAll('_','').trim()
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.numTestStoryKey>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strTestStoryKey.length()>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strTestStoryName.length()>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strIGNTestExecutorTypeItemTestStoryGroupNameFull.length()>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strIGNTestExecutorTypeItemTestStoryGroupNameProg.length()>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strIGNTestExecutorTypeItemTestStoryCaseNameFull.length()>0)
			lIsIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid&&(this.strIGNTestExecutorTypeItemTestStoryCaseNameProg.length()>0)
			this.isIGNTestLibUtilitySuperValid=lIsIGNTestLibUtilitySuperValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestExecutorTypeItem getParentIGNTestExecutorTypeItem(){
		try{
			return this.parentIGNTestExecutorTypeItem
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestExecutorTypeItem(IGNTestExecutorTypeItem newParentIGNTestExecutorTypeItem){
		//Do Nothing
		//this.parentIGNTestExecutorTypeItem=newParentIGNTestExecutorTypeItem
	}
	public Integer getNumTestStoryKey(){
		try{
			return this.numTestStoryKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setNumTestStoryKey(Integer newNumTestStoryKey){
		//Do Nothing
		//this.numTestStoryKey=newNumTestStoryKey
	}
	public String getStrTestStoryKey(){
		try{
			return this.strTestStoryKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestStoryKey(String newStrTestStoryKey){
		//Do Nothing
		//this.strTestStoryKey=newStrTestStoryKey
	}
	public String getStrTestStoryName(){
		try{
			return this.strTestStoryName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrTestStoryName(String newStrTestStoryName){
		//Do Nothing
		//this.strTestStoryName=newStrTestStoryName
	}
	public IGNTestStoryAfterToDo getEnumIGNTestStoryAfterToDo(){
		try{
			return this.enumIGNTestStoryAfterToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setEnumIGNTestStoryAfterToDo(IGNTestStoryAfterToDo newEnumIGNTestStoryAfterToDo){
		//Do Nothing
		//this.enumIGNTestStoryAfterToDo=newEnumIGNTestStoryAfterToDo
	}
	public String getStrIGNTestLibUtilitySuperMessage(){
		try{
			return this.strIGNTestLibUtilitySuperMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestLibUtilitySuperMessage(String newStrIGNTestLibUtilitySuperMessage){
		//Do Nothing
		//this.strIGNTestLibUtilitySuperMessage=newStrIGNTestLibUtilitySuperMessage
	}
	public Boolean getIsIGNTestLibUtilitySuperValid(){
		try{
			return this.isIGNTestLibUtilitySuperValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestLibUtilitySuperValid(Boolean newIsIGNTestLibUtilitySuperValid){
		//Do Nothing
		//this.isIGNTestLibUtilitySuperValid=newIsIGNTestLibUtilitySuperValid
	}
	public String getStrIGNTestExecutorTypeItemTestStoryGroupNameFull(){
		try{
			return this.strIGNTestExecutorTypeItemTestStoryGroupNameFull
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorTypeItemTestStoryGroupNameFull(String newStrIGNTestExecutorTypeItemTestStoryGroupNameFull){
		try{
			this.strIGNTestExecutorTypeItemTestStoryGroupNameFull=newStrIGNTestExecutorTypeItemTestStoryGroupNameFull
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestExecutorTypeItemTestStoryGroupNameProg(){
		try{
			return this.strIGNTestExecutorTypeItemTestStoryGroupNameProg
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorTypeItemTestStoryGroupNameProg(String newStrIGNTestExecutorTypeItemTestStoryGroupNameProg){
		try{
			this.strIGNTestExecutorTypeItemTestStoryGroupNameProg=newStrIGNTestExecutorTypeItemTestStoryGroupNameProg
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestExecutorTypeItemTestStoryCaseNameFull(){
		try{
			return this.strIGNTestExecutorTypeItemTestStoryCaseNameFull
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorTypeItemTestStoryCaseNameFull(String newStrIGNTestExecutorTypeItemTestStoryCaseNameFull){
		try{
			this.strIGNTestExecutorTypeItemTestStoryCaseNameFull=newStrIGNTestExecutorTypeItemTestStoryCaseNameFull
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestExecutorTypeItemTestStoryCaseNameProg(){
		try{
			return this.strIGNTestExecutorTypeItemTestStoryCaseNameProg
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestExecutorTypeItemTestStoryCaseNameProg(String newStrIGNTestExecutorTypeItemTestStoryCaseNameProg){
		try{
			this.strIGNTestExecutorTypeItemTestStoryCaseNameProg=newStrIGNTestExecutorTypeItemTestStoryCaseNameProg
		}catch(Exception e){
			//e.printStackTrace()
			try{
				//this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public WebDriver getWebDriver(){
		try{
			return this.webDriver
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setWebDriver(WebDriver newWebDriver){
		//Do Nothing
		//this.webDriver=newWebDriver
	}
	public WebDriver getWebSelenium(){
		try{
			return this.webSelenium
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setWebSelenium(WebDriver newWebSelenium){
		//Do Nothing
		//this.webSelenium=newWebSelenium
	}
	public Boolean getIsWebBrowserInit(){
		try{
			return this.isWebBrowserInit
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setIsWebBrowserInit(Boolean newIsWebBrowserInit){
		try{
			//this.isWebBrowserInit=newIsWebBrowserInit
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public String getStrLamdaTestCaseName(){
		try{
			return this.strLamdaTestCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrLamdaTestCaseName(String newStrLamdaTestCaseName){
		try{
			//this.strLamdaTestCaseName=newStrLamdaTestCaseName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsLamdaTestResult(){
		try{
			return this.isLamdaTestResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setIsLamdaTestResult(Boolean newIsLamdaTestResult){
		try{
			//this.isLamdaTestResult=newIsLamdaTestResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public String getStrLamdaTestResult(){
		try{
			return this.strLamdaTestResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public void setStrLamdaTestResult(String newStrLamdaTestResult){
		try{
			//this.strLamdaTestResult=newStrLamdaTestResult
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
	}
	public Boolean browserInit(String strBaseURL,Boolean isMaximize=false,Boolean isAuth=false,String strUserName='',String strPassword=''){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsBrowserInit=false
		try{
			lIsBrowserInit=IGNBrowserConfig.openBrowser(strBaseURL,isMaximize,isAuth,strUserName,strPassword)
			if(lIsBrowserInit){
				this.webDriver=DriverFactory.getWebDriver()
				lIsBrowserInit=lIsBrowserInit&&(!IGNUemaHelper.checkObjectNullOfObject(this.webDriver))
			}
			if(lIsBrowserInit){
				this.webSelenium=this.webDriver
			}
			GlobalVariable.BrowserInit=lIsBrowserInit
			this.isWebBrowserInit=lIsBrowserInit
			if(lIsBrowserInit&&(!IGNUemaHelper.checkObjectNullOfObject(this.webDriver))){
				String lTestName=''
				if(this.parentIGNTestExecutorTypeItem.getParentIGNTestExecutorFactory().getParentIGNTestConductor().getParentIGNTestManager().getEnumIGNTestForCountry()==IGNTestForCountry.Indonesia){
					lTestName='IDN_'
				}else{
					lTestName='THA_'
				}
				String lStrBaseURL=strBaseURL.toString()
				if(IGNUemaHelper.checkStringContainString(lStrBaseURL,'UAT')){
					lTestName='UAT_'
				}else{
					lTestName='PROD_'
				}
				lTestName=lTestName+'Case'+this.parentIGNTestExecutorTypeItem.getStrCaseIndex()+'_'
				lTestName=lTestName+this.strTestStoryName+'_'+IGNUemaHelper.getCapabilityBrowserName(this.webDriver)+'_'+IGNUemaHelper.convertLocalDateTimeToString('yyyyMMddHHmmss')
				this.strLamdaTestCaseName=lTestName
				IGNUemaHelper.printLog('TestName:'+lTestName)
				this.parentIGNTestExecutorTypeItem.strTestCaseDataCurrentInputTestCaseResultMessage=IGNUemaHelper.concatMessageLeftRightByEnter(lTestName,this.parentIGNTestExecutorTypeItem.strTestCaseDataCurrentInputTestCaseResultMessage)
				String lJsLambdaTestName='lambda-name='+lTestName
				if(IGNUemaHelper.checkRemoteTargetDriverExecution()){
					try{
						((JavascriptExecutor)this.webDriver).executeScript(lJsLambdaTestName,'')
					}catch(Exception ex){
						//ex.printStackTrace()
						try{
							WebUI.executeJavaScript(lJsLambdaTestName,[''])
						}catch(Exception exx){
							//exx.printStackTrace()
						}
					}
				}
			}
			lreturn=lIsBrowserInit
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean browserClose(){
		Boolean lreturn=false
		if(!this.isIGNTestLibUtilitySuperValid){
			return lreturn
		}
		Boolean lIsBrowserClose=false
		try{
			if(this.isWebBrowserInit&&(!IGNUemaHelper.checkObjectNullOfObject(this.webDriver))){
				this.isLamdaTestResult=this.parentIGNTestExecutorTypeItem.getIsTestCaseDataCurrentStoreTestCaseActualResult()
				String lLambdaTestStatusPassed='lambda-status=passed'
				String lLambdaTestStatusFailed='lambda-status=failed'
				IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_FLAG=true
				IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_RESULT=this.isLamdaTestResult
				if(IGNUemaHelper.checkRemoteTargetDriverExecution()){
					try{
						if(this.isLamdaTestResult){
							this.strLamdaTestResult=lLambdaTestStatusPassed
							((JavascriptExecutor)this.webDriver).executeScript(lLambdaTestStatusPassed,'')
						}else{
							this.strLamdaTestResult=lLambdaTestStatusFailed
							((JavascriptExecutor)this.webDriver).executeScript(lLambdaTestStatusFailed,'')
						}
					}catch(Exception ex){
						//ex.printStackTrace()
						try{
							if(this.isLamdaTestResult){
								this.strLamdaTestResult=lLambdaTestStatusPassed
								WebUI.executeJavaScript(lLambdaTestStatusPassed,[''])
							}else{
								this.strLamdaTestResult=lLambdaTestStatusFailed
								WebUI.executeJavaScript(lLambdaTestStatusFailed,[''])
							}
						}catch(Exception exx){
							//exx.printStackTrace()
						}
					}
				}
			}
			IGNBrowserConfig.closeBrowser()
			this.webDriver=null
			this.webSelenium=null
			GlobalVariable.BrowserInit=false
			this.isWebBrowserInit=false
			lIsBrowserClose=true
			lreturn=lIsBrowserClose
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibUtilitySuperMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibUtilitySuperMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public abstract Boolean proceedTestDataReferClassification()
	public abstract Boolean proceedTestDataCurrentPrerequisite()
	public abstract Boolean proceedTestMainWithRefer()
	public abstract Boolean proceedTestMainNoRefer()
	public abstract Boolean proceedTestMainVerify()
	public abstract Boolean proceedTestAfterSingleTestSuite()
	public abstract Boolean proceedTestAfterBatchTestCollection()
}