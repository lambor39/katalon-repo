package org.roojai.tha.core
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
import javax.swing.JOptionPane
import javax.swing.JFrame
import java.sql.*
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
import internal.GlobalVariable
import groovy.sql.Sql as Sql
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
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.roojai.ignite.core.*
public class THARoojaiWebsite{
	protected static final Boolean isDebug=false
	@Keyword
	def static String OTPRoojaiWebsiteByPhoneNo(String strPhoneNo,Boolean isUAT=true){
		String lreturn=''
		IGNUemaHelper.printLog('getOTPRoojaiWebsiteByPhoneNo Start')
		try{
			if(!this.isDebug){
				String dbConnString=''
				String dbUsername=''
				String dbPassword=''
				String dbDriver=''
				if(isUAT){
					IGNUemaHelper.printLog('isUAT=true')
					dbConnString="jdbc:sqlserver://sqlfg-uat-insure-roojai.database.windows.net:1433;database=uat-insure-roojai;autoReconnect=true"
					dbUsername="roojaiuat"
					dbPassword="AF3wMrKuGH"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}else{
					IGNUemaHelper.printLog('isUAT=false')
					dbConnString="jdbc:sqlserver://sqlfg-insure-roojai.database.windows.net:1433;database=uat-insure-roojai;autoReconnect=true"
					dbUsername="roojaiuat"
					dbPassword="AF3wMrKuGH"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}
				Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
				def row=sql.firstRow('SELECT top 1 * from otp where phone_number=\''+strPhoneNo+'\' order by id DESC')
				lreturn=row?row.otp:lreturn
			}else{
				JFrame frame=new JFrame('User Input Frame')
				frame.requestFocus()
				frame.requestFocus()
				StringSelection selectText=new StringSelection(strPhoneNo)
				Toolkit toolkit=Toolkit.getDefaultToolkit()
				Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
				String otp=JOptionPane.showInputDialog(frame,'Input your OTP for this Phone Number',strPhoneNo)
				lreturn=otp
			}
		}catch(Exception e){
			e.printStackTrace()
			try{
				IGNUemaHelper.printLog(e.getMessage())
			}catch(Exception ex){
			}
		}
		IGNUemaHelper.printLog('getOTPRoojaiWebsiteByPhoneNo Stop')
		return lreturn
	}
	@Keyword
	def static String OTPMyAccountByPhoneNo(String strPhoneNo,Boolean isUAT=true){
		String lreturn=''
		IGNUemaHelper.printLog('getOTPMyAccountByPhoneNo Start')
		try{
			if(!this.isDebug){
				String dbConnString=''
				String dbUsername=''
				String dbPassword=''
				String dbDriver=''
				if(isUAT){
					IGNUemaHelper.printLog('isUAT=true')
					dbConnString="jdbc:postgresql://UATOYLNIK2BnFMGJxXuLJIp.uat-roojai.com:5432/deaf7m1lpl5rqq?sslmode=require"
					dbUsername="automationtest"
					dbPassword="pf95d5b8fe96541cd4c4701ffd0a4441441d564d93d6498375828b2537c998752"
					dbDriver="org.postgresql.Driver"
				}else{
					IGNUemaHelper.printLog('isUAT=false')
					dbConnString="jdbc:postgresql://UATOYLNIK2BnFMGJxXuLJIp.uat-roojai.com:5432/deaf7m1lpl5rqq?sslmode=require"
					dbUsername="automationtest"
					dbPassword="pf95d5b8fe96541cd4c4701ffd0a4441441d564d93d6498375828b2537c998752"
					dbDriver="org.postgresql.Driver"
				}
				Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
				def row=sql.firstRow('SELECT * FROM microservices.otp WHERE phone_number=\''+strPhoneNo+'\' ORDER BY created DESC LIMIT 1')
				lreturn=row?row.otp:lreturn
			}else{
				JFrame frame=new JFrame('User Input Frame')
				frame.requestFocus()
				frame.requestFocus()
				StringSelection selectText=new StringSelection(strPhoneNo)
				Toolkit toolkit=Toolkit.getDefaultToolkit()
				Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
				String otp=JOptionPane.showInputDialog(frame,'Input your OTP for this Phone Number',strPhoneNo)
				lreturn=otp
			}
		}catch(Exception e){
			e.printStackTrace()
			try{
				IGNUemaHelper.printLog(e.getMessage())
			}catch(Exception ex){
			}
		}
		IGNUemaHelper.printLog('getOTPMyAccountByPhoneNo Stop')
		return lreturn
	}
	@Keyword
	def static String OTPMyAccountByEmail(String strEmail,Boolean isUAT=true){
		String lreturn=''
		IGNUemaHelper.printLog('getOTPMyAccountByEmail Start')
		try{
			if(!this.isDebug){
				String dbConnString=''
				String dbUsername=''
				String dbPassword=''
				String dbDriver=''
				if(isUAT){
					IGNUemaHelper.printLog('isUAT=true')
					dbConnString="jdbc:postgresql://UATOYLNIK2BnFMGJxXuLJIp.uat-roojai.com:5432/deaf7m1lpl5rqq?sslmode=require"
					dbUsername="u881bi3ee5jo7j"
					dbPassword="pfe78a1af9057545774c8eee290fb19322e2a0ed65c8fe8c178c123bb476ded66"
					dbDriver="org.postgresql.Driver"
				}else{
					IGNUemaHelper.printLog('isUAT=false')
					dbConnString="jdbc:postgresql://UATOYLNIK2BnFMGJxXuLJIp.uat-roojai.com:5432/deaf7m1lpl5rqq?sslmode=require"
					dbUsername="u881bi3ee5jo7j"
					dbPassword="pfe78a1af9057545774c8eee290fb19322e2a0ed65c8fe8c178c123bb476ded66"
					dbDriver="org.postgresql.Driver"
				}
				Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
				def row=sql.firstRow('SELECT * FROM microservices.otp WHERE phone_number=\''+strEmail+'\' ORDER BY created DESC LIMIT 1')
				lreturn=row?row.otp:lreturn
			}else{
				JFrame frame=new JFrame('User Input Frame')
				frame.requestFocus()
				frame.requestFocus()
				StringSelection selectText=new StringSelection(strEmail)
				Toolkit toolkit=Toolkit.getDefaultToolkit()
				Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
				String otp=JOptionPane.showInputDialog(frame,'Input your OTP for this Email',strEmail)
				lreturn=otp
			}
		}catch(Exception e){
			e.printStackTrace()
			try{
				IGNUemaHelper.printLog(e.getMessage())
			}catch(Exception ex){
			}
		}
		IGNUemaHelper.printLog('getOTPMyAccountByEmail Stop')
		return lreturn
	}
	@Keyword
	def static String OTPMrKumkaByPhoneNo(String strPhoneNo,Boolean isUAT=true){
		String lreturn=''
		IGNUemaHelper.printLog('getOTPMrKumkaByPhoneNo Start')
		try{
			if(!this.isDebug){
				String dbConnString=''
				String dbUsername=''
				String dbPassword=''
				String dbDriver=''
				if(isUAT){
					IGNUemaHelper.printLog('isUAT=true')
					dbConnString="jdbc:sqlserver://uat-compare-kumka.database.windows.net:1433;database=uat-compare-kumka;autoReconnect=true"
					dbUsername="rjuat-testerteam"
					dbPassword="oPs4rR4gpAiZ+tg-Y1sR"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}else{
					IGNUemaHelper.printLog('isUAT=false')
					dbConnString="jdbc:sqlserver://uat-compare-kumka.database.windows.net:1433;database=uat-compare-kumka;autoReconnect=true"
					dbUsername="rjuat-testerteam"
					dbPassword="oPs4rR4gpAiZ+tg-Y1sR"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}
				Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
				def row=sql.firstRow('SELECT top 1 * FROM dbo.otp WHERE phone_number=\''+strPhoneNo+'\' ORDER BY created_date DESC')
				lreturn=row?row.otp:lreturn
			}else{
				JFrame frame=new JFrame('User Input Frame')
				frame.requestFocus()
				frame.requestFocus()
				StringSelection selectText=new StringSelection(strPhoneNo)
				Toolkit toolkit=Toolkit.getDefaultToolkit()
				Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
				String otp=JOptionPane.showInputDialog(frame,'Input your OTP for this Phone Number',strPhoneNo)
				lreturn=otp
			}
		}catch(Exception e){
			e.printStackTrace()
			try{
				IGNUemaHelper.printLog(e.getMessage())
			}catch(Exception ex){
			}
		}
		IGNUemaHelper.printLog('getOTPMrKumkaByPhoneNo Stop')
		return lreturn
	}
	@Keyword
	def static String OTPMrKumkaByEmail(String strEmail,Boolean isUAT=true){
		String lreturn=''
		IGNUemaHelper.printLog('getOTPMrKumkaByEmail Start')
		try{
			if(!this.isDebug){
				String dbConnString=''
				String dbUsername=''
				String dbPassword=''
				String dbDriver=''
				if(isUAT){
					IGNUemaHelper.printLog('isUAT=true')
					dbConnString="jdbc:sqlserver://uat-compare-kumka.database.windows.net:1433;database=uat-compare-kumka;autoReconnect=true"
					dbUsername="rjuat-testerteam"
					dbPassword="oPs4rR4gpAiZ+tg-Y1sR"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}else{
					IGNUemaHelper.printLog('isUAT=false')
					dbConnString="jdbc:sqlserver://uat-compare-kumka.database.windows.net:1433;database=uat-compare-kumka;autoReconnect=true"
					dbUsername="rjuat-testerteam"
					dbPassword="oPs4rR4gpAiZ+tg-Y1sR"
					dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
				}
				Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
				def row=sql.firstRow('SELECT top 1 * FROM dbo.otp WHERE phone_number=\''+strEmail+'\' ORDER BY created_date DESC')
				lreturn=row?row.otp:lreturn
			}else{
				JFrame frame=new JFrame('User Input Frame')
				frame.requestFocus()
				frame.requestFocus()
				StringSelection selectText=new StringSelection(strEmail)
				Toolkit toolkit=Toolkit.getDefaultToolkit()
				Clipboard clipboard=toolkit.getSystemClipboard().setContents(selectText,null)
				String otp=JOptionPane.showInputDialog(frame,'Input your OTP for this Email',strEmail)
				lreturn=otp
			}
		}catch(Exception e){
			e.printStackTrace()
			try{
				IGNUemaHelper.printLog(e.getMessage())
			}catch(Exception ex){
			}
		}
		IGNUemaHelper.printLog('getOTPMrKumkaByEmail Stop')
		return lreturn
	}
}