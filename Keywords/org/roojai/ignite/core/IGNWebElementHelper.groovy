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
import org.apache.commons.io.FileUtils
import org.apache.commons.io.FilenameUtils
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
import groovy.sql.Sql as Sql
import groovy.sql.GroovyRowResult
import com.kms.katalon.keyword.excel.ExcelKeywords
import bsh.This
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
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargetItem
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargeDOM
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementFindByMethod
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementMatchByMethod
public class IGNWebElementHelper{
	IGNWebElementHelper parentIGNWebElementHelper=null
	Integer parentIGNWebElementLevelIndex=0
	WebDriver webDriver=null
	private IGNWebElementTargetItem webElementTargetItem=null
	private isIGNWebElementHelperValid=false
	private isIGNWebElementHelperReady=false
	public IGNWebElementHelper(IGNWebElementHelper ignWebElementHelper,Integer ignWebElementLevelIndex,WebDriver targetWebDriver,IGNWebElementTargetItem targetWebElementTargetItem){
		super()
		try{
			this.parentIGNWebElementHelper=ignWebElementHelper
			this.parentIGNWebElementLevelIndex=ignWebElementLevelIndex
			this.webDriver=targetWebDriver
			this.webElementTargetItem=targetWebElementTargetItem
			if(!IGNUemaHelper.checkObjectNullOfObject(this.webDriver)){
				this.initIGNWebElementHelper()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public IGNWebElementHelper getParentIGNWebElementHelper(){
		try{
			return this.parentIGNWebElementHelper
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setParentIGNWebElementHelper(IGNWebElementHelper newParentIGNWebElementHelper){
		//Do Nothing
		//this.parentIGNWebElementHelper=newParentIGNWebElementHelper
	}
	public Integer getParentIGNWebElementLevelIndex(){
		try{
			return this.parentIGNWebElementLevelIndex
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setParentIGNWebElementLevelIndex(Integer newParentIGNWebElementLevelIndex){
		//Do Nothing
		//this.parentIGNWebElementLevelIndex=newParentIGNWebElementLevelIndex
	}
	public WebDriver getWebDriver(){
		try{
			return this.webDriver
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setWebDriver(WebDriver newParentWebDriver){
		//Do Nothing
		//this.parentWebDriver=newParentWebDriver
	}
	public IGNWebElementTargetItem getIGNWebElementTargetItem(){
		try{
			return this.IGNWebElementTargetItem
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setIGNWebElementTargetItem(IGNWebElementTargetItem newParentIGNWebElementTargetItem){
		//Do Nothing
		//this.parentIGNWebElementTargetItem=newParentIGNWebElementTargetItem
	}
	public Boolean getIsIGNWebElementHelperValid(){
		try{
			return this.isIGNWebElementHelperValid
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setIsIGNWebElementHelperValid(Boolean newIsIGNWebElementHelperValid){
		//Do Nothing
		//this.isIGNWebElementHelperValid=newIsIGNWebElementHelperValid
	}
	public Boolean getIsIGNWebElementHelperReady(){
		try{
			return this.isIGNWebElementHelperReady
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public void setIsIGNWebElementHelperReady(Boolean newIsIGNWebElementHelperReady){
		//Do Nothing
		//this.isIGNWebElementHelperReady=newIsIGNWebElementHelperReady
	}
	private void initIGNWebElementHelper(){
		try{
			this.isIGNWebElementHelperValid=false
			Boolean lIsIGNTestExecutorTypeItemValid=true
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
}