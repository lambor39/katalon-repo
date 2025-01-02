package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.googlecode.javacv.cpp.swscale
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiCovidTIPInputUtil{
	public static final String BASE_URL='https://tt.tipinsure.com/banc/submain_frame.jsp'
	public static final String FORM_URL='https://tt.tipinsure.com/banc/createPolicyPAAction.do?method=start&policytype=MSHA_NCOV'
	public static final String INPUT_DATA_FILE_NAME='Data Files/Release_UAT/Roojai/THA/RoojaiCovid/RoojaiCovid_TIP_01_Input'
	public static final String INPUT_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_RoojaiCovid_TIP.xlsx'
	public static final String INPUT_EXCEL_SHEET_NAME='RoojaiCovid_TIP'
	public static final Integer INPUT_DATA_ROW_BEGIN=1
	public static final Integer INPUT_DATA_COL_POLICY=2
	public static final Integer INPUT_EXCEL_COL_POLICY=1
	public static final Integer INPUT_EXCEL_COL_DOWNLOAD=25
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiCovidTIPInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
				lDataText=dataInput.getValue(this.INPUT_DATA_COL_POLICY,lRowIndex).trim()
				if(lDataText.length()<=0){
					lToProcess=true
					break
				}
			}
			if(!lToProcess){
				lMessage='No Row To Process'
				lreturn.put('Message',lMessage)
				return lreturn
			}
			//Processing
			lDataText=''
			Boolean lIsFilled=false
			Integer lNumAll=0
			Integer lNumPass=0
			Integer lNumFail=0
			Integer lNumSkip=0
			for(lRowIndex=this.INPUT_DATA_ROW_BEGIN;lRowIndex<=lRowCount;lRowIndex++){
				lNumAll++
				lDataText=dataInput.getValue(this.INPUT_DATA_COL_POLICY,lRowIndex).trim()
				if(lDataText.length()<=0){
					lIsFilled=this.fillDataInput(dataInput,lRowIndex)
					if(lIsFilled){
						lNumPass++
					}else{
						lNumFail++
					}
				}else{
					lNumSkip++
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
	public Boolean fillDataInput(TestData dataInput,Integer dataRowIndex){
		Boolean lreturn=false
		String lInput01=dataInput.getValue(17,dataRowIndex).trim()//Plan Type
		String lInput02=dataInput.getValue(15,dataRowIndex).trim()//Contract Start Date
		String lInput03=dataInput.getValue(16,dataRowIndex).trim()//Contract End Date
		String lInput04=dataInput.getValue(7,dataRowIndex).trim()//KPI Report Gender
		String lInput05=dataInput.getValue(3,dataRowIndex).trim()//First Name
		String lInput06=dataInput.getValue(4,dataRowIndex).trim()//Last Name
		String lInput07=dataInput.getValue(5,dataRowIndex).trim()//KPI Report ID Card
		String lInput08=dataInput.getValue(6,dataRowIndex).trim()//Person Account: Birthdate
		String lInput09=dataInput.getValue(9,dataRowIndex).trim()//House Number/Building Number
		String lInput10=dataInput.getValue(8,dataRowIndex).trim()//Village / Building
		String lInput11=dataInput.getValue(10,dataRowIndex).trim()//Soi / Road
		String lInput12=dataInput.getValue(13,dataRowIndex).trim()//Province
		String lInput13=dataInput.getValue(12,dataRowIndex).trim()//District print
		String lInput14=dataInput.getValue(11,dataRowIndex).trim()//Sub district print
		String lInput15=dataInput.getValue(14,dataRowIndex).trim()//Postal code print
		String lInput16=dataInput.getValue(24,dataRowIndex).trim()//Active Email
		String lInput17=dataInput.getValue(18,dataRowIndex).trim()//Beneficiary Name
		String lInput18=dataInput.getValue(19,dataRowIndex).trim()//Beneficiary Name only
		String lInput19=dataInput.getValue(20,dataRowIndex).trim()//Beneficiary SurName
		String lInput20=dataInput.getValue(22,dataRowIndex).trim()//Beneficiary Relationship Code
		String lInput21=''
		String lInputDone=''
		lreturn=this.updateDataPolicyNo(dataRowIndex,'OK')
		return lreturn
		try{
			this.driver.get(this.FORM_URL)
			lInput01=this.inputInput01(lInput01)
			if(lInput01.length()<=0){
				return lreturn
			}
			lInput02=this.inputInput02(lInput02)
			if(lInput02.length()<=0){
				return lreturn
			}
			lInput03=this.inputInput03(lInput03)
			if(lInput03.length()<=0){
				return lreturn
			}
			lInput04=this.inputInput04(lInput04)
			if(lInput04.length()<=0){
				return lreturn
			}
			lInput05=this.inputInput05(lInput05)
			if(lInput05.length()<=0){
				return lreturn
			}
			lInput06=this.inputInput06(lInput06)
			if(lInput06.length()<=0){
				return lreturn
			}
			lInput07=this.inputInput07(lInput07)
			if(lInput07.length()<=0){
				return lreturn
			}
			lInput08=this.inputInput08(lInput08)
			if(lInput08.length()<=0){
				return lreturn
			}
			lInput09=this.inputInput09(lInput09)
			if(lInput09.length()<=0){
				return lreturn
			}
			lInput10=this.inputInput10(lInput10)
			if(lInput10.length()<=0){
				//return lreturn
			}
			lInput11=this.inputInput11(lInput11)
			if(lInput11.length()<=0){
				//return lreturn
			}
			lInput12=this.inputInput12(lInput12)
			if(lInput12.length()<=0){
				return lreturn
			}
			lInput13=this.inputInput13(lInput13)
			if(lInput13.length()<=0){
				return lreturn
			}
			lInput14=this.inputInput14(lInput14)
			if(lInput14.length()<=0){
				return lreturn
			}
			lInput15=this.inputInput15(lInput15)
			if(lInput15.length()<=0){
				return lreturn
			}
			lInput16=this.inputInput16(lInput16)
			if(lInput16.length()<=0){
				//return lreturn
			}
			lInput17=this.inputInput17(lInput17)
			if(lInput17.length()<=0){
				return lreturn
			}
			Boolean lIsBeneficiary=IGNUemaHelper.convertStringToBoolean(lInput17)
			if(lIsBeneficiary){
				lInput18=this.inputInput18(lInput18)
				if(lInput18.length()<=0){
					return lreturn
				}
				lInput19=this.inputInput19(lInput19)
				if(lInput19.length()<=0){
					return lreturn
				}
				lInput20=this.inputInput20(lInput20)
				if(lInput20.length()<=0){
					return lreturn
				}
				lInput21=this.inputInput21(IGNUemaHelper.convertStringToInteger(lInput20,10))
				if(lInput21.length()<=0){
					//return lreturn
				}
			}
			lInputDone=this.inputDone(dataRowIndex)
			if(lInputDone.length()<=0){
				return lreturn
			}
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateDataPolicyNo(Integer dataRowIndex,String strPolicyNo){
		Boolean lreturn=false
		String lPolicyNo=strPolicyNo.trim()
		if(lPolicyNo.length()<=0){
			return lreturn
		}
		try{
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_EXCEL_SHEET_NAME)
			ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,this.INPUT_EXCEL_COL_POLICY,lPolicyNo)
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean updateDataDownload(Integer dataRowIndex){
		Boolean lreturn=false
		try{
			def xlsWorkbook=ExcelKeywords.getWorkbook(this.INPUT_EXCEL_FILE_NAME)
			def xlsSheet=ExcelKeywords.getExcelSheet(xlsWorkbook,this.INPUT_EXCEL_SHEET_NAME)
			ExcelKeywords.setValueToCellByIndex(xlsSheet,dataRowIndex,this.INPUT_EXCEL_COL_DOWNLOAD,'Downloaded')
			IGNUemaHelper.saveExcelWorkbookByFileName(this.INPUT_EXCEL_FILE_NAME,xlsWorkbook)
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput01(String strInput01){
		String lreturn=''
		String lInput01=strInput01.trim()
		if(lInput01.length()<=0){
			return lreturn
		}
		Boolean lIsType3=lInput01.contains('3')
		try{
			WebElement lDropdownButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#slProduct')
			if(!lDropdownButton){
				return lreturn
			}
			Select lSelect=new Select(lDropdownButton)
			if(!lSelect){
				return lreturn
			}
			List<WebElement> lDropdownItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#slProduct option')
			if(!lDropdownItemList){
				return lreturn
			}
			String lValue=''
			String lText=''
			for(WebElement lDropdownItem in lDropdownItemList){
				lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lDropdownItem,'value')
				lText=lDropdownItem.getText()
				if(lValue.length()>0){
					if(lIsType3){
						if(lText.contains('แผน 3')){
							lSelect.selectByValue(lValue)
							lreturn=lText
							break
						}
					}else{
						if(lText.contains('แผน 4')){
							lSelect.selectByValue(lValue)
							lreturn=lText
							break
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput02(String strInput02){
		String lreturn=''
		String lInput02=strInput02.trim()
		if(lInput02.length()<=0){
			return lreturn
		}
		try{
			String lText=IGNUemaHelper.convertDateStringFromEngToThai(lInput02)
			WebElement lInputDate=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#startdate')
			if(!lInputDate){
				return lreturn
			}
			WebElement lInputTime=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#starttime')
			if(!lInputTime){
				return lreturn
			}
			//((JavascriptExecutor)this.driver).executeScript('arguments[0].value="'+lText+'";',lInputDate)
			lreturn=((JavascriptExecutor)this.driver).executeScript('return arguments[0].value;',lInputDate)
			IGNUemaHelper.typeTextByWebElement(this.driver,lInputTime,'00:00')
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput03(String strInput03){
		String lreturn=''
		String lInput03=strInput03.trim()
		if(lInput03.length()<=0){
			return lreturn
		}
		try{
			String lText=IGNUemaHelper.convertDateStringFromEngToThai(lInput03)
			WebElement lInputDate=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > fieldset > table > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td:nth-child(5) > input[type=text]:nth-child(1)')
			if(!lInputDate){
				return lreturn
			}
			WebElement lInputTime=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#endtime')
			if(!lInputTime){
				return lreturn
			}
			//((JavascriptExecutor)this.driver).executeScript('arguments[0].value="'+lText+'";',lInputDate)
			lreturn=((JavascriptExecutor)this.driver).executeScript('return arguments[0].value;',lInputDate)
			IGNUemaHelper.typeTextByWebElement(this.driver,lInputTime,'23:59')
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput04(String strInput04){
		String lreturn=''
		String lInput04=strInput04.trim()
		if(lInput04.length()<=0){
			return lreturn
		}
		Boolean lIsMale=lInput04.contains('M')
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#p1 > td:nth-child(2) > input[type=text]:nth-child(1)')
			if(!lInputText){
				return lreturn
			}
			if(lIsMale){
				lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,'3')
			}else{
				lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,'2')
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput05(String strInput05){
		String lreturn=''
		String lInput05=strInput05.trim()
		if(lInput05.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#p1 > td:nth-child(4) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput05)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput06(String strInput06){
		String lreturn=''
		String lInput06=strInput06.trim()
		if(lInput06.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#p1 > td:nth-child(6) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput06)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput07(String strInput07){
		String lreturn=''
		String lInput07=strInput07.trim()
		if(lInput07.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=null
			if(lInput07.length()<13){
				lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#p2 > td:nth-child(4) > input[type=text]')
			}else{
				lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#p2 > td:nth-child(2) > input[type=text]')
			}
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput07)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput08(String strInput08){
		String lreturn=''
		String lInput08=strInput08.trim()
		if(lInput08.length()<=0){
			return lreturn
		}
		try{
			String lText=IGNUemaHelper.convertDateStringFromEngToThai(lInput08)
			WebElement lInputDate=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#dateofbirth')
			if(!lInputDate){
				return lreturn
			}
			((JavascriptExecutor)this.driver).executeScript('arguments[0].value="'+lText+'";',lInputDate)
			lreturn=((JavascriptExecutor)this.driver).executeScript('return arguments[0].value;',lInputDate)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput09(String strInput09){
		String lreturn=''
		String lInput09=strInput09.trim()
		if(lInput09.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput09)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput10(String strInput10){
		String lreturn=''
		String lInput10=strInput10.trim()
		if(lInput10.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(8) > td:nth-child(6) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput10)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput11(String strInput11){
		String lreturn=''
		String lInput11=strInput11.trim()
		if(lInput11.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(9) > td:nth-child(4) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput11)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput12(String strInput12){
		String lreturn=''
		String lInput12=strInput12.trim()
		if(lInput12.length()<=0){
			return lreturn
		}
		try{
			String lSearchStr=lInput12
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lLookupButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#findprovince')
			if(!lLookupButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lLookupButton)){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						WebElement lSearchText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#keyword0')
						if(lSearchText){
							IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lSearchText,lSearchStr)
						}
						List<WebElement> lItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#frame > table > tbody > tr')
						if(!lItemList){
							return lreturn
						}
						String lValue=''
						String lText=''
						Boolean lFound=false
						for(WebElement lItem in lItemList){
							lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lItem,'value')
							lText=lItem.getText()
							lFound=lText.contains(lSearchStr)
							if(lFound){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lItem)
								break
							}
						}
						try{
							if(!lFound){
								this.driver.close()
							}
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(9) > td:nth-child(6) > input[type=text]:nth-child(4)')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lSearchStr)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput13(String strInput13){
		String lreturn=''
		String lInput13=strInput13.trim()
		if(lInput13.length()<=0){
			return lreturn
		}
		try{
			String lSearchStr=lInput13
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lLookupButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#finddistrict')
			if(!lLookupButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lLookupButton)){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						WebElement lSearchText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#keyword0')
						if(lSearchText){
							IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lSearchText,lSearchStr)
						}
						List<WebElement> lItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#frame > table > tbody > tr')
						if(!lItemList){
							return lreturn
						}
						String lValue=''
						String lText=''
						Boolean lFound=false
						for(WebElement lItem in lItemList){
							lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lItem,'value')
							lText=lItem.getText()
							lFound=lText.contains(lSearchStr)
							if(lFound){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lItem)
								break
							}
						}
						try{
							if(!lFound){
								this.driver.close()
							}
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]:nth-child(4)')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lSearchStr)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput14(String strInput14){
		String lreturn=''
		String lInput14=strInput14.trim()
		if(lInput14.length()<=0){
			return lreturn
		}
		try{
			String lSearchStr=lInput14
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lLookupButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#findsubdistrict')
			if(!lLookupButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lLookupButton)){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						WebElement lSearchText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#keyword0')
						if(lSearchText){
							IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lSearchText,lSearchStr)
						}
						List<WebElement> lItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#frame > table > tbody > tr')
						if(!lItemList){
							return lreturn
						}
						String lValue=''
						String lText=''
						Boolean lFound=false
						for(WebElement lItem in lItemList){
							lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lItem,'value')
							lText=lItem.getText()
							lFound=lText.contains(lSearchStr)
							if(lFound){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lItem)
								break
							}
						}
						try{
							if(!lFound){
								this.driver.close()
							}
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(10) > td:nth-child(4) > input[type=text]:nth-child(4)')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lSearchStr)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput15(String strInput15){
		String lreturn=''
		String lInput15=strInput15.trim()
		if(lInput15.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(10) > td:nth-child(6) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput15)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput16(String strInput16){
		String lreturn=''
		String lInput16=strInput16.trim()
		if(lInput16.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableeditcustomer > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput16)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput17(String strInput17){
		String lreturn=''
		String lInput17=strInput17.toLowerCase().trim()
		if(lInput17.length()<=0){
			return lreturn
		}
		try{
			String lTxt1='Legal'
			String lTxt2='Heir'
			lTxt1=lTxt1.toLowerCase().trim()
			lTxt2=lTxt2.toLowerCase().trim()
			Boolean lIsBeneficiary=!(lInput17.contains(lTxt1)&&lInput17.contains(lTxt2))
			if(lIsBeneficiary){
				WebElement lRadioButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > fieldset > table > tbody > tr:nth-child(3) > td:nth-child(1) > div > input[type=radio]')
				if(!lRadioButton){
					return lreturn
				}
				if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lRadioButton)){
					return lreturn
				}
			}else{
				WebElement lRadioButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > fieldset > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > input[type=radio]')
				if(!lRadioButton){
					return lreturn
				}
				if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lRadioButton)){
					return lreturn
				}
			}
			lreturn=IGNUemaHelper.convertBooleanToString(lIsBeneficiary)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput18(String strInput18){
		String lreturn=''
		String lInput18=strInput18.trim()
		if(lInput18.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#benefp1 > td:nth-child(4) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput18)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput19(String strInput19){
		String lreturn=''
		String lInput19=strInput19.trim()
		if(lInput19.length()<=0){
			return lreturn
		}
		try{
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#benefp1 > td:nth-child(6) > input[type=text]')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lInput19)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput20(String strInput20){
		String lreturn=''
		String lInput20=IGNUemaHelper.convertStringToInteger(strInput20.trim(),10).toString()
		if(lInput20.length()<=0){
			return lreturn
		}
		try{
			String lSearchStr=lInput20
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lLookupButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#findforelation')
			if(!lLookupButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lLookupButton)){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						List<WebElement> lItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#frame > table > tbody > tr')
						if(!lItemList){
							return lreturn
						}
						String lValue=''
						String lText=''
						Boolean lFound=false
						for(WebElement lItem in lItemList){
							lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lItem,'value')
							lText=lItem.getText()
							lFound=lText.contains(lSearchStr)
							if(lFound){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lItem)
								break
							}
						}
						try{
							if(!lFound){
								this.driver.close()
							}
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > fieldset > table > tbody > tr:nth-child(6) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=text]:nth-child(1)')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lSearchStr)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputInput21(Integer intInput21){
		String lreturn=''
		String lInput21=''
		switch(intInput21){
			case 1: case 3: case 5: case 6: case 10:
				lInput21='นาย'
				break
			default: lInput21='น.ส.'
				break
		}
		if(lInput21.length()<=0){
			return lreturn
		}
		try{
			String lSearchStr=lInput21
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lLookupButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#findfotitle')
			if(!lLookupButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lLookupButton)){
				return lreturn
			}
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(1)
						WebElement lSearchText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#keyword0')
						if(lSearchText){
							IGNUemaHelper.typeTextWithEnterByWebElement(this.driver,lSearchText,lSearchStr)
						}
						List<WebElement> lItemList=IGNUemaHelper.getWebElementListFromCssLocator(this.driver,'#frame > table > tbody > tr')
						if(!lItemList){
							return lreturn
						}
						String lValue=''
						String lText=''
						Boolean lFound=false
						for(WebElement lItem in lItemList){
							lValue=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lItem,'value')
							lText=lItem.getText()
							lFound=lText.contains(lSearchStr)
							if(lFound){
								IGNUemaHelper.clickByWebElementWithScroll(this.driver,lItem)
								break
							}
						}
						try{
							if(!lFound){
								this.driver.close()
							}
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#benefp1 > td:nth-child(2) > input[type=text]:nth-child(1)')
			if(!lInputText){
				return lreturn
			}
			lreturn=IGNUemaHelper.typeTextWithTabByWebElement(this.driver,lInputText,lSearchStr)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String inputDone(Integer dataRowIndex){
		String lreturn=''
		try{
			WebElement lCheckButton1=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(6) > td > fieldset > table > tbody > tr:nth-child(2) > td:nth-child(2) > span:nth-child(1) > input[type=checkbox]')
			if(!lCheckButton1){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lCheckButton1)){
				return lreturn
			}
			WebElement lCheckButton2=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#tableMain > tbody > tr > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(7) > td > fieldset > table > tbody > tr:nth-child(1) > td:nth-child(2) > span > input[type=checkbox]')
			if(!lCheckButton2){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lCheckButton2)){
				return lreturn
			}
			String lMainWindow=this.driver.getWindowHandle()
			WebElement lSaveAndPrintButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'#save_show')
			if(!lSaveAndPrintButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lSaveAndPrintButton)){
				return lreturn
			}
			IGNUemaHelper.delayThreadSecond(3)
			WebElement lOKButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'body > div:nth-child(4) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button')
			if(!lOKButton){
				return lreturn
			}
			if(!IGNUemaHelper.clickByWebElementWithScroll(this.driver,lOKButton)){
				return lreturn
			}
			WebElement lInputText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,'body > form > table > tbody > tr > td > fieldset > table > tbody > tr:nth-child(3) > td')
			if(!lInputText){
				return lreturn
			}
			lreturn=lInputText.getText()
			Boolean lIsSave=this.updateDataPolicyNo(dataRowIndex,lreturn)
			IGNUemaHelper.delayThreadSecond(2)
			try{
				Set<String> lSetWinHandle=this.driver.getWindowHandles()
				for(String lWindowHandle:lSetWinHandle){
					if(!lMainWindow.equals(lWindowHandle)){
						this.driver.switchTo().window(lWindowHandle)
						IGNUemaHelper.delayThreadSecond(3)
						try{
							this.driver.close()
							WebUI.switchToDefaultContent()
							this.driver.switchTo().window(lMainWindow)
						}catch(Exception exx){
							this.driver.switchTo().window(lMainWindow)
						}
					}
				}
			}catch(Exception ex){
				try{
					WebUI.switchToDefaultContent()
					this.driver.switchTo().window(lMainWindow)
				}catch(Exception exx){
					this.driver.switchTo().window(lMainWindow)
				}
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}