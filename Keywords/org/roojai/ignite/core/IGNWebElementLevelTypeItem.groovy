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
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementFindByMethod
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargetDOM
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargetFindDOM
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargetItem
import org.roojai.ignite.core.IGNGlobalEnum.IGNWebElementTargetProceedDOM
public class IGNWebElementLevelTypeItem{
	private IGNWebElementHelper parentIGNWebElementHelper=null
	private IGNWebElementTargetDOM currentIGNWebElementTargetDOM=null
	private IGNWebElementLevelTypeItem currentIGNWebElementLevelTypeItemPrev=null
	private Integer currentIGNWebElementLevelIndex=0
	private IGNWebElementFindByMethod currentIGNWebElementFindByMethod=null
	private String strWebElementFindItemKey=''
	private String strWebElementFindItemValue=''
	private Boolean isIGNWebElementLevelTypeItemValid=false
	private IGNWebElementLevelTypeItem currentIGNWebElementLevelTypeItemNext=null
	private List<WebElement> targetWebElementList=null
	private WebElement targetWebElementItem=null
	private Boolean isIGNWebElementLevelTypeItemReady=false
	public IGNWebElementLevelTypeItem(IGNWebElementHelper initParentIGNWebElementHelper,IGNWebElementTargetDOM initCurrentIGNWebElementTargetDOM,IGNWebElementLevelTypeItem initCurrentIGNWebElementLevelTypeItemPrev,Integer initCurrentIGNWebElementLevelIndex,IGNWebElementFindByMethod initCurrentIGNWebElementFindByMethod,String initStrWebElementFindItemKey,String initStrWebElementFindItemValue){
		super()
		try{
			this.parentIGNWebElementHelper=initParentIGNWebElementHelper
			this.currentIGNWebElementTargetDOM=initCurrentIGNWebElementTargetDOM
			this.currentIGNWebElementLevelTypeItemPrev=initCurrentIGNWebElementLevelTypeItemPrev
			this.currentIGNWebElementLevelIndex=initCurrentIGNWebElementLevelIndex
			this.currentIGNWebElementFindByMethod=initCurrentIGNWebElementFindByMethod
			this.strWebElementFindItemKey=initStrWebElementFindItemKey
			this.strWebElementFindItemValue=initStrWebElementFindItemValue
			this.initIGNWebElementLevelTypeItem()
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static IGNWebElementLevelTypeItem getIGNWebElementLevelTypeItemInstance(IGNWebElementHelper initParentIGNWebElementHelper,IGNWebElementTargetDOM initCurrentIGNWebElementTargetDOM,IGNWebElementLevelTypeItem initCurrentIGNWebElementLevelTypeItemPrev,Integer initCurrentIGNWebElementLevelIndex,IGNWebElementFindByMethod initCurrentIGNWebElementFindByMethod,String initStrWebElementFindItemKey,String initStrWebElementFindItemValue){
		IGNWebElementLevelTypeItem lreturn=null
		try{
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=new IGNWebElementLevelTypeItem(initParentIGNWebElementHelper,initCurrentIGNWebElementTargetDOM,initCurrentIGNWebElementLevelTypeItemPrev,initCurrentIGNWebElementLevelIndex,initCurrentIGNWebElementFindByMethod,initStrWebElementFindItemKey,initStrWebElementFindItemValue)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)){
				if(lIGNWebElementLevelTypeItem.getIsIGNWebElementLevelTypeItemValid()){
					lreturn=lIGNWebElementLevelTypeItem
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public IGNWebElementHelper getParentIGNWebElementHelper(){
		return this.parentIGNWebElementHelper
	}
	public void setParentIGNWebElementHelper(IGNWebElementHelper newParentIGNWebElementHelper){
		//Do Nothing
		//this.parentIGNWebElementHelper=newParentIGNWebElementHelper
	}
	public IGNWebElementTargetDOM getCurrentIGNWebElementTargetDOM(){
		return this.currentIGNWebElementTargetDOM
	}
	public void setCurrentIGNWebElementTargetDOM(IGNWebElementTargetDOM newCurrentIGNWebElementTargetDOM){
		//Do Nothing
		//this.currentIGNWebElementTargetDOM=newCurrentIGNWebElementTargetDOM
	}
	public IGNWebElementLevelTypeItem getCurrentIGNWebElementLevelTypeItemPrev(){
		return this.currentIGNWebElementLevelTypeItemPrev
	}
	public void setCurrentIGNWebElementLevelTypeItemPrev(IGNWebElementLevelTypeItem newCurrentIGNWebElementLevelTypeItemPrev){
		//Do Nothing
		//this.currentIGNWebElementLevelTypeItemPrev=newCurrentIGNWebElementLevelTypeItemPrev
	}
	public Integer getCurrentIGNWebElementLevelIndex(){
		return this.currentIGNWebElementLevelIndex
	}
	public void setCurrentIGNWebElementLevelIndex(Integer newCurrentIGNWebElementLevelIndex){
		//Do Nothing
		//this.currentIGNWebElementLevelIndex=newCurrentIGNWebElementLevelIndex
	}
	public IGNWebElementFindByMethod getCurrentIGNWebElementFindByMethod(){
		return this.currentIGNWebElementFindByMethod
	}
	public void setCurrentIGNWebElementFindByMethod(IGNWebElementFindByMethod newCurrentIGNWebElementFindByMethod){
		//Do Nothing
		//this.currentIGNWebElementFindByMethod=newCurrentIGNWebElementFindByMethod
	}
	public String getStrWebElementFindItemKey(){
		return this.strWebElementFindItemKey
	}
	public void setStrWebElementFindItemKey(String newStrWebElementFindItemKey){
		//Do Nothing
		//this.strWebElementFindItemKey=newStrWebElementFindItemKey
	}
	public String getStrWebElementFindItemValue(){
		return this.strWebElementFindItemValue
	}
	public void setStrWebElementFindItemValue(String newStrWebElementFindItemValue){
		//Do Nothing
		//this.strWebElementFindItemValue=newStrWebElementFindItemValue
	}
	public Boolean getIsIGNWebElementLevelTypeItemValid(){
		return this.isIGNWebElementLevelTypeItemValid
	}
	public void setIsIGNWebElementLevelTypeItemValid(Boolean newIsIGNWebElementLevelTypeItemValid){
		//Do Nothing
		//this.isIGNWebElementLevelTypeItemValid=newIsIGNWebElementLevelTypeItemValid
	}
	public IGNWebElementLevelTypeItem getCurrentIGNWebElementLevelTypeItemNext(){
		return this.currentIGNWebElementLevelTypeItemNext
	}
	public void setCurrentIGNWebElementLevelTypeItemNext(IGNWebElementLevelTypeItem newCurrentIGNWebElementLevelTypeItemNext){
		//Do Nothing
		//this.currentIGNWebElementLevelTypeItemNext=newCurrentIGNWebElementLevelTypeItemNext
	}
	public List<WebElement> getTargetWebElementList(){
		return this.targetWebElementList
	}
	public void setTargetWebElementList(List<WebElement> newTargetWebElementList){
		//Do Nothing
		//this.targetWebElementList=newTargetWebElementList
	}
	public WebElement getTargetWebElementItem(){
		return this.targetWebElementItem
	}
	public void setTargetWebElementItem(WebElement newTargetWebElementItem){
		//Do Nothing
		//this.targetWebElementItem=newTargetWebElementItem
	}
	public Boolean getIsIGNWebElementLevelTypeItemReady(){
		return this.isIGNWebElementLevelTypeItemReady
	}
	public void setIsIGNWebElementLevelTypeItemReady(Boolean newIsIGNWebElementLevelTypeItemReady){
		//Do Nothing
		//this.isIGNWebElementLevelTypeItemReady=newIsIGNWebElementLevelTypeItemReady
	}
	private void initIGNWebElementLevelTypeItem(){
		try{
			this.isIGNWebElementLevelTypeItemValid=false
			Boolean lIsIGNWebElementLevelTypeItemValid=true
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper)
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=this.parentIGNWebElementHelper.getIsIGNWebElementHelperValid()
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementTargetDOM)
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=this.currentIGNWebElementLevelIndex>=0
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				if(IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemPrev)){
					lIsIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid&&(this.parentIGNWebElementHelper.checkIsIGNWebElementHelperAlone())
					lIsIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid&&(this.currentIGNWebElementLevelIndex==0)
				}else{
					if(this.parentIGNWebElementHelper.checkIsIGNWebElementHelperAlone()){
						lIsIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid&&(this.currentIGNWebElementLevelIndex==0)
					}else{
						lIsIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid&&(this.currentIGNWebElementLevelIndex>this.currentIGNWebElementLevelTypeItemPrev.getCurrentIGNWebElementLevelIndex())
					}
					lIsIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid&&(this.currentIGNWebElementLevelTypeItemPrev.getIsIGNWebElementLevelTypeItemValid())
				}
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				if(!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemPrev)){
					if(this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==IGNWebElementTargetProceedDOM.WebElementProceedFind){
						if(this.currentIGNWebElementLevelTypeItemPrev.getCurrentIGNWebElementTargetDOM().checkIsItemMultiple()){
							lIsIGNWebElementLevelTypeItemValid=false
						}
					}else if(this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==IGNWebElementTargetProceedDOM.WebElementProceedList){
						if(this.currentIGNWebElementLevelTypeItemPrev.getCurrentIGNWebElementTargetDOM().checkIsItemMultiple()){
							lIsIGNWebElementLevelTypeItemValid=false
						}
						if(!this.currentIGNWebElementTargetDOM.checkIsItemMultiple()){
							lIsIGNWebElementLevelTypeItemValid=false
						}
					}else{
						if(!this.currentIGNWebElementLevelTypeItemPrev.getCurrentIGNWebElementTargetDOM().checkIsItemMultiple()){
							lIsIGNWebElementLevelTypeItemValid=false
						}
						if(!this.currentIGNWebElementTargetDOM.checkIsItemMultiple()){
							lIsIGNWebElementLevelTypeItemValid=false
						}
					}
				}
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementFindByMethod)
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==this.currentIGNWebElementFindByMethod.toIGNWebElementTargetProceedDOM()
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=this.currentIGNWebElementTargetDOM.toIGNWebElementTargetItem()==this.currentIGNWebElementFindByMethod.toIGNWebElementTargetItem()
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=!IGNUemaHelper.checkObjectNullOfObject(this.strWebElementFindItemKey)
			}
			if(lIsIGNWebElementLevelTypeItemValid){
				lIsIGNWebElementLevelTypeItemValid=!IGNUemaHelper.checkObjectNullOfObject(this.strWebElementFindItemValue)
			}
			this.currentIGNWebElementLevelTypeItemNext=null
			this.targetWebElementList=null
			this.targetWebElementItem=null
			this.isIGNWebElementLevelTypeItemReady=false
			if(lIsIGNWebElementLevelTypeItemValid){
				if(!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemPrev)){
					if(this.currentIGNWebElementLevelIndex>0){
						lIsIGNWebElementLevelTypeItemValid=this.currentIGNWebElementLevelTypeItemPrev.attachIGNWebElementLevelTypeItemNext(this.parentIGNWebElementHelper,this)
					}
				}
			}
			this.isIGNWebElementLevelTypeItemValid=lIsIGNWebElementLevelTypeItemValid
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	private Boolean markIGNWebElementLevelTypeItemInvalidBySelf(IGNWebElementLevelTypeItem currentIGNWebElementLevelTypeItem){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(currentIGNWebElementLevelTypeItem)){
			return lreturn
		}
		if(!this==currentIGNWebElementLevelTypeItem){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementLevelTypeItemInvalidBySelfOK=true
			this.isIGNWebElementLevelTypeItemReady=false
			this.isIGNWebElementLevelTypeItemValid=false
			this.targetWebElementList=null
			this.targetWebElementItem=null
			lreturn=lIsMarkIGNWebElementLevelTypeItemInvalidBySelfOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean markIGNWebElementLevelTypeItemInvalidByParent(IGNWebElementHelper parentIGNWebElementHelper){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(parentIGNWebElementHelper)){
			return lreturn
		}
		if(!this.parentIGNWebElementHelper==parentIGNWebElementHelper){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementLevelTypeItemInvalidByParentOK=this.markIGNWebElementLevelTypeItemInvalidBySelf(this)
			lreturn=lIsMarkIGNWebElementLevelTypeItemInvalidByParentOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Boolean markIGNWebElementLevelTypeItemRequireToRefreshBySelf(IGNWebElementLevelTypeItem currentIGNWebElementLevelTypeItem){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(currentIGNWebElementLevelTypeItem)){
			return lreturn
		}
		if(!this==currentIGNWebElementLevelTypeItem){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementLevelTypeItemRequireToRefreshBySelfOK=true
			this.isIGNWebElementLevelTypeItemReady=false
			this.targetWebElementList=null
			this.targetWebElementItem=null
			lreturn=lIsMarkIGNWebElementLevelTypeItemRequireToRefreshBySelfOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean markIGNWebElementLevelTypeItemRequireToRefreshByParent(IGNWebElementHelper parentIGNWebElementHelper){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(parentIGNWebElementHelper)){
			return lreturn
		}
		if(!this.parentIGNWebElementHelper==parentIGNWebElementHelper){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOK=this.markIGNWebElementLevelTypeItemRequireToRefreshBySelf(this)
			lreturn=lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementLevelTypeItemAsRoot(){
		Boolean lreturn=true
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		try{
			lreturn=IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemPrev)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementLevelTypeItemAsFirst(){
		Boolean lreturn=true
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		try{
			if(this.checkIsIGNWebElementLevelTypeItemAsRoot()){
				lreturn=this.currentIGNWebElementLevelIndex==0
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementLevelTypeItemAsLast(){
		Boolean lreturn=true
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		try{
			lreturn=IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemNext)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementLevelTypeItemAsChild(){
		Boolean lreturn=true
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		try{
			if(!this.checkIsIGNWebElementLevelTypeItemAsRoot()){
				lreturn=!this.checkIsIGNWebElementLevelTypeItemAsLast()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementLevelTypeItemAlive(){
		Boolean lreturn=false
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		try{
			Boolean lIsIGNWebElementLevelTypeItemAlive=!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper)
			lIsIGNWebElementLevelTypeItemAlive=lIsIGNWebElementLevelTypeItemAlive&&this.parentIGNWebElementHelper.checkIsIGNWebElementHelperAlive()
			if(lIsIGNWebElementLevelTypeItemAlive){
				if(!this.checkIsIGNWebElementLevelTypeItemAsRoot()){
					lIsIGNWebElementLevelTypeItemAlive=this.currentIGNWebElementLevelTypeItemPrev.checkIsIGNWebElementLevelTypeItemAlive()
				}
			}
			if(!lIsIGNWebElementLevelTypeItemAlive){
				this.markIGNWebElementLevelTypeItemInvalidBySelf(this)
			}
			lreturn=lIsIGNWebElementLevelTypeItemAlive
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Boolean attachIGNWebElementLevelTypeItemNext(IGNWebElementHelper parentIGNWebElementHelper,IGNWebElementLevelTypeItem childIGNWebElementLevelTypeItem){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementLevelTypeItemAlive()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(parentIGNWebElementHelper)){
			return lreturn
		}
		if(!this.parentIGNWebElementHelper==parentIGNWebElementHelper){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(childIGNWebElementLevelTypeItem)){
			return lreturn
		}
		if(!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemNext)){
			return lreturn
		}
		try{
			if(!childIGNWebElementLevelTypeItem.getIsIGNWebElementLevelTypeItemValid()){
				this.currentIGNWebElementLevelTypeItemNext=childIGNWebElementLevelTypeItem
				lreturn=!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementLevelTypeItemNext)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsPreferWebDriver(){
		Boolean lreturn=true
		if(!this.checkIsIGNWebElementLevelTypeItemAlive()){
			return lreturn
		}
		try{
			lreturn=this.checkIsIGNWebElementLevelTypeItemAsRoot()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsReadyToExecute(){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementLevelTypeItemAlive()){
			return lreturn
		}
		try{
			Boolean lIsReadyToExecute=false
			if(this.parentIGNWebElementHelper.checkIsIGNWebElementHelperReadyToExecute()){
				if(!this.parentIGNWebElementHelper.getIsIGNWebElementHelperReady()){
					if(this.checkIsIGNWebElementLevelTypeItemAsRoot()){
						lIsReadyToExecute=true
					}else{
						lIsReadyToExecute=this.currentIGNWebElementLevelTypeItemPrev.getIsIGNWebElementLevelTypeItemReady()
					}
				}
			}
			lreturn=lIsReadyToExecute
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public WebDriver getWebDriver(){
		WebDriver lreturn=null
		if(!this.checkIsReadyToExecute()){
			return lreturn
		}
		try{
			lreturn=this.parentIGNWebElementHelper.getCurrentWebDriver()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean executeIGNWebElementLevelTypeItem(){
		Boolean lreturn=false
		if(!this.checkIsReadyToExecute()){
			return lreturn
		}
		if(!this.markIGNWebElementLevelTypeItemRequireToRefreshBySelf(this)){
			return lreturn
		}
		try{
			Boolean lIsExecuteIGNWebElementLevelTypeItemOK=false
			lIsExecuteIGNWebElementLevelTypeItemOK=this.proceedGetWebElement()
			this.isIGNWebElementLevelTypeItemReady=lIsExecuteIGNWebElementLevelTypeItemOK
			if(!this.isIGNWebElementLevelTypeItemReady){
				this.markIGNWebElementLevelTypeItemRequireToRefreshBySelf(this)
			}
			lreturn=this.isIGNWebElementLevelTypeItemReady
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Boolean proceedGetWebElement(){
		Boolean lreturn=false
		if(!this.isIGNWebElementLevelTypeItemValid){
			return lreturn
		}
		if(!this.checkIsReadyToExecute()){
			return lreturn
		}
		try{
			WebDriver lWebDriver=this.getWebDriver()
			if(IGNUemaHelper.checkObjectNullOfObject(lWebDriver)){
				return lreturn
			}
			Boolean lIsRootAsWebDriver=false
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemParent=this.currentIGNWebElementLevelTypeItemPrev
			Boolean lIsValidIGNWebElementLevelTypeItemParent=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemParent)
			if(lIsValidIGNWebElementLevelTypeItemParent){
				lIsValidIGNWebElementLevelTypeItemParent=lIGNWebElementLevelTypeItemParent.getIsIGNWebElementLevelTypeItemReady()
			}
			if(this.checkIsIGNWebElementLevelTypeItemAsRoot()){
				if(this.parentIGNWebElementHelper.checkIsIGNWebElementHelperAlone()){
					if(!lIsValidIGNWebElementLevelTypeItemParent){
						return lreturn
					}
				}
			}else{
				if(!lIsValidIGNWebElementLevelTypeItemParent){
					return lreturn
				}
			}
			lIsRootAsWebDriver=!lIsValidIGNWebElementLevelTypeItemParent
			List<WebElement> lWebElementListParent=null
			WebElement lWebElementItemParent=null
			if(lIsValidIGNWebElementLevelTypeItemParent){
				lWebElementListParent=lIGNWebElementLevelTypeItemParent.getTargetWebElementList()
				lWebElementItemParent=lIGNWebElementLevelTypeItemParent.getTargetWebElementItem()
				if(lIGNWebElementLevelTypeItemParent.getCurrentIGNWebElementTargetDOM().checkIsItemMultiple()){
					if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lWebElementListParent)){
						return lreturn
					}
				}else{
					if(IGNUemaHelper.checkObjectNullOfObject(lWebElementItemParent)){
						return lreturn
					}
				}
			}
			Boolean lIsCaseProceed=false
			List<WebElement> lWebElementListAll=null
			List<WebElement> lWebElementListFiltered=null
			WebElement lWebElementItemFiltered=null
			Boolean lIsFoundWebElementListAll=false
			Boolean lIsFoundWebElementListFiltered=false
			Boolean lIsFoundWebElementItemFiltered=false
			Boolean lIsFoundTargetWebElementList=false
			Boolean lIsFoundTargetWebElementItem=false
			Map lMapProceedGetWebElement=null
			switch(this.currentIGNWebElementTargetDOM){
				case IGNWebElementTargetDOM.WebElementDOMFindAsMultipleByNormal:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByFind(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMFindAsMultipleByShadow:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByFind(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMFindAsSingleByNormal:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByFind(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMFindAsSingleByShadow:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByFind(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMListChildrenAsMultipleByNormal:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByList(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMListChildrenAsMultipleByShadow:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByList(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMListWildcardAsMultipleByNormal:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByList(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMListWildcardAsMultipleByShadow:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByList(lIsRootAsWebDriver,lWebDriver,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMMatchContainAllAsMultiple:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByMatch(lIsRootAsWebDriver,lWebDriver,lWebElementListParent,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMMatchEqualAllAsMultiple:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByMatch(lIsRootAsWebDriver,lWebDriver,lWebElementListParent,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMMatchPrefixAllAsMultiple:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByMatch(lIsRootAsWebDriver,lWebDriver,lWebElementListParent,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				case IGNWebElementTargetDOM.WebElementDOMMatchSuffixAllAsMultiple:
					lIsCaseProceed=true
					lMapProceedGetWebElement=this.mapProceedGetWebElementByMatch(lIsRootAsWebDriver,lWebDriver,lWebElementListParent,lWebElementItemParent,this.currentIGNWebElementTargetDOM.checkIsItemMultiple())
					break
				default:
					break
			}
			if(lIsCaseProceed){
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Map mapProceedGetWebElementByFind(Boolean initIsRootAsWebDriver,WebDriver initWebDriver,WebElement initWebElementItemParent,Boolean initIsTargetItemMultiple){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			List<WebElement> lWebElementListAll=null
			List<WebElement> lWebElementListFiltered=null
			WebElement lWebElementItemFiltered=null
			Boolean lIsFoundWebElementListAll=false
			Boolean lIsFoundWebElementListFiltered=false
			Boolean lIsFoundWebElementItemFiltered=false
			Boolean lIsFoundTargetWebElementList=false
			Boolean lIsFoundTargetWebElementItem=false
			lreturn.put('Result',lResult)
			lreturn.put('WebElementListAll',lWebElementListAll)
			lreturn.put('WebElementListFiltered',lWebElementListFiltered)
			lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
			lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
			lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
			lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
			lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
			lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			if(IGNUemaHelper.checkObjectNullOfObject(initWebDriver)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(initWebElementItemParent)){
				return lreturn
			}
			if(!this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==IGNWebElementTargetProceedDOM.WebElementProceedFind){
				return lreturn
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WebElementListAll',lWebElementListAll)
				lreturn.put('WebElementListFiltered',lWebElementListFiltered)
				lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
				lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
				lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
				lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
				lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
				lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Map mapProceedGetWebElementByList(Boolean initIsRootAsWebDriver,WebDriver initWebDriver,WebElement initWebElementItemParent,Boolean initIsTargetItemMultiple){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			List<WebElement> lWebElementListAll=null
			List<WebElement> lWebElementListFiltered=null
			WebElement lWebElementItemFiltered=null
			Boolean lIsFoundWebElementListAll=false
			Boolean lIsFoundWebElementListFiltered=false
			Boolean lIsFoundWebElementItemFiltered=false
			Boolean lIsFoundTargetWebElementList=false
			Boolean lIsFoundTargetWebElementItem=false
			lreturn.put('Result',lResult)
			lreturn.put('WebElementListAll',lWebElementListAll)
			lreturn.put('WebElementListFiltered',lWebElementListFiltered)
			lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
			lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
			lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
			lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
			lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
			lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			if(IGNUemaHelper.checkObjectNullOfObject(initWebDriver)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(initWebElementItemParent)){
				return lreturn
			}
			if(!this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==IGNWebElementTargetProceedDOM.WebElementProceedList){
				return lreturn
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WebElementListAll',lWebElementListAll)
				lreturn.put('WebElementListFiltered',lWebElementListFiltered)
				lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
				lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
				lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
				lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
				lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
				lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Map mapProceedGetWebElementByMatch(Boolean initIsRootAsWebDriver,WebDriver initWebDriver,List<WebElement> initWebElementListParent,WebElement initWebElementItemParent,Boolean initIsTargetItemMultiple){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			List<WebElement> lWebElementListAll=null
			List<WebElement> lWebElementListFiltered=null
			WebElement lWebElementItemFiltered=null
			Boolean lIsFoundWebElementListAll=false
			Boolean lIsFoundWebElementListFiltered=false
			Boolean lIsFoundWebElementItemFiltered=false
			Boolean lIsFoundTargetWebElementList=false
			Boolean lIsFoundTargetWebElementItem=false
			lreturn.put('Result',lResult)
			lreturn.put('WebElementListAll',lWebElementListAll)
			lreturn.put('WebElementListFiltered',lWebElementListFiltered)
			lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
			lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
			lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
			lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
			lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
			lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			if(IGNUemaHelper.checkObjectNullOfObject(initWebDriver)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(initWebElementListParent)){
				return lreturn
			}
			if(!initIsRootAsWebDriver){
				if(IGNUemaHelper.checkObjectNullOfObject(initWebElementItemParent)){
					return lreturn
				}
			}
			if(!this.currentIGNWebElementTargetDOM.toIGNWebElementTargetProceedDOM()==IGNWebElementTargetProceedDOM.WebElementProceedMatch){
				return lreturn
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('WebElementListAll',lWebElementListAll)
				lreturn.put('WebElementListFiltered',lWebElementListFiltered)
				lreturn.put('WebElementItemFiltered',lWebElementItemFiltered)
				lreturn.put('IsFoundWebElementListAll',lIsFoundWebElementListAll)
				lreturn.put('IsFoundWebElementListFiltered',lIsFoundWebElementListFiltered)
				lreturn.put('IsFoundWebElementItemFiltered',lIsFoundWebElementItemFiltered)
				lreturn.put('IsFoundTargetWebElementList',lIsFoundTargetWebElementList)
				lreturn.put('IsFoundTargetWebElementItem',lIsFoundTargetWebElementItem)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
}