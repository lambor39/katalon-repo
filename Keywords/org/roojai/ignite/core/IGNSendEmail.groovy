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
import javax.mail.Transport
import javax.mail.Session
import javax.mail.PasswordAuthentication
import javax.mail.Multipart
import javax.mail.MessagingException
import javax.mail.Message
import javax.mail.internet.MimeMultipart
import javax.mail.internet.MimeMessage
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.InternetAddress
import javax.mail.internet.AddressException
import javax.mail.Authenticator
import java.util.regex.Pattern as Pattern
import java.util.Properties
import java.util.Date
import java.sql.DriverManager
import java.io.IOException
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
public class IGNSendEmail{
	@Keyword
	public static Boolean sendEmailWithAttachmentList(String strServerHost,String strServerPort,final String strUserName,final String strUserPassword,String strAdressFrom,String strAdressTo,String strEmailSubject,String strEmailBody,String[] listEmailAttachFile){
		Boolean lreturn=false
		try{
			//SMTP Server
			Properties lMapProperty=new Properties()
			lMapProperty.put('mail.transport.protocol','smtp')
			lMapProperty.put('mail.smtp.host',strServerHost)
			lMapProperty.put('mail.smtp.port',strServerPort)
			lMapProperty.put('mail.smtp.auth','true')
			lMapProperty.put('mail.smtp.starttls.enable','true')
			lMapProperty.put('mail.user',strUserName)
			lMapProperty.put('mail.password',strUserPassword)
			//Authenticator
			Authenticator lAuthenticator=new Authenticator(){
						public PasswordAuthentication getPasswordAuthentication(){
							return new PasswordAuthentication(strUserName,strUserPassword)
						}
					}
			//Session
			Session lSession=Session.getDefaultInstance(lMapProperty,lAuthenticator)
			//Email Header
			Message lMessage=new MimeMessage(lSession)
			lMessage.setFrom(new InternetAddress(strAdressFrom))
			InternetAddress[] lInternetAddressList=InternetAddress.parse(strAdressTo)
			lMessage.setRecipients(Message.RecipientType.TO,lInternetAddressList)
			lMessage.setSubject(strEmailSubject)
			lMessage.setSentDate(new Date())
			//Multi Part
			Multipart lMultipart=new MimeMultipart()
			//Email Body
			MimeBodyPart lMimeBodyPart=new MimeBodyPart()
			lMimeBodyPart.setContent(strEmailBody,'text/html')
			lMultipart.addBodyPart(lMimeBodyPart)
			//Attachment File List
			if((listEmailAttachFile!=null)&&(listEmailAttachFile.size()>0)){
				for(String lStrFilePath:listEmailAttachFile){
					MimeBodyPart lAttachPart=new MimeBodyPart()
					try{
						lAttachPart.attachFile(lStrFilePath)
					}catch(IOException ex){
						ex.printStackTrace()
					}
					lMultipart.addBodyPart(lAttachPart)
				}
			}
			//Email Content
			lMessage.setContent(lMultipart)
			//Send Email
			Transport.send(lMessage)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean sendRoojaiReportIgnite(String strAdressTo,String strEmailSubject,String strEmailBody,String[] listEmailAttachFile){
		Boolean lreturn=false
		try{
			//SMTP Info
			String lStrServerHost=IGNGlobalConst.DEFAULT_EMAIL_SMTP_HOST
			String lStrServerPort=IGNGlobalConst.DEFAULT_EMAIL_SMTP_PORT
			String lStrUserName=IGNGlobalConst.DEFAULT_EMAIL_ACCOUNT
			String lStrUserPassword=IGNGlobalConst.DEFAULT_EMAIL_PASSWORD
			String lStrAdressFrom=IGNGlobalConst.DEFAULT_EMAIL_FROM_IGNITE
			lreturn=this.sendEmailWithAttachmentList(lStrServerHost,lStrServerPort,lStrUserName,lStrUserPassword,lStrAdressFrom,strAdressTo,strEmailSubject,strEmailBody,listEmailAttachFile)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean sendRoojaiReportTHA(String strAdressTo,String strEmailSubject,String strEmailBody,String[] listEmailAttachFile){
		Boolean lreturn=false
		try{
			//SMTP Info
			String lStrServerHost=IGNGlobalConst.DEFAULT_EMAIL_SMTP_HOST
			String lStrServerPort=IGNGlobalConst.DEFAULT_EMAIL_SMTP_PORT
			String lStrUserName=IGNGlobalConst.DEFAULT_EMAIL_ACCOUNT
			String lStrUserPassword=IGNGlobalConst.DEFAULT_EMAIL_PASSWORD
			String lStrAdressFrom=IGNGlobalConst.DEFAULT_EMAIL_FROM_THA
			lreturn=this.sendEmailWithAttachmentList(lStrServerHost,lStrServerPort,lStrUserName,lStrUserPassword,lStrAdressFrom,strAdressTo,strEmailSubject,strEmailBody,listEmailAttachFile)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean sendRoojaiReportIDN(String strAdressTo,String strEmailSubject,String strEmailBody,String[] listEmailAttachFile){
		Boolean lreturn=false
		try{
			//SMTP Info
			String lStrServerHost=IGNGlobalConst.DEFAULT_EMAIL_SMTP_HOST
			String lStrServerPort=IGNGlobalConst.DEFAULT_EMAIL_SMTP_PORT
			String lStrUserName=IGNGlobalConst.DEFAULT_EMAIL_ACCOUNT
			String lStrUserPassword=IGNGlobalConst.DEFAULT_EMAIL_PASSWORD
			String lStrAdressFrom=IGNGlobalConst.DEFAULT_EMAIL_FROM_IDN
			lreturn=this.sendEmailWithAttachmentList(lStrServerHost,lStrServerPort,lStrUserName,lStrUserPassword,lStrAdressFrom,strAdressTo,strEmailSubject,strEmailBody,listEmailAttachFile)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
}