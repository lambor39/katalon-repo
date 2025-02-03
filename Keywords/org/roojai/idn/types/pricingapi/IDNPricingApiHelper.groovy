package org.roojai.idn.types.pricingapi
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
import org.apache.poi.ss.usermodel.Sheet
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
import org.roojai.ignite.core.*
import org.roojai.ignite.core.IGNGlobalConst
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.idn.core.IDNGlobalConst
public class IDNPricingApiHelper{
	public static List<String> getPricingApiFileList(String strTargetPath){
		List<String> lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetPath)){
			return lreturn
		}
		String lStrTargetPath=strTargetPath.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetPath)){
			return lreturn
		}
		try{
			File[] lArrayTargetFileName=new File(lStrTargetPath).listFiles()
			List<String> lListTargetFileName=new ArrayList<>()
			if(!IGNUemaHelper.checkObjectNullOfObject(lArrayTargetFileName)){
				for(File lFileTargetFileName in lArrayTargetFileName){
					if(IGNUemaHelper.toDoFileExistByFile(lFileTargetFileName)){
						String lExcelFileExtension=FilenameUtils.getExtension(lFileTargetFileName.getName())
						lListTargetFileName.add(lFileTargetFileName.getPath())
					}
				}
			}
			lResult=lListTargetFileName.size()>0
			if(lResult){
				lreturn=lListTargetFileName
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map getMapPricingApiSourceFileList(List<String> listPricingApiSourceFile){
		Map lreturn=[:]
		Boolean lResult=false
		List<String> lListExcelGenericFile=new ArrayList<String>()
		List<String> lListMacroGenericFile=new ArrayList<String>()
		try{
			lreturn.put('Result',lResult)
			lreturn.put('ListExcelGenericFile',lListExcelGenericFile)
			lreturn.put('ListMacroGenericFile',lListMacroGenericFile)
			if(IGNUemaHelper.checkObjectEmptyOfList(listPricingApiSourceFile)){
				return lreturn
			}
			List<String> lListPricingApiSourceFile=listPricingApiSourceFile
			for(Integer lTargetFileIndex=0;lTargetFileIndex<=lListPricingApiSourceFile.size()-1;lTargetFileIndex++){
				String lFileName=lListPricingApiSourceFile.get(lTargetFileIndex)
				if(lFileName.contains('IGNGenericTemplatePricingAPI')){
					if(lFileName.contains('.xlsx')){
						lListExcelGenericFile.add(lFileName)
					}
					else{
						lListMacroGenericFile.add(lFileName)
					}
				}
			}
			lResult=lListExcelGenericFile.size()>0
			if(lResult){
				lreturn.put('ListExcelGenericFile',lListExcelGenericFile)
				lreturn.put('ListMacroGenericFile',lListMacroGenericFile)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static String getValueFromExcelSheetForValidation(Sheet targetSheet,Integer integerRowNumber,Integer integerColumnNumber){
		String lreturn=''
		Boolean lResult=false
		Integer lRowNumber=integerRowNumber
		Integer lColumnNumber=integerColumnNumber
		try{
			if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
				IGNUemaHelper.printLog('PricingApi Generic  Sheet not valid')
				return lreturn
			}
			String lCellValue=''
			Sheet lSheetPricingApi=targetSheet
			Row lCurrentRow=lSheetPricingApi.getRow(lRowNumber)
			Cell lCell=lCurrentRow.getCell(lColumnNumber)
			CellType lCellType=lCell.getCellTypeEnum()
			Object lCellValueObject=null
			String lStrDataFormatterObjectValue=''
			try{
				lCellValueObject=ExcelKeywords.getCellByIndex(lSheetPricingApi,lRowNumber,lColumnNumber)
				lStrDataFormatterObjectValue=lCellValueObject.toString()
			}catch(Exception ex){
				//ex.printStackTrace()
			}
			if(!IGNUemaHelper.checkObjectNullOfObject(lCell)){
				if((lCellType==CellType.NUMERIC)){
					Double lValue=lCell.getNumericCellValue()
					if(DateUtil.isCellDateFormatted(lCell)){
						lCellValue=lCell.getDateCellValue().format('yyyy-MM-dd')
					}else{
						lCellValue=ExcelKeywords.getCellByIndex(lSheetPricingApi,lRowNumber,lColumnNumber)
					}
				}else{
					lCellValue=ExcelKeywords.getCellByIndex(lSheetPricingApi,lRowNumber,lColumnNumber)
				}
			}
			lResult=lCellValue.length()>1
			if(lResult){
				lreturn=lCellValue
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map getMapPricingApiSourceFileInformation(String strPricingApiProductType){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrExcelGenericFilename=''
		String lStrMacroGenericFileName=''
		try{
			lreturn.put('StrExcelGenericFileName',lStrExcelGenericFilename)
			lreturn.put('StrMacroGenericFileName',lStrMacroGenericFileName)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectEmptyOfString(strPricingApiProductType)){
				return lreturn
			}
			String lStrPricingApiProductType=strPricingApiProductType.trim()
			String lStrFileSourcePath='Data Files/Release_UAT/Roojai/IDN/'
			List<String> lListPricingApiExcelFile=IDNPricingApiHelper.getPricingApiFileList(lStrFileSourcePath)
			List<String> lListPricingApiExcelFilePath=[]
			List<String> lListPricingApiMacroFilePath=[]
			if(lListPricingApiExcelFile.size()>0){
				for(Integer lTargetFileIndex=0;lTargetFileIndex<=lListPricingApiExcelFile.size()-1;lTargetFileIndex++){
					String lStrFileName=lListPricingApiExcelFile.get(lTargetFileIndex)
					if(lStrFileName.contains('IGNGenericTemplatePricingAPI')){
						if(lStrFileName.contains('.xlsx')){
							lListPricingApiExcelFilePath.add(lStrFileName)
						}
						else{
							lListPricingApiMacroFilePath.add(lStrFileName)
						}
					}
				}
				for(Integer lMainIndex=0;lMainIndex<=lListPricingApiExcelFilePath.size()-1;lMainIndex++){
					String lStrExcelFilename=lListPricingApiExcelFilePath.get(lMainIndex)
					String lStrMacroFileName=lListPricingApiMacroFilePath.get(lMainIndex)
					if(lStrExcelFilename.contains(lStrPricingApiProductType)){
						lStrExcelGenericFilename=lStrExcelFilename
					}
					if(lStrMacroFileName.contains(lStrPricingApiProductType)){
						lStrMacroGenericFileName=lStrMacroFileName
					}
				}
			}
			lResult=(lStrExcelGenericFilename.length()>0)&&(lStrMacroGenericFileName.length()>0)
			if(lResult){
				lreturn.put('StrExcelGenericFileName',lStrExcelGenericFilename)
				lreturn.put('StrMacroGenericFileName',lStrMacroGenericFileName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Boolean inputPricingApiResultToExcelSheetForValidation(Sheet targetSheet,Integer integerRowNumber,Integer integerColumnNumber,String strOutputResult){
		Boolean lreturn=false
		Integer lRowNumber=integerRowNumber
		Integer lColumnNumber=integerColumnNumber
		String lOutputResult=strOutputResult
		if(IGNUemaHelper.checkObjectNullOfObject(targetSheet)){
			return lreturn
		}
		Sheet lSheetPricingApi=targetSheet
		try{
			lOutputResult=IGNUemaHelper.copyStringFitForExcelCell(lOutputResult)
			lOutputResult=lOutputResult.trim()
			ExcelKeywords.setValueToCellByIndex(lSheetPricingApi,lRowNumber,lColumnNumber,lOutputResult)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map getDependencyTable(String strPricingModelVersion,String strProductType,String strCoverName){
		Boolean lResult=false
		Map lreturn=[:]
		String lPricingModelVersion=strPricingModelVersion
		String lProductType=strProductType
		String lCoverName=strCoverName
		List<GroovyRowResult> lDependencyCodeMappingResultSet=[]
		try{
			lreturn.put('DependencyCodeMappingResultSet',lDependencyCodeMappingResultSet)
			lreturn.put('Result',lResult)
			Sql lSql=null
			Boolean lIsInitConnectionOK=false
			if(!IDNPricingApiGetPriceListDatabaseHandling.checkConnection()){
				lIsInitConnectionOK=IDNPricingApiGetPriceListDatabaseHandling.initDatabaseConnection()
			}
			else{
				lIsInitConnectionOK=true
			}
			if(lIsInitConnectionOK){
				lSql=IDNPricingApiGetPriceListDatabaseHandling.lPricingApiSql
				lDependencyCodeMappingResultSet=lSql.rows('select * from pricing.dependency_code_mapping where product=\''+lProductType+'\'and pricing_model_version= \''+lPricingModelVersion+'\' and code=\''+lCoverName+'\'order by  option_sequence ASC')
				lResult=(lDependencyCodeMappingResultSet.size()>=1)
			}
			if(lResult){
				lreturn.put('DependencyCodeMappingResultSet',lDependencyCodeMappingResultSet)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map getVehicleDataTable(String strVehicleMake,String strVehicleModel,String strVehicleYearOfManufacture,String strSubModel){
		Boolean lResult=false
		Map lreturn=[:]
		String llVehicleMake=strVehicleMake.trim()
		String lVehicleModel=strVehicleModel.trim()
		String lVehicleYearOfManufacture=strVehicleYearOfManufacture.trim()
		String lSubModel=strSubModel.trim()
		List<GroovyRowResult> lVehicleDataResultSet=[]
		try{
			lreturn.put('VehicleDataResultSet',lVehicleDataResultSet)
			lreturn.put('Result',lResult)
			Sql lSql=null
			Boolean lIsInitConnectionOK=false
			if(!IDNPricingApiGetPriceListDatabaseHandling.checkConnection()){
				lIsInitConnectionOK=IDNPricingApiGetPriceListDatabaseHandling.initDatabaseConnection()
			}
			else{
				lIsInitConnectionOK=true
			}
			if(lIsInitConnectionOK){
				lSql=IDNPricingApiGetPriceListDatabaseHandling.lPricingApiSql
				IGNUemaHelper.printLog('Start Query')
				lVehicleDataResultSet=lSql.rows('SELECT sfid,yearofmfg,voluntary_type,gear_location_description,uw_group,fuel_type_description,goodkm,vehicle_type_code,engine_description,new_active_veh_key,engine_size,cylinders,avg_whole_sale,uw_class,makecode,model_family,to_deactivate,name,premium_group,gear_num,door_num,wheel_base,seat_capacity,body_style,good_whole_sale,familycode,premium_class,compulsory_type,avg_retail,make,kerb_weight,vehicle_key,new_price,product_type,price,height,drive_description,width,model_description,length,power,good_retail,tariff_group,transmission,id FROM policy.st_redbook where UPPER(make)=\''+llVehicleMake+'\'and UPPER(model_family)= \''+lVehicleModel+'\' and yearofmfg=\''+lVehicleYearOfManufacture+'\'and UPPER(model_description)=\''+lSubModel+'\'')
				lResult=lVehicleDataResultSet.size()>=1
			}
			if(lResult){
				lreturn.put('VehicleDataResultSet',lVehicleDataResultSet)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getPricingCoverageIndexValue(String strProductType,String strCoverageName){
		Boolean lResult=false
		String lreturn=''
		String lProductType=strProductType
		String lCoverageName=strCoverageName
		String lPricingCoverageIndex=''
		List<GroovyRowResult> lPricingCoverageIndexResultSet=[]
		try{
			IGNUemaHelper.printLog('isUAT=true')
			Sql lSql=null
			Boolean lIsInitConnectionOK=false
			if(!IDNPricingApiGetPriceListDatabaseHandling.checkConnection()){
				lIsInitConnectionOK=IDNPricingApiGetPriceListDatabaseHandling.initDatabaseConnection()
			}
			else{
				lIsInitConnectionOK=true
			}
			if(lIsInitConnectionOK){
				lSql=IDNPricingApiGetPriceListDatabaseHandling.lPricingApiSql
				IGNUemaHelper.printLog('Start Query')
				def lFirstRow=lSql.firstRow('select product_type,coverage_code,column_index from pricing.policy_service_coverage_mapping where product_type=\''+lProductType+'\'and coverage_code= \''+lCoverageName+'\'')
				lreturn=lFirstRow?lFirstRow.column_index:lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getPricingCalculatorPaymentFlagValue(String strPricingModelVersion,String strMasterSetId){
		Boolean lResult=false
		String lreturn=''
		String lPricingModelVersion=strPricingModelVersion
		if(IGNUemaHelper.checkObjectEmptyOfString(strMasterSetId)){
			return lreturn
		}
		String lMasterSetId=strMasterSetId
		List<GroovyRowResult> lPricingCalculatorModelValueResultSet=[]
		try{
			Sql lSql=null
			Boolean lIsInitConnectionOK=false
			if(!IDNPricingApiGetPriceListDatabaseHandling.checkConnection()){
				lIsInitConnectionOK=IDNPricingApiGetPriceListDatabaseHandling.initDatabaseConnection()
			}
			else{
				lIsInitConnectionOK=true
			}
			if(lIsInitConnectionOK){
				lSql=IDNPricingApiGetPriceListDatabaseHandling.lPricingApiSql
				IGNUemaHelper.printLog('Start Query')
				def lFirstRow=lSql.firstRow('select pvi.* from pricing.pricing_calculator_model_data pcmd join pricing.product_version_info pvi on pvi.pricing_model_version = pcmd.pricing_model_version where pcmd.pricing_model_id =\''+lMasterSetId+'\'')
				lreturn=lFirstRow?lFirstRow.flag_loading_applied_by_calc:lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getPricingProductFrequencyValue(String strPaymentFrquency,String strMasterSetId){
		Boolean lResult=false
		String lreturn=''
		if(IGNUemaHelper.checkObjectEmptyOfString(strPaymentFrquency)){
			return lreturn
		}
		String lPaymentFrquency=strPaymentFrquency
		if(IGNUemaHelper.checkObjectEmptyOfString(strMasterSetId)){
			return lreturn
		}
		String lMasterSetId=strMasterSetId
		List<GroovyRowResult> lPricingCalculatorModelValueResultSet=[]
		try{
			Sql lSql=null
			Boolean lIsInitConnectionOK=false
			if(!IDNPricingApiGetPriceListDatabaseHandling.checkConnection()){
				lIsInitConnectionOK=IDNPricingApiGetPriceListDatabaseHandling.initDatabaseConnection()
			}
			else{
				lIsInitConnectionOK=true
			}
			if(lIsInitConnectionOK){
				lSql=IDNPricingApiGetPriceListDatabaseHandling.lPricingApiSql
				def lFirstRow=lSql.firstRow('select ppf.* from pricing.pricing_calculator_model_data pcmd join pricing.product_payment_frequency ppf on ppf.pricing_model_version = pcmd.pricing_model_version where pcmd.pricing_model_id =\''+lMasterSetId+'\' and payment_frequency =\''+lPaymentFrquency+'\'')
				lreturn=lFirstRow?lFirstRow.sequence:lreturn
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
}