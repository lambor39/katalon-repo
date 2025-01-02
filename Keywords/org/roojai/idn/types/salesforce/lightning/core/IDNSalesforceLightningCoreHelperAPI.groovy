package org.roojai.idn.types.salesforce.lightning.core
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.apache.commons.lang3.StringUtils
import org.openqa.selenium.WebDriver
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNSalesforceRestAPIHelper
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreHelperUI
public class IDNSalesforceLightningCoreHelperAPI{
	public static Map mapGetSalesforceAccountRecordIdListFromRestAPIObject(String strTargetSearchObjectName,String strSalesforceRecordIDList,String strSfSearchByDetailExpectedAccountType,Map<String,String> mapAccountPersonFieldList,Map<String,String> mapAccountBusinessFieldList){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordId=''
		List<String> lListSalesforceRecordID=null
		try{
			lreturn.put('ListSalesforceRecordId',lListSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectName)){
				return lreturn
			}
			String lStrTargetSearchObjectName=strTargetSearchObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSalesforceRecordIDList)){
				return lreturn
			}
			String lStrSalesforceRecordIDList=strSalesforceRecordIDList.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceRecordIDList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSfSearchByDetailExpectedAccountType)){
				return lreturn
			}
			String lStrSfSearchByDetailExpectedAccountType=strSfSearchByDetailExpectedAccountType.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailExpectedAccountType)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapAccountPersonFieldList)){
				return lreturn
			}
			Map<String,String> lMapAccountPersonFieldList=mapAccountPersonFieldList
			if(IGNUemaHelper.checkObjectEmptyOfMap(mapAccountBusinessFieldList)){
				return lreturn
			}
			Map<String,String> lMapAccountBusinessFieldList=mapAccountBusinessFieldList
			Boolean lIsOK=IGNSalesforceRestAPIHelper.setIGNSalesforceRestAPICountry(IGNTestDataCountry.Indonesia)
			List<String> lListTargetSalesforceRecordID=null
			String lStrTargetSalesforceObjectName=''
			Boolean lIsToPreferSelectedFieldName=false
			List<String> lListFieldNameAll=new ArrayList<String>()
			List<String> lListFieldNameSelected=new ArrayList<String>()
			Boolean lIsWhereJoinOperatorAnd=true
			String lStrClauseCustomText=''
			Map<String,String> lMapClauseEqualAnd=[:]
			Map<String,String> lMapClauseEqualOr=[:]
			Map<String,String> lMapClauseInAnd=[:]
			Map<String,String> lMapClauseInOr=[:]
			Map<String,String> lMapClauseLikeAnd=[:]
			Map<String,String> lMapClauseLikeOr=[:]
			Map<String,String> lMapClauseNotEqualAnd=[:]
			Map<String,String> lMapClauseNotEqualOr=[:]
			Map<String,String> lMapClauseNotInAnd=[:]
			Map<String,String> lMapClauseNotInOr=[:]
			Map<String,String> lMapClauseNotLikeAnd=[:]
			Map<String,String> lMapClauseNotLikeOr=[:]
			String lStrWhereClause=''
			String lStrSuffixQuery=''
			lStrTargetSalesforceObjectName=lStrTargetSearchObjectName
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
			String lStrWhereClause01=''
			String lStrWhereClause02=''
			lMapClauseNotEqualAnd.clear()
			lStrSuffixQuery=''
			switch(lStrSfSearchByDetailExpectedAccountType){
				case 'Person':
					lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
					String lStrTrueValue=IGNUemaHelper.convertBooleanToString(true)
					lMapClauseEqualAnd.put('IsPersonAccount',lStrTrueValue)
					break
				case 'Business':
					lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
					String lStrFalseValue=IGNUemaHelper.convertBooleanToString(false)
					lMapClauseEqualAnd.put('IsPersonAccount',lStrFalseValue)
					break
				default:
					lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
					break
			}
			lStrWhereClause01=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			Map<String,String> lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause01,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectByQueryParamList.Result){
				lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause01,lStrSuffixQuery)
			}
			if(lMapGetSalesforceObjectByQueryParamList.Result){
				List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
				List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
				lListSalesforceRecordID=this.getListSalesforceRestAPIResponseRecordID(lListMapSalesforceObjectRecordByQueryParamList,"Id")
				lStrSalesforceRecordIDList=this.getStringSalesforceStringRestAPIResponseRecordIDList(lListSalesforceRecordID)
				lListTargetSalesforceRecordID=lListSalesforceRecordID
			}
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
			if(lListSalesforceRecordID.size()>0){
				lStrSalesforceRecordIDList=this.getStringSalesforceStringRestAPIResponseRecordIDList(lListSalesforceRecordID)
				switch(lStrSfSearchByDetailExpectedAccountType){
					case 'Person':
						lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
						String lStrTrueValue=IGNUemaHelper.convertBooleanToString(true)
						lMapClauseEqualAnd.put('IsPersonAccount',lStrTrueValue)
						for(Map.Entry lEntry in lMapAccountPersonFieldList){
							String lStrMapKey=lEntry.getKey()
							String lStrMapValue=lEntry.getValue()
							lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
							lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
							lMapClauseLikeAnd.put(lStrMapKey,lStrMapValue)
						}
						lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
						break
					case 'Business':
						lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
						String lStrFalseValue=IGNUemaHelper.convertBooleanToString(false)
						lMapClauseEqualAnd.put('IsPersonAccount',lStrFalseValue)
						for(Map.Entry lEntry in lMapAccountBusinessFieldList){
							String lStrMapKey=lEntry.getKey()
							String lStrMapValue=lEntry.getValue()
							lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
							lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
							lMapClauseLikeAnd.put(lStrMapKey,lStrMapValue)
						}
						lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
						break
					default:
						lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
						String lStrTrueValue=IGNUemaHelper.convertBooleanToString(false)
						lMapClauseEqualAnd.put('IsPersonAccount',lStrTrueValue)
						for(Map.Entry lEntry in lMapAccountPersonFieldList){
							String lStrMapKey=lEntry.getKey()
							String lStrMapValue=lEntry.getValue()
							lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
							lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
							lMapClauseLikeAnd.put(lStrMapKey,lStrMapValue)
						}
						lStrWhereClause01=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
						lMapClauseLikeAnd.clear()
						lMapClauseEqualAnd.clear()
						String lStrFalseValue=IGNUemaHelper.convertBooleanToString(false)
						lMapClauseEqualAnd.put('IsPersonAccount',lStrFalseValue)
						for(Map.Entry lEntry in lMapAccountBusinessFieldList){
							String lStrMapKey=lEntry.getKey()
							String lStrMapValue=lEntry.getValue()
							lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
							lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
							lMapClauseLikeAnd.put(lStrMapKey,lStrMapValue)
						}
						lStrWhereClause02=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
						lStrWhereClause=IGNUemaHelper.getStringBracketRound(lStrWhereClause01)+StringUtils.SPACE+'OR'+StringUtils.SPACE+IGNUemaHelper.getStringBracketRound(lStrWhereClause02)
						break
				}
				lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
				if(!lMapGetSalesforceObjectByQueryParamList.Result){
					lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
				}
				if(lMapGetSalesforceObjectByQueryParamList.Result){
					List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
					List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
					if(lListMapSalesforceObjectRecordByQueryParamList.size()>0){
						lListSalesforceRecordID=this.getListSalesforceRestAPIResponseRecordID(lListMapSalesforceObjectRecordByQueryParamList,"Id")
					}else{
						lListSalesforceRecordID=[]
					}
				}
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
				if(lListSalesforceRecordID.size()==0){
					lListSalesforceRecordID=lListTargetSalesforceRecordID
					lStrSalesforceRecordIDList=this.getStringSalesforceStringRestAPIResponseRecordIDList(lListSalesforceRecordID)
					switch(lStrSfSearchByDetailExpectedAccountType){
						case 'Person':
							lMapClauseInOr.put('Id',lStrSalesforceRecordIDList)
							String lStrTrueValue=IGNUemaHelper.convertBooleanToString(true)
							lMapClauseEqualAnd.put('IsPersonAccount',lStrTrueValue)
							for(Map.Entry lEntry in lMapAccountPersonFieldList){
								String lStrMapKey=lEntry.getKey()
								String lStrMapValue=lEntry.getValue()
								lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
								lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
								lMapClauseLikeOr.put(lStrMapKey,lStrMapValue)
							}
							lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
							break
						case 'Business':
							lMapClauseInOr.put('Id',lStrSalesforceRecordIDList)
							String lStrFalseValue=IGNUemaHelper.convertBooleanToString(false)
							lMapClauseEqualAnd.put('IsPersonAccount',lStrFalseValue)
							for(Map.Entry lEntry in lMapAccountBusinessFieldList){
								String lStrMapKey=lEntry.getKey()
								String lStrMapValue=lEntry.getValue()
								lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
								lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
								lMapClauseLikeOr.put(lStrMapKey,lStrMapValue)
							}
							lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
							break
						default:
							lMapClauseInOr.put('Id',lStrSalesforceRecordIDList)
							for(Map.Entry lEntry in lMapAccountPersonFieldList){
								String lStrMapKey=lEntry.getKey()
								String lStrMapValue=lEntry.getValue()
								lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
								lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
								lMapClauseLikeOr.put(lStrMapKey,lStrMapValue)
							}
							lStrWhereClause01=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
							lMapClauseLikeOr.clear()
							for(Map.Entry lEntry in lMapAccountBusinessFieldList){
								String lStrMapKey=lEntry.getKey()
								String lStrMapValue=lEntry.getValue()
								lStrMapValue=IGNUemaHelper.getAddedStringBeginEnd(lStrMapValue,'%')
								lStrMapValue=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrMapValue)
								lMapClauseLikeOr.put(lStrMapKey,lStrMapValue)
							}
							lStrWhereClause02=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
							lStrWhereClause=IGNUemaHelper.getStringBracketRound(lStrWhereClause01)+StringUtils.SPACE+'OR'+StringUtils.SPACE+IGNUemaHelper.getStringBracketRound(lStrWhereClause02)
							break
					}
					lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
					if(!lMapGetSalesforceObjectByQueryParamList.Result){
						lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
					}
					if(lMapGetSalesforceObjectByQueryParamList.Result){
						List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
						List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
						if(lListMapSalesforceObjectRecordByQueryParamList.size()>0){
							lListSalesforceRecordID=this.getListSalesforceRestAPIResponseRecordID(lListMapSalesforceObjectRecordByQueryParamList,"Id")
						}else{
							lListSalesforceRecordID=[]
						}
					}
				}
			}
			lResult=lListSalesforceRecordID.size()>0
			if(lResult){
				lreturn.put('ListSalesforceRecordId',lListSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static Map mapGetSalesforceAnyRecordIdListFromRestAPIObject(String strTargetSearchObjectName,String strSalesforceRecordIDList,String strTargetSfRelationshipIdField){
		Map lreturn=[:]
		Boolean lResult=false
		String lStrSalesforceRecordId=''
		List<String> lListSalesforceRecordID=null
		try{
			lreturn.put('ListSalesforceRecordId',lListSalesforceRecordID)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectName)){
				return lreturn
			}
			String lStrTargetSearchObjectName=strTargetSearchObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSalesforceRecordIDList)){
				return lreturn
			}
			String lStrSalesforceRecordIDList=strSalesforceRecordIDList.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceRecordIDList)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfString(strTargetSfRelationshipIdField)){
				return lreturn
			}
			String lStrTargetSfRelationshipIdField=strTargetSfRelationshipIdField
			Boolean lIsOK=IGNSalesforceRestAPIHelper.setIGNSalesforceRestAPICountry(IGNTestDataCountry.Indonesia)
			List<String> lListTargetSalesforceRecordID=null
			String lStrTargetSalesforceObjectName=''
			Boolean lIsToPreferSelectedFieldName=false
			List<String> lListFieldNameAll=new ArrayList<String>()
			List<String> lListFieldNameSelected=new ArrayList<String>()
			Boolean lIsWhereJoinOperatorAnd=true
			String lStrClauseCustomText=''
			Map<String,String> lMapClauseEqualAnd=[:]
			Map<String,String> lMapClauseEqualOr=[:]
			Map<String,String> lMapClauseInAnd=[:]
			Map<String,String> lMapClauseInOr=[:]
			Map<String,String> lMapClauseLikeAnd=[:]
			Map<String,String> lMapClauseLikeOr=[:]
			Map<String,String> lMapClauseNotEqualAnd=[:]
			Map<String,String> lMapClauseNotEqualOr=[:]
			Map<String,String> lMapClauseNotInAnd=[:]
			Map<String,String> lMapClauseNotInOr=[:]
			Map<String,String> lMapClauseNotLikeAnd=[:]
			Map<String,String> lMapClauseNotLikeOr=[:]
			String lStrWhereClause=''
			String lStrSuffixQuery=''
			lStrTargetSalesforceObjectName=lStrTargetSearchObjectName
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
			lListFieldNameSelected.add(lStrTargetSfRelationshipIdField)
			String lStrWhereClause01=''
			String lStrWhereClause02=''
			lMapClauseNotEqualAnd.clear()
			lStrSuffixQuery=''
			if(lStrSalesforceRecordIDList.length()>0){
				lMapClauseEqualAnd.put('Id',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrSalesforceRecordIDList))
			}
			lStrWhereClause01=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			Map<String,String> lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause01,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectByQueryParamList.Result){
				lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause01,lStrSuffixQuery)
			}
			if(lMapGetSalesforceObjectByQueryParamList.Result){
				List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
				List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
				if(lListMapSalesforceObjectRecordByQueryParamList.size()>0){
					lListSalesforceRecordID=this.getListSalesforceRestAPIResponseRecordID(lListMapSalesforceObjectRecordByQueryParamList,lStrTargetSfRelationshipIdField)
				}else{
					lListSalesforceRecordID=[]
				}
			}
			lResult=lListSalesforceRecordID.size()>0
			if(lResult){
				lreturn.put('ListSalesforceRecordId',lListSalesforceRecordID)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static String getStringSalesforceRecordIDSelectionOnMultiPleRecord(String strTargetSearchObjectName,String strSfSearchByDetailSelectionOnMultipleRecord,List<String>listSalesforceRecordID){
		String lreturn=''
		String lStrSalesforceRecordId=''
		Boolean lResult=false
		try{
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSearchObjectName)){
				return lreturn
			}
			String lStrTargetSearchObjectName=strTargetSearchObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSearchObjectName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSfSearchByDetailSelectionOnMultipleRecord)){
				return lreturn
			}
			String lStrSfSearchByDetailSelectionOnMultipleRecord=strSfSearchByDetailSelectionOnMultipleRecord.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSfSearchByDetailSelectionOnMultipleRecord)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectEmptyOfList(listSalesforceRecordID)){
				return lreturn
			}
			Boolean lIsOK=IGNSalesforceRestAPIHelper.setIGNSalesforceRestAPICountry(IGNTestDataCountry.Indonesia)
			List<String>lListSalesforceRecordID=listSalesforceRecordID
			String lStrSalesforceRecordIDList=this.getStringSalesforceStringRestAPIResponseRecordIDList(lListSalesforceRecordID)
			Integer lNumSalesforceObjectRecordIDList=lListSalesforceRecordID.size()
			String lSOQLQueryObject=''
			String lStrTargetSalesforceObjectName=''
			String lStrClauseCustomText=''
			Boolean lIsToPreferSelectedFieldName=false
			List<String> lListFieldNameAll=new ArrayList<String>()
			List<String> lListFieldNameSelected=new ArrayList<String>()
			Boolean lIsWhereJoinOperatorAnd=true
			Map<String,String> lMapClauseEqualAnd=[:]
			Map<String,String> lMapClauseEqualOr=[:]
			Map<String,String> lMapClauseInAnd=[:]
			Map<String,String> lMapClauseInOr=[:]
			Map<String,String> lMapClauseLikeAnd=[:]
			Map<String,String> lMapClauseLikeOr=[:]
			Map<String,String> lMapClauseNotEqualAnd=[:]
			Map<String,String> lMapClauseNotEqualOr=[:]
			Map<String,String> lMapClauseNotInAnd=[:]
			Map<String,String> lMapClauseNotInOr=[:]
			Map<String,String> lMapClauseNotLikeAnd=[:]
			Map<String,String> lMapClauseNotLikeOr=[:]
			String lStrWhereClause=''
			String lStrSuffixQuery=''
			lStrTargetSalesforceObjectName=lStrTargetSearchObjectName
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
			String lStrWhereClause01=''
			String lStrWhereClause02=''
			lMapClauseNotEqualAnd.clear()
			lStrSuffixQuery=''
			switch(lStrSfSearchByDetailSelectionOnMultipleRecord){
				case 'Last':
					lStrSalesforceRecordId=lListSalesforceRecordID.get(lNumSalesforceObjectRecordIDList-1)
					break
				case 'Last_Modified_Field':
					lMapClauseInAnd.put('Id',lStrSalesforceRecordIDList)
					lStrSuffixQuery='ORDER BY LastModifiedDate DESC'
					lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
					Map<String,String> lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
					if(!lMapGetSalesforceObjectByQueryParamList.Result){
						lMapGetSalesforceObjectByQueryParamList=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
					}
					if(lMapGetSalesforceObjectByQueryParamList.Result){
						List<Map> lListMapJsonSalesforceObjectResponseObject=lMapGetSalesforceObjectByQueryParamList.ListMapJsonResponseObject
						List<Map> lListMapSalesforceObjectRecordByQueryParamList=lMapGetSalesforceObjectByQueryParamList.ListMapSalesforceObjectRecord
						lListSalesforceRecordID=this.getListSalesforceRestAPIResponseRecordID(lListMapSalesforceObjectRecordByQueryParamList,"Id")
					}
					if(lListSalesforceRecordID.size()>0){
						lStrSalesforceRecordId=lListSalesforceRecordID.get(0)
					}
					break
				case 'Random':
					Integer lRandomNumber=IGNUemaHelper.getRandomIntegerFromBoundLowToLessThanBoundHigh(0,lNumSalesforceObjectRecordIDList)
					lStrSalesforceRecordId=lListSalesforceRecordID.get(lRandomNumber)
					break
				default:
					lStrSalesforceRecordId=lListSalesforceRecordID.get(0)
					break
			}
			lResult=lStrSalesforceRecordId.length()>1
			if(lResult){
				lreturn=lStrSalesforceRecordId
			}
		}catch(Exception e){
		}
		return lreturn
	}
	public static List<String> getListSalesforceRestAPIResponseRecordID(List<Map> listMapSalesforceObjectRecordByQueryParam,String strTargetField){
		List<String> lreturn=null
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(listMapSalesforceObjectRecordByQueryParam)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectEmptyOfString(strTargetField)){
			return lreturn
		}
		String lStrTargetField=strTargetField
		List<Map> lMapSalesforceObjectRecordByQueryParamList=listMapSalesforceObjectRecordByQueryParam
		try{
			List<String> lListSalesforceRecordID=[]
			if(lMapSalesforceObjectRecordByQueryParamList.size()>0){
				for(Integer lIndex=0;lIndex<=lMapSalesforceObjectRecordByQueryParamList.size()-1;lIndex++){
					Map<String,String> lMapSalesforceObjectRecordID=lMapSalesforceObjectRecordByQueryParamList.get(lIndex)
					String lStrRecordId=lMapSalesforceObjectRecordID.get(lStrTargetField)
					lListSalesforceRecordID.add(lStrRecordId)
				}
			}
			lreturn=lListSalesforceRecordID
		}catch(Exception e){
		}
		return lreturn
	}
	public static String getStringSalesforceStringRestAPIResponseRecordIDList(List<String> listStrSalesforceRecordID){
		String lreturn=''
		Boolean lResult=false
		if(IGNUemaHelper.checkObjectEmptyOfList(listStrSalesforceRecordID)){
			return lreturn
		}
		List<String> lListSalesforceRecordID=listStrSalesforceRecordID
		try{
			List<String> lListUpdatedSalesforceRecordID=[]
			String lStrListSalesforceRecordID=''
			for (String lStrRecordID:lListSalesforceRecordID){
				lStrRecordID=IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrRecordID)
				lListUpdatedSalesforceRecordID.add(lStrRecordID)
			}
			lStrListSalesforceRecordID=IGNUemaHelper.getStringCommaTextFromListString(lListUpdatedSalesforceRecordID)
			lResult=lStrListSalesforceRecordID.length()>0
			if(lResult){
				lreturn=lStrListSalesforceRecordID
			}
		}catch(Exception e){
		}
		return lreturn
	}
}