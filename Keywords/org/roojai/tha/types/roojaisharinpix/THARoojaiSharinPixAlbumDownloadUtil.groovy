package org.roojai.tha.types.roojaisharinpix
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.googlecode.javacv.cpp.swscale
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import java.awt.datatransfer.StringSelection
import java.awt.datatransfer.Clipboard
import java.awt.Toolkit
import javax.swing.JFrame
import javax.swing.JOptionPane
import org.apache.commons.lang3.StringUtils
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiSharinPixAlbumDownloadUtil{
	public static final String BASE_URL='https://app.sharinpix.com/admin'
	public static final String LOCATOR_BUTTON_LOGIN='#content div:nth-child(1)>div>div>a'
	public static final String LOCATOR_TO_CHECK_1='.container-fluid .login-box'
	public static final String LOCATOR_BUTTON_ALBUM='#albums>a'
	public static final String LOCATOR_TO_CHECK_2='#main_content>div>h3'
	public static final String FORM_URL_ALBUM_ASC='https://app.sharinpix.com/admin/albums?order=created_at_asc&page='
	public static final String FORM_URL_ALBUM_DESC='https://app.sharinpix.com/admin/albums?order=created_at_desc&page='
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Download/SharinPix/Data_SharinPix'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Download/SharinPix/Excel_SharinPix.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='SharinPix_Download'
	public static final Integer INPUT_DATA_COL_BEGIN=2
	public static final Integer INPUT_DATA_COL_END=2
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_ROW_END=1
	public static final Integer INPUT_EXCEL_COL_BEGIN=1
	public static final Integer INPUT_EXCEL_COL_END=1
	public static final Integer INPUT_EXCEL_ROW_BEGIN=1
	public static final Integer INPUT_EXCEL_ROW_END=1
	public static final String OUTPOUT_FOLDER='Data Files/Release_UAT/Roojai/THA/Download/SharinPix/'
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiSharinPixAlbumDownloadUtil(WebDriver newDriver,WebDriver newSelenium){
		super()
		this.driver=newDriver
		this.selenium=newSelenium
	}
	private WebDriver getDriver(){
		return this.driver
	}
	private void setDriver(WebDriver newDriver){
		//Do Nothing
		//this.driver=newDriver
	}
	private WebDriver getSelenium(){
		return this.selenium
	}
	private void setSelenium(WebDriver newSelenium){
		//Do Nothing
		//this.selenium=newSelenium
	}
	public Map inputCase(TestData dataInput){
		Map lreturn=[:]
		Boolean lResult=false
		String lMessage=''
		lreturn.put('Message','')
		lreturn.put('Result',lResult)
		if(!dataInput){
			lMessage='Invalid dataInput'
			lreturn.put('Message',lMessage)
			return lreturn
		}
		try{
			if(!this.loginToAlbum()){
				lMessage='Not able to Login'
				lreturn.put('Message',lMessage)
				return lreturn
			}
			Map lMapProcessDownloadAlbum=this.processDownloadAlbum(dataInput)
			lMessage=lMapProcessDownloadAlbum.Message
			lResult=lMapProcessDownloadAlbum.Result
			lreturn.put('Message',lMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			lMessage=e.getMessage()
			lreturn.put('Message',lMessage)
			return lreturn
		}
		return lreturn
	}
	public Boolean loginToAlbum(){
		Boolean lreturn=false
		try{
			if(!IGNUemaHelper.selectButtonByLocator(this.driver,this.LOCATOR_BUTTON_LOGIN)){
				return lreturn
			}
			JFrame lFrame=new JFrame('User Input')
			String lUserName='automation@roojai.com'
			String lPassword='Auto@12345'
			String lOTP=''
			lFrame.requestFocus()
			lFrame.requestFocus()
			//lUserName=JOptionPane.showInputDialog(lFrame,'Enter User Name',lUserName)
			lUserName=lUserName.trim()
			if(lUserName.length()<=0){
				return lreturn
			}
			lFrame.requestFocus()
			lFrame.requestFocus()
			//lPassword=JOptionPane.showInputDialog(lFrame,'Enter Password',lPassword)
			lPassword=lPassword.trim()
			if(lPassword.length()<=0){
				return lreturn
			}
			IGNUemaHelper.typeTextByLocator(this.driver,'#username',lUserName)
			IGNUemaHelper.typeTextByLocator(this.driver,'#password',lPassword)
			IGNUemaHelper.selectButtonByLocator(this.driver,'#Login')
			IGNUemaHelper.delayThreadSecond(1)
			lFrame.requestFocus()
			lFrame.requestFocus()
			lOTP=JOptionPane.showInputDialog(lFrame,'Enter OTP',lOTP)
			lOTP=lOTP.trim()
			if(lOTP.length()<=0){
				return lreturn
			}
			IGNUemaHelper.typeTextByLocator(this.driver,'#smc',lOTP)
			if(!IGNUemaHelper.selectButtonByLocator(this.driver,'#save')){
				return lreturn
			}
			String lLocatorToCheck=THARoojaiSharinPixAlbumDownloadUtil.LOCATOR_BUTTON_ALBUM
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToCheck)){
				WebUI.refresh()
			}
			lreturn=IGNUemaHelper.checkElementPresentByLocator(this.driver,this.LOCATOR_TO_CHECK_2,5)
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Integer currentPageGet(TestData dataInput){
		Integer lreturn=0
		if(!dataInput){
			return lreturn
		}
		try{
			String lText=dataInput.getValue(this.INPUT_DATA_COL_BEGIN,this.INPUT_DATA_ROW_BEGIN)
			lreturn=IGNUemaHelper.convertStringToInteger(lText,lreturn)
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Boolean currentPageSet(Integer currentPage){
		Boolean lreturn=false
		try{
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_EXCEL_SHEET_NAME)
			ExcelKeywords.setValueToCellByIndex(xlsSheet,this.INPUT_EXCEL_ROW_BEGIN,this.INPUT_EXCEL_COL_BEGIN,currentPage.toString())
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
	public Map processDownloadAlbum(TestData dataInput){
		Map lreturn=[:]
		Boolean lResult=false
		String lMessage=''
		lreturn.put('Message','')
		lreturn.put('Result',lResult)
		if(!dataInput){
			lMessage='Invalid dataInput'
			lreturn.put('Message',lMessage)
			return lreturn
		}
		try{
			Integer lIndexMin=0
			Integer lIndexMax=10000
			Integer lIndexCur=lIndexMin
			Boolean lCurrentStatus=false
			Integer lCurrentPageNum=this.currentPageGet(dataInput)
			JFrame lFrame=new JFrame('User Input')
			lFrame.requestFocus()
			lFrame.requestFocus()
			String lNewCurrentPageStr=lCurrentPageNum.toString()
			lNewCurrentPageStr=JOptionPane.showInputDialog(lFrame,'Confirm Current Page',lNewCurrentPageStr)
			Integer lNewCurrentPageNum=IGNUemaHelper.convertStringToInteger(lNewCurrentPageStr,lCurrentPageNum)
			if(lNewCurrentPageNum!=lCurrentPageNum){
				lCurrentPageNum=lNewCurrentPageNum
				this.currentPageSet(lCurrentPageNum)
			}
			Integer lProcessCompletedCount=0
			for(lIndexCur=lIndexMin;lIndexCur<=lIndexMax;lIndexCur++){
				IGNUemaHelper.printLog('ProcessIndex='+lIndexCur.toString())
				IGNUemaHelper.printLog('ProcessPage='+lCurrentPageNum.toString())
				lCurrentStatus=this.processCurrentPage(lCurrentPageNum)
				if(lCurrentStatus){
					lCurrentPageNum=lCurrentPageNum+1
					lProcessCompletedCount=lProcessCompletedCount+1
				}else{
					break
				}
			}
			if(!this.currentPageSet(lCurrentPageNum)){
				lMessage='Cannot save dataInput'
			}
			String lStatus='Process Completed Count='+lProcessCompletedCount.toString()
			if(lMessage.length()<=0){
				lMessage=lStatus
			}else{
				lMessage=lMessage+'|'+lStatus
			}
			lResult=lProcessCompletedCount>0
			lreturn.put('Message',lMessage)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			lMessage=e.getMessage()
			lreturn.put('Message',lMessage)
			return lreturn
		}
		return lreturn
	}
	public Boolean processCurrentPage(Integer currentPage){
		Boolean lreturn=false
		try{
			String lBaseUrl=this.FORM_URL_ALBUM_ASC+currentPage.toString()
			String lLocatorNoAlbum='#main_content > div > span'
			Boolean lIsNoAlbum=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorNoAlbum,3)
			if(lIsNoAlbum){
				return lreturn
			}
			Integer lIndexMin=0
			Integer lIndexMax=5
			Integer lIndexCur=lIndexMin
			String lLocatorToClick='#index_footer > div.download_links > a:nth-child(4)'
			Boolean lIsReady=false
			for(lIndexCur=lIndexMin;lIndexCur<=lIndexMax;lIndexCur++){
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToClick)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToClick)){
					WebUI.refresh()
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToClick)){
					WebUI.navigateToUrl(lBaseUrl)
				}
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(driver,lLocatorToClick)){
					WebUI.refresh()
				}
				lIsReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorToClick,3)
				if(lIsReady){
					break
				}
			}
			IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorToClick)
			IGNUemaHelper.delayThreadSecond(1)
			String lLocatorDocument='body > pre'
			Boolean lIsLoaded=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorDocument,3)
			if(lIsLoaded){
				WebElement lElementJsonDoc=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorDocument)
				if(lElementJsonDoc){
					String lJsonText=lElementJsonDoc.getText()
					String lFileName=StringUtils.leftPad(currentPage.toString(),10,'0')+'.json'
					lreturn=IGNUemaHelper.writeStringToFile(this.OUTPOUT_FOLDER+lFileName,lJsonText,false)
				}
			}
		}catch(Exception e){
			return lreturn
		}
		return lreturn
	}
}