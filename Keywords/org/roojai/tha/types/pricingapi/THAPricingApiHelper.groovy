package org.roojai.tha.types.pricingapi
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.google.common.net.HttpHeaders
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.*
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.webservice.HttpBodyContent
import groovy.json.JsonSlurper
import groovy.sql.*
import internal.GlobalVariable
import io.netty.handler.codec.http.HttpMethod
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.tha.core.THAGlobalConst as THAGlobalConst
public class THAPricingApiHelper{
	protected static final String strDefaultRequestHeaderAuthorizationKey=HttpHeaders.AUTHORIZATION
	protected static final String strDefaultRequestHeaderContentType01Key=HttpHeaders.CONTENT_TYPE
	protected static final String strDefaultRequestHeaderContentType01Value='application/json;charset=UTF-8;'
	protected static final String strDefaultRequestHeaderContentType02Key=HttpHeaders.ORIGIN
	protected static final String strDefaultRequestHeaderContentType02Value='http://localhost:5173'
	protected static final String strDefaultRequestHeaderContentType03Key='X-UUID'
	public static final String CONST_HTTP_METHOD_CONNECT=HttpMethod.CONNECT
	public static final String CONST_HTTP_METHOD_DELETE=HttpMethod.DELETE
	public static final String CONST_HTTP_METHOD_GET=HttpMethod.GET
	public static final String CONST_HTTP_METHOD_HEAD=HttpMethod.HEAD
	public static final String CONST_HTTP_METHOD_OPTIONS=HttpMethod.OPTIONS
	public static final String CONST_HTTP_METHOD_PATCH=HttpMethod.PATCH
	public static final String CONST_HTTP_METHOD_POST=HttpMethod.POST
	public static final String CONST_HTTP_METHOD_PUT=HttpMethod.PUT
	public static final String CONST_HTTP_METHOD_TRACE=HttpMethod.TRACE
	public static Map mapCallRestAPIGeneric(String strHTTPMethod,String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog('Inside API CAll')
			Boolean lResult=false
			lreturn.put('Result',lResult)
			String lHTTPMethod=strHTTPMethod.trim()
			if(lHTTPMethod.length()<=0){
				return lreturn
			}
			String lURLServerBaseURI=strURLServerBaseURI.trim()
			if(lURLServerBaseURI.length()<=0){
				return lreturn
			}
			String lURLServerRestAPIEndpoint=strURLServerRestAPIEndpoint.trim()
			String lHTTPBodyContent=strHTTPBodyContent.trim()
			Boolean lIsOK=false
			String lServerURLEndpoint=lURLServerBaseURI+lURLServerRestAPIEndpoint
			IGNUemaHelper.printLog('lServerURLEndpoint')
			IGNUemaHelper.printLog(lServerURLEndpoint)
			String lURLRequestParameterString=IGNUemaHelper.convertMapURLRequestParameterToStringURLRequestParameter(lServerURLEndpoint,mapURLRequestParameter)
			IGNUemaHelper.printLog('lURLRequestParameterString')
			IGNUemaHelper.printLog(lURLRequestParameterString)
			RequestObject lRequestObject=new RequestObject(IGNUemaHelper.randomStringAlphabetEngAndNum(17,false))
			lRequestObject.setRestUrl(lURLRequestParameterString)
			lRequestObject.setRestRequestMethod(lHTTPMethod)
			if(listHTTPRequestHeader){
				lRequestObject.setHttpHeaderProperties(listHTTPRequestHeader)
			}
			if(lHTTPBodyContent.length()>0){
				lRequestObject.setBodyContent(new HttpTextBodyContent(lHTTPBodyContent))
			}
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=WS.sendRequest(lRequestObject)
			if(!lResponseObject){
				IGNUemaHelper.printLog('lResponseObject')
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lResponseObject.getStatusCode()
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			IGNUemaHelper.printLog('lResponseObjectStatusCode')
			IGNUemaHelper.printLog(lResponseObjectStatusCode)
			String lResponseObjectStatusText=lResponseObjectStatusCode.toString()
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lResponseObject.getElapsedTime()
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lResponseObjectElapsedTimeNum.toString()
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lResponseObject.getResponseText()
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(!lIsObjectJsonValid){
				return lreturn
			}
			JsonSlurper lJsonSlurper=new JsonSlurper()
			Map lMapJson=lJsonSlurper.parseText(lResponseObjectResponseText)
			if(lMapJson){
				lIsObjectMapReady=true
			}
			if(!lIsObjectMapReady){
				return lreturn
			}
			lIsOK=lIsObjectMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJson)
			}
		}catch(Exception e){
			lreturn.put('ResultMessage',e.getMessage())
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPConnect(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_CONNECT,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPDelete(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_DELETE,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPGet(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_GET,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPHead(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_HEAD,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPOptions(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_OPTIONS,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPatch(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_PATCH,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPost(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_POST,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPut(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_PUT,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPTrace(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_TRACE,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapPricingApiRegisterClientCallRequest(String strPricingApiInputRequestBodyContent){
		Map lreturn=[:]
		String lPricingApiInputRequestBodyContent=strPricingApiInputRequestBodyContent.trim()
		try{
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType01Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType01Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType02Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType02Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lPricingApiServerRegsiterClientBaseUrl=THAGlobalConst.DEFAULT_PRICING_API_SERVER_REGISTER_CLIENT_URL_UAT
			String lPricingApiServerRegsiterClientEndpointURL=THAGlobalConst.DEFAULT_PRICING_API_SERVER_REGISTER_CLIENT_ENDPOINT_URL
			Map lMapURLRequestParameter=[:]
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lPricingApiServerRegsiterClientBaseUrl,lPricingApiServerRegsiterClientEndpointURL,lMapURLRequestParameter,lListHTTPRequestHeader,lPricingApiInputRequestBodyContent)
			//	IGNUemaHelper.printLog(lMapCallRestAPIHTTPPost.ResponseObjectResponseText)
			lreturn.putAll(lMapCallRestAPIHTTPPost)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map inputPricingApiMultiPlanPriceCallRequest(String strPricingApiMultiPlanPriceInputRequestBodyContent,String strPricingApiMultiPlanPriceInputRequestUrl,String strRegisterUuid){
		Map lreturn=[:]
		String lRegisterUuid=strRegisterUuid.trim()
		String lPricingApiMultiPlanPriceInputRequestBodyContent=strPricingApiMultiPlanPriceInputRequestBodyContent.trim()
		String lPricingApiMultiPlanPriceInputRequestUrl=strPricingApiMultiPlanPriceInputRequestUrl.trim()
		try{
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType01Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType01Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType02Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType02Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType03Key,ConditionType.EQUALS,lRegisterUuid)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lPricingApiServerMultiPlanPriceBaseUrl=lPricingApiMultiPlanPriceInputRequestUrl
			Map lMapURLRequestParameter=[:]
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lPricingApiServerMultiPlanPriceBaseUrl,'',lMapURLRequestParameter,lListHTTPRequestHeader,lPricingApiMultiPlanPriceInputRequestBodyContent)
			lreturn.putAll(lMapCallRestAPIHTTPPost)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map inputPricingApiGetPlanPriceCallRequest(String strPricingApiGetPlanPriceInputRequestBodyContent,String strPricingApiGetPlanPriceInputRequestUrl,String strRegisterUuid){
		Map lreturn=[:]
		String lRegisterUuid=strRegisterUuid.trim()
		String lPricingApiGetPlanPriceInputRequestBodyContent=strPricingApiGetPlanPriceInputRequestBodyContent.trim()
		String lPricingApiGetPlanPriceInputRequestUrl=strPricingApiGetPlanPriceInputRequestUrl.trim()
		try{
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType01Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType01Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType02Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType02Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType03Key,ConditionType.EQUALS,lRegisterUuid)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lPricingApiServerGetPlanPriceBaseUrl=lPricingApiGetPlanPriceInputRequestUrl
			Map lMapURLRequestParameter=[:]
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lPricingApiServerGetPlanPriceBaseUrl,'',lMapURLRequestParameter,lListHTTPRequestHeader,lPricingApiGetPlanPriceInputRequestBodyContent)
			//IGNUemaHelper.printLog(lMapCallRestAPIHTTPPost.ResponseObjectResponseText)
			lreturn.putAll(lMapCallRestAPIHTTPPost)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map inputPricingApiGetPlanWithInstallmentPriceCallRequest(String strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent,String strPricingApiGetPlanWithInstallmentPriceInputRequestUrl,String strRegisterUuid){
		Map lreturn=[:]
		String lRegisterUuid=strRegisterUuid.trim()
		String lPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent=strPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent.trim()
		String lPricingApiGetPlanWithInstallmentPriceInputRequestUrl=strPricingApiGetPlanWithInstallmentPriceInputRequestUrl.trim()
		try{
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType01Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType01Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType02Key,ConditionType.EQUALS,this.strDefaultRequestHeaderContentType02Value)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentType03Key,ConditionType.EQUALS,lRegisterUuid)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lPricingApiServerGetPlanWithInstallmentPriceBaseUrl=lPricingApiGetPlanWithInstallmentPriceInputRequestUrl
			Map lMapURLRequestParameter=[:]
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lPricingApiServerGetPlanWithInstallmentPriceBaseUrl,'',lMapURLRequestParameter,lListHTTPRequestHeader,lPricingApiGetPlanWithInstallmentPriceInputRequestBodyContent)
			//IGNUemaHelper.printLog(lMapCallRestAPIHTTPPost.ResponseObjectResponseText)
			lreturn.putAll(lMapCallRestAPIHTTPPost)
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map getDependencyTable(String strPolicyProductVersion,String strProductType,String strCoverName){
		Boolean lResult=false
		Map lreturn=[:]
		String lPolicyProductVersion=strPolicyProductVersion
		String lProductType=strProductType
		String lCoverName=strCoverName
		List<GroovyRowResult> lDependencyCodeMappingResultSet=[]
		try{
			lreturn.put('DependencyCodeMappingResultSet',lDependencyCodeMappingResultSet)
			lreturn.put('Result',lResult)
			String dbConnString=''
			String dbUsername=''
			String dbPassword=''
			String dbDriver=''
			IGNUemaHelper.printLog('isUAT=true')
			dbConnString="jdbc:postgresql://uatnfdDmvd.uat-roojai.co.id:5432/d90n51k6seh5oc?sslmode=require"
			dbUsername="testautomation"
			dbPassword="p1a18c18a877f7feb842b9cd03275f338ca22d27699ea610e179b22b5fb9e3507"
			dbDriver="org.postgresql.Driver"
			Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
			String lCode='RSA'
			lDependencyCodeMappingResultSet=sql.rows('select * from pricing.dependency_code_mapping where product=\''+lProductType+'\'and product_version_no= \''+lPolicyProductVersion+'\' and code=\''+lCoverName+'\'order by  option_sequence ASC')
			lResult=(lDependencyCodeMappingResultSet.size()>=1)
			if(lResult){
				lreturn.put('DependencyCodeMappingResultSet',lDependencyCodeMappingResultSet)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map getVehicleDataTable(String strVehicleMake,String strVehicleModel,String strVehicleYearOfManufacture,String strSubModel){
		Boolean lResult=false
		Map lreturn=[:]
		String llVehicleMake=strVehicleMake.trim()
		String lVehicleModel=strVehicleModel.trim()
		String lVehicleYearOfManufacture=strVehicleYearOfManufacture.trim()
		String lSubModel=strSubModel.trim()
		List<GroovyRowResult> lVehicleDataResultSet=[]
		try{
			lreturn.put('VehicleDataResultSet',lVehicleDataResultSet)
			lreturn.put('Result',lResult)
			String dbConnString=''
			String dbUsername=''
			String dbPassword=''
			String dbDriver=''
			IGNUemaHelper.printLog('isUAT=true')
			dbConnString="jdbc:postgresql://uatnfdDmvd.uat-roojai.co.id:5432/d90n51k6seh5oc?sslmode=require"
			dbUsername="testautomation"
			dbPassword="p1a18c18a877f7feb842b9cd03275f338ca22d27699ea610e179b22b5fb9e3507"
			dbDriver="org.postgresql.Driver"
			Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
			IGNUemaHelper.printLog('Start Query')
			lVehicleDataResultSet=sql.rows('SELECT sfid,yeargroup,gear_location_description,uw_group,fuel_type_description,goodkm,vehicle_type_code,engine_description,new_active_veh_key,engine_size,cylinders,avg_whole_sale,uw_class,makecode,model_family,to_deactivate,name,premium_group,gear_num,door_num,wheel_base,seat_capacity,body_style,good_whole_sale,familycode,premium_class,compulsory_type,avg_retail,make,kerb_weight,vehicle_key,new_price,product_type,price,height,drive_description,width,model_description,length,power,good_retail,tariff_group,transmission,id FROM shared.redbook where UPPER(make)=\''+llVehicleMake+'\'and UPPER(model_family)= \''+lVehicleModel+'\' and yeargroup=\''+lVehicleYearOfManufacture+'\'and UPPER(model_description)=\''+lSubModel+'\'')
			lResult=lVehicleDataResultSet.size()>=1
			if(lResult){
				lreturn.put('VehicleDataResultSet',lVehicleDataResultSet)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getPricingCoverageIndexValue(String strProductType,String strCoverageName){
		Boolean lResult=false
		String lreturn=''
		String lProductType=strProductType
		String lCoverageName=strCoverageName
		String lPricingCoverageIndex=''
		List<GroovyRowResult> lPricingCoverageIndexResultSet=[]
		try{
			String dbConnString=''
			String dbUsername=''
			String dbPassword=''
			String dbDriver=''
			IGNUemaHelper.printLog('isUAT=true')
			dbConnString="jdbc:postgresql://uatnfdDmvd.uat-roojai.co.id:5432/d90n51k6seh5oc?sslmode=require"
			dbUsername="testautomation"
			dbPassword="p1a18c18a877f7feb842b9cd03275f338ca22d27699ea610e179b22b5fb9e3507"
			dbDriver="org.postgresql.Driver"
			Sql sql=Sql.newInstance(dbConnString,dbUsername,dbPassword,dbDriver)
			IGNUemaHelper.printLog('Start Query')
			def row=sql.firstRow('select product_type,coverage_code,column_index from pricing.policy_service_coverage_mapping where product_type=\''+lProductType+'\'and coverage_code= \''+lCoverageName+'\'')
			lreturn=row?row.column_index:lreturn
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
}