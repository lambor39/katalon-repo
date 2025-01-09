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
public class IGNWebElementHelper{
	private WebDriver currentWebDriver=null
	private IGNWebElementTargetItem currentIGNWebElementTargetItem=null
	private IGNWebElementHelper parentIGNWebElementHelper=null
	private Integer parentIGNWebElementLevelIndex=0
	private Boolean isIGNWebElementHelperValid=false
	private Boolean isIGNWebElementHelperChild=false
	private TreeMap<Integer,IGNWebElementLevelTypeItem> mapIGNWebElementLevelTypeItem=null
	private TreeMap<Integer,IGNWebElementHelper> mapIGNWebElementHelperRefChildren=null
	private Boolean isIGNWebElementHelperReady=false
	public IGNWebElementHelper(WebDriver initCurrentWebDriver,IGNWebElementTargetItem initCurrentIGNWebElementTargetItem,IGNWebElementHelper initParentIGNWebElementHelper,Integer initParentIGNWebElementLevelIndex){
		super()
		try{
			this.currentWebDriver=initCurrentWebDriver
			this.currentIGNWebElementTargetItem=initCurrentIGNWebElementTargetItem
			this.parentIGNWebElementHelper=initParentIGNWebElementHelper
			this.parentIGNWebElementLevelIndex=initParentIGNWebElementLevelIndex
			if(!IGNUemaHelper.checkObjectNullOfObject(this.currentWebDriver)){
				this.initIGNWebElementHelper()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static IGNWebElementHelper getIGNWebElementHelperInstance(WebDriver initCurrentWebDriver,IGNWebElementTargetItem initCurrentIGNWebElementTargetItem,IGNWebElementHelper initParentIGNWebElementHelper,Integer initParentIGNWebElementLevelIndex){
		IGNWebElementHelper lreturn=null
		try{
			IGNWebElementHelper lIGNWebElementHelper=new IGNWebElementHelper(initCurrentWebDriver,initCurrentIGNWebElementTargetItem,initParentIGNWebElementHelper,initParentIGNWebElementLevelIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelper)){
				if(lIGNWebElementHelper.getIsIGNWebElementHelperValid()){
					lreturn=lIGNWebElementHelper
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public WebDriver getCurrentWebDriver(){
		return this.currentWebDriver
	}
	public void setCurrentWebDriver(WebDriver newCurrentWebDriver){
		//Do Nothing
		//this.currentWebDriver=newCurrentWebDriver
	}
	public IGNWebElementTargetItem getCurrentIGNWebElementTargetItem(){
		return this.currentIGNWebElementTargetItem
	}
	public void setCurrentIGNWebElementTargetItem(IGNWebElementTargetItem newCurrentIGNWebElementTargetItem){
		//Do Nothing
		//this.currentIGNWebElementTargetItem=newCurrentIGNWebElementTargetItem
	}
	public IGNWebElementHelper getParentIGNWebElementHelper(){
		return this.parentIGNWebElementHelper
	}
	public void setParentIGNWebElementHelper(IGNWebElementHelper newParentIGNWebElementHelper){
		//Do Nothing
		//this.parentIGNWebElementHelper=newParentIGNWebElementHelper
	}
	public Integer getParentIGNWebElementLevelIndex(){
		return this.parentIGNWebElementLevelIndex
	}
	public void setParentIGNWebElementLevelIndex(Integer newParentIGNWebElementLevelIndex){
		//Do Nothing
		//this.parentIGNWebElementLevelIndex=newParentIGNWebElementLevelIndex
	}
	public Boolean getIsIGNWebElementHelperValid(){
		return this.isIGNWebElementHelperValid
	}
	public void setIsIGNWebElementHelperValid(Boolean newIsIGNWebElementHelperValid){
		//Do Nothing
		//this.isIGNWebElementHelperValid=newIsIGNWebElementHelperValid
	}
	public Boolean getIsIGNWebElementHelperChild(){
		return this.isIGNWebElementHelperChild
	}
	public void setIsIGNWebElementHelperChild(Boolean newIsIGNWebElementHelperChild){
		//Do Nothing
		//this.isIGNWebElementHelperChild=newIsIGNWebElementHelperChild
	}
	public TreeMap<Integer,IGNWebElementLevelTypeItem> getMapIGNWebElementLevelTypeItem(){
		return this.mapIGNWebElementLevelTypeItem
	}
	public void setMapIGNWebElementLevelTypeItem(TreeMap<Integer,IGNWebElementLevelTypeItem> newMapIGNWebElementLevelTypeItem){
		//Do Nothing
		//this.mapIGNWebElementLevelTypeItem=newMapIGNWebElementLevelTypeItem
	}
	public TreeMap<Integer,IGNWebElementHelper> getMapIGNWebElementHelperRefChildren(){
		return this.mapIGNWebElementHelperRefChildren
	}
	public void setMapIGNWebElementHelperRefChildren(TreeMap<Integer,IGNWebElementHelper> newMapIGNWebElementHelperRefChildren){
		//Do Nothing
		//this.mapIGNWebElementHelperRefChildren=newMapIGNWebElementHelperRefChildren
	}
	public Boolean getIsIGNWebElementHelperReady(){
		return this.isIGNWebElementHelperReady
	}
	public void setIsIGNWebElementHelperReady(Boolean newIsIGNWebElementHelperReady){
		//Do Nothing
		//this.isIGNWebElementHelperReady=newIsIGNWebElementHelperReady
	}
	private void initIGNWebElementHelper(){
		try{
			this.isIGNWebElementHelperValid=false
			Boolean lIsIGNWebElementHelperValid=true
			if(lIsIGNWebElementHelperValid){
				lIsIGNWebElementHelperValid=!IGNUemaHelper.checkObjectNullOfObject(this.currentIGNWebElementTargetItem)
			}
			if(lIsIGNWebElementHelperValid){
				this.isIGNWebElementHelperChild=IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper)
				if(!this.isIGNWebElementHelperChild){
					this.parentIGNWebElementLevelIndex=0
				}else{
					lIsIGNWebElementHelperValid=this.parentIGNWebElementHelper.checkIsIGNWebElementHelperAlive()
					if(lIsIGNWebElementHelperValid){
						lIsIGNWebElementHelperValid=this.parentIGNWebElementLevelIndex>=0
					}
					IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemParent=null
					if(lIsIGNWebElementHelperValid){
						lIGNWebElementLevelTypeItemParent=this.parentIGNWebElementHelper.getIGNWebElementLevelTypeItemByLevelIndex(this.parentIGNWebElementLevelIndex)
						lIsIGNWebElementHelperValid=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemParent)
					}
					if(lIsIGNWebElementHelperValid){
						lIsIGNWebElementHelperValid=lIGNWebElementLevelTypeItemParent.getIsIGNWebElementLevelTypeItemValid()
					}
					if(lIsIGNWebElementHelperValid){
						lIsIGNWebElementHelperValid=this.parentIGNWebElementHelper.addMapIGNWebElementHelperRefChildrenItem(this)
					}
				}
			}
			if(lIsIGNWebElementHelperValid){
				this.mapIGNWebElementLevelTypeItem=new TreeMap<Integer,IGNWebElementLevelTypeItem>()
				this.mapIGNWebElementHelperRefChildren=new TreeMap<Integer,IGNWebElementHelper>()
			}
			this.isIGNWebElementHelperReady=false
			this.isIGNWebElementHelperValid=lIsIGNWebElementHelperValid
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	private Boolean cleanMapIGNWebElementHelperRefChildrenBySelf(IGNWebElementHelper currentIGNWebElementHelper){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(currentIGNWebElementHelper)){
			return lreturn
		}
		if(!this==currentIGNWebElementHelper){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNWebElementHelperRefChildren)){
			return lreturn
		}
		if(this.mapIGNWebElementHelperRefChildren.size()<=0){
			lreturn=true
			return lreturn
		}
		try{
			Boolean lIsCleanMapIGNWebElementHelperRefChildrenBySelfOK=true
			List<Integer> lListNumIGNWebElementHelperRefChildrenItemInvalid=new ArrayList<Integer>()
			Boolean lIsFoundInvalid=false
			for(Map.Entry lEntryMapIGNWebElementHelperRefChildren in this.mapIGNWebElementHelperRefChildren){
				Integer lNumMapIGNWebElementHelperRefChildrenKey=lEntryMapIGNWebElementHelperRefChildren.key
				IGNWebElementHelper lIGNWebElementHelperRefChildrenItem=lEntryMapIGNWebElementHelperRefChildren.value
				if(IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelperRefChildrenItem)){
					lListNumIGNWebElementHelperRefChildrenItemInvalid.add(lNumMapIGNWebElementHelperRefChildrenKey)
				}
			}
			lIsFoundInvalid=lListNumIGNWebElementHelperRefChildrenItemInvalid.size()>0
			if(lIsFoundInvalid){
				for(Integer lNumIGNWebElementHelperRefChildrenItemInvalid in lListNumIGNWebElementHelperRefChildrenItemInvalid){
					this.mapIGNWebElementHelperRefChildren.remove(lNumIGNWebElementHelperRefChildrenItemInvalid)
				}
				if(this.mapIGNWebElementHelperRefChildren.size()>0){
					this.mapIGNWebElementHelperRefChildren.sort(null)
				}
			}
			lreturn=lIsCleanMapIGNWebElementHelperRefChildrenBySelfOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Boolean markIGNWebElementHelperInvalidBySelf(IGNWebElementHelper currentIGNWebElementHelper){
		Boolean lreturn=false
		if(!this.cleanMapIGNWebElementHelperRefChildrenBySelf(this)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(currentIGNWebElementHelper)){
			return lreturn
		}
		if(!this==currentIGNWebElementHelper){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNWebElementLevelTypeItem)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNWebElementHelperRefChildren)){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementHelperInvalidBySelfOK=false
			Boolean lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKAll=true
			Boolean lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKAll=true
			this.isIGNWebElementHelperReady=false
			this.isIGNWebElementHelperValid=false
			if(this.mapIGNWebElementLevelTypeItem.size()>0){
				for(Map.Entry lEntryMapIGNWebElementLevelTypeItem in this.mapIGNWebElementLevelTypeItem){
					Boolean lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKCurrent=false
					Integer lNumMapIGNWebElementLevelTypeItemKey=lEntryMapIGNWebElementLevelTypeItem.key
					IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=lEntryMapIGNWebElementLevelTypeItem.value
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)){
						lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKCurrent=lIGNWebElementLevelTypeItem.markIGNWebElementLevelTypeItemInvalidByParent(this)
					}
					lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKAll=lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKAll&&lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKCurrent
				}
			}
			if(this.mapIGNWebElementHelperRefChildren.size()>0){
				for(Map.Entry lEntryMapIGNWebElementHelperRefChildren in this.mapIGNWebElementHelperRefChildren){
					Boolean lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKCurrent=false
					Integer lNumMapIGNWebElementHelperRefChildrenKey=lEntryMapIGNWebElementHelperRefChildren.key
					IGNWebElementHelper lIGNWebElementHelperRefChildrenItem=lEntryMapIGNWebElementHelperRefChildren.value
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelperRefChildrenItem)){
						lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKCurrent=lIGNWebElementHelperRefChildrenItem.markIGNWebElementHelperInvalidByParent(this)
					}
					lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKAll=lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKAll&&lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKCurrent
				}
			}
			lIsMarkIGNWebElementHelperInvalidBySelfOK=lIsMarkIGNWebElementLevelTypeItemInvalidByParentOKAll&&lIsMarkIGNWebElementHelperRefChildrenInvalidByParentOKAll
			lreturn=lIsMarkIGNWebElementHelperInvalidBySelfOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	protected Boolean markIGNWebElementHelperInvalidByParent(IGNWebElementHelper parentIGNWebElementHelper){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(parentIGNWebElementHelper)){
			return lreturn
		}
		if(!this.parentIGNWebElementHelper==parentIGNWebElementHelper){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementHelperInvalidByParentOK=this.markIGNWebElementHelperInvalidBySelf(this)
			lreturn=lIsMarkIGNWebElementHelperInvalidByParentOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsMapIGNWebElementLevelTypeItemEmpty(){
		Boolean lreturn=false
		if(!this.isIGNWebElementHelperValid){
			return lreturn
		}
		try{
			lreturn=IGNUemaHelper.checkObjectEmptyOfMap(this.mapIGNWebElementLevelTypeItem)
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Integer getNumMapIGNWebElementLevelTypeItemIndexLast(){
		Integer lreturn=0
		if(!this.isIGNWebElementHelperValid){
			return lreturn
		}
		if(this.checkIsMapIGNWebElementLevelTypeItemEmpty()){
			return lreturn
		}
		try{
			lreturn=this.mapIGNWebElementLevelTypeItem.lastKey()
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public IGNWebElementLevelTypeItem getIGNWebElementLevelTypeItemByLevelIndex(Integer numIGNWebElementLevelIndex){
		IGNWebElementLevelTypeItem lreturn=null
		if(!this.isIGNWebElementHelperValid){
			return lreturn
		}
		if(this.checkIsMapIGNWebElementLevelTypeItemEmpty()){
			return lreturn
		}
		if(numIGNWebElementLevelIndex<0){
			return lreturn
		}
		if(numIGNWebElementLevelIndex>this.getNumMapIGNWebElementLevelTypeItemIndexLast()){
			return lreturn
		}
		try{
			if(this.mapIGNWebElementLevelTypeItem.containsKey(numIGNWebElementLevelIndex)){
				lreturn=this.mapIGNWebElementLevelTypeItem.get(numIGNWebElementLevelIndex)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementHelperAlive(){
		Boolean lreturn=false
		if(!this.isIGNWebElementHelperValid){
			return lreturn
		}
		if(!this.cleanMapIGNWebElementHelperRefChildrenBySelf(this)){
			return lreturn
		}
		try{
			Boolean lIsIGNWebElementHelperAlive=!IGNUemaHelper.checkObjectNullOfObject(this.currentWebDriver)
			if(lIsIGNWebElementHelperAlive){
				if(!this.isIGNWebElementHelperChild){
					lIsIGNWebElementHelperAlive=lIsIGNWebElementHelperAlive&&(IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper))
					lIsIGNWebElementHelperAlive=lIsIGNWebElementHelperAlive&&(this.parentIGNWebElementLevelIndex==0)
				}else{
					IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemParent=null
					lIsIGNWebElementHelperAlive=lIsIGNWebElementHelperAlive&&(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper))
					lIsIGNWebElementHelperAlive=lIsIGNWebElementHelperAlive&&(this.parentIGNWebElementLevelIndex>=0)
					if(lIsIGNWebElementHelperAlive){
						lIsIGNWebElementHelperAlive=this.parentIGNWebElementHelper.getIsIGNWebElementHelperValid()
					}
					if(lIsIGNWebElementHelperAlive){
						lIGNWebElementLevelTypeItemParent=this.parentIGNWebElementHelper.getIGNWebElementLevelTypeItemByLevelIndex(this.parentIGNWebElementLevelIndex)
						lIsIGNWebElementHelperAlive=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemParent)
					}
					if(lIsIGNWebElementHelperAlive){
						lIsIGNWebElementHelperAlive=lIGNWebElementLevelTypeItemParent.getIsIGNWebElementLevelTypeItemValid()
					}
				}
			}
			if(!lIsIGNWebElementHelperAlive){
				this.markIGNWebElementHelperInvalidBySelf(this)
			}
			lreturn=lIsIGNWebElementHelperAlive
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementHelperConfigValid(){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperAlive()){
			return lreturn
		}
		if(this.checkIsMapIGNWebElementLevelTypeItemEmpty()){
			return lreturn
		}
		try{
			Boolean lIsIGNWebElementHelperConfigValid=false
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemLast=this.getIGNWebElementLevelTypeItemByLevelIndex(this.getNumMapIGNWebElementLevelTypeItemIndexLast())
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemLast)){
				lIsIGNWebElementHelperConfigValid=this.currentIGNWebElementTargetItem==lIGNWebElementLevelTypeItemLast.getCurrentIGNWebElementTargetDOM().toIGNWebElementTargetItem()
			}
			lreturn=lIsIGNWebElementHelperConfigValid
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	protected Boolean addMapIGNWebElementHelperRefChildrenItem(IGNWebElementHelper childIGNWebElementHelper){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperAlive()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(childIGNWebElementHelper)){
			return lreturn
		}
		if(this==childIGNWebElementHelper){
			return lreturn
		}
		if(!this==childIGNWebElementHelper.getParentIGNWebElementHelper()){
			return lreturn
		}
		if(childIGNWebElementHelper.getIsIGNWebElementHelperValid()){
			return lreturn
		}
		try{
			Boolean lIsAddMapIGNWebElementHelperRefChildrenItemOK=false
			Boolean lIsFoundDuplicated=false
			if(this.mapIGNWebElementHelperRefChildren.size()>0){
				for(Map.Entry lEntryMapIGNWebElementHelperRefChildren in this.mapIGNWebElementHelperRefChildren){
					Integer lNumMapIGNWebElementHelperRefChildrenKey=lEntryMapIGNWebElementHelperRefChildren.key
					IGNWebElementHelper lIGNWebElementHelperRefChildrenItem=lEntryMapIGNWebElementHelperRefChildren.value
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelperRefChildrenItem)){
						if(lIGNWebElementHelperRefChildrenItem==childIGNWebElementHelper){
							lIsFoundDuplicated=true
							break
						}
					}
				}
			}
			if(!lIsFoundDuplicated){
				Integer lNumIGNWebElementHelperRefChildrenSizePrev=this.mapIGNWebElementHelperRefChildren.size()
				Integer lNumIGNWebElementHelperRefChildrenIndexLast=0
				if(lNumIGNWebElementHelperRefChildrenSizePrev>0){
					lNumIGNWebElementHelperRefChildrenIndexLast=this.mapIGNWebElementHelperRefChildren.lastKey()
					lNumIGNWebElementHelperRefChildrenIndexLast=lNumIGNWebElementHelperRefChildrenIndexLast+1
				}
				this.mapIGNWebElementHelperRefChildren.put(lNumIGNWebElementHelperRefChildrenIndexLast,childIGNWebElementHelper)
				Integer lNumIGNWebElementHelperRefChildrenSizeCurrent=this.mapIGNWebElementHelperRefChildren.size()
				lIsAddMapIGNWebElementHelperRefChildrenItemOK=lNumIGNWebElementHelperRefChildrenSizeCurrent>lNumIGNWebElementHelperRefChildrenSizePrev
				if(lIsAddMapIGNWebElementHelperRefChildrenItemOK){
					this.mapIGNWebElementHelperRefChildren.sort(null)
				}
			}
			lreturn=lIsAddMapIGNWebElementHelperRefChildrenItemOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementHelperAlone(){
		Boolean lreturn=true
		if(!this.checkIsIGNWebElementHelperAlive()){
			return lreturn
		}
		try{
			lreturn=!this.isIGNWebElementHelperChild
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean addIGNWebElementLevelTypeItem(IGNWebElementTargetDOM initCurrentIGNWebElementTargetDOM,IGNWebElementFindByMethod initCurrentIGNWebElementFindByMethod,String initStrWebElementFindItemKey,String initStrWebElementFindItemValue){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperAlive()){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(initCurrentIGNWebElementTargetDOM)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(initCurrentIGNWebElementFindByMethod)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(initStrWebElementFindItemKey)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(initStrWebElementFindItemValue)){
			return lreturn
		}
		try{
			Boolean lIsAddIGNWebElementLevelTypeItemOK=false
			Integer lNumIGNWebElementLevelIndexPrev=0
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemPrev=null
			Integer lNumIGNWebElementLevelIndexCurrent=0
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemCurrent=null
			if(this.checkIsMapIGNWebElementLevelTypeItemEmpty()){
				lNumIGNWebElementLevelIndexCurrent=lNumIGNWebElementLevelIndexPrev
				if(this.checkIsIGNWebElementHelperAlone()){
					lIsAddIGNWebElementLevelTypeItemOK=IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemPrev)
				}else{
					lIGNWebElementLevelTypeItemPrev=this.parentIGNWebElementHelper.getIGNWebElementLevelTypeItemByLevelIndex(this.parentIGNWebElementLevelIndex)
					lIsAddIGNWebElementLevelTypeItemOK=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemPrev)
				}
			}else{
				lNumIGNWebElementLevelIndexPrev=this.getNumMapIGNWebElementLevelTypeItemIndexLast()
				lNumIGNWebElementLevelIndexCurrent=lNumIGNWebElementLevelIndexPrev+1
				lIGNWebElementLevelTypeItemPrev=this.getIGNWebElementLevelTypeItemByLevelIndex(lNumIGNWebElementLevelIndexPrev)
				lIsAddIGNWebElementLevelTypeItemOK=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemPrev)
			}
			if(lIsAddIGNWebElementLevelTypeItemOK){
				lIGNWebElementLevelTypeItemCurrent=IGNWebElementLevelTypeItem.getIGNWebElementLevelTypeItemInstance(this,initCurrentIGNWebElementTargetDOM,lIGNWebElementLevelTypeItemPrev,lNumIGNWebElementLevelIndexCurrent,initCurrentIGNWebElementFindByMethod,initStrWebElementFindItemKey,initStrWebElementFindItemValue)
				lIsAddIGNWebElementLevelTypeItemOK=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemCurrent)
			}
			if(lIsAddIGNWebElementLevelTypeItemOK){
				lIsAddIGNWebElementLevelTypeItemOK=lIGNWebElementLevelTypeItemCurrent.getIsIGNWebElementLevelTypeItemValid()
			}
			if(lIsAddIGNWebElementLevelTypeItemOK){
				Integer lNumIGNWebElementLevelSizePrev=this.mapIGNWebElementLevelTypeItem.size()
				this.mapIGNWebElementLevelTypeItem.put(lNumIGNWebElementLevelIndexCurrent,lIGNWebElementLevelTypeItemCurrent)
				Integer lNumIGNWebElementLevelSizeCurrent=this.mapIGNWebElementLevelTypeItem.size()
				lIsAddIGNWebElementLevelTypeItemOK=lNumIGNWebElementLevelSizeCurrent>lNumIGNWebElementLevelSizePrev
				if(lIsAddIGNWebElementLevelTypeItemOK){
					this.mapIGNWebElementLevelTypeItem.sort(null)
				}
			}
			lreturn=lIsAddIGNWebElementLevelTypeItemOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	private Boolean markIGNWebElementHelperRequireToRefreshBySelf(IGNWebElementHelper currentIGNWebElementHelper){
		Boolean lreturn=false
		if(!this.cleanMapIGNWebElementHelperRefChildrenBySelf(this)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(currentIGNWebElementHelper)){
			return lreturn
		}
		if(!this==currentIGNWebElementHelper){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNWebElementLevelTypeItem)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(this.mapIGNWebElementHelperRefChildren)){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementHelperRequireToRefreshBySelfOK=false
			Boolean lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKAll=true
			Boolean lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKAll=true
			this.isIGNWebElementHelperReady=false
			if(this.mapIGNWebElementLevelTypeItem.size()>0){
				for(Map.Entry lEntryMapIGNWebElementLevelTypeItem in this.mapIGNWebElementLevelTypeItem){
					Boolean lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKCurrent=false
					Integer lNumMapIGNWebElementLevelTypeItemKey=lEntryMapIGNWebElementLevelTypeItem.key
					IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=lEntryMapIGNWebElementLevelTypeItem.value
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)){
						lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKCurrent=lIGNWebElementLevelTypeItem.markIGNWebElementLevelTypeItemRequireToRefreshByParent(this)
					}
					lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKAll=lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKAll&&lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKCurrent
				}
			}
			if(this.mapIGNWebElementHelperRefChildren.size()>0){
				for(Map.Entry lEntryMapIGNWebElementHelperRefChildren in this.mapIGNWebElementHelperRefChildren){
					Boolean lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKCurrent=false
					Integer lNumMapIGNWebElementHelperRefChildrenKey=lEntryMapIGNWebElementHelperRefChildren.key
					IGNWebElementHelper lIGNWebElementHelperRefChildrenItem=lEntryMapIGNWebElementHelperRefChildren.value
					if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelperRefChildrenItem)){
						lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKCurrent=lIGNWebElementHelperRefChildrenItem.markIGNWebElementHelperRequireToRefreshByParent(this)
					}
					lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKAll=lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKAll&&lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKCurrent
				}
			}
			lIsMarkIGNWebElementHelperRequireToRefreshBySelfOK=lIsMarkIGNWebElementLevelTypeItemRequireToRefreshByParentOKAll&&lIsMarkIGNWebElementHelperRefChildrenRequireToRefreshByParentOKAll
			lreturn=lIsMarkIGNWebElementHelperRequireToRefreshBySelfOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	protected Boolean markIGNWebElementHelperRequireToRefreshByParent(IGNWebElementHelper parentIGNWebElementHelper){
		Boolean lreturn=false
		if(IGNUemaHelper.checkObjectNullOfObject(this.parentIGNWebElementHelper)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(parentIGNWebElementHelper)){
			return lreturn
		}
		if(!this.parentIGNWebElementHelper==parentIGNWebElementHelper){
			return lreturn
		}
		try{
			Boolean lIsMarkIGNWebElementHelperRequireToRefreshByParentOK=this.markIGNWebElementHelperRequireToRefreshBySelf(this)
			lreturn=lIsMarkIGNWebElementHelperRequireToRefreshByParentOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean checkIsIGNWebElementHelperReadyToExecute(){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		try{
			Boolean lIsIGNWebElementHelperReadyToExecute=false
			if(this.checkIsIGNWebElementHelperAlone()){
				lIsIGNWebElementHelperReadyToExecute=!IGNUemaHelper.checkObjectNullOfObject(this.currentWebDriver)
			}else{
				IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItemParent=this.parentIGNWebElementHelper.getIGNWebElementLevelTypeItemByLevelIndex(this.parentIGNWebElementLevelIndex)
				if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemParent)){
					if(lIGNWebElementLevelTypeItemParent.getIsIGNWebElementLevelTypeItemReady()){
						if(lIGNWebElementLevelTypeItemParent.getCurrentIGNWebElementTargetDOM().checkIsItemMultiple()){
							lIsIGNWebElementHelperReadyToExecute=!IGNUemaHelper.checkObjectNullOrEmptyOfList(lIGNWebElementLevelTypeItemParent.getTargetWebElementList())
						}else{
							lIsIGNWebElementHelperReadyToExecute=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItemParent.getTargetWebElementItem())
						}
					}
				}
			}
			lreturn=lIsIGNWebElementHelperReadyToExecute
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	protected Boolean executeIGNWebElementHelperFromRoot(Boolean isForceExecute){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		try{
			Boolean lIsExecuteIGNWebElementHelperFromRootOK=false
			if(this.checkIsIGNWebElementHelperAlone()){
				if(isForceExecute){
					lIsExecuteIGNWebElementHelperFromRootOK=this.executeIGNWebElementHelperFromHere(isForceExecute)
				}else{
					lIsExecuteIGNWebElementHelperFromRootOK=this.isIGNWebElementHelperReady
					if(!lIsExecuteIGNWebElementHelperFromRootOK){
						lIsExecuteIGNWebElementHelperFromRootOK=this.executeIGNWebElementHelperFromHere(isForceExecute)
					}
				}
			}else{
				if(isForceExecute){
					lIsExecuteIGNWebElementHelperFromRootOK=this.parentIGNWebElementHelper.executeIGNWebElementHelperFromRoot(isForceExecute)
				}else{
					lIsExecuteIGNWebElementHelperFromRootOK=this.parentIGNWebElementHelper.getIsIGNWebElementHelperReady()
					if(!lIsExecuteIGNWebElementHelperFromRootOK){
						lIsExecuteIGNWebElementHelperFromRootOK=this.parentIGNWebElementHelper.executeIGNWebElementHelperFromRoot(isForceExecute)
					}
				}
			}
			lreturn=lIsExecuteIGNWebElementHelperFromRootOK
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public Boolean executeIGNWebElementHelperFromHere(Boolean isForceExecute){
		Boolean lreturn=false
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		try{
			if(!this.checkIsIGNWebElementHelperReadyToExecute()){
				if(!this.checkIsIGNWebElementHelperAlone()){
					if(!this.executeIGNWebElementHelperFromRoot(isForceExecute)){
						return lreturn
					}
				}
			}
			if(!this.checkIsIGNWebElementHelperReadyToExecute()){
				return lreturn
			}
			if(!isForceExecute){
				if(this.isIGNWebElementHelperReady){
					return lreturn
				}
			}
			if(!this.markIGNWebElementHelperRequireToRefreshBySelf(this)){
				return lreturn
			}
			Boolean lIsExecuteIGNWebElementHelperFromHereOK=false
			for(Map.Entry lEntryMapIGNWebElementLevelTypeItem in this.mapIGNWebElementLevelTypeItem){
				Integer lNumMapIGNWebElementLevelTypeItemKey=lEntryMapIGNWebElementLevelTypeItem.key
				IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=lEntryMapIGNWebElementLevelTypeItem.value
				lIsExecuteIGNWebElementHelperFromHereOK=!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)
				if(lIsExecuteIGNWebElementHelperFromHereOK){
					lIsExecuteIGNWebElementHelperFromHereOK=lIGNWebElementLevelTypeItem.executeIGNWebElementLevelTypeItem()
				}
				if(!lIsExecuteIGNWebElementHelperFromHereOK){
					break
				}
			}
			this.isIGNWebElementHelperReady=lIsExecuteIGNWebElementHelperFromHereOK
			if(this.isIGNWebElementHelperReady){
				if(this.mapIGNWebElementHelperRefChildren.size()>0){
					for(Map.Entry lEntryMapIGNWebElementHelperRefChildren in this.mapIGNWebElementHelperRefChildren){
						Boolean lIsExecuteIGNWebElementHelperRefChildrenFromHereOKCurrent=false
						Integer lNumMapIGNWebElementHelperRefChildrenKey=lEntryMapIGNWebElementHelperRefChildren.key
						IGNWebElementHelper lIGNWebElementHelperRefChildrenItem=lEntryMapIGNWebElementHelperRefChildren.value
						if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementHelperRefChildrenItem)){
							lIsExecuteIGNWebElementHelperRefChildrenFromHereOKCurrent=lIGNWebElementHelperRefChildrenItem.executeIGNWebElementHelperFromHere(false)
						}
					}
				}
			}else{
				this.markIGNWebElementHelperRequireToRefreshBySelf(this)
			}
			lreturn=this.isIGNWebElementHelperReady
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public List<WebElement> getWebElementListByLevelIndex(Integer numIGNWebElementLevelIndex){
		List<WebElement> lreturn=null
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		if(!this.isIGNWebElementHelperReady){
			return lreturn
		}
		try{
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=this.getIGNWebElementLevelTypeItemByLevelIndex(numIGNWebElementLevelIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)){
				lreturn=lIGNWebElementLevelTypeItem.getTargetWebElementList()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public WebElement getWebElementItemByLevelIndex(Integer numIGNWebElementLevelIndex){
		WebElement lreturn=null
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		if(!this.isIGNWebElementHelperReady){
			return lreturn
		}
		try{
			IGNWebElementLevelTypeItem lIGNWebElementLevelTypeItem=this.getIGNWebElementLevelTypeItemByLevelIndex(numIGNWebElementLevelIndex)
			if(!IGNUemaHelper.checkObjectNullOfObject(lIGNWebElementLevelTypeItem)){
				lreturn=lIGNWebElementLevelTypeItem.getTargetWebElementItem()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public List<WebElement> getTargetWebElementList(){
		List<WebElement> lreturn=null
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		if(!this.isIGNWebElementHelperReady){
			return lreturn
		}
		if(!this.currentIGNWebElementTargetItem==IGNWebElementTargetItem.WebElementItemMultiple){
			return lreturn
		}
		try{
			lreturn=this.getWebElementListByLevelIndex(this.getNumMapIGNWebElementLevelTypeItemIndexLast())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public WebElement getTargetWebElementItem(){
		WebElement lreturn=null
		if(!this.checkIsIGNWebElementHelperConfigValid()){
			return lreturn
		}
		if(!this.isIGNWebElementHelperReady){
			return lreturn
		}
		if(!this.currentIGNWebElementTargetItem==IGNWebElementTargetItem.WebElementItemSingle){
			return lreturn
		}
		try{
			lreturn=this.getWebElementItemByLevelIndex(this.getNumMapIGNWebElementLevelTypeItemIndexLast())
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
}