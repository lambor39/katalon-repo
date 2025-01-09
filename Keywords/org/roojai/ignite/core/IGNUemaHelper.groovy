package org.roojai.ignite.core
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.remote.*
import org.openqa.selenium.interactions.*
import org.openqa.selenium.Capabilities
import org.openqa.selenium.*
import org.json.*
import org.apache.poi.ss.util.*
import org.apache.poi.ss.usermodel.*
import org.apache.poi.sl.usermodel.*
import org.apache.commons.text.WordUtils
import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang.SystemUtils
import org.apache.commons.io.FileUtils
import org.apache.commons.io.FilenameUtils
import org.apache.commons.collections.MultiMap
import org.apache.commons.collections.map.MultiValueMap
import javax.json.stream.JsonGenerator
import javax.json.stream.*
import javax.json.JsonValue
import javax.json.JsonStructure
import javax.json.JsonReader
import javax.json.JsonPatch
import javax.json.JsonArrayBuilder
import javax.json.JsonArray
import javax.json.Json
import javax.json.*
import java.util.stream.Stream
import java.util.stream.Collectors
import java.util.regex.*
import java.util.List
import java.util.concurrent.TimeUnit
import java.time.ZoneOffset
import java.time.LocalTime
import java.time.LocalDateTime
import java.time.LocalDate
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.text.DecimalFormat
import java.sql.*
import java.nio.file.StandardCopyOption
import java.nio.file.Paths
import java.nio.file.Path
import java.nio.file.Files
import java.nio.charset.StandardCharsets
import java.net.URLDecoder
import java.net.URL
import java.lang.StackTraceElement
import java.io.StringWriter
import java.io.StringReader
import java.io.IOException
import java.io.File
import java.awt.Toolkit
import java.awt.Robot
import java.awt.PointerInfo
import java.awt.MouseInfo
import java.awt.event.*
import java.awt.datatransfer.*
import internal.GlobalVariable
import groovy.sql.Sql
import groovy.sql.GroovyRowResult
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.google.gson.*
import com.google.common.net.UrlEscapers
import com.google.common.collect.Table
import com.google.common.collect.Sets
import com.google.common.collect.HashBasedTable
import com.google.common.base.CharMatcher
import com.github.wnameless.json.unflattener.*
import com.github.wnameless.json.flattener.JsonFlattener
import com.github.wnameless.json.flattener.*
import com.github.kklisura.cdt.protocol.types.audits.GetEncodedResponseEncoding
import com.fasterxml.jackson.dataformat.*
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.core.*
import com.fasterxml.jackson.*
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
public class IGNUemaHelper{
	@Keyword
	/*FORCESTOP*/
	public static void FORCESTOP(){
		throw new StepErrorException('FORCEDSTOP')
	}
	/*CALLER*/
	public static String getThisCallMethodName(){
		String lreturn=''
		try{
			String lStrMethodNameCaller=''
			String lCallerMethodNameDefaultFileNameJava='.java'
			String lCallerMethodNameDefaultFileNameGroovy='.groovy'
			String lCallerMethodNameDefaultMethodCall='call'
			String lCallerMethodNameDefaultMethodThisCall='getThisCallMethodName'
			String lCallerMethodNameDefaultMethodRun='run'
			Integer lCallerLineNumber=0
			String lCallerMethodName=''
			String lCallerFileName=''
			String lCallerClassName=''
			Boolean lIsFoundCaller=false
			try{
				StackTraceElement[] lStackTraceElementCallerList=Thread.currentThread().getStackTrace()
				if(!lIsFoundCaller){
					Boolean lIsFoundPrevCallMethod=false
					Integer lStackTraceElementCallerIndex=0
					StackTraceElement lStackTraceElementCallerItemPrev=null
					for(StackTraceElement lStackTraceElementCallerItem in lStackTraceElementCallerList){
						if(lStackTraceElementCallerItemPrev){
							Integer lCallerLineNumberItemPrev=lStackTraceElementCallerItemPrev.getLineNumber()
							String lCallerMethodNameItemPrev=lStackTraceElementCallerItemPrev.getMethodName()
							String lCallerFileNameItemPrev=lStackTraceElementCallerItemPrev.getFileName()
							String lCallerClassNameItemPrev=lStackTraceElementCallerItemPrev.getClassName()
							if(lCallerLineNumberItemPrev>0){
								if(this.checkStringContainString(lCallerFileNameItemPrev,lCallerMethodNameDefaultFileNameJava)){
									if(this.checkStringContainString(lCallerMethodNameItemPrev,lCallerMethodNameDefaultMethodCall)){
										lIsFoundPrevCallMethod=true
									}
								}else if(this.checkStringContainString(lCallerFileNameItemPrev,lCallerMethodNameDefaultFileNameGroovy)){
									if(this.checkStringContainString(lCallerMethodNameItemPrev,lCallerMethodNameDefaultMethodThisCall)){
										lIsFoundPrevCallMethod=true
									}
								}
							}
						}
						Integer lCallerLineNumberItem=lStackTraceElementCallerItem.getLineNumber()
						String lCallerMethodNameItem=lStackTraceElementCallerItem.getMethodName()
						String lCallerFileNameItem=lStackTraceElementCallerItem.getFileName()
						String lCallerClassNameItem=lStackTraceElementCallerItem.getClassName()
						if(lStackTraceElementCallerIndex>2){
							if(lIsFoundPrevCallMethod){
								if(this.checkStringContainString(lCallerFileNameItem,lCallerMethodNameDefaultFileNameGroovy)){
									if(this.checkStringContainString(lCallerMethodNameItem,lCallerMethodNameDefaultMethodThisCall)){
										lIsFoundPrevCallMethod=false
									}else{
										lCallerLineNumber=lCallerLineNumberItem
										lCallerMethodName=lCallerMethodNameItem
										lCallerFileName=lCallerFileNameItem
										lCallerClassName=lCallerClassNameItem
										lIsFoundCaller=true
										break
									}
								}
							}
						}
						lStackTraceElementCallerItemPrev=lStackTraceElementCallerItem
						lStackTraceElementCallerIndex=lStackTraceElementCallerIndex+1
					}
				}
				if(!lIsFoundCaller){
					for(StackTraceElement lStackTraceElementCallerItem in lStackTraceElementCallerList){
						String lCallerMethodNameItem=lStackTraceElementCallerItem.getMethodName()
						if(lCallerMethodNameItem.length()>0){
							if(lCallerMethodNameItem.equalsIgnoreCase(lCallerMethodNameDefaultMethodRun)){
								lCallerMethodName=lCallerMethodNameItem
								lCallerLineNumber=lStackTraceElementCallerItem.getLineNumber()
								lCallerFileName=lStackTraceElementCallerItem.getFileName()
								lCallerClassName=lStackTraceElementCallerItem.getClassName()
								lIsFoundCaller=true
								break
							}
						}
					}
				}
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			if(lIsFoundCaller){
				lStrMethodNameCaller=lCallerMethodName
			}else{
				lStrMethodNameCaller='Not Found Method Name'
			}
			lreturn=lStrMethodNameCaller
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*PRINTLOG*/
	public static Boolean printLog(Object value){
		Boolean lreturn=false
		try{
			Boolean lIsOK=true
			String lValueText=''
			if(!this.checkObjectNullOfObject(value)){
				try{
					lValueText=value.toString()
				}catch(Exception ex){
					lIsOK=false
					//ex.printStackTrace()
				}
			}
			lValueText=lValueText
			String lCallerMethodNameDefaultFileNameJava='.java'
			String lCallerMethodNameDefaultFileNameGroovy='.groovy'
			String lCallerMethodNameDefaultMethodCall='call'
			String lCallerMethodNameDefaultMethodPrintLog='printLog'
			String lCallerMethodNameDefaultMethodRun='run'
			Integer lCallerLineNumber=0
			String lCallerMethodName=''
			String lCallerFileName=''
			String lCallerClassName=''
			Boolean lIsFoundCaller=false
			try{
				StackTraceElement[] lStackTraceElementCallerList=Thread.currentThread().getStackTrace()
				if(!lIsFoundCaller){
					Boolean lIsFoundPrevCallMethod=false
					Integer lStackTraceElementCallerIndex=0
					StackTraceElement lStackTraceElementCallerItemPrev=null
					for(StackTraceElement lStackTraceElementCallerItem in lStackTraceElementCallerList){
						if(lStackTraceElementCallerItemPrev){
							Integer lCallerLineNumberItemPrev=lStackTraceElementCallerItemPrev.getLineNumber()
							String lCallerMethodNameItemPrev=lStackTraceElementCallerItemPrev.getMethodName()
							String lCallerFileNameItemPrev=lStackTraceElementCallerItemPrev.getFileName()
							String lCallerClassNameItemPrev=lStackTraceElementCallerItemPrev.getClassName()
							if(lCallerLineNumberItemPrev>0){
								if(this.checkStringContainString(lCallerFileNameItemPrev,lCallerMethodNameDefaultFileNameJava)){
									if(this.checkStringContainString(lCallerMethodNameItemPrev,lCallerMethodNameDefaultMethodCall)){
										lIsFoundPrevCallMethod=true
									}
								}else if(this.checkStringContainString(lCallerFileNameItemPrev,lCallerMethodNameDefaultFileNameGroovy)){
									if(this.checkStringContainString(lCallerMethodNameItemPrev,lCallerMethodNameDefaultMethodPrintLog)){
										lIsFoundPrevCallMethod=true
									}
								}
							}
						}
						Integer lCallerLineNumberItem=lStackTraceElementCallerItem.getLineNumber()
						String lCallerMethodNameItem=lStackTraceElementCallerItem.getMethodName()
						String lCallerFileNameItem=lStackTraceElementCallerItem.getFileName()
						String lCallerClassNameItem=lStackTraceElementCallerItem.getClassName()
						if(lStackTraceElementCallerIndex>2){
							if(lIsFoundPrevCallMethod){
								if(this.checkStringContainString(lCallerFileNameItem,lCallerMethodNameDefaultFileNameGroovy)){
									if(this.checkStringContainString(lCallerMethodNameItem,lCallerMethodNameDefaultMethodPrintLog)){
										lIsFoundPrevCallMethod=false
									}else{
										lCallerLineNumber=lCallerLineNumberItem
										lCallerMethodName=lCallerMethodNameItem
										lCallerFileName=lCallerFileNameItem
										lCallerClassName=lCallerClassNameItem
										lIsFoundCaller=true
										break
									}
								}
							}
						}
						lStackTraceElementCallerItemPrev=lStackTraceElementCallerItem
						lStackTraceElementCallerIndex=lStackTraceElementCallerIndex+1
					}
				}
				if(!lIsFoundCaller){
					for(StackTraceElement lStackTraceElementCallerItem in lStackTraceElementCallerList){
						String lCallerMethodNameItem=lStackTraceElementCallerItem.getMethodName()
						if(lCallerMethodNameItem.length()>0){
							if(lCallerMethodNameItem.equalsIgnoreCase(lCallerMethodNameDefaultMethodRun)){
								lCallerMethodName=lCallerMethodNameItem
								lCallerLineNumber=lStackTraceElementCallerItem.getLineNumber()
								lCallerFileName=lStackTraceElementCallerItem.getFileName()
								lCallerClassName=lStackTraceElementCallerItem.getClassName()
								lIsFoundCaller=true
								break
							}
						}
					}
				}
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			String lLogText=''
			if(lIsFoundCaller){
				lLogText=this.concatMessageLeftRightByPipe(lLogText,lCallerFileName)
				lLogText=this.concatMessageLeftRightByPipe(lLogText,lCallerClassName)
				lLogText=this.concatMessageLeftRightByPipe(lLogText,lCallerMethodName)
				lLogText=this.concatMessageLeftRightByPipe(lLogText,lCallerLineNumber.toString())
				lLogText=this.concatMessageLeftRightByPipe(lLogText,'CaseNumber:'+GlobalVariable.CaseNumber.toString().padLeft(4,'0'))
				lLogText=lLogText
				if(lValueText.length()<=0){
					if(!this.checkObjectNullOfObject(value)){
						lValueText='*EMPTY*STRING*'
					}else{
						lValueText='*NULL*OBJECT*'
					}
				}
				lLogText=lValueText+StringUtils.LF+lLogText
			}else{
				lLogText='CaseNumber:'+GlobalVariable.CaseNumber.toString().padLeft(4,'0')
				if(lValueText.length()<=0){
					if(!this.checkObjectNullOfObject(value)){
						lValueText='*EMPTY*STRING*'
					}else{
						lValueText='*NULL*OBJECT*'
					}
				}
				lLogText=lValueText+StringUtils.LF+lLogText
				lLogText=lValueText
			}
			lLogText=lLogText
			println(StringUtils.LF)
			if(!lIsOK){
				println('!!!ERROR!!!PRINTLOG!!!==>'+lLogText)
				this.writeLogStringToFile('!!!ERROR!!!PRINTLOG!!!==>'+lLogText)
			}else{
				println('!PRINTLOG!==>'+lLogText)
				this.writeLogStringToFile('!PRINTLOG!==>'+lLogText)
			}
			lreturn=lIsOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*DELAY*/
	public static Boolean CURRENT_BROWSER_IS_SAFARI=false
	public static Boolean CURRENT_BROWSER_IS_CHROME=false
	public static Boolean CURRENT_BROWSER_IS_EDGE=false
	public static Boolean CURRENT_BROWSER_IS_FIREFOX=false
	public static Boolean CURRENT_BROWSER_IS_UNKNOWN=false
	public static Boolean CURRENT_ENABLE_SMART_WAIT_FLAG=true
	public static Boolean CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI=true
	public static Boolean CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_OTHERS=false
	public static final Integer CURRENT_CUSTOM_DELAY_UNIT_MILLI_SECOND=500
	public static Boolean CURRENT_ENABLE_CUSTOM_DELAY_FOR_BROWSER_SAFARI=true
	public static Boolean CURRENT_ENABLE_CUSTOM_DELAY_FOR_BROWSER_OTHERS=true
	public static Boolean CURRENT_AB_TESTING_ENABLE=false
	public static String CURRENT_AB_TESTING_VERSION=''
	public static Boolean CURRENT_ENABLE_WRITE_REPORT_DETAIL_LIST=true
	public static String CURRENT_TEST_SUITE_EXPECTED_RETRY_FILE_NAME=''
	public static Boolean CURRENT_TEST_SUITE_EXPECTED_RETRY_FLAG=false
	public static String CURRENT_RUNNING_LOG_FULL_FILE_NAME=''
	public static String CURRENT_TEST_SUITE_FULL_NAME_WITH_CASE_NUMBER=''
	public static Boolean CURRENT_TEST_SUITE_RESULT_ACTUAL_FLAG=false
	public static Boolean CURRENT_TEST_SUITE_RESULT_ACTUAL_RESULT=false
	public static void switchSmartWaitDelay(Boolean isEnableSmartWait){
		try{
			if(this.CURRENT_ENABLE_SMART_WAIT_FLAG){
				if(isEnableSmartWait){
					WebUI.enableSmartWait()
					if(this.CURRENT_ENABLE_SMART_WAIT_FOR_BROWSER_SAFARI){
						WebUI.disableSmartWait()
					}
				}else{
					WebUI.disableSmartWait()
				}
			}else{
				WebUI.disableSmartWait()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static void delayThreadMilliSecond(Integer numMilliSecond){
		try{
			this.printLog('delayThreadMilliSecond:'+numMilliSecond.toString())
			try{
				Thread.sleep(numMilliSecond)
			}catch(InterruptedException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static void delayWebUISecond(Integer numSecond){
		try{
			this.printLog('delayWebUISecond:'+numSecond.toString())
			WebUI.delay(numSecond)
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static void delayThreadSecond(Integer numSecond){
		try{
			this.printLog('delayThreadSecond:'+numSecond.toString())
			if(this.CURRENT_BROWSER_IS_SAFARI){
				if(this.CURRENT_ENABLE_CUSTOM_DELAY_FOR_BROWSER_SAFARI){
					this.delayThreadMilliSecond(numSecond*this.CURRENT_CUSTOM_DELAY_UNIT_MILLI_SECOND)
				}else{
					this.delayWebUISecond(numSecond)
				}
			}else{
				if(this.CURRENT_ENABLE_CUSTOM_DELAY_FOR_BROWSER_OTHERS){
					this.delayThreadMilliSecond(numSecond*this.CURRENT_CUSTOM_DELAY_UNIT_MILLI_SECOND)
				}else{
					this.delayWebUISecond(numSecond)
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	/*EXECUTION*/
	public static Boolean printPropertiesOfExecutionProperties(){
		Boolean lreturn=false
		try{
			Map lExecutionGeneralProperties=RunConfiguration.getExecutionGeneralProperties()
			this.printLog('ExecutionGeneralProperties:'+lExecutionGeneralProperties)
			Map lExecutionProperties=RunConfiguration.getExecutionProperties()
			this.printLog('ExecutionProperties:'+lExecutionProperties)
			Map lExecutionDrivers=lExecutionProperties.get('drivers')
			this.printLog('ExecutionDrivers:'+lExecutionDrivers)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkRemoteTargetDriverExecution(){
		Boolean lreturn=false
		try{
			Map lExecutionProperties=RunConfiguration.getExecutionProperties()
			Map lExecutionDrivers=lExecutionProperties.get('drivers')
			if(!lExecutionDrivers){
				return lreturn
			}
			Map lExecutionSystem=lExecutionDrivers.get('system')
			if(!lExecutionSystem){
				return lreturn
			}
			lreturn=lExecutionSystem.containsKey('Remote')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getExecutionProfile(){
		String lreturn=''
		try{
			lreturn=RunConfiguration.getExecutionProfile()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getExecutionSource(){
		String lreturn=''
		try{
			lreturn=RunConfiguration.getExecutionSource()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getExecutionSourceDescription(){
		String lreturn=''
		try{
			lreturn=RunConfiguration.getExecutionSourceDescription()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getExecutionSourceId(){
		String lreturn=''
		try{
			lreturn=RunConfiguration.getExecutionSourceId()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getExecutionSourceName(){
		String lreturn=''
		try{
			lreturn=RunConfiguration.getExecutionSourceName()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getCapabilityBrowserName(WebDriver driver){
		String lreturn=''
		try{
			Capabilities lCapabilities=((RemoteWebDriver)driver). getCapabilities()
			lreturn=lCapabilities.getBrowserName().trim()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getCapabilityBrowserVersion(WebDriver driver){
		String lreturn=''
		try{
			Capabilities lCapabilities=((RemoteWebDriver)driver).getCapabilities()
			lreturn=lCapabilities.getVersion().trim()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getCapabilityPlatform(WebDriver driver){
		String lreturn=''
		try{
			Capabilities lCapabilities=((RemoteWebDriver)driver).getCapabilities()
			lreturn=lCapabilities.getPlatform().toString().trim()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getBrowserInfo(WebDriver driver){
		String lreturn=''
		try{
			String lBrowserName=this.getCapabilityBrowserName(driver)
			String lVersion=this.getCapabilityBrowserVersion(driver)
			String lOS=this.getCapabilityPlatform(driver)
			lreturn='[BrowserName='+lBrowserName+',Version='+lVersion+',OS='+lOS+']'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkWebDriverURLTargerAsUAT(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			String lCurrentURLText=driver.getCurrentUrl().toUpperCase().trim()
			if(lCurrentURLText.length()>0){
				lreturn=this.checkStringContainString(lCurrentURLText,'UAT')
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkWebDriverURLTargetUnderQuoteApplication(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			String lCurrentURLText=driver.getCurrentUrl().toUpperCase().trim()
			if(lCurrentURLText.length()>0){
				lreturn=this.checkStringContainString(lCurrentURLText,'/QUOTE/')
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*FILE*/
	public static Boolean writeStringToFile(String outputFullFileName,String inputContent,Boolean isAppend){
		Boolean lreturn=false
		if(outputFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				FileUtils.writeStringToFile(new File(outputFullFileName),inputContent,StandardCharsets.UTF_8,isAppend)
				lreturn=true
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean writeStringWithEnterToFile(String outputFullFileName,String inputContent,Boolean isAppend){
		Boolean lreturn=false
		if(outputFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				lreturn=this.writeStringToFile(outputFullFileName,inputContent+StringUtils.LF,isAppend)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean writeLogStringToFile(String strLogString){
		Boolean lreturn=false
		if(this.CURRENT_RUNNING_LOG_FULL_FILE_NAME.length()<=0){
			return lreturn
		}
		try{
			try{
				String lLogString=this.getStringCurrentStampDateTime()+StringUtils.LF+strLogString
				lreturn=this.writeStringWithEnterToFile(this.CURRENT_RUNNING_LOG_FULL_FILE_NAME,lLogString,true)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String readFileToStringUTF8(String targetFullFileName){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(targetFullFileName)){
			return lreturn
		}
		String lTargetFullFileName=targetFullFileName.trim()
		try{
			try{
				if(this.toDoFileExistByString(lTargetFullFileName)){
					byte[] lByteArray=Files.readAllBytes(Paths.get(lTargetFullFileName))
					String lStrFileContent=new String(lByteArray,StandardCharsets.UTF_8)
					lreturn=lStrFileContent
				}
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileExistByFile(File srcFile){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		try{
			try{
				lreturn=srcFile.exists()
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileExistByString(String strFullFileName){
		Boolean lreturn=false
		String lFullFileName=strFullFileName.trim()
		if(lFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				File lFile=new File(lFullFileName)
				lreturn=this.toDoFileExistByFile(lFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileDeleteByFile(File srcFile){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		try{
			try{
				lreturn=srcFile.delete()
				lreturn=lreturn&&!this.toDoFileExistByFile(srcFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileDeleteByString(String strFullFileName){
		Boolean lreturn=false
		String lFullFileName=strFullFileName.trim()
		if(lFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				File lFile=new File(lFullFileName)
				lreturn=this.toDoFileDeleteByFile(lFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileRenameByFile(File srcFile,File dstFile,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(dstFile)){
			return lreturn
		}
		try{
			try{
				Boolean lIsFileExist=this.toDoFileExistByFile(srcFile)
				if(!lIsFileExist){
					return lreturn
				}
				lIsFileExist=this.toDoFileExistByFile(dstFile)
				if(lIsFileExist){
					if(boolIsDeleteIfExist){
						this.toDoFileDeleteByFile(dstFile)
						lIsFileExist=this.toDoFileExistByFile(dstFile)
					}
				}
				if(lIsFileExist){
					return lreturn
				}
				lreturn=srcFile.renameTo(dstFile)
				lreturn=lreturn&&this.toDoFileExistByFile(dstFile)
				lreturn=lreturn&&!this.toDoFileExistByFile(srcFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileRenameByString(String strSrcFullFileName,String strDstFileName,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfString(strSrcFullFileName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strDstFileName)){
			return lreturn
		}
		String lStrSrcFullFileName=strSrcFullFileName.trim()
		if(lStrSrcFullFileName.length()<=0){
			return lreturn
		}
		String lStrDstFileName=strDstFileName.trim()
		if(lStrDstFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				File lFileSrc=new File(lStrSrcFullFileName)
				File lFileDst=new File(lStrDstFileName)
				Boolean lIsFileExist=this.toDoFileExistByFile(lFileSrc)
				if(!lIsFileExist){
					return lreturn
				}
				File lFileNew=new File(lFileSrc.getParent(),lFileDst.getName())
				lreturn=this.toDoFileRenameByFile(lFileSrc,lFileNew,boolIsDeleteIfExist)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileCopyByFile(File srcFile,File dstFile,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(dstFile)){
			return lreturn
		}
		try{
			try{
				Boolean lIsFileExist=this.toDoFileExistByFile(srcFile)
				if(!lIsFileExist){
					return lreturn
				}
				lIsFileExist=this.toDoFileExistByFile(dstFile)
				if(lIsFileExist){
					if(boolIsDeleteIfExist){
						this.toDoFileDeleteByFile(dstFile)
						lIsFileExist=this.toDoFileExistByFile(dstFile)
					}
				}
				if(lIsFileExist){
					return lreturn
				}
				FileUtils.copyFile(srcFile,dstFile)
				lreturn=this.toDoFileExistByFile(dstFile)
				lreturn=lreturn&&this.toDoFileExistByFile(srcFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileCopyByString(String strSrcFullFileName,String strDstFullFileName,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfString(strSrcFullFileName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strDstFullFileName)){
			return lreturn
		}
		String lStrSrcFullFileName=strSrcFullFileName.trim()
		if(lStrSrcFullFileName.length()<=0){
			return lreturn
		}
		String lStrDstFullFileName=strDstFullFileName.trim()
		if(lStrDstFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				File lFileSrc=new File(lStrSrcFullFileName)
				File lFileDst=new File(lStrDstFullFileName)
				Boolean lIsFileExist=this.toDoFileExistByFile(lFileSrc)
				if(!lIsFileExist){
					return lreturn
				}
				lreturn=this.toDoFileCopyByFile(lFileSrc,lFileDst,boolIsDeleteIfExist)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileMoveByFile(File srcFile,File dstFile,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(dstFile)){
			return lreturn
		}
		try{
			try{
				Boolean lIsFileExist=this.toDoFileExistByFile(srcFile)
				if(!lIsFileExist){
					return lreturn
				}
				lIsFileExist=this.toDoFileExistByFile(dstFile)
				if(lIsFileExist){
					if(boolIsDeleteIfExist){
						this.toDoFileDeleteByFile(dstFile)
						lIsFileExist=this.toDoFileExistByFile(dstFile)
					}
				}
				if(lIsFileExist){
					return lreturn
				}
				FileUtils.moveFile(srcFile,dstFile)
				lreturn=this.toDoFileExistByFile(dstFile)
				lreturn=lreturn&&!this.toDoFileExistByFile(srcFile)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean toDoFileMoveByString(String strSrcFullFileName,String strDstFullFileName,Boolean boolIsDeleteIfExist){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfString(strSrcFullFileName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strDstFullFileName)){
			return lreturn
		}
		String lStrSrcFullFileName=strSrcFullFileName.trim()
		if(lStrSrcFullFileName.length()<=0){
			return lreturn
		}
		String lStrDstFullFileName=strDstFullFileName.trim()
		if(lStrDstFullFileName.length()<=0){
			return lreturn
		}
		try{
			try{
				File lFileSrc=new File(lStrSrcFullFileName)
				File lFileDst=new File(lStrDstFullFileName)
				Boolean lIsFileExist=this.toDoFileExistByFile(lFileSrc)
				if(!lIsFileExist){
					return lreturn
				}
				lreturn=this.toDoFileMoveByFile(lFileSrc,lFileDst,boolIsDeleteIfExist)
			}catch(IOException ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static File changeFileExtensionByFile(File srcFile,String strNewExtension){
		File lreturn=null
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strNewExtension)){
			return lreturn
		}
		String lStrNewExtension=strNewExtension.trim()
		if(this.checkObjectEmptyOfString(lStrNewExtension)){
			return lreturn
		}
		try{
			Integer lIndex=srcFile.getName().lastIndexOf('.')
			String lStrName=srcFile.getName().substring(0,lIndex)
			lreturn=new File(srcFile.getParent(),lStrName+lStrNewExtension)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String changeFileExtensionByString(String strSrcFileName,String strNewExtension){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strSrcFileName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strNewExtension)){
			return lreturn
		}
		String lStrSrcFileName=strSrcFileName.trim()
		if(this.checkObjectEmptyOfString(lStrSrcFileName)){
			return lreturn
		}
		String lStrNewExtension=strNewExtension.trim()
		if(this.checkObjectEmptyOfString(lStrNewExtension)){
			return lreturn
		}
		try{
			File lFileSrc=new File(lStrSrcFileName)
			File lFileDst=this.changeFileExtensionByFile(lFileSrc,lStrNewExtension)
			if(!this.checkObjectNullOfObject(lFileDst)){
				lreturn=lFileDst.getAbsolutePath()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static File appendFileNameByFile(File srcFile,Boolean boolIsSuffix,String strAppendName){
		File lreturn=null
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strAppendName)){
			return lreturn
		}
		String lStrAppendName=strAppendName.trim()
		try{
			String lStrFileNameFull=srcFile.getName()
			String lStrFileNameBase= FilenameUtils.removeExtension(lStrFileNameFull)
			String lStrFileNameExtension=FilenameUtils.getExtension(lStrFileNameFull)
			String lStrFileNameNew=''
			if(!boolIsSuffix){
				lStrFileNameNew=lStrAppendName+lStrFileNameBase+'.'+lStrFileNameExtension
			}else{
				lStrFileNameNew=lStrFileNameBase+lStrAppendName+'.'+lStrFileNameExtension
			}
			lreturn=new File(srcFile.getParent(),lStrFileNameNew)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String appendFileNameByString(String strSrcFileName,Boolean boolIsSuffix,String strAppendName){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strSrcFileName)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strAppendName)){
			return lreturn
		}
		String lStrSrcFileName=strSrcFileName.trim()
		if(this.checkObjectEmptyOfString(lStrSrcFileName)){
			return lreturn
		}
		String lStrAppendName=strAppendName.trim()
		try{
			File lFileSrc=new File(lStrSrcFileName)
			File lFileDst=this.appendFileNameByFile(lFileSrc,boolIsSuffix,lStrAppendName)
			if(!this.checkObjectNullOfObject(lFileDst)){
				lreturn=lFileDst.getAbsolutePath()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static File replaceFileNameByFile(File srcFile,String strTextFind,String strTextReplace){
		File lreturn=null
		if(this.checkObjectNullOfObject(srcFile)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTextFind)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTextReplace)){
			return lreturn
		}
		String lStrTextFind=strTextFind.trim()
		String lStrTextReplace=strTextReplace.trim()
		try{
			String lStrFileNameFull=srcFile.getName()
			String lStrFileNameBase= FilenameUtils.removeExtension(lStrFileNameFull)
			String lStrFileNameExtension=FilenameUtils.getExtension(lStrFileNameFull)
			String lStrFileNameNew=''
			if(lStrTextFind.length()>0){
				lStrFileNameNew=StringUtils.replace(lStrFileNameBase,lStrTextFind,lStrTextReplace)+'.'+lStrFileNameExtension
			}else{
				lStrFileNameNew=lStrFileNameFull
			}
			lreturn=new File(srcFile.getParent(),lStrFileNameNew)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String replaceFileNameByString(String strSrcFileName,String strTextFind,String strTextReplace){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strSrcFileName)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTextFind)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTextReplace)){
			return lreturn
		}
		String lStrSrcFileName=strSrcFileName.trim()
		if(this.checkObjectEmptyOfString(lStrSrcFileName)){
			return lreturn
		}
		String lStrTextFind=strTextFind.trim()
		String lStrTextReplace=strTextReplace.trim()
		try{
			File lFileSrc=new File(lStrSrcFileName)
			File lFileDst=this.replaceFileNameByFile(lFileSrc,lStrTextFind,lStrTextReplace)
			if(!this.checkObjectNullOfObject(lFileDst)){
				lreturn=lFileDst.getAbsolutePath()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean restoreDataFileByCountryCompanyTypeProduct(IGNTestDataCountry enumIGNTestDataCountry,IGNTestDataCompany enumIGNTestDataCompany,IGNTestDataExcelStoreType enumIGNTestDataExcelStoreType,String strProductName,String strCycleUserName){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(enumIGNTestDataCountry)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(enumIGNTestDataCompany)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(enumIGNTestDataExcelStoreType)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strProductName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strCycleUserName)){
			return lreturn
		}
		String lStrProductName=strProductName.trim()
		if(this.checkObjectEmptyOfString(lStrProductName)){
			return lreturn
		}
		String lStrCycleUserName=strCycleUserName.trim()
		if(this.checkObjectEmptyOfString(lStrCycleUserName)){
			return lreturn
		}
		try{
			String lStrFolderSrcRoot='Data Files/ZPrepareHere/Ignite/'
			String lStrFolderDstRoot='Data Files/Test/Roojai/'
			String lStrFolderReleaseRoot='Data Files/Release_UAT/Roojai/'
			String lStrDataCountry=''
			String lStrDataCompany=''
			String lStrDataExcelStoreType=''
			switch (enumIGNTestDataCountry){
				case IGNTestDataCountry.Indonesia:
					lStrDataCountry='IDN'
					break
				default:
					lStrDataCountry='THA'
					break
			}
			switch (enumIGNTestDataCompany){
				case IGNTestDataCompany.All:
					lStrDataCompany='ALL'
					break
				case IGNTestDataCompany.MrKumka:
					lStrDataCompany='Kumka'
					break
				case IGNTestDataCompany.LifePal:
					lStrDataCompany='LifePal'
					break
				default:
					lStrDataCompany='Roojai'
					break
			}
			switch (enumIGNTestDataExcelStoreType){
				case IGNTestDataExcelStoreType.SingleProductSingleUser:
					lStrDataExcelStoreType='One'
					break
				default:
					lStrDataExcelStoreType='All'
					break
			}
			lStrFolderSrcRoot=lStrFolderSrcRoot+lStrDataCountry+'/'
			lStrFolderDstRoot=lStrFolderDstRoot+lStrDataCountry+'/'
			lStrFolderReleaseRoot=lStrFolderReleaseRoot+lStrDataCountry+'/'
			String lStrFolderSrcProductCycleUser=lStrFolderSrcRoot+lStrDataExcelStoreType+'/'+lStrDataCompany+'/'+lStrProductName+'/'+lStrCycleUserName
			try{
				Path lPathSrcRoot=Paths.get(lStrFolderSrcRoot)
				if(!Files.exists(lPathSrcRoot)){
					return lreturn
				}
				Path lPathDstRoot=Paths.get(lStrFolderDstRoot)
				if(!Files.exists(lPathDstRoot)){
					return lreturn
				}
				Path lPathSrcProductCycleUser=Paths.get(lStrFolderSrcProductCycleUser)
				if(!Files.exists(lPathSrcProductCycleUser)){
					return lreturn
				}
				File lFileSrcProductCycleUser=new File(lStrFolderSrcProductCycleUser)
				String[] lArraySrcProductCycleUserFileStr=lFileSrcProductCycleUser.list()
				if(this.checkObjectNullOfObject(lArraySrcProductCycleUserFileStr)){
					return lreturn
				}
				if(lArraySrcProductCycleUserFileStr.size()<=0){
					return lreturn
				}
				List<String> lListSrcProductCycleUserFileStr=new ArrayList<String>()
				for(String lItemSrcProductCycleUserFileStr in lArraySrcProductCycleUserFileStr){
					String lSrcProductCycleUserFileName=lStrFolderSrcProductCycleUser+'/'+lItemSrcProductCycleUserFileStr
					File lFileItemSrcProductCycleUser=new File(lSrcProductCycleUserFileName)
					if(this.toDoFileExistByFile(lFileItemSrcProductCycleUser)){
						if(!lFileItemSrcProductCycleUser.isDirectory()){
							lListSrcProductCycleUserFileStr.add(lItemSrcProductCycleUserFileStr)
						}
					}
				}
				if(lListSrcProductCycleUserFileStr.size()<=0){
					return lreturn
				}
				Boolean lIsCopyAllOK=false
				for(String lItemSrcProductCycleUserFileStr in lListSrcProductCycleUserFileStr){
					String lStrCopyFileNameSrc=lStrFolderSrcProductCycleUser+'/'+lItemSrcProductCycleUserFileStr
					String lStrCopyFileNameDst=this.appendFileNameByString(lStrFolderDstRoot+'/'+lItemSrcProductCycleUserFileStr,true,'_Local')
					lIsCopyAllOK=this.toDoFileCopyByString(lStrCopyFileNameSrc,lStrCopyFileNameDst,true)
					if(!lIsCopyAllOK){
						break
					}
				}
				if(!lIsCopyAllOK){
					return lreturn
				}
				File lFileSrcRoot=new File(lStrFolderSrcRoot)
				String[] lArraySrcRootFileStr=lFileSrcRoot.list()
				if(this.checkObjectNullOfObject(lArraySrcRootFileStr)){
					return lreturn
				}
				if(lArraySrcRootFileStr.size()<=0){
					return lreturn
				}
				List<String> lListSrcRootFileStr=new ArrayList<String>()
				for(String lItemSrcRootFileStr in lArraySrcRootFileStr){
					Boolean lIsAdded=false
					String lSrcRootFileName=lStrFolderSrcRoot+'/'+lItemSrcRootFileStr
					File lFileItemSrcRoot=new File(lSrcRootFileName)
					if(this.toDoFileExistByFile(lFileItemSrcRoot)){
						if(!lFileItemSrcRoot.isDirectory()){
							if(!lIsAdded){
								if(this.checkStringContainString(lItemSrcRootFileStr,'IGNGenericTemplatePricingAPI')){
									lListSrcRootFileStr.add(lItemSrcRootFileStr)
									lIsAdded=true
								}
							}
						}
					}
				}
				if(lListSrcRootFileStr.size()<=0){
					return lreturn
				}
				for(String lItemSrcRootFileStr in lListSrcRootFileStr){
					String lStrCopyFileNameSrc=lStrFolderSrcRoot+'/'+lItemSrcRootFileStr
					String lStrCopyFileNameTest=this.appendFileNameByString(lStrFolderDstRoot+'/'+lItemSrcRootFileStr,true,'_Local')
					lIsCopyAllOK=this.toDoFileCopyByString(lStrCopyFileNameSrc,lStrCopyFileNameTest,true)
					if(!lIsCopyAllOK){
						break
					}
				}
				if(!lIsCopyAllOK){
					return lreturn
				}
				File lFileDstRoot=new File(lStrFolderDstRoot)
				String[] lArrayDstRootFileStr=lFileDstRoot.list()
				if(this.checkObjectNullOfObject(lArrayDstRootFileStr)){
					return lreturn
				}
				if(lArrayDstRootFileStr.size()<=0){
					return lreturn
				}
				List<String> lListDstRootFileStr=new ArrayList<String>()
				for(String lItemDstRootFileStr in lArrayDstRootFileStr){
					String lDstRootFileName=lStrFolderDstRoot+'/'+lItemDstRootFileStr
					File lFileItemDstRoot=new File(lDstRootFileName)
					if(this.toDoFileExistByFile(lFileItemDstRoot)){
						if(!lFileItemDstRoot.isDirectory()){
							lListDstRootFileStr.add(lItemDstRootFileStr)
						}
					}
				}
				if(lListDstRootFileStr.size()<=0){
					return lreturn
				}
				for(String lItemDstRootFileStr in lListDstRootFileStr){
					String lStrCopyFileNameSrc=lStrFolderDstRoot+'/'+lItemDstRootFileStr
					String lStrCopyFileNameRelease=this.replaceFileNameByString(lStrFolderReleaseRoot+'/'+lItemDstRootFileStr,'_Local','')
					lIsCopyAllOK=this.toDoFileCopyByString(lStrCopyFileNameSrc,lStrCopyFileNameRelease,true)
					if(!lIsCopyAllOK){
						break
					}
				}
				lreturn=lIsCopyAllOK
			}catch(Exception ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean restoreDataFileFromTestBlank(){
		Boolean lreturn=false
		try{
			Boolean lIsOSWindow=false
			try{
				String lStrOSName=SystemUtils.OS_NAME
				if(this.checkStringContainString(lStrOSName,'WIN')){
					lIsOSWindow=true
				}
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			if(lIsOSWindow){
				String lStrFolderCMDRestore='Data Files'
				String lStrFileCMDRestore=lStrFolderCMDRestore+'/!!DataFile0Restore.cmd'
				try{
					Process lProcess=Runtime.getRuntime().exec(lStrFileCMDRestore,null,new File(lStrFolderCMDRestore))
					lreturn=true
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}else{
				String lStrFolderDstRoot='Data Files/Test/Roojai/'
				String lStrFolderReleaseRoot='Data Files/Release_UAT/Roojai/'
				Boolean lIsCopyAllOK=true
				try{
					File lFileDstRoot=new File(lStrFolderDstRoot)
					String[] lArrayDstRootFileStr=lFileDstRoot.list()
					if(this.checkObjectNullOfObject(lArrayDstRootFileStr)){
						return lreturn
					}
					if(lArrayDstRootFileStr.size()<=0){
						return lreturn
					}
					List<String> lListDstRootFileStr=new ArrayList<String>()
					for(String lItemDstRootFileStr in lArrayDstRootFileStr){
						String lDstRootFileName=lStrFolderDstRoot+'/'+lItemDstRootFileStr
						File lFileItemDstRoot=new File(lDstRootFileName)
						if(this.toDoFileExistByFile(lFileItemDstRoot)){
							if(!lFileItemDstRoot.isDirectory()){
								lListDstRootFileStr.add(lItemDstRootFileStr)
							}
						}
					}
					if(lListDstRootFileStr.size()<=0){
						return lreturn
					}
					for(String lItemDstRootFileStr in lListDstRootFileStr){
						String lStrCopyFileNameSrc=lStrFolderDstRoot+'/'+lItemDstRootFileStr
						String lStrCopyFileNameRelease=this.replaceFileNameByString(lStrFolderReleaseRoot+'/'+lItemDstRootFileStr,'_Local','')
						lIsCopyAllOK=this.toDoFileCopyByString(lStrCopyFileNameSrc,lStrCopyFileNameRelease,true)
						if(!lIsCopyAllOK){
							break
						}
					}
					lreturn=lIsCopyAllOK
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*CONVERT*/
	public static Boolean checkObjectNullOfObject(Object targetObject){
		Boolean lreturn=false
		try{
			lreturn=targetObject==null
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectEmptyOfList(List targetArrayList){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetArrayList)){
			return lreturn
		}
		try{
			lreturn=targetArrayList.isEmpty()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectEmptyOfSet(Set targetArraySet){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetArraySet)){
			return lreturn
		}
		try{
			lreturn=targetArraySet.isEmpty()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectEmptyOfMap(Map targetMap){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetMap)){
			return lreturn
		}
		try{
			lreturn=targetMap.isEmpty()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectEmptyOfString(String targetString){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetString)){
			return lreturn
		}
		try{
			lreturn=(targetString==StringUtils.EMPTY)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectNullOrEmptyOfList(List targetArrayList){
		Boolean lreturn=false
		try{
			lreturn=(this.checkObjectNullOfObject(targetArrayList)||this.checkObjectEmptyOfList(targetArrayList))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectNullOrEmptyOfSet(Set targetArraySet){
		Boolean lreturn=false
		try{
			lreturn=(this.checkObjectNullOfObject(targetArraySet)||this.checkObjectEmptyOfSet(targetArraySet))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectNullOrEmptyOfMap(Map targetMap){
		Boolean lreturn=false
		try{
			lreturn=(this.checkObjectNullOfObject(targetMap)||this.checkObjectEmptyOfMap(targetMap))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkObjectNullOrEmptyOfString(String targetString){
		Boolean lreturn=false
		try{
			lreturn=(this.checkObjectNullOfObject(targetString)||this.checkObjectEmptyOfString(targetString))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkAllValueInListContainSameString(List targetList,String targetString){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfList(targetList)){
			return lreturn
		}
		try{
			lreturn=targetList.stream().allMatch({
				it==targetString
			})
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkStringContainString(String strBase,String strFind){
		Boolean lreturn=false
		if(strBase.length()<=0){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			String lTextBase=strBase.toUpperCase()
			String lTextFind=strFind.toUpperCase()
			lreturn=lTextBase.contains(lTextFind)
			if(!lreturn){
				lTextBase=strBase.toLowerCase()
				lTextFind=strFind.toLowerCase()
				lreturn=lTextBase.contains(lTextFind)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkStringContainStringRemoveWhitespace(String strBase,String strFind){
		Boolean lreturn=false
		if(strBase.length()<=0){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			String lTextBase=strBase.toUpperCase()
			String lTextFind=strFind.toUpperCase()
			lTextBase=lTextBase.replaceAll('\\s','').trim()
			lTextFind=lTextFind.replaceAll('\\s','').trim()
			if(lTextBase.length()>0){
				if(lTextFind.length()>0){
					lreturn=lTextBase.contains(lTextFind)
					if(!lreturn){
						lTextBase=strBase.toLowerCase()
						lTextFind=strFind.toLowerCase()
						lTextBase=lTextBase.replaceAll('\\s','').trim()
						lTextFind=lTextFind.replaceAll('\\s','').trim()
						if(lTextBase.length()>0){
							if(lTextFind.length()>0){
								lreturn=lTextBase.contains(lTextFind)
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkListContainStringCaseInsensitive(List<String> targetList,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfList(targetList)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(String lStrBase in targetList){
				if(this.checkStringContainString(lStrBase,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkListContainStringRemoveWhitespaceCaseInsensitive(List<String> targetList,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfList(targetList)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(String lStrBase in targetList){
				if(this.checkStringContainStringRemoveWhitespace(lStrBase,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkMapKeyContainStringCaseInsensitive(Map targetMap,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(targetMap)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in targetMap){
				if(this.checkStringContainString(lEntry.key,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkMapValueContainStringRemoveWhitespaceCaseInsensitive(Map targetMap,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(targetMap)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in targetMap){
				if(this.checkStringContainString(lEntry.value,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkMapKeyContainStringRemoveWhitespaceCaseInsensitive(Map targetMap,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(targetMap)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in targetMap){
				if(this.checkStringContainStringRemoveWhitespace(lEntry.key,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkMapValueContainStringCaseInsensitive(Map targetMap,String strFind){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(targetMap)){
			return lreturn
		}
		if(strFind.length()<=0){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in targetMap){
				if(this.checkStringContainStringRemoveWhitespace(lEntry.value,strFind)){
					lreturn=true
					break
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean convertStringToBoolean(String input){
		try{
			String linput=input.toLowerCase().trim()
			switch(linput){
				case 'true': case 'yes': case '1': return true
				case 'false': case 'no': case '0': case null: return false
				default: return Boolean.parseBoolean(linput)
			}
		}catch(Exception e){
			//e.printStackTrace()
			return false
		}
	}
	public static String convertBooleanToString(Boolean input){
		String lreturn=''
		try{
			lreturn=input.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertBooleanToYesNoString(Boolean input){
		String lreturn=''
		try{
			if(input==true){
				lreturn='Yes'
			}else{
				lreturn='No'
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer convertStringToInteger(String value,Integer defaultVal){
		Integer lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			lValue=lValue.replaceAll('\\.\\d+$','').trim()
			return Integer.parseInt(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Float convertStringToFloat(String value,Float defaultVal){
		Float lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			return Float.parseFloat(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static BigDecimal convertStringToBigDecimal(String value,BigDecimal defaultVal){
		BigDecimal lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			return new BigDecimal(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static BigInteger convertStringToBigInteger(String value,BigInteger defaultVal){
		BigInteger lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			lValue=lValue.replaceAll('\\.\\d+$','').trim()
			return new BigInteger(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Double convertStringToDouble(String value,Double defaultVal){
		Double lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			return Double.parseDouble(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Long convertStringToLong(String value,Long defaultVal){
		Long lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			lValue=lValue.replaceAll('\\.\\d+$','').trim()
			return Long.parseLong(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Short convertStringToShort(String value,Short defaultVal){
		Short lreturn=defaultVal
		try{
			String lValue=value.replaceAll(',','').trim()
			return Short.parseShort(lValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringToString(String value,String defaultVal=''){
		String lreturn=defaultVal
		try{
			return new String(value)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringToPassword(String input){
		String lreturn=''
		try{
			for(lInputChar in input){
				lreturn=lreturn+'*'
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringEmailToMyAccountMaskText(String input){
		String lreturn=''
		try{
			String lStrSplitterAtSignRegex='@'
			String lStrSplitterAtSignChar='@'
			String lStrMask='x'
			String[] lInputList=input.split(lStrSplitterAtSignRegex)
			Integer lInputListSize=lInputList.size()
			if(lInputListSize<=1){
				lreturn=input
			}else if(lInputListSize>2){
				lreturn=input
			}else{
				Integer lInputIndex=0
				for(String lInputItem in lInputList){
					if(lInputIndex==0){
						Integer lInputItemCharIndex=0
						Integer lInputItemCharIndexLast=lInputItem.length()-1
						for(lInputItemChar in lInputItem){
							if(lInputItemCharIndex==0){
								lreturn=lreturn+lInputItemChar
							}else{
								if(lInputItemCharIndex==lInputItemCharIndexLast){
									lreturn=lreturn+lStrMask
								}else{
									lreturn=lreturn+lStrMask
								}
							}
							lInputItemCharIndex=lInputItemCharIndex+1
						}
					}else{
						lreturn=lreturn+lStrSplitterAtSignRegex
						String lStrSplitterDotRegex='\\.'
						String lStrSplitterDotChar='.'
						String[] lInputSubList=lInputItem.split(lStrSplitterDotRegex)
						Integer lInputSubListSize=lInputSubList.size()
						if(lInputSubListSize<=1){
							lreturn=lreturn+lInputItem
						}else{
							Integer lInputSubIndex=0
							Integer lInputSubIndexItemLast=lInputSubListSize-1
							Integer lInputSubIndexItemBeforeLast=lInputSubIndexItemLast-1
							for(String lInputSubItem in lInputSubList){
								if(lInputSubIndex==0){
									Integer lInputSubItemCharIndex=0
									Integer lInputSubItemCharLast=lInputSubItem.length()-1
									for(lInputSubItemChar in lInputSubItem){
										if(lInputSubItemCharIndex==0){
											lreturn=lreturn+lInputSubItemChar
										}else{
											if(lInputSubItemCharIndex==lInputSubItemCharLast){
												if(lInputSubIndex==lInputSubIndexItemBeforeLast){
													lreturn=lreturn+lInputSubItemChar
												}else{
													lreturn=lreturn+lStrMask
												}
											}else{
												lreturn=lreturn+lStrMask
											}
										}
										lInputSubItemCharIndex=lInputSubItemCharIndex+1
									}
								}else if(lInputSubIndex==lInputSubIndexItemLast){
									lreturn=lreturn+lStrSplitterDotChar+lInputSubItem
								}else{
									lreturn=lreturn+lStrMask
									Integer lInputSubItemCharIndex=0
									Integer lInputSubItemCharLast=lInputSubItem.length()-1
									for(lInputSubItemChar in lInputSubItem){
										if(lInputSubItemCharIndex==0){
											lreturn=lreturn+lStrMask
										}else{
											if(lInputSubItemCharIndex==lInputSubItemCharLast){
												if(lInputSubIndex==lInputSubIndexItemBeforeLast){
													lreturn=lreturn+lInputSubItemChar
												}else{
													lreturn=lreturn+lStrMask
												}
											}else{
												lreturn=lreturn+lStrMask
											}
										}
										lInputSubItemCharIndex=lInputSubItemCharIndex+1
									}
								}
								lInputSubIndex=lInputSubIndex+1
							}
						}
					}
					lInputIndex=lInputIndex+1
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringPhoneToMyAccountMaskText(String input){
		String lreturn=''
		try{
			String lStrMask='x'
			Integer lInputLength=input.length()
			Integer lInputPoint=lInputLength-4
			if(lInputPoint<0){
				lreturn=input
			}else{
				Integer lInputIndex=0
				for(lInputChar in input){
					if(lInputIndex<lInputPoint){
						lreturn=lreturn+lStrMask
					}else{
						lreturn=lreturn+lInputChar
					}
					lInputIndex=lInputIndex+1
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringAsTitleCase(String input){
		String lreturn=''
		final char[] ldelimiters=[
			StringUtils.SPACE,
			'_',
			'|',
			'=',
			'-',
			'*'
		]
		try{
			lreturn=WordUtils.capitalizeFully(input,ldelimiters)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringToURLEncodedString(String input){
		String lreturn=''
		try{
			String lText=UrlEscapers.urlFragmentEscaper().escape(input)
			lText=lText.replace('+','%2B')
			lreturn=lText
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringToURLDecodedString(String input){
		String lreturn=''
		try{
			String lText=input.replace('+','%2B')
			lText=URLDecoder.decode(lText,'UTF-8')
			lreturn=lText
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map extractURLStringToMapQuery(String inputURLString,Boolean isDecodeKey,Boolean isDecodeValue){
		Map lreturn=[:]
		String lInputURLString=inputURLString.trim()
		if(lInputURLString.length()<=0){
			return lreturn
		}
		try{
			String[] lURLStringList=lInputURLString.split('\\?')
			if(lURLStringList.size()<2){
				return lreturn
			}
			String lQueryText=lURLStringList[1]
			String[] lParamList=lQueryText.split('&')
			for(String lParamItem in lParamList){
				String lParamKey=''
				String lParamValue=''
				lParamKey=lParamItem.split('=')[0]
				if(isDecodeKey){
					lParamKey=convertStringToURLDecodedString(lParamItem.split('=')[0])
				}
				lParamValue=lParamItem.split('=')[1]
				if(isDecodeValue){
					lParamValue=convertStringToURLDecodedString(lParamItem.split('=')[1])
				}
				lreturn.put(lParamKey,lParamValue)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static final String CONST_PATTERN_FORMATTER_STAMP_DATE_TIME='yyyy/MM/dd HH:mm:ss:SSSSSS'
	public static final String CONST_PATTERN_FORMATTER_DATE='dd/MM/yyyy'
	public static final String CONST_PATTERN_FORMATTER_DATE_TIME='dd/MM/yyyy HH:mm:ss'
	public static final String CONST_PATTERN_FORMATTER_TIME='HH:mm:ss'
	public static final Integer CONST_INTEGER_YEAR_OFFSET_ENG_THAI=543
	public static final Integer CONST_INTEGER_DAY_DEF=1
	public static final Integer CONST_INTEGER_MONTH_DEF=1
	public static final Integer CONST_INTEGER_YEAR_DEF_ENG=1900
	public static final Integer CONST_INTEGER_YEAR_DEF_THAI=2443
	public static final Integer CONST_INTEGER_HOUR_DEF=0
	public static final Integer CONST_INTEGER_MINUTE_DEF=0
	public static final Integer CONST_INTEGER_SECOND_DEF=0
	public static final Float CONST_FLOAT_ZONE_DEF=new Float(0)
	public static final Integer CONST_INTEGER_ZONE_DEF=0
	public static LocalDate getLocalDateCurrent(){
		return LocalDate.now()
	}
	public static LocalDateTime getLocalDateTimeCurrent(){
		return LocalDateTime.now()
	}
	public static LocalTime getLocalTimeCurrent(){
		return LocalTime.now()
	}
	public static DateTimeFormatter getDateTimeFormatter(String strFormat){
		return DateTimeFormatter.ofPattern(strFormat)
	}
	public static LocalDate encodeLocalDateFromNumber(Integer numYear,Integer numMonth,Integer numDay){
		LocalDate lreturn=LocalDate.ofYearDay(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_DAY_DEF)
		try{
			lreturn=LocalDate.of(numYear,numMonth,numMonth)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime encodeLocalDateTimeFromNumber(Integer numYear,Integer numMonth,Integer numDay,Integer numHour,Integer numMinute,Integer numSecond){
		LocalDateTime lreturn=LocalDateTime.of(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF,this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			lreturn=LocalDateTime.of(numYear,numMonth,numDay,numHour,numMinute,numSecond)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalTime encodeLocalTimeFromNumber(Integer numHour,Integer numMinute,Integer numSecond){
		LocalTime lreturn=LocalTime.of(this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			lreturn=LocalTime.of(numHour,numMinute,numSecond)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDate encodeLocalDateFromStringNumber(String strYear,String strMonth,String strDay){
		LocalDate lreturn=this.encodeLocalDateFromNumber(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF)
		try{
			Integer lNumYear=this.convertStringToInteger(strYear,this.CONST_INTEGER_YEAR_DEF_ENG)
			Integer lNumMonth=this.convertStringToInteger(strMonth,this.CONST_INTEGER_MONTH_DEF)
			Integer lNumDay=this.convertStringToInteger(strDay,this.CONST_INTEGER_DAY_DEF)
			lreturn=this.encodeLocalDateFromNumber(lNumYear,lNumMonth,lNumDay)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime encodeLocalDateTimeFromStringNumber(String strYear,String strMonth,String strDay,String strHour,String strMinute,String strSecond){
		LocalDateTime lreturn=this.encodeLocalDateTimeFromNumber(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF,this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			Integer lNumYear=this.convertStringToInteger(strYear,this.CONST_INTEGER_YEAR_DEF_ENG)
			Integer lNumMonth=this.convertStringToInteger(strMonth,this.CONST_INTEGER_MONTH_DEF)
			Integer lNumDay=this.convertStringToInteger(strDay,this.CONST_INTEGER_DAY_DEF)
			Integer lNumHour=this.convertStringToInteger(strHour,this.CONST_INTEGER_HOUR_DEF)
			Integer lNumMinute=this.convertStringToInteger(strMinute,this.CONST_INTEGER_MINUTE_DEF)
			Integer lNumSecond=this.convertStringToInteger(strSecond,this.CONST_INTEGER_SECOND_DEF)
			lreturn=this.encodeLocalDateTimeFromNumber(lNumYear,lNumMonth,lNumDay,lNumHour,lNumMinute,lNumSecond)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime encodeLocalTimeFromStringNumber(String strHour,String strMinute,String strSecond){
		LocalTime lreturn=this.encodeLocalTimeFromNumber(this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			Integer lNumHour=this.convertStringToInteger(strHour,this.CONST_INTEGER_HOUR_DEF)
			Integer lNumMinute=this.convertStringToInteger(strMinute,this.CONST_INTEGER_MINUTE_DEF)
			Integer lNumSecond=this.convertStringToInteger(strSecond,this.CONST_INTEGER_SECOND_DEF)
			lreturn=this.encodeLocalTimeFromNumber(lNumHour,lNumMinute,lNumSecond)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime encodeLocalDateTimeWithZoneFromNumber(Integer numYear,Integer numMonth,Integer numDay,Integer numHour,Integer numMinute,Integer numSecond,Integer numZone){
		LocalDateTime lreturn=LocalDateTime.of(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF,this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF,this.CONST_INTEGER_ZONE_DEF)
		try{
			lreturn=LocalDateTime.of(numYear,numMonth,numDay,numHour,numMinute,numSecond,numZone)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime encodeLocalDateTimeWithZoneFromStringNumber(String strYear,String strMonth,String strDay,String strHour,String strMinute,String strSecond,String strZone){
		LocalDateTime lreturn=this.encodeLocalDateTimeFromNumber(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF,this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			Integer lNumYear=this.convertStringToInteger(strYear,this.CONST_INTEGER_YEAR_DEF_ENG)
			Integer lNumMonth=this.convertStringToInteger(strMonth,this.CONST_INTEGER_MONTH_DEF)
			Integer lNumDay=this.convertStringToInteger(strDay,this.CONST_INTEGER_DAY_DEF)
			Integer lNumHour=this.convertStringToInteger(strHour,this.CONST_INTEGER_HOUR_DEF)
			Integer lNumMinute=this.convertStringToInteger(strMinute,this.CONST_INTEGER_MINUTE_DEF)
			Integer lNumSecond=this.convertStringToInteger(strSecond,this.CONST_INTEGER_SECOND_DEF)
			Integer lNumZone=this.convertStringToInteger(strZone,this.CONST_INTEGER_ZONE_DEF)
			lreturn=this.encodeLocalDateTimeWithZoneFromNumber(lNumYear,lNumMonth,lNumDay,lNumHour,lNumMinute,lNumSecond,lNumZone)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertLocalDateToString(String strFormat,LocalDate fromLocalDate=this.getLocalDateCurrent()){
		String lreturn=''
		try{
			lreturn=fromLocalDate.format(this.getDateTimeFormatter(strFormat))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertLocalDateTimeToString(String strFormat,LocalDateTime fromLocalDateTime=this.getLocalDateTimeCurrent()){
		String lreturn=''
		try{
			lreturn=fromLocalDateTime.format(this.getDateTimeFormatter(strFormat))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertLocalTimeToString(String strFormat,LocalTime fromLocalTime=this.getLocalTimeCurrent()){
		String lreturn=''
		try{
			lreturn=fromLocalTime.format(this.getDateTimeFormatter(strFormat))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String[] extractStringArrayFromDateStringSlashDDMMYYYY(String strDateSlashDDMMYYYY){
		String[] lreturn=[]
		try{
			lreturn=strDateSlashDDMMYYYY.trim().split('/')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractStringDayFromDateStringSlashDDMMYYYY(String strDateSlashDDMMYYYY){
		String lreturn=''
		try{
			String[] lDateSplit=this.extractStringArrayFromDateStringSlashDDMMYYYY(strDateSlashDDMMYYYY)
			if(lDateSplit.size()>=3){
				lreturn=lDateSplit[0]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractStringMonthFromDateStringSlashDDMMYYYY(String strDateSlashDDMMYYYY){
		String lreturn=''
		try{
			String[] lDateSplit=this.extractStringArrayFromDateStringSlashDDMMYYYY(strDateSlashDDMMYYYY)
			if(lDateSplit.size()>=3){
				lreturn=lDateSplit[1]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractStringYearFromDateStringSlashDDMMYYYY(String strDateSlashDDMMYYYY){
		String lreturn=''
		try{
			String[] lDateSplit=this.extractStringArrayFromDateStringSlashDDMMYYYY(strDateSlashDDMMYYYY)
			if(lDateSplit.size()>=3){
				lreturn=lDateSplit[2]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertDateStringFromEngToThai(String strDateEng){
		String lreturn=''
		try{
			String lStrDay=this.extractStringDayFromDateStringSlashDDMMYYYY(strDateEng)
			String lStrMonth=this.extractStringMonthFromDateStringSlashDDMMYYYY(strDateEng)
			String lStrYear=this.extractStringYearFromDateStringSlashDDMMYYYY(strDateEng)
			Integer lNumDayDefault=this.CONST_INTEGER_DAY_DEF
			Integer lNumMonthDefault=this.CONST_INTEGER_MONTH_DEF
			Integer lNumYearDefault=this.CONST_INTEGER_YEAR_DEF_ENG
			Integer lNumDay=this.convertStringToInteger(lStrDay,lNumDayDefault)
			if(lNumDay<=0){
				lNumDay=lNumDayDefault
			}
			Integer lNumMonth=this.convertStringToInteger(lStrMonth,lNumMonthDefault)
			if(lNumMonth<=0){
				lNumMonth=lNumMonthDefault
			}
			Integer lNumYear=this.convertStringToInteger(lStrYear,lNumYearDefault)
			if(lNumYear<=0){
				lNumYear=lNumYearDefault
			}
			lNumYear=lNumYear+this.CONST_INTEGER_YEAR_OFFSET_ENG_THAI
			lreturn=String.format('%02d',lNumDay)+'/'+String.format('%02d',lNumMonth)+'/'+lNumYear.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertDateStringFromThaiToEng(String strDateThai){
		String lreturn=''
		try{
			String lStrDay=this.extractStringDayFromDateStringSlashDDMMYYYY(strDateThai)
			String lStrMonth=this.extractStringMonthFromDateStringSlashDDMMYYYY(strDateThai)
			String lStrYear=this.extractStringYearFromDateStringSlashDDMMYYYY(strDateThai)
			Integer lNumDayDefault=this.CONST_INTEGER_DAY_DEF
			Integer lNumMonthDefault=this.CONST_INTEGER_MONTH_DEF
			Integer lNumYearDefault=this.CONST_INTEGER_YEAR_DEF_THAI
			Integer lNumDay=this.convertStringToInteger(lStrDay,lNumDayDefault)
			if(lNumDay<=0){
				lNumDay=lNumDayDefault
			}
			Integer lNumMonth=this.convertStringToInteger(lStrMonth,lNumMonthDefault)
			if(lNumMonth<=0){
				lNumMonth=lNumMonthDefault
			}
			Integer lNumYear=this.convertStringToInteger(lStrYear,lNumYearDefault)
			if(lNumYear<=0){
				lNumYear=lNumYearDefault
			}
			lNumYear=lNumYear-this.CONST_INTEGER_YEAR_OFFSET_ENG_THAI
			lreturn=String.format('%02d',lNumDay)+'/'+String.format('%02d',lNumMonth)+'/'+lNumYear.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDate convertDateStringtoLocalDate(String strFormatter,String strDate){
		LocalDate lreturn=this.encodeLocalDateFromNumber(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF)
		try{
			lreturn=LocalDate.parse(strDate,this.getDateTimeFormatter(strFormatter))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalDateTime convertDateTimeStringtoLocalDateTime(String strFormatter,String strDatetime){
		LocalDateTime lreturn=this.encodeLocalDateTimeFromNumber(this.CONST_INTEGER_YEAR_DEF_ENG,this.CONST_INTEGER_MONTH_DEF,this.CONST_INTEGER_DAY_DEF,this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			lreturn=LocalDateTime.parse(strDatetime,this.getDateTimeFormatter(strFormatter))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static LocalTime convertTimeStringtoLocalTime(String strFormatter,String strTime){
		LocalTime lreturn=this.encodeLocalTimeFromNumber(this.CONST_INTEGER_HOUR_DEF,this.CONST_INTEGER_MINUTE_DEF,this.CONST_INTEGER_SECOND_DEF)
		try{
			lreturn=LocalTime.parse(strTime,this.getDateTimeFormatter(strFormatter))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String offsetDayByDateString(String strFormatter,String strDate,Integer offsetDay){
		String lreturn=strDate
		try{
			LocalDate lDateOrigin=this.convertDateStringtoLocalDate(strFormatter,strDate)
			LocalDate lDateOffset=lDateOrigin.plusDays(offsetDay)
			lreturn=this.convertLocalDateToString(strFormatter,lDateOffset)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCurrentStampDateTime(){
		String lreturn=''
		try{
			lreturn=this.convertLocalDateTimeToString(this.CONST_PATTERN_FORMATTER_STAMP_DATE_TIME)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String offsetDayByDateStringSlashDDMMYYYY(String strDate,Integer offsetDay){
		String lreturn=strDate
		try{
			lreturn=this.offsetDayByDateString(this.CONST_PATTERN_FORMATTER_DATE,strDate,offsetDay)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCurrentDateSlashDDMMYYYY(){
		String lreturn=''
		try{
			lreturn=this.convertLocalDateToString(this.CONST_PATTERN_FORMATTER_DATE)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS(){
		String lreturn=''
		try{
			lreturn=this.convertLocalDateTimeToString(this.CONST_PATTERN_FORMATTER_DATE_TIME)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCurrentTimeColonHHMMSS(){
		String lreturn=''
		try{
			lreturn=this.convertLocalTimeToString(this.CONST_PATTERN_FORMATTER_TIME)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertLocalTimeToTimeZoneString(LocalTime fromLocalTime=this.getLocalTimeCurrent()){
		String lreturn=''
		try{
			lreturn=fromLocalTime.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String[] extractStringArrayFromTimeZoneStringColonSSZZZZ(String strTimeZoneStringColonSSZZZZ){
		String[] lreturn=[]
		try{
			lreturn=strTimeZoneStringColonSSZZZZ.trim().split(':')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String[] extractStringArrayFromTimeZoneStringColonDotHHMMSSZZZZ(String strTimeZoneStringColonDotHHMMSSZZZZ){
		String[] lreturn=[]
		try{
			lreturn=strTimeZoneStringColonDotHHMMSSZZZZ.trim().split('[:.]')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractTimeStringHourFromTimeZoneStringColonDotHHMMSSZZZZ(String strTimeZoneStringColonDotHHMMSSZZZZ){
		String lreturn=''
		try{
			String[] lTimeSplit=this.extractStringArrayFromTimeZoneStringColonDotHHMMSSZZZZ(strTimeZoneStringColonDotHHMMSSZZZZ)
			if(lTimeSplit.size()>=3){
				lreturn=lTimeSplit[0]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractTimeStringMinuteFromTimeZoneStringColonDotHHMMSSZZZZ(String strTimeZoneStringColonDotHHMMSSZZZZ){
		String lreturn=''
		try{
			String[] lTimeSplit=this.extractStringArrayFromTimeZoneStringColonDotHHMMSSZZZZ(strTimeZoneStringColonDotHHMMSSZZZZ)
			if(lTimeSplit.size()>=3){
				lreturn=lTimeSplit[1]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractTimeStringZoneFromTimeZoneStringColonDotHHMMSSZZZZ(String strTimeZoneStringColonDotHHMMSSZZZZ){
		String lreturn=''
		try{
			String lTimeZone=''
			String lStrTimeZone=''
			String [] lTimeZoneSplit=[]
			String[] lTimeSplit=this.extractStringArrayFromTimeZoneStringColonSSZZZZ(strTimeZoneStringColonDotHHMMSSZZZZ)
			if(lTimeSplit.size()>=3){
				lTimeZone=lTimeSplit[2]
				Float lFloatTimeZone=this.convertStringToFloat(lTimeZone,this.CONST_FLOAT_ZONE_DEF)
				lStrTimeZone=lFloatTimeZone.toString()
			}
			if(lStrTimeZone.length()>0){
				lTimeZoneSplit=this.extractStringArrayFromTimeZoneStringColonDotHHMMSSZZZZ(lStrTimeZone)
			}
			if(lTimeZoneSplit.size()>=2){
				lreturn=lTimeZoneSplit[1]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String extractTimeStringSecondFromTimeZoneStringColonDotHHMMSSZZZZ(String strTimeZoneStringColonDotHHMMSSZZZZ){
		String lreturn=''
		try{
			String[] lTimeSplit=this.extractStringArrayFromTimeZoneStringColonDotHHMMSSZZZZ(strTimeZoneStringColonDotHHMMSSZZZZ)
			if(lTimeSplit.size()>=3){
				lreturn=lTimeSplit[2]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertLocalDateTimeToInstantString(LocalDateTime fromLocalDateTime=this.getLocalDateTimeCurrent()){
		String lreturn=''
		try{
			ZoneOffset lZoneOffset=ZoneOffset.UTC
			Instant lInstant=fromLocalDateTime.toInstant(lZoneOffset)
			lreturn=lInstant.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String trimStringLeft(String input){
		String lreturn=''
		final lStrRex='^\\s+'
		try{
			lreturn=input.replaceAll(lStrRex,'')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String trimStringRight(String input){
		String lreturn=''
		final lStrRex='\\s+$'
		try{
			lreturn=input.replaceAll(lStrRex,'')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String concatMessageLeftRightByPipe(String strMessageLeft,String strMessageRight){
		String lreturn=''
		try{
			String lMessageLeft=strMessageLeft.trim()
			String lMessageRight=strMessageRight.trim()
			if(lMessageLeft.length()<=0){
				lreturn=lMessageRight
			}else{
				lreturn=lMessageLeft+'||'+lMessageRight
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String concatMessageLeftRightByEnter(String strMessageLeft,String strMessageRight){
		String lreturn=''
		try{
			String lMessageLeft=strMessageLeft.trim()
			String lMessageRight=strMessageRight.trim()
			if(lMessageLeft.length()<=0){
				lreturn=lMessageRight
			}else{
				lreturn=lMessageLeft+StringUtils.LF+lMessageRight
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String concatCssLocatorParentChild(String strCssLocatorParent,String strCssLocatorChild){
		String lreturn=''
		try{
			String lCssLocatorParent=strCssLocatorParent.trim()
			String lCssLocatorChild=strCssLocatorChild.trim()
			if(lCssLocatorParent.length()<=0){
				lreturn=lCssLocatorChild
			}else{
				lreturn=lCssLocatorParent+StringUtils.SPACE+lCssLocatorChild
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String concatExceptionMessageLeftRight(String strMessageLeft,String strMethodName,String strMessageRight){
		String lreturn=''
		try{
			String lMessageLeft=strMessageLeft.trim()
			String lMethodName=strMethodName.trim()
			String lMessageRight=strMessageRight.trim()
			if(lMessageLeft.length()<=0){
				lreturn=lMessageRight
			}else{
				String lMessageText=''
				if(lMethodName.isBlank()){
					lMessageText='Exception:'+lMessageRight
				}else{
					lMessageText='Method['+lMethodName+']Exception:'+lMessageRight
				}
				lreturn=this.concatMessageLeftRightByPipe(lMessageLeft,lMessageText)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String copyStringFitForExcelCell(String strSource){
		String lreturn=''
		final Integer lLengthMaximum=32767
		try{
			String lStrSource=strSource.trim()
			if(lStrSource.length()>lLengthMaximum){
				lreturn=lStrSource.substring(0,lLengthMaximum-1).trim()
			}else{
				lreturn=lStrSource
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String validateVersionString(String strVersionString,String strDefaultString){
		String lreturn=''
		String lVersionString=strVersionString.toUpperCase().trim()
		String lDefaultString=strDefaultString.toUpperCase().trim()
		try{
			if(lVersionString.length()<=0){
				lreturn=lDefaultString
				return lreturn
			}
			String[] lVersionStringList=lVersionString.split('-')
			String lText=''
			for(String lVersionStringItem in lVersionStringList){
				lText=lVersionString=lVersionStringItem.trim()
				if(lText.length()>0){
					if(!lText.matches('.*[^A-Z].*')){
						if(lreturn.length()<=0){
							lreturn=lText
						}else{
							lreturn=lreturn+'-'+lText
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String concatURLRequestParameter(String strBaseURL,String strParameterName,String strParameterValue){
		String lreturn=''
		try{
			String lBaseURL=strBaseURL.trim()
			String lParameterName=strParameterName.trim()
			String lParameterValue=strParameterValue
			lParameterValue=this.convertStringToURLEncodedString(lParameterValue)
			if(lParameterName.length()<=0){
				lreturn=lBaseURL
			}else{
				if(lBaseURL.length()<=0){
					lreturn=lParameterName+'='+lParameterValue
				}else{
					if(this.checkStringContainString(lBaseURL,'?')){
						lreturn=lBaseURL+'&'+lParameterName+'='+lParameterValue
					}else{
						lreturn=lBaseURL+'?'+lParameterName+'='+lParameterValue
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addMapURLRequestParameterKeyValueWithURLEncoded(Map mapURLRequestParameter,String strParameterKey,String strParameterValue,Boolean isURLEncoded){
		Boolean lreturn=false
		String lParameterKey=strParameterKey.trim()
		if(lParameterKey.length()<=0){
			return lreturn
		}
		String lParameterValue=strParameterValue
		try{
			if(!isURLEncoded){
				lParameterValue=lParameterValue.trim()
			}else{
				lParameterValue=this.convertStringToURLEncodedString(lParameterValue)
			}
			mapURLRequestParameter.put(lParameterKey,lParameterValue)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertMapURLRequestParameterToStringURLRequestParameter(String strBaseURL,Map mapURLRequestParameter){
		String lreturn=''
		String lBaseURL=strBaseURL.trim()
		try{
			String lURLRequestParameterText=''
			if(!mapURLRequestParameter){
				lreturn=lBaseURL
			}else{
				if(!mapURLRequestParameter.isEmpty()){
					lURLRequestParameterText=String.valueOf(mapURLRequestParameter).replace(',','&').replace(StringUtils.SPACE,'').replace('{','').replace('}','')
				}
				lURLRequestParameterText=lURLRequestParameterText.trim()
				if(lBaseURL.length()<=0){
					if(lURLRequestParameterText.length()>0){
						lreturn='?'+lURLRequestParameterText
					}
				}else{
					if(lURLRequestParameterText.length()>0){
						if(this.checkStringContainString(lBaseURL,'?')){
							lreturn=lBaseURL+'&'+lURLRequestParameterText
						}else{
							lreturn=lBaseURL+'?'+lURLRequestParameterText
						}
					}else{
						lreturn=lBaseURL
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAuthorizationTokenString(String strServerTokenType,String strServerAccessToken){
		String lreturn=''
		String lServerTokenType=strServerTokenType.trim()
		if(lServerTokenType.length()<=0){
			lServerTokenType='Bearer'
		}
		String lServerAccessToken=strServerAccessToken.trim()
		try{
			lreturn=lServerTokenType+StringUtils.SPACE+lServerAccessToken
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAuthorizationBasicString(String strServerTokenType,String strServerAccessToken){
		String lreturn=''
		String lServerTokenType=strServerTokenType.trim()
		if(lServerTokenType.length()<=0){
			lServerTokenType='Basic'
		}
		String lServerAccessToken=strServerAccessToken.trim()
		try{
			lreturn=lServerTokenType+StringUtils.SPACE+lServerAccessToken
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addStringToListOfString(Boolean isUnique,String strText,List<String> targetList){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetList)){
			return lreturn
		}
		try{
			if(isUnique){
				if(!targetList.contains(strText)){
					targetList.add(strText)
					lreturn=true
				}
			}else{
				targetList.add(strText)
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addIntegerToListOfInteger(Boolean isUnique,Integer numAdd,List<Integer> targetList){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetList)){
			return lreturn
		}
		try{
			if(isUnique){
				if(!targetList.contains(numAdd)){
					targetList.add(numAdd)
					lreturn=true
				}
			}else{
				targetList.add(numAdd)
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addPrefixKeyToMap(String strPrefixKey,Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(strPrefixKey)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapDst)){
			return lreturn
		}
		String lStrPrefixKey=strPrefixKey.trim()
		try{
			if(lStrPrefixKey.isBlank()){
				mapDst.putAll(mapSrc)
				lreturn=true
			}else{
				Boolean lIsAddOK=true
				Set<String> lKeySetList=mapSrc.keySet()
				for(String lKeySetItemKey in lKeySetList){
					Object lKeysetItemValue=mapSrc.get(lKeySetItemKey)
					mapDst.put(lStrPrefixKey+lKeySetItemKey,lKeysetItemValue)
				}
				lreturn=lIsAddOK
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean cloneMapToMap(Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapDst)){
			return lreturn
		}
		try{
			mapDst.clear()
			if(!this.checkObjectNullOrEmptyOfMap(mapSrc)){
				mapDst.putAll(mapSrc)
			}
			lreturn=mapDst.equals(mapSrc)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addMapValueFromMapToMapByKey(String strMapKey,Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(strMapKey)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapDst)){
			return lreturn
		}
		String lStrMapKey=strMapKey.trim()
		if(lStrMapKey.isBlank()){
			return lreturn
		}
		try{
			if(mapSrc.containsKey(lStrMapKey)){
				String lStrMapValue=mapSrc.get(lStrMapKey)
				if(!this.checkObjectNullOfObject(lStrMapValue)){
					mapDst.put(lStrMapKey,lStrMapValue)
					lreturn=true
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addMapValueFromMapToMapByPrefixKey(String strPrefixKey,Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(strPrefixKey)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapDst)){
			return lreturn
		}
		String lStrPrefixKey=strPrefixKey.trim()
		if(lStrPrefixKey.isBlank()){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in mapSrc){
				if(this.checkObjectNullOfObject(lEntry.key)){
					break
				}
				String lStrMapKey=lEntry.key.toString()
				if(lStrMapKey.startsWith(lStrPrefixKey)){
					mapDst.put(lStrMapKey,lEntry.value)
					lreturn=true
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addMapValueFromMapToMapByContainKey(String strContainKey,Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(strContainKey)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapDst)){
			return lreturn
		}
		String lStrContainKey=strContainKey.trim()
		if(lStrContainKey.isBlank()){
			return lreturn
		}
		try{
			for(Map.Entry lEntry in mapSrc){
				if(this.checkObjectNullOfObject(lEntry.key)){
					break
				}
				String lStrMapKey=lEntry.key.toString()
				if(this.checkStringContainString(lStrMapKey,lStrContainKey)){
					mapDst.put(lStrMapKey,lEntry.value)
					lreturn=true
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean addMapValueFromMapToMapByPreferDstKey(Map mapSrc,Map mapDst){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(mapSrc)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapDst)){
			return lreturn
		}
		try{
			Boolean lIsAddOK=true
			for(Map.Entry lEntry in mapDst){
				if(this.checkObjectNullOfObject(lEntry.key)){
					break
				}
				String lStrMapKey=lEntry.key.toString()
				if(mapSrc.containsKey(lStrMapKey)){
					lIsAddOK=this.addMapValueFromMapToMapByKey(lStrMapKey,mapSrc,mapDst)
				}
				if(!lIsAddOK){
					break
				}
			}
			lreturn=lIsAddOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStrValidatedValueFromIGNTestDataFiledType(IGNTestDataFieldType enumIGNTestDataFiledType,String strInputParameterKey,String strDefaultText='',Map mapFieldMasterPair=[:]){
		String lreturn=null
		if(this.checkObjectNullOfObject(enumIGNTestDataFiledType)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strInputParameterKey)){
			return lreturn
		}
		String lStrInputParameterKey=strInputParameterKey.trim()
		try{
			Boolean lIsValid=false
			String lStrValidated=''
			switch(enumIGNTestDataFiledType){
				case IGNTestDataFieldType.NullableText:
					lStrValidated=lStrInputParameterKey
					lIsValid=true
					break
				case IGNTestDataFieldType.PairListWithDefaultKey:
					Boolean lIsCheckOK=false
					String lStrDefaultKey=''
					if(this.checkObjectEmptyOfString(lStrInputParameterKey)){
						if(!this.checkObjectNullOfObject(strDefaultText)){
							String lStrDefaultText=strDefaultText.trim()
							if(!this.checkObjectEmptyOfString(lStrDefaultText)){
								if(!this.checkObjectNullOrEmptyOfMap(mapFieldMasterPair)){
									lStrDefaultKey=lStrDefaultText
									lIsCheckOK=true
								}
							}
						}
					}else{
						if(!this.checkObjectNullOrEmptyOfMap(mapFieldMasterPair)){
							lIsCheckOK=true
						}
					}
					if(lIsCheckOK){
						if(!this.checkObjectEmptyOfString(lStrInputParameterKey)){
							if(mapFieldMasterPair.containsKey(lStrInputParameterKey)){
								lStrValidated=mapFieldMasterPair.get(lStrInputParameterKey)
								lIsValid=(!this.checkObjectNullOfObject(lStrValidated))
							}
						}else{
							if(mapFieldMasterPair.containsKey(lStrDefaultKey)){
								lStrValidated=mapFieldMasterPair.get(lStrDefaultKey)
								lIsValid=(!this.checkObjectNullOfObject(lStrValidated))
							}
						}
						if(!lIsValid){
							if(mapFieldMasterPair.containsKey(lStrDefaultKey)){
								lStrValidated=mapFieldMasterPair.get(lStrDefaultKey)
								lIsValid=(!this.checkObjectNullOfObject(lStrValidated))
							}
						}
					}
					break
				case IGNTestDataFieldType.TextWithDefaultTextIfBlank:
					if(this.checkObjectEmptyOfString(lStrInputParameterKey)){
						if(!this.checkObjectNullOfObject(strDefaultText)){
							String lStrDefaultText=strDefaultText.trim()
							if(!this.checkObjectEmptyOfString(lStrDefaultText)){
								lStrValidated=lStrDefaultText
								lIsValid=true
							}
						}
					}else{
						lStrValidated=lStrInputParameterKey
						lIsValid=true
					}
					break
				default:
					break
			}
			if(lIsValid){
				lreturn=lStrValidated
			}else{
				this.printLog('getStrValidatedValueFromIGNTestDataFiledType:Invalid:'+enumIGNTestDataFiledType.name())
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<String> getStringEncodedForExcelCell(String strSource){
		List<String> lreturn=null
		final Integer lLengthMaximum=32767
		if(this.checkObjectNullOfObject(strSource)){
			return lreturn
		}
		String lStrSource=strSource
		try{
			lStrSource=this.convertStringToURLEncodedString(lStrSource)
			if(lStrSource.length()<=0){
				lreturn=new ArrayList<String>()
				lreturn.add('')
			}else{
				String[] lCollectionStr=lStrSource.split("(?<=\\G.{"+ lLengthMaximum + "})")
				lreturn=Arrays.asList(lCollectionStr)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringDecodedForExcelCell(List<String> targetList){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfList(targetList)){
			return lreturn
		}
		try{
			String lText=String.join('',targetList)
			lreturn=this.convertStringToURLDecodedString(lText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map convertGroovyRowResultToMapString(GroovyRowResult targetGroovyRowResult){
		Map lreturn=[:]
		if(this.checkObjectNullOfObject(targetGroovyRowResult)){
			return lreturn
		}
		try{
			Boolean lIsNextToDo=false
			Map lMapItemMaster=[:]
			Map lMapItemCurrent=[:]
			Set lSetTargetGroovyRowResultKey=targetGroovyRowResult.keySet()
			if(!this.checkObjectNullOrEmptyOfSet(lSetTargetGroovyRowResultKey)){
				for(String lStrKey in lSetTargetGroovyRowResultKey){
					lMapItemMaster.put(lStrKey,'')
				}
				lIsNextToDo=lMapItemMaster.size()>0
			}
			if(lIsNextToDo){
				lIsNextToDo=this.cloneMapToMap(lMapItemMaster,lMapItemCurrent)
			}
			if(lIsNextToDo){
				for(Map.Entry lMapEntry in lMapItemMaster){
					try{
						lMapItemCurrent.put(lMapEntry.key,targetGroovyRowResult.get(lMapEntry.key).toString())
					}catch(Exception ex){
						//ex.printStackTrace()
					}
				}
				this.cloneMapToMap(lMapItemCurrent,lreturn)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<Map> convertListGroovyRowResultToListMapString(List<GroovyRowResult> targetList){
		List<Map> lreturn=null
		if(this.checkObjectNullOfObject(targetList)){
			return lreturn
		}
		try{
			lreturn=new ArrayList<Map>()
			Boolean lIsNextToDo=false
			Integer lNumTargetListSize=targetList.size()
			lIsNextToDo=lNumTargetListSize>0
			if(lIsNextToDo){
				for(GroovyRowResult lTargetListItemCurrent in targetList){
					Map lMapItemCurrent=this.convertGroovyRowResultToMapString(lTargetListItemCurrent)
					lreturn.add(lMapItemCurrent)
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Object convertStringValueToDataTypeByStringDataType(String strSrcValue,String strDstDataType){
		Object lreturn=null
		if(this.checkObjectNullOrEmptyOfString(strDstDataType)){
			return lreturn
		}
		try{
			List<String> lListDataTypePrimitive=Arrays.asList('BigDecimal','BigInteger','Boolean','boolean','Double','Float','Integer','Long','Short','String')
			if(!lListDataTypePrimitive.contains(strDstDataType)){
				return lreturn
			}
			switch(strDstDataType){
				case 'BigDecimal':
					try{
						lreturn=this.convertStringToBigDecimal(strSrcValue,0.0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'BigInteger':
					try{
						lreturn=this.convertStringToBigInteger(strSrcValue,0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Boolean':
					try{
						lreturn=this.convertStringToBoolean(strSrcValue)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'boolean':
					try{
						boolean lVariable=Boolean.TRUE.equals(this.convertStringToBoolean(strSrcValue))
						lreturn=lVariable
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Double':
					try{
						lreturn=this.convertStringToDouble(strSrcValue,0.0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'double':
					try{
						double lVariable=this.convertStringToDouble(strSrcValue,0.0)
						lreturn=lVariable
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Float':
					try{
						lreturn=this.convertStringToFloat(strSrcValue,0.0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Integer':
					try{
						lreturn=this.convertStringToInteger(strSrcValue,0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Long':
					try{
						lreturn=this.convertStringToLong(strSrcValue,0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				case 'Short':
					try{
						lreturn=this.convertStringToShort(strSrcValue,0)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
				default:
					try{
						lreturn=this.convertStringToString(strSrcValue)
					}catch(Exception ex){
						//ex.printStackTrace()
					}
					break
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkStringJsonTextValid(String strJsonText){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(strJsonText)){
			return lreturn
		}
		try{
			Boolean lIsValid01=false
			Boolean lIsValid02=false
			Boolean lIsValid03=false
			/*Check Valid 01 JSON API*/
			try{
				new JSONObject(strJsonText)
				lIsValid01=true
			}catch(JSONException ex){
				//ex.printStackTrace()
				try{
					new JSONArray(strJsonText)
					lIsValid01=true
				}catch(JSONException exx){
					//exx.printStackTrace()
				}
			}
			/*Check Valid 02 Jackson*/
			try{
				ObjectMapper lObjectMapper=new ObjectMapper().enable(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)
				try{
					lObjectMapper.readTree(strJsonText)
					lIsValid02=true
				}catch(JacksonException exx){
					//exx.printStackTrace()
				}
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			/*Check Valid 03 Gson*/
			try{
				TypeAdapter<JsonElement> lStrictAdapter=new Gson().getAdapter(JsonElement.class)
				try{
					lStrictAdapter.fromJson(strJsonText)
					lIsValid03=true
				}catch(JsonSyntaxException|IOException exx){
					//exx.printStackTrace()
				}
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			lreturn=lIsValid01&&lIsValid02&&lIsValid03
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringJsonTextPrettyPrintFromJsonValue(JsonValue targetJsonValue){
		String lreturn=''
		if(this.checkObjectNullOfObject(targetJsonValue)){
			return lreturn
		}
		try{
			StringWriter lStringWriter=new StringWriter()
			Map<String,Object> lMapConfig=Collections.singletonMap(JsonGenerator.PRETTY_PRINTING,true)
			JsonWriterFactory lJsonWriterFactory=Json.createWriterFactory(lMapConfig)
			JsonWriter lJsonWriter=lJsonWriterFactory.createWriter(lStringWriter)
			lJsonWriter.write(targetJsonValue)
			lreturn=lStringWriter.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringJsonTextPrettyPrintFromString(String strJsonText){
		String lreturn=''
		if(!this.checkStringJsonTextValid(strJsonText)){
			return lreturn
		}
		try{
			JsonReader lJsonReader=Json.createReader(new StringReader(strJsonText))
			JsonValue lJsonValue=lJsonReader.readValue()
			lreturn=this.getStringJsonTextPrettyPrintFromJsonValue(lJsonValue)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRemovedStringBeginEnd(String strTargetText,String strBeginEndText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strBeginEndText)){
			return lreturn
		}
		try{
			String lStrQuote=strBeginEndText
			if(strTargetText.startsWith(lStrQuote)&&strTargetText.endsWith(lStrQuote)){
				lreturn=strTargetText.substring(1,strTargetText.length()-lStrQuote.length())
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRemovedSingleQuoteBeginEnd(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		try{
			String lStrQuote='\''
			lreturn=this.getRemovedStringBeginEnd(strTargetText,lStrQuote)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRemovedDoubleQuoteBeginEnd(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		try{
			String lStrQuote='\"'
			lreturn=this.getRemovedStringBeginEnd(strTargetText,lStrQuote)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAddedStringBeginEnd(String strTargetText,String strBeginEndText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strBeginEndText)){
			return lreturn
		}
		try{
			String lStrQuote=strBeginEndText
			lreturn=lStrQuote+strTargetText+lStrQuote
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAddedSingleQuoteBeginEnd(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		try{
			String lStrQuote='\''
			lreturn=this.getAddedStringBeginEnd(strTargetText,lStrQuote)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAddedDoubleQuoteBeginEnd(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfString(strTargetText)){
			return lreturn
		}
		try{
			String lStrQuote='"'
			lreturn=this.getAddedStringBeginEnd(strTargetText,lStrQuote)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String mergeStringJsonTextFromOrgByUpdForGeneric(String strJsonTextOrg,String strJsonTextUpd,Boolean boolIsIncludeOperationReplace,Boolean boolIsIncludeOperationAdd,Boolean boolIsIncludeOperationRemove){
		String lreturn=''
		if(this.checkObjectNullOfObject(strJsonTextOrg)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strJsonTextUpd)){
			return lreturn
		}
		if(!this.checkStringJsonTextValid(strJsonTextOrg)){
			return lreturn
		}
		try{
			if(!this.checkStringJsonTextValid(strJsonTextUpd)){
				lreturn=strJsonTextOrg
				return lreturn
			}
			JsonReader lJsonReaderLeft=Json.createReader(new StringReader(strJsonTextOrg))
			JsonValue lJsonValueLeft=lJsonReaderLeft.readValue()
			JsonReader lJsonReaderRight=Json.createReader(new StringReader(strJsonTextUpd))
			JsonValue lJsonValueRight=lJsonReaderRight.readValue()
			JsonPatch lJsonPatchDiff=Json.createDiff(lJsonValueLeft.asJsonObject(),lJsonValueRight.asJsonObject())
			JsonArray lJsonArrayDiff=lJsonPatchDiff.toJsonArray()
			JsonArrayBuilder lJsonArrayBuilderContainer=Json.createArrayBuilder()
			for(JsonValue lJsonValueObj in lJsonArrayDiff){
				JsonObject lJsonObject=lJsonValueObj.asJsonObject()
				String lStrObj01Key='op'
				String lStrObj01Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj01Key).toString())
				String lStrObj02Key='path'
				String lStrObj02Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj02Key).toString())
				String lStrObj03Key='value'
				String lStrObj03Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj03Key).toString())
				if(lStrObj01Value.equalsIgnoreCase('replace')){
					if(boolIsIncludeOperationReplace){
						lJsonArrayBuilderContainer.add(lJsonObject)
					}
				}else if(lStrObj01Value.equalsIgnoreCase('add')){
					if(boolIsIncludeOperationAdd){
						lJsonArrayBuilderContainer.add(lJsonObject)
					}
				}else if(lStrObj01Value.equalsIgnoreCase('remove')){
					if(boolIsIncludeOperationRemove){
						lJsonArrayBuilderContainer.add(lJsonObject)
					}
				}
			}
			JsonPatch lJsonPatchPayLoad=Json.createPatch(lJsonArrayBuilderContainer.build())
			JsonValue lJsonValuePatchedPayLoad=lJsonPatchPayLoad.apply(lJsonValueLeft.asJsonObject())
			lreturn=lJsonValuePatchedPayLoad.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String mergeStringJsonTextFromOrgByUpdForPricingAPI(String strJsonTextOrg,String strJsonTextUpd,Boolean boolIsIncludeOperationReplace,Boolean boolIsIncludeOperationAdd,Boolean boolIsIncludeOperationRemove){
		String lreturn=''
		if(this.checkObjectNullOfObject(strJsonTextOrg)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strJsonTextUpd)){
			return lreturn
		}
		if(!this.checkStringJsonTextValid(strJsonTextOrg)){
			return lreturn
		}
		try{
			if(!this.checkStringJsonTextValid(strJsonTextUpd)){
				lreturn=strJsonTextOrg
				return lreturn
			}
			JsonReader lJsonReaderLeft=Json.createReader(new StringReader(strJsonTextOrg))
			JsonValue lJsonValueLeft=lJsonReaderLeft.readValue()
			JsonReader lJsonReaderRight=Json.createReader(new StringReader(strJsonTextUpd))
			JsonValue lJsonValueRight=lJsonReaderRight.readValue()
			Map<String,Object> lMapFlattenJsonLeft=JsonFlattener.flattenAsMap(strJsonTextOrg)
			Map<String,Object> lMapFlattenJsonRight=JsonFlattener.flattenAsMap(strJsonTextUpd)
			Map<String,Object> lMapTransformJsonLeft=[:]
			Map<String,Object> lMapTransformJsonRight=[:]
			for(Map.Entry lEntry in lMapFlattenJsonLeft){
				String lStrKeyOrg=lEntry.key.toString()
				String lStrKeyNew=lStrKeyOrg
				lStrKeyNew=lStrKeyNew.replaceAll('\\.','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\[','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\]','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\/\\/','/')
				lMapTransformJsonLeft.put(lStrKeyNew,lEntry.value)
			}
			for(Map.Entry lEntry in lMapFlattenJsonRight){
				String lStrKeyOrg=lEntry.key.toString()
				String lStrKeyNew=lStrKeyOrg
				lStrKeyNew=lStrKeyNew.replaceAll('\\.','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\[','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\]','/')
				lStrKeyNew=lStrKeyNew.replaceAll('\\/\\/','/')
				lMapTransformJsonRight.put(lStrKeyNew,lEntry.value)
			}
			JsonPatch lJsonPatchDiff=Json.createDiff(lJsonValueLeft.asJsonObject(),lJsonValueRight.asJsonObject())
			JsonArray lJsonArrayDiff=lJsonPatchDiff.toJsonArray()
			JsonArrayBuilder lJsonArrayBuilderContainer=Json.createArrayBuilder()
			for(JsonValue lJsonValueObj in lJsonArrayDiff){
				JsonObject lJsonObject=lJsonValueObj.asJsonObject()
				String lStrObj01Key='op'
				String lStrObj01Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj01Key).toString())
				String lStrObj02Key='path'
				String lStrObj02Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj02Key).toString())
				String lStrObj03Key='value'
				String lStrObj03Value=this.getRemovedDoubleQuoteBeginEnd(lJsonObject.get(lStrObj03Key).toString())
				if(lStrObj01Value.equalsIgnoreCase('replace')){
					if(boolIsIncludeOperationReplace){
						String lStrPath=lStrObj02Value
						if(lStrPath.startsWith('/')){
							lStrPath=lStrPath.substring(1)
						}
						Boolean lIsFoundLeft=lMapTransformJsonLeft.containsKey(lStrPath)
						Boolean lIsFoundRight=lMapTransformJsonRight.containsKey(lStrPath)
						if(lIsFoundLeft&&lIsFoundRight){
							String lStrLeft=lMapTransformJsonLeft.get(lStrPath)
							String lStrRight=lMapTransformJsonRight.get(lStrPath)
							String lStrValue=lJsonObject.get(lStrObj03Key)
							Boolean lIsUpdated=false
							if(lStrRight.isEmpty()){
								if(!lStrLeft.isEmpty()){
									if(lStrLeft.equals('null')){
										lStrValue=lStrRight
									}else{
										lStrValue=lStrLeft
									}
									lIsUpdated=true
								}
							}else{
								if(lStrRight.equals('None')){
									if(lStrLeft.isEmpty()){
										lStrValue=lStrRight
									}else{
										lStrValue=lStrLeft
									}
									lIsUpdated=true
								}
							}
							if(lIsUpdated){
								JsonBuilderFactory lJsonBuilderFactory=Json.createBuilderFactory()
								JsonObject lJsonObjectNew=lJsonBuilderFactory.createObjectBuilder()
										.add(lStrObj01Key,lStrObj01Value)
										.add(lStrObj02Key,lStrObj02Value)
										.add(lStrObj03Key,lStrValue).build()
								lJsonArrayBuilderContainer.add(lJsonObjectNew)
							}else{
								lJsonArrayBuilderContainer.add(lJsonObject)
							}
						}
					}
				}else if(lStrObj01Value.equalsIgnoreCase('add')){
					if(boolIsIncludeOperationAdd){
						lJsonArrayBuilderContainer.add(lJsonObject)
					}
				}else if(lStrObj01Value.equalsIgnoreCase('remove')){
					if(boolIsIncludeOperationRemove){
						lJsonArrayBuilderContainer.add(lJsonObject)
					}
				}
			}
			JsonPatch lJsonPatchPayLoad=Json.createPatch(lJsonArrayBuilderContainer.build())
			JsonValue lJsonValuePatchedPayLoad=lJsonPatchPayLoad.apply(lJsonValueLeft.asJsonObject())
			lreturn=lJsonValuePatchedPayLoad.toString()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCommaTextFromListString(List<String> listString){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfList(listString)){
			return lreturn
		}
		try{
			String lStrCommaText=listString.collect{"$it"}.join(',')
			lreturn=lStrCommaText
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringCommaQuoteFromListString(List<String> listString,Boolean isQuoteSingle){
		String lreturn=''
		if(this.checkObjectNullOrEmptyOfList(listString)){
			return lreturn
		}
		try{
			String lStrCommaQuote=''
			if(isQuoteSingle){
				lStrCommaQuote=listString.collect{"'$it'"}.join(',')
			}else{
				listString.eachWithIndex{lStr,lIndex->
					if(lIndex>0){
						lStrCommaQuote=lStrCommaQuote+','+this.getAddedDoubleQuoteBeginEnd(lStr)
					}else{
						lStrCommaQuote=this.getAddedDoubleQuoteBeginEnd(lStr)
					}
				}
			}
			lreturn=lStrCommaQuote
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringBracketRound(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOfObject(strTargetText)){
			return lreturn
		}
		try{
			lreturn='('+strTargetText+')'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringBracketSquare(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOfObject(strTargetText)){
			return lreturn
		}
		try{
			lreturn='['+strTargetText+']'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringBracketCurly(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOfObject(strTargetText)){
			return lreturn
		}
		try{
			lreturn='{'+strTargetText+'}'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringBracketAngle(String strTargetText){
		String lreturn=''
		if(this.checkObjectNullOfObject(strTargetText)){
			return lreturn
		}
		try{
			lreturn='<'+strTargetText+'>'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringQueryForWhereClauseBuilder(Boolean isWhereJoinOperatorAnd,String strClauseCustomText,Map mapClauseEqualAnd,Map mapClauseEqualOr,Map mapClauseInAnd,Map mapClauseInOr,Map mapClauseLikeAnd,Map mapClauseLikeOr,Map mapClauseNotEqualAnd,Map mapClauseNotEqualOr,Map mapClauseNotInAnd,Map mapClauseNotInOr,Map mapClauseNotLikeAnd,Map mapClauseNotLikeOr){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(strClauseCustomText)){
			return lreturn
		}
		String lStrClauseCustomText=strClauseCustomText.trim()
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseEqualAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseEqualOr)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseInAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseInOr)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseLikeAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseLikeOr)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotEqualAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotEqualOr)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotInAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotInOr)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotLikeAnd)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(mapClauseNotLikeOr)){
			return lreturn
		}
		try{
			String lStrWhereClauseText=''
			String lStrWhereJoinOperatorText=''
			String lStrClauseEqualAndText=''
			String lStrClauseEqualOrText=''
			String lStrClauseInAndText=''
			String lStrClauseInOrText=''
			String lStrClauseLikeAndText=''
			String lStrClauseLikeOrText=''
			String lStrClauseNotEqualAndText=''
			String lStrClauseNotEqualOrText=''
			String lStrClauseNotInAndText=''
			String lStrClauseNotInOrText=''
			String lStrClauseNotLikeAndText=''
			String lStrClauseNotLikeOrText=''
			if(isWhereJoinOperatorAnd){
				lStrWhereJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
			}else{
				lStrWhereJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
			}
			if(lStrClauseCustomText.length()>0){
				lStrClauseCustomText=this.getStringBracketRound(lStrClauseCustomText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseEqualAnd)){
				for(Map.Entry lEntryItem in mapClauseEqualAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('=',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+lStrEntryItemValue
						if(lStrClauseEqualAndText.length()>0){
							lStrClauseEqualAndText=lStrClauseEqualAndText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseEqualAndText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseEqualAndText.length()>0){
				lStrClauseEqualAndText=this.getStringBracketRound(lStrClauseEqualAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseEqualOr)){
				for(Map.Entry lEntryItem in mapClauseEqualOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('=',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+lStrEntryItemValue
						if(lStrClauseEqualOrText.length()>0){
							lStrClauseEqualOrText=lStrClauseEqualOrText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseEqualOrText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseEqualOrText.length()>0){
				lStrClauseEqualOrText=this.getStringBracketRound(lStrClauseEqualOrText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseInAnd)){
				for(Map.Entry lEntryItem in mapClauseInAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('IN',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+'('+lStrEntryItemValue+')'
						if(lStrClauseInAndText.length()>0){
							lStrClauseInAndText=lStrClauseInAndText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseInAndText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseInAndText.length()>0){
				lStrClauseInAndText=this.getStringBracketRound(lStrClauseInAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseInOr)){
				for(Map.Entry lEntryItem in mapClauseInOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('IN',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+'('+lStrEntryItemValue+')'
						if(lStrClauseInOrText.length()>0){
							lStrClauseInOrText=lStrClauseInOrText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseInOrText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseInOrText.length()>0){
				lStrClauseInOrText=this.getStringBracketRound(lStrClauseInOrText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseLikeAnd)){
				for(Map.Entry lEntryItem in mapClauseLikeAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('LIKE',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+lStrEntryItemValue
						if(lStrClauseLikeAndText.length()>0){
							lStrClauseLikeAndText=lStrClauseLikeAndText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseLikeAndText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseLikeAndText.length()>0){
				lStrClauseLikeAndText=this.getStringBracketRound(lStrClauseLikeAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseLikeOr)){
				for(Map.Entry lEntryItem in mapClauseLikeOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseText=''
					String lStrSingleClauseOperatorText=this.getAddedStringBeginEnd('LIKE',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseText=lStrEntryItemKey+lStrSingleClauseOperatorText+lStrEntryItemValue
						if(lStrClauseLikeOrText.length()>0){
							lStrClauseLikeOrText=lStrClauseLikeOrText+lStrJoinOperatorText+lStrSingleClauseText
						}else{
							lStrClauseLikeOrText=lStrSingleClauseText
						}
					}
				}
			}
			if(lStrClauseLikeOrText.length()>0){
				lStrClauseLikeOrText=this.getStringBracketRound(lStrClauseLikeOrText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotEqualAnd)){
				for(Map.Entry lEntryItem in mapClauseNotEqualAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('=',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+lStrEntryItemValue
						if(lStrClauseNotEqualAndText.length()>0){
							lStrClauseNotEqualAndText=lStrClauseNotEqualAndText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotEqualAndText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotEqualAndText.length()>0){
				lStrClauseNotEqualAndText=this.getStringBracketRound(lStrClauseNotEqualAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotEqualOr)){
				for(Map.Entry lEntryItem in mapClauseNotEqualOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('=',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+lStrEntryItemValue
						if(lStrClauseNotEqualOrText.length()>0){
							lStrClauseNotEqualOrText=lStrClauseNotEqualOrText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotEqualOrText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotEqualOrText.length()>0){
				lStrClauseNotEqualOrText=this.getStringBracketRound(lStrClauseNotEqualOrText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotInAnd)){
				for(Map.Entry lEntryItem in mapClauseNotInAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('IN',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+'('+lStrEntryItemValue+')'
						if(lStrClauseNotInAndText.length()>0){
							lStrClauseNotInAndText=lStrClauseNotInAndText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotInAndText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotInAndText.length()>0){
				lStrClauseNotInAndText=this.getStringBracketRound(lStrClauseNotInAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotInOr)){
				for(Map.Entry lEntryItem in mapClauseNotInOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('IN',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+'('+lStrEntryItemValue+')'
						if(lStrClauseNotInOrText.length()>0){
							lStrClauseNotInOrText=lStrClauseNotInOrText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotInOrText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotInOrText.length()>0){
				lStrClauseNotInOrText=this.getStringBracketRound(lStrClauseNotInOrText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotLikeAnd)){
				for(Map.Entry lEntryItem in mapClauseNotLikeAnd){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('LIKE',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('AND',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+lStrEntryItemValue
						if(lStrClauseNotLikeAndText.length()>0){
							lStrClauseNotLikeAndText=lStrClauseNotLikeAndText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotLikeAndText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotLikeAndText.length()>0){
				lStrClauseNotLikeAndText=this.getStringBracketRound(lStrClauseNotLikeAndText)
			}
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapClauseNotLikeOr)){
				for(Map.Entry lEntryItem in mapClauseNotLikeOr){
					String lStrEntryItemKey=lEntryItem.key.toString()
					String lStrEntryItemValue=lEntryItem.value.toString()
					String lStrSingleClauseNotText=''
					String lStrSingleClauseNotOperatorText=this.getAddedStringBeginEnd('LIKE',StringUtils.SPACE)
					String lStrJoinOperatorText=this.getAddedStringBeginEnd('OR',StringUtils.SPACE)
					if(lStrEntryItemValue.length()>0){
						lStrSingleClauseNotText='NOT'+StringUtils.SPACE+lStrEntryItemKey+lStrSingleClauseNotOperatorText+lStrEntryItemValue
						if(lStrClauseNotLikeOrText.length()>0){
							lStrClauseNotLikeOrText=lStrClauseNotLikeOrText+lStrJoinOperatorText+lStrSingleClauseNotText
						}else{
							lStrClauseNotLikeOrText=lStrSingleClauseNotText
						}
					}
				}
			}
			if(lStrClauseNotLikeOrText.length()>0){
				lStrClauseNotLikeOrText=this.getStringBracketRound(lStrClauseNotLikeOrText)
			}
			if(lStrClauseCustomText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseCustomText
				}else{
					lStrWhereClauseText=lStrClauseCustomText
				}
			}
			if(lStrClauseEqualAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseEqualAndText
				}else{
					lStrWhereClauseText=lStrClauseEqualAndText
				}
			}
			if(lStrClauseEqualOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseEqualOrText
				}else{
					lStrWhereClauseText=lStrClauseEqualOrText
				}
			}
			if(lStrClauseInAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseInAndText
				}else{
					lStrWhereClauseText=lStrClauseInAndText
				}
			}
			if(lStrClauseInOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseInOrText
				}else{
					lStrWhereClauseText=lStrClauseInOrText
				}
			}
			if(lStrClauseLikeAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseLikeAndText
				}else{
					lStrWhereClauseText=lStrClauseLikeAndText
				}
			}
			if(lStrClauseLikeOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseLikeOrText
				}else{
					lStrWhereClauseText=lStrClauseLikeOrText
				}
			}
			if(lStrClauseNotEqualAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotEqualAndText
				}else{
					lStrWhereClauseText=lStrClauseNotEqualAndText
				}
			}
			if(lStrClauseNotEqualOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotEqualOrText
				}else{
					lStrWhereClauseText=lStrClauseNotEqualOrText
				}
			}
			if(lStrClauseNotInAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotInAndText
				}else{
					lStrWhereClauseText=lStrClauseNotInAndText
				}
			}
			if(lStrClauseNotInOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotInOrText
				}else{
					lStrWhereClauseText=lStrClauseNotInOrText
				}
			}
			if(lStrClauseNotLikeAndText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotLikeAndText
				}else{
					lStrWhereClauseText=lStrClauseNotLikeAndText
				}
			}
			if(lStrClauseNotLikeOrText.length()>0){
				if(lStrWhereClauseText.length()>0){
					lStrWhereClauseText=lStrWhereClauseText+lStrWhereJoinOperatorText+lStrClauseNotLikeOrText
				}else{
					lStrWhereClauseText=lStrClauseNotLikeOrText
				}
			}
			lreturn=lStrWhereClauseText.trim()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStringQueryForSelectWhereBuilder(String strTargetObjectName,Boolean isToPreferSelectedFieldName,List<String> listFieldNameAll,List<String> listFieldNameSelected,String strWhereClause,String strSuffixQuery){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetObjectName)){
			return lreturn
		}
		String lStrTargetObjectName=strTargetObjectName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetObjectName)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(listFieldNameAll)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(listFieldNameSelected)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strWhereClause)){
			return lreturn
		}
		String lStrWhereClause=strWhereClause.trim()
		if(IGNUemaHelper.checkObjectNullOfObject(strSuffixQuery)){
			return lreturn
		}
		String lStrSuffixQuery=strSuffixQuery.trim()
		try{
			String lStrQueryText=''
			String lStrSelectText=''
			String lStrFromText=''
			String lStrWhereText=''
			if(isToPreferSelectedFieldName){
				if(IGNUemaHelper.checkObjectEmptyOfList(listFieldNameSelected)){
					lStrSelectText=this.getStringCommaTextFromListString(listFieldNameAll)
				}else{
					lStrSelectText=this.getStringCommaTextFromListString(listFieldNameSelected)
				}
			}else{
				List<String> lListValidatedFieldName=new ArrayList<String>()
				for(String lStrListSelectedFieldNameItem in listFieldNameSelected){
					if(!lStrListSelectedFieldNameItem.isBlank()){
						if(this.checkListContainStringCaseInsensitive(listFieldNameAll,lStrListSelectedFieldNameItem)){
							if(!this.checkListContainStringCaseInsensitive(lListValidatedFieldName,lStrListSelectedFieldNameItem)){
								lListValidatedFieldName.add(lStrListSelectedFieldNameItem)
							}
						}
					}
				}
				if(lListValidatedFieldName.size()==listFieldNameSelected.size()){
					if(listFieldNameSelected.size()>0){
						lStrSelectText=IGNUemaHelper.getStringCommaTextFromListString(listFieldNameSelected)
					}else{
						lStrSelectText=IGNUemaHelper.getStringCommaTextFromListString(listFieldNameAll)
					}
				}else{
					lStrSelectText=IGNUemaHelper.getStringCommaTextFromListString(listFieldNameAll)
				}
			}
			if(lStrSelectText.length()<=0){
				return lreturn
			}
			lStrSelectText='SELECT'+StringUtils.SPACE+lStrSelectText
			lStrFromText='FROM'+StringUtils.SPACE+lStrTargetObjectName
			lStrQueryText=lStrSelectText+StringUtils.SPACE+lStrFromText
			if(lStrWhereClause.length()>0){
				lStrWhereText='WHERE'+StringUtils.SPACE+lStrWhereClause
				lStrQueryText=lStrQueryText+StringUtils.SPACE+lStrWhereText
			}
			if(lStrSuffixQuery.length()>0){
				lStrQueryText=lStrQueryText+StringUtils.SPACE+lStrSuffixQuery
			}
			lreturn=lStrQueryText.trim()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String convertStringToStringBase64Encoded(String strInput){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(strInput)){
			return lreturn
		}
		String lStrInput=strInput.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrInput)){
			return lreturn
		}
		try{
			String lStrBase64Encoded=lStrInput.bytes.encodeBase64().toString()
			lreturn=lStrBase64Encoded
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean mergeMapParameterMappingDirect(Boolean boolIsIncludeOperationReplace,Boolean boolIsOperationReplaceIfRightEmptySelectLeft,Boolean boolIsOperationReplaceIfRightNonEmptySelectLeft,Boolean boolIsIncludeOperationAdd,Boolean boolIsIncludeOperationRemove,Map<String,String> mapLeft,Map<String,String> mapRight,Map<String,String> mapMerge){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(mapLeft)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapRight)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapMerge)){
			return lreturn
		}
		try{
			Boolean lIsMergeOK=false
			Set<String> lSetKeyMapLeft=mapLeft.keySet()
			Set<String> lSetKeyMapRight=mapRight.keySet()
			Set<String> lSetKeyUnionAll=Sets.union(lSetKeyMapLeft,lSetKeyMapRight)
			if(lSetKeyUnionAll.size()<=0){
				return lreturn
			}
			mapMerge.clear()
			for(String lStrKeyUnionItem in lSetKeyUnionAll){
				String lStrMapLeftValue=''
				String lStrMapRightValue=''
				if(mapRight.containsKey(lStrKeyUnionItem)){
					if(mapLeft.containsKey(lStrKeyUnionItem)){
						lStrMapLeftValue=mapLeft.get(lStrKeyUnionItem)
						lStrMapRightValue=mapRight.get(lStrKeyUnionItem)
						if(IGNUemaHelper.checkObjectNullOfObject(lStrMapLeftValue)){
							lStrMapLeftValue=''
						}
						if(IGNUemaHelper.checkObjectNullOfObject(lStrMapRightValue)){
							lStrMapRightValue=''
						}
						if(boolIsIncludeOperationReplace){
							if(lStrMapRightValue.isEmpty()){
								if(boolIsOperationReplaceIfRightEmptySelectLeft){
									mapMerge.put(lStrKeyUnionItem,lStrMapLeftValue)
								}else{
									mapMerge.put(lStrKeyUnionItem,lStrMapRightValue)
								}
							}else{
								if(lStrMapLeftValue.isEmpty()){
									mapMerge.put(lStrKeyUnionItem,lStrMapRightValue)
								}else{
									if(boolIsOperationReplaceIfRightNonEmptySelectLeft){
										mapMerge.put(lStrKeyUnionItem,lStrMapLeftValue)
									}else{
										mapMerge.put(lStrKeyUnionItem,lStrMapRightValue)
									}
								}
							}
						}else{
							mapMerge.put(lStrKeyUnionItem,lStrMapRightValue)
						}
					}else{
						lStrMapRightValue=mapRight.get(lStrKeyUnionItem)
						if(IGNUemaHelper.checkObjectNullOfObject(lStrMapRightValue)){
							lStrMapRightValue=''
						}
						if(!boolIsIncludeOperationRemove){
							mapMerge.put(lStrKeyUnionItem,lStrMapRightValue)
						}
					}
				}else{
					lStrMapLeftValue=mapLeft.get(lStrKeyUnionItem)
					if(IGNUemaHelper.checkObjectNullOfObject(lStrMapLeftValue)){
						lStrMapLeftValue=''
					}
					if(boolIsIncludeOperationAdd){
						mapMerge.put(lStrKeyUnionItem,lStrMapLeftValue)
					}
				}
			}
			lIsMergeOK=mapMerge.size()>0
			lreturn=lIsMergeOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean mergeMapParameterMappingIndirectSingleValue(Boolean boolIsIncludeOperationReplace,Boolean boolIsOperationReplaceIfRightEmptySelectLeft,Boolean boolIsOperationReplaceIfRightNonEmptySelectLeft,Boolean boolIsIncludeOperationAdd,Map<String,String> targetMapFieldMapping,Map<String,String> mapLeft,Map<String,String> mapRight,Map<String,String> mapMerge){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfMap(targetMapFieldMapping)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapLeft)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapRight)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapMerge)){
			return lreturn
		}
		try{
			Boolean lIsMergeOK=false
			mapMerge.clear()
			mapMerge.putAll(mapRight)
			Boolean lIsEntryOK=true
			for(Map.Entry lEntryMapFieldMapping in targetMapFieldMapping){
				String lStrEntryMapFieldMappingKey=lEntryMapFieldMapping.key
				String lStrEntryMapFieldMappingValue=lEntryMapFieldMapping.value
				if(IGNUemaHelper.checkObjectNullOfObject(lStrEntryMapFieldMappingKey)){
					lIsEntryOK=false
				}
				if(IGNUemaHelper.checkObjectNullOfObject(lStrEntryMapFieldMappingValue)){
					lIsEntryOK=false
				}
				if(!mapLeft.containsKey(lStrEntryMapFieldMappingKey)){
					lIsEntryOK=false
				}
				if(!lIsEntryOK){
					break
				}
				String lStrMapLeftValue=''
				String lStrMapRightValue=''
				lStrMapLeftValue=mapLeft.get(lStrEntryMapFieldMappingKey)
				if(IGNUemaHelper.checkObjectNullOfObject(lStrMapLeftValue)){
					lStrMapLeftValue=''
				}
				if(mapRight.containsKey(lStrEntryMapFieldMappingValue)){
					lStrMapRightValue=mapRight.get(lStrEntryMapFieldMappingValue)
					if(IGNUemaHelper.checkObjectNullOfObject(lStrMapRightValue)){
						lStrMapRightValue=''
					}
					if(boolIsIncludeOperationReplace){
						if(lStrMapRightValue.isEmpty()){
							if(boolIsOperationReplaceIfRightEmptySelectLeft){
								mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
							}else{
								mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
							}
						}else{
							if(lStrMapLeftValue.isEmpty()){
								mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
							}else{
								if(boolIsOperationReplaceIfRightNonEmptySelectLeft){
									mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
								}else{
									mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
								}
							}
						}
					}
				}else{
					if(boolIsIncludeOperationAdd){
						mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
					}else{
						lIsEntryOK=false
					}
				}
				if(!lIsEntryOK){
					break
				}
			}
			if(!lIsEntryOK){
				mapMerge.clear()
			}
			lIsMergeOK=lIsEntryOK&&mapMerge.size()>0
			lreturn=lIsMergeOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean mergeMapParameterMappingIndirectMultiValue(Boolean boolIsIncludeOperationReplace,Boolean boolIsOperationReplaceIfRightEmptySelectLeft,Boolean boolIsOperationReplaceIfRightNonEmptySelectLeft,Boolean boolIsIncludeOperationAdd,MultiMap targetMultiMapFieldMapping,Map<String,String> mapLeft,Map<String,String> mapRight,Map<String,String> mapMerge){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(targetMultiMapFieldMapping)){
			return lreturn
		}
		if(targetMultiMapFieldMapping.size()<=0){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapLeft)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfMap(mapRight)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(mapMerge)){
			return lreturn
		}
		try{
			Boolean lIsMergeOK=false
			mapMerge.clear()
			mapMerge.putAll(mapRight)
			Boolean lIsEntryOK=true
			for(Map.Entry lEntryMapFieldMapping in targetMultiMapFieldMapping){
				String lStrEntryMapFieldMappingKey=lEntryMapFieldMapping.key
				List<String> lListStrEntryMapFieldMappingValue=(List<String>)lEntryMapFieldMapping.value
				if(IGNUemaHelper.checkObjectNullOfObject(lStrEntryMapFieldMappingKey)){
					lIsEntryOK=false
				}
				if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListStrEntryMapFieldMappingValue)){
					lIsEntryOK=false
				}
				if(!mapLeft.containsKey(lStrEntryMapFieldMappingKey)){
					lIsEntryOK=false
				}
				if(!lIsEntryOK){
					break
				}
				for(String lStrEntryMapFieldMappingValue in lListStrEntryMapFieldMappingValue){
					String lStrMapLeftValue=''
					String lStrMapRightValue=''
					lStrMapLeftValue=mapLeft.get(lStrEntryMapFieldMappingKey)
					if(IGNUemaHelper.checkObjectNullOfObject(lStrMapLeftValue)){
						lStrMapLeftValue=''
					}
					if(mapRight.containsKey(lStrEntryMapFieldMappingValue)){
						lStrMapRightValue=mapRight.get(lStrEntryMapFieldMappingValue)
						if(IGNUemaHelper.checkObjectNullOfObject(lStrMapRightValue)){
							lStrMapRightValue=''
						}
						if(boolIsIncludeOperationReplace){
							if(lStrMapRightValue.isEmpty()){
								if(boolIsOperationReplaceIfRightEmptySelectLeft){
									mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
								}else{
									mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
								}
							}else{
								if(lStrMapLeftValue.isEmpty()){
									mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
								}else{
									if(boolIsOperationReplaceIfRightNonEmptySelectLeft){
										mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
									}else{
										mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapRightValue)
									}
								}
							}
						}
					}else{
						if(boolIsIncludeOperationAdd){
							mapMerge.put(lStrEntryMapFieldMappingValue,lStrMapLeftValue)
						}else{
							lIsEntryOK=false
						}
					}
					if(!lIsEntryOK){
						break
					}
				}
				if(!lIsEntryOK){
					break
				}
			}
			if(!lIsEntryOK){
				mapMerge.clear()
			}
			lIsMergeOK=lIsEntryOK&&mapMerge.size()>0
			lreturn=lIsMergeOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*RANDOM*/
	public static Integer getRandomIntegerFromZeroToLessThanNumber(Integer numBoundInteger){
		Integer lreturn=0
		try{
			if(numBoundInteger<=0){
				Random lRandom=new Random()
				lreturn=Math.abs(lRandom.nextInt())
			}else{
				Random lRandom=new Random()
				lreturn=lRandom.nextInt(numBoundInteger)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getRandomIntegerFromBoundLowToLessThanBoundHigh(Integer numBoundLow,Integer numBoundHigh){
		Integer lreturn=0
		Integer lNumBoundLow=numBoundLow
		Integer lNumBoundHigh=numBoundHigh
		try{
			if(lNumBoundLow<0){
				lNumBoundLow=0
			}
			if(lNumBoundHigh<0){
				lNumBoundHigh=0
			}
			Integer lNumBoundTarget=lNumBoundHigh-lNumBoundLow
			if(lNumBoundTarget<0){
				Integer lNumBoundSwap=lNumBoundLow
				lNumBoundLow=lNumBoundHigh
				lNumBoundHigh=lNumBoundSwap
				lNumBoundTarget=lNumBoundHigh-lNumBoundLow
			}
			if(lNumBoundTarget<=0){
				Random lRandom=new Random()
				lreturn=Math.abs(lRandom.nextInt())
			}else{
				Random lRandom=new Random()
				lreturn=lRandom.nextInt(numBoundHigh-numBoundLow)+numBoundLow
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getRandomCharacterIndexFromString(String strSrcText){
		Integer lreturn=0
		String lStrSrcText=strSrcText
		try{
			if(lStrSrcText.length()<=1){
				lreturn=0
			}else{
				lreturn=this.getRandomIntegerFromZeroToLessThanNumber(lStrSrcText.length())
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRandomCharacterTextFromString(String strSrcText){
		String lreturn=''
		String lStrSrcText=strSrcText
		try{
			if(lStrSrcText.length()<=1){
				lreturn=lStrSrcText
			}else{
				Integer lIndex=this.getRandomCharacterIndexFromString(lStrSrcText)
				lreturn=lStrSrcText[lIndex]
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String randomCarPlateNumberGeneral(){
		String lreturn=''
		String alphaNum09='0123456789'
		String alphaNum19='123456789'
		String alphaEngThaiNum09='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZกขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ0123456789'
		String alphaEngThaiNum19='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZกขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ123456789'
		String alphaEngAll='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
		String alphaEngCapital='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
		String alphaEngSmall='abcdefghijklmnopqrstuvwxyz'
		String alphaThai='กขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ'
		try{
			String lCarPlate=''
			String lStrChar01=this.getRandomCharacterTextFromString(alphaNum19)
			String lStrChar02=this.getRandomCharacterTextFromString(alphaNum09)
			String lStrChar03=this.getRandomCharacterTextFromString(alphaEngCapital)
			String lStrChar04=this.getRandomCharacterTextFromString(alphaEngCapital)
			String lStrChar05=this.getRandomCharacterTextFromString(alphaEngCapital)
			String lStrChar06=this.getRandomCharacterTextFromString(alphaEngCapital)
			String lStrChar07=this.getRandomCharacterTextFromString(alphaNum19)
			String lStrChar08=this.getRandomCharacterTextFromString(alphaNum09)
			String lStrChar09=this.getRandomCharacterTextFromString(alphaNum09)
			String lStrChar10=this.getRandomCharacterTextFromString(alphaNum09)
			lCarPlate=lStrChar01+lStrChar02+lStrChar03+lStrChar04+lStrChar05+lStrChar06+lStrChar07+lStrChar08+lStrChar09+lStrChar10
			lreturn=lCarPlate
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String randomCarPlateNumberThailand(){
		String lreturn=''
		String alphaNum09='0123456789'
		String alphaNum19='123456789'
		String alphaEngThaiNum09='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZกขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ0123456789'
		String alphaEngThaiNum19='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZกขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ123456789'
		String alphaEngAll='abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
		String alphaEngCapital='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
		String alphaEngSmall='abcdefghijklmnopqrstuvwxyz'
		String alphaThai='กขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ'
		try{
			String lCarPlate=''
			String lStrChar01=this.getRandomCharacterTextFromString(alphaNum19)
			String lStrChar02=this.getRandomCharacterTextFromString(alphaThai)
			String lStrChar03=this.getRandomCharacterTextFromString(alphaThai)
			String lStrChar04=this.getRandomCharacterTextFromString(alphaThai)
			String lStrChar05=this.getRandomCharacterTextFromString(alphaThai)
			String lStrChar06=this.getRandomCharacterTextFromString(alphaThai)
			String lStrChar07=this.getRandomCharacterTextFromString(alphaNum19)
			String lStrChar08=this.getRandomCharacterTextFromString(alphaNum09)
			String lStrChar09=this.getRandomCharacterTextFromString(alphaNum09)
			String lStrChar10=this.getRandomCharacterTextFromString(alphaNum09)
			lCarPlate=lStrChar01+lStrChar02+lStrChar03+lStrChar04+lStrChar05+lStrChar06+lStrChar07+lStrChar08+lStrChar09+lStrChar10
			lreturn=lCarPlate
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String randomStringAlphabetEngAndNum(Integer numTargetLength,Boolean isAllowZeroLead){
		String lreturn=''
		String alphaENG0='ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'
		String alphaENG1='ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789'
		if(numTargetLength<=0){
			return lreturn
		}
		try{
			String lStrTarget=''
			if(numTargetLength>0){
				for(Integer lIndex=1;lIndex<=numTargetLength;lIndex++){
					if(lIndex==1){
						if(isAllowZeroLead){
							lStrTarget=lStrTarget+this.getRandomCharacterTextFromString(alphaENG0)
						}else{
							lStrTarget=lStrTarget+this.getRandomCharacterTextFromString(alphaENG1)
						}
					}else{
						lStrTarget=lStrTarget+this.getRandomCharacterTextFromString(alphaENG0)
					}
					if(lStrTarget.length()>=numTargetLength){
						break
					}
				}
			}
			lreturn=lStrTarget
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String randomChasisNumber(){
		String lreturn=''
		String alphaENG0='ABCDEFGHJKLMNPRSTUVWXYZ0123456789'
		String alphaENG1='ABCDEFGHJKLMNPRSTUVWXYZ123456789'
		try{
			String lChasisNumber=''
			String lStrChar01=this.getRandomCharacterTextFromString(alphaENG1)
			String lStrChar02=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar03=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar04=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar05=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar06=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar07=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar08=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar09=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar10=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar11=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar12=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar13=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar14=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar15=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar16=this.getRandomCharacterTextFromString(alphaENG0)
			String lStrChar17=this.getRandomCharacterTextFromString(alphaENG0)
			lChasisNumber=lStrChar01+lStrChar02+lStrChar03+lStrChar04+lStrChar05+lStrChar06+lStrChar07+lStrChar08+lStrChar09+lStrChar10+lStrChar11+lStrChar12+lStrChar13+lStrChar14+lStrChar15+lStrChar16+lStrChar17
			lreturn=lChasisNumber
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String randomIDThaiOrPassportNumber(Boolean isThai,Boolean isPerson){
		String lreturn=''
		try{
			if(isThai){
				Double lNumDouble01=0
				if(isPerson){
					lNumDouble01=Math.floor(Math.random()*10)
					if(lNumDouble01==0){
						lNumDouble01=Math.floor(Math.random()*10)
					}
					if(lNumDouble01==0){
						lNumDouble01=Math.floor(Math.random()*10)
					}
					if(lNumDouble01==0){
						lNumDouble01=Math.floor(Math.random()*10)
					}
					if(lNumDouble01==0){
						lNumDouble01=Math.floor(Math.random()*10)
					}
					if(lNumDouble01==0){
						lNumDouble01=Math.floor(Math.random()*10)
					}
				}
				Double lNumDouble02=Math.floor(Math.random()*10)
				Double lNumDouble03=Math.floor(Math.random()*10)
				Double lNumDouble04=Math.floor(Math.random()*10)
				Double lNumDouble05=Math.floor(Math.random()*10)
				Double lNumDouble06=Math.floor(Math.random()*10)
				Double lNumDouble07=Math.floor(Math.random()*10)
				Double lNumDouble08=Math.floor(Math.random()*10)
				Double lNumDouble09=Math.floor(Math.random()*10)
				Double lNumDouble10=Math.floor(Math.random()*10)
				Double lNumDouble11=Math.floor(Math.random()*10)
				Double lNumDouble12=Math.floor(Math.random()*10)
				Double lNumDoubleLast=11-(((lNumDouble01*13)+(lNumDouble02*12)+(lNumDouble03*11)+(lNumDouble04*10)+(lNumDouble05*9)+(lNumDouble06*8)+(lNumDouble07*7)+(lNumDouble08*6)+(lNumDouble09*5)+(lNumDouble10*4)+(lNumDouble11*3)+(lNumDouble12*2))%11)
				Double lNumDouble13=0
				if(lNumDoubleLast==10){
					lNumDouble13=0
				}else if(lNumDoubleLast==11){
					lNumDouble13=1
				}else{
					lNumDouble13=lNumDoubleLast
				}
				lreturn=lNumDouble01.toInteger().toString()
				lreturn=lreturn+lNumDouble02.toInteger().toString()
				lreturn=lreturn+lNumDouble03.toInteger().toString()
				lreturn=lreturn+lNumDouble04.toInteger().toString()
				lreturn=lreturn+lNumDouble05.toInteger().toString()
				lreturn=lreturn+lNumDouble06.toInteger().toString()
				lreturn=lreturn+lNumDouble07.toInteger().toString()
				lreturn=lreturn+lNumDouble08.toInteger().toString()
				lreturn=lreturn+lNumDouble09.toInteger().toString()
				lreturn=lreturn+lNumDouble10.toInteger().toString()
				lreturn=lreturn+lNumDouble11.toInteger().toString()
				lreturn=lreturn+lNumDouble12.toInteger().toString()
				lreturn=lreturn+lNumDouble13.toInteger().toString()
			}else{
				String lStrRegExCharNumber='.*[0-9].*'
				String lStrRegExCharAlphaNumber='.*[A-Z].*'
				String lText=this.randomStringAlphabetEngAndNum(17,false).substring(0,11)
				Boolean lIsValid=(lText.matches(lStrRegExCharNumber)&&lText.matches(lStrRegExCharAlphaNumber))
				if(!lIsValid){
					lText=this.randomStringAlphabetEngAndNum(17,false).substring(0,11)
					lIsValid=(lText.matches(lStrRegExCharNumber)&&lText.matches(lStrRegExCharAlphaNumber))
				}
				if(!lIsValid){
					lText=this.randomStringAlphabetEngAndNum(17,false).substring(0,11)
					lIsValid=(lText.matches(lStrRegExCharNumber)&&lText.matches(lStrRegExCharAlphaNumber))
				}
				if(!lIsValid){
					lText=this.randomStringAlphabetEngAndNum(17,false).substring(0,11)
					lIsValid=(lText.matches(lStrRegExCharNumber)&&lText.matches(lStrRegExCharAlphaNumber))
				}
				if(!lIsValid){
					lText=this.randomStringAlphabetEngAndNum(17,false).substring(0,11)
					lIsValid=(lText.matches(lStrRegExCharNumber)&&lText.matches(lStrRegExCharAlphaNumber))
				}
				lreturn=lText
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getRandomIntegerFromArrayListOfInteger(List<Integer> arrayListOfInteger){
		Integer lreturn=0
		try{
			if(!arrayListOfInteger){
			}else{
				if(arrayListOfInteger.size()>0){
					Integer Index=this.getRandomIntegerFromZeroToLessThanNumber(arrayListOfInteger.size())
					lreturn=arrayListOfInteger[Index]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getRandomIntegerFromArraySetOfInteger(Set<Integer> arraySetOfInteger){
		Integer lreturn=0
		try{
			if(!arraySetOfInteger){
			}else{
				if(arraySetOfInteger.size()>0){
					Integer Index=this.getRandomIntegerFromZeroToLessThanNumber(arraySetOfInteger.size())
					lreturn=arraySetOfInteger[Index]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRandomStringFromArrayListOfString(List<String> arrayListOfString){
		String lreturn=''
		try{
			if(!arrayListOfString){
			}else{
				if(arrayListOfString.size()>0){
					Integer Index=this.getRandomIntegerFromZeroToLessThanNumber(arrayListOfString.size())
					lreturn=arrayListOfString[Index]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getRandomStringFromArraySetOfString(Set<String> arraySetOfString){
		String lreturn=''
		try{
			if(!arraySetOfString){
			}else{
				if(arraySetOfString.size()>0){
					Integer Index=this.getRandomIntegerFromZeroToLessThanNumber(arraySetOfString.size())
					lreturn=arraySetOfString[Index]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*EMAILBODY*/
	public static String getEmailBodyForReport(String strProductName,String strDateTimeStamp,String strNumberOfTotal,String strNumberOfSuccess,String strNumberOfFailed,String strNumberOfError){
		String lreturn=''
		String lStrEmailBodyForReport=''
		String lStrProductName=strProductName.trim()
		String lStrDateTimeStamp=strDateTimeStamp.trim()
		String lStrNumberOfTotal=strNumberOfTotal.trim()
		String lStrNumberOfSuccess=strNumberOfSuccess.trim()
		String lStrNumberOfFailed=strNumberOfFailed.trim()
		String lStrNumberOfError=strNumberOfError.trim()
		try{
			lStrEmailBodyForReport=IGNGlobalConst.DEFAULT_EMAIL_TEMPLATE_BODY_REPORT
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${product}',lStrProductName)
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${datetime}',lStrDateTimeStamp)
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${total}',lStrNumberOfTotal)
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${success}',lStrNumberOfSuccess)
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${fails}',lStrNumberOfFailed)
			lStrEmailBodyForReport=lStrEmailBodyForReport.replace('${errors}',lStrNumberOfError)
			lreturn=lStrEmailBodyForReport
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*EXCEL*/
	public static Workbook getExcelWorkbookInstanceFromFileName(String strFileName){
		Workbook lreturn=null
		if(this.checkObjectNullOrEmptyOfString(strFileName)){
			return lreturn
		}
		try{
			lreturn=ExcelKeywords.getWorkbook(strFileName)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean saveExcelWorkbookByFileName(String strFileName,Workbook xlsWorkbook){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfString(strFileName)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(xlsWorkbook)){
			return lreturn
		}
		String lStrFileName=strFileName.trim()
		try{
			try{
				Boolean lIsFileExist=this.toDoFileExistByString(lStrFileName)
				if(lIsFileExist){
					this.toDoFileDeleteByString(lStrFileName)
					lIsFileExist=this.toDoFileExistByString(lStrFileName)
				}
				if(lIsFileExist){
					return lreturn
				}
				FileOutputStream lFileOutputStream=new FileOutputStream(new File(lStrFileName))
				xlsWorkbook.write(lFileOutputStream)
				lFileOutputStream.close()
				lIsFileExist=this.toDoFileExistByString(lStrFileName)
				lreturn=lIsFileExist
			}catch(Exception ex){
				//ex.printStackTrace()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Sheet getExcelWorkSheetFromExcelWorkbook(Workbook xlsWorkbook,String strWorkSheetName){
		Sheet lreturn=null
		if(this.checkObjectNullOfObject(xlsWorkbook)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strWorkSheetName)){
			return lreturn
		}
		try{
			lreturn=ExcelKeywords.getExcelSheet(xlsWorkbook,strWorkSheetName)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkExcelWorkbookContainWorkSheetName(Workbook xlsWorkbook,String strWorkSheetName){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(xlsWorkbook)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strWorkSheetName)){
			return lreturn
		}
		try{
			List<String> lWorkSheetNameList=ExcelKeywords.getSheetNames(xlsWorkbook)
			if(lWorkSheetNameList){
				for(String lWorkSheetNameItem in lWorkSheetNameList){
					if(lWorkSheetNameItem.equals(strWorkSheetName)){
						lreturn=true
						break
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean cloneExcelWorkSheet(Workbook xlsWorkbook,String strWorkSheetNameOrg,String strWorkSheetNameNew){
		Boolean lreturn=false
		if(this.checkObjectNullOfObject(xlsWorkbook)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strWorkSheetNameOrg)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strWorkSheetNameNew)){
			return lreturn
		}
		if(strWorkSheetNameOrg.equals(strWorkSheetNameNew)){
			return lreturn
		}
		if(!this.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,strWorkSheetNameOrg)){
			return lreturn
		}
		try{
			Sheet lWorkSheetOrg=null
			Sheet lWorkSheetNew=null
			Integer lIndexWorkSheetNew=0
			if(this.checkExcelWorkbookContainWorkSheetName(xlsWorkbook,strWorkSheetNameNew)){
				lWorkSheetNew=ExcelKeywords.getExcelSheet(xlsWorkbook,strWorkSheetNameNew)
				lIndexWorkSheetNew=xlsWorkbook.getSheetIndex(lWorkSheetNew)
				xlsWorkbook.removeSheetAt(lIndexWorkSheetNew)
			}
			lWorkSheetOrg=ExcelKeywords.getExcelSheet(xlsWorkbook,strWorkSheetNameOrg)
			if(lWorkSheetOrg){
				lWorkSheetNew=xlsWorkbook.cloneSheet(xlsWorkbook.getSheetIndex(lWorkSheetOrg))
				if(lWorkSheetNew){
					lIndexWorkSheetNew=xlsWorkbook.getSheetIndex(lWorkSheetNew)
					xlsWorkbook.setSheetName(lIndexWorkSheetNew,strWorkSheetNameNew)
					lreturn=true
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getStrDataFormatterOfExcelCell(Cell targetCell){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(targetCell)){
			return lreturn
		}
		try{
			Boolean lIsValid=false
			String lDataFormatterObjectValue=''
			DataFormatter lDataFormatterObject=new DataFormatter()
			lDataFormatterObjectValue=lDataFormatterObject.formatCellValue(targetCell)
			lIsValid=lDataFormatterObjectValue.length()>0
			if(lIsValid){
				lreturn=lDataFormatterObjectValue
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map<String,Object> getMapExcelCellValueInSpecificRange(Sheet targetSheet,CellRangeAddress targetCellRangeAddress,Row targetRow,Integer targetColumnNumber,Boolean boolIsRecordCellTable){
		Map<String,Object> lreturn=[:]
		Boolean lResult=false
		try{
			lreturn=new HashMap<>()
			List<String> lCellValueList=new ArrayList<>()
			Table<Integer,Integer,String> lTableExcelSheetSrc=HashBasedTable.create()
			lreturn.put('CellValueList',lCellValueList)
			lreturn.put('CellTable',lTableExcelSheetSrc)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				return lreturn
			}
			Sheet lTargetSheet=targetSheet
			if(IGNUemaHelper.checkObjectNullOfObject(targetCellRangeAddress)){
				return lreturn
			}
			CellRangeAddress lTargetCellRangeAddress=targetCellRangeAddress
			if(IGNUemaHelper.checkObjectNullOfObject(targetRow)){
				return lreturn
			}
			Row lTargetRow=targetRow
			if(targetColumnNumber<0){
				return lreturn
			}
			Integer lTargetColumnNumber=targetColumnNumber
			Boolean lIsRecordCellTable=boolIsRecordCellTable
			String lStrCellValue=''
			for(Integer lIndex=0;lIndex<=lTargetColumnNumber;lIndex++){
				Cell lCell=lTargetRow.getCell(lTargetCellRangeAddress.getFirstColumn()+lIndex)
				Object lCellValueObject=null
				String lStrDataFormatterObjectValue=''
				try{
					lCellValueObject=ExcelKeywords.getCellValueByIndex(lTargetSheet,lTargetRow.getRowNum(),lTargetCellRangeAddress.getFirstColumn()+lIndex)
					lStrDataFormatterObjectValue=lCellValueObject.toString()
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
					CellType lCellType=lCell.getCellTypeEnum()
					if((lCellType==CellType.NUMERIC)){
						if(DateUtil.isCellDateFormatted(lCell)){
							LocalDate lLocalDate=IGNUemaHelper.convertDateStringtoLocalDate('dd/MM/yyyy',lStrDataFormatterObjectValue)
							lStrDataFormatterObjectValue=IGNUemaHelper.convertLocalDateToString('yyyy-MM-dd',lLocalDate)
						}else{
							lStrDataFormatterObjectValue=this.getStrDataFormatterOfExcelCell(lCell)
						}
					}else{
						lStrDataFormatterObjectValue=this.getStrDataFormatterOfExcelCell(lCell)
					}
				}
				if(lStrDataFormatterObjectValue.isEmpty()){
					lStrCellValue='None'
				}else{
					lStrCellValue=lStrDataFormatterObjectValue.trim()
				}
				if(lIsRecordCellTable){
					Integer lRowIndex=lTargetRow.getRowNum()
					Integer lColumnIndex=lTargetCellRangeAddress.getFirstColumn()+lIndex
					lTableExcelSheetSrc.put(lRowIndex,lColumnIndex,lStrCellValue)
				}
				lCellValueList.add(lStrCellValue)
			}
			lResult=lCellValueList.size()>=0
			if(lResult){
				lreturn.put('CellValueList',lCellValueList)
				lreturn.put('CellTable',lTableExcelSheetSrc)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean runExcelMacroFromExcelFileName(String strTargetExcelFileName,String strTargetMethodName){
		Boolean lreturn=false
		if(this.checkObjectNullOrEmptyOfString(strTargetExcelFileName)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTargetMethodName)){
			return lreturn
		}
		String lStrTargetExcelFileName=strTargetExcelFileName.trim()
		if(this.checkObjectEmptyOfString(lStrTargetExcelFileName)){
			return lreturn
		}
		String lStrTargetMethodName=strTargetMethodName.trim()
		if(this.checkObjectEmptyOfString(lStrTargetMethodName)){
			return lreturn
		}
		try{
			File lTargetExcelFile=new File(lStrTargetExcelFileName)
			if(!lTargetExcelFile.exists()){
				return lreturn
			}else{
				lStrTargetExcelFileName=lTargetExcelFile.getAbsolutePath()
			}
			String lStrTargetVBSFileName='Reports/'+lTargetExcelFile.getName()
			lStrTargetVBSFileName=this.changeFileExtensionByString(lStrTargetVBSFileName,'_'+this.randomStringAlphabetEngAndNum(5,false)+'.vbs')
			Boolean lIsProcessOK=true
			try{
				File lTargetVBSFileName=new File(lStrTargetVBSFileName)
				FileWriter lFileWriter=new FileWriter(lTargetVBSFileName,false)
				BufferedWriter lBufferedWriter=new BufferedWriter(lFileWriter)
				String lStrLineText=''
				lStrLineText='On Error Resume Next'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='Set lObjExcel = CreateObject("Excel.Application")'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='Set lObjWorkbook = lObjExcel.Workbooks.Open("'+lStrTargetExcelFileName+'")'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='lObjExcel.DisplayAlerts = False'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='lObjExcel.Application.Run "'+lStrTargetMethodName+'"'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='lObjWorkbook.Close True'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='lObjExcel.Application.Quit'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='Set lObjExcel = Nothing'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lStrLineText='WScript.Quit'
				lBufferedWriter.write(lStrLineText)
				lBufferedWriter.newLine()
				lBufferedWriter.close()
				lFileWriter.close()
				List<String> lCommandList=new ArrayList<String>()
				lCommandList.add('cmd.exe')
				lCommandList.add('/c')
				lCommandList.add(lStrTargetVBSFileName)
				ProcessBuilder lProcessBuilder=new ProcessBuilder(lCommandList)
				lProcessBuilder.redirectInput()
				lProcessBuilder.redirectError()
				Process lProcessRun=lProcessBuilder.start()
				lIsProcessOK=lIsProcessOK&&(!this.checkObjectNullOfObject(lProcessRun))
				lIsProcessOK=lIsProcessOK&&(lProcessRun.pid()>0)
				if(lIsProcessOK){
					Boolean lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(3,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						lIsTerminated=lProcessRun.waitFor(5,TimeUnit.SECONDS)
					}
					if(!lIsTerminated){
						try{
							lProcessRun.children().each{ lProcessChild->
								lProcessChild.destroyForcibly()
							}
						}catch(exx){
						}
						try{
							lProcessRun.destroyForcibly()
						}catch(exx){
						}
						lIsProcessOK=!lProcessRun.isAlive()
					}
				}
			}catch(Exception ex){
				//ex.printStackTrace()
				lIsProcessOK=false
			}finally{
				this.toDoFileDeleteByString(lStrTargetVBSFileName)
			}
			lreturn=lIsProcessOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*JAVASCRIPTEXECUTOR*/
	public static def callJavascriptExecutor(WebDriver driver,String strJavascript,Object[] objectArgumentList=[]){
		def lreturn=null
		if(!driver){
			return lreturn
		}
		String lJavascript=strJavascript.trim()
		if(lJavascript.length()<=0){
			return lreturn
		}
		if(!objectArgumentList){
			objectArgumentList=[]
		}
		try{
			this.printLog('callJavascriptExecutor:'+lJavascript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJavascript,objectArgumentList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/*WEBBROWSER*/
	public static Map getBrowserWindowPosition(WebDriver driver){
		Map lreturn=[:]
		Boolean lResult=false
		Integer lWindowPosX=0
		Integer lWindowPosY=0
		lreturn.put('WindowPosX',lWindowPosX)
		lreturn.put('WindowPosY',lWindowPosY)
		lreturn.put('Result',lResult)
		if(!driver){
			return lreturn
		}
		try{
			this.printLog('getBrowserWindowPosition')
			lWindowPosX=driver.manage().window().getPosition().getX()
			lWindowPosY=driver.manage().window().getPosition().getY()
			lResult=true
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WindowPosX',lWindowPosX)
				lreturn.put('WindowPosY',lWindowPosY)
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map setBrowserWindowPosition(WebDriver driver,Integer numWindowPosX,Integer numWindowPosY){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lWindowMaximizeMode=false
		Integer lWindowPosX=0
		Integer lWindowPosY=0
		lreturn.put('Result',lResult)
		lreturn.put('WindowPosX',lWindowPosX)
		lreturn.put('WindowPosY',lWindowPosY)
		if(!driver){
			return lreturn
		}
		if(numWindowPosX<0){
			return lreturn
		}
		if(numWindowPosY<0){
			return lreturn
		}
		try{
			this.printLog('setBrowserWindowPosition')
			driver.manage().window().setPosition(new Point(numWindowPosX,numWindowPosY))
			Map lMapGetBrowserWindowPosition=this.getBrowserWindowPosition(driver)
			lResult=lMapGetBrowserWindowPosition.Result
			lWindowPosX=lMapGetBrowserWindowPosition.WindowPosX
			lWindowPosY=lMapGetBrowserWindowPosition.WindowPosY
			Boolean lIsWindowSamePosX=lWindowPosX==numWindowPosX
			Boolean lIsWindowSamePosY=lWindowPosY==numWindowPosY
			if(lResult){
				lResult=lIsWindowSamePosX&&lIsWindowSamePosY
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WindowPosX',lWindowPosX)
				lreturn.put('WindowPosY',lWindowPosY)
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Boolean openNewBrowserTab(WebDriver driver,String strUrlToNavigate){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		String lStrUrlToNavigate=strUrlToNavigate.trim()
		try{
			if(lStrUrlToNavigate.length()>0){
				this.printLog('openNewBrowserTab:'+lStrUrlToNavigate)
			}else{
				this.printLog('openNewBrowserTab:***EMPTY**')
			}
			String lStrJavascript=''
			if(lStrUrlToNavigate.length()>0){
				lStrJavascript="window.open('"+lStrUrlToNavigate+"');"
			}else{
				lStrJavascript='window.open();'
			}
			this.printLog('lStrJavascript:'+lStrJavascript)
			Set<String> lSetWinHandleBefore=driver.getWindowHandles()
			Integer lWindowHandleSizeBefore=lSetWinHandleBefore.size()
			this.callJavascriptExecutor(driver,lStrJavascript,[])
			this.delayThreadSecond(1)
			Set<String> lSetWinHandleAfter=driver.getWindowHandles()
			Integer lWindowHandleSizeAfter=lSetWinHandleAfter.size()
			this.setBrowserWindowPosition(driver,0,0)
			this.delayThreadSecond(1)
			this.setBrowserWindowPosition(driver,0,0)
			if(lWindowHandleSizeAfter<=lWindowHandleSizeBefore){
				this.delayThreadSecond(1)
				lSetWinHandleAfter=driver.getWindowHandles()
				lWindowHandleSizeAfter=lSetWinHandleAfter.size()
				this.setBrowserWindowPosition(driver,0,0)
				this.delayThreadSecond(1)
				this.setBrowserWindowPosition(driver,0,0)
			}
			if(lWindowHandleSizeAfter<=lWindowHandleSizeBefore){
				this.delayThreadSecond(1)
				this.callJavascriptExecutor(driver,lStrJavascript,[])
				this.delayThreadSecond(1)
				lSetWinHandleAfter=driver.getWindowHandles()
				lWindowHandleSizeAfter=lSetWinHandleAfter.size()
				this.setBrowserWindowPosition(driver,0,0)
				this.delayThreadSecond(1)
				this.setBrowserWindowPosition(driver,0,0)
			}
			if(lWindowHandleSizeAfter<=lWindowHandleSizeBefore){
				this.delayThreadSecond(1)
				lSetWinHandleAfter=driver.getWindowHandles()
				lWindowHandleSizeAfter=lSetWinHandleAfter.size()
				this.setBrowserWindowPosition(driver,0,0)
				this.delayThreadSecond(1)
				this.setBrowserWindowPosition(driver,0,0)
			}
			lreturn=(lWindowHandleSizeAfter>lWindowHandleSizeBefore)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getBrowserWindowModeSize(WebDriver driver){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lWindowMaximizeMode=false
		Integer lWindowWidth=0
		Integer lWindowHeight=0
		Integer lWindowPosX=0
		Integer lWindowPosY=0
		lreturn.put('Result',lResult)
		lreturn.put('WindowMaximizeMode',lWindowMaximizeMode)
		lreturn.put('WindowWidth',lWindowWidth)
		lreturn.put('WindowHeight',lWindowHeight)
		lreturn.put('WindowPosX',lWindowPosX)
		lreturn.put('WindowPosY',lWindowPosY)
		if(!driver){
			return lreturn
		}
		Integer lAvailableWidth=0
		Integer lAvailableHeight=0
		String lStrJavascript=''
		Boolean lIsWindowSameMaxWidth=false
		Boolean lIsWindowSameMaxHeight=false
		try{
			this.printLog('getBrowserWindowModeSize')
			lStrJavascript='return window.screen.availWidth;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lAvailableWidth=this.callJavascriptExecutor(driver,lStrJavascript,[])
			lStrJavascript='return window.screen.availHeight;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lAvailableHeight=this.callJavascriptExecutor(driver,lStrJavascript,[])
			lStrJavascript='return window.outerWidth;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lWindowWidth=this.callJavascriptExecutor(driver,lStrJavascript,[])
			lStrJavascript='return window.outerHeight;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lWindowHeight=this.callJavascriptExecutor(driver,lStrJavascript,[])
			lIsWindowSameMaxWidth=lWindowWidth>=lAvailableWidth
			lIsWindowSameMaxHeight=lWindowHeight>=lAvailableHeight
			lWindowMaximizeMode=lIsWindowSameMaxWidth&&lIsWindowSameMaxHeight
			lResult=(lWindowWidth>=0)&&(lWindowHeight>=0)
			Map lMapGetBrowserWindowPosition=this.getBrowserWindowPosition(driver)
			lResult=lResult&&lMapGetBrowserWindowPosition.Result
			lWindowPosX=lMapGetBrowserWindowPosition.WindowPosX
			lWindowPosY=lMapGetBrowserWindowPosition.WindowPosY
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WindowMaximizeMode',lWindowMaximizeMode)
				lreturn.put('WindowWidth',lWindowWidth)
				lreturn.put('WindowHeight',lWindowHeight)
				lreturn.put('WindowPosX',lWindowPosX)
				lreturn.put('WindowPosY',lWindowPosY)
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map setBrowserWindowModeSize(WebDriver driver,Boolean isWindowMaximizeMode,Integer numWindowWidth,Integer numWindowHeight){
		Map lreturn=[:]
		Boolean lResult=false
		Boolean lWindowMaximizeMode=false
		Integer lWindowWidth=0
		Integer lWindowHeight=0
		Integer lWindowPosX=0
		Integer lWindowPosY=0
		lreturn.put('Result',lResult)
		lreturn.put('WindowMaximizeMode',lWindowMaximizeMode)
		lreturn.put('WindowWidth',lWindowWidth)
		lreturn.put('WindowHeight',lWindowHeight)
		lreturn.put('WindowPosX',lWindowPosX)
		lreturn.put('WindowPosY',lWindowPosY)
		if(!driver){
			return lreturn
		}
		Integer lAvailableWidth=0
		Integer lAvailableHeight=0
		String lStrJavascript=''
		Boolean lIsWindowSameWidth=false
		Boolean lIsWindowSameHeight=false
		Boolean lTargetWindowMaximizeMode=isWindowMaximizeMode
		Integer lTargetWindowWidth=numWindowWidth
		if(lTargetWindowWidth<0){
			return lreturn
		}
		Integer lTargetWindowHeight=numWindowHeight
		if(lTargetWindowHeight<0){
			return lreturn
		}
		try{
			this.printLog('setBrowserWindowModeSize')
			lStrJavascript='return window.screen.availWidth;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lAvailableWidth=this.callJavascriptExecutor(driver,lStrJavascript,[])
			lStrJavascript='return window.screen.availHeight;'
			this.printLog('lStrJavascript:'+lStrJavascript)
			lAvailableHeight=this.callJavascriptExecutor(driver,lStrJavascript,[])
			if(lTargetWindowMaximizeMode){
				lTargetWindowWidth=lAvailableWidth
				lTargetWindowHeight=lAvailableHeight
				driver.manage().window().setPosition(new Point(0,0))
				try{
					WebUI.maximizeWindow(FailureHandling.OPTIONAL)
				}catch(Exception ex){
					//ex.printStackTrace()
				}
			}else{
				if(lTargetWindowWidth>lAvailableWidth){
					lTargetWindowWidth=lAvailableWidth
				}
				if(lTargetWindowHeight>lAvailableHeight){
					lTargetWindowHeight=lAvailableHeight
				}
				driver.manage().window().setPosition(new Point(0,0))
				driver.manage().window().setSize(new Dimension(lTargetWindowWidth,lTargetWindowHeight))
			}
			Map lMapGetBrowserWindowModeSize=this.getBrowserWindowModeSize(driver)
			lResult=lMapGetBrowserWindowModeSize.Result
			if(!lResult){
				return lreturn
			}
			lWindowMaximizeMode=lMapGetBrowserWindowModeSize.WindowMaximizeMode
			lWindowWidth=lMapGetBrowserWindowModeSize.WindowWidth
			lWindowHeight=lMapGetBrowserWindowModeSize.WindowHeight
			lIsWindowSameWidth=lWindowWidth==lTargetWindowWidth
			lIsWindowSameHeight=lWindowHeight==lTargetWindowHeight
			Map lMapSetBrowserWindowPosition=this.setBrowserWindowPosition(driver,0,0)
			this.delayThreadSecond(1)
			lMapSetBrowserWindowPosition=this.setBrowserWindowPosition(driver,0,0)
			lResult=lResult&&lMapSetBrowserWindowPosition.Result
			lWindowPosX=lMapSetBrowserWindowPosition.WindowPosX
			lWindowPosY=lMapSetBrowserWindowPosition.WindowPosY
			if(lResult){
				lResult=lIsWindowSameWidth&&lIsWindowSameHeight
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WindowMaximizeMode',lWindowMaximizeMode)
				lreturn.put('WindowWidth',lWindowWidth)
				lreturn.put('WindowHeight',lWindowHeight)
				lreturn.put('WindowPosX',lWindowPosX)
				lreturn.put('WindowPosY',lWindowPosY)
			}
		}catch(Exception e){
			//e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	/*WEBELEMENT*/
	public static Boolean cloneWebElementListFromWebElementList(List<WebElement> srcWebElementList,List<WebElement> dstWebElementList){
		Boolean lreturn=false
		try{
			if(srcWebElementList){
				if(dstWebElementList){
					dstWebElementList.clear()
					lreturn=dstWebElementList.addAll(srcWebElementList)
					if(lreturn){
						lreturn=srcWebElementList.equals(dstWebElementList)
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromCssLocator(WebDriver driver,String cssLocator){
		WebElement lreturn=null
		try{
			this.printLog('getWebElementFromCssLocator:'+cssLocator)
			if(driver){
				lreturn=driver.findElement(By.cssSelector(cssLocator))
				if(!lreturn){
					this.delayThreadMilliSecond(300)
					lreturn=driver.findElement(By.cssSelector(cssLocator))
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromElementId(WebDriver driver,String elementId){
		try{
			if(driver){
				return this.getWebElementFromCssLocator(driver,'#'+elementId)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static List<WebElement> getWebElementListFromCssLocator(WebDriver driver,String cssLocator){
		try{
			this.printLog('getWebElementListFromCssLocator:'+cssLocator)
			if(driver){
				return driver.findElements(By.cssSelector(cssLocator))
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static List<WebElement> getWebElementListFromElementId(WebDriver driver,String elementId){
		try{
			if(driver){
				return this.getWebElementFromCssLocator(driver,'#'+elementId)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getParentElementOfWebElement(WebDriver driver,WebElement webElement){
		WebElement lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('getParentElementOfWebElement')
			String lJScript='return arguments[0].parentElement;'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementOfWebElement(WebDriver driver,WebElement webElement,String cssLocator,Boolean isFirstElementOfBlankCssLocator){
		WebElement lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('getChildWebElementOfWebElement')
			String lCssLocator=cssLocator.trim()
			String lJScript=''
			if(lCssLocator.length()<=0){
				if(isFirstElementOfBlankCssLocator){
					lJScript='return arguments[0].firstElementChild;'
				}else{
					lJScript='return arguments[0].lastElementChild;'
				}
			}else{
				lJScript="return arguments[0].querySelector('"+lCssLocator+"');"
			}
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListOfWebElement(WebDriver driver,WebElement webElement,String cssLocator){
		List<WebElement> lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			if(driver&&webElement){
				String lCssLocator=cssLocator.trim()
				String lJScript=''
				if(lCssLocator.length()<=0){
					this.printLog('getChildWebElementListOfWebElement:All')
					return webElement.findElements(By.xpath('.//*'))
				}else{
					lJScript="return arguments[0].querySelectorAll('"+lCssLocator+"');"
					this.printLog('getChildWebElementListOfWebElement:'+lJScript)
					return ((JavascriptExecutor)driver).executeScript(lJScript,webElement)
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getWebElementByIndexItemFromWebElementList(WebDriver driver,Integer indexItem,List<WebElement> webElementList){
		WebElement lreturn=null
		if(!((driver)&&(webElementList))){
			return lreturn
		}
		if(indexItem<0){
			return lreturn
		}
		if(webElementList.size()<=0){
			return lreturn
		}
		if(indexItem>=webElementList.size()){
			return lreturn
		}
		try{
			lreturn=webElementList[indexItem]
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementRandomFromWebElementList(WebDriver driver,List<WebElement> webElementList){
		WebElement lreturn=null
		if(!((driver)&&(webElementList))){
			return lreturn
		}
		if(webElementList.size()<=0){
			return lreturn
		}
		try{
			Integer lSelectAt=this.getRandomIntegerFromZeroToLessThanNumber(webElementList.size())
			lreturn=this.getWebElementByIndexItemFromWebElementList(driver,lSelectAt,webElementList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementRandomFromWebElementListSkipLast(WebDriver driver,List<WebElement> webElementList){
		WebElement lreturn=null
		if(!((driver)&&(webElementList))){
			return lreturn
		}
		if(webElementList.size()<=0){
			return lreturn
		}
		try{
			Integer lRandomSize=webElementList.size()
			if(lRandomSize>1){
				lRandomSize=lRandomSize-1
			}
			Integer lSelectAt=this.getRandomIntegerFromZeroToLessThanNumber(lRandomSize)
			lreturn=this.getWebElementByIndexItemFromWebElementList(driver,lSelectAt,webElementList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementCheckedByElementJs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			if(driver){
				lreturn=((JavascriptExecutor)driver).executeScript(
						'return arguments[0].checked;',webElement)
				if(!lreturn){
					lreturn=false
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementCheckedByLocatorJs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementCheckedByElementJs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleByElementJs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			String lText=''
			if(driver){
				lText=((JavascriptExecutor)driver).executeScript(
						'return arguments[0].style.display;',webElement)
				lText=lText.trim()
				if(lText.length()<=0){
					lreturn=true
				}else{
					if(lText.equalsIgnoreCase('NONE')){
						lreturn=false
					}else{
						lreturn=true
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleByLocatorJs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementVisibleByElementJs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleWithBlockByElementJs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			String lText=''
			if(driver){
				lText=((JavascriptExecutor)driver).executeScript(
						'return arguments[0].style.display;',webElement)
				lText=lText.trim()
				if(lText.length()<=0){
					lreturn=false
				}else{
					if(lText.equalsIgnoreCase('BLOCK')){
						lreturn=true
					}else{
						lreturn=false
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleWithBlockByLocatorJs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementVisibleWithBlockByElementJs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementEnableByElementJs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			if(driver){
				lreturn=!this.checkElementContainClassNameByWebElement(driver,webElement,'disabled')
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementEnableByLocatorJs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementEnableByElementJs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleByElementKs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=webElement.isDisplayed()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementVisibleByLocatorKs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementVisibleByElementKs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementEnableByElementKs(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=webElement.isEnabled()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementEnableByLocatorKs(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			lreturn=this.checkElementEnableByElementKs(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementExistByLocator(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			if(this.getWebElementFromCssLocator(driver,cssLocator)){
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementAbsentByLocator(WebDriver driver,String cssLocator,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			Integer count=0
			while(count<seconds){
				if(!this.checkElementExistByLocator(driver,cssLocator)){
					lreturn=true
					return lreturn
				}
				this.delayThreadSecond(1)
				count++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementPresentByLocator(WebDriver driver,String cssLocator,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			Integer count=0
			while(count<seconds){
				if(this.checkElementExistByLocator(driver,cssLocator)){
					lreturn=true
					return lreturn
				}
				this.delayThreadSecond(1)
				count++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementExistByElementId(WebDriver driver,String elementId){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			lreturn=this.checkElementExistByLocator(driver,'#'+elementId)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementAbsentByElementId(WebDriver driver,String elementId,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			lreturn=this.checkElementAbsentByLocator(driver,'#'+elementId,seconds)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementPresentByElementId(WebDriver driver,String elementId,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			lreturn=this.checkElementPresentByLocator(driver,'#'+elementId,seconds)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean waitElementInvisibleByLocator(WebDriver driver,String cssLocator,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)){
			return lreturn
		}
		try{
			Integer count=0
			while(count<seconds){
				if(!this.checkElementVisibleByLocatorKs(driver,cssLocator)){
					lreturn=true
					return lreturn
				}
				this.delayThreadSecond(1)
				count++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean waitElementVisibleByLocator(WebDriver driver,String cssLocator,Integer seconds=5){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)){
			return lreturn
		}
		try{
			Integer count=0
			while(count<seconds){
				if(this.checkElementVisibleByLocatorKs(driver,cssLocator)){
					lreturn=true
					return lreturn
				}
				this.delayThreadSecond(1)
				count++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getElementAttributeByWebElement(WebDriver driver,WebElement webElement,String strAttributeName){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		if(strAttributeName.length()<=0){
			return lreturn
		}
		try{
			lreturn=webElement.getAttribute(strAttributeName)
			if(!lreturn){
				lreturn=''
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getElementAttributeByLocator(WebDriver driver,String cssLocator,String strAttributeName){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)||(strAttributeName.length()<=0)){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			if(lElement){
				lreturn=this.getElementAttributeByWebElement(driver,lElement,strAttributeName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementContainClassNameByWebElement(WebDriver driver,WebElement webElement,String strClassName){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		String lStrClassName=strClassName.toLowerCase().trim()
		if(lStrClassName.length()<=0){
			return lreturn
		}
		try{
			String lClassName=this.getElementAttributeByWebElement(driver,webElement,'class').toLowerCase()
			if(lClassName.length()>0){
				lreturn=this.checkStringContainString(lClassName,lStrClassName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementContainClassNameByLocator(WebDriver driver,String cssLocator,String strClassName){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)||(strClassName.length()<=0)){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			if(lElement){
				lreturn=this.checkElementContainClassNameByWebElement(driver,lElement,strClassName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTextByWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=webElement.getText()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTextByLocator(WebDriver driver,String cssLocator){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			if(lElement){
				lreturn=this.getTextByWebElement(driver,lElement)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getChildTextByWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=((JavascriptExecutor)driver).executeScript('return arguments[0].textContent;',webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getChildTextByLocator(WebDriver driver,String cssLocator){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			if(lElement){
				lreturn=this.getChildTextByWebElement(driver,lElement)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean clearTextByWebElement(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				return lreturn
			}
			Random lRandom=new Random()
			String lText=''
			lText=this.getElementAttributeByWebElement(driver,webElement,'value')
			Integer lTextLength=lText.length()
			lreturn=(lTextLength<=0)
			if(!lreturn){
				((JavascriptExecutor)driver).executeScript('arguments[0].value="";',webElement)
				webElement.clear()
				this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
				((JavascriptExecutor)driver).executeScript('arguments[0].value="";',webElement)
				webElement.clear()
				this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
				lText=this.getElementAttributeByWebElement(driver,webElement,'value')
				lTextLength=lText.length()
				lreturn=(lTextLength<=0)
			}
			Integer lIndex=0
			if(!lreturn){
				for(lIndex=0;lIndex<=lTextLength;lIndex++){
					webElement.sendKeys(Keys.BACK_SPACE)
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
				}
				lText=this.getElementAttributeByWebElement(driver,webElement,'value')
				lTextLength=lText.length()
				lreturn=(lTextLength<=0)
			}
			if(!lreturn){
				for(lIndex=0;lIndex<=lTextLength;lIndex++){
					webElement.sendKeys(Keys.BACK_SPACE)
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
				}
				lText=this.getElementAttributeByWebElement(driver,webElement,'value')
				lTextLength=lText.length()
				lreturn=(lTextLength<=0)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				for(Integer lIndex=0;lIndex<inputText.length();lIndex++){
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
					String lStr=new StringBuilder().append(inputText.charAt(lIndex)).toString()
					webElement.sendKeys(lStr)
				}
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithEnterByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				for(Integer lIndex=0;lIndex<inputText.length();lIndex++){
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
					String lStr=new StringBuilder().append(inputText.charAt(lIndex)).toString()
					webElement.sendKeys(lStr)
				}
				webElement.sendKeys(Keys.ENTER)
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithTabByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				for(Integer lIndex=0;lIndex<inputText.length();lIndex++){
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
					String lStr=new StringBuilder().append(inputText.charAt(lIndex)).toString()
					webElement.sendKeys(lStr)
				}
				webElement.sendKeys(Keys.TAB)
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeSetTextByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				webElement.sendKeys(inputText)
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeSetTextWithEnterByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				webElement.sendKeys(inputText)
				webElement.sendKeys(Keys.ENTER)
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeSetTextWithTabByWebElement(WebDriver driver,WebElement webElement,String inputText){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.clickByWebElementWithScroll(driver,webElement)
			Random lRandom=new Random()
			Boolean lIsReadOnly=false
			String lStrReadOnly=this.getElementAttributeByWebElement(driver,webElement,'readonly')
			if(lStrReadOnly.length()>0){
				lIsReadOnly=this.convertStringToBoolean(lStrReadOnly)
			}
			if(lIsReadOnly){
				lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
			}else{
				this.clearTextByWebElement(driver,webElement)
				webElement.sendKeys(inputText)
				webElement.sendKeys(Keys.TAB)
				try{
					lreturn=this.getElementAttributeByWebElement(driver,webElement,'value')
				}catch(Exception ex){
					//ex.printStackTrace()
					lreturn=inputText
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getAbsoluteXPathFromWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=(String)((JavascriptExecutor)driver).executeScript(
					"function absoluteXPath(element){"+
					"var comp, comps=[];"+
					"var parent=null;"+
					"var xpath='';"+
					"var getPos=function(element){"+
					"var position=1, curNode;"+
					"if(element.nodeType==Node.ATTRIBUTE_NODE){"+
					"return null;"+
					"}"+
					"for(curNode=element.previousSibling;curNode;curNode=curNode.previousSibling){"+
					"if(curNode.nodeName==element.nodeName){"+
					"++position;"+
					"}"+
					"}"+
					"return position;"+
					"};"+
					"if(element instanceof Document){"+
					"return '/';"+
					"}"+
					"for(;element && !(element instanceof Document);element=element.nodeType==Node.ATTRIBUTE_NODE?element.ownerElement:element.parentNode){"+
					"comp=comps[comps.length]={};"+
					"switch(element.nodeType){"+
					"case Node.TEXT_NODE:"+
					"comp.name='text()';"+
					"break;"+
					"case Node.ATTRIBUTE_NODE:"+
					"comp.name='@'+element.nodeName;"+
					"break;"+
					"case Node.PROCESSING_INSTRUCTION_NODE:"+
					"comp.name='processing-instruction()';"+
					"break;"+
					"case Node.COMMENT_NODE:"+
					"comp.name='comment()';"+
					"break;"+
					"case Node.ELEMENT_NODE:"+
					"comp.name=element.nodeName;"+
					"break;"+
					"}"+
					"comp.position=getPos(element);"+
					"}"+
					"for(var i=comps.length - 1;i >=0;i--){"+
					"comp=comps[i];"+
					"xpath+='/'+comp.name.toLowerCase();"+
					"if(comp.position !==null){"+
					"xpath+='['+comp.position+']';"+
					"}"+
					"}"+
					"return xpath;"+
					"}return absoluteXPath(arguments[0]);",webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromAbsoluteXPath(WebDriver driver,String strAbsoluteXPath){
		try{
			if(driver){
				return driver.findElement(By.xpath(strAbsoluteXPath))
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getWebElementFromAbsoluteXPathByJs(WebDriver driver,String strAbsoluteXPath){
		try{
			if(driver){
				return ((JavascriptExecutor)driver).executeScript(
						'function getElementByXPath(xpath){'+
						'return new XPathEvaluator()'+
						'.createExpression(xpath)'+
						'.evaluate(document,XPathResult.FIRST_ORDERED_NODE_TYPE)'+
						'.singleNodeValue'+
						'}return getElementByXPath(arguments[0]);',strAbsoluteXPath)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static TestObject getTestObjectFromWebElement(WebDriver driver,WebElement webElement){
		try{
			TestObject object=new TestObject(this.randomStringAlphabetEngAndNum(17,false))
			object.addProperty("xpath",ConditionType.EQUALS,this.getAbsoluteXPathFromWebElement(driver,webElement),true)
			return object
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getWebElementFromTestObject(TestObject testObject){
		try{
			return WebUiCommonHelper.findWebElement(testObject,60)
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static Boolean webJsScrollToTop(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			((JavascriptExecutor)driver).executeScript(
					'window.scrollTo(0,0);','')
			try{
				((JavascriptExecutor)driver).executeScript(
						'window.scrollTo(0,0);','')
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsScrollToBottom(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			try{
				((JavascriptExecutor)driver).executeScript(
						'window.scrollTo(0,document.body.scrollHeight||document.documentElement.scrollHeight);','')
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsScrollToElement(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			((JavascriptExecutor)driver).executeScript('arguments[0].scrollIntoView(true);',webElement)
			((JavascriptExecutor)driver).executeScript(
					'function scroll_to_center(element){'+
					'    let elementRect=element.getBoundingClientRect();'+
					'    let absoluteElementTop=elementRect.top+window.pageYOffset;'+
					'    let middle=absoluteElementTop-(window.innerHeight/2);'+
					'    window.scrollTo(0,middle);'+
					'}scroll_to_center(arguments[0]);',webElement)
			try{
				((JavascriptExecutor)driver).executeScript('arguments[0].scrollIntoView(true);',webElement)
				((JavascriptExecutor)driver).executeScript(
						'function scroll_to_center(element){'+
						'    let elementRect=element.getBoundingClientRect();'+
						'    let absoluteElementTop=elementRect.top+window.pageYOffset;'+
						'    let middle=absoluteElementTop-(window.innerHeight/2);'+
						'    window.scrollTo(0,middle);'+
						'}scroll_to_center(arguments[0]);',webElement)
				((JavascriptExecutor)driver).executeScript('arguments[0].scrollIntoView(true);',webElement)
				((JavascriptExecutor)driver).executeScript(
						'function scroll_to_center(element){'+
						'    let elementRect=element.getBoundingClientRect();'+
						'    let absoluteElementTop=elementRect.top+window.pageYOffset;'+
						'    let middle=absoluteElementTop-(window.innerHeight/2);'+
						'    window.scrollTo(0,middle);'+
						'}scroll_to_center(arguments[0]);',webElement)
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			try{
				Actions lActions=new Actions(driver)
				lActions.scrollToElement(webElement).perform()
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			this.delayThreadSecond(1)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkDocumentReachedTop(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			Integer lNumDocumentHeightCur=0
			lNumDocumentHeightCur=((JavascriptExecutor)driver).executeScript(
					'return Math.ceil(window.scrollY);','')
			lreturn=(lNumDocumentHeightCur<=0)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkDocumentReachedBottom(WebDriver driver){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			Integer lNumDocumentHeightMax=0
			Integer lNumDocumentHeightCur=0
			lNumDocumentHeightMax=((JavascriptExecutor)driver).executeScript(
					'return document.body.offsetHeight;','')
			lNumDocumentHeightCur=((JavascriptExecutor)driver).executeScript(
					'return Math.ceil(window.innerHeight+window.scrollY);','')
			lreturn=(lNumDocumentHeightCur>=lNumDocumentHeightMax)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollElementUp(WebDriver driver,WebElement webElement,Integer numPressCount){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			if(webElement){
				this.clickByWebElementWithScroll(driver,webElement)
				for(Integer lIndex=1;lIndex<=numPressCount;lIndex++){
					webElement.sendKeys(Keys.ARROW_UP)
				}
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollElementDown(WebDriver driver,WebElement webElement,Integer numPressCount){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			if(webElement){
				this.clickByWebElementWithScroll(driver,webElement)
				for(Integer lIndex=1;lIndex<=numPressCount;lIndex++){
					webElement.sendKeys(Keys.ARROW_DOWN)
				}
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollElementLeft(WebDriver driver,WebElement webElement,Integer numPressCount){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			if(webElement){
				this.clickByWebElementWithScroll(driver,webElement)
				for(Integer lIndex=1;lIndex<=numPressCount;lIndex++){
					webElement.sendKeys(Keys.ARROW_LEFT)
				}
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollElementRight(WebDriver driver,WebElement webElement,Integer numPressCount){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			if(webElement){
				this.clickByWebElementWithScroll(driver,webElement)
				for(Integer lIndex=1;lIndex<=numPressCount;lIndex++){
					webElement.sendKeys(Keys.ARROW_RIGHT)
				}
				lreturn=true
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementOfDocumentBody(WebDriver driver){
		WebElement lreturn=null
		if(!driver){
			return lreturn
		}
		try{
			WebElement lWebElement=(WebElement)((JavascriptExecutor)driver).executeScript(
					'return document.body;','')
			if(this.checkObjectNullOfObject(lWebElement)){
				this.delayThreadSecond(1)
				lWebElement=(WebElement)((JavascriptExecutor)driver).executeScript(
						'return document.body;','')
			}
			lreturn=lWebElement
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollDocumentUp(WebDriver driver,Integer numPressCount){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			WebElement lWebElement=this.getWebElementOfDocumentBody(driver)
			if(lWebElement){
				lreturn=this.webArrowScrollElementUp(driver,lWebElement,numPressCount)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollDocumentDown(WebDriver driver,Integer numPressCount){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			WebElement lWebElement=this.getWebElementOfDocumentBody(driver)
			if(lWebElement){
				lreturn=this.webArrowScrollElementDown(driver,lWebElement,numPressCount)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollDocumentLeft(WebDriver driver,Integer numPressCount){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			WebElement lWebElement=this.getWebElementOfDocumentBody(driver)
			if(lWebElement){
				lreturn=this.webArrowScrollElementLeft(driver,lWebElement,numPressCount)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webArrowScrollDocumentRight(WebDriver driver,Integer numPressCount){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(numPressCount<=0){
			return lreturn
		}
		try{
			WebElement lWebElement=this.getWebElementOfDocumentBody(driver)
			if(lWebElement){
				lreturn=this.webArrowScrollElementRight(driver,lWebElement,numPressCount)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webWheelScrollElement(WebDriver driver,WebElement webElement,Integer numOffsetHeight,Integer numOffsetOrgX,Integer numOffsetOrgY){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			if(webElement){
				lreturn=this.webJsScrollToElement(driver,webElement)
				/*try{
				 WheelInput.ScrollOrigin lScrollOrigin=WheelInput.ScrollOrigin.fromViewport(numOffsetOrgX,numOffsetOrgY)
				 Actions lActions=new Actions(driver)
				 lActions.scrollFromOrigin(lScrollOrigin,0,numOffsetHeight).perform()
				 lreturn=true
				 }catch(WebDriverException ex){
				 }*/
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webWheelScrollDocument(WebDriver driver,Integer numOffsetHeight,Integer numOffsetOrgX,Integer numOffsetOrgY){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			WebElement lWebElement=this.getWebElementOfDocumentBody(driver)
			if(lWebElement){
				lreturn=this.webWheelScrollElement(driver,lWebElement,numOffsetHeight,numOffsetOrgX,numOffsetOrgY)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String checkTypeOfWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=((JavascriptExecutor)driver).executeScript(
					'return arguments[0].tagName.toLowerCase().replace(" ","").trim();',webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementFinalWithScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.webJsScrollToElement(driver,webElement)
			this.printLog('webJsClickWebElementFinalWithScroll')
			((JavascriptExecutor)driver).executeScript(
					'arguments[0].click();',webElement)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementFinalNoScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementFinalNoScroll')
			((JavascriptExecutor)driver).executeScript(
					'arguments[0].click();',webElement)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementParentWithScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementParentWithScroll')
			WebElement lElementParent=((JavascriptExecutor)driver).executeScript(
					'return arguments[0].parentElement;',webElement)
			if(!lElementParent){
				this.printLog('webJsClickWebElementParentWithScroll:lreturn='+lreturn.toString())
				return lreturn
			}
			String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
			this.printLog('Tag:'+lControlTypeParent)
			switch(lControlTypeParent){
				case 'a':
				case 'p':
				case 'button':
				case 'input':
				case 'li':
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lElementParent)
					break
				default:
					lreturn=this.webJsClickWebElementChildWithScroll(driver,lElementParent,false)
					break
			}
			this.printLog('webJsClickWebElementParentWithScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementChildWithScroll(WebDriver driver,WebElement webElement,Boolean findParent){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementChildWithScroll:findParent='+findParent.toString())
			WebElement lClickElement=null
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("a");',webElement)
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:a')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("button");',webElement)
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:button')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("input");',webElement)
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:input')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("li");',webElement)
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:li')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("p");',webElement)
					lreturn=this.webJsClickWebElementFinalWithScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:p')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			this.printLog('webJsClickWebElementChildWithScroll:lreturn='+lreturn.toString())
			if(!lreturn&&findParent){
				lreturn=this.webJsClickWebElementParentWithScroll(driver,webElement)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementFindChildParentWithScroll(WebDriver driver,WebElement webElement,Boolean findChildParent){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementFindChildParentWithScroll:findChildParent='+findChildParent.toString())
			String lControlType=this.checkTypeOfWebElement(driver,webElement)
			this.printLog('Tag:'+lControlType)
			if(!findChildParent){
				lreturn=this.webJsClickWebElementFinalWithScroll(driver,webElement)
			}else{
				switch(lControlType){
					case 'a':
					case 'p':
					case 'button':
					case 'input':
					case 'li':
						lreturn=this.webJsClickWebElementFinalWithScroll(driver,webElement)
						break
					default:
						lreturn=this.webJsClickWebElementChildWithScroll(driver,webElement,true)
						break
				}
			}
			this.printLog('webJsClickWebElementFindChildParentWithScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementWithScroll(WebDriver driver,WebElement rootWebElement,Boolean findChildParent=false){
		Boolean lreturn=false
		if(!((driver)&&(rootWebElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementWithScroll:findChildParent='+findChildParent.toString())
			this.printLog(rootWebElement)
			lreturn=this.webJsClickWebElementFindChildParentWithScroll(driver,rootWebElement,findChildParent)
			this.printLog('webJsClickWebElementWithScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementParentNoScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementParentNoScroll')
			WebElement lElementParent=((JavascriptExecutor)driver).executeScript(
					'return arguments[0].parentElement;',webElement)
			if(!lElementParent){
				this.printLog('webJsClickWebElementParentNoScroll:lreturn='+lreturn.toString())
				return lreturn
			}
			String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
			this.printLog('Tag:'+lControlTypeParent)
			switch(lControlTypeParent){
				case 'a':
				case 'p':
				case 'button':
				case 'input':
				case 'li':
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lElementParent)
					break
				default:
					lreturn=this.webJsClickWebElementChildNoScroll(driver,lElementParent,false)
					break
			}
			this.printLog('webJsClickWebElementParentNoScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementChildNoScroll(WebDriver driver,WebElement webElement,Boolean findParent){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementChildNoScroll:findParent='+findParent.toString())
			WebElement lClickElement=null
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("a");',webElement)
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:a')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("button");',webElement)
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:button')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("input");',webElement)
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:input')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("li");',webElement)
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:li')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			if(!lreturn){
				try{
					lClickElement=null
					lClickElement=((JavascriptExecutor)driver).executeScript(
							'return arguments[0].querySelector("p");',webElement)
					lreturn=this.webJsClickWebElementFinalNoScroll(driver,lClickElement)
					if(lreturn){
						this.printLog('Tag:p')
					}
				}catch(Exception ex){
					lreturn=false
				}
			}
			this.printLog('webJsClickWebElementChildNoScroll:lreturn='+lreturn.toString())
			if(!lreturn&&findParent){
				lreturn=this.webJsClickWebElementParentNoScroll(driver,webElement)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementFindChildParentNoScroll(WebDriver driver,WebElement webElement,Boolean findChildParent){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementFindChildParentNoScroll:findChildParent='+findChildParent.toString())
			String lControlType=this.checkTypeOfWebElement(driver,webElement)
			this.printLog('Tag:'+lControlType)
			if(!findChildParent){
				lreturn=this.webJsClickWebElementFinalNoScroll(driver,webElement)
			}else{
				switch(lControlType){
					case 'a':
					case 'p':
					case 'button':
					case 'input':
					case 'li':
						lreturn=this.webJsClickWebElementFinalNoScroll(driver,webElement)
						break
					default:
						lreturn=this.webJsClickWebElementChildNoScroll(driver,webElement,true)
						break
				}
			}
			this.printLog('webJsClickWebElementFindChildParentNoScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean webJsClickWebElementNoScroll(WebDriver driver,WebElement rootWebElement,Boolean findChildParent=false){
		Boolean lreturn=false
		if(!((driver)&&(rootWebElement))){
			return lreturn
		}
		try{
			this.printLog('webJsClickWebElementNoScroll:findChildParent='+findChildParent.toString())
			this.printLog(rootWebElement)
			lreturn=this.webJsClickWebElementFindChildParentNoScroll(driver,rootWebElement,findChildParent)
			this.printLog('webJsClickWebElementNoScroll:lreturn='+lreturn.toString())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean clickByWebElementWithScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if((!(driver)&&(webElement))){
			return lreturn
		}
		try{
			this.webJsScrollToElement(driver,webElement)
			if(!(webElement.isDisplayed()&&webElement.isEnabled())){
				return lreturn
			}
			if(!this.checkElementVisibleByElementJs(driver,webElement)){
				return lreturn
			}
			if(!this.checkElementEnableByElementJs(driver,webElement)){
				return lreturn
			}
			String lStrDisabled=this.getElementAttributeByWebElement(driver,webElement,'disabled')
			if(lStrDisabled.length()<=0){
				try{
					if(this.CURRENT_BROWSER_IS_SAFARI){
						this.printLog('clickByWebElementWithScroll:CURRENT_BROWSER_IS_SAFARI=true')
						this.printLog('clickByWebElementWithScroll:webJsClickWebElement')
						lreturn=this.webJsClickWebElementWithScroll(driver,webElement,true)
						if(!lreturn){
							return lreturn
						}
					}else{
						this.printLog('clickByWebElementWithScroll:CURRENT_BROWSER_IS_SAFARI=false')
						this.printLog('clickByWebElementWithScroll:1')
						webElement.click()
						lreturn=true
					}
				}catch(Exception ex){
					try{
						this.printLog('clickByWebElementWithScroll:2')
						webElement.click()
						lreturn=true
					}catch(Exception exx){
						try{
							this.printLog('clickByWebElementWithScroll:3')
							lreturn=this.webJsClickWebElementWithScroll(driver,webElement,true)
							if(!lreturn){
								this.FORCESTOP()
							}
						}catch(Exception exxxx){
							try{
								TestObject lButton=this.getTestObjectFromWebElement(driver,webElement)
								WebUI.scrollToElement(lButton,5)
								if(WebUI.waitForElementClickable(lButton,5)){
									if(WebUI.verifyElementClickable(lButton)){
										this.printLog('clickByWebElementWithScroll:4')
										WebUI.click(lButton)
										lreturn=true
									}else{
										this.printLog('clickByWebElementWithScroll:5')
										lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
									}
								}else{
									this.printLog('clickByWebElementWithScroll:6')
									lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
								}
							}catch(Exception exxxxx){
								this.printLog('clickByWebElementWithScroll:7')
								lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			this.printLog('clickByWebElementWithScroll:Error')
		}
		if(lreturn){
			this.delayThreadSecond(1)
		}
		return lreturn
	}
	public static Boolean clickByWebElementNoScroll(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if((!(driver)&&(webElement))){
			return lreturn
		}
		try{
			if(!(webElement.isDisplayed()&&webElement.isEnabled())){
				return lreturn
			}
			if(!this.checkElementVisibleByElementJs(driver,webElement)){
				return lreturn
			}
			if(!this.checkElementEnableByElementJs(driver,webElement)){
				return lreturn
			}
			String lStrDisabled=this.getElementAttributeByWebElement(driver,webElement,'disabled')
			if(lStrDisabled.length()<=0){
				try{
					if(this.CURRENT_BROWSER_IS_SAFARI){
						this.printLog('clickByWebElementNoScroll:CURRENT_BROWSER_IS_SAFARI=true')
						this.printLog('clickByWebElementNoScroll:webJsClickWebElement')
						lreturn=this.webJsClickWebElementWithScroll(driver,webElement,true)
						if(!lreturn){
							return lreturn
						}
					}else{
						this.printLog('clickByWebElementNoScroll:CURRENT_BROWSER_IS_SAFARI=false')
						this.printLog('clickByWebElementNoScroll:1')
						webElement.click()
						lreturn=true
					}
				}catch(Exception ex){
					try{
						this.printLog('clickByWebElementNoScroll:2')
						webElement.click()
						lreturn=true
					}catch(Exception exx){
						try{
							this.printLog('clickByWebElementNoScroll:3')
							lreturn=this.webJsClickWebElementWithScroll(driver,webElement,true)
							if(!lreturn){
								this.FORCESTOP()
							}
						}catch(Exception exxxx){
							try{
								TestObject lButton=this.getTestObjectFromWebElement(driver,webElement)
								if(WebUI.waitForElementClickable(lButton,5)){
									if(WebUI.verifyElementClickable(lButton)){
										this.printLog('clickByWebElementNoScroll:4')
										WebUI.click(lButton)
										lreturn=true
									}else{
										this.printLog('clickByWebElementNoScroll:5')
										lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
									}
								}else{
									this.printLog('clickByWebElementNoScroll:6')
									lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
								}
							}catch(Exception exxxxx){
								this.printLog('clickByWebElementNoScroll:7')
								lreturn=this.webJsClickWebElementWithScroll(driver,webElement,false)
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			this.printLog('clickByWebElementNoScroll:Error')
		}
		if(lreturn){
			this.delayThreadSecond(1)
		}
		return lreturn
	}
	public static Boolean performClickLeftOnScreenByOffsetXY(WebDriver driver,Integer numTopLeftX,Integer numTopLeftY){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			this.printLog('performClickLeftOnScreenByOffsetXY:'+'X='+numTopLeftX.toString()+',Y='+numTopLeftY.toString())
			Actions lActions=new Actions(driver)
			lActions.moveByOffset(numTopLeftX,numTopLeftY).click().build().perform()
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean performClickRightOnScreenByOffsetXY(WebDriver driver,Integer numTopLeftX,Integer numTopLeftY){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		try{
			this.printLog('performClickRightOnScreenByOffsetXY:'+'X='+numTopLeftX.toString()+',Y='+numTopLeftY.toString())
			Actions lActions=new Actions(driver)
			lActions.moveByOffset(numTopLeftX,numTopLeftY).contextClick().build().perform()
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean performClickLeftOnWebElementByOffsetXY(WebDriver driver,WebElement webElement,Integer numTopLeftX,Integer numTopLeftY){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('performClickLeftOnWebElementByOffsetXY:'+'X='+numTopLeftX.toString()+',Y='+numTopLeftY.toString())
			Actions lActions=new Actions(driver)
			lActions.moveToElement(webElement,numTopLeftX,numTopLeftY).click().build().perform()
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean performClickRightOnWebElementByOffsetXY(WebDriver driver,WebElement webElement,Integer numTopLeftX,Integer numTopLeftY){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('performClickRightOnWebElementByOffsetXY:'+'X='+numTopLeftX.toString()+',Y='+numTopLeftY.toString())
			Actions lActions=new Actions(driver)
			lActions.moveToElement(webElement,numTopLeftX,numTopLeftY).contextClick().build().perform()
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean performClickLeftOnWebElementByCenter(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('performClickLeftOnWebElementByCenter')
			Integer lCenterX=(webElement.getSize().getWidth())/2
			Integer lCenterY=(webElement.getSize().getHeight())/2
			lreturn=this.performClickLeftOnWebElementByOffsetXY(driver,webElement,lCenterX,lCenterY)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean performClickRightOnWebElementByCenter(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog('performClickRightOnWebElementByCenter')
			Integer lCenterX=(webElement.getSize().getWidth())/2
			Integer lCenterY=(webElement.getSize().getHeight())/2
			lreturn=this.performClickRightOnWebElementByOffsetXY(driver,webElement,lCenterX,lCenterY)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/************************************************************************************************************************************************************************/
	public static Boolean selectButtonFromArrayButtonByLocator(WebDriver driver,String cssLocator,Integer buttonIndex){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)||(buttonIndex<0)){
			return lreturn
		}
		try{
			List<WebElement> lElements=this.getWebElementListFromCssLocator(driver,cssLocator)
			if(!lElements){
				return lreturn
			}
			Integer lLoop=0
			for(lElement in lElements){
				if(lLoop==buttonIndex){
					lreturn=this.clickByWebElementWithScroll(driver,lElement)
					//this.delayThreadSecond(1)
					return lreturn
				}
				lLoop++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextByLocator(WebDriver driver,String cssLocator,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(cssLocator.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromCssLocator(driver,cssLocator)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithEnterByLocator(WebDriver driver,String cssLocator,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(cssLocator.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromCssLocator(driver,cssLocator)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextWithEnterByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithTabByLocator(WebDriver driver,String cssLocator,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(cssLocator.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromCssLocator(driver,cssLocator)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextWithTabByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextByElementId(WebDriver driver,String elementId,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(elementId.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromElementId(driver,elementId)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithEnterByElementId(WebDriver driver,String elementId,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(elementId.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromElementId(driver,elementId)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextWithEnterByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String typeTextWithTabByElementId(WebDriver driver,String elementId,String inputText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(elementId.length()<=0){
			return lreturn
		}
		try{
			WebElement lInput=this.getWebElementFromElementId(driver,elementId)
			if(!lInput){
				return lreturn
			}
			lreturn=this.typeTextWithTabByWebElement(driver,lInput,inputText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectButtonByLocator(WebDriver driver,String cssLocator){
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(cssLocator.length()<=0){
			return lreturn
		}
		try{
			WebElement lElement=this.getWebElementFromCssLocator(driver,cssLocator)
			if(!lElement){
				return lreturn
			}
			lreturn=this.clickByWebElementWithScroll(driver,lElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectSliderTrackByLocatorV1(WebDriver driver,String cssLocator,Integer buttonIndex){
		//selectSliderTrackByLocatorV1=For_Quotation_WebSite_Class(slider-tick)
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)||(buttonIndex<0)){
			return lreturn
		}
		try{
			this.printLog('selectSliderTrackByLocatorV1')
			List<WebElement> lElements=this.getWebElementListFromCssLocator(driver,cssLocator)
			if(!lElements){
				return lreturn
			}
			Integer lLoop=0
			Actions lActions=new Actions(driver)
			Random lRandom=new Random()
			for(lElement in lElements){
				if(lLoop==buttonIndex){
					this.webJsScrollToElement(driver,lElement)
					this.delayThreadSecond(1)
					if(lLoop==0){
						try{
							this.clickByWebElementWithScroll(driver,lElement)
							lElement.click()
						}catch(Exception ex){
							this.clickByWebElementWithScroll(driver,lElement)
						}
					}else if((lLoop>=1)&&(lLoop<=4)){
						WebElement lElement0=lElements[lLoop-1]
						Point point0=lElement0.getLocation()
						Point point1=lElement.getLocation()
						Integer offset=(point1.getX()-point0.getX())
						try{
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}catch(Exception ex){
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}
					}else if((lLoop>=5)&&(lLoop<=5)){
						WebElement lElement0=lElements[lLoop-1]
						Point point0=lElement0.getLocation()
						Point point1=lElement.getLocation()
						Integer offset=(point1.getX()-point0.getX())*0.75
						try{
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}catch(Exception ex){
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}
					}else if((lLoop>=15)&&(lLoop<=15)){
						WebElement lElement0=lElements[lLoop-1]
						Point point0=lElement0.getLocation()
						Point point1=lElement.getLocation()
						Integer offset=(point0.getX()-point1.getX())*0.75
						try{
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}catch(Exception ex){
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}
					}else if((lLoop>=16)&&(lLoop<=19)){
						WebElement lElement0=lElements[lLoop-1]
						Point point0=lElement0.getLocation()
						Point point1=lElement.getLocation()
						Integer offset=(point0.getX()-point1.getX())
						try{
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}catch(Exception ex){
							lActions.moveToElement(lElement,offset,0).click().build().perform()
						}
					}else{
						try{
							this.clickByWebElementWithScroll(driver,lElement)
							lElement.click()
						}catch(Exception ex){
							this.clickByWebElementWithScroll(driver,lElement)
						}
					}
					this.delayThreadMilliSecond((Integer)(lRandom.nextGaussian()*15+85))
					lreturn=true
					return lreturn
				}
				lLoop++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectSliderTrackByLocatorV2(WebDriver driver,String cssLocator,Integer buttonMax,Integer buttonIndex){
		//selectSliderTrackByLocatorV2=For_Kumka_Website(vue-slider)
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if((cssLocator.length()<=0)||(buttonIndex<0)||(buttonMax<=0)){
			return lreturn
		}
		if(buttonIndex>buttonMax){
			return lreturn
		}
		try{
			this.printLog('selectSliderTrackByLocatorV2')
			Double lOffsetRef=100/buttonMax
			Integer lOffsetMove=lOffsetRef.intValue()
			Double lOffsetNum=0
			DecimalFormat lDecimalFormat=new DecimalFormat('#0.0000')
			String lOffsetExpected=''
			String lOffsetActual=''
			String lTagHover=cssLocator+' .vue-slider-dot-hover'
			WebElement lElementHover=null
			String lTagHandle=cssLocator+' .vue-slider-dot-handle'
			WebElement lElementHandle=null
			Actions lActions=new Actions(driver)
			lElementHandle=this.getWebElementFromCssLocator(driver,lTagHandle)
			if(!lElementHandle){
				return lreturn
			}
			this.webJsScrollToElement(driver,lElementHandle)
			this.delayThreadSecond(1)
			lActions.clickAndHold(lElementHandle).moveToElement(lElementHandle,0,0).moveByOffset(25,0).release().build().perform()
			lActions.clickAndHold(lElementHandle).moveToElement(lElementHandle,0,0).moveByOffset(-25,0).release().build().perform()
			Integer lIndex=0
			for(lIndex=0;lIndex<=buttonIndex;lIndex++){
				lOffsetNum=lOffsetRef*lIndex
				lOffsetExpected=lDecimalFormat.format(lOffsetNum)+'%'
				lElementHover=this.getWebElementFromCssLocator(driver,lTagHover)
				if(!lElementHover){
					return lreturn
				}
				((JavascriptExecutor)driver).executeScript('arguments[0].style.left="'+lOffsetExpected+'";',lElementHover)
				lElementHandle=this.getWebElementFromCssLocator(driver,lTagHandle)
				if(!lElementHandle){
					return lreturn
				}
				lActions.clickAndHold(lElementHandle).moveToElement(lElementHandle,0,0).moveByOffset(lOffsetMove,0).release().build().perform()
				lOffsetActual=((JavascriptExecutor)driver).executeScript('return arguments[0].style.left;',lElementHover)
			}
			for(lIndex=1;lIndex<=(lOffsetMove*2)+1;lIndex++){
				Double lNumExpected=Double.parseDouble(lOffsetExpected.replace('%',''))
				Double lNumActual=Double.parseDouble(lOffsetExpected.replace('%',''))
				if(lNumActual<lNumExpected){
					lOffsetNum=lOffsetRef*buttonIndex
					lOffsetExpected=lDecimalFormat.format(lOffsetNum)+'%'
					lElementHover=this.getWebElementFromCssLocator(driver,lTagHover)
					if(!lElementHover){
						return lreturn
					}
					((JavascriptExecutor)driver).executeScript('arguments[0].style.left="'+lOffsetExpected+'";',lElementHover)
					lElementHandle=this.getWebElementFromCssLocator(driver,lTagHandle)
					if(!lElementHandle){
						return lreturn
					}
					lActions.clickAndHold(lElementHandle).moveToElement(lElementHandle,0,0).moveByOffset(lOffsetMove+lIndex,0).release().build().perform()
					lOffsetActual=((JavascriptExecutor)driver).executeScript('return arguments[0].style.left;',lElementHover)
				}else{
					break
				}
			}
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectSliderTrackByLocatorV3(WebDriver driver,String cssLocatorSliderHandle,String cssLocatorSliderTick,Integer buttonIndex){
		//selectSliderTrackByLocatorV3=For_Quotation_WebSite_Class(slider-handle)_And_Class(slider-tick)
		Boolean lreturn=false
		if(!driver){
			return lreturn
		}
		if(cssLocatorSliderHandle.length()<=0){
			return lreturn
		}
		if(cssLocatorSliderTick.length()<=0){
			return lreturn
		}
		if(buttonIndex<0){
			return lreturn
		}
		try{
			this.printLog('selectSliderTrackByLocatorV3')
			WebElement lElementSliderHandle=this.getWebElementFromCssLocator(driver,cssLocatorSliderHandle)
			if(!lElementSliderHandle){
				return lreturn
			}
			this.webJsScrollToElement(driver,lElementSliderHandle)
			this.delayThreadSecond(1)
			List<WebElement> lElementSliderTickList=this.getWebElementListFromCssLocator(driver,cssLocatorSliderTick)
			if(!lElementSliderTickList){
				return lreturn
			}
			Integer lSliderTickListSize=lElementSliderTickList.size()
			if(lSliderTickListSize<=0){
				return lreturn
			}
			Integer lButtonIndex=buttonIndex
			if(lButtonIndex>0){
				lButtonIndex=lButtonIndex+1
			}
			if(lButtonIndex>(lSliderTickListSize-1)){
				lButtonIndex=lSliderTickListSize-1
			}
			WebElement lElementSliderTickItem=lElementSliderTickList[lButtonIndex]
			if(!lElementSliderTickItem){
				return lreturn
			}
			Actions lActions=new Actions(driver)
			lActions.dragAndDrop(lElementSliderHandle,lElementSliderTickItem).build().perform()
			lElementSliderTickItem=lElementSliderTickList[buttonIndex]
			if(!lElementSliderTickItem){
				return lreturn
			}
			String lStrSelection='in-selection'
			lreturn=this.checkElementContainClassNameByWebElement(driver,lElementSliderTickItem,lStrSelection)
			return lreturn
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectSliderTrackByLocatorV4(WebDriver driver,WebElement webElementSliderWrapper,Integer buttonIndexMin,Integer buttonIndexMax){
		//selectSliderTrackByLocatorV4=For_Kumka_WebSite_Class(collapse)_And_Class(slider-wrapper)_With_Slider_Min_Max
		Boolean lreturn=false
		if(!((driver)&&(webElementSliderWrapper))){
			return lreturn
		}
		if(buttonIndexMin<0){
			return lreturn
		}
		if(buttonIndexMax<0){
			return lreturn
		}
		Integer lDefaultMaxButton=12
		try{
			this.printLog('selectSliderTrackByLocatorV4')
			Integer lButtonIndexMin=0
			Integer lButtonIndexMax=0
			if(buttonIndexMin>buttonIndexMax){
				lButtonIndexMin=buttonIndexMax
				lButtonIndexMax=buttonIndexMin
			}else{
				lButtonIndexMin=buttonIndexMin
				lButtonIndexMax=buttonIndexMax
			}
			String lLocatorSliderHandleMin='.min-slider-handle'
			WebElement lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
			if(!lElementSliderHandleMin){
				return lreturn
			}
			String lLocatorSliderHandleMax='.max-slider-handle'
			WebElement lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
			if(!lElementSliderHandleMax){
				return lreturn
			}
			String lAttributeAriaValueNow='aria-valuenow'
			String lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMinStr.length()<=0){
				return lreturn
			}
			Integer lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
			String lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMaxStr.length()<=0){
				return lreturn
			}
			Integer lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
			lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMinStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
			if(lCurrentIndexMinNum<lButtonIndexMin){
				lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
				if(!lElementSliderHandleMin){
					return lreturn
				}
				this.webJsScrollToElement(driver,lElementSliderHandleMin)
				this.delayThreadSecond(1)
				Integer lIndexButtonTry=0
				for(lIndexButtonTry=0;lIndexButtonTry<=lDefaultMaxButton;lIndexButtonTry++){
					Integer lMoveStepOffset=0
					for(lMoveStepOffset=0;lMoveStepOffset<=2000;lMoveStepOffset++){
						Integer lMoveStepOffsetAmount=lMoveStepOffset
						lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
						if(!lElementSliderHandleMin){
							return lreturn
						}
						this.webJsScrollToElement(driver,lElementSliderHandleMin)
						Actions lActions=new Actions(driver)
						lActions.clickAndHold(lElementSliderHandleMin).moveToElement(lElementSliderHandleMin,0,0).moveByOffset(lMoveStepOffsetAmount,0).release().build().perform()
						lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
						if(lCurrentIndexMinStr.length()<=0){
							return lreturn
						}
						lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
						if(lCurrentIndexMinNum>=lButtonIndexMin){
							break
						}
					}
					lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
					if(!lElementSliderHandleMin){
						return lreturn
					}
					lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
					if(lCurrentIndexMinStr.length()<=0){
						return lreturn
					}
					lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
					if(lCurrentIndexMinNum>=lButtonIndexMin){
						break
					}
				}
			}
			lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMinStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
			if(lCurrentIndexMinNum>lButtonIndexMin){
				lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
				if(!lElementSliderHandleMin){
					return lreturn
				}
				this.webJsScrollToElement(driver,lElementSliderHandleMin)
				this.delayThreadSecond(1)
				Integer lIndexButtonTry=0
				for(lIndexButtonTry=0;lIndexButtonTry<=lDefaultMaxButton;lIndexButtonTry++){
					Integer lMoveStepOffset=0
					for(lMoveStepOffset=0;lMoveStepOffset<=2000;lMoveStepOffset++){
						Integer lMoveStepOffsetAmount=(-1)*lMoveStepOffset
						lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
						if(!lElementSliderHandleMin){
							return lreturn
						}
						this.webJsScrollToElement(driver,lElementSliderHandleMin)
						Actions lActions=new Actions(driver)
						lActions.clickAndHold(lElementSliderHandleMin).moveToElement(lElementSliderHandleMin,0,0).moveByOffset(lMoveStepOffsetAmount,0).release().build().perform()
						lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
						if(lCurrentIndexMinStr.length()<=0){
							return lreturn
						}
						lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
						if(lCurrentIndexMinNum<=lButtonIndexMin){
							break
						}
					}
					lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
					if(!lElementSliderHandleMin){
						return lreturn
					}
					lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
					if(lCurrentIndexMinStr.length()<=0){
						return lreturn
					}
					lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
					if(lCurrentIndexMinNum<=lButtonIndexMin){
						break
					}
				}
			}
			lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMaxStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
			if(lCurrentIndexMaxNum<lButtonIndexMax){
				lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
				if(!lElementSliderHandleMax){
					return lreturn
				}
				this.webJsScrollToElement(driver,lElementSliderHandleMax)
				this.delayThreadSecond(1)
				Integer lIndexButtonTry=0
				for(lIndexButtonTry=0;lIndexButtonTry<=lDefaultMaxButton;lIndexButtonTry++){
					Integer lMoveStepOffset=0
					for(lMoveStepOffset=0;lMoveStepOffset<=2000;lMoveStepOffset++){
						Integer lMoveStepOffsetAmount=lMoveStepOffset
						lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
						if(!lElementSliderHandleMax){
							return lreturn
						}
						this.webJsScrollToElement(driver,lElementSliderHandleMax)
						Actions lActions=new Actions(driver)
						lActions.clickAndHold(lElementSliderHandleMax).moveToElement(lElementSliderHandleMax,0,0).moveByOffset(lMoveStepOffsetAmount,0).release().build().perform()
						lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
						if(lCurrentIndexMaxStr.length()<=0){
							return lreturn
						}
						lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
						if(lCurrentIndexMaxNum>=lButtonIndexMax){
							break
						}
					}
					lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
					if(!lElementSliderHandleMax){
						return lreturn
					}
					lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
					if(lCurrentIndexMaxStr.length()<=0){
						return lreturn
					}
					lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
					if(lCurrentIndexMaxNum>=lButtonIndexMax){
						break
					}
				}
			}
			lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMaxStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
			if(lCurrentIndexMaxNum>lButtonIndexMax){
				lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
				if(!lElementSliderHandleMax){
					return lreturn
				}
				this.webJsScrollToElement(driver,lElementSliderHandleMax)
				this.delayThreadSecond(1)
				Integer lIndexButtonTry=0
				for(lIndexButtonTry=0;lIndexButtonTry<=lDefaultMaxButton;lIndexButtonTry++){
					Integer lMoveStepOffset=0
					for(lMoveStepOffset=0;lMoveStepOffset<=2000;lMoveStepOffset++){
						Integer lMoveStepOffsetAmount=(-1)*lMoveStepOffset
						lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
						if(!lElementSliderHandleMax){
							return lreturn
						}
						this.webJsScrollToElement(driver,lElementSliderHandleMax)
						Actions lActions=new Actions(driver)
						lActions.clickAndHold(lElementSliderHandleMax).moveToElement(lElementSliderHandleMax,0,0).moveByOffset(lMoveStepOffsetAmount,0).release().build().perform()
						lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
						if(lCurrentIndexMaxStr.length()<=0){
							return lreturn
						}
						lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
						if(lCurrentIndexMaxNum<=lButtonIndexMax){
							break
						}
					}
					lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
					if(!lElementSliderHandleMax){
						return lreturn
					}
					lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
					if(lCurrentIndexMaxStr.length()<=0){
						return lreturn
					}
					lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
					if(lCurrentIndexMaxNum<=lButtonIndexMax){
						break
					}
				}
			}
			lElementSliderHandleMin=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMin,true)
			if(!lElementSliderHandleMin){
				return lreturn
			}
			lCurrentIndexMinStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMin,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMinStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMinNum=this.convertStringToInteger(lCurrentIndexMinStr,0)
			lElementSliderHandleMax=this.getChildWebElementOfWebElement(driver,webElementSliderWrapper,lLocatorSliderHandleMax,true)
			if(!lElementSliderHandleMax){
				return lreturn
			}
			lCurrentIndexMaxStr=this.getElementAttributeByWebElement(driver,lElementSliderHandleMax,lAttributeAriaValueNow).trim()
			if(lCurrentIndexMaxStr.length()<=0){
				return lreturn
			}
			lCurrentIndexMaxNum=this.convertStringToInteger(lCurrentIndexMaxStr,0)
			lreturn=(lCurrentIndexMinNum>=0)
			lreturn=lreturn&&(lCurrentIndexMaxNum>=0)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean selectSliderTrackByLocatorV5(WebDriver driver,WebElement webElementSliderWrapper,Integer buttonIndex){
		//selectSliderTrackByLocatorV5=For_Quotation_WebSite_Class(form-range)
		Boolean lreturn=false
		if(!((driver)&&(webElementSliderWrapper))){
			return lreturn
		}
		if(buttonIndex<0){
			return lreturn
		}
		try{
			this.printLog('selectSliderTrackByLocatorV5')
			String lSliderValueMinStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'min')
			Integer lSliderValueMinNum=this.convertStringToInteger(lSliderValueMinStr,0)
			String lSliderValueMaxStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'max')
			Integer lSliderValueMaxNum=this.convertStringToInteger(lSliderValueMaxStr,0)
			String lSliderValueStepStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'step')
			Integer lSliderValueStepNum=this.convertStringToInteger(lSliderValueStepStr,0)
			String lSliderValueCurrentStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'value')
			Integer lSliderValueCurrentNum=this.convertStringToInteger(lSliderValueCurrentStr,0)
			if(lSliderValueMinNum<0){
				return lreturn
			}
			if(lSliderValueMaxNum<=0){
				return lreturn
			}
			if(lSliderValueMaxNum<lSliderValueMinNum){
				return lreturn
			}
			Float lSliderStepMaxFloat=((lSliderValueMaxNum-lSliderValueMinNum)/lSliderValueStepNum)
			Integer lSliderStepMaxInteger=Math.round(lSliderStepMaxFloat)+1
			Integer lTargetValueNum=(buttonIndex*lSliderValueStepNum)
			if(lTargetValueNum>lSliderValueMaxNum){
				lTargetValueNum=lSliderValueMaxNum
			}
			String lTargetValueStr=lTargetValueNum.toString()
			if(lSliderValueCurrentNum>lSliderValueMinNum){
				for(Integer lIndex=0;lIndex<lSliderStepMaxInteger;lIndex++){
					webElementSliderWrapper.sendKeys(Keys.LEFT)
					lSliderValueCurrentStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'value')
					lSliderValueCurrentNum=this.convertStringToInteger(lSliderValueCurrentStr,0)
					if(lSliderValueCurrentNum<=lSliderValueMinNum){
						break
					}
				}
			}
			if(buttonIndex<=0){
				lreturn=true
			}else{
				for(Integer lIndex=0;lIndex<lSliderStepMaxInteger;lIndex++){
					webElementSliderWrapper.sendKeys(Keys.RIGHT)
					lSliderValueCurrentStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'value')
					lSliderValueCurrentNum=this.convertStringToInteger(lSliderValueCurrentStr,0)
					if(lSliderValueCurrentNum==lTargetValueNum){
						lreturn=true
						break
					}else if(lSliderValueCurrentNum>lTargetValueNum){
						webElementSliderWrapper.sendKeys(Keys.LEFT)
						lSliderValueCurrentStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'value')
						lSliderValueCurrentNum=this.convertStringToInteger(lSliderValueCurrentStr,0)
						if(lSliderValueCurrentNum==lTargetValueNum){
							lreturn=true
							break
						}else if(lSliderValueCurrentNum<lTargetValueNum){
							webElementSliderWrapper.sendKeys(Keys.RIGHT)
							lSliderValueCurrentStr=this.getElementAttributeByWebElement(driver,webElementSliderWrapper,'value')
							lSliderValueCurrentNum=this.convertStringToInteger(lSliderValueCurrentStr,0)
							if(lSliderValueCurrentNum>=lTargetValueNum){
								lreturn=true
								break
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownRandomByLocatorWithTagA(WebDriver driver,String buttonLocator,String elementLocator){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(elementLocator.length()<=0){
			return lreturn
		}
		try{
			List<WebElement> lElements=this.getWebElementFromCssLocator(driver,elementLocator).findElement(By.tagName('ul')).findElements(By.cssSelector('li a'))
			if(!lElements){
				return lreturn
			}
			if(buttonLocator.length()>0){
				WebElement lButton=this.getWebElementFromCssLocator(driver,buttonLocator)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				WebElement lStage=this.getWebElementFromCssLocator(driver,elementLocator)
				if(!this.checkElementContainClassNameByWebElement(driver,lStage,'open')){
					if(this.clickByWebElementWithScroll(driver,lButton)){
						//this.delayThreadSecond(1)
					}
				}
			}
			Random lRandom=new Random()
			Integer lSelectAt=this.getRandomIntegerFromZeroToLessThanNumber(lElements.size())
			Integer lLoop=0
			for(lElement in lElements){
				if(lSelectAt==lLoop){
					lreturn=this.getTextByWebElement(driver,lElement)
					if(this.clickByWebElementWithScroll(driver,lElement)){
						//this.delayThreadSecond(1)
					}
					return lreturn
				}
				lLoop++
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer countTopRankDropdownByLocator(WebDriver driver,String elementLocator){
		Integer lreturn=0
		if(!driver){
			return lreturn
		}
		if(elementLocator.length()<=0){
			return lreturn
		}
		try{
			List<WebElement> lElements=this.getWebElementFromCssLocator(driver,elementLocator).findElement(By.tagName('ul')).findElements(By.tagName('li'))
			if(!lElements){
				return lreturn
			}
			Integer lLoop=0
			for(lElement in lElements){
				if(this.checkElementContainClassNameByWebElement(driver,lElement,'divider')){
					return lLoop
				}
				lLoop++
			}
			lreturn=lLoop
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer countTopRankDropdownByElementId(WebDriver driver,String elementId){
		Integer lreturn=0
		if(!driver){
			return lreturn
		}
		if(elementId.length()<=0){
			return lreturn
		}
		try{
			lreturn=this.countTopRankDropdownByLocator(driver,'#'+elementId)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByLocatorAtIndexWithTagA(WebDriver driver,String buttonLocator,String elementLocator,Integer selectAt){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((elementLocator.length()<=0)||(selectAt<0)){
			return lreturn
		}
		try{
			List<WebElement> lElements=this.getWebElementFromCssLocator(driver,elementLocator).findElement(By.tagName('ul')).findElements(By.tagName('li'))
			if(!lElements){
				return lreturn
			}
			if(buttonLocator.length()>0){
				WebElement lButton=this.getWebElementFromCssLocator(driver,buttonLocator)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				WebElement lStage=this.getWebElementFromCssLocator(driver,elementLocator)
				if(!this.checkElementContainClassNameByWebElement(driver,lStage,'open')){
					if(this.clickByWebElementWithScroll(driver,lButton)){
						//this.delayThreadSecond(1)
					}
				}
			}
			Integer lLoop=0
			WebElement tagA=null
			for(lElement in lElements){
				tagA=null
				try{
					tagA=lElement.findElement(By.tagName('a'))
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				if(tagA){
					if(selectAt==lLoop){
						lreturn=this.getTextByWebElement(driver,tagA)
						this.webJsScrollToElement(driver,tagA)
						if(this.clickByWebElementWithScroll(driver,tagA)){
							//this.delayThreadSecond(1)
						}
						return lreturn
					}
					lLoop++
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByLocatorAtTextWithTagA(WebDriver driver,String buttonLocator,String elementLocator,String selectText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		String lText=selectText.toLowerCase().trim()
		if((elementLocator.length()<=0)||(lText.length()<=0)){
			return lreturn
		}
		try{
			List<WebElement> lElements=this.getWebElementFromCssLocator(driver,elementLocator).findElement(By.tagName('ul')).findElements(By.tagName('li'))
			if(!lElements){
				return lreturn
			}
			if(buttonLocator.length()>0){
				WebElement lButton=this.getWebElementFromCssLocator(driver,buttonLocator)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				WebElement lStage=this.getWebElementFromCssLocator(driver,elementLocator)
				if(!this.checkElementContainClassNameByWebElement(driver,lStage,'open')){
					if(this.clickByWebElementWithScroll(driver,lButton)){
						//this.delayThreadSecond(1)
					}
				}
			}
			Integer lLoop=0
			WebElement tagA=null
			for(lElement in lElements){
				tagA=null
				try{
					tagA=lElement.findElement(By.tagName('a'))
				}catch(Exception ex){
					//ex.printStackTrace()
				}
				if(tagA){
					if(this.getTextByWebElement(driver,tagA).length()>0){
						if(this.checkStringContainString(this.getTextByWebElement(driver,tagA).toLowerCase(),lText)){
							lreturn=this.getTextByWebElement(driver,tagA)
							if(this.clickByWebElementWithScroll(driver,tagA)){
								//this.delayThreadSecond(1)
							}
							return lreturn
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByElementIdAtIndexWithTagA(WebDriver driver,String buttonId,String elementId,Integer selectAt){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((elementId.length()<=0)||(selectAt<0)){
			return lreturn
		}
		try{
			lreturn=this.selectDropdownByLocatorAtIndexWithTagA(driver,'#'+buttonId,'#'+elementId,selectAt)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByElementIdAtTextWithTagA(WebDriver driver,String buttonId,String elementId,String selectText){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		String lText=selectText.toLowerCase().trim()
		if((elementId.length()<=0)||(lText.length()<=0)){
			return lreturn
		}
		try{
			lreturn=this.selectDropdownByLocatorAtTextWithTagA(driver,'#'+buttonId,'#'+elementId,selectText)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/************************************************************************************************************************************************************************/
	public static final String CONST_TAG_DATA_SELENIUM_NAME='data-selenium-name'
	public static final String CONST_TAG_DATA_SELENIUM_VALUE='data-selenium-value'
	public static String getTagDataSeleniumKey(String seleniumKey){
		String lreturn=''
		try{
			lreturn='['+this.CONST_TAG_DATA_SELENIUM_NAME+'="'+seleniumKey+'"]'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTagDataSeleniumValueEqual(String seleniumValueEqual){
		String lreturn=''
		try{
			lreturn='['+this.CONST_TAG_DATA_SELENIUM_VALUE+'="'+seleniumValueEqual+'"]'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTagDataSeleniumValueContain(String seleniumValueContain){
		String lreturn=''
		try{
			lreturn='['+this.CONST_TAG_DATA_SELENIUM_VALUE+'*="'+seleniumValueContain+'"i]'
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTagDataSeleniumKeyValueEqual(String seleniumKey,String seleniumValueEqual){
		String lreturn=''
		try{
			lreturn=this.getTagDataSeleniumKey(seleniumKey)+this.getTagDataSeleniumValueEqual(seleniumValueEqual)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getTagDataSeleniumKeyValueContain(String seleniumKey,String seleniumValueContain){
		String lreturn=''
		try{
			lreturn=this.getTagDataSeleniumKey(seleniumKey)+this.getTagDataSeleniumValueContain(seleniumValueContain)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromDataSeleniumKey(WebDriver driver,String seleniumKey){
		try{
			return this.getWebElementListFromCssLocator(driver,this.getTagDataSeleniumKey(seleniumKey))
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getWebElementFromDataSeleniumKey(WebDriver driver,String seleniumKey){
		try{
			return this.getWebElementFromCssLocator(driver,this.getTagDataSeleniumKey(seleniumKey))
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static String getDataSeleniumKeyWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=this.getElementAttributeByWebElement(driver,webElement,this.CONST_TAG_DATA_SELENIUM_NAME)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getDataSeleniumValueWebElement(WebDriver driver,WebElement webElement){
		String lreturn=''
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			lreturn=this.getElementAttributeByWebElement(driver,webElement,this.CONST_TAG_DATA_SELENIUM_VALUE)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromDataSeleniumKeyValueEqual(WebDriver driver,String seleniumKey,String seleniumValueEqual){
		WebElement lreturn=null
		try{
			lreturn=this.getWebElementFromCssLocator(driver,this.getTagDataSeleniumKeyValueEqual(seleniumKey,seleniumValueEqual))
			if(!lreturn){
				this.delayThreadSecond(1)
				lreturn=this.getWebElementFromCssLocator(driver,this.getTagDataSeleniumKeyValueEqual(seleniumKey,seleniumValueEqual))
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromDataSeleniumKeyValueContain(WebDriver driver,String seleniumKey,String seleniumValueContain){
		WebElement lreturn=null
		try{
			lreturn=this.getWebElementFromCssLocator(driver,this.getTagDataSeleniumKeyValueContain(seleniumKey,seleniumValueContain))
			if(!lreturn){
				this.delayThreadSecond(1)
				List<WebElement> lElementList=this.getWebElementListFromDataSeleniumKey(driver,seleniumKey)
				if(lElementList){
					String lTextFind=seleniumValueContain.toLowerCase()
					if(lTextFind.length()>0){
						String lTextValue=''
						String lTextDisplayed=''
						for(WebElement lElement in lElementList){
							lTextValue=this.getDataSeleniumValueWebElement(driver,lElement)
							lTextValue=lTextValue.toLowerCase().trim()
							lTextDisplayed=this.getTextByWebElement(driver,lElement)
							lTextDisplayed=lTextDisplayed.toLowerCase().trim()
							if(lTextValue.length()>0){
								if(this.checkStringContainString(lTextValue,lTextFind)){
									lreturn=lElement
									break
								}
							}
							if(lTextDisplayed.length()>0){
								if(this.checkStringContainString(lTextDisplayed,lTextFind)){
									lreturn=lElement
									break
								}
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementByIndexItemFromWebElementListDataSeleniumKey(WebDriver driver,Integer indexItem,String seleniumKey){
		WebElement lreturn=null
		try{
			List<WebElement> lElementList=this.getWebElementListFromDataSeleniumKey(driver,seleniumKey)
			lreturn=this.getWebElementByIndexItemFromWebElementList(driver,indexItem,lElementList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getDropdownItemActiveByDataSeleniumLocator(WebDriver driver,String tagKeyElementItemList){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			List<WebElement> lElementItemList=this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList)
			for(lElementItem in lElementItemList){
				if(this.checkElementContainClassNameByWebElement(driver,lElementItem,'active')){
					lreturn=this.getDataSeleniumValueWebElement(driver,lElementItem)
					return lreturn
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByDataSeleniumLocatorV1(WebDriver driver,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem){
		//selectDropdownByDataSeleniumLocatorV1=SelectByValueWithNoRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((tagKeyElementItemList.length()<=0)||(tagValueElementItem.length()<=0)){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectDropdownByDataSeleniumLocatorV1:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV1:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
			if(lElement){
				WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
				if(lElementParent){
					String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
					if(lControlTypeParent.length()>0){
						if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
							if(!lIsElementParentDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(lElement){
				String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
				if(lControlTypeSelf.length()>0){
					if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
						Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
						if(!lIsElementSelfDisplayed){
							lElement=null
						}
					}
				}
			}
			if(!lElement){
				lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectDropdownByDataSeleniumLocatorV1:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV1:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByDataSeleniumLocatorV2(WebDriver driver,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem,Boolean withRandom=true){
		//selectDropdownByDataSeleniumLocatorV2=SelectByValueWithRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectDropdownByDataSeleniumLocatorV2:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV2:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
			if(lElement){
				WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
				if(lElementParent){
					String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
					if(lControlTypeParent.length()>0){
						if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
							if(!lIsElementParentDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(lElement){
				String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
				if(lControlTypeSelf.length()>0){
					if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
						Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
						if(!lIsElementSelfDisplayed){
							lElement=null
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(!lElement){
					this.delayThreadSecond(1)
					lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
				if(!lElement){
					this.delayThreadSecond(1)
					lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectDropdownByDataSeleniumLocatorV2:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV2:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByDataSeleniumLocatorV3(WebDriver driver,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem,Boolean withRandom=true){
		//selectDropdownByDataSeleniumLocatorV3=SelectByValueWithRandomFromSkipLastItem
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectDropdownByDataSeleniumLocatorV3:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV3:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
			if(lElement){
				WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
				if(lElementParent){
					String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
					if(lControlTypeParent.length()>0){
						if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
							if(!lIsElementParentDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(lElement){
				String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
				if(lControlTypeSelf.length()>0){
					if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
						Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
						if(!lIsElementSelfDisplayed){
							lElement=null
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementFromDataSeleniumKeyValueEqual(driver,tagKeyElementItemList,tagValueElementItem)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
				if(!lElement){
					this.delayThreadSecond(1)
					lElement=this.getWebElementFromDataSeleniumKeyValueContain(driver,tagKeyElementItemList,tagValueElementItem)
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectDropdownByDataSeleniumLocatorV3:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV3:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByDataSeleniumLocatorV4(WebDriver driver,String tagKeyButton,String tagKeyElementItemList,Integer itemIndex,Boolean withRandom=true){
		//selectDropdownByDataSeleniumLocatorV4=SelectByIndexWithRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectDropdownByDataSeleniumLocatorV4:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV4:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,itemIndex,tagKeyElementItemList)
			if(lElement){
				WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
				if(lElementParent){
					String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
					if(lControlTypeParent.length()>0){
						if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
							if(!lIsElementParentDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(lElement){
				String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
				if(lControlTypeSelf.length()>0){
					if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
						Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
						if(!lIsElementSelfDisplayed){
							lElement=null
						}
					}
				}
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,itemIndex,tagKeyElementItemList)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementList(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectDropdownByDataSeleniumLocatorV4:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV4:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectDropdownByDataSeleniumLocatorV5(WebDriver driver,String tagKeyButton,String tagKeyElementItemList,Integer itemIndex,Boolean withRandom=true){
		//selectDropdownByDataSeleniumLocatorV5=SelectByIndexWithRandomFromSkipLastItem
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectDropdownByDataSeleniumLocatorV5:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV5:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,itemIndex,tagKeyElementItemList)
			if(lElement){
				WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
				if(lElementParent){
					String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
					if(lControlTypeParent.length()>0){
						if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
							if(!lIsElementParentDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(lElement){
				String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
				if(lControlTypeSelf.length()>0){
					if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
						Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
						if(!lIsElementSelfDisplayed){
							lElement=null
						}
					}
				}
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,itemIndex,tagKeyElementItemList)
				if(lElement){
					WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
					if(lElementParent){
						String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
						if(lControlTypeParent.length()>0){
							if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
								if(!lIsElementParentDisplayed){
									lElement=null
								}
							}
						}
					}
				}
				if(lElement){
					String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
					if(lControlTypeSelf.length()>0){
						if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
							Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
							if(!lIsElementSelfDisplayed){
								lElement=null
							}
						}
					}
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getWebElementListFromDataSeleniumKey(driver,tagKeyElementItemList))
					if(lElement){
						WebElement lElementParent=this.getParentElementOfWebElement(driver,lElement)
						if(lElementParent){
							String lControlTypeParent=this.checkTypeOfWebElement(driver,lElementParent)
							if(lControlTypeParent.length()>0){
								if(lControlTypeParent.toUpperCase().equalsIgnoreCase('LI')){
									Boolean lIsElementParentDisplayed=this.checkElementVisibleByElementJs(driver,lElementParent)
									if(!lIsElementParentDisplayed){
										lElement=null
									}
								}
							}
						}
					}
					if(lElement){
						String lControlTypeSelf=this.checkTypeOfWebElement(driver,lElement)
						if(lControlTypeSelf.length()>0){
							if(lControlTypeSelf.toUpperCase().equalsIgnoreCase('LI')){
								Boolean lIsElementSelfDisplayed=this.checkElementVisibleByElementJs(driver,lElement)
								if(!lIsElementSelfDisplayed){
									lElement=null
								}
							}
						}
					}
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectDropdownByDataSeleniumLocatorV5:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getWebElementFromDataSeleniumKey(driver,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getDropdownItemActiveByDataSeleniumLocator(driver,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectDropdownByDataSeleniumLocatorV5:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromDataSeleniumKey(WebDriver driver,WebElement parentElement,String seleniumKey){
		try{
			return this.getChildWebElementListOfWebElement(driver,parentElement,this.getTagDataSeleniumKey(seleniumKey))
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getChildWebElementFromDataSeleniumKey(WebDriver driver,WebElement parentElement,String seleniumKey){
		try{
			return this.getChildWebElementOfWebElement(driver,parentElement,this.getTagDataSeleniumKey(seleniumKey),true)
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static WebElement getChildWebElementFromDataSeleniumKeyValueEqual(WebDriver driver,WebElement parentElement,String seleniumKey,String seleniumValueEqual){
		WebElement lreturn=null
		try{
			this.printLog(this.getTagDataSeleniumKeyValueEqual(seleniumKey,seleniumValueEqual))
			lreturn=this.getChildWebElementOfWebElement(driver,parentElement,this.getTagDataSeleniumKeyValueEqual(seleniumKey,seleniumValueEqual),true)
			if(!lreturn){
				this.delayThreadSecond(1)
				lreturn=this.getChildWebElementOfWebElement(driver,parentElement,this.getTagDataSeleniumKeyValueEqual(seleniumKey,seleniumValueEqual),true)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromDataSeleniumKeyValueContain(WebDriver driver,WebElement parentElement,String seleniumKey,String seleniumValueContain){
		WebElement lreturn=null
		try{
			lreturn=this.getChildWebElementOfWebElement(driver,parentElement,this.getTagDataSeleniumKeyValueContain(seleniumKey,seleniumValueContain),true)
			if(!lreturn){
				this.delayThreadSecond(1)
				List<WebElement> lElementList=this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,seleniumKey)
				if(lElementList){
					String lTextFind=seleniumValueContain.toLowerCase()
					if(lTextFind.length()>0){
						String lTextValue=''
						String lTextDisplayed=''
						for(WebElement lElement in lElementList){
							lTextValue=this.getDataSeleniumValueWebElement(driver,lElement)
							lTextValue=lTextValue.toLowerCase().trim()
							lTextDisplayed=this.getTextByWebElement(driver,lElement)
							lTextDisplayed=lTextDisplayed.toLowerCase().trim()
							if(lTextValue.length()>0){
								if(this.checkStringContainString(lTextValue,lTextFind)){
									lreturn=lElement
									break
								}
							}
							if(lTextDisplayed.length()>0){
								if(this.checkStringContainString(lTextDisplayed,lTextFind)){
									lreturn=lElement
									break
								}
							}
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementByIndexItemFromWebElementListDataSeleniumKey(WebDriver driver,WebElement parentElement,Integer indexItem,String seleniumKey){
		WebElement lreturn=null
		try{
			List<WebElement> lElementList=this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,seleniumKey)
			lreturn=this.getWebElementByIndexItemFromWebElementList(driver,indexItem,lElementList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getChildDropdownItemActiveByDataSeleniumLocator(WebDriver driver,WebElement parentElement,String tagKeyElementItemList){
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			List<WebElement> lElementItemList=this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList)
			for(lElementItem in lElementItemList){
				if(this.checkElementContainClassNameByWebElement(driver,lElementItem,'active')){
					lreturn=this.getDataSeleniumValueWebElement(driver,lElementItem)
					return lreturn
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildDropdownByDataSeleniumLocatorV1(WebDriver driver,WebElement parentElement,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem){
		//selectChildDropdownByDataSeleniumLocatorV1=SelectByValueWithNoRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((tagKeyElementItemList.length()<=0)||(tagValueElementItem.length()<=0)){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV1:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV1:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getChildWebElementFromDataSeleniumKeyValueEqual(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			if(!lElement){
				lElement=this.getChildWebElementFromDataSeleniumKeyValueContain(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV1:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV1:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildDropdownByDataSeleniumLocatorV2(WebDriver driver,WebElement parentElement,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem,Boolean withRandom=true){
		//selectChildDropdownByDataSeleniumLocatorV2=SelectByValueWithRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV2:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV2:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getChildWebElementFromDataSeleniumKeyValueEqual(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementFromDataSeleniumKeyValueContain(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementList(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementFromDataSeleniumKeyValueEqual(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
				if(!lElement){
					this.delayThreadSecond(1)
					lElement=this.getChildWebElementFromDataSeleniumKeyValueContain(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementList(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV2:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV2:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildDropdownByDataSeleniumLocatorV3(WebDriver driver,WebElement parentElement,String tagKeyButton,String tagKeyElementItemList,String tagValueElementItem,Boolean withRandom=true){
		//selectChildDropdownByDataSeleniumLocatorV3=SelectByValueWithRandomFromSkipLastItem
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV3:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV3:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getChildWebElementFromDataSeleniumKeyValueEqual(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementFromDataSeleniumKeyValueContain(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
			}
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementFromDataSeleniumKeyValueEqual(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
				if(!lElement){
					this.delayThreadSecond(1)
					lElement=this.getChildWebElementFromDataSeleniumKeyValueContain(driver,parentElement,tagKeyElementItemList,tagValueElementItem)
				}
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV3:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV3:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildDropdownByDataSeleniumLocatorV4(WebDriver driver,WebElement parentElement,String tagKeyButton,String tagKeyElementItemList,Integer itemIndex,Boolean withRandom=true){
		//selectChildDropdownByDataSeleniumLocatorV4=SelectByIndexWithRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV4:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV4:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getChildWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,parentElement,itemIndex,tagKeyElementItemList)
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementList(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,parentElement,itemIndex,tagKeyElementItemList)
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementList(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV4:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV4:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildDropdownByDataSeleniumLocatorV5(WebDriver driver,WebElement parentElement,String tagKeyButton,String tagKeyElementItemList,Integer itemIndex,Boolean withRandom=true){
		//selectChildDropdownByDataSeleniumLocatorV5=SelectByIndexWithRandomFromSkipLastItem
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeyElementItemList.length()<=0){
			return lreturn
		}
		try{
			WebElement lButton=null
			if(tagKeyButton.length()>0){
				lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
				if(!lButton){
					return lreturn
				}
				this.webJsScrollToElement(driver,lButton)
				String lButtonStage=this.getElementAttributeByWebElement(driver,lButton,'aria-expanded')
				Boolean lIsButtonOpen=this.convertStringToBoolean(lButtonStage)
				if(!lIsButtonOpen){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV5:lIsButtonOpen=false')
					if(this.clickByWebElementWithScroll(driver,lButton)){
						this.delayThreadSecond(1)
					}else{
						this.webJsClickWebElementParentWithScroll(driver,lButton)
						this.delayThreadSecond(1)
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV5:lIsButtonOpen=true')
				}
			}
			WebElement lElement=null
			lElement=this.getChildWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,parentElement,itemIndex,tagKeyElementItemList)
			if((!lElement)&&(withRandom)){
				this.delayThreadSecond(1)
				lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
			}
			if(!lElement){
				this.delayThreadSecond(1)
				lElement=this.getChildWebElementByIndexItemFromWebElementListDataSeleniumKey(driver,parentElement,itemIndex,tagKeyElementItemList)
				if((!lElement)&&(withRandom)){
					this.delayThreadSecond(1)
					lElement=this.getWebElementRandomFromWebElementListSkipLast(driver,this.getChildWebElementListFromDataSeleniumKey(driver,parentElement,tagKeyElementItemList))
				}
			}
			if(!lElement){
				return lreturn
			}else{
				if(this.checkElementVisibleByElementJs(driver,lElement)){
					this.printLog('selectChildDropdownByDataSeleniumLocatorV5:checkElementVisibleByElementJs=true')
					this.webJsScrollToElement(driver,lElement)
					String lTextDataSeleniumValue=this.getDataSeleniumValueWebElement(driver,lElement)
					String lTextElementValue=this.getTextByWebElement(driver,lElement)
					WebElement lElementThis=null
					WebElement lElementChildTagA=null
					lElementThis=lElement
					lElementChildTagA=this.getChildWebElementOfWebElement(driver,lElementThis,'a',true)
					if(lElementChildTagA){
						lElement=lElementChildTagA
					}
					if(this.clickByWebElementWithScroll(driver,lElement)){
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}else{
						this.webJsClickWebElementFinalWithScroll(driver,lElement)
						this.delayThreadSecond(1)
						if(lElementChildTagA){
							lElement=lElementThis
						}
						lButton=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,tagKeyButton)
						if(lButton){
							lreturn=this.getDataSeleniumValueWebElement(driver,lButton)
							if(lreturn.length()<=0){
								lreturn=this.getElementAttributeByWebElement(driver,lButton,'value')
							}
						}else{
							lreturn=this.getChildDropdownItemActiveByDataSeleniumLocator(driver,parentElement,tagKeyElementItemList)
						}
					}
					if(lreturn.length()<=0){
						lreturn=lTextDataSeleniumValue
					}
					if(lreturn.length()<=0){
						lreturn=lTextElementValue
					}
				}else{
					this.printLog('selectChildDropdownByDataSeleniumLocatorV5:checkElementVisibleByElementJs=false')
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByWebElementV1(WebDriver driver,WebElement webElementSelect,String strTargetOptionValue,Boolean isMatchByValueBeforeVisibleText,Boolean withRandom){
		//selectOptionSelectByWebElementV1=SelectOptionSelectByWebElementWithValueOrVisibleTextAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!webElementSelect){
			return lreturn
		}
		if(strTargetOptionValue.length()<=0){
			return lreturn
		}
		Boolean lTargetMatchByValue=false
		String lTargetOptionValue=''
		try{
			WebElement lElementSelect=webElementSelect
			if(!lElementSelect){
				return lreturn
			}
			Select lSelect=new Select(lElementSelect)
			List<WebElement> lOptionList=lSelect.getOptions()
			if(lOptionList.size()>0){
				Boolean lOptionItemFound=false
				Integer lIndexOptionItem=0
				WebElement lElementOptionItem=null
				String lOptionFindText=''
				if(isMatchByValueBeforeVisibleText){
					lTargetMatchByValue=true
					for(Integer lOptionItemIndex=0;lOptionItemIndex<=lOptionList.size()-1;lOptionItemIndex++){
						lElementOptionItem=lOptionList.get(lOptionItemIndex)
						lOptionFindText=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
						if(lOptionFindText.contains(strTargetOptionValue)){
							lOptionItemFound=true
							lIndexOptionItem=lOptionItemIndex
							break
						}
					}
					if(!lOptionItemFound){
						lTargetMatchByValue=false
						for(Integer lOptionItemIndex=0;lOptionItemIndex<=lOptionList.size()-1;lOptionItemIndex++){
							lElementOptionItem=lOptionList.get(lOptionItemIndex)
							lOptionFindText=lElementOptionItem.getText()
							if(lOptionFindText.contains(strTargetOptionValue)){
								lOptionItemFound=true
								lIndexOptionItem=lOptionItemIndex
								break
							}
						}
					}
				}else{
					lTargetMatchByValue=false
					for(Integer lOptionItemIndex=0;lOptionItemIndex<=lOptionList.size()-1;lOptionItemIndex++){
						lElementOptionItem=lOptionList.get(lOptionItemIndex)
						lOptionFindText=lElementOptionItem.getText()
						if(lOptionFindText.contains(strTargetOptionValue)){
							lOptionItemFound=true
							lIndexOptionItem=lOptionItemIndex
							break
						}
					}
					if(!lOptionItemFound){
						lTargetMatchByValue=true
						for(Integer lOptionItemIndex=0;lOptionItemIndex<=lOptionList.size()-1;lOptionItemIndex++){
							lElementOptionItem=lOptionList.get(lOptionItemIndex)
							lOptionFindText=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
							if(lOptionFindText.contains(strTargetOptionValue)){
								lOptionItemFound=true
								lIndexOptionItem=lOptionItemIndex
								break
							}
						}
					}
				}
				if(lOptionItemFound){
					lSelect.selectByIndex(lIndexOptionItem)
					lElementOptionItem=lSelect.getFirstSelectedOption()
					if(lElementOptionItem){
						if(lTargetMatchByValue){
							lTargetOptionValue=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
						}else{
							lTargetOptionValue=lElementOptionItem.getText()
						}
					}
				}else{
					if(withRandom){
						lElementOptionItem=this.getWebElementRandomFromWebElementList(driver,lOptionList)
						if(lElementOptionItem){
							lOptionItemFound=true
							lOptionFindText=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
							if(lOptionFindText.length()>0){
								lTargetMatchByValue=true
							}else{
								lOptionFindText=lElementOptionItem.getText()
								if(lOptionFindText.length()<=0){
									lOptionItemFound=false
								}else{
									lTargetMatchByValue=false
								}
							}
							if(lOptionItemFound){
								if(lTargetMatchByValue){
									lSelect.selectByValue(lOptionFindText)
								}else{
									lSelect.selectByVisibleText(lOptionFindText)
								}
								lElementOptionItem=lSelect.getFirstSelectedOption()
								if(lElementOptionItem){
									if(lTargetMatchByValue){
										lTargetOptionValue=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
									}else{
										lTargetOptionValue=lElementOptionItem.getText()
									}
								}
							}
						}
					}
				}
			}
			lreturn=lTargetOptionValue
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByWebElementV2(WebDriver driver,WebElement webElementSelect,Integer itemIndex,Boolean withRandom){
		//selectOptionSelectByWebElementV2=SelectOptionSelectByWebElementWithIndexAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!webElementSelect){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		Boolean lTargetMatchByValue=false
		String lTargetOptionValue=''
		try{
			WebElement lElementSelect=webElementSelect
			if(!lElementSelect){
				return lreturn
			}
			Select lSelect=new Select(lElementSelect)
			List<WebElement> lOptionList=lSelect.getOptions()
			if(lOptionList.size()>0){
				Boolean lOptionItemFound=false
				Integer lIndexOptionItem=0
				WebElement lElementOptionItem=null
				String lOptionFindText=''
				lElementOptionItem=this.getWebElementByIndexItemFromWebElementList(driver,itemIndex,lOptionList)
				if(lElementOptionItem){
					lOptionItemFound=true
					lOptionFindText=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
					if(lOptionFindText.length()>0){
						lTargetMatchByValue=true
					}else{
						lOptionFindText=lElementOptionItem.getText()
						if(lOptionFindText.length()<=0){
							lOptionItemFound=false
						}else{
							lTargetMatchByValue=false
						}
					}
					if(lOptionItemFound){
						if(lTargetMatchByValue){
							lSelect.selectByValue(lOptionFindText)
						}else{
							lSelect.selectByVisibleText(lOptionFindText)
						}
						lElementOptionItem=lSelect.getFirstSelectedOption()
						if(lElementOptionItem){
							if(lTargetMatchByValue){
								lTargetOptionValue=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
							}else{
								lTargetOptionValue=lElementOptionItem.getText()
							}
						}
					}
				}else{
					if(withRandom){
						lElementOptionItem=this.getWebElementRandomFromWebElementList(driver,lOptionList)
						if(lElementOptionItem){
							lOptionItemFound=true
							lOptionFindText=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
							if(lOptionFindText.length()>0){
								lTargetMatchByValue=true
							}else{
								lOptionFindText=lElementOptionItem.getText()
								if(lOptionFindText.length()<=0){
									lOptionItemFound=false
								}else{
									lTargetMatchByValue=false
								}
							}
							if(lOptionItemFound){
								if(lTargetMatchByValue){
									lSelect.selectByValue(lOptionFindText)
								}else{
									lSelect.selectByVisibleText(lOptionFindText)
								}
								lElementOptionItem=lSelect.getFirstSelectedOption()
								if(lElementOptionItem){
									if(lTargetMatchByValue){
										lTargetOptionValue=this.getElementAttributeByWebElement(driver,lElementOptionItem,'value')
									}else{
										lTargetOptionValue=lElementOptionItem.getText()
									}
								}
							}
						}
					}
				}
			}
			lreturn=lTargetOptionValue
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByCssLocatorV1(WebDriver driver,String cssLocatorSelect,String strTargetOptionValue,Boolean isMatchByValueBeforeVisibleText,Boolean withRandom){
		//selectOptionSelectByCssLocatorV1=SelectOptionSelectByCssLocatorWithValueOrVisibleTextAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((cssLocatorSelect.length()<=0)||(strTargetOptionValue.length()<=0)){
			return lreturn
		}
		try{
			WebElement lElementSelect=this.getWebElementFromCssLocator(driver,cssLocatorSelect)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV1(driver,lElementSelect,strTargetOptionValue,isMatchByValueBeforeVisibleText,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByCssLocatorV2(WebDriver driver,String cssLocatorSelect,Integer itemIndex,Boolean withRandom){
		//selectOptionSelectByCssLocatorV2=SelectOptionSelectByCssLocatorWithIndexAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(cssLocatorSelect.length()<=0){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			WebElement lElementSelect=this.getWebElementFromCssLocator(driver,cssLocatorSelect)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV2(driver,lElementSelect,itemIndex,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByDataSeleniumLocatorV1(WebDriver driver,String tagKeySelect,String strTargetOptionValue,Boolean isMatchByValueBeforeVisibleText,Boolean withRandom){
		//selectOptionSelectByDataSeleniumLocatorV1=SelectOptionSelectByDataSeleniumLocatorWithValueOrVisibleTextAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if((tagKeySelect.length()<=0)||(strTargetOptionValue.length()<=0)){
			return lreturn
		}
		try{
			String lTagSelect=tagKeySelect
			String lLocatorSelect=this.getTagDataSeleniumKey(lTagSelect)
			lreturn=this.selectOptionSelectByCssLocatorV1(driver,lLocatorSelect,strTargetOptionValue,isMatchByValueBeforeVisibleText,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectOptionSelectByDataSeleniumLocatorV2(WebDriver driver,String tagKeySelect,Integer itemIndex,Boolean withRandom){
		//selectOptionSelectByDataSeleniumLocatorV2=SelectOptionSelectByDataSeleniumLocatorWithIndexAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(tagKeySelect.length()<=0){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lTagSelect=tagKeySelect
			String lLocatorSelect=this.getTagDataSeleniumKey(lTagSelect)
			lreturn=this.selectOptionSelectByCssLocatorV2(driver,lLocatorSelect,itemIndex,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildOptionSelectByCssLocatorV1(WebDriver driver,WebElement parentElement,String cssLocatorSelect,String strTargetOptionValue,Boolean isMatchByValueBeforeVisibleText,Boolean withRandom){
		//selectChildOptionSelectByCssLocatorV1=SelectChildOptionSelectByCssLocatorWithValueOrVisibleTextAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!parentElement){
			return lreturn
		}
		if((cssLocatorSelect.length()<=0)||(strTargetOptionValue.length()<=0)){
			return lreturn
		}
		try{
			WebElement lElementSelect=this.getChildWebElementOfWebElement(driver,parentElement,cssLocatorSelect,true)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV1(driver,lElementSelect,strTargetOptionValue,isMatchByValueBeforeVisibleText,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildOptionSelectByCssLocatorV2(WebDriver driver,WebElement parentElement,String cssLocatorSelect,Integer itemIndex,Boolean withRandom){
		//selectChildOptionSelectByCssLocatorV2=SelectChildOptionSelectByCssLocatorWithIndexAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!parentElement){
			return lreturn
		}
		if(cssLocatorSelect.length()<=0){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			WebElement lElementSelect=this.getChildWebElementOfWebElement(driver,parentElement,cssLocatorSelect,true)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV2(driver,lElementSelect,itemIndex,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildOptionSelectByDataSeleniumLocatorV1(WebDriver driver,WebElement parentElement,String tagKeySelect,String strTargetOptionValue,Boolean isMatchByValueBeforeVisibleText,Boolean withRandom){
		//selectChildOptionSelectByDataSeleniumLocatorV1=SelectChildOptionSelectByDataSeleniumLocatorWithValueOrVisibleTextAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!parentElement){
			return lreturn
		}
		if((tagKeySelect.length()<=0)||(strTargetOptionValue.length()<=0)){
			return lreturn
		}
		try{
			String lTagSelect=tagKeySelect
			String lLocatorSelect=this.getTagDataSeleniumKey(lTagSelect)
			WebElement lElementSelect=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,lTagSelect)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV1(driver,lElementSelect,strTargetOptionValue,isMatchByValueBeforeVisibleText,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String selectChildOptionSelectByDataSeleniumLocatorV2(WebDriver driver,WebElement parentElement,String tagKeySelect,Integer itemIndex,Boolean withRandom){
		//selectChildOptionSelectByDataSeleniumLocatorV2=SelectChildOptionSelectByDataSeleniumLocatorWithIndexAndIfRandomFromAllItems
		String lreturn=''
		if(!driver){
			return lreturn
		}
		if(!parentElement){
			return lreturn
		}
		if(tagKeySelect.length()<=0){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lTagSelect=tagKeySelect
			String lLocatorSelect=this.getTagDataSeleniumKey(lTagSelect)
			WebElement lElementSelect=this.getChildWebElementFromDataSeleniumKey(driver,parentElement,lTagSelect)
			if(!lElementSelect){
				return lreturn
			}
			lreturn=this.selectOptionSelectByWebElementV2(driver,lElementSelect,itemIndex,withRandom)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/************************************************************************************************************************************************************************/
	/*SHADOWDOM*/
	public static def getWebJsReturnFromJavascriptExecutor(WebDriver driver,String strJavascript,Object[] objectArgumentList=[]){
		def lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strJavascript)){
			return lreturn
		}
		String lStrJavascript=strJavascript.trim()
		if(this.checkObjectEmptyOfString(lStrJavascript)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(objectArgumentList)){
			objectArgumentList=[]
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=this.callJavascriptExecutor(driver,lStrJavascript,objectArgumentList)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromCssSelector(WebDriver driver,String strCssSelector){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strCssSelector)){
			return lreturn
		}
		String lStrCssSelector=strCssSelector.trim()
		if(this.checkObjectEmptyOfString(lStrCssSelector)){
			return lreturn
		}
		final String lStrConstJavascriptReturn='return'+StringUtils.SPACE
		final String lStrConstCssSelectorDocument='document.'
		final String lStrConstCssSelectorOne='.querySelector('
		final String lStrConstCssSelectorMany='.querySelectorAll('
		Integer lIndexOfStrConstJavascriptReturn=-1
		Integer lIndexOfStrConstCssSelectorOne=-1
		Integer lIndexOfStrConstCssSelectorMany=-1
		try{
			this.printLog(this.getThisCallMethodName())
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptReturn)){
				lIndexOfStrConstJavascriptReturn=lStrCssSelector.indexOf(lStrConstJavascriptReturn)
			}
			if(lIndexOfStrConstJavascriptReturn==0){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorDocument)){
				return lreturn
			}
			if(lStrCssSelector[lStrCssSelector.length()-1]!=';'){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorOne)){
				return lreturn
			}else{
				lIndexOfStrConstCssSelectorOne=lStrCssSelector.lastIndexOf(lStrConstCssSelectorOne)
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorMany)){
				lIndexOfStrConstCssSelectorMany=lStrCssSelector.lastIndexOf(lStrConstCssSelectorMany)
			}
			if(lIndexOfStrConstCssSelectorMany>=lIndexOfStrConstCssSelectorOne){
				return lreturn
			}
			String lStrJavascript=lStrConstJavascriptReturn+lStrCssSelector
			lreturn=(WebElement)this.getWebJsReturnFromJavascriptExecutor(driver,lStrJavascript,[])
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromCssSelector(WebDriver driver,String strCssSelector){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strCssSelector)){
			return lreturn
		}
		String lStrCssSelector=strCssSelector.trim()
		if(this.checkObjectEmptyOfString(lStrCssSelector)){
			return lreturn
		}
		final String lStrConstJavascriptReturn='return'+StringUtils.SPACE
		final String lStrConstCssSelectorDocument='document.'
		final String lStrConstCssSelectorOne='.querySelector('
		final String lStrConstCssSelectorMany='.querySelectorAll('
		Integer lIndexOfStrConstJavascriptReturn=-1
		Integer lIndexOfStrConstCssSelectorOne=-1
		Integer lIndexOfStrConstCssSelectorMany=-1
		try{
			this.printLog(this.getThisCallMethodName())
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptReturn)){
				lIndexOfStrConstJavascriptReturn=lStrCssSelector.indexOf(lStrConstJavascriptReturn)
			}
			if(lIndexOfStrConstJavascriptReturn==0){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorDocument)){
				return lreturn
			}
			if(lStrCssSelector[lStrCssSelector.length()-1]!=';'){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorMany)){
				return lreturn
			}else{
				lIndexOfStrConstCssSelectorMany=lStrCssSelector.lastIndexOf(lStrConstCssSelectorMany)
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorOne)){
				lIndexOfStrConstCssSelectorOne=lStrCssSelector.lastIndexOf(lStrConstCssSelectorOne)
			}
			if(lIndexOfStrConstCssSelectorOne>=lIndexOfStrConstCssSelectorMany){
				return lreturn
			}
			String lStrJavascript=lStrConstJavascriptReturn+lStrCssSelector
			lreturn=(List<WebElement>)this.getWebJsReturnFromJavascriptExecutor(driver,lStrJavascript,[])
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromCssSelector(WebDriver driver,WebElement parentElement,String strCssSelector){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strCssSelector)){
			return lreturn
		}
		String lStrCssSelector=strCssSelector.trim()
		if(this.checkObjectEmptyOfString(lStrCssSelector)){
			return lreturn
		}
		final String lStrConstJavascriptReturn='return'+StringUtils.SPACE
		final String lStrConstJavascriptArgument00='arguments[0]'
		final String lStrConstCssSelectorDocument='document.'
		final String lStrConstCssSelectorOne='.querySelector('
		final String lStrConstCssSelectorMany='.querySelectorAll('
		Integer lIndexOfStrConstJavascriptReturn=-1
		Integer lIndexOfStrConstCssSelectorOne=-1
		Integer lIndexOfStrConstCssSelectorMany=-1
		try{
			this.printLog(this.getThisCallMethodName())
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptReturn)){
				lIndexOfStrConstJavascriptReturn=lStrCssSelector.indexOf(lStrConstJavascriptReturn)
			}
			if(lIndexOfStrConstJavascriptReturn==0){
				return lreturn
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptArgument00)){
				return lreturn
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorDocument)){
				return lreturn
			}
			if(lStrCssSelector[0]!='.'){
				return lreturn
			}
			if(lStrCssSelector[lStrCssSelector.length()-1]!=';'){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorOne)){
				return lreturn
			}else{
				lIndexOfStrConstCssSelectorOne=lStrCssSelector.lastIndexOf(lStrConstCssSelectorOne)
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorMany)){
				lIndexOfStrConstCssSelectorMany=lStrCssSelector.lastIndexOf(lStrConstCssSelectorMany)
			}
			if(lIndexOfStrConstCssSelectorMany>=lIndexOfStrConstCssSelectorOne){
				return lreturn
			}
			String lStrJavascript=lStrConstJavascriptReturn+lStrConstJavascriptArgument00+lStrCssSelector
			lreturn=(WebElement)this.getWebJsReturnFromJavascriptExecutor(driver,lStrJavascript,[parentElement].toArray())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromCssSelector(WebDriver driver,WebElement parentElement,String strCssSelector){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strCssSelector)){
			return lreturn
		}
		String lStrCssSelector=strCssSelector.trim()
		if(this.checkObjectEmptyOfString(lStrCssSelector)){
			return lreturn
		}
		final String lStrConstJavascriptReturn='return'+StringUtils.SPACE
		final String lStrConstJavascriptArgument00='arguments[0]'
		final String lStrConstCssSelectorDocument='document.'
		final String lStrConstCssSelectorOne='.querySelector('
		final String lStrConstCssSelectorMany='.querySelectorAll('
		Integer lIndexOfStrConstJavascriptReturn=-1
		Integer lIndexOfStrConstCssSelectorOne=-1
		Integer lIndexOfStrConstCssSelectorMany=-1
		try{
			this.printLog(this.getThisCallMethodName())
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptReturn)){
				lIndexOfStrConstJavascriptReturn=lStrCssSelector.indexOf(lStrConstJavascriptReturn)
			}
			if(lIndexOfStrConstJavascriptReturn==0){
				return lreturn
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstJavascriptArgument00)){
				return lreturn
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorDocument)){
				return lreturn
			}
			if(lStrCssSelector[0]!='.'){
				return lreturn
			}
			if(lStrCssSelector[lStrCssSelector.length()-1]!=';'){
				return lreturn
			}
			if(!this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorMany)){
				return lreturn
			}else{
				lIndexOfStrConstCssSelectorMany=lStrCssSelector.lastIndexOf(lStrConstCssSelectorMany)
			}
			if(this.checkStringContainString(lStrCssSelector,lStrConstCssSelectorOne)){
				lIndexOfStrConstCssSelectorOne=lStrCssSelector.lastIndexOf(lStrConstCssSelectorOne)
			}
			if(lIndexOfStrConstCssSelectorOne>=lIndexOfStrConstCssSelectorMany){
				return lreturn
			}
			String lStrJavascript=lStrConstJavascriptReturn+lStrConstJavascriptArgument00+lStrCssSelector
			lreturn=(List<WebElement>)this.getWebJsReturnFromJavascriptExecutor(driver,lStrJavascript,[parentElement].toArray())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromLinkTextFull(WebDriver driver,String strLinkTextFull){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextFull)){
			return lreturn
		}
		String lStrLinkTextFull=strLinkTextFull.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextFull)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElement(By.linkText(lStrLinkTextFull))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromLinkTextFull(WebDriver driver,String strLinkTextFull){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextFull)){
			return lreturn
		}
		String lStrLinkTextFull=strLinkTextFull.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextFull)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElements(By.linkText(lStrLinkTextFull))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromLinkTextFull(WebDriver driver,WebElement parentElement,String strLinkTextFull){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextFull)){
			return lreturn
		}
		String lStrLinkTextFull=strLinkTextFull.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextFull)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElement(By.linkText(lStrLinkTextFull))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromLinkTextFull(WebDriver driver,WebElement parentElement,String strLinkTextFull){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextFull)){
			return lreturn
		}
		String lStrLinkTextFull=strLinkTextFull.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextFull)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElements(By.linkText(lStrLinkTextFull))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromLinkTextPartial(WebDriver driver,String strLinkTextPartial){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextPartial)){
			return lreturn
		}
		String lStrLinkTextPartial=strLinkTextPartial.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextPartial)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElement(By.partialLinkText(lStrLinkTextPartial))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromLinkTextPartial(WebDriver driver,String strLinkTextPartial){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextPartial)){
			return lreturn
		}
		String lStrLinkTextPartial=strLinkTextPartial.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextPartial)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElements(By.partialLinkText(lStrLinkTextPartial))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromLinkTextPartial(WebDriver driver,WebElement parentElement,String strLinkTextPartial){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextPartial)){
			return lreturn
		}
		String lStrLinkTextPartial=strLinkTextPartial.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextPartial)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElement(By.partialLinkText(lStrLinkTextPartial))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromLinkTextPartial(WebDriver driver,WebElement parentElement,String strLinkTextPartial){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strLinkTextPartial)){
			return lreturn
		}
		String lStrLinkTextPartial=strLinkTextPartial.trim()
		if(this.checkObjectEmptyOfString(lStrLinkTextPartial)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElements(By.partialLinkText(lStrLinkTextPartial))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromTagName(WebDriver driver,String strTagName){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTagName)){
			return lreturn
		}
		String lStrTagName=strTagName.trim()
		if(this.checkObjectEmptyOfString(lStrTagName)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElement(By.tagName(lStrTagName))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromTagName(WebDriver driver,String strTagName){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTagName)){
			return lreturn
		}
		String lStrTagName=strTagName.trim()
		if(this.checkObjectEmptyOfString(lStrTagName)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElements(By.tagName(lStrTagName))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromTagName(WebDriver driver,WebElement parentElement,String strTagName){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTagName)){
			return lreturn
		}
		String lStrTagName=strTagName.trim()
		if(this.checkObjectEmptyOfString(lStrTagName)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElement(By.tagName(lStrTagName))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromTagName(WebDriver driver,WebElement parentElement,String strTagName){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strTagName)){
			return lreturn
		}
		String lStrTagName=strTagName.trim()
		if(this.checkObjectEmptyOfString(lStrTagName)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElements(By.tagName(lStrTagName))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromXPath(WebDriver driver,String strXPath){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strXPath)){
			return lreturn
		}
		String lStrXPath=strXPath.trim()
		if(this.checkObjectEmptyOfString(lStrXPath)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElement(By.xpath(lStrXPath))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromXPath(WebDriver driver,String strXPath){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strXPath)){
			return lreturn
		}
		String lStrXPath=strXPath.trim()
		if(this.checkObjectEmptyOfString(lStrXPath)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=driver.findElements(By.xpath(lStrXPath))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromXPath(WebDriver driver,WebElement parentElement,String strXPath){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strXPath)){
			return lreturn
		}
		String lStrXPath=strXPath.trim()
		if(this.checkObjectEmptyOfString(lStrXPath)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElement(By.xpath(lStrXPath))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromXPath(WebDriver driver,WebElement parentElement,String strXPath){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(parentElement)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(strXPath)){
			return lreturn
		}
		String lStrXPath=strXPath.trim()
		if(this.checkObjectEmptyOfString(lStrXPath)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			lreturn=parentElement.findElements(By.xpath(lStrXPath))
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkElementHasChildren(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='return arguments[0].hasChildNodes();'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getChildrenCountOfElement(WebDriver driver,WebElement webElement){
		Integer lreturn=0
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='return arguments[0].childElementCount;'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildrenElementListOfWebElement(WebDriver driver,WebElement webElement){
		List<WebElement> lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			if(driver&&webElement){
				if(this.checkElementHasChildren(driver,webElement)){
					if(this.getChildrenCountOfElement(driver,webElement)>0){
						String lJScript='return arguments[0].children;'
						this.printLog(lJScript)
						return ((JavascriptExecutor)driver).executeScript(lJScript,webElement)
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static Boolean checkShadowElementHasChildren(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='return arguments[0].shadowRoot.hasChildNodes();'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Integer getShadowChildrenCountOfElement(WebDriver driver,WebElement webElement){
		Integer lreturn=0
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='return arguments[0].shadowRoot.childElementCount;'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getShadowChildrenElementListOfWebElement(WebDriver driver,WebElement webElement){
		List<WebElement> lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			if(driver&&webElement){
				if(this.checkShadowElementHasChildren(driver,webElement)){
					if(this.getShadowChildrenCountOfElement(driver,webElement)>0){
						String lJScript='return arguments[0].shadowRoot.children;'
						this.printLog(lJScript)
						return ((JavascriptExecutor)driver).executeScript(lJScript,webElement)
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static Boolean checkShadowWebElement(WebDriver driver,WebElement webElement){
		Boolean lreturn=false
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='function checkShadowWebElement(webElement){ return (webElement.shadowRoot!=null); } return checkShadowWebElement(arguments[0]);'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static def getShadowRootElementOfWebElement(WebDriver driver,WebElement webElement){
		def lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			String lJScript='return arguments[0].shadowRoot;'
			this.printLog(lJScript)
			lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildShadowWebElementOfWebElement(WebDriver driver,WebElement webElement,String cssLocator,Boolean isFirstElementOfBlankCssLocator){
		WebElement lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			if(!this.checkShadowWebElement(driver,webElement)){
				lreturn=this.getChildWebElementOfWebElement(driver,webElement,cssLocator,isFirstElementOfBlankCssLocator)
			}else{
				String lCssLocator=cssLocator.trim()
				String lJScript=''
				if(lCssLocator.length()<=0){
					if(isFirstElementOfBlankCssLocator){
						lJScript='return arguments[0].shadowRoot.firstElementChild;'
					}else{
						lJScript='return arguments[0].shadowRoot.lastElementChild;'
					}
				}else{
					lJScript="return arguments[0].shadowRoot.querySelector('"+lCssLocator+"');"
				}
				this.printLog(lJScript)
				lreturn=((JavascriptExecutor)driver).executeScript(lJScript,webElement)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildShadowWebElementListOfWebElement(WebDriver driver,WebElement webElement,String cssLocator){
		List<WebElement> lreturn=null
		if(!((driver)&&(webElement))){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			if(!this.checkShadowWebElement(driver,webElement)){
				return this.getChildWebElementListOfWebElement(driver,webElement,cssLocator)
			}else{
				if(driver&&webElement){
					String lCssLocator=cssLocator.trim()
					String lJScript=''
					if(lCssLocator.length()<=0){
						this.printLog('getChildWebElementListOfWebElement:All')
						return webElement.findElements(By.xpath('.//*'))
					}else{
						lJScript="return arguments[0].shadowRoot.querySelectorAll('"+lCssLocator+"');"
						this.printLog('getChildWebElementListOfWebElement:'+lJScript)
						return ((JavascriptExecutor)driver).executeScript(lJScript,webElement)
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static List<WebElement> getWebElementListAll(WebDriver driver){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			return this.getWebElementListFromCssLocator(driver,'*')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListAll(WebDriver driver,WebElement webElement){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			return this.getChildWebElementListOfWebElement(driver,webElement,'*')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildShadowWebElementListAll(WebDriver driver,WebElement webElement){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName())
			return this.getChildShadowWebElementListOfWebElement(driver,webElement,'*')
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromMatchTagPrefix(WebDriver driver,String strTagPrefix,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListAll=this.getWebElementListAll(driver)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(this.checkObjectNullOfObject(lWebElementAllParent)){
						lWebElementListLevelFirst.add(lWebElementAllItem)
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.startsWith(lStrTagPrefix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromMatchTagPrefix(WebDriver driver,String strTagPrefix,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListFromMatchTagPrefix=this.getWebElementListFromMatchTagPrefix(driver,lStrTagPrefix,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagPrefix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagPrefix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagPrefix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagPrefix[0]
				}else{
					lreturn=lWebElementListFromMatchTagPrefix[lWebElementListFromMatchTagPrefix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromMatchTagContain(WebDriver driver,String strTagContain,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListAll=this.getWebElementListAll(driver)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(this.checkObjectNullOfObject(lWebElementAllParent)){
						lWebElementListLevelFirst.add(lWebElementAllItem)
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.contains(lStrTagContain)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromMatchTagContain(WebDriver driver,String strTagContain,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListFromMatchTagContain=this.getWebElementListFromMatchTagContain(driver,lStrTagContain,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagContain)){
				return lreturn
			}
			if(lWebElementListFromMatchTagContain.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagContain)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagContain[0]
				}else{
					lreturn=lWebElementListFromMatchTagContain[lWebElementListFromMatchTagContain.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getWebElementListFromMatchTagSuffix(WebDriver driver,String strTagSuffix,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListAll=this.getWebElementListAll(driver)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(this.checkObjectNullOfObject(lWebElementAllParent)){
						lWebElementListLevelFirst.add(lWebElementAllItem)
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.endsWith(lStrTagSuffix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getWebElementFromMatchTagSuffix(WebDriver driver,String strTagSuffix,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListFromMatchTagSuffix=this.getWebElementListFromMatchTagSuffix(driver,lStrTagSuffix,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagSuffix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagSuffix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagSuffix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagSuffix[0]
				}else{
					lreturn=lWebElementListFromMatchTagSuffix[lWebElementListFromMatchTagSuffix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromMatchTagPrefix(WebDriver driver,WebElement webElement,String strTagPrefix,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListAll=this.getChildWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(!this.checkObjectNullOfObject(lWebElementAllParent)){
						if(webElement==lWebElementAllParent){
							lWebElementListLevelFirst.add(lWebElementAllItem)
						}
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.startsWith(lStrTagPrefix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromMatchTagPrefix(WebDriver driver,WebElement webElement,String strTagPrefix,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListFromMatchTagPrefix=this.getChildWebElementListFromMatchTagPrefix(driver,webElement,lStrTagPrefix,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagPrefix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagPrefix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagPrefix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagPrefix[0]
				}else{
					lreturn=lWebElementListFromMatchTagPrefix[lWebElementListFromMatchTagPrefix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromMatchTagContain(WebDriver driver,WebElement webElement,String strTagContain,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListAll=this.getChildWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(!this.checkObjectNullOfObject(lWebElementAllParent)){
						if(webElement==lWebElementAllParent){
							lWebElementListLevelFirst.add(lWebElementAllItem)
						}
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.contains(lStrTagContain)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromMatchTagContain(WebDriver driver,WebElement webElement,String strTagContain,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListFromMatchTagContain=this.getChildWebElementListFromMatchTagContain(driver,webElement,lStrTagContain,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagContain)){
				return lreturn
			}
			if(lWebElementListFromMatchTagContain.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagContain)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagContain[0]
				}else{
					lreturn=lWebElementListFromMatchTagContain[lWebElementListFromMatchTagContain.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildWebElementListFromMatchTagSuffix(WebDriver driver,WebElement webElement,String strTagSuffix,Boolean isMatchLevelFist){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListAll=this.getChildWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListLevelFirst=new ArrayList<WebElement>()
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			if(isMatchLevelFist){
				for(WebElement lWebElementAllItem in lWebElementListAll){
					WebElement lWebElementAllParent=this.getParentElementOfWebElement(driver,lWebElementAllItem)
					if(!this.checkObjectNullOfObject(lWebElementAllParent)){
						if(webElement==lWebElementAllParent){
							lWebElementListLevelFirst.add(lWebElementAllItem)
						}
					}
				}
				if(lWebElementListLevelFirst.size()<=0){
					return lreturn
				}
				lWebElementListAll.clear()
				lWebElementListAll.addAll(lWebElementListLevelFirst)
			}
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.endsWith(lStrTagSuffix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildWebElementFromMatchTagSuffix(WebDriver driver,WebElement webElement,String strTagSuffix,Boolean isMatchLevelFist,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListFromMatchTagSuffix=this.getChildWebElementListFromMatchTagSuffix(driver,webElement,lStrTagSuffix,isMatchLevelFist)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagSuffix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagSuffix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagSuffix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagSuffix[0]
				}else{
					lreturn=lWebElementListFromMatchTagSuffix[lWebElementListFromMatchTagSuffix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildShadowWebElementListFromMatchTagPrefix(WebDriver driver,WebElement webElement,String strTagPrefix){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListAll=this.getChildShadowWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.startsWith(lStrTagPrefix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildShadowWebElementFromMatchTagPrefix(WebDriver driver,WebElement webElement,String strTagPrefix,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagPrefix)){
			return lreturn
		}
		String lStrTagPrefix=strTagPrefix.trim()
		if(this.checkObjectEmptyOfString(lStrTagPrefix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagPrefix)
			List<WebElement> lWebElementListFromMatchTagPrefix=this.getChildShadowWebElementListFromMatchTagPrefix(driver,webElement,lStrTagPrefix)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagPrefix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagPrefix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagPrefix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagPrefix[0]
				}else{
					lreturn=lWebElementListFromMatchTagPrefix[lWebElementListFromMatchTagPrefix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildShadowWebElementListFromMatchTagContain(WebDriver driver,WebElement webElement,String strTagContain){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListAll=this.getChildShadowWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.contains(lStrTagContain)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildShadowWebElementFromMatchTagContain(WebDriver driver,WebElement webElement,String strTagContain,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagContain)){
			return lreturn
		}
		String lStrTagContain=strTagContain.trim()
		if(this.checkObjectEmptyOfString(lStrTagContain)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagContain)
			List<WebElement> lWebElementListFromMatchTagContain=this.getChildShadowWebElementListFromMatchTagContain(driver,webElement,lStrTagContain)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagContain)){
				return lreturn
			}
			if(lWebElementListFromMatchTagContain.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagContain)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagContain[0]
				}else{
					lreturn=lWebElementListFromMatchTagContain[lWebElementListFromMatchTagContain.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static List<WebElement> getChildShadowWebElementListFromMatchTagSuffix(WebDriver driver,WebElement webElement,String strTagSuffix){
		List<WebElement> lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListAll=this.getChildShadowWebElementListAll(driver,webElement)
			if(this.checkObjectNullOfObject(lWebElementListAll)){
				return lreturn
			}
			if(lWebElementListAll.size()<=0){
				return lreturn
			}
			List<WebElement> lWebElementListMatched=new ArrayList<WebElement>()
			for(WebElement lWebElementAllItem in lWebElementListAll){
				String lStrWebElementTag=this.checkTypeOfWebElement(driver,lWebElementAllItem)
				if(lStrWebElementTag.length()>0){
					if(lStrWebElementTag.endsWith(lStrTagSuffix)){
						lWebElementListMatched.add(lWebElementAllItem)
					}
				}
			}
			lreturn=lWebElementListMatched
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static WebElement getChildShadowWebElementFromMatchTagSuffix(WebDriver driver,WebElement webElement,String strTagSuffix,Boolean isRandom,Boolean isItemFirst){
		WebElement lreturn=null
		if(this.checkObjectNullOfObject(driver)){
			return lreturn
		}
		if(this.checkObjectNullOfObject(webElement)){
			return lreturn
		}
		if(this.checkObjectNullOrEmptyOfString(strTagSuffix)){
			return lreturn
		}
		String lStrTagSuffix=strTagSuffix.trim()
		if(this.checkObjectEmptyOfString(lStrTagSuffix)){
			return lreturn
		}
		try{
			this.printLog(this.getThisCallMethodName()+':'+lStrTagSuffix)
			List<WebElement> lWebElementListFromMatchTagSuffix=this.getChildShadowWebElementListFromMatchTagSuffix(driver,webElement,lStrTagSuffix)
			if(this.checkObjectNullOfObject(lWebElementListFromMatchTagSuffix)){
				return lreturn
			}
			if(lWebElementListFromMatchTagSuffix.size()<=0){
				return lreturn
			}
			if(isRandom){
				lreturn=this.getWebElementRandomFromWebElementList(driver,lWebElementListFromMatchTagSuffix)
			}else{
				if(isItemFirst){
					lreturn=lWebElementListFromMatchTagSuffix[0]
				}else{
					lreturn=lWebElementListFromMatchTagSuffix[lWebElementListFromMatchTagSuffix.size()-1]
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	/************************************************************************************************************************************************************************/
}