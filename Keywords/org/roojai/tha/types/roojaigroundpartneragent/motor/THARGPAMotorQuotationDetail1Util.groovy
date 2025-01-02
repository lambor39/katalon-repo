package org.roojai.tha.types.roojaigroundpartneragent.motor
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.tha.types.motorbike.THAMotorBikeCoreType as THAMotorBikeCoreType
import org.roojai.tha.types.motorbike.THAMotorBikeQuotationDetail1Util
import org.roojai.tha.types.motorbike.THAMotorBikeQuotationDetail1UtilOld
import org.roojai.tha.types.motorcar.THAMotorCarCoreType as THAMotorCarCoreType
import org.roojai.tha.types.motorcar.THAMotorCarQuotationDetail1Util
import org.roojai.tha.types.motorcar.THAMotorCarQuotationDetail1UtilOld
public class THARGPAMotorQuotationDetail1Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	private def lTHAMotorBikeQuotationDetail1Util=null
	private def lTHAMotorCarQuotationDetail1Util=null
	public THARGPAMotorQuotationDetail1Util(WebDriver newDriver,WebDriver newSelenium){
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
	private THAMotorBikeQuotationDetail1Util getlTHAMotorBikeQuotationDetail1Util(){
		return this.lTHAMotorBikeQuotationDetail1Util
	}
	private void setlTHAMotorBikeQuotationDetail1Util(THAMotorBikeQuotationDetail1Util newlTHAMotorBikeQuotationDetail1Util){
		//Do Nothing
		//this.lTHAMotorBikeQuotationDetail1Util=newlTHAMotorBikeQuotationDetail1Util
	}
	private THAMotorCarQuotationDetail1Util getlTHAMotorCarQuotationDetail1Util(){
		return this.lTHAMotorCarQuotationDetail1Util
	}
	private void setlTHAMotorCarQuotationDetail1Util(THAMotorCarQuotationDetail1Util newlTHAMotorCarQuotationDetail1Util){
		//Do Nothing
		//this.lTHAMotorCarQuotationDetail1Util=newlTHAMotorCarQuotationDetail1Util
	}
	public Boolean inputDetail1(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		try{
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
				}
			}
			//Check QuoteApplication
			THARGPAMotorCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION=IGNUemaHelper.checkWebDriverURLTargetUnderQuoteApplication(driver)
			if(THARGPAMotorCoreType.CURRENT_URL_UNDER_QUOTE_APPLICATION){
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					this.lTHAMotorBikeQuotationDetail1Util=new THAMotorBikeQuotationDetail1Util(this.driver,this.selenium)
				}else{
					this.lTHAMotorCarQuotationDetail1Util=new THAMotorCarQuotationDetail1Util(this.driver,this.selenium)
				}
			}else{
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					this.lTHAMotorBikeQuotationDetail1Util=new THAMotorBikeQuotationDetail1UtilOld(this.driver,this.selenium)
				}else{
					this.lTHAMotorCarQuotationDetail1Util=new THAMotorCarQuotationDetail1UtilOld(this.driver,this.selenium)
				}
			}
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				lreturn=this.inputDetail1MotorBike(caseInput,caseOutput)
			}else{
				lreturn=this.inputDetail1MotorCar(caseInput,caseOutput)
			}
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputDetail1MotorBike(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lHolderEmail=caseInput.HolderEmail.toString().trim()
		String lHolderNewsletter=caseInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=caseInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=caseInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=caseInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=caseInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=caseInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=caseInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=caseInput.HolderIsMain.toString().trim()
		String lCarForCommercial=caseInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=caseInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=caseInput.CarPlateProvince.toString().trim()
		String lHolderStatus=caseInput.HolderStatus.toString().trim()
		String lHolderDob=caseInput.HolderDob.toString().trim()
		String lHolderIsThai=caseInput.HolderIsThai.toString().trim()
		String lHolderThaiId=caseInput.HolderThaiId.toString().trim()
		String lHolderOccupation=caseInput.HolderOccupation.toString().trim()
		String lHolderPassport=caseInput.HolderPassport.toString().trim()
		String lHolderCountry=caseInput.HolderCountry.toString().trim()
		String lHolderName=caseInput.HolderName.toString().trim()
		String lHolderSurname=caseInput.HolderSurname.toString().trim()
		String lHolderCompId=caseInput.HolderCompId.toString().trim()
		String lHolderCompName=caseInput.HolderCompName.toString().trim()
		String lMainStatus=caseInput.MainStatus.toString().trim()
		String lMainDob=caseInput.MainDob.toString().trim()
		String lMainIsThai=caseInput.MainIsThai.toString().trim()
		String lMainThaiId=caseInput.MainThaiId.toString().trim()
		String lMainOccupation=caseInput.MainOccupation.toString().trim()
		String lMainPassport=caseInput.MainPassport.toString().trim()
		String lMainCountry=caseInput.MainCountry.toString().trim()
		String lMainName=caseInput.MainName.toString().trim()
		String lMainSurname=caseInput.MainSurname.toString().trim()
		String lMainEmail=caseInput.MainEmail.toString().trim()
		String lMainPhoneNo=caseInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=caseInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=caseInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=caseInput.Driver1Status.toString().trim()
		String lDriver1Dob=caseInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=caseInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=caseInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=caseInput.Driver1Passport.toString().trim()
		String lDriver1Country=caseInput.Driver1Country.toString().trim()
		String lDriver1Name=caseInput.Driver1Name.toString().trim()
		String lDriver1Surname=caseInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=caseInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=caseInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=caseInput.Driver1Occupation.toString().trim()
		String lDriver2Status=caseInput.Driver2Status.toString().trim()
		String lDriver2Dob=caseInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=caseInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=caseInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=caseInput.Driver2Passport.toString().trim()
		String lDriver2Country=caseInput.Driver2Country.toString().trim()
		String lDriver2Name=caseInput.Driver2Name.toString().trim()
		String lDriver2Surname=caseInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=caseInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=caseInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=caseInput.Driver2Occupation.toString().trim()
		String lDriver3Status=caseInput.Driver3Status.toString().trim()
		String lDriver3Dob=caseInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=caseInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=caseInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=caseInput.Driver3Passport.toString().trim()
		String lDriver3Country=caseInput.Driver3Country.toString().trim()
		String lDriver3Name=caseInput.Driver3Name.toString().trim()
		String lDriver3Surname=caseInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=caseInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=caseInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=caseInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=caseInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=caseInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=caseInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=caseInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=caseInput.CallMeBackMobile.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
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
			Map lMapDetail1Input=this.lTHAMotorBikeQuotationDetail1Util.initDetail1Input()
			lMapDetail1Input.Language=lLanguage
			lMapDetail1Input.HolderEmail=lHolderEmail
			lMapDetail1Input.HolderNewsletter=lHolderNewsletter
			lMapDetail1Input.HolderPhoneNo=lHolderPhoneNo
			lMapDetail1Input.HolderCallMeNowToDo=lHolderCallMeNowToDo
			lMapDetail1Input.CallMeNow=lCallMeNow
			lMapDetail1Input.CallMeBackAtDay=lCallMeBackAtDay
			lMapDetail1Input.CallMeBackAtTime=lCallMeBackAtTime
			lMapDetail1Input.HolderIsPerson=lHolderIsPerson
			lMapDetail1Input.HolderIsMain=lHolderIsMain
			lMapDetail1Input.CarForCommercial=lCarForCommercial
			lMapDetail1Input.CarPlateNumber=lCarPlateNumber
			lMapDetail1Input.CarPlateProvince=lCarPlateProvince
			lMapDetail1Input.HolderStatus=lHolderStatus
			lMapDetail1Input.HolderDob=lHolderDob
			lMapDetail1Input.HolderIsThai=lHolderIsThai
			lMapDetail1Input.HolderThaiId=lHolderThaiId
			lMapDetail1Input.HolderOccupation=lHolderOccupation
			lMapDetail1Input.HolderPassport=lHolderPassport
			lMapDetail1Input.HolderCountry=lHolderCountry
			lMapDetail1Input.HolderName=lHolderName
			lMapDetail1Input.HolderSurname=lHolderSurname
			lMapDetail1Input.HolderCompId=lHolderCompId
			lMapDetail1Input.HolderCompName=lHolderCompName
			lMapDetail1Input.MainStatus=lMainStatus
			lMapDetail1Input.MainDob=lMainDob
			lMapDetail1Input.MainIsThai=lMainIsThai
			lMapDetail1Input.MainThaiId=lMainThaiId
			lMapDetail1Input.MainOccupation=lMainOccupation
			lMapDetail1Input.MainPassport=lMainPassport
			lMapDetail1Input.MainCountry=lMainCountry
			lMapDetail1Input.MainName=lMainName
			lMapDetail1Input.MainSurname=lMainSurname
			lMapDetail1Input.MainEmail=lMainEmail
			lMapDetail1Input.MainPhoneNo=lMainPhoneNo
			lMapDetail1Input.AdditionDrivers=lAdditionDrivers
			lMapDetail1Input.DriversHaveLicense=lDriversHaveLicense
			lMapDetail1Input.Driver1Status=lDriver1Status
			lMapDetail1Input.Driver1Dob=lDriver1Dob
			lMapDetail1Input.Driver1IsThai=lDriver1IsThai
			lMapDetail1Input.Driver1ThaiId=lDriver1ThaiId
			lMapDetail1Input.Driver1Passport=lDriver1Passport
			lMapDetail1Input.Driver1Country=lDriver1Country
			lMapDetail1Input.Driver1Name=lDriver1Name
			lMapDetail1Input.Driver1Surname=lDriver1Surname
			lMapDetail1Input.Driver1YearDriving=lDriver1YearDriving
			lMapDetail1Input.Driver1ClaimsNo=lDriver1ClaimsNo
			lMapDetail1Input.Driver1Occupation=lDriver1Occupation
			lMapDetail1Input.Driver2Status=lDriver2Status
			lMapDetail1Input.Driver2Dob=lDriver2Dob
			lMapDetail1Input.Driver2IsThai=lDriver2IsThai
			lMapDetail1Input.Driver2ThaiId=lDriver2ThaiId
			lMapDetail1Input.Driver2Passport=lDriver2Passport
			lMapDetail1Input.Driver2Country=lDriver2Country
			lMapDetail1Input.Driver2Name=lDriver2Name
			lMapDetail1Input.Driver2Surname=lDriver2Surname
			lMapDetail1Input.Driver2YearDriving=lDriver2YearDriving
			lMapDetail1Input.Driver2ClaimsNo=lDriver2ClaimsNo
			lMapDetail1Input.Driver2Occupation=lDriver2Occupation
			lMapDetail1Input.Driver3Status=lDriver3Status
			lMapDetail1Input.Driver3Dob=lDriver3Dob
			lMapDetail1Input.Driver3IsThai=lDriver3IsThai
			lMapDetail1Input.Driver3ThaiId=lDriver3ThaiId
			lMapDetail1Input.Driver3Passport=lDriver3Passport
			lMapDetail1Input.Driver3Country=lDriver3Country
			lMapDetail1Input.Driver3Name=lDriver3Name
			lMapDetail1Input.Driver3Surname=lDriver3Surname
			lMapDetail1Input.Driver3YearDriving=lDriver3YearDriving
			lMapDetail1Input.Driver3ClaimsNo=lDriver3ClaimsNo
			lMapDetail1Input.Driver3Occupation=lDriver3Occupation
			lMapDetail1Input.PolicyStartDayOffset=lPolicyStartDayOffset
			lMapDetail1Input.PolicyStartDate=lPolicyStartDate
			lMapDetail1Input.SubmitCallMeBack=lSubmitCallMeBack
			lMapDetail1Input.CallMeBackEmail=lCallMeBackEmail
			lMapDetail1Input.CallMeBackMobile=lCallMeBackMobile
			Map lMapInputDetail1=[:]
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lMapInputDetail1=this.inputDetail1MotorBikeA(lMapDetail1Input,lIsPositiveCase)
						break
					case 'B':
						lMapInputDetail1=this.inputDetail1MotorBikeB(lMapDetail1Input,lIsPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lMapInputDetail1=this.inputDetail1MotorBikeA(lMapDetail1Input,lIsPositiveCase)
			}
			lLanguage=lMapInputDetail1.Language
			lHolderEmail=lMapInputDetail1.HolderEmail
			lHolderNewsletter=lMapInputDetail1.HolderNewsletter
			lHolderPhoneNo=lMapInputDetail1.HolderPhoneNo
			lHolderCallMeNowToDo=lMapInputDetail1.HolderCallMeNowToDo
			lCallMeNow=lMapInputDetail1.CallMeNow
			lCallMeBackAtDay=lMapInputDetail1.CallMeBackAtDay
			lCallMeBackAtTime=lMapInputDetail1.CallMeBackAtTime
			lHolderIsPerson=lMapInputDetail1.HolderIsPerson
			lHolderIsMain=lMapInputDetail1.HolderIsMain
			lCarForCommercial=lMapInputDetail1.CarForCommercial
			lCarPlateNumber=lMapInputDetail1.CarPlateNumber
			lCarPlateProvince=lMapInputDetail1.CarPlateProvince
			lHolderStatus=lMapInputDetail1.HolderStatus
			lHolderDob=lMapInputDetail1.HolderDob
			lHolderIsThai=lMapInputDetail1.HolderIsThai
			lHolderThaiId=lMapInputDetail1.HolderThaiId
			lHolderOccupation=lMapInputDetail1.HolderOccupation
			lHolderPassport=lMapInputDetail1.HolderPassport
			lHolderCountry=lMapInputDetail1.HolderCountry
			lHolderName=lMapInputDetail1.HolderName
			lHolderSurname=lMapInputDetail1.HolderSurname
			lHolderCompId=lMapInputDetail1.HolderCompId
			lHolderCompName=lMapInputDetail1.HolderCompName
			lMainStatus=lMapInputDetail1.MainStatus
			lMainDob=lMapInputDetail1.MainDob
			lMainIsThai=lMapInputDetail1.MainIsThai
			lMainThaiId=lMapInputDetail1.MainThaiId
			lMainOccupation=lMapInputDetail1.MainOccupation
			lMainPassport=lMapInputDetail1.MainPassport
			lMainCountry=lMapInputDetail1.MainCountry
			lMainName=lMapInputDetail1.MainName
			lMainSurname=lMapInputDetail1.MainSurname
			lMainEmail=lMapInputDetail1.MainEmail
			lMainPhoneNo=lMapInputDetail1.MainPhoneNo
			lAdditionDrivers=lMapInputDetail1.AdditionDrivers
			lDriversHaveLicense=lMapInputDetail1.DriversHaveLicense
			lDriver1Status=lMapInputDetail1.Driver1Status
			lDriver1Dob=lMapInputDetail1.Driver1Dob
			lDriver1IsThai=lMapInputDetail1.Driver1IsThai
			lDriver1ThaiId=lMapInputDetail1.Driver1ThaiId
			lDriver1Passport=lMapInputDetail1.Driver1Passport
			lDriver1Country=lMapInputDetail1.Driver1Country
			lDriver1Name=lMapInputDetail1.Driver1Name
			lDriver1Surname=lMapInputDetail1.Driver1Surname
			lDriver1YearDriving=lMapInputDetail1.Driver1YearDriving
			lDriver1ClaimsNo=lMapInputDetail1.Driver1ClaimsNo
			lDriver1Occupation=lMapInputDetail1.Driver1Occupation
			lDriver2Status=lMapInputDetail1.Driver2Status
			lDriver2Dob=lMapInputDetail1.Driver2Dob
			lDriver2IsThai=lMapInputDetail1.Driver2IsThai
			lDriver2ThaiId=lMapInputDetail1.Driver2ThaiId
			lDriver2Passport=lMapInputDetail1.Driver2Passport
			lDriver2Country=lMapInputDetail1.Driver2Country
			lDriver2Name=lMapInputDetail1.Driver2Name
			lDriver2Surname=lMapInputDetail1.Driver2Surname
			lDriver2YearDriving=lMapInputDetail1.Driver2YearDriving
			lDriver2ClaimsNo=lMapInputDetail1.Driver2ClaimsNo
			lDriver2Occupation=lMapInputDetail1.Driver2Occupation
			lDriver3Status=lMapInputDetail1.Driver3Status
			lDriver3Dob=lMapInputDetail1.Driver3Dob
			lDriver3IsThai=lMapInputDetail1.Driver3IsThai
			lDriver3ThaiId=lMapInputDetail1.Driver3ThaiId
			lDriver3Passport=lMapInputDetail1.Driver3Passport
			lDriver3Country=lMapInputDetail1.Driver3Country
			lDriver3Name=lMapInputDetail1.Driver3Name
			lDriver3Surname=lMapInputDetail1.Driver3Surname
			lDriver3YearDriving=lMapInputDetail1.Driver3YearDriving
			lDriver3ClaimsNo=lMapInputDetail1.Driver3ClaimsNo
			lDriver3Occupation=lMapInputDetail1.Driver3Occupation
			lPolicyStartDayOffset=lMapInputDetail1.PolicyStartDayOffset
			lPolicyStartDate=lMapInputDetail1.PolicyStartDate
			lSubmitCallMeBack=lMapInputDetail1.SubmitCallMeBack
			lCallMeBackEmail=lMapInputDetail1.CallMeBackEmail
			lCallMeBackMobile=lMapInputDetail1.CallMeBackMobile
			lActualResult=lMapInputDetail1.ActualResult
			lPolicyInsurer=lMapInputDetail1.PolicyInsurer
			caseOutput.Language=lLanguage
			caseOutput.HolderEmail=lHolderEmail
			caseOutput.HolderNewsletter=lHolderNewsletter
			caseOutput.HolderPhoneNo=lHolderPhoneNo
			caseOutput.HolderCallMeNowToDo=lHolderCallMeNowToDo
			caseOutput.CallMeNow=lCallMeNow
			caseOutput.CallMeBackAtDay=lCallMeBackAtDay
			caseOutput.CallMeBackAtTime=lCallMeBackAtTime
			caseOutput.HolderIsPerson=lHolderIsPerson
			caseOutput.HolderIsMain=lHolderIsMain
			caseOutput.CarForCommercial=lCarForCommercial
			caseOutput.CarPlateNumber=lCarPlateNumber
			caseOutput.CarPlateProvince=lCarPlateProvince
			caseOutput.HolderStatus=lHolderStatus
			caseOutput.HolderDob=lHolderDob
			caseOutput.HolderIsThai=lHolderIsThai
			caseOutput.HolderThaiId=lHolderThaiId
			caseOutput.HolderOccupation=lHolderOccupation
			caseOutput.HolderPassport=lHolderPassport
			caseOutput.HolderCountry=lHolderCountry
			caseOutput.HolderName=lHolderName
			caseOutput.HolderSurname=lHolderSurname
			caseOutput.HolderCompId=lHolderCompId
			caseOutput.HolderCompName=lHolderCompName
			caseOutput.MainStatus=lMainStatus
			caseOutput.MainDob=lMainDob
			caseOutput.MainIsThai=lMainIsThai
			caseOutput.MainThaiId=lMainThaiId
			caseOutput.MainOccupation=lMainOccupation
			caseOutput.MainPassport=lMainPassport
			caseOutput.MainCountry=lMainCountry
			caseOutput.MainName=lMainName
			caseOutput.MainSurname=lMainSurname
			caseOutput.MainEmail=lMainEmail
			caseOutput.MainPhoneNo=lMainPhoneNo
			caseOutput.AdditionDrivers=lAdditionDrivers
			caseOutput.DriversHaveLicense=lDriversHaveLicense
			caseOutput.Driver1Status=lDriver1Status
			caseOutput.Driver1Dob=lDriver1Dob
			caseOutput.Driver1IsThai=lDriver1IsThai
			caseOutput.Driver1ThaiId=lDriver1ThaiId
			caseOutput.Driver1Passport=lDriver1Passport
			caseOutput.Driver1Country=lDriver1Country
			caseOutput.Driver1Name=lDriver1Name
			caseOutput.Driver1Surname=lDriver1Surname
			caseOutput.Driver1YearDriving=lDriver1YearDriving
			caseOutput.Driver1ClaimsNo=lDriver1ClaimsNo
			caseOutput.Driver1Occupation=lDriver1Occupation
			caseOutput.Driver2Status=lDriver2Status
			caseOutput.Driver2Dob=lDriver2Dob
			caseOutput.Driver2IsThai=lDriver2IsThai
			caseOutput.Driver2ThaiId=lDriver2ThaiId
			caseOutput.Driver2Passport=lDriver2Passport
			caseOutput.Driver2Country=lDriver2Country
			caseOutput.Driver2Name=lDriver2Name
			caseOutput.Driver2Surname=lDriver2Surname
			caseOutput.Driver2YearDriving=lDriver2YearDriving
			caseOutput.Driver2ClaimsNo=lDriver2ClaimsNo
			caseOutput.Driver2Occupation=lDriver2Occupation
			caseOutput.Driver3Status=lDriver3Status
			caseOutput.Driver3Dob=lDriver3Dob
			caseOutput.Driver3IsThai=lDriver3IsThai
			caseOutput.Driver3ThaiId=lDriver3ThaiId
			caseOutput.Driver3Passport=lDriver3Passport
			caseOutput.Driver3Country=lDriver3Country
			caseOutput.Driver3Name=lDriver3Name
			caseOutput.Driver3Surname=lDriver3Surname
			caseOutput.Driver3YearDriving=lDriver3YearDriving
			caseOutput.Driver3ClaimsNo=lDriver3ClaimsNo
			caseOutput.Driver3Occupation=lDriver3Occupation
			caseOutput.PolicyStartDayOffset=lPolicyStartDayOffset
			caseOutput.PolicyStartDate=lPolicyStartDate
			caseOutput.SubmitCallMeBack=lSubmitCallMeBack
			caseOutput.CallMeBackEmail=lCallMeBackEmail
			caseOutput.CallMeBackMobile=lCallMeBackMobile
			caseOutput.ActualResult=lActualResult
			caseOutput.PolicyInsurer=lPolicyInsurer
			THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
			Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			if(lIsActualResult){
				Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
				if(!lMapSalesforceProceedTodo.Result){
					lSalesforceProceedTodo=''
				}else{
					lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
				}
				caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
				if(lSalesforceProceedTodo.length()<=0){
					return lreturn
				}
				Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
				}
			}
			lreturn=lIsActualResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDetail1MotorBikeA(Map mapInput,Boolean isPositiveCase){
		Map lreturn=lTHAMotorBikeQuotationDetail1Util.initDetail1Output()
		String lLanguage=mapInput.Language.toString().trim()
		String lHolderEmail=mapInput.HolderEmail.toString().trim()
		String lHolderNewsletter=mapInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=mapInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=mapInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=mapInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=mapInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=mapInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=mapInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=mapInput.HolderIsMain.toString().trim()
		String lCarForCommercial=mapInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=mapInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=mapInput.CarPlateProvince.toString().trim()
		String lHolderStatus=mapInput.HolderStatus.toString().trim()
		String lHolderDob=mapInput.HolderDob.toString().trim()
		String lHolderIsThai=mapInput.HolderIsThai.toString().trim()
		String lHolderThaiId=mapInput.HolderThaiId.toString().trim()
		String lHolderOccupation=mapInput.HolderOccupation.toString().trim()
		String lHolderPassport=mapInput.HolderPassport.toString().trim()
		String lHolderCountry=mapInput.HolderCountry.toString().trim()
		String lHolderName=mapInput.HolderName.toString().trim()
		String lHolderSurname=mapInput.HolderSurname.toString().trim()
		String lHolderCompId=mapInput.HolderCompId.toString().trim()
		String lHolderCompName=mapInput.HolderCompName.toString().trim()
		String lMainStatus=mapInput.MainStatus.toString().trim()
		String lMainDob=mapInput.MainDob.toString().trim()
		String lMainIsThai=mapInput.MainIsThai.toString().trim()
		String lMainThaiId=mapInput.MainThaiId.toString().trim()
		String lMainOccupation=mapInput.MainOccupation.toString().trim()
		String lMainPassport=mapInput.MainPassport.toString().trim()
		String lMainCountry=mapInput.MainCountry.toString().trim()
		String lMainName=mapInput.MainName.toString().trim()
		String lMainSurname=mapInput.MainSurname.toString().trim()
		String lMainEmail=mapInput.MainEmail.toString().trim()
		String lMainPhoneNo=mapInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=mapInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=mapInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=mapInput.Driver1Status.toString().trim()
		String lDriver1Dob=mapInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=mapInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=mapInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=mapInput.Driver1Passport.toString().trim()
		String lDriver1Country=mapInput.Driver1Country.toString().trim()
		String lDriver1Name=mapInput.Driver1Name.toString().trim()
		String lDriver1Surname=mapInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=mapInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=mapInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=mapInput.Driver1Occupation.toString().trim()
		String lDriver2Status=mapInput.Driver2Status.toString().trim()
		String lDriver2Dob=mapInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=mapInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=mapInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=mapInput.Driver2Passport.toString().trim()
		String lDriver2Country=mapInput.Driver2Country.toString().trim()
		String lDriver2Name=mapInput.Driver2Name.toString().trim()
		String lDriver2Surname=mapInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=mapInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=mapInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=mapInput.Driver2Occupation.toString().trim()
		String lDriver3Status=mapInput.Driver3Status.toString().trim()
		String lDriver3Dob=mapInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=mapInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=mapInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=mapInput.Driver3Passport.toString().trim()
		String lDriver3Country=mapInput.Driver3Country.toString().trim()
		String lDriver3Name=mapInput.Driver3Name.toString().trim()
		String lDriver3Surname=mapInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=mapInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=mapInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=mapInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=mapInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=mapInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=mapInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=mapInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=mapInput.CallMeBackMobile.toString().trim()
		String lPositiveCase=mapInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lOpportunityNumber=''
		Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
		try{
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lreturn.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			Map lMapSubmitCallMeBack=this.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			lreturn.SubmitCallMeBack=lSubmitCallMeBack
			lreturn.CallMeBackEmail=lCallMeBackEmail
			lreturn.CallMeBackMobile=lCallMeBackMobile
			if(!lMapSubmitCallMeBack.Result){
				return lreturn
			}
			Map lMapHolderIsMain=this.inputHolderIsMain(lHolderIsMain)
			if(!lMapHolderIsMain.Result){
				lHolderIsMain=''
			}else{
				lHolderIsMain=lMapHolderIsMain.HolderIsMain
			}
			lreturn.HolderIsMain=lHolderIsMain
			if(lHolderIsMain.length()<=0){
				return lreturn
			}
			Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
			}
			lreturn.HolderEmail=lHolderEmail
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderNewsletter=this.inputHolderNewsletter(lHolderNewsletter)
			if(!lMapHolderNewsletter.Result){
				lHolderNewsletter=''
			}else{
				lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
			}
			lreturn.HolderNewsletter=lHolderNewsletter
			if(lHolderNewsletter.length()<=0){
				return lreturn
			}
			Map lMapHolderPhoneNo=this.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			lreturn.HolderPhoneNo=lHolderPhoneNo
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Map lMapHolderCallMeNowToDo=this.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			lreturn.HolderCallMeNowToDo=lHolderCallMeNowToDo
			if(lHolderCallMeNowToDo.length()<=0){
				return lreturn
			}
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			if(!lIsHolderCallMeNowToDo){
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				lreturn.ActualResult=lActualResult
				lreturn.OpportunityNumber=lOpportunityNumber
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}else{
				Map lMapCallMeNow=this.inputCallMeNow(lCallMeNow)
				if(!lMapCallMeNow.Result){
					lCallMeNow=''
				}else{
					lCallMeNow=lMapCallMeNow.CallMeNow
				}
				lreturn.CallMeNow=lCallMeNow
				if(lCallMeNow.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtDay=this.inputCallMeBackAtDay(lCallMeBackAtDay)
				if(!lMapCallMeBackAtDay.Result){
					lCallMeBackAtDay=''
				}else{
					lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
				}
				lreturn.CallMeBackAtDay=lCallMeBackAtDay
				if(lCallMeBackAtDay.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtTime=this.inputCallMeBackAtTime(lCallMeBackAtTime)
				if(!lMapCallMeBackAtTime.Result){
					lCallMeBackAtTime=''
				}else{
					lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
				}
				lreturn.CallMeBackAtTime=lCallMeBackAtTime
				if(lCallMeBackAtTime.length()<=0){
					return lreturn
				}
				Map lMapCarForCommercial=this.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
				lreturn.CarForCommercial=lCarForCommercial
				if(lCarForCommercial.length()<=0){
					return lreturn
				}
				Map lMapHolderIsPerson=this.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
				lreturn.HolderIsPerson=lHolderIsPerson
				if(lHolderIsPerson.length()<=0){
					return lreturn
				}
				Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
				if(!lIsHolderIsPerson){
					Map lMapHolderCompName=this.inputHolderCompName(lHolderCompName)
					if(!lMapHolderCompName.Result){
						lHolderCompName=''
					}else{
						lHolderCompName=lMapHolderCompName.HolderCompName
					}
					lreturn.HolderCompName=lHolderCompName
					if(lHolderCompName.length()<=0){
						return lreturn
					}
					Map lMapHolderCompId=this.inputHolderCompId(lHolderCompId)
					if(!lMapHolderCompId.Result){
						lHolderCompId=''
					}else{
						lHolderCompId=lMapHolderCompId.HolderCompId
					}
					lreturn.HolderCompId=lHolderCompId
					if(lHolderCompId.length()<=0){
						return lreturn
					}
				}
				Map lMapCarPlateNumber=this.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
				lreturn.CarPlateNumber=lCarPlateNumber
				if(lCarPlateNumber.length()<=0){
					return lreturn
				}
				Map lMapCarPlateProvince=this.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
				lreturn.CarPlateProvince=lCarPlateProvince
				if(lCarPlateProvince.length()<=0){
					return lreturn
				}
				if(!lIsHolderIsPerson){
					//Holder=Company||Fill//Main
					Map lMapMainStatus=this.inputMainStatus(lMainStatus)
					if(!lMapMainStatus.Result){
						lMainStatus=''
					}else{
						lMainStatus=lMapMainStatus.MainStatus
					}
					lreturn.MainStatus=lMainStatus
					if(lMainStatus.length()<=0){
						return lreturn
					}
					Map lMapMainDob=this.inputMainDob(lMainDob)
					if(!lMapMainDob.Result){
						lMainDob=''
					}else{
						lMainDob=lMapMainDob.MainDob
					}
					lreturn.MainDob=lMainDob
					if(lMainDob.length()<=0){
						return lreturn
					}
					Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
					if(!lMapMainIsThai.Result){
						lMainIsThai=''
					}else{
						lMainIsThai=lMapMainIsThai.MainIsThai
					}
					lreturn.MainIsThai=lMainIsThai
					if(lMainIsThai.length()<=0){
						return lreturn
					}
					Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
					if(lIsMainIsThai){
						Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
						if(!lMapMainThaiId.Result){
							lMainThaiId=''
						}else{
							lMainThaiId=lMapMainThaiId.MainThaiId
						}
						lreturn.MainThaiId=lMainThaiId
						if(lMainThaiId.length()<=0){
							return lreturn
						}
					}else{
						Map lMapMainPassport=this.inputMainPassport(lMainPassport)
						if(!lMapMainPassport.Result){
							lMainPassport=''
						}else{
							lMainPassport=lMapMainPassport.MainPassport
						}
						lreturn.MainPassport=lMainPassport
						if(lMainPassport.length()<=0){
							return lreturn
						}
						Map lMapMainCountry=this.inputMainCountry(lMainCountry)
						if(!lMapMainCountry.Result){
							lMainCountry=''
						}else{
							lMainCountry=lMapMainCountry.MainCountry
						}
						lreturn.MainCountry=lMainCountry
						if(lMainCountry.length()<=0){
							return lreturn
						}
					}
					Map lMapMainName=this.inputMainName(lMainName)
					if(!lMapMainName.Result){
						lMainName=''
					}else{
						lMainName=lMapMainName.MainName
					}
					lreturn.MainName=lMainName
					if(lMainName.length()<=0){
						return lreturn
					}
					Map lMapMainSurname=this.inputMainSurname(lMainSurname)
					if(!lMapMainSurname.Result){
						lMainSurname=''
					}else{
						lMainSurname=lMapMainSurname.MainSurname
					}
					lreturn.MainSurname=lMainSurname
					if(lMainSurname.length()<=0){
						return lreturn
					}
					Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
					if(!lMapMainOccupation.Result){
						lMainOccupation=''
					}else{
						lMainOccupation=lMapMainOccupation.MainOccupation
					}
					lreturn.MainOccupation=lMainOccupation
					if(lMainOccupation.length()<=0){
						return lreturn
					}
					Map lMapMainEmail=this.inputMainEmail(lMainEmail)
					if(!lMapMainEmail.Result){
						lMainEmail=''
					}else{
						lMainEmail=lMapMainEmail.MainEmail
					}
					lreturn.MainEmail=lMainEmail
					if(lMainEmail.length()<=0){
						return lreturn
					}
					Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
					if(!lMapMainPhoneNo.Result){
						lMainPhoneNo=''
					}else{
						lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
					}
					lreturn.MainPhoneNo=lMainPhoneNo
					if(lMainPhoneNo.length()<=0){
						return lreturn
					}
				}else{
					if(lIsHolderIsMain){
						Boolean lIsMainDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriverEdit'))
						if(lIsMainDisplayed){
							//Holder=Person||Fill//Main
							Map lMapMainStatus=this.inputMainStatus(lMainStatus)
							if(!lMapMainStatus.Result){
								lMainStatus=''
							}else{
								lMainStatus=lMapMainStatus.MainStatus
							}
							lreturn.MainStatus=lMainStatus
							if(lMainStatus.length()<=0){
								return lreturn
							}
							Map lMapMainDob=this.inputMainDob(lMainDob)
							if(!lMapMainDob.Result){
								lMainDob=''
							}else{
								lMainDob=lMapMainDob.MainDob
							}
							lreturn.MainDob=lMainDob
							if(lMainDob.length()<=0){
								return lreturn
							}
							Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
							if(!lMapMainIsThai.Result){
								lMainIsThai=''
							}else{
								lMainIsThai=lMapMainIsThai.MainIsThai
							}
							lreturn.MainIsThai=lMainIsThai
							if(lMainIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
							if(lIsMainIsThai){
								Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
								if(!lMapMainThaiId.Result){
									lMainThaiId=''
								}else{
									lMainThaiId=lMapMainThaiId.MainThaiId
								}
								lreturn.MainThaiId=lMainThaiId
								if(lMainThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapMainPassport=this.inputMainPassport(lMainPassport)
								if(!lMapMainPassport.Result){
									lMainPassport=''
								}else{
									lMainPassport=lMapMainPassport.MainPassport
								}
								lreturn.MainPassport=lMainPassport
								if(lMainPassport.length()<=0){
									return lreturn
								}
								Map lMapMainCountry=this.inputMainCountry(lMainCountry)
								if(!lMapMainCountry.Result){
									lMainCountry=''
								}else{
									lMainCountry=lMapMainCountry.MainCountry
								}
								lreturn.MainCountry=lMainCountry
								if(lMainCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapMainName=this.inputMainName(lMainName)
							if(!lMapMainName.Result){
								lMainName=''
							}else{
								lMainName=lMapMainName.MainName
							}
							lreturn.MainName=lMainName
							if(lMainName.length()<=0){
								return lreturn
							}
							Map lMapMainSurname=this.inputMainSurname(lMainSurname)
							if(!lMapMainSurname.Result){
								lMainSurname=''
							}else{
								lMainSurname=lMapMainSurname.MainSurname
							}
							lreturn.MainSurname=lMainSurname
							if(lMainSurname.length()<=0){
								return lreturn
							}
							Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
							if(!lMapMainOccupation.Result){
								lMainOccupation=''
							}else{
								lMainOccupation=lMapMainOccupation.MainOccupation
							}
							lreturn.MainOccupation=lMainOccupation
							if(lMainOccupation.length()<=0){
								return lreturn
							}
						}else{
							//Holder=Person||Fill//Owner
							Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
							if(!lMapHolderStatus.Result){
								lHolderStatus=''
							}else{
								lHolderStatus=lMapHolderStatus.HolderStatus
							}
							lreturn.HolderStatus=lHolderStatus
							if(lHolderStatus.length()<=0){
								return lreturn
							}
							Map lMapHolderDob=this.inputHolderDob(lHolderDob)
							if(!lMapHolderDob.Result){
								lHolderDob=''
							}else{
								lHolderDob=lMapHolderDob.HolderDob
							}
							lreturn.HolderDob=lHolderDob
							if(lHolderDob.length()<=0){
								return lreturn
							}
							Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
							if(!lMapHolderIsThai.Result){
								lHolderIsThai=''
							}else{
								lHolderIsThai=lMapHolderIsThai.HolderIsThai
							}
							lreturn.HolderIsThai=lHolderIsThai
							if(lHolderIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
							if(lIsHolderIsThai){
								Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
								if(!lMapHolderThaiId.Result){
									lHolderThaiId=''
								}else{
									lHolderThaiId=lMapHolderThaiId.HolderThaiId
								}
								lreturn.HolderThaiId=lHolderThaiId
								if(lHolderThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
								if(!lMapHolderPassport.Result){
									lHolderPassport=''
								}else{
									lHolderPassport=lMapHolderPassport.HolderPassport
								}
								lreturn.HolderPassport=lHolderPassport
								if(lHolderPassport.length()<=0){
									return lreturn
								}
								Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
								if(!lMapHolderCountry.Result){
									lHolderCountry=''
								}else{
									lHolderCountry=lMapHolderCountry.HolderCountry
								}
								lreturn.HolderCountry=lHolderCountry
								if(lHolderCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapHolderName=this.inputHolderName(lHolderName)
							if(!lMapHolderName.Result){
								lHolderName=''
							}else{
								lHolderName=lMapHolderName.HolderName
							}
							lreturn.HolderName=lHolderName
							if(lHolderName.length()<=0){
								return lreturn
							}
							Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
							if(!lMapHolderSurname.Result){
								lHolderSurname=''
							}else{
								lHolderSurname=lMapHolderSurname.HolderSurname
							}
							lreturn.HolderSurname=lHolderSurname
							if(lHolderSurname.length()<=0){
								return lreturn
							}
							Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
							if(!lMapHolderOccupation.Result){
								lHolderOccupation=''
							}else{
								lHolderOccupation=lMapHolderOccupation.HolderOccupation
							}
							lreturn.HolderOccupation=lHolderOccupation
							if(lHolderOccupation.length()<=0){
								return lreturn
							}
						}
					}else{
						//Holder=Person||Fill//Owner+Main
						Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
						if(!lMapHolderStatus.Result){
							lHolderStatus=''
						}else{
							lHolderStatus=lMapHolderStatus.HolderStatus
						}
						lreturn.HolderStatus=lHolderStatus
						if(lHolderStatus.length()<=0){
							return lreturn
						}
						Map lMapHolderDob=this.inputHolderDob(lHolderDob)
						if(!lMapHolderDob.Result){
							lHolderDob=''
						}else{
							lHolderDob=lMapHolderDob.HolderDob
						}
						lreturn.HolderDob=lHolderDob
						if(lHolderDob.length()<=0){
							return lreturn
						}
						Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
						if(!lMapHolderIsThai.Result){
							lHolderIsThai=''
						}else{
							lHolderIsThai=lMapHolderIsThai.HolderIsThai
						}
						lreturn.HolderIsThai=lHolderIsThai
						if(lHolderIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
						if(lIsHolderIsThai){
							Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
							if(!lMapHolderThaiId.Result){
								lHolderThaiId=''
							}else{
								lHolderThaiId=lMapHolderThaiId.HolderThaiId
							}
							lreturn.HolderThaiId=lHolderThaiId
							if(lHolderThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
							if(!lMapHolderPassport.Result){
								lHolderPassport=''
							}else{
								lHolderPassport=lMapHolderPassport.HolderPassport
							}
							lreturn.HolderPassport=lHolderPassport
							if(lHolderPassport.length()<=0){
								return lreturn
							}
							Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
							if(!lMapHolderCountry.Result){
								lHolderCountry=''
							}else{
								lHolderCountry=lMapHolderCountry.HolderCountry
							}
							lreturn.HolderCountry=lHolderCountry
							if(lHolderCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapHolderName=this.inputHolderName(lHolderName)
						if(!lMapHolderName.Result){
							lHolderName=''
						}else{
							lHolderName=lMapHolderName.HolderName
						}
						lreturn.HolderName=lHolderName
						if(lHolderName.length()<=0){
							return lreturn
						}
						Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
						if(!lMapHolderSurname.Result){
							lHolderSurname=''
						}else{
							lHolderSurname=lMapHolderSurname.HolderSurname
						}
						lreturn.HolderSurname=lHolderSurname
						if(lHolderSurname.length()<=0){
							return lreturn
						}
						Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
						if(!lMapHolderOccupation.Result){
							lHolderOccupation=''
						}else{
							lHolderOccupation=lMapHolderOccupation.HolderOccupation
						}
						lreturn.HolderOccupation=lHolderOccupation
						if(lHolderOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainStatus=this.inputMainStatus(lMainStatus)
						if(!lMapMainStatus.Result){
							lMainStatus=''
						}else{
							lMainStatus=lMapMainStatus.MainStatus
						}
						lreturn.MainStatus=lMainStatus
						if(lMainStatus.length()<=0){
							return lreturn
						}
						Map lMapMainDob=this.inputMainDob(lMainDob)
						if(!lMapMainDob.Result){
							lMainDob=''
						}else{
							lMainDob=lMapMainDob.MainDob
						}
						lreturn.MainDob=lMainDob
						if(lMainDob.length()<=0){
							return lreturn
						}
						Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
						if(!lMapMainIsThai.Result){
							lMainIsThai=''
						}else{
							lMainIsThai=lMapMainIsThai.MainIsThai
						}
						lreturn.MainIsThai=lMainIsThai
						if(lMainIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
						if(lIsMainIsThai){
							Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
							if(!lMapMainThaiId.Result){
								lMainThaiId=''
							}else{
								lMainThaiId=lMapMainThaiId.MainThaiId
							}
							lreturn.MainThaiId=lMainThaiId
							if(lMainThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapMainPassport=this.inputMainPassport(lMainPassport)
							if(!lMapMainPassport.Result){
								lMainPassport=''
							}else{
								lMainPassport=lMapMainPassport.MainPassport
							}
							lreturn.MainPassport=lMainPassport
							if(lMainPassport.length()<=0){
								return lreturn
							}
							Map lMapMainCountry=this.inputMainCountry(lMainCountry)
							if(!lMapMainCountry.Result){
								lMainCountry=''
							}else{
								lMainCountry=lMapMainCountry.MainCountry
							}
							lreturn.MainCountry=lMainCountry
							if(lMainCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapMainName=this.inputMainName(lMainName)
						if(!lMapMainName.Result){
							lMainName=''
						}else{
							lMainName=lMapMainName.MainName
						}
						lreturn.MainName=lMainName
						if(lMainName.length()<=0){
							return lreturn
						}
						Map lMapMainSurname=this.inputMainSurname(lMainSurname)
						if(!lMapMainSurname.Result){
							lMainSurname=''
						}else{
							lMainSurname=lMapMainSurname.MainSurname
						}
						lreturn.MainSurname=lMainSurname
						if(lMainSurname.length()<=0){
							return lreturn
						}
						Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
						if(!lMapMainOccupation.Result){
							lMainOccupation=''
						}else{
							lMainOccupation=lMapMainOccupation.MainOccupation
						}
						lreturn.MainOccupation=lMainOccupation
						if(lMainOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainEmail=this.inputMainEmail(lMainEmail)
						if(!lMapMainEmail.Result){
							lMainEmail=''
						}else{
							lMainEmail=lMapMainEmail.MainEmail
						}
						lreturn.MainEmail=lMainEmail
						if(lMainEmail.length()<=0){
							return lreturn
						}
						Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
						if(!lMapMainPhoneNo.Result){
							lMainPhoneNo=''
						}else{
							lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
						}
						lreturn.MainPhoneNo=lMainPhoneNo
						if(lMainPhoneNo.length()<=0){
							return lreturn
						}
					}
				}
				Map lMapAdditionDrivers=this.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
				lreturn.AdditionDrivers=lAdditionDrivers
				if(lAdditionDrivers.length()<=0){
					return lreturn
				}
				Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
				if(lNumAdditionDrivers>0){
					String lTagAddDriverButtonYes='add-driver-Yes'
					String lTagAddDriverButtonNo='add-driver-No'
					switch(lNumAdditionDrivers){
						case 1:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						case 2:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						default:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver3Status=this.inputDriver3Status(lDriver3Status)
							if(!lMapDriver3Status.Result){
								lDriver3Status=''
							}else{
								lDriver3Status=lMapDriver3Status.Driver3Status
							}
							lreturn.Driver3Status=lDriver3Status
							if(lDriver3Status.length()<=0){
								return lreturn
							}
							Map lMapDriver3Dob=this.inputDriver3Dob(lDriver3Dob)
							if(!lMapDriver3Dob.Result){
								lDriver3Dob=''
							}else{
								lDriver3Dob=lMapDriver3Dob.Driver3Dob
							}
							lreturn.Driver3Dob=lDriver3Dob
							if(lDriver3Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver3IsThai=this.inputDriver3IsThai(lDriver3IsThai)
							if(!lMapDriver3IsThai.Result){
								lDriver3IsThai=''
							}else{
								lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
							}
							lreturn.Driver3IsThai=lDriver3IsThai
							if(lDriver3IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
							if(lIsDriver3IsThai){
								Map lMapDriver3ThaiId=this.inputDriver3ThaiId(lDriver3ThaiId)
								if(!lMapDriver3ThaiId.Result){
									lDriver3ThaiId=''
								}else{
									lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
								}
								lreturn.Driver3ThaiId=lDriver3ThaiId
								if(lDriver3ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver3Passport=this.inputDriver3Passport(lDriver3Passport)
								if(!lMapDriver3Passport.Result){
									lDriver3Passport=''
								}else{
									lDriver3Passport=lMapDriver3Passport.Driver3Passport
								}
								lreturn.Driver3Passport=lDriver3Passport
								if(lDriver3Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver3Country=this.inputDriver3Country(lDriver3Country)
								if(!lMapDriver3Country.Result){
									lDriver3Country=''
								}else{
									lDriver3Country=lMapDriver3Country.Driver3Country
								}
								lreturn.Driver3Country=lDriver3Country
								if(lDriver3Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver3Name=this.inputDriver3Name(lDriver3Name)
							if(!lMapDriver3Name.Result){
								lDriver3Name=''
							}else{
								lDriver3Name=lMapDriver3Name.Driver3Name
							}
							lreturn.Driver3Name=lDriver3Name
							if(lDriver3Name.length()<=0){
								return lreturn
							}
							Map lMapDriver3Surname=this.inputDriver3Surname(lDriver3Surname)
							if(!lMapDriver3Surname.Result){
								lDriver3Surname=''
							}else{
								lDriver3Surname=lMapDriver3Surname.Driver3Surname
							}
							lreturn.Driver3Surname=lDriver3Surname
							if(lDriver3Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver3YearDriving=this.inputDriver3YearDriving(lDriver3YearDriving)
							if(!lMapDriver3YearDriving.Result){
								lDriver3YearDriving=''
							}else{
								lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
							}
							lreturn.Driver3YearDriving=lDriver3YearDriving
							if(lDriver3YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver3ClaimsNo=this.inputDriver3ClaimsNo(lDriver3ClaimsNo)
							if(!lMapDriver3ClaimsNo.Result){
								lDriver3ClaimsNo=''
							}else{
								lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
							}
							lreturn.Driver3ClaimsNo=lDriver3ClaimsNo
							if(lDriver3ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver3Occupation=this.inputDriver3Occupation(lDriver3Occupation)
							if(!lMapDriver3Occupation.Result){
								lDriver3Occupation=''
							}else{
								lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
							}
							lreturn.Driver3Occupation=lDriver3Occupation
							if(lDriver3Occupation.length()<=0){
								return lreturn
							}
							break
					}
				}
				Map lMapPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lreturn.PolicyStartDate=lPolicyStartDate
				lreturn.PolicyStartDayOffset=lPolicyStartDayOffset
				if(lPolicyStartDayOffset.length()<=0){
					return lreturn
				}
				Map lMapDriversHaveLicense=this.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
				lreturn.DriversHaveLicense=lDriversHaveLicense
				if(lDriversHaveLicense.length()<=0){
					return lreturn
				}
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lreturn.ActualResult=lActualResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDetail1MotorBikeB(Map mapInput,Boolean isPositiveCase){
		Map lreturn=lTHAMotorBikeQuotationDetail1Util.initDetail1Output()
		String lLanguage=mapInput.Language.toString().trim()
		String lHolderEmail=mapInput.HolderEmail.toString().trim()
		String lHolderNewsletter=mapInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=mapInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=mapInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=mapInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=mapInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=mapInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=mapInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=mapInput.HolderIsMain.toString().trim()
		String lCarForCommercial=mapInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=mapInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=mapInput.CarPlateProvince.toString().trim()
		String lHolderStatus=mapInput.HolderStatus.toString().trim()
		String lHolderDob=mapInput.HolderDob.toString().trim()
		String lHolderIsThai=mapInput.HolderIsThai.toString().trim()
		String lHolderThaiId=mapInput.HolderThaiId.toString().trim()
		String lHolderOccupation=mapInput.HolderOccupation.toString().trim()
		String lHolderPassport=mapInput.HolderPassport.toString().trim()
		String lHolderCountry=mapInput.HolderCountry.toString().trim()
		String lHolderName=mapInput.HolderName.toString().trim()
		String lHolderSurname=mapInput.HolderSurname.toString().trim()
		String lHolderCompId=mapInput.HolderCompId.toString().trim()
		String lHolderCompName=mapInput.HolderCompName.toString().trim()
		String lMainStatus=mapInput.MainStatus.toString().trim()
		String lMainDob=mapInput.MainDob.toString().trim()
		String lMainIsThai=mapInput.MainIsThai.toString().trim()
		String lMainThaiId=mapInput.MainThaiId.toString().trim()
		String lMainOccupation=mapInput.MainOccupation.toString().trim()
		String lMainPassport=mapInput.MainPassport.toString().trim()
		String lMainCountry=mapInput.MainCountry.toString().trim()
		String lMainName=mapInput.MainName.toString().trim()
		String lMainSurname=mapInput.MainSurname.toString().trim()
		String lMainEmail=mapInput.MainEmail.toString().trim()
		String lMainPhoneNo=mapInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=mapInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=mapInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=mapInput.Driver1Status.toString().trim()
		String lDriver1Dob=mapInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=mapInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=mapInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=mapInput.Driver1Passport.toString().trim()
		String lDriver1Country=mapInput.Driver1Country.toString().trim()
		String lDriver1Name=mapInput.Driver1Name.toString().trim()
		String lDriver1Surname=mapInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=mapInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=mapInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=mapInput.Driver1Occupation.toString().trim()
		String lDriver2Status=mapInput.Driver2Status.toString().trim()
		String lDriver2Dob=mapInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=mapInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=mapInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=mapInput.Driver2Passport.toString().trim()
		String lDriver2Country=mapInput.Driver2Country.toString().trim()
		String lDriver2Name=mapInput.Driver2Name.toString().trim()
		String lDriver2Surname=mapInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=mapInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=mapInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=mapInput.Driver2Occupation.toString().trim()
		String lDriver3Status=mapInput.Driver3Status.toString().trim()
		String lDriver3Dob=mapInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=mapInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=mapInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=mapInput.Driver3Passport.toString().trim()
		String lDriver3Country=mapInput.Driver3Country.toString().trim()
		String lDriver3Name=mapInput.Driver3Name.toString().trim()
		String lDriver3Surname=mapInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=mapInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=mapInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=mapInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=mapInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=mapInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=mapInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=mapInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=mapInput.CallMeBackMobile.toString().trim()
		String lPositiveCase=mapInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lOpportunityNumber=''
		Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
		try{
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lreturn.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			Map lMapSubmitCallMeBack=this.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			lreturn.SubmitCallMeBack=lSubmitCallMeBack
			lreturn.CallMeBackEmail=lCallMeBackEmail
			lreturn.CallMeBackMobile=lCallMeBackMobile
			if(!lMapSubmitCallMeBack.Result){
				return lreturn
			}
			Map lMapHolderIsMain=this.inputHolderIsMain(lHolderIsMain)
			if(!lMapHolderIsMain.Result){
				lHolderIsMain=''
			}else{
				lHolderIsMain=lMapHolderIsMain.HolderIsMain
			}
			lreturn.HolderIsMain=lHolderIsMain
			if(lHolderIsMain.length()<=0){
				return lreturn
			}
			Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
			}
			lreturn.HolderEmail=lHolderEmail
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderNewsletter=this.inputHolderNewsletter(lHolderNewsletter)
			if(!lMapHolderNewsletter.Result){
				lHolderNewsletter=''
			}else{
				lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
			}
			lreturn.HolderNewsletter=lHolderNewsletter
			if(lHolderNewsletter.length()<=0){
				return lreturn
			}
			Map lMapHolderPhoneNo=this.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			lreturn.HolderPhoneNo=lHolderPhoneNo
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Map lMapHolderCallMeNowToDo=this.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			lreturn.HolderCallMeNowToDo=lHolderCallMeNowToDo
			if(lHolderCallMeNowToDo.length()<=0){
				return lreturn
			}
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			if(!lIsHolderCallMeNowToDo){
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				lreturn.ActualResult=lActualResult
				lreturn.OpportunityNumber=lOpportunityNumber
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}else{
				Map lMapCallMeNow=this.inputCallMeNow(lCallMeNow)
				if(!lMapCallMeNow.Result){
					lCallMeNow=''
				}else{
					lCallMeNow=lMapCallMeNow.CallMeNow
				}
				lreturn.CallMeNow=lCallMeNow
				if(lCallMeNow.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtDay=this.inputCallMeBackAtDay(lCallMeBackAtDay)
				if(!lMapCallMeBackAtDay.Result){
					lCallMeBackAtDay=''
				}else{
					lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
				}
				lreturn.CallMeBackAtDay=lCallMeBackAtDay
				if(lCallMeBackAtDay.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtTime=this.inputCallMeBackAtTime(lCallMeBackAtTime)
				if(!lMapCallMeBackAtTime.Result){
					lCallMeBackAtTime=''
				}else{
					lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
				}
				lreturn.CallMeBackAtTime=lCallMeBackAtTime
				if(lCallMeBackAtTime.length()<=0){
					return lreturn
				}
				Map lMapCarForCommercial=this.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
				lreturn.CarForCommercial=lCarForCommercial
				if(lCarForCommercial.length()<=0){
					return lreturn
				}
				Map lMapHolderIsPerson=this.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
				lreturn.HolderIsPerson=lHolderIsPerson
				if(lHolderIsPerson.length()<=0){
					return lreturn
				}
				Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
				if(!lIsHolderIsPerson){
					Map lMapHolderCompName=this.inputHolderCompName(lHolderCompName)
					if(!lMapHolderCompName.Result){
						lHolderCompName=''
					}else{
						lHolderCompName=lMapHolderCompName.HolderCompName
					}
					lreturn.HolderCompName=lHolderCompName
					if(lHolderCompName.length()<=0){
						return lreturn
					}
					Map lMapHolderCompId=this.inputHolderCompId(lHolderCompId)
					if(!lMapHolderCompId.Result){
						lHolderCompId=''
					}else{
						lHolderCompId=lMapHolderCompId.HolderCompId
					}
					lreturn.HolderCompId=lHolderCompId
					if(lHolderCompId.length()<=0){
						return lreturn
					}
				}
				Map lMapCarPlateNumber=this.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
				lreturn.CarPlateNumber=lCarPlateNumber
				if(lCarPlateNumber.length()<=0){
					return lreturn
				}
				Map lMapCarPlateProvince=this.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
				lreturn.CarPlateProvince=lCarPlateProvince
				if(lCarPlateProvince.length()<=0){
					return lreturn
				}
				if(!lIsHolderIsPerson){
					//Holder=Company||Fill//Main
					Map lMapMainStatus=this.inputMainStatus(lMainStatus)
					if(!lMapMainStatus.Result){
						lMainStatus=''
					}else{
						lMainStatus=lMapMainStatus.MainStatus
					}
					lreturn.MainStatus=lMainStatus
					if(lMainStatus.length()<=0){
						return lreturn
					}
					Map lMapMainDob=this.inputMainDob(lMainDob)
					if(!lMapMainDob.Result){
						lMainDob=''
					}else{
						lMainDob=lMapMainDob.MainDob
					}
					lreturn.MainDob=lMainDob
					if(lMainDob.length()<=0){
						return lreturn
					}
					Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
					if(!lMapMainIsThai.Result){
						lMainIsThai=''
					}else{
						lMainIsThai=lMapMainIsThai.MainIsThai
					}
					lreturn.MainIsThai=lMainIsThai
					if(lMainIsThai.length()<=0){
						return lreturn
					}
					Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
					if(lIsMainIsThai){
						Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
						if(!lMapMainThaiId.Result){
							lMainThaiId=''
						}else{
							lMainThaiId=lMapMainThaiId.MainThaiId
						}
						lreturn.MainThaiId=lMainThaiId
						if(lMainThaiId.length()<=0){
							return lreturn
						}
					}else{
						Map lMapMainPassport=this.inputMainPassport(lMainPassport)
						if(!lMapMainPassport.Result){
							lMainPassport=''
						}else{
							lMainPassport=lMapMainPassport.MainPassport
						}
						lreturn.MainPassport=lMainPassport
						if(lMainPassport.length()<=0){
							return lreturn
						}
						Map lMapMainCountry=this.inputMainCountry(lMainCountry)
						if(!lMapMainCountry.Result){
							lMainCountry=''
						}else{
							lMainCountry=lMapMainCountry.MainCountry
						}
						lreturn.MainCountry=lMainCountry
						if(lMainCountry.length()<=0){
							return lreturn
						}
					}
					Map lMapMainName=this.inputMainName(lMainName)
					if(!lMapMainName.Result){
						lMainName=''
					}else{
						lMainName=lMapMainName.MainName
					}
					lreturn.MainName=lMainName
					if(lMainName.length()<=0){
						return lreturn
					}
					Map lMapMainSurname=this.inputMainSurname(lMainSurname)
					if(!lMapMainSurname.Result){
						lMainSurname=''
					}else{
						lMainSurname=lMapMainSurname.MainSurname
					}
					lreturn.MainSurname=lMainSurname
					if(lMainSurname.length()<=0){
						return lreturn
					}
					Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
					if(!lMapMainOccupation.Result){
						lMainOccupation=''
					}else{
						lMainOccupation=lMapMainOccupation.MainOccupation
					}
					lreturn.MainOccupation=lMainOccupation
					if(lMainOccupation.length()<=0){
						return lreturn
					}
					Map lMapMainEmail=this.inputMainEmail(lMainEmail)
					if(!lMapMainEmail.Result){
						lMainEmail=''
					}else{
						lMainEmail=lMapMainEmail.MainEmail
					}
					lreturn.MainEmail=lMainEmail
					if(lMainEmail.length()<=0){
						return lreturn
					}
					Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
					if(!lMapMainPhoneNo.Result){
						lMainPhoneNo=''
					}else{
						lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
					}
					lreturn.MainPhoneNo=lMainPhoneNo
					if(lMainPhoneNo.length()<=0){
						return lreturn
					}
				}else{
					if(lIsHolderIsMain){
						Boolean lIsMainDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriverEdit'))
						if(lIsMainDisplayed){
							//Holder=Person||Fill//Main
							Map lMapMainStatus=this.inputMainStatus(lMainStatus)
							if(!lMapMainStatus.Result){
								lMainStatus=''
							}else{
								lMainStatus=lMapMainStatus.MainStatus
							}
							lreturn.MainStatus=lMainStatus
							if(lMainStatus.length()<=0){
								return lreturn
							}
							Map lMapMainDob=this.inputMainDob(lMainDob)
							if(!lMapMainDob.Result){
								lMainDob=''
							}else{
								lMainDob=lMapMainDob.MainDob
							}
							lreturn.MainDob=lMainDob
							if(lMainDob.length()<=0){
								return lreturn
							}
							Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
							if(!lMapMainIsThai.Result){
								lMainIsThai=''
							}else{
								lMainIsThai=lMapMainIsThai.MainIsThai
							}
							lreturn.MainIsThai=lMainIsThai
							if(lMainIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
							if(lIsMainIsThai){
								Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
								if(!lMapMainThaiId.Result){
									lMainThaiId=''
								}else{
									lMainThaiId=lMapMainThaiId.MainThaiId
								}
								lreturn.MainThaiId=lMainThaiId
								if(lMainThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapMainPassport=this.inputMainPassport(lMainPassport)
								if(!lMapMainPassport.Result){
									lMainPassport=''
								}else{
									lMainPassport=lMapMainPassport.MainPassport
								}
								lreturn.MainPassport=lMainPassport
								if(lMainPassport.length()<=0){
									return lreturn
								}
								Map lMapMainCountry=this.inputMainCountry(lMainCountry)
								if(!lMapMainCountry.Result){
									lMainCountry=''
								}else{
									lMainCountry=lMapMainCountry.MainCountry
								}
								lreturn.MainCountry=lMainCountry
								if(lMainCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapMainName=this.inputMainName(lMainName)
							if(!lMapMainName.Result){
								lMainName=''
							}else{
								lMainName=lMapMainName.MainName
							}
							lreturn.MainName=lMainName
							if(lMainName.length()<=0){
								return lreturn
							}
							Map lMapMainSurname=this.inputMainSurname(lMainSurname)
							if(!lMapMainSurname.Result){
								lMainSurname=''
							}else{
								lMainSurname=lMapMainSurname.MainSurname
							}
							lreturn.MainSurname=lMainSurname
							if(lMainSurname.length()<=0){
								return lreturn
							}
							Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
							if(!lMapMainOccupation.Result){
								lMainOccupation=''
							}else{
								lMainOccupation=lMapMainOccupation.MainOccupation
							}
							lreturn.MainOccupation=lMainOccupation
							if(lMainOccupation.length()<=0){
								return lreturn
							}
						}else{
							//Holder=Person||Fill//Owner
							Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
							if(!lMapHolderStatus.Result){
								lHolderStatus=''
							}else{
								lHolderStatus=lMapHolderStatus.HolderStatus
							}
							lreturn.HolderStatus=lHolderStatus
							if(lHolderStatus.length()<=0){
								return lreturn
							}
							Map lMapHolderDob=this.inputHolderDob(lHolderDob)
							if(!lMapHolderDob.Result){
								lHolderDob=''
							}else{
								lHolderDob=lMapHolderDob.HolderDob
							}
							lreturn.HolderDob=lHolderDob
							if(lHolderDob.length()<=0){
								return lreturn
							}
							Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
							if(!lMapHolderIsThai.Result){
								lHolderIsThai=''
							}else{
								lHolderIsThai=lMapHolderIsThai.HolderIsThai
							}
							lreturn.HolderIsThai=lHolderIsThai
							if(lHolderIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
							if(lIsHolderIsThai){
								Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
								if(!lMapHolderThaiId.Result){
									lHolderThaiId=''
								}else{
									lHolderThaiId=lMapHolderThaiId.HolderThaiId
								}
								lreturn.HolderThaiId=lHolderThaiId
								if(lHolderThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
								if(!lMapHolderPassport.Result){
									lHolderPassport=''
								}else{
									lHolderPassport=lMapHolderPassport.HolderPassport
								}
								lreturn.HolderPassport=lHolderPassport
								if(lHolderPassport.length()<=0){
									return lreturn
								}
								Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
								if(!lMapHolderCountry.Result){
									lHolderCountry=''
								}else{
									lHolderCountry=lMapHolderCountry.HolderCountry
								}
								lreturn.HolderCountry=lHolderCountry
								if(lHolderCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapHolderName=this.inputHolderName(lHolderName)
							if(!lMapHolderName.Result){
								lHolderName=''
							}else{
								lHolderName=lMapHolderName.HolderName
							}
							lreturn.HolderName=lHolderName
							if(lHolderName.length()<=0){
								return lreturn
							}
							Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
							if(!lMapHolderSurname.Result){
								lHolderSurname=''
							}else{
								lHolderSurname=lMapHolderSurname.HolderSurname
							}
							lreturn.HolderSurname=lHolderSurname
							if(lHolderSurname.length()<=0){
								return lreturn
							}
							Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
							if(!lMapHolderOccupation.Result){
								lHolderOccupation=''
							}else{
								lHolderOccupation=lMapHolderOccupation.HolderOccupation
							}
							lreturn.HolderOccupation=lHolderOccupation
							if(lHolderOccupation.length()<=0){
								return lreturn
							}
						}
					}else{
						//Holder=Person||Fill//Owner+Main
						Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
						if(!lMapHolderStatus.Result){
							lHolderStatus=''
						}else{
							lHolderStatus=lMapHolderStatus.HolderStatus
						}
						lreturn.HolderStatus=lHolderStatus
						if(lHolderStatus.length()<=0){
							return lreturn
						}
						Map lMapHolderDob=this.inputHolderDob(lHolderDob)
						if(!lMapHolderDob.Result){
							lHolderDob=''
						}else{
							lHolderDob=lMapHolderDob.HolderDob
						}
						lreturn.HolderDob=lHolderDob
						if(lHolderDob.length()<=0){
							return lreturn
						}
						Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
						if(!lMapHolderIsThai.Result){
							lHolderIsThai=''
						}else{
							lHolderIsThai=lMapHolderIsThai.HolderIsThai
						}
						lreturn.HolderIsThai=lHolderIsThai
						if(lHolderIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
						if(lIsHolderIsThai){
							Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
							if(!lMapHolderThaiId.Result){
								lHolderThaiId=''
							}else{
								lHolderThaiId=lMapHolderThaiId.HolderThaiId
							}
							lreturn.HolderThaiId=lHolderThaiId
							if(lHolderThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
							if(!lMapHolderPassport.Result){
								lHolderPassport=''
							}else{
								lHolderPassport=lMapHolderPassport.HolderPassport
							}
							lreturn.HolderPassport=lHolderPassport
							if(lHolderPassport.length()<=0){
								return lreturn
							}
							Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
							if(!lMapHolderCountry.Result){
								lHolderCountry=''
							}else{
								lHolderCountry=lMapHolderCountry.HolderCountry
							}
							lreturn.HolderCountry=lHolderCountry
							if(lHolderCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapHolderName=this.inputHolderName(lHolderName)
						if(!lMapHolderName.Result){
							lHolderName=''
						}else{
							lHolderName=lMapHolderName.HolderName
						}
						lreturn.HolderName=lHolderName
						if(lHolderName.length()<=0){
							return lreturn
						}
						Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
						if(!lMapHolderSurname.Result){
							lHolderSurname=''
						}else{
							lHolderSurname=lMapHolderSurname.HolderSurname
						}
						lreturn.HolderSurname=lHolderSurname
						if(lHolderSurname.length()<=0){
							return lreturn
						}
						Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
						if(!lMapHolderOccupation.Result){
							lHolderOccupation=''
						}else{
							lHolderOccupation=lMapHolderOccupation.HolderOccupation
						}
						lreturn.HolderOccupation=lHolderOccupation
						if(lHolderOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainStatus=this.inputMainStatus(lMainStatus)
						if(!lMapMainStatus.Result){
							lMainStatus=''
						}else{
							lMainStatus=lMapMainStatus.MainStatus
						}
						lreturn.MainStatus=lMainStatus
						if(lMainStatus.length()<=0){
							return lreturn
						}
						Map lMapMainDob=this.inputMainDob(lMainDob)
						if(!lMapMainDob.Result){
							lMainDob=''
						}else{
							lMainDob=lMapMainDob.MainDob
						}
						lreturn.MainDob=lMainDob
						if(lMainDob.length()<=0){
							return lreturn
						}
						Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
						if(!lMapMainIsThai.Result){
							lMainIsThai=''
						}else{
							lMainIsThai=lMapMainIsThai.MainIsThai
						}
						lreturn.MainIsThai=lMainIsThai
						if(lMainIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
						if(lIsMainIsThai){
							Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
							if(!lMapMainThaiId.Result){
								lMainThaiId=''
							}else{
								lMainThaiId=lMapMainThaiId.MainThaiId
							}
							lreturn.MainThaiId=lMainThaiId
							if(lMainThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapMainPassport=this.inputMainPassport(lMainPassport)
							if(!lMapMainPassport.Result){
								lMainPassport=''
							}else{
								lMainPassport=lMapMainPassport.MainPassport
							}
							lreturn.MainPassport=lMainPassport
							if(lMainPassport.length()<=0){
								return lreturn
							}
							Map lMapMainCountry=this.inputMainCountry(lMainCountry)
							if(!lMapMainCountry.Result){
								lMainCountry=''
							}else{
								lMainCountry=lMapMainCountry.MainCountry
							}
							lreturn.MainCountry=lMainCountry
							if(lMainCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapMainName=this.inputMainName(lMainName)
						if(!lMapMainName.Result){
							lMainName=''
						}else{
							lMainName=lMapMainName.MainName
						}
						lreturn.MainName=lMainName
						if(lMainName.length()<=0){
							return lreturn
						}
						Map lMapMainSurname=this.inputMainSurname(lMainSurname)
						if(!lMapMainSurname.Result){
							lMainSurname=''
						}else{
							lMainSurname=lMapMainSurname.MainSurname
						}
						lreturn.MainSurname=lMainSurname
						if(lMainSurname.length()<=0){
							return lreturn
						}
						Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
						if(!lMapMainOccupation.Result){
							lMainOccupation=''
						}else{
							lMainOccupation=lMapMainOccupation.MainOccupation
						}
						lreturn.MainOccupation=lMainOccupation
						if(lMainOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainEmail=this.inputMainEmail(lMainEmail)
						if(!lMapMainEmail.Result){
							lMainEmail=''
						}else{
							lMainEmail=lMapMainEmail.MainEmail
						}
						lreturn.MainEmail=lMainEmail
						if(lMainEmail.length()<=0){
							return lreturn
						}
						Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
						if(!lMapMainPhoneNo.Result){
							lMainPhoneNo=''
						}else{
							lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
						}
						lreturn.MainPhoneNo=lMainPhoneNo
						if(lMainPhoneNo.length()<=0){
							return lreturn
						}
					}
				}
				Map lMapAdditionDrivers=this.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
				lreturn.AdditionDrivers=lAdditionDrivers
				if(lAdditionDrivers.length()<=0){
					return lreturn
				}
				Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
				if(lNumAdditionDrivers>0){
					String lTagAddDriverButtonYes='add-driver-Yes'
					String lTagAddDriverButtonNo='add-driver-No'
					switch(lNumAdditionDrivers){
						case 1:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						case 2:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						default:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver3Status=this.inputDriver3Status(lDriver3Status)
							if(!lMapDriver3Status.Result){
								lDriver3Status=''
							}else{
								lDriver3Status=lMapDriver3Status.Driver3Status
							}
							lreturn.Driver3Status=lDriver3Status
							if(lDriver3Status.length()<=0){
								return lreturn
							}
							Map lMapDriver3Dob=this.inputDriver3Dob(lDriver3Dob)
							if(!lMapDriver3Dob.Result){
								lDriver3Dob=''
							}else{
								lDriver3Dob=lMapDriver3Dob.Driver3Dob
							}
							lreturn.Driver3Dob=lDriver3Dob
							if(lDriver3Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver3IsThai=this.inputDriver3IsThai(lDriver3IsThai)
							if(!lMapDriver3IsThai.Result){
								lDriver3IsThai=''
							}else{
								lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
							}
							lreturn.Driver3IsThai=lDriver3IsThai
							if(lDriver3IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
							if(lIsDriver3IsThai){
								Map lMapDriver3ThaiId=this.inputDriver3ThaiId(lDriver3ThaiId)
								if(!lMapDriver3ThaiId.Result){
									lDriver3ThaiId=''
								}else{
									lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
								}
								lreturn.Driver3ThaiId=lDriver3ThaiId
								if(lDriver3ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver3Passport=this.inputDriver3Passport(lDriver3Passport)
								if(!lMapDriver3Passport.Result){
									lDriver3Passport=''
								}else{
									lDriver3Passport=lMapDriver3Passport.Driver3Passport
								}
								lreturn.Driver3Passport=lDriver3Passport
								if(lDriver3Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver3Country=this.inputDriver3Country(lDriver3Country)
								if(!lMapDriver3Country.Result){
									lDriver3Country=''
								}else{
									lDriver3Country=lMapDriver3Country.Driver3Country
								}
								lreturn.Driver3Country=lDriver3Country
								if(lDriver3Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver3Name=this.inputDriver3Name(lDriver3Name)
							if(!lMapDriver3Name.Result){
								lDriver3Name=''
							}else{
								lDriver3Name=lMapDriver3Name.Driver3Name
							}
							lreturn.Driver3Name=lDriver3Name
							if(lDriver3Name.length()<=0){
								return lreturn
							}
							Map lMapDriver3Surname=this.inputDriver3Surname(lDriver3Surname)
							if(!lMapDriver3Surname.Result){
								lDriver3Surname=''
							}else{
								lDriver3Surname=lMapDriver3Surname.Driver3Surname
							}
							lreturn.Driver3Surname=lDriver3Surname
							if(lDriver3Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver3YearDriving=this.inputDriver3YearDriving(lDriver3YearDriving)
							if(!lMapDriver3YearDriving.Result){
								lDriver3YearDriving=''
							}else{
								lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
							}
							lreturn.Driver3YearDriving=lDriver3YearDriving
							if(lDriver3YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver3ClaimsNo=this.inputDriver3ClaimsNo(lDriver3ClaimsNo)
							if(!lMapDriver3ClaimsNo.Result){
								lDriver3ClaimsNo=''
							}else{
								lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
							}
							lreturn.Driver3ClaimsNo=lDriver3ClaimsNo
							if(lDriver3ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver3Occupation=this.inputDriver3Occupation(lDriver3Occupation)
							if(!lMapDriver3Occupation.Result){
								lDriver3Occupation=''
							}else{
								lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
							}
							lreturn.Driver3Occupation=lDriver3Occupation
							if(lDriver3Occupation.length()<=0){
								return lreturn
							}
							break
					}
				}
				Map lMapPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lreturn.PolicyStartDate=lPolicyStartDate
				lreturn.PolicyStartDayOffset=lPolicyStartDayOffset
				if(lPolicyStartDayOffset.length()<=0){
					return lreturn
				}
				Map lMapDriversHaveLicense=this.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
				lreturn.DriversHaveLicense=lDriversHaveLicense
				if(lDriversHaveLicense.length()<=0){
					return lreturn
				}
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lreturn.ActualResult=lActualResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputDetail1MotorCar(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lLanguage=caseInput.Language.toString().trim()
		String lHolderEmail=caseInput.HolderEmail.toString().trim()
		String lHolderNewsletter=caseInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=caseInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=caseInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=caseInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=caseInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=caseInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=caseInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=caseInput.HolderIsMain.toString().trim()
		String lCarForCommercial=caseInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=caseInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=caseInput.CarPlateProvince.toString().trim()
		String lHolderStatus=caseInput.HolderStatus.toString().trim()
		String lHolderDob=caseInput.HolderDob.toString().trim()
		String lHolderIsThai=caseInput.HolderIsThai.toString().trim()
		String lHolderThaiId=caseInput.HolderThaiId.toString().trim()
		String lHolderOccupation=caseInput.HolderOccupation.toString().trim()
		String lHolderPassport=caseInput.HolderPassport.toString().trim()
		String lHolderCountry=caseInput.HolderCountry.toString().trim()
		String lHolderName=caseInput.HolderName.toString().trim()
		String lHolderSurname=caseInput.HolderSurname.toString().trim()
		String lHolderCompId=caseInput.HolderCompId.toString().trim()
		String lHolderCompName=caseInput.HolderCompName.toString().trim()
		String lMainStatus=caseInput.MainStatus.toString().trim()
		String lMainDob=caseInput.MainDob.toString().trim()
		String lMainIsThai=caseInput.MainIsThai.toString().trim()
		String lMainThaiId=caseInput.MainThaiId.toString().trim()
		String lMainOccupation=caseInput.MainOccupation.toString().trim()
		String lMainPassport=caseInput.MainPassport.toString().trim()
		String lMainCountry=caseInput.MainCountry.toString().trim()
		String lMainName=caseInput.MainName.toString().trim()
		String lMainSurname=caseInput.MainSurname.toString().trim()
		String lMainEmail=caseInput.MainEmail.toString().trim()
		String lMainPhoneNo=caseInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=caseInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=caseInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=caseInput.Driver1Status.toString().trim()
		String lDriver1Dob=caseInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=caseInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=caseInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=caseInput.Driver1Passport.toString().trim()
		String lDriver1Country=caseInput.Driver1Country.toString().trim()
		String lDriver1Name=caseInput.Driver1Name.toString().trim()
		String lDriver1Surname=caseInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=caseInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=caseInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=caseInput.Driver1Occupation.toString().trim()
		String lDriver2Status=caseInput.Driver2Status.toString().trim()
		String lDriver2Dob=caseInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=caseInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=caseInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=caseInput.Driver2Passport.toString().trim()
		String lDriver2Country=caseInput.Driver2Country.toString().trim()
		String lDriver2Name=caseInput.Driver2Name.toString().trim()
		String lDriver2Surname=caseInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=caseInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=caseInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=caseInput.Driver2Occupation.toString().trim()
		String lDriver3Status=caseInput.Driver3Status.toString().trim()
		String lDriver3Dob=caseInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=caseInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=caseInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=caseInput.Driver3Passport.toString().trim()
		String lDriver3Country=caseInput.Driver3Country.toString().trim()
		String lDriver3Name=caseInput.Driver3Name.toString().trim()
		String lDriver3Surname=caseInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=caseInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=caseInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=caseInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=caseInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=caseInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=caseInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=caseInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=caseInput.CallMeBackMobile.toString().trim()
		String lSalesforceProceedTodo=caseInput.SalesforceProceedTodo.toString().trim()
		String lSalesforceProceedRetrieveTodo=caseInput.SalesforceProceedRetrieveTodo.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lOpportunityNumber=''
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
			Map lMapDetail1Input=this.lTHAMotorCarQuotationDetail1Util.initDetail1Input()
			lMapDetail1Input.Language=lLanguage
			lMapDetail1Input.HolderEmail=lHolderEmail
			lMapDetail1Input.HolderNewsletter=lHolderNewsletter
			lMapDetail1Input.HolderPhoneNo=lHolderPhoneNo
			lMapDetail1Input.HolderCallMeNowToDo=lHolderCallMeNowToDo
			lMapDetail1Input.CallMeNow=lCallMeNow
			lMapDetail1Input.CallMeBackAtDay=lCallMeBackAtDay
			lMapDetail1Input.CallMeBackAtTime=lCallMeBackAtTime
			lMapDetail1Input.HolderIsPerson=lHolderIsPerson
			lMapDetail1Input.HolderIsMain=lHolderIsMain
			lMapDetail1Input.CarForCommercial=lCarForCommercial
			lMapDetail1Input.CarPlateNumber=lCarPlateNumber
			lMapDetail1Input.CarPlateProvince=lCarPlateProvince
			lMapDetail1Input.HolderStatus=lHolderStatus
			lMapDetail1Input.HolderDob=lHolderDob
			lMapDetail1Input.HolderIsThai=lHolderIsThai
			lMapDetail1Input.HolderThaiId=lHolderThaiId
			lMapDetail1Input.HolderOccupation=lHolderOccupation
			lMapDetail1Input.HolderPassport=lHolderPassport
			lMapDetail1Input.HolderCountry=lHolderCountry
			lMapDetail1Input.HolderName=lHolderName
			lMapDetail1Input.HolderSurname=lHolderSurname
			lMapDetail1Input.HolderCompId=lHolderCompId
			lMapDetail1Input.HolderCompName=lHolderCompName
			lMapDetail1Input.MainStatus=lMainStatus
			lMapDetail1Input.MainDob=lMainDob
			lMapDetail1Input.MainIsThai=lMainIsThai
			lMapDetail1Input.MainThaiId=lMainThaiId
			lMapDetail1Input.MainOccupation=lMainOccupation
			lMapDetail1Input.MainPassport=lMainPassport
			lMapDetail1Input.MainCountry=lMainCountry
			lMapDetail1Input.MainName=lMainName
			lMapDetail1Input.MainSurname=lMainSurname
			lMapDetail1Input.MainEmail=lMainEmail
			lMapDetail1Input.MainPhoneNo=lMainPhoneNo
			lMapDetail1Input.AdditionDrivers=lAdditionDrivers
			lMapDetail1Input.DriversHaveLicense=lDriversHaveLicense
			lMapDetail1Input.Driver1Status=lDriver1Status
			lMapDetail1Input.Driver1Dob=lDriver1Dob
			lMapDetail1Input.Driver1IsThai=lDriver1IsThai
			lMapDetail1Input.Driver1ThaiId=lDriver1ThaiId
			lMapDetail1Input.Driver1Passport=lDriver1Passport
			lMapDetail1Input.Driver1Country=lDriver1Country
			lMapDetail1Input.Driver1Name=lDriver1Name
			lMapDetail1Input.Driver1Surname=lDriver1Surname
			lMapDetail1Input.Driver1YearDriving=lDriver1YearDriving
			lMapDetail1Input.Driver1ClaimsNo=lDriver1ClaimsNo
			lMapDetail1Input.Driver1Occupation=lDriver1Occupation
			lMapDetail1Input.Driver2Status=lDriver2Status
			lMapDetail1Input.Driver2Dob=lDriver2Dob
			lMapDetail1Input.Driver2IsThai=lDriver2IsThai
			lMapDetail1Input.Driver2ThaiId=lDriver2ThaiId
			lMapDetail1Input.Driver2Passport=lDriver2Passport
			lMapDetail1Input.Driver2Country=lDriver2Country
			lMapDetail1Input.Driver2Name=lDriver2Name
			lMapDetail1Input.Driver2Surname=lDriver2Surname
			lMapDetail1Input.Driver2YearDriving=lDriver2YearDriving
			lMapDetail1Input.Driver2ClaimsNo=lDriver2ClaimsNo
			lMapDetail1Input.Driver2Occupation=lDriver2Occupation
			lMapDetail1Input.Driver3Status=lDriver3Status
			lMapDetail1Input.Driver3Dob=lDriver3Dob
			lMapDetail1Input.Driver3IsThai=lDriver3IsThai
			lMapDetail1Input.Driver3ThaiId=lDriver3ThaiId
			lMapDetail1Input.Driver3Passport=lDriver3Passport
			lMapDetail1Input.Driver3Country=lDriver3Country
			lMapDetail1Input.Driver3Name=lDriver3Name
			lMapDetail1Input.Driver3Surname=lDriver3Surname
			lMapDetail1Input.Driver3YearDriving=lDriver3YearDriving
			lMapDetail1Input.Driver3ClaimsNo=lDriver3ClaimsNo
			lMapDetail1Input.Driver3Occupation=lDriver3Occupation
			lMapDetail1Input.PolicyStartDayOffset=lPolicyStartDayOffset
			lMapDetail1Input.PolicyStartDate=lPolicyStartDate
			lMapDetail1Input.SubmitCallMeBack=lSubmitCallMeBack
			lMapDetail1Input.CallMeBackEmail=lCallMeBackEmail
			lMapDetail1Input.CallMeBackMobile=lCallMeBackMobile
			Map lMapInputDetail1=[:]
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lMapInputDetail1=this.inputDetail1MotorCarA(lMapDetail1Input,lIsPositiveCase)
						break
					case 'B':
						lMapInputDetail1=this.inputDetail1MotorCarB(lMapDetail1Input,lIsPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lMapInputDetail1=this.inputDetail1MotorCarA(lMapDetail1Input,lIsPositiveCase)
			}
			lLanguage=lMapInputDetail1.Language
			lHolderEmail=lMapInputDetail1.HolderEmail
			lHolderNewsletter=lMapInputDetail1.HolderNewsletter
			lHolderPhoneNo=lMapInputDetail1.HolderPhoneNo
			lHolderCallMeNowToDo=lMapInputDetail1.HolderCallMeNowToDo
			lCallMeNow=lMapInputDetail1.CallMeNow
			lCallMeBackAtDay=lMapInputDetail1.CallMeBackAtDay
			lCallMeBackAtTime=lMapInputDetail1.CallMeBackAtTime
			lHolderIsPerson=lMapInputDetail1.HolderIsPerson
			lHolderIsMain=lMapInputDetail1.HolderIsMain
			lCarForCommercial=lMapInputDetail1.CarForCommercial
			lCarPlateNumber=lMapInputDetail1.CarPlateNumber
			lCarPlateProvince=lMapInputDetail1.CarPlateProvince
			lHolderStatus=lMapInputDetail1.HolderStatus
			lHolderDob=lMapInputDetail1.HolderDob
			lHolderIsThai=lMapInputDetail1.HolderIsThai
			lHolderThaiId=lMapInputDetail1.HolderThaiId
			lHolderOccupation=lMapInputDetail1.HolderOccupation
			lHolderPassport=lMapInputDetail1.HolderPassport
			lHolderCountry=lMapInputDetail1.HolderCountry
			lHolderName=lMapInputDetail1.HolderName
			lHolderSurname=lMapInputDetail1.HolderSurname
			lHolderCompId=lMapInputDetail1.HolderCompId
			lHolderCompName=lMapInputDetail1.HolderCompName
			lMainStatus=lMapInputDetail1.MainStatus
			lMainDob=lMapInputDetail1.MainDob
			lMainIsThai=lMapInputDetail1.MainIsThai
			lMainThaiId=lMapInputDetail1.MainThaiId
			lMainOccupation=lMapInputDetail1.MainOccupation
			lMainPassport=lMapInputDetail1.MainPassport
			lMainCountry=lMapInputDetail1.MainCountry
			lMainName=lMapInputDetail1.MainName
			lMainSurname=lMapInputDetail1.MainSurname
			lMainEmail=lMapInputDetail1.MainEmail
			lMainPhoneNo=lMapInputDetail1.MainPhoneNo
			lAdditionDrivers=lMapInputDetail1.AdditionDrivers
			lDriversHaveLicense=lMapInputDetail1.DriversHaveLicense
			lDriver1Status=lMapInputDetail1.Driver1Status
			lDriver1Dob=lMapInputDetail1.Driver1Dob
			lDriver1IsThai=lMapInputDetail1.Driver1IsThai
			lDriver1ThaiId=lMapInputDetail1.Driver1ThaiId
			lDriver1Passport=lMapInputDetail1.Driver1Passport
			lDriver1Country=lMapInputDetail1.Driver1Country
			lDriver1Name=lMapInputDetail1.Driver1Name
			lDriver1Surname=lMapInputDetail1.Driver1Surname
			lDriver1YearDriving=lMapInputDetail1.Driver1YearDriving
			lDriver1ClaimsNo=lMapInputDetail1.Driver1ClaimsNo
			lDriver1Occupation=lMapInputDetail1.Driver1Occupation
			lDriver2Status=lMapInputDetail1.Driver2Status
			lDriver2Dob=lMapInputDetail1.Driver2Dob
			lDriver2IsThai=lMapInputDetail1.Driver2IsThai
			lDriver2ThaiId=lMapInputDetail1.Driver2ThaiId
			lDriver2Passport=lMapInputDetail1.Driver2Passport
			lDriver2Country=lMapInputDetail1.Driver2Country
			lDriver2Name=lMapInputDetail1.Driver2Name
			lDriver2Surname=lMapInputDetail1.Driver2Surname
			lDriver2YearDriving=lMapInputDetail1.Driver2YearDriving
			lDriver2ClaimsNo=lMapInputDetail1.Driver2ClaimsNo
			lDriver2Occupation=lMapInputDetail1.Driver2Occupation
			lDriver3Status=lMapInputDetail1.Driver3Status
			lDriver3Dob=lMapInputDetail1.Driver3Dob
			lDriver3IsThai=lMapInputDetail1.Driver3IsThai
			lDriver3ThaiId=lMapInputDetail1.Driver3ThaiId
			lDriver3Passport=lMapInputDetail1.Driver3Passport
			lDriver3Country=lMapInputDetail1.Driver3Country
			lDriver3Name=lMapInputDetail1.Driver3Name
			lDriver3Surname=lMapInputDetail1.Driver3Surname
			lDriver3YearDriving=lMapInputDetail1.Driver3YearDriving
			lDriver3ClaimsNo=lMapInputDetail1.Driver3ClaimsNo
			lDriver3Occupation=lMapInputDetail1.Driver3Occupation
			lPolicyStartDayOffset=lMapInputDetail1.PolicyStartDayOffset
			lPolicyStartDate=lMapInputDetail1.PolicyStartDate
			lSubmitCallMeBack=lMapInputDetail1.SubmitCallMeBack
			lCallMeBackEmail=lMapInputDetail1.CallMeBackEmail
			lCallMeBackMobile=lMapInputDetail1.CallMeBackMobile
			lActualResult=lMapInputDetail1.ActualResult
			lPolicyInsurer=lMapInputDetail1.PolicyInsurer
			caseOutput.Language=lLanguage
			caseOutput.HolderEmail=lHolderEmail
			caseOutput.HolderNewsletter=lHolderNewsletter
			caseOutput.HolderPhoneNo=lHolderPhoneNo
			caseOutput.HolderCallMeNowToDo=lHolderCallMeNowToDo
			caseOutput.CallMeNow=lCallMeNow
			caseOutput.CallMeBackAtDay=lCallMeBackAtDay
			caseOutput.CallMeBackAtTime=lCallMeBackAtTime
			caseOutput.HolderIsPerson=lHolderIsPerson
			caseOutput.HolderIsMain=lHolderIsMain
			caseOutput.CarForCommercial=lCarForCommercial
			caseOutput.CarPlateNumber=lCarPlateNumber
			caseOutput.CarPlateProvince=lCarPlateProvince
			caseOutput.HolderStatus=lHolderStatus
			caseOutput.HolderDob=lHolderDob
			caseOutput.HolderIsThai=lHolderIsThai
			caseOutput.HolderThaiId=lHolderThaiId
			caseOutput.HolderOccupation=lHolderOccupation
			caseOutput.HolderPassport=lHolderPassport
			caseOutput.HolderCountry=lHolderCountry
			caseOutput.HolderName=lHolderName
			caseOutput.HolderSurname=lHolderSurname
			caseOutput.HolderCompId=lHolderCompId
			caseOutput.HolderCompName=lHolderCompName
			caseOutput.MainStatus=lMainStatus
			caseOutput.MainDob=lMainDob
			caseOutput.MainIsThai=lMainIsThai
			caseOutput.MainThaiId=lMainThaiId
			caseOutput.MainOccupation=lMainOccupation
			caseOutput.MainPassport=lMainPassport
			caseOutput.MainCountry=lMainCountry
			caseOutput.MainName=lMainName
			caseOutput.MainSurname=lMainSurname
			caseOutput.MainEmail=lMainEmail
			caseOutput.MainPhoneNo=lMainPhoneNo
			caseOutput.AdditionDrivers=lAdditionDrivers
			caseOutput.DriversHaveLicense=lDriversHaveLicense
			caseOutput.Driver1Status=lDriver1Status
			caseOutput.Driver1Dob=lDriver1Dob
			caseOutput.Driver1IsThai=lDriver1IsThai
			caseOutput.Driver1ThaiId=lDriver1ThaiId
			caseOutput.Driver1Passport=lDriver1Passport
			caseOutput.Driver1Country=lDriver1Country
			caseOutput.Driver1Name=lDriver1Name
			caseOutput.Driver1Surname=lDriver1Surname
			caseOutput.Driver1YearDriving=lDriver1YearDriving
			caseOutput.Driver1ClaimsNo=lDriver1ClaimsNo
			caseOutput.Driver1Occupation=lDriver1Occupation
			caseOutput.Driver2Status=lDriver2Status
			caseOutput.Driver2Dob=lDriver2Dob
			caseOutput.Driver2IsThai=lDriver2IsThai
			caseOutput.Driver2ThaiId=lDriver2ThaiId
			caseOutput.Driver2Passport=lDriver2Passport
			caseOutput.Driver2Country=lDriver2Country
			caseOutput.Driver2Name=lDriver2Name
			caseOutput.Driver2Surname=lDriver2Surname
			caseOutput.Driver2YearDriving=lDriver2YearDriving
			caseOutput.Driver2ClaimsNo=lDriver2ClaimsNo
			caseOutput.Driver2Occupation=lDriver2Occupation
			caseOutput.Driver3Status=lDriver3Status
			caseOutput.Driver3Dob=lDriver3Dob
			caseOutput.Driver3IsThai=lDriver3IsThai
			caseOutput.Driver3ThaiId=lDriver3ThaiId
			caseOutput.Driver3Passport=lDriver3Passport
			caseOutput.Driver3Country=lDriver3Country
			caseOutput.Driver3Name=lDriver3Name
			caseOutput.Driver3Surname=lDriver3Surname
			caseOutput.Driver3YearDriving=lDriver3YearDriving
			caseOutput.Driver3ClaimsNo=lDriver3ClaimsNo
			caseOutput.Driver3Occupation=lDriver3Occupation
			caseOutput.PolicyStartDayOffset=lPolicyStartDayOffset
			caseOutput.PolicyStartDate=lPolicyStartDate
			caseOutput.SubmitCallMeBack=lSubmitCallMeBack
			caseOutput.CallMeBackEmail=lCallMeBackEmail
			caseOutput.CallMeBackMobile=lCallMeBackMobile
			caseOutput.ActualResult=lActualResult
			caseOutput.PolicyInsurer=lPolicyInsurer
			THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=THAMotorCarCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER
			Boolean lIsActualResult=IGNUemaHelper.convertStringToBoolean(lActualResult)
			if(lIsActualResult){
				Map lMapSalesforceProceedTodo=this.inputSalesforceProceedTodo(lSalesforceProceedTodo)
				if(!lMapSalesforceProceedTodo.Result){
					lSalesforceProceedTodo=''
				}else{
					lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
				}
				caseOutput.SalesforceProceedTodo=lSalesforceProceedTodo
				if(lSalesforceProceedTodo.length()<=0){
					return lreturn
				}
				Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
				if(lIsSalesforceProceedTodo){
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THARGPAMotorCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					}
					lIsActualResult=lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result
					lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
					caseOutput.ActualResult=lActualResult
				}
			}
			lreturn=lIsActualResult
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDetail1MotorCarA(Map mapInput,Boolean isPositiveCase){
		Map lreturn=lTHAMotorCarQuotationDetail1Util.initDetail1Output()
		String lLanguage=mapInput.Language.toString().trim()
		String lHolderEmail=mapInput.HolderEmail.toString().trim()
		String lHolderNewsletter=mapInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=mapInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=mapInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=mapInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=mapInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=mapInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=mapInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=mapInput.HolderIsMain.toString().trim()
		String lCarForCommercial=mapInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=mapInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=mapInput.CarPlateProvince.toString().trim()
		String lHolderStatus=mapInput.HolderStatus.toString().trim()
		String lHolderDob=mapInput.HolderDob.toString().trim()
		String lHolderIsThai=mapInput.HolderIsThai.toString().trim()
		String lHolderThaiId=mapInput.HolderThaiId.toString().trim()
		String lHolderOccupation=mapInput.HolderOccupation.toString().trim()
		String lHolderPassport=mapInput.HolderPassport.toString().trim()
		String lHolderCountry=mapInput.HolderCountry.toString().trim()
		String lHolderName=mapInput.HolderName.toString().trim()
		String lHolderSurname=mapInput.HolderSurname.toString().trim()
		String lHolderCompId=mapInput.HolderCompId.toString().trim()
		String lHolderCompName=mapInput.HolderCompName.toString().trim()
		String lMainStatus=mapInput.MainStatus.toString().trim()
		String lMainDob=mapInput.MainDob.toString().trim()
		String lMainIsThai=mapInput.MainIsThai.toString().trim()
		String lMainThaiId=mapInput.MainThaiId.toString().trim()
		String lMainOccupation=mapInput.MainOccupation.toString().trim()
		String lMainPassport=mapInput.MainPassport.toString().trim()
		String lMainCountry=mapInput.MainCountry.toString().trim()
		String lMainName=mapInput.MainName.toString().trim()
		String lMainSurname=mapInput.MainSurname.toString().trim()
		String lMainEmail=mapInput.MainEmail.toString().trim()
		String lMainPhoneNo=mapInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=mapInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=mapInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=mapInput.Driver1Status.toString().trim()
		String lDriver1Dob=mapInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=mapInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=mapInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=mapInput.Driver1Passport.toString().trim()
		String lDriver1Country=mapInput.Driver1Country.toString().trim()
		String lDriver1Name=mapInput.Driver1Name.toString().trim()
		String lDriver1Surname=mapInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=mapInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=mapInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=mapInput.Driver1Occupation.toString().trim()
		String lDriver2Status=mapInput.Driver2Status.toString().trim()
		String lDriver2Dob=mapInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=mapInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=mapInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=mapInput.Driver2Passport.toString().trim()
		String lDriver2Country=mapInput.Driver2Country.toString().trim()
		String lDriver2Name=mapInput.Driver2Name.toString().trim()
		String lDriver2Surname=mapInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=mapInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=mapInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=mapInput.Driver2Occupation.toString().trim()
		String lDriver3Status=mapInput.Driver3Status.toString().trim()
		String lDriver3Dob=mapInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=mapInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=mapInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=mapInput.Driver3Passport.toString().trim()
		String lDriver3Country=mapInput.Driver3Country.toString().trim()
		String lDriver3Name=mapInput.Driver3Name.toString().trim()
		String lDriver3Surname=mapInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=mapInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=mapInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=mapInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=mapInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=mapInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=mapInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=mapInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=mapInput.CallMeBackMobile.toString().trim()
		String lPositiveCase=mapInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lOpportunityNumber=''
		Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
		try{
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lreturn.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			Map lMapSubmitCallMeBack=this.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			lreturn.SubmitCallMeBack=lSubmitCallMeBack
			lreturn.CallMeBackEmail=lCallMeBackEmail
			lreturn.CallMeBackMobile=lCallMeBackMobile
			if(!lMapSubmitCallMeBack.Result){
				return lreturn
			}
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
			}
			lreturn.HolderEmail=lHolderEmail
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderNewsletter=this.inputHolderNewsletter(lHolderNewsletter)
			if(!lMapHolderNewsletter.Result){
				lHolderNewsletter=''
			}else{
				lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
			}
			lreturn.HolderNewsletter=lHolderNewsletter
			if(lHolderNewsletter.length()<=0){
				return lreturn
			}
			Map lMapHolderPhoneNo=this.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			lreturn.HolderPhoneNo=lHolderPhoneNo
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Map lMapHolderCallMeNowToDo=this.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			lreturn.HolderCallMeNowToDo=lHolderCallMeNowToDo
			if(lHolderCallMeNowToDo.length()<=0){
				return lreturn
			}
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			if(!lIsHolderCallMeNowToDo){
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				lreturn.ActualResult=lActualResult
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}else{
				Map lMapCallMeNow=this.inputCallMeNow(lCallMeNow)
				if(!lMapCallMeNow.Result){
					lCallMeNow=''
				}else{
					lCallMeNow=lMapCallMeNow.CallMeNow
				}
				lreturn.CallMeNow=lCallMeNow
				if(lCallMeNow.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtDay=this.inputCallMeBackAtDay(lCallMeBackAtDay)
				if(!lMapCallMeBackAtDay.Result){
					lCallMeBackAtDay=''
				}else{
					lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
				}
				lreturn.CallMeBackAtDay=lCallMeBackAtDay
				if(lCallMeBackAtDay.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtTime=this.inputCallMeBackAtTime(lCallMeBackAtTime)
				if(!lMapCallMeBackAtTime.Result){
					lCallMeBackAtTime=''
				}else{
					lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
				}
				lreturn.CallMeBackAtTime=lCallMeBackAtTime
				if(lCallMeBackAtTime.length()<=0){
					return lreturn
				}
				Map lMapCarPlateNumber=this.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
				lreturn.CarPlateNumber=lCarPlateNumber
				if(lCarPlateNumber.length()<=0){
					return lreturn
				}
				Map lMapCarPlateProvince=this.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
				lreturn.CarPlateProvince=lCarPlateProvince
				if(lCarPlateProvince.length()<=0){
					return lreturn
				}
				Map lMapCarForCommercial=this.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
				lreturn.CarForCommercial=lCarForCommercial
				if(lCarForCommercial.length()<=0){
					return lreturn
				}
				Map lMapHolderIsPerson=this.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
				lreturn.HolderIsPerson=lHolderIsPerson
				if(lHolderIsPerson.length()<=0){
					return lreturn
				}
				Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
				if(lIsHolderIsPerson){
					Map lMapHolderIsMain=this.inputHolderIsMain(lHolderIsMain)
					if(!lMapHolderIsMain.Result){
						lHolderIsMain=''
					}else{
						lHolderIsMain=lMapHolderIsMain.HolderIsMain
					}
					lreturn.HolderIsMain=lHolderIsMain
					if(lHolderIsMain.length()<=0){
						return lreturn
					}
				}
				if(!lIsHolderIsPerson){
					Map lMapHolderCompName=this.inputHolderCompName(lHolderCompName)
					if(!lMapHolderCompName.Result){
						lHolderCompName=''
					}else{
						lHolderCompName=lMapHolderCompName.HolderCompName
					}
					lreturn.HolderCompName=lHolderCompName
					if(lHolderCompName.length()<=0){
						return lreturn
					}
					Map lMapHolderCompId=this.inputHolderCompId(lHolderCompId)
					if(!lMapHolderCompId.Result){
						lHolderCompId=''
					}else{
						lHolderCompId=lMapHolderCompId.HolderCompId
					}
					lreturn.HolderCompId=lHolderCompId
					if(lHolderCompId.length()<=0){
						return lreturn
					}
				}
				if(!lIsHolderIsPerson){
					//Holder=Company||Fill//Main
					Map lMapMainStatus=this.inputMainStatus(lMainStatus)
					if(!lMapMainStatus.Result){
						lMainStatus='No Option'
					}else{
						lMainStatus=lMapMainStatus.MainStatus
					}
					lreturn.MainStatus=lMainStatus
					Map lMapMainDob=this.inputMainDob(lMainDob)
					if(!lMapMainDob.Result){
						lMainDob='No Option'
					}else{
						lMainDob=lMapMainDob.MainDob
					}
					lreturn.MainDob=lMainDob
					Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
					if(!lMapMainIsThai.Result){
						lMainIsThai=''
					}else{
						lMainIsThai=lMapMainIsThai.MainIsThai
					}
					lreturn.MainIsThai=lMainIsThai
					if(lMainIsThai.length()<=0){
						return lreturn
					}
					Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
					if(lIsMainIsThai){
						Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
						if(!lMapMainThaiId.Result){
							lMainThaiId=''
						}else{
							lMainThaiId=lMapMainThaiId.MainThaiId
						}
						lreturn.MainThaiId=lMainThaiId
						if(lMainThaiId.length()<=0){
							return lreturn
						}
					}else{
						Map lMapMainPassport=this.inputMainPassport(lMainPassport)
						if(!lMapMainPassport.Result){
							lMainPassport=''
						}else{
							lMainPassport=lMapMainPassport.MainPassport
						}
						lreturn.MainPassport=lMainPassport
						if(lMainPassport.length()<=0){
							return lreturn
						}
						Map lMapMainCountry=this.inputMainCountry(lMainCountry)
						if(!lMapMainCountry.Result){
							lMainCountry=''
						}else{
							lMainCountry=lMapMainCountry.MainCountry
						}
						lreturn.MainCountry=lMainCountry
						if(lMainCountry.length()<=0){
							return lreturn
						}
					}
					Map lMapMainName=this.inputMainName(lMainName)
					if(!lMapMainName.Result){
						lMainName=''
					}else{
						lMainName=lMapMainName.MainName
					}
					lreturn.MainName=lMainName
					if(lMainName.length()<=0){
						return lreturn
					}
					Map lMapMainSurname=this.inputMainSurname(lMainSurname)
					if(!lMapMainSurname.Result){
						lMainSurname=''
					}else{
						lMainSurname=lMapMainSurname.MainSurname
					}
					lreturn.MainSurname=lMainSurname
					if(lMainSurname.length()<=0){
						return lreturn
					}
					Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
					if(!lMapMainOccupation.Result){
						lMainOccupation=''
					}else{
						lMainOccupation=lMapMainOccupation.MainOccupation
					}
					lreturn.MainOccupation=lMainOccupation
					if(lMainOccupation.length()<=0){
						return lreturn
					}
					Map lMapMainEmail=this.inputMainEmail(lMainEmail)
					if(!lMapMainEmail.Result){
						lMainEmail=''
					}else{
						lMainEmail=lMapMainEmail.MainEmail
					}
					lreturn.MainEmail=lMainEmail
					if(lMainEmail.length()<=0){
						return lreturn
					}
					Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
					if(!lMapMainPhoneNo.Result){
						lMainPhoneNo=''
					}else{
						lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
					}
					lreturn.MainPhoneNo=lMainPhoneNo
					if(lMainPhoneNo.length()<=0){
						return lreturn
					}
				}else{
					Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
					if(lIsHolderIsMain){
						//Holder=Person||Fill//Main
						Map lMapMainStatus=this.inputMainStatus(lMainStatus)
						if(!lMapMainStatus.Result){
							lMainStatus='No Option'
						}else{
							lMainStatus=lMapMainStatus.MainStatus
						}
						lreturn.MainStatus=lMainStatus
						Map lMapMainDob=this.inputMainDob(lMainDob)
						if(!lMapMainDob.Result){
							lMainDob='No Option'
						}else{
							lMainDob=lMapMainDob.MainDob
						}
						lreturn.MainDob=lMainDob
						Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
						if(!lMapMainIsThai.Result){
							lMainIsThai=''
						}else{
							lMainIsThai=lMapMainIsThai.MainIsThai
						}
						lreturn.MainIsThai=lMainIsThai
						if(lMainIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
						if(lIsMainIsThai){
							Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
							if(!lMapMainThaiId.Result){
								lMainThaiId=''
							}else{
								lMainThaiId=lMapMainThaiId.MainThaiId
							}
							lreturn.MainThaiId=lMainThaiId
							if(lMainThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapMainPassport=this.inputMainPassport(lMainPassport)
							if(!lMapMainPassport.Result){
								lMainPassport=''
							}else{
								lMainPassport=lMapMainPassport.MainPassport
							}
							lreturn.MainPassport=lMainPassport
							if(lMainPassport.length()<=0){
								return lreturn
							}
							Map lMapMainCountry=this.inputMainCountry(lMainCountry)
							if(!lMapMainCountry.Result){
								lMainCountry=''
							}else{
								lMainCountry=lMapMainCountry.MainCountry
							}
							lreturn.MainCountry=lMainCountry
							if(lMainCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapMainName=this.inputMainName(lMainName)
						if(!lMapMainName.Result){
							lMainName=''
						}else{
							lMainName=lMapMainName.MainName
						}
						lreturn.MainName=lMainName
						if(lMainName.length()<=0){
							return lreturn
						}
						Map lMapMainSurname=this.inputMainSurname(lMainSurname)
						if(!lMapMainSurname.Result){
							lMainSurname=''
						}else{
							lMainSurname=lMapMainSurname.MainSurname
						}
						lreturn.MainSurname=lMainSurname
						if(lMainSurname.length()<=0){
							return lreturn
						}
						Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
						if(!lMapMainOccupation.Result){
							lMainOccupation=''
						}else{
							lMainOccupation=lMapMainOccupation.MainOccupation
						}
						lreturn.MainOccupation=lMainOccupation
						if(lMainOccupation.length()<=0){
							return lreturn
						}
					}else{
						//Holder=Person||Fill//Owner+Main
						Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
						if(!lMapHolderStatus.Result){
							lHolderStatus=''
						}else{
							lHolderStatus=lMapHolderStatus.HolderStatus
						}
						lreturn.HolderStatus=lHolderStatus
						if(lHolderStatus.length()<=0){
							return lreturn
						}
						Map lMapHolderDob=this.inputHolderDob(lHolderDob)
						if(!lMapHolderDob.Result){
							lHolderDob=''
						}else{
							lHolderDob=lMapHolderDob.HolderDob
						}
						lreturn.HolderDob=lHolderDob
						if(lHolderDob.length()<=0){
							return lreturn
						}
						Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
						if(!lMapHolderIsThai.Result){
							lHolderIsThai=''
						}else{
							lHolderIsThai=lMapHolderIsThai.HolderIsThai
						}
						lreturn.HolderIsThai=lHolderIsThai
						if(lHolderIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
						if(lIsHolderIsThai){
							Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
							if(!lMapHolderThaiId.Result){
								lHolderThaiId=''
							}else{
								lHolderThaiId=lMapHolderThaiId.HolderThaiId
							}
							lreturn.HolderThaiId=lHolderThaiId
							if(lHolderThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
							if(!lMapHolderPassport.Result){
								lHolderPassport=''
							}else{
								lHolderPassport=lMapHolderPassport.HolderPassport
							}
							lreturn.HolderPassport=lHolderPassport
							if(lHolderPassport.length()<=0){
								return lreturn
							}
							Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
							if(!lMapHolderCountry.Result){
								lHolderCountry=''
							}else{
								lHolderCountry=lMapHolderCountry.HolderCountry
							}
							lreturn.HolderCountry=lHolderCountry
							if(lHolderCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapHolderName=this.inputHolderName(lHolderName)
						if(!lMapHolderName.Result){
							lHolderName=''
						}else{
							lHolderName=lMapHolderName.HolderName
						}
						lreturn.HolderName=lHolderName
						if(lHolderName.length()<=0){
							return lreturn
						}
						Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
						if(!lMapHolderSurname.Result){
							lHolderSurname=''
						}else{
							lHolderSurname=lMapHolderSurname.HolderSurname
						}
						lreturn.HolderSurname=lHolderSurname
						if(lHolderSurname.length()<=0){
							return lreturn
						}
						Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
						if(!lMapHolderOccupation.Result){
							lHolderOccupation=''
						}else{
							lHolderOccupation=lMapHolderOccupation.HolderOccupation
						}
						lreturn.HolderOccupation=lHolderOccupation
						if(lHolderOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainStatus=this.inputMainStatus(lMainStatus)
						if(!lMapMainStatus.Result){
							lMainStatus=''
						}else{
							lMainStatus=lMapMainStatus.MainStatus
						}
						lreturn.MainStatus=lMainStatus
						if(lMainStatus.length()<=0){
							return lreturn
						}
						Map lMapMainDob=this.inputMainDob(lMainDob)
						if(!lMapMainDob.Result){
							lMainDob=''
						}else{
							lMainDob=lMapMainDob.MainDob
						}
						lreturn.MainDob=lMainDob
						if(lMainDob.length()<=0){
							return lreturn
						}
						Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
						if(!lMapMainIsThai.Result){
							lMainIsThai=''
						}else{
							lMainIsThai=lMapMainIsThai.MainIsThai
						}
						lreturn.MainIsThai=lMainIsThai
						if(lMainIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
						if(lIsMainIsThai){
							Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
							if(!lMapMainThaiId.Result){
								lMainThaiId=''
							}else{
								lMainThaiId=lMapMainThaiId.MainThaiId
							}
							lreturn.MainThaiId=lMainThaiId
							if(lMainThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapMainPassport=this.inputMainPassport(lMainPassport)
							if(!lMapMainPassport.Result){
								lMainPassport=''
							}else{
								lMainPassport=lMapMainPassport.MainPassport
							}
							lreturn.MainPassport=lMainPassport
							if(lMainPassport.length()<=0){
								return lreturn
							}
							Map lMapMainCountry=this.inputMainCountry(lMainCountry)
							if(!lMapMainCountry.Result){
								lMainCountry=''
							}else{
								lMainCountry=lMapMainCountry.MainCountry
							}
							lreturn.MainCountry=lMainCountry
							if(lMainCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapMainName=this.inputMainName(lMainName)
						if(!lMapMainName.Result){
							lMainName=''
						}else{
							lMainName=lMapMainName.MainName
						}
						lreturn.MainName=lMainName
						if(lMainName.length()<=0){
							return lreturn
						}
						Map lMapMainSurname=this.inputMainSurname(lMainSurname)
						if(!lMapMainSurname.Result){
							lMainSurname=''
						}else{
							lMainSurname=lMapMainSurname.MainSurname
						}
						lreturn.MainSurname=lMainSurname
						if(lMainSurname.length()<=0){
							return lreturn
						}
						Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
						if(!lMapMainOccupation.Result){
							lMainOccupation=''
						}else{
							lMainOccupation=lMapMainOccupation.MainOccupation
						}
						lreturn.MainOccupation=lMainOccupation
						if(lMainOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainEmail=this.inputMainEmail(lMainEmail)
						if(!lMapMainEmail.Result){
							lMainEmail=''
						}else{
							lMainEmail=lMapMainEmail.MainEmail
						}
						lreturn.MainEmail=lMainEmail
						if(lMainEmail.length()<=0){
							return lreturn
						}
						Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
						if(!lMapMainPhoneNo.Result){
							lMainPhoneNo=''
						}else{
							lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
						}
						lreturn.MainPhoneNo=lMainPhoneNo
						if(lMainPhoneNo.length()<=0){
							return lreturn
						}
					}
				}
				Map lMapAdditionDrivers=this.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
				lreturn.AdditionDrivers=lAdditionDrivers
				if(lAdditionDrivers.length()<=0){
					return lreturn
				}
				Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
				if(lNumAdditionDrivers>0){
					String lTagAddDriverButtonYes='add-driver-modal'
					String lTagAddDriverButtonNo='additional-driver-skip'
					switch(lNumAdditionDrivers){
						case 1:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						case 2:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						default:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver3Status=this.inputDriver3Status(lDriver3Status)
							if(!lMapDriver3Status.Result){
								lDriver3Status=''
							}else{
								lDriver3Status=lMapDriver3Status.Driver3Status
							}
							lreturn.Driver3Status=lDriver3Status
							if(lDriver3Status.length()<=0){
								return lreturn
							}
							Map lMapDriver3Dob=this.inputDriver3Dob(lDriver3Dob)
							if(!lMapDriver3Dob.Result){
								lDriver3Dob=''
							}else{
								lDriver3Dob=lMapDriver3Dob.Driver3Dob
							}
							lreturn.Driver3Dob=lDriver3Dob
							if(lDriver3Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver3IsThai=this.inputDriver3IsThai(lDriver3IsThai)
							if(!lMapDriver3IsThai.Result){
								lDriver3IsThai=''
							}else{
								lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
							}
							lreturn.Driver3IsThai=lDriver3IsThai
							if(lDriver3IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
							if(lIsDriver3IsThai){
								Map lMapDriver3ThaiId=this.inputDriver3ThaiId(lDriver3ThaiId)
								if(!lMapDriver3ThaiId.Result){
									lDriver3ThaiId=''
								}else{
									lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
								}
								lreturn.Driver3ThaiId=lDriver3ThaiId
								if(lDriver3ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver3Passport=this.inputDriver3Passport(lDriver3Passport)
								if(!lMapDriver3Passport.Result){
									lDriver3Passport=''
								}else{
									lDriver3Passport=lMapDriver3Passport.Driver3Passport
								}
								lreturn.Driver3Passport=lDriver3Passport
								if(lDriver3Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver3Country=this.inputDriver3Country(lDriver3Country)
								if(!lMapDriver3Country.Result){
									lDriver3Country=''
								}else{
									lDriver3Country=lMapDriver3Country.Driver3Country
								}
								lreturn.Driver3Country=lDriver3Country
								if(lDriver3Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver3YearDriving=this.inputDriver3YearDriving(lDriver3YearDriving)
							if(!lMapDriver3YearDriving.Result){
								lDriver3YearDriving=''
							}else{
								lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
							}
							lreturn.Driver3YearDriving=lDriver3YearDriving
							if(lDriver3YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver3ClaimsNo=this.inputDriver3ClaimsNo(lDriver3ClaimsNo)
							if(!lMapDriver3ClaimsNo.Result){
								lDriver3ClaimsNo=''
							}else{
								lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
							}
							lreturn.Driver3ClaimsNo=lDriver3ClaimsNo
							if(lDriver3ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver3Name=this.inputDriver3Name(lDriver3Name)
							if(!lMapDriver3Name.Result){
								lDriver3Name=''
							}else{
								lDriver3Name=lMapDriver3Name.Driver3Name
							}
							lreturn.Driver3Name=lDriver3Name
							if(lDriver3Name.length()<=0){
								return lreturn
							}
							Map lMapDriver3Surname=this.inputDriver3Surname(lDriver3Surname)
							if(!lMapDriver3Surname.Result){
								lDriver3Surname=''
							}else{
								lDriver3Surname=lMapDriver3Surname.Driver3Surname
							}
							lreturn.Driver3Surname=lDriver3Surname
							if(lDriver3Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver3Occupation=this.inputDriver3Occupation(lDriver3Occupation)
							if(!lMapDriver3Occupation.Result){
								lDriver3Occupation=''
							}else{
								lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
							}
							lreturn.Driver3Occupation=lDriver3Occupation
							if(lDriver3Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('additional-driver-continue'))
							break
					}
				}
				Map lMapPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lreturn.PolicyStartDate=lPolicyStartDate
				lreturn.PolicyStartDayOffset=lPolicyStartDayOffset
				if(lPolicyStartDayOffset.length()<=0){
					return lreturn
				}
				Map lMapDriversHaveLicense=this.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
				lreturn.DriversHaveLicense=lDriversHaveLicense
				if(lDriversHaveLicense.length()<=0){
					return lreturn
				}
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lreturn.ActualResult=lActualResult
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDetail1MotorCarB(Map mapInput,Boolean isPositiveCase){
		Map lreturn=lTHAMotorCarQuotationDetail1Util.initDetail1Output()
		String lLanguage=mapInput.Language.toString().trim()
		String lHolderEmail=mapInput.HolderEmail.toString().trim()
		String lHolderNewsletter=mapInput.HolderNewsletter.toString().trim()
		String lHolderPhoneNo=mapInput.HolderPhoneNo.toString().trim()
		String lHolderCallMeNowToDo=mapInput.HolderCallMeNowToDo.toString().trim()
		String lCallMeNow=mapInput.CallMeNow.toString().trim()
		String lCallMeBackAtDay=mapInput.CallMeBackAtDay.toString().trim()
		String lCallMeBackAtTime=mapInput.CallMeBackAtTime.toString().trim()
		String lHolderIsPerson=mapInput.HolderIsPerson.toString().trim()
		String lHolderIsMain=mapInput.HolderIsMain.toString().trim()
		String lCarForCommercial=mapInput.CarForCommercial.toString().trim()
		String lCarPlateNumber=mapInput.CarPlateNumber.toString().trim()
		String lCarPlateProvince=mapInput.CarPlateProvince.toString().trim()
		String lHolderStatus=mapInput.HolderStatus.toString().trim()
		String lHolderDob=mapInput.HolderDob.toString().trim()
		String lHolderIsThai=mapInput.HolderIsThai.toString().trim()
		String lHolderThaiId=mapInput.HolderThaiId.toString().trim()
		String lHolderOccupation=mapInput.HolderOccupation.toString().trim()
		String lHolderPassport=mapInput.HolderPassport.toString().trim()
		String lHolderCountry=mapInput.HolderCountry.toString().trim()
		String lHolderName=mapInput.HolderName.toString().trim()
		String lHolderSurname=mapInput.HolderSurname.toString().trim()
		String lHolderCompId=mapInput.HolderCompId.toString().trim()
		String lHolderCompName=mapInput.HolderCompName.toString().trim()
		String lMainStatus=mapInput.MainStatus.toString().trim()
		String lMainDob=mapInput.MainDob.toString().trim()
		String lMainIsThai=mapInput.MainIsThai.toString().trim()
		String lMainThaiId=mapInput.MainThaiId.toString().trim()
		String lMainOccupation=mapInput.MainOccupation.toString().trim()
		String lMainPassport=mapInput.MainPassport.toString().trim()
		String lMainCountry=mapInput.MainCountry.toString().trim()
		String lMainName=mapInput.MainName.toString().trim()
		String lMainSurname=mapInput.MainSurname.toString().trim()
		String lMainEmail=mapInput.MainEmail.toString().trim()
		String lMainPhoneNo=mapInput.MainPhoneNo.toString().trim()
		String lAdditionDrivers=mapInput.AdditionDrivers.toString().trim()
		String lDriversHaveLicense=mapInput.DriversHaveLicense.toString().trim()
		String lDriver1Status=mapInput.Driver1Status.toString().trim()
		String lDriver1Dob=mapInput.Driver1Dob.toString().trim()
		String lDriver1IsThai=mapInput.Driver1IsThai.toString().trim()
		String lDriver1ThaiId=mapInput.Driver1ThaiId.toString().trim()
		String lDriver1Passport=mapInput.Driver1Passport.toString().trim()
		String lDriver1Country=mapInput.Driver1Country.toString().trim()
		String lDriver1Name=mapInput.Driver1Name.toString().trim()
		String lDriver1Surname=mapInput.Driver1Surname.toString().trim()
		String lDriver1YearDriving=mapInput.Driver1YearDriving.toString().trim()
		String lDriver1ClaimsNo=mapInput.Driver1ClaimsNo.toString().trim()
		String lDriver1Occupation=mapInput.Driver1Occupation.toString().trim()
		String lDriver2Status=mapInput.Driver2Status.toString().trim()
		String lDriver2Dob=mapInput.Driver2Dob.toString().trim()
		String lDriver2IsThai=mapInput.Driver2IsThai.toString().trim()
		String lDriver2ThaiId=mapInput.Driver2ThaiId.toString().trim()
		String lDriver2Passport=mapInput.Driver2Passport.toString().trim()
		String lDriver2Country=mapInput.Driver2Country.toString().trim()
		String lDriver2Name=mapInput.Driver2Name.toString().trim()
		String lDriver2Surname=mapInput.Driver2Surname.toString().trim()
		String lDriver2YearDriving=mapInput.Driver2YearDriving.toString().trim()
		String lDriver2ClaimsNo=mapInput.Driver2ClaimsNo.toString().trim()
		String lDriver2Occupation=mapInput.Driver2Occupation.toString().trim()
		String lDriver3Status=mapInput.Driver3Status.toString().trim()
		String lDriver3Dob=mapInput.Driver3Dob.toString().trim()
		String lDriver3IsThai=mapInput.Driver3IsThai.toString().trim()
		String lDriver3ThaiId=mapInput.Driver3ThaiId.toString().trim()
		String lDriver3Passport=mapInput.Driver3Passport.toString().trim()
		String lDriver3Country=mapInput.Driver3Country.toString().trim()
		String lDriver3Name=mapInput.Driver3Name.toString().trim()
		String lDriver3Surname=mapInput.Driver3Surname.toString().trim()
		String lDriver3YearDriving=mapInput.Driver3YearDriving.toString().trim()
		String lDriver3ClaimsNo=mapInput.Driver3ClaimsNo.toString().trim()
		String lDriver3Occupation=mapInput.Driver3Occupation.toString().trim()
		String lPolicyStartDayOffset=mapInput.PolicyStartDayOffset.toString().trim()
		String lPolicyStartDate=mapInput.PolicyStartDate.toString().trim()
		String lSubmitCallMeBack=mapInput.SubmitCallMeBack.toString().trim()
		String lCallMeBackEmail=mapInput.CallMeBackEmail.toString().trim()
		String lCallMeBackMobile=mapInput.CallMeBackMobile.toString().trim()
		String lPositiveCase=mapInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lPolicyInsurer=''
		String lOpportunityNumber=''
		Boolean lIsPositiveCase=IGNUemaHelper.convertStringToBoolean(lPositiveCase)
		try{
			Map lMapLanguage=this.inputLanguage(lLanguage)
			if(!lMapLanguage.Result){
				lLanguage=''
			}else{
				lLanguage=lMapLanguage.Language
			}
			lreturn.Language=lLanguage
			if(lLanguage.length()<=0){
				return lreturn
			}
			Map lMapSubmitCallMeBack=this.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
			if(!lMapSubmitCallMeBack.Result){
				lSubmitCallMeBack=''
				lCallMeBackEmail=''
				lCallMeBackMobile=''
			}else{
				lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
				lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
				lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
			}
			lreturn.SubmitCallMeBack=lSubmitCallMeBack
			lreturn.CallMeBackEmail=lCallMeBackEmail
			lreturn.CallMeBackMobile=lCallMeBackMobile
			if(!lMapSubmitCallMeBack.Result){
				return lreturn
			}
			Map lMapHolderIsMain=this.inputHolderIsMain(lHolderIsMain)
			if(!lMapHolderIsMain.Result){
				lHolderIsMain=''
			}else{
				lHolderIsMain=lMapHolderIsMain.HolderIsMain
			}
			lreturn.HolderIsMain=lHolderIsMain
			if(lHolderIsMain.length()<=0){
				return lreturn
			}
			Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
			Map lMapHolderEmail=this.inputHolderEmail(lHolderEmail)
			if(!lMapHolderEmail.Result){
				lHolderEmail=''
			}else{
				lHolderEmail=lMapHolderEmail.HolderEmail
			}
			lreturn.HolderEmail=lHolderEmail
			if(lHolderEmail.length()<=0){
				return lreturn
			}
			Map lMapHolderNewsletter=this.inputHolderNewsletter(lHolderNewsletter)
			if(!lMapHolderNewsletter.Result){
				lHolderNewsletter=''
			}else{
				lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
			}
			lreturn.HolderNewsletter=lHolderNewsletter
			if(lHolderNewsletter.length()<=0){
				return lreturn
			}
			Map lMapHolderPhoneNo=this.inputHolderPhoneNo(lHolderPhoneNo)
			if(!lMapHolderPhoneNo.Result){
				lHolderPhoneNo=''
			}else{
				lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
			}
			lreturn.HolderPhoneNo=lHolderPhoneNo
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			Map lMapHolderCallMeNowToDo=this.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
			if(!lMapHolderCallMeNowToDo.Result){
				lHolderCallMeNowToDo=''
			}else{
				lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
			}
			lreturn.HolderCallMeNowToDo=lHolderCallMeNowToDo
			if(lHolderCallMeNowToDo.length()<=0){
				return lreturn
			}
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			if(!lIsHolderCallMeNowToDo){
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
					lOpportunityNumber=''
				}else{
					lActualResult=lMapActualResult.ActualResult
					lOpportunityNumber=lMapActualResult.OpportunityNumber
				}
				lreturn.ActualResult=lActualResult
				lreturn.OpportunityNumber=lOpportunityNumber
				lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			}else{
				Map lMapCallMeNow=this.inputCallMeNow(lCallMeNow)
				if(!lMapCallMeNow.Result){
					lCallMeNow=''
				}else{
					lCallMeNow=lMapCallMeNow.CallMeNow
				}
				lreturn.CallMeNow=lCallMeNow
				if(lCallMeNow.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtDay=this.inputCallMeBackAtDay(lCallMeBackAtDay)
				if(!lMapCallMeBackAtDay.Result){
					lCallMeBackAtDay=''
				}else{
					lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
				}
				lreturn.CallMeBackAtDay=lCallMeBackAtDay
				if(lCallMeBackAtDay.length()<=0){
					return lreturn
				}
				Map lMapCallMeBackAtTime=this.inputCallMeBackAtTime(lCallMeBackAtTime)
				if(!lMapCallMeBackAtTime.Result){
					lCallMeBackAtTime=''
				}else{
					lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
				}
				lreturn.CallMeBackAtTime=lCallMeBackAtTime
				if(lCallMeBackAtTime.length()<=0){
					return lreturn
				}
				Map lMapCarForCommercial=this.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
				lreturn.CarForCommercial=lCarForCommercial
				if(lCarForCommercial.length()<=0){
					return lreturn
				}
				Map lMapHolderIsPerson=this.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
				lreturn.HolderIsPerson=lHolderIsPerson
				if(lHolderIsPerson.length()<=0){
					return lreturn
				}
				Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
				if(!lIsHolderIsPerson){
					Map lMapHolderCompName=this.inputHolderCompName(lHolderCompName)
					if(!lMapHolderCompName.Result){
						lHolderCompName=''
					}else{
						lHolderCompName=lMapHolderCompName.HolderCompName
					}
					lreturn.HolderCompName=lHolderCompName
					if(lHolderCompName.length()<=0){
						return lreturn
					}
					Map lMapHolderCompId=this.inputHolderCompId(lHolderCompId)
					if(!lMapHolderCompId.Result){
						lHolderCompId=''
					}else{
						lHolderCompId=lMapHolderCompId.HolderCompId
					}
					lreturn.HolderCompId=lHolderCompId
					if(lHolderCompId.length()<=0){
						return lreturn
					}
				}
				Map lMapCarPlateNumber=this.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
				lreturn.CarPlateNumber=lCarPlateNumber
				if(lCarPlateNumber.length()<=0){
					return lreturn
				}
				Map lMapCarPlateProvince=this.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
				lreturn.CarPlateProvince=lCarPlateProvince
				if(lCarPlateProvince.length()<=0){
					return lreturn
				}
				if(!lIsHolderIsPerson){
					//Holder=Company||Fill//Main
					Map lMapMainStatus=this.inputMainStatus(lMainStatus)
					if(!lMapMainStatus.Result){
						lMainStatus=''
					}else{
						lMainStatus=lMapMainStatus.MainStatus
					}
					lreturn.MainStatus=lMainStatus
					if(lMainStatus.length()<=0){
						return lreturn
					}
					Map lMapMainDob=this.inputMainDob(lMainDob)
					if(!lMapMainDob.Result){
						lMainDob=''
					}else{
						lMainDob=lMapMainDob.MainDob
					}
					lreturn.MainDob=lMainDob
					if(lMainDob.length()<=0){
						return lreturn
					}
					Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
					if(!lMapMainIsThai.Result){
						lMainIsThai=''
					}else{
						lMainIsThai=lMapMainIsThai.MainIsThai
					}
					lreturn.MainIsThai=lMainIsThai
					if(lMainIsThai.length()<=0){
						return lreturn
					}
					Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
					if(lIsMainIsThai){
						Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
						if(!lMapMainThaiId.Result){
							lMainThaiId=''
						}else{
							lMainThaiId=lMapMainThaiId.MainThaiId
						}
						lreturn.MainThaiId=lMainThaiId
						if(lMainThaiId.length()<=0){
							return lreturn
						}
					}else{
						Map lMapMainPassport=this.inputMainPassport(lMainPassport)
						if(!lMapMainPassport.Result){
							lMainPassport=''
						}else{
							lMainPassport=lMapMainPassport.MainPassport
						}
						lreturn.MainPassport=lMainPassport
						if(lMainPassport.length()<=0){
							return lreturn
						}
						Map lMapMainCountry=this.inputMainCountry(lMainCountry)
						if(!lMapMainCountry.Result){
							lMainCountry=''
						}else{
							lMainCountry=lMapMainCountry.MainCountry
						}
						lreturn.MainCountry=lMainCountry
						if(lMainCountry.length()<=0){
							return lreturn
						}
					}
					Map lMapMainName=this.inputMainName(lMainName)
					if(!lMapMainName.Result){
						lMainName=''
					}else{
						lMainName=lMapMainName.MainName
					}
					lreturn.MainName=lMainName
					if(lMainName.length()<=0){
						return lreturn
					}
					Map lMapMainSurname=this.inputMainSurname(lMainSurname)
					if(!lMapMainSurname.Result){
						lMainSurname=''
					}else{
						lMainSurname=lMapMainSurname.MainSurname
					}
					lreturn.MainSurname=lMainSurname
					if(lMainSurname.length()<=0){
						return lreturn
					}
					Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
					if(!lMapMainOccupation.Result){
						lMainOccupation=''
					}else{
						lMainOccupation=lMapMainOccupation.MainOccupation
					}
					lreturn.MainOccupation=lMainOccupation
					if(lMainOccupation.length()<=0){
						return lreturn
					}
					Map lMapMainEmail=this.inputMainEmail(lMainEmail)
					if(!lMapMainEmail.Result){
						lMainEmail=''
					}else{
						lMainEmail=lMapMainEmail.MainEmail
					}
					lreturn.MainEmail=lMainEmail
					if(lMainEmail.length()<=0){
						return lreturn
					}
					Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
					if(!lMapMainPhoneNo.Result){
						lMainPhoneNo=''
					}else{
						lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
					}
					lreturn.MainPhoneNo=lMainPhoneNo
					if(lMainPhoneNo.length()<=0){
						return lreturn
					}
				}else{
					if(lIsHolderIsMain){
						Boolean lIsMainDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriverEdit'))
						if(lIsMainDisplayed){
							//Holder=Person||Fill//Main
							Map lMapMainStatus=this.inputMainStatus(lMainStatus)
							if(!lMapMainStatus.Result){
								lMainStatus=''
							}else{
								lMainStatus=lMapMainStatus.MainStatus
							}
							lreturn.MainStatus=lMainStatus
							if(lMainStatus.length()<=0){
								return lreturn
							}
							Map lMapMainDob=this.inputMainDob(lMainDob)
							if(!lMapMainDob.Result){
								lMainDob=''
							}else{
								lMainDob=lMapMainDob.MainDob
							}
							lreturn.MainDob=lMainDob
							if(lMainDob.length()<=0){
								return lreturn
							}
							Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
							if(!lMapMainIsThai.Result){
								lMainIsThai=''
							}else{
								lMainIsThai=lMapMainIsThai.MainIsThai
							}
							lreturn.MainIsThai=lMainIsThai
							if(lMainIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
							if(lIsMainIsThai){
								Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
								if(!lMapMainThaiId.Result){
									lMainThaiId=''
								}else{
									lMainThaiId=lMapMainThaiId.MainThaiId
								}
								lreturn.MainThaiId=lMainThaiId
								if(lMainThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapMainPassport=this.inputMainPassport(lMainPassport)
								if(!lMapMainPassport.Result){
									lMainPassport=''
								}else{
									lMainPassport=lMapMainPassport.MainPassport
								}
								lreturn.MainPassport=lMainPassport
								if(lMainPassport.length()<=0){
									return lreturn
								}
								Map lMapMainCountry=this.inputMainCountry(lMainCountry)
								if(!lMapMainCountry.Result){
									lMainCountry=''
								}else{
									lMainCountry=lMapMainCountry.MainCountry
								}
								lreturn.MainCountry=lMainCountry
								if(lMainCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapMainName=this.inputMainName(lMainName)
							if(!lMapMainName.Result){
								lMainName=''
							}else{
								lMainName=lMapMainName.MainName
							}
							lreturn.MainName=lMainName
							if(lMainName.length()<=0){
								return lreturn
							}
							Map lMapMainSurname=this.inputMainSurname(lMainSurname)
							if(!lMapMainSurname.Result){
								lMainSurname=''
							}else{
								lMainSurname=lMapMainSurname.MainSurname
							}
							lreturn.MainSurname=lMainSurname
							if(lMainSurname.length()<=0){
								return lreturn
							}
							Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
							if(!lMapMainOccupation.Result){
								lMainOccupation=''
							}else{
								lMainOccupation=lMapMainOccupation.MainOccupation
							}
							lreturn.MainOccupation=lMainOccupation
							if(lMainOccupation.length()<=0){
								return lreturn
							}
						}else{
							//Holder=Person||Fill//Owner
							Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
							if(!lMapHolderStatus.Result){
								lHolderStatus=''
							}else{
								lHolderStatus=lMapHolderStatus.HolderStatus
							}
							lreturn.HolderStatus=lHolderStatus
							if(lHolderStatus.length()<=0){
								return lreturn
							}
							Map lMapHolderDob=this.inputHolderDob(lHolderDob)
							if(!lMapHolderDob.Result){
								lHolderDob=''
							}else{
								lHolderDob=lMapHolderDob.HolderDob
							}
							lreturn.HolderDob=lHolderDob
							if(lHolderDob.length()<=0){
								return lreturn
							}
							Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
							if(!lMapHolderIsThai.Result){
								lHolderIsThai=''
							}else{
								lHolderIsThai=lMapHolderIsThai.HolderIsThai
							}
							lreturn.HolderIsThai=lHolderIsThai
							if(lHolderIsThai.length()<=0){
								return lreturn
							}
							Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
							if(lIsHolderIsThai){
								Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
								if(!lMapHolderThaiId.Result){
									lHolderThaiId=''
								}else{
									lHolderThaiId=lMapHolderThaiId.HolderThaiId
								}
								lreturn.HolderThaiId=lHolderThaiId
								if(lHolderThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
								if(!lMapHolderPassport.Result){
									lHolderPassport=''
								}else{
									lHolderPassport=lMapHolderPassport.HolderPassport
								}
								lreturn.HolderPassport=lHolderPassport
								if(lHolderPassport.length()<=0){
									return lreturn
								}
								Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
								if(!lMapHolderCountry.Result){
									lHolderCountry=''
								}else{
									lHolderCountry=lMapHolderCountry.HolderCountry
								}
								lreturn.HolderCountry=lHolderCountry
								if(lHolderCountry.length()<=0){
									return lreturn
								}
							}
							Map lMapHolderName=this.inputHolderName(lHolderName)
							if(!lMapHolderName.Result){
								lHolderName=''
							}else{
								lHolderName=lMapHolderName.HolderName
							}
							lreturn.HolderName=lHolderName
							if(lHolderName.length()<=0){
								return lreturn
							}
							Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
							if(!lMapHolderSurname.Result){
								lHolderSurname=''
							}else{
								lHolderSurname=lMapHolderSurname.HolderSurname
							}
							lreturn.HolderSurname=lHolderSurname
							if(lHolderSurname.length()<=0){
								return lreturn
							}
							Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
							if(!lMapHolderOccupation.Result){
								lHolderOccupation=''
							}else{
								lHolderOccupation=lMapHolderOccupation.HolderOccupation
							}
							lreturn.HolderOccupation=lHolderOccupation
							if(lHolderOccupation.length()<=0){
								return lreturn
							}
						}
					}else{
						//Holder=Person||Fill//Owner+Main
						Map lMapHolderStatus=this.inputHolderStatus(lHolderStatus)
						if(!lMapHolderStatus.Result){
							lHolderStatus=''
						}else{
							lHolderStatus=lMapHolderStatus.HolderStatus
						}
						lreturn.HolderStatus=lHolderStatus
						if(lHolderStatus.length()<=0){
							return lreturn
						}
						Map lMapHolderDob=this.inputHolderDob(lHolderDob)
						if(!lMapHolderDob.Result){
							lHolderDob=''
						}else{
							lHolderDob=lMapHolderDob.HolderDob
						}
						lreturn.HolderDob=lHolderDob
						if(lHolderDob.length()<=0){
							return lreturn
						}
						Map lMapHolderIsThai=this.inputHolderIsThai(lHolderIsThai)
						if(!lMapHolderIsThai.Result){
							lHolderIsThai=''
						}else{
							lHolderIsThai=lMapHolderIsThai.HolderIsThai
						}
						lreturn.HolderIsThai=lHolderIsThai
						if(lHolderIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
						if(lIsHolderIsThai){
							Map lMapHolderThaiId=this.inputHolderThaiId(lHolderThaiId)
							if(!lMapHolderThaiId.Result){
								lHolderThaiId=''
							}else{
								lHolderThaiId=lMapHolderThaiId.HolderThaiId
							}
							lreturn.HolderThaiId=lHolderThaiId
							if(lHolderThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapHolderPassport=this.inputHolderPassport(lHolderPassport)
							if(!lMapHolderPassport.Result){
								lHolderPassport=''
							}else{
								lHolderPassport=lMapHolderPassport.HolderPassport
							}
							lreturn.HolderPassport=lHolderPassport
							if(lHolderPassport.length()<=0){
								return lreturn
							}
							Map lMapHolderCountry=this.inputHolderCountry(lHolderCountry)
							if(!lMapHolderCountry.Result){
								lHolderCountry=''
							}else{
								lHolderCountry=lMapHolderCountry.HolderCountry
							}
							lreturn.HolderCountry=lHolderCountry
							if(lHolderCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapHolderName=this.inputHolderName(lHolderName)
						if(!lMapHolderName.Result){
							lHolderName=''
						}else{
							lHolderName=lMapHolderName.HolderName
						}
						lreturn.HolderName=lHolderName
						if(lHolderName.length()<=0){
							return lreturn
						}
						Map lMapHolderSurname=this.inputHolderSurname(lHolderSurname)
						if(!lMapHolderSurname.Result){
							lHolderSurname=''
						}else{
							lHolderSurname=lMapHolderSurname.HolderSurname
						}
						lreturn.HolderSurname=lHolderSurname
						if(lHolderSurname.length()<=0){
							return lreturn
						}
						Map lMapHolderOccupation=this.inputHolderOccupation(lHolderOccupation)
						if(!lMapHolderOccupation.Result){
							lHolderOccupation=''
						}else{
							lHolderOccupation=lMapHolderOccupation.HolderOccupation
						}
						lreturn.HolderOccupation=lHolderOccupation
						if(lHolderOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainStatus=this.inputMainStatus(lMainStatus)
						if(!lMapMainStatus.Result){
							lMainStatus=''
						}else{
							lMainStatus=lMapMainStatus.MainStatus
						}
						lreturn.MainStatus=lMainStatus
						if(lMainStatus.length()<=0){
							return lreturn
						}
						Map lMapMainDob=this.inputMainDob(lMainDob)
						if(!lMapMainDob.Result){
							lMainDob=''
						}else{
							lMainDob=lMapMainDob.MainDob
						}
						lreturn.MainDob=lMainDob
						if(lMainDob.length()<=0){
							return lreturn
						}
						Map lMapMainIsThai=this.inputMainIsThai(lMainIsThai)
						if(!lMapMainIsThai.Result){
							lMainIsThai=''
						}else{
							lMainIsThai=lMapMainIsThai.MainIsThai
						}
						lreturn.MainIsThai=lMainIsThai
						if(lMainIsThai.length()<=0){
							return lreturn
						}
						Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
						if(lIsMainIsThai){
							Map lMapMainThaiId=this.inputMainThaiId(lMainThaiId)
							if(!lMapMainThaiId.Result){
								lMainThaiId=''
							}else{
								lMainThaiId=lMapMainThaiId.MainThaiId
							}
							lreturn.MainThaiId=lMainThaiId
							if(lMainThaiId.length()<=0){
								return lreturn
							}
						}else{
							Map lMapMainPassport=this.inputMainPassport(lMainPassport)
							if(!lMapMainPassport.Result){
								lMainPassport=''
							}else{
								lMainPassport=lMapMainPassport.MainPassport
							}
							lreturn.MainPassport=lMainPassport
							if(lMainPassport.length()<=0){
								return lreturn
							}
							Map lMapMainCountry=this.inputMainCountry(lMainCountry)
							if(!lMapMainCountry.Result){
								lMainCountry=''
							}else{
								lMainCountry=lMapMainCountry.MainCountry
							}
							lreturn.MainCountry=lMainCountry
							if(lMainCountry.length()<=0){
								return lreturn
							}
						}
						Map lMapMainName=this.inputMainName(lMainName)
						if(!lMapMainName.Result){
							lMainName=''
						}else{
							lMainName=lMapMainName.MainName
						}
						lreturn.MainName=lMainName
						if(lMainName.length()<=0){
							return lreturn
						}
						Map lMapMainSurname=this.inputMainSurname(lMainSurname)
						if(!lMapMainSurname.Result){
							lMainSurname=''
						}else{
							lMainSurname=lMapMainSurname.MainSurname
						}
						lreturn.MainSurname=lMainSurname
						if(lMainSurname.length()<=0){
							return lreturn
						}
						Map lMapMainOccupation=this.inputMainOccupation(lMainOccupation)
						if(!lMapMainOccupation.Result){
							lMainOccupation=''
						}else{
							lMainOccupation=lMapMainOccupation.MainOccupation
						}
						lreturn.MainOccupation=lMainOccupation
						if(lMainOccupation.length()<=0){
							return lreturn
						}
						Map lMapMainEmail=this.inputMainEmail(lMainEmail)
						if(!lMapMainEmail.Result){
							lMainEmail=''
						}else{
							lMainEmail=lMapMainEmail.MainEmail
						}
						lreturn.MainEmail=lMainEmail
						if(lMainEmail.length()<=0){
							return lreturn
						}
						Map lMapMainPhoneNo=this.inputMainPhoneNo(lMainPhoneNo)
						if(!lMapMainPhoneNo.Result){
							lMainPhoneNo=''
						}else{
							lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
						}
						lreturn.MainPhoneNo=lMainPhoneNo
						if(lMainPhoneNo.length()<=0){
							return lreturn
						}
					}
				}
				Map lMapAdditionDrivers=this.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
				lreturn.AdditionDrivers=lAdditionDrivers
				if(lAdditionDrivers.length()<=0){
					return lreturn
				}
				Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
				if(lNumAdditionDrivers>0){
					String lTagAddDriverButtonYes='add-driver-Yes'
					String lTagAddDriverButtonNo='add-driver-No'
					switch(lNumAdditionDrivers){
						case 1:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						case 2:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonNo))
							break
						default:
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver1Status=this.inputDriver1Status(lDriver1Status)
							if(!lMapDriver1Status.Result){
								lDriver1Status=''
							}else{
								lDriver1Status=lMapDriver1Status.Driver1Status
							}
							lreturn.Driver1Status=lDriver1Status
							if(lDriver1Status.length()<=0){
								return lreturn
							}
							Map lMapDriver1Dob=this.inputDriver1Dob(lDriver1Dob)
							if(!lMapDriver1Dob.Result){
								lDriver1Dob=''
							}else{
								lDriver1Dob=lMapDriver1Dob.Driver1Dob
							}
							lreturn.Driver1Dob=lDriver1Dob
							if(lDriver1Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver1IsThai=this.inputDriver1IsThai(lDriver1IsThai)
							if(!lMapDriver1IsThai.Result){
								lDriver1IsThai=''
							}else{
								lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
							}
							lreturn.Driver1IsThai=lDriver1IsThai
							if(lDriver1IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
							if(lIsDriver1IsThai){
								Map lMapDriver1ThaiId=this.inputDriver1ThaiId(lDriver1ThaiId)
								if(!lMapDriver1ThaiId.Result){
									lDriver1ThaiId=''
								}else{
									lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
								}
								lreturn.Driver1ThaiId=lDriver1ThaiId
								if(lDriver1ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver1Passport=this.inputDriver1Passport(lDriver1Passport)
								if(!lMapDriver1Passport.Result){
									lDriver1Passport=''
								}else{
									lDriver1Passport=lMapDriver1Passport.Driver1Passport
								}
								lreturn.Driver1Passport=lDriver1Passport
								if(lDriver1Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver1Country=this.inputDriver1Country(lDriver1Country)
								if(!lMapDriver1Country.Result){
									lDriver1Country=''
								}else{
									lDriver1Country=lMapDriver1Country.Driver1Country
								}
								lreturn.Driver1Country=lDriver1Country
								if(lDriver1Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver1Name=this.inputDriver1Name(lDriver1Name)
							if(!lMapDriver1Name.Result){
								lDriver1Name=''
							}else{
								lDriver1Name=lMapDriver1Name.Driver1Name
							}
							lreturn.Driver1Name=lDriver1Name
							if(lDriver1Name.length()<=0){
								return lreturn
							}
							Map lMapDriver1Surname=this.inputDriver1Surname(lDriver1Surname)
							if(!lMapDriver1Surname.Result){
								lDriver1Surname=''
							}else{
								lDriver1Surname=lMapDriver1Surname.Driver1Surname
							}
							lreturn.Driver1Surname=lDriver1Surname
							if(lDriver1Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver1YearDriving=this.inputDriver1YearDriving(lDriver1YearDriving)
							if(!lMapDriver1YearDriving.Result){
								lDriver1YearDriving=''
							}else{
								lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
							}
							lreturn.Driver1YearDriving=lDriver1YearDriving
							if(lDriver1YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver1ClaimsNo=this.inputDriver1ClaimsNo(lDriver1ClaimsNo)
							if(!lMapDriver1ClaimsNo.Result){
								lDriver1ClaimsNo=''
							}else{
								lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
							}
							lreturn.Driver1ClaimsNo=lDriver1ClaimsNo
							if(lDriver1ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver1Occupation=this.inputDriver1Occupation(lDriver1Occupation)
							if(!lMapDriver1Occupation.Result){
								lDriver1Occupation=''
							}else{
								lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
							}
							lreturn.Driver1Occupation=lDriver1Occupation
							if(lDriver1Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver2Status=this.inputDriver2Status(lDriver2Status)
							if(!lMapDriver2Status.Result){
								lDriver2Status=''
							}else{
								lDriver2Status=lMapDriver2Status.Driver2Status
							}
							lreturn.Driver2Status=lDriver2Status
							if(lDriver2Status.length()<=0){
								return lreturn
							}
							Map lMapDriver2Dob=this.inputDriver2Dob(lDriver2Dob)
							if(!lMapDriver2Dob.Result){
								lDriver2Dob=''
							}else{
								lDriver2Dob=lMapDriver2Dob.Driver2Dob
							}
							lreturn.Driver2Dob=lDriver2Dob
							if(lDriver2Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver2IsThai=this.inputDriver2IsThai(lDriver2IsThai)
							if(!lMapDriver2IsThai.Result){
								lDriver2IsThai=''
							}else{
								lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
							}
							lreturn.Driver2IsThai=lDriver2IsThai
							if(lDriver2IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
							if(lIsDriver2IsThai){
								Map lMapDriver2ThaiId=this.inputDriver2ThaiId(lDriver2ThaiId)
								if(!lMapDriver2ThaiId.Result){
									lDriver2ThaiId=''
								}else{
									lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
								}
								lreturn.Driver2ThaiId=lDriver2ThaiId
								if(lDriver2ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver2Passport=this.inputDriver2Passport(lDriver2Passport)
								if(!lMapDriver2Passport.Result){
									lDriver2Passport=''
								}else{
									lDriver2Passport=lMapDriver2Passport.Driver2Passport
								}
								lreturn.Driver2Passport=lDriver2Passport
								if(lDriver2Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver2Country=this.inputDriver2Country(lDriver2Country)
								if(!lMapDriver2Country.Result){
									lDriver2Country=''
								}else{
									lDriver2Country=lMapDriver2Country.Driver2Country
								}
								lreturn.Driver2Country=lDriver2Country
								if(lDriver2Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver2Name=this.inputDriver2Name(lDriver2Name)
							if(!lMapDriver2Name.Result){
								lDriver2Name=''
							}else{
								lDriver2Name=lMapDriver2Name.Driver2Name
							}
							lreturn.Driver2Name=lDriver2Name
							if(lDriver2Name.length()<=0){
								return lreturn
							}
							Map lMapDriver2Surname=this.inputDriver2Surname(lDriver2Surname)
							if(!lMapDriver2Surname.Result){
								lDriver2Surname=''
							}else{
								lDriver2Surname=lMapDriver2Surname.Driver2Surname
							}
							lreturn.Driver2Surname=lDriver2Surname
							if(lDriver2Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver2YearDriving=this.inputDriver2YearDriving(lDriver2YearDriving)
							if(!lMapDriver2YearDriving.Result){
								lDriver2YearDriving=''
							}else{
								lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
							}
							lreturn.Driver2YearDriving=lDriver2YearDriving
							if(lDriver2YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver2ClaimsNo=this.inputDriver2ClaimsNo(lDriver2ClaimsNo)
							if(!lMapDriver2ClaimsNo.Result){
								lDriver2ClaimsNo=''
							}else{
								lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
							}
							lreturn.Driver2ClaimsNo=lDriver2ClaimsNo
							if(lDriver2ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver2Occupation=this.inputDriver2Occupation(lDriver2Occupation)
							if(!lMapDriver2Occupation.Result){
								lDriver2Occupation=''
							}else{
								lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
							}
							lreturn.Driver2Occupation=lDriver2Occupation
							if(lDriver2Occupation.length()<=0){
								return lreturn
							}
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagAddDriverButtonYes))
							Map lMapDriver3Status=this.inputDriver3Status(lDriver3Status)
							if(!lMapDriver3Status.Result){
								lDriver3Status=''
							}else{
								lDriver3Status=lMapDriver3Status.Driver3Status
							}
							lreturn.Driver3Status=lDriver3Status
							if(lDriver3Status.length()<=0){
								return lreturn
							}
							Map lMapDriver3Dob=this.inputDriver3Dob(lDriver3Dob)
							if(!lMapDriver3Dob.Result){
								lDriver3Dob=''
							}else{
								lDriver3Dob=lMapDriver3Dob.Driver3Dob
							}
							lreturn.Driver3Dob=lDriver3Dob
							if(lDriver3Dob.length()<=0){
								return lreturn
							}
							Map lMapDriver3IsThai=this.inputDriver3IsThai(lDriver3IsThai)
							if(!lMapDriver3IsThai.Result){
								lDriver3IsThai=''
							}else{
								lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
							}
							lreturn.Driver3IsThai=lDriver3IsThai
							if(lDriver3IsThai.length()<=0){
								return lreturn
							}
							Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
							if(lIsDriver3IsThai){
								Map lMapDriver3ThaiId=this.inputDriver3ThaiId(lDriver3ThaiId)
								if(!lMapDriver3ThaiId.Result){
									lDriver3ThaiId=''
								}else{
									lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
								}
								lreturn.Driver3ThaiId=lDriver3ThaiId
								if(lDriver3ThaiId.length()<=0){
									return lreturn
								}
							}else{
								Map lMapDriver3Passport=this.inputDriver3Passport(lDriver3Passport)
								if(!lMapDriver3Passport.Result){
									lDriver3Passport=''
								}else{
									lDriver3Passport=lMapDriver3Passport.Driver3Passport
								}
								lreturn.Driver3Passport=lDriver3Passport
								if(lDriver3Passport.length()<=0){
									return lreturn
								}
								Map lMapDriver3Country=this.inputDriver3Country(lDriver3Country)
								if(!lMapDriver3Country.Result){
									lDriver3Country=''
								}else{
									lDriver3Country=lMapDriver3Country.Driver3Country
								}
								lreturn.Driver3Country=lDriver3Country
								if(lDriver3Country.length()<=0){
									return lreturn
								}
							}
							Map lMapDriver3Name=this.inputDriver3Name(lDriver3Name)
							if(!lMapDriver3Name.Result){
								lDriver3Name=''
							}else{
								lDriver3Name=lMapDriver3Name.Driver3Name
							}
							lreturn.Driver3Name=lDriver3Name
							if(lDriver3Name.length()<=0){
								return lreturn
							}
							Map lMapDriver3Surname=this.inputDriver3Surname(lDriver3Surname)
							if(!lMapDriver3Surname.Result){
								lDriver3Surname=''
							}else{
								lDriver3Surname=lMapDriver3Surname.Driver3Surname
							}
							lreturn.Driver3Surname=lDriver3Surname
							if(lDriver3Surname.length()<=0){
								return lreturn
							}
							Map lMapDriver3YearDriving=this.inputDriver3YearDriving(lDriver3YearDriving)
							if(!lMapDriver3YearDriving.Result){
								lDriver3YearDriving=''
							}else{
								lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
							}
							lreturn.Driver3YearDriving=lDriver3YearDriving
							if(lDriver3YearDriving.length()<=0){
								return lreturn
							}
							Map lMapDriver3ClaimsNo=this.inputDriver3ClaimsNo(lDriver3ClaimsNo)
							if(!lMapDriver3ClaimsNo.Result){
								lDriver3ClaimsNo=''
							}else{
								lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
							}
							lreturn.Driver3ClaimsNo=lDriver3ClaimsNo
							if(lDriver3ClaimsNo.length()<=0){
								return lreturn
							}
							Map lMapDriver3Occupation=this.inputDriver3Occupation(lDriver3Occupation)
							if(!lMapDriver3Occupation.Result){
								lDriver3Occupation=''
							}else{
								lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
							}
							lreturn.Driver3Occupation=lDriver3Occupation
							if(lDriver3Occupation.length()<=0){
								return lreturn
							}
							break
					}
				}
				Map lMapPolicyStartDate=this.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lreturn.PolicyStartDate=lPolicyStartDate
				lreturn.PolicyStartDayOffset=lPolicyStartDayOffset
				if(lPolicyStartDayOffset.length()<=0){
					return lreturn
				}
				Map lMapDriversHaveLicense=this.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
				lreturn.DriversHaveLicense=lDriversHaveLicense
				if(lDriversHaveLicense.length()<=0){
					return lreturn
				}
				Map lMapPolicyInsurer=this.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lreturn.PolicyInsurer=lPolicyInsurer
				if(!lMapPolicyInsurer.Result){
					return lreturn
				}
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_OTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
				lreturn.ActualResult=lActualResult
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
			lPositiveCase=THARGPAMotorQuotationDetail1Type.DEFAULT_POSITIVE_CASE
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
	public Map inputActualResult(Boolean isPositiveCase,String strHolderPhoneNo,Boolean isSkipOTP){
		Map lreturn=[:]
		String lActualResult=''
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			if(lHolderPhoneNo.length()<=0){
				return lreturn
			}
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapActualResult=this.lTHAMotorBikeQuotationDetail1Util.inputActualResult(isPositiveCase,lHolderPhoneNo,isSkipOTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
			}else{
				Map lMapActualResult=this.lTHAMotorCarQuotationDetail1Util.inputActualResult(isPositiveCase,lHolderPhoneNo,isSkipOTP)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
				}
			}
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
	public Map inputLanguage(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THARGPAMotorQuotationDetail1Type.DEFAULT_LANGUAGE
		}
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapLanguage=this.lTHAMotorBikeQuotationDetail1Util.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
			}else{
				Map lMapLanguage=this.lTHAMotorCarQuotationDetail1Util.inputLanguage(lLanguage)
				if(!lMapLanguage.Result){
					lLanguage=''
				}else{
					lLanguage=lMapLanguage.Language
				}
			}
			lResult=lLanguage.length()>0
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
	public Map inputSubmitCallMeBack(String strSubmitCallMeBack,String strCallMeBackEmail,String strCallMeBackMobile){
		Map lreturn=[:]
		String lSubmitCallMeBack=strSubmitCallMeBack.trim()
		if(lSubmitCallMeBack.length()<=0){
			lSubmitCallMeBack=THARGPAMotorQuotationDetail1Type.DEFAULT_SUBMIT_CALL_ME_BACK
		}
		String lCallMeBackEmail=strCallMeBackEmail.trim()
		if(lCallMeBackEmail.length()<=0){
			lCallMeBackEmail=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_BACK_EMAIL
		}
		String lCallMeBackMobile=strCallMeBackMobile.trim()
		if(lCallMeBackMobile.length()<=0){
			lCallMeBackMobile=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_BACK_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapSubmitCallMeBack=this.lTHAMotorBikeQuotationDetail1Util.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
				if(!lMapSubmitCallMeBack.Result){
					lSubmitCallMeBack=''
					lCallMeBackEmail=''
					lCallMeBackMobile=''
				}else{
					lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
					lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
					lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
				}
				lResult=lMapSubmitCallMeBack.Result
			}else{
				Map lMapSubmitCallMeBack=this.lTHAMotorCarQuotationDetail1Util.inputSubmitCallMeBack(lSubmitCallMeBack,lCallMeBackEmail,lCallMeBackMobile)
				if(!lMapSubmitCallMeBack.Result){
					lSubmitCallMeBack=''
					lCallMeBackEmail=''
					lCallMeBackMobile=''
				}else{
					lSubmitCallMeBack=lMapSubmitCallMeBack.SubmitCallMeBack
					lCallMeBackEmail=lMapSubmitCallMeBack.CallMeBackEmail
					lCallMeBackMobile=lMapSubmitCallMeBack.CallMeBackMobile
				}
				lResult=lMapSubmitCallMeBack.Result
			}
			if(lResult){
				lreturn.put('SubmitCallMeBack',lSubmitCallMeBack)
				lreturn.put('CallMeBackMobile',lCallMeBackMobile)
				lreturn.put('CallMeBackEmail',lCallMeBackEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderEmail(String strHolderEmail){
		Map lreturn=[:]
		String lHolderEmail=strHolderEmail.trim()
		if(lHolderEmail.length()<=0){
			lHolderEmail=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderEmail=this.lTHAMotorBikeQuotationDetail1Util.inputHolderEmail(lHolderEmail)
				if(!lMapHolderEmail.Result){
					lHolderEmail=''
				}else{
					lHolderEmail=lMapHolderEmail.HolderEmail
				}
			}else{
				Map lMapHolderEmail=this.lTHAMotorCarQuotationDetail1Util.inputHolderEmail(lHolderEmail)
				if(!lMapHolderEmail.Result){
					lHolderEmail=''
				}else{
					lHolderEmail=lMapHolderEmail.HolderEmail
				}
			}
			lResult=lHolderEmail.length()>0
			if(lResult){
				lreturn.put('HolderEmail',lHolderEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderNewsletter(String strHolderNewsletter){
		Map lreturn=[:]
		String lHolderNewsletter=strHolderNewsletter.trim()
		if(lHolderNewsletter.length()<=0){
			lHolderNewsletter=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderNewsletter=this.lTHAMotorBikeQuotationDetail1Util.inputHolderNewsletter(lHolderNewsletter)
				if(!lMapHolderNewsletter.Result){
					lHolderNewsletter=''
				}else{
					lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
				}
			}else{
				Map lMapHolderNewsletter=this.lTHAMotorCarQuotationDetail1Util.inputHolderNewsletter(lHolderNewsletter)
				if(!lMapHolderNewsletter.Result){
					lHolderNewsletter=''
				}else{
					lHolderNewsletter=lMapHolderNewsletter.HolderNewsletter
				}
			}
			lResult=lHolderNewsletter.length()>0
			if(lResult){
				lreturn.put('HolderNewsletter',lHolderNewsletter)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderPhoneNo(String strHolderPhoneNo){
		Map lreturn=[:]
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		if(lHolderPhoneNo.length()<=0){
			lHolderPhoneNo=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderPhoneNo=this.lTHAMotorBikeQuotationDetail1Util.inputHolderPhoneNo(lHolderPhoneNo)
				if(!lMapHolderPhoneNo.Result){
					lHolderPhoneNo=''
				}else{
					lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
				}
			}else{
				Map lMapHolderPhoneNo=this.lTHAMotorCarQuotationDetail1Util.inputHolderPhoneNo(lHolderPhoneNo)
				if(!lMapHolderPhoneNo.Result){
					lHolderPhoneNo=''
				}else{
					lHolderPhoneNo=lMapHolderPhoneNo.HolderPhoneNo
				}
			}
			lResult=lHolderPhoneNo.length()>0
			if(lResult){
				lreturn.put('HolderPhoneNo',lHolderPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCallMeNowToDo(String strHolderCallMeNowToDo){
		Map lreturn=[:]
		String lHolderCallMeNowToDo=strHolderCallMeNowToDo.trim()
		if(lHolderCallMeNowToDo.length()<=0){
			lHolderCallMeNowToDo=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_NOW
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			if(!THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW){
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapHolderCallMeNowToDo=this.lTHAMotorBikeQuotationDetail1Util.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
					if(!lMapHolderCallMeNowToDo.Result){
						lHolderCallMeNowToDo=''
					}else{
						lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
					}
				}else{
					Map lMapHolderCallMeNowToDo=this.lTHAMotorCarQuotationDetail1Util.inputHolderCallMeNowToDo(lHolderCallMeNowToDo)
					if(!lMapHolderCallMeNowToDo.Result){
						lHolderCallMeNowToDo=''
					}else{
						lHolderCallMeNowToDo=lMapHolderCallMeNowToDo.HolderCallMeNowToDo
					}
				}
			}else{
				lHolderCallMeNowToDo='No Option'
			}
			lResult=lHolderCallMeNowToDo.length()>0
			if(lResult){
				lreturn.put('HolderCallMeNowToDo',lHolderCallMeNowToDo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeNow(String strCallMeNow){
		Map lreturn=[:]
		String lCallMeNow=strCallMeNow.trim()
		if(lCallMeNow.length()<=0){
			lCallMeNow=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_NOW
		}
		try{
			Boolean lResult=false
			lreturn.put('CallMeNow','')
			lreturn.put('Result',lResult)
			if(!THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW){
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapCallMeNow=this.lTHAMotorBikeQuotationDetail1Util.inputCallMeNow(lCallMeNow)
					if(!lMapCallMeNow.Result){
						lCallMeNow=''
					}else{
						lCallMeNow=lMapCallMeNow.CallMeNow
					}
				}else{
					Map lMapCallMeNow=this.lTHAMotorCarQuotationDetail1Util.inputCallMeNow(lCallMeNow)
					if(!lMapCallMeNow.Result){
						lCallMeNow=''
					}else{
						lCallMeNow=lMapCallMeNow.CallMeNow
					}
				}
			}else{
				lCallMeNow='No Option'
			}
			lResult=lCallMeNow.length()>0
			if(lResult){
				lreturn.put('CallMeNow',lCallMeNow)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeBackAtDay(String strCallMeBackAtDay){
		Map lreturn=[:]
		String lCallMeBackAtDay=strCallMeBackAtDay.trim()
		if(lCallMeBackAtDay.length()<=0){
			lCallMeBackAtDay=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY
		}
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('Result',lResult)
			if(!THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW){
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapCallMeBackAtDay=this.lTHAMotorBikeQuotationDetail1Util.inputCallMeBackAtDay(lCallMeBackAtDay)
					if(!lMapCallMeBackAtDay.Result){
						lCallMeBackAtDay=''
					}else{
						lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
					}
				}else{
					Map lMapCallMeBackAtDay=this.lTHAMotorCarQuotationDetail1Util.inputCallMeBackAtDay(lCallMeBackAtDay)
					if(!lMapCallMeBackAtDay.Result){
						lCallMeBackAtDay=''
					}else{
						lCallMeBackAtDay=lMapCallMeBackAtDay.CallMeBackAtDay
					}
				}
			}else{
				lCallMeBackAtDay='No Option'
			}
			lResult=lCallMeBackAtDay.length()>0
			if(lResult){
				lreturn.put('CallMeBackAtDay',lCallMeBackAtDay)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeBackAtTime(String strCallMeBackAtTime){
		Map lreturn=[:]
		String lCallMeBackAtTime=strCallMeBackAtTime.trim()
		if(lCallMeBackAtTime.length()<=0){
			lCallMeBackAtTime=THARGPAMotorQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME
		}
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('Result',lResult)
			if(!THARGPAMotorCoreType.CURRENT_POLICY_DETAIL_1_SKIP_CALL_ME_NOW){
				if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
					Map lMapCallMeBackAtTime=this.lTHAMotorBikeQuotationDetail1Util.inputCallMeBackAtTime(lCallMeBackAtTime)
					if(!lMapCallMeBackAtTime.Result){
						lCallMeBackAtTime=''
					}else{
						lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
					}
				}else{
					Map lMapCallMeBackAtTime=this.lTHAMotorCarQuotationDetail1Util.inputCallMeBackAtTime(lCallMeBackAtTime)
					if(!lMapCallMeBackAtTime.Result){
						lCallMeBackAtTime=''
					}else{
						lCallMeBackAtTime=lMapCallMeBackAtTime.CallMeBackAtTime
					}
				}
			}else{
				lCallMeBackAtTime='No Option'
			}
			lResult=lCallMeBackAtTime.length()>0
			if(lResult){
				lreturn.put('CallMeBackAtTime',lCallMeBackAtTime)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsPerson(String strHolderIsPerson){
		Map lreturn=[:]
		String lHolderIsPerson=strHolderIsPerson.trim()
		if(lHolderIsPerson.length()<=0){
			lHolderIsPerson=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_IS_PERSON
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsPerson','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderIsPerson=this.lTHAMotorBikeQuotationDetail1Util.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
			}else{
				Map lMapHolderIsPerson=this.lTHAMotorCarQuotationDetail1Util.inputHolderIsPerson(lHolderIsPerson)
				if(!lMapHolderIsPerson.Result){
					lHolderIsPerson=''
				}else{
					lHolderIsPerson=lMapHolderIsPerson.HolderIsPerson
				}
			}
			lResult=lHolderIsPerson.length()>0
			if(lResult){
				lreturn.put('HolderIsPerson',lHolderIsPerson)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsMain(String strHolderIsMain){
		Map lreturn=[:]
		String lHolderIsMain=strHolderIsMain.trim()
		if(lHolderIsMain.length()<=0){
			lHolderIsMain=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_IS_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsMain','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderIsMain=this.lTHAMotorBikeQuotationDetail1Util.inputHolderIsMain(lHolderIsMain)
				if(!lMapHolderIsMain.Result){
					lHolderIsMain=''
				}else{
					lHolderIsMain=lMapHolderIsMain.HolderIsMain
				}
			}else{
				Map lMapHolderIsMain=this.lTHAMotorCarQuotationDetail1Util.inputHolderIsMain(lHolderIsMain)
				if(!lMapHolderIsMain.Result){
					lHolderIsMain=''
				}else{
					lHolderIsMain=lMapHolderIsMain.HolderIsMain
				}
			}
			lResult=lHolderIsMain.length()>0
			if(lResult){
				lreturn.put('HolderIsMain',lHolderIsMain)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarForCommercial(String strCarForCommercial){
		Map lreturn=[:]
		String lCarForCommercial=strCarForCommercial.trim()
		if(lCarForCommercial.length()<=0){
			lCarForCommercial=THARGPAMotorQuotationDetail1Type.DEFAULT_CAR_FOR_COMMERCIAL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarForCommercial','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarForCommercial=this.lTHAMotorBikeQuotationDetail1Util.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
			}else{
				Map lMapCarForCommercial=this.lTHAMotorCarQuotationDetail1Util.inputCarForCommercial(lCarForCommercial)
				if(!lMapCarForCommercial.Result){
					lCarForCommercial=''
				}else{
					lCarForCommercial=lMapCarForCommercial.CarForCommercial
				}
			}
			lResult=lCarForCommercial.length()>0
			if(lResult){
				lreturn.put('CarForCommercial',lCarForCommercial)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarPlateNumber(String strCarPlateNumber){
		Map lreturn=[:]
		String lCarPlateNumber=strCarPlateNumber.trim()
		if(lCarPlateNumber.length()<=0){
			lCarPlateNumber=THARGPAMotorQuotationDetail1Type.DEFAULT_CAR_PLATE_NUMBER
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateNumber','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarPlateNumber=this.lTHAMotorBikeQuotationDetail1Util.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
			}else{
				Map lMapCarPlateNumber=this.lTHAMotorCarQuotationDetail1Util.inputCarPlateNumber(lCarPlateNumber)
				if(!lMapCarPlateNumber.Result){
					lCarPlateNumber=''
				}else{
					lCarPlateNumber=lMapCarPlateNumber.CarPlateNumber
				}
			}
			lResult=lCarPlateNumber.length()>0
			if(lResult){
				lreturn.put('CarPlateNumber',lCarPlateNumber)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarPlateProvince(String strCarPlateProvince){
		Map lreturn=[:]
		String lCarPlateProvince=strCarPlateProvince.trim()
		if(lCarPlateProvince.length()<=0){
			lCarPlateProvince=THARGPAMotorQuotationDetail1Type.DEFAULT_CAR_PLATE_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateProvince','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapCarPlateProvince=this.lTHAMotorBikeQuotationDetail1Util.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
			}else{
				Map lMapCarPlateProvince=this.lTHAMotorCarQuotationDetail1Util.inputCarPlateProvince(lCarPlateProvince)
				if(!lMapCarPlateProvince.Result){
					lCarPlateProvince=''
				}else{
					lCarPlateProvince=lMapCarPlateProvince.CarPlateProvince
				}
			}
			lResult=lCarPlateProvince.length()>0
			if(lResult){
				lreturn.put('CarPlateProvince',lCarPlateProvince)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderStatus(String strHolderStatus){
		Map lreturn=[:]
		String lHolderStatus=strHolderStatus.trim()
		if(lHolderStatus.length()<=0){
			lHolderStatus=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderStatus','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderStatus=this.lTHAMotorBikeQuotationDetail1Util.inputHolderStatus(lHolderStatus)
				if(!lMapHolderStatus.Result){
					lHolderStatus=''
				}else{
					lHolderStatus=lMapHolderStatus.HolderStatus
				}
			}else{
				Map lMapHolderStatus=this.lTHAMotorCarQuotationDetail1Util.inputHolderStatus(lHolderStatus)
				if(!lMapHolderStatus.Result){
					lHolderStatus=''
				}else{
					lHolderStatus=lMapHolderStatus.HolderStatus
				}
			}
			lResult=lHolderStatus.length()>0
			if(lResult){
				lreturn.put('HolderStatus',lHolderStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderDob(String strHolderDob){
		Map lreturn=[:]
		String lHolderDob=strHolderDob.trim()
		if(lHolderDob.length()<=0){
			lHolderDob=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderDob=this.lTHAMotorBikeQuotationDetail1Util.inputHolderDob(lHolderDob)
				if(!lMapHolderDob.Result){
					lHolderDob=''
				}else{
					lHolderDob=lMapHolderDob.HolderDob
				}
			}else{
				Map lMapHolderDob=this.lTHAMotorCarQuotationDetail1Util.inputHolderDob(lHolderDob)
				if(!lMapHolderDob.Result){
					lHolderDob=''
				}else{
					lHolderDob=lMapHolderDob.HolderDob
				}
			}
			lResult=lHolderDob.length()>0
			if(lResult){
				lreturn.put('HolderDob',lHolderDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsThai(String strHolderIsThai){
		Map lreturn=[:]
		String lHolderIsThai=strHolderIsThai.trim()
		if(lHolderIsThai.length()<=0){
			lHolderIsThai=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsThai','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderIsThai=this.lTHAMotorBikeQuotationDetail1Util.inputHolderIsThai(lHolderIsThai)
				if(!lMapHolderIsThai.Result){
					lHolderIsThai=''
				}else{
					lHolderIsThai=lMapHolderIsThai.HolderIsThai
				}
			}else{
				Map lMapHolderIsThai=this.lTHAMotorCarQuotationDetail1Util.inputHolderIsThai(lHolderIsThai)
				if(!lMapHolderIsThai.Result){
					lHolderIsThai=''
				}else{
					lHolderIsThai=lMapHolderIsThai.HolderIsThai
				}
			}
			lResult=lHolderIsThai.length()>0
			if(lResult){
				lreturn.put('HolderIsThai',lHolderIsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderThaiId(String strHolderThaiId){
		Map lreturn=[:]
		String lHolderThaiId=strHolderThaiId.trim()
		if(lHolderThaiId.length()<=0){
			lHolderThaiId=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderThaiId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderThaiId=this.lTHAMotorBikeQuotationDetail1Util.inputHolderThaiId(lHolderThaiId)
				if(!lMapHolderThaiId.Result){
					lHolderThaiId=''
				}else{
					lHolderThaiId=lMapHolderThaiId.HolderThaiId
				}
			}else{
				Map lMapHolderThaiId=this.lTHAMotorCarQuotationDetail1Util.inputHolderThaiId(lHolderThaiId)
				if(!lMapHolderThaiId.Result){
					lHolderThaiId=''
				}else{
					lHolderThaiId=lMapHolderThaiId.HolderThaiId
				}
			}
			lResult=lHolderThaiId.length()>0
			if(lResult){
				lreturn.put('HolderThaiId',lHolderThaiId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderOccupation(String strHolderOccupation){
		Map lreturn=[:]
		String lHolderOccupation=strHolderOccupation.trim()
		if(lHolderOccupation.length()<=0){
			lHolderOccupation=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderOccupation','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderOccupation=this.lTHAMotorBikeQuotationDetail1Util.inputHolderOccupation(lHolderOccupation)
				if(!lMapHolderOccupation.Result){
					lHolderOccupation=''
				}else{
					lHolderOccupation=lMapHolderOccupation.HolderOccupation
				}
			}else{
				Map lMapHolderOccupation=this.lTHAMotorCarQuotationDetail1Util.inputHolderOccupation(lHolderOccupation)
				if(!lMapHolderOccupation.Result){
					lHolderOccupation=''
				}else{
					lHolderOccupation=lMapHolderOccupation.HolderOccupation
				}
			}
			lResult=lHolderOccupation.length()>0
			if(lResult){
				lreturn.put('HolderOccupation',lHolderOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderPassport(String strHolderPassport){
		Map lreturn=[:]
		String lHolderPassport=strHolderPassport.trim()
		if(lHolderPassport.length()<=0){
			lHolderPassport=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPassport','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderPassport=this.lTHAMotorBikeQuotationDetail1Util.inputHolderPassport(lHolderPassport)
				if(!lMapHolderPassport.Result){
					lHolderPassport=''
				}else{
					lHolderPassport=lMapHolderPassport.HolderPassport
				}
			}else{
				Map lMapHolderPassport=this.lTHAMotorCarQuotationDetail1Util.inputHolderPassport(lHolderPassport)
				if(!lMapHolderPassport.Result){
					lHolderPassport=''
				}else{
					lHolderPassport=lMapHolderPassport.HolderPassport
				}
			}
			lResult=lHolderPassport.length()>0
			if(lResult){
				lreturn.put('HolderPassport',lHolderPassport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCountry(String strHolderCountry){
		Map lreturn=[:]
		String lHolderCountry=strHolderCountry.trim()
		if(lHolderCountry.length()<=0){
			lHolderCountry=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCountry','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderCountry=this.lTHAMotorBikeQuotationDetail1Util.inputHolderCountry(lHolderCountry)
				if(!lMapHolderCountry.Result){
					lHolderCountry=''
				}else{
					lHolderCountry=lMapHolderCountry.HolderCountry
				}
			}else{
				Map lMapHolderCountry=this.lTHAMotorCarQuotationDetail1Util.inputHolderCountry(lHolderCountry)
				if(!lMapHolderCountry.Result){
					lHolderCountry=''
				}else{
					lHolderCountry=lMapHolderCountry.HolderCountry
				}
			}
			lResult=lHolderCountry.length()>0
			if(lResult){
				lreturn.put('HolderCountry',lHolderCountry)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderName(String strHolderName){
		Map lreturn=[:]
		String lHolderName=strHolderName.trim()
		if(lHolderName.length()<=0){
			lHolderName=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderName','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderName=this.lTHAMotorBikeQuotationDetail1Util.inputHolderName(lHolderName)
				if(!lMapHolderName.Result){
					lHolderName=''
				}else{
					lHolderName=lMapHolderName.HolderName
				}
			}else{
				Map lMapHolderName=this.lTHAMotorCarQuotationDetail1Util.inputHolderName(lHolderName)
				if(!lMapHolderName.Result){
					lHolderName=''
				}else{
					lHolderName=lMapHolderName.HolderName
				}
			}
			lResult=lHolderName.length()>0
			if(lResult){
				lreturn.put('HolderName',lHolderName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderSurname(String strHolderSurname){
		Map lreturn=[:]
		String lHolderSurname=strHolderSurname.trim()
		if(lHolderSurname.length()<=0){
			lHolderSurname=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderSurname','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderSurname=this.lTHAMotorBikeQuotationDetail1Util.inputHolderSurname(lHolderSurname)
				if(!lMapHolderSurname.Result){
					lHolderSurname=''
				}else{
					lHolderSurname=lMapHolderSurname.HolderSurname
				}
			}else{
				Map lMapHolderSurname=this.lTHAMotorCarQuotationDetail1Util.inputHolderSurname(lHolderSurname)
				if(!lMapHolderSurname.Result){
					lHolderSurname=''
				}else{
					lHolderSurname=lMapHolderSurname.HolderSurname
				}
			}
			lResult=lHolderSurname.length()>0
			if(lResult){
				lreturn.put('HolderSurname',lHolderSurname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCompId(String strHolderCompId){
		Map lreturn=[:]
		String lHolderCompId=strHolderCompId.trim()
		if(lHolderCompId.length()<=0){
			lHolderCompId=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_COMP_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderCompId=this.lTHAMotorBikeQuotationDetail1Util.inputHolderCompId(lHolderCompId)
				if(!lMapHolderCompId.Result){
					lHolderCompId=''
				}else{
					lHolderCompId=lMapHolderCompId.HolderCompId
				}
			}else{
				Map lMapHolderCompId=this.lTHAMotorCarQuotationDetail1Util.inputHolderCompId(lHolderCompId)
				if(!lMapHolderCompId.Result){
					lHolderCompId=''
				}else{
					lHolderCompId=lMapHolderCompId.HolderCompId
				}
			}
			lResult=lHolderCompId.length()>0
			if(lResult){
				lreturn.put('HolderCompId',lHolderCompId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCompName(String strHolderCompName){
		Map lreturn=[:]
		String lHolderCompName=strHolderCompName.trim()
		if(lHolderCompName.length()<=0){
			lHolderCompName=THARGPAMotorQuotationDetail1Type.DEFAULT_HOLDER_COMP_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompName','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapHolderCompName=this.lTHAMotorBikeQuotationDetail1Util.inputHolderCompName(lHolderCompName)
				if(!lMapHolderCompName.Result){
					lHolderCompName=''
				}else{
					lHolderCompName=lMapHolderCompName.HolderCompName
				}
			}else{
				Map lMapHolderCompName=this.lTHAMotorCarQuotationDetail1Util.inputHolderCompName(lHolderCompName)
				if(!lMapHolderCompName.Result){
					lHolderCompName=''
				}else{
					lHolderCompName=lMapHolderCompName.HolderCompName
				}
			}
			lResult=lHolderCompName.length()>0
			if(lResult){
				lreturn.put('HolderCompName',lHolderCompName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainStatus(String strMainStatus){
		Map lreturn=[:]
		String lMainStatus=strMainStatus.trim()
		if(lMainStatus.length()<=0){
			lMainStatus=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('MainStatus','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainStatus=this.lTHAMotorBikeQuotationDetail1Util.inputMainStatus(lMainStatus)
				if(!lMapMainStatus.Result){
					lMainStatus=''
				}else{
					lMainStatus=lMapMainStatus.MainStatus
				}
			}else{
				Map lMapMainStatus=this.lTHAMotorCarQuotationDetail1Util.inputMainStatus(lMainStatus)
				if(!lMapMainStatus.Result){
					lMainStatus=''
				}else{
					lMainStatus=lMapMainStatus.MainStatus
				}
			}
			lResult=lMainStatus.length()>0
			if(lResult){
				lreturn.put('MainStatus',lMainStatus)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainDob(String strMainDob){
		Map lreturn=[:]
		String lMainDob=strMainDob.trim()
		if(lMainDob.length()<=0){
			lMainDob=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('MainDob','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainDob=this.lTHAMotorBikeQuotationDetail1Util.inputMainDob(lMainDob)
				if(!lMapMainDob.Result){
					lMainDob=''
				}else{
					lMainDob=lMapMainDob.MainDob
				}
			}else{
				Map lMapMainDob=this.lTHAMotorCarQuotationDetail1Util.inputMainDob(lMainDob)
				if(!lMapMainDob.Result){
					lMainDob=''
				}else{
					lMainDob=lMapMainDob.MainDob
				}
			}
			lResult=lMainDob.length()>0
			if(lResult){
				lreturn.put('MainDob',lMainDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainIsThai(String strMainIsThai){
		Map lreturn=[:]
		String lMainIsThai=strMainIsThai.trim()
		if(lMainIsThai.length()<=0){
			lMainIsThai=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('MainIsThai','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainIsThai=this.lTHAMotorBikeQuotationDetail1Util.inputMainIsThai(lMainIsThai)
				if(!lMapMainIsThai.Result){
					lMainIsThai=''
				}else{
					lMainIsThai=lMapMainIsThai.MainIsThai
				}
			}else{
				Map lMapMainIsThai=this.lTHAMotorCarQuotationDetail1Util.inputMainIsThai(lMainIsThai)
				if(!lMapMainIsThai.Result){
					lMainIsThai=''
				}else{
					lMainIsThai=lMapMainIsThai.MainIsThai
				}
			}
			lResult=lMainIsThai.length()>0
			if(lResult){
				lreturn.put('MainIsThai',lMainIsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainThaiId(String strMainThaiId){
		Map lreturn=[:]
		String lMainThaiId=strMainThaiId.trim()
		if(lMainThaiId.length()<=0){
			lMainThaiId=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('MainThaiId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainThaiId=this.lTHAMotorBikeQuotationDetail1Util.inputMainThaiId(lMainThaiId)
				if(!lMapMainThaiId.Result){
					lMainThaiId=''
				}else{
					lMainThaiId=lMapMainThaiId.MainThaiId
				}
			}else{
				Map lMapMainThaiId=this.lTHAMotorCarQuotationDetail1Util.inputMainThaiId(lMainThaiId)
				if(!lMapMainThaiId.Result){
					lMainThaiId=''
				}else{
					lMainThaiId=lMapMainThaiId.MainThaiId
				}
			}
			lResult=lMainThaiId.length()>0
			if(lResult){
				lreturn.put('MainThaiId',lMainThaiId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainOccupation(String strMainOccupation){
		Map lreturn=[:]
		String lMainOccupation=strMainOccupation.trim()
		if(lMainOccupation.length()<=0){
			lMainOccupation=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('MainOccupation','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainOccupation=this.lTHAMotorBikeQuotationDetail1Util.inputMainOccupation(lMainOccupation)
				if(!lMapMainOccupation.Result){
					lMainOccupation=''
				}else{
					lMainOccupation=lMapMainOccupation.MainOccupation
				}
			}else{
				Map lMapMainOccupation=this.lTHAMotorCarQuotationDetail1Util.inputMainOccupation(lMainOccupation)
				if(!lMapMainOccupation.Result){
					lMainOccupation=''
				}else{
					lMainOccupation=lMapMainOccupation.MainOccupation
				}
			}
			lResult=lMainOccupation.length()>0
			if(lResult){
				lreturn.put('MainOccupation',lMainOccupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainPassport(String strMainPassport){
		Map lreturn=[:]
		String lMainPassport=strMainPassport.trim()
		if(lMainPassport.length()<=0){
			lMainPassport=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPassport','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainPassport=this.lTHAMotorBikeQuotationDetail1Util.inputMainPassport(lMainPassport)
				if(!lMapMainPassport.Result){
					lMainPassport=''
				}else{
					lMainPassport=lMapMainPassport.MainPassport
				}
			}else{
				Map lMapMainPassport=this.lTHAMotorCarQuotationDetail1Util.inputMainPassport(lMainPassport)
				if(!lMapMainPassport.Result){
					lMainPassport=''
				}else{
					lMainPassport=lMapMainPassport.MainPassport
				}
			}
			lResult=lMainPassport.length()>0
			if(lResult){
				lreturn.put('MainPassport',lMainPassport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainCountry(String strMainCountry){
		Map lreturn=[:]
		String lMainCountry=strMainCountry.trim()
		if(lMainCountry.length()<=0){
			lMainCountry=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('MainCountry','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainCountry=this.lTHAMotorBikeQuotationDetail1Util.inputMainCountry(lMainCountry)
				if(!lMapMainCountry.Result){
					lMainCountry=''
				}else{
					lMainCountry=lMapMainCountry.MainCountry
				}
			}else{
				Map lMapMainCountry=this.lTHAMotorCarQuotationDetail1Util.inputMainCountry(lMainCountry)
				if(!lMapMainCountry.Result){
					lMainCountry=''
				}else{
					lMainCountry=lMapMainCountry.MainCountry
				}
			}
			lResult=lMainCountry.length()>0
			if(lResult){
				lreturn.put('MainCountry',lMainCountry)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainName(String strMainName){
		Map lreturn=[:]
		String lMainName=strMainName.trim()
		if(lMainName.length()<=0){
			lMainName=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainName','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainName=this.lTHAMotorBikeQuotationDetail1Util.inputMainName(lMainName)
				if(!lMapMainName.Result){
					lMainName=''
				}else{
					lMainName=lMapMainName.MainName
				}
			}else{
				Map lMapMainName=this.lTHAMotorCarQuotationDetail1Util.inputMainName(lMainName)
				if(!lMapMainName.Result){
					lMainName=''
				}else{
					lMainName=lMapMainName.MainName
				}
			}
			lResult=lMainName.length()>0
			if(lResult){
				lreturn.put('MainName',lMainName)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainSurname(String strMainSurname){
		Map lreturn=[:]
		String lMainSurname=strMainSurname.trim()
		if(lMainSurname.length()<=0){
			lMainSurname=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainSurname','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainSurname=this.lTHAMotorBikeQuotationDetail1Util.inputMainSurname(lMainSurname)
				if(!lMapMainSurname.Result){
					lMainSurname=''
				}else{
					lMainSurname=lMapMainSurname.MainSurname
				}
			}else{
				Map lMapMainSurname=this.lTHAMotorCarQuotationDetail1Util.inputMainSurname(lMainSurname)
				if(!lMapMainSurname.Result){
					lMainSurname=''
				}else{
					lMainSurname=lMapMainSurname.MainSurname
				}
			}
			lResult=lMainSurname.length()>0
			if(lResult){
				lreturn.put('MainSurname',lMainSurname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainEmail(String strMainEmail){
		Map lreturn=[:]
		String lMainEmail=strMainEmail.trim()
		if(lMainEmail.length()<=0){
			lMainEmail=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('MainEmail','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainEmail=this.lTHAMotorBikeQuotationDetail1Util.inputMainEmail(lMainEmail)
				if(!lMapMainEmail.Result){
					lMainEmail=''
				}else{
					lMainEmail=lMapMainEmail.MainEmail
				}
			}else{
				Map lMapMainEmail=this.lTHAMotorCarQuotationDetail1Util.inputMainEmail(lMainEmail)
				if(!lMapMainEmail.Result){
					lMainEmail=''
				}else{
					lMainEmail=lMapMainEmail.MainEmail
				}
			}
			lResult=lMainEmail.length()>0
			if(lResult){
				lreturn.put('MainEmail',lMainEmail)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainPhoneNo(String strMainPhoneNo){
		Map lreturn=[:]
		String lMainPhoneNo=strMainPhoneNo.trim()
		if(lMainPhoneNo.length()<=0){
			lMainPhoneNo=THARGPAMotorQuotationDetail1Type.DEFAULT_MAIN_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPhoneNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapMainPhoneNo=this.lTHAMotorBikeQuotationDetail1Util.inputMainPhoneNo(lMainPhoneNo)
				if(!lMapMainPhoneNo.Result){
					lMainPhoneNo=''
				}else{
					lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
				}
			}else{
				Map lMapMainPhoneNo=this.lTHAMotorCarQuotationDetail1Util.inputMainPhoneNo(lMainPhoneNo)
				if(!lMapMainPhoneNo.Result){
					lMainPhoneNo=''
				}else{
					lMainPhoneNo=lMapMainPhoneNo.MainPhoneNo
				}
			}
			lResult=lMainPhoneNo.length()>0
			if(lResult){
				lreturn.put('MainPhoneNo',lMainPhoneNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionDrivers(String strAdditionDrivers){
		Map lreturn=[:]
		String lAdditionDrivers=strAdditionDrivers.trim()
		if(lAdditionDrivers.length()<=0){
			lAdditionDrivers=THARGPAMotorQuotationDetail1Type.DEFAULT_ADDITION_DRIVERS
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionDrivers','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapAdditionDrivers=this.lTHAMotorBikeQuotationDetail1Util.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
			}else{
				Map lMapAdditionDrivers=this.lTHAMotorCarQuotationDetail1Util.inputAdditionDrivers(lAdditionDrivers)
				if(!lMapAdditionDrivers.Result){
					lAdditionDrivers=''
				}else{
					lAdditionDrivers=lMapAdditionDrivers.AdditionDrivers
				}
			}
			lResult=lAdditionDrivers.length()>0
			if(lResult){
				lreturn.put('AdditionDrivers',lAdditionDrivers)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriversHaveLicense(String strDriversHaveLicense){
		Map lreturn=[:]
		String lDriversHaveLicense=strDriversHaveLicense.trim()
		if(lDriversHaveLicense.length()<=0){
			lDriversHaveLicense=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVERS_HAVE_LICENSE
		}
		try{
			Boolean lResult=false
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriversHaveLicense=this.lTHAMotorBikeQuotationDetail1Util.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
			}else{
				Map lMapDriversHaveLicense=this.lTHAMotorCarQuotationDetail1Util.inputDriversHaveLicense(lDriversHaveLicense)
				if(!lMapDriversHaveLicense.Result){
					lDriversHaveLicense=''
				}else{
					lDriversHaveLicense=lMapDriversHaveLicense.DriversHaveLicense
				}
			}
			lResult=lDriversHaveLicense.length()>0
			if(lResult){
				lreturn.put('DriversHaveLicense',lDriversHaveLicense)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Status(String strDriver1Status){
		Map lreturn=[:]
		String lDriver1Status=strDriver1Status.trim()
		if(lDriver1Status.length()<=0){
			lDriver1Status=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Status','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Status=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Status(lDriver1Status)
				if(!lMapDriver1Status.Result){
					lDriver1Status=''
				}else{
					lDriver1Status=lMapDriver1Status.Driver1Status
				}
			}else{
				Map lMapDriver1Status=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Status(lDriver1Status)
				if(!lMapDriver1Status.Result){
					lDriver1Status=''
				}else{
					lDriver1Status=lMapDriver1Status.Driver1Status
				}
			}
			lResult=lDriver1Status.length()>0
			if(lResult){
				lreturn.put('Driver1Status',lDriver1Status)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Dob(String strDriver1Dob){
		Map lreturn=[:]
		String lDriver1Dob=strDriver1Dob.trim()
		if(lDriver1Dob.length()<=0){
			lDriver1Dob=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Dob','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Dob=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Dob(lDriver1Dob)
				if(!lMapDriver1Dob.Result){
					lDriver1Dob=''
				}else{
					lDriver1Dob=lMapDriver1Dob.Driver1Dob
				}
			}else{
				Map lMapDriver1Dob=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Dob(lDriver1Dob)
				if(!lMapDriver1Dob.Result){
					lDriver1Dob=''
				}else{
					lDriver1Dob=lMapDriver1Dob.Driver1Dob
				}
			}
			lResult=lDriver1Dob.length()>0
			if(lResult){
				lreturn.put('Driver1Dob',lDriver1Dob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1IsThai(String strDriver1IsThai){
		Map lreturn=[:]
		String lDriver1IsThai=strDriver1IsThai.trim()
		if(lDriver1IsThai.length()<=0){
			lDriver1IsThai=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1IsThai','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1IsThai=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1IsThai(lDriver1IsThai)
				if(!lMapDriver1IsThai.Result){
					lDriver1IsThai=''
				}else{
					lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
				}
			}else{
				Map lMapDriver1IsThai=this.lTHAMotorCarQuotationDetail1Util.inputDriver1IsThai(lDriver1IsThai)
				if(!lMapDriver1IsThai.Result){
					lDriver1IsThai=''
				}else{
					lDriver1IsThai=lMapDriver1IsThai.Driver1IsThai
				}
			}
			lResult=lDriver1IsThai.length()>0
			if(lResult){
				lreturn.put('Driver1IsThai',lDriver1IsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1ThaiId(String strDriver1ThaiId){
		Map lreturn=[:]
		String lDriver1ThaiId=strDriver1ThaiId.trim()
		if(lDriver1ThaiId.length()<=0){
			lDriver1ThaiId=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1ThaiId=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1ThaiId(lDriver1ThaiId)
				if(!lMapDriver1ThaiId.Result){
					lDriver1ThaiId=''
				}else{
					lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
				}
			}else{
				Map lMapDriver1ThaiId=this.lTHAMotorCarQuotationDetail1Util.inputDriver1ThaiId(lDriver1ThaiId)
				if(!lMapDriver1ThaiId.Result){
					lDriver1ThaiId=''
				}else{
					lDriver1ThaiId=lMapDriver1ThaiId.Driver1ThaiId
				}
			}
			lResult=lDriver1ThaiId.length()>0
			if(lResult){
				lreturn.put('Driver1ThaiId',lDriver1ThaiId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Passport(String strDriver1Passport){
		Map lreturn=[:]
		String lDriver1Passport=strDriver1Passport.trim()
		if(lDriver1Passport.length()<=0){
			lDriver1Passport=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Passport','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Passport=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Passport(lDriver1Passport)
				if(!lMapDriver1Passport.Result){
					lDriver1Passport=''
				}else{
					lDriver1Passport=lMapDriver1Passport.Driver1Passport
				}
			}else{
				Map lMapDriver1Passport=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Passport(lDriver1Passport)
				if(!lMapDriver1Passport.Result){
					lDriver1Passport=''
				}else{
					lDriver1Passport=lMapDriver1Passport.Driver1Passport
				}
			}
			lResult=lDriver1Passport.length()>0
			if(lResult){
				lreturn.put('Driver1Passport',lDriver1Passport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Country(String strDriver1Country){
		Map lreturn=[:]
		String lDriver1Country=strDriver1Country.trim()
		if(lDriver1Country.length()<=0){
			lDriver1Country=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Country','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Country=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Country(lDriver1Country)
				if(!lMapDriver1Country.Result){
					lDriver1Country=''
				}else{
					lDriver1Country=lMapDriver1Country.Driver1Country
				}
			}else{
				Map lMapDriver1Country=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Country(lDriver1Country)
				if(!lMapDriver1Country.Result){
					lDriver1Country=''
				}else{
					lDriver1Country=lMapDriver1Country.Driver1Country
				}
			}
			lResult=lDriver1Country.length()>0
			if(lResult){
				lreturn.put('Driver1Country',lDriver1Country)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Name(String strDriver1Name){
		Map lreturn=[:]
		String lDriver1Name=strDriver1Name.trim()
		if(lDriver1Name.length()<=0){
			lDriver1Name=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Name','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Name=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Name(lDriver1Name)
				if(!lMapDriver1Name.Result){
					lDriver1Name=''
				}else{
					lDriver1Name=lMapDriver1Name.Driver1Name
				}
			}else{
				Map lMapDriver1Name=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Name(lDriver1Name)
				if(!lMapDriver1Name.Result){
					lDriver1Name=''
				}else{
					lDriver1Name=lMapDriver1Name.Driver1Name
				}
			}
			lResult=lDriver1Name.length()>0
			if(lResult){
				lreturn.put('Driver1Name',lDriver1Name)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Surname(String strDriver1Surname){
		Map lreturn=[:]
		String lDriver1Surname=strDriver1Surname.trim()
		if(lDriver1Surname.length()<=0){
			lDriver1Surname=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Surname','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Surname=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Surname(lDriver1Surname)
				if(!lMapDriver1Surname.Result){
					lDriver1Surname=''
				}else{
					lDriver1Surname=lMapDriver1Surname.Driver1Surname
				}
			}else{
				Map lMapDriver1Surname=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Surname(lDriver1Surname)
				if(!lMapDriver1Surname.Result){
					lDriver1Surname=''
				}else{
					lDriver1Surname=lMapDriver1Surname.Driver1Surname
				}
			}
			lResult=lDriver1Surname.length()>0
			if(lResult){
				lreturn.put('Driver1Surname',lDriver1Surname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1YearDriving(String strDriver1YearDriving){
		Map lreturn=[:]
		String lDriver1YearDriving=strDriver1YearDriving.trim()
		if(lDriver1YearDriving.length()<=0){
			lDriver1YearDriving=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_YEAR_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1YearDriving=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1YearDriving(lDriver1YearDriving)
				if(!lMapDriver1YearDriving.Result){
					lDriver1YearDriving=''
				}else{
					lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
				}
			}else{
				Map lMapDriver1YearDriving=this.lTHAMotorCarQuotationDetail1Util.inputDriver1YearDriving(lDriver1YearDriving)
				if(!lMapDriver1YearDriving.Result){
					lDriver1YearDriving=''
				}else{
					lDriver1YearDriving=lMapDriver1YearDriving.Driver1YearDriving
				}
			}
			lResult=lDriver1YearDriving.length()>0
			if(lResult){
				lreturn.put('Driver1YearDriving',lDriver1YearDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1ClaimsNo(String strDriver1ClaimsNo){
		Map lreturn=[:]
		String lDriver1ClaimsNo=strDriver1ClaimsNo.trim()
		if(lDriver1ClaimsNo.length()<=0){
			lDriver1ClaimsNo=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_CLAIMS_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1ClaimsNo=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1ClaimsNo(lDriver1ClaimsNo)
				if(!lMapDriver1ClaimsNo.Result){
					lDriver1ClaimsNo=''
				}else{
					lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
				}
			}else{
				Map lMapDriver1ClaimsNo=this.lTHAMotorCarQuotationDetail1Util.inputDriver1ClaimsNo(lDriver1ClaimsNo)
				if(!lMapDriver1ClaimsNo.Result){
					lDriver1ClaimsNo=''
				}else{
					lDriver1ClaimsNo=lMapDriver1ClaimsNo.Driver1ClaimsNo
				}
			}
			lResult=lDriver1ClaimsNo.length()>0
			if(lResult){
				lreturn.put('Driver1ClaimsNo',lDriver1ClaimsNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1Occupation(String strDriver1Occupation){
		Map lreturn=[:]
		String lDriver1Occupation=strDriver1Occupation.trim()
		if(lDriver1Occupation.length()<=0){
			lDriver1Occupation=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER1_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Occupation','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver1Occupation=this.lTHAMotorBikeQuotationDetail1Util.inputDriver1Occupation(lDriver1Occupation)
				if(!lMapDriver1Occupation.Result){
					lDriver1Occupation=''
				}else{
					lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
				}
			}else{
				Map lMapDriver1Occupation=this.lTHAMotorCarQuotationDetail1Util.inputDriver1Occupation(lDriver1Occupation)
				if(!lMapDriver1Occupation.Result){
					lDriver1Occupation=''
				}else{
					lDriver1Occupation=lMapDriver1Occupation.Driver1Occupation
				}
			}
			lResult=lDriver1Occupation.length()>0
			if(lResult){
				lreturn.put('Driver1Occupation',lDriver1Occupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Status(String strDriver2Status){
		Map lreturn=[:]
		String lDriver2Status=strDriver2Status.trim()
		if(lDriver2Status.length()<=0){
			lDriver2Status=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Status','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Status=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Status(lDriver2Status)
				if(!lMapDriver2Status.Result){
					lDriver2Status=''
				}else{
					lDriver2Status=lMapDriver2Status.Driver2Status
				}
			}else{
				Map lMapDriver2Status=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Status(lDriver2Status)
				if(!lMapDriver2Status.Result){
					lDriver2Status=''
				}else{
					lDriver2Status=lMapDriver2Status.Driver2Status
				}
			}
			lResult=lDriver2Status.length()>0
			if(lResult){
				lreturn.put('Driver2Status',lDriver2Status)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Dob(String strDriver2Dob){
		Map lreturn=[:]
		String lDriver2Dob=strDriver2Dob.trim()
		if(lDriver2Dob.length()<=0){
			lDriver2Dob=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Dob','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Dob=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Dob(lDriver2Dob)
				if(!lMapDriver2Dob.Result){
					lDriver2Dob=''
				}else{
					lDriver2Dob=lMapDriver2Dob.Driver2Dob
				}
			}else{
				Map lMapDriver2Dob=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Dob(lDriver2Dob)
				if(!lMapDriver2Dob.Result){
					lDriver2Dob=''
				}else{
					lDriver2Dob=lMapDriver2Dob.Driver2Dob
				}
			}
			lResult=lDriver2Dob.length()>0
			if(lResult){
				lreturn.put('Driver2Dob',lDriver2Dob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2IsThai(String strDriver2IsThai){
		Map lreturn=[:]
		String lDriver2IsThai=strDriver2IsThai.trim()
		if(lDriver2IsThai.length()<=0){
			lDriver2IsThai=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2IsThai','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2IsThai=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2IsThai(lDriver2IsThai)
				if(!lMapDriver2IsThai.Result){
					lDriver2IsThai=''
				}else{
					lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
				}
			}else{
				Map lMapDriver2IsThai=this.lTHAMotorCarQuotationDetail1Util.inputDriver2IsThai(lDriver2IsThai)
				if(!lMapDriver2IsThai.Result){
					lDriver2IsThai=''
				}else{
					lDriver2IsThai=lMapDriver2IsThai.Driver2IsThai
				}
			}
			lResult=lDriver2IsThai.length()>0
			if(lResult){
				lreturn.put('Driver2IsThai',lDriver2IsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2ThaiId(String strDriver2ThaiId){
		Map lreturn=[:]
		String lDriver2ThaiId=strDriver2ThaiId.trim()
		if(lDriver2ThaiId.length()<=0){
			lDriver2ThaiId=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2ThaiId=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2ThaiId(lDriver2ThaiId)
				if(!lMapDriver2ThaiId.Result){
					lDriver2ThaiId=''
				}else{
					lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
				}
			}else{
				Map lMapDriver2ThaiId=this.lTHAMotorCarQuotationDetail1Util.inputDriver2ThaiId(lDriver2ThaiId)
				if(!lMapDriver2ThaiId.Result){
					lDriver2ThaiId=''
				}else{
					lDriver2ThaiId=lMapDriver2ThaiId.Driver2ThaiId
				}
			}
			lResult=lDriver2ThaiId.length()>0
			if(lResult){
				lreturn.put('Driver2ThaiId',lDriver2ThaiId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Passport(String strDriver2Passport){
		Map lreturn=[:]
		String lDriver2Passport=strDriver2Passport.trim()
		if(lDriver2Passport.length()<=0){
			lDriver2Passport=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Passport','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Passport=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Passport(lDriver2Passport)
				if(!lMapDriver2Passport.Result){
					lDriver2Passport=''
				}else{
					lDriver2Passport=lMapDriver2Passport.Driver2Passport
				}
			}else{
				Map lMapDriver2Passport=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Passport(lDriver2Passport)
				if(!lMapDriver2Passport.Result){
					lDriver2Passport=''
				}else{
					lDriver2Passport=lMapDriver2Passport.Driver2Passport
				}
			}
			lResult=lDriver2Passport.length()>0
			if(lResult){
				lreturn.put('Driver2Passport',lDriver2Passport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Country(String strDriver2Country){
		Map lreturn=[:]
		String lDriver2Country=strDriver2Country.trim()
		if(lDriver2Country.length()<=0){
			lDriver2Country=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Country','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Country=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Country(lDriver2Country)
				if(!lMapDriver2Country.Result){
					lDriver2Country=''
				}else{
					lDriver2Country=lMapDriver2Country.Driver2Country
				}
			}else{
				Map lMapDriver2Country=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Country(lDriver2Country)
				if(!lMapDriver2Country.Result){
					lDriver2Country=''
				}else{
					lDriver2Country=lMapDriver2Country.Driver2Country
				}
			}
			lResult=lDriver2Country.length()>0
			if(lResult){
				lreturn.put('Driver2Country',lDriver2Country)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Name(String strDriver2Name){
		Map lreturn=[:]
		String lDriver2Name=strDriver2Name.trim()
		if(lDriver2Name.length()<=0){
			lDriver2Name=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Name','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Name=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Name(lDriver2Name)
				if(!lMapDriver2Name.Result){
					lDriver2Name=''
				}else{
					lDriver2Name=lMapDriver2Name.Driver2Name
				}
			}else{
				Map lMapDriver2Name=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Name(lDriver2Name)
				if(!lMapDriver2Name.Result){
					lDriver2Name=''
				}else{
					lDriver2Name=lMapDriver2Name.Driver2Name
				}
			}
			lResult=lDriver2Name.length()>0
			if(lResult){
				lreturn.put('Driver2Name',lDriver2Name)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Surname(String strDriver2Surname){
		Map lreturn=[:]
		String lDriver2Surname=strDriver2Surname.trim()
		if(lDriver2Surname.length()<=0){
			lDriver2Surname=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Surname','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Surname=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Surname(lDriver2Surname)
				if(!lMapDriver2Surname.Result){
					lDriver2Surname=''
				}else{
					lDriver2Surname=lMapDriver2Surname.Driver2Surname
				}
			}else{
				Map lMapDriver2Surname=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Surname(lDriver2Surname)
				if(!lMapDriver2Surname.Result){
					lDriver2Surname=''
				}else{
					lDriver2Surname=lMapDriver2Surname.Driver2Surname
				}
			}
			lResult=lDriver2Surname.length()>0
			if(lResult){
				lreturn.put('Driver2Surname',lDriver2Surname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2YearDriving(String strDriver2YearDriving){
		Map lreturn=[:]
		String lDriver2YearDriving=strDriver2YearDriving.trim()
		if(lDriver2YearDriving.length()<=0){
			lDriver2YearDriving=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_YEAR_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2YearDriving=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2YearDriving(lDriver2YearDriving)
				if(!lMapDriver2YearDriving.Result){
					lDriver2YearDriving=''
				}else{
					lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
				}
			}else{
				Map lMapDriver2YearDriving=this.lTHAMotorCarQuotationDetail1Util.inputDriver2YearDriving(lDriver2YearDriving)
				if(!lMapDriver2YearDriving.Result){
					lDriver2YearDriving=''
				}else{
					lDriver2YearDriving=lMapDriver2YearDriving.Driver2YearDriving
				}
			}
			lResult=lDriver2YearDriving.length()>0
			if(lResult){
				lreturn.put('Driver2YearDriving',lDriver2YearDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2ClaimsNo(String strDriver2ClaimsNo){
		Map lreturn=[:]
		String lDriver2ClaimsNo=strDriver2ClaimsNo.trim()
		if(lDriver2ClaimsNo.length()<=0){
			lDriver2ClaimsNo=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_CLAIMS_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2ClaimsNo=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2ClaimsNo(lDriver2ClaimsNo)
				if(!lMapDriver2ClaimsNo.Result){
					lDriver2ClaimsNo=''
				}else{
					lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
				}
			}else{
				Map lMapDriver2ClaimsNo=this.lTHAMotorCarQuotationDetail1Util.inputDriver2ClaimsNo(lDriver2ClaimsNo)
				if(!lMapDriver2ClaimsNo.Result){
					lDriver2ClaimsNo=''
				}else{
					lDriver2ClaimsNo=lMapDriver2ClaimsNo.Driver2ClaimsNo
				}
			}
			lResult=lDriver2ClaimsNo.length()>0
			if(lResult){
				lreturn.put('Driver2ClaimsNo',lDriver2ClaimsNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2Occupation(String strDriver2Occupation){
		Map lreturn=[:]
		String lDriver2Occupation=strDriver2Occupation.trim()
		if(lDriver2Occupation.length()<=0){
			lDriver2Occupation=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER2_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Occupation','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver2Occupation=this.lTHAMotorBikeQuotationDetail1Util.inputDriver2Occupation(lDriver2Occupation)
				if(!lMapDriver2Occupation.Result){
					lDriver2Occupation=''
				}else{
					lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
				}
			}else{
				Map lMapDriver2Occupation=this.lTHAMotorCarQuotationDetail1Util.inputDriver2Occupation(lDriver2Occupation)
				if(!lMapDriver2Occupation.Result){
					lDriver2Occupation=''
				}else{
					lDriver2Occupation=lMapDriver2Occupation.Driver2Occupation
				}
			}
			lResult=lDriver2Occupation.length()>0
			if(lResult){
				lreturn.put('Driver2Occupation',lDriver2Occupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Status(String strDriver3Status){
		Map lreturn=[:]
		String lDriver3Status=strDriver3Status.trim()
		if(lDriver3Status.length()<=0){
			lDriver3Status=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_STATUS
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Status','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Status=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Status(lDriver3Status)
				if(!lMapDriver3Status.Result){
					lDriver3Status=''
				}else{
					lDriver3Status=lMapDriver3Status.Driver3Status
				}
			}else{
				Map lMapDriver3Status=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Status(lDriver3Status)
				if(!lMapDriver3Status.Result){
					lDriver3Status=''
				}else{
					lDriver3Status=lMapDriver3Status.Driver3Status
				}
			}
			lResult=lDriver3Status.length()>0
			if(lResult){
				lreturn.put('Driver3Status',lDriver3Status)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Dob(String strDriver3Dob){
		Map lreturn=[:]
		String lDriver3Dob=strDriver3Dob.trim()
		if(lDriver3Dob.length()<=0){
			lDriver3Dob=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Dob','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Dob=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Dob(lDriver3Dob)
				if(!lMapDriver3Dob.Result){
					lDriver3Dob=''
				}else{
					lDriver3Dob=lMapDriver3Dob.Driver3Dob
				}
			}else{
				Map lMapDriver3Dob=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Dob(lDriver3Dob)
				if(!lMapDriver3Dob.Result){
					lDriver3Dob=''
				}else{
					lDriver3Dob=lMapDriver3Dob.Driver3Dob
				}
			}
			lResult=lDriver3Dob.length()>0
			if(lResult){
				lreturn.put('Driver3Dob',lDriver3Dob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3IsThai(String strDriver3IsThai){
		Map lreturn=[:]
		String lDriver3IsThai=strDriver3IsThai.trim()
		if(lDriver3IsThai.length()<=0){
			lDriver3IsThai=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3IsThai','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3IsThai=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3IsThai(lDriver3IsThai)
				if(!lMapDriver3IsThai.Result){
					lDriver3IsThai=''
				}else{
					lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
				}
			}else{
				Map lMapDriver3IsThai=this.lTHAMotorCarQuotationDetail1Util.inputDriver3IsThai(lDriver3IsThai)
				if(!lMapDriver3IsThai.Result){
					lDriver3IsThai=''
				}else{
					lDriver3IsThai=lMapDriver3IsThai.Driver3IsThai
				}
			}
			lResult=lDriver3IsThai.length()>0
			if(lResult){
				lreturn.put('Driver3IsThai',lDriver3IsThai)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3ThaiId(String strDriver3ThaiId){
		Map lreturn=[:]
		String lDriver3ThaiId=strDriver3ThaiId.trim()
		if(lDriver3ThaiId.length()<=0){
			lDriver3ThaiId=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3ThaiId=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3ThaiId(lDriver3ThaiId)
				if(!lMapDriver3ThaiId.Result){
					lDriver3ThaiId=''
				}else{
					lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
				}
			}else{
				Map lMapDriver3ThaiId=this.lTHAMotorCarQuotationDetail1Util.inputDriver3ThaiId(lDriver3ThaiId)
				if(!lMapDriver3ThaiId.Result){
					lDriver3ThaiId=''
				}else{
					lDriver3ThaiId=lMapDriver3ThaiId.Driver3ThaiId
				}
			}
			lResult=lDriver3ThaiId.length()>0
			if(lResult){
				lreturn.put('Driver3ThaiId',lDriver3ThaiId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Passport(String strDriver3Passport){
		Map lreturn=[:]
		String lDriver3Passport=strDriver3Passport.trim()
		if(lDriver3Passport.length()<=0){
			lDriver3Passport=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Passport','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Passport=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Passport(lDriver3Passport)
				if(!lMapDriver3Passport.Result){
					lDriver3Passport=''
				}else{
					lDriver3Passport=lMapDriver3Passport.Driver3Passport
				}
			}else{
				Map lMapDriver3Passport=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Passport(lDriver3Passport)
				if(!lMapDriver3Passport.Result){
					lDriver3Passport=''
				}else{
					lDriver3Passport=lMapDriver3Passport.Driver3Passport
				}
			}
			lResult=lDriver3Passport.length()>0
			if(lResult){
				lreturn.put('Driver3Passport',lDriver3Passport)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Country(String strDriver3Country){
		Map lreturn=[:]
		String lDriver3Country=strDriver3Country.trim()
		if(lDriver3Country.length()<=0){
			lDriver3Country=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Country','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Country=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Country(lDriver3Country)
				if(!lMapDriver3Country.Result){
					lDriver3Country=''
				}else{
					lDriver3Country=lMapDriver3Country.Driver3Country
				}
			}else{
				Map lMapDriver3Country=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Country(lDriver3Country)
				if(!lMapDriver3Country.Result){
					lDriver3Country=''
				}else{
					lDriver3Country=lMapDriver3Country.Driver3Country
				}
			}
			lResult=lDriver3Country.length()>0
			if(lResult){
				lreturn.put('Driver3Country',lDriver3Country)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Name(String strDriver3Name){
		Map lreturn=[:]
		String lDriver3Name=strDriver3Name.trim()
		if(lDriver3Name.length()<=0){
			lDriver3Name=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Name','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Name=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Name(lDriver3Name)
				if(!lMapDriver3Name.Result){
					lDriver3Name=''
				}else{
					lDriver3Name=lMapDriver3Name.Driver3Name
				}
			}else{
				Map lMapDriver3Name=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Name(lDriver3Name)
				if(!lMapDriver3Name.Result){
					lDriver3Name=''
				}else{
					lDriver3Name=lMapDriver3Name.Driver3Name
				}
			}
			lResult=lDriver3Name.length()>0
			if(lResult){
				lreturn.put('Driver3Name',lDriver3Name)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Surname(String strDriver3Surname){
		Map lreturn=[:]
		String lDriver3Surname=strDriver3Surname.trim()
		if(lDriver3Surname.length()<=0){
			lDriver3Surname=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Surname','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Surname=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Surname(lDriver3Surname)
				if(!lMapDriver3Surname.Result){
					lDriver3Surname=''
				}else{
					lDriver3Surname=lMapDriver3Surname.Driver3Surname
				}
			}else{
				Map lMapDriver3Surname=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Surname(lDriver3Surname)
				if(!lMapDriver3Surname.Result){
					lDriver3Surname=''
				}else{
					lDriver3Surname=lMapDriver3Surname.Driver3Surname
				}
			}
			lResult=lDriver3Surname.length()>0
			if(lResult){
				lreturn.put('Driver3Surname',lDriver3Surname)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3YearDriving(String strDriver3YearDriving){
		Map lreturn=[:]
		String lDriver3YearDriving=strDriver3YearDriving.trim()
		if(lDriver3YearDriving.length()<=0){
			lDriver3YearDriving=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_YEAR_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3YearDriving=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3YearDriving(lDriver3YearDriving)
				if(!lMapDriver3YearDriving.Result){
					lDriver3YearDriving=''
				}else{
					lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
				}
			}else{
				Map lMapDriver3YearDriving=this.lTHAMotorCarQuotationDetail1Util.inputDriver3YearDriving(lDriver3YearDriving)
				if(!lMapDriver3YearDriving.Result){
					lDriver3YearDriving=''
				}else{
					lDriver3YearDriving=lMapDriver3YearDriving.Driver3YearDriving
				}
			}
			lResult=lDriver3YearDriving.length()>0
			if(lResult){
				lreturn.put('Driver3YearDriving',lDriver3YearDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3ClaimsNo(String strDriver3ClaimsNo){
		Map lreturn=[:]
		String lDriver3ClaimsNo=strDriver3ClaimsNo.trim()
		if(lDriver3ClaimsNo.length()<=0){
			lDriver3ClaimsNo=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_CLAIMS_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3ClaimsNo=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3ClaimsNo(lDriver3ClaimsNo)
				if(!lMapDriver3ClaimsNo.Result){
					lDriver3ClaimsNo=''
				}else{
					lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
				}
			}else{
				Map lMapDriver3ClaimsNo=this.lTHAMotorCarQuotationDetail1Util.inputDriver3ClaimsNo(lDriver3ClaimsNo)
				if(!lMapDriver3ClaimsNo.Result){
					lDriver3ClaimsNo=''
				}else{
					lDriver3ClaimsNo=lMapDriver3ClaimsNo.Driver3ClaimsNo
				}
			}
			lResult=lDriver3ClaimsNo.length()>0
			if(lResult){
				lreturn.put('Driver3ClaimsNo',lDriver3ClaimsNo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3Occupation(String strDriver3Occupation){
		Map lreturn=[:]
		String lDriver3Occupation=strDriver3Occupation.trim()
		if(lDriver3Occupation.length()<=0){
			lDriver3Occupation=THARGPAMotorQuotationDetail1Type.DEFAULT_DRIVER3_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Occupation','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapDriver3Occupation=this.lTHAMotorBikeQuotationDetail1Util.inputDriver3Occupation(lDriver3Occupation)
				if(!lMapDriver3Occupation.Result){
					lDriver3Occupation=''
				}else{
					lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
				}
			}else{
				Map lMapDriver3Occupation=this.lTHAMotorCarQuotationDetail1Util.inputDriver3Occupation(lDriver3Occupation)
				if(!lMapDriver3Occupation.Result){
					lDriver3Occupation=''
				}else{
					lDriver3Occupation=lMapDriver3Occupation.Driver3Occupation
				}
			}
			lResult=lDriver3Occupation.length()>0
			if(lResult){
				lreturn.put('Driver3Occupation',lDriver3Occupation)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyStartDate(String strPolicyStartDate,String strPolicyStartDayOffset){
		Map lreturn=[:]
		String lPolicyStartDate=strPolicyStartDate.trim()
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=THARGPAMotorQuotationDetail1Type.DEFAULT_POLICY_START_DATE
		}
		String lPolicyStartDayOffset=strPolicyStartDayOffset.trim()
		if(lPolicyStartDayOffset.length()<=0){
			lPolicyStartDayOffset=THARGPAMotorQuotationDetail1Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapPolicyStartDate=this.lTHAMotorBikeQuotationDetail1Util.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lResult=lMapPolicyStartDate.Result
			}else{
				Map lMapPolicyStartDate=this.lTHAMotorCarQuotationDetail1Util.inputPolicyStartDate(lPolicyStartDate,lPolicyStartDayOffset)
				if(!lMapPolicyStartDate.Result){
					lPolicyStartDate=''
					lPolicyStartDayOffset=''
				}else{
					lPolicyStartDate=lMapPolicyStartDate.PolicyStartDate
					lPolicyStartDayOffset=lMapPolicyStartDate.PolicyStartDayOffset
				}
				lResult=lMapPolicyStartDate.Result
			}
			if(lResult){
				lreturn.put('PolicyStartDate',lPolicyStartDate)
				lreturn.put('PolicyStartDayOffset',lPolicyStartDayOffset)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurer(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapPolicyInsurer=this.lTHAMotorBikeQuotationDetail1Util.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lResult=lMapPolicyInsurer.Result
			}else{
				Map lMapPolicyInsurer=this.lTHAMotorCarQuotationDetail1Util.inputPolicyInsurer(lPolicyInsurer)
				if(!lMapPolicyInsurer.Result){
					lPolicyInsurer=''
				}else{
					lPolicyInsurer=lMapPolicyInsurer.PolicyInsurer
				}
				lResult=lMapPolicyInsurer.Result
			}
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
	public Map inputSalesforceProceedTodo(String strSalesforceProceedTodo){
		Map lreturn=[:]
		String lSalesforceProceedTodo=strSalesforceProceedTodo.trim()
		if(lSalesforceProceedTodo.length()<=0){
			lSalesforceProceedTodo=THARGPAMotorQuotationDetail1Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			if(THARGPAMotorCoreType.CURRENT_PRODUCT_IS_MOTOR_BIKE){
				Map lMapSalesforceProceedTodo=this.lTHAMotorBikeQuotationDetail1Util.inputSalesforceProceedTodo(lSalesforceProceedTodo)
				if(!lMapSalesforceProceedTodo.Result){
					lSalesforceProceedTodo=''
				}else{
					lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
				}
			}else{
				Map lMapSalesforceProceedTodo=this.lTHAMotorCarQuotationDetail1Util.inputSalesforceProceedTodo(lSalesforceProceedTodo)
				if(!lMapSalesforceProceedTodo.Result){
					lSalesforceProceedTodo=''
				}else{
					lSalesforceProceedTodo=lMapSalesforceProceedTodo.SalesforceProceedTodo
				}
			}
			lResult=lSalesforceProceedTodo.length()>0
			if(lResult){
				lreturn.put('SalesforceProceedTodo',lSalesforceProceedTodo)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}