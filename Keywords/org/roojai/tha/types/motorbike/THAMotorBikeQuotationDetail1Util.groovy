package org.roojai.tha.types.motorbike
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
public class THAMotorBikeQuotationDetail1Util{
	private WebDriver driver=null
	private WebDriver selenium=null
	public THAMotorBikeQuotationDetail1Util(WebDriver newDriver,WebDriver newSelenium){
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
	public Boolean waitUntilOpportunityNumberUpdated(){
		Boolean lreturn=false
		try{
			String lOpportunityNumber=''
			String lOpportunityNumberNew=''
			String lOpportunityNumberOld=THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.trim()
			String lTagOpportunityNumberNew='qotation-no'
			String lLocatorOpportunityNumberNew=IGNUemaHelper.getTagDataSeleniumKey(lTagOpportunityNumberNew)
			for(Integer lIndex=1;lIndex<=10;lIndex++){
				WebElement lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
				if(lElementOpportunityNumberNew){
					lElementOpportunityNumberNew=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagOpportunityNumberNew)
					lOpportunityNumberNew=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementOpportunityNumberNew).trim()
					if(lOpportunityNumberNew.length()>0){
						if(lOpportunityNumberOld.equalsIgnoreCase(lOpportunityNumberNew)){
							IGNUemaHelper.delayThreadSecond(lIndex)
						}else{
							break
						}
					}else{
						IGNUemaHelper.delayThreadSecond(lIndex)
					}
				}else{
					IGNUemaHelper.delayThreadSecond(lIndex)
				}
			}
			lOpportunityNumber=lOpportunityNumberNew
			if(lOpportunityNumber.length()>0){
				lreturn=true
				THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER=lOpportunityNumber
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputDetail1(Map caseInput,Map caseOutput){
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
			Map lMapDetail1Input=this.initDetail1Input()
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
						lMapInputDetail1=this.inputDetail1A(lMapDetail1Input,lIsPositiveCase)
						break
					case 'B':
						lMapInputDetail1=this.inputDetail1B(lMapDetail1Input,lIsPositiveCase)
						break
					default:
						return lreturn
						break
				}
			}else{
				lMapInputDetail1=this.inputDetail1A(lMapDetail1Input,lIsPositiveCase)
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
			lActualResult=lMapInputDetail1.ActualResult
			lPolicyInsurer=lMapInputDetail1.PolicyInsurer
			lSubmitCallMeBack=lMapInputDetail1.SubmitCallMeBack
			lCallMeBackEmail=lMapInputDetail1.CallMeBackEmail
			lCallMeBackMobile=lMapInputDetail1.CallMeBackMobile
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
					Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
					if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput.Result){
						lMapGetSalesforceDataByOpportunityNumberToMapCaseOutput=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER,caseOutput)
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
	public Map initDetail1Input(){
		Map lreturn=[:]
		try{
			lreturn.put('BaseUrl','')
			lreturn.put('MaximizeMode','')
			lreturn.put('WithAuth','')
			lreturn.put('AuthUser','')
			lreturn.put('AuthPassword','')
			lreturn.put('Language','')
			lreturn.put('HolderEmail','')
			lreturn.put('HolderNewsletter','')
			lreturn.put('HolderPhoneNo','')
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('CallMeNow','')
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('HolderIsPerson','')
			lreturn.put('HolderIsMain','')
			lreturn.put('CarForCommercial','')
			lreturn.put('CarPlateNumber','')
			lreturn.put('CarPlateProvince','')
			lreturn.put('HolderStatus','')
			lreturn.put('HolderDob','')
			lreturn.put('HolderIsThai','')
			lreturn.put('HolderThaiId','')
			lreturn.put('HolderOccupation','')
			lreturn.put('HolderPassport','')
			lreturn.put('HolderCountry','')
			lreturn.put('HolderName','')
			lreturn.put('HolderSurname','')
			lreturn.put('HolderCompId','')
			lreturn.put('HolderCompName','')
			lreturn.put('MainStatus','')
			lreturn.put('MainDob','')
			lreturn.put('MainIsThai','')
			lreturn.put('MainThaiId','')
			lreturn.put('MainOccupation','')
			lreturn.put('MainPassport','')
			lreturn.put('MainCountry','')
			lreturn.put('MainName','')
			lreturn.put('MainSurname','')
			lreturn.put('MainEmail','')
			lreturn.put('MainPhoneNo','')
			lreturn.put('AdditionDrivers','')
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Driver1Status','')
			lreturn.put('Driver1Dob','')
			lreturn.put('Driver1IsThai','')
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Driver1Passport','')
			lreturn.put('Driver1Country','')
			lreturn.put('Driver1Name','')
			lreturn.put('Driver1Surname','')
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Driver1Occupation','')
			lreturn.put('Driver2Status','')
			lreturn.put('Driver2Dob','')
			lreturn.put('Driver2IsThai','')
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Driver2Passport','')
			lreturn.put('Driver2Country','')
			lreturn.put('Driver2Name','')
			lreturn.put('Driver2Surname','')
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Driver2Occupation','')
			lreturn.put('Driver3Status','')
			lreturn.put('Driver3Dob','')
			lreturn.put('Driver3IsThai','')
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Driver3Passport','')
			lreturn.put('Driver3Country','')
			lreturn.put('Driver3Name','')
			lreturn.put('Driver3Surname','')
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Driver3Occupation','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('PolicyStartDate','')
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initDetail1Output(){
		Map lreturn=[:]
		try{
			lreturn.put('BaseUrl','')
			lreturn.put('MaximizeMode','')
			lreturn.put('WithAuth','')
			lreturn.put('AuthUser','')
			lreturn.put('AuthPassword','')
			lreturn.put('Language','')
			lreturn.put('HolderEmail','')
			lreturn.put('HolderNewsletter','')
			lreturn.put('HolderPhoneNo','')
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('CallMeNow','')
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('HolderIsPerson','')
			lreturn.put('HolderIsMain','')
			lreturn.put('CarForCommercial','')
			lreturn.put('CarPlateNumber','')
			lreturn.put('CarPlateProvince','')
			lreturn.put('HolderStatus','')
			lreturn.put('HolderDob','')
			lreturn.put('HolderIsThai','')
			lreturn.put('HolderThaiId','')
			lreturn.put('HolderOccupation','')
			lreturn.put('HolderPassport','')
			lreturn.put('HolderCountry','')
			lreturn.put('HolderName','')
			lreturn.put('HolderSurname','')
			lreturn.put('HolderCompId','')
			lreturn.put('HolderCompName','')
			lreturn.put('MainStatus','')
			lreturn.put('MainDob','')
			lreturn.put('MainIsThai','')
			lreturn.put('MainThaiId','')
			lreturn.put('MainOccupation','')
			lreturn.put('MainPassport','')
			lreturn.put('MainCountry','')
			lreturn.put('MainName','')
			lreturn.put('MainSurname','')
			lreturn.put('MainEmail','')
			lreturn.put('MainPhoneNo','')
			lreturn.put('AdditionDrivers','')
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Driver1Status','')
			lreturn.put('Driver1Dob','')
			lreturn.put('Driver1IsThai','')
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Driver1Passport','')
			lreturn.put('Driver1Country','')
			lreturn.put('Driver1Name','')
			lreturn.put('Driver1Surname','')
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Driver1Occupation','')
			lreturn.put('Driver2Status','')
			lreturn.put('Driver2Dob','')
			lreturn.put('Driver2IsThai','')
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Driver2Passport','')
			lreturn.put('Driver2Country','')
			lreturn.put('Driver2Name','')
			lreturn.put('Driver2Surname','')
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Driver2Occupation','')
			lreturn.put('Driver3Status','')
			lreturn.put('Driver3Dob','')
			lreturn.put('Driver3IsThai','')
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Driver3Passport','')
			lreturn.put('Driver3Country','')
			lreturn.put('Driver3Name','')
			lreturn.put('Driver3Surname','')
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Driver3Occupation','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('PolicyStartDate','')
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('PositiveCase','')
			lreturn.put('ActualResult','')
			lreturn.put('PolicyInsurer','')
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDetail1A(Map mapInput,Boolean isPositiveCase){
		Map lreturn=this.initDetail1Output()
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,false)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
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
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,false)
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
	public Map inputDetail1B(Map mapInput,Boolean isPositiveCase){
		Map lreturn=this.initDetail1Output()
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
				Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lHolderPhoneNo,false)
				if(!lMapActualResult.Result){
					lActualResult=''
				}else{
					lActualResult=lMapActualResult.ActualResult
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
				Map lMapActualResult=this.inputActualResult(isPositiveCase,lHolderPhoneNo,false)
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
			lPositiveCase=THAMotorBikeQuotationDetail1Type.DEFAULT_POSITIVE_CASE
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
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputActualResultA(isPositiveCase,strHolderPhoneNo,isSkipOTP)
						break
					case 'B':
						lreturn=this.inputActualResultB(isPositiveCase,strHolderPhoneNo,isSkipOTP)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputActualResultA(isPositiveCase,strHolderPhoneNo,isSkipOTP)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResultA(Boolean isPositiveCase,String strHolderPhoneNo,Boolean isSkipOTP){
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
			Boolean lIsActualResult=false
			String lTagPaymentButton='enter-payment'
			String lLocatorPaymentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentButton)
			Boolean lPaymentButtonVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPaymentButton)
			Boolean lPaymentButtonEnable=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorPaymentButton)
			Boolean lValid1=lPaymentButtonVisible&&lPaymentButtonEnable
			if(!lValid1){
				if(isPositiveCase){
					lIsActualResult=false
				}else{
					lIsActualResult=true
				}
			}else{
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentButton))
				IGNUemaHelper.delayThreadSecond(2)
				String lTagPleaseWait='loading'
				String lLocatorPleaseWait=IGNUemaHelper.getTagDataSeleniumKey(lTagPleaseWait)
				Boolean lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
				lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
				if(!lValid2){
					IGNUemaHelper.delayThreadSecond(2)
					lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
					lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
				}
				if(!lValid2){
					lIsActualResult=false
				}else{
					String lTagMrKumka='#MrKumka-errmsgModal'
					Boolean lValid3=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagMrKumka,5)
					lValid3=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lTagMrKumka)
					if(lValid3){
						if(isPositiveCase){
							lIsActualResult=false
						}else{
							lIsActualResult=true
						}
					}else{
						IGNUemaHelper.delayThreadSecond(2)
						String lTagPriceChanged='proof2screen'
						String lLocatorPriceChanged=IGNUemaHelper.getTagDataSeleniumKey(lTagPriceChanged)
						Boolean lValid4=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPriceChanged,15)
						lValid4=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPriceChanged)
						if(lValid4){
							IGNUemaHelper.delayThreadSecond(2)
							String lTagConfirmPaymentButton='confirm-to-payment'
							String lLocatorConfirmPaymentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmPaymentButton)
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorPriceChanged,lLocatorConfirmPaymentButton))
						}
						String lLocatorPaymentDocument='#illness-payment'
						if(!isSkipOTP){
							String lTagOTPDialog='#OTP-modal'
							Boolean lValid5=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagOTPDialog,15)
							lValid5=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lTagOTPDialog)
							if(!lValid5){
								if(isPositiveCase){
									lIsActualResult=false
								}else{
									lIsActualResult=true
								}
							}else{
								String lOtpText=THARoojaiWebsite.OTPRoojaiWebsiteByPhoneNo(lHolderPhoneNo,true)
								String lTagOTPText='otp'
								String lLocatorOTPText=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPText)
								String lOtpRes=IGNUemaHelper.typeTextByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lTagOTPDialog,lLocatorOTPText),lOtpText)
								if(lOtpRes.length()>0){
									String lTagOTPButton='otp-verify'
									String lLocatorOTPButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPButton)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lTagOTPDialog,lLocatorOTPButton))){
										IGNUemaHelper.delayThreadSecond(1)
										Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
										if(isPositiveCase){
											lIsActualResult=lRedirected
										}else{
											lIsActualResult=!lRedirected
										}
									}else{
										if(isPositiveCase){
											lIsActualResult=false
										}else{
											lIsActualResult=true
										}
									}
								}else{
									if(isPositiveCase){
										lIsActualResult=false
									}else{
										lIsActualResult=true
									}
								}
							}
						}else{
							IGNUemaHelper.delayThreadSecond(1)
							Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
							if(isPositiveCase){
								lIsActualResult=lRedirected
							}else{
								lIsActualResult=!lRedirected
							}
						}
					}
				}
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
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
	public Map inputActualResultB(Boolean isPositiveCase,String strHolderPhoneNo,Boolean isSkipOTP){
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
			Boolean lIsActualResult=false
			String lTagPaymentButton='enter-payment'
			String lLocatorPaymentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentButton)
			Boolean lPaymentButtonVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPaymentButton)
			Boolean lPaymentButtonEnable=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorPaymentButton)
			Boolean lValid1=lPaymentButtonVisible&&lPaymentButtonEnable
			if(!lValid1){
				if(isPositiveCase){
					lIsActualResult=false
				}else{
					lIsActualResult=true
				}
			}else{
				IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey(lTagPaymentButton))
				IGNUemaHelper.delayThreadSecond(2)
				String lTagPleaseWait='loading'
				String lLocatorPleaseWait=IGNUemaHelper.getTagDataSeleniumKey(lTagPleaseWait)
				Boolean lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
				lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
				if(!lValid2){
					IGNUemaHelper.delayThreadSecond(2)
					lValid2=IGNUemaHelper.waitElementInvisibleByLocator(this.driver,lLocatorPleaseWait,20)
					lValid2=!IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPleaseWait)
				}
				if(!lValid2){
					lIsActualResult=false
				}else{
					String lTagMrKumka='#MrKumka-errmsgModal'
					Boolean lValid3=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagMrKumka,5)
					lValid3=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lTagMrKumka)
					if(lValid3){
						if(isPositiveCase){
							lIsActualResult=false
						}else{
							lIsActualResult=true
						}
					}else{
						IGNUemaHelper.delayThreadSecond(2)
						String lTagPriceChanged='proof2screen'
						String lLocatorPriceChanged=IGNUemaHelper.getTagDataSeleniumKey(lTagPriceChanged)
						Boolean lValid4=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorPriceChanged,15)
						lValid4=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorPriceChanged)
						if(lValid4){
							IGNUemaHelper.delayThreadSecond(2)
							String lTagConfirmPaymentButton='confirm-to-payment'
							String lLocatorConfirmPaymentButton=IGNUemaHelper.getTagDataSeleniumKey(lTagConfirmPaymentButton)
							IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lLocatorPriceChanged,lLocatorConfirmPaymentButton))
						}
						String lLocatorPaymentDocument='#illness-payment'
						if(!isSkipOTP){
							String lTagOTPDialog='#OTP-modal'
							Boolean lValid5=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lTagOTPDialog,15)
							lValid5=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lTagOTPDialog)
							if(!lValid5){
								if(isPositiveCase){
									lIsActualResult=false
								}else{
									lIsActualResult=true
								}
							}else{
								String lOtpText=THARoojaiWebsite.OTPRoojaiWebsiteByPhoneNo(lHolderPhoneNo,true)
								String lTagOTPText='otp'
								String lLocatorOTPText=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPText)
								String lOtpRes=IGNUemaHelper.typeTextByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lTagOTPDialog,lLocatorOTPText),lOtpText)
								if(lOtpRes.length()>0){
									String lTagOTPButton='otp-verify'
									String lLocatorOTPButton=IGNUemaHelper.getTagDataSeleniumKey(lTagOTPButton)
									if(IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.concatCssLocatorParentChild(lTagOTPDialog,lLocatorOTPButton))){
										IGNUemaHelper.delayThreadSecond(1)
										Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
										if(isPositiveCase){
											lIsActualResult=lRedirected
										}else{
											lIsActualResult=!lRedirected
										}
									}else{
										if(isPositiveCase){
											lIsActualResult=false
										}else{
											lIsActualResult=true
										}
									}
								}else{
									if(isPositiveCase){
										lIsActualResult=false
									}else{
										lIsActualResult=true
									}
								}
							}
						}else{
							IGNUemaHelper.delayThreadSecond(1)
							Boolean lRedirected=IGNUemaHelper.checkElementPresentByLocator(this.driver,lLocatorPaymentDocument,30)
							if(isPositiveCase){
								lIsActualResult=lRedirected
							}else{
								lIsActualResult=!lRedirected
							}
						}
					}
				}
			}
			lActualResult=IGNUemaHelper.convertBooleanToString(lIsActualResult)
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
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				if(lLanguageItem.length()<=0){
					lLanguageItem=lLanguageList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
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
	public Map inputLanguageB(String strLanguage){
		Map lreturn=[:]
		String lLanguage=strLanguage.trim()
		if(lLanguage.length()<=0){
			lLanguage=THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE
		}
		Map lLanguageList=['1':'th','2':'en','3':'zh']
		try{
			Boolean lResult=false
			lreturn.put('Language','')
			lreturn.put('Result',lResult)
			String lLanguageItem=lLanguageList.get(lLanguage)
			if(!lLanguageItem){
				lLanguageItem=lLanguageList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE)
			}
			String lTagButton='select-language'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='language'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			lLanguage=''
			Boolean lValid=IGNUemaHelper.checkElementExistByLocator(this.driver,lLocatorDropdownList)&&IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lLanguage='No Option'
			}else{
				lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				if(lLanguageItem.length()<=0){
					lLanguageItem=lLanguageList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_LANGUAGE)
					lLanguageItem=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV1(this.driver,lTagButton,lTagDropdownList,lLanguageItem)
				}
				lLanguage=lLanguageItem.toUpperCase()
				if(lLanguage.length()<=0){
					lLanguage='No Option'
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
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputSubmitCallMeBackA(strSubmitCallMeBack,strCallMeBackEmail,strCallMeBackMobile)
						break
					case 'B':
						lreturn=this.inputSubmitCallMeBackB(strSubmitCallMeBack,strCallMeBackEmail,strCallMeBackMobile)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputSubmitCallMeBackA(strSubmitCallMeBack,strCallMeBackEmail,strCallMeBackMobile)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputSubmitCallMeBackA(String strSubmitCallMeBack,String strCallMeBackEmail,String strCallMeBackMobile){
		Map lreturn=[:]
		String lSubmitCallMeBack=strSubmitCallMeBack.trim()
		if(lSubmitCallMeBack.length()<=0){
			lSubmitCallMeBack=THAMotorBikeQuotationDetail1Type.DEFAULT_SUBMIT_CALL_ME_BACK
		}
		String lCallMeBackEmail=strCallMeBackEmail.trim()
		if(lCallMeBackEmail.length()<=0){
			lCallMeBackEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_EMAIL
		}
		String lCallMeBackMobile=strCallMeBackMobile.trim()
		if(lCallMeBackMobile.length()<=0){
			lCallMeBackMobile=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			Boolean lIsSubmitCallMeBack=IGNUemaHelper.convertStringToBoolean(lSubmitCallMeBack)
			String lCallMeBackEmailText=lCallMeBackEmail
			String lCallMeBackMobileText=lCallMeBackMobile
			lSubmitCallMeBack=''
			lCallMeBackEmail=''
			lCallMeBackMobile=''
			Boolean lIsOK=false
			String lTagSubmitCallMeBackOpenButton='a-callmeback-img'
			String lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
			WebElement lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			if(!lElementSubmitCallMeBackOpenButton){
				lTagSubmitCallMeBackOpenButton='a-callmeback-text'
				lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
				lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			}
			if(!lElementSubmitCallMeBackOpenButton){
				lIsSubmitCallMeBack=false
			}
			if(lIsSubmitCallMeBack){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackOpenButton)
				String lTagSubmitCallMeBackModalForm='callmebackModal'
				String lLocatorSubmitCallMeBackModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalForm)
				Boolean lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackModalForm,10)
				lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackModalForm)
				if(!lIsSubmitCallMeBackModalFormDisplayed){
					lElementSubmitCallMeBackOpenButton=null
					lIsSubmitCallMeBack=false
				}
			}
			if(lIsSubmitCallMeBack){
				String lTagSubmitCallMeBackMobileInputText='callmeback-mobile'
				String lLocatoSubmitCallMeBackMobileInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackMobileInputText)
				WebElement lElementSubmitCallMeBackMobileInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackMobileInputText)
				if(lElementSubmitCallMeBackMobileInputText){
					lCallMeBackMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementSubmitCallMeBackMobileInputText,lCallMeBackMobileText)
				}
				String lTagCheckboxCallMeBackConsent='callMeBackModal-userAcceptConsent'
				String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
				WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
				if(lElementCheckboxCallMeBackConsent){
					String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
					Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
					if(!lIsCheckboxCallMeBackConsentStage){
						IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
					}
				}
				String lTagSubmitCallMeBackModalFormSubmitButton='callmeback-submit'
				String lLocatoSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormSubmitButton)
				WebElement lElementSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormSubmitButton)
				if(lElementSubmitCallMeBackModalFormSubmitButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					String lTagSubmitCallMeBackSuccessForm='callmebackModal'
					String lLocatorSubmitCallMeBackSuccessForm=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackSuccessForm)
					Boolean lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackSuccessForm,10)
					lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackSuccessForm)
					if(lIsSubmitCallMeBackSuccessFormDisplayed){
						String lTagSubmitCallMeBackSuccessFormDismissButton='callmeback-close'
						String lLocatoSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackSuccessFormDismissButton)
						WebElement lElementSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackSuccessFormDismissButton)
						if(lElementSubmitCallMeBackSuccessFormDismissButton){
							lIsOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubmitCallMeBackSuccessFormDismissButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}
				String lTagSubmitCallMeBackModalFormCloseButton='callmeback-title-close'
				String lLocatoSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormCloseButton)
				WebElement lElementSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormCloseButton)
				if(lElementSubmitCallMeBackModalFormCloseButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			this.waitUntilOpportunityNumberUpdated()
			lSubmitCallMeBack=IGNUemaHelper.convertBooleanToYesNoString(lIsSubmitCallMeBack)
			if(!lElementSubmitCallMeBackOpenButton){
				lSubmitCallMeBack='No Option'
			}
			if(!lIsSubmitCallMeBack){
				lResult=lSubmitCallMeBack.length()>0
			}else{
				lResult=lIsOK
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
	public Map inputSubmitCallMeBackB(String strSubmitCallMeBack,String strCallMeBackEmail,String strCallMeBackMobile){
		Map lreturn=[:]
		String lSubmitCallMeBack=strSubmitCallMeBack.trim()
		if(lSubmitCallMeBack.length()<=0){
			lSubmitCallMeBack=THAMotorBikeQuotationDetail1Type.DEFAULT_SUBMIT_CALL_ME_BACK
		}
		String lCallMeBackEmail=strCallMeBackEmail.trim()
		if(lCallMeBackEmail.length()<=0){
			lCallMeBackEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_EMAIL
		}
		String lCallMeBackMobile=strCallMeBackMobile.trim()
		if(lCallMeBackMobile.length()<=0){
			lCallMeBackMobile=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_MOBILE
		}
		try{
			Boolean lResult=false
			lreturn.put('SubmitCallMeBack','')
			lreturn.put('CallMeBackEmail','')
			lreturn.put('CallMeBackMobile','')
			lreturn.put('Result',lResult)
			Boolean lIsSubmitCallMeBack=IGNUemaHelper.convertStringToBoolean(lSubmitCallMeBack)
			String lCallMeBackEmailText=lCallMeBackEmail
			String lCallMeBackMobileText=lCallMeBackMobile
			lSubmitCallMeBack=''
			lCallMeBackEmail=''
			lCallMeBackMobile=''
			Boolean lIsOK=false
			String lTagSubmitCallMeBackOpenButton='a-callmeback-img'
			String lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
			WebElement lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			if(!lElementSubmitCallMeBackOpenButton){
				lTagSubmitCallMeBackOpenButton='a-callmeback-text'
				lLocatorSubmitCallMeBackOpenButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackOpenButton)
				lElementSubmitCallMeBackOpenButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackOpenButton)
			}
			if(!lElementSubmitCallMeBackOpenButton){
				lIsSubmitCallMeBack=false
			}
			if(lIsSubmitCallMeBack){
				IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackOpenButton)
				IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackOpenButton)
				String lTagSubmitCallMeBackModalForm='callmebackModal'
				String lLocatorSubmitCallMeBackModalForm=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalForm)
				Boolean lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackModalForm,10)
				lIsSubmitCallMeBackModalFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackModalForm)
				if(!lIsSubmitCallMeBackModalFormDisplayed){
					lElementSubmitCallMeBackOpenButton=null
					lIsSubmitCallMeBack=false
				}
			}
			if(lIsSubmitCallMeBack){
				String lTagSubmitCallMeBackMobileInputText='callmeback-mobile'
				String lLocatoSubmitCallMeBackMobileInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackMobileInputText)
				WebElement lElementSubmitCallMeBackMobileInputText=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackMobileInputText)
				if(lElementSubmitCallMeBackMobileInputText){
					lCallMeBackMobile=IGNUemaHelper.typeTextByWebElement(this.driver,lElementSubmitCallMeBackMobileInputText,lCallMeBackMobileText)
				}
				String lTagCheckboxCallMeBackConsent='callMeBackModal-userAcceptConsent'
				String lLocatorCheckboxCallMeBackConsent=IGNUemaHelper.getTagDataSeleniumKey(lTagCheckboxCallMeBackConsent)
				WebElement lElementCheckboxCallMeBackConsent=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCheckboxCallMeBackConsent)
				if(lElementCheckboxCallMeBackConsent){
					String lCheckboxCallMeBackConsentStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCheckboxCallMeBackConsent)
					Boolean lIsCheckboxCallMeBackConsentStage=IGNUemaHelper.convertStringToBoolean(lCheckboxCallMeBackConsentStageStr)
					if(!lIsCheckboxCallMeBackConsentStage){
						IGNUemaHelper.webJsClickWebElementWithScroll(this.driver,lElementCheckboxCallMeBackConsent,false)
					}
				}
				String lTagSubmitCallMeBackModalFormSubmitButton='callmeback-submit'
				String lLocatoSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormSubmitButton)
				WebElement lElementSubmitCallMeBackModalFormSubmitButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormSubmitButton)
				if(lElementSubmitCallMeBackModalFormSubmitButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormSubmitButton)
					String lTagSubmitCallMeBackSuccessForm='callmebackModal'
					String lLocatorSubmitCallMeBackSuccessForm=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackSuccessForm)
					Boolean lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorSubmitCallMeBackSuccessForm,10)
					lIsSubmitCallMeBackSuccessFormDisplayed=IGNUemaHelper.checkElementVisibleWithBlockByLocatorJs(this.driver,lLocatorSubmitCallMeBackSuccessForm)
					if(lIsSubmitCallMeBackSuccessFormDisplayed){
						String lTagSubmitCallMeBackSuccessFormDismissButton='callmeback-close'
						String lLocatoSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackSuccessFormDismissButton)
						WebElement lElementSubmitCallMeBackSuccessFormDismissButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackSuccessFormDismissButton)
						if(lElementSubmitCallMeBackSuccessFormDismissButton){
							lIsOK=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementSubmitCallMeBackSuccessFormDismissButton)
							IGNUemaHelper.delayThreadSecond(3)
						}
					}
				}
				String lTagSubmitCallMeBackModalFormCloseButton='callmeback-title-close'
				String lLocatoSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagSubmitCallMeBackModalFormCloseButton)
				WebElement lElementSubmitCallMeBackModalFormCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagSubmitCallMeBackModalFormCloseButton)
				if(lElementSubmitCallMeBackModalFormCloseButton){
					IGNUemaHelper.webJsScrollToElement(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementSubmitCallMeBackModalFormCloseButton)
					IGNUemaHelper.delayThreadSecond(3)
				}
			}
			this.waitUntilOpportunityNumberUpdated()
			lSubmitCallMeBack=IGNUemaHelper.convertBooleanToYesNoString(lIsSubmitCallMeBack)
			if(!lElementSubmitCallMeBackOpenButton){
				lSubmitCallMeBack='No Option'
			}
			if(!lIsSubmitCallMeBack){
				lResult=lSubmitCallMeBack.length()>0
			}else{
				lResult=lIsOK
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
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderEmailA(strHolderEmail)
						break
					case 'B':
						lreturn=this.inputHolderEmailB(strHolderEmail)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderEmailA(strHolderEmail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderEmailA(String strHolderEmail){
		Map lreturn=[:]
		String lHolderEmail=strHolderEmail.trim()
		if(lHolderEmail.length()<=0){
			lHolderEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdEmail'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderEmail=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderEmail)
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
	public Map inputHolderEmailB(String strHolderEmail){
		Map lreturn=[:]
		String lHolderEmail=strHolderEmail.trim()
		if(lHolderEmail.length()<=0){
			lHolderEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderEmail','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdEmail'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderEmail=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderEmail)
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
		try{
			Boolean lResult=false
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderNewsletterA(strHolderNewsletter)
						break
					case 'B':
						lreturn=this.inputHolderNewsletterB(strHolderNewsletter)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderNewsletterA(strHolderNewsletter)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderNewsletterA(String strHolderNewsletter){
		Map lreturn=[:]
		String lHolderNewsletter=strHolderNewsletter.trim()
		if(lHolderNewsletter.length()<=0){
			lHolderNewsletter=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderNewsletter=IGNUemaHelper.convertStringToBoolean(lHolderNewsletter)
			String lTagButton='mb-pd1-userAcceptConsent'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementButton){
				lHolderNewsletter='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsHolderNewsletter){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}else{
					if(lIsHolderNewsletter){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lHolderNewsletter=lStageStr
			}
			lResult=lHolderNewsletter.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdEmail-next'))
			this.waitUntilOpportunityNumberUpdated()
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
	public Map inputHolderNewsletterB(String strHolderNewsletter){
		Map lreturn=[:]
		String lHolderNewsletter=strHolderNewsletter.trim()
		if(lHolderNewsletter.length()<=0){
			lHolderNewsletter=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_NEWSLETTER
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderNewsletter','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderNewsletter=IGNUemaHelper.convertStringToBoolean(lHolderNewsletter)
			String lTagButton='mb-pd1-userAcceptConsent'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementButton){
				lHolderNewsletter='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsHolderNewsletter){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}else{
					if(lIsHolderNewsletter){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lHolderNewsletter=lStageStr
			}
			lResult=lHolderNewsletter.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdEmail-next'))
			this.waitUntilOpportunityNumberUpdated()
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
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderPhoneNoA(strHolderPhoneNo)
						break
					case 'B':
						lreturn=this.inputHolderPhoneNoB(strHolderPhoneNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderPhoneNoA(strHolderPhoneNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderPhoneNoA(String strHolderPhoneNo){
		Map lreturn=[:]
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		if(lHolderPhoneNo.length()<=0){
			lHolderPhoneNo=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdMobileNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderPhoneNo=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderPhoneNo)
			lResult=lHolderPhoneNo.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdMobileNumber-next'))
			this.waitUntilOpportunityNumberUpdated()
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
	public Map inputHolderPhoneNoB(String strHolderPhoneNo){
		Map lreturn=[:]
		String lHolderPhoneNo=strHolderPhoneNo.trim()
		if(lHolderPhoneNo.length()<=0){
			lHolderPhoneNo=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPhoneNo','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdMobileNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderPhoneNo=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderPhoneNo)
			lResult=lHolderPhoneNo.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdMobileNumber-next'))
			this.waitUntilOpportunityNumberUpdated()
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
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderCallMeNowToDoA(strHolderCallMeNowToDo)
						break
					case 'B':
						lreturn=this.inputHolderCallMeNowToDoB(strHolderCallMeNowToDo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderCallMeNowToDoA(strHolderCallMeNowToDo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCallMeNowToDoA(String strHolderCallMeNowToDo){
		Map lreturn=[:]
		String lHolderCallMeNowToDo=strHolderCallMeNowToDo.trim()
		if(lHolderCallMeNowToDo.length()<=0){
			lHolderCallMeNowToDo=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			lHolderCallMeNowToDo=IGNUemaHelper.convertBooleanToString(lIsHolderCallMeNowToDo)
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
	public Map inputHolderCallMeNowToDoB(String strHolderCallMeNowToDo){
		Map lreturn=[:]
		String lHolderCallMeNowToDo=strHolderCallMeNowToDo.trim()
		if(lHolderCallMeNowToDo.length()<=0){
			lHolderCallMeNowToDo=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_CALL_ME_NOW_TO_DO
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCallMeNowToDo','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderCallMeNowToDo=IGNUemaHelper.convertStringToBoolean(lHolderCallMeNowToDo)
			lHolderCallMeNowToDo=IGNUemaHelper.convertBooleanToString(lIsHolderCallMeNowToDo)
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
		try{
			Boolean lResult=false
			lreturn.put('CallMeNow','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCallMeNowA(strCallMeNow)
						break
					case 'B':
						lreturn=this.inputCallMeNowB(strCallMeNow)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCallMeNowA(strCallMeNow)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeNowA(String strCallMeNow){
		Map lreturn=[:]
		String lCallMeNow=strCallMeNow.trim()
		if(lCallMeNow.length()<=0){
			lCallMeNow=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW
		}
		Map lCallMeNowList=['1':'No','2':'Yes','3':'Later']
		try{
			Boolean lResult=false
			lreturn.put('CallMeNow','')
			lreturn.put('Result',lResult)
			String lCallMeNowItem=lCallMeNowList.get(lCallMeNow)
			lCallMeNow=''
			if(!lCallMeNowItem){
				lCallMeNowItem=lCallMeNowList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW)
			}
			String lTagButton='callmeback'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeNowItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeNowItem)
			if(!lElementButton){
				lCallMeNowItem=lCallMeNowList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW)
				lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeNowItem)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeNowItem)
			}
			Boolean lIsCallMeNow=IGNUemaHelper.convertStringToBoolean(lCallMeNowItem)
			lCallMeNow=lCallMeNowItem
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lCallMeNow=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
					if(lIsCallMeNow){
						String lTagDialogButton='callme-success-modal-close'
						String lLocatorDialogButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDialogButton)
						Boolean lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,3)
						WebElement lElementDialogButton=null
						if(!lModalVisible){
							lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,5)
							if(!lModalVisible){
								lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,8)
							}
						}
						if(lModalVisible){
							lElementDialogButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDialogButton)
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementDialogButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDialogButton)
						}
					}
				}else{
					lCallMeNow=''
				}
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
	public Map inputCallMeNowB(String strCallMeNow){
		Map lreturn=[:]
		String lCallMeNow=strCallMeNow.trim()
		if(lCallMeNow.length()<=0){
			lCallMeNow=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW
		}
		Map lCallMeNowList=['1':'No','2':'Yes','3':'Later']
		try{
			Boolean lResult=false
			lreturn.put('CallMeNow','')
			lreturn.put('Result',lResult)
			String lCallMeNowItem=lCallMeNowList.get(lCallMeNow)
			lCallMeNow=''
			if(!lCallMeNowItem){
				lCallMeNowItem=lCallMeNowList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW)
			}
			Boolean lIsCallMeNow=IGNUemaHelper.convertStringToBoolean(lCallMeNowItem)
			String lTagCallMeNowButton='callmeback'
			String lLocatorCallMeNowButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeNowButton)
			WebElement lElementCallMeNowButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeNowButton)
			if(!lElementCallMeNowButton){
				return lreturn
			}else{
				String lTagCallMeNowButtonValue=''
				String lLocatorCallMeNowButtonValue=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCallMeNowButton,lCallMeNowItem)
				WebElement lElementCallMeNowButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCallMeNowButton,lCallMeNowItem)
				if(!lElementCallMeNowButtonValue){
					if(lIsCallMeNow){
						lTagCallMeNowButtonValue='YesLater'
						lLocatorCallMeNowButtonValue=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCallMeNowButton,lTagCallMeNowButtonValue)
						lElementCallMeNowButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCallMeNowButton,lTagCallMeNowButtonValue)
					}
				}
				if(!lElementCallMeNowButtonValue){
					lCallMeNowItem=lCallMeNowList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_NOW)
					lLocatorCallMeNowButtonValue=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagCallMeNowButton,lCallMeNowItem)
					lElementCallMeNowButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagCallMeNowButton,lCallMeNowItem)
				}
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCallMeNowButtonValue)){
					lCallMeNow=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCallMeNowButtonValue)
					if(lIsCallMeNow){
						lCallMeNow=lCallMeNowItem
						String lTagDialogButton='callme-success-modal-close'
						String lLocatorDialogButton=IGNUemaHelper.getTagDataSeleniumKey(lTagDialogButton)
						Boolean lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,3)
						WebElement lElementDialogButton=null
						if(!lModalVisible){
							lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,5)
							if(!lModalVisible){
								lModalVisible=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorDialogButton,8)
							}
						}
						if(lModalVisible){
							lElementDialogButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagDialogButton)
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementDialogButton)
							IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementDialogButton)
						}
					}
				}else{
					lCallMeNow=''
				}
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
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCallMeBackAtDayA(strCallMeBackAtDay)
						break
					case 'B':
						lreturn=this.inputCallMeBackAtDayB(strCallMeBackAtDay)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCallMeBackAtDayA(strCallMeBackAtDay)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeBackAtDayA(String strCallMeBackAtDay){
		Map lreturn=[:]
		String lCallMeBackAtDay=strCallMeBackAtDay.trim()
		if(lCallMeBackAtDay.length()<=0){
			lCallMeBackAtDay=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY
		}
		Map lCallMeBackAtDayList=['1':'Today','2':'Tomorrow','3':'Later']
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('Result',lResult)
			String lCallMeBackAtDayItem=lCallMeBackAtDayList.get(lCallMeBackAtDay)
			lCallMeBackAtDay=''
			if(!lCallMeBackAtDayItem){
				lCallMeBackAtDayItem=lCallMeBackAtDayList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY)
			}
			String lTagButton='callmebackrequest'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtDayItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtDayItem)
			if(!lElementButton){
				lCallMeBackAtDayItem=lCallMeBackAtDayList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY)
				lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtDayItem)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtDayItem)
			}
			if(!lElementButton){
				lCallMeBackAtDay='No Option'
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lCallMeBackAtDay=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lCallMeBackAtDay=''
				}
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
	public Map inputCallMeBackAtDayB(String strCallMeBackAtDay){
		Map lreturn=[:]
		String lCallMeBackAtDay=strCallMeBackAtDay.trim()
		if(lCallMeBackAtDay.length()<=0){
			lCallMeBackAtDay=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY
		}
		Map lCallMeBackAtDayList=['1':'Today','2':'Tomorrow','3':'Later']
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtDay','')
			lreturn.put('Result',lResult)
			String lTagCallMeBackAtDayModalForm=''
			String lLocatorCallMeBackAtDayModalForm='#schedule4date'
			Boolean lIsCallMeBackAtDayModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorCallMeBackAtDayModalForm,10)
			lIsCallMeBackAtDayModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCallMeBackAtDayModalForm)
			if(!lIsCallMeBackAtDayModalFormDisplayed){
				lCallMeBackAtDay='No Option'
			}else{
				String lCallMeBackAtDayItem=lCallMeBackAtDayList.get(lCallMeBackAtDay)
				lCallMeBackAtDay=''
				if(!lCallMeBackAtDayItem){
					lCallMeBackAtDayItem=lCallMeBackAtDayList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY)
				}
				String lTagButton='schedule-today'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtDayItem)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtDayItem)
				if(!lElementButton){
					lCallMeBackAtDayItem=lCallMeBackAtDayList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_DAY)
					lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtDayItem)
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtDayItem)
				}
				if(!lElementButton){
					lCallMeBackAtDay='No Option'
				}else{
					lCallMeBackAtDay=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
						String lTagCallMeBackAtDayModalFormEnd=''
						String lLocatorCallMeBackAtDayModalFormEnd='#schedule4end'
						Boolean lIsCallMeBackAtDayModalFormEnd=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCallMeBackAtDayModalFormEnd)
						if(lIsCallMeBackAtDayModalFormEnd){
							String lTagCallMeBackAtDayCloseButton='schedule-close'
							String lLocatorCallMeBackAtDayCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeBackAtDayCloseButton)
							WebElement lElementCallMeBackAtDayCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeBackAtDayCloseButton)
							if(!lElementCallMeBackAtDayCloseButton){
								lLocatorCallMeBackAtDayCloseButton='#schedule2call button'
								lElementCallMeBackAtDayCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCallMeBackAtDayCloseButton)
							}
							IGNUemaHelper.webJsScrollToElement(this.driver,lElementCallMeBackAtDayCloseButton)
							IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCallMeBackAtDayCloseButton)
						}
					}else{
						lCallMeBackAtDay=''
					}
				}
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
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCallMeBackAtTimeA(strCallMeBackAtTime)
						break
					case 'B':
						lreturn=this.inputCallMeBackAtTimeB(strCallMeBackAtTime)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCallMeBackAtTimeA(strCallMeBackAtTime)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallMeBackAtTimeA(String strCallMeBackAtTime){
		Map lreturn=[:]
		String lCallMeBackAtTime=strCallMeBackAtTime.trim()
		if(lCallMeBackAtTime.length()<=0){
			lCallMeBackAtTime=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME
		}
		Map lCallMeBackAtTimeList=['1':'Morning','2':'Lunch','3':'Afternoon','4':'Evening']
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('Result',lResult)
			String lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(lCallMeBackAtTime)
			lCallMeBackAtTime=''
			if(!lCallMeBackAtTimeItem){
				lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME)
			}
			String lTagButton='callmebacktime'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtTimeItem)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtTimeItem)
			if(!lElementButton){
				lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME)
				lLocatorButton=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtTimeItem)
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtTimeItem)
			}
			if(!lElementButton){
				lCallMeBackAtTime='No Option'
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lCallMeBackAtTime=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lCallMeBackAtTime=''
				}
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
	public Map inputCallMeBackAtTimeB(String strCallMeBackAtTime){
		Map lreturn=[:]
		String lCallMeBackAtTime=strCallMeBackAtTime.trim()
		if(lCallMeBackAtTime.length()<=0){
			lCallMeBackAtTime=THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME
		}
		Map lCallMeBackAtTimeList=['1':'08.00','2':'12.00','3':'14.00','4':'18.00']
		try{
			Boolean lResult=false
			lreturn.put('CallMeBackAtTime','')
			lreturn.put('Result',lResult)
			String lTagCallMeBackAtTimeModalForm=''
			String lLocatorCallMeBackAtTimeModalForm='#schedule4time'
			Boolean lIsCallMeBackAtTimeModalFormDisplayed=IGNUemaHelper.waitElementVisibleByLocator(this.driver,lLocatorCallMeBackAtTimeModalForm,10)
			lIsCallMeBackAtTimeModalFormDisplayed=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCallMeBackAtTimeModalForm)
			if(!lIsCallMeBackAtTimeModalFormDisplayed){
				lCallMeBackAtTime='No Option'
			}else{
				String lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(lCallMeBackAtTime)
				lCallMeBackAtTime=''
				if(!lCallMeBackAtTimeItem){
					lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME)
				}
				String lTagButton='schedule-slot'
				String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
				WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
				if(!lElementButton){
					lCallMeBackAtTime='No Option'
				}else{
					String lTagCallMeBackAtTimeButtonValue=''
					String lLocatorCallMeBackAtTimeButtonValue=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtTimeItem)
					WebElement lElementCallMeBackAtTimeButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtTimeItem)
					if(!lElementCallMeBackAtTimeButtonValue){
						lCallMeBackAtTimeItem=lCallMeBackAtTimeList.get(THAMotorBikeQuotationDetail1Type.DEFAULT_CALL_ME_BACK_AT_TIME)
						lLocatorCallMeBackAtTimeButtonValue=IGNUemaHelper.getTagDataSeleniumKeyValueEqual(lTagButton,lCallMeBackAtTimeItem)
						lElementCallMeBackAtTimeButtonValue=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueEqual(this.driver,lTagButton,lCallMeBackAtTimeItem)
					}
					String lCallMeBackAtTimeText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCallMeBackAtTimeButtonValue)
					if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCallMeBackAtTimeButtonValue)){
						lCallMeBackAtTime=lCallMeBackAtTimeText.trim()
					}else{
						lCallMeBackAtTimeText=''
						Boolean lIsCallMeBackAtTimeDisplayed=false
						List<WebElement> lElementCallMeBackAtTimeList=IGNUemaHelper.getWebElementListFromDataSeleniumKey(this.driver,lTagButton)
						if(lElementCallMeBackAtTimeList){
							for(WebElement lElementCallMeBackAtTimeItem in lElementCallMeBackAtTimeList){
								IGNUemaHelper.delayThreadSecond(1)
								lIsCallMeBackAtTimeDisplayed=IGNUemaHelper.getElementAttributeByWebElement(this.driver,lElementCallMeBackAtTimeItem,'disabled')
								if(!lIsCallMeBackAtTimeDisplayed){
									lCallMeBackAtTimeText=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementCallMeBackAtTimeItem)
									IGNUemaHelper.webJsClickWebElementFinalWithScroll(this.driver,lElementCallMeBackAtTimeItem)
									IGNUemaHelper.delayThreadSecond(1)
									break
								}
							}
						}
						lCallMeBackAtTime=lCallMeBackAtTimeText.trim()
					}
					String lTagCallMeBackAtTimeModalFormEnd=''
					String lLocatorCallMeBackAtTimeModalFormEnd='#schedule4end'
					Boolean lIsCallMeBackAtTimeModalFormEnd=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorCallMeBackAtTimeModalFormEnd)
					if(lIsCallMeBackAtTimeModalFormEnd){
						String lTagCallMeBackAtTimeCloseButton='schedule-close'
						String lLocatorCallMeBackAtTimeCloseButton=IGNUemaHelper.getTagDataSeleniumKey(lTagCallMeBackAtTimeCloseButton)
						WebElement lElementCallMeBackAtTimeCloseButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagCallMeBackAtTimeCloseButton)
						if(!lElementCallMeBackAtTimeCloseButton){
							lLocatorCallMeBackAtTimeCloseButton='#schedule2call button'
							lElementCallMeBackAtTimeCloseButton=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorCallMeBackAtTimeCloseButton)
						}
						IGNUemaHelper.delayThreadSecond(3)
						IGNUemaHelper.webJsScrollToElement(this.driver,lElementCallMeBackAtTimeCloseButton)
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementCallMeBackAtTimeCloseButton)
					}
				}
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
		try{
			Boolean lResult=false
			lreturn.put('HolderIsPerson','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderIsPersonA(strHolderIsPerson)
						break
					case 'B':
						lreturn=this.inputHolderIsPersonB(strHolderIsPerson)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderIsPersonA(strHolderIsPerson)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsPersonA(String strHolderIsPerson){
		Map lreturn=[:]
		String lHolderIsPerson=strHolderIsPerson.trim()
		if(lHolderIsPerson.length()<=0){
			lHolderIsPerson=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_PERSON
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsPerson','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
			String lTagButton='hdCarOwnership'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsPerson){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsPerson=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsPerson=''
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
	public Map inputHolderIsPersonB(String strHolderIsPerson){
		Map lreturn=[:]
		String lHolderIsPerson=strHolderIsPerson.trim()
		if(lHolderIsPerson.length()<=0){
			lHolderIsPerson=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_PERSON
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsPerson','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsPerson=IGNUemaHelper.convertStringToBoolean(lHolderIsPerson)
			String lTagButton='hdCarOwnership'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsPerson){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsPerson=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsPerson=''
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
		try{
			Boolean lResult=false
			lreturn.put('HolderIsMain','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderIsMainA(strHolderIsMain)
						break
					case 'B':
						lreturn=this.inputHolderIsMainB(strHolderIsMain)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderIsMainA(strHolderIsMain)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsMainA(String strHolderIsMain){
		Map lreturn=[:]
		String lHolderIsMain=strHolderIsMain.trim()
		if(lHolderIsMain.length()<=0){
			lHolderIsMain=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsMain','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
			String lTagButton='hdOwnerIs'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsMain){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				IGNUemaHelper.delayThreadMilliSecond(3)
				if(lIsHolderIsMain){
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
				}else{
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
				}
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsMain=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsMain=''
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
	public Map inputHolderIsMainB(String strHolderIsMain){
		Map lreturn=[:]
		String lHolderIsMain=strHolderIsMain.trim()
		if(lHolderIsMain.length()<=0){
			lHolderIsMain=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_MAIN
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsMain','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsMain=IGNUemaHelper.convertStringToBoolean(lHolderIsMain)
			String lTagButton='hdOwnerIs'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsMain){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				IGNUemaHelper.delayThreadMilliSecond(3)
				if(lIsHolderIsMain){
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
				}else{
					lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
				}
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsMain=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsMain=''
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
		try{
			Boolean lResult=false
			lreturn.put('CarForCommercial','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarForCommercialA(strCarForCommercial)
						break
					case 'B':
						lreturn=this.inputCarForCommercialB(strCarForCommercial)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarForCommercialA(strCarForCommercial)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarForCommercialA(String strCarForCommercial){
		Map lreturn=[:]
		String lCarForCommercial=strCarForCommercial.trim()
		if(lCarForCommercial.length()<=0){
			lCarForCommercial=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_FOR_COMMERCIAL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarForCommercial','')
			lreturn.put('Result',lResult)
			Boolean lIsCarForCommercial=IGNUemaHelper.convertStringToBoolean(lCarForCommercial)
			String lTagButton='commercialPurpose'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsCarForCommercial){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				lCarForCommercial='No Option'
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lCarForCommercial=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lCarForCommercial=''
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
	public Map inputCarForCommercialB(String strCarForCommercial){
		Map lreturn=[:]
		String lCarForCommercial=strCarForCommercial.trim()
		if(lCarForCommercial.length()<=0){
			lCarForCommercial=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_FOR_COMMERCIAL
		}
		try{
			Boolean lResult=false
			lreturn.put('CarForCommercial','')
			lreturn.put('Result',lResult)
			Boolean lIsCarForCommercial=IGNUemaHelper.convertStringToBoolean(lCarForCommercial)
			String lTagButton='commercialPurpose'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsCarForCommercial){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				lCarForCommercial='No Option'
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lCarForCommercial=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lCarForCommercial=''
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
		try{
			Boolean lResult=false
			lreturn.put('CarPlateNumber','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarPlateNumberA(strCarPlateNumber)
						break
					case 'B':
						lreturn=this.inputCarPlateNumberB(strCarPlateNumber)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarPlateNumberA(strCarPlateNumber)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarPlateNumberA(String strCarPlateNumber){
		Map lreturn=[:]
		String lCarPlateNumber=strCarPlateNumber.trim()
		if(lCarPlateNumber.length()<=0){
			lCarPlateNumber=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_PLATE_NUMBER
		}
		if(lCarPlateNumber.length()<=0){
			lCarPlateNumber=IGNUemaHelper.randomCarPlateNumberThailand()
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateNumber','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdCarPlateNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCarPlateNumber=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCarPlateNumber)
			lResult=lCarPlateNumber.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdCarPlateNumber-next'))
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
	public Map inputCarPlateNumberB(String strCarPlateNumber){
		Map lreturn=[:]
		String lCarPlateNumber=strCarPlateNumber.trim()
		if(lCarPlateNumber.length()<=0){
			lCarPlateNumber=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_PLATE_NUMBER
		}
		if(lCarPlateNumber.length()<=0){
			lCarPlateNumber=IGNUemaHelper.randomCarPlateNumberThailand()
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateNumber','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdCarPlateNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lCarPlateNumber=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lCarPlateNumber)
			lResult=lCarPlateNumber.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdCarPlateNumber-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('CarPlateProvince','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputCarPlateProvinceA(strCarPlateProvince)
						break
					case 'B':
						lreturn=this.inputCarPlateProvinceB(strCarPlateProvince)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputCarPlateProvinceA(strCarPlateProvince)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarPlateProvinceA(String strCarPlateProvince){
		Map lreturn=[:]
		String lCarPlateProvince=strCarPlateProvince.trim()
		if(lCarPlateProvince.length()<=0){
			lCarPlateProvince=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_PLATE_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateProvince','')
			lreturn.put('Result',lResult)
			String lTagButton='select-province'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='province-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarPlateProvince='No Option'
			}else{
				lCarPlateProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarPlateProvince,true)
			}
			lResult=lCarPlateProvince.length()>0
			if(lResult){
				lreturn.put('CarPlateProvince',lCarPlateProvince)
				lreturn.put('Result',lResult)
			}
			IGNUemaHelper.delayThreadSecond(1)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('nextProcess'))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCarPlateProvinceB(String strCarPlateProvince){
		Map lreturn=[:]
		String lCarPlateProvince=strCarPlateProvince.trim()
		if(lCarPlateProvince.length()<=0){
			lCarPlateProvince=THAMotorBikeQuotationDetail1Type.DEFAULT_CAR_PLATE_PROVINCE
		}
		try{
			Boolean lResult=false
			lreturn.put('CarPlateProvince','')
			lreturn.put('Result',lResult)
			String lTagButton='select-province'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='province-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lCarPlateProvince='No Option'
			}else{
				lCarPlateProvince=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lCarPlateProvince,true)
			}
			lResult=lCarPlateProvince.length()>0
			if(lResult){
				lreturn.put('CarPlateProvince',lCarPlateProvince)
				lreturn.put('Result',lResult)
			}
			IGNUemaHelper.delayThreadSecond(1)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('nextProcess'))
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final Map DEFAULT_LIST_SEX_MARITAL_STATUS=['MALE SINGLE':'Male-Single','MALE MARRIED':'Male-Married','FEMALE SINGLE':'Female-Single','FEMALE MARRIED':'Female-Married']
	public Map inputHolderStatus(String strHolderStatus){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('HolderStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderStatusA(strHolderStatus)
						break
					case 'B':
						lreturn=this.inputHolderStatusB(strHolderStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderStatusA(strHolderStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderStatusA(String strHolderStatus){
		Map lreturn=[:]
		String lHolderStatus=strHolderStatus.toUpperCase().trim()
		try{
			String lHolderStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lHolderStatus)
			if(!lHolderStatusItem){
				lHolderStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('HolderStatus','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('ownerEdit'))
			String lTagButton='ownerGender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lHolderStatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderStatus=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderStatus=''
				}
			}
			lHolderStatus=IGNUemaHelper.convertStringAsTitleCase(lHolderStatus)
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
	public Map inputHolderStatusB(String strHolderStatus){
		Map lreturn=[:]
		String lHolderStatus=strHolderStatus.toUpperCase().trim()
		try{
			String lHolderStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lHolderStatus)
			if(!lHolderStatusItem){
				lHolderStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('HolderStatus','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('ownerEdit'))
			String lTagButton='ownerGender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lHolderStatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderStatus=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderStatus=''
				}
			}
			lHolderStatus=IGNUemaHelper.convertStringAsTitleCase(lHolderStatus)
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
		try{
			Boolean lResult=false
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderDobA(strHolderDob)
						break
					case 'B':
						lreturn=this.inputHolderDobB(strHolderDob)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderDobA(strHolderDob)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderDobA(String strHolderDob){
		Map lreturn=[:]
		String lHolderDob=strHolderDob.trim()
		if(lHolderDob.length()<=0){
			lHolderDob=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			String lHolderDobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lHolderDob)
			String lHolderDobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lHolderDob)
			String lHolderDobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lHolderDob)
			lHolderDob=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lHolderDobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lHolderDobDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lHolderDobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lHolderDobMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lHolderDobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lHolderDobYYYY)
			lHolderDob=lHolderDobDD+'/'+lHolderDobMM+'/'+lHolderDobYYYY
			String lTagButtonNext='ownerinfo-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputHolderDobB(String strHolderDob){
		Map lreturn=[:]
		String lHolderDob=strHolderDob.trim()
		if(lHolderDob.length()<=0){
			lHolderDob=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderDob','')
			lreturn.put('Result',lResult)
			String lHolderDobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lHolderDob)
			String lHolderDobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lHolderDob)
			String lHolderDobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lHolderDob)
			lHolderDob=''
			String lTagInputTextDD='dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lHolderDobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lHolderDobDD)
			String lTagInputTextMM='mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lHolderDobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lHolderDobMM)
			String lTagInputTextYYYY='yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lHolderDobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lHolderDobYYYY)
			lHolderDob=lHolderDobDD+'/'+lHolderDobMM+'/'+lHolderDobYYYY
			String lTagButtonNext='ownerinfo-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('HolderIsThai','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderIsThaiA(strHolderIsThai)
						break
					case 'B':
						lreturn=this.inputHolderIsThaiB(strHolderIsThai)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderIsThaiA(strHolderIsThai)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderIsThaiA(String strHolderIsThai){
		Map lreturn=[:]
		String lHolderIsThai=strHolderIsThai.trim()
		if(lHolderIsThai.length()<=0){
			lHolderIsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
			String lTagButton='owner-thaiNationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsThai=''
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
	public Map inputHolderIsThaiB(String strHolderIsThai){
		Map lreturn=[:]
		String lHolderIsThai=strHolderIsThai.trim()
		if(lHolderIsThai.length()<=0){
			lHolderIsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderIsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsHolderIsThai=IGNUemaHelper.convertStringToBoolean(lHolderIsThai)
			String lTagButton='owner-thaiNationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsHolderIsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lHolderIsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lHolderIsThai=''
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
		try{
			Boolean lResult=false
			lreturn.put('HolderThaiId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderThaiIdA(strHolderThaiId)
						break
					case 'B':
						lreturn=this.inputHolderThaiIdB(strHolderThaiId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderThaiIdA(strHolderThaiId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderThaiIdA(String strHolderThaiId){
		Map lreturn=[:]
		String lHolderThaiId=strHolderThaiId.trim()
		if(lHolderThaiId.length()<=0){
			lHolderThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderThaiId)
			lResult=lHolderThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-idcard-next'))
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
	public Map inputHolderThaiIdB(String strHolderThaiId){
		Map lreturn=[:]
		String lHolderThaiId=strHolderThaiId.trim()
		if(lHolderThaiId.length()<=0){
			lHolderThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderThaiId)
			lResult=lHolderThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-idcard-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderOccupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderOccupationA(strHolderOccupation)
						break
					case 'B':
						lreturn=this.inputHolderOccupationB(strHolderOccupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderOccupationA(strHolderOccupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderOccupationA(String strHolderOccupation){
		Map lreturn=[:]
		String lHolderOccupation=strHolderOccupation.trim()
		if(lHolderOccupation.length()<=0){
			lHolderOccupation=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderOccupation','')
			lreturn.put('Result',lResult)
			String lTagButton='owner-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='owner-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lHolderOccupation='No Option'
			}else{
				lHolderOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lHolderOccupation,true)
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
	public Map inputHolderOccupationB(String strHolderOccupation){
		Map lreturn=[:]
		String lHolderOccupation=strHolderOccupation.trim()
		if(lHolderOccupation.length()<=0){
			lHolderOccupation=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderOccupation','')
			lreturn.put('Result',lResult)
			String lTagButton='owner-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='owner-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lHolderOccupation='No Option'
			}else{
				lHolderOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lHolderOccupation,true)
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
		try{
			Boolean lResult=false
			lreturn.put('HolderPassport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderPassportA(strHolderPassport)
						break
					case 'B':
						lreturn=this.inputHolderPassportB(strHolderPassport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderPassportA(strHolderPassport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderPassportA(String strHolderPassport){
		Map lreturn=[:]
		String lHolderPassport=strHolderPassport.trim()
		if(lHolderPassport.length()<=0){
			lHolderPassport=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPassport','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderPassport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderPassport)
			lResult=lHolderPassport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-passport-next'))
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
	public Map inputHolderPassportB(String strHolderPassport){
		Map lreturn=[:]
		String lHolderPassport=strHolderPassport.trim()
		if(lHolderPassport.length()<=0){
			lHolderPassport=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderPassport','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderPassport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderPassport)
			lResult=lHolderPassport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-passport-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderCountry','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderCountryA(strHolderCountry)
						break
					case 'B':
						lreturn=this.inputHolderCountryB(strHolderCountry)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderCountryA(strHolderCountry)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCountryA(String strHolderCountry){
		Map lreturn=[:]
		String lHolderCountry=strHolderCountry.trim()
		if(lHolderCountry.length()<=0){
			lHolderCountry=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCountry','')
			lreturn.put('Result',lResult)
			String lTagButton='owner-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='owner-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lHolderCountry='No Option'
			}else{
				lHolderCountry=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lHolderCountry,true)
			}
			lResult=lHolderCountry.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-passport-country-next'))
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
	public Map inputHolderCountryB(String strHolderCountry){
		Map lreturn=[:]
		String lHolderCountry=strHolderCountry.trim()
		if(lHolderCountry.length()<=0){
			lHolderCountry=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCountry','')
			lreturn.put('Result',lResult)
			String lTagButton='owner-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='owner-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lHolderCountry='No Option'
			}else{
				lHolderCountry=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lHolderCountry,true)
			}
			lResult=lHolderCountry.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-passport-country-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderName','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderNameA(strHolderName)
						break
					case 'B':
						lreturn=this.inputHolderNameB(strHolderName)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderNameA(strHolderName)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderNameA(String strHolderName){
		Map lreturn=[:]
		String lHolderName=strHolderName.trim()
		if(lHolderName.length()<=0){
			lHolderName=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderName','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderName)
			lResult=lHolderName.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-firstname-next'))
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
	public Map inputHolderNameB(String strHolderName){
		Map lreturn=[:]
		String lHolderName=strHolderName.trim()
		if(lHolderName.length()<=0){
			lHolderName=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderName','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderName)
			lResult=lHolderName.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-firstname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderSurname','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderSurnameA(strHolderSurname)
						break
					case 'B':
						lreturn=this.inputHolderSurnameB(strHolderSurname)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderSurnameA(strHolderSurname)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderSurnameA(String strHolderSurname){
		Map lreturn=[:]
		String lHolderSurname=strHolderSurname.trim()
		if(lHolderSurname.length()<=0){
			lHolderSurname=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderSurname','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderSurname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderSurname)
			lResult=lHolderSurname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-lastname-next'))
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
	public Map inputHolderSurnameB(String strHolderSurname){
		Map lreturn=[:]
		String lHolderSurname=strHolderSurname.trim()
		if(lHolderSurname.length()<=0){
			lHolderSurname=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderSurname','')
			lreturn.put('Result',lResult)
			String lTagInputText='owner-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderSurname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderSurname)
			lResult=lHolderSurname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('owner-lastname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderCompId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderCompIdA(strHolderCompId)
						break
					case 'B':
						lreturn=this.inputHolderCompIdB(strHolderCompId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderCompIdA(strHolderCompId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCompIdA(String strHolderCompId){
		Map lreturn=[:]
		String lHolderCompId=strHolderCompId.trim()
		if(lHolderCompId.length()<=0){
			lHolderCompId=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COMP_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompId','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdBusinessRegistrationNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderCompId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderCompId)
			lResult=lHolderCompId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdBusinessRegistrationNumber-next'))
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
	public Map inputHolderCompIdB(String strHolderCompId){
		Map lreturn=[:]
		String lHolderCompId=strHolderCompId.trim()
		if(lHolderCompId.length()<=0){
			lHolderCompId=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COMP_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompId','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdBusinessRegistrationNumber'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderCompId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderCompId)
			lResult=lHolderCompId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('hdBusinessRegistrationNumber-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('HolderCompName','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputHolderCompNameA(strHolderCompName)
						break
					case 'B':
						lreturn=this.inputHolderCompNameB(strHolderCompName)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputHolderCompNameA(strHolderCompName)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputHolderCompNameA(String strHolderCompName){
		Map lreturn=[:]
		String lHolderCompName=strHolderCompName.trim()
		if(lHolderCompName.length()<=0){
			lHolderCompName=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COMP_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompName','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdCompanyname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderCompName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderCompName)
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
	public Map inputHolderCompNameB(String strHolderCompName){
		Map lreturn=[:]
		String lHolderCompName=strHolderCompName.trim()
		if(lHolderCompName.length()<=0){
			lHolderCompName=THAMotorBikeQuotationDetail1Type.DEFAULT_HOLDER_COMP_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('HolderCompName','')
			lreturn.put('Result',lResult)
			String lTagInputText='hdCompanyname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lHolderCompName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lHolderCompName)
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
		try{
			Boolean lResult=false
			lreturn.put('MainStatus','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainStatusA(strMainStatus)
						break
					case 'B':
						lreturn=this.inputMainStatusB(strMainStatus)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainStatusA(strMainStatus)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainStatusA(String strMainStatus){
		Map lreturn=[:]
		String lMainStatus=strMainStatus.toUpperCase().trim()

		try{
			String lMainStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lMainStatus)
			if(!lMainStatusItem){
				lMainStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('MainStatus','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriverEdit'))
			IGNUemaHelper.delayThreadSecond(3)
			String lTagButton='mainDriverGender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lMainStatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lMainStatus=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lMainStatus=''
				}
			}
			lMainStatus=IGNUemaHelper.convertStringAsTitleCase(lMainStatus)
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
	public Map inputMainStatusB(String strMainStatus){
		Map lreturn=[:]
		String lMainStatus=strMainStatus.toUpperCase().trim()

		try{
			String lMainStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lMainStatus)
			if(!lMainStatusItem){
				lMainStatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('MainStatus','')
			lreturn.put('Result',lResult)
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriverEdit'))
			IGNUemaHelper.delayThreadSecond(3)
			String lTagButton='mainDriverGender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lMainStatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lMainStatus=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lMainStatus=''
				}
			}
			lMainStatus=IGNUemaHelper.convertStringAsTitleCase(lMainStatus)
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
		try{
			Boolean lResult=false
			lreturn.put('MainDob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainDobA(strMainDob)
						break
					case 'B':
						lreturn=this.inputMainDobB(strMainDob)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainDobA(strMainDob)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainDobA(String strMainDob){
		Map lreturn=[:]
		String lMainDob=strMainDob.trim()
		if(lMainDob.length()<=0){
			lMainDob=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('MainDob','')
			lreturn.put('Result',lResult)
			String lMainDobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lMainDob)
			String lMainDobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lMainDob)
			String lMainDobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lMainDob)
			lMainDob=''
			String lTagInputTextDD='mainDriver-dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lMainDobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lMainDobDD)
			String lTagInputTextMM='mainDriver-mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lMainDobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lMainDobMM)
			String lTagInputTextYYYY='mainDriver-yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lMainDobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lMainDobYYYY)
			lMainDob=lMainDobDD+'/'+lMainDobMM+'/'+lMainDobYYYY
			String lTagButtonNext='mainDriverinfo-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputMainDobB(String strMainDob){
		Map lreturn=[:]
		String lMainDob=strMainDob.trim()
		if(lMainDob.length()<=0){
			lMainDob=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('MainDob','')
			lreturn.put('Result',lResult)
			String lMainDobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lMainDob)
			String lMainDobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lMainDob)
			String lMainDobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lMainDob)
			lMainDob=''
			String lTagInputTextDD='mainDriver-dd-dob'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lMainDobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lMainDobDD)
			String lTagInputTextMM='mainDriver-mm-dob'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lMainDobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lMainDobMM)
			String lTagInputTextYYYY='mainDriver-yyyy-dob'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lMainDobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lMainDobYYYY)
			lMainDob=lMainDobDD+'/'+lMainDobMM+'/'+lMainDobYYYY
			String lTagButtonNext='mainDriverinfo-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('MainIsThai','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainIsThaiA(strMainIsThai)
						break
					case 'B':
						lreturn=this.inputMainIsThaiB(strMainIsThai)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainIsThaiA(strMainIsThai)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainIsThaiA(String strMainIsThai){
		Map lreturn=[:]
		String lMainIsThai=strMainIsThai.trim()
		if(lMainIsThai.length()<=0){
			lMainIsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('MainIsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
			String lTagButton='mainDriver-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsMainIsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lMainIsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lMainIsThai=''
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
	public Map inputMainIsThaiB(String strMainIsThai){
		Map lreturn=[:]
		String lMainIsThai=strMainIsThai.trim()
		if(lMainIsThai.length()<=0){
			lMainIsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('MainIsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsMainIsThai=IGNUemaHelper.convertStringToBoolean(lMainIsThai)
			String lTagButton='mainDriver-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsMainIsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lMainIsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lMainIsThai=''
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
		try{
			Boolean lResult=false
			lreturn.put('MainThaiId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainThaiIdA(strMainThaiId)
						break
					case 'B':
						lreturn=this.inputMainThaiIdB(strMainThaiId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainThaiIdA(strMainThaiId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainThaiIdA(String strMainThaiId){
		Map lreturn=[:]
		String lMainThaiId=strMainThaiId.trim()
		if(lMainThaiId.length()<=0){
			lMainThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('MainThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainThaiId)
			lResult=lMainThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-idcard-next'))
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
	public Map inputMainThaiIdB(String strMainThaiId){
		Map lreturn=[:]
		String lMainThaiId=strMainThaiId.trim()
		if(lMainThaiId.length()<=0){
			lMainThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('MainThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainThaiId)
			lResult=lMainThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-idcard-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainOccupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainOccupationA(strMainOccupation)
						break
					case 'B':
						lreturn=this.inputMainOccupationB(strMainOccupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainOccupationA(strMainOccupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainOccupationA(String strMainOccupation){
		Map lreturn=[:]
		String lMainOccupation=strMainOccupation.trim()
		if(lMainOccupation.length()<=0){
			lMainOccupation=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('MainOccupation','')
			lreturn.put('Result',lResult)
			String lTagButton='mainDriver-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='mainDriver-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lMainOccupation='No Option'
			}else{
				lMainOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lMainOccupation,true)
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
	public Map inputMainOccupationB(String strMainOccupation){
		Map lreturn=[:]
		String lMainOccupation=strMainOccupation.trim()
		if(lMainOccupation.length()<=0){
			lMainOccupation=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('MainOccupation','')
			lreturn.put('Result',lResult)
			String lTagButton='mainDriver-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='mainDriver-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lMainOccupation='No Option'
			}else{
				lMainOccupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lMainOccupation,true)
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
		try{
			Boolean lResult=false
			lreturn.put('MainPassport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainPassportA(strMainPassport)
						break
					case 'B':
						lreturn=this.inputMainPassportB(strMainPassport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainPassportA(strMainPassport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainPassportA(String strMainPassport){
		Map lreturn=[:]
		String lMainPassport=strMainPassport.trim()
		if(lMainPassport.length()<=0){
			lMainPassport=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPassport','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainPassport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainPassport)
			lResult=lMainPassport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-passport-next'))
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
	public Map inputMainPassportB(String strMainPassport){
		Map lreturn=[:]
		String lMainPassport=strMainPassport.trim()
		if(lMainPassport.length()<=0){
			lMainPassport=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPassport','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainPassport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainPassport)
			lResult=lMainPassport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-passport-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainCountry','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainCountryA(strMainCountry)
						break
					case 'B':
						lreturn=this.inputMainCountryB(strMainCountry)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainCountryA(strMainCountry)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainCountryA(String strMainCountry){
		Map lreturn=[:]
		String lMainCountry=strMainCountry.trim()
		if(lMainCountry.length()<=0){
			lMainCountry=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('MainCountry','')
			lreturn.put('Result',lResult)
			String lTagButton='mainDriver-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='mainDriver-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lMainCountry='No Option'
			}else{
				lMainCountry=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lMainCountry,true)
			}
			lResult=lMainCountry.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-passport-country-next'))
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
	public Map inputMainCountryB(String strMainCountry){
		Map lreturn=[:]
		String lMainCountry=strMainCountry.trim()
		if(lMainCountry.length()<=0){
			lMainCountry=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('MainCountry','')
			lreturn.put('Result',lResult)
			String lTagButton='mainDriver-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='mainDriver-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lMainCountry='No Option'
			}else{
				lMainCountry=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lMainCountry,true)
			}
			lResult=lMainCountry.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-passport-country-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainName','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainNameA(strMainName)
						break
					case 'B':
						lreturn=this.inputMainNameB(strMainName)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainNameA(strMainName)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainNameA(String strMainName){
		Map lreturn=[:]
		String lMainName=strMainName.trim()
		if(lMainName.length()<=0){
			lMainName=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainName','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainName)
			lResult=lMainName.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-firstname-next'))
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
	public Map inputMainNameB(String strMainName){
		Map lreturn=[:]
		String lMainName=strMainName.trim()
		if(lMainName.length()<=0){
			lMainName=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainName','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainName=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainName)
			lResult=lMainName.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-firstname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainSurname','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainSurnameA(strMainSurname)
						break
					case 'B':
						lreturn=this.inputMainSurnameB(strMainSurname)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainSurnameA(strMainSurname)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainSurnameA(String strMainSurname){
		Map lreturn=[:]
		String lMainSurname=strMainSurname.trim()
		if(lMainSurname.length()<=0){
			lMainSurname=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainSurname','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainSurname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainSurname)
			lResult=lMainSurname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-lastname-next'))
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
	public Map inputMainSurnameB(String strMainSurname){
		Map lreturn=[:]
		String lMainSurname=strMainSurname.trim()
		if(lMainSurname.length()<=0){
			lMainSurname=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('MainSurname','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainSurname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainSurname)
			lResult=lMainSurname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-lastname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainEmail','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainEmailA(strMainEmail)
						break
					case 'B':
						lreturn=this.inputMainEmailB(strMainEmail)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainEmailA(strMainEmail)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainEmailA(String strMainEmail){
		Map lreturn=[:]
		String lMainEmail=strMainEmail.trim()
		if(lMainEmail.length()<=0){
			lMainEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('MainEmail','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-email'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainEmail=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainEmail)
			if(lMainEmail.length()<=0){
				lMainEmail='No Option'
			}
			lResult=lMainEmail.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-email-next'))
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
	public Map inputMainEmailB(String strMainEmail){
		Map lreturn=[:]
		String lMainEmail=strMainEmail.trim()
		if(lMainEmail.length()<=0){
			lMainEmail=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_EMAIL
		}
		try{
			Boolean lResult=false
			lreturn.put('MainEmail','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-email'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainEmail=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainEmail)
			if(lMainEmail.length()<=0){
				lMainEmail='No Option'
			}
			lResult=lMainEmail.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-email-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('MainPhoneNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputMainPhoneNoA(strMainPhoneNo)
						break
					case 'B':
						lreturn=this.inputMainPhoneNoB(strMainPhoneNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputMainPhoneNoA(strMainPhoneNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputMainPhoneNoA(String strMainPhoneNo){
		Map lreturn=[:]
		String lMainPhoneNo=strMainPhoneNo.trim()
		if(lMainPhoneNo.length()<=0){
			lMainPhoneNo=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPhoneNo','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-mobile'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainPhoneNo=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainPhoneNo)
			if(lMainPhoneNo.length()<=0){
				lMainPhoneNo='No Option'
			}
			lResult=lMainPhoneNo.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-mobile-next'))
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
	public Map inputMainPhoneNoB(String strMainPhoneNo){
		Map lreturn=[:]
		String lMainPhoneNo=strMainPhoneNo.trim()
		if(lMainPhoneNo.length()<=0){
			lMainPhoneNo=THAMotorBikeQuotationDetail1Type.DEFAULT_MAIN_PHONE_NO
		}
		try{
			Boolean lResult=false
			lreturn.put('MainPhoneNo','')
			lreturn.put('Result',lResult)
			String lTagInputText='mainDriver-mobile'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lMainPhoneNo=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lMainPhoneNo)
			if(lMainPhoneNo.length()<=0){
				lMainPhoneNo='No Option'
			}
			lResult=lMainPhoneNo.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('mainDriver-mobile-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('AdditionDrivers','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputAdditionDriversA(strAdditionDrivers)
						break
					case 'B':
						lreturn=this.inputAdditionDriversB(strAdditionDrivers)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputAdditionDriversA(strAdditionDrivers)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputAdditionDriversA(String strAdditionDrivers){
		Map lreturn=[:]
		String lAdditionDrivers=strAdditionDrivers.trim()
		if(lAdditionDrivers.length()<=0){
			lAdditionDrivers=THAMotorBikeQuotationDetail1Type.DEFAULT_ADDITION_DRIVERS
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionDrivers','')
			lreturn.put('Result',lResult)
			Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
			if((lNumAdditionDrivers<0)||(lNumAdditionDrivers>3)){
				lNumAdditionDrivers=0
			}
			String lTagButtonYes='add-driver-Yes'
			String lLocatorButtonYes=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonYes)
			String lTagButtonNo='add-driver-No'
			String lLocatorButtonNo=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNo)
			Boolean lButtonYesVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButtonYes)
			Boolean lButtonYesEnable=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButtonYes)
			Boolean lButtonYesValid=lButtonYesVisible&&lButtonYesEnable
			if(lNumAdditionDrivers>0){
				if(!lButtonYesValid){
					lNumAdditionDrivers=0
				}
			}
			if(lNumAdditionDrivers<=0){
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonNo)
			}
			lAdditionDrivers=lNumAdditionDrivers.toString()
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
	public Map inputAdditionDriversB(String strAdditionDrivers){
		Map lreturn=[:]
		String lAdditionDrivers=strAdditionDrivers.trim()
		if(lAdditionDrivers.length()<=0){
			lAdditionDrivers=THAMotorBikeQuotationDetail1Type.DEFAULT_ADDITION_DRIVERS
		}
		try{
			Boolean lResult=false
			lreturn.put('AdditionDrivers','')
			lreturn.put('Result',lResult)
			Integer lNumAdditionDrivers=IGNUemaHelper.convertStringToInteger(lAdditionDrivers,0)
			if((lNumAdditionDrivers<0)||(lNumAdditionDrivers>3)){
				lNumAdditionDrivers=0
			}
			String lTagButtonYes='add-driver-Yes'
			String lLocatorButtonYes=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonYes)
			String lTagButtonNo='add-driver-No'
			String lLocatorButtonNo=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNo)
			Boolean lButtonYesVisible=IGNUemaHelper.checkElementVisibleByLocatorKs(this.driver,lLocatorButtonYes)
			Boolean lButtonYesEnable=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButtonYes)
			Boolean lButtonYesValid=lButtonYesVisible&&lButtonYesEnable
			if(lNumAdditionDrivers>0){
				if(!lButtonYesValid){
					lNumAdditionDrivers=0
				}
			}
			if(lNumAdditionDrivers<=0){
				IGNUemaHelper.selectButtonByLocator(this.driver,lLocatorButtonNo)
			}
			lAdditionDrivers=lNumAdditionDrivers.toString()
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
		try{
			Boolean lResult=false
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriversHaveLicenseA(strDriversHaveLicense)
						break
					case 'B':
						lreturn=this.inputDriversHaveLicenseB(strDriversHaveLicense)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriversHaveLicenseA(strDriversHaveLicense)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriversHaveLicenseA(String strDriversHaveLicense){
		Map lreturn=[:]
		String lDriversHaveLicense=strDriversHaveLicense.trim()
		if(lDriversHaveLicense.length()<=0){
			lDriversHaveLicense=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVERS_HAVE_LICENSE
		}
		try{
			Boolean lResult=false
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Result',lResult)
			Boolean lIsDriversHaveLicense=IGNUemaHelper.convertStringToBoolean(lDriversHaveLicense)
			String lTagButton='confirm4drive2button'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementButton){
				lDriversHaveLicense='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsDriversHaveLicense){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}else{
					if(lIsDriversHaveLicense){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lDriversHaveLicense=lStageStr
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
	public Map inputDriversHaveLicenseB(String strDriversHaveLicense){
		Map lreturn=[:]
		String lDriversHaveLicense=strDriversHaveLicense.trim()
		if(lDriversHaveLicense.length()<=0){
			lDriversHaveLicense=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVERS_HAVE_LICENSE
		}
		try{
			Boolean lResult=false
			lreturn.put('DriversHaveLicense','')
			lreturn.put('Result',lResult)
			Boolean lIsDriversHaveLicense=IGNUemaHelper.convertStringToBoolean(lDriversHaveLicense)
			String lTagButton='confirm4drive2button'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			String lStageStr=''
			Boolean lStageBool=false
			if(!lElementButton){
				lDriversHaveLicense='No Option'
			}else{
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lStageBool=IGNUemaHelper.convertStringToBoolean(lStageStr)
				if(lStageBool){
					if(!lIsDriversHaveLicense){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}else{
					if(lIsDriversHaveLicense){
						IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)
					}
				}
				lStageStr=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				lDriversHaveLicense=lStageStr
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Status','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1StatusA(strDriver1Status)
						break
					case 'B':
						lreturn=this.inputDriver1StatusB(strDriver1Status)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1StatusA(strDriver1Status)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1StatusA(String strDriver1Status){
		Map lreturn=[:]
		String lDriver1Status=strDriver1Status.toUpperCase().trim()

		try{
			String lDriver1StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver1Status)
			if(!lDriver1StatusItem){
				lDriver1StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver1Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1Status=''
				}
			}
			lDriver1Status=IGNUemaHelper.convertStringAsTitleCase(lDriver1Status)
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
	public Map inputDriver1StatusB(String strDriver1Status){
		Map lreturn=[:]
		String lDriver1Status=strDriver1Status.toUpperCase().trim()

		try{
			String lDriver1StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver1Status)
			if(!lDriver1StatusItem){
				lDriver1StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver1Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1Status=''
				}
			}
			lDriver1Status=IGNUemaHelper.convertStringAsTitleCase(lDriver1Status)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Dob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1DobA(strDriver1Dob)
						break
					case 'B':
						lreturn=this.inputDriver1DobB(strDriver1Dob)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1DobA(strDriver1Dob)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1DobA(String strDriver1Dob){
		Map lreturn=[:]
		String lDriver1Dob=strDriver1Dob.trim()
		if(lDriver1Dob.length()<=0){
			lDriver1Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Dob','')
			lreturn.put('Result',lResult)
			String lDriver1DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver1Dob)
			String lDriver1DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver1Dob)
			String lDriver1DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver1Dob)
			lDriver1Dob=''
			String lTagInputTextDD='driver-dd-0'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver1DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver1DobDD)
			String lTagInputTextMM='driver-mm-0'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver1DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver1DobMM)
			String lTagInputTextYYYY='driver-yyyy-0'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver1DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver1DobYYYY)
			lDriver1Dob=lDriver1DobDD+'/'+lDriver1DobMM+'/'+lDriver1DobYYYY
			String lTagButtonNext='add-driver-0-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputDriver1DobB(String strDriver1Dob){
		Map lreturn=[:]
		String lDriver1Dob=strDriver1Dob.trim()
		if(lDriver1Dob.length()<=0){
			lDriver1Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Dob','')
			lreturn.put('Result',lResult)
			String lDriver1DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver1Dob)
			String lDriver1DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver1Dob)
			String lDriver1DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver1Dob)
			lDriver1Dob=''
			String lTagInputTextDD='driver-dd-0'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver1DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver1DobDD)
			String lTagInputTextMM='driver-mm-0'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver1DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver1DobMM)
			String lTagInputTextYYYY='driver-yyyy-0'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver1DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver1DobYYYY)
			lDriver1Dob=lDriver1DobDD+'/'+lDriver1DobMM+'/'+lDriver1DobYYYY
			String lTagButtonNext='add-driver-0-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1IsThai','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1IsThaiA(strDriver1IsThai)
						break
					case 'B':
						lreturn=this.inputDriver1IsThaiB(strDriver1IsThai)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1IsThaiA(strDriver1IsThai)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1IsThaiA(String strDriver1IsThai){
		Map lreturn=[:]
		String lDriver1IsThai=strDriver1IsThai.trim()
		if(lDriver1IsThai.length()<=0){
			lDriver1IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
			String lTagButton='add-driver-0-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver1IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1IsThai=''
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
	public Map inputDriver1IsThaiB(String strDriver1IsThai){
		Map lreturn=[:]
		String lDriver1IsThai=strDriver1IsThai.trim()
		if(lDriver1IsThai.length()<=0){
			lDriver1IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver1IsThai=IGNUemaHelper.convertStringToBoolean(lDriver1IsThai)
			String lTagButton='add-driver-0-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver1IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1IsThai=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1ThaiIdA(strDriver1ThaiId)
						break
					case 'B':
						lreturn=this.inputDriver1ThaiIdB(strDriver1ThaiId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1ThaiIdA(strDriver1ThaiId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1ThaiIdA(String strDriver1ThaiId){
		Map lreturn=[:]
		String lDriver1ThaiId=strDriver1ThaiId.trim()
		if(lDriver1ThaiId.length()<=0){
			lDriver1ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1ThaiId)
			lResult=lDriver1ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-idcard-next'))
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
	public Map inputDriver1ThaiIdB(String strDriver1ThaiId){
		Map lreturn=[:]
		String lDriver1ThaiId=strDriver1ThaiId.trim()
		if(lDriver1ThaiId.length()<=0){
			lDriver1ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1ThaiId)
			lResult=lDriver1ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-idcard-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Passport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1PassportA(strDriver1Passport)
						break
					case 'B':
						lreturn=this.inputDriver1PassportB(strDriver1Passport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1PassportA(strDriver1Passport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1PassportA(String strDriver1Passport){
		Map lreturn=[:]
		String lDriver1Passport=strDriver1Passport.trim()
		if(lDriver1Passport.length()<=0){
			lDriver1Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Passport)
			lResult=lDriver1Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-passport-next'))
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
	public Map inputDriver1PassportB(String strDriver1Passport){
		Map lreturn=[:]
		String lDriver1Passport=strDriver1Passport.trim()
		if(lDriver1Passport.length()<=0){
			lDriver1Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Passport)
			lResult=lDriver1Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-passport-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Country','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1CountryA(strDriver1Country)
						break
					case 'B':
						lreturn=this.inputDriver1CountryB(strDriver1Country)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1CountryA(strDriver1Country)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1CountryA(String strDriver1Country){
		Map lreturn=[:]
		String lDriver1Country=strDriver1Country.trim()
		if(lDriver1Country.length()<=0){
			lDriver1Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-0-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver1Country='No Option'
			}else{
				lDriver1Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver1Country,true)
			}
			lResult=lDriver1Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-passport-country-next'))
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
	public Map inputDriver1CountryB(String strDriver1Country){
		Map lreturn=[:]
		String lDriver1Country=strDriver1Country.trim()
		if(lDriver1Country.length()<=0){
			lDriver1Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-0-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver1Country='No Option'
			}else{
				lDriver1Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver1Country,true)
			}
			lResult=lDriver1Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-passport-country-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Name','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1NameA(strDriver1Name)
						break
					case 'B':
						lreturn=this.inputDriver1NameB(strDriver1Name)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1NameA(strDriver1Name)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1NameA(String strDriver1Name){
		Map lreturn=[:]
		String lDriver1Name=strDriver1Name.trim()
		if(lDriver1Name.length()<=0){
			lDriver1Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Name)
			lResult=lDriver1Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-firstname-next'))
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
	public Map inputDriver1NameB(String strDriver1Name){
		Map lreturn=[:]
		String lDriver1Name=strDriver1Name.trim()
		if(lDriver1Name.length()<=0){
			lDriver1Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Name)
			lResult=lDriver1Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-firstname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Surname','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1SurnameA(strDriver1Surname)
						break
					case 'B':
						lreturn=this.inputDriver1SurnameB(strDriver1Surname)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1SurnameA(strDriver1Surname)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1SurnameA(String strDriver1Surname){
		Map lreturn=[:]
		String lDriver1Surname=strDriver1Surname.trim()
		if(lDriver1Surname.length()<=0){
			lDriver1Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Surname)
			lResult=lDriver1Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-lastname-next'))
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
	public Map inputDriver1SurnameB(String strDriver1Surname){
		Map lreturn=[:]
		String lDriver1Surname=strDriver1Surname.trim()
		if(lDriver1Surname.length()<=0){
			lDriver1Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-0-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver1Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver1Surname)
			lResult=lDriver1Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-0-lastname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1YearDrivingA(strDriver1YearDriving)
						break
					case 'B':
						lreturn=this.inputDriver1YearDrivingB(strDriver1YearDriving)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1YearDrivingA(strDriver1YearDriving)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1YearDrivingA(String strDriver1YearDriving){
		Map lreturn=[:]
		String lDriver1YearDriving=strDriver1YearDriving.trim()
		if(lDriver1YearDriving.length()<=0){
			lDriver1YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_YEAR_DRIVING
		}
		Integer lDriver1YearDrivingMin=0
		Integer lDriver1YearDrivingMax=6
		Integer lDriver1YearDrivingDefault=6
		Integer lDriver1YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver1YearDriving,lDriver1YearDrivingDefault)
		if((lDriver1YearDrivingNum<lDriver1YearDrivingMin)||(lDriver1YearDrivingNum>lDriver1YearDrivingMax)){
			lDriver1YearDrivingNum=lDriver1YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1YearDriving=''
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
	public Map inputDriver1YearDrivingB(String strDriver1YearDriving){
		Map lreturn=[:]
		String lDriver1YearDriving=strDriver1YearDriving.trim()
		if(lDriver1YearDriving.length()<=0){
			lDriver1YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_YEAR_DRIVING
		}
		Integer lDriver1YearDrivingMin=0
		Integer lDriver1YearDrivingMax=6
		Integer lDriver1YearDrivingDefault=6
		Integer lDriver1YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver1YearDriving,lDriver1YearDrivingDefault)
		if((lDriver1YearDrivingNum<lDriver1YearDrivingMin)||(lDriver1YearDrivingNum>lDriver1YearDrivingMax)){
			lDriver1YearDrivingNum=lDriver1YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1YearDriving=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1ClaimsNoA(strDriver1ClaimsNo)
						break
					case 'B':
						lreturn=this.inputDriver1ClaimsNoB(strDriver1ClaimsNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1ClaimsNoA(strDriver1ClaimsNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1ClaimsNoA(String strDriver1ClaimsNo){
		Map lreturn=[:]
		String lDriver1ClaimsNo=strDriver1ClaimsNo.trim()
		if(lDriver1ClaimsNo.length()<=0){
			lDriver1ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_CLAIMS_NO
		}
		Integer lDriver1ClaimsNoMin=0
		Integer lDriver1ClaimsNoMax=3
		Integer lDriver1ClaimsNoDefault=0
		Integer lDriver1ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver1ClaimsNo,lDriver1ClaimsNoDefault)
		if((lDriver1ClaimsNoNum<lDriver1ClaimsNoMin)||(lDriver1ClaimsNoNum>lDriver1ClaimsNoMax)){
			lDriver1ClaimsNoNum=lDriver1ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1ClaimsNo=''
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
	public Map inputDriver1ClaimsNoB(String strDriver1ClaimsNo){
		Map lreturn=[:]
		String lDriver1ClaimsNo=strDriver1ClaimsNo.trim()
		if(lDriver1ClaimsNo.length()<=0){
			lDriver1ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_CLAIMS_NO
		}
		Integer lDriver1ClaimsNoMin=0
		Integer lDriver1ClaimsNoMax=3
		Integer lDriver1ClaimsNoDefault=0
		Integer lDriver1ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver1ClaimsNo,lDriver1ClaimsNoDefault)
		if((lDriver1ClaimsNoNum<lDriver1ClaimsNoMin)||(lDriver1ClaimsNoNum>lDriver1ClaimsNoMax)){
			lDriver1ClaimsNoNum=lDriver1ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver1ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver1ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver1ClaimsNo=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver1Occupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver1OccupationA(strDriver1Occupation)
						break
					case 'B':
						lreturn=this.inputDriver1OccupationB(strDriver1Occupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver1OccupationA(strDriver1Occupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver1OccupationA(String strDriver1Occupation){
		Map lreturn=[:]
		String lDriver1Occupation=strDriver1Occupation.trim()
		if(lDriver1Occupation.length()<=0){
			lDriver1Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-0-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver1Occupation='No Option'
			}else{
				lDriver1Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver1Occupation,true)
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
	public Map inputDriver1OccupationB(String strDriver1Occupation){
		Map lreturn=[:]
		String lDriver1Occupation=strDriver1Occupation.trim()
		if(lDriver1Occupation.length()<=0){
			lDriver1Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER1_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver1Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-0-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-0-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver1Occupation='No Option'
			}else{
				lDriver1Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver1Occupation,true)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Status','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2StatusA(strDriver2Status)
						break
					case 'B':
						lreturn=this.inputDriver2StatusB(strDriver2Status)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2StatusA(strDriver2Status)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2StatusA(String strDriver2Status){
		Map lreturn=[:]
		String lDriver2Status=strDriver2Status.toUpperCase().trim()

		try{
			String lDriver2StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver2Status)
			if(!lDriver2StatusItem){
				lDriver2StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver2Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2Status=''
				}
			}
			lDriver2Status=IGNUemaHelper.convertStringAsTitleCase(lDriver2Status)
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
	public Map inputDriver2StatusB(String strDriver2Status){
		Map lreturn=[:]
		String lDriver2Status=strDriver2Status.toUpperCase().trim()

		try{
			String lDriver2StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver2Status)
			if(!lDriver2StatusItem){
				lDriver2StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver2Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2Status=''
				}
			}
			lDriver2Status=IGNUemaHelper.convertStringAsTitleCase(lDriver2Status)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Dob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2DobA(strDriver2Dob)
						break
					case 'B':
						lreturn=this.inputDriver2DobB(strDriver2Dob)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2DobA(strDriver2Dob)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2DobA(String strDriver2Dob){
		Map lreturn=[:]
		String lDriver2Dob=strDriver2Dob.trim()
		if(lDriver2Dob.length()<=0){
			lDriver2Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Dob','')
			lreturn.put('Result',lResult)
			String lDriver2DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver2Dob)
			String lDriver2DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver2Dob)
			String lDriver2DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver2Dob)
			lDriver2Dob=''
			String lTagInputTextDD='driver-dd-1'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver2DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver2DobDD)
			String lTagInputTextMM='driver-mm-1'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver2DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver2DobMM)
			String lTagInputTextYYYY='driver-yyyy-1'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver2DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver2DobYYYY)
			lDriver2Dob=lDriver2DobDD+'/'+lDriver2DobMM+'/'+lDriver2DobYYYY
			String lTagButtonNext='add-driver-1-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputDriver2DobB(String strDriver2Dob){
		Map lreturn=[:]
		String lDriver2Dob=strDriver2Dob.trim()
		if(lDriver2Dob.length()<=0){
			lDriver2Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Dob','')
			lreturn.put('Result',lResult)
			String lDriver2DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver2Dob)
			String lDriver2DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver2Dob)
			String lDriver2DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver2Dob)
			lDriver2Dob=''
			String lTagInputTextDD='driver-dd-1'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver2DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver2DobDD)
			String lTagInputTextMM='driver-mm-1'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver2DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver2DobMM)
			String lTagInputTextYYYY='driver-yyyy-1'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver2DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver2DobYYYY)
			lDriver2Dob=lDriver2DobDD+'/'+lDriver2DobMM+'/'+lDriver2DobYYYY
			String lTagButtonNext='add-driver-1-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2IsThai','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2IsThaiA(strDriver2IsThai)
						break
					case 'B':
						lreturn=this.inputDriver2IsThaiB(strDriver2IsThai)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2IsThaiA(strDriver2IsThai)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2IsThaiA(String strDriver2IsThai){
		Map lreturn=[:]
		String lDriver2IsThai=strDriver2IsThai.trim()
		if(lDriver2IsThai.length()<=0){
			lDriver2IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
			String lTagButton='add-driver-1-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver2IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2IsThai=''
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
	public Map inputDriver2IsThaiB(String strDriver2IsThai){
		Map lreturn=[:]
		String lDriver2IsThai=strDriver2IsThai.trim()
		if(lDriver2IsThai.length()<=0){
			lDriver2IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver2IsThai=IGNUemaHelper.convertStringToBoolean(lDriver2IsThai)
			String lTagButton='add-driver-1-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver2IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2IsThai=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2ThaiIdA(strDriver2ThaiId)
						break
					case 'B':
						lreturn=this.inputDriver2ThaiIdB(strDriver2ThaiId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2ThaiIdA(strDriver2ThaiId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2ThaiIdA(String strDriver2ThaiId){
		Map lreturn=[:]
		String lDriver2ThaiId=strDriver2ThaiId.trim()
		if(lDriver2ThaiId.length()<=0){
			lDriver2ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2ThaiId)
			lResult=lDriver2ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-idcard-next'))
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
	public Map inputDriver2ThaiIdB(String strDriver2ThaiId){
		Map lreturn=[:]
		String lDriver2ThaiId=strDriver2ThaiId.trim()
		if(lDriver2ThaiId.length()<=0){
			lDriver2ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2ThaiId)
			lResult=lDriver2ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-idcard-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Passport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2PassportA(strDriver2Passport)
						break
					case 'B':
						lreturn=this.inputDriver2PassportB(strDriver2Passport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2PassportA(strDriver2Passport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2PassportA(String strDriver2Passport){
		Map lreturn=[:]
		String lDriver2Passport=strDriver2Passport.trim()
		if(lDriver2Passport.length()<=0){
			lDriver2Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Passport)
			lResult=lDriver2Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-passport-next'))
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
	public Map inputDriver2PassportB(String strDriver2Passport){
		Map lreturn=[:]
		String lDriver2Passport=strDriver2Passport.trim()
		if(lDriver2Passport.length()<=0){
			lDriver2Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Passport)
			lResult=lDriver2Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-passport-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Country','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2CountryA(strDriver2Country)
						break
					case 'B':
						lreturn=this.inputDriver2CountryB(strDriver2Country)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2CountryA(strDriver2Country)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2CountryA(String strDriver2Country){
		Map lreturn=[:]
		String lDriver2Country=strDriver2Country.trim()
		if(lDriver2Country.length()<=0){
			lDriver2Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-1-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver2Country='No Option'
			}else{
				lDriver2Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver2Country,true)
			}
			lResult=lDriver2Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-passport-country-next'))
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
	public Map inputDriver2CountryB(String strDriver2Country){
		Map lreturn=[:]
		String lDriver2Country=strDriver2Country.trim()
		if(lDriver2Country.length()<=0){
			lDriver2Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-1-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver2Country='No Option'
			}else{
				lDriver2Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver2Country,true)
			}
			lResult=lDriver2Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-passport-country-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Name','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2NameA(strDriver2Name)
						break
					case 'B':
						lreturn=this.inputDriver2NameB(strDriver2Name)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2NameA(strDriver2Name)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2NameA(String strDriver2Name){
		Map lreturn=[:]
		String lDriver2Name=strDriver2Name.trim()
		if(lDriver2Name.length()<=0){
			lDriver2Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Name)
			lResult=lDriver2Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-firstname-next'))
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
	public Map inputDriver2NameB(String strDriver2Name){
		Map lreturn=[:]
		String lDriver2Name=strDriver2Name.trim()
		if(lDriver2Name.length()<=0){
			lDriver2Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Name)
			lResult=lDriver2Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-firstname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Surname','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2SurnameA(strDriver2Surname)
						break
					case 'B':
						lreturn=this.inputDriver2SurnameB(strDriver2Surname)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2SurnameA(strDriver2Surname)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2SurnameA(String strDriver2Surname){
		Map lreturn=[:]
		String lDriver2Surname=strDriver2Surname.trim()
		if(lDriver2Surname.length()<=0){
			lDriver2Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Surname)
			lResult=lDriver2Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-lastname-next'))
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
	public Map inputDriver2SurnameB(String strDriver2Surname){
		Map lreturn=[:]
		String lDriver2Surname=strDriver2Surname.trim()
		if(lDriver2Surname.length()<=0){
			lDriver2Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-1-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver2Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver2Surname)
			lResult=lDriver2Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-1-lastname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2YearDrivingA(strDriver2YearDriving)
						break
					case 'B':
						lreturn=this.inputDriver2YearDrivingB(strDriver2YearDriving)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2YearDrivingA(strDriver2YearDriving)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2YearDrivingA(String strDriver2YearDriving){
		Map lreturn=[:]
		String lDriver2YearDriving=strDriver2YearDriving.trim()
		if(lDriver2YearDriving.length()<=0){
			lDriver2YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_YEAR_DRIVING
		}
		Integer lDriver2YearDrivingMin=0
		Integer lDriver2YearDrivingMax=6
		Integer lDriver2YearDrivingDefault=6
		Integer lDriver2YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver2YearDriving,lDriver2YearDrivingDefault)
		if((lDriver2YearDrivingNum<lDriver2YearDrivingMin)||(lDriver2YearDrivingNum>lDriver2YearDrivingMax)){
			lDriver2YearDrivingNum=lDriver2YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2YearDriving=''
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
	public Map inputDriver2YearDrivingB(String strDriver2YearDriving){
		Map lreturn=[:]
		String lDriver2YearDriving=strDriver2YearDriving.trim()
		if(lDriver2YearDriving.length()<=0){
			lDriver2YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_YEAR_DRIVING
		}
		Integer lDriver2YearDrivingMin=0
		Integer lDriver2YearDrivingMax=6
		Integer lDriver2YearDrivingDefault=6
		Integer lDriver2YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver2YearDriving,lDriver2YearDrivingDefault)
		if((lDriver2YearDrivingNum<lDriver2YearDrivingMin)||(lDriver2YearDrivingNum>lDriver2YearDrivingMax)){
			lDriver2YearDrivingNum=lDriver2YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2YearDriving=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2ClaimsNoA(strDriver2ClaimsNo)
						break
					case 'B':
						lreturn=this.inputDriver2ClaimsNoB(strDriver2ClaimsNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2ClaimsNoA(strDriver2ClaimsNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2ClaimsNoA(String strDriver2ClaimsNo){
		Map lreturn=[:]
		String lDriver2ClaimsNo=strDriver2ClaimsNo.trim()
		if(lDriver2ClaimsNo.length()<=0){
			lDriver2ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_CLAIMS_NO
		}
		Integer lDriver2ClaimsNoMin=0
		Integer lDriver2ClaimsNoMax=3
		Integer lDriver2ClaimsNoDefault=0
		Integer lDriver2ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver2ClaimsNo,lDriver2ClaimsNoDefault)
		if((lDriver2ClaimsNoNum<lDriver2ClaimsNoMin)||(lDriver2ClaimsNoNum>lDriver2ClaimsNoMax)){
			lDriver2ClaimsNoNum=lDriver2ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2ClaimsNo=''
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
	public Map inputDriver2ClaimsNoB(String strDriver2ClaimsNo){
		Map lreturn=[:]
		String lDriver2ClaimsNo=strDriver2ClaimsNo.trim()
		if(lDriver2ClaimsNo.length()<=0){
			lDriver2ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_CLAIMS_NO
		}
		Integer lDriver2ClaimsNoMin=0
		Integer lDriver2ClaimsNoMax=3
		Integer lDriver2ClaimsNoDefault=0
		Integer lDriver2ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver2ClaimsNo,lDriver2ClaimsNoDefault)
		if((lDriver2ClaimsNoNum<lDriver2ClaimsNoMin)||(lDriver2ClaimsNoNum>lDriver2ClaimsNoMax)){
			lDriver2ClaimsNoNum=lDriver2ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver2ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver2ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver2ClaimsNo=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver2Occupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver2OccupationA(strDriver2Occupation)
						break
					case 'B':
						lreturn=this.inputDriver2OccupationB(strDriver2Occupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver2OccupationA(strDriver2Occupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver2OccupationA(String strDriver2Occupation){
		Map lreturn=[:]
		String lDriver2Occupation=strDriver2Occupation.trim()
		if(lDriver2Occupation.length()<=0){
			lDriver2Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-1-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver2Occupation='No Option'
			}else{
				lDriver2Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver2Occupation,true)
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
	public Map inputDriver2OccupationB(String strDriver2Occupation){
		Map lreturn=[:]
		String lDriver2Occupation=strDriver2Occupation.trim()
		if(lDriver2Occupation.length()<=0){
			lDriver2Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER2_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver2Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-1-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-1-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver2Occupation='No Option'
			}else{
				lDriver2Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver2Occupation,true)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Status','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3StatusA(strDriver3Status)
						break
					case 'B':
						lreturn=this.inputDriver3StatusB(strDriver3Status)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3StatusA(strDriver3Status)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3StatusA(String strDriver3Status){
		Map lreturn=[:]
		String lDriver3Status=strDriver3Status.toUpperCase().trim()
		try{
			String lDriver3StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver3Status)
			if(!lDriver3StatusItem){
				lDriver3StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver3Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3Status=''
				}
			}
			lDriver3Status=IGNUemaHelper.convertStringAsTitleCase(lDriver3Status)
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
	public Map inputDriver3StatusB(String strDriver3Status){
		Map lreturn=[:]
		String lDriver3Status=strDriver3Status.toUpperCase().trim()
		try{
			String lDriver3StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(lDriver3Status)
			if(!lDriver3StatusItem){
				lDriver3StatusItem=this.DEFAULT_LIST_SEX_MARITAL_STATUS.get(THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_STATUS.toUpperCase())
			}
			Boolean lResult=false
			lreturn.put('Driver3Status','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-gender'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3StatusItem)
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3Status=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3Status=''
				}
			}
			lDriver3Status=IGNUemaHelper.convertStringAsTitleCase(lDriver3Status)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Dob','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3DobA(strDriver3Dob)
						break
					case 'B':
						lreturn=this.inputDriver3DobB(strDriver3Dob)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3DobA(strDriver3Dob)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3DobA(String strDriver3Dob){
		Map lreturn=[:]
		String lDriver3Dob=strDriver3Dob.trim()
		if(lDriver3Dob.length()<=0){
			lDriver3Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Dob','')
			lreturn.put('Result',lResult)
			String lDriver3DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver3Dob)
			String lDriver3DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver3Dob)
			String lDriver3DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver3Dob)
			lDriver3Dob=''
			String lTagInputTextDD='driver-dd-2'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver3DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver3DobDD)
			String lTagInputTextMM='driver-mm-2'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver3DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver3DobMM)
			String lTagInputTextYYYY='driver-yyyy-2'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver3DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver3DobYYYY)
			lDriver3Dob=lDriver3DobDD+'/'+lDriver3DobMM+'/'+lDriver3DobYYYY
			String lTagButtonNext='add-driver-2-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
	public Map inputDriver3DobB(String strDriver3Dob){
		Map lreturn=[:]
		String lDriver3Dob=strDriver3Dob.trim()
		if(lDriver3Dob.length()<=0){
			lDriver3Dob=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Dob','')
			lreturn.put('Result',lResult)
			String lDriver3DobDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lDriver3Dob)
			String lDriver3DobMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lDriver3Dob)
			String lDriver3DobYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lDriver3Dob)
			lDriver3Dob=''
			String lTagInputTextDD='driver-dd-2'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lDriver3DobDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lDriver3DobDD)
			String lTagInputTextMM='driver-mm-2'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lDriver3DobMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lDriver3DobMM)
			String lTagInputTextYYYY='driver-yyyy-2'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lDriver3DobYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lDriver3DobYYYY)
			lDriver3Dob=lDriver3DobDD+'/'+lDriver3DobMM+'/'+lDriver3DobYYYY
			String lTagButtonNext='add-driver-2-dob-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			lResult=IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3IsThai','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3IsThaiA(strDriver3IsThai)
						break
					case 'B':
						lreturn=this.inputDriver3IsThaiB(strDriver3IsThai)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3IsThaiA(strDriver3IsThai)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3IsThaiA(String strDriver3IsThai){
		Map lreturn=[:]
		String lDriver3IsThai=strDriver3IsThai.trim()
		if(lDriver3IsThai.length()<=0){
			lDriver3IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
			String lTagButton='add-driver-2-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver3IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3IsThai=''
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
	public Map inputDriver3IsThaiB(String strDriver3IsThai){
		Map lreturn=[:]
		String lDriver3IsThai=strDriver3IsThai.trim()
		if(lDriver3IsThai.length()<=0){
			lDriver3IsThai=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_IS_THAI
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3IsThai','')
			lreturn.put('Result',lResult)
			Boolean lIsDriver3IsThai=IGNUemaHelper.convertStringToBoolean(lDriver3IsThai)
			String lTagButton='add-driver-2-nationality'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=null
			if(lIsDriver3IsThai){
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'Yes')
			}else{
				lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,'No')
			}
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3IsThai=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3IsThai=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3ThaiIdA(strDriver3ThaiId)
						break
					case 'B':
						lreturn=this.inputDriver3ThaiIdB(strDriver3ThaiId)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3ThaiIdA(strDriver3ThaiId)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3ThaiIdA(String strDriver3ThaiId){
		Map lreturn=[:]
		String lDriver3ThaiId=strDriver3ThaiId.trim()
		if(lDriver3ThaiId.length()<=0){
			lDriver3ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3ThaiId)
			lResult=lDriver3ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-idcard-next'))
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
	public Map inputDriver3ThaiIdB(String strDriver3ThaiId){
		Map lreturn=[:]
		String lDriver3ThaiId=strDriver3ThaiId.trim()
		if(lDriver3ThaiId.length()<=0){
			lDriver3ThaiId=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_THAI_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ThaiId','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-idcard'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3ThaiId=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3ThaiId)
			lResult=lDriver3ThaiId.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-idcard-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Passport','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3PassportA(strDriver3Passport)
						break
					case 'B':
						lreturn=this.inputDriver3PassportB(strDriver3Passport)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3PassportA(strDriver3Passport)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3PassportA(String strDriver3Passport){
		Map lreturn=[:]
		String lDriver3Passport=strDriver3Passport.trim()
		if(lDriver3Passport.length()<=0){
			lDriver3Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Passport)
			lResult=lDriver3Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-passport-next'))
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
	public Map inputDriver3PassportB(String strDriver3Passport){
		Map lreturn=[:]
		String lDriver3Passport=strDriver3Passport.trim()
		if(lDriver3Passport.length()<=0){
			lDriver3Passport=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_PASSPORT
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Passport','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-passport'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Passport=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Passport)
			lResult=lDriver3Passport.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-passport-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Country','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3CountryA(strDriver3Country)
						break
					case 'B':
						lreturn=this.inputDriver3CountryB(strDriver3Country)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3CountryA(strDriver3Country)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3CountryA(String strDriver3Country){
		Map lreturn=[:]
		String lDriver3Country=strDriver3Country.trim()
		if(lDriver3Country.length()<=0){
			lDriver3Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-2-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver3Country='No Option'
			}else{
				lDriver3Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver3Country,true)
			}
			lResult=lDriver3Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-passport-country-next'))
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
	public Map inputDriver3CountryB(String strDriver3Country){
		Map lreturn=[:]
		String lDriver3Country=strDriver3Country.trim()
		if(lDriver3Country.length()<=0){
			lDriver3Country=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_COUNTRY
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Country','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-passport-country'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-2-passport-country-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver3Country='No Option'
			}else{
				lDriver3Country=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver3Country,true)
			}
			lResult=lDriver3Country.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-passport-country-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Name','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3NameA(strDriver3Name)
						break
					case 'B':
						lreturn=this.inputDriver3NameB(strDriver3Name)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3NameA(strDriver3Name)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3NameA(String strDriver3Name){
		Map lreturn=[:]
		String lDriver3Name=strDriver3Name.trim()
		if(lDriver3Name.length()<=0){
			lDriver3Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Name)
			lResult=lDriver3Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-firstname-next'))
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
	public Map inputDriver3NameB(String strDriver3Name){
		Map lreturn=[:]
		String lDriver3Name=strDriver3Name.trim()
		if(lDriver3Name.length()<=0){
			lDriver3Name=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_NAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Name','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-firstname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Name=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Name)
			lResult=lDriver3Name.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-firstname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Surname','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3SurnameA(strDriver3Surname)
						break
					case 'B':
						lreturn=this.inputDriver3SurnameB(strDriver3Surname)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3SurnameA(strDriver3Surname)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3SurnameA(String strDriver3Surname){
		Map lreturn=[:]
		String lDriver3Surname=strDriver3Surname.trim()
		if(lDriver3Surname.length()<=0){
			lDriver3Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Surname)
			lResult=lDriver3Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-lastname-next'))
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
	public Map inputDriver3SurnameB(String strDriver3Surname){
		Map lreturn=[:]
		String lDriver3Surname=strDriver3Surname.trim()
		if(lDriver3Surname.length()<=0){
			lDriver3Surname=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_SURNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Surname','')
			lreturn.put('Result',lResult)
			String lTagInputText='add-driver-2-lastname'
			String lLocatorInputText=IGNUemaHelper.getTagDataSeleniumKey(lTagInputText)
			lDriver3Surname=IGNUemaHelper.typeTextWithEnterByLocator(this.driver,lLocatorInputText,lDriver3Surname)
			lResult=lDriver3Surname.length()>0
			IGNUemaHelper.selectButtonByLocator(this.driver,IGNUemaHelper.getTagDataSeleniumKey('add-driver-2-lastname-next'))
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3YearDrivingA(strDriver3YearDriving)
						break
					case 'B':
						lreturn=this.inputDriver3YearDrivingB(strDriver3YearDriving)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3YearDrivingA(strDriver3YearDriving)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3YearDrivingA(String strDriver3YearDriving){
		Map lreturn=[:]
		String lDriver3YearDriving=strDriver3YearDriving.trim()
		if(lDriver3YearDriving.length()<=0){
			lDriver3YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_YEAR_DRIVING
		}
		Integer lDriver3YearDrivingMin=0
		Integer lDriver3YearDrivingMax=6
		Integer lDriver3YearDrivingDefault=6
		Integer lDriver3YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver3YearDriving,lDriver3YearDrivingDefault)
		if((lDriver3YearDrivingNum<lDriver3YearDrivingMin)||(lDriver3YearDrivingNum>lDriver3YearDrivingMax)){
			lDriver3YearDrivingNum=lDriver3YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3YearDriving=''
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
	public Map inputDriver3YearDrivingB(String strDriver3YearDriving){
		Map lreturn=[:]
		String lDriver3YearDriving=strDriver3YearDriving.trim()
		if(lDriver3YearDriving.length()<=0){
			lDriver3YearDriving=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_YEAR_DRIVING
		}
		Integer lDriver3YearDrivingMin=0
		Integer lDriver3YearDrivingMax=6
		Integer lDriver3YearDrivingDefault=6
		Integer lDriver3YearDrivingNum=IGNUemaHelper.convertStringToInteger(lDriver3YearDriving,lDriver3YearDrivingDefault)
		if((lDriver3YearDrivingNum<lDriver3YearDrivingMin)||(lDriver3YearDrivingNum>lDriver3YearDrivingMax)){
			lDriver3YearDrivingNum=lDriver3YearDrivingDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3YearDriving','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-drivingExperience'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3YearDrivingNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3YearDriving=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3YearDriving=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3ClaimsNoA(strDriver3ClaimsNo)
						break
					case 'B':
						lreturn=this.inputDriver3ClaimsNoB(strDriver3ClaimsNo)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3ClaimsNoA(strDriver3ClaimsNo)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3ClaimsNoA(String strDriver3ClaimsNo){
		Map lreturn=[:]
		String lDriver3ClaimsNo=strDriver3ClaimsNo.trim()
		if(lDriver3ClaimsNo.length()<=0){
			lDriver3ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_CLAIMS_NO
		}
		Integer lDriver3ClaimsNoMin=0
		Integer lDriver3ClaimsNoMax=3
		Integer lDriver3ClaimsNoDefault=0
		Integer lDriver3ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver3ClaimsNo,lDriver3ClaimsNoDefault)
		if((lDriver3ClaimsNoNum<lDriver3ClaimsNoMin)||(lDriver3ClaimsNoNum>lDriver3ClaimsNoMax)){
			lDriver3ClaimsNoNum=lDriver3ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3ClaimsNo=''
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
	public Map inputDriver3ClaimsNoB(String strDriver3ClaimsNo){
		Map lreturn=[:]
		String lDriver3ClaimsNo=strDriver3ClaimsNo.trim()
		if(lDriver3ClaimsNo.length()<=0){
			lDriver3ClaimsNo=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_CLAIMS_NO
		}
		Integer lDriver3ClaimsNoMin=0
		Integer lDriver3ClaimsNoMax=3
		Integer lDriver3ClaimsNoDefault=0
		Integer lDriver3ClaimsNoNum=IGNUemaHelper.convertStringToInteger(lDriver3ClaimsNo,lDriver3ClaimsNoDefault)
		if((lDriver3ClaimsNoNum<lDriver3ClaimsNoMin)||(lDriver3ClaimsNoNum>lDriver3ClaimsNoMax)){
			lDriver3ClaimsNoNum=lDriver3ClaimsNoDefault
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3ClaimsNo','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-claim'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKeyValueContain(this.driver,lTagButton,lDriver3ClaimsNoNum.toString())
			if(!lElementButton){
				return lreturn
			}else{
				if(IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButton)){
					lDriver3ClaimsNo=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
				}else{
					lDriver3ClaimsNo=''
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
		try{
			Boolean lResult=false
			lreturn.put('Driver3Occupation','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputDriver3OccupationA(strDriver3Occupation)
						break
					case 'B':
						lreturn=this.inputDriver3OccupationB(strDriver3Occupation)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputDriver3OccupationA(strDriver3Occupation)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputDriver3OccupationA(String strDriver3Occupation){
		Map lreturn=[:]
		String lDriver3Occupation=strDriver3Occupation.trim()
		if(lDriver3Occupation.length()<=0){
			lDriver3Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-2-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver3Occupation='No Option'
			}else{
				lDriver3Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver3Occupation,true)
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
	public Map inputDriver3OccupationB(String strDriver3Occupation){
		Map lreturn=[:]
		String lDriver3Occupation=strDriver3Occupation.trim()
		if(lDriver3Occupation.length()<=0){
			lDriver3Occupation=THAMotorBikeQuotationDetail1Type.DEFAULT_DRIVER3_OCCUPATION
		}
		try{
			Boolean lResult=false
			lreturn.put('Driver3Occupation','')
			lreturn.put('Result',lResult)
			String lTagButton='add-driver-2-occupation'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			String lTagDropdownList='add-driver-2-occupation-item'
			String lLocatorDropdownList=IGNUemaHelper.getTagDataSeleniumKey(lTagDropdownList)
			Boolean lValid=IGNUemaHelper.checkElementEnableByLocatorKs(this.driver,lLocatorButton)
			if(!lValid){
				lDriver3Occupation='No Option'
			}else{
				lDriver3Occupation=IGNUemaHelper.selectDropdownByDataSeleniumLocatorV2(this.driver,lTagButton,lTagDropdownList,lDriver3Occupation,true)
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
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPolicyStartDateA(strPolicyStartDate,strPolicyStartDayOffset)
						break
					case 'B':
						lreturn=this.inputPolicyStartDateB(strPolicyStartDate,strPolicyStartDayOffset)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPolicyStartDateA(strPolicyStartDate,strPolicyStartDayOffset)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyStartDateA(String strPolicyStartDate,String strPolicyStartDayOffset){
		Map lreturn=[:]
		String lPolicyStartDate=strPolicyStartDate.trim()
		String lPolicyStartDayOffset=strPolicyStartDayOffset.trim()
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=THAMotorBikeQuotationDetail1Type.DEFAULT_POLICY_START_DATE
		}
		String lFormatDate='dd/MM/yyyy'
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
		}
		if(lPolicyStartDayOffset.length()<=0){
			lPolicyStartDayOffset=THAMotorBikeQuotationDetail1Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		Integer lPolicyStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyStartDayOffset,0)
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('Result',lResult)
			lPolicyStartDayOffset=lPolicyStartDayOffsetNum.toString()
			lPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lPolicyStartDate,lPolicyStartDayOffsetNum)
			String lPolicyStartDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			String lPolicyStartDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			String lPolicyStartDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			lPolicyStartDate=''
			String lTagInputTextDD='policyStartdate-dd'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lPolicyStartDateDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lPolicyStartDateDD)
			String lTagInputTextMM='policyStartdate-mm'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lPolicyStartDateMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lPolicyStartDateMM)
			String lTagInputTextYYYY='policyStartdate-yyyy'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lPolicyStartDateYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lPolicyStartDateYYYY)
			lPolicyStartDate=lPolicyStartDateDD+'/'+lPolicyStartDateMM+'/'+lPolicyStartDateYYYY
			String lTagButtonNext='hdPolicyStartDate-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			lResult=lPolicyStartDate.length()>0
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
	public Map inputPolicyStartDateB(String strPolicyStartDate,String strPolicyStartDayOffset){
		Map lreturn=[:]
		String lPolicyStartDate=strPolicyStartDate.trim()
		String lPolicyStartDayOffset=strPolicyStartDayOffset.trim()
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=THAMotorBikeQuotationDetail1Type.DEFAULT_POLICY_START_DATE
		}
		String lFormatDate='dd/MM/yyyy'
		if(lPolicyStartDate.length()<=0){
			lPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
		}
		if(lPolicyStartDayOffset.length()<=0){
			lPolicyStartDayOffset=THAMotorBikeQuotationDetail1Type.DEFAULT_POLICY_START_DAY_OFFSET
		}
		Integer lPolicyStartDayOffsetNum=IGNUemaHelper.convertStringToInteger(lPolicyStartDayOffset,0)
		try{
			Boolean lResult=false
			lreturn.put('PolicyStartDate','')
			lreturn.put('PolicyStartDayOffset','')
			lreturn.put('Result',lResult)
			lPolicyStartDayOffset=lPolicyStartDayOffsetNum.toString()
			lPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lPolicyStartDate,lPolicyStartDayOffsetNum)
			String lPolicyStartDateDD=IGNUemaHelper.extractStringDayFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			String lPolicyStartDateMM=IGNUemaHelper.extractStringMonthFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			String lPolicyStartDateYYYY=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(lPolicyStartDate)
			lPolicyStartDate=''
			String lTagInputTextDD='policyStartdate-dd'
			String lLocatorInputTextDD=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextDD)
			WebElement lElementInputTextDD=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextDD)
			lPolicyStartDateDD=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextDD,lPolicyStartDateDD)
			String lTagInputTextMM='policyStartdate-mm'
			String lLocatorInputTextMM=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextMM)
			WebElement lElementInputTextMM=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextMM)
			lPolicyStartDateMM=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextMM,lPolicyStartDateMM)
			String lTagInputTextYYYY='policyStartdate-yyyy'
			String lLocatorInputTextYYYY=IGNUemaHelper.getTagDataSeleniumKey(lTagInputTextYYYY)
			WebElement lElementInputTextYYYY=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagInputTextYYYY)
			lPolicyStartDateYYYY=IGNUemaHelper.typeTextByWebElement(this.driver,lElementInputTextYYYY,lPolicyStartDateYYYY)
			lPolicyStartDate=lPolicyStartDateDD+'/'+lPolicyStartDateMM+'/'+lPolicyStartDateYYYY
			String lTagButtonNext='hdPolicyStartDate-next'
			String lLocatorButtonNext=IGNUemaHelper.getTagDataSeleniumKey(lTagButtonNext)
			WebElement lElementButtonNext=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButtonNext)
			IGNUemaHelper.clickByWebElementWithScroll(this.driver,lElementButtonNext)
			lResult=lPolicyStartDate.length()>0
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
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.CURRENT_AB_TESTING_ENABLE){
				switch(IGNUemaHelper.CURRENT_AB_TESTING_VERSION){
					case 'A':
						lreturn=this.inputPolicyInsurerA(strPolicyInsurer)
						break
					case 'B':
						lreturn=this.inputPolicyInsurerB(strPolicyInsurer)
						break
					default:
						return lreturn
						break
				}
			}else{
				lreturn=this.inputPolicyInsurerA(strPolicyInsurer)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPolicyInsurerA(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=true
			IGNUemaHelper.webJsScrollToTop(this.driver)
			this.waitUntilOpportunityNumberUpdated()
			String lOpportunityNumber=THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.trim()
			String lLocatorRoojaiRewardText='#rewards-shake'
			WebElement lElementRoojaiRewardText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRoojaiRewardText)
			if(lElementRoojaiRewardText){
				String lRoojaiRewardText=lElementRoojaiRewardText.getText().trim()
				if(lRoojaiRewardText.length()>0){
					lOpportunityNumber=lOpportunityNumber+'|'+lRoojaiRewardText
				}
			}
			if(lOpportunityNumber.length()>0){
				lPolicyInsurer=lPolicyInsurer+'|'+lOpportunityNumber
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
	public Map inputPolicyInsurerB(String strPolicyInsurer){
		Map lreturn=[:]
		String lPolicyInsurer=''
		try{
			Boolean lResult=false
			lreturn.put('PolicyInsurer','')
			lreturn.put('Result',lResult)
			String lTagButton='insurer'
			String lLocatorButton=IGNUemaHelper.getTagDataSeleniumKey(lTagButton)
			WebElement lElementButton=IGNUemaHelper.getWebElementFromDataSeleniumKey(this.driver,lTagButton)
			if(!lElementButton){
				lPolicyInsurer='No Option'
			}else{
				lPolicyInsurer=IGNUemaHelper.getDataSeleniumValueWebElement(this.driver,lElementButton)
			}
			lResult=true
			IGNUemaHelper.webJsScrollToTop(this.driver)
			this.waitUntilOpportunityNumberUpdated()
			String lOpportunityNumber=THAMotorBikeCoreType.CURRENT_QUOTATION_VEHICLE_OPPORTUNITY_NUMBER.trim()
			String lLocatorRoojaiRewardText='#rewards-shake'
			WebElement lElementRoojaiRewardText=IGNUemaHelper.getWebElementFromCssLocator(this.driver,lLocatorRoojaiRewardText)
			if(lElementRoojaiRewardText){
				String lRoojaiRewardText=lElementRoojaiRewardText.getText().trim()
				if(lRoojaiRewardText.length()>0){
					lOpportunityNumber=lOpportunityNumber+'|'+lRoojaiRewardText
				}
			}
			if(lOpportunityNumber.length()>0){
				lPolicyInsurer=lPolicyInsurer+'|'+lOpportunityNumber
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
			lSalesforceProceedTodo=THAMotorBikeQuotationDetail1Type.DEFAULT_SALESFORCE_PROCEED_TODO
		}
		try{
			Boolean lResult=false
			lreturn.put('SalesforceProceedTodo','')
			lreturn.put('Result',lResult)
			lSalesforceProceedTodo='Yes'
			Boolean lIsSalesforceProceedTodo=IGNUemaHelper.convertStringToBoolean(lSalesforceProceedTodo)
			lSalesforceProceedTodo=IGNUemaHelper.convertBooleanToString(lIsSalesforceProceedTodo)
			this.waitUntilOpportunityNumberUpdated()
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