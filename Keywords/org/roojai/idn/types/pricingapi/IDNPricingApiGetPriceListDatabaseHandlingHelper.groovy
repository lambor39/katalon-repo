package org.roojai.idn.types.pricingapi
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import org.roojai.idn.types.pricingapi.IDNPricingApiGetPriceListDatabaseHandling
import org.roojai.ignite.types.testmanager.IGNTestManager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IDNPricingApiGetPriceListDatabaseHandlingHelper{
	private static IDNPricingApiGetPriceListDatabaseHandling instanceIDNPricingApiGetPriceListDatabaseHandling
	public static IDNPricingApiGetPriceListDatabaseHandling getIDNPricingApiGetPriceListDatabaseHandlingInstance(IGNTestManager ignTestManager){
		try{
			this.instanceIDNPricingApiGetPriceListDatabaseHandling=IDNPricingApiGetPriceListDatabaseHandling.getInstance(ignTestManager)
			return this.instanceIDNPricingApiGetPriceListDatabaseHandling
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
}