package org.roojai.tha.types.roojaicovid
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiCovidQuotationPaymentUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THARoojaiCovidQuotationPaymentUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public String inputLanguage(String strLanguage){
		String lreturn=''
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THARoojaiCovidQuotationPaymentType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			String lResultText=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lResultText='No Option'
			}else{
				lResultText=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
			}
			lreturn=lResultText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputPayment(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCcNumber=caseInput.CcNumber.toString().trim()
		String lCcName=caseInput.CcName.toString().trim()
		String lCcExpiryMonth=caseInput.CcExpiryMonth.toString().trim()
		String lCcExpiryYear=caseInput.CcExpiryYear.toString().trim()
		String lCcCvv=caseInput.CcCvv.toString().trim()
		String lCcBank=caseInput.CcBank.toString().trim()
		String lCcSuccessCase=caseInput.CcSuccessCase.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyDetail=''
		String lSummaryPrice=''
		String lPolicyInsurer=''
		try{
			Map lMapPositiveCase=this.inputPositiveCase(lPositiveCase)
			if(!lMapPositiveCase.Result){
				lPositiveCase=''
			}else{
				lPositiveCase=lMapPositiveCase.PositiveCase
			}
			caseOutput.PositiveCase=lPositiveCase
			if(lPositiveCase.length()<=0){
				return lreturn
			}
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
			if(!lMapPolicyInsurer.Result){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
			}
			caseOutput.PolicyInsurer=lPolicyInsurer
			Map lMapPolicyDetail=this.inputPolicyDetail(lPolicyDetail)
			if(!lMapPolicyDetail.Result){
				lPolicyDetail=''
			}else{
				lPolicyDetail=lMapPolicyDetail.PolicyDetail
			}
			caseOutput.PolicyDetail=lPolicyDetail
			if(lPolicyDetail.length()<=0){
				return lreturn
			}
			Map lMapSummaryPrice=this.inputSummaryPrice(lSummaryPrice)
			if(!lMapSummaryPrice.Result){
				lSummaryPrice=''
			}else{
				lSummaryPrice=lMapSummaryPrice.SummaryPrice
			}
			caseOutput.SummaryPrice=lSummaryPrice
			if(lSummaryPrice.length()<=0){
				return lreturn
			}
			Map lMapPaymentByCC=this.inputPaymentByCC(lCcNumber,lCcName,lCcExpiryMonth,lCcExpiryYear,lCcCvv,lCcBank,lCcSuccessCase)
			if(!lMapPaymentByCC.Result){
				lCcNumber=''
				lCcName=''
				lCcExpiryMonth=''
				lCcExpiryYear=''
				lCcCvv=''
				lCcBank=''
				lCcSuccessCase=''
			}else{
				lCcNumber=lMapPaymentByCC.CcNumber
				lCcName=lMapPaymentByCC.CcName
				lCcExpiryMonth=lMapPaymentByCC.CcExpiryMonth
				lCcExpiryYear=lMapPaymentByCC.CcExpiryYear
				lCcCvv=lMapPaymentByCC.CcCvv
				lCcBank=lMapPaymentByCC.CcBank
				lCcSuccessCase=lMapPaymentByCC.CcSuccessCase
			}
			caseOutput.CcNumber=lCcNumber
			caseOutput.CcName=lCcName
			caseOutput.CcExpiryMonth=lCcExpiryMonth
			caseOutput.CcExpiryYear=lCcExpiryYear
			caseOutput.CcCvv=lCcCvv
			caseOutput.CcBank=lCcBank
			caseOutput.CcSuccessCase=lCcSuccessCase
			if(!lMapPaymentByCC.Result){
				return lreturn
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String	lPolicyInsurer=strPolicyInsurer.trim()
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			lPolicyInsurer=''
			String lTagButton=''
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer=''
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=lPolicyInsurer.length()>0
			if(lResult){
				lreturn.put('PolicyInsurer',lPolicyInsurer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyDetail(String strPolicyDetail){
		Map lreturn=[:]
		String lPolicyDetail=strPolicyDetail.trim()
		try{
			Boolean lResult=false
			lreturn.put('PolicyDetail','')
			lreturn.put('Result',lResult)
			lPolicyDetail=''
			String lTagPolicyDetailButtonOpen='covid-modal-btn'
			String lLocatorPolicyDetailButtonOpen=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailButtonOpen)
			WebElement lElementPolicyDetailButtonOpen=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailButtonOpen)
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPolicyDetailButtonOpen)
			IGNUemaHelper.delayThreadSecond(1)
			String lTagPolicyDetailInfo='covid-modal'
			String lLocatorPolicyDetailInfo=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailInfo)
			WebElement lElementPolicyDetailInfo=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailInfo)
			if(lElementPolicyDetailInfo){
				lPolicyDetail=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementPolicyDetailInfo)
				String lTagPolicyDetailButtonClose='covid-modal-close-btn'
				String lLocatorPolicyDetailButtonClose=IGNUemaHelper.getTagDataSeleniumKey(lTagPolicyDetailButtonClose)
				WebElement lElementPolicyDetailButtonClose=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPolicyDetailButtonClose)
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementPolicyDetailButtonClose)
			}
			lResult=lPolicyDetail.length()>0
			if(lResult){
				lreturn.put('PolicyDetail',lPolicyDetail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSummaryPrice(String strSummaryPrice){
		Map lreturn=[:]
		String lSummaryPrice=strSummaryPrice.trim()
		try{
			Boolean lResult=false
			lreturn.put('SummaryPrice','')
			lreturn.put('Result',lResult)
			lSummaryPrice=''
			String lTagSummaryPrice='summaryPrice'
			String lLocatorSummaryPrice=IGNUemaHelper.getTagDataSeleniumKey(lTagSummaryPrice)
			WebElement lElementSummaryPrice=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSummaryPrice)
			if(!lElementSummaryPrice){
				lSummaryPrice=''
			}else{
				lSummaryPrice=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSummaryPrice)
			}
			lResult=lSummaryPrice.length()>0
			if(lResult){
				lreturn.put('SummaryPrice',lSummaryPrice)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPaymentByCC(String strCcNumber,String strCcName,String strCcExpiryMonth,String strCcExpiryYear,String strCcCvv,String strCcBank,String strCcSuccessCase){
		Map lreturn=[:]
		String lCcNumber=strCcNumber.trim()
		if(lCcNumber.length()<=0){
			lCcNumber=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_NUMBER
		}
		String lCcName=strCcName.trim()
		if(lCcName.length()<=0){
			lCcName=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_NAME
		}
		String lCcExpiryMonth=strCcExpiryMonth.trim()
		if(lCcExpiryMonth.length()<=0){
			lCcExpiryMonth=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_EXPIRY_MONTH
		}
		String lCcExpiryYear=strCcExpiryYear.trim()
		if(lCcExpiryYear.length()<=0){
			lCcExpiryYear=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_EXPIRY_YEAR
		}
		String lCcCvv=strCcCvv.trim()
		if(lCcCvv.length()<=0){
			lCcCvv=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_CVV
		}
		String lCcBank=strCcBank.trim()
		if(lCcBank.length()<=0){
			lCcBank=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_BANK
		}
		String lCcSuccessCase=strCcSuccessCase.trim()
		if(lCcSuccessCase.length()<=0){
			lCcSuccessCase=THARoojaiCovidQuotationPaymentType.DEFAULT_CC_SUCCESS_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CcNumber','')
			lreturn.put('CcName','')
			lreturn.put('CcExpiryMonth','')
			lreturn.put('CcExpiryYear','')
			lreturn.put('CcCvv','')
			lreturn.put('CcBank','')
			lreturn.put('CcSuccessCase','')
			lreturn.put('Result',lResult)
			String lTagTextPaymentByCCNumber='card-number'
			String lLocatorTextPaymentByCCNumber=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCNumber)
			WebElement lElementTextPaymentByCCNumber=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCNumber)
			if(!lElementTextPaymentByCCNumber){
				return lreturn
			}
			lCcNumber=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCNumber,lCcNumber)
			String lTagTextPaymentByCcName='card-name'
			String lLocatorTextPaymentByCcName=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCcName)
			WebElement lElementTextPaymentByCcName=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCcName)
			if(!lElementTextPaymentByCcName){
				return lreturn
			}
			lCcName=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCcName,lCcName)
			String lTagSelectCcExpiryMonth='card-month'
			String lLocatorSelectCcExpiryMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryMonth)
			if(!lElementSelectCcExpiryMonth){
				return lreturn
			}
			Select lSelectCcExpiryMonth=new Select(lElementSelectCcExpiryMonth)
			lSelectCcExpiryMonth.selectByVisibleText(lCcExpiryMonth)
			WebElement lElementSelectCcExpiryMonthSelected=lSelectCcExpiryMonth.getFirstSelectedOption()
			lCcExpiryMonth=lElementSelectCcExpiryMonthSelected.getText()
			String lTagSelectCcExpiryYear='card-year'
			String lLocatorSelectCcExpiryYear=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcExpiryYear)
			WebElement lElementSelectCcExpiryYear=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcExpiryYear)
			if(!lElementSelectCcExpiryYear){
				return lreturn
			}
			Select lSelectCcExpiryYear=new Select(lElementSelectCcExpiryYear)
			lSelectCcExpiryYear.selectByVisibleText(lCcExpiryYear)
			WebElement lElementSelectCcExpiryYearSelected=lSelectCcExpiryYear.getFirstSelectedOption()
			lCcExpiryYear=lElementSelectCcExpiryYearSelected.getText()
			String lTagTextPaymentByCCCvv='card-cvv'
			String lLocatorTextPaymentByCCCvv=IGNUemaHelper.getTagDataSeleniumKey(lTagTextPaymentByCCCvv)
			WebElement lElementTextPaymentByCCCvv=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextPaymentByCCCvv)
			if(!lElementTextPaymentByCCCvv){
				return lreturn
			}
			lCcCvv=IGNUemaHelper.typeTextByWebElement(driver,lElementTextPaymentByCCCvv,lCcCvv)
			String lTagSelectCcBank='card-bank'
			String lLocatorSelectCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectCcBank)
			WebElement lElementSelectCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectCcBank)
			if(!lElementSelectCcBank){
				return lreturn
			}
			Select lSelectCcBank=new Select(lElementSelectCcBank)
			def lOptionListCcBank=lSelectCcBank.getOptions()
			if(lOptionListCcBank.size()<=0){
				lCcBank=''
			}else{
				Boolean lFoundCcBank=false
				Integer lIndexCcBank=0
				def lOptionItemCcBank=null
				String lOptionFindCcBank=''
				for(Integer lOptionIndexCcBank=0;lOptionIndexCcBank<lOptionListCcBank.size()-1;lOptionIndexCcBank++){
					lOptionItemCcBank=lOptionListCcBank.get(lOptionIndexCcBank)
					lOptionFindCcBank=lOptionItemCcBank.getText()
					if(lOptionFindCcBank.contains(lCcBank)){
						lFoundCcBank=true
						lIndexCcBank=lOptionIndexCcBank
						break
					}
				}
				if(lFoundCcBank){
					lSelectCcBank.selectByIndex(lIndexCcBank)
					lOptionItemCcBank=lSelectCcBank.getFirstSelectedOption()
					lCcBank=lOptionItemCcBank.getText()
				}else{
					lSelectCcBank.selectByIndex(lOptionListCcBank.size()-1)
					String lTagTextCcBank='card-other-bank'
					String lLocatorTextCcBank=IGNUemaHelper.getTagDataSeleniumKey(lTagTextCcBank)
					WebElement lElementTextCcBank=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagTextCcBank)
					if(!lElementTextCcBank){
						return lreturn
					}
					lCcBank=IGNUemaHelper.typeTextByWebElement(driver,lElementTextCcBank,lCcBank)
				}
			}
			Boolean lIsCcSuccessCase=IGNUemaHelper.convertStringToBoolean(lCcSuccessCase)
			String lTagButtonPaymentSubmit='submitCreditCard'
			String lLocatorButtonPaymentSubmit=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonPaymentSubmit)
			WebElement lElementButtonPaymentSubmit=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonPaymentSubmit)
			lCcSuccessCase=IGNUemaHelper.convertBooleanToString(lIsCcSuccessCase)
			if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonPaymentSubmit)){
				String lLocatorFormError='#errmsgModal'
				Boolean lIsDisplayedFormError=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorFormError,5)
				lIsDisplayedFormError=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormError)
				lResult=true
			}else{
				if(!lIsCcSuccessCase){
					lResult=true
				}
			}
			if(lResult){
				lreturn.put('CcNumber',lCcNumber)
				lreturn.put('CcName',lCcName)
				lreturn.put('CcExpiryMonth',lCcExpiryMonth)
				lreturn.put('CcExpiryYear',lCcExpiryYear)
				lreturn.put('CcCvv',lCcCvv)
				lreturn.put('CcBank',lCcBank)
				lreturn.put('CcSuccessCase',lCcSuccessCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THARoojaiCovidQuotationPaymentType.DEFAULT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('PositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
			lPositiveCase=IGNUemaHelper.convertBooleanToString(lIsPositiveCase)
			lResult=lPositiveCase.length()>0
			if(lResult){
				lreturn.put('PositiveCase',lPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			String lLocatorProgressDialog='#myPleaseWait'
			IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorProgressDialog,15)
			String lTagPaymentSuccessPage='buy-success-message'
			String lLocatorPaymentSuccessPage=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentSuccessPage)
			lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentSuccessPage,60)
			if(isPositiveCase){
				lIsDone=lRedirected
			}else{
				lIsDone=!lRedirected
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsDone)
			lResult=lActualResult.length()>0
			if(lResult){
				lreturn.put('ActualResult',lActualResult)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}