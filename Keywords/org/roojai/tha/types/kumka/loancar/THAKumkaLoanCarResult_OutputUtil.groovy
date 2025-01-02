package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarResult_OutputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaLoanCarResult_OutputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean outputListSave(Boolean isDefaultCase){
		Boolean lreturn=false
		try{
			THAKumkaLoanCarResult_OutputFactory lOutputList=new THAKumkaLoanCarResult_OutputFactory(isDefaultCase,GlobalVariable.CaseNumber)
			Integer lOutputNumberOfCardsNum=0
			String lTagListOfCardResultList='display-plan-id_gray_filter'
			String lLocatorListOfCardResultList=IGNUemaHelper.getTagDataSeleniumKey(lTagListOfCardResultList)
			List<WebElement> lElementListOfCardResultList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagListOfCardResultList)
			if(lElementListOfCardResultList){
				lOutputNumberOfCardsNum=lElementListOfCardResultList.size()
			}
			String lTagOutboundSaveOpenLinkList='open-detail-link'
			String lLocatorOutboundSaveOpenLinkList=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSaveOpenLinkList)
			List<WebElement> lElementOutboundSaveOpenLinkList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagOutboundSaveOpenLinkList)
			Boolean lIsOK=false
			if(lOutputNumberOfCardsNum<=0){
				lIsOK=true
			}else{
				Integer lIndexOutput=0
				THAKumkaLoanCarResult_OutputType lOutputItem=new THAKumkaLoanCarResult_OutputType()
				WebElement lElementOutboundSaveOpenLinkItem=null
				Boolean lIsOutboundSaveOpen=false
				String lLocatorOutboundSaveDialog='#modal-details'
				String lTagOutboundSaveCloseButton='mr-kumka-detail-modal-close'
				String lLocatorOutboundSaveCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOutboundSaveCloseButton)
				for(lIndexOutput=0;lIndexOutput<lOutputNumberOfCardsNum;lIndexOutput++){
					lOutputItem.initOutput()
					lOutputItem.Output.put('DisplayPlanId',this.outputDisplayPlanId(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					String lItemDisabled=this.outputItemDisabled(lElementListOfCardResultList[lIndexOutput],lIndexOutput)
					lOutputItem.Output.put('ItemDisabled',lItemDisabled)
					Boolean lIsItemDisabled=IGNUemaHelper.convertStringToBoolean(lItemDisabled)
					lOutputItem.Output.put('BankName',this.outputBankName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('PlanName',this.outputPlanName(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('PlanLoanType',this.outputPlanLoanType(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('GuarantorRequired',this.outputGuarantorRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CarInspectionRequired',this.outputCarInspectionRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('CarInsuranceRequired',this.outputCarInsuranceRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('PromotionText',this.outputPromotionText(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('LoanAmount',this.outputLoanAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('MaxLoanAmount',this.outputMaxLoanAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('LoanTerm',this.outputLoanTerm(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('MonthlyInstalment',this.outputMonthlyInstalment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('RatePerMonth',this.outputRatePerMonth(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('TotalInterest',this.outputTotalInterest(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('TotalVat',this.outputTotalVat(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('TotalPayment',this.outputTotalPayment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('TotalFee',this.outputTotalFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					lOutputItem.Output.put('ApprovalDateMessage',this.outputApprovalDateMessage(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
					if(!lIsItemDisabled){
						lElementOutboundSaveOpenLinkItem=lElementOutboundSaveOpenLinkList[lIndexOutput]
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementOutboundSaveOpenLinkItem)
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOutboundSaveOpenLinkItem)
						lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
						if(!lIsOutboundSaveOpen){
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementOutboundSaveOpenLinkItem)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOutboundSaveOpenLinkItem)
							lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
							if(!lIsOutboundSaveOpen){
								IGNUemaHelper.webJsScrollToElement(this.driver,lElementOutboundSaveOpenLinkItem)
								IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementOutboundSaveOpenLinkItem)
								lIsOutboundSaveOpen=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorOutboundSaveDialog,1)
							}
						}
						if(lIsOutboundSaveOpen){
							lOutputItem.Output.put('SelectedLoanAmount',this.outputSelectedLoanAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedMaxLoanAmount',this.outputSelectedMaxLoanAmount(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedLoanTerm',this.outputSelectedLoanTerm(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedMonthlyInstalment',this.outputSelectedMonthlyInstalment(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedRatePerMonth',this.outputSelectedRatePerMonth(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailGurantorRequired',this.outputDetailGurantorRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailCarInspectionRequired',this.outputDetailCarInspectionRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailCarInsuranceRequired',this.outputDetailCarInsuranceRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedStampDutyFeePercent',this.outputSelectedStampDutyFeePercent(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedStampDutyFee',this.outputSelectedStampDutyFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedCarInspectionFee',this.outputSelectedCarInspectionFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedAdministrationFee',this.outputSelectedAdministrationFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedContractTransferFee',this.outputSelectedContractTransferFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedTotalVat',this.outputSelectedTotalVat(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('SelectedTotalFee',this.outputSelectedTotalFee(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailQualificaiton',this.outputDetailQualificaiton(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('QualificationRequired',this.outputQualificationRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailDocumentRequire',this.outputDetailDocumentRequire(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DocumentRequired',this.outputDocumentRequired(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							lOutputItem.Output.put('DetailPromotionText',this.outputDetailPromotionText(lElementListOfCardResultList[lIndexOutput],lIndexOutput))
							IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorOutboundSaveCloseButton)
						}
					}
					lIsOK=lOutputList.addMapItemToOutputList(lOutputItem.Output)
					if(!lIsOK){
						break
					}
				}
			}
			lreturn=lIsOK&&lOutputList.saveOutputList()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDisplayPlanId(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,elementBase)
			lreturn=lText.substring(0,lText.lastIndexOf('_'))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputItemDisabled(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,elementBase)
			lreturn=lText.substring(lText.lastIndexOf('_')+1,lText.length())
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputBankName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagBankName='bank-name'
			String lLocatorBankName=IGNUemaHelper.getTagDataSeleniumKey(lTagBankName)
			WebElement lElementBankName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorBankName,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementBankName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputPlanName(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagPlanName='plan-name'
			String lLocatorPlanName=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanName)
			WebElement lElementPlanName=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorPlanName,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPlanName)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputPlanLoanType(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagPlanLoanType='plan-loan-type'
			String lLocatorPlanLoanType=IGNUemaHelper.getTagDataSeleniumKey(lTagPlanLoanType)
			WebElement lElementPlanLoanType=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorPlanLoanType,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPlanLoanType)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputGuarantorRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagGuarantorRequired='gurantor-required'
			String lLocatorGuarantorRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagGuarantorRequired)
			WebElement lElementGuarantorRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorGuarantorRequired,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementGuarantorRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCarInspectionRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCarInspectionRequired='car-inspection-required'
			String lLocatorCarInspectionRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagCarInspectionRequired)
			WebElement lElementCarInspectionRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCarInspectionRequired,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCarInspectionRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputCarInsuranceRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagCarInsuranceRequired='car-insurance-required'
			String lLocatorCarInsuranceRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagCarInsuranceRequired)
			WebElement lElementCarInsuranceRequired=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorCarInsuranceRequired,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCarInsuranceRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputPromotionText(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagPromotionText='promotion-text'
			String lLocatorPromotionText=IGNUemaHelper.getTagDataSeleniumKey(lTagPromotionText)
			WebElement lElementPromotionText=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorPromotionText,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementPromotionText)
			if(lText.length()<=0){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementPromotionText)
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputLoanAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagLoanAmount='loan-amount'
			String lLocatorLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagLoanAmount)
			WebElement lElementLoanAmount=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorLoanAmount,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementLoanAmount)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputMaxLoanAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagMaxLoanAmount='max-loan-amount'
			String lLocatorMaxLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagMaxLoanAmount)
			WebElement lElementMaxLoanAmount=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorMaxLoanAmount,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMaxLoanAmount)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputLoanTerm(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagLoanTerm='loan-term'
			String lLocatorLoanTerm=IGNUemaHelper.getTagDataSeleniumKey(lTagLoanTerm)
			WebElement lElementLoanTerm=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorLoanTerm,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementLoanTerm)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputMonthlyInstalment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagMonthlyInstalment='mountly-installment'
			String lLocatorMonthlyInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagMonthlyInstalment)
			WebElement lElementMonthlyInstalment=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorMonthlyInstalment,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementMonthlyInstalment)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputRatePerMonth(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagRatePerMonth='rate-per-month'
			String lLocatorRatePerMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagRatePerMonth)
			WebElement lElementRatePerMonth=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorRatePerMonth,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementRatePerMonth)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputTotalInterest(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagTotalInterest='total-interest'
			String lLocatorTotalInterest=IGNUemaHelper.getTagDataSeleniumKey(lTagTotalInterest)
			WebElement lElementTotalInterest=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorTotalInterest,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTotalInterest)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputTotalVat(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagTotalVat='total-vat'
			String lLocatorTotalVat=IGNUemaHelper.getTagDataSeleniumKey(lTagTotalVat)
			WebElement lElementTotalVat=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorTotalVat,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTotalVat)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputTotalPayment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagTotalPayment='total-payment'
			String lLocatorTotalPayment=IGNUemaHelper.getTagDataSeleniumKey(lTagTotalPayment)
			WebElement lElementTotalPayment=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorTotalPayment,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTotalPayment)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputTotalFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagTotalFee='total-fee'
			String lLocatorTotalFee=IGNUemaHelper.getTagDataSeleniumKey(lTagTotalFee)
			WebElement lElementTotalFee=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorTotalFee,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementTotalFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputApprovalDateMessage(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagApprovalDateMessage='approval-date-message'
			String lLocatorApprovalDateMessage=IGNUemaHelper.getTagDataSeleniumKey(lTagApprovalDateMessage)
			WebElement lElementApprovalDateMessage=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,elementBase,lLocatorApprovalDateMessage,true)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementApprovalDateMessage)
			if(lText.length()<=0){
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementApprovalDateMessage)
			}
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedLoanAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedLoanAmount='selected-loan-amount'
			String lLocatorSelectedLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedLoanAmount)
			WebElement lElementSelectedLoanAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedLoanAmount)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedLoanAmount)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedMaxLoanAmount(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedMaxLoanAmount='selected-max-loan-amount'
			String lLocatorSelectedMaxLoanAmount=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedMaxLoanAmount)
			WebElement lElementSelectedMaxLoanAmount=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedMaxLoanAmount)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedMaxLoanAmount)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedLoanTerm(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedLoanTerm='selected-loan-term'
			String lLocatorSelectedLoanTerm=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedLoanTerm)
			WebElement lElementSelectedLoanTerm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedLoanTerm)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedLoanTerm)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedMonthlyInstalment(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedMonthlyInstalment='selected-monthly-installment'
			String lLocatorSelectedMonthlyInstalment=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedMonthlyInstalment)
			WebElement lElementSelectedMonthlyInstalment=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedMonthlyInstalment)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedMonthlyInstalment)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedRatePerMonth(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedRatePerMonth='selected-rate-per-month'
			String lLocatorSelectedRatePerMonth=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedRatePerMonth)
			WebElement lElementSelectedRatePerMonth=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedRatePerMonth)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedRatePerMonth)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailGurantorRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailGurantorRequired='detail-gurantor-required'
			String lLocatorDetailGurantorRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailGurantorRequired)
			WebElement lElementDetailGurantorRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailGurantorRequired)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailGurantorRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailCarInspectionRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailCarInspectionRequired='detail-car-inspection-required'
			String lLocatorDetailCarInspectionRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailCarInspectionRequired)
			WebElement lElementDetailCarInspectionRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailCarInspectionRequired)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailCarInspectionRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailCarInsuranceRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailCarInsuranceRequired='detail-car-insurance-required'
			String lLocatorDetailCarInsuranceRequired=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailCarInsuranceRequired)
			WebElement lElementDetailCarInsuranceRequired=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailCarInsuranceRequired)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailCarInsuranceRequired)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedStampDutyFeePercent(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedStampDutyFeePercent='selected-stamp-duty-fee-percent'
			String lLocatorSelectedStampDutyFeePercent=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedStampDutyFeePercent)
			WebElement lElementSelectedStampDutyFeePercent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedStampDutyFeePercent)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedStampDutyFeePercent)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedStampDutyFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedStampDutyFee='selected-stamp-duty-fee'
			String lLocatorSelectedStampDutyFee=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedStampDutyFee)
			WebElement lElementSelectedStampDutyFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedStampDutyFee)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedStampDutyFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedCarInspectionFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedCarInspectionFee='selected-car-inspection-fee'
			String lLocatorSelectedCarInspectionFee=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedCarInspectionFee)
			WebElement lElementSelectedCarInspectionFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedCarInspectionFee)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedCarInspectionFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedAdministrationFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedAdministrationFee='selected-administration-fee'
			String lLocatorSelectedAdministrationFee=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedAdministrationFee)
			WebElement lElementSelectedAdministrationFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedAdministrationFee)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedAdministrationFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedContractTransferFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedContractTransferFee='selected-contract-transfer-fee'
			String lLocatorSelectedContractTransferFee=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedContractTransferFee)
			WebElement lElementSelectedContractTransferFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedContractTransferFee)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedContractTransferFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedTotalVat(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedTotalVat='selected-total-vat'
			String lLocatorSelectedTotalVat=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedTotalVat)
			WebElement lElementSelectedTotalVat=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedTotalVat)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedTotalVat)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputSelectedTotalFee(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagSelectedTotalFee='selected-total-fee'
			String lLocatorSelectedTotalFee=IGNUemaHelper.getTagDataSeleniumKey(lTagSelectedTotalFee)
			WebElement lElementSelectedTotalFee=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSelectedTotalFee)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementSelectedTotalFee)
			lreturn=lText
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailQualificaiton(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailQualificaiton='detail-qualificaiton'
			String lLocatorDetailQualificaiton=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailQualificaiton)
			WebElement lElementDetailQualificaiton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailQualificaiton)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailQualificaiton)
			if(lText.length()<=0){
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementDetailQualificaiton)
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputQualificationRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagQualificationRequiredList='qualification-required'
			String lLocatorQualificationRequiredList=IGNUemaHelper.getTagDataSeleniumKey(lTagQualificationRequiredList)
			List<WebElement> lElementQualificationRequiredList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagQualificationRequiredList)
			for(WebElement lElementQualificationRequiredItem in lElementQualificationRequiredList){
				lText=lText+IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementQualificationRequiredItem)+"\r\n"
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailDocumentRequire(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailDocumentRequire='detail-document-require'
			String lLocatorDetailDocumentRequire=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailDocumentRequire)
			WebElement lElementDetailDocumentRequire=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailDocumentRequire)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailDocumentRequire)
			if(lText.length()<=0){
				lText=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementDetailDocumentRequire)
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDocumentRequired(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDocumentRequiredList='document-required'
			String lLocatorDocumentRequiredList=IGNUemaHelper.getTagDataSeleniumKey(lTagDocumentRequiredList)
			List<WebElement> lElementDocumentRequiredList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDocumentRequiredList)
			for(WebElement lElementDocumentRequiredItem in lElementDocumentRequiredList){
				lText=lText+IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDocumentRequiredItem)+"\r\n"
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public String outputDetailPromotionText(WebElement elementBase,Integer itemIndex){
		String lreturn=''
		if(!elementBase){
			return lreturn
		}
		if(itemIndex<0){
			return lreturn
		}
		try{
			String lText=''
			String lTagDetailPromotionText='detail-promotion-text'
			String lLocatorDetailPromotionText=IGNUemaHelper.getTagDataSeleniumKey(lTagDetailPromotionText)
			WebElement lElementDetailPromotionText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDetailPromotionText)
			lText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementDetailPromotionText)
			if(lText.length()<=0){
				lText=IGNUemaHelper.getTextByWebElement(this.driver,lElementDetailPromotionText)
			}
			lreturn=lText.trim()
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}