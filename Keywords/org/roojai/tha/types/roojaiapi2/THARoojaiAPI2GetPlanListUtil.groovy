package org.roojai.tha.types.roojaiapi2
import static org.assertj.core.api.Assertions.*
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2GetPlanListUtil{
	public THARoojaiAPI2GetPlanListUtil(){
		super()
	}
	public Boolean inputCase(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		String lCheckGobear=caseInput.CheckGobear.toString().trim()
		String lCheckPriceza=caseInput.CheckPriceza.toString().trim()
		String lCheckKumka=caseInput.CheckKumka.toString().trim()
		String lCallPointGobear=caseInput.CallPointGobear.toString().trim()
		String lCallPointPriceza=caseInput.CallPointPriceza.toString().trim()
		String lCallPointKumka=caseInput.CallPointKumka.toString().trim()
		String lGobearRequiredStringUsername=caseInput.GobearRequiredStringUsername.toString().trim()
		String lGobearRequiredStringPassword=caseInput.GobearRequiredStringPassword.toString().trim()
		String lGobearRequiredStringBrand=caseInput.GobearRequiredStringBrand.toString().trim()
		String lGobearRequiredStringYear=caseInput.GobearRequiredStringYear.toString().trim()
		String lGobearRequiredStringModel=caseInput.GobearRequiredStringModel.toString().trim()
		String lGobearRequiredStringSubModel=caseInput.GobearRequiredStringSubModel.toString().trim()
		String lGobearRequiredStringEngineSize=caseInput.GobearRequiredStringEngineSize.toString().trim()
		String lGobearRequiredBooleanFlagIsMale=caseInput.GobearRequiredBooleanFlagIsMale.toString().trim()
		String lGobearRequiredBooleanFlagIsSingle=caseInput.GobearRequiredBooleanFlagIsSingle.toString().trim()
		String lGobearRequiredIntegerYearOfDriving=caseInput.GobearRequiredIntegerYearOfDriving.toString().trim()
		String lGobearRequiredStringNcbRate=caseInput.GobearRequiredStringNcbRate.toString().trim()
		String lGobearRequiredBooleanFlagIsDashcam=caseInput.GobearRequiredBooleanFlagIsDashcam.toString().trim()
		String lGobearRequiredBooleanFlagIsGoToWorkOnly=caseInput.GobearRequiredBooleanFlagIsGoToWorkOnly.toString().trim()
		String lGobearRequiredStringDob=caseInput.GobearRequiredStringDob.toString().trim()
		String lGobearRequiredIntegerNoOfClaim=caseInput.GobearRequiredIntegerNoOfClaim.toString().trim()
		String lGobearFillOptionalStringVehicleKumkaId=caseInput.GobearFillOptionalStringVehicleKumkaId.toString().trim()
		String lGobearOptionalStringVehicleKumkaId=caseInput.GobearOptionalStringVehicleKumkaId.toString().trim()
		String lGobearFillOptionalStringPlanType=caseInput.GobearFillOptionalStringPlanType.toString().trim()
		String lGobearOptionalStringPlanType=caseInput.GobearOptionalStringPlanType.toString().trim()
		String lGobearFillOptionalStringPostalCode=caseInput.GobearFillOptionalStringPostalCode.toString().trim()
		String lGobearOptionalStringPostalCode=caseInput.GobearOptionalStringPostalCode.toString().trim()
		String lGobearFillOptionalStringOdometer=caseInput.GobearFillOptionalStringOdometer.toString().trim()
		String lGobearOptionalStringOdometer=caseInput.GobearOptionalStringOdometer.toString().trim()
		String lGobearFillOptionalStringCarInsuranceDue=caseInput.GobearFillOptionalStringCarInsuranceDue.toString().trim()
		String lGobearOptionalStringCarInsuranceDue=caseInput.GobearOptionalStringCarInsuranceDue.toString().trim()
		String lGobearFillOptionalStringNonce=caseInput.GobearFillOptionalStringNonce.toString().trim()
		String lGobearOptionalStringNonce=caseInput.GobearOptionalStringNonce.toString().trim()
		String lGobearFillOptionalIntegerNoOfDoor=caseInput.GobearFillOptionalIntegerNoOfDoor.toString().trim()
		String lGobearOptionalIntegerNoOfDoor=caseInput.GobearOptionalIntegerNoOfDoor.toString().trim()
		String lGobearFillOptionalBooleanFlagIsCarFinancing=caseInput.GobearFillOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lGobearOptionalBooleanFlagIsCarFinancing=caseInput.GobearOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lGobearExpectedHavePlan=caseInput.GobearExpectedHavePlan.toString().trim()
		String lPricezaRequiredStringUsername=caseInput.PricezaRequiredStringUsername.toString().trim()
		String lPricezaRequiredStringPassword=caseInput.PricezaRequiredStringPassword.toString().trim()
		String lPricezaRequiredStringBrand=caseInput.PricezaRequiredStringBrand.toString().trim()
		String lPricezaRequiredStringYear=caseInput.PricezaRequiredStringYear.toString().trim()
		String lPricezaRequiredStringModel=caseInput.PricezaRequiredStringModel.toString().trim()
		String lPricezaRequiredStringSubModel=caseInput.PricezaRequiredStringSubModel.toString().trim()
		String lPricezaRequiredStringEngineSize=caseInput.PricezaRequiredStringEngineSize.toString().trim()
		String lPricezaRequiredBooleanFlagIsMale=caseInput.PricezaRequiredBooleanFlagIsMale.toString().trim()
		String lPricezaRequiredBooleanFlagIsSingle=caseInput.PricezaRequiredBooleanFlagIsSingle.toString().trim()
		String lPricezaRequiredIntegerYearOfDriving=caseInput.PricezaRequiredIntegerYearOfDriving.toString().trim()
		String lPricezaRequiredStringNcbRate=caseInput.PricezaRequiredStringNcbRate.toString().trim()
		String lPricezaRequiredBooleanFlagIsDashcam=caseInput.PricezaRequiredBooleanFlagIsDashcam.toString().trim()
		String lPricezaRequiredBooleanFlagIsGoToWorkOnly=caseInput.PricezaRequiredBooleanFlagIsGoToWorkOnly.toString().trim()
		String lPricezaRequiredStringDob=caseInput.PricezaRequiredStringDob.toString().trim()
		String lPricezaRequiredIntegerNoOfClaim=caseInput.PricezaRequiredIntegerNoOfClaim.toString().trim()
		String lPricezaFillOptionalStringVehicleKumkaId=caseInput.PricezaFillOptionalStringVehicleKumkaId.toString().trim()
		String lPricezaOptionalStringVehicleKumkaId=caseInput.PricezaOptionalStringVehicleKumkaId.toString().trim()
		String lPricezaFillOptionalStringPlanType=caseInput.PricezaFillOptionalStringPlanType.toString().trim()
		String lPricezaOptionalStringPlanType=caseInput.PricezaOptionalStringPlanType.toString().trim()
		String lPricezaFillOptionalStringPostalCode=caseInput.PricezaFillOptionalStringPostalCode.toString().trim()
		String lPricezaOptionalStringPostalCode=caseInput.PricezaOptionalStringPostalCode.toString().trim()
		String lPricezaFillOptionalStringOdometer=caseInput.PricezaFillOptionalStringOdometer.toString().trim()
		String lPricezaOptionalStringOdometer=caseInput.PricezaOptionalStringOdometer.toString().trim()
		String lPricezaFillOptionalStringCarInsuranceDue=caseInput.PricezaFillOptionalStringCarInsuranceDue.toString().trim()
		String lPricezaOptionalStringCarInsuranceDue=caseInput.PricezaOptionalStringCarInsuranceDue.toString().trim()
		String lPricezaFillOptionalStringNonce=caseInput.PricezaFillOptionalStringNonce.toString().trim()
		String lPricezaOptionalStringNonce=caseInput.PricezaOptionalStringNonce.toString().trim()
		String lPricezaFillOptionalIntegerNoOfDoor=caseInput.PricezaFillOptionalIntegerNoOfDoor.toString().trim()
		String lPricezaOptionalIntegerNoOfDoor=caseInput.PricezaOptionalIntegerNoOfDoor.toString().trim()
		String lPricezaFillOptionalBooleanFlagIsCarFinancing=caseInput.PricezaFillOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lPricezaOptionalBooleanFlagIsCarFinancing=caseInput.PricezaOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lPricezaExpectedHavePlan=caseInput.PricezaExpectedHavePlan.toString().trim()
		String lKumkaRequiredStringUsername=caseInput.KumkaRequiredStringUsername.toString().trim()
		String lKumkaRequiredStringPassword=caseInput.KumkaRequiredStringPassword.toString().trim()
		String lKumkaRequiredStringBrand=caseInput.KumkaRequiredStringBrand.toString().trim()
		String lKumkaRequiredStringYear=caseInput.KumkaRequiredStringYear.toString().trim()
		String lKumkaRequiredStringModel=caseInput.KumkaRequiredStringModel.toString().trim()
		String lKumkaRequiredStringSubModel=caseInput.KumkaRequiredStringSubModel.toString().trim()
		String lKumkaRequiredStringEngineSize=caseInput.KumkaRequiredStringEngineSize.toString().trim()
		String lKumkaRequiredBooleanFlagIsMale=caseInput.KumkaRequiredBooleanFlagIsMale.toString().trim()
		String lKumkaRequiredBooleanFlagIsSingle=caseInput.KumkaRequiredBooleanFlagIsSingle.toString().trim()
		String lKumkaRequiredIntegerYearOfDriving=caseInput.KumkaRequiredIntegerYearOfDriving.toString().trim()
		String lKumkaRequiredStringNcbRate=caseInput.KumkaRequiredStringNcbRate.toString().trim()
		String lKumkaRequiredBooleanFlagIsDashcam=caseInput.KumkaRequiredBooleanFlagIsDashcam.toString().trim()
		String lKumkaRequiredBooleanFlagIsGoToWorkOnly=caseInput.KumkaRequiredBooleanFlagIsGoToWorkOnly.toString().trim()
		String lKumkaRequiredStringDob=caseInput.KumkaRequiredStringDob.toString().trim()
		String lKumkaRequiredIntegerNoOfClaim=caseInput.KumkaRequiredIntegerNoOfClaim.toString().trim()
		String lKumkaFillOptionalStringVehicleKumkaId=caseInput.KumkaFillOptionalStringVehicleKumkaId.toString().trim()
		String lKumkaOptionalStringVehicleKumkaId=caseInput.KumkaOptionalStringVehicleKumkaId.toString().trim()
		String lKumkaFillOptionalStringPlanType=caseInput.KumkaFillOptionalStringPlanType.toString().trim()
		String lKumkaOptionalStringPlanType=caseInput.KumkaOptionalStringPlanType.toString().trim()
		String lKumkaFillOptionalStringPostalCode=caseInput.KumkaFillOptionalStringPostalCode.toString().trim()
		String lKumkaOptionalStringPostalCode=caseInput.KumkaOptionalStringPostalCode.toString().trim()
		String lKumkaFillOptionalStringOdometer=caseInput.KumkaFillOptionalStringOdometer.toString().trim()
		String lKumkaOptionalStringOdometer=caseInput.KumkaOptionalStringOdometer.toString().trim()
		String lKumkaFillOptionalStringCarInsuranceDue=caseInput.KumkaFillOptionalStringCarInsuranceDue.toString().trim()
		String lKumkaOptionalStringCarInsuranceDue=caseInput.KumkaOptionalStringCarInsuranceDue.toString().trim()
		String lKumkaFillOptionalStringNonce=caseInput.KumkaFillOptionalStringNonce.toString().trim()
		String lKumkaOptionalStringNonce=caseInput.KumkaOptionalStringNonce.toString().trim()
		String lKumkaFillOptionalIntegerNoOfDoor=caseInput.KumkaFillOptionalIntegerNoOfDoor.toString().trim()
		String lKumkaOptionalIntegerNoOfDoor=caseInput.KumkaOptionalIntegerNoOfDoor.toString().trim()
		String lKumkaFillOptionalBooleanFlagIsCarFinancing=caseInput.KumkaFillOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lKumkaOptionalBooleanFlagIsCarFinancing=caseInput.KumkaOptionalBooleanFlagIsCarFinancing.toString().trim()
		String lKumkaExpectedHavePlan=caseInput.KumkaExpectedHavePlan.toString().trim()
		String lPositiveCase=caseInput.PositiveCase.toString().trim()
		String lActualResult=''
		String lResultMessage=''
		String lGobearEndPointVersion=''
		String lGobearResponseStatus=''
		String lGobearResponseTime=''
		String lGobearResponseText=''
		String lGobearNumberOfPlanList=''
		String lGobearActualResult=''
		String lPricezaEndPointVersion=''
		String lPricezaResponseStatus=''
		String lPricezaResponseTime=''
		String lPricezaResponseText=''
		String lPricezaNumberOfPlanList=''
		String lPricezaActualResult=''
		String lKumkaEndPointVersion=''
		String lKumkaResponseStatus=''
		String lKumkaResponseTime=''
		String lKumkaResponseText=''
		String lKumkaNumberOfPlanList=''
		String lKumkaActualResult=''
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
			Map lMapCheckGobear=this.inputCheckGobear(lCheckGobear)
			if(!lMapCheckGobear.Result){
				lCheckGobear=''
			}else{
				lCheckGobear=lMapCheckGobear.CheckGobear
			}
			caseOutput.CheckGobear=lCheckGobear
			if(lCheckGobear.length()<=0){
				return lreturn
			}
			Boolean lIsCheckGobear=IGNUemaHelper.convertStringToBoolean(lCheckGobear)
			Map lMapCheckPriceza=this.inputCheckPriceza(lCheckPriceza)
			if(!lMapCheckPriceza.Result){
				lCheckPriceza=''
			}else{
				lCheckPriceza=lMapCheckPriceza.CheckPriceza
			}
			caseOutput.CheckPriceza=lCheckPriceza
			if(lCheckPriceza.length()<=0){
				return lreturn
			}
			Boolean lIsCheckPriceza=IGNUemaHelper.convertStringToBoolean(lCheckPriceza)
			Map lMapCheckKumka=this.inputCheckKumka(lCheckKumka)
			if(!lMapCheckKumka.Result){
				lCheckKumka=''
			}else{
				lCheckKumka=lMapCheckKumka.CheckKumka
			}
			caseOutput.CheckKumka=lCheckKumka
			if(lCheckKumka.length()<=0){
				return lreturn
			}
			Boolean lIsCheckKumka=IGNUemaHelper.convertStringToBoolean(lCheckKumka)
			Map lMapCallPointGobear=this.inputCallPointGobear(lCallPointGobear)
			if(!lMapCallPointGobear.Result){
				lCallPointGobear=''
			}else{
				lCallPointGobear=lMapCallPointGobear.CallPointGobear
			}
			caseOutput.CallPointGobear=lCallPointGobear
			if(lCallPointGobear.length()<=0){
				return lreturn
			}
			Integer lCallPointGobearNum=IGNUemaHelper.convertStringToInteger(lCallPointGobear,this.DEFAULT_CALL_POINT_GOBEAR)
			Map lMapCallPointPriceza=this.inputCallPointPriceza(lCallPointPriceza)
			if(!lMapCallPointPriceza.Result){
				lCallPointPriceza=''
			}else{
				lCallPointPriceza=lMapCallPointPriceza.CallPointPriceza
			}
			caseOutput.CallPointPriceza=lCallPointPriceza
			if(lCallPointPriceza.length()<=0){
				return lreturn
			}
			Integer lCallPointPricezaNum=IGNUemaHelper.convertStringToInteger(lCallPointPriceza,this.DEFAULT_CALL_POINT_PRICEZA)
			Map lMapCallPointKumka=this.inputCallPointKumka(lCallPointKumka)
			if(!lMapCallPointKumka.Result){
				lCallPointKumka=''
			}else{
				lCallPointKumka=lMapCallPointKumka.CallPointKumka
			}
			caseOutput.CallPointKumka=lCallPointKumka
			if(lCallPointKumka.length()<=0){
				return lreturn
			}
			Integer lCallPointKumkaNum=IGNUemaHelper.convertStringToInteger(lCallPointKumka,this.DEFAULT_CALL_POINT_KUMKA)
			Boolean lIsOKGobear=false
			Boolean lIsOKPriceza=false
			Boolean lIsOKKumka=false
			Boolean lIsGobearActualResult=false
			Boolean lIsPricezaActualResult=false
			Boolean lIsKumkaActualResult=false
			if(lIsCheckGobear){
				Map lMapGobearRequiredStringUsername=this.inputGobearRequiredStringUsername(lGobearRequiredStringUsername)
				if(!lMapGobearRequiredStringUsername.Result){
					lGobearRequiredStringUsername=''
				}else{
					lGobearRequiredStringUsername=lMapGobearRequiredStringUsername.GobearRequiredStringUsername
				}
				caseOutput.GobearRequiredStringUsername=lGobearRequiredStringUsername
				Map lMapGobearRequiredStringPassword=this.inputGobearRequiredStringPassword(lGobearRequiredStringPassword)
				if(!lMapGobearRequiredStringPassword.Result){
					lGobearRequiredStringPassword=''
				}else{
					lGobearRequiredStringPassword=lMapGobearRequiredStringPassword.GobearRequiredStringPassword
				}
				caseOutput.GobearRequiredStringPassword=lGobearRequiredStringPassword
				Map lMapGobearRequiredStringBrand=this.inputGobearRequiredStringBrand(lGobearRequiredStringBrand)
				if(!lMapGobearRequiredStringBrand.Result){
					lGobearRequiredStringBrand=''
				}else{
					lGobearRequiredStringBrand=lMapGobearRequiredStringBrand.GobearRequiredStringBrand
				}
				caseOutput.GobearRequiredStringBrand=lGobearRequiredStringBrand
				Map lMapGobearRequiredStringYear=this.inputGobearRequiredStringYear(lGobearRequiredStringYear)
				if(!lMapGobearRequiredStringYear.Result){
					lGobearRequiredStringYear=''
				}else{
					lGobearRequiredStringYear=lMapGobearRequiredStringYear.GobearRequiredStringYear
				}
				caseOutput.GobearRequiredStringYear=lGobearRequiredStringYear
				Map lMapGobearRequiredStringModel=this.inputGobearRequiredStringModel(lGobearRequiredStringModel)
				if(!lMapGobearRequiredStringModel.Result){
					lGobearRequiredStringModel=''
				}else{
					lGobearRequiredStringModel=lMapGobearRequiredStringModel.GobearRequiredStringModel
				}
				caseOutput.GobearRequiredStringModel=lGobearRequiredStringModel
				Map lMapGobearRequiredStringSubModel=this.inputGobearRequiredStringSubModel(lGobearRequiredStringSubModel)
				if(!lMapGobearRequiredStringSubModel.Result){
					lGobearRequiredStringSubModel=''
				}else{
					lGobearRequiredStringSubModel=lMapGobearRequiredStringSubModel.GobearRequiredStringSubModel
				}
				caseOutput.GobearRequiredStringSubModel=lGobearRequiredStringSubModel
				Map lMapGobearRequiredStringEngineSize=this.inputGobearRequiredStringEngineSize(lGobearRequiredStringEngineSize)
				if(!lMapGobearRequiredStringEngineSize.Result){
					lGobearRequiredStringEngineSize=''
				}else{
					lGobearRequiredStringEngineSize=lMapGobearRequiredStringEngineSize.GobearRequiredStringEngineSize
				}
				caseOutput.GobearRequiredStringEngineSize=lGobearRequiredStringEngineSize
				Map lMapGobearRequiredBooleanFlagIsMale=this.inputGobearRequiredBooleanFlagIsMale(lGobearRequiredBooleanFlagIsMale)
				if(!lMapGobearRequiredBooleanFlagIsMale.Result){
					lGobearRequiredBooleanFlagIsMale=''
				}else{
					lGobearRequiredBooleanFlagIsMale=lMapGobearRequiredBooleanFlagIsMale.GobearRequiredBooleanFlagIsMale
				}
				caseOutput.GobearRequiredBooleanFlagIsMale=lGobearRequiredBooleanFlagIsMale
				if(lGobearRequiredBooleanFlagIsMale.length()<=0){
					return lreturn
				}
				Map lMapGobearRequiredBooleanFlagIsSingle=this.inputGobearRequiredBooleanFlagIsSingle(lGobearRequiredBooleanFlagIsSingle)
				if(!lMapGobearRequiredBooleanFlagIsSingle.Result){
					lGobearRequiredBooleanFlagIsSingle=''
				}else{
					lGobearRequiredBooleanFlagIsSingle=lMapGobearRequiredBooleanFlagIsSingle.GobearRequiredBooleanFlagIsSingle
				}
				caseOutput.GobearRequiredBooleanFlagIsSingle=lGobearRequiredBooleanFlagIsSingle
				Map lMapGobearRequiredIntegerYearOfDriving=this.inputGobearRequiredIntegerYearOfDriving(lGobearRequiredIntegerYearOfDriving)
				if(!lMapGobearRequiredIntegerYearOfDriving.Result){
					lGobearRequiredIntegerYearOfDriving=''
				}else{
					lGobearRequiredIntegerYearOfDriving=lMapGobearRequiredIntegerYearOfDriving.GobearRequiredIntegerYearOfDriving
				}
				caseOutput.GobearRequiredIntegerYearOfDriving=lGobearRequiredIntegerYearOfDriving
				Map lMapGobearRequiredStringNcbRate=this.inputGobearRequiredStringNcbRate(lGobearRequiredStringNcbRate)
				if(!lMapGobearRequiredStringNcbRate.Result){
					lGobearRequiredStringNcbRate=''
				}else{
					lGobearRequiredStringNcbRate=lMapGobearRequiredStringNcbRate.GobearRequiredStringNcbRate
				}
				caseOutput.GobearRequiredStringNcbRate=lGobearRequiredStringNcbRate
				if(lGobearRequiredStringNcbRate.length()<=0){
					return lreturn
				}
				Map lMapGobearRequiredBooleanFlagIsDashcam=this.inputGobearRequiredBooleanFlagIsDashcam(lGobearRequiredBooleanFlagIsDashcam)
				if(!lMapGobearRequiredBooleanFlagIsDashcam.Result){
					lGobearRequiredBooleanFlagIsDashcam=''
				}else{
					lGobearRequiredBooleanFlagIsDashcam=lMapGobearRequiredBooleanFlagIsDashcam.GobearRequiredBooleanFlagIsDashcam
				}
				caseOutput.GobearRequiredBooleanFlagIsDashcam=lGobearRequiredBooleanFlagIsDashcam
				Map lMapGobearRequiredBooleanFlagIsGoToWorkOnly=this.inputGobearRequiredBooleanFlagIsGoToWorkOnly(lGobearRequiredBooleanFlagIsGoToWorkOnly)
				if(!lMapGobearRequiredBooleanFlagIsGoToWorkOnly.Result){
					lGobearRequiredBooleanFlagIsGoToWorkOnly=''
				}else{
					lGobearRequiredBooleanFlagIsGoToWorkOnly=lMapGobearRequiredBooleanFlagIsGoToWorkOnly.GobearRequiredBooleanFlagIsGoToWorkOnly
				}
				caseOutput.GobearRequiredBooleanFlagIsGoToWorkOnly=lGobearRequiredBooleanFlagIsGoToWorkOnly
				Map lMapGobearRequiredStringDob=this.inputGobearRequiredStringDob(lGobearRequiredStringDob)
				if(!lMapGobearRequiredStringDob.Result){
					lGobearRequiredStringDob=''
				}else{
					lGobearRequiredStringDob=lMapGobearRequiredStringDob.GobearRequiredStringDob
				}
				caseOutput.GobearRequiredStringDob=lGobearRequiredStringDob
				Map lMapGobearRequiredIntegerNoOfClaim=this.inputGobearRequiredIntegerNoOfClaim(lGobearRequiredIntegerNoOfClaim)
				if(!lMapGobearRequiredIntegerNoOfClaim.Result){
					lGobearRequiredIntegerNoOfClaim=''
				}else{
					lGobearRequiredIntegerNoOfClaim=lMapGobearRequiredIntegerNoOfClaim.GobearRequiredIntegerNoOfClaim
				}
				caseOutput.GobearRequiredIntegerNoOfClaim=lGobearRequiredIntegerNoOfClaim
				Map lMapGobearFillOptionalStringVehicleKumkaId=this.inputGobearFillOptionalStringVehicleKumkaId(lGobearFillOptionalStringVehicleKumkaId)
				if(!lMapGobearFillOptionalStringVehicleKumkaId.Result){
					lGobearFillOptionalStringVehicleKumkaId=''
				}else{
					lGobearFillOptionalStringVehicleKumkaId=lMapGobearFillOptionalStringVehicleKumkaId.GobearFillOptionalStringVehicleKumkaId
				}
				caseOutput.GobearFillOptionalStringVehicleKumkaId=lGobearFillOptionalStringVehicleKumkaId
				Map lMapGobearOptionalStringVehicleKumkaId=this.inputGobearOptionalStringVehicleKumkaId(lGobearOptionalStringVehicleKumkaId)
				if(!lMapGobearOptionalStringVehicleKumkaId.Result){
					lGobearOptionalStringVehicleKumkaId=''
				}else{
					lGobearOptionalStringVehicleKumkaId=lMapGobearOptionalStringVehicleKumkaId.GobearOptionalStringVehicleKumkaId
				}
				caseOutput.GobearOptionalStringVehicleKumkaId=lGobearOptionalStringVehicleKumkaId
				Map lMapGobearFillOptionalStringPlanType=this.inputGobearFillOptionalStringPlanType(lGobearFillOptionalStringPlanType)
				if(!lMapGobearFillOptionalStringPlanType.Result){
					lGobearFillOptionalStringPlanType=''
				}else{
					lGobearFillOptionalStringPlanType=lMapGobearFillOptionalStringPlanType.GobearFillOptionalStringPlanType
				}
				caseOutput.GobearFillOptionalStringPlanType=lGobearFillOptionalStringPlanType
				Map lMapGobearOptionalStringPlanType=this.inputGobearOptionalStringPlanType(lGobearOptionalStringPlanType)
				if(!lMapGobearOptionalStringPlanType.Result){
					lGobearOptionalStringPlanType=''
				}else{
					lGobearOptionalStringPlanType=lMapGobearOptionalStringPlanType.GobearOptionalStringPlanType
				}
				caseOutput.GobearOptionalStringPlanType=lGobearOptionalStringPlanType
				Map lMapGobearFillOptionalStringPostalCode=this.inputGobearFillOptionalStringPostalCode(lGobearFillOptionalStringPostalCode)
				if(!lMapGobearFillOptionalStringPostalCode.Result){
					lGobearFillOptionalStringPostalCode=''
				}else{
					lGobearFillOptionalStringPostalCode=lMapGobearFillOptionalStringPostalCode.GobearFillOptionalStringPostalCode
				}
				caseOutput.GobearFillOptionalStringPostalCode=lGobearFillOptionalStringPostalCode
				Map lMapGobearOptionalStringPostalCode=this.inputGobearOptionalStringPostalCode(lGobearOptionalStringPostalCode)
				if(!lMapGobearOptionalStringPostalCode.Result){
					lGobearOptionalStringPostalCode=''
				}else{
					lGobearOptionalStringPostalCode=lMapGobearOptionalStringPostalCode.GobearOptionalStringPostalCode
				}
				caseOutput.GobearOptionalStringPostalCode=lGobearOptionalStringPostalCode
				Map lMapGobearFillOptionalStringOdometer=this.inputGobearFillOptionalStringOdometer(lGobearFillOptionalStringOdometer)
				if(!lMapGobearFillOptionalStringOdometer.Result){
					lGobearFillOptionalStringOdometer=''
				}else{
					lGobearFillOptionalStringOdometer=lMapGobearFillOptionalStringOdometer.GobearFillOptionalStringOdometer
				}
				caseOutput.GobearFillOptionalStringOdometer=lGobearFillOptionalStringOdometer
				Map lMapGobearOptionalStringOdometer=this.inputGobearOptionalStringOdometer(lGobearOptionalStringOdometer)
				if(!lMapGobearOptionalStringOdometer.Result){
					lGobearOptionalStringOdometer=''
				}else{
					lGobearOptionalStringOdometer=lMapGobearOptionalStringOdometer.GobearOptionalStringOdometer
				}
				caseOutput.GobearOptionalStringOdometer=lGobearOptionalStringOdometer
				Map lMapGobearFillOptionalStringCarInsuranceDue=this.inputGobearFillOptionalStringCarInsuranceDue(lGobearFillOptionalStringCarInsuranceDue)
				if(!lMapGobearFillOptionalStringCarInsuranceDue.Result){
					lGobearFillOptionalStringCarInsuranceDue=''
				}else{
					lGobearFillOptionalStringCarInsuranceDue=lMapGobearFillOptionalStringCarInsuranceDue.GobearFillOptionalStringCarInsuranceDue
				}
				caseOutput.GobearFillOptionalStringCarInsuranceDue=lGobearFillOptionalStringCarInsuranceDue
				Map lMapGobearOptionalStringCarInsuranceDue=this.inputGobearOptionalStringCarInsuranceDue(lGobearOptionalStringCarInsuranceDue)
				if(!lMapGobearOptionalStringCarInsuranceDue.Result){
					lGobearOptionalStringCarInsuranceDue=''
				}else{
					lGobearOptionalStringCarInsuranceDue=lMapGobearOptionalStringCarInsuranceDue.GobearOptionalStringCarInsuranceDue
				}
				caseOutput.GobearOptionalStringCarInsuranceDue=lGobearOptionalStringCarInsuranceDue
				Map lMapGobearFillOptionalStringNonce=this.inputGobearFillOptionalStringNonce(lGobearFillOptionalStringNonce)
				if(!lMapGobearFillOptionalStringNonce.Result){
					lGobearFillOptionalStringNonce=''
				}else{
					lGobearFillOptionalStringNonce=lMapGobearFillOptionalStringNonce.GobearFillOptionalStringNonce
				}
				caseOutput.GobearFillOptionalStringNonce=lGobearFillOptionalStringNonce
				Map lMapGobearOptionalStringNonce=this.inputGobearOptionalStringNonce(lGobearOptionalStringNonce)
				if(!lMapGobearOptionalStringNonce.Result){
					lGobearOptionalStringNonce=''
				}else{
					lGobearOptionalStringNonce=lMapGobearOptionalStringNonce.GobearOptionalStringNonce
				}
				caseOutput.GobearOptionalStringNonce=lGobearOptionalStringNonce
				Map lMapGobearFillOptionalIntegerNoOfDoor=this.inputGobearFillOptionalIntegerNoOfDoor(lGobearFillOptionalIntegerNoOfDoor)
				if(!lMapGobearFillOptionalIntegerNoOfDoor.Result){
					lGobearFillOptionalIntegerNoOfDoor=''
				}else{
					lGobearFillOptionalIntegerNoOfDoor=lMapGobearFillOptionalIntegerNoOfDoor.GobearFillOptionalIntegerNoOfDoor
				}
				caseOutput.GobearFillOptionalIntegerNoOfDoor=lGobearFillOptionalIntegerNoOfDoor
				Map lMapGobearOptionalIntegerNoOfDoor=this.inputGobearOptionalIntegerNoOfDoor(lGobearOptionalIntegerNoOfDoor)
				if(!lMapGobearOptionalIntegerNoOfDoor.Result){
					lGobearOptionalIntegerNoOfDoor=''
				}else{
					lGobearOptionalIntegerNoOfDoor=lMapGobearOptionalIntegerNoOfDoor.GobearOptionalIntegerNoOfDoor
				}
				caseOutput.GobearOptionalIntegerNoOfDoor=lGobearOptionalIntegerNoOfDoor
				Map lMapGobearFillOptionalBooleanFlagIsCarFinancing=this.inputGobearFillOptionalBooleanFlagIsCarFinancing(lGobearFillOptionalBooleanFlagIsCarFinancing)
				if(!lMapGobearFillOptionalBooleanFlagIsCarFinancing.Result){
					lGobearFillOptionalBooleanFlagIsCarFinancing=''
				}else{
					lGobearFillOptionalBooleanFlagIsCarFinancing=lMapGobearFillOptionalBooleanFlagIsCarFinancing.GobearFillOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.GobearFillOptionalBooleanFlagIsCarFinancing=lGobearFillOptionalBooleanFlagIsCarFinancing
				Map lMapGobearOptionalBooleanFlagIsCarFinancing=this.inputGobearOptionalBooleanFlagIsCarFinancing(lGobearOptionalBooleanFlagIsCarFinancing)
				if(!lMapGobearOptionalBooleanFlagIsCarFinancing.Result){
					lGobearOptionalBooleanFlagIsCarFinancing=''
				}else{
					lGobearOptionalBooleanFlagIsCarFinancing=lMapGobearOptionalBooleanFlagIsCarFinancing.GobearOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.GobearOptionalBooleanFlagIsCarFinancing=lGobearOptionalBooleanFlagIsCarFinancing
				Map lMapGobearExpectedHavePlan=this.inputGobearExpectedHavePlan(lGobearExpectedHavePlan)
				if(!lMapGobearExpectedHavePlan.Result){
					lGobearExpectedHavePlan=''
				}else{
					lGobearExpectedHavePlan=lMapGobearExpectedHavePlan.GobearExpectedHavePlan
				}
				caseOutput.GobearExpectedHavePlan=lGobearExpectedHavePlan
				Map lMapRoojaiAPI2InputOutputGobear=this.initRoojaiAPI2InputOutput()
				lMapRoojaiAPI2InputOutputGobear.CallPointStr=lCallPointGobear
				lMapRoojaiAPI2InputOutputGobear.CallPointNum=lCallPointGobearNum
				lMapRoojaiAPI2InputOutputGobear.RequiredStringUsername=lGobearRequiredStringUsername
				lMapRoojaiAPI2InputOutputGobear.RequiredStringPassword=lGobearRequiredStringPassword
				lMapRoojaiAPI2InputOutputGobear.RequiredStringBrand=lGobearRequiredStringBrand
				lMapRoojaiAPI2InputOutputGobear.RequiredStringYear=lGobearRequiredStringYear
				lMapRoojaiAPI2InputOutputGobear.RequiredStringModel=lGobearRequiredStringModel
				lMapRoojaiAPI2InputOutputGobear.RequiredStringSubModel=lGobearRequiredStringSubModel
				lMapRoojaiAPI2InputOutputGobear.RequiredStringEngineSize=lGobearRequiredStringEngineSize
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsMaleStr=lGobearRequiredBooleanFlagIsMale
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsMaleBool=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsMale)
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsSingleStr=lGobearRequiredBooleanFlagIsSingle
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsSingleBool=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsSingle)
				lMapRoojaiAPI2InputOutputGobear.RequiredIntegerYearOfDrivingStr=lGobearRequiredIntegerYearOfDriving
				lMapRoojaiAPI2InputOutputGobear.RequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lGobearRequiredIntegerYearOfDriving,this.DEFAULT_YEAR_OF_DRIVING_GOBEAR)
				lMapRoojaiAPI2InputOutputGobear.RequiredStringNcbRate=lGobearRequiredStringNcbRate
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsDashcamStr=lGobearRequiredBooleanFlagIsDashcam
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsDashcamBool=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsDashcam)
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsGoToWorkOnlyStr=lGobearRequiredBooleanFlagIsGoToWorkOnly
				lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsGoToWorkOnlyBool=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsGoToWorkOnly)
				lMapRoojaiAPI2InputOutputGobear.RequiredStringDob=lGobearRequiredStringDob
				lMapRoojaiAPI2InputOutputGobear.RequiredIntegerNoOfClaimStr=lGobearRequiredIntegerNoOfClaim
				lMapRoojaiAPI2InputOutputGobear.RequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lGobearRequiredIntegerNoOfClaim,this.DEFAULT_NUMBER_OF_CLAIM_GOBEAR)
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringVehicleKumkaIdStr=lGobearFillOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringVehicleKumkaIdBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringVehicleKumkaId)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringVehicleKumkaId=lGobearOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPlanTypeStr=lGobearFillOptionalStringPlanType
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPlanTypeBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringPlanType)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringPlanType=lGobearOptionalStringPlanType
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPostalCodeStr=lGobearFillOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPostalCodeBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringPostalCode)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringPostalCode=lGobearOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringOdometerStr=lGobearFillOptionalStringOdometer
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringOdometerBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringOdometer)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringOdometer=lGobearOptionalStringOdometer
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringCarInsuranceDueStr=lGobearFillOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringCarInsuranceDueBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringCarInsuranceDue)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringCarInsuranceDue=lGobearOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringNonceStr=lGobearFillOptionalStringNonce
				lMapRoojaiAPI2InputOutputGobear.FillOptionalStringNonceBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringNonce)
				lMapRoojaiAPI2InputOutputGobear.OptionalStringNonce=lGobearOptionalStringNonce
				lMapRoojaiAPI2InputOutputGobear.FillOptionalIntegerNoOfDoorStr=lGobearFillOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputGobear.FillOptionalIntegerNoOfDoorBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalIntegerNoOfDoor)
				lMapRoojaiAPI2InputOutputGobear.OptionalIntegerNoOfDoorStr=lGobearOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputGobear.OptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lGobearOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_GOBEAR)
				lMapRoojaiAPI2InputOutputGobear.FillOptionalBooleanFlagIsCarFinancingStr=lGobearFillOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputGobear.FillOptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputGobear.OptionalBooleanFlagIsCarFinancingStr=lGobearOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputGobear.OptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lGobearOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputGobear.ExpectedHavePlanStr=lGobearExpectedHavePlan
				lMapRoojaiAPI2InputOutputGobear.ExpectedHavePlanBool=IGNUemaHelper.convertStringToBoolean(lGobearExpectedHavePlan)
				lIsOKGobear=this.inputRoojaiAPI2InputOutputGobear(lMapRoojaiAPI2InputOutputGobear)
				if(!lIsOKGobear){
					lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,'Gobear=Error')
					caseOutput.ResultMessage=lResultMessage
				}
				lCallPointGobear=lMapRoojaiAPI2InputOutputGobear.CallPointStr
				caseOutput.CallPointGobear=lCallPointGobear
				lGobearRequiredStringUsername=lMapRoojaiAPI2InputOutputGobear.RequiredStringUsername
				caseOutput.GobearRequiredStringUsername=lGobearRequiredStringUsername
				lGobearRequiredStringPassword=lMapRoojaiAPI2InputOutputGobear.RequiredStringPassword
				caseOutput.GobearRequiredStringPassword=lGobearRequiredStringPassword
				lGobearRequiredStringBrand=lMapRoojaiAPI2InputOutputGobear.RequiredStringBrand
				caseOutput.GobearRequiredStringBrand=lGobearRequiredStringBrand
				lGobearRequiredStringYear=lMapRoojaiAPI2InputOutputGobear.RequiredStringYear
				caseOutput.GobearRequiredStringYear=lGobearRequiredStringYear
				lGobearRequiredStringModel=lMapRoojaiAPI2InputOutputGobear.RequiredStringModel
				caseOutput.GobearRequiredStringModel=lGobearRequiredStringModel
				lGobearRequiredStringSubModel=lMapRoojaiAPI2InputOutputGobear.RequiredStringSubModel
				caseOutput.GobearRequiredStringSubModel=lGobearRequiredStringSubModel
				lGobearRequiredStringEngineSize=lMapRoojaiAPI2InputOutputGobear.RequiredStringEngineSize
				caseOutput.GobearRequiredStringEngineSize=lGobearRequiredStringEngineSize
				lGobearRequiredBooleanFlagIsMale=lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsMaleStr
				caseOutput.GobearRequiredBooleanFlagIsMale=lGobearRequiredBooleanFlagIsMale
				lGobearRequiredBooleanFlagIsSingle=lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsSingleStr
				caseOutput.GobearRequiredBooleanFlagIsSingle=lGobearRequiredBooleanFlagIsSingle
				lGobearRequiredIntegerYearOfDriving=lMapRoojaiAPI2InputOutputGobear.RequiredIntegerYearOfDrivingStr
				caseOutput.GobearRequiredIntegerYearOfDriving=lGobearRequiredIntegerYearOfDriving
				lGobearRequiredStringNcbRate=lMapRoojaiAPI2InputOutputGobear.RequiredStringNcbRate
				caseOutput.GobearRequiredStringNcbRate=lGobearRequiredStringNcbRate
				lGobearRequiredBooleanFlagIsDashcam=lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsDashcamStr
				caseOutput.GobearRequiredBooleanFlagIsDashcam=lGobearRequiredBooleanFlagIsDashcam
				lGobearRequiredBooleanFlagIsGoToWorkOnly=lMapRoojaiAPI2InputOutputGobear.RequiredBooleanFlagIsGoToWorkOnlyStr
				caseOutput.GobearRequiredBooleanFlagIsGoToWorkOnly=lGobearRequiredBooleanFlagIsGoToWorkOnly
				lGobearRequiredStringDob=lMapRoojaiAPI2InputOutputGobear.RequiredStringDob
				caseOutput.GobearRequiredStringDob=lGobearRequiredStringDob
				lGobearRequiredIntegerNoOfClaim=lMapRoojaiAPI2InputOutputGobear.RequiredIntegerNoOfClaimStr
				caseOutput.GobearRequiredIntegerNoOfClaim=lGobearRequiredIntegerNoOfClaim
				lGobearFillOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringVehicleKumkaIdStr
				caseOutput.GobearFillOptionalStringVehicleKumkaId=lGobearFillOptionalStringVehicleKumkaId
				lGobearOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputGobear.OptionalStringVehicleKumkaId
				caseOutput.GobearOptionalStringVehicleKumkaId=lGobearOptionalStringVehicleKumkaId
				lGobearFillOptionalStringPlanType=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPlanTypeStr
				caseOutput.GobearFillOptionalStringPlanType=lGobearFillOptionalStringPlanType
				lGobearOptionalStringPlanType=lMapRoojaiAPI2InputOutputGobear.OptionalStringPlanType
				caseOutput.GobearOptionalStringPlanType=lGobearOptionalStringPlanType
				lGobearFillOptionalStringPostalCode=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringPostalCodeStr
				caseOutput.GobearFillOptionalStringPostalCode=lGobearFillOptionalStringPostalCode
				lGobearOptionalStringPostalCode=lMapRoojaiAPI2InputOutputGobear.OptionalStringPostalCode
				caseOutput.GobearOptionalStringPostalCode=lGobearOptionalStringPostalCode
				lGobearFillOptionalStringOdometer=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringOdometerStr
				caseOutput.GobearFillOptionalStringOdometer=lGobearFillOptionalStringOdometer
				lGobearOptionalStringOdometer=lMapRoojaiAPI2InputOutputGobear.OptionalStringOdometer
				caseOutput.GobearOptionalStringOdometer=lGobearOptionalStringOdometer
				lGobearFillOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringCarInsuranceDueStr
				caseOutput.GobearFillOptionalStringCarInsuranceDue=lGobearFillOptionalStringCarInsuranceDue
				lGobearOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputGobear.OptionalStringCarInsuranceDue
				caseOutput.GobearOptionalStringCarInsuranceDue=lGobearOptionalStringCarInsuranceDue
				lGobearFillOptionalStringNonce=lMapRoojaiAPI2InputOutputGobear.FillOptionalStringNonceStr
				caseOutput.GobearFillOptionalStringNonce=lGobearFillOptionalStringNonce
				lGobearOptionalStringNonce=lMapRoojaiAPI2InputOutputGobear.OptionalStringNonce
				caseOutput.GobearOptionalStringNonce=lGobearOptionalStringNonce
				lGobearFillOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputGobear.FillOptionalIntegerNoOfDoorStr
				caseOutput.GobearFillOptionalIntegerNoOfDoor=lGobearFillOptionalIntegerNoOfDoor
				lGobearOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputGobear.OptionalIntegerNoOfDoorStr
				caseOutput.GobearOptionalIntegerNoOfDoor=lGobearOptionalIntegerNoOfDoor
				lGobearFillOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputGobear.FillOptionalBooleanFlagIsCarFinancingStr
				caseOutput.GobearFillOptionalBooleanFlagIsCarFinancing=lGobearFillOptionalBooleanFlagIsCarFinancing
				lGobearOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputGobear.OptionalBooleanFlagIsCarFinancingStr
				caseOutput.GobearOptionalBooleanFlagIsCarFinancing=lGobearOptionalBooleanFlagIsCarFinancing
				lGobearExpectedHavePlan=lMapRoojaiAPI2InputOutputGobear.ExpectedHavePlanStr
				caseOutput.GobearExpectedHavePlan=lGobearExpectedHavePlan
				lGobearEndPointVersion=lMapRoojaiAPI2InputOutputGobear.EndPointVersion
				caseOutput.GobearEndPointVersion=lGobearEndPointVersion
				lGobearResponseStatus=lMapRoojaiAPI2InputOutputGobear.ResponseStatus
				caseOutput.GobearResponseStatus=lGobearResponseStatus
				lGobearResponseTime=lMapRoojaiAPI2InputOutputGobear.ResponseTime
				caseOutput.GobearResponseTime=lGobearResponseTime
				lGobearResponseText=lMapRoojaiAPI2InputOutputGobear.ResponseText
				caseOutput.GobearResponseText=lGobearResponseText
				lGobearNumberOfPlanList=lMapRoojaiAPI2InputOutputGobear.NumberOfPlanListStr
				caseOutput.GobearNumberOfPlanList=lGobearNumberOfPlanList
				lGobearActualResult=lMapRoojaiAPI2InputOutputGobear.ActualResultStr
				caseOutput.GobearActualResult=lGobearActualResult
				lIsGobearActualResult=lMapRoojaiAPI2InputOutputGobear.ActualResultBool
			}
			if(lIsCheckPriceza){
				Map lMapPricezaRequiredStringUsername=this.inputPricezaRequiredStringUsername(lPricezaRequiredStringUsername)
				if(!lMapPricezaRequiredStringUsername.Result){
					lPricezaRequiredStringUsername=''
				}else{
					lPricezaRequiredStringUsername=lMapPricezaRequiredStringUsername.PricezaRequiredStringUsername
				}
				caseOutput.PricezaRequiredStringUsername=lPricezaRequiredStringUsername
				Map lMapPricezaRequiredStringPassword=this.inputPricezaRequiredStringPassword(lPricezaRequiredStringPassword)
				if(!lMapPricezaRequiredStringPassword.Result){
					lPricezaRequiredStringPassword=''
				}else{
					lPricezaRequiredStringPassword=lMapPricezaRequiredStringPassword.PricezaRequiredStringPassword
				}
				caseOutput.PricezaRequiredStringPassword=lPricezaRequiredStringPassword
				Map lMapPricezaRequiredStringBrand=this.inputPricezaRequiredStringBrand(lPricezaRequiredStringBrand)
				if(!lMapPricezaRequiredStringBrand.Result){
					lPricezaRequiredStringBrand=''
				}else{
					lPricezaRequiredStringBrand=lMapPricezaRequiredStringBrand.PricezaRequiredStringBrand
				}
				caseOutput.PricezaRequiredStringBrand=lPricezaRequiredStringBrand
				Map lMapPricezaRequiredStringYear=this.inputPricezaRequiredStringYear(lPricezaRequiredStringYear)
				if(!lMapPricezaRequiredStringYear.Result){
					lPricezaRequiredStringYear=''
				}else{
					lPricezaRequiredStringYear=lMapPricezaRequiredStringYear.PricezaRequiredStringYear
				}
				caseOutput.PricezaRequiredStringYear=lPricezaRequiredStringYear
				Map lMapPricezaRequiredStringModel=this.inputPricezaRequiredStringModel(lPricezaRequiredStringModel)
				if(!lMapPricezaRequiredStringModel.Result){
					lPricezaRequiredStringModel=''
				}else{
					lPricezaRequiredStringModel=lMapPricezaRequiredStringModel.PricezaRequiredStringModel
				}
				caseOutput.PricezaRequiredStringModel=lPricezaRequiredStringModel
				Map lMapPricezaRequiredStringSubModel=this.inputPricezaRequiredStringSubModel(lPricezaRequiredStringSubModel)
				if(!lMapPricezaRequiredStringSubModel.Result){
					lPricezaRequiredStringSubModel=''
				}else{
					lPricezaRequiredStringSubModel=lMapPricezaRequiredStringSubModel.PricezaRequiredStringSubModel
				}
				caseOutput.PricezaRequiredStringSubModel=lPricezaRequiredStringSubModel
				Map lMapPricezaRequiredStringEngineSize=this.inputPricezaRequiredStringEngineSize(lPricezaRequiredStringEngineSize)
				if(!lMapPricezaRequiredStringEngineSize.Result){
					lPricezaRequiredStringEngineSize=''
				}else{
					lPricezaRequiredStringEngineSize=lMapPricezaRequiredStringEngineSize.PricezaRequiredStringEngineSize
				}
				caseOutput.PricezaRequiredStringEngineSize=lPricezaRequiredStringEngineSize
				Map lMapPricezaRequiredBooleanFlagIsMale=this.inputPricezaRequiredBooleanFlagIsMale(lPricezaRequiredBooleanFlagIsMale)
				if(!lMapPricezaRequiredBooleanFlagIsMale.Result){
					lPricezaRequiredBooleanFlagIsMale=''
				}else{
					lPricezaRequiredBooleanFlagIsMale=lMapPricezaRequiredBooleanFlagIsMale.PricezaRequiredBooleanFlagIsMale
				}
				caseOutput.PricezaRequiredBooleanFlagIsMale=lPricezaRequiredBooleanFlagIsMale
				if(lPricezaRequiredBooleanFlagIsMale.length()<=0){
					return lreturn
				}
				Map lMapPricezaRequiredBooleanFlagIsSingle=this.inputPricezaRequiredBooleanFlagIsSingle(lPricezaRequiredBooleanFlagIsSingle)
				if(!lMapPricezaRequiredBooleanFlagIsSingle.Result){
					lPricezaRequiredBooleanFlagIsSingle=''
				}else{
					lPricezaRequiredBooleanFlagIsSingle=lMapPricezaRequiredBooleanFlagIsSingle.PricezaRequiredBooleanFlagIsSingle
				}
				caseOutput.PricezaRequiredBooleanFlagIsSingle=lPricezaRequiredBooleanFlagIsSingle
				Map lMapPricezaRequiredIntegerYearOfDriving=this.inputPricezaRequiredIntegerYearOfDriving(lPricezaRequiredIntegerYearOfDriving)
				if(!lMapPricezaRequiredIntegerYearOfDriving.Result){
					lPricezaRequiredIntegerYearOfDriving=''
				}else{
					lPricezaRequiredIntegerYearOfDriving=lMapPricezaRequiredIntegerYearOfDriving.PricezaRequiredIntegerYearOfDriving
				}
				caseOutput.PricezaRequiredIntegerYearOfDriving=lPricezaRequiredIntegerYearOfDriving
				Map lMapPricezaRequiredStringNcbRate=this.inputPricezaRequiredStringNcbRate(lPricezaRequiredStringNcbRate)
				if(!lMapPricezaRequiredStringNcbRate.Result){
					lPricezaRequiredStringNcbRate=''
				}else{
					lPricezaRequiredStringNcbRate=lMapPricezaRequiredStringNcbRate.PricezaRequiredStringNcbRate
				}
				caseOutput.PricezaRequiredStringNcbRate=lPricezaRequiredStringNcbRate
				if(lPricezaRequiredStringNcbRate.length()<=0){
					return lreturn
				}
				Map lMapPricezaRequiredBooleanFlagIsDashcam=this.inputPricezaRequiredBooleanFlagIsDashcam(lPricezaRequiredBooleanFlagIsDashcam)
				if(!lMapPricezaRequiredBooleanFlagIsDashcam.Result){
					lPricezaRequiredBooleanFlagIsDashcam=''
				}else{
					lPricezaRequiredBooleanFlagIsDashcam=lMapPricezaRequiredBooleanFlagIsDashcam.PricezaRequiredBooleanFlagIsDashcam
				}
				caseOutput.PricezaRequiredBooleanFlagIsDashcam=lPricezaRequiredBooleanFlagIsDashcam
				Map lMapPricezaRequiredBooleanFlagIsGoToWorkOnly=this.inputPricezaRequiredBooleanFlagIsGoToWorkOnly(lPricezaRequiredBooleanFlagIsGoToWorkOnly)
				if(!lMapPricezaRequiredBooleanFlagIsGoToWorkOnly.Result){
					lPricezaRequiredBooleanFlagIsGoToWorkOnly=''
				}else{
					lPricezaRequiredBooleanFlagIsGoToWorkOnly=lMapPricezaRequiredBooleanFlagIsGoToWorkOnly.PricezaRequiredBooleanFlagIsGoToWorkOnly
				}
				caseOutput.PricezaRequiredBooleanFlagIsGoToWorkOnly=lPricezaRequiredBooleanFlagIsGoToWorkOnly
				Map lMapPricezaRequiredStringDob=this.inputPricezaRequiredStringDob(lPricezaRequiredStringDob)
				if(!lMapPricezaRequiredStringDob.Result){
					lPricezaRequiredStringDob=''
				}else{
					lPricezaRequiredStringDob=lMapPricezaRequiredStringDob.PricezaRequiredStringDob
				}
				caseOutput.PricezaRequiredStringDob=lPricezaRequiredStringDob
				Map lMapPricezaRequiredIntegerNoOfClaim=this.inputPricezaRequiredIntegerNoOfClaim(lPricezaRequiredIntegerNoOfClaim)
				if(!lMapPricezaRequiredIntegerNoOfClaim.Result){
					lPricezaRequiredIntegerNoOfClaim=''
				}else{
					lPricezaRequiredIntegerNoOfClaim=lMapPricezaRequiredIntegerNoOfClaim.PricezaRequiredIntegerNoOfClaim
				}
				caseOutput.PricezaRequiredIntegerNoOfClaim=lPricezaRequiredIntegerNoOfClaim
				Map lMapPricezaFillOptionalStringVehicleKumkaId=this.inputPricezaFillOptionalStringVehicleKumkaId(lPricezaFillOptionalStringVehicleKumkaId)
				if(!lMapPricezaFillOptionalStringVehicleKumkaId.Result){
					lPricezaFillOptionalStringVehicleKumkaId=''
				}else{
					lPricezaFillOptionalStringVehicleKumkaId=lMapPricezaFillOptionalStringVehicleKumkaId.PricezaFillOptionalStringVehicleKumkaId
				}
				caseOutput.PricezaFillOptionalStringVehicleKumkaId=lPricezaFillOptionalStringVehicleKumkaId
				Map lMapPricezaOptionalStringVehicleKumkaId=this.inputPricezaOptionalStringVehicleKumkaId(lPricezaOptionalStringVehicleKumkaId)
				if(!lMapPricezaOptionalStringVehicleKumkaId.Result){
					lPricezaOptionalStringVehicleKumkaId=''
				}else{
					lPricezaOptionalStringVehicleKumkaId=lMapPricezaOptionalStringVehicleKumkaId.PricezaOptionalStringVehicleKumkaId
				}
				caseOutput.PricezaOptionalStringVehicleKumkaId=lPricezaOptionalStringVehicleKumkaId
				Map lMapPricezaFillOptionalStringPlanType=this.inputPricezaFillOptionalStringPlanType(lPricezaFillOptionalStringPlanType)
				if(!lMapPricezaFillOptionalStringPlanType.Result){
					lPricezaFillOptionalStringPlanType=''
				}else{
					lPricezaFillOptionalStringPlanType=lMapPricezaFillOptionalStringPlanType.PricezaFillOptionalStringPlanType
				}
				caseOutput.PricezaFillOptionalStringPlanType=lPricezaFillOptionalStringPlanType
				Map lMapPricezaOptionalStringPlanType=this.inputPricezaOptionalStringPlanType(lPricezaOptionalStringPlanType)
				if(!lMapPricezaOptionalStringPlanType.Result){
					lPricezaOptionalStringPlanType=''
				}else{
					lPricezaOptionalStringPlanType=lMapPricezaOptionalStringPlanType.PricezaOptionalStringPlanType
				}
				caseOutput.PricezaOptionalStringPlanType=lPricezaOptionalStringPlanType
				Map lMapPricezaFillOptionalStringPostalCode=this.inputPricezaFillOptionalStringPostalCode(lPricezaFillOptionalStringPostalCode)
				if(!lMapPricezaFillOptionalStringPostalCode.Result){
					lPricezaFillOptionalStringPostalCode=''
				}else{
					lPricezaFillOptionalStringPostalCode=lMapPricezaFillOptionalStringPostalCode.PricezaFillOptionalStringPostalCode
				}
				caseOutput.PricezaFillOptionalStringPostalCode=lPricezaFillOptionalStringPostalCode
				Map lMapPricezaOptionalStringPostalCode=this.inputPricezaOptionalStringPostalCode(lPricezaOptionalStringPostalCode)
				if(!lMapPricezaOptionalStringPostalCode.Result){
					lPricezaOptionalStringPostalCode=''
				}else{
					lPricezaOptionalStringPostalCode=lMapPricezaOptionalStringPostalCode.PricezaOptionalStringPostalCode
				}
				caseOutput.PricezaOptionalStringPostalCode=lPricezaOptionalStringPostalCode
				Map lMapPricezaFillOptionalStringOdometer=this.inputPricezaFillOptionalStringOdometer(lPricezaFillOptionalStringOdometer)
				if(!lMapPricezaFillOptionalStringOdometer.Result){
					lPricezaFillOptionalStringOdometer=''
				}else{
					lPricezaFillOptionalStringOdometer=lMapPricezaFillOptionalStringOdometer.PricezaFillOptionalStringOdometer
				}
				caseOutput.PricezaFillOptionalStringOdometer=lPricezaFillOptionalStringOdometer
				Map lMapPricezaOptionalStringOdometer=this.inputPricezaOptionalStringOdometer(lPricezaOptionalStringOdometer)
				if(!lMapPricezaOptionalStringOdometer.Result){
					lPricezaOptionalStringOdometer=''
				}else{
					lPricezaOptionalStringOdometer=lMapPricezaOptionalStringOdometer.PricezaOptionalStringOdometer
				}
				caseOutput.PricezaOptionalStringOdometer=lPricezaOptionalStringOdometer
				Map lMapPricezaFillOptionalStringCarInsuranceDue=this.inputPricezaFillOptionalStringCarInsuranceDue(lPricezaFillOptionalStringCarInsuranceDue)
				if(!lMapPricezaFillOptionalStringCarInsuranceDue.Result){
					lPricezaFillOptionalStringCarInsuranceDue=''
				}else{
					lPricezaFillOptionalStringCarInsuranceDue=lMapPricezaFillOptionalStringCarInsuranceDue.PricezaFillOptionalStringCarInsuranceDue
				}
				caseOutput.PricezaFillOptionalStringCarInsuranceDue=lPricezaFillOptionalStringCarInsuranceDue
				Map lMapPricezaOptionalStringCarInsuranceDue=this.inputPricezaOptionalStringCarInsuranceDue(lPricezaOptionalStringCarInsuranceDue)
				if(!lMapPricezaOptionalStringCarInsuranceDue.Result){
					lPricezaOptionalStringCarInsuranceDue=''
				}else{
					lPricezaOptionalStringCarInsuranceDue=lMapPricezaOptionalStringCarInsuranceDue.PricezaOptionalStringCarInsuranceDue
				}
				caseOutput.PricezaOptionalStringCarInsuranceDue=lPricezaOptionalStringCarInsuranceDue
				Map lMapPricezaFillOptionalStringNonce=this.inputPricezaFillOptionalStringNonce(lPricezaFillOptionalStringNonce)
				if(!lMapPricezaFillOptionalStringNonce.Result){
					lPricezaFillOptionalStringNonce=''
				}else{
					lPricezaFillOptionalStringNonce=lMapPricezaFillOptionalStringNonce.PricezaFillOptionalStringNonce
				}
				caseOutput.PricezaFillOptionalStringNonce=lPricezaFillOptionalStringNonce
				Map lMapPricezaOptionalStringNonce=this.inputPricezaOptionalStringNonce(lPricezaOptionalStringNonce)
				if(!lMapPricezaOptionalStringNonce.Result){
					lPricezaOptionalStringNonce=''
				}else{
					lPricezaOptionalStringNonce=lMapPricezaOptionalStringNonce.PricezaOptionalStringNonce
				}
				caseOutput.PricezaOptionalStringNonce=lPricezaOptionalStringNonce
				Map lMapPricezaFillOptionalIntegerNoOfDoor=this.inputPricezaFillOptionalIntegerNoOfDoor(lPricezaFillOptionalIntegerNoOfDoor)
				if(!lMapPricezaFillOptionalIntegerNoOfDoor.Result){
					lPricezaFillOptionalIntegerNoOfDoor=''
				}else{
					lPricezaFillOptionalIntegerNoOfDoor=lMapPricezaFillOptionalIntegerNoOfDoor.PricezaFillOptionalIntegerNoOfDoor
				}
				caseOutput.PricezaFillOptionalIntegerNoOfDoor=lPricezaFillOptionalIntegerNoOfDoor
				Map lMapPricezaOptionalIntegerNoOfDoor=this.inputPricezaOptionalIntegerNoOfDoor(lPricezaOptionalIntegerNoOfDoor)
				if(!lMapPricezaOptionalIntegerNoOfDoor.Result){
					lPricezaOptionalIntegerNoOfDoor=''
				}else{
					lPricezaOptionalIntegerNoOfDoor=lMapPricezaOptionalIntegerNoOfDoor.PricezaOptionalIntegerNoOfDoor
				}
				caseOutput.PricezaOptionalIntegerNoOfDoor=lPricezaOptionalIntegerNoOfDoor
				Map lMapPricezaFillOptionalBooleanFlagIsCarFinancing=this.inputPricezaFillOptionalBooleanFlagIsCarFinancing(lPricezaFillOptionalBooleanFlagIsCarFinancing)
				if(!lMapPricezaFillOptionalBooleanFlagIsCarFinancing.Result){
					lPricezaFillOptionalBooleanFlagIsCarFinancing=''
				}else{
					lPricezaFillOptionalBooleanFlagIsCarFinancing=lMapPricezaFillOptionalBooleanFlagIsCarFinancing.PricezaFillOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.PricezaFillOptionalBooleanFlagIsCarFinancing=lPricezaFillOptionalBooleanFlagIsCarFinancing
				Map lMapPricezaOptionalBooleanFlagIsCarFinancing=this.inputPricezaOptionalBooleanFlagIsCarFinancing(lPricezaOptionalBooleanFlagIsCarFinancing)
				if(!lMapPricezaOptionalBooleanFlagIsCarFinancing.Result){
					lPricezaOptionalBooleanFlagIsCarFinancing=''
				}else{
					lPricezaOptionalBooleanFlagIsCarFinancing=lMapPricezaOptionalBooleanFlagIsCarFinancing.PricezaOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.PricezaOptionalBooleanFlagIsCarFinancing=lPricezaOptionalBooleanFlagIsCarFinancing
				Map lMapPricezaExpectedHavePlan=this.inputPricezaExpectedHavePlan(lPricezaExpectedHavePlan)
				if(!lMapPricezaExpectedHavePlan.Result){
					lPricezaExpectedHavePlan=''
				}else{
					lPricezaExpectedHavePlan=lMapPricezaExpectedHavePlan.PricezaExpectedHavePlan
				}
				caseOutput.PricezaExpectedHavePlan=lPricezaExpectedHavePlan
				Map lMapRoojaiAPI2InputOutputPriceza=this.initRoojaiAPI2InputOutput()
				lMapRoojaiAPI2InputOutputPriceza.CallPointStr=lCallPointPriceza
				lMapRoojaiAPI2InputOutputPriceza.CallPointNum=lCallPointPricezaNum
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringUsername=lPricezaRequiredStringUsername
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringPassword=lPricezaRequiredStringPassword
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringBrand=lPricezaRequiredStringBrand
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringYear=lPricezaRequiredStringYear
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringModel=lPricezaRequiredStringModel
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringSubModel=lPricezaRequiredStringSubModel
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringEngineSize=lPricezaRequiredStringEngineSize
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsMaleStr=lPricezaRequiredBooleanFlagIsMale
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsMaleBool=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsMale)
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsSingleStr=lPricezaRequiredBooleanFlagIsSingle
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsSingleBool=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsSingle)
				lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerYearOfDrivingStr=lPricezaRequiredIntegerYearOfDriving
				lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lPricezaRequiredIntegerYearOfDriving,this.DEFAULT_YEAR_OF_DRIVING_PRICEZA)
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringNcbRate=lPricezaRequiredStringNcbRate
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsDashcamStr=lPricezaRequiredBooleanFlagIsDashcam
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsDashcamBool=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsDashcam)
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsGoToWorkOnlyStr=lPricezaRequiredBooleanFlagIsGoToWorkOnly
				lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsGoToWorkOnlyBool=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsGoToWorkOnly)
				lMapRoojaiAPI2InputOutputPriceza.RequiredStringDob=lPricezaRequiredStringDob
				lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerNoOfClaimStr=lPricezaRequiredIntegerNoOfClaim
				lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lPricezaRequiredIntegerNoOfClaim,this.DEFAULT_NUMBER_OF_CLAIM_PRICEZA)
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringVehicleKumkaIdStr=lPricezaFillOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringVehicleKumkaIdBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringVehicleKumkaId)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringVehicleKumkaId=lPricezaOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPlanTypeStr=lPricezaFillOptionalStringPlanType
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPlanTypeBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringPlanType)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringPlanType=lPricezaOptionalStringPlanType
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPostalCodeStr=lPricezaFillOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPostalCodeBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringPostalCode)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringPostalCode=lPricezaOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringOdometerStr=lPricezaFillOptionalStringOdometer
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringOdometerBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringOdometer)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringOdometer=lPricezaOptionalStringOdometer
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringCarInsuranceDueStr=lPricezaFillOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringCarInsuranceDueBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringCarInsuranceDue)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringCarInsuranceDue=lPricezaOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringNonceStr=lPricezaFillOptionalStringNonce
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringNonceBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringNonce)
				lMapRoojaiAPI2InputOutputPriceza.OptionalStringNonce=lPricezaOptionalStringNonce
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalIntegerNoOfDoorStr=lPricezaFillOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalIntegerNoOfDoorBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalIntegerNoOfDoor)
				lMapRoojaiAPI2InputOutputPriceza.OptionalIntegerNoOfDoorStr=lPricezaOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputPriceza.OptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lPricezaOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_PRICEZA)
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalBooleanFlagIsCarFinancingStr=lPricezaFillOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputPriceza.FillOptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputPriceza.OptionalBooleanFlagIsCarFinancingStr=lPricezaOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputPriceza.OptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lPricezaOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputPriceza.ExpectedHavePlanStr=lPricezaExpectedHavePlan
				lMapRoojaiAPI2InputOutputPriceza.ExpectedHavePlanBool=IGNUemaHelper.convertStringToBoolean(lPricezaExpectedHavePlan)
				lIsOKPriceza=this.inputRoojaiAPI2InputOutputPriceza(lMapRoojaiAPI2InputOutputPriceza)
				if(!lIsOKPriceza){
					lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,'Priceza=Error')
					caseOutput.ResultMessage=lResultMessage
				}
				lCallPointPriceza=lMapRoojaiAPI2InputOutputPriceza.CallPointStr
				caseOutput.CallPointPriceza=lCallPointPriceza
				lPricezaRequiredStringUsername=lMapRoojaiAPI2InputOutputPriceza.RequiredStringUsername
				caseOutput.PricezaRequiredStringUsername=lPricezaRequiredStringUsername
				lPricezaRequiredStringPassword=lMapRoojaiAPI2InputOutputPriceza.RequiredStringPassword
				caseOutput.PricezaRequiredStringPassword=lPricezaRequiredStringPassword
				lPricezaRequiredStringBrand=lMapRoojaiAPI2InputOutputPriceza.RequiredStringBrand
				caseOutput.PricezaRequiredStringBrand=lPricezaRequiredStringBrand
				lPricezaRequiredStringYear=lMapRoojaiAPI2InputOutputPriceza.RequiredStringYear
				caseOutput.PricezaRequiredStringYear=lPricezaRequiredStringYear
				lPricezaRequiredStringModel=lMapRoojaiAPI2InputOutputPriceza.RequiredStringModel
				caseOutput.PricezaRequiredStringModel=lPricezaRequiredStringModel
				lPricezaRequiredStringSubModel=lMapRoojaiAPI2InputOutputPriceza.RequiredStringSubModel
				caseOutput.PricezaRequiredStringSubModel=lPricezaRequiredStringSubModel
				lPricezaRequiredStringEngineSize=lMapRoojaiAPI2InputOutputPriceza.RequiredStringEngineSize
				caseOutput.PricezaRequiredStringEngineSize=lPricezaRequiredStringEngineSize
				lPricezaRequiredBooleanFlagIsMale=lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsMaleStr
				caseOutput.PricezaRequiredBooleanFlagIsMale=lPricezaRequiredBooleanFlagIsMale
				lPricezaRequiredBooleanFlagIsSingle=lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsSingleStr
				caseOutput.PricezaRequiredBooleanFlagIsSingle=lPricezaRequiredBooleanFlagIsSingle
				lPricezaRequiredIntegerYearOfDriving=lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerYearOfDrivingStr
				caseOutput.PricezaRequiredIntegerYearOfDriving=lPricezaRequiredIntegerYearOfDriving
				lPricezaRequiredStringNcbRate=lMapRoojaiAPI2InputOutputPriceza.RequiredStringNcbRate
				caseOutput.PricezaRequiredStringNcbRate=lPricezaRequiredStringNcbRate
				lPricezaRequiredBooleanFlagIsDashcam=lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsDashcamStr
				caseOutput.PricezaRequiredBooleanFlagIsDashcam=lPricezaRequiredBooleanFlagIsDashcam
				lPricezaRequiredBooleanFlagIsGoToWorkOnly=lMapRoojaiAPI2InputOutputPriceza.RequiredBooleanFlagIsGoToWorkOnlyStr
				caseOutput.PricezaRequiredBooleanFlagIsGoToWorkOnly=lPricezaRequiredBooleanFlagIsGoToWorkOnly
				lPricezaRequiredStringDob=lMapRoojaiAPI2InputOutputPriceza.RequiredStringDob
				caseOutput.PricezaRequiredStringDob=lPricezaRequiredStringDob
				lPricezaRequiredIntegerNoOfClaim=lMapRoojaiAPI2InputOutputPriceza.RequiredIntegerNoOfClaimStr
				caseOutput.PricezaRequiredIntegerNoOfClaim=lPricezaRequiredIntegerNoOfClaim
				lPricezaFillOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringVehicleKumkaIdStr
				caseOutput.PricezaFillOptionalStringVehicleKumkaId=lPricezaFillOptionalStringVehicleKumkaId
				lPricezaOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputPriceza.OptionalStringVehicleKumkaId
				caseOutput.PricezaOptionalStringVehicleKumkaId=lPricezaOptionalStringVehicleKumkaId
				lPricezaFillOptionalStringPlanType=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPlanTypeStr
				caseOutput.PricezaFillOptionalStringPlanType=lPricezaFillOptionalStringPlanType
				lPricezaOptionalStringPlanType=lMapRoojaiAPI2InputOutputPriceza.OptionalStringPlanType
				caseOutput.PricezaOptionalStringPlanType=lPricezaOptionalStringPlanType
				lPricezaFillOptionalStringPostalCode=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringPostalCodeStr
				caseOutput.PricezaFillOptionalStringPostalCode=lPricezaFillOptionalStringPostalCode
				lPricezaOptionalStringPostalCode=lMapRoojaiAPI2InputOutputPriceza.OptionalStringPostalCode
				caseOutput.PricezaOptionalStringPostalCode=lPricezaOptionalStringPostalCode
				lPricezaFillOptionalStringOdometer=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringOdometerStr
				caseOutput.PricezaFillOptionalStringOdometer=lPricezaFillOptionalStringOdometer
				lPricezaOptionalStringOdometer=lMapRoojaiAPI2InputOutputPriceza.OptionalStringOdometer
				caseOutput.PricezaOptionalStringOdometer=lPricezaOptionalStringOdometer
				lPricezaFillOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringCarInsuranceDueStr
				caseOutput.PricezaFillOptionalStringCarInsuranceDue=lPricezaFillOptionalStringCarInsuranceDue
				lPricezaOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputPriceza.OptionalStringCarInsuranceDue
				caseOutput.PricezaOptionalStringCarInsuranceDue=lPricezaOptionalStringCarInsuranceDue
				lPricezaFillOptionalStringNonce=lMapRoojaiAPI2InputOutputPriceza.FillOptionalStringNonceStr
				caseOutput.PricezaFillOptionalStringNonce=lPricezaFillOptionalStringNonce
				lPricezaOptionalStringNonce=lMapRoojaiAPI2InputOutputPriceza.OptionalStringNonce
				caseOutput.PricezaOptionalStringNonce=lPricezaOptionalStringNonce
				lPricezaFillOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputPriceza.FillOptionalIntegerNoOfDoorStr
				caseOutput.PricezaFillOptionalIntegerNoOfDoor=lPricezaFillOptionalIntegerNoOfDoor
				lPricezaOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputPriceza.OptionalIntegerNoOfDoorStr
				caseOutput.PricezaOptionalIntegerNoOfDoor=lPricezaOptionalIntegerNoOfDoor
				lPricezaFillOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputPriceza.FillOptionalBooleanFlagIsCarFinancingStr
				caseOutput.PricezaFillOptionalBooleanFlagIsCarFinancing=lPricezaFillOptionalBooleanFlagIsCarFinancing
				lPricezaOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputPriceza.OptionalBooleanFlagIsCarFinancingStr
				caseOutput.PricezaOptionalBooleanFlagIsCarFinancing=lPricezaOptionalBooleanFlagIsCarFinancing
				lPricezaExpectedHavePlan=lMapRoojaiAPI2InputOutputPriceza.ExpectedHavePlanStr
				caseOutput.PricezaExpectedHavePlan=lPricezaExpectedHavePlan
				lPricezaEndPointVersion=lMapRoojaiAPI2InputOutputPriceza.EndPointVersion
				caseOutput.PricezaEndPointVersion=lPricezaEndPointVersion
				lPricezaResponseStatus=lMapRoojaiAPI2InputOutputPriceza.ResponseStatus
				caseOutput.PricezaResponseStatus=lPricezaResponseStatus
				lPricezaResponseTime=lMapRoojaiAPI2InputOutputPriceza.ResponseTime
				caseOutput.PricezaResponseTime=lPricezaResponseTime
				lPricezaResponseText=lMapRoojaiAPI2InputOutputPriceza.ResponseText
				caseOutput.PricezaResponseText=lPricezaResponseText
				lPricezaNumberOfPlanList=lMapRoojaiAPI2InputOutputPriceza.NumberOfPlanListStr
				caseOutput.PricezaNumberOfPlanList=lPricezaNumberOfPlanList
				lPricezaActualResult=lMapRoojaiAPI2InputOutputPriceza.ActualResultStr
				caseOutput.PricezaActualResult=lPricezaActualResult
				lIsPricezaActualResult=lMapRoojaiAPI2InputOutputPriceza.ActualResultBool
			}
			if(lIsCheckKumka){
				Map lMapKumkaRequiredStringUsername=this.inputKumkaRequiredStringUsername(lKumkaRequiredStringUsername)
				if(!lMapKumkaRequiredStringUsername.Result){
					lKumkaRequiredStringUsername=''
				}else{
					lKumkaRequiredStringUsername=lMapKumkaRequiredStringUsername.KumkaRequiredStringUsername
				}
				caseOutput.KumkaRequiredStringUsername=lKumkaRequiredStringUsername
				Map lMapKumkaRequiredStringPassword=this.inputKumkaRequiredStringPassword(lKumkaRequiredStringPassword)
				if(!lMapKumkaRequiredStringPassword.Result){
					lKumkaRequiredStringPassword=''
				}else{
					lKumkaRequiredStringPassword=lMapKumkaRequiredStringPassword.KumkaRequiredStringPassword
				}
				caseOutput.KumkaRequiredStringPassword=lKumkaRequiredStringPassword
				Map lMapKumkaRequiredStringBrand=this.inputKumkaRequiredStringBrand(lKumkaRequiredStringBrand)
				if(!lMapKumkaRequiredStringBrand.Result){
					lKumkaRequiredStringBrand=''
				}else{
					lKumkaRequiredStringBrand=lMapKumkaRequiredStringBrand.KumkaRequiredStringBrand
				}
				caseOutput.KumkaRequiredStringBrand=lKumkaRequiredStringBrand
				Map lMapKumkaRequiredStringYear=this.inputKumkaRequiredStringYear(lKumkaRequiredStringYear)
				if(!lMapKumkaRequiredStringYear.Result){
					lKumkaRequiredStringYear=''
				}else{
					lKumkaRequiredStringYear=lMapKumkaRequiredStringYear.KumkaRequiredStringYear
				}
				caseOutput.KumkaRequiredStringYear=lKumkaRequiredStringYear
				Map lMapKumkaRequiredStringModel=this.inputKumkaRequiredStringModel(lKumkaRequiredStringModel)
				if(!lMapKumkaRequiredStringModel.Result){
					lKumkaRequiredStringModel=''
				}else{
					lKumkaRequiredStringModel=lMapKumkaRequiredStringModel.KumkaRequiredStringModel
				}
				caseOutput.KumkaRequiredStringModel=lKumkaRequiredStringModel
				Map lMapKumkaRequiredStringSubModel=this.inputKumkaRequiredStringSubModel(lKumkaRequiredStringSubModel)
				if(!lMapKumkaRequiredStringSubModel.Result){
					lKumkaRequiredStringSubModel=''
				}else{
					lKumkaRequiredStringSubModel=lMapKumkaRequiredStringSubModel.KumkaRequiredStringSubModel
				}
				caseOutput.KumkaRequiredStringSubModel=lKumkaRequiredStringSubModel
				Map lMapKumkaRequiredStringEngineSize=this.inputKumkaRequiredStringEngineSize(lKumkaRequiredStringEngineSize)
				if(!lMapKumkaRequiredStringEngineSize.Result){
					lKumkaRequiredStringEngineSize=''
				}else{
					lKumkaRequiredStringEngineSize=lMapKumkaRequiredStringEngineSize.KumkaRequiredStringEngineSize
				}
				caseOutput.KumkaRequiredStringEngineSize=lKumkaRequiredStringEngineSize
				Map lMapKumkaRequiredBooleanFlagIsMale=this.inputKumkaRequiredBooleanFlagIsMale(lKumkaRequiredBooleanFlagIsMale)
				if(!lMapKumkaRequiredBooleanFlagIsMale.Result){
					lKumkaRequiredBooleanFlagIsMale=''
				}else{
					lKumkaRequiredBooleanFlagIsMale=lMapKumkaRequiredBooleanFlagIsMale.KumkaRequiredBooleanFlagIsMale
				}
				caseOutput.KumkaRequiredBooleanFlagIsMale=lKumkaRequiredBooleanFlagIsMale
				if(lKumkaRequiredBooleanFlagIsMale.length()<=0){
					return lreturn
				}
				Map lMapKumkaRequiredBooleanFlagIsSingle=this.inputKumkaRequiredBooleanFlagIsSingle(lKumkaRequiredBooleanFlagIsSingle)
				if(!lMapKumkaRequiredBooleanFlagIsSingle.Result){
					lKumkaRequiredBooleanFlagIsSingle=''
				}else{
					lKumkaRequiredBooleanFlagIsSingle=lMapKumkaRequiredBooleanFlagIsSingle.KumkaRequiredBooleanFlagIsSingle
				}
				caseOutput.KumkaRequiredBooleanFlagIsSingle=lKumkaRequiredBooleanFlagIsSingle
				Map lMapKumkaRequiredIntegerYearOfDriving=this.inputKumkaRequiredIntegerYearOfDriving(lKumkaRequiredIntegerYearOfDriving)
				if(!lMapKumkaRequiredIntegerYearOfDriving.Result){
					lKumkaRequiredIntegerYearOfDriving=''
				}else{
					lKumkaRequiredIntegerYearOfDriving=lMapKumkaRequiredIntegerYearOfDriving.KumkaRequiredIntegerYearOfDriving
				}
				caseOutput.KumkaRequiredIntegerYearOfDriving=lKumkaRequiredIntegerYearOfDriving
				Map lMapKumkaRequiredStringNcbRate=this.inputKumkaRequiredStringNcbRate(lKumkaRequiredStringNcbRate)
				if(!lMapKumkaRequiredStringNcbRate.Result){
					lKumkaRequiredStringNcbRate=''
				}else{
					lKumkaRequiredStringNcbRate=lMapKumkaRequiredStringNcbRate.KumkaRequiredStringNcbRate
				}
				caseOutput.KumkaRequiredStringNcbRate=lKumkaRequiredStringNcbRate
				if(lKumkaRequiredStringNcbRate.length()<=0){
					return lreturn
				}
				Map lMapKumkaRequiredBooleanFlagIsDashcam=this.inputKumkaRequiredBooleanFlagIsDashcam(lKumkaRequiredBooleanFlagIsDashcam)
				if(!lMapKumkaRequiredBooleanFlagIsDashcam.Result){
					lKumkaRequiredBooleanFlagIsDashcam=''
				}else{
					lKumkaRequiredBooleanFlagIsDashcam=lMapKumkaRequiredBooleanFlagIsDashcam.KumkaRequiredBooleanFlagIsDashcam
				}
				caseOutput.KumkaRequiredBooleanFlagIsDashcam=lKumkaRequiredBooleanFlagIsDashcam
				Map lMapKumkaRequiredBooleanFlagIsGoToWorkOnly=this.inputKumkaRequiredBooleanFlagIsGoToWorkOnly(lKumkaRequiredBooleanFlagIsGoToWorkOnly)
				if(!lMapKumkaRequiredBooleanFlagIsGoToWorkOnly.Result){
					lKumkaRequiredBooleanFlagIsGoToWorkOnly=''
				}else{
					lKumkaRequiredBooleanFlagIsGoToWorkOnly=lMapKumkaRequiredBooleanFlagIsGoToWorkOnly.KumkaRequiredBooleanFlagIsGoToWorkOnly
				}
				caseOutput.KumkaRequiredBooleanFlagIsGoToWorkOnly=lKumkaRequiredBooleanFlagIsGoToWorkOnly
				Map lMapKumkaRequiredStringDob=this.inputKumkaRequiredStringDob(lKumkaRequiredStringDob)
				if(!lMapKumkaRequiredStringDob.Result){
					lKumkaRequiredStringDob=''
				}else{
					lKumkaRequiredStringDob=lMapKumkaRequiredStringDob.KumkaRequiredStringDob
				}
				caseOutput.KumkaRequiredStringDob=lKumkaRequiredStringDob
				Map lMapKumkaRequiredIntegerNoOfClaim=this.inputKumkaRequiredIntegerNoOfClaim(lKumkaRequiredIntegerNoOfClaim)
				if(!lMapKumkaRequiredIntegerNoOfClaim.Result){
					lKumkaRequiredIntegerNoOfClaim=''
				}else{
					lKumkaRequiredIntegerNoOfClaim=lMapKumkaRequiredIntegerNoOfClaim.KumkaRequiredIntegerNoOfClaim
				}
				caseOutput.KumkaRequiredIntegerNoOfClaim=lKumkaRequiredIntegerNoOfClaim
				Map lMapKumkaFillOptionalStringVehicleKumkaId=this.inputKumkaFillOptionalStringVehicleKumkaId(lKumkaFillOptionalStringVehicleKumkaId)
				if(!lMapKumkaFillOptionalStringVehicleKumkaId.Result){
					lKumkaFillOptionalStringVehicleKumkaId=''
				}else{
					lKumkaFillOptionalStringVehicleKumkaId=lMapKumkaFillOptionalStringVehicleKumkaId.KumkaFillOptionalStringVehicleKumkaId
				}
				caseOutput.KumkaFillOptionalStringVehicleKumkaId=lKumkaFillOptionalStringVehicleKumkaId
				Map lMapKumkaOptionalStringVehicleKumkaId=this.inputKumkaOptionalStringVehicleKumkaId(lKumkaOptionalStringVehicleKumkaId)
				if(!lMapKumkaOptionalStringVehicleKumkaId.Result){
					lKumkaOptionalStringVehicleKumkaId=''
				}else{
					lKumkaOptionalStringVehicleKumkaId=lMapKumkaOptionalStringVehicleKumkaId.KumkaOptionalStringVehicleKumkaId
				}
				caseOutput.KumkaOptionalStringVehicleKumkaId=lKumkaOptionalStringVehicleKumkaId
				Map lMapKumkaFillOptionalStringPlanType=this.inputKumkaFillOptionalStringPlanType(lKumkaFillOptionalStringPlanType)
				if(!lMapKumkaFillOptionalStringPlanType.Result){
					lKumkaFillOptionalStringPlanType=''
				}else{
					lKumkaFillOptionalStringPlanType=lMapKumkaFillOptionalStringPlanType.KumkaFillOptionalStringPlanType
				}
				caseOutput.KumkaFillOptionalStringPlanType=lKumkaFillOptionalStringPlanType
				Map lMapKumkaOptionalStringPlanType=this.inputKumkaOptionalStringPlanType(lKumkaOptionalStringPlanType)
				if(!lMapKumkaOptionalStringPlanType.Result){
					lKumkaOptionalStringPlanType=''
				}else{
					lKumkaOptionalStringPlanType=lMapKumkaOptionalStringPlanType.KumkaOptionalStringPlanType
				}
				caseOutput.KumkaOptionalStringPlanType=lKumkaOptionalStringPlanType
				Map lMapKumkaFillOptionalStringPostalCode=this.inputKumkaFillOptionalStringPostalCode(lKumkaFillOptionalStringPostalCode)
				if(!lMapKumkaFillOptionalStringPostalCode.Result){
					lKumkaFillOptionalStringPostalCode=''
				}else{
					lKumkaFillOptionalStringPostalCode=lMapKumkaFillOptionalStringPostalCode.KumkaFillOptionalStringPostalCode
				}
				caseOutput.KumkaFillOptionalStringPostalCode=lKumkaFillOptionalStringPostalCode
				Map lMapKumkaOptionalStringPostalCode=this.inputKumkaOptionalStringPostalCode(lKumkaOptionalStringPostalCode)
				if(!lMapKumkaOptionalStringPostalCode.Result){
					lKumkaOptionalStringPostalCode=''
				}else{
					lKumkaOptionalStringPostalCode=lMapKumkaOptionalStringPostalCode.KumkaOptionalStringPostalCode
				}
				caseOutput.KumkaOptionalStringPostalCode=lKumkaOptionalStringPostalCode
				Map lMapKumkaFillOptionalStringOdometer=this.inputKumkaFillOptionalStringOdometer(lKumkaFillOptionalStringOdometer)
				if(!lMapKumkaFillOptionalStringOdometer.Result){
					lKumkaFillOptionalStringOdometer=''
				}else{
					lKumkaFillOptionalStringOdometer=lMapKumkaFillOptionalStringOdometer.KumkaFillOptionalStringOdometer
				}
				caseOutput.KumkaFillOptionalStringOdometer=lKumkaFillOptionalStringOdometer
				Map lMapKumkaOptionalStringOdometer=this.inputKumkaOptionalStringOdometer(lKumkaOptionalStringOdometer)
				if(!lMapKumkaOptionalStringOdometer.Result){
					lKumkaOptionalStringOdometer=''
				}else{
					lKumkaOptionalStringOdometer=lMapKumkaOptionalStringOdometer.KumkaOptionalStringOdometer
				}
				caseOutput.KumkaOptionalStringOdometer=lKumkaOptionalStringOdometer
				Map lMapKumkaFillOptionalStringCarInsuranceDue=this.inputKumkaFillOptionalStringCarInsuranceDue(lKumkaFillOptionalStringCarInsuranceDue)
				if(!lMapKumkaFillOptionalStringCarInsuranceDue.Result){
					lKumkaFillOptionalStringCarInsuranceDue=''
				}else{
					lKumkaFillOptionalStringCarInsuranceDue=lMapKumkaFillOptionalStringCarInsuranceDue.KumkaFillOptionalStringCarInsuranceDue
				}
				caseOutput.KumkaFillOptionalStringCarInsuranceDue=lKumkaFillOptionalStringCarInsuranceDue
				Map lMapKumkaOptionalStringCarInsuranceDue=this.inputKumkaOptionalStringCarInsuranceDue(lKumkaOptionalStringCarInsuranceDue)
				if(!lMapKumkaOptionalStringCarInsuranceDue.Result){
					lKumkaOptionalStringCarInsuranceDue=''
				}else{
					lKumkaOptionalStringCarInsuranceDue=lMapKumkaOptionalStringCarInsuranceDue.KumkaOptionalStringCarInsuranceDue
				}
				caseOutput.KumkaOptionalStringCarInsuranceDue=lKumkaOptionalStringCarInsuranceDue
				Map lMapKumkaFillOptionalStringNonce=this.inputKumkaFillOptionalStringNonce(lKumkaFillOptionalStringNonce)
				if(!lMapKumkaFillOptionalStringNonce.Result){
					lKumkaFillOptionalStringNonce=''
				}else{
					lKumkaFillOptionalStringNonce=lMapKumkaFillOptionalStringNonce.KumkaFillOptionalStringNonce
				}
				caseOutput.KumkaFillOptionalStringNonce=lKumkaFillOptionalStringNonce
				Map lMapKumkaOptionalStringNonce=this.inputKumkaOptionalStringNonce(lKumkaOptionalStringNonce)
				if(!lMapKumkaOptionalStringNonce.Result){
					lKumkaOptionalStringNonce=''
				}else{
					lKumkaOptionalStringNonce=lMapKumkaOptionalStringNonce.KumkaOptionalStringNonce
				}
				caseOutput.KumkaOptionalStringNonce=lKumkaOptionalStringNonce
				Map lMapKumkaFillOptionalIntegerNoOfDoor=this.inputKumkaFillOptionalIntegerNoOfDoor(lKumkaFillOptionalIntegerNoOfDoor)
				if(!lMapKumkaFillOptionalIntegerNoOfDoor.Result){
					lKumkaFillOptionalIntegerNoOfDoor=''
				}else{
					lKumkaFillOptionalIntegerNoOfDoor=lMapKumkaFillOptionalIntegerNoOfDoor.KumkaFillOptionalIntegerNoOfDoor
				}
				caseOutput.KumkaFillOptionalIntegerNoOfDoor=lKumkaFillOptionalIntegerNoOfDoor
				Map lMapKumkaOptionalIntegerNoOfDoor=this.inputKumkaOptionalIntegerNoOfDoor(lKumkaOptionalIntegerNoOfDoor)
				if(!lMapKumkaOptionalIntegerNoOfDoor.Result){
					lKumkaOptionalIntegerNoOfDoor=''
				}else{
					lKumkaOptionalIntegerNoOfDoor=lMapKumkaOptionalIntegerNoOfDoor.KumkaOptionalIntegerNoOfDoor
				}
				caseOutput.KumkaOptionalIntegerNoOfDoor=lKumkaOptionalIntegerNoOfDoor
				Map lMapKumkaFillOptionalBooleanFlagIsCarFinancing=this.inputKumkaFillOptionalBooleanFlagIsCarFinancing(lKumkaFillOptionalBooleanFlagIsCarFinancing)
				if(!lMapKumkaFillOptionalBooleanFlagIsCarFinancing.Result){
					lKumkaFillOptionalBooleanFlagIsCarFinancing=''
				}else{
					lKumkaFillOptionalBooleanFlagIsCarFinancing=lMapKumkaFillOptionalBooleanFlagIsCarFinancing.KumkaFillOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.KumkaFillOptionalBooleanFlagIsCarFinancing=lKumkaFillOptionalBooleanFlagIsCarFinancing
				Map lMapKumkaOptionalBooleanFlagIsCarFinancing=this.inputKumkaOptionalBooleanFlagIsCarFinancing(lKumkaOptionalBooleanFlagIsCarFinancing)
				if(!lMapKumkaOptionalBooleanFlagIsCarFinancing.Result){
					lKumkaOptionalBooleanFlagIsCarFinancing=''
				}else{
					lKumkaOptionalBooleanFlagIsCarFinancing=lMapKumkaOptionalBooleanFlagIsCarFinancing.KumkaOptionalBooleanFlagIsCarFinancing
				}
				caseOutput.KumkaOptionalBooleanFlagIsCarFinancing=lKumkaOptionalBooleanFlagIsCarFinancing
				Map lMapKumkaExpectedHavePlan=this.inputKumkaExpectedHavePlan(lKumkaExpectedHavePlan)
				if(!lMapKumkaExpectedHavePlan.Result){
					lKumkaExpectedHavePlan=''
				}else{
					lKumkaExpectedHavePlan=lMapKumkaExpectedHavePlan.KumkaExpectedHavePlan
				}
				caseOutput.KumkaExpectedHavePlan=lKumkaExpectedHavePlan
				Map lMapRoojaiAPI2InputOutputKumka=this.initRoojaiAPI2InputOutput()
				lMapRoojaiAPI2InputOutputKumka.CallPointStr=lCallPointKumka
				lMapRoojaiAPI2InputOutputKumka.CallPointNum=lCallPointKumkaNum
				lMapRoojaiAPI2InputOutputKumka.RequiredStringUsername=lKumkaRequiredStringUsername
				lMapRoojaiAPI2InputOutputKumka.RequiredStringPassword=lKumkaRequiredStringPassword
				lMapRoojaiAPI2InputOutputKumka.RequiredStringBrand=lKumkaRequiredStringBrand
				lMapRoojaiAPI2InputOutputKumka.RequiredStringYear=lKumkaRequiredStringYear
				lMapRoojaiAPI2InputOutputKumka.RequiredStringModel=lKumkaRequiredStringModel
				lMapRoojaiAPI2InputOutputKumka.RequiredStringSubModel=lKumkaRequiredStringSubModel
				lMapRoojaiAPI2InputOutputKumka.RequiredStringEngineSize=lKumkaRequiredStringEngineSize
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsMaleStr=lKumkaRequiredBooleanFlagIsMale
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsMaleBool=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsMale)
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsSingleStr=lKumkaRequiredBooleanFlagIsSingle
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsSingleBool=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsSingle)
				lMapRoojaiAPI2InputOutputKumka.RequiredIntegerYearOfDrivingStr=lKumkaRequiredIntegerYearOfDriving
				lMapRoojaiAPI2InputOutputKumka.RequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lKumkaRequiredIntegerYearOfDriving,this.DEFAULT_YEAR_OF_DRIVING_KUMKA)
				lMapRoojaiAPI2InputOutputKumka.RequiredStringNcbRate=lKumkaRequiredStringNcbRate
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsDashcamStr=lKumkaRequiredBooleanFlagIsDashcam
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsDashcamBool=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsDashcam)
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsGoToWorkOnlyStr=lKumkaRequiredBooleanFlagIsGoToWorkOnly
				lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsGoToWorkOnlyBool=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsGoToWorkOnly)
				lMapRoojaiAPI2InputOutputKumka.RequiredStringDob=lKumkaRequiredStringDob
				lMapRoojaiAPI2InputOutputKumka.RequiredIntegerNoOfClaimStr=lKumkaRequiredIntegerNoOfClaim
				lMapRoojaiAPI2InputOutputKumka.RequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lKumkaRequiredIntegerNoOfClaim,this.DEFAULT_NUMBER_OF_CLAIM_KUMKA)
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringVehicleKumkaIdStr=lKumkaFillOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringVehicleKumkaIdBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringVehicleKumkaId)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringVehicleKumkaId=lKumkaOptionalStringVehicleKumkaId
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPlanTypeStr=lKumkaFillOptionalStringPlanType
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPlanTypeBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringPlanType)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringPlanType=lKumkaOptionalStringPlanType
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPostalCodeStr=lKumkaFillOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPostalCodeBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringPostalCode)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringPostalCode=lKumkaOptionalStringPostalCode
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringOdometerStr=lKumkaFillOptionalStringOdometer
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringOdometerBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringOdometer)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringOdometer=lKumkaOptionalStringOdometer
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringCarInsuranceDueStr=lKumkaFillOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringCarInsuranceDueBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringCarInsuranceDue)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringCarInsuranceDue=lKumkaOptionalStringCarInsuranceDue
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringNonceStr=lKumkaFillOptionalStringNonce
				lMapRoojaiAPI2InputOutputKumka.FillOptionalStringNonceBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringNonce)
				lMapRoojaiAPI2InputOutputKumka.OptionalStringNonce=lKumkaOptionalStringNonce
				lMapRoojaiAPI2InputOutputKumka.FillOptionalIntegerNoOfDoorStr=lKumkaFillOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputKumka.FillOptionalIntegerNoOfDoorBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalIntegerNoOfDoor)
				lMapRoojaiAPI2InputOutputKumka.OptionalIntegerNoOfDoorStr=lKumkaOptionalIntegerNoOfDoor
				lMapRoojaiAPI2InputOutputKumka.OptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lKumkaOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_KUMKA)
				lMapRoojaiAPI2InputOutputKumka.FillOptionalBooleanFlagIsCarFinancingStr=lKumkaFillOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputKumka.FillOptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputKumka.OptionalBooleanFlagIsCarFinancingStr=lKumkaOptionalBooleanFlagIsCarFinancing
				lMapRoojaiAPI2InputOutputKumka.OptionalBooleanFlagIsCarFinancingBool=IGNUemaHelper.convertStringToBoolean(lKumkaOptionalBooleanFlagIsCarFinancing)
				lMapRoojaiAPI2InputOutputKumka.ExpectedHavePlanStr=lKumkaExpectedHavePlan
				lMapRoojaiAPI2InputOutputKumka.ExpectedHavePlanBool=IGNUemaHelper.convertStringToBoolean(lKumkaExpectedHavePlan)
				lIsOKKumka=this.inputRoojaiAPI2InputOutputKumka(lMapRoojaiAPI2InputOutputKumka)
				if(!lIsOKKumka){
					lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,'Kumka=Error')
					caseOutput.ResultMessage=lResultMessage
				}
				lCallPointKumka=lMapRoojaiAPI2InputOutputKumka.CallPointStr
				caseOutput.CallPointKumka=lCallPointKumka
				lKumkaRequiredStringUsername=lMapRoojaiAPI2InputOutputKumka.RequiredStringUsername
				caseOutput.KumkaRequiredStringUsername=lKumkaRequiredStringUsername
				lKumkaRequiredStringPassword=lMapRoojaiAPI2InputOutputKumka.RequiredStringPassword
				caseOutput.KumkaRequiredStringPassword=lKumkaRequiredStringPassword
				lKumkaRequiredStringBrand=lMapRoojaiAPI2InputOutputKumka.RequiredStringBrand
				caseOutput.KumkaRequiredStringBrand=lKumkaRequiredStringBrand
				lKumkaRequiredStringYear=lMapRoojaiAPI2InputOutputKumka.RequiredStringYear
				caseOutput.KumkaRequiredStringYear=lKumkaRequiredStringYear
				lKumkaRequiredStringModel=lMapRoojaiAPI2InputOutputKumka.RequiredStringModel
				caseOutput.KumkaRequiredStringModel=lKumkaRequiredStringModel
				lKumkaRequiredStringSubModel=lMapRoojaiAPI2InputOutputKumka.RequiredStringSubModel
				caseOutput.KumkaRequiredStringSubModel=lKumkaRequiredStringSubModel
				lKumkaRequiredStringEngineSize=lMapRoojaiAPI2InputOutputKumka.RequiredStringEngineSize
				caseOutput.KumkaRequiredStringEngineSize=lKumkaRequiredStringEngineSize
				lKumkaRequiredBooleanFlagIsMale=lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsMaleStr
				caseOutput.KumkaRequiredBooleanFlagIsMale=lKumkaRequiredBooleanFlagIsMale
				lKumkaRequiredBooleanFlagIsSingle=lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsSingleStr
				caseOutput.KumkaRequiredBooleanFlagIsSingle=lKumkaRequiredBooleanFlagIsSingle
				lKumkaRequiredIntegerYearOfDriving=lMapRoojaiAPI2InputOutputKumka.RequiredIntegerYearOfDrivingStr
				caseOutput.KumkaRequiredIntegerYearOfDriving=lKumkaRequiredIntegerYearOfDriving
				lKumkaRequiredStringNcbRate=lMapRoojaiAPI2InputOutputKumka.RequiredStringNcbRate
				caseOutput.KumkaRequiredStringNcbRate=lKumkaRequiredStringNcbRate
				lKumkaRequiredBooleanFlagIsDashcam=lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsDashcamStr
				caseOutput.KumkaRequiredBooleanFlagIsDashcam=lKumkaRequiredBooleanFlagIsDashcam
				lKumkaRequiredBooleanFlagIsGoToWorkOnly=lMapRoojaiAPI2InputOutputKumka.RequiredBooleanFlagIsGoToWorkOnlyStr
				caseOutput.KumkaRequiredBooleanFlagIsGoToWorkOnly=lKumkaRequiredBooleanFlagIsGoToWorkOnly
				lKumkaRequiredStringDob=lMapRoojaiAPI2InputOutputKumka.RequiredStringDob
				caseOutput.KumkaRequiredStringDob=lKumkaRequiredStringDob
				lKumkaRequiredIntegerNoOfClaim=lMapRoojaiAPI2InputOutputKumka.RequiredIntegerNoOfClaimStr
				caseOutput.KumkaRequiredIntegerNoOfClaim=lKumkaRequiredIntegerNoOfClaim
				lKumkaFillOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringVehicleKumkaIdStr
				caseOutput.KumkaFillOptionalStringVehicleKumkaId=lKumkaFillOptionalStringVehicleKumkaId
				lKumkaOptionalStringVehicleKumkaId=lMapRoojaiAPI2InputOutputKumka.OptionalStringVehicleKumkaId
				caseOutput.KumkaOptionalStringVehicleKumkaId=lKumkaOptionalStringVehicleKumkaId
				lKumkaFillOptionalStringPlanType=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPlanTypeStr
				caseOutput.KumkaFillOptionalStringPlanType=lKumkaFillOptionalStringPlanType
				lKumkaOptionalStringPlanType=lMapRoojaiAPI2InputOutputKumka.OptionalStringPlanType
				caseOutput.KumkaOptionalStringPlanType=lKumkaOptionalStringPlanType
				lKumkaFillOptionalStringPostalCode=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringPostalCodeStr
				caseOutput.KumkaFillOptionalStringPostalCode=lKumkaFillOptionalStringPostalCode
				lKumkaOptionalStringPostalCode=lMapRoojaiAPI2InputOutputKumka.OptionalStringPostalCode
				caseOutput.KumkaOptionalStringPostalCode=lKumkaOptionalStringPostalCode
				lKumkaFillOptionalStringOdometer=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringOdometerStr
				caseOutput.KumkaFillOptionalStringOdometer=lKumkaFillOptionalStringOdometer
				lKumkaOptionalStringOdometer=lMapRoojaiAPI2InputOutputKumka.OptionalStringOdometer
				caseOutput.KumkaOptionalStringOdometer=lKumkaOptionalStringOdometer
				lKumkaFillOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringCarInsuranceDueStr
				caseOutput.KumkaFillOptionalStringCarInsuranceDue=lKumkaFillOptionalStringCarInsuranceDue
				lKumkaOptionalStringCarInsuranceDue=lMapRoojaiAPI2InputOutputKumka.OptionalStringCarInsuranceDue
				caseOutput.KumkaOptionalStringCarInsuranceDue=lKumkaOptionalStringCarInsuranceDue
				lKumkaFillOptionalStringNonce=lMapRoojaiAPI2InputOutputKumka.FillOptionalStringNonceStr
				caseOutput.KumkaFillOptionalStringNonce=lKumkaFillOptionalStringNonce
				lKumkaOptionalStringNonce=lMapRoojaiAPI2InputOutputKumka.OptionalStringNonce
				caseOutput.KumkaOptionalStringNonce=lKumkaOptionalStringNonce
				lKumkaFillOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputKumka.FillOptionalIntegerNoOfDoorStr
				caseOutput.KumkaFillOptionalIntegerNoOfDoor=lKumkaFillOptionalIntegerNoOfDoor
				lKumkaOptionalIntegerNoOfDoor=lMapRoojaiAPI2InputOutputKumka.OptionalIntegerNoOfDoorStr
				caseOutput.KumkaOptionalIntegerNoOfDoor=lKumkaOptionalIntegerNoOfDoor
				lKumkaFillOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputKumka.FillOptionalBooleanFlagIsCarFinancingStr
				caseOutput.KumkaFillOptionalBooleanFlagIsCarFinancing=lKumkaFillOptionalBooleanFlagIsCarFinancing
				lKumkaOptionalBooleanFlagIsCarFinancing=lMapRoojaiAPI2InputOutputKumka.OptionalBooleanFlagIsCarFinancingStr
				caseOutput.KumkaOptionalBooleanFlagIsCarFinancing=lKumkaOptionalBooleanFlagIsCarFinancing
				lKumkaExpectedHavePlan=lMapRoojaiAPI2InputOutputKumka.ExpectedHavePlanStr
				caseOutput.KumkaExpectedHavePlan=lKumkaExpectedHavePlan
				lKumkaEndPointVersion=lMapRoojaiAPI2InputOutputKumka.EndPointVersion
				caseOutput.KumkaEndPointVersion=lKumkaEndPointVersion
				lKumkaResponseStatus=lMapRoojaiAPI2InputOutputKumka.ResponseStatus
				caseOutput.KumkaResponseStatus=lKumkaResponseStatus
				lKumkaResponseTime=lMapRoojaiAPI2InputOutputKumka.ResponseTime
				caseOutput.KumkaResponseTime=lKumkaResponseTime
				lKumkaResponseText=lMapRoojaiAPI2InputOutputKumka.ResponseText
				caseOutput.KumkaResponseText=lKumkaResponseText
				lKumkaNumberOfPlanList=lMapRoojaiAPI2InputOutputKumka.NumberOfPlanListStr
				caseOutput.KumkaNumberOfPlanList=lKumkaNumberOfPlanList
				lKumkaActualResult=lMapRoojaiAPI2InputOutputKumka.ActualResultStr
				caseOutput.KumkaActualResult=lKumkaActualResult
				lIsKumkaActualResult=lMapRoojaiAPI2InputOutputKumka.ActualResultBool
			}
			Boolean lIsTqmActualResult=false
			THARoojaiAPI2SubmitPolicyUtil lTHARoojaiAPI2SubmitPolicyUtil=new THARoojaiAPI2SubmitPolicyUtil()
			Boolean lIsTHARoojaiAPI2SubmitPolicyResult=lTHARoojaiAPI2SubmitPolicyUtil.inputCase(caseInput,caseOutput)
			if(lIsTHARoojaiAPI2SubmitPolicyResult){
				lIsTqmActualResult=lIsTHARoojaiAPI2SubmitPolicyResult
			}
			Boolean lIsCheckTqm=caseOutput.TqmNewBizToDo
			if(lIsCheckTqm){
				caseOutput.TqmNewBizActualResult=lIsTHARoojaiAPI2SubmitPolicyResult
			}
			Map lMapActualResult=this.inputActualResult(lIsPositiveCase,lIsCheckGobear,lIsOKGobear,lIsGobearActualResult,lIsCheckPriceza,lIsOKPriceza,lIsPricezaActualResult,lIsCheckKumka,lIsOKKumka,lIsKumkaActualResult,lIsCheckTqm,lIsTqmActualResult)
			if(!lMapActualResult.Result){
				lActualResult=''
			}else{
				lActualResult=lMapActualResult.ActualResult
			}
			caseOutput.ActualResult=lActualResult
			lreturn=IGNUemaHelper.convertStringToBoolean(lActualResult)
			IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_FLAG=true
			IGNUemaHelper.CURRENT_TEST_SUITE_RESULT_ACTUAL_RESULT=lreturn
		}catch(Exception e){
			e.printStackTrace()
			lResultMessage=IGNUemaHelper.concatMessageLeftRightByPipe(lResultMessage,e.getMessage())
			caseOutput.ResultMessage=lResultMessage
			return lreturn
		}
		return lreturn
	}
	public Map inputPositiveCase(String strPositiveCase){
		Map lreturn=[:]
		String lPositiveCase=strPositiveCase.trim()
		if(lPositiveCase.length()<=0){
			lPositiveCase=THARoojaiAPI2GetPlanListType.DEFAULT_POSITIVE_CASE
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
				lreturn.put('IsPositiveCase',lIsPositiveCase)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputActualResult(Boolean isPositiveCase,Boolean isCheckGobear,Boolean isOKGobear,Boolean isGobearActualResult,Boolean isCheckPriceza,Boolean isOKPriceza,Boolean isPricezaActualResult,Boolean isCheckKumka,Boolean isOKKumka,Boolean isKumkaActualResult,Boolean isCheckTqm,Boolean isTqmActualResult){
		Map lreturn=[:]
		String lActualResult=''
		try{
			Boolean lResult=false
			lreturn.put('ActualResult','')
			lreturn.put('Result',lResult)
			Boolean lIsActualResult=false
			Boolean lIsOK=true
			if(isCheckGobear){
				lIsOK=lIsOK&&isOKGobear&&isGobearActualResult
			}
			if(isCheckPriceza){
				lIsOK=lIsOK&&isOKPriceza&&isPricezaActualResult
			}
			if(isCheckKumka){
				lIsOK=lIsOK&&isOKKumka&&isKumkaActualResult
			}
			if(isCheckTqm){
				lIsOK=lIsOK&&isTqmActualResult
			}
			if(isPositiveCase){
				lIsActualResult=lIsOK
			}else{
				lIsActualResult=!lIsOK
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
	public Map inputCheckGobear(String strCheckGobear){
		Map lreturn=[:]
		String lCheckGobear=strCheckGobear.trim()
		if(lCheckGobear.length()<=0){
			lCheckGobear=THARoojaiAPI2GetPlanListType.DEFAULT_CHECK_GOBEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CheckGobear','')
			lreturn.put('Result',lResult)
			Boolean lIsCheckGobear=IGNUemaHelper.convertStringToBoolean(lCheckGobear)
			lCheckGobear=IGNUemaHelper.convertBooleanToString(lIsCheckGobear)
			lResult=lCheckGobear.length()>0
			if(lResult){
				lreturn.put('CheckGobear',lCheckGobear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCheckPriceza(String strCheckPriceza){
		Map lreturn=[:]
		String lCheckPriceza=strCheckPriceza.trim()
		if(lCheckPriceza.length()<=0){
			lCheckPriceza=THARoojaiAPI2GetPlanListType.DEFAULT_CHECK_PRICEZA
		}
		try{
			Boolean lResult=false
			lreturn.put('CheckPriceza','')
			lreturn.put('Result',lResult)
			Boolean lIsCheckPriceza=IGNUemaHelper.convertStringToBoolean(lCheckPriceza)
			lCheckPriceza=IGNUemaHelper.convertBooleanToString(lIsCheckPriceza)
			lResult=lCheckPriceza.length()>0
			if(lResult){
				lreturn.put('CheckPriceza',lCheckPriceza)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCheckKumka(String strCheckKumka){
		Map lreturn=[:]
		String lCheckKumka=strCheckKumka.trim()
		if(lCheckKumka.length()<=0){
			lCheckKumka=THARoojaiAPI2GetPlanListType.DEFAULT_CHECK_KUMKA
		}
		try{
			Boolean lResult=false
			lreturn.put('CheckKumka','')
			lreturn.put('Result',lResult)
			Boolean lIsCheckKumka=IGNUemaHelper.convertStringToBoolean(lCheckKumka)
			lCheckKumka=IGNUemaHelper.convertBooleanToString(lIsCheckKumka)
			lResult=lCheckKumka.length()>0
			if(lResult){
				lreturn.put('CheckKumka',lCheckKumka)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static final Map DEFAULT_LIST_CALL_POINT=['1':'1','2':'2']
	public static final Integer DEFAULT_CALL_POINT_GOBEAR=2
	public static final Integer DEFAULT_CALL_POINT_PRICEZA=2
	public static final Integer DEFAULT_CALL_POINT_KUMKA=1
	public static final Map DEFAULT_LIST_YEAR_OF_DRIVING=['0':'0','1':'1','2':'2','3':'3','4':'4','5':'5','6':'6']
	public static final Integer DEFAULT_YEAR_OF_DRIVING_GOBEAR=6
	public static final Integer DEFAULT_YEAR_OF_DRIVING_PRICEZA=6
	public static final Integer DEFAULT_YEAR_OF_DRIVING_KUMKA=6
	public static final Map DEFAULT_LIST_NCB_RATE=['0':'0','1':'20','2':'30','3':'40','4':'50','5':'N']
	public static final Map DEFAULT_LIST_NUMBER_OF_CLAIM=['0':'0','1':'1','2':'2','3':'3']
	public static final Integer DEFAULT_NUMBER_OF_CLAIM_GOBEAR=0
	public static final Integer DEFAULT_NUMBER_OF_CLAIM_PRICEZA=0
	public static final Integer DEFAULT_NUMBER_OF_CLAIM_KUMKA=0
	public static final Map DEFAULT_LIST_PLAN_TYPE=['1':'1','2':'2+','3':'2','4':'3+','5':'3']
	public static final Map DEFAULT_LIST_CAR_INSURANCE_DUE=['1':'within30days','2':'within3months']
	public static final Integer DEFAULT_NUMBER_OF_DOOR_GOBEAR=0
	public static final Integer DEFAULT_NUMBER_OF_DOOR_PRICEZA=0
	public static final Integer DEFAULT_NUMBER_OF_DOOR_KUMKA=0
	public Map inputCallPointGobear(String strCallPointGobear){
		Map lreturn=[:]
		String lCallPointGobear=strCallPointGobear.trim()
		if(lCallPointGobear.length()<=0){
			lCallPointGobear=THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_GOBEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('CallPointGobear','')
			lreturn.put('Result',lResult)
			String lCallPointGobearItem=this.DEFAULT_LIST_CALL_POINT.get(lCallPointGobear)
			if(!lCallPointGobearItem){
				lCallPointGobearItem=this.DEFAULT_LIST_CALL_POINT.get(THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_GOBEAR)
			}
			Integer lCallPointGobearNum=IGNUemaHelper.convertStringToInteger(lCallPointGobearItem,this.DEFAULT_CALL_POINT_GOBEAR)
			lCallPointGobear=lCallPointGobearNum.toString()
			lResult=lCallPointGobear.length()>0
			if(lResult){
				lreturn.put('CallPointGobear',lCallPointGobear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallPointPriceza(String strCallPointPriceza){
		Map lreturn=[:]
		String lCallPointPriceza=strCallPointPriceza.trim()
		if(lCallPointPriceza.length()<=0){
			lCallPointPriceza=THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_PRICEZA
		}
		try{
			Boolean lResult=false
			lreturn.put('CallPointPriceza','')
			lreturn.put('Result',lResult)
			String lCallPointPricezaItem=this.DEFAULT_LIST_CALL_POINT.get(lCallPointPriceza)
			if(!lCallPointPricezaItem){
				lCallPointPricezaItem=this.DEFAULT_LIST_CALL_POINT.get(THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_PRICEZA)
			}
			Integer lCallPointPricezaNum=IGNUemaHelper.convertStringToInteger(lCallPointPricezaItem,this.DEFAULT_CALL_POINT_PRICEZA)
			lCallPointPriceza=lCallPointPricezaNum.toString()
			lResult=lCallPointPriceza.length()>0
			if(lResult){
				lreturn.put('CallPointPriceza',lCallPointPriceza)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputCallPointKumka(String strCallPointKumka){
		Map lreturn=[:]
		String lCallPointKumka=strCallPointKumka.trim()
		if(lCallPointKumka.length()<=0){
			lCallPointKumka=THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_KUMKA
		}
		try{
			Boolean lResult=false
			lreturn.put('CallPointKumka','')
			lreturn.put('Result',lResult)
			String lCallPointKumkaItem=this.DEFAULT_LIST_CALL_POINT.get(lCallPointKumka)
			if(!lCallPointKumkaItem){
				lCallPointKumkaItem=this.DEFAULT_LIST_CALL_POINT.get(THARoojaiAPI2GetPlanListType.DEFAULT_CALL_POINT_KUMKA)
			}
			Integer lCallPointKumkaNum=IGNUemaHelper.convertStringToInteger(lCallPointKumkaItem,this.DEFAULT_CALL_POINT_KUMKA)
			lCallPointKumka=lCallPointKumkaNum.toString()
			lResult=lCallPointKumka.length()>0
			if(lResult){
				lreturn.put('CallPointKumka',lCallPointKumka)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringUsername(String strGobearRequiredStringUsername){
		Map lreturn=[:]
		String lGobearRequiredStringUsername=strGobearRequiredStringUsername.trim()
		if(lGobearRequiredStringUsername.length()<=0){
			lGobearRequiredStringUsername=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_USERNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringUsername','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringUsername.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringUsername',lGobearRequiredStringUsername)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringPassword(String strGobearRequiredStringPassword){
		Map lreturn=[:]
		String lGobearRequiredStringPassword=strGobearRequiredStringPassword.trim()
		if(lGobearRequiredStringPassword.length()<=0){
			lGobearRequiredStringPassword=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringPassword','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringPassword.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringPassword',lGobearRequiredStringPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringBrand(String strGobearRequiredStringBrand){
		Map lreturn=[:]
		String lGobearRequiredStringBrand=strGobearRequiredStringBrand.trim()
		if(lGobearRequiredStringBrand.length()<=0){
			lGobearRequiredStringBrand=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_BRAND
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringBrand','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringBrand.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringBrand',lGobearRequiredStringBrand)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringYear(String strGobearRequiredStringYear){
		Map lreturn=[:]
		String lGobearRequiredStringYear=strGobearRequiredStringYear.trim()
		if(lGobearRequiredStringYear.length()<=0){
			lGobearRequiredStringYear=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringYear','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringYear.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringYear',lGobearRequiredStringYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringModel(String strGobearRequiredStringModel){
		Map lreturn=[:]
		String lGobearRequiredStringModel=strGobearRequiredStringModel.trim()
		if(lGobearRequiredStringModel.length()<=0){
			lGobearRequiredStringModel=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringModel','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringModel.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringModel',lGobearRequiredStringModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringSubModel(String strGobearRequiredStringSubModel){
		Map lreturn=[:]
		String lGobearRequiredStringSubModel=strGobearRequiredStringSubModel.trim()
		if(lGobearRequiredStringSubModel.length()<=0){
			lGobearRequiredStringSubModel=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_SUB_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringSubModel','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringSubModel.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringSubModel',lGobearRequiredStringSubModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringEngineSize(String strGobearRequiredStringEngineSize){
		Map lreturn=[:]
		String lGobearRequiredStringEngineSize=strGobearRequiredStringEngineSize.trim()
		if(lGobearRequiredStringEngineSize.length()<=0){
			lGobearRequiredStringEngineSize=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_ENGINE_SIZE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringEngineSize','')
			lreturn.put('Result',lResult)
			lResult=lGobearRequiredStringEngineSize.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringEngineSize',lGobearRequiredStringEngineSize)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredBooleanFlagIsMale(String strGobearRequiredBooleanFlagIsMale){
		Map lreturn=[:]
		String lGobearRequiredBooleanFlagIsMale=strGobearRequiredBooleanFlagIsMale.trim()
		if(lGobearRequiredBooleanFlagIsMale.length()<=0){
			lGobearRequiredBooleanFlagIsMale=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_BOOLEAN_FLAG_IS_MALE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredBooleanFlagIsMale','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearRequiredBooleanFlagIsMale=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsMale)
			lGobearRequiredBooleanFlagIsMale=IGNUemaHelper.convertBooleanToString(lIsGobearRequiredBooleanFlagIsMale)
			lResult=lGobearRequiredBooleanFlagIsMale.length()>0
			if(lResult){
				lreturn.put('GobearRequiredBooleanFlagIsMale',lGobearRequiredBooleanFlagIsMale)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredBooleanFlagIsSingle(String strGobearRequiredBooleanFlagIsSingle){
		Map lreturn=[:]
		String lGobearRequiredBooleanFlagIsSingle=strGobearRequiredBooleanFlagIsSingle.trim()
		if(lGobearRequiredBooleanFlagIsSingle.length()<=0){
			lGobearRequiredBooleanFlagIsSingle=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_BOOLEAN_FLAG_IS_SINGLE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredBooleanFlagIsSingle','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearRequiredBooleanFlagIsSingle=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsSingle)
			lGobearRequiredBooleanFlagIsSingle=IGNUemaHelper.convertBooleanToString(lIsGobearRequiredBooleanFlagIsSingle)
			lResult=lGobearRequiredBooleanFlagIsSingle.length()>0
			if(lResult){
				lreturn.put('GobearRequiredBooleanFlagIsSingle',lGobearRequiredBooleanFlagIsSingle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredIntegerYearOfDriving(String strGobearRequiredIntegerYearOfDriving){
		Map lreturn=[:]
		String lGobearRequiredIntegerYearOfDriving=strGobearRequiredIntegerYearOfDriving.trim()
		if(lGobearRequiredIntegerYearOfDriving.length()<=0){
			lGobearRequiredIntegerYearOfDriving=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_INTEGER_YEAR_OF_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredIntegerYearOfDriving','')
			lreturn.put('Result',lResult)
			String lGobearRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(lGobearRequiredIntegerYearOfDriving)
			if(!lGobearRequiredIntegerYearOfDrivingItem){
				lGobearRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_INTEGER_YEAR_OF_DRIVING)
			}
			Integer lGobearRequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lGobearRequiredIntegerYearOfDrivingItem,this.DEFAULT_YEAR_OF_DRIVING_GOBEAR)
			lGobearRequiredIntegerYearOfDriving=lGobearRequiredIntegerYearOfDrivingNum.toString()
			lResult=lGobearRequiredIntegerYearOfDriving.length()>0
			if(lResult){
				lreturn.put('GobearRequiredIntegerYearOfDriving',lGobearRequiredIntegerYearOfDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringNcbRate(String strGobearRequiredStringNcbRate){
		Map lreturn=[:]
		String lGobearRequiredStringNcbRate=strGobearRequiredStringNcbRate.trim()
		if(lGobearRequiredStringNcbRate.length()<=0){
			lGobearRequiredStringNcbRate=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_NCB_RATE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringNcbRate','')
			lreturn.put('Result',lResult)
			String lGobearRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(lGobearRequiredStringNcbRate)
			if(!lGobearRequiredStringNcbRateItem){
				lGobearRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_NCB_RATE)
			}
			lGobearRequiredStringNcbRate=lGobearRequiredStringNcbRateItem
			lResult=lGobearRequiredStringNcbRate.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringNcbRate',lGobearRequiredStringNcbRate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredBooleanFlagIsDashcam(String strGobearRequiredBooleanFlagIsDashcam){
		Map lreturn=[:]
		String lGobearRequiredBooleanFlagIsDashcam=strGobearRequiredBooleanFlagIsDashcam.trim()
		if(lGobearRequiredBooleanFlagIsDashcam.length()<=0){
			lGobearRequiredBooleanFlagIsDashcam=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_BOOLEAN_FLAG_IS_DASHCAM
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredBooleanFlagIsDashcam','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsDashcam)
			lGobearRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertBooleanToString(lIsGobearRequiredBooleanFlagIsDashcam)
			lResult=lGobearRequiredBooleanFlagIsDashcam.length()>0
			if(lResult){
				lreturn.put('GobearRequiredBooleanFlagIsDashcam',lGobearRequiredBooleanFlagIsDashcam)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredBooleanFlagIsGoToWorkOnly(String strGobearRequiredBooleanFlagIsGoToWorkOnly){
		Map lreturn=[:]
		String lGobearRequiredBooleanFlagIsGoToWorkOnly=strGobearRequiredBooleanFlagIsGoToWorkOnly.trim()
		if(lGobearRequiredBooleanFlagIsGoToWorkOnly.length()<=0){
			lGobearRequiredBooleanFlagIsGoToWorkOnly=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_BOOLEAN_FLAG_IS_GO_TO_WORK_ONLY
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredBooleanFlagIsGoToWorkOnly','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertStringToBoolean(lGobearRequiredBooleanFlagIsGoToWorkOnly)
			lGobearRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertBooleanToString(lIsGobearRequiredBooleanFlagIsGoToWorkOnly)
			lResult=lGobearRequiredBooleanFlagIsGoToWorkOnly.length()>0
			if(lResult){
				lreturn.put('GobearRequiredBooleanFlagIsGoToWorkOnly',lGobearRequiredBooleanFlagIsGoToWorkOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredStringDob(String strGobearRequiredStringDob){
		Map lreturn=[:]
		String lGobearRequiredStringDob=strGobearRequiredStringDob.trim()
		if(lGobearRequiredStringDob.length()<=0){
			lGobearRequiredStringDob=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_STRING_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredStringDob','')
			lreturn.put('Result',lResult)
			if(lGobearRequiredStringDob.length()<=0){
				String lStrCurrentYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(IGNUemaHelper.getStringCurrentDateSlashDDMMYYYY())
				Integer lNumCurrentYear=IGNUemaHelper.convertStringToInteger(lStrCurrentYear,IGNUemaHelper.CONST_INTEGER_YEAR_DEF_ENG+34)
				Integer lNumYearOfAge34=lNumCurrentYear-34
				String lStrDateOfAge34=IGNUemaHelper.convertLocalDateToString(IGNUemaHelper.CONST_PATTERN_FORMATTER_DATE,IGNUemaHelper.encodeLocalDateFromNumber(lNumYearOfAge34,IGNUemaHelper.CONST_INTEGER_MONTH_DEF,IGNUemaHelper.CONST_INTEGER_DAY_DEF))
				lGobearRequiredStringDob=lStrDateOfAge34
			}
			lResult=lGobearRequiredStringDob.length()>0
			if(lResult){
				lreturn.put('GobearRequiredStringDob',lGobearRequiredStringDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearRequiredIntegerNoOfClaim(String strGobearRequiredIntegerNoOfClaim){
		Map lreturn=[:]
		String lGobearRequiredIntegerNoOfClaim=strGobearRequiredIntegerNoOfClaim.trim()
		if(lGobearRequiredIntegerNoOfClaim.length()<=0){
			lGobearRequiredIntegerNoOfClaim=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_INTEGER_NO_OF_CLAIM
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearRequiredIntegerNoOfClaim','')
			lreturn.put('Result',lResult)
			String lGobearRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(lGobearRequiredIntegerNoOfClaim)
			if(!lGobearRequiredIntegerNoOfClaimItem){
				lGobearRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_REQUIRED_INTEGER_NO_OF_CLAIM)
			}
			Integer lGobearRequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lGobearRequiredIntegerNoOfClaimItem,this.DEFAULT_NUMBER_OF_CLAIM_GOBEAR)
			lGobearRequiredIntegerNoOfClaim=lGobearRequiredIntegerNoOfClaimNum.toString()
			lResult=lGobearRequiredIntegerNoOfClaim.length()>0
			if(lResult){
				lreturn.put('GobearRequiredIntegerNoOfClaim',lGobearRequiredIntegerNoOfClaim)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringVehicleKumkaId(String strGobearFillOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lGobearFillOptionalStringVehicleKumkaId=strGobearFillOptionalStringVehicleKumkaId.trim()
		if(lGobearFillOptionalStringVehicleKumkaId.length()<=0){
			lGobearFillOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringVehicleKumkaId)
			lGobearFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringVehicleKumkaId)
			lResult=lGobearFillOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringVehicleKumkaId',lGobearFillOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringVehicleKumkaId(String strGobearOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lGobearOptionalStringVehicleKumkaId=strGobearOptionalStringVehicleKumkaId.trim()
		if(lGobearOptionalStringVehicleKumkaId.length()<=0){
			lGobearOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			lResult=lGobearOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringVehicleKumkaId',lGobearOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringPlanType(String strGobearFillOptionalStringPlanType){
		Map lreturn=[:]
		String lGobearFillOptionalStringPlanType=strGobearFillOptionalStringPlanType.trim()
		if(lGobearFillOptionalStringPlanType.length()<=0){
			lGobearFillOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringPlanType=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringPlanType)
			lGobearFillOptionalStringPlanType=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringPlanType)
			lResult=lGobearFillOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringPlanType',lGobearFillOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringPlanType(String strGobearOptionalStringPlanType){
		Map lreturn=[:]
		String lGobearOptionalStringPlanType=strGobearOptionalStringPlanType.trim()
		if(lGobearOptionalStringPlanType.length()<=0){
			lGobearOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			String lGobearOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(lGobearOptionalStringPlanType)
			if(!lGobearOptionalStringPlanTypeItem){
				lGobearOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_PLAN_TYPE)
			}
			lGobearOptionalStringPlanType=lGobearOptionalStringPlanTypeItem
			lResult=lGobearOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringPlanType',lGobearOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringPostalCode(String strGobearFillOptionalStringPostalCode){
		Map lreturn=[:]
		String lGobearFillOptionalStringPostalCode=strGobearFillOptionalStringPostalCode.trim()
		if(lGobearFillOptionalStringPostalCode.length()<=0){
			lGobearFillOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringPostalCode=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringPostalCode)
			lGobearFillOptionalStringPostalCode=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringPostalCode)
			lResult=lGobearFillOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringPostalCode',lGobearFillOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringPostalCode(String strGobearOptionalStringPostalCode){
		Map lreturn=[:]
		String lGobearOptionalStringPostalCode=strGobearOptionalStringPostalCode.trim()
		if(lGobearOptionalStringPostalCode.length()<=0){
			lGobearOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			lResult=lGobearOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringPostalCode',lGobearOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringOdometer(String strGobearFillOptionalStringOdometer){
		Map lreturn=[:]
		String lGobearFillOptionalStringOdometer=strGobearFillOptionalStringOdometer.trim()
		if(lGobearFillOptionalStringOdometer.length()<=0){
			lGobearFillOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringOdometer=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringOdometer)
			lGobearFillOptionalStringOdometer=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringOdometer)
			lResult=lGobearFillOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringOdometer',lGobearFillOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringOdometer(String strGobearOptionalStringOdometer){
		Map lreturn=[:]
		String lGobearOptionalStringOdometer=strGobearOptionalStringOdometer.trim()
		if(lGobearOptionalStringOdometer.length()<=0){
			lGobearOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			lResult=lGobearOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringOdometer',lGobearOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringCarInsuranceDue(String strGobearFillOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lGobearFillOptionalStringCarInsuranceDue=strGobearFillOptionalStringCarInsuranceDue.trim()
		if(lGobearFillOptionalStringCarInsuranceDue.length()<=0){
			lGobearFillOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringCarInsuranceDue)
			lGobearFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringCarInsuranceDue)
			lResult=lGobearFillOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringCarInsuranceDue',lGobearFillOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringCarInsuranceDue(String strGobearOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lGobearOptionalStringCarInsuranceDue=strGobearOptionalStringCarInsuranceDue.trim()
		if(lGobearOptionalStringCarInsuranceDue.length()<=0){
			lGobearOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			String lGobearOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(lGobearOptionalStringCarInsuranceDue)
			if(!lGobearOptionalStringCarInsuranceDueItem){
				lGobearOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_CAR_INSURANCE_DUE)
			}
			lGobearOptionalStringCarInsuranceDue=lGobearOptionalStringCarInsuranceDueItem
			lResult=lGobearOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringCarInsuranceDue',lGobearOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalStringNonce(String strGobearFillOptionalStringNonce){
		Map lreturn=[:]
		String lGobearFillOptionalStringNonce=strGobearFillOptionalStringNonce.trim()
		if(lGobearFillOptionalStringNonce.length()<=0){
			lGobearFillOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalStringNonce','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalStringNonce=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalStringNonce)
			lGobearFillOptionalStringNonce=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalStringNonce)
			lResult=lGobearFillOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalStringNonce',lGobearFillOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalStringNonce(String strGobearOptionalStringNonce){
		Map lreturn=[:]
		String lGobearOptionalStringNonce=strGobearOptionalStringNonce.trim()
		if(lGobearOptionalStringNonce.length()<=0){
			lGobearOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalStringNonce','')
			lreturn.put('Result',lResult)
			lResult=lGobearOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('GobearOptionalStringNonce',lGobearOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalIntegerNoOfDoor(String strGobearFillOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lGobearFillOptionalIntegerNoOfDoor=strGobearFillOptionalIntegerNoOfDoor.trim()
		if(lGobearFillOptionalIntegerNoOfDoor.length()<=0){
			lGobearFillOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalIntegerNoOfDoor)
			lGobearFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalIntegerNoOfDoor)
			lResult=lGobearFillOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalIntegerNoOfDoor',lGobearFillOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalIntegerNoOfDoor(String strGobearOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lGobearOptionalIntegerNoOfDoor=strGobearOptionalIntegerNoOfDoor.trim()
		if(lGobearOptionalIntegerNoOfDoor.length()<=0){
			lGobearOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Integer lGobearOptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lGobearOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_GOBEAR)
			lGobearOptionalIntegerNoOfDoor=lGobearOptionalIntegerNoOfDoorNum.toString()
			lResult=lGobearOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('GobearOptionalIntegerNoOfDoor',lGobearOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearFillOptionalBooleanFlagIsCarFinancing(String strGobearFillOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lGobearFillOptionalBooleanFlagIsCarFinancing=strGobearFillOptionalBooleanFlagIsCarFinancing.trim()
		if(lGobearFillOptionalBooleanFlagIsCarFinancing.length()<=0){
			lGobearFillOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_FILL_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearFillOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lGobearFillOptionalBooleanFlagIsCarFinancing)
			lGobearFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsGobearFillOptionalBooleanFlagIsCarFinancing)
			lResult=lGobearFillOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('GobearFillOptionalBooleanFlagIsCarFinancing',lGobearFillOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearOptionalBooleanFlagIsCarFinancing(String strGobearOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lGobearOptionalBooleanFlagIsCarFinancing=strGobearOptionalBooleanFlagIsCarFinancing.trim()
		if(lGobearOptionalBooleanFlagIsCarFinancing.length()<=0){
			lGobearOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lGobearOptionalBooleanFlagIsCarFinancing)
			lGobearOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsGobearOptionalBooleanFlagIsCarFinancing)
			lResult=lGobearOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('GobearOptionalBooleanFlagIsCarFinancing',lGobearOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputGobearExpectedHavePlan(String strGobearExpectedHavePlan){
		Map lreturn=[:]
		String lGobearExpectedHavePlan=strGobearExpectedHavePlan.trim()
		if(lGobearExpectedHavePlan.length()<=0){
			lGobearExpectedHavePlan=THARoojaiAPI2GetPlanListType.DEFAULT_GOBEAR_EXPECTED_HAVE_PLAN
		}
		try{
			Boolean lResult=false
			lreturn.put('GobearExpectedHavePlan','')
			lreturn.put('Result',lResult)
			Boolean lIsGobearExpectedHavePlan=IGNUemaHelper.convertStringToBoolean(lGobearExpectedHavePlan)
			lGobearExpectedHavePlan=IGNUemaHelper.convertBooleanToString(lIsGobearExpectedHavePlan)
			lResult=lGobearExpectedHavePlan.length()>0
			if(lResult){
				lreturn.put('GobearExpectedHavePlan',lGobearExpectedHavePlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringUsername(String strPricezaRequiredStringUsername){
		Map lreturn=[:]
		String lPricezaRequiredStringUsername=strPricezaRequiredStringUsername.trim()
		if(lPricezaRequiredStringUsername.length()<=0){
			lPricezaRequiredStringUsername=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_USERNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringUsername','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringUsername.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringUsername',lPricezaRequiredStringUsername)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringPassword(String strPricezaRequiredStringPassword){
		Map lreturn=[:]
		String lPricezaRequiredStringPassword=strPricezaRequiredStringPassword.trim()
		if(lPricezaRequiredStringPassword.length()<=0){
			lPricezaRequiredStringPassword=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringPassword','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringPassword.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringPassword',lPricezaRequiredStringPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringBrand(String strPricezaRequiredStringBrand){
		Map lreturn=[:]
		String lPricezaRequiredStringBrand=strPricezaRequiredStringBrand.trim()
		if(lPricezaRequiredStringBrand.length()<=0){
			lPricezaRequiredStringBrand=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_BRAND
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringBrand','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringBrand.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringBrand',lPricezaRequiredStringBrand)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringYear(String strPricezaRequiredStringYear){
		Map lreturn=[:]
		String lPricezaRequiredStringYear=strPricezaRequiredStringYear.trim()
		if(lPricezaRequiredStringYear.length()<=0){
			lPricezaRequiredStringYear=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringYear','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringYear.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringYear',lPricezaRequiredStringYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringModel(String strPricezaRequiredStringModel){
		Map lreturn=[:]
		String lPricezaRequiredStringModel=strPricezaRequiredStringModel.trim()
		if(lPricezaRequiredStringModel.length()<=0){
			lPricezaRequiredStringModel=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringModel','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringModel.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringModel',lPricezaRequiredStringModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringSubModel(String strPricezaRequiredStringSubModel){
		Map lreturn=[:]
		String lPricezaRequiredStringSubModel=strPricezaRequiredStringSubModel.trim()
		if(lPricezaRequiredStringSubModel.length()<=0){
			lPricezaRequiredStringSubModel=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_SUB_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringSubModel','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringSubModel.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringSubModel',lPricezaRequiredStringSubModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringEngineSize(String strPricezaRequiredStringEngineSize){
		Map lreturn=[:]
		String lPricezaRequiredStringEngineSize=strPricezaRequiredStringEngineSize.trim()
		if(lPricezaRequiredStringEngineSize.length()<=0){
			lPricezaRequiredStringEngineSize=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_ENGINE_SIZE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringEngineSize','')
			lreturn.put('Result',lResult)
			lResult=lPricezaRequiredStringEngineSize.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringEngineSize',lPricezaRequiredStringEngineSize)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredBooleanFlagIsMale(String strPricezaRequiredBooleanFlagIsMale){
		Map lreturn=[:]
		String lPricezaRequiredBooleanFlagIsMale=strPricezaRequiredBooleanFlagIsMale.trim()
		if(lPricezaRequiredBooleanFlagIsMale.length()<=0){
			lPricezaRequiredBooleanFlagIsMale=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_BOOLEAN_FLAG_IS_MALE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredBooleanFlagIsMale','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaRequiredBooleanFlagIsMale=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsMale)
			lPricezaRequiredBooleanFlagIsMale=IGNUemaHelper.convertBooleanToString(lIsPricezaRequiredBooleanFlagIsMale)
			lResult=lPricezaRequiredBooleanFlagIsMale.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredBooleanFlagIsMale',lPricezaRequiredBooleanFlagIsMale)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredBooleanFlagIsSingle(String strPricezaRequiredBooleanFlagIsSingle){
		Map lreturn=[:]
		String lPricezaRequiredBooleanFlagIsSingle=strPricezaRequiredBooleanFlagIsSingle.trim()
		if(lPricezaRequiredBooleanFlagIsSingle.length()<=0){
			lPricezaRequiredBooleanFlagIsSingle=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_BOOLEAN_FLAG_IS_SINGLE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredBooleanFlagIsSingle','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaRequiredBooleanFlagIsSingle=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsSingle)
			lPricezaRequiredBooleanFlagIsSingle=IGNUemaHelper.convertBooleanToString(lIsPricezaRequiredBooleanFlagIsSingle)
			lResult=lPricezaRequiredBooleanFlagIsSingle.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredBooleanFlagIsSingle',lPricezaRequiredBooleanFlagIsSingle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredIntegerYearOfDriving(String strPricezaRequiredIntegerYearOfDriving){
		Map lreturn=[:]
		String lPricezaRequiredIntegerYearOfDriving=strPricezaRequiredIntegerYearOfDriving.trim()
		if(lPricezaRequiredIntegerYearOfDriving.length()<=0){
			lPricezaRequiredIntegerYearOfDriving=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_INTEGER_YEAR_OF_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredIntegerYearOfDriving','')
			lreturn.put('Result',lResult)
			String lPricezaRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(lPricezaRequiredIntegerYearOfDriving)
			if(!lPricezaRequiredIntegerYearOfDrivingItem){
				lPricezaRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_INTEGER_YEAR_OF_DRIVING)
			}
			Integer lPricezaRequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lPricezaRequiredIntegerYearOfDrivingItem,this.DEFAULT_YEAR_OF_DRIVING_PRICEZA)
			lPricezaRequiredIntegerYearOfDriving=lPricezaRequiredIntegerYearOfDrivingNum.toString()
			lResult=lPricezaRequiredIntegerYearOfDriving.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredIntegerYearOfDriving',lPricezaRequiredIntegerYearOfDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringNcbRate(String strPricezaRequiredStringNcbRate){
		Map lreturn=[:]
		String lPricezaRequiredStringNcbRate=strPricezaRequiredStringNcbRate.trim()
		if(lPricezaRequiredStringNcbRate.length()<=0){
			lPricezaRequiredStringNcbRate=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_NCB_RATE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringNcbRate','')
			lreturn.put('Result',lResult)
			String lPricezaRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(lPricezaRequiredStringNcbRate)
			if(!lPricezaRequiredStringNcbRateItem){
				lPricezaRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_NCB_RATE)
			}
			lPricezaRequiredStringNcbRate=lPricezaRequiredStringNcbRateItem
			lResult=lPricezaRequiredStringNcbRate.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringNcbRate',lPricezaRequiredStringNcbRate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredBooleanFlagIsDashcam(String strPricezaRequiredBooleanFlagIsDashcam){
		Map lreturn=[:]
		String lPricezaRequiredBooleanFlagIsDashcam=strPricezaRequiredBooleanFlagIsDashcam.trim()
		if(lPricezaRequiredBooleanFlagIsDashcam.length()<=0){
			lPricezaRequiredBooleanFlagIsDashcam=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_BOOLEAN_FLAG_IS_DASHCAM
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredBooleanFlagIsDashcam','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsDashcam)
			lPricezaRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertBooleanToString(lIsPricezaRequiredBooleanFlagIsDashcam)
			lResult=lPricezaRequiredBooleanFlagIsDashcam.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredBooleanFlagIsDashcam',lPricezaRequiredBooleanFlagIsDashcam)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredBooleanFlagIsGoToWorkOnly(String strPricezaRequiredBooleanFlagIsGoToWorkOnly){
		Map lreturn=[:]
		String lPricezaRequiredBooleanFlagIsGoToWorkOnly=strPricezaRequiredBooleanFlagIsGoToWorkOnly.trim()
		if(lPricezaRequiredBooleanFlagIsGoToWorkOnly.length()<=0){
			lPricezaRequiredBooleanFlagIsGoToWorkOnly=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_BOOLEAN_FLAG_IS_GO_TO_WORK_ONLY
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredBooleanFlagIsGoToWorkOnly','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertStringToBoolean(lPricezaRequiredBooleanFlagIsGoToWorkOnly)
			lPricezaRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertBooleanToString(lIsPricezaRequiredBooleanFlagIsGoToWorkOnly)
			lResult=lPricezaRequiredBooleanFlagIsGoToWorkOnly.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredBooleanFlagIsGoToWorkOnly',lPricezaRequiredBooleanFlagIsGoToWorkOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredStringDob(String strPricezaRequiredStringDob){
		Map lreturn=[:]
		String lPricezaRequiredStringDob=strPricezaRequiredStringDob.trim()
		if(lPricezaRequiredStringDob.length()<=0){
			lPricezaRequiredStringDob=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_STRING_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredStringDob','')
			lreturn.put('Result',lResult)
			if(lPricezaRequiredStringDob.length()<=0){
				String lStrCurrentYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(IGNUemaHelper.getStringCurrentDateSlashDDMMYYYY())
				Integer lNumCurrentYear=IGNUemaHelper.convertStringToInteger(lStrCurrentYear,IGNUemaHelper.CONST_INTEGER_YEAR_DEF_ENG+34)
				Integer lNumYearOfAge34=lNumCurrentYear-34
				String lStrDateOfAge34=IGNUemaHelper.convertLocalDateToString(IGNUemaHelper.CONST_PATTERN_FORMATTER_DATE,IGNUemaHelper.encodeLocalDateFromNumber(lNumYearOfAge34,IGNUemaHelper.CONST_INTEGER_MONTH_DEF,IGNUemaHelper.CONST_INTEGER_DAY_DEF))
				lPricezaRequiredStringDob=lStrDateOfAge34
			}
			lResult=lPricezaRequiredStringDob.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredStringDob',lPricezaRequiredStringDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaRequiredIntegerNoOfClaim(String strPricezaRequiredIntegerNoOfClaim){
		Map lreturn=[:]
		String lPricezaRequiredIntegerNoOfClaim=strPricezaRequiredIntegerNoOfClaim.trim()
		if(lPricezaRequiredIntegerNoOfClaim.length()<=0){
			lPricezaRequiredIntegerNoOfClaim=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_INTEGER_NO_OF_CLAIM
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaRequiredIntegerNoOfClaim','')
			lreturn.put('Result',lResult)
			String lPricezaRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(lPricezaRequiredIntegerNoOfClaim)
			if(!lPricezaRequiredIntegerNoOfClaimItem){
				lPricezaRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_REQUIRED_INTEGER_NO_OF_CLAIM)
			}
			Integer lPricezaRequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lPricezaRequiredIntegerNoOfClaimItem,this.DEFAULT_NUMBER_OF_CLAIM_PRICEZA)
			lPricezaRequiredIntegerNoOfClaim=lPricezaRequiredIntegerNoOfClaimNum.toString()
			lResult=lPricezaRequiredIntegerNoOfClaim.length()>0
			if(lResult){
				lreturn.put('PricezaRequiredIntegerNoOfClaim',lPricezaRequiredIntegerNoOfClaim)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringVehicleKumkaId(String strPricezaFillOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lPricezaFillOptionalStringVehicleKumkaId=strPricezaFillOptionalStringVehicleKumkaId.trim()
		if(lPricezaFillOptionalStringVehicleKumkaId.length()<=0){
			lPricezaFillOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringVehicleKumkaId)
			lPricezaFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringVehicleKumkaId)
			lResult=lPricezaFillOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringVehicleKumkaId',lPricezaFillOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringVehicleKumkaId(String strPricezaOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lPricezaOptionalStringVehicleKumkaId=strPricezaOptionalStringVehicleKumkaId.trim()
		if(lPricezaOptionalStringVehicleKumkaId.length()<=0){
			lPricezaOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			lResult=lPricezaOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringVehicleKumkaId',lPricezaOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringPlanType(String strPricezaFillOptionalStringPlanType){
		Map lreturn=[:]
		String lPricezaFillOptionalStringPlanType=strPricezaFillOptionalStringPlanType.trim()
		if(lPricezaFillOptionalStringPlanType.length()<=0){
			lPricezaFillOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringPlanType=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringPlanType)
			lPricezaFillOptionalStringPlanType=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringPlanType)
			lResult=lPricezaFillOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringPlanType',lPricezaFillOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringPlanType(String strPricezaOptionalStringPlanType){
		Map lreturn=[:]
		String lPricezaOptionalStringPlanType=strPricezaOptionalStringPlanType.trim()
		if(lPricezaOptionalStringPlanType.length()<=0){
			lPricezaOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			String lPricezaOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(lPricezaOptionalStringPlanType)
			if(!lPricezaOptionalStringPlanTypeItem){
				lPricezaOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_PLAN_TYPE)
			}
			lPricezaOptionalStringPlanType=lPricezaOptionalStringPlanTypeItem
			lResult=lPricezaOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringPlanType',lPricezaOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringPostalCode(String strPricezaFillOptionalStringPostalCode){
		Map lreturn=[:]
		String lPricezaFillOptionalStringPostalCode=strPricezaFillOptionalStringPostalCode.trim()
		if(lPricezaFillOptionalStringPostalCode.length()<=0){
			lPricezaFillOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringPostalCode=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringPostalCode)
			lPricezaFillOptionalStringPostalCode=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringPostalCode)
			lResult=lPricezaFillOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringPostalCode',lPricezaFillOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringPostalCode(String strPricezaOptionalStringPostalCode){
		Map lreturn=[:]
		String lPricezaOptionalStringPostalCode=strPricezaOptionalStringPostalCode.trim()
		if(lPricezaOptionalStringPostalCode.length()<=0){
			lPricezaOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			lResult=lPricezaOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringPostalCode',lPricezaOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringOdometer(String strPricezaFillOptionalStringOdometer){
		Map lreturn=[:]
		String lPricezaFillOptionalStringOdometer=strPricezaFillOptionalStringOdometer.trim()
		if(lPricezaFillOptionalStringOdometer.length()<=0){
			lPricezaFillOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringOdometer=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringOdometer)
			lPricezaFillOptionalStringOdometer=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringOdometer)
			lResult=lPricezaFillOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringOdometer',lPricezaFillOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringOdometer(String strPricezaOptionalStringOdometer){
		Map lreturn=[:]
		String lPricezaOptionalStringOdometer=strPricezaOptionalStringOdometer.trim()
		if(lPricezaOptionalStringOdometer.length()<=0){
			lPricezaOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			lResult=lPricezaOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringOdometer',lPricezaOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringCarInsuranceDue(String strPricezaFillOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lPricezaFillOptionalStringCarInsuranceDue=strPricezaFillOptionalStringCarInsuranceDue.trim()
		if(lPricezaFillOptionalStringCarInsuranceDue.length()<=0){
			lPricezaFillOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringCarInsuranceDue)
			lPricezaFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringCarInsuranceDue)
			lResult=lPricezaFillOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringCarInsuranceDue',lPricezaFillOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringCarInsuranceDue(String strPricezaOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lPricezaOptionalStringCarInsuranceDue=strPricezaOptionalStringCarInsuranceDue.trim()
		if(lPricezaOptionalStringCarInsuranceDue.length()<=0){
			lPricezaOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			String lPricezaOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(lPricezaOptionalStringCarInsuranceDue)
			if(!lPricezaOptionalStringCarInsuranceDueItem){
				lPricezaOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_CAR_INSURANCE_DUE)
			}
			lPricezaOptionalStringCarInsuranceDue=lPricezaOptionalStringCarInsuranceDueItem
			lResult=lPricezaOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringCarInsuranceDue',lPricezaOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalStringNonce(String strPricezaFillOptionalStringNonce){
		Map lreturn=[:]
		String lPricezaFillOptionalStringNonce=strPricezaFillOptionalStringNonce.trim()
		if(lPricezaFillOptionalStringNonce.length()<=0){
			lPricezaFillOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalStringNonce','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalStringNonce=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalStringNonce)
			lPricezaFillOptionalStringNonce=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalStringNonce)
			lResult=lPricezaFillOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalStringNonce',lPricezaFillOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalStringNonce(String strPricezaOptionalStringNonce){
		Map lreturn=[:]
		String lPricezaOptionalStringNonce=strPricezaOptionalStringNonce.trim()
		if(lPricezaOptionalStringNonce.length()<=0){
			lPricezaOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalStringNonce','')
			lreturn.put('Result',lResult)
			lResult=lPricezaOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalStringNonce',lPricezaOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalIntegerNoOfDoor(String strPricezaFillOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lPricezaFillOptionalIntegerNoOfDoor=strPricezaFillOptionalIntegerNoOfDoor.trim()
		if(lPricezaFillOptionalIntegerNoOfDoor.length()<=0){
			lPricezaFillOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalIntegerNoOfDoor)
			lPricezaFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalIntegerNoOfDoor)
			lResult=lPricezaFillOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalIntegerNoOfDoor',lPricezaFillOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalIntegerNoOfDoor(String strPricezaOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lPricezaOptionalIntegerNoOfDoor=strPricezaOptionalIntegerNoOfDoor.trim()
		if(lPricezaOptionalIntegerNoOfDoor.length()<=0){
			lPricezaOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Integer lPricezaOptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lPricezaOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_PRICEZA)
			lPricezaOptionalIntegerNoOfDoor=lPricezaOptionalIntegerNoOfDoorNum.toString()
			lResult=lPricezaOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalIntegerNoOfDoor',lPricezaOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaFillOptionalBooleanFlagIsCarFinancing(String strPricezaFillOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lPricezaFillOptionalBooleanFlagIsCarFinancing=strPricezaFillOptionalBooleanFlagIsCarFinancing.trim()
		if(lPricezaFillOptionalBooleanFlagIsCarFinancing.length()<=0){
			lPricezaFillOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_FILL_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaFillOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lPricezaFillOptionalBooleanFlagIsCarFinancing)
			lPricezaFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsPricezaFillOptionalBooleanFlagIsCarFinancing)
			lResult=lPricezaFillOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('PricezaFillOptionalBooleanFlagIsCarFinancing',lPricezaFillOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaOptionalBooleanFlagIsCarFinancing(String strPricezaOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lPricezaOptionalBooleanFlagIsCarFinancing=strPricezaOptionalBooleanFlagIsCarFinancing.trim()
		if(lPricezaOptionalBooleanFlagIsCarFinancing.length()<=0){
			lPricezaOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lPricezaOptionalBooleanFlagIsCarFinancing)
			lPricezaOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsPricezaOptionalBooleanFlagIsCarFinancing)
			lResult=lPricezaOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('PricezaOptionalBooleanFlagIsCarFinancing',lPricezaOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputPricezaExpectedHavePlan(String strPricezaExpectedHavePlan){
		Map lreturn=[:]
		String lPricezaExpectedHavePlan=strPricezaExpectedHavePlan.trim()
		if(lPricezaExpectedHavePlan.length()<=0){
			lPricezaExpectedHavePlan=THARoojaiAPI2GetPlanListType.DEFAULT_PRICEZA_EXPECTED_HAVE_PLAN
		}
		try{
			Boolean lResult=false
			lreturn.put('PricezaExpectedHavePlan','')
			lreturn.put('Result',lResult)
			Boolean lIsPricezaExpectedHavePlan=IGNUemaHelper.convertStringToBoolean(lPricezaExpectedHavePlan)
			lPricezaExpectedHavePlan=IGNUemaHelper.convertBooleanToString(lIsPricezaExpectedHavePlan)
			lResult=lPricezaExpectedHavePlan.length()>0
			if(lResult){
				lreturn.put('PricezaExpectedHavePlan',lPricezaExpectedHavePlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringUsername(String strKumkaRequiredStringUsername){
		Map lreturn=[:]
		String lKumkaRequiredStringUsername=strKumkaRequiredStringUsername.trim()
		if(lKumkaRequiredStringUsername.length()<=0){
			lKumkaRequiredStringUsername=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_USERNAME
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringUsername','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringUsername.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringUsername',lKumkaRequiredStringUsername)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringPassword(String strKumkaRequiredStringPassword){
		Map lreturn=[:]
		String lKumkaRequiredStringPassword=strKumkaRequiredStringPassword.trim()
		if(lKumkaRequiredStringPassword.length()<=0){
			lKumkaRequiredStringPassword=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_PASSWORD
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringPassword','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringPassword.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringPassword',lKumkaRequiredStringPassword)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringBrand(String strKumkaRequiredStringBrand){
		Map lreturn=[:]
		String lKumkaRequiredStringBrand=strKumkaRequiredStringBrand.trim()
		if(lKumkaRequiredStringBrand.length()<=0){
			lKumkaRequiredStringBrand=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_BRAND
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringBrand','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringBrand.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringBrand',lKumkaRequiredStringBrand)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringYear(String strKumkaRequiredStringYear){
		Map lreturn=[:]
		String lKumkaRequiredStringYear=strKumkaRequiredStringYear.trim()
		if(lKumkaRequiredStringYear.length()<=0){
			lKumkaRequiredStringYear=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_YEAR
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringYear','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringYear.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringYear',lKumkaRequiredStringYear)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringModel(String strKumkaRequiredStringModel){
		Map lreturn=[:]
		String lKumkaRequiredStringModel=strKumkaRequiredStringModel.trim()
		if(lKumkaRequiredStringModel.length()<=0){
			lKumkaRequiredStringModel=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringModel','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringModel.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringModel',lKumkaRequiredStringModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringSubModel(String strKumkaRequiredStringSubModel){
		Map lreturn=[:]
		String lKumkaRequiredStringSubModel=strKumkaRequiredStringSubModel.trim()
		if(lKumkaRequiredStringSubModel.length()<=0){
			lKumkaRequiredStringSubModel=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_SUB_MODEL
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringSubModel','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringSubModel.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringSubModel',lKumkaRequiredStringSubModel)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringEngineSize(String strKumkaRequiredStringEngineSize){
		Map lreturn=[:]
		String lKumkaRequiredStringEngineSize=strKumkaRequiredStringEngineSize.trim()
		if(lKumkaRequiredStringEngineSize.length()<=0){
			lKumkaRequiredStringEngineSize=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_ENGINE_SIZE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringEngineSize','')
			lreturn.put('Result',lResult)
			lResult=lKumkaRequiredStringEngineSize.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringEngineSize',lKumkaRequiredStringEngineSize)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredBooleanFlagIsMale(String strKumkaRequiredBooleanFlagIsMale){
		Map lreturn=[:]
		String lKumkaRequiredBooleanFlagIsMale=strKumkaRequiredBooleanFlagIsMale.trim()
		if(lKumkaRequiredBooleanFlagIsMale.length()<=0){
			lKumkaRequiredBooleanFlagIsMale=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_BOOLEAN_FLAG_IS_MALE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredBooleanFlagIsMale','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaRequiredBooleanFlagIsMale=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsMale)
			lKumkaRequiredBooleanFlagIsMale=IGNUemaHelper.convertBooleanToString(lIsKumkaRequiredBooleanFlagIsMale)
			lResult=lKumkaRequiredBooleanFlagIsMale.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredBooleanFlagIsMale',lKumkaRequiredBooleanFlagIsMale)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredBooleanFlagIsSingle(String strKumkaRequiredBooleanFlagIsSingle){
		Map lreturn=[:]
		String lKumkaRequiredBooleanFlagIsSingle=strKumkaRequiredBooleanFlagIsSingle.trim()
		if(lKumkaRequiredBooleanFlagIsSingle.length()<=0){
			lKumkaRequiredBooleanFlagIsSingle=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_BOOLEAN_FLAG_IS_SINGLE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredBooleanFlagIsSingle','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaRequiredBooleanFlagIsSingle=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsSingle)
			lKumkaRequiredBooleanFlagIsSingle=IGNUemaHelper.convertBooleanToString(lIsKumkaRequiredBooleanFlagIsSingle)
			lResult=lKumkaRequiredBooleanFlagIsSingle.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredBooleanFlagIsSingle',lKumkaRequiredBooleanFlagIsSingle)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredIntegerYearOfDriving(String strKumkaRequiredIntegerYearOfDriving){
		Map lreturn=[:]
		String lKumkaRequiredIntegerYearOfDriving=strKumkaRequiredIntegerYearOfDriving.trim()
		if(lKumkaRequiredIntegerYearOfDriving.length()<=0){
			lKumkaRequiredIntegerYearOfDriving=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_INTEGER_YEAR_OF_DRIVING
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredIntegerYearOfDriving','')
			lreturn.put('Result',lResult)
			String lKumkaRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(lKumkaRequiredIntegerYearOfDriving)
			if(!lKumkaRequiredIntegerYearOfDrivingItem){
				lKumkaRequiredIntegerYearOfDrivingItem=this.DEFAULT_LIST_YEAR_OF_DRIVING.get(THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_INTEGER_YEAR_OF_DRIVING)
			}
			Integer lKumkaRequiredIntegerYearOfDrivingNum=IGNUemaHelper.convertStringToInteger(lKumkaRequiredIntegerYearOfDrivingItem,this.DEFAULT_YEAR_OF_DRIVING_KUMKA)
			lKumkaRequiredIntegerYearOfDriving=lKumkaRequiredIntegerYearOfDrivingNum.toString()
			lResult=lKumkaRequiredIntegerYearOfDriving.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredIntegerYearOfDriving',lKumkaRequiredIntegerYearOfDriving)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringNcbRate(String strKumkaRequiredStringNcbRate){
		Map lreturn=[:]
		String lKumkaRequiredStringNcbRate=strKumkaRequiredStringNcbRate.trim()
		if(lKumkaRequiredStringNcbRate.length()<=0){
			lKumkaRequiredStringNcbRate=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_NCB_RATE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringNcbRate','')
			lreturn.put('Result',lResult)
			String lKumkaRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(lKumkaRequiredStringNcbRate)
			if(!lKumkaRequiredStringNcbRateItem){
				lKumkaRequiredStringNcbRateItem=this.DEFAULT_LIST_NCB_RATE.get(THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_NCB_RATE)
			}
			lKumkaRequiredStringNcbRate=lKumkaRequiredStringNcbRateItem
			lResult=lKumkaRequiredStringNcbRate.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringNcbRate',lKumkaRequiredStringNcbRate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredBooleanFlagIsDashcam(String strKumkaRequiredBooleanFlagIsDashcam){
		Map lreturn=[:]
		String lKumkaRequiredBooleanFlagIsDashcam=strKumkaRequiredBooleanFlagIsDashcam.trim()
		if(lKumkaRequiredBooleanFlagIsDashcam.length()<=0){
			lKumkaRequiredBooleanFlagIsDashcam=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_BOOLEAN_FLAG_IS_DASHCAM
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredBooleanFlagIsDashcam','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsDashcam)
			lKumkaRequiredBooleanFlagIsDashcam=IGNUemaHelper.convertBooleanToString(lIsKumkaRequiredBooleanFlagIsDashcam)
			lResult=lKumkaRequiredBooleanFlagIsDashcam.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredBooleanFlagIsDashcam',lKumkaRequiredBooleanFlagIsDashcam)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredBooleanFlagIsGoToWorkOnly(String strKumkaRequiredBooleanFlagIsGoToWorkOnly){
		Map lreturn=[:]
		String lKumkaRequiredBooleanFlagIsGoToWorkOnly=strKumkaRequiredBooleanFlagIsGoToWorkOnly.trim()
		if(lKumkaRequiredBooleanFlagIsGoToWorkOnly.length()<=0){
			lKumkaRequiredBooleanFlagIsGoToWorkOnly=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_BOOLEAN_FLAG_IS_GO_TO_WORK_ONLY
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredBooleanFlagIsGoToWorkOnly','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertStringToBoolean(lKumkaRequiredBooleanFlagIsGoToWorkOnly)
			lKumkaRequiredBooleanFlagIsGoToWorkOnly=IGNUemaHelper.convertBooleanToString(lIsKumkaRequiredBooleanFlagIsGoToWorkOnly)
			lResult=lKumkaRequiredBooleanFlagIsGoToWorkOnly.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredBooleanFlagIsGoToWorkOnly',lKumkaRequiredBooleanFlagIsGoToWorkOnly)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredStringDob(String strKumkaRequiredStringDob){
		Map lreturn=[:]
		String lKumkaRequiredStringDob=strKumkaRequiredStringDob.trim()
		if(lKumkaRequiredStringDob.length()<=0){
			lKumkaRequiredStringDob=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_STRING_DOB
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredStringDob','')
			lreturn.put('Result',lResult)
			if(lKumkaRequiredStringDob.length()<=0){
				String lStrCurrentYear=IGNUemaHelper.extractStringYearFromDateStringSlashDDMMYYYY(IGNUemaHelper.getStringCurrentDateSlashDDMMYYYY())
				Integer lNumCurrentYear=IGNUemaHelper.convertStringToInteger(lStrCurrentYear,IGNUemaHelper.CONST_INTEGER_YEAR_DEF_ENG+34)
				Integer lNumYearOfAge34=lNumCurrentYear-34
				String lStrDateOfAge34=IGNUemaHelper.convertLocalDateToString(IGNUemaHelper.CONST_PATTERN_FORMATTER_DATE,IGNUemaHelper.encodeLocalDateFromNumber(lNumYearOfAge34,IGNUemaHelper.CONST_INTEGER_MONTH_DEF,IGNUemaHelper.CONST_INTEGER_DAY_DEF))
				lKumkaRequiredStringDob=lStrDateOfAge34
			}
			lResult=lKumkaRequiredStringDob.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredStringDob',lKumkaRequiredStringDob)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaRequiredIntegerNoOfClaim(String strKumkaRequiredIntegerNoOfClaim){
		Map lreturn=[:]
		String lKumkaRequiredIntegerNoOfClaim=strKumkaRequiredIntegerNoOfClaim.trim()
		if(lKumkaRequiredIntegerNoOfClaim.length()<=0){
			lKumkaRequiredIntegerNoOfClaim=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_INTEGER_NO_OF_CLAIM
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaRequiredIntegerNoOfClaim','')
			lreturn.put('Result',lResult)
			String lKumkaRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(lKumkaRequiredIntegerNoOfClaim)
			if(!lKumkaRequiredIntegerNoOfClaimItem){
				lKumkaRequiredIntegerNoOfClaimItem=this.DEFAULT_LIST_NUMBER_OF_CLAIM.get(THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_REQUIRED_INTEGER_NO_OF_CLAIM)
			}
			Integer lKumkaRequiredIntegerNoOfClaimNum=IGNUemaHelper.convertStringToInteger(lKumkaRequiredIntegerNoOfClaimItem,this.DEFAULT_NUMBER_OF_CLAIM_KUMKA)
			lKumkaRequiredIntegerNoOfClaim=lKumkaRequiredIntegerNoOfClaimNum.toString()
			lResult=lKumkaRequiredIntegerNoOfClaim.length()>0
			if(lResult){
				lreturn.put('KumkaRequiredIntegerNoOfClaim',lKumkaRequiredIntegerNoOfClaim)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringVehicleKumkaId(String strKumkaFillOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lKumkaFillOptionalStringVehicleKumkaId=strKumkaFillOptionalStringVehicleKumkaId.trim()
		if(lKumkaFillOptionalStringVehicleKumkaId.length()<=0){
			lKumkaFillOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringVehicleKumkaId)
			lKumkaFillOptionalStringVehicleKumkaId=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringVehicleKumkaId)
			lResult=lKumkaFillOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringVehicleKumkaId',lKumkaFillOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringVehicleKumkaId(String strKumkaOptionalStringVehicleKumkaId){
		Map lreturn=[:]
		String lKumkaOptionalStringVehicleKumkaId=strKumkaOptionalStringVehicleKumkaId.trim()
		if(lKumkaOptionalStringVehicleKumkaId.length()<=0){
			lKumkaOptionalStringVehicleKumkaId=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_VEHICLE_KUMKA_ID
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringVehicleKumkaId','')
			lreturn.put('Result',lResult)
			lResult=lKumkaOptionalStringVehicleKumkaId.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringVehicleKumkaId',lKumkaOptionalStringVehicleKumkaId)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringPlanType(String strKumkaFillOptionalStringPlanType){
		Map lreturn=[:]
		String lKumkaFillOptionalStringPlanType=strKumkaFillOptionalStringPlanType.trim()
		if(lKumkaFillOptionalStringPlanType.length()<=0){
			lKumkaFillOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringPlanType=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringPlanType)
			lKumkaFillOptionalStringPlanType=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringPlanType)
			lResult=lKumkaFillOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringPlanType',lKumkaFillOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringPlanType(String strKumkaOptionalStringPlanType){
		Map lreturn=[:]
		String lKumkaOptionalStringPlanType=strKumkaOptionalStringPlanType.trim()
		if(lKumkaOptionalStringPlanType.length()<=0){
			lKumkaOptionalStringPlanType=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_PLAN_TYPE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringPlanType','')
			lreturn.put('Result',lResult)
			String lKumkaOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(lKumkaOptionalStringPlanType)
			if(!lKumkaOptionalStringPlanTypeItem){
				lKumkaOptionalStringPlanTypeItem=this.DEFAULT_LIST_PLAN_TYPE.get(THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_PLAN_TYPE)
			}
			lKumkaOptionalStringPlanType=lKumkaOptionalStringPlanTypeItem
			lResult=lKumkaOptionalStringPlanType.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringPlanType',lKumkaOptionalStringPlanType)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringPostalCode(String strKumkaFillOptionalStringPostalCode){
		Map lreturn=[:]
		String lKumkaFillOptionalStringPostalCode=strKumkaFillOptionalStringPostalCode.trim()
		if(lKumkaFillOptionalStringPostalCode.length()<=0){
			lKumkaFillOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringPostalCode=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringPostalCode)
			lKumkaFillOptionalStringPostalCode=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringPostalCode)
			lResult=lKumkaFillOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringPostalCode',lKumkaFillOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringPostalCode(String strKumkaOptionalStringPostalCode){
		Map lreturn=[:]
		String lKumkaOptionalStringPostalCode=strKumkaOptionalStringPostalCode.trim()
		if(lKumkaOptionalStringPostalCode.length()<=0){
			lKumkaOptionalStringPostalCode=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_POSTAL_CODE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringPostalCode','')
			lreturn.put('Result',lResult)
			lResult=lKumkaOptionalStringPostalCode.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringPostalCode',lKumkaOptionalStringPostalCode)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringOdometer(String strKumkaFillOptionalStringOdometer){
		Map lreturn=[:]
		String lKumkaFillOptionalStringOdometer=strKumkaFillOptionalStringOdometer.trim()
		if(lKumkaFillOptionalStringOdometer.length()<=0){
			lKumkaFillOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringOdometer=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringOdometer)
			lKumkaFillOptionalStringOdometer=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringOdometer)
			lResult=lKumkaFillOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringOdometer',lKumkaFillOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringOdometer(String strKumkaOptionalStringOdometer){
		Map lreturn=[:]
		String lKumkaOptionalStringOdometer=strKumkaOptionalStringOdometer.trim()
		if(lKumkaOptionalStringOdometer.length()<=0){
			lKumkaOptionalStringOdometer=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_ODOMETER
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringOdometer','')
			lreturn.put('Result',lResult)
			lResult=lKumkaOptionalStringOdometer.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringOdometer',lKumkaOptionalStringOdometer)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringCarInsuranceDue(String strKumkaFillOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lKumkaFillOptionalStringCarInsuranceDue=strKumkaFillOptionalStringCarInsuranceDue.trim()
		if(lKumkaFillOptionalStringCarInsuranceDue.length()<=0){
			lKumkaFillOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringCarInsuranceDue)
			lKumkaFillOptionalStringCarInsuranceDue=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringCarInsuranceDue)
			lResult=lKumkaFillOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringCarInsuranceDue',lKumkaFillOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringCarInsuranceDue(String strKumkaOptionalStringCarInsuranceDue){
		Map lreturn=[:]
		String lKumkaOptionalStringCarInsuranceDue=strKumkaOptionalStringCarInsuranceDue.trim()
		if(lKumkaOptionalStringCarInsuranceDue.length()<=0){
			lKumkaOptionalStringCarInsuranceDue=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_CAR_INSURANCE_DUE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringCarInsuranceDue','')
			lreturn.put('Result',lResult)
			String lKumkaOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(lKumkaOptionalStringCarInsuranceDue)
			if(!lKumkaOptionalStringCarInsuranceDueItem){
				lKumkaOptionalStringCarInsuranceDueItem=this.DEFAULT_LIST_CAR_INSURANCE_DUE.get(THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_CAR_INSURANCE_DUE)
			}
			lKumkaOptionalStringCarInsuranceDue=lKumkaOptionalStringCarInsuranceDueItem
			lResult=lKumkaOptionalStringCarInsuranceDue.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringCarInsuranceDue',lKumkaOptionalStringCarInsuranceDue)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalStringNonce(String strKumkaFillOptionalStringNonce){
		Map lreturn=[:]
		String lKumkaFillOptionalStringNonce=strKumkaFillOptionalStringNonce.trim()
		if(lKumkaFillOptionalStringNonce.length()<=0){
			lKumkaFillOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalStringNonce','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalStringNonce=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalStringNonce)
			lKumkaFillOptionalStringNonce=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalStringNonce)
			lResult=lKumkaFillOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalStringNonce',lKumkaFillOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalStringNonce(String strKumkaOptionalStringNonce){
		Map lreturn=[:]
		String lKumkaOptionalStringNonce=strKumkaOptionalStringNonce.trim()
		if(lKumkaOptionalStringNonce.length()<=0){
			lKumkaOptionalStringNonce=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_STRING_NONCE
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalStringNonce','')
			lreturn.put('Result',lResult)
			lResult=lKumkaOptionalStringNonce.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalStringNonce',lKumkaOptionalStringNonce)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalIntegerNoOfDoor(String strKumkaFillOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lKumkaFillOptionalIntegerNoOfDoor=strKumkaFillOptionalIntegerNoOfDoor.trim()
		if(lKumkaFillOptionalIntegerNoOfDoor.length()<=0){
			lKumkaFillOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalIntegerNoOfDoor)
			lKumkaFillOptionalIntegerNoOfDoor=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalIntegerNoOfDoor)
			lResult=lKumkaFillOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalIntegerNoOfDoor',lKumkaFillOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalIntegerNoOfDoor(String strKumkaOptionalIntegerNoOfDoor){
		Map lreturn=[:]
		String lKumkaOptionalIntegerNoOfDoor=strKumkaOptionalIntegerNoOfDoor.trim()
		if(lKumkaOptionalIntegerNoOfDoor.length()<=0){
			lKumkaOptionalIntegerNoOfDoor=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_INTEGER_NO_OF_DOOR
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalIntegerNoOfDoor','')
			lreturn.put('Result',lResult)
			Integer lKumkaOptionalIntegerNoOfDoorNum=IGNUemaHelper.convertStringToInteger(lKumkaOptionalIntegerNoOfDoor,this.DEFAULT_NUMBER_OF_DOOR_KUMKA)
			lKumkaOptionalIntegerNoOfDoor=lKumkaOptionalIntegerNoOfDoorNum.toString()
			lResult=lKumkaOptionalIntegerNoOfDoor.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalIntegerNoOfDoor',lKumkaOptionalIntegerNoOfDoor)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaFillOptionalBooleanFlagIsCarFinancing(String strKumkaFillOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lKumkaFillOptionalBooleanFlagIsCarFinancing=strKumkaFillOptionalBooleanFlagIsCarFinancing.trim()
		if(lKumkaFillOptionalBooleanFlagIsCarFinancing.length()<=0){
			lKumkaFillOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_FILL_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaFillOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lKumkaFillOptionalBooleanFlagIsCarFinancing)
			lKumkaFillOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsKumkaFillOptionalBooleanFlagIsCarFinancing)
			lResult=lKumkaFillOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('KumkaFillOptionalBooleanFlagIsCarFinancing',lKumkaFillOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaOptionalBooleanFlagIsCarFinancing(String strKumkaOptionalBooleanFlagIsCarFinancing){
		Map lreturn=[:]
		String lKumkaOptionalBooleanFlagIsCarFinancing=strKumkaOptionalBooleanFlagIsCarFinancing.trim()
		if(lKumkaOptionalBooleanFlagIsCarFinancing.length()<=0){
			lKumkaOptionalBooleanFlagIsCarFinancing=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_OPTIONAL_BOOLEAN_FLAG_IS_CAR_FINANCING
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaOptionalBooleanFlagIsCarFinancing','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertStringToBoolean(lKumkaOptionalBooleanFlagIsCarFinancing)
			lKumkaOptionalBooleanFlagIsCarFinancing=IGNUemaHelper.convertBooleanToString(lIsKumkaOptionalBooleanFlagIsCarFinancing)
			lResult=lKumkaOptionalBooleanFlagIsCarFinancing.length()>0
			if(lResult){
				lreturn.put('KumkaOptionalBooleanFlagIsCarFinancing',lKumkaOptionalBooleanFlagIsCarFinancing)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map inputKumkaExpectedHavePlan(String strKumkaExpectedHavePlan){
		Map lreturn=[:]
		String lKumkaExpectedHavePlan=strKumkaExpectedHavePlan.trim()
		if(lKumkaExpectedHavePlan.length()<=0){
			lKumkaExpectedHavePlan=THARoojaiAPI2GetPlanListType.DEFAULT_KUMKA_EXPECTED_HAVE_PLAN
		}
		try{
			Boolean lResult=false
			lreturn.put('KumkaExpectedHavePlan','')
			lreturn.put('Result',lResult)
			Boolean lIsKumkaExpectedHavePlan=IGNUemaHelper.convertStringToBoolean(lKumkaExpectedHavePlan)
			lKumkaExpectedHavePlan=IGNUemaHelper.convertBooleanToString(lIsKumkaExpectedHavePlan)
			lResult=lKumkaExpectedHavePlan.length()>0
			if(lResult){
				lreturn.put('KumkaExpectedHavePlan',lKumkaExpectedHavePlan)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Map initRoojaiAPI2InputOutput(){
		Map lreturn=[:]
		try{
			String lDefaultString=''
			Boolean lDefaultBoolean=false
			Integer lDefaultInteger=0
			lreturn.put('CallPointStr',lDefaultString)
			lreturn.put('CallPointNum',lDefaultInteger)
			lreturn.put('RequiredStringUsername',lDefaultString)
			lreturn.put('RequiredStringPassword',lDefaultString)
			lreturn.put('RequiredStringBrand',lDefaultString)
			lreturn.put('RequiredStringYear',lDefaultString)
			lreturn.put('RequiredStringModel',lDefaultString)
			lreturn.put('RequiredStringSubModel',lDefaultString)
			lreturn.put('RequiredStringEngineSize',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsMaleStr',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsMaleBool',lDefaultBoolean)
			lreturn.put('RequiredBooleanFlagIsSingleStr',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsSingleBool',lDefaultBoolean)
			lreturn.put('RequiredIntegerYearOfDrivingStr',lDefaultString)
			lreturn.put('RequiredIntegerYearOfDrivingNum',lDefaultBoolean)
			lreturn.put('RequiredStringNcbRate',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsDashcamStr',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsDashcamBool',lDefaultBoolean)
			lreturn.put('RequiredBooleanFlagIsGoToWorkOnlyStr',lDefaultString)
			lreturn.put('RequiredBooleanFlagIsGoToWorkOnlyBool',lDefaultBoolean)
			lreturn.put('RequiredStringDob',lDefaultString)
			lreturn.put('RequiredIntegerNoOfClaimStr',lDefaultString)
			lreturn.put('RequiredIntegerNoOfClaimNum',lDefaultInteger)
			lreturn.put('FillOptionalStringVehicleKumkaIdStr',lDefaultString)
			lreturn.put('FillOptionalStringVehicleKumkaIdBool',lDefaultBoolean)
			lreturn.put('OptionalStringVehicleKumkaId',lDefaultString)
			lreturn.put('FillOptionalStringPlanTypeStr',lDefaultString)
			lreturn.put('FillOptionalStringPlanTypeBool',lDefaultBoolean)
			lreturn.put('OptionalStringPlanType',lDefaultString)
			lreturn.put('FillOptionalStringPostalCodeStr',lDefaultString)
			lreturn.put('FillOptionalStringPostalCodeBool',lDefaultBoolean)
			lreturn.put('OptionalStringPostalCode',lDefaultString)
			lreturn.put('FillOptionalStringOdometerStr',lDefaultString)
			lreturn.put('FillOptionalStringOdometerBool',lDefaultBoolean)
			lreturn.put('OptionalStringOdometer',lDefaultString)
			lreturn.put('FillOptionalStringCarInsuranceDueStr',lDefaultString)
			lreturn.put('FillOptionalStringCarInsuranceDueBool',lDefaultBoolean)
			lreturn.put('OptionalStringCarInsuranceDue',lDefaultString)
			lreturn.put('FillOptionalStringNonceStr',lDefaultString)
			lreturn.put('FillOptionalStringNonceBool',lDefaultBoolean)
			lreturn.put('OptionalStringNonce',lDefaultString)
			lreturn.put('FillOptionalIntegerNoOfDoorStr',lDefaultString)
			lreturn.put('FillOptionalIntegerNoOfDoorBool',lDefaultBoolean)
			lreturn.put('OptionalIntegerNoOfDoorStr',lDefaultString)
			lreturn.put('OptionalIntegerNoOfDoorNum',lDefaultInteger)
			lreturn.put('FillOptionalBooleanFlagIsCarFinancingStr',lDefaultString)
			lreturn.put('FillOptionalBooleanFlagIsCarFinancingBool',lDefaultBoolean)
			lreturn.put('OptionalBooleanFlagIsCarFinancingStr',lDefaultString)
			lreturn.put('OptionalBooleanFlagIsCarFinancingBool',lDefaultBoolean)
			lreturn.put('ExpectedHavePlanStr',lDefaultString)
			lreturn.put('ExpectedHavePlanBool',lDefaultBoolean)
			lreturn.put('EndPointVersion',lDefaultString)
			lreturn.put('ResponseStatus',lDefaultString)
			lreturn.put('ResponseTime',lDefaultString)
			lreturn.put('ResponseText',lDefaultString)
			lreturn.put('NumberOfPlanListNum',lDefaultInteger)
			lreturn.put('NumberOfPlanListStr',lDefaultString)
			lreturn.put('ActualResultBool',lDefaultBoolean)
			lreturn.put('ActualResultStr',lDefaultString)
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public RequestObject initRoojaiAPI2HomeVersionRequest(Boolean isCallPointPrimary){
		RequestObject lreturn=null
		try{
			String lEndpoint=''
			if(isCallPointPrimary){
				lEndpoint=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_HOME_VERSION_URL_PRIMARY
			}else{
				lEndpoint=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_HOME_VERSION_URL_SECONDARY
			}
			String lRequestMethod=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_HOME_VERSION_REQUEST_METHOD
			IGNUemaHelper.printLog('lEndpoint>>'+lEndpoint)
			lreturn=new RequestObject(IGNUemaHelper.randomStringAlphabetEngAndNum(17,false))
			lreturn.setRestUrl(lEndpoint)
			lreturn.setRestRequestMethod(lRequestMethod)
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public RequestObject initRoojaiAPI2RoojaiPricingGetPlanListRequest(Boolean isCallPointPrimary,Map caseInputOutput){
		RequestObject lreturn=null
		try{
			String lEndpoint=''
			if(isCallPointPrimary){
				lEndpoint=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_ROOJAI_PRICING_GET_PLAN_LIST_URL_PRIMARY
			}else{
				lEndpoint=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_ROOJAI_PRICING_GET_PLAN_LIST_URL_SECONDARY
			}
			String lRequestMethod=THARoojaiAPI2GetPlanListType.END_POINT_ROOJAI_API2_ROOJAI_PRICING_GET_PLAN_LIST_REQUEST_METHOD
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'username',caseInputOutput.RequiredStringUsername)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'password',caseInputOutput.RequiredStringPassword)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'brand',caseInputOutput.RequiredStringBrand)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'year',caseInputOutput.RequiredStringYear)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'model',caseInputOutput.RequiredStringModel)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'subModel',caseInputOutput.RequiredStringSubModel)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'engineSize',caseInputOutput.RequiredStringEngineSize)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'isMale',caseInputOutput.RequiredBooleanFlagIsMaleStr)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'isSingle',caseInputOutput.RequiredBooleanFlagIsSingleStr)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'yrOfDriving',caseInputOutput.RequiredIntegerYearOfDrivingStr)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'ncbRate',caseInputOutput.RequiredStringNcbRate)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'isDashcam',caseInputOutput.RequiredBooleanFlagIsDashcamStr)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'isGoToWorkOnly',caseInputOutput.RequiredBooleanFlagIsGoToWorkOnlyStr)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'dob',caseInputOutput.RequiredStringDob)
			lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'noOfClaim',caseInputOutput.RequiredIntegerNoOfClaimStr)
			if(!caseInputOutput.FillOptionalStringVehicleKumkaIdBool){
				caseInputOutput.OptionalStringVehicleKumkaId=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'vehicleKey',caseInputOutput.OptionalStringVehicleKumkaId)
			}
			if(!caseInputOutput.FillOptionalStringPlanTypeBool){
				caseInputOutput.OptionalStringPlanType=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'planType',caseInputOutput.OptionalStringPlanType)
			}
			if(!caseInputOutput.FillOptionalStringPostalCodeBool){
				caseInputOutput.OptionalStringPostalCode=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'postalCode',caseInputOutput.OptionalStringPostalCode)
			}
			if(!caseInputOutput.FillOptionalStringOdometerBool){
				caseInputOutput.OptionalStringOdometer=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'odoMeter',caseInputOutput.OptionalStringOdometer)
			}
			if(!caseInputOutput.FillOptionalStringCarInsuranceDueBool){
				caseInputOutput.OptionalStringCarInsuranceDue=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'carInsuranceDue',caseInputOutput.OptionalStringCarInsuranceDue)
			}
			if(!caseInputOutput.FillOptionalStringNonceBool){
				caseInputOutput.OptionalStringNonce=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'nonce',caseInputOutput.OptionalStringNonce)
			}
			if(!caseInputOutput.FillOptionalIntegerNoOfDoorBool){
				caseInputOutput.OptionalIntegerNoOfDoorStr=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'noOfDoor',caseInputOutput.OptionalIntegerNoOfDoorStr)
			}
			if(!caseInputOutput.FillOptionalBooleanFlagIsCarFinancingBool){
				caseInputOutput.OptionalBooleanFlagIsCarFinancingStr=''
			}else{
				lEndpoint=IGNUemaHelper.concatURLRequestParameter(lEndpoint,'carFinancing',caseInputOutput.OptionalBooleanFlagIsCarFinancingStr)
			}
			IGNUemaHelper.printLog('lEndpoint>>'+lEndpoint)
			lreturn=new RequestObject(IGNUemaHelper.randomStringAlphabetEngAndNum(17,false))
			lreturn.setRestUrl(lEndpoint)
			lreturn.setRestRequestMethod(lRequestMethod)
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputRoojaiAPI2InputOutputGobear(Map caseInputOutput){
		Boolean lreturn=false
		String lEndPointVersion=''
		Integer lResponseStatusCode=0
		String lResponseStatusText=''
		Integer lResponseTimeNum=0
		String lResponseTimeText=''
		String lResponseText=''
		Integer lNumberOfPlanListNum=0
		String lNumberOfPlanListText=''
		Boolean lActualResultBool=false
		String lActualResultText=''
		try{
			caseInputOutput.ActualResultBool=lActualResultBool
			caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lActualResultBool)
			Boolean lIsOK=false
			Boolean lIsCallPointPrimary=caseInputOutput.CallPointNum==1
			RequestObject lHomeVersionRequest=null
			if(lIsCallPointPrimary){
				lEndPointVersion='Primary'
			}else{
				lEndPointVersion='Secondary'
			}
			lHomeVersionRequest=this.initRoojaiAPI2HomeVersionRequest(lIsCallPointPrimary)
			if(!lHomeVersionRequest){
				return lreturn
			}
			ResponseObject lHomeVersionResponse=WS.sendRequest(lHomeVersionRequest)
			if(!lHomeVersionResponse){
				return lreturn
			}
			lEndPointVersion=IGNUemaHelper.concatMessageLeftRightByPipe(lEndPointVersion,lHomeVersionResponse.getResponseText().trim())
			caseInputOutput.EndPointVersion=lEndPointVersion
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseTimeNum=lHomeVersionResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lEndPointVersion.length()>0)
			if(!lIsOK){
				return lreturn
			}
			RequestObject lRoojaiPricingGetPlanListRequest=this.initRoojaiAPI2RoojaiPricingGetPlanListRequest(lIsCallPointPrimary,caseInputOutput)
			if(!lRoojaiPricingGetPlanListRequest){
				return lreturn
			}
			ResponseObject lRoojaiPricingGetPlanListResponse=WS.sendRequest(lRoojaiPricingGetPlanListRequest)
			if(!lRoojaiPricingGetPlanListResponse){
				return lreturn
			}
			lResponseText=lRoojaiPricingGetPlanListResponse.getResponseText()
			caseInputOutput.ResponseText=IGNUemaHelper.copyStringFitForExcelCell(lResponseText)
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseStatusText=IGNUemaHelper.concatMessageLeftRightByPipe(lResponseStatusText,lRoojaiPricingGetPlanListRequest.getRestUrl())
			lResponseTimeNum=lRoojaiPricingGetPlanListResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lResponseText.length()>0)
			caseInputOutput.ResponseStatus=lResponseStatusText
			caseInputOutput.ResponseTime=lResponseTimeText
			if(lIsOK){
				Boolean lIsDone=false
				THARoojaiAPI2GetPlanList_Output_A_Util lRoojaiAPI2GetPlanListOutput=new THARoojaiAPI2GetPlanList_Output_A_Util('Gobear',lResponseText)
				Map lRoojaiAPI2GetPlanListOutput_OutputListSave=lRoojaiAPI2GetPlanListOutput.outputListSave()
				lIsOK=lRoojaiAPI2GetPlanListOutput_OutputListSave.Result
				if(lIsOK){
					lNumberOfPlanListNum=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListNum
					caseInputOutput.NumberOfPlanListNum=lNumberOfPlanListNum
					lNumberOfPlanListText=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListStr
					caseInputOutput.NumberOfPlanListStr=lNumberOfPlanListText
					if(caseInputOutput.ExpectedHavePlanBool){
						lIsDone=(lNumberOfPlanListNum>0)
					}else{
						lIsDone=(lNumberOfPlanListNum<=0)
					}
					caseInputOutput.ActualResultBool=lIsDone
					caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lIsDone)
				}
			}
			lreturn=lIsOK
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputRoojaiAPI2InputOutputPriceza(Map caseInputOutput){
		Boolean lreturn=false
		String lEndPointVersion=''
		Integer lResponseStatusCode=0
		String lResponseStatusText=''
		Integer lResponseTimeNum=0
		String lResponseTimeText=''
		String lResponseText=''
		Integer lNumberOfPlanListNum=0
		String lNumberOfPlanListText=''
		Boolean lActualResultBool=false
		String lActualResultText=''
		try{
			caseInputOutput.ActualResultBool=lActualResultBool
			caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lActualResultBool)
			Boolean lIsOK=false
			Boolean lIsCallPointPrimary=caseInputOutput.CallPointNum==1
			RequestObject lHomeVersionRequest=null
			if(lIsCallPointPrimary){
				lEndPointVersion='Primary'
			}else{
				lEndPointVersion='Secondary'
			}
			lHomeVersionRequest=this.initRoojaiAPI2HomeVersionRequest(lIsCallPointPrimary)
			if(!lHomeVersionRequest){
				return lreturn
			}
			ResponseObject lHomeVersionResponse=WS.sendRequest(lHomeVersionRequest)
			if(!lHomeVersionResponse){
				return lreturn
			}
			lEndPointVersion=IGNUemaHelper.concatMessageLeftRightByPipe(lEndPointVersion,lHomeVersionResponse.getResponseText().trim())
			caseInputOutput.EndPointVersion=lEndPointVersion
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseTimeNum=lHomeVersionResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lEndPointVersion.length()>0)
			if(!lIsOK){
				return lreturn
			}
			RequestObject lRoojaiPricingGetPlanListRequest=this.initRoojaiAPI2RoojaiPricingGetPlanListRequest(lIsCallPointPrimary,caseInputOutput)
			if(!lRoojaiPricingGetPlanListRequest){
				return lreturn
			}
			ResponseObject lRoojaiPricingGetPlanListResponse=WS.sendRequest(lRoojaiPricingGetPlanListRequest)
			if(!lRoojaiPricingGetPlanListResponse){
				return lreturn
			}
			lResponseText=lRoojaiPricingGetPlanListResponse.getResponseText()
			caseInputOutput.ResponseText=IGNUemaHelper.copyStringFitForExcelCell(lResponseText)
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseStatusText=IGNUemaHelper.concatMessageLeftRightByPipe(lResponseStatusText,lRoojaiPricingGetPlanListRequest.getRestUrl())
			lResponseTimeNum=lRoojaiPricingGetPlanListResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lResponseText.length()>0)
			caseInputOutput.ResponseStatus=lResponseStatusText
			caseInputOutput.ResponseTime=lResponseTimeText
			if(lIsOK){
				Boolean lIsDone=false
				THARoojaiAPI2GetPlanList_Output_A_Util lRoojaiAPI2GetPlanListOutput=new THARoojaiAPI2GetPlanList_Output_A_Util('Priceza',lResponseText)
				Map lRoojaiAPI2GetPlanListOutput_OutputListSave=lRoojaiAPI2GetPlanListOutput.outputListSave()
				lIsOK=lRoojaiAPI2GetPlanListOutput_OutputListSave.Result
				if(lIsOK){
					lNumberOfPlanListNum=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListNum
					caseInputOutput.NumberOfPlanListNum=lNumberOfPlanListNum
					lNumberOfPlanListText=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListStr
					caseInputOutput.NumberOfPlanListStr=lNumberOfPlanListText
					if(caseInputOutput.ExpectedHavePlanBool){
						lIsDone=(lNumberOfPlanListNum>0)
					}else{
						lIsDone=(lNumberOfPlanListNum<=0)
					}
					caseInputOutput.ActualResultBool=lIsDone
					caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lIsDone)
				}
			}
			lreturn=lIsOK
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public Boolean inputRoojaiAPI2InputOutputKumka(Map caseInputOutput){
		Boolean lreturn=false
		String lEndPointVersion=''
		Integer lResponseStatusCode=0
		String lResponseStatusText=''
		Integer lResponseTimeNum=0
		String lResponseTimeText=''
		String lResponseText=''
		Integer lNumberOfPlanListNum=0
		String lNumberOfPlanListText=''
		Boolean lActualResultBool=false
		String lActualResultText=''
		try{
			caseInputOutput.ActualResultBool=lActualResultBool
			caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lActualResultBool)
			Boolean lIsOK=false
			Boolean lIsCallPointPrimary=caseInputOutput.CallPointNum==1
			RequestObject lHomeVersionRequest=null
			if(lIsCallPointPrimary){
				lEndPointVersion='Primary'
			}else{
				lEndPointVersion='Secondary'
			}
			lHomeVersionRequest=this.initRoojaiAPI2HomeVersionRequest(lIsCallPointPrimary)
			if(!lHomeVersionRequest){
				return lreturn
			}
			ResponseObject lHomeVersionResponse=WS.sendRequest(lHomeVersionRequest)
			if(!lHomeVersionResponse){
				return lreturn
			}
			lEndPointVersion=IGNUemaHelper.concatMessageLeftRightByPipe(lEndPointVersion,lHomeVersionResponse.getResponseText().trim())
			caseInputOutput.EndPointVersion=lEndPointVersion
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseTimeNum=lHomeVersionResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lEndPointVersion.length()>0)
			if(!lIsOK){
				return lreturn
			}
			RequestObject lRoojaiPricingGetPlanListRequest=this.initRoojaiAPI2RoojaiPricingGetPlanListRequest(lIsCallPointPrimary,caseInputOutput)
			if(!lRoojaiPricingGetPlanListRequest){
				return lreturn
			}
			ResponseObject lRoojaiPricingGetPlanListResponse=WS.sendRequest(lRoojaiPricingGetPlanListRequest)
			if(!lRoojaiPricingGetPlanListResponse){
				return lreturn
			}
			lResponseText=lRoojaiPricingGetPlanListResponse.getResponseText()
			caseInputOutput.ResponseText=IGNUemaHelper.copyStringFitForExcelCell(lResponseText)
			lResponseStatusCode=lHomeVersionResponse.getStatusCode()
			lResponseStatusText=lResponseStatusCode.toString()
			lResponseStatusText=IGNUemaHelper.concatMessageLeftRightByPipe(lResponseStatusText,lRoojaiPricingGetPlanListRequest.getRestUrl())
			lResponseTimeNum=lRoojaiPricingGetPlanListResponse.getElapsedTime()
			lResponseTimeText=lResponseTimeNum.toString()
			lIsOK=(lResponseStatusCode==200)
			lIsOK=lIsOK&&(lResponseText.length()>0)
			caseInputOutput.ResponseStatus=lResponseStatusText
			caseInputOutput.ResponseTime=lResponseTimeText
			if(lIsOK){
				Boolean lIsDone=false
				THARoojaiAPI2GetPlanList_Output_B_Util lRoojaiAPI2GetPlanListOutput=new THARoojaiAPI2GetPlanList_Output_B_Util('Kumka',lResponseText)
				Map lRoojaiAPI2GetPlanListOutput_OutputListSave=lRoojaiAPI2GetPlanListOutput.outputListSave()
				lIsOK=lRoojaiAPI2GetPlanListOutput_OutputListSave.Result
				if(lIsOK){
					lNumberOfPlanListNum=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListNum
					caseInputOutput.NumberOfPlanListNum=lNumberOfPlanListNum
					lNumberOfPlanListText=lRoojaiAPI2GetPlanListOutput_OutputListSave.NumberOfPlanListStr
					caseInputOutput.NumberOfPlanListStr=lNumberOfPlanListText
					if(caseInputOutput.ExpectedHavePlanBool){
						lIsDone=(lNumberOfPlanListNum>0)
					}else{
						lIsDone=(lNumberOfPlanListNum<=0)
					}
					caseInputOutput.ActualResultBool=lIsDone
					caseInputOutput.ActualResultStr=IGNUemaHelper.convertBooleanToString(lIsDone)
				}
			}
			lreturn=lIsOK
			return lreturn
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}