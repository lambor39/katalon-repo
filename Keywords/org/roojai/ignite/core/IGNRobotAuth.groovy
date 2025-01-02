package org.roojai.ignite.core
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.logging.LogEntry as LogEntry
import org.openqa.selenium.logging.LogEntries as LogEntries
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import java.awt.Toolkit
import java.awt.Robot
import java.awt.PointerInfo
import java.awt.Point
import java.awt.MouseInfo
import java.awt.event.KeyEvent
import java.awt.event.InputEvent
import java.awt.datatransfer.StringSelection
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.Clipboard
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
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
public class IGNRobotAuth{
	@Keyword
	def static Boolean loginAuthenticate(String username,String password){
		Boolean lreturn=false
		IGNUemaHelper.printLog('loginAuthenticate Start')
		try{
			Robot robot=new Robot()
			robot.setAutoDelay(350)
			StringSelection selectText=new StringSelection(username)
			Toolkit toolkit=Toolkit.getDefaultToolkit()
			Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
			robot.delay(500)
			robot.keyPress(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_TAB)
			robot.keyRelease(KeyEvent.VK_TAB)
			selectText=new StringSelection(password)
			clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
			robot.keyPress(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_TAB)
			robot.keyRelease(KeyEvent.VK_TAB)
			robot.keyPress(KeyEvent.VK_ENTER)
			robot.keyRelease(KeyEvent.VK_ENTER)
			selectText=new StringSelection("")
			clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		IGNUemaHelper.printLog('loginAuthenticate Stop')
		return lreturn
	}
	@Keyword
	def static Boolean sendF12(){
		Boolean lreturn=false
		IGNUemaHelper.printLog('sendF12 Start')
		try{
			Robot robot=new Robot()
			robot.setAutoDelay(350)
			robot.delay(500)
			robot.keyPress(KeyEvent.VK_F12)
			robot.keyRelease(KeyEvent.VK_F12)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		IGNUemaHelper.printLog('sendF12 Stop')
		return lreturn
	}
}