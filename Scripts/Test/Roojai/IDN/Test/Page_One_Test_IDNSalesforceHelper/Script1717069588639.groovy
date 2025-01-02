import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.apache.commons.lang3.StringUtils
import org.mockito.internal.util.StringUtil
import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultActual
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestResultExpected
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestManager as IGNTestManager
import org.roojai.ignite.types.testmanager.*
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper as IGNSalesforceRestAPIHelper
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNTestResultActual lIGNTestResultActualThisCase=IGNTestResultActual.FailedNoWarning
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	Boolean lIsRunNext=true
	Boolean lIsOK=false
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lIsOK=IGNSalesforceRestAPIHelper.setIGNSalesforceRestAPICountry(IGNTestDataCountry.Indonesia)
		IGNUemaHelper.printLog(IGNSalesforceRestAPIHelper.getIGNSalesforceRestAPICountry())
		String lSalesforceServiceAPIVersion=IGNSalesforceRestAPIHelper.strDefaultSalesforceServiceAPIVersion
		Map lMapGetSalesforceServiceAPIVersionAccessLimit=[:]
		String lResponseObjectResponseText=''
		Map lMapJsonResponseObject=[:]
		lMapGetSalesforceServiceAPIVersionAccessLimit=IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit(lSalesforceServiceAPIVersion)
		if(!lMapGetSalesforceServiceAPIVersionAccessLimit.Result){
			lMapGetSalesforceServiceAPIVersionAccessLimit=IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit(lSalesforceServiceAPIVersion)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceServiceAPIVersionAccessLimit.Result))
		if(lMapGetSalesforceServiceAPIVersionAccessLimit.Result){
			lResponseObjectResponseText=lMapGetSalesforceServiceAPIVersionAccessLimit.ResponseObjectResponseText
			lMapJsonResponseObject=lMapGetSalesforceServiceAPIVersionAccessLimit.MapJsonResponseObject
			IGNUemaHelper.printLog(lResponseObjectResponseText)
			IGNUemaHelper.printLog(lMapJsonResponseObject)
		}
		lMapGetSalesforceServiceAPIVersionAccessLimit=IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit(lSalesforceServiceAPIVersion)
		if(!lMapGetSalesforceServiceAPIVersionAccessLimit.Result){
			lMapGetSalesforceServiceAPIVersionAccessLimit=IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit(lSalesforceServiceAPIVersion)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceServiceAPIVersionAccessLimit:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceServiceAPIVersionAccessLimit.Result))
		if(lMapGetSalesforceServiceAPIVersionAccessLimit.Result){
			lResponseObjectResponseText=lMapGetSalesforceServiceAPIVersionAccessLimit.ResponseObjectResponseText
			lMapJsonResponseObject=lMapGetSalesforceServiceAPIVersionAccessLimit.MapJsonResponseObject
			IGNUemaHelper.printLog(lResponseObjectResponseText)
			IGNUemaHelper.printLog(lMapJsonResponseObject)
		}
		Map lMapCaseOutputNoPrefixV1=[:]
		Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1=[:]
		lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1('1000-00005867',lMapCaseOutputNoPrefixV1)
		if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1.Result){
			lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1('1000-00005867',lMapCaseOutputNoPrefixV1)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1.Result))
		if(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1.Result){
			IGNUemaHelper.printLog(lMapCaseOutputNoPrefixV1)
			//IGNUemaHelper.writeStringToFile('C:/Automation/Projects/Roojai_Website/Reports/0.txt',lMapCaseOutputNoPrefixV1.toString(),false)
		}
		Map lMapCaseOutputNoPrefixV2=[:]
		Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2=[:]
		lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2('1000-02588427',lMapCaseOutputNoPrefixV2)
		if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2.Result){
			lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2('1000-02588427',lMapCaseOutputNoPrefixV2)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2.Result))
		if(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2.Result){
			IGNUemaHelper.printLog(lMapCaseOutputNoPrefixV2)
			//IGNUemaHelper.writeStringToFile('C:/Automation/Projects/Roojai_Website/Reports/0.txt',lMapCaseOutputNoPrefixV2.toString(),false)
		}
		Map lMapCaseOutputWithPrefixA=[:]
		Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA=[:]
		lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefix('1000-00005867','',lMapCaseOutputWithPrefixA)
		if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA.Result){
			lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefix('1000-00005867','',lMapCaseOutputWithPrefixA)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA.Result))
		if(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixA.Result){
			IGNUemaHelper.printLog(lMapCaseOutputWithPrefixA)
			//IGNUemaHelper.writeStringToFile('C:/Automation/Projects/Roojai_Website/Reports/0.txt',lMapCaseOutputWithPrefixA.toString(),false)
		}
		Map lMapCaseOutputWithPrefixB=[:]
		Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB=[:]
		lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefix('1000-00005867','ZZZZ',lMapCaseOutputWithPrefixB)
		if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB.Result){
			lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB=IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefix('1000-00005867','ZZZZ',lMapCaseOutputWithPrefixB)
		}
		IGNUemaHelper.printLog('IGNSalesforceRestAPIHelper.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB:'+IGNUemaHelper.convertBooleanToString(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB.Result))
		if(lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefixB.Result){
			IGNUemaHelper.printLog(lMapCaseOutputWithPrefixB)
			//IGNUemaHelper.writeStringToFile('C:/Automation/Projects/Roojai_Website/Reports/0.txt',lMapCaseOutputWithPrefixB.toString(),false)
		}
		String lStrSOQLText='SELECT Id, IsDeleted, MasterRecordId, Name, LastName, FirstName, Salutation, MiddleName, Suffix FROM Account where Id=\'001Hy000018fPT8IAM\''
		Map lMapGetSalesforceExecuteSOQLQueryFirst=IGNSalesforceRestAPIHelper.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLText)
		if(!lMapGetSalesforceExecuteSOQLQueryFirst.Result){
			lMapGetSalesforceExecuteSOQLQueryFirst=IGNSalesforceRestAPIHelper.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLText)
		}
		IGNUemaHelper.printLog('lMapGetSalesforceExecuteSOQLQueryFirst.Result:'+IGNUemaHelper.convertBooleanToYesNoString(lMapGetSalesforceExecuteSOQLQueryFirst.Result))
		if(lMapGetSalesforceExecuteSOQLQueryFirst.Result){
			lMapJsonResponseObject=lMapGetSalesforceExecuteSOQLQueryFirst.MapJsonResponseObject
			IGNUemaHelper.printLog('lMapJsonResponseObject:'+lMapJsonResponseObject.toString())
		}
		Map lMapGetSalesforceObjectFieldNameListAll=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectFieldNameList('Account')
		if(!lMapGetSalesforceObjectFieldNameListAll.Result){
			lMapGetSalesforceObjectFieldNameListAll=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectFieldNameList('Account')
		}
		IGNUemaHelper.printLog('lMapGetSalesforceObjectFieldNameListAll.Result:'+IGNUemaHelper.convertBooleanToYesNoString(lMapGetSalesforceObjectFieldNameListAll.Result))
		if(lMapGetSalesforceObjectFieldNameListAll.Result){
			List<String> lListSalesforceObjectFieldNameListAll=lMapGetSalesforceObjectFieldNameListAll.ListSalesforceObjectFieldName
			IGNUemaHelper.printLog('lListSalesforceObjectFieldNameListAll:'+lListSalesforceObjectFieldNameListAll.toString())
		}
		String lStrTargetSalesforceObjectName=''
		Boolean lIsToPreferSelectedFieldName=false
		List<String> lListFieldNameAll=new ArrayList<String>()
		List<String> lListFieldNameSelected=new ArrayList<String>()
		Boolean lIsWhereJoinOperatorAnd=true
		String lStrClauseCustomText=''
		Map lMapClauseEqualAnd=[:]
		Map lMapClauseEqualOr=[:]
		Map lMapClauseInAnd=[:]
		Map lMapClauseInOr=[:]
		Map lMapClauseLikeAnd=[:]
		Map lMapClauseLikeOr=[:]
		Map lMapClauseNotEqualAnd=[:]
		Map lMapClauseNotEqualOr=[:]
		Map lMapClauseNotInAnd=[:]
		Map lMapClauseNotInOr=[:]
		Map lMapClauseNotLikeAnd=[:]
		Map lMapClauseNotLikeOr=[:]
		String lStrWhereClause=''
		String lStrSuffixQuery=''
		lStrTargetSalesforceObjectName='Account'
		lIsToPreferSelectedFieldName=false
		lListFieldNameAll.clear()
		lListFieldNameSelected.clear()
		lIsWhereJoinOperatorAnd=true
		lStrClauseCustomText=''
		lMapClauseEqualAnd.clear()
		lMapClauseEqualOr.clear()
		lMapClauseInAnd.clear()
		lMapClauseInOr.clear()
		lMapClauseLikeAnd.clear()
		lMapClauseLikeOr.clear()
		lMapClauseNotEqualAnd.clear()
		lMapClauseNotEqualOr.clear()
		lMapClauseNotInAnd.clear()
		lMapClauseNotInOr.clear()
		lMapClauseNotLikeAnd.clear()
		lMapClauseNotLikeOr.clear()
		lListFieldNameSelected.add('ID')
		lListFieldNameSelected.add('ISDELETED')
		lListFieldNameSelected.add('NAME')
		lListFieldNameSelected.add('LASTNAME')
		lMapClauseLikeAnd.put('NAME',IGNUemaHelper.getAddedSingleQuoteBeginEnd('E%'))
		lMapClauseNotEqualAnd.put('ISDELETED','true')
		lMapClauseNotLikeAnd.put('NAME',IGNUemaHelper.getAddedSingleQuoteBeginEnd('%test%'))
		String lStrWhereClause01=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
		lMapClauseNotEqualAnd.clear()
		String lStrWhereClause02=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
		lStrWhereClause=IGNUemaHelper.getStringBracketRound(lStrWhereClause01)+StringUtils.SPACE+'OR'+StringUtils.SPACE+IGNUemaHelper.getStringBracketRound(lStrWhereClause02)
		lStrSuffixQuery='ORDER BY NAME LIMIT 2'
		Map lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
		if(!lMapGetSalesforceObjectByQueryParamList.Result){
			lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
		}
		IGNUemaHelper.printLog('lMapGetSalesforceObjectByQueryParamList.Result:'+IGNUemaHelper.convertBooleanToYesNoString(lMapGetSalesforceObjectByQueryParamList.Result))
		if(lMapGetSalesforceObjectByQueryParamList.Result){
			List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
			List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
			IGNUemaHelper.printLog('lListMapJsonSalesforceObjectResponseObject:'+lListMapJsonSalesforceObjectResponseObject.toString())
			IGNUemaHelper.printLog('lListMapSalesforceObjectRecordByQueryParamList:'+lListMapSalesforceObjectRecordByQueryParamList.toString())
			if(lListMapSalesforceObjectRecordByQueryParamList.size()>0){
				Map lMapSalesforceObjectRecordByQueryParamList00=lListMapSalesforceObjectRecordByQueryParamList[0]
				String lStrSalesforceRecordId=lMapSalesforceObjectRecordByQueryParamList00.Id
				if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrSalesforceRecordId)){
					IGNUemaHelper.printLog('lStrSalesforceRecordId:NullOrEmpty')
				}else{
					IGNUemaHelper.printLog('lStrSalesforceRecordId:'+lStrSalesforceRecordId)
					Map lMapUpdateAccount=[:]
					String lStrAccountPersonBirthdate=IGNUemaHelper.convertLocalDateToString('yyyy-MM-dd',IGNUemaHelper.convertDateStringtoLocalDate('dd/MM/yyyy','08/09/1988'))
					lMapUpdateAccount.put('PersonBirthdate',lStrAccountPersonBirthdate)
					Map lMapUpdateSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapUpdateSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lStrSalesforceRecordId,lMapUpdateAccount)
					if(!lMapUpdateSalesforceObjectByQueryParamList.Result){
						lMapUpdateSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapUpdateSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lStrSalesforceRecordId,lMapUpdateAccount)
					}
					IGNUemaHelper.printLog('lMapUpdateSalesforceObjectByQueryParamList.Result:'+IGNUemaHelper.convertBooleanToYesNoString(lMapUpdateSalesforceObjectByQueryParamList.Result))
					String lStrSalesforceObjectNameFromSalesforceRecordId=IGNSalesforceRestAPIHelper.getSalesforceObjectNameFromSalesforceRecordId(lStrSalesforceRecordId)
					if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrSalesforceObjectNameFromSalesforceRecordId)){
						IGNUemaHelper.printLog('lStrSalesforceObjectNameFromSalesforceRecordId:NullOrEmpty')
					}else{
						IGNUemaHelper.printLog('lStrSalesforceObjectNameFromSalesforceRecordId:'+lStrSalesforceObjectNameFromSalesforceRecordId)
					}
				}
			}
		}
	}
	IGNUemaHelper.printLog('lIsRunNext='+IGNUemaHelper.convertBooleanToYesNoString(lIsRunNext))
	if(lIsRunNext){
		lIGNTestResultActualThisCase=IGNTestResultActual.PassedNoWarning
	}
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
	try{
		IGNUemaHelper.printLog('PageException='+e.message)
	}catch(Exception ex){
		IGNUemaHelper.printLog('PageExceptionOfException='+ex.message)
	}
	lIGNTestResultActualThisCase=IGNTestResultActual.Error
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
try{
	switch(lIGNTestResultActualThisCase){
		case IGNTestResultActual.PassedNoWarning:
			KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.PassedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedNoWarning:
			KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
			break
		case IGNTestResultActual.FailedWithWarning:
			KeywordUtil.markWarning(GlobalVariable.TestCaseFullName)
			break
		default:
			KeywordUtil.markError(GlobalVariable.TestCaseFullName)
			break
	}
}catch(Exception e){
}
return null