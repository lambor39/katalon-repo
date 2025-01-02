package org.roojai.tha.types.kumka.loancar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THAKumkaLoanCarInputUtil{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAKumkaLoanCarInputUtil(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean inputCase(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lBaseUrl=caseOutput.BaseUrl.toString().trim()
		String lLoginUser=caseInput.LoginUser.toString().trim()
		String lLoginPassword=caseInput.LoginPassword.toString().trim()
		String lVersion=caseInput.Version.toString().trim()
		String lLanguage=caseInput.Language.toString().trim()
		String lCarMake=caseInput.CarMake.toString().trim()
		String lCarModel=caseInput.CarModel.toString().trim()
		String lCarYear=caseInput.CarYear.toString().trim()
		String lCarSubmodel=caseInput.CarSubmodel.toString().trim()
		String lCustomerOccupation=caseInput.CustomerOccupation.toString().trim()
		String lCustomerSalaryPositiveCase=caseInput.CustomerSalaryPositiveCase.toString().trim()
		String lCustomerSalary=caseInput.CustomerSalary.toString().trim()
		String lCustomerWorkExperience=caseInput.CustomerWorkExperience.toString().trim()
		String lCustomerDobPositiveCase=caseInput.CustomerDobPositiveCase.toString().trim()
		String lCustomerDob=caseInput.CustomerDob.toString().trim()
		String lCustomerAddressPositiveCase=caseInput.CustomerAddressPositiveCase.toString().trim()
		String lCustomerAddress=caseInput.CustomerAddress.toString().trim()
		String lCarRegisterUnder=caseInput.CarRegisterUnder.toString().trim()
		String lCarHaveInsurance=caseInput.CarHaveInsurance.toString().trim()
		String lCarInsuranceExpire=caseInput.CarInsuranceExpire.toString().trim()
		String lCarInsuranceOffer=caseInput.CarInsuranceOffer.toString().trim()
		String lCarInsuranceCallMeBackToDo=caseInput.CarInsuranceCallMeBackToDo.toString().trim()
		String lCarInsuranceCallMeBackNumber=caseInput.CarInsuranceCallMeBackNumber.toString().trim()
		String lCarOwnership=caseInput.CarOwnership.toString().trim()
		String lCarInstalmentPositiveCase=caseInput.CarInstalmentPositiveCase.toString().trim()
		String lCarInstalmentPaidTerm=caseInput.CarInstalmentPaidTerm.toString().trim()
		String lCarInstalmentAmount=caseInput.CarInstalmentAmount.toString().trim()
		String lLoanProduct01HomeLoan=caseInput.LoanProduct01HomeLoan.toString().trim()
		String lLoanProduct02CreditCard=caseInput.LoanProduct02CreditCard.toString().trim()
		String lLoanProduct03PersonalLoan=caseInput.LoanProduct03PersonalLoan.toString().trim()
		String lLoanProduct04None=caseInput.LoanProduct04None.toString().trim()
		String lLatePayment=caseInput.LatePayment.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
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
			Map lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
			if(!lMapLoginUserPassword.Result){
				lLoginUser=''
				lLoginPassword=''
			}else{
				lLoginUser=lMapLoginUserPassword.LoginUser
				lLoginPassword=lMapLoginUserPassword.LoginPassword
			}
			caseOutput.LoginUser=lLoginUser
			caseOutput.LoginPassword=lLoginPassword
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			Map lMapVersion=this.inputVersion(lBaseUrl,lVersion)
			if(!lMapVersion.Result){
				lVersion=''
			}else{
				lVersion=lMapVersion.Version
			}
			caseOutput.Version=lVersion
			if(lVersion.length()<=0){
				return lreturn
			}
			if(!this.waitUntilLoaded()){
				return lreturn
			}
			//Check ABTesting
			String lTagABTesting='ABTesting'
			String lLocatorABTesting=IGNUemaHelper.getTagDataSeleniumKey(lTagABTesting)
			WebElement lElementABTesting=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagABTesting)
			if(!lElementABTesting){
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=false
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
			}else{
				IGNUemaHelper.CURRENT_AB_TESTING_VERSION=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementABTesting).trim().toUpperCase()
				if(IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>1){
					IGNUemaHelper.CURRENT_AB_TESTING_VERSION=''
				}
				IGNUemaHelper.CURRENT_AB_TESTING_ENABLE=IGNUemaHelper.CURRENT_AB_TESTING_VERSION.length()>0
				IGNUemaHelper.printLog('CURRENT_AB_TESTING_ENABLE='+IGNUemaHelper.CURRENT_AB_TESTING_ENABLE.toString())
				if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
					IGNUemaHelper.printLog('IGNUemaHelper.CURRENT_AB_TESTING_VERSION='+IGNUemaHelper.CURRENT_AB_TESTING_VERSION)
					lVersion=IGNUemaHelper.CURRENT_AB_TESTING_VERSION
					caseOutput.Version=IGNUemaHelper.concatMessageLeftRightByPipe(caseOutput.Version,'ActualVersion:'+lVersion)
				}
			}
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						Map lMapLanguage=this.inputLanguage(lLanguage)
						if(!lMapLanguage.Result){
							lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
							this.waitUntilLoaded()
							lMapLanguage=this.inputLanguage(lLanguage)
						}
						if(!lMapLanguage.Result){
							lLanguage=''
						}else{
							lLanguage=lMapLanguage.Language
						}
						caseOutput.Language=lLanguage
						if(lLanguage.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarMake=this.inputCarMake(lCarMake)
						if(!lMapCarMake.Result){
							lCarMake=''
						}else{
							lCarMake=lMapCarMake.CarMake
						}
						caseOutput.CarMake=lCarMake
						if(lCarMake.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarModel=this.inputCarModel(lCarModel)
						if(!lMapCarModel.Result){
							lCarModel=''
						}else{
							lCarModel=lMapCarModel.CarModel
						}
						caseOutput.CarModel=lCarModel
						if(lCarModel.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarYear=this.inputCarYear(lCarYear)
						if(!lMapCarYear.Result){
							lCarYear=''
						}else{
							lCarYear=lMapCarYear.CarYear
						}
						caseOutput.CarYear=lCarYear
						if(lCarYear.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
						if(!lMapCarSubmodel.Result){
							lCarSubmodel=''
						}else{
							lCarSubmodel=lMapCarSubmodel.CarSubmodel
						}
						caseOutput.CarSubmodel=lCarSubmodel
						if(lCarSubmodel.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarRegisterUnder=this.inputCarRegisterUnder(lCarRegisterUnder)
						lCarRegisterUnder=lMapCarRegisterUnder.CarRegisterUnder
						caseOutput.CarRegisterUnder=lCarRegisterUnder
						if(!lMapCarRegisterUnder.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerOccupation=this.inputCustomerOccupation(lCustomerOccupation)
						if(!lMapCustomerOccupation.Result){
							lCustomerOccupation=''
						}else{
							lCustomerOccupation=lMapCustomerOccupation.CustomerOccupation
						}
						caseOutput.CustomerOccupation=lCustomerOccupation
						if(lCustomerOccupation.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerSalaryPositiveCase=this.inputCustomerSalaryPositiveCase(lCustomerSalaryPositiveCase)
						if(!lMapCustomerSalaryPositiveCase.Result){
							lCustomerSalaryPositiveCase=''
						}else{
							lCustomerSalaryPositiveCase=lMapCustomerSalaryPositiveCase.CustomerSalaryPositiveCase
						}
						caseOutput.CustomerSalaryPositiveCase=lCustomerSalaryPositiveCase
						if(lCustomerSalaryPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerSalaryPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerSalaryPositiveCase)
						Map lMapCustomerSalary=this.inputCustomerSalary(lCustomerSalary,lIsCustomerSalaryPositiveCase)
						lCustomerSalary=lMapCustomerSalary.CustomerSalary
						caseOutput.CustomerSalary=lCustomerSalary
						if(!lMapCustomerSalary.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerWorkExperience=this.inputCustomerWorkExperience(lCustomerWorkExperience)
						if(!lMapCustomerWorkExperience.Result){
							lCustomerWorkExperience=''
						}else{
							lCustomerWorkExperience=lMapCustomerWorkExperience.CustomerWorkExperience
						}
						caseOutput.CustomerWorkExperience=lCustomerWorkExperience
						if(lCustomerWorkExperience.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
						if(!lMapCustomerDobPositiveCase.Result){
							lCustomerDobPositiveCase=''
						}else{
							lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
						}
						caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
						if(lCustomerDobPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
						Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
						lCustomerDob=lMapCustomerDob.CustomerDob
						caseOutput.CustomerDob=lCustomerDob
						if(!lMapCustomerDob.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerAddressPositiveCase=this.inputCustomerAddressPositiveCase(lCustomerAddressPositiveCase)
						if(!lMapCustomerAddressPositiveCase.Result){
							lCustomerAddressPositiveCase=''
						}else{
							lCustomerAddressPositiveCase=lMapCustomerAddressPositiveCase.CustomerAddressPositiveCase
						}
						caseOutput.CustomerAddressPositiveCase=lCustomerAddressPositiveCase
						if(lCustomerAddressPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerAddressPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerAddressPositiveCase)
						Map lMapCustomerAddress=this.inputCustomerAddress(lCustomerAddress,lIsCustomerAddressPositiveCase)
						lCustomerAddress=lMapCustomerAddress.CustomerAddress
						caseOutput.CustomerAddress=lCustomerAddress
						if(!lMapCustomerAddress.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarHaveInsurance=this.inputCarHaveInsurance(lCarHaveInsurance)
						lCarHaveInsurance=lMapCarHaveInsurance.CarHaveInsurance
						caseOutput.CarHaveInsurance=lCarHaveInsurance
						if(!lMapCarHaveInsurance.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceExpire=this.inputCarInsuranceExpire(lCarInsuranceExpire)
						if(!lMapCarInsuranceExpire.Result){
							lCarInsuranceExpire=''
						}else{
							lCarInsuranceExpire=lMapCarInsuranceExpire.CarInsuranceExpire
						}
						caseOutput.CarInsuranceExpire=lCarInsuranceExpire
						if(lCarInsuranceExpire.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceOffer=this.inputCarInsuranceOffer(lCarInsuranceOffer)
						if(!lMapCarInsuranceOffer.Result){
							lCarInsuranceOffer=''
						}else{
							lCarInsuranceOffer=lMapCarInsuranceOffer.CarInsuranceOffer
						}
						caseOutput.CarInsuranceOffer=lCarInsuranceOffer
						if(lCarInsuranceOffer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceCallMeBackToDo=this.inputCarInsuranceCallMeBackToDo(lCarInsuranceCallMeBackToDo)
						if(!lMapCarInsuranceCallMeBackToDo.Result){
							lCarInsuranceCallMeBackToDo=''
						}else{
							lCarInsuranceCallMeBackToDo=lMapCarInsuranceCallMeBackToDo.CarInsuranceCallMeBackToDo
						}
						caseOutput.CarInsuranceCallMeBackToDo=lCarInsuranceCallMeBackToDo
						if(lCarInsuranceCallMeBackToDo.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Boolean lIsCarInsuranceCallMeBackToDo=IGNUemaHelper.convertStringToBoolean(lCarInsuranceCallMeBackToDo)
						if(lIsCarInsuranceCallMeBackToDo){
							Map lMapCarInsuranceCallMeBackNumber=this.inputCarInsuranceCallMeBackNumber(lCarInsuranceCallMeBackNumber)
							if(!lMapCarInsuranceCallMeBackNumber.Result){
								lCarInsuranceCallMeBackNumber=''
							}else{
								lCarInsuranceCallMeBackNumber=lMapCarInsuranceCallMeBackNumber.CarInsuranceCallMeBackNumber
							}
							caseOutput.CarInsuranceCallMeBackNumber=lCarInsuranceCallMeBackNumber
							if(lCarInsuranceCallMeBackNumber.length()<=0){
								return lreturn
							}
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Boolean lIsCarOwnership=IGNUemaHelper.convertStringToBoolean(lCarOwnership.trim())
						Map lMapCarOwnership=this.inputCarOwnership(lCarOwnership)
						if(!lMapCarOwnership.Result){
							lCarOwnership=''
						}else{
							lCarOwnership=lMapCarOwnership.CarOwnership
						}
						caseOutput.CarOwnership=lCarOwnership
						if(lCarOwnership.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						if(!lIsCarOwnership){
							Map lMapCarInstalmentPositiveCase=this.inputCarInstalmentPositiveCase(lCarInstalmentPositiveCase)
							if(!lMapCarInstalmentPositiveCase.Result){
								lCarInstalmentPositiveCase=''
							}else{
								lCarInstalmentPositiveCase=lMapCarInstalmentPositiveCase.CarInstalmentPositiveCase
							}
							caseOutput.CarInstalmentPositiveCase=lCarInstalmentPositiveCase
							if(lCarInstalmentPositiveCase.length()<=0){
								return lreturn
							}
							Boolean lIsCarInstalmentPositiveCase=IGNUemaHelper.convertStringToBoolean(lCarInstalmentPositiveCase)
							Map lMapCarInstalmentPaidTerm=this.inputCarInstalmentPaidTerm(lCarInstalmentPaidTerm)
							if(!lMapCarInstalmentPaidTerm.Result){
								lCarInstalmentPaidTerm=''
							}else{
								lCarInstalmentPaidTerm=lMapCarInstalmentPaidTerm.CarInstalmentPaidTerm
							}
							caseOutput.CarInstalmentPaidTerm=lCarInstalmentPaidTerm
							if(lCarInstalmentPaidTerm.length()<=0){
								return lreturn
							}
							Map lMapCarInstalmentAmount=this.inputCarInstalmentAmount(lCarInstalmentAmount,lIsCarInstalmentPositiveCase)
							if(!lMapCarInstalmentAmount.Result){
								lCarInstalmentAmount=''
							}else{
								lCarInstalmentAmount=lMapCarInstalmentAmount.CarInstalmentAmount
							}
							caseOutput.CarInstalmentAmount=lCarInstalmentAmount
							if(lCarInstalmentAmount.length()<=0){
								if(lIsCarInstalmentPositiveCase){
									return lreturn
								}
							}
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapLoanProduct=this.inputLoanProduct(lLoanProduct01HomeLoan,lLoanProduct02CreditCard,lLoanProduct03PersonalLoan,lLoanProduct04None)
						if(!lMapLoanProduct.Result){
							lLoanProduct01HomeLoan=''
							lLoanProduct02CreditCard=''
							lLoanProduct03PersonalLoan=''
							lLoanProduct04None=''
						}else{
							lLoanProduct01HomeLoan=lMapLoanProduct.LoanProduct01HomeLoan
							lLoanProduct02CreditCard=lMapLoanProduct.LoanProduct02CreditCard
							lLoanProduct03PersonalLoan=lMapLoanProduct.LoanProduct03PersonalLoan
							lLoanProduct04None=lMapLoanProduct.LoanProduct04None
						}
						caseOutput.LoanProduct01HomeLoan=lLoanProduct01HomeLoan
						caseOutput.LoanProduct02CreditCard=lLoanProduct02CreditCard
						caseOutput.LoanProduct03PersonalLoan=lLoanProduct03PersonalLoan
						caseOutput.LoanProduct04None=lLoanProduct04None
						if(!lMapLoanProduct.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapLatePayment=this.inputLatePayment(lLatePayment)
						if(!lMapLatePayment.Result){
							lLatePayment=''
						}else{
							lLatePayment=lMapLatePayment.LatePayment
						}
						caseOutput.LatePayment=lLatePayment
						if(lLatePayment.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
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
						break
					case 'B':
						Map lMapLanguage=this.inputLanguage(lLanguage)
						if(!lMapLanguage.Result){
							lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
							this.waitUntilLoaded()
							lMapLanguage=this.inputLanguage(lLanguage)
						}
						if(!lMapLanguage.Result){
							lLanguage=''
						}else{
							lLanguage=lMapLanguage.Language
						}
						caseOutput.Language=lLanguage
						if(lLanguage.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarMake=this.inputCarMake(lCarMake)
						if(!lMapCarMake.Result){
							lCarMake=''
						}else{
							lCarMake=lMapCarMake.CarMake
						}
						caseOutput.CarMake=lCarMake
						if(lCarMake.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarModel=this.inputCarModel(lCarModel)
						if(!lMapCarModel.Result){
							lCarModel=''
						}else{
							lCarModel=lMapCarModel.CarModel
						}
						caseOutput.CarModel=lCarModel
						if(lCarModel.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarYear=this.inputCarYear(lCarYear)
						if(!lMapCarYear.Result){
							lCarYear=''
						}else{
							lCarYear=lMapCarYear.CarYear
						}
						caseOutput.CarYear=lCarYear
						if(lCarYear.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
						if(!lMapCarSubmodel.Result){
							lCarSubmodel=''
						}else{
							lCarSubmodel=lMapCarSubmodel.CarSubmodel
						}
						caseOutput.CarSubmodel=lCarSubmodel
						if(lCarSubmodel.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapCarRegisterUnder=this.inputCarRegisterUnder(lCarRegisterUnder)
						lCarRegisterUnder=lMapCarRegisterUnder.CarRegisterUnder
						caseOutput.CarRegisterUnder=lCarRegisterUnder
						if(!lMapCarRegisterUnder.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerOccupation=this.inputCustomerOccupation(lCustomerOccupation)
						if(!lMapCustomerOccupation.Result){
							lCustomerOccupation=''
						}else{
							lCustomerOccupation=lMapCustomerOccupation.CustomerOccupation
						}
						caseOutput.CustomerOccupation=lCustomerOccupation
						if(lCustomerOccupation.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerSalaryPositiveCase=this.inputCustomerSalaryPositiveCase(lCustomerSalaryPositiveCase)
						if(!lMapCustomerSalaryPositiveCase.Result){
							lCustomerSalaryPositiveCase=''
						}else{
							lCustomerSalaryPositiveCase=lMapCustomerSalaryPositiveCase.CustomerSalaryPositiveCase
						}
						caseOutput.CustomerSalaryPositiveCase=lCustomerSalaryPositiveCase
						if(lCustomerSalaryPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerSalaryPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerSalaryPositiveCase)
						Map lMapCustomerSalary=this.inputCustomerSalary(lCustomerSalary,lIsCustomerSalaryPositiveCase)
						lCustomerSalary=lMapCustomerSalary.CustomerSalary
						caseOutput.CustomerSalary=lCustomerSalary
						if(!lMapCustomerSalary.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerWorkExperience=this.inputCustomerWorkExperience(lCustomerWorkExperience)
						if(!lMapCustomerWorkExperience.Result){
							lCustomerWorkExperience=''
						}else{
							lCustomerWorkExperience=lMapCustomerWorkExperience.CustomerWorkExperience
						}
						caseOutput.CustomerWorkExperience=lCustomerWorkExperience
						if(lCustomerWorkExperience.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
						if(!lMapCustomerDobPositiveCase.Result){
							lCustomerDobPositiveCase=''
						}else{
							lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
						}
						caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
						if(lCustomerDobPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
						Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
						lCustomerDob=lMapCustomerDob.CustomerDob
						caseOutput.CustomerDob=lCustomerDob
						if(!lMapCustomerDob.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCustomerAddressPositiveCase=this.inputCustomerAddressPositiveCase(lCustomerAddressPositiveCase)
						if(!lMapCustomerAddressPositiveCase.Result){
							lCustomerAddressPositiveCase=''
						}else{
							lCustomerAddressPositiveCase=lMapCustomerAddressPositiveCase.CustomerAddressPositiveCase
						}
						caseOutput.CustomerAddressPositiveCase=lCustomerAddressPositiveCase
						if(lCustomerAddressPositiveCase.length()<=0){
							return lreturn
						}
						Boolean lIsCustomerAddressPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerAddressPositiveCase)
						Map lMapCustomerAddress=this.inputCustomerAddress(lCustomerAddress,lIsCustomerAddressPositiveCase)
						lCustomerAddress=lMapCustomerAddress.CustomerAddress
						caseOutput.CustomerAddress=lCustomerAddress
						if(!lMapCustomerAddress.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarHaveInsurance=this.inputCarHaveInsurance(lCarHaveInsurance)
						lCarHaveInsurance=lMapCarHaveInsurance.CarHaveInsurance
						caseOutput.CarHaveInsurance=lCarHaveInsurance
						if(!lMapCarHaveInsurance.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceExpire=this.inputCarInsuranceExpire(lCarInsuranceExpire)
						if(!lMapCarInsuranceExpire.Result){
							lCarInsuranceExpire=''
						}else{
							lCarInsuranceExpire=lMapCarInsuranceExpire.CarInsuranceExpire
						}
						caseOutput.CarInsuranceExpire=lCarInsuranceExpire
						if(lCarInsuranceExpire.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceOffer=this.inputCarInsuranceOffer(lCarInsuranceOffer)
						if(!lMapCarInsuranceOffer.Result){
							lCarInsuranceOffer=''
						}else{
							lCarInsuranceOffer=lMapCarInsuranceOffer.CarInsuranceOffer
						}
						caseOutput.CarInsuranceOffer=lCarInsuranceOffer
						if(lCarInsuranceOffer.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapCarInsuranceCallMeBackToDo=this.inputCarInsuranceCallMeBackToDo(lCarInsuranceCallMeBackToDo)
						if(!lMapCarInsuranceCallMeBackToDo.Result){
							lCarInsuranceCallMeBackToDo=''
						}else{
							lCarInsuranceCallMeBackToDo=lMapCarInsuranceCallMeBackToDo.CarInsuranceCallMeBackToDo
						}
						caseOutput.CarInsuranceCallMeBackToDo=lCarInsuranceCallMeBackToDo
						if(lCarInsuranceCallMeBackToDo.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Boolean lIsCarInsuranceCallMeBackToDo=IGNUemaHelper.convertStringToBoolean(lCarInsuranceCallMeBackToDo)
						if(lIsCarInsuranceCallMeBackToDo){
							Map lMapCarInsuranceCallMeBackNumber=this.inputCarInsuranceCallMeBackNumber(lCarInsuranceCallMeBackNumber)
							lCarInsuranceCallMeBackNumber=lMapCarInsuranceCallMeBackNumber.CarInsuranceCallMeBackNumber
							caseOutput.CarInsuranceCallMeBackNumber=lCarInsuranceCallMeBackNumber
							if(!lMapCarInsuranceCallMeBackNumber.Result){
								return lreturn
							}
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Boolean lIsCarOwnership=IGNUemaHelper.convertStringToBoolean(lCarOwnership.trim())
						Map lMapCarOwnership=this.inputCarOwnership(lCarOwnership)
						if(!lMapCarOwnership.Result){
							lCarOwnership=''
						}else{
							lCarOwnership=lMapCarOwnership.CarOwnership
						}
						caseOutput.CarOwnership=lCarOwnership
						if(lCarOwnership.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						if(!lIsCarOwnership){
							Map lMapCarInstalmentPositiveCase=this.inputCarInstalmentPositiveCase(lCarInstalmentPositiveCase)
							if(!lMapCarInstalmentPositiveCase.Result){
								lCarInstalmentPositiveCase=''
							}else{
								lCarInstalmentPositiveCase=lMapCarInstalmentPositiveCase.CarInstalmentPositiveCase
							}
							caseOutput.CarInstalmentPositiveCase=lCarInstalmentPositiveCase
							if(lCarInstalmentPositiveCase.length()<=0){
								return lreturn
							}
							Boolean lIsCarInstalmentPositiveCase=IGNUemaHelper.convertStringToBoolean(lCarInstalmentPositiveCase)
							Map lMapCarInstalmentPaidTerm=this.inputCarInstalmentPaidTerm(lCarInstalmentPaidTerm)
							if(!lMapCarInstalmentPaidTerm.Result){
								lCarInstalmentPaidTerm=''
							}else{
								lCarInstalmentPaidTerm=lMapCarInstalmentPaidTerm.CarInstalmentPaidTerm
							}
							caseOutput.CarInstalmentPaidTerm=lCarInstalmentPaidTerm
							if(lCarInstalmentPaidTerm.length()<=0){
								return lreturn
							}
							Map lMapCarInstalmentAmount=this.inputCarInstalmentAmount(lCarInstalmentAmount,lIsCarInstalmentPositiveCase)
							if(!lMapCarInstalmentAmount.Result){
								lCarInstalmentAmount=''
							}else{
								lCarInstalmentAmount=lMapCarInstalmentAmount.CarInstalmentAmount
							}
							caseOutput.CarInstalmentAmount=lCarInstalmentAmount
							if(lCarInstalmentAmount.length()<=0){
								if(lIsCarInstalmentPositiveCase){
									return lreturn
								}
							}
							if(!this.waitUntilLoaded()){
								return lreturn
							}
						}
						Map lMapLoanProduct=this.inputLoanProduct(lLoanProduct01HomeLoan,lLoanProduct02CreditCard,lLoanProduct03PersonalLoan,lLoanProduct04None)
						if(!lMapLoanProduct.Result){
							lLoanProduct01HomeLoan=''
							lLoanProduct02CreditCard=''
							lLoanProduct03PersonalLoan=''
							lLoanProduct04None=''
						}else{
							lLoanProduct01HomeLoan=lMapLoanProduct.LoanProduct01HomeLoan
							lLoanProduct02CreditCard=lMapLoanProduct.LoanProduct02CreditCard
							lLoanProduct03PersonalLoan=lMapLoanProduct.LoanProduct03PersonalLoan
							lLoanProduct04None=lMapLoanProduct.LoanProduct04None
						}
						caseOutput.LoanProduct01HomeLoan=lLoanProduct01HomeLoan
						caseOutput.LoanProduct02CreditCard=lLoanProduct02CreditCard
						caseOutput.LoanProduct03PersonalLoan=lLoanProduct03PersonalLoan
						caseOutput.LoanProduct04None=lLoanProduct04None
						if(!lMapLoanProduct.Result){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
							return lreturn
						}
						Map lMapLatePayment=this.inputLatePayment(lLatePayment)
						if(!lMapLatePayment.Result){
							lLatePayment=''
						}else{
							lLatePayment=lMapLatePayment.LatePayment
						}
						caseOutput.LatePayment=lLatePayment
						if(lLatePayment.length()<=0){
							return lreturn
						}
						if(!this.waitUntilLoaded()){
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
						break
					default:
						return lreturn
						break
				}
			}else{
				Map lMapLanguage=this.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lMapLoginUserPassword=this.inputLoginUserPassword(lLoginUser,lLoginPassword)
					this.waitUntilLoaded()
					lMapLanguage=this.inputLanguage(lLanguage)
				}
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
				caseOutput.Language=lLanguage
				if(lLanguage.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCarMake=this.inputCarMake(lCarMake)
				if(!lMapCarMake.Result){
					lCarMake=''
				}else{
					lCarMake=lMapCarMake.CarMake
				}
				caseOutput.CarMake=lCarMake
				if(lCarMake.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarModel=this.inputCarModel(lCarModel)
				if(!lMapCarModel.Result){
					lCarModel=''
				}else{
					lCarModel=lMapCarModel.CarModel
				}
				caseOutput.CarModel=lCarModel
				if(lCarModel.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarYear=this.inputCarYear(lCarYear)
				if(!lMapCarYear.Result){
					lCarYear=''
				}else{
					lCarYear=lMapCarYear.CarYear
				}
				caseOutput.CarYear=lCarYear
				if(lCarYear.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarSubmodel=this.inputCarSubmodel(lCarSubmodel)
				if(!lMapCarSubmodel.Result){
					lCarSubmodel=''
				}else{
					lCarSubmodel=lMapCarSubmodel.CarSubmodel
				}
				caseOutput.CarSubmodel=lCarSubmodel
				if(lCarSubmodel.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapCarRegisterUnder=this.inputCarRegisterUnder(lCarRegisterUnder)
				lCarRegisterUnder=lMapCarRegisterUnder.CarRegisterUnder
				caseOutput.CarRegisterUnder=lCarRegisterUnder
				if(!lMapCarRegisterUnder.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerOccupation=this.inputCustomerOccupation(lCustomerOccupation)
				if(!lMapCustomerOccupation.Result){
					lCustomerOccupation=''
				}else{
					lCustomerOccupation=lMapCustomerOccupation.CustomerOccupation
				}
				caseOutput.CustomerOccupation=lCustomerOccupation
				if(lCustomerOccupation.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerSalaryPositiveCase=this.inputCustomerSalaryPositiveCase(lCustomerSalaryPositiveCase)
				if(!lMapCustomerSalaryPositiveCase.Result){
					lCustomerSalaryPositiveCase=''
				}else{
					lCustomerSalaryPositiveCase=lMapCustomerSalaryPositiveCase.CustomerSalaryPositiveCase
				}
				caseOutput.CustomerSalaryPositiveCase=lCustomerSalaryPositiveCase
				if(lCustomerSalaryPositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsCustomerSalaryPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerSalaryPositiveCase)
				Map lMapCustomerSalary=this.inputCustomerSalary(lCustomerSalary,lIsCustomerSalaryPositiveCase)
				lCustomerSalary=lMapCustomerSalary.CustomerSalary
				caseOutput.CustomerSalary=lCustomerSalary
				if(!lMapCustomerSalary.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerWorkExperience=this.inputCustomerWorkExperience(lCustomerWorkExperience)
				if(!lMapCustomerWorkExperience.Result){
					lCustomerWorkExperience=''
				}else{
					lCustomerWorkExperience=lMapCustomerWorkExperience.CustomerWorkExperience
				}
				caseOutput.CustomerWorkExperience=lCustomerWorkExperience
				if(lCustomerWorkExperience.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerDobPositiveCase=this.inputCustomerDobPositiveCase(lCustomerDobPositiveCase)
				if(!lMapCustomerDobPositiveCase.Result){
					lCustomerDobPositiveCase=''
				}else{
					lCustomerDobPositiveCase=lMapCustomerDobPositiveCase.CustomerDobPositiveCase
				}
				caseOutput.CustomerDobPositiveCase=lCustomerDobPositiveCase
				if(lCustomerDobPositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
				Map lMapCustomerDob=this.inputCustomerDob(lCustomerDob,lIsCustomerDobPositiveCase)
				lCustomerDob=lMapCustomerDob.CustomerDob
				caseOutput.CustomerDob=lCustomerDob
				if(!lMapCustomerDob.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCustomerAddressPositiveCase=this.inputCustomerAddressPositiveCase(lCustomerAddressPositiveCase)
				if(!lMapCustomerAddressPositiveCase.Result){
					lCustomerAddressPositiveCase=''
				}else{
					lCustomerAddressPositiveCase=lMapCustomerAddressPositiveCase.CustomerAddressPositiveCase
				}
				caseOutput.CustomerAddressPositiveCase=lCustomerAddressPositiveCase
				if(lCustomerAddressPositiveCase.length()<=0){
					return lreturn
				}
				Boolean lIsCustomerAddressPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerAddressPositiveCase)
				Map lMapCustomerAddress=this.inputCustomerAddress(lCustomerAddress,lIsCustomerAddressPositiveCase)
				lCustomerAddress=lMapCustomerAddress.CustomerAddress
				caseOutput.CustomerAddress=lCustomerAddress
				if(!lMapCustomerAddress.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapCarHaveInsurance=this.inputCarHaveInsurance(lCarHaveInsurance)
				lCarHaveInsurance=lMapCarHaveInsurance.CarHaveInsurance
				caseOutput.CarHaveInsurance=lCarHaveInsurance
				if(!lMapCarHaveInsurance.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Boolean lIsCarOwnership=IGNUemaHelper.convertStringToBoolean(lCarOwnership.trim())
				Map lMapCarOwnership=this.inputCarOwnership(lCarOwnership)
				if(!lMapCarOwnership.Result){
					lCarOwnership=''
				}else{
					lCarOwnership=lMapCarOwnership.CarOwnership
				}
				caseOutput.CarOwnership=lCarOwnership
				if(lCarOwnership.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				if(!lIsCarOwnership){
					Map lMapCarInstalmentPositiveCase=this.inputCarInstalmentPositiveCase(lCarInstalmentPositiveCase)
					if(!lMapCarInstalmentPositiveCase.Result){
						lCarInstalmentPositiveCase=''
					}else{
						lCarInstalmentPositiveCase=lMapCarInstalmentPositiveCase.CarInstalmentPositiveCase
					}
					caseOutput.CarInstalmentPositiveCase=lCarInstalmentPositiveCase
					if(lCarInstalmentPositiveCase.length()<=0){
						return lreturn
					}
					Boolean lIsCarInstalmentPositiveCase=IGNUemaHelper.convertStringToBoolean(lCarInstalmentPositiveCase)
					Map lMapCarInstalmentPaidTerm=this.inputCarInstalmentPaidTerm(lCarInstalmentPaidTerm)
					if(!lMapCarInstalmentPaidTerm.Result){
						lCarInstalmentPaidTerm=''
					}else{
						lCarInstalmentPaidTerm=lMapCarInstalmentPaidTerm.CarInstalmentPaidTerm
					}
					caseOutput.CarInstalmentPaidTerm=lCarInstalmentPaidTerm
					if(lCarInstalmentPaidTerm.length()<=0){
						return lreturn
					}
					Map lMapCarInstalmentAmount=this.inputCarInstalmentAmount(lCarInstalmentAmount,lIsCarInstalmentPositiveCase)
					if(!lMapCarInstalmentAmount.Result){
						lCarInstalmentAmount=''
					}else{
						lCarInstalmentAmount=lMapCarInstalmentAmount.CarInstalmentAmount
					}
					caseOutput.CarInstalmentAmount=lCarInstalmentAmount
					if(lCarInstalmentAmount.length()<=0){
						if(lIsCarInstalmentPositiveCase){
							return lreturn
						}
					}
					if(!this.waitUntilLoaded()){
						return lreturn
					}
				}
				Map lMapLoanProduct=this.inputLoanProduct(lLoanProduct01HomeLoan,lLoanProduct02CreditCard,lLoanProduct03PersonalLoan,lLoanProduct04None)
				if(!lMapLoanProduct.Result){
					lLoanProduct01HomeLoan=''
					lLoanProduct02CreditCard=''
					lLoanProduct03PersonalLoan=''
					lLoanProduct04None=''
				}else{
					lLoanProduct01HomeLoan=lMapLoanProduct.LoanProduct01HomeLoan
					lLoanProduct02CreditCard=lMapLoanProduct.LoanProduct02CreditCard
					lLoanProduct03PersonalLoan=lMapLoanProduct.LoanProduct03PersonalLoan
					lLoanProduct04None=lMapLoanProduct.LoanProduct04None
				}
				caseOutput.LoanProduct01HomeLoan=lLoanProduct01HomeLoan
				caseOutput.LoanProduct02CreditCard=lLoanProduct02CreditCard
				caseOutput.LoanProduct03PersonalLoan=lLoanProduct03PersonalLoan
				caseOutput.LoanProduct04None=lLoanProduct04None
				if(!lMapLoanProduct.Result){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
					return lreturn
				}
				Map lMapLatePayment=this.inputLatePayment(lLatePayment)
				if(!lMapLatePayment.Result){
					lLatePayment=''
				}else{
					lLatePayment=lMapLatePayment.LatePayment
				}
				caseOutput.LatePayment=lLatePayment
				if(lLatePayment.length()<=0){
					return lreturn
				}
				if(!this.waitUntilLoaded()){
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
			}
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Boolean waitUntilLoaded(){
		Boolean lreturn=false
		try{
			String lTagFormLoading='loading'
			String lLocatorFormLoading=IGNUemaHelper.getTagDataSeleniumKey(lTagFormLoading)
			if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
				IGNUemaHelper.delayThreadSecond(1)
				if(!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(1)
				}
			}
			lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			if(!lreturn){
				IGNUemaHelper.delayThreadSecond(1)
				if(IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorFormLoading)){
					IGNUemaHelper.delayThreadSecond(1)
				}
				lreturn=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorFormLoading,60)
			}
			if(lreturn){
				IGNUemaHelper.delayThreadSecond(1)
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
			lPositiveCase=THAKumkaLoanCarInputType.DEFAULT_POSITIVE_CASE
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
	public Map inputLoginUserPassword(String strLoginUser,String strLoginPassword){
		Map lreturn=[:]
		String lLoginUser=strLoginUser.trim()
		if(lLoginUser.length()<=0){
			lLoginUser=THAKumkaLoanCarInputType.DEFAULT_LOGIN_USER
		}
		String lLoginPassword=strLoginPassword.trim()
		if(lLoginPassword.length()<=0){
			lLoginPassword=THAKumkaLoanCarInputType.DEFAULT_LOGIN_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('LoginUser','')
			lreturn.put('LoginPassword','')
			lreturn.put('Result',lResult)
			WebElement lElementLogin=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'username')
			if(lElementLogin){
				lLoginUser=IGNUemaHelper.typeTextByWebElement(this.driver,lElementLogin,lLoginUser)
			}
			WebElement lElementPassword=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'password')
			if(lElementPassword){
				lLoginPassword=IGNUemaHelper.typeTextByWebElement(this.driver,lElementPassword,lLoginPassword)
			}
			WebElement lElementSignIn=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,'sign-in')
			if(lElementSignIn){
				lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSignIn)
			}
			if(lResult){
				lreturn.put('LoginUser',lLoginUser)
				lreturn.put('LoginPassword',lLoginPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputVersion(String strBaseUrl,String strVersion){
		Map lreturn=[:]
		String lBaseUrl=strBaseUrl.trim()
		if(lBaseUrl.length()<=0){
			lBaseUrl=THAKumkaLoanCarInputType.DEFAULT_BASE_URL
		}
		String lDefaultVersion=THAKumkaLoanCarInputType.DEFAULT_VERSION
		lDefaultVersion=lDefaultVersion.toLowerCase()
		String lVersion=strVersion.trim()
		if(lVersion.length()<=0){
			lVersion=lDefaultVersion
		}
		try{
			Boolean lResult=false
			lreturn.put('Version','')
			lreturn.put('Result',lResult)
			String lBrowserInfo=IGNUemaHelper.getBrowserInfo(this.driver)
			this.driver.get(lBaseUrl+'/#/about')
			IGNUemaHelper.delayThreadSecond(3)
			String lBuildVersion=IGNUemaHelper.getTextByLocator(this.driver,'#app')
			lBuildVersion=lBuildVersion.trim()
			String lVersionOutput=''
			lVersion=IGNUemaHelper.validateVersionString(lVersion,lDefaultVersion)
			lVersion=lVersion.toUpperCase()
			this.driver.get(lBaseUrl+'/#/?ABTestStart='+lVersion)
			IGNUemaHelper.delayThreadSecond(3)
			lVersionOutput=lVersion.toUpperCase()
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBrowserInfo)
			lVersionOutput=IGNUemaHelper.concatMessageLeftRightByPipe(lVersionOutput,lBuildVersion)
			lResult=lVersionOutput.length()>0
			lreturn.put('Version',lVersionOutput)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputLanguageA(strLanguage)
						break
					case 'B':
						lreturn=this.inputLanguageB(strLanguage)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputLanguageA(strLanguage)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguageA(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAKumkaLoanCarInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lLanguageItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lLanguageItem)
			if(!lElementButton){
				lLanguage='No Option'
			}else{
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
				String lTagButtonSelected='language-selected'
				String lLocatorButtonSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonSelected)
				if(!lElementButtonSelected){
					lLanguage=lLanguageItem
				}else{
					lLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAKumkaLoanCarInputType.DEFAULT_LANGUAGE
			}
			lResult=lLanguage.length()>0
			String lTagPDPAForm=''
			String lLocatorPDPAForm='#pdpa_cookie'
			WebElement lElementPDPAForm=null
			Boolean lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			String lTagPDPAButton=''
			String lLocatorPDPAButton='#pdpa_accept_all'
			WebElement lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			lTagPDPAForm='pdpa_cookie'
			lLocatorPDPAForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAForm)
			lElementPDPAForm=null
			lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			lTagPDPAButton='pdpa_accept_all'
			lLocatorPDPAButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAButton)
			lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lResult){
				lreturn.put('Language',lLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLanguageB(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.toUpperCase().trim()
		Map lLanguageList=['EN':'en','TH':'th']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAKumkaLoanCarInputType.DEFAULT_LANGUAGE.toUpperCase())
			}
			String lTagButton='language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lLanguageItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lLanguageItem)
			if(!lElementButton){
				lLanguage='No Option'
			}else{
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementButton)
				String lTagButtonSelected='language-selected'
				String lLocatorButtonSelected=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonSelected)
				if(!lElementButtonSelected){
					lLanguage=lLanguageItem
				}else{
					lLanguage=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			if(lLanguage.toUpperCase().contains('NO OPTION')){
				lLanguage=THAKumkaLoanCarInputType.DEFAULT_LANGUAGE
			}
			lResult=lLanguage.length()>0
			String lTagPDPAForm=''
			String lLocatorPDPAForm='#pdpa_cookie'
			WebElement lElementPDPAForm=null
			Boolean lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			String lTagPDPAButton=''
			String lLocatorPDPAButton='#pdpa_accept_all'
			WebElement lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementOfWebElement(this.driver,lElementPDPAForm,lLocatorPDPAButton,false)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			lTagPDPAForm='pdpa_cookie'
			lLocatorPDPAForm=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAForm)
			lElementPDPAForm=null
			lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
			lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
			lTagPDPAButton='pdpa_accept_all'
			lLocatorPDPAButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPDPAButton)
			lElementPDPAButton=null
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lIsClassPDPAFormDisplayed){
				lElementPDPAForm=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagPDPAForm)
				if(lElementPDPAForm){
					lElementPDPAButton=IGNUemaHelper.getChildWebElementFromDataSeleniumKey(this.driver,lElementPDPAForm,lTagPDPAButton)
					if(lElementPDPAButton){
						IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementPDPAButton)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPDPAForm,5)
						lIsClassPDPAFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPDPAForm)
					}
				}
			}
			if(lResult){
				lreturn.put('Language',lLanguage)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final String CONST_TAG_PAGE_ITEM_LIST='question-card'
	public static final String CONST_TAG_DROPDOWN_ITEM_LIST='dropdown-item'
	public static final String CONST_TAG_BUTTON_PAGE_NEXT='next-btn'
	public Map inputCarMake(String strCarMake){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarMakeA(strCarMake)
						break
					case 'B':
						lreturn=this.inputCarMakeB(strCarMake)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarMakeA(strCarMake)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarMakeA(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THAKumkaLoanCarInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='brand'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='brand-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList=this.CONST_TAG_DROPDOWN_ITEM_LIST
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarMake='No Option'
			}else{
				lCarMake=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarMake,true)
			}
			lResult=lCarMake.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CarMake',lCarMake)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarMakeB(String strCarMake){
		Map lreturn=[:]
		String lCarMake=strCarMake.trim()
		if(lCarMake.length()<=0){
			lCarMake=THAKumkaLoanCarInputType.DEFAULT_CAR_MAKE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarMake','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarMake=false
			String lTagCarMakePopularImageButtonList='brand-logo'
			String lTagCarMakeDropdownButton='brand-selected'
			String lTagCarMakeDropdownItemList='dropdown-brand-item'
			String lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,false)
			lIsFoundCarMake=lCarMakeItem.length()>0
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarMakeDropdownButton,lTagCarMakeDropdownItemList,lCarMake,false)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			if(!lIsFoundCarMake){
				lCarMakeItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,'',lTagCarMakePopularImageButtonList,lCarMake,true)
				lIsFoundCarMake=lCarMakeItem.length()>0
			}
			lCarMake=lCarMakeItem
			lResult=lIsFoundCarMake
			if(lResult){
				lreturn.put('CarMake',lCarMake)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModel(String strCarModel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarModelA(strCarModel)
						break
					case 'B':
						lreturn=this.inputCarModelB(strCarModel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarModelA(strCarModel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModelA(String strCarModel){
		Map lreturn=[:]
		String lCarModel=strCarModel.trim()
		if(lCarModel.length()<=0){
			lCarModel=THAKumkaLoanCarInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='model'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='model-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList=this.CONST_TAG_DROPDOWN_ITEM_LIST
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarModel='No Option'
			}else{
				lCarModel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarModel,true)
			}
			lResult=lCarModel.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CarModel',lCarModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarModelB(String strCarModel){
		Map lreturn=[:]
		String lCarModel=strCarModel.trim()
		if(lCarModel.length()<=0){
			lCarModel=THAKumkaLoanCarInputType.DEFAULT_CAR_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarModel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarModel=false
			String lTagCarModelDropdownButton='model-select'
			String lTagCarModelDropdownItemList='dropdown-model-item'
			String lCarModelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarModelDropdownButton,lTagCarModelDropdownItemList,lCarModel,true)
			lIsFoundCarModel=lCarModelItem.length()>0
			lCarModel=lCarModelItem
			lResult=lIsFoundCarModel
			if(lResult){
				lreturn.put('CarModel',lCarModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYear(String strCarYear){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarYearA(strCarYear)
						break
					case 'B':
						lreturn=this.inputCarYearB(strCarYear)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarYearA(strCarYear)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYearA(String strCarYear){
		Map lreturn=[:]
		String lCarYear=strCarYear.trim()
		if(lCarYear.length()<=0){
			lCarYear=THAKumkaLoanCarInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='year'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='year-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList=this.CONST_TAG_DROPDOWN_ITEM_LIST
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarYear='No Option'
			}else{
				lCarYear=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarYear,true)
			}
			lResult=lCarYear.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CarYear',lCarYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarYearB(String strCarYear){
		Map lreturn=[:]
		String lCarYear=strCarYear.trim()
		if(lCarYear.length()<=0){
			lCarYear=THAKumkaLoanCarInputType.DEFAULT_CAR_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CarYear','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarYear=false
			String lTagCarYearDropdownButton='year-select'
			String lTagCarYearDropdownItemList='dropdown-year-item'
			String lCarYearItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarYearDropdownButton,lTagCarYearDropdownItemList,lCarYear,true)
			lIsFoundCarYear=lCarYearItem.length()>0
			lCarYear=lCarYearItem
			lResult=lIsFoundCarYear
			if(lResult){
				lreturn.put('CarYear',lCarYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodel(String strCarSubmodel){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarSubmodelA(strCarSubmodel)
						break
					case 'B':
						lreturn=this.inputCarSubmodelB(strCarSubmodel)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarSubmodelA(strCarSubmodel)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodelA(String strCarSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strCarSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAKumkaLoanCarInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='sub-model'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='sub-model-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList=this.CONST_TAG_DROPDOWN_ITEM_LIST
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarSubmodel='No Option'
			}else{
				lCarSubmodel=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagButton,lTagDropdownList,lCarSubmodel,true)
			}
			lResult=lCarSubmodel.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CarSubmodel',lCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarSubmodelB(String strCarSubmodel){
		Map lreturn=[:]
		String lCarSubmodel=strCarSubmodel.trim()
		if(lCarSubmodel.length()<=0){
			lCarSubmodel=THAKumkaLoanCarInputType.DEFAULT_CAR_SUBMODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarSubmodel','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCarSubmodel=false
			String lTagCarSubmodelDropdownButton='sub-model-select'
			String lTagCarSubmodelDropdownItemList='dropdown-subModel-item'
			String lCarSubmodelItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV3(this.driver,lTagCarSubmodelDropdownButton,lTagCarSubmodelDropdownItemList,lCarSubmodel,true)
			lIsFoundCarSubmodel=lCarSubmodelItem.length()>0
			lCarSubmodel=lCarSubmodelItem
			lResult=lIsFoundCarSubmodel
			if(lResult){
				lreturn.put('CarSubmodel',lCarSubmodel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerOccupation(String strCustomerOccupation){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerOccupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerOccupationA(strCustomerOccupation)
						break
					case 'B':
						lreturn=this.inputCustomerOccupationB(strCustomerOccupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerOccupationA(strCustomerOccupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerOccupationA(String strCustomerOccupation){
		Map lreturn=[:]
		String lCustomerOccupation=strCustomerOccupation.trim()
		if(lCustomerOccupation.length()<=0){
			lCustomerOccupation=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerOccupation','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='occupation'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='occupation-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList=this.CONST_TAG_DROPDOWN_ITEM_LIST
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCustomerOccupation='No Option'
			}else{
				lCustomerOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCustomerOccupation,true)
			}
			lResult=lCustomerOccupation.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CustomerOccupation',lCustomerOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerOccupationB(String strCustomerOccupation){
		Map lreturn=[:]
		String lCustomerOccupation=strCustomerOccupation.trim()
		if(lCustomerOccupation.length()<=0){
			lCustomerOccupation=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerOccupation','')
			lreturn.put('Result',lResult)
			Boolean lIsFoundCustomerOccupation=false
			String lTagCustomerOccupationDropdownButton='occupation-select'
			String lTagCustomerOccupationDropdownItemList='dropdown-occupation-item'
			String lCustomerOccupationItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCustomerOccupationDropdownButton,lTagCustomerOccupationDropdownItemList,lCustomerOccupation,true)
			lIsFoundCustomerOccupation=lCustomerOccupationItem.length()>0
			lCustomerOccupation=lCustomerOccupationItem
			lResult=lIsFoundCustomerOccupation
			if(lResult){
				lreturn.put('CustomerOccupation',lCustomerOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalaryPositiveCase(String strCustomerSalaryPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalaryPositiveCase','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerSalaryPositiveCaseA(strCustomerSalaryPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerSalaryPositiveCaseB(strCustomerSalaryPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerSalaryPositiveCaseA(strCustomerSalaryPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalaryPositiveCaseA(String strCustomerSalaryPositiveCase){
		Map lreturn=[:]
		String lCustomerSalaryPositiveCase=strCustomerSalaryPositiveCase.trim()
		if(lCustomerSalaryPositiveCase.length()<=0){
			lCustomerSalaryPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_SALARY_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalaryPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerSalaryPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerSalaryPositiveCase)
			lCustomerSalaryPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerSalaryPositiveCase)
			lResult=lCustomerSalaryPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerSalaryPositiveCase',lCustomerSalaryPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalaryPositiveCaseB(String strCustomerSalaryPositiveCase){
		Map lreturn=[:]
		String lCustomerSalaryPositiveCase=strCustomerSalaryPositiveCase.trim()
		if(lCustomerSalaryPositiveCase.length()<=0){
			lCustomerSalaryPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_SALARY_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalaryPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerSalaryPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerSalaryPositiveCase)
			lCustomerSalaryPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerSalaryPositiveCase)
			lResult=lCustomerSalaryPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerSalaryPositiveCase',lCustomerSalaryPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalary(String strCustomerSalary,Boolean isCustomerSalaryPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalary','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerSalaryA(strCustomerSalary,isCustomerSalaryPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerSalaryB(strCustomerSalary,isCustomerSalaryPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerSalaryA(strCustomerSalary,isCustomerSalaryPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalaryA(String strCustomerSalary,Boolean isCustomerSalaryPositiveCase){
		Map lreturn=[:]
		String lCustomerSalary=strCustomerSalary.trim()
		if(lCustomerSalary.length()<=0){
			lCustomerSalary=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_SALARY
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalary','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='income'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagInputText='income-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerSalary=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCustomerSalary)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					Boolean lIsClicked=IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
					if(isCustomerSalaryPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCustomerSalaryPositiveCase
				}
			}else if(!isCustomerSalaryPositiveCase){
				lResult=true
			}
			lreturn.put('CustomerSalary',lCustomerSalary)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerSalaryB(String strCustomerSalary,Boolean isCustomerSalaryPositiveCase){
		Map lreturn=[:]
		String lCustomerSalary=strCustomerSalary.trim()
		if(lCustomerSalary.length()<=0){
			lCustomerSalary=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_SALARY
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerSalary','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='income'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagInputText='income-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerSalary=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCustomerSalary)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				String lTagCustomerSalaryNextButton='income-next-btn'
				String lLocatorCustomerSalaryNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerSalaryNextButton)
				WebElement lElementCustomerSalaryNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerSalaryNextButton)
				if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCustomerSalaryNextButton)){
					Boolean lIsClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerSalaryNextButton)
					if(isCustomerSalaryPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCustomerSalaryPositiveCase
				}
			}else if(!isCustomerSalaryPositiveCase){
				lResult=true
			}
			lreturn.put('CustomerSalary',lCustomerSalary)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerWorkExperience(String strCustomerWorkExperience){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerWorkExperience','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerWorkExperienceA(strCustomerWorkExperience)
						break
					case 'B':
						lreturn=this.inputCustomerWorkExperienceB(strCustomerWorkExperience)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerWorkExperienceA(strCustomerWorkExperience)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerWorkExperienceA(String strCustomerWorkExperience){
		Map lreturn=[:]
		String lCustomerWorkExperience=strCustomerWorkExperience.trim()
		Map lCustomerWorkExperienceList=['1':'0','2':'1','3':'2','4':'3']
		if(lCustomerWorkExperience.length()<=0){
			lCustomerWorkExperience=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_WORK_EXPERIENCE
		}
		Integer lCustomerWorkExperienceDefault=3
		try{
			Boolean lResult=false
			lreturn.put('CustomerWorkExperience','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='work-experience'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lCustomerWorkExperienceItem=lCustomerWorkExperienceList.get(lCustomerWorkExperience)
			if(!lCustomerWorkExperienceItem){
				lCustomerWorkExperienceItem=lCustomerWorkExperienceList.get(THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_WORK_EXPERIENCE.toUpperCase())
			}
			Integer lCustomerWorkExperienceNum=IGNUemaHelper.convertStringToInteger(lCustomerWorkExperienceItem,lCustomerWorkExperienceDefault)
			String lTagButton='work-exp-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCustomerWorkExperienceNum)
			if(!lValid){
				lCustomerWorkExperience='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCustomerWorkExperience=''
				}else{
					lCustomerWorkExperience=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCustomerWorkExperience.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CustomerWorkExperience',lCustomerWorkExperience)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerWorkExperienceB(String strCustomerWorkExperience){
		Map lreturn=[:]
		String lCustomerWorkExperience=strCustomerWorkExperience.trim()
		Map lCustomerWorkExperienceList=['1':'0','2':'1','3':'2','4':'3']
		if(lCustomerWorkExperience.length()<=0){
			lCustomerWorkExperience=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_WORK_EXPERIENCE
		}
		Integer lCustomerWorkExperienceDefault=3
		try{
			Boolean lResult=false
			lreturn.put('CustomerWorkExperience','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='work-experience'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lCustomerWorkExperienceItem=lCustomerWorkExperienceList.get(lCustomerWorkExperience)
			if(!lCustomerWorkExperienceItem){
				lCustomerWorkExperienceItem=lCustomerWorkExperienceList.get(THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_WORK_EXPERIENCE.toUpperCase())
			}
			Integer lCustomerWorkExperienceNum=IGNUemaHelper.convertStringToInteger(lCustomerWorkExperienceItem,lCustomerWorkExperienceDefault)
			String lTagButton='work-exp-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCustomerWorkExperienceNum)
			if(!lValid){
				lCustomerWorkExperience='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCustomerWorkExperience=''
				}else{
					lCustomerWorkExperience=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCustomerWorkExperience.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CustomerWorkExperience',lCustomerWorkExperience)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobPositiveCase(String strCustomerDobPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerDobPositiveCase','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerDobPositiveCaseA(strCustomerDobPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerDobPositiveCaseB(strCustomerDobPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerDobPositiveCaseA(strCustomerDobPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobPositiveCaseA(String strCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDobPositiveCase=strCustomerDobPositiveCase.trim()
		if(lCustomerDobPositiveCase.length()<=0){
			lCustomerDobPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_DOB_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDobPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
			lCustomerDobPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerDobPositiveCase)
			lResult=lCustomerDobPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerDobPositiveCase',lCustomerDobPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobPositiveCaseB(String strCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDobPositiveCase=strCustomerDobPositiveCase.trim()
		if(lCustomerDobPositiveCase.length()<=0){
			lCustomerDobPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_DOB_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDobPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerDobPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerDobPositiveCase)
			lCustomerDobPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerDobPositiveCase)
			lResult=lCustomerDobPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerDobPositiveCase',lCustomerDobPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDob(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerDobA(strCustomerDob,isCustomerDobPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerDobB(strCustomerDob,isCustomerDobPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerDobA(strCustomerDob,isCustomerDobPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobA(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDob=strCustomerDob.trim()
		if(lCustomerDob.length()<=0){
			lCustomerDob=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='dob'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagInputText='dob-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerDob=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCustomerDob)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					Boolean lIsClicked=IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
					if(isCustomerDobPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCustomerDobPositiveCase
				}
			}else if(!isCustomerDobPositiveCase){
				lResult=true
			}
			lreturn.put('CustomerDob',lCustomerDob)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerDobB(String strCustomerDob,Boolean isCustomerDobPositiveCase){
		Map lreturn=[:]
		String lCustomerDob=strCustomerDob.trim()
		if(lCustomerDob.length()<=0){
			lCustomerDob=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerDob','')
			lreturn.put('Result',lResult)
			String lDobDay=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobMonth=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lCustomerDob)
			String lDobYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lCustomerDob)
			lCustomerDob=''
			String lTagDobDayInput='dob-input-date'
			String lLocatorDobDayInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobDayInput)
			String lTagDobMonthInput='dob-input-month'
			String lLocatorDobMonthInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobMonthInput)
			String lTagDobYearInput='dob-input-year'
			String lLocatorDobYearInput=IGNUemaHelper.getTagDataSeleniumKey(lTagDobYearInput)
			lDobDay=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobDayInput,lDobDay)
			lDobMonth=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobMonthInput,lDobMonth)
			lDobYear=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorDobYearInput,lDobYear)
			String lTagDobNextButton='dob-next-btn'
			String lLocatorDobNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDobNextButton)
			WebElement lElementDobNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDobNextButton)
			if(!lElementDobNextButton){
				return lreturn
			}
			Boolean lIsDobNextClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementDobNextButton)
			if(isCustomerDobPositiveCase){
				lResult=lIsDobNextClicked
			}else{
				lResult=!lIsDobNextClicked
			}
			if(lResult){
				lCustomerDob=lDobDay+'/'+lDobMonth+'/'+lDobYear
			}
			lreturn.put('CustomerDob',lCustomerDob)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddressPositiveCase(String strCustomerAddressPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddressPositiveCase','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerAddressPositiveCaseA(strCustomerAddressPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerAddressPositiveCaseB(strCustomerAddressPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerAddressPositiveCaseA(strCustomerAddressPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddressPositiveCaseA(String strCustomerAddressPositiveCase){
		Map lreturn=[:]
		String lCustomerAddressPositiveCase=strCustomerAddressPositiveCase.trim()
		if(lCustomerAddressPositiveCase.length()<=0){
			lCustomerAddressPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_ADDRESS_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddressPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerAddressPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerAddressPositiveCase)
			lCustomerAddressPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerAddressPositiveCase)
			lResult=lCustomerAddressPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerAddressPositiveCase',lCustomerAddressPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddressPositiveCaseB(String strCustomerAddressPositiveCase){
		Map lreturn=[:]
		String lCustomerAddressPositiveCase=strCustomerAddressPositiveCase.trim()
		if(lCustomerAddressPositiveCase.length()<=0){
			lCustomerAddressPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_ADDRESS_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddressPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCustomerAddressPositiveCase=IGNUemaHelper.convertStringToBoolean(lCustomerAddressPositiveCase)
			lCustomerAddressPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCustomerAddressPositiveCase)
			lResult=lCustomerAddressPositiveCase.length()>0
			if(lResult){
				lreturn.put('CustomerAddressPositiveCase',lCustomerAddressPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddress(String strCustomerAddress,Boolean isCustomerAddressPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddress','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCustomerAddressA(strCustomerAddress,isCustomerAddressPositiveCase)
						break
					case 'B':
						lreturn=this.inputCustomerAddressB(strCustomerAddress,isCustomerAddressPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCustomerAddressA(strCustomerAddress,isCustomerAddressPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddressA(String strCustomerAddress,Boolean isCustomerAddressPositiveCase){
		Map lreturn=[:]
		String lCustomerAddress=strCustomerAddress.trim()
		if(lCustomerAddress.length()<=0){
			lCustomerAddress=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_ADDRESS
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddress','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='address'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagInputText='address-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerAddress=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCustomerAddress)
			IGNUemaHelper.delayThreadSecond(5)
			String lTagDropdownList='address-item'
			List<WebElement> lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			Integer lElementDropdownItemListSizeA=lElementDropdownItemList.size()
			if(!lElementDropdownItemList){
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				if(!lElementDropdownItemList){
					IGNUemaHelper.delayThreadSecond(3)
					lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
					lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				}
			}
			List<WebElement> lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			Integer lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			}
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			}
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			}
			if(!lElementDropdownItemList){
				if(!isCustomerAddressPositiveCase){
					lResult=true
				}
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			WebElement lElementDropdownItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementDropdownItemList)
			if(!lElementDropdownItem){
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementDropdownItemList)
			}
			if(!lElementDropdownItem){
				if(!isCustomerAddressPositiveCase){
					lResult=true
				}
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			if(IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDropdownItem)){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementDropdownItem)
				Boolean lIsSelected=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementDropdownItem)
				IGNUemaHelper.delayThreadSecond(1)
				lCustomerAddress=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText))
				if(!lIsSelected){
					lreturn.put('CustomerAddress',lCustomerAddress)
					lreturn.put('Result',lResult)
					return lreturn
				}
			}else{
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			lCustomerAddress=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText))
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					Boolean lIsClicked=IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
					if(isCustomerAddressPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCustomerAddressPositiveCase
				}
			}else if(!isCustomerAddressPositiveCase){
				lResult=true
			}
			lreturn.put('CustomerAddress',lCustomerAddress)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCustomerAddressB(String strCustomerAddress,Boolean isCustomerAddressPositiveCase){
		Map lreturn=[:]
		String lCustomerAddress=strCustomerAddress.trim()
		if(lCustomerAddress.length()<=0){
			lCustomerAddress=THAKumkaLoanCarInputType.DEFAULT_CUSTOMER_ADDRESS
		}
		try{
			Boolean lResult=false
			lreturn.put('CustomerAddress','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='address'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagInputText='address-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCustomerAddress=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCustomerAddress)
			IGNUemaHelper.delayThreadSecond(5)
			String lTagDropdownList='address-item'
			List<WebElement> lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			Integer lElementDropdownItemListSizeA=lElementDropdownItemList.size()
			if(!lElementDropdownItemList){
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				if(!lElementDropdownItemList){
					IGNUemaHelper.delayThreadSecond(3)
					lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
					lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				}
			}
			List<WebElement> lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			Integer lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			}
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeA=lElementDropdownItemList.size()
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItemListPost=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
				lElementDropdownItemListSizeB=lElementDropdownItemListPost.size()
			}
			if(lElementDropdownItemListSizeA!=lElementDropdownItemListSizeB){
				IGNUemaHelper.delayThreadSecond(3)
				lElementDropdownItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagDropdownList)
			}
			if(!lElementDropdownItemList){
				if(!isCustomerAddressPositiveCase){
					lResult=true
				}
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			WebElement lElementDropdownItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementDropdownItemList)
			if(!lElementDropdownItem){
				IGNUemaHelper.delayThreadSecond(1)
				lElementDropdownItem=IGNUemaHelper.getWebElementRandomFromWebElementList(this.driver,lElementDropdownItemList)
			}
			if(!lElementDropdownItem){
				if(!isCustomerAddressPositiveCase){
					lResult=true
				}
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			if(IGNUemaHelper.checkElementVisibleByElementJs(this.driver,lElementDropdownItem)){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementDropdownItem)
				Boolean lIsSelected=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementDropdownItem)
				IGNUemaHelper.delayThreadSecond(1)
				lCustomerAddress=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText))
				if(!lIsSelected){
					lreturn.put('CustomerAddress',lCustomerAddress)
					lreturn.put('Result',lResult)
					return lreturn
				}
			}else{
				lreturn.put('CustomerAddress',lCustomerAddress)
				lreturn.put('Result',lResult)
				return lreturn
			}
			lCustomerAddress=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputText))
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				String lTagCustomerAddressNextButton='postalCode-next-btn'
				String lLocatorCustomerAddressNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCustomerAddressNextButton)
				WebElement lElementCustomerAddressNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCustomerAddressNextButton)
				if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCustomerAddressNextButton)){
					Boolean lIsClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCustomerAddressNextButton)
					if(isCustomerAddressPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCustomerAddressPositiveCase
				}
			}else if(!isCustomerAddressPositiveCase){
				lResult=true
			}
			lreturn.put('CustomerAddress',lCustomerAddress)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRegisterUnder(String strCarRegisterUnder){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarRegisterUnder','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarRegisterUnderA(strCarRegisterUnder)
						break
					case 'B':
						lreturn=this.inputCarRegisterUnderB(strCarRegisterUnder)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarRegisterUnderA(strCarRegisterUnder)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRegisterUnderA(String strCarRegisterUnder){
		Map lreturn=[:]
		String lCarRegisterUnder=strCarRegisterUnder.trim()
		Map lCarRegisterUnderList=['1':'0','2':'1']
		if(lCarRegisterUnder.length()<=0){
			lCarRegisterUnder=THAKumkaLoanCarInputType.DEFAULT_CAR_REGISTER_UNDER
		}
		Integer lCarRegisterUnderDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarRegisterUnder','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-registration-type'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lCarRegisterUnderItem=lCarRegisterUnderList.get(lCarRegisterUnder)
			if(!lCarRegisterUnderItem){
				lCarRegisterUnderItem=lCarRegisterUnderList.get(THAKumkaLoanCarInputType.DEFAULT_CAR_REGISTER_UNDER.toUpperCase())
			}
			Integer lCarRegisterUnderNum=IGNUemaHelper.convertStringToInteger(lCarRegisterUnderItem,lCarRegisterUnderDefault)
			String lTagButton='car-registration-type-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCarRegisterUnderNum)
			if(!lValid){
				lCarRegisterUnder='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarRegisterUnder=''
				}else{
					lCarRegisterUnder=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarRegisterUnder.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarRegisterUnder',lCarRegisterUnder)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarRegisterUnderB(String strCarRegisterUnder){
		Map lreturn=[:]
		String lCarRegisterUnder=strCarRegisterUnder.trim()
		Map lCarRegisterUnderList=['1':'0','2':'1']
		if(lCarRegisterUnder.length()<=0){
			lCarRegisterUnder=THAKumkaLoanCarInputType.DEFAULT_CAR_REGISTER_UNDER
		}
		Integer lCarRegisterUnderDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarRegisterUnder','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-registration-type'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lCarRegisterUnderItem=lCarRegisterUnderList.get(lCarRegisterUnder)
			if(!lCarRegisterUnderItem){
				lCarRegisterUnderItem=lCarRegisterUnderList.get(THAKumkaLoanCarInputType.DEFAULT_CAR_REGISTER_UNDER.toUpperCase())
			}
			Integer lCarRegisterUnderNum=IGNUemaHelper.convertStringToInteger(lCarRegisterUnderItem,lCarRegisterUnderDefault)
			String lTagButton='car-registration-type-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCarRegisterUnderNum)
			if(!lValid){
				lCarRegisterUnder='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarRegisterUnder=''
				}else{
					lCarRegisterUnder=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarRegisterUnder.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarRegisterUnder',lCarRegisterUnder)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarHaveInsurance(String strCarHaveInsurance){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarHaveInsurance','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarHaveInsuranceA(strCarHaveInsurance)
						break
					case 'B':
						lreturn=this.inputCarHaveInsuranceB(strCarHaveInsurance)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarHaveInsuranceA(strCarHaveInsurance)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarHaveInsuranceA(String strCarHaveInsurance){
		Map lreturn=[:]
		String lCarHaveInsurance=strCarHaveInsurance.trim()
		Map lCarHaveInsuranceList=['1':'0','2':'1','3':'2','4':'3']
		if(lCarHaveInsurance.length()<=0){
			lCarHaveInsurance=THAKumkaLoanCarInputType.DEFAULT_CAR_HAVE_INSURANCE
		}
		Integer lCarHaveInsuranceDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarHaveInsurance','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-type'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lCarHaveInsuranceItem=lCarHaveInsuranceList.get(lCarHaveInsurance)
			if(!lCarHaveInsuranceItem){
				lCarHaveInsuranceItem=lCarHaveInsuranceList.get(THAKumkaLoanCarInputType.DEFAULT_CAR_HAVE_INSURANCE.toUpperCase())
			}
			Integer lCarHaveInsuranceNum=IGNUemaHelper.convertStringToInteger(lCarHaveInsuranceItem,lCarHaveInsuranceDefault)
			String lTagButton='car-insurance-type-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCarHaveInsuranceNum)
			if(!lValid){
				lCarHaveInsurance='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarHaveInsurance=''
				}else{
					lCarHaveInsurance=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarHaveInsurance.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarHaveInsurance',lCarHaveInsurance)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarHaveInsuranceB(String strCarHaveInsurance){
		Map lreturn=[:]
		String lCarHaveInsurance=strCarHaveInsurance.trim()
		Map lCarHaveInsuranceList=['1':'0','2':'1','3':'2','4':'3']
		if(lCarHaveInsurance.length()<=0){
			lCarHaveInsurance=THAKumkaLoanCarInputType.DEFAULT_CAR_HAVE_INSURANCE
		}
		Integer lCarHaveInsuranceDefault=0
		try{
			Boolean lResult=false
			lreturn.put('CarHaveInsurance','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-type'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lCarHaveInsuranceItem=lCarHaveInsuranceList.get(lCarHaveInsurance)
			if(!lCarHaveInsuranceItem){
				lCarHaveInsuranceItem=lCarHaveInsuranceList.get(THAKumkaLoanCarInputType.DEFAULT_CAR_HAVE_INSURANCE.toUpperCase())
			}
			Integer lCarHaveInsuranceNum=IGNUemaHelper.convertStringToInteger(lCarHaveInsuranceItem,lCarHaveInsuranceDefault)
			String lTagButton='car-insurance-type-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lCarHaveInsuranceNum)
			if(!lValid){
				lCarHaveInsurance='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarHaveInsurance=''
				}else{
					lCarHaveInsurance=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarHaveInsurance.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarHaveInsurance',lCarHaveInsurance)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceExpire(String strCarInsuranceExpire){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceExpire','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInsuranceExpireA(strCarInsuranceExpire)
						break
					case 'B':
						lreturn=this.inputCarInsuranceExpireB(strCarInsuranceExpire)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInsuranceExpireA(strCarInsuranceExpire)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceExpireA(String strCarInsuranceExpire){
		Map lreturn=[:]
		String lCarInsuranceExpire=strCarInsuranceExpire.trim()
		if(lCarInsuranceExpire.length()<=0){
			lCarInsuranceExpire=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_EXPIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceExpire','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-expire'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				lCarInsuranceExpire='No Option'
			}else{
				if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					return lreturn
				}
				String lTagButton='car-insurance-expire-selected'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				String lTagDropdownList='car-insurance-expire-select'
				String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
				Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
				if(!lValid){
					lCarInsuranceExpire='No Option'
				}else{
					lCarInsuranceExpire=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarInsuranceExpire,true)
				}
			}
			lResult=lCarInsuranceExpire.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
			}
			if(lResult){
				lreturn.put('CarInsuranceExpire',lCarInsuranceExpire)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceExpireB(String strCarInsuranceExpire){
		Map lreturn=[:]
		String lCarInsuranceExpire=strCarInsuranceExpire.trim()
		if(lCarInsuranceExpire.length()<=0){
			lCarInsuranceExpire=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_EXPIRE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceExpire','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-expire'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			Boolean lIsCarInsuranceExpireDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementPageCurrent)
			if(!lIsCarInsuranceExpireDisplayed){
				lCarInsuranceExpire='No Option'
			}else{
				String lTagCarInsuranceExpireDropdownButton='car-insurance-expire-selected'
				String lTagCarInsuranceExpireDropdownItemList='car-insurance-expire-select'
				String lCarInsuranceExpireItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagCarInsuranceExpireDropdownButton,lTagCarInsuranceExpireDropdownItemList,lCarInsuranceExpire,true)
				lCarInsuranceExpire=lCarInsuranceExpireItem
			}
			lResult=lCarInsuranceExpire.length()>0
			if(lResult){
				lreturn.put('CarInsuranceExpire',lCarInsuranceExpire)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceOffer(String strCarInsuranceOffer){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceOffer','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInsuranceOfferA(strCarInsuranceOffer)
						break
					case 'B':
						lreturn=this.inputCarInsuranceOfferB(strCarInsuranceOffer)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInsuranceOfferA(strCarInsuranceOffer)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceOfferA(String strCarInsuranceOffer){
		Map lreturn=[:]
		String lCarInsuranceOffer=strCarInsuranceOffer.trim()
		if(lCarInsuranceOffer.length()<=0){
			lCarInsuranceOffer=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_OFFER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceOffer','')
			lreturn.put('Result',lResult)
			Boolean lIsCarInsuranceOffer=IGNUemaHelper.convertStringToBoolean(lCarInsuranceOffer)
			String lStrPageCurrent='car-insurance-offer'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				lCarInsuranceOffer='No Option'
			}else{
				if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					return lreturn
				}
				String lTagButton='callmeback-accept-btn'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				Boolean lValid=false
				if(lIsCarInsuranceOffer){
					lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,0)
				}else{
					lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,1)
				}
				if(!lValid){
					lCarInsuranceOffer='No Option'
				}else{
					WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
					if(!lElementButtonSelected){
						lCarInsuranceOffer=''
					}else{
						lCarInsuranceOffer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
					}
				}
			}
			lResult=lCarInsuranceOffer.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarInsuranceOffer',lCarInsuranceOffer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceOfferB(String strCarInsuranceOffer){
		Map lreturn=[:]
		String lCarInsuranceOffer=strCarInsuranceOffer.trim()
		if(lCarInsuranceOffer.length()<=0){
			lCarInsuranceOffer=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_OFFER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceOffer','')
			lreturn.put('Result',lResult)
			Boolean lIsCarInsuranceOffer=IGNUemaHelper.convertStringToBoolean(lCarInsuranceOffer)
			String lStrPageCurrent='car-insurance-offer'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			Boolean lIsCarInsuranceOfferDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementPageCurrent)
			if(!lIsCarInsuranceOfferDisplayed){
				lCarInsuranceOffer='No Option'
			}else{
				String lTagButton=''
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				Boolean lValid=false
				if(lIsCarInsuranceOffer){
					lTagButton='callmeback-accept-btn'
					lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButton)
				}else{
					lTagButton='callmeback-declide-btn'
					lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
					lValid=IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButton)
				}
				if(!lValid){
					lCarInsuranceOffer='No Option'
				}else{
					WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
					if(!lElementButtonSelected){
						lCarInsuranceOffer=''
					}else{
						lCarInsuranceOffer=IGNUemaHelper.getChildTextByWebElement(this.driver,lElementButtonSelected).trim()
					}
				}
			}
			lResult=lCarInsuranceOffer.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarInsuranceOffer',lCarInsuranceOffer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackToDo(String strCarInsuranceCallMeBackToDo){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackToDo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInsuranceCallMeBackToDoA(strCarInsuranceCallMeBackToDo)
						break
					case 'B':
						lreturn=this.inputCarInsuranceCallMeBackToDoB(strCarInsuranceCallMeBackToDo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInsuranceCallMeBackToDoA(strCarInsuranceCallMeBackToDo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackToDoA(String strCarInsuranceCallMeBackToDo){
		Map lreturn=[:]
		String lCarInsuranceCallMeBackToDo=strCarInsuranceCallMeBackToDo.trim()
		if(lCarInsuranceCallMeBackToDo.length()<=0){
			lCarInsuranceCallMeBackToDo=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackToDo','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-callmeback'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				lCarInsuranceCallMeBackToDo='No Option'
			}else{
				Boolean lIsCarInsuranceCallMeBackToDo=IGNUemaHelper.convertStringToBoolean(lCarInsuranceCallMeBackToDo)
				lCarInsuranceCallMeBackToDo=IGNUemaHelper.convertBooleanToString(lIsCarInsuranceCallMeBackToDo)
				if(!lIsCarInsuranceCallMeBackToDo){
					String lTagButton='callmeback-skip-btn'
					String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
					WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(!lElementButton){
						lCarInsuranceCallMeBackToDo='No Option'
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
			lResult=lCarInsuranceCallMeBackToDo.length()>0
			if(lResult){
				lreturn.put('CarInsuranceCallMeBackToDo',lCarInsuranceCallMeBackToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackToDoB(String strCarInsuranceCallMeBackToDo){
		Map lreturn=[:]
		String lCarInsuranceCallMeBackToDo=strCarInsuranceCallMeBackToDo.trim()
		if(lCarInsuranceCallMeBackToDo.length()<=0){
			lCarInsuranceCallMeBackToDo=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackToDo','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-callmeback'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			Boolean lIsCarInsuranceCallMeBackDisplayed=IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementPageCurrent)
			if(!lIsCarInsuranceCallMeBackDisplayed){
				lCarInsuranceCallMeBackToDo='No Option'
			}else{
				Boolean lIsCarInsuranceCallMeBackToDo=IGNUemaHelper.convertStringToBoolean(lCarInsuranceCallMeBackToDo)
				lCarInsuranceCallMeBackToDo=IGNUemaHelper.convertBooleanToYesNoString(lIsCarInsuranceCallMeBackToDo)
				if(!lIsCarInsuranceCallMeBackToDo){
					String lTagButton='callmeback-skip-btn'
					String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
					WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
					if(!lElementButton){
						lCarInsuranceCallMeBackToDo='No Option'
					}
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
				}
			}
			lResult=lCarInsuranceCallMeBackToDo.length()>0
			if(lResult){
				lreturn.put('CarInsuranceCallMeBackToDo',lCarInsuranceCallMeBackToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackNumber(String strCarInsuranceCallMeBackNumber){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackNumber','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInsuranceCallMeBackNumberA(strCarInsuranceCallMeBackNumber)
						break
					case 'B':
						lreturn=this.inputCarInsuranceCallMeBackNumberB(strCarInsuranceCallMeBackNumber)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInsuranceCallMeBackNumberA(strCarInsuranceCallMeBackNumber)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackNumberA(String strCarInsuranceCallMeBackNumber){
		Map lreturn=[:]
		String lCarInsuranceCallMeBackNumber=strCarInsuranceCallMeBackNumber.trim()
		if(lCarInsuranceCallMeBackNumber.length()<=0){
			lCarInsuranceCallMeBackNumber=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackNumber','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='car-insurance-callmeback'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				lCarInsuranceCallMeBackNumber='No Option'
			}else{
				String lTagInputText='callmeback-input'
				String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
				lCarInsuranceCallMeBackNumber=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCarInsuranceCallMeBackNumber)
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('callmeback-next-btn'))
			}
			lResult=lCarInsuranceCallMeBackNumber.length()>0
			if(lResult){
				lreturn.put('CarInsuranceCallMeBackNumber',lCarInsuranceCallMeBackNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInsuranceCallMeBackNumberB(String strCarInsuranceCallMeBackNumber){
		Map lreturn=[:]
		String lCarInsuranceCallMeBackNumber=strCarInsuranceCallMeBackNumber.trim()
		if(lCarInsuranceCallMeBackNumber.length()<=0){
			lCarInsuranceCallMeBackNumber=THAKumkaLoanCarInputType.DEFAULT_CAR_INSURANCE_CALL_ME_BACK_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInsuranceCallMeBackNumber','')
			lreturn.put('Result',lResult)
			String lOpportunityNumber=''
			String lStrPageCurrent='car-insurance-callmeback'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				lCarInsuranceCallMeBackNumber='No Option'
			}else{
				String lTagInputText='callmeback-input'
				String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
				lCarInsuranceCallMeBackNumber=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCarInsuranceCallMeBackNumber)
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('callmeback-next-btn'))
				String lTagOpportunityNumberText='callmeback-opportunity'
				String lLocatorOpportunityNumberText=IGNUemaHelper.getTagDataSeleniumKey(lTagOpportunityNumberText)
				WebElement lElementOpportunityNumberText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberText)
				if(lElementOpportunityNumberText){
					for(Integer lIndex=1;lIndex<=15;lIndex++){
						lElementOpportunityNumberText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberText)
						lOpportunityNumber=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOpportunityNumberText).trim()
						if(lOpportunityNumber.length()>0){
							break
						}else{
							IGNUemaHelper.delayThreadSecond(lIndex)
						}
					}
					if(lOpportunityNumber.length()>0){
						lCarInsuranceCallMeBackNumber=IGNUemaHelper.concatMessageLeftRightByPipe(lCarInsuranceCallMeBackNumber,lOpportunityNumber)
					}else{
						lCarInsuranceCallMeBackNumber=IGNUemaHelper.concatMessageLeftRightByPipe(lCarInsuranceCallMeBackNumber,'No OpportunityNumber')
					}
				}
			}
			lResult=(lCarInsuranceCallMeBackNumber.length()>0)&&(lOpportunityNumber.length()>0)
			lreturn.put('CarInsuranceCallMeBackNumber',lCarInsuranceCallMeBackNumber)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOwnership(String strCarOwnership){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarOwnership','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarOwnershipA(strCarOwnership)
						break
					case 'B':
						lreturn=this.inputCarOwnershipB(strCarOwnership)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarOwnershipA(strCarOwnership)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOwnershipA(String strCarOwnership){
		Map lreturn=[:]
		String lCarOwnership=strCarOwnership.trim()
		if(lCarOwnership.length()<=0){
			lCarOwnership=THAKumkaLoanCarInputType.DEFAULT_CAR_OWNERSHIP
		}
		try{
			Boolean lResult=false
			lreturn.put('CarOwnership','')
			lreturn.put('Result',lResult)
			Boolean lIsCarOwnership=IGNUemaHelper.convertStringToBoolean(lCarOwnership)
			String lStrPageCurrent='car-status'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='car-status-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=false
			if(lIsCarOwnership){
				lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,0)
			}else{
				lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,1)
			}
			if(!lValid){
				lCarOwnership='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarOwnership=''
				}else{
					lCarOwnership=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarOwnership.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarOwnership',lCarOwnership)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarOwnershipB(String strCarOwnership){
		Map lreturn=[:]
		String lCarOwnership=strCarOwnership.trim()
		if(lCarOwnership.length()<=0){
			lCarOwnership=THAKumkaLoanCarInputType.DEFAULT_CAR_OWNERSHIP
		}
		try{
			Boolean lResult=false
			lreturn.put('CarOwnership','')
			lreturn.put('Result',lResult)
			Boolean lIsCarOwnership=IGNUemaHelper.convertStringToBoolean(lCarOwnership)
			String lStrPageCurrent='car-status'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagButton='car-status-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=false
			if(lIsCarOwnership){
				lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,0)
			}else{
				lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,1)
			}
			if(!lValid){
				lCarOwnership='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lCarOwnership=''
				}else{
					lCarOwnership=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
			}
			lResult=lCarOwnership.length()>0
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('CarOwnership',lCarOwnership)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPositiveCase(String strCarInstalmentPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPositiveCase','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInstalmentPositiveCaseA(strCarInstalmentPositiveCase)
						break
					case 'B':
						lreturn=this.inputCarInstalmentPositiveCaseB(strCarInstalmentPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInstalmentPositiveCaseA(strCarInstalmentPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPositiveCaseA(String strCarInstalmentPositiveCase){
		Map lreturn=[:]
		String lCarInstalmentPositiveCase=strCarInstalmentPositiveCase.trim()
		if(lCarInstalmentPositiveCase.length()<=0){
			lCarInstalmentPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCarInstalmentPositiveCase=IGNUemaHelper.convertStringToBoolean(lCarInstalmentPositiveCase)
			lCarInstalmentPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCarInstalmentPositiveCase)
			lResult=lCarInstalmentPositiveCase.length()>0
			if(lResult){
				lreturn.put('CarInstalmentPositiveCase',lCarInstalmentPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPositiveCaseB(String strCarInstalmentPositiveCase){
		Map lreturn=[:]
		String lCarInstalmentPositiveCase=strCarInstalmentPositiveCase.trim()
		if(lCarInstalmentPositiveCase.length()<=0){
			lCarInstalmentPositiveCase=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_POSITIVE_CASE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPositiveCase','')
			lreturn.put('Result',lResult)
			Boolean lIsCarInstalmentPositiveCase=IGNUemaHelper.convertStringToBoolean(lCarInstalmentPositiveCase)
			lCarInstalmentPositiveCase=IGNUemaHelper.convertBooleanToString(lIsCarInstalmentPositiveCase)
			lResult=lCarInstalmentPositiveCase.length()>0
			if(lResult){
				lreturn.put('CarInstalmentPositiveCase',lCarInstalmentPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPaidTerm(String strCarInstalmentPaidTerm){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPaidTerm','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInstalmentPaidTermA(strCarInstalmentPaidTerm)
						break
					case 'B':
						lreturn=this.inputCarInstalmentPaidTermB(strCarInstalmentPaidTerm)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInstalmentPaidTermA(strCarInstalmentPaidTerm)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPaidTermA(String strCarInstalmentPaidTerm){
		Map lreturn=[:]
		String lCarInstalmentPaidTerm=strCarInstalmentPaidTerm.trim()
		if(lCarInstalmentPaidTerm.length()<=0){
			lCarInstalmentPaidTerm=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_PAID_TERM
		}
		Integer lCarInstalmentPaidTermDefault=7
		Integer lCarInstalmentPaidTermMax=14
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPaidTerm','')
			lreturn.put('Result',lResult)
			Integer lNumCarInstalmentPaidTerm=IGNUemaHelper.convertStringToInteger(lCarInstalmentPaidTerm,lCarInstalmentPaidTermDefault)
			if((lNumCarInstalmentPaidTerm<0)||(lNumCarInstalmentPaidTerm>lCarInstalmentPaidTermMax)){
				lNumCarInstalmentPaidTerm=lCarInstalmentPaidTermDefault
			}
			String lStrPageCurrent='installment-info'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='paid-loan-slider'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectSliderTrackByLocatorV2(this.driver,lLocatorButton,lCarInstalmentPaidTermMax,lNumCarInstalmentPaidTerm,)
			if(lValid){
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				lCarInstalmentPaidTerm=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lResult=lCarInstalmentPaidTerm.length()>0
			}
			if(lResult){
				lreturn.put('CarInstalmentPaidTerm',lCarInstalmentPaidTerm)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentPaidTermB(String strCarInstalmentPaidTerm){
		Map lreturn=[:]
		String lCarInstalmentPaidTerm=strCarInstalmentPaidTerm.trim()
		if(lCarInstalmentPaidTerm.length()<=0){
			lCarInstalmentPaidTerm=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_PAID_TERM
		}
		Integer lCarInstalmentPaidTermDefault=7
		Integer lCarInstalmentPaidTermMax=14
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentPaidTerm','')
			lreturn.put('Result',lResult)
			Integer lNumCarInstalmentPaidTerm=IGNUemaHelper.convertStringToInteger(lCarInstalmentPaidTerm,lCarInstalmentPaidTermDefault)
			if((lNumCarInstalmentPaidTerm<0)||(lNumCarInstalmentPaidTerm>lCarInstalmentPaidTermMax)){
				lNumCarInstalmentPaidTerm=lCarInstalmentPaidTermDefault
			}
			String lStrPageCurrent='installment-info'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagButton='paid-loan-slider'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectSliderTrackByLocatorV2(this.driver,lLocatorButton,lCarInstalmentPaidTermMax,lNumCarInstalmentPaidTerm,)
			if(lValid){
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				lCarInstalmentPaidTerm=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lResult=lCarInstalmentPaidTerm.length()>0
			}
			if(lResult){
				lreturn.put('CarInstalmentPaidTerm',lCarInstalmentPaidTerm)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentAmount(String strCarInstalmentAmount,Boolean isCarInstalmentPositiveCase){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentAmount','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarInstalmentAmountA(strCarInstalmentAmount,isCarInstalmentPositiveCase)
						break
					case 'B':
						lreturn=this.inputCarInstalmentAmountB(strCarInstalmentAmount,isCarInstalmentPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarInstalmentAmountA(strCarInstalmentAmount,isCarInstalmentPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentAmountA(String strCarInstalmentAmount,Boolean isCarInstalmentPositiveCase){
		Map lreturn=[:]
		String lCarInstalmentAmount=strCarInstalmentAmount.trim()
		if(lCarInstalmentAmount.length()<=0){
			lCarInstalmentAmount=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_AMOUNT
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentAmount','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='installment-info'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagInputText='monthly-installment-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCarInstalmentAmount=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCarInstalmentAmount)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					Boolean lIsClicked=IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
					if(isCarInstalmentPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCarInstalmentPositiveCase
				}
			}else if(!isCarInstalmentPositiveCase){
				lResult=true
			}
			lreturn.put('CarInstalmentAmount',lCarInstalmentAmount)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarInstalmentAmountB(String strCarInstalmentAmount,Boolean isCarInstalmentPositiveCase){
		Map lreturn=[:]
		String lCarInstalmentAmount=strCarInstalmentAmount.trim()
		if(lCarInstalmentAmount.length()<=0){
			lCarInstalmentAmount=THAKumkaLoanCarInputType.DEFAULT_CAR_INSTALMENT_AMOUNT
		}
		try{
			Boolean lResult=false
			lreturn.put('CarInstalmentAmount','')
			lreturn.put('Result',lResult)
			String lStrPageCurrent='installment-info'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagInputText='monthly-installment-input'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCarInstalmentAmount=IGNUemaHelper.typeTextByLocator(this.driver,lLocatorInputText,lCarInstalmentAmount)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				String lTagCarInstalmentPaidTermNextButton='installment-info-next-btn'
				String lLocatorCarInstalmentPaidTermNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCarInstalmentPaidTermNextButton)
				WebElement lElementCarInstalmentPaidTermNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCarInstalmentPaidTermNextButton)
				if(IGNUemaHelper.checkElementVisibleByElementKs(this.driver,lElementCarInstalmentPaidTermNextButton)){
					Boolean lIsClicked=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCarInstalmentPaidTermNextButton)
					if(isCarInstalmentPositiveCase){
						lResult=lIsClicked
					}else{
						lResult=!lIsClicked
					}
				}else{
					lResult=isCarInstalmentPositiveCase
				}
			}else if(!isCarInstalmentPositiveCase){
				lResult=true
			}
			lreturn.put('CarInstalmentAmount',lCarInstalmentAmount)
			lreturn.put('Result',lResult)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoanProduct(String strLoanProduct,String strLoanProduct02CreditCard,String strLoanProduct03PersonalLoan,String strLoanProduct04None){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('LoanProduct','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputLoanProductA(strLoanProduct,strLoanProduct02CreditCard,strLoanProduct03PersonalLoan,strLoanProduct04None)
						break
					case 'B':
						lreturn=this.inputLoanProductB(strLoanProduct,strLoanProduct02CreditCard,strLoanProduct03PersonalLoan,strLoanProduct04None)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputLoanProductA(strLoanProduct,strLoanProduct02CreditCard,strLoanProduct03PersonalLoan,strLoanProduct04None)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoanProductA(String strLoanProduct01HomeLoan,String strLoanProduct02CreditCard,String strLoanProduct03PersonalLoan,String strLoanProduct04None){
		Map lreturn=[:]
		String lLoanProduct01HomeLoan=strLoanProduct01HomeLoan.trim()
		if(lLoanProduct01HomeLoan.length()<=0){
			lLoanProduct01HomeLoan=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_01_HOME_LOAN
		}
		String lLoanProduct02CreditCard=strLoanProduct02CreditCard.trim()
		if(lLoanProduct02CreditCard.length()<=0){
			lLoanProduct02CreditCard=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_02_CREDIT_CARD
		}
		String lLoanProduct03PersonalLoan=strLoanProduct03PersonalLoan.trim()
		if(lLoanProduct03PersonalLoan.length()<=0){
			lLoanProduct03PersonalLoan=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_03_PERSONAL_LOAN
		}
		String lLoanProduct04None=strLoanProduct04None.trim()
		if(lLoanProduct04None.length()<=0){
			lLoanProduct04None=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_04_NONE
		}
		try{
			Boolean lResult=false
			lreturn.put('LoanProduct01HomeLoan','')
			lreturn.put('LoanProduct02CreditCard','')
			lreturn.put('LoanProduct03PersonalLoan','')
			lreturn.put('LoanProduct04None','')
			lreturn.put('Result',lResult)
			Boolean lIsLoanProduct01HomeLoan=IGNUemaHelper.convertStringToBoolean(lLoanProduct01HomeLoan)
			Boolean lIsLoanProduct02CreditCard=IGNUemaHelper.convertStringToBoolean(lLoanProduct02CreditCard)
			Boolean lIsLoanProduct03PersonalLoan=IGNUemaHelper.convertStringToBoolean(lLoanProduct03PersonalLoan)
			Boolean lIsLoanProduct04None=IGNUemaHelper.convertStringToBoolean(lLoanProduct04None)
			String lStrPageCurrent='loan-credit'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='loan-credit-history-list'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			List<WebElement> lElementItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementItemList){
				return lreturn
			}
			WebElement lElementItem01=lElementItemList[0]
			if(!lElementItem01){
				return lreturn
			}
			WebElement lElementItem02=lElementItemList[1]
			if(!lElementItem02){
				return lreturn
			}
			WebElement lElementItem03=lElementItemList[2]
			if(!lElementItem03){
				return lreturn
			}
			WebElement lElementItem04=lElementItemList[3]
			if(!lElementItem04){
				return lreturn
			}
			Boolean lStage01=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem01),'input',true))
			Boolean lStage02=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem02),'input',true))
			Boolean lStage03=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem03),'input',true))
			Boolean lStage04=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem04),'input',true))
			if(lStage04){
				if(!lIsLoanProduct04None){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem04)
				}
			}else{
				if(lIsLoanProduct04None){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem04)
				}
			}
			if(lStage01){
				if(!lIsLoanProduct01HomeLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem01)
				}
			}else{
				if(lIsLoanProduct01HomeLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem01)
				}
			}
			if(lStage02){
				if(!lIsLoanProduct02CreditCard){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem02)
				}
			}else{
				if(lIsLoanProduct02CreditCard){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem02)
				}
			}
			if(lStage03){
				if(!lIsLoanProduct03PersonalLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem03)
				}
			}else{
				if(lIsLoanProduct03PersonalLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem03)
				}
			}
			lStage01=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem01),'input',true))
			lStage02=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem02),'input',true))
			lStage03=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem03),'input',true))
			lStage04=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem04),'input',true))
			lIsLoanProduct01HomeLoan=lStage01
			lIsLoanProduct02CreditCard=lStage02
			lIsLoanProduct03PersonalLoan=lStage03
			lIsLoanProduct04None=lStage04
			lLoanProduct01HomeLoan=IGNUemaHelper.convertBooleanToString(lIsLoanProduct01HomeLoan)
			lLoanProduct02CreditCard=IGNUemaHelper.convertBooleanToString(lIsLoanProduct02CreditCard)
			lLoanProduct03PersonalLoan=IGNUemaHelper.convertBooleanToString(lIsLoanProduct03PersonalLoan)
			lLoanProduct04None=IGNUemaHelper.convertBooleanToString(lIsLoanProduct04None)
			lResult=(lIsLoanProduct01HomeLoan||lIsLoanProduct02CreditCard||lIsLoanProduct03PersonalLoan||lIsLoanProduct04None)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}

			if(lResult){
				lreturn.put('LoanProduct01HomeLoan',lLoanProduct01HomeLoan)
				lreturn.put('LoanProduct01HomeLoan',lLoanProduct01HomeLoan)
				lreturn.put('LoanProduct02CreditCard',lLoanProduct02CreditCard)
				lreturn.put('LoanProduct03PersonalLoan',lLoanProduct03PersonalLoan)
				lreturn.put('LoanProduct04None',lLoanProduct04None)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLoanProductB(String strLoanProduct01HomeLoan,String strLoanProduct02CreditCard,String strLoanProduct03PersonalLoan,String strLoanProduct04None){
		Map lreturn=[:]
		String lLoanProduct01HomeLoan=strLoanProduct01HomeLoan.trim()
		if(lLoanProduct01HomeLoan.length()<=0){
			lLoanProduct01HomeLoan=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_01_HOME_LOAN
		}
		String lLoanProduct02CreditCard=strLoanProduct02CreditCard.trim()
		if(lLoanProduct02CreditCard.length()<=0){
			lLoanProduct02CreditCard=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_02_CREDIT_CARD
		}
		String lLoanProduct03PersonalLoan=strLoanProduct03PersonalLoan.trim()
		if(lLoanProduct03PersonalLoan.length()<=0){
			lLoanProduct03PersonalLoan=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_03_PERSONAL_LOAN
		}
		String lLoanProduct04None=strLoanProduct04None.trim()
		if(lLoanProduct04None.length()<=0){
			lLoanProduct04None=THAKumkaLoanCarInputType.DEFAULT_LOAN_PRODUCT_04_NONE
		}
		try{
			Boolean lResult=false
			lreturn.put('LoanProduct01HomeLoan','')
			lreturn.put('LoanProduct02CreditCard','')
			lreturn.put('LoanProduct03PersonalLoan','')
			lreturn.put('LoanProduct04None','')
			lreturn.put('Result',lResult)
			Boolean lIsLoanProduct01HomeLoan=IGNUemaHelper.convertStringToBoolean(lLoanProduct01HomeLoan)
			Boolean lIsLoanProduct02CreditCard=IGNUemaHelper.convertStringToBoolean(lLoanProduct02CreditCard)
			Boolean lIsLoanProduct03PersonalLoan=IGNUemaHelper.convertStringToBoolean(lLoanProduct03PersonalLoan)
			Boolean lIsLoanProduct04None=IGNUemaHelper.convertStringToBoolean(lLoanProduct04None)
			String lStrPageCurrent='loan-credit'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagButton='loan-credit-history-list'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			List<WebElement> lElementItemList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementItemList){
				return lreturn
			}
			WebElement lElementItem01=lElementItemList[0]
			if(!lElementItem01){
				return lreturn
			}
			WebElement lElementItem02=lElementItemList[1]
			if(!lElementItem02){
				return lreturn
			}
			WebElement lElementItem03=lElementItemList[2]
			if(!lElementItem03){
				return lreturn
			}
			WebElement lElementItem04=lElementItemList[3]
			if(!lElementItem04){
				return lreturn
			}
			Boolean lStage01=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem01),'input',true))
			Boolean lStage02=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem02),'input',true))
			Boolean lStage03=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem03),'input',true))
			Boolean lStage04=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem04),'input',true))
			if(lStage04){
				if(!lIsLoanProduct04None){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem04)
				}
			}else{
				if(lIsLoanProduct04None){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem04)
				}
			}
			if(lStage01){
				if(!lIsLoanProduct01HomeLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem01)
				}
			}else{
				if(lIsLoanProduct01HomeLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem01)
				}
			}
			if(lStage02){
				if(!lIsLoanProduct02CreditCard){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem02)
				}
			}else{
				if(lIsLoanProduct02CreditCard){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem02)
				}
			}
			if(lStage03){
				if(!lIsLoanProduct03PersonalLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem03)
				}
			}else{
				if(lIsLoanProduct03PersonalLoan){
					IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementItem03)
				}
			}
			lStage01=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem01),'input',true))
			lStage02=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem02),'input',true))
			lStage03=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem03),'input',true))
			lStage04=IGNUemaHelper.checkElementCheckedByElementJs(this.driver,IGNUemaHelper.getChildWebElementOfWebElement(this.driver,IGNUemaHelper.getParentElementOfWebElement(this.driver,lElementItem04),'input',true))
			lIsLoanProduct01HomeLoan=lStage01
			lIsLoanProduct02CreditCard=lStage02
			lIsLoanProduct03PersonalLoan=lStage03
			lIsLoanProduct04None=lStage04
			lLoanProduct01HomeLoan=IGNUemaHelper.convertBooleanToString(lIsLoanProduct01HomeLoan)
			lLoanProduct02CreditCard=IGNUemaHelper.convertBooleanToString(lIsLoanProduct02CreditCard)
			lLoanProduct03PersonalLoan=IGNUemaHelper.convertBooleanToString(lIsLoanProduct03PersonalLoan)
			lLoanProduct04None=IGNUemaHelper.convertBooleanToString(lIsLoanProduct04None)
			lResult=(lIsLoanProduct01HomeLoan||lIsLoanProduct02CreditCard||lIsLoanProduct03PersonalLoan||lIsLoanProduct04None)
			this.waitUntilLoaded()
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			String lTagLoanProductNextButton='loan-credit-next-btn'
			String lLocatorLoanProductNextButton=IGNUemaHelper.getTagDataSeleniumKey(lTagLoanProductNextButton)
			WebElement lElementLoanProductNextButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagLoanProductNextButton)
			if(lElementLoanProductNextButton){
				IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementLoanProductNextButton)
			}
			if(lResult){
				lreturn.put('LoanProduct01HomeLoan',lLoanProduct01HomeLoan)
				lreturn.put('LoanProduct01HomeLoan',lLoanProduct01HomeLoan)
				lreturn.put('LoanProduct02CreditCard',lLoanProduct02CreditCard)
				lreturn.put('LoanProduct03PersonalLoan',lLoanProduct03PersonalLoan)
				lreturn.put('LoanProduct04None',lLoanProduct04None)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLatePayment(String strLatePayment){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('LatePayment','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputLatePaymentA(strLatePayment)
						break
					case 'B':
						lreturn=this.inputLatePaymentB(strLatePayment)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputLatePaymentA(strLatePayment)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLatePaymentA(String strLatePayment){
		Map lreturn=[:]
		String lLatePayment=strLatePayment.trim()
		if(lLatePayment.length()<=0){
			lLatePayment=THAKumkaLoanCarInputType.DEFAULT_LATE_PAYMENT
		}
		Integer lLatePaymentDefault=0
		Integer lLatePaymentMax=3
		try{
			Boolean lResult=false
			lreturn.put('LatePayment','')
			lreturn.put('Result',lResult)
			Integer lNumLatePayment=IGNUemaHelper.convertStringToInteger(lLatePayment,lLatePaymentDefault)
			if((lNumLatePayment<0)||(lNumLatePayment>lLatePaymentMax)){
				lNumLatePayment=lLatePaymentDefault
			}
			String lStrPageCurrent='payment-status'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			if(!IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
				return lreturn
			}
			String lTagButton='payment-status-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lNumLatePayment)
			if(!lValid){
				lLatePayment='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lLatePayment=lNumLatePayment.toString()
				}else{
					lLatePayment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
				if(lLatePayment.length()<=0){
					lLatePayment=lNumLatePayment.toString()
				}
			}
			lResult=lLatePayment.length()>0
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('LatePayment',lLatePayment)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputLatePaymentB(String strLatePayment){
		Map lreturn=[:]
		String lLatePayment=strLatePayment.trim()
		if(lLatePayment.length()<=0){
			lLatePayment=THAKumkaLoanCarInputType.DEFAULT_LATE_PAYMENT
		}
		Integer lLatePaymentDefault=0
		Integer lLatePaymentMax=3
		try{
			Boolean lResult=false
			lreturn.put('LatePayment','')
			lreturn.put('Result',lResult)
			Integer lNumLatePayment=IGNUemaHelper.convertStringToInteger(lLatePayment,lLatePaymentDefault)
			if((lNumLatePayment<0)||(lNumLatePayment>lLatePaymentMax)){
				lNumLatePayment=lLatePaymentDefault
			}
			String lStrPageCurrent='payment-status'
			WebElement lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(!lElementPageCurrent){
				return lreturn
			}
			String lTagButton='payment-status-select'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			Boolean lValid=IGNUemaHelper.selectButtonFromArrayButtonByLocator(this.driver,lLocatorButton,lNumLatePayment)
			if(!lValid){
				lLatePayment='No Option'
			}else{
				WebElement lElementButtonSelected=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorButton+'.active')
				if(!lElementButtonSelected){
					lLatePayment=lNumLatePayment.toString()
				}else{
					lLatePayment=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButtonSelected)
				}
				if(lLatePayment.length()<=0){
					lLatePayment=lNumLatePayment.toString()
				}
			}
			lResult=lLatePayment.length()>0
			lElementPageCurrent=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,this.CONST_TAG_PAGE_ITEM_LIST,lStrPageCurrent)
			if(lElementPageCurrent){
				if(IGNUemaHelper.checkElementContainClassNameByWebElement(this.driver,lElementPageCurrent,'active')){
					lResult=lResult&&IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(this.CONST_TAG_BUTTON_PAGE_NEXT))
				}
			}
			if(lResult){
				lreturn.put('LatePayment',lLatePayment)
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
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputActualResultA(isPositiveCase)
						break
					case 'B':
						lreturn=this.inputActualResultB(isPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputActualResultA(isPositiveCase)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultA(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lRedirected=false
			Boolean lIsDone=false
			lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #cards',30)
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
	public Map inputActualResultB(Boolean isPositiveCase){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			String lTagButtonNext='goToCard'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			if(!lElementButton){
				return lreturn
			}
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
			Boolean lRedirected=false
			Boolean lIsDone=false
			lRedirected=IGNUemaHelper.waitElementVisibleByLocator(this.driver,'#app #cards',30)
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