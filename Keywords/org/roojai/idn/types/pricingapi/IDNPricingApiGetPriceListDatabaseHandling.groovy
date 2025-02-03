package org.roojai.idn.types.pricingapi
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
import org.roojai.ignite.types.testmanager.IGNTestManager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import groovy.sql.*
public class IDNPricingApiGetPriceListDatabaseHandling{
	private static IDNPricingApiGetPriceListDatabaseHandling INSTANCE
	private IGNTestManager parentIGNTestManager
	private static Sql lPricingApiSql
	private static Boolean isIDNPricingApiDatabaseConnectionTestReady=false
	public IDNPricingApiGetPriceListDatabaseHandling(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				IGNUemaHelper.printLog('InitDatabaseConnection()')
				this.initDatabaseConnection()
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static IDNPricingApiGetPriceListDatabaseHandling getInstance(IGNTestManager ignTestManager){
		try{
			if(this.INSTANCE==null){
				this.INSTANCE=new IDNPricingApiGetPriceListDatabaseHandling(ignTestManager)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return this.INSTANCE
	}
	public static Boolean initDatabaseConnection(){
		Boolean lreturn=false
		try{
			String dbConnString=''
			String dbUsername=''
			String dbPassword=''
			String dbDriver=''
			dbConnString="jdbc:postgresql://uatnfdDmvd.uat-roojai.co.id:5432/d90n51k6seh5oc?sslmode=require"
			dbUsername="testautomation"
			dbPassword="pfe12f44ac6e90d675e1b5abc3e6d6f900a0c186c42556ea131b427b5b9e48315"
			dbDriver="org.postgresql.Driver"
			Sql lSql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
			if(!IGNUemaHelper.checkObjectNullOfObject(lSql)){
				this.isIDNPricingApiDatabaseConnectionTestReady=true
				this.lPricingApiSql=lSql
				this.lPricingApiSql.cacheConnection=true
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Boolean getIsIDNPricingApiDatabaseConnectionTestReady(){
		try{
			return this.isIDNPricingApiDatabaseConnectionTestReady
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public static Boolean checkConnection(){
		Boolean lreturn=false
		try{
			lreturn=this.lPricingApiSql.cacheConnection
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
	public Boolean closeDataBaseConnection(){
		Boolean lreturn=false
		try{
			if(IGNUemaHelper.checkObjectNullOfObject(this.lPricingApiSql)){
				this.lPricingApiSql.close()
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}