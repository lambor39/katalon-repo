package org.roojai.tha.types.roojaigisweb
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.googlecode.javacv.cpp.swscale
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
public class THARoojaiGISWebInputUtil{
	public static String DOCUMENT_TYPE_MODE=''
	public static String USERNAME=''
	public static String REPRINT_DELIVERY_NOTE_DOCUMENT=''
	public static String REPRINT_RECEIPT_AND_TAX_RECEIPT_DOCUMENT=''
	public static String REPRINT_INVOICE_DOCUMENT=''
	public static String REPRINT_CLAIM_FORM_DOCUMENT=''
	public static String REPRINT_POLICY_DOCUMENT=''
	public static final String PASSWORD='XXXX'
	public static final String BASE_URL='http://192.168.150.1/IBSWeb/sysadmin/usercontrol/isa4505/isa4505.jsp'
	public static final String FORM_URL='https://tt.tipinsure.com/banc/createPolicyPAAction.do?method=start&policytype=MSHA_NCOV'
	public static final String INPUT_CONFIG_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGISWeb/RoojaiGISWeb_Config'
	public static final String INPUT_RECEIPT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGISWeb/RoojaiGISWeb_Receipt'
	public static final String INPUT_RECEIPT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiGISWeb.xlsx'
	public static final String INPUT_RECEIPT_EXCEL_SHEET_NAME='GISWeb_Receipt'
	public static final String INPUT_TAX_RECEIPT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGISWeb/RoojaiGISWeb_Tax'
	public static final String INPUT_TAX_RECEIPT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiGISWeb.xlsx'
	public static final String INPUT_TAX_RECEIPT_EXCEL_SHEET_NAME='GISWeb_Tax'
	public static final String INPUT_POLICY_SET_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiGISWeb/RoojaiGISWeb_Policy_Set'
	public static final String INPUT_POLICY_SET_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiGISWeb.xlsx'
	public static final String INPUT_POLICY_SET_EXCEL_SHEET_NAME='GISWeb_Policy_Set'
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_COL_DOC_NO=2
	public static final Integer INPUT_DATA_COL_DOC_STATUS=3
	public static final Integer INPUT_DATA_COL_DOC_COUNT=5
	public static final Integer INPUT_EXCEL_COL_DOC_STATUS=2
	public static final Integer INPUT_EXCEL_COL_DOC_FILE=3
	public static final Integer INPUT_EXCEL_COL_DOC_COUNT=4
	public static final Integer INPUT_POLICY_SET_SERIAL_DATA_COL_DOC_NO=2
	public static final Integer INPUT_POLICY_SET_SERIAL_DATA_COL_DOC_STATUS=3
	public static final Integer INPUT_POLICY_SET_RECEIPT_DATA_COL_DOC_NO=5
	public static final Integer INPUT_POLICY_SET_RECEIPT_DATA_COL_DOC_STATUS=6
	public static final Integer INPUT_POLICY_SET_DATA_COL_DOC_COUNT=8
	public static final Integer INPUT_POLICY_SET_SERIAL_EXCEL_COL_DOC_STATUS=2
	public static final Integer INPUT_POLICY_SET_SERIAL_EXCEL_COL_DOC_FILE=3
	public static final Integer INPUT_POLICY_SET_RECEIPT_EXCEL_COL_DOC_STATUS=5
	public static final Integer INPUT_POLICY_SET_RECEIPT_EXCEL_COL_DOC_FILE=6
	public static final Integer INPUT_POLICY_SET_EXCEL_COL_DOC_COUNT=7
	public static final Integer TOTAL_RECORD_REPRINT=1
	public static final Integer WAITING_SECOND_TIME=45
	public static final String SRC_RECEIPT_FULL_FILE_NAME='C:/Users/sorawit.sir/Downloads/GAC8010DR_RCPT.pdf'
	public static final String DST_RECEIPT_FULL_FILE_NAME='C:/Automation/Gisweb/Doc_Reprint/RECEIPT/'
	public static final String SRC_TAX_RECEIPT_FULL_FILE_NAME='C:/Users/sorawit.sir/Downloads/GAC8000DR_VAT.pdf'
	public static final String DST_TAX_RECEIPT_FULL_FILE_NAME='C:/Automation/Gisweb/Doc_Reprint/VAT/'
	public static final String SRC_POLICY_SET_POLICY_FULL_FILE_NAME='C:/Users/sorawit.sir/Downloads/MmFormPolicyVP.pdf'
	public static final String DST_POLICY_SET_POLICY_FULL_FILE_NAME='C:/Automation/Gisweb/Doc_Reprint/POLICY_SCHEDULE/'
	public static final String SRC_POLICY_SET_RECEIPT_FULL_FILE_NAME='C:/Users/sorawit.sir/Downloads/MmPremiumReceiptGroup2P_21.pdf'
	public static final String DST_POLICY_SET_RECEIPT_FULL_FILE_NAME='C:/Automation/Gisweb/Doc_Reprint/POLICY_RECEIPT_TAX_RECEIPT/'
	public Integer REPRINT_COUNT=1
	private TestData lDataInput=null
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiGISWebInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
			lDataInput=dataInput
			Integer lRowCount=dataInput.getRowNumbers()
			Integer lRowIndex=this.INPUT_DATA_ROW_BEGIN
			if(lRowCount<lRowIndex){
				lMessage='No DATA To Process'
				lreturn.put('Message',lMessage)
				return lreturn
			}
			Boolean lToProcess=false
			String lDataText=''
			for(lRowIndex=this.INPUT_DATA_ROW_BEGIN;lRowIndex<=lRowCount;lRowIndex++){
				lDataText=dataInput.getValue(this.INPUT_DATA_COL_DOC_NO,lRowIndex).trim()
				if(lDataText.length()>0){
					lToProcess=true
					break
				}
			}
			if(!lToProcess){
				lMessage='No Row To Process'
				lreturn.put('Message',lMessage)
				return lreturn
			}
			Boolean IsAccessOpenDoc=this.processLogin()
			if(!IsAccessOpenDoc){
				lMessage='Cannot process openDocApp'
				lreturn.put('Message',lMessage)
				return lreturn
			}
			switch(this.DOCUMENT_TYPE_MODE){
				case 'Policy_Set':
					lreturn=this.processInputCaseB(dataInput)
					break
				default:
					lreturn=this.processInputCaseA(dataInput)
					break
			}
			if(lResult){
				lreturn.put('Message',lMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			lMessage=e.getMessage()
			lreturn.put('Message',lMessage)
			return lreturn
		}
		return lreturn
	}
	public Map processInputCaseA(dataInput){
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
			lDataInput=dataInput
			Integer lRowCount=lDataInput.getRowNumbers()
			Integer lRowIndex=this.INPUT_DATA_ROW_BEGIN
			Boolean lIsFilled=false
			Integer lNumAll=0
			Integer lNumPass=0
			Integer lNumFail=0
			Integer lNumSkip=0
			Integer lNumDocno=0
			String lDataText=''
			String lDataDocStatus=''
			List<String> lListDocno=[]
			REPRINT_COUNT=IGNUemaHelper.convertStringToInteger(lDataInput.getValue(this.INPUT_DATA_COL_DOC_COUNT,this.INPUT_DATA_ROW_BEGIN),0)
			if(REPRINT_COUNT<1){
				REPRINT_COUNT=1
			}
			for(lRowIndex=this.INPUT_DATA_ROW_BEGIN;lRowIndex<=lRowCount;lRowIndex++){
				lNumAll++
				lDataText=lDataInput.getValue(this.INPUT_DATA_COL_DOC_NO,lRowIndex).trim()
				if(lDataText.length()>0){
					lDataDocStatus=lDataInput.getValue(this.INPUT_DATA_COL_DOC_STATUS,lRowIndex).trim()
					IGNUemaHelper.printLog(lDataDocStatus)
					if(lDataDocStatus.equalsIgnoreCase('')){
						lNumDocno++
						lListDocno.add(lDataText)
						if(lNumDocno==this.TOTAL_RECORD_REPRINT||(lNumDocno<this.TOTAL_RECORD_REPRINT&&lNumAll==lRowCount)){
							lIsFilled=this.fillDataInput(lListDocno,dataInput,lRowIndex,lNumAll,lNumDocno)
							lListDocno.clear()
							lNumDocno=0
							if(lIsFilled){
								lNumPass++
							}else{
								lNumFail++
							}
						}
					}else{
						lNumSkip++
					}
				}
				lMessage='All_Rows:'+lNumAll.toString()+' Pass:'+lNumPass.toString()+' Fail:'+lNumFail.toString()+' Skip:'+lNumSkip.toString()
				IGNUemaHelper.printLog(lMessage)
			}
			lResult=true
			if(lResult){
				lreturn.put('Message',lMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			lMessage=e.getMessage()
			lreturn.put('Message',lMessage)
			return lreturn
		}
		return lreturn
	}
	public Map processInputCaseB(dataInput){
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
			lDataInput=dataInput
			Integer lRowCount=lDataInput.getRowNumbers()
			Integer lRowIndex=this.INPUT_DATA_ROW_BEGIN
			Integer lNumAll=0
			Integer lNumPass=0
			Integer lNumFail=0
			Integer lNumSkip=0
			Integer lNumDocno=0
			String lSerialNoDataText=''
			String lSerialNoDataDocStatus=''
			String lReceiptNoDataText=''
			String lReceiptNoDataDocStatus=''
			List<String> lListDocno=[]
			Boolean lIsFilled=false
			Boolean lIsReprintDeliveryNoteDocument=IGNUemaHelper.convertStringToBoolean(this.REPRINT_DELIVERY_NOTE_DOCUMENT)
			Boolean lIsReprintReceiptAndTaxReceiptDocument=IGNUemaHelper.convertStringToBoolean(this.REPRINT_RECEIPT_AND_TAX_RECEIPT_DOCUMENT)
			Boolean lIsReprintInvoiceDocument=IGNUemaHelper.convertStringToBoolean(this.REPRINT_INVOICE_DOCUMENT)
			Boolean lIsReprintClaimFormDocument=IGNUemaHelper.convertStringToBoolean(this.REPRINT_CLAIM_FORM_DOCUMENT)
			Boolean lIsReprintPolicyDocument=IGNUemaHelper.convertStringToBoolean(this.REPRINT_POLICY_DOCUMENT)
			REPRINT_COUNT=IGNUemaHelper.convertStringToInteger(lDataInput.getValue(this.INPUT_DATA_COL_DOC_COUNT,this.INPUT_DATA_ROW_BEGIN),0)
			if(REPRINT_COUNT<1){
				REPRINT_COUNT=1
			}
			for(lRowIndex=this.INPUT_DATA_ROW_BEGIN;lRowIndex<=lRowCount;lRowIndex++){
				lNumAll++
				if(lIsReprintDeliveryNoteDocument||lIsReprintReceiptAndTaxReceiptDocument||lIsReprintInvoiceDocument||lIsReprintInvoiceDocument||lIsReprintClaimFormDocument||lIsReprintPolicyDocument){
					lSerialNoDataText=lDataInput.getValue(this.INPUT_POLICY_SET_SERIAL_DATA_COL_DOC_NO,lRowIndex).trim()
				}
				if(lIsReprintReceiptAndTaxReceiptDocument){
					lReceiptNoDataText=lDataInput.getValue(this.INPUT_POLICY_SET_RECEIPT_DATA_COL_DOC_NO,lRowIndex).trim()
				}
				if(lSerialNoDataText.length()>0){
					lSerialNoDataDocStatus=lDataInput.getValue(this.INPUT_POLICY_SET_SERIAL_DATA_COL_DOC_STATUS,lRowIndex).trim()
					IGNUemaHelper.printLog(lSerialNoDataDocStatus)
					if(lSerialNoDataDocStatus.equalsIgnoreCase('')){
						lNumDocno++
						if(lIsReprintDeliveryNoteDocument){
							//lIsFilled=this.processReprintDeliveryNoteDocument(lSerialNoDataText,lNumAll,lRowIndex,lNumDocno)
						}
						if(lIsReprintInvoiceDocument){
							//lIsFilled=this.processReprintInvoiceDocument(lSerialNoDataText,lNumAll,lRowIndex,lNumDocno)
						}
						if(lIsReprintClaimFormDocument){
							//lIsFilled=this.processReprintClaimFormDocument(lSerialNoDataText,lNumAll,lRowIndex,lNumDocno)
						}
						if(lIsReprintPolicyDocument){
							lIsFilled=this.processReprintPolicyDocument(lSerialNoDataText,lNumAll,lRowIndex,lNumDocno)
						}
						lNumDocno=0
						if(lIsFilled){
							lNumPass++
						}else{
							lNumFail++
						}
					}else{
						lNumSkip++
					}
				}
				if(lSerialNoDataText.length()>0&&lReceiptNoDataText.length()>0){
					lReceiptNoDataDocStatus=lDataInput.getValue(this.INPUT_POLICY_SET_RECEIPT_DATA_COL_DOC_STATUS,lRowIndex).trim()
					IGNUemaHelper.printLog(lReceiptNoDataDocStatus)
					if(lReceiptNoDataDocStatus.equalsIgnoreCase('')){
						lNumDocno++
						lListDocno.add(lSerialNoDataText)
						if(lIsReprintReceiptAndTaxReceiptDocument){
							lIsFilled=this.processReprintReceiptAndTaxReceiptDocument(lSerialNoDataText,lReceiptNoDataText,lNumAll,lRowIndex,lNumDocno)
						}
						lNumDocno=0
						if(lIsFilled){
							lNumPass++
						}else{
							lNumFail++
						}
					}else{
						lNumSkip++
					}
				}
				lMessage='All_Rows:'+lNumAll.toString()+' Pass:'+lNumPass.toString()+' Fail:'+lNumFail.toString()+' Skip:'+lNumSkip.toString()
				IGNUemaHelper.printLog(lMessage)
			}
			lResult=true
			if(lResult){
				lreturn.put('Message',lMessage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			lMessage=e.getMessage()
			lreturn.put('Message',lMessage)
			return lreturn
		}
		return lreturn
	}
	public Boolean processLogin(){
		Boolean lreturn=false
		try{
			String lLocatorUserName='body input[name="ul_userid"]'
			WebElement lElementUserName=null
			String lLocatorPassword='body input[name="ul_password"]'
			WebElement lElementPassword=null
			String lLocatorSubmitBtn='body input[name="Ok"]'
			WebElement lElementSubmitBtn=null
			String lLocatorCloseBtn='body img[name="close"]'
			WebElement lElementCloseBtn=null
			WebUI.navigateToUrl(this.BASE_URL)
			lElementUserName=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorUserName)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementUserName)){
				return lreturn
			}else{
				IGNUemaHelper.typeTextByWebElement(this.driver,lElementUserName,this.USERNAME)
			}
			lElementPassword=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPassword)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementPassword)){
				return lreturn
			}else{
				IGNUemaHelper.typeTextByWebElement(this.driver,lElementPassword,this.PASSWORD)
			}
			lElementSubmitBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSubmitBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementSubmitBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubmitBtn)
			}
			IGNUemaHelper.delayThreadSecond(3)
			String lMainPage=this.driver.getWindowHandle()
			Set<String> lSetWinHandleA=this.driver.getWindowHandles()
			for(String lWindowHandle:lSetWinHandleA){
				this.driver.switchTo().window(lWindowHandle)
				String lCurrentPage=this.driver.getCurrentUrl()
				if(lCurrentPage.toUpperCase().contains('SHOWPOPUPSYSDT')){
					lElementCloseBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCloseBtn)
					if(IGNUemaHelper.checkObjectNullOfObject(lElementCloseBtn)){
						return lreturn
					}else{
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCloseBtn)
					}
				}
			}
			Boolean lIsPassed=false
			switch(this.USERNAME){
				case 'sorawit':
					lIsPassed=this.inputSeletedReceiptA()
					break
				default:
					lIsPassed=this.inputSeletedReceiptB()
					break
			}
			if(!lIsPassed){
				return lreturn
			}
			Set<String> lSetWinHandleB=this.driver.getWindowHandles()
			for(String lWindowHandle:lSetWinHandleB){
				if(lMainPage.equals(lWindowHandle)){
					this.driver.switchTo().window(lWindowHandle)
					break
				}
			}
			String lLocatorFrameB='frame[name="USERTASKFRAME"]'
			WebElement lFrameB=null
			String lCurrentPage=this.driver.getCurrentUrl()
			WebElement lFrameA=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'iframe')
			this.driver.switchTo().frame(lFrameA)
			lFrameB=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorFrameB)
			this.driver.switchTo().frame(lFrameB)
			IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,'input[name=\'s_print_flag\']',1)
			String lLocatorReceiptNo='body input[name="s_receipt_no_fr"]'
			WebElement lElementReceiptNo=null
			lElementReceiptNo=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorReceiptNo)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementReceiptNo)){
				return lreturn
			}else{
				IGNUemaHelper.typeTextByWebElement(this.driver,lElementReceiptNo,'MMA19000001')
			}
			String lLocatorSearchBtn='body img[name="search"]'
			WebElement lElementSearchBtn=null
			lElementSearchBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSearchBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementSearchBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSearchBtn)
			}
			String lLocatorSelectedItem='body input[name="rs_chk"]'
			WebElement lElementSelectedItem=null
			lElementSelectedItem=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSelectedItem)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementSelectedItem)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSelectedItem)
			}
			String lLocatorReprintBtn='body img[id="Image1"]'
			WebElement lElementReprintBtn=null
			lElementReprintBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorReprintBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementReprintBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementReprintBtn)
			}
			IGNUemaHelper.delayThreadSecond(3)
			this.driver.switchTo().alert().accept()
			IGNUemaHelper.delayThreadSecond(30)
			Set<String> lSetWinHandleC=this.driver.getWindowHandles()
			for(String lWindowHandle:lSetWinHandleC){
				this.driver.switchTo().window(lWindowHandle)
			}
			this.driver.close()
			this.driver.switchTo().window(lMainPage)
			this.driver.switchTo().frame(lFrameA)
			String lLocatorTopFrame='frame[name="topFrame"]'
			WebElement lFrameTopFrame=null
			lFrameTopFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorTopFrame)
			if(IGNUemaHelper.checkObjectNullOfObject(lFrameTopFrame)){
				return lreturn
			}else{
				this.driver.switchTo().frame(lFrameTopFrame)
			}
			String lLocatorLogoutBtn='body a[href="JavaScript:setLogout()"]'
			WebElement lElementLogoutBtn=null
			lElementLogoutBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorLogoutBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementLogoutBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementLogoutBtn)
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean processReprint(List<String> listDocno,Integer numAll,Integer dataRowIndex,Integer numDocno){
		Boolean lreturn=false
		try{
			Boolean lIsReprintSuccess=false
			switch(this.DOCUMENT_TYPE_MODE){
				case 'Receipt':
					lIsReprintSuccess=this.processReprintA(listDocno,numAll,dataRowIndex,numDocno)
					break
				case 'Tax':
					lIsReprintSuccess=this.processReprintB(listDocno,numAll,dataRowIndex,numDocno)
					break
				default:
					lIsReprintSuccess=this.processReprintA(listDocno,numAll,dataRowIndex,numDocno)
					break
			}
			lreturn=lIsReprintSuccess
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean waitDownloaded(String strSrcFullFileName,String strNewfilename,String strDstFullFileName){
		Boolean lreturn=false
		String lSrcFullFileName=strSrcFullFileName.trim()
		if(lSrcFullFileName.length()<=0){
			return lreturn
		}
		String lNewfilename=strNewfilename.trim()
		if(lNewfilename.length()<=0){
			return lreturn
		}
		String lDstFullFileName=strDstFullFileName.trim()
		if(lDstFullFileName.length()<=0){
			return lreturn
		}
		try{
			Boolean lIsFileExistByStringResult=IGNUemaHelper.toDoFileExistByString(lSrcFullFileName)
			if(!lIsFileExistByStringResult){
				return lreturn
			}
			lDstFullFileName=lDstFullFileName+lNewfilename
			Boolean lIsFileMoveByStringResult=IGNUemaHelper.toDoFileMoveByString(lSrcFullFileName,lDstFullFileName,true)
			lreturn=lIsFileMoveByStringResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean fillDataInput(List<String> listDocno,TestData dataInput,Integer dataRowIndex,Integer numAll,Integer numDocno){
		Boolean lreturn=false
		String lInputDone=''
		try{
			lreturn=this.processReprint(listDocno,numAll,dataRowIndex,numDocno)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputSeletedReceiptA(){
		Boolean lreturn=false
		try{
			String lLocatorSubMenuBtn='body img[id="nodeIcon1"]'
			WebElement lElementSubMenuBtn=null
			String lLocatorReceiptMenuBtn='body img[id="itemIcon3"]'
			WebElement lElementReceiptMenuBtn=null
			lElementSubMenuBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSubMenuBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementSubMenuBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubMenuBtn)
			}
			lElementSubMenuBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorReceiptMenuBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementReceiptMenuBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementReceiptMenuBtn)
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputSeletedReceiptB(){
		Boolean lreturn=false
		try{
			String lLocatorReprintMenuBtn='body img[id="nodeIcon4"]'
			WebElement lElementReprintMenuBtn=null
			String lLocatorSubReprintMenuBtn='body img[id="nodeIcon9"]'
			WebElement lElementSubReprintMenuBtn=null
			String lLocatorReceiptMenuBtn='body img[id="itemIcon19"]'
			WebElement lElementReceiptMenuBtn=null
			lElementReprintMenuBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorReprintMenuBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementReprintMenuBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementReprintMenuBtn)
			}
			lElementSubReprintMenuBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorSubReprintMenuBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementSubReprintMenuBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubReprintMenuBtn)
			}
			lElementReceiptMenuBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorReceiptMenuBtn)
			if(IGNUemaHelper.checkObjectNullOfObject(lElementReceiptMenuBtn)){
				return lreturn
			}else{
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementReceiptMenuBtn)
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean processReprintA(List<String> listDocno,Integer numAll,Integer dataRowIndex,Integer numDocno){
		Boolean lreturn=false
		try{
			Boolean lIsErrorDialogDisplayed=false
			Boolean lIsUpdateOutputDataFileSuccess=false
			List<String> lListDocno=listDocno
			String lLocatorIFrame='body iframe[id="openDocChildFrame"]'
			WebElement lElementIFrame=null
			String lLocatorPrintOptionBtn='body img[id="IconImg_CrystalReportViewer_toptoolbar_export"]'
			WebElement lElementPrintOptionBtn=null
			String lLocatorPrintSelectOptionBtn='body div[id="IconImg_Txt_iconMenu_icon_CrystalReportViewer_exportUI_dialog_combo"]'
			WebElement lElementPrintSelectOptionBtn=null
			String lLocatorPDFSeletedOptionBtn='body td[id="iconMenu_menu_CrystalReportViewer_exportUI_dialog_combo_text_CrystalReportViewer_exportUI_dialog_combo_it_1"]'
			WebElement lElementPDFSeletedOptionBtn=null
			String lLocatorExportBtn='body a[id="theBttnCrystalReportViewer_exportUI_dialog_submitBtn"]'
			WebElement lElementExportBtn=null
			String lLocatorErrorDialog='body table[role="alertdialog"]'
			List<WebElement> lListElementErrorDialog=null
			String lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=24167950&promptex-receipt_no='+lListDocno.join(',')+'&promptex-master_flag=A&promptex-doc_type=D&promptex-double_flag=N&promptex-receipt_flag=Y'
			WebUI.navigateToUrl(lUrl)
			String lMainPage=this.driver.getWindowHandle()
			this.driver.switchTo().window(lMainPage)
			IGNUemaHelper.delayThreadSecond(30)
			lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
			this.driver.switchTo().frame(lElementIFrame)
			lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
			if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(!lIsErrorDialogDisplayed){
				lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
				lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
				lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
				lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
				IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
				lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(lIsErrorDialogDisplayed){
				for(String lDocno in lListDocno){
					lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=24167950&promptex-receipt_no='+lDocno+'&promptex-master_flag=A&promptex-doc_type=D&promptex-double_flag=N&promptex-receipt_flag=Y'
					WebUI.navigateToUrl(lUrl)
					IGNUemaHelper.delayThreadSecond(30)
					lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
					Boolean lIsIFrameReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorIFrame,5)
					if(lIsIFrameReady){
						this.driver.switchTo().frame(lElementIFrame)
						lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
						if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
							lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
						}
						if(!lIsErrorDialogDisplayed){
							lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
							lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
							lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
							lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
							IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
							lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
							lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
						}
						if(!lIsErrorDialogDisplayed){
							String lNewFileName=this.USERNAME+'_receipt_docno_'+lDocno+'.pdf'
							Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_RECEIPT_FULL_FILE_NAME)
							if(lIsMovedFileSuccess){
								lIsUpdateOutputDataFileSuccess=this.updateReceiptOutputDataFileB(numAll,numDocno,dataRowIndex,'Done',this.DST_RECEIPT_FULL_FILE_NAME+lNewFileName)
							}
						}
					}
				}
			}else{
				String lNewFileName=this.USERNAME+'_receipt_batch_'+REPRINT_COUNT.toString().padLeft(7,'0')+'.pdf'
				Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_RECEIPT_FULL_FILE_NAME)
				if(lIsMovedFileSuccess){
					this.REPRINT_COUNT++
					lIsUpdateOutputDataFileSuccess=this.updateReceiptOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_RECEIPT_FULL_FILE_NAME+lNewFileName)
				}
			}
			lreturn=lIsUpdateOutputDataFileSuccess
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean processReprintB(List<String> listDocno,Integer numAll,Integer dataRowIndex,Integer numDocno){
		Boolean lreturn=false
		try{
			Boolean lIsErrorDialogDisplayed=false
			Boolean lIsUpdateOutputDataFileSuccess=false
			List<String> lListDocno=listDocno
			String lLocatorIFrame='body iframe[id="openDocChildFrame"]'
			WebElement lElementIFrame=null
			String lLocatorPrintOptionBtn='body img[id="IconImg_CrystalReportViewer_toptoolbar_export"]'
			WebElement lElementPrintOptionBtn=null
			String lLocatorPrintSelectOptionBtn='body div[id="IconImg_Txt_iconMenu_icon_CrystalReportViewer_exportUI_dialog_combo"]'
			WebElement lElementPrintSelectOptionBtn=null
			String lLocatorPDFSeletedOptionBtn='body td[id="iconMenu_menu_CrystalReportViewer_exportUI_dialog_combo_text_CrystalReportViewer_exportUI_dialog_combo_it_1"]'
			WebElement lElementPDFSeletedOptionBtn=null
			String lLocatorExportBtn='body a[id="theBttnCrystalReportViewer_exportUI_dialog_submitBtn"]'
			WebElement lElementExportBtn=null
			String lLocatorErrorDialog='body table[role="alertdialog"]'
			List<WebElement> lListElementErrorDialog=null
			String lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=24162407&init=actx:connect&token=siamrpt14:6400@24330328JKwCVSKVDRJkSQ1KMNP4Ivi24330327J2LD3RlaoFJU0ruBZU40DP6&promptex-vat_no='+lListDocno.join(',')+'&promptex-doc_no=" "&promptex-group_no=" "&promptex-master_flag=Y&promptex-double_flag=N&promptex-receipt_flag=N&promptex-vat_type=" "&promptex-TIMESTAMPNEWGEN=20240305170355.133'
			WebUI.navigateToUrl(lUrl)
			String lMainPage=this.driver.getWindowHandle()
			this.driver.switchTo().window(lMainPage)
			IGNUemaHelper.delayThreadSecond(30)
			lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
			this.driver.switchTo().frame(lElementIFrame)
			lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
			if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(!lIsErrorDialogDisplayed){
				lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
				lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
				lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
				lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
				IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
				lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(lIsErrorDialogDisplayed){
				for(String lDocno in lListDocno){
					lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=24162407&init=actx:connect&token=siamrpt14:6400@24330328JKwCVSKVDRJkSQ1KMNP4Ivi24330327J2LD3RlaoFJU0ruBZU40DP6&promptex-vat_no='+lDocno+'&promptex-doc_no=" "&promptex-group_no=" "&promptex-master_flag=Y&promptex-double_flag=N&promptex-receipt_flag=N&promptex-vat_type=" "&promptex-TIMESTAMPNEWGEN=20240305170355.133'
					WebUI.navigateToUrl(lUrl)
					IGNUemaHelper.delayThreadSecond(30)
					lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
					Boolean lIsIFrameReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorIFrame,5)
					if(lIsIFrameReady){
						this.driver.switchTo().frame(lElementIFrame)
						lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
						if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
							lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
						}
						if(!lIsErrorDialogDisplayed){
							lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
							lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
							lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
							lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
							IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
							lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
							lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
						}
						if(!lIsErrorDialogDisplayed){
							String lNewFileName=this.USERNAME+'_tax_receipt_docno_'+lDocno+'.pdf'
							Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_TAX_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_TAX_RECEIPT_FULL_FILE_NAME)
							if(lIsMovedFileSuccess){
								lIsUpdateOutputDataFileSuccess=this.updateTaxReceiptOutputDataFileB(numAll,numDocno,dataRowIndex,'Done',this.DST_TAX_RECEIPT_FULL_FILE_NAME+lNewFileName)
							}
						}
					}
				}
			}else{
				String lNewFileName=this.USERNAME+'_tax_receipt_batch_'+REPRINT_COUNT.toString().padLeft(7,'0')+'.pdf'
				Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_TAX_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_TAX_RECEIPT_FULL_FILE_NAME)
				if(lIsMovedFileSuccess){
					this.REPRINT_COUNT++
					lIsUpdateOutputDataFileSuccess=this.updateTaxReceiptOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_TAX_RECEIPT_FULL_FILE_NAME+lNewFileName)
				}
			}
			lreturn=lIsUpdateOutputDataFileSuccess
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean processReprintReceiptAndTaxReceiptDocument(String strSerialNo,String strReceiptNo,Integer numAll,Integer dataRowIndex,Integer numDocno){
		Boolean lreturn=false
		try{
			Boolean lIsErrorDialogDisplayed=false
			Boolean lIsUpdateOutputDataFileSuccess=false
			String lSerialNo=strSerialNo
			String lReceiptNo=strReceiptNo
			String lLocatorIFrame='body iframe[id="openDocChildFrame"]'
			WebElement lElementIFrame=null
			String lLocatorPrintOptionBtn='body img[id="IconImg_CrystalReportViewer_toptoolbar_export"]'
			WebElement lElementPrintOptionBtn=null
			String lLocatorPrintSelectOptionBtn='body div[id="IconImg_Txt_iconMenu_icon_CrystalReportViewer_exportUI_dialog_combo"]'
			WebElement lElementPrintSelectOptionBtn=null
			String lLocatorPDFSeletedOptionBtn='body td[id="iconMenu_menu_CrystalReportViewer_exportUI_dialog_combo_text_CrystalReportViewer_exportUI_dialog_combo_it_1"]'
			WebElement lElementPDFSeletedOptionBtn=null
			String lLocatorExportBtn='body a[id="theBttnCrystalReportViewer_exportUI_dialog_submitBtn"]'
			WebElement lElementExportBtn=null
			String lLocatorErrorDialog='body table[role="alertdialog"]'
			List<WebElement> lListElementErrorDialog=null
			String lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=22459034&promptex-progid=IM206R03&promptex-mainclass=M&promptex-serial='+lSerialNo+'&promptex-endrst_srl=0&promptex-rp_receipt_no='+lReceiptNo
			WebUI.navigateToUrl(lUrl)
			String lMainPage=this.driver.getWindowHandle()
			this.driver.switchTo().window(lMainPage)
			IGNUemaHelper.delayThreadSecond(30)
			lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
			this.driver.switchTo().frame(lElementIFrame)
			lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
			if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(!lIsErrorDialogDisplayed){
				lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
				lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
				lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
				lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
				IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
				lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(lIsErrorDialogDisplayed){
				lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=22459034&promptex-progid=IM206R03&promptex-mainclass=M&promptex-serial='+lSerialNo+'&promptex-endrst_srl=0&promptex-rp_receipt_no='+lReceiptNo
				WebUI.navigateToUrl(lUrl)
				IGNUemaHelper.delayThreadSecond(30)
				lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
				Boolean lIsIFrameReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorIFrame,5)
				if(lIsIFrameReady){
					this.driver.switchTo().frame(lElementIFrame)
					lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
					if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
						lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
					}
					if(!lIsErrorDialogDisplayed){
						lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
						lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
						lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
						lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
						IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
						lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
						lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
					}
					if(!lIsErrorDialogDisplayed){
						String lNewFileName=this.USERNAME+'_receipt_and_tax_receipt_docno_'+lReceiptNo+'.pdf'
						Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_POLICY_SET_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_POLICY_SET_RECEIPT_FULL_FILE_NAME)
						if(lIsMovedFileSuccess){
							lIsUpdateOutputDataFileSuccess=this.updatePolicySetReceiptAndTaxReceiptOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_POLICY_SET_RECEIPT_FULL_FILE_NAME+lNewFileName)
						}
					}
				}
			}else{
				String lNewFileName=this.USERNAME+'_receipt_and_tax_receipt_docno_'+lReceiptNo+'.pdf'
				Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_POLICY_SET_RECEIPT_FULL_FILE_NAME,lNewFileName,this.DST_POLICY_SET_RECEIPT_FULL_FILE_NAME)
				if(lIsMovedFileSuccess){
					lIsUpdateOutputDataFileSuccess=this.updatePolicySetReceiptAndTaxReceiptOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_POLICY_SET_RECEIPT_FULL_FILE_NAME+lNewFileName)
				}
			}
			lIsUpdateOutputDataFileSuccess=true
			lreturn=lIsUpdateOutputDataFileSuccess
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean processReprintPolicyDocument(String strSerialNo,Integer numAll,Integer dataRowIndex,Integer numDocno){
		Boolean lreturn=false
		try{
			Boolean lIsErrorDialogDisplayed=false
			Boolean lIsUpdateOutputDataFileSuccess=false
			String lSerialNo=strSerialNo
			String lLocatorIFrame='body iframe[id="openDocChildFrame"]'
			WebElement lElementIFrame=null
			String lLocatorPrintOptionBtn='body img[id="IconImg_CrystalReportViewer_toptoolbar_export"]'
			WebElement lElementPrintOptionBtn=null
			String lLocatorPrintSelectOptionBtn='body div[id="IconImg_Txt_iconMenu_icon_CrystalReportViewer_exportUI_dialog_combo"]'
			WebElement lElementPrintSelectOptionBtn=null
			String lLocatorPDFSeletedOptionBtn='body td[id="iconMenu_menu_CrystalReportViewer_exportUI_dialog_combo_text_CrystalReportViewer_exportUI_dialog_combo_it_1"]'
			WebElement lElementPDFSeletedOptionBtn=null
			String lLocatorExportBtn='body a[id="theBttnCrystalReportViewer_exportUI_dialog_submitBtn"]'
			WebElement lElementExportBtn=null
			String lLocatorErrorDialog='body table[role="alertdialog"]'
			List<WebElement> lListElementErrorDialog=null
			String lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=13716025&promptex-progid=IM204RCP&promptex-mainclass=M&promptex-serial='+lSerialNo+'&promptex-endrst_srl=0&promptex-rec_no=0&promptex-message2=OLD&promptex-sample=N'
			WebUI.navigateToUrl(lUrl)
			String lMainPage=this.driver.getWindowHandle()
			this.driver.switchTo().window(lMainPage)
			IGNUemaHelper.delayThreadSecond(30)
			lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
			this.driver.switchTo().frame(lElementIFrame)
			lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
			if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(!lIsErrorDialogDisplayed){
				lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
				lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
				lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
				lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
				IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
				lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
				lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
			}
			if(lIsErrorDialogDisplayed){
				lUrl='http://192.168.150.3:8080/BOE/OpenDocument/opendoc/openDocument.jsp?iDocID=13716025&promptex-progid=IM204RCP&promptex-mainclass=M&promptex-serial='+lSerialNo+'&promptex-endrst_srl=0&promptex-rec_no=0&promptex-message2=OLD&promptex-sample=N'
				WebUI.navigateToUrl(lUrl)
				IGNUemaHelper.delayThreadSecond(30)
				lElementIFrame=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorIFrame)
				Boolean lIsIFrameReady=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorIFrame,5)
				if(lIsIFrameReady){
					this.driver.switchTo().frame(lElementIFrame)
					lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
					if(!IGNUemaHelper.checkObjectNullOfObject(lListElementErrorDialog)){
						lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
					}
					if(!lIsErrorDialogDisplayed){
						lElementPrintOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintOptionBtn)
						lElementPrintSelectOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPrintSelectOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPrintSelectOptionBtn)
						lElementPDFSeletedOptionBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDFSeletedOptionBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPDFSeletedOptionBtn)
						lElementExportBtn=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorExportBtn)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementExportBtn)
						IGNUemaHelper.delayThreadSecond(this.WAITING_SECOND_TIME)
						lListElementErrorDialog=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,lLocatorErrorDialog)
						lIsErrorDialogDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lListElementErrorDialog[1])
					}
					if(!lIsErrorDialogDisplayed){
						String lNewFileName=this.USERNAME+'_serial_docno_'+strSerialNo+'.pdf'
						Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_POLICY_SET_POLICY_FULL_FILE_NAME,lNewFileName,this.DST_POLICY_SET_POLICY_FULL_FILE_NAME)
						if(lIsMovedFileSuccess){
							lIsUpdateOutputDataFileSuccess=this.updatePolicySetPolicyOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_POLICY_SET_POLICY_FULL_FILE_NAME+lNewFileName)
						}
					}
				}
			}else{
				String lNewFileName=this.USERNAME+'_serial_docno_'+strSerialNo+'.pdf'
				Boolean lIsMovedFileSuccess=this.waitDownloaded(this.SRC_POLICY_SET_POLICY_FULL_FILE_NAME,lNewFileName,this.DST_POLICY_SET_POLICY_FULL_FILE_NAME)
				if(lIsMovedFileSuccess){
					lIsUpdateOutputDataFileSuccess=this.updatePolicySetPolicyOutputDataFileA(numAll,numDocno,dataRowIndex,'Done',this.DST_POLICY_SET_POLICY_FULL_FILE_NAME+lNewFileName)
				}
			}
			lIsUpdateOutputDataFileSuccess=true
			lreturn=lIsUpdateOutputDataFileSuccess
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateReceiptOutputDataFileA(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_RECEIPT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_RECEIPT_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_STATUS,lDocumentStatus)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_FILE,lDocumentName)
			}
			ExcelKeywords.setValueToCellByIndex(xlsSheet,1,this.INPUT_EXCEL_COL_DOC_COUNT,REPRINT_COUNT)
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_RECEIPT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateReceiptOutputDataFileB(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			String lDataDocNoText=''
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_RECEIPT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_RECEIPT_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				lDataDocNoText=lDataInput.getValue(this.INPUT_DATA_COL_DOC_NO,lRowIndex).trim()
				if(lDocumentName.contains(lDataDocNoText)){
					ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_STATUS,lDocumentStatus)
					ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_FILE,lDocumentName)
					break
				}
			}
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_RECEIPT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateTaxReceiptOutputDataFileA(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_TAX_RECEIPT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_TAX_RECEIPT_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_STATUS,lDocumentStatus)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_FILE,lDocumentName)
			}
			ExcelKeywords.setValueToCellByIndex(xlsSheet,1,this.INPUT_EXCEL_COL_DOC_COUNT,REPRINT_COUNT)
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_TAX_RECEIPT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateTaxReceiptOutputDataFileB(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			String lDataDocNoText=''
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_TAX_RECEIPT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_TAX_RECEIPT_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				lDataDocNoText=lDataInput.getValue(this.INPUT_DATA_COL_DOC_NO,lRowIndex).trim()
				if(lDocumentName.contains(lDataDocNoText)){
					ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_STATUS,lDocumentStatus)
					ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_EXCEL_COL_DOC_FILE,lDocumentName)
					break
				}
			}
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_TAX_RECEIPT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updatePolicySetPolicyOutputDataFileA(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_POLICY_SET_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_POLICY_SET_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_POLICY_SET_SERIAL_EXCEL_COL_DOC_STATUS,lDocumentStatus)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_POLICY_SET_SERIAL_EXCEL_COL_DOC_FILE,lDocumentName)
			}
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_POLICY_SET_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updatePolicySetReceiptAndTaxReceiptOutputDataFileA(Integer numAll,Integer numDocno,Integer dataRowIndex,String strDocumentStatus,String strDocumentName){
		Boolean lreturn=false
		String lDocumentStatus=strDocumentStatus.trim()
		if(lDocumentStatus.length()<=0){
			return lreturn
		}
		String lDocumentName=strDocumentName.trim()
		if(lDocumentName.length()<=0){
			return lreturn
		}
		try{
			Integer lRowIndex=(numAll-numDocno)+1
			Integer lRowCount=(numDocno+(numAll-numDocno))
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_POLICY_SET_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_POLICY_SET_EXCEL_SHEET_NAME)
			for(lRowIndex;lRowIndex<=lRowCount;lRowIndex++){
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_POLICY_SET_RECEIPT_EXCEL_COL_DOC_STATUS,lDocumentStatus)
				ExcelKeywords.setValueToCellByIndex(xlsSheet,lRowIndex,this.INPUT_POLICY_SET_RECEIPT_EXCEL_COL_DOC_FILE,lDocumentName)
			}
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_POLICY_SET_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}