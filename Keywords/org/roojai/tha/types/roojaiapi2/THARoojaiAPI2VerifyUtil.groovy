package org.roojai.tha.types.roojaiapi2
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.Select
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2VerifyUtil{
	public THARoojaiAPI2VerifyUtil(){
		super()
	}
	public Boolean inputVerify(Map caseInput,Map caseOutput){
		Boolean lreturn=false
		Boolean lIsPrevPageSkipped=false
		Boolean lIsPositiveRoojaiAPI2GetPlanList=false
		Boolean lIsRoojaiAPI2GetPlanList=false
		String lRoojaiAPI2GetPlanList=caseInput.RoojaiAPI2GetPlanList.toString().trim()
		Boolean lIsActualResult=false
		String lActualResult=caseInput.ActualResult.toString().trim()
		Boolean lReadOK=false
		Map lStatusTypes=['1':'Passed','2':'Failed','3':'Skipped']
		try{
			Map lCaseRoojaiAPI2GetPlanListInput=[:]
			Map lCaseRoojaiAPI2GetPlanListOutput=[:]
			lReadOK=THARoojaiAPI2GetPlanListType.readInputFromDataFile(GlobalVariable.CaseNumber,lCaseRoojaiAPI2GetPlanListInput)
			IGNUemaHelper.delayThreadSecond(1)
			lReadOK=lReadOK&&THARoojaiAPI2GetPlanListType.readOutputFromDataFile(GlobalVariable.CaseNumber,lCaseRoojaiAPI2GetPlanListOutput)
			IGNUemaHelper.delayThreadSecond(1)
			if(!lReadOK){
				return lreturn
			}else{
				if(lIsPrevPageSkipped){
					lRoojaiAPI2GetPlanList=lStatusTypes.get('3')
				}else{
					if(lCaseRoojaiAPI2GetPlanListOutput.PositiveCase.toString().length()>0){
						lIsPositiveRoojaiAPI2GetPlanList=IGNUemaHelper.convertStringToBoolean(lCaseRoojaiAPI2GetPlanListOutput.PositiveCase.toString())
						if(!lIsPositiveRoojaiAPI2GetPlanList){
							lIsPrevPageSkipped=true
						}
					}
					lIsRoojaiAPI2GetPlanList=IGNUemaHelper.convertStringToBoolean(lCaseRoojaiAPI2GetPlanListOutput.ActualResult.toString())
					if(lIsRoojaiAPI2GetPlanList){
						lRoojaiAPI2GetPlanList=lStatusTypes.get('1')
					}else{
						lRoojaiAPI2GetPlanList=lStatusTypes.get('2')
					}
					lIsActualResult=lIsRoojaiAPI2GetPlanList
				}
				caseOutput.RoojaiAPI2GetPlanList=lRoojaiAPI2GetPlanList
			}
			//Verify
			if(lIsActualResult){
				lActualResult=lStatusTypes.get('1')
			}else{
				lActualResult=lStatusTypes.get('2')
			}
			caseOutput.ActualResult=lActualResult
			lreturn=true
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}