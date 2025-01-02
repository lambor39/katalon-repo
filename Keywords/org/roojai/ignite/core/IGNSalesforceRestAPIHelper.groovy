package org.roojai.ignite.core
import static org.assertj.core.api.Assertions.*
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.*
import org.json.JSONObject
import org.apache.commons.lang3.StringUtils
import java.time.temporal.ChronoUnit
import java.time.Month
import java.time.LocalTime
import java.time.LocalDateTime
import java.time.LocalDate
import io.netty.handler.codec.http.HttpMethod
import internal.GlobalVariable
import groovy.json.JsonSlurper
import com.kms.katalon.entity.webservice.HttpBodyContent
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.verification.WSResponseManager
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.*
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.annotation.Keyword
import com.google.common.net.HttpHeaders
import org.roojai.ignite.core.IGNGlobalConst
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.idn.core.IDNGlobalConst as IDNGlobalConst
import org.roojai.tha.core.THAGlobalConst as THAGlobalConst
public class IGNSalesforceRestAPIHelper{
	protected static final String strDefaultRequestHeaderAuthorizationKey=HttpHeaders.AUTHORIZATION
	protected static final String strDefaultRequestHeaderContentTypeKey=HttpHeaders.CONTENT_TYPE
	protected static final String strDefaultRequestHeaderContentTypeValue='application/json;charset=UTF-8;'
	protected static final String strDefaultRequestParameterGrantTypeKey='grant_type'
	protected static final String strDefaultRequestParameterClientIdKey='client_id'
	protected static final String strDefaultRequestParameterClientSecretKey='client_secret'
	protected static final String strDefaultRequestParameterRedirectURIKey='redirect_uri'
	protected static final String strDefaultRequestParameterUsernameKey='username'
	protected static final String strDefaultRequestParameterPasswordKey='password'
	protected static String strDefaultSalesforceServiceAPIVersion='v60.0'
	protected static IGNTestDataCountry ignTestDataCountry=IGNTestDataCountry.Thailand
	protected static LocalDateTime localDateTimeServerTokenAccess=LocalDateTime.of(2000,Month.JANUARY,1,0,0,0)
	protected static String strServerTokenType=''
	protected static String strServerAccessToken=''
	protected static String strServerInstanceURL=''
	protected static final List<Integer> CONST_HTTP_STATUS_SUCCESS_LIST=List.of(200,201,202,203,204,205,206,207,208,226)
	public static final String CONST_HTTP_METHOD_CONNECT=HttpMethod.CONNECT
	public static final String CONST_HTTP_METHOD_DELETE=HttpMethod.DELETE
	public static final String CONST_HTTP_METHOD_GET=HttpMethod.GET
	public static final String CONST_HTTP_METHOD_HEAD=HttpMethod.HEAD
	public static final String CONST_HTTP_METHOD_OPTIONS=HttpMethod.OPTIONS
	public static final String CONST_HTTP_METHOD_PATCH=HttpMethod.PATCH
	public static final String CONST_HTTP_METHOD_POST=HttpMethod.POST
	public static final String CONST_HTTP_METHOD_PUT=HttpMethod.PUT
	public static final String CONST_HTTP_METHOD_TRACE=HttpMethod.TRACE
	@Keyword
	public static org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry getIGNSalesforceRestAPICountry(){
		IGNTestDataCountry lreturn=IGNTestDataCountry.Thailand
		try{
			lreturn=this.ignTestDataCountry
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean setIGNSalesforceRestAPICountry(IGNTestDataCountry newIGNTestDataCountry){
		Boolean lreturn=false
		try{
			this.ignTestDataCountry=newIGNTestDataCountry
			this.localDateTimeServerTokenAccess=LocalDateTime.of(2000,Month.JANUARY,1,0,0,0)
			this.strServerTokenType=''
			this.strServerAccessToken=''
			this.strServerInstanceURL=''
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIGeneric(String strHTTPMethod,String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			String lHTTPMethod=strHTTPMethod.trim()
			if(lHTTPMethod.length()<=0){
				return lreturn
			}
			String lURLServerBaseURI=strURLServerBaseURI.trim()
			if(lURLServerBaseURI.length()<=0){
				return lreturn
			}
			String lURLServerRestAPIEndpoint=strURLServerRestAPIEndpoint.trim()
			if(lURLServerRestAPIEndpoint.length()<=0){
				return lreturn
			}
			String lHTTPBodyContent=strHTTPBodyContent.trim()
			Boolean lIsOK=false
			String lServerURLEndpoint=lURLServerBaseURI+lURLServerRestAPIEndpoint
			String lURLRequestParameterString=IGNUemaHelper.convertMapURLRequestParameterToStringURLRequestParameter(lServerURLEndpoint,mapURLRequestParameter)
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
				IGNUemaHelper.printLog('lResponseObject:Null')
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lResponseObject.getStatusCode()
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lResponseObjectStatusCode.toString()
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lResponseObject.getElapsedTime()
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lResponseObjectElapsedTimeNum.toString()
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lResponseObject.getResponseText()
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				IGNUemaHelper.printLog('lResponseObjectStatusCode:'+lResponseObjectStatusCode.toString()+'<Not Success>')
				return lreturn
			}
			List<String> lListHTTPMethodNoResponse=List.of(this.CONST_HTTP_METHOD_DELETE,this.CONST_HTTP_METHOD_PATCH)
			Boolean lIsValidateSkipped=lListHTTPMethodNoResponse.contains(lHTTPMethod)
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			Boolean lIsObjectListMapReady=false
			Map lMapJson=null
			List<Map> lListMapJson=null
			if(!lIsValidateSkipped){
				lIsObjectJsonValid=lResponseObjectResponseText.length()>0
				if(!lIsObjectJsonValid){
					IGNUemaHelper.printLog('lIsObjectJsonValid:No')
					return lreturn
				}
				JsonSlurper lJsonSlurper=new JsonSlurper()
				try{
					lMapJson=lJsonSlurper.parseText(lResponseObjectResponseText)
					if(lMapJson){
						lIsObjectMapReady=true
					}
					if(!lIsObjectMapReady){
						IGNUemaHelper.printLog('lIsObjectMapReady:No')
						return lreturn
					}
					lIsOK=lIsObjectMapReady
				}catch(Exception ex){
					try{
						lListMapJson=lJsonSlurper.parseText(lResponseObjectResponseText)
						if(lListMapJson){
							lIsObjectListMapReady=true
						}
						if(!lIsObjectListMapReady){
							IGNUemaHelper.printLog('lIsObjectListMapReady:No')
							return lreturn
						}
						lIsOK=lIsObjectListMapReady
					}catch(Exception exx){
					}
				}
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJson)
				lreturn.put('ListMapJsonResponseObject',lListMapJson)
			}
		}catch(Exception e){
			lreturn.put('ResultMessage',e.getMessage())
			e.printStackTrace()
		}
		//IGNUemaHelper.printLog('lreturn='+lreturn.toString())
		return lreturn
	}
	public static Map mapCallRestAPIHTTPConnect(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_CONNECT,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPDelete(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_DELETE,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPGet(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_GET,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPHead(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_HEAD,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPOptions(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_OPTIONS,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPatch(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_PATCH,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPost(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_POST,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPPut(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_PUT,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapCallRestAPIHTTPTrace(String strURLServerBaseURI,String strURLServerRestAPIEndpoint,Map mapURLRequestParameter,List<TestObjectProperty> listHTTPRequestHeader,String strHTTPBodyContent){
		Map lreturn=[:]
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			lreturn=this.mapCallRestAPIGeneric(this.CONST_HTTP_METHOD_TRACE,strURLServerBaseURI,strURLServerRestAPIEndpoint,mapURLRequestParameter,listHTTPRequestHeader,strHTTPBodyContent)
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getConfigurationSalesforceServerURI(){
		String lreturn=''
		try{
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				if(THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lreturn=THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_URL_UAT
				}else{
					lreturn=THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_URL_PROD
				}
			}else{
				if(IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lreturn=IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_URL_UAT
				}else{
					lreturn=IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_URL_PROD
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return lreturn
	}
	public static Boolean checkSalesforceServerGetAccessToken(){
		Boolean lreturn=false
		String lSalesforceAPIEndpointPathGetAccessToken='/services/oauth2/token'
		String lJsonKeyTokenType='token_type'
		String lJsonKeyAccessToken='access_token'
		String lJsonKeyInstanceURL='instance_url'
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(this.strServerAccessToken.length()<=0){
				IGNUemaHelper.printLog('strServerAccessToken:Empty')
				this.localDateTimeServerTokenAccess=LocalDateTime.of(2000,Month.JANUARY,1,0,0,0)
			}
			LocalDateTime lLocalDateTimeNow=IGNUemaHelper.getLocalDateTimeCurrent()
			Long lServerTokenAccessDiff=ChronoUnit.MILLIS.between(this.localDateTimeServerTokenAccess,lLocalDateTimeNow)
			//IGNUemaHelper.printLog('lServerTokenAccessDiff:'+lServerTokenAccessDiff.toString())
			if(lServerTokenAccessDiff<=300000){
				IGNUemaHelper.printLog('serverGetAccessToken:Using Existing Token')
				lreturn=true
				return lreturn
			}else{
				IGNUemaHelper.printLog('serverGetAccessToken:Getting New Token')
			}
			String lServerTokenType=''
			String lServerAccessToken=''
			String lServerInstanceURL=''
			this.strServerTokenType=lServerTokenType
			this.strServerAccessToken=lServerAccessToken
			this.strServerInstanceURL=lServerInstanceURL
			Boolean lIsOK=false
			String lServerURI=this.getConfigurationSalesforceServerURI()
			Map lMapURLRequestParameter=[:]
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterGrantTypeKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_GRANT_TYPE,true)
			}else{
				lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterGrantTypeKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_GRANT_TYPE,true)
			}
			if(!lIsOK){
				return lreturn
			}
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				if(THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientIdKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientIdKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_PROD,true)
				}
			}else{
				if(IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientIdKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientIdKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_ID_PROD,true)
				}
			}
			if(!lIsOK){
				return lreturn
			}
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				if(THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientSecretKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientSecretKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_PROD,true)
				}
			}else{
				if(IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientSecretKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterClientSecretKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_CLIENT_SECRET_PROD,true)
				}
			}
			if(!lIsOK){
				return lreturn
			}
			lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterRedirectURIKey,lServerURI,true)
			if(!lIsOK){
				return lreturn
			}
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				if(THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterUsernameKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterUsernameKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_PROD,true)
				}
			}else{
				if(IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterUsernameKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterUsernameKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_NAME_PROD,true)
				}
			}
			if(!lIsOK){
				return lreturn
			}
			if(this.ignTestDataCountry==IGNTestDataCountry.Thailand){
				if(THAGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterPasswordKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterPasswordKey,THAGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_PROD,true)
				}
			}else{
				if(IDNGlobalConst.DEFAULT_SALESFORCE_ENDPOINT_IS_UAT){
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterPasswordKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_UAT,true)
				}else{
					lIsOK=IGNUemaHelper.addMapURLRequestParameterKeyValueWithURLEncoded(lMapURLRequestParameter,this.strDefaultRequestParameterPasswordKey,IDNGlobalConst.DEFAULT_SALESFORCE_CREDENTIAL_USER_PASSWORD_PROD,true)
				}
			}
			if(!lIsOK){
				return lreturn
			}
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lServerURI,lSalesforceAPIEndpointPathGetAccessToken,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lLocalDateTimeNow=IGNUemaHelper.getLocalDateTimeCurrent()
			lIsOK=lMapCallRestAPIHTTPPost.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPPost='+lMapCallRestAPIHTTPPost.toString())
				lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lServerURI,lSalesforceAPIEndpointPathGetAccessToken,lMapURLRequestParameter,lListHTTPRequestHeader,'')
				lLocalDateTimeNow=IGNUemaHelper.getLocalDateTimeCurrent()
				lIsOK=lMapCallRestAPIHTTPPost.Result
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPPost='+lMapCallRestAPIHTTPPost.toString())
				if(lMapCallRestAPIHTTPPost.ResultMessage){
					if(lMapCallRestAPIHTTPPost.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPPost.ResultMessage)
					}
				}
				return lreturn
			}
			ResponseObject lResponseObject=lMapCallRestAPIHTTPPost.ResponseObject
			if(!lResponseObject){
				return lreturn
			}
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPPost.ResponseObjectStatusCode
			String lResponseObjectStatusText=lMapCallRestAPIHTTPPost.ResponseObjectStatusText
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPPost.ResponseObjectElapsedTimeNum
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPPost.ResponseObjectElapsedTimeText
			String lResponseObjectResponseText=lMapCallRestAPIHTTPPost.ResponseObjectResponseText
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,lJsonKeyTokenType)
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,lJsonKeyAccessToken)
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,lJsonKeyInstanceURL)
			}
			if(!lIsObjectJsonValid){
				return lreturn
			}
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPPost.MapJsonResponseObject
			if(lMapJsonResponseObject){
				lIsObjectMapReady=lMapJsonResponseObject.containsKey(lJsonKeyTokenType)
				lIsObjectMapReady=lIsObjectMapReady&&lMapJsonResponseObject.containsKey(lJsonKeyAccessToken)
				lIsObjectMapReady=lIsObjectMapReady&&lMapJsonResponseObject.containsKey(lJsonKeyInstanceURL)
			}
			if(!lIsObjectMapReady){
				return lreturn
			}
			this.localDateTimeServerTokenAccess=lLocalDateTimeNow
			lServerTokenType=lMapJsonResponseObject.get(lJsonKeyTokenType).toString()
			lServerAccessToken=lMapJsonResponseObject.get(lJsonKeyAccessToken).toString()
			lServerInstanceURL=lMapJsonResponseObject.get(lJsonKeyInstanceURL).toString()
			this.strServerTokenType=lServerTokenType
			this.strServerAccessToken=lServerAccessToken
			this.strServerInstanceURL=lServerInstanceURL
			lIsOK=lIsObjectMapReady
			lreturn=lIsOK
			if(lIsOK){
				String lStrSalesforceServiceAPIVersionLatest=this.getSalesforceServiceAPIVersionLatest()
				if(!IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrSalesforceServiceAPIVersionLatest)){
					this.strDefaultSalesforceServiceAPIVersion=lStrSalesforceServiceAPIVersionLatest
				}
				IGNUemaHelper.printLog('DefaultSalesforceServiceAPIVersion='+this.strDefaultSalesforceServiceAPIVersion)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceServiceAPIVersionList(){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			List<Map> lListMapSalesforceServiceAPIVersion=new ArrayList<Map>()
			lreturn.put('Result',lResult)
			lreturn.put('ListMapSalesforceServiceAPIVersion',lListMapSalesforceServiceAPIVersion)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			String lSalesforceAPIEndpointPathGetServiceAPIVersion='/services/data'
			Boolean lIsOK=false
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathGetServiceAPIVersion,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lIsOK=lMapCallRestAPIHTTPGet.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathGetServiceAPIVersion,lMapURLRequestParameter,lListHTTPRequestHeader,'')
					lIsOK=lMapCallRestAPIHTTPGet.Result
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				if(lMapCallRestAPIHTTPGet.ResultMessage){
					if(lMapCallRestAPIHTTPGet.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPGet.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPGet.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPGet.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPGet.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPGet.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPGet.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectListMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'label')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'url')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'version')
			}
			if(!lIsObjectJsonValid){
				this.strServerAccessToken=''
				return lreturn
			}
			lListMapSalesforceServiceAPIVersion=lMapCallRestAPIHTTPGet.ListMapJsonResponseObject
			if(lListMapSalesforceServiceAPIVersion){
				lIsObjectListMapReady=lListMapSalesforceServiceAPIVersion.size()
			}
			if(!lIsObjectListMapReady){
				this.strServerAccessToken=''
				return lreturn
			}
			lIsOK=lIsObjectListMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ListMapSalesforceServiceAPIVersion',lListMapSalesforceServiceAPIVersion)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getSalesforceServiceAPIVersionLatest(){
		String lreturn=''
		try{
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			Map lMapGetSalesforceServiceAPIVersionList=this.mapGetSalesforceServiceAPIVersionList()
			if(!lMapGetSalesforceServiceAPIVersionList.Result){
				return lreturn
			}
			List<Map> lListMapSalesforceServiceAPIVersionList=lMapGetSalesforceServiceAPIVersionList.ListMapSalesforceServiceAPIVersion
			if(IGNUemaHelper.checkObjectNullOrEmptyOfList(lListMapSalesforceServiceAPIVersionList)){
				return lreturn
			}
			String lStrVersionDefault=this.strDefaultSalesforceServiceAPIVersion.substring(1,this.strDefaultSalesforceServiceAPIVersion.length()-1)
			Float lNumVersionDefault=IGNUemaHelper.convertStringToFloat(lStrVersionDefault,new Float(0))
			String lStrVersionCurrent=lStrVersionDefault
			Float lNumVersionCurrent=lNumVersionDefault
			String lStrVersionCheck=''
			Float lNumVersionCheck=0
			for(Map lMapSalesforceServiceAPIVersionItem in lListMapSalesforceServiceAPIVersionList){
				lStrVersionCheck=lMapSalesforceServiceAPIVersionItem.version
				if(!IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrVersionCheck)){
					lNumVersionCheck=IGNUemaHelper.convertStringToFloat(lStrVersionCheck,new Float(0))
					if(lNumVersionCheck>lNumVersionCurrent){
						lNumVersionCurrent=lNumVersionCheck
					}
				}
			}
			if(lNumVersionCurrent>lNumVersionDefault){
				lStrVersionCurrent='v'+lNumVersionCurrent.toString()
				lreturn=lStrVersionCurrent
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceServiceAPIVersionAccessLimit(String strSalesforceServiceAPIVersion=this.strDefaultSalesforceServiceAPIVersion){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			String lSalesforceServiceAPIVersion=strSalesforceServiceAPIVersion.trim()
			if(lSalesforceServiceAPIVersion.length()<=0){
				return lreturn
			}
			String lSalesforceAPIEndpointPathCheckAccessLimit='/services/data/'+lSalesforceServiceAPIVersion+'/limits'
			Boolean lIsOK=false
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathCheckAccessLimit,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lIsOK=lMapCallRestAPIHTTPGet.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathCheckAccessLimit,lMapURLRequestParameter,lListHTTPRequestHeader,'')
					lIsOK=lMapCallRestAPIHTTPGet.Result
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				if(lMapCallRestAPIHTTPGet.ResultMessage){
					if(lMapCallRestAPIHTTPGet.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPGet.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPGet.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPGet.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPGet.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPGet.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPGet.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'Max')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'Remaining')
			}
			if(!lIsObjectJsonValid){
				this.strServerAccessToken=''
				return lreturn
			}
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPGet.MapJsonResponseObject
			if(lMapJsonResponseObject){
				lIsObjectMapReady=true
			}
			if(!lIsObjectMapReady){
				this.strServerAccessToken=''
				return lreturn
			}
			lIsOK=lIsObjectMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJsonResponseObject)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceExecuteSOQLQueryFirst(String strSalesforceExecuteSOQLQuery,String strSalesforceServiceAPIVersion=this.strDefaultSalesforceServiceAPIVersion){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			String lSalesforceExecuteSOQLQuery=strSalesforceExecuteSOQLQuery.trim()
			if(lSalesforceExecuteSOQLQuery.length()<=0){
				return lreturn
			}
			String lSalesforceServiceAPIVersion=strSalesforceServiceAPIVersion.trim()
			if(lSalesforceServiceAPIVersion.length()<=0){
				return lreturn
			}
			IGNUemaHelper.printLog('mapGetSalesforceExecuteSOQLQueryFirst:lSalesforceExecuteSOQLQueryBefore='+lSalesforceExecuteSOQLQuery)
			lSalesforceExecuteSOQLQuery=IGNUemaHelper.convertStringToURLEncodedString(lSalesforceExecuteSOQLQuery).trim()
			IGNUemaHelper.printLog('mapGetSalesforceExecuteSOQLQueryFirst:lSalesforceExecuteSOQLQueryAfter='+lSalesforceExecuteSOQLQuery)
			String lSalesforceAPIEndpointPathExecuteSOQLQuery='/services/data/'+lSalesforceServiceAPIVersion+'/query/?q='+lSalesforceExecuteSOQLQuery
			Boolean lIsOK=false
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lIsOK=lMapCallRestAPIHTTPGet.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,'')
					lIsOK=lMapCallRestAPIHTTPGet.Result
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				if(lMapCallRestAPIHTTPGet.ResultMessage){
					if(lMapCallRestAPIHTTPGet.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPGet.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPGet.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPGet.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPGet.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPGet.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPGet.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'totalSize')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'done')
			}
			if(!lIsObjectJsonValid){
				this.strServerAccessToken=''
				return lreturn
			}
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPGet.MapJsonResponseObject
			if(lMapJsonResponseObject){
				lIsObjectMapReady=true
			}
			if(!lIsObjectMapReady){
				this.strServerAccessToken=''
				return lreturn
			}
			lIsOK=lIsObjectMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJsonResponseObject)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceExecuteSOQLQueryNext(String strSalesforceNextRecordURL){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			String lSalesforceNextRecordURL=strSalesforceNextRecordURL.trim()
			if(lSalesforceNextRecordURL.length()<=0){
				return lreturn
			}
			if(!IGNUemaHelper.checkStringContainString(lSalesforceNextRecordURL,'/QUERY/')){
				return lreturn
			}
			IGNUemaHelper.printLog('mapGetSalesforceExecuteSOQLQueryNext:lSalesforceNextRecordURL='+lSalesforceNextRecordURL)
			String lSalesforceAPIEndpointPathExecuteSOQLQuery=lSalesforceNextRecordURL
			Boolean lIsOK=false
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lIsOK=lMapCallRestAPIHTTPGet.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,'')
					lIsOK=lMapCallRestAPIHTTPGet.Result
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				if(lMapCallRestAPIHTTPGet.ResultMessage){
					if(lMapCallRestAPIHTTPGet.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPGet.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPGet.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPGet.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPGet.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPGet.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPGet.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'totalSize')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'done')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'records')
			}
			if(!lIsObjectJsonValid){
				this.strServerAccessToken=''
				return lreturn
			}
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPGet.MapJsonResponseObject
			if(lMapJsonResponseObject){
				lIsObjectMapReady=true
			}
			if(!lIsObjectMapReady){
				this.strServerAccessToken=''
				return lreturn
			}
			lIsOK=lIsObjectMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJsonResponseObject)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Set<String> getSalesforceKeySetFromMapJsonResponseObjectRecord(Map mapJsonResponseObject,Integer numRecordIndex){
		Set<String> lreturn=null
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapJsonResponseObject)){
			return lreturn
		}
		if(numRecordIndex<0){
			return lreturn
		}
		try{
			Integer lNumberOfRecordNum=mapJsonResponseObject.records.size()
			if(numRecordIndex<lNumberOfRecordNum){
				Map lMapJsonRow=mapJsonResponseObject.records[numRecordIndex]
				lreturn=lMapJsonRow.keySet()
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getSalesforceFieldTextFromMapJsonResponseObjectRecord(Map mapJsonResponseObject,Integer numRecordIndex,String strFieldName){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapJsonResponseObject)){
			return lreturn
		}
		if(numRecordIndex<0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strFieldName)){
			return lreturn
		}
		String lFieldName=strFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lFieldName)){
			return lreturn
		}
		try{
			Integer lNumberOfRecordNum=mapJsonResponseObject.records.size()
			if(numRecordIndex<lNumberOfRecordNum){
				Map lMapJsonRow=mapJsonResponseObject.records[numRecordIndex]
				String lFieldValueText=lMapJsonRow.get(lFieldName)
				if(!lFieldValueText){
					lFieldValueText=''
				}
				//lFieldValueText=lFieldValueText.trim()
				lreturn=lFieldValueText
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceObjectFieldNameList(String strSalesforceObjectName){
		Map lreturn=[:]
		try{
			List<String>lListSalesforceObjectFieldName=new ArrayList<String>()
			Boolean lResult=false
			lreturn.put('Result',lResult)
			lreturn.put('ListSalesforceObjectFieldName',lListSalesforceObjectFieldName)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strSalesforceObjectName)){
				return lreturn
			}
			String lStrSalesforceObjectName=strSalesforceObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceObjectName)){
				return lreturn
			}
			String lStrTargetObjectName=''
			Boolean lIsToPreferSelectedFieldName=true
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
			lStrTargetObjectName='FieldDefinition'
			lIsToPreferSelectedFieldName=true
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
			lListFieldNameSelected.add('EntityDefinition.QualifiedApiName')
			lListFieldNameSelected.add('QualifiedApiName')
			lListFieldNameSelected.add('DataType')
			lMapClauseEqualAnd.put('EntityDefinition.QualifiedApiName',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrSalesforceObjectName))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery='ORDER BY QualifiedApiName ASC'
			String lStrSOQLQueryEntityDefinition=IGNUemaHelper.getStringQueryForSelectWhereBuilder(lStrTargetObjectName,lIsToPreferSelectedFieldName,lListFieldNameAll,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			Map lMapGetSalesforceObjectEntityDefinition=[:]
			lMapGetSalesforceObjectEntityDefinition=this.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLQueryEntityDefinition,this.strDefaultSalesforceServiceAPIVersion)
			if(!lMapGetSalesforceObjectEntityDefinition.Result){
				lMapGetSalesforceObjectEntityDefinition=this.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLQueryEntityDefinition,this.strDefaultSalesforceServiceAPIVersion)
			}
			if(!lMapGetSalesforceObjectEntityDefinition.Result){
				return lreturn
			}
			Map lMapJsonEntityDefinition=lMapGetSalesforceObjectEntityDefinition.MapJsonResponseObject
			if(!lMapJsonEntityDefinition){
				return lreturn
			}
			IGNUemaHelper.printLog(lMapGetSalesforceObjectEntityDefinition.ResponseObjectResponseText)
			Integer lNumberOfObjectEntityDefinitionNum=lMapJsonEntityDefinition.records.size()
			if(lNumberOfObjectEntityDefinitionNum<=0){
				return lreturn
			}
			for(Integer lIndex=0;lIndex<lNumberOfObjectEntityDefinitionNum;lIndex++){
				String lStrSalesforceObjectFieldName=this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonEntityDefinition,lIndex,'QualifiedApiName')
				if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceObjectFieldName)){
					lListSalesforceObjectFieldName.add(lStrSalesforceObjectFieldName)
				}
			}
			lResult=lListSalesforceObjectFieldName.size()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ListSalesforceObjectFieldName',lListSalesforceObjectFieldName)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceObjectByQueryParamList(String strTargetSalesforceObjectName,Boolean isToPreferSelectedFieldName,List<String> listFieldNameSelected,String strWhereClause,String strSuffixQuery){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			List<Map> lListMapJsonResponseObject=new ArrayList<Map>()
			List<Map> lListMapSalesforceObjectRecord=new ArrayList<Map>()
			lreturn.put('Result',lResult)
			lreturn.put('ListMapJsonResponseObject',lListMapJsonResponseObject)
			lreturn.put('ListMapSalesforceObjectRecord',lListMapSalesforceObjectRecord)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSalesforceObjectName)){
				return lreturn
			}
			String lStrTargetSalesforceObjectName=strTargetSalesforceObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSalesforceObjectName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(listFieldNameSelected)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strWhereClause)){
				return lreturn
			}
			String lStrWhereClause=strWhereClause.trim()
			if(IGNUemaHelper.checkObjectNullOfObject(strSuffixQuery)){
				return lreturn
			}
			String lStrSuffixQuery=strSuffixQuery.trim()
			Map lMapGetSalesforceObjectFieldNameList=this.mapGetSalesforceObjectFieldNameList(lStrTargetSalesforceObjectName)
			if(!lMapGetSalesforceObjectFieldNameList.Result){
				return lreturn
			}
			List<String> lListSalesforceObjectFieldNameAll=lMapGetSalesforceObjectFieldNameList.ListSalesforceObjectFieldName
			String lStrSOQLQuerySalesforceObject=IGNUemaHelper.getStringQueryForSelectWhereBuilder(lStrTargetSalesforceObjectName,isToPreferSelectedFieldName,lListSalesforceObjectFieldNameAll,listFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			IGNUemaHelper.printLog('lStrSOQLQuerySalesforceObject='+lStrSOQLQuerySalesforceObject)
			if(lStrSOQLQuerySalesforceObject.length()<=0){
			}
			Map lMapGetSalesforceExecuteSOQLQueryFirst=[:]
			lMapGetSalesforceExecuteSOQLQueryFirst=this.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLQuerySalesforceObject,this.strDefaultSalesforceServiceAPIVersion)
			if(!lMapGetSalesforceExecuteSOQLQueryFirst.Result){
				lMapGetSalesforceExecuteSOQLQueryFirst=this.mapGetSalesforceExecuteSOQLQueryFirst(lStrSOQLQuerySalesforceObject,this.strDefaultSalesforceServiceAPIVersion)
			}
			Boolean lIsOK=lMapGetSalesforceExecuteSOQLQueryFirst.Result
			if(lIsOK){
				Map lMapJsonResponseObject00=lMapGetSalesforceExecuteSOQLQueryFirst.MapJsonResponseObject
				lListMapJsonResponseObject.add(lMapJsonResponseObject00)
				IGNUemaHelper.printLog('lMapGetSalesforceExecuteSOQLQueryFirst.ResponseObjectResponseText='+lMapGetSalesforceExecuteSOQLQueryFirst.ResponseObjectResponseText)
				Integer lNumberOfObjectSalesforceExecuteSOQLQueryFirstNum=lMapJsonResponseObject00.records.size()
				if(lNumberOfObjectSalesforceExecuteSOQLQueryFirstNum>0){
					for(Integer lIndex=0;lIndex<=lNumberOfObjectSalesforceExecuteSOQLQueryFirstNum-1;lIndex++){
						Map lMapSalesforceObjectRecord=[:]
						Set<String> lSetSalesforceObjectKeyName=this.getSalesforceKeySetFromMapJsonResponseObjectRecord(lMapJsonResponseObject00,lIndex)
						if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetSalesforceObjectKeyName)){
							lIsOK=false
							break
						}
						for(String lStrSalesforceFieldName in lSetSalesforceObjectKeyName){
							lMapSalesforceObjectRecord.put(lStrSalesforceFieldName,this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonResponseObject00,lIndex,lStrSalesforceFieldName))
						}
						lListMapSalesforceObjectRecord.add(lMapSalesforceObjectRecord)
					}
					String lStrNextRecordUrl00=lMapJsonResponseObject00.nextRecordsUrl
					if(!IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrNextRecordUrl00)){
						Boolean lIsFetchNext=true
						while(lIsFetchNext){
							Map lMapGetSalesforceExecuteSOQLQueryNext=[:]
							lMapGetSalesforceExecuteSOQLQueryNext=this.mapGetSalesforceExecuteSOQLQueryNext(lStrNextRecordUrl00)
							if(!lMapGetSalesforceExecuteSOQLQueryNext.Result){
								lMapGetSalesforceExecuteSOQLQueryNext=this.mapGetSalesforceExecuteSOQLQueryNext(lStrNextRecordUrl00)
							}
							lIsOK=lMapGetSalesforceExecuteSOQLQueryNext.Result
							if(!lIsOK){
								break
							}
							Map lMapJsonResponseObjectNext=lMapGetSalesforceExecuteSOQLQueryNext.MapJsonResponseObject
							lListMapJsonResponseObject.add(lMapJsonResponseObjectNext)
							IGNUemaHelper.printLog('lMapGetSalesforceExecuteSOQLQueryNext.ResponseObjectResponseText='+lMapGetSalesforceExecuteSOQLQueryNext.ResponseObjectResponseText)
							Integer lNumberOfObjectSalesforceExecuteSOQLQueryNextNum=lMapJsonResponseObjectNext.records.size()
							if(lNumberOfObjectSalesforceExecuteSOQLQueryFirstNum>0){
								for(Integer lIndex=0;lIndex<=lNumberOfObjectSalesforceExecuteSOQLQueryNextNum-1;lIndex++){
									Map lMapSalesforceObjectRecord=[:]
									Set<String> lSetSalesforceObjectKeyName=this.getSalesforceKeySetFromMapJsonResponseObjectRecord(lMapJsonResponseObjectNext,lIndex)
									if(IGNUemaHelper.checkObjectNullOrEmptyOfSet(lSetSalesforceObjectKeyName)){
										lIsOK=false
										break
									}
									for(String lStrSalesforceFieldName in lSetSalesforceObjectKeyName){
										lMapSalesforceObjectRecord.put(lStrSalesforceFieldName,this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonResponseObjectNext,lIndex,lStrSalesforceFieldName))
									}
									lListMapSalesforceObjectRecord.add(lMapSalesforceObjectRecord)
								}
							}
							if(!lIsOK){
								lIsFetchNext=false
								break
							}
							lStrNextRecordUrl00=lMapJsonResponseObjectNext.nextRecordsUrl
							if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrNextRecordUrl00)){
								lIsFetchNext=false
								break
							}
						}
					}
				}
			}
			lResult=lIsOK
			if(!lIsOK){
				lreturn.put('Result',lResult)
				lreturn.put('ListMapJsonResponseObject',lListMapJsonResponseObject)
				lreturn.put('ListMapSalesforceObjectRecord',lListMapSalesforceObjectRecord)
			}
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('ListMapJsonResponseObject',lListMapJsonResponseObject)
				lreturn.put('ListMapSalesforceObjectRecord',lListMapSalesforceObjectRecord)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapUpdateSalesforceObjectByQueryParamList(String strTargetSalesforceObjectName,String strTargetSalesforceRecordId,Map mapFieldNameValueUpdated){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSalesforceObjectName)){
				return lreturn
			}
			String lStrTargetSalesforceObjectName=strTargetSalesforceObjectName.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSalesforceObjectName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(strTargetSalesforceRecordId)){
				return lreturn
			}
			String lStrTargetSalesforceRecordId=strTargetSalesforceRecordId.trim()
			if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSalesforceRecordId)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapFieldNameValueUpdated)){
				return lreturn
			}
			Map lMapFieldNameValueUpdated=[:]
			for(Map.Entry lEntryItem in mapFieldNameValueUpdated){
				String lStrItemKey=lEntryItem.key.toString().trim()
				if(lStrItemKey.length()>0){
					if(!lStrItemKey.equalsIgnoreCase('Id')){
						lMapFieldNameValueUpdated.put(lStrItemKey,lEntryItem.value)
					}
				}
			}
			if(IGNUemaHelper.checkObjectEmptyOfMap(lMapFieldNameValueUpdated)){
				return lreturn
			}
			Map lMapGetSalesforceObjectFieldNameList=this.mapGetSalesforceObjectFieldNameList(lStrTargetSalesforceObjectName)
			if(!lMapGetSalesforceObjectFieldNameList.Result){
				return lreturn
			}
			List<String> lListSalesforceObjectFieldNameAll=lMapGetSalesforceObjectFieldNameList.ListSalesforceObjectFieldName
			Boolean lIsFieldNameValid=true
			for(Map.Entry lEntryItem in lMapFieldNameValueUpdated){
				String lStrItemKey=lEntryItem.key.toString().trim()
				if(lStrItemKey.length()>0){
					if(!IGNUemaHelper.checkListContainStringCaseInsensitive(lListSalesforceObjectFieldNameAll,lStrItemKey)){
						lIsFieldNameValid=false
						break
					}
				}else{
					lIsFieldNameValid=false
					break
				}
			}
			if(!lIsFieldNameValid){
				return lreturn
			}
			String lStrTargetObjectName=''
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
			lStrTargetObjectName=lStrTargetSalesforceObjectName
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
			lListFieldNameSelected.add('Id')
			lMapClauseEqualAnd.put('Id',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lStrTargetSalesforceRecordId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			String lStrSOQLQuerySalesforceObject=IGNUemaHelper.getStringQueryForSelectWhereBuilder(lStrTargetObjectName,lIsToPreferSelectedFieldName,lListFieldNameAll,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			IGNUemaHelper.printLog('lStrSOQLQuerySalesforceObject='+lStrSOQLQuerySalesforceObject)
			if(lStrSOQLQuerySalesforceObject.length()<=0){
			}
			Map lMapGetSalesforceObjectForSelect=[:]
			lMapGetSalesforceObjectForSelect=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectForSelect.Result){
				lMapGetSalesforceObjectForSelect=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectForSelect.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectForSelect=lMapGetSalesforceObjectForSelect.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectForSelect.size()<=0){
				return lreturn
			}
			Map lMapJsonForSelect=lListMapJsonGetSalesforceObjectForSelect[0]
			if(!lMapJsonForSelect){
				return lreturn
			}
			Integer lNumberOfObjectForSelectNum=lMapJsonForSelect.records.size()
			if(lNumberOfObjectForSelectNum<=0){
				return lreturn
			}
			String lStrSalesforceRecordId=this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonForSelect,0,'Id')
			if(lStrSalesforceRecordId.length()<=0){
				return lreturn
			}
			if(!lStrTargetSalesforceRecordId.equalsIgnoreCase(lStrSalesforceRecordId)){
				return lreturn
			}
			Boolean lIsOK=false
			JSONObject lJSONObjectRequestBody=new JSONObject(lMapFieldNameValueUpdated)
			String lStrSalesforceRecordIdEncoded=IGNUemaHelper.convertStringToURLEncodedString(lStrSalesforceRecordId).trim()
			String lStrSalesforceAPIEndpointPathExecuteSOQLQuery='/services/data/'+this.strDefaultSalesforceServiceAPIVersion+'/sobjects/'+lStrTargetSalesforceObjectName+'/'+lStrSalesforceRecordId
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lHTTPRequestBodyContent=lJSONObjectRequestBody.toString()
			Map lMapCallRestAPIHTTPPatch=this.mapCallRestAPIHTTPPatch(lServerURI,lStrSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,lHTTPRequestBodyContent)
			String lCallRestAPIHTTPPatchResponseObjectStatusCode=lMapCallRestAPIHTTPPatch.ResponseObjectStatusCode.toString().trim()
			Boolean lIsResponseStatusCodeSuccess=lCallRestAPIHTTPPatchResponseObjectStatusCode.equalsIgnoreCase('204')
			lIsOK=lIsResponseStatusCodeSuccess
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPPatch='+lMapCallRestAPIHTTPPatch.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lHTTPRequestBodyContent=lJSONObjectRequestBody.toString()
					lMapCallRestAPIHTTPPatch=this.mapCallRestAPIHTTPPatch(lServerURI,lStrSalesforceAPIEndpointPathExecuteSOQLQuery,lMapURLRequestParameter,lListHTTPRequestHeader,lHTTPRequestBodyContent)
					lCallRestAPIHTTPPatchResponseObjectStatusCode=lMapCallRestAPIHTTPPatch.ResponseObjectStatusCode.toString().trim()
					lIsResponseStatusCodeSuccess=lCallRestAPIHTTPPatchResponseObjectStatusCode.equalsIgnoreCase('204')
					lIsOK=lIsResponseStatusCodeSuccess
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPPatch='+lMapCallRestAPIHTTPPatch.toString())
				if(lMapCallRestAPIHTTPPatch.ResultMessage){
					if(lMapCallRestAPIHTTPPatch.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPPatch.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPPatch.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPPatch.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPPatch.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPPatch.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPPatch.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPPatch.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPPatch.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=(lResponseObjectStatusCode==204)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Set<String> getSalesforceKeySetFromMapJsonResponseObjectSObject(Map mapJsonResponseObject,Integer numRecordIndex){
		Set<String> lreturn=null
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapJsonResponseObject)){
			return lreturn
		}
		if(numRecordIndex<0){
			return lreturn
		}
		try{
			Integer lNumberOfRecordNum=mapJsonResponseObject.sobjects.size()
			if(numRecordIndex<lNumberOfRecordNum){
				Map lMapJsonRow=mapJsonResponseObject.sobjects[numRecordIndex]
				lreturn=lMapJsonRow.keySet()
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getSalesforceFieldTextFromMapJsonResponseObjectSObject(Map mapJsonResponseObject,Integer numRecordIndex,String strFieldName){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(mapJsonResponseObject)){
			return lreturn
		}
		if(numRecordIndex<0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strFieldName)){
			return lreturn
		}
		String lFieldName=strFieldName.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lFieldName)){
			return lreturn
		}
		try{
			Integer lNumberOfRecordNum=mapJsonResponseObject.sobjects.size()
			if(numRecordIndex<lNumberOfRecordNum){
				Map lMapJsonRow=mapJsonResponseObject.sobjects[numRecordIndex]
				String lFieldValueText=lMapJsonRow.get(lFieldName)
				if(!lFieldValueText){
					lFieldValueText=''
				}
				//lFieldValueText=lFieldValueText.trim()
				lreturn=lFieldValueText
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceDescribeGlobalObjectList(String strSalesforceServiceAPIVersion=this.strDefaultSalesforceServiceAPIVersion){
		Map lreturn=[:]
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			String lSalesforceServiceAPIVersion=strSalesforceServiceAPIVersion.trim()
			if(lSalesforceServiceAPIVersion.length()<=0){
				return lreturn
			}
			String lSalesforceAPIEndpointPathDescribeGlobalObject='/services/data/'+lSalesforceServiceAPIVersion+'/sobjects'
			Boolean lIsOK=false
			String lServerURI=this.strServerInstanceURL
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			Map lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathDescribeGlobalObject,lMapURLRequestParameter,lListHTTPRequestHeader,'')
			lIsOK=lMapCallRestAPIHTTPGet.Result
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				this.strServerAccessToken=''
				if(this.checkSalesforceServerGetAccessToken()){
					lListHTTPRequestHeader.clear()
					lHTTPRequestHeaderItem=null
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lRequestHeaderAuthorizationValue=IGNUemaHelper.getAuthorizationTokenString(this.strServerTokenType,this.strServerAccessToken)
					lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderAuthorizationKey,ConditionType.EQUALS,lRequestHeaderAuthorizationValue)
					lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
					lMapCallRestAPIHTTPGet=this.mapCallRestAPIHTTPGet(lServerURI,lSalesforceAPIEndpointPathDescribeGlobalObject,lMapURLRequestParameter,lListHTTPRequestHeader,'')
					lIsOK=lMapCallRestAPIHTTPGet.Result
				}
			}
			if(!lIsOK){
				IGNUemaHelper.printLog('Failed:lMapCallRestAPIHTTPGet='+lMapCallRestAPIHTTPGet.toString())
				if(lMapCallRestAPIHTTPGet.ResultMessage){
					if(lMapCallRestAPIHTTPGet.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPGet.ResultMessage)
					}
				}
				this.strServerAccessToken=''
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPGet.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPGet.ResponseObject
			if(!lResponseObject){
				this.strServerAccessToken=''
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPGet.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPGet.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPGet.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPGet.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lIsOK=this.CONST_HTTP_STATUS_SUCCESS_LIST.contains(lResponseObjectStatusCode)
			if(!lIsOK){
				this.strServerAccessToken=''
				return lreturn
			}
			Boolean lIsObjectJsonValid=false
			Boolean lIsObjectMapReady=false
			lIsObjectJsonValid=lResponseObjectResponseText.length()>0
			if(lIsObjectJsonValid){
				lIsObjectJsonValid=IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'encoding')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'maxBatchSize')
				lIsObjectJsonValid=lIsObjectJsonValid&&IGNUemaHelper.checkStringContainString(lResponseObjectResponseText,'sobjects')
			}
			if(!lIsObjectJsonValid){
				this.strServerAccessToken=''
				return lreturn
			}
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPGet.MapJsonResponseObject
			if(lMapJsonResponseObject){
				lIsObjectMapReady=true
			}
			if(!lIsObjectMapReady){
				this.strServerAccessToken=''
				return lreturn
			}
			lIsOK=lIsObjectMapReady
			lResult=lIsOK
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapJsonResponseObject',lMapJsonResponseObject)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceDescribeGlobalObjectPrefix(){
		Map lreturn=[:]
		try{
			Map lMapSalesforceDescribeGlobalObjectPrefix=[:]
			Boolean lResult=false
			lreturn.put('Result',lResult)
			lreturn.put('MapSalesforceDescribeGlobalObjectPrefix',lMapSalesforceDescribeGlobalObjectPrefix)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(!this.checkSalesforceServerGetAccessToken()){
				if(!this.checkSalesforceServerGetAccessToken()){
					return lreturn
				}
			}
			Map lMapGetSalesforceDescribeGlobalObjectList=this.mapGetSalesforceDescribeGlobalObjectList(this.strDefaultSalesforceServiceAPIVersion)
			if(!lMapGetSalesforceDescribeGlobalObjectList.Result){
				lMapGetSalesforceDescribeGlobalObjectList=this.mapGetSalesforceDescribeGlobalObjectList(this.strDefaultSalesforceServiceAPIVersion)
			}
			if(!lMapGetSalesforceDescribeGlobalObjectList.Result){
				return lreturn
			}
			Map lMapJsonSalesforceDescribeGlobalObjectList=lMapGetSalesforceDescribeGlobalObjectList.MapJsonResponseObject
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapJsonSalesforceDescribeGlobalObjectList)){
				return lreturn
			}
			IGNUemaHelper.printLog(lMapGetSalesforceDescribeGlobalObjectList.ResponseObjectResponseText)
			Integer lNumberOfObjectSalesforceDescribeGlobalObjectListNum=lMapJsonSalesforceDescribeGlobalObjectList.sobjects.size()
			if(lNumberOfObjectSalesforceDescribeGlobalObjectListNum<=0){
				return lreturn
			}
			for(Integer lIndex=0;lIndex<lNumberOfObjectSalesforceDescribeGlobalObjectListNum;lIndex++){
				String lStrSalesforceDescribeGlobalObjectPrefix=this.getSalesforceFieldTextFromMapJsonResponseObjectSObject(lMapJsonSalesforceDescribeGlobalObjectList,lIndex,'keyPrefix')
				String lStrSalesforceDescribeGlobalObjectName=this.getSalesforceFieldTextFromMapJsonResponseObjectSObject(lMapJsonSalesforceDescribeGlobalObjectList,lIndex,'label')
				if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceDescribeGlobalObjectName)){
					if(!IGNUemaHelper.checkObjectEmptyOfString(lStrSalesforceDescribeGlobalObjectPrefix)){
						lMapSalesforceDescribeGlobalObjectPrefix.put(lStrSalesforceDescribeGlobalObjectPrefix,lStrSalesforceDescribeGlobalObjectName)
					}
				}
			}
			lResult=lMapSalesforceDescribeGlobalObjectPrefix.size()>0
			if(lResult){
				lreturn.put('Result',lResult)
				lreturn.put('MapSalesforceDescribeGlobalObjectPrefix',lMapSalesforceDescribeGlobalObjectPrefix)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static String getSalesforceObjectNameFromSalesforceRecordId(String strTargetSalesforceRecordId){
		String lreturn=''
		if(IGNUemaHelper.checkObjectNullOfObject(strTargetSalesforceRecordId)){
			return lreturn
		}
		String lStrTargetSalesforceRecordId=strTargetSalesforceRecordId.trim()
		if(IGNUemaHelper.checkObjectEmptyOfString(lStrTargetSalesforceRecordId)){
			return lreturn
		}
		if(lStrTargetSalesforceRecordId.length()<=3){
			return lreturn
		}
		try{
			String lStrSalesforceRecordIdPrefix=lStrTargetSalesforceRecordId.substring(0,3)
			Map lMapGetSalesforceDescribeGlobalObjectPrefix=this.mapGetSalesforceDescribeGlobalObjectPrefix()
			if(!lMapGetSalesforceDescribeGlobalObjectPrefix.Result){
				return lreturn
			}
			Map lMapSalesforceDescribeGlobalObjectPrefix=lMapGetSalesforceDescribeGlobalObjectPrefix.MapSalesforceDescribeGlobalObjectPrefix
			if(IGNUemaHelper.checkObjectNullOrEmptyOfMap(lMapSalesforceDescribeGlobalObjectPrefix)){
				return lreturn
			}
			String lSalesforceObjectName=lMapSalesforceDescribeGlobalObjectPrefix.get(lStrSalesforceRecordIdPrefix)
			if(!IGNUemaHelper.checkObjectNullOrEmptyOfString(lSalesforceObjectName)){
				lreturn=lSalesforceObjectName
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(String strOpportunityNumber,Map mapCaseOutput){
		Map lreturn=[:]
		String lOpportunityNumber=strOpportunityNumber.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(lOpportunityNumber.length()<=0){
				return lreturn
			}
			if(!mapCaseOutput){
				//return lreturn
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
			lStrTargetSalesforceObjectName='Opportunity'
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
			lMapClauseEqualAnd.put('Name',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lOpportunityNumber))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectOpportunity=[:]
			lMapGetSalesforceObjectOpportunity=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectOpportunity.Result){
				lMapGetSalesforceObjectOpportunity=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectOpportunity.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectOpportunity=lMapGetSalesforceObjectOpportunity.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectOpportunity.size()<=0){
				return lreturn
			}
			Map lMapJsonOpportunity=lListMapJsonGetSalesforceObjectOpportunity[0]
			if(!lMapJsonOpportunity){
				return lreturn
			}
			Integer lNumberOfObjectOpportunityNum=lMapJsonOpportunity.records.size()
			if(lNumberOfObjectOpportunityNum<=0){
				return lreturn
			}
			String lSyncedQuoteId=this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'SyncedQuoteId')
			if(lSyncedQuoteId.length()<=0){
				return lreturn
			}
			lStrTargetSalesforceObjectName='Quote'
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
			lMapClauseEqualAnd.put('Id',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lSyncedQuoteId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectTransactionSynced=[:]
			lMapGetSalesforceObjectTransactionSynced=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectTransactionSynced.Result){
				lMapGetSalesforceObjectTransactionSynced=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectTransactionSynced.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectTransactionSynced=lMapGetSalesforceObjectTransactionSynced.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectTransactionSynced.size()<=0){
				return lreturn
			}
			Map lMapJsonTransactionSynced=lListMapJsonGetSalesforceObjectTransactionSynced[0]
			if(!lMapJsonTransactionSynced){
				return lreturn
			}
			Integer lNumberOfObjectTransactionSyncedNum=lMapJsonTransactionSynced.records.size()
			if(lNumberOfObjectTransactionSyncedNum<=0){
				return lreturn
			}
			lStrTargetSalesforceObjectName='QuoteLineItem'
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
			lMapClauseEqualAnd.put('QuoteId',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lSyncedQuoteId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectQuoteLineItem=[:]
			lMapGetSalesforceObjectQuoteLineItem=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectQuoteLineItem.Result){
				lMapGetSalesforceObjectQuoteLineItem=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectQuoteLineItem.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectQuoteLineItem=lMapGetSalesforceObjectQuoteLineItem.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectQuoteLineItem.size()<=0){
				return lreturn
			}
			Map lMapJsonQuoteLineItem=lListMapJsonGetSalesforceObjectQuoteLineItem[0]
			if(!lMapJsonQuoteLineItem){
				return lreturn
			}
			Integer lNumberOfObjectQuoteLineItemNum=lMapJsonQuoteLineItem.records.size()
			if(lNumberOfObjectQuoteLineItemNum<=0){
				return lreturn
			}
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjName',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Name'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSyncedquoteid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'SyncedQuoteId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAccountFirstNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Account_First_name__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAccountid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'AccountId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAmount',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Amount'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAmountBasedOnLyPaymentFrequencyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Amount_Based_on_LY_Payment_Frequency__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAmountVsPaymentsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Amount_VS_Payments__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjApprovalStatusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Approval_Status__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAssetC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Asset__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAutoRenewDownpaymentAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Auto_Renew_Downpayment_Amount__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAutoRenewalDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Auto_Renewal_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjAwsconnectqueuesetupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'AWSConnectQueueSetup__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjBuddistAutoRenewalDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Buddist_Auto_Renewal_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjBuddistClosedDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Buddist_Closed_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjBuddistCreateDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Buddist_Create_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCallMeBackC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Call_me_back__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCallMeBackRequestC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Call_Me_Back_Request__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCampaignid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'CampaignId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCarPlateNoFromAssetsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Car_plate_no_from_Assets__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjChassisNoFromAssetsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Chassis_No_from_Assets__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCloseDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Close_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjClosedDateEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Closed_date_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjClosedate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'CloseDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjContactid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ContactId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjContactidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ContactId__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjContractNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Contract_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjContractid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ContractId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjConversionIndicatorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Conversion_Indicator__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreateDateEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Create_Date_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreateDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Create_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreatedFromC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Created_From__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreatedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'CreatedById'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreateddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'CreatedDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCreditCardsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Credit_cards__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCustomerKeyDecisionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Customer_Key_decision__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjCustomerRatingUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Customer_Rating_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDbCompetitorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'DB_Competitor__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDepositTcEnPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Deposit_TC_EN_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDepositTcThPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Deposit_TC_TH_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDescription',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Description'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDisclaimerHeaderC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Disclaimer_Header__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDiscrepancyAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Discrepancy_Amount__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDonotcallC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'DoNotCall__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDueDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Due_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjDuplicateOpportunityC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Duplicate_Opportunity__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEligibleForRewardC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Eligible_For_Reward__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEmailFromAccountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Email_from_Account__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEncryptedOpportunityIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Encrypted_Opportunity_Id__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEncryptedQuoteNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Encrypted_Quote_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'End_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEndorseEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Endorse_Effective_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEndorsementCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Endorsement_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjEpolicydocumentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ePolicyDocument__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjExternalidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ExternalID__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFeefoUrlSplit1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Feefo_URL_Split_1__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFeefoUrlSplit2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Feefo_URL_Split_2__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFeefoUrlSplit3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Feefo_URL_Split_3__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFirstPaymentDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'First_Payment_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFirstquoteemailsentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'FirstquoteEmailSent__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFiscal',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Fiscal'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFiscalquarter',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'FiscalQuarter'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFiscalyear',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'FiscalYear'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagArchiveAnonymousOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Archive_Anonymous_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagArchiveUnusedOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Archive_Unused_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagAutoRenewalC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Auto_Renewal__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagAutoRenewalFailedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Auto_Renewal_Failed__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagInspectionCompleteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Inspection_Complete__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagInsurerChangedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Insurer_Changed__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFlagRenewalByMessageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Flag_Renewal_By_Message__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjFollowUpCreatedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Follow_up_created__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjForecastcategory',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ForecastCategory'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjForecastcategoryname',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ForecastCategoryName'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjGamarketeerlinkC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'GAMarketeerlink__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjGclidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'GCLID__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjGiftC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Gift__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjHasopenactivity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'HasOpenActivity'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjHasopportunitylineitem',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'HasOpportunityLineItem'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjHasoverduetask',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'HasOverdueTask'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjHerokuExternalIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Heroku_External_ID__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjId',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Id'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIfOthersSpecifyOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'If_Others_specify_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjInstalmentPeriodOfferC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Instalment_period_offer__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjInsurerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Insurer__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjInteraccountsourceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'InterAccountSource__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjInterestC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Interest__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIntermediaryAccountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Intermediary_Account__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIntermediaryCommissionPercentageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Intermediary_commission_percentage__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIntermediaryEmail1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Intermediary_Email1__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIntermediaryEmailC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Intermediary_Email__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIntermediaryRepC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Intermediary_Rep__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsGroundAgentWelcomeCallC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_Ground_Agent_Welcome_Call__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsInvitedAgainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_Invited_Again__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsNotWebUserC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_not_web_user__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsPaidOnlineC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_Paid_Online__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsQuoteValidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_Quote_Valid__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsRenewedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_Renewed__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsWebUserC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Is_web_user__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsclosed',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'IsClosed'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIsdeleted',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'IsDeleted'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjIswon',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'IsWon'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastModifiedDateTodayC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Last_Modified_Date_today__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastactivitydate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastActivityDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastamountchangedhistoryid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastAmountChangedHistoryId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastclosedatechangedhistoryid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastCloseDateChangedHistoryId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastmodifiedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastModifiedById'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastmodifieddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastModifiedDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastreferenceddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastReferencedDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLaststagechangedate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastStageChangeDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLastvieweddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LastViewedDate'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLatestNonTransactedQuoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Latest_Non_Transacted_Quote__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLatestTransactedQuoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Latest_Transacted_Quote__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjLeadsource',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'LeadSource'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMakeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Make__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMobile1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Mobile1__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMobileC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Mobile__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjModelDescriptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Model_description__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjModelFamilyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Model_Family__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMonthlyInstallmentCount11PrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Monthly_Installment_Count_11_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMonthlyInstallmentCount12PrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Monthly_Installment_Count_12_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMonthlyInstallmentCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Monthly_Installment_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMonthlyInstallmentCountPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Monthly_Installment_Count_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjMrkumkaOnlineUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'MrKumka_Online_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjNewContractC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'New_Contract__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjNextstep',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'NextStep'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjNonCardPaymentUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Non_Card_Payment_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOnlinePmntFailureFollowupTimeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Online_Pmnt_Failure_Followup_time__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOnlineScreenC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Online_Screen__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOnlineStageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Online_Stage__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOppFollowUpTaskCounterC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Opp_Follow_Up_Task_Counter__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOppNameCheckC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Opp_Name_Check__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOppNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Opp_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOppPayOnlineUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Opp_Pay_Online_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOptionSelectionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Option_selection__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOutstandingBalanceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Outstanding_Balance__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjOwnerid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'OwnerId'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPaidToDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Paid_to_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPayOnlineTriggerTimeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Pay_online_trigger_time__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPayOnlineUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Pay_Online_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPaymentDecisionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Payment_Decision__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPaymentFrequencyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Payment_Frequency__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPaymentInitiatedFromSfC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Payment_Initiated_from_SF__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPaymentMethodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Payment_Method__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPlanTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Plan_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyBuddhistStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_Buddhist_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_Gross_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_Net_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyOfferDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_offer_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyOfferDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_offer_date_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyOfferDatePrintEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_offer_date_print_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_start_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPolicyWordingHeaderC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Policy_Wording_Header__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPreferredLanguageFromAccountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Preferred_Language_from_Account__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPremiumVsPaymentsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Premium_VS_Payments__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPreviousPaymentFrequencyAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Previous_Payment_Frequency_Amount__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPricebook2Id',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Pricebook2Id'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProbability',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Probability'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProbabilityConversionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Probability_conversion__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProductNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Product_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProductTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Product_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPromoCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Promo_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProofincomeuploadedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'ProofIncomeUploaded__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProspectInvitedAgainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Prospect_Invited_Again__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjProspectTentativeStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Prospect_Tentative_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjPushcount',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'PushCount'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjQuoteAccessUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Quote_Access_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjQuoteInviteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Quote_Invite__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReadyForPrintingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Ready_For_Printing__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReasonC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Reason__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRecalculateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Recalculate__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReferralAccountNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Referral_Account_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReferralContractC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Referral_Contract__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReferralContractNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Referral_Contract_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRegenerateCallFileC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Regenerate_Call_File__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRenewalCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Renewal_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRenewalDueFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Renewal_Due_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRenewalRemindTriggerTimeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Renewal_Remind_trigger_time__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRenewurlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'RenewURL__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReservePaymentDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Reserve_Payment_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReviewReasonC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Review_Reason__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjReviewRequiredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Review_Required__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRewardPointsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Reward_Points__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRsdocRsDocumentErrorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'rsdoc__RS_Document_Error__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjRsdocRsDocumentToMergeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'rsdoc__RS_Document_to_Merge__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjS4SteoTransferringHistoryC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'S4STEO__Transferring_History__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSelectedCoverageOptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Selected_Coverage_Option__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSelectedOptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Selected_Option__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSendEmailC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Send_Email__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSendEmailFlagFromQuoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Send_email_Flag_from_Quote__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSmRatingFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'SM_Rating_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjStagename',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'StageName'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSyncedTransactionIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'synced_Transaction_Id__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjSystemmodstamp',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'SystemModstamp'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjTransactedDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Transacted_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjTransactedPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Transacted_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjTransactedQuoteIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Transacted_Quote_Id__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjType',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Type'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjUnirixDeeplinkFinalC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Unirix_deeplink_Final__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjUpdateoppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'UPDATEOPP__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjVhcCallfileC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'vhc__CallFile__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjVocalcomC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'VocalCom__c'))
			mapCaseOutput.put('SalesforceVerifyDataOpportunityObjWonDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'Won_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAbTestingVersionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AB_Testing_Version__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAbsDeductibleAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Abs_Deductible_amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccessoriesReferPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Accessories_refer_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccidentsInTheLast12MnthsMainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Accidents_in_the_last_12_mnths_main__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccidentsInTheLast12MnthsMainThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Accidents_in_the_last_12_mnths_main_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccidentsInTheLast12MonthsYoungC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Accidents_in_the_last_12_Months_Young__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccidentsInTheLast3YearsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Accidents_in_the_last_3_years__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccountNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Account_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccountSourceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Account_Source__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccountid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AccountId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAccountsourceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AccountSource__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddPremCollectFirstPaymentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Add_Prem_Collect_First_Payment__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddPremiumPaMedEexpenseC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Add_Premium_PA_Med_Eexpense__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumPlanDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_plan_driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumPlanDriverDescC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_plan_driver_desc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumPlanDriverDescThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_plan_driver_desc_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumWsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_ws__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumWsDescC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_ws_desc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAddendumWsDescThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Addendum_ws_desc_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalBenefitPaMeSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Additional_Benefit_PA_ME_SI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionaladdress',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalAddress'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalcity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalCity'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalcountry',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalCountry'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalgeocodeaccuracy',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalGeocodeAccuracy'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionallatitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalLatitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionallongitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalLongitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalname',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalName'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalpostalcode',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalPostalCode'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalstate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalState'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdditionalstreet',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'AdditionalStreet'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAdjustedVehicleSumInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Adjusted_vehicle_Sum_Insured__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAgeMainDriverFromDobC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Age_Main_Driver_From_DOB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAgeMaindC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Age_MainD__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAgeYoungdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Age_youngD__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAgreementDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Agreement_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAgreementDateTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Agreement_Date_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAnnualGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Annual_Gross_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAnnualProductPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Annual_Product_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjApprovalStatusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Approval_Status__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjApprovedBizExceptionCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Approved_Biz_Exception_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAreYouSureYouWantToChangeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Are_you_sure_you_want_to_change__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAssetC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Asset__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAtFaultClaimReportedCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'At_Fault_Claim_Reported_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAtFaultClaimReportedCountPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'At_Fault_Claim_Reported_Count_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAuthorityLimitC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Authority_limit__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjAutoPrintDocumentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Auto_Print_Document__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBaPolicyEndorseIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ba_policy_endorse_id__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBarcodeNoC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Barcode_No__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBarcodeNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Barcode_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillPaymentBarCodeImgC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Bill_Payment_Bar_Code_Img__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingaddress',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingAddress'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingcity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingCity'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingcountry',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingCountry'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillinggeocodeaccuracy',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingGeocodeAccuracy'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillinglatitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingLatitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillinglongitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingLongitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingname',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingName'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingpostalcode',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingPostalCode'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingstate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingState'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBillingstreet',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'BillingStreet'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBizValidationCodesC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Biz_Validation_Codes__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBizValidationExistsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Biz_Validation_Exists__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBizValidationsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Biz_Validations__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBlankC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Blank__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBodyTypeEnglishDesc1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Body_Type_English_Desc1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBodyTypeEnglishDescC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Body_Type_English_Desc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBodyTypeThaiDesc1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Body_Type_Thai_Desc1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBodyTypeThaiDescC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Body_Type_Thai_Desc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistCurrentDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Current_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistCurrentDateTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Current_Date_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_End_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistEndorsedEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Endorsed_Effective_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistEndorsedEffectiveDateTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Endorsed_Effective_Date_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistEndorsedEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Endorsed_End_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistLastModifiedDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Last_Modified_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistMainDobC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Main_DOB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistStartDateTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Start_Date_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBuddistTransactedDateTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Buddist_Transacted_Date_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjBusinessExceptionCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Business_Exception_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCallMeBackC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Call_Me_Back__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCancellationMethodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Cancellation_method__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCancreatequotelineitems',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'CanCreateQuoteLineItems'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarAccessoriesSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Accessories_SI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarAccessoriessiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_AccessoriesSI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarAgeTariffC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_age_tariff__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarCameraInstalledC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Camera_Installed__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarCameraInstalledDescThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Camera_Installed_Desc_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarFinancingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_financing__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarInspectionFormulaC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Inspection_Formula__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarInspectionMethodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_inspection_method__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarInspectionRequiredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_inspection_required__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarPlateNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_plate_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarPlateOrChassisNoMissingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Plate_or_Chassis_No_Missing__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarPlateProvinceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Plate_Province__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarReplacementPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Replacement_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarReplacementPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Replacement_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCarSegmentGroupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Car_Segment_Group__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjChassisNoMissingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Chassis_No_missing__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjChassisNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Chassis_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjClaimLossRatioAtRenewalC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Claim_Loss_Ratio_At_Renewal__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCloneSourceIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Clone_Source_Id__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCndnSiRenewC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'CNDN_SI_Renew__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCommercialVehicleC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'commercial_vehicle__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompTpDismembermentDocPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Comp_TP_dismemberment_doc_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompTpDismembermentQuotePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Comp_TP_dismemberment_quote_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompTpPermanentDisabilityDocPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Comp_TP_Permanent_Disability_doc_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompTpPermanentDisabilityQuotePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Comp_TP_Permanent_Disability_quote_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompTpTotaloflossDocPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Comp_TP_TotalOfLoss_doc_print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryBarCodeUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Bar_Code_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryBarcode1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Barcode1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryBarcodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Barcode__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryFollowupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Followup__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryPresentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Present__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryPresentPrintEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_present_print_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryPresentPrintThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_present_print_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryQuoteLineItemC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Quote_Line_Item__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryStartDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Start_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryStartDatePrintTextC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Start_Date_Print_Text__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryType1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Type1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCompulsoryTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Compulsory_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContactid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ContactId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContractNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Contract_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContractNoLinkC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Contract_no_link__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContractNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Contract_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContractPresentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Contract_Present__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjContractid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ContractId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCopyPhAccountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Copy_PH_Account__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCoverPlanOverwriteFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Cover_Plan_Overwrite_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCreatedFromC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Created_From__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCreatedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'CreatedById'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCreateddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'CreatedDate'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCurrentDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Current_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCurrentDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Current_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCurrentPolicyExpiryDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Current_Policy_Expiry_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCurrentPolicyExpiryDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Current_Policy_Expiry_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjCustomerIpAddressC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Customer_IP_Address__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDayslateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'DaysLate__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDeclaredNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Declared_NCB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultCompPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Comp_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultDriverPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Driver_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_End_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultExcessC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Excess__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultPlanTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Plan_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultVoluntryPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Voluntry_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDefaultWorkshopC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Default_Workshop__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDeparturePointC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Departure_Point__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDerivedNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Derived_NCB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDerivedNcbApiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Derived_NCB_API__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDescription',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Description'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDiscount',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Discount'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocErrorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Error__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintCameraDistC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Camera_Dist__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintDeclaredNcbThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Declared_NCB_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintDriverPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Driver_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintExcessC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Excess__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintGoodsTransportRouteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Goods_Transport_Route__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintVehicleUsageThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_Vehicle_Usage_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocPrintWorkshoptypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Doc_Print_WorkshopType__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDocsMissingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Docs_Missing__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDoorNumber1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Door_Number1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDoorNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Door_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDownPaymentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Down_Payment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDownPaymentAmntPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Down_Payment_Amnt_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDriverPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driver_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDriverPlanEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driver_Plan_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDrivingExperienceMainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driving_Experience_Main__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDrivingExperienceMainThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driving_Experience_Main_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDrivingExperienceYoungdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driving_Experience_YoungD__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjDrivingLicenseRequiredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Driving_license_required__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEmail',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Email'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEnPsHeader23PlusThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'EN_PS_header_23plus_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'End_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'End_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorsCount2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endors_count_2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorseEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endorse_Effective_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorsementCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endorsement_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorsementDescriptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endorsement_description__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorsementReasonsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endorsement_reasons__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndorsementTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Endorsement_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEndsCountTryC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Ends_count_try__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEngineDescription1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Engine_Description1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEngineDescriptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Engine_Description__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEngineNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Engine_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEngineSize1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Engine_size1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEngineSizeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Engine_size__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEpolicydocumentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ePolicyDocument__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjEstimatedAnnualMileageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Estimated_Annual_Mileage__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjExcessC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Excess__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjExcessEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Excess_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjExpirationdate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ExpirationDate'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjExtendedWarrantyPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Extended_Warranty_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFamilycodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'FamilyCode__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFaultClaimsForRatingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Fault_Claims_For_Rating__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFaultIncurredForRatingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Fault_Incurred_For_Rating__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFax',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Fax'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalPremiumClass1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_Premium_Class1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalPremiumClassC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_Premium_Class__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalPremiumGroup1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_Premium_Group1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalPremiumGroupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_Premium_Group__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalUwClass1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_UW_Class1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalUwClassC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_UW_Class__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalUwGroup1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_UW_Group1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinalUwGroupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Final_UW_Group__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFinanceCompanyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Finance_Company__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFlagArchiveUnuseddraftQuoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Flag_Archive_UnusedDraft_Quote__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFlagModelUpdatedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Flag_Model_Updated__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFullPaymentPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Full_Payment_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjFundingModelC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Funding_Model__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGearNumber1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Gear_Number1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGenderMainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Gender_Main__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGenderMainThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Gender_Main_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGenderYoungdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Gender_YoungD__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGoodsTransportRouteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Goods_transport_route__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGoodsTransportVehicleC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Goods_transport_vehicle__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGoogleClientIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Google_Client_ID__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGrandtotal',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'GrandTotal'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjGrossProductPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Gross_Product_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjHalfYearlyInstalmentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Half_Yearly_Instalment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjHealthCoverKeyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Health_Cover_Key__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjHealthQuestionSetCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Health_Question_Set_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjHerokuExternalIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Heroku_External_ID__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjHowLongHaveYouBeenInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'How_long_have_you_been_insured__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjId',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Id'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjImmediatePremiumToPayC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Immediate_Premium_To_Pay__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjInsurerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Insurer__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjInsurerNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Insurer_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjInsurerPolicyNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Insurer_policy_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjInteraccountSourceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'InterAccount_source__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIntermediaryCommissionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Intermediary_commission__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjInterrepC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'InterRep__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsAnyWsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_any_ws__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsBillPaymentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_bill_payment__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsCompulsoryOnlyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Compulsory_Only__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsDummyNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'is_dummy_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsGoodsTransportationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Goods_Transportation__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsMainDriverPhC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Main_Driver_PH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsN25C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_N25__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsN30C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_N30__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNamedDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_named_driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotPaymentLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_payment_loading_factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotType1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_type1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotType2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_type2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotType2PlusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_type2plus__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotType3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_type3__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsNotType3PlusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_not_type3plus__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsOnlineC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Online__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsPanelWsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_panel_ws__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsPaymentLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_payment_loading_factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsPriceSourceCodeValidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Price_Source_Code_Valid__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsQuoteOnLatestOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_Quote_On_Latest_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsRsaDisplayedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_RSA_displayed__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsType1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_type1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsType2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_type2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsType2PlusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_type2plus__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsType3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_type3__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsType3PlusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_type3plus__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsUnnamedDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_unnamed_driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsYoungestDriverPresentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Is_youngest_driver_present__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIscloneC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'isClone__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIsdeleted',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'IsDeleted'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjIssyncing',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'IsSyncing'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjItemNoForCompulsoryC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Item_no_for_compulsory__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjJoinAlcoholFreeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Join_Alcohol_Free__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKerbWeightC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Kerb_weight__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiProvinceCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Province_code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportCompEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Comp_Effective_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportDriverNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Driver_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportEffectiveDate2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Effective_Date2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Effective_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_End_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportInsuranceFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_report_Insurance_flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportInsuredTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Insured_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportLoadingFactRepairC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_report_LOADING_FACT_REPAIR__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportMainDobC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_report_main_DOB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportRiskSurveyorFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Risk_Surveyor_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportTransDate2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Trans_Date_2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportTransDate3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Trans_Date_3__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportTransDate4C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Trans_Date_4__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportTransDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Trans_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjKpiReportTransDateReceiptC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'KPI_Report_Trans_Date_receipt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLastActiveTransactionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Last_Active_Transaction__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLastmodifiedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LastModifiedById'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLastmodifieddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LastModifiedDate'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLastreferenceddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LastReferencedDate'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLastvieweddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LastViewedDate'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLatestQuoteInOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Latest_Quote_In_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLicenseTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'License_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLicenseYearC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'License_Year__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLineitemcount',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LineItemCount'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLogisticsOrCourierCompanyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Logistics_or_courier_company__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLuxuryBrandC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Luxury_Brand__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLyCalculatedNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LY_Calculated_NCB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjLyVehicleSumInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'LY_Vehicle_Sum_Insured__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMainDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Main_Driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMainDriverAge30C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Main_Driver_Age_30__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMainDriverBirthdateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Main_Driver_BirthDate__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMakeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Make__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjManufacturerWarrantyEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Manufacturer_warranty_effective_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjManufacturerWarrantyEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Manufacturer_warranty_end_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjManufacturerWarrantyOdometerLimitC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Manufacturer_warranty_odometer_limit__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMaritalStatusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Marital_Status__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMaritalStatusMainC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Marital_status_main__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMaritalStatusMainThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Marital_Status_Main_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMastersetIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Masterset_Id__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMcsendemailC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'MCSendEmail__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMinOfAgeUpdatedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Min_of_Age_Updated__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjModelDescriptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Model_Description__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjModelFamilyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Model_Family__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjModelFamilyChangedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Model_Family_Changed__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMonthDifferenceCalcC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Month_difference_Calc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMonthlyInstallmentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Monthly_Installment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMonthlyInstallmentAmntPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Monthly_Installment_Amnt_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMonthlyNoDepositLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Monthly_No_Deposit_Loading_Factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjMonthlyNonDepositInstallmentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Monthly_Non_Deposit_Installment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjName',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Name'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNameOfDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Name_of_Driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNamedDriver30C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Named_Driver_30__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNcbAtRenewalC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'NCB_At_Renewal__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNcbProofProvidedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'NCB_proof_provided__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNcbProofRequiredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'NCB_proof_required__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNeedDrivingLicenseC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Need_driving_license__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNewPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'New_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjNonDiscountedPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Non_Discounted_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOccupationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Occupation__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOccupationCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Occupation_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOccupationGroupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Occupation_group__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOdometerReadingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Odometer_Reading__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOdometerReadingDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Odometer_Reading_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOppNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Opp_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOpportunityid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'OpportunityId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOpportunitynameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'OpportunityName__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOwnDamageSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Own_Damage_SI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOwnerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Owner__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjOwnerid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'OwnerId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaPassengerPersonsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PA_passenger_persons__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaQuoteLineItemC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PA_Quote_Line_Item__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPayOnlineTimestampC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Pay_Online_Timestamp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPayOnlineUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Pay_Online_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaymentErrorCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Payment_Error_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaymentErrorMsgC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Payment_Error_Msg__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaymentFrequencyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Payment_Frequency__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPaymentLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Payment_Loading_Factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPhEqualsMdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PH_Equals_MD__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPhone',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Phone'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPlanTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Plan_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPlanTypeDescThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Plan_Type_Desc_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPlanTypeDescnewThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Plan_type_DescNEW_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyBarcodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Barcode__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Gross_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyHolderHeightC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Holder_Height__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyHolderWeightKgC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Holder_Weight_kg__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyNetPremC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Net_Prem__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Net_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyPeriodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Period__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyProductVersionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Product_Version__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPolicyTentativeStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Policy_Tentative_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPostalCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Postal_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPowerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Power__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPreferredLanguageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Preferred_Language__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPreferredOptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Preferred_Option__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPremiumBeforeLoadingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Premium_Before_Loading__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPreviousCurrentCoverTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Previous_Current_Cover_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPreviousInsurerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Previous_Insurer__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPriceSourceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Price_Source__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPriceValidUntilPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Price_Valid_Until_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPricebook2Id',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Pricebook2Id'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPrintCreditNoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Print_Credit_Note__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPrintDebitNoteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Print_Debit_Note__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPrintnotifdocC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PrintNotifDoc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjProductTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Product_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPromptpayUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Promptpay_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPsHeader23PlusEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PS_header_23plus_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPsHeader23PlusThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PS_header_23plus_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPsHeaderOnlineEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PS_header_online_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPsHeaderOnlineThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PS_header_online_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjPsnValueC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'PSN_value__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQNumberCounterC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Q_number_Counter__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQNumberTestC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Q_Number_test__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuartPmntLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quart_Pmnt_Loading_Factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuarterlyInstalmentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quarterly_Instalment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteAccessUrlFromOppC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Access_URL_from_Opp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteDescriptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Description__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteNumberIntegerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Number_Integer__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotePrefLanguageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Pref_Language__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteRenewedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_Renewed__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuoteToOppScoredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Quote_To_Opp_Scored__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotenumber',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteNumber'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetoaddress',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToAddress'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetocity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToCity'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetocountry',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToCountry'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetogeocodeaccuracy',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToGeocodeAccuracy'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetolatitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToLatitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetolongitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToLongitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetoname',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToName'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetopostalcode',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToPostalCode'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetostate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToState'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjQuotetostreet',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'QuoteToStreet'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRatingFactorDefaultedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Rating_Factor_Defaulted__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjReadyForDocGenerationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Ready_for_Doc_Generation__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjReadyForPrintingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Ready_for_printing__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjReasonForCancellationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Reason_for_Cancellation__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRecalculateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Recalculate__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRecordtypeid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'RecordTypeId'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjReferralFullUrlC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Referral_Full_URL__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRefundStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Refund_Stamp_Duty__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRegisterDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Register_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRenewalAdjustmentValueC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Renewal_Adjustment_Value__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRenewalCountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Renewal_Count__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRenewalDueFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Renewal_Due_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRenewalPremiumMatchWithNewbizC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Renewal_Premium_Match_With_NewBiz__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRentalVehicleC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Rental_vehicle__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRewardBasedOnPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Reward_Based_On_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRewardForSelectedPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Reward_For_Selected_Plan__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRewardPointFromRadarC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Reward_Point_From_Radar__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRsaC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'RSA__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRsaPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'RSA_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRsaPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'RSA_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjRsaQuoteLineItemC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'RSA_Quote_Line_Item__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSalaryRangeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Salary_range__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSameDatesQuoteVsContractC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Same_dates_Quote_vs_Contract__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSeatCapacity1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Seat_Capacity1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSeatCapacityC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Seat_Capacity__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSeatCcDescC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'seat_cc_desc__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSeatCcDescCompulC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'seat_cc_desc_compul__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSelectedOptionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Selected_Option__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSendEmailFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'send_email_flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSendEmailTimestampC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Send_Email_Timestamp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjServiceProductPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Service_Product_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingaddress',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingAddress'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingcity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingCity'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingcountry',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingCountry'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippinggeocodeaccuracy',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingGeocodeAccuracy'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippinghandling',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingHandling'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippinglatitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingLatitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippinglongitude',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingLongitude'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingname',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingName'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingpostalcode',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingPostalCode'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingstate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingState'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShippingstreet',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'ShippingStreet'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjShowMrKumkaInfoC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Show_Mr_Kumka_Info__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSmokerC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Smoker__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Start_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjStartDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Start_Date_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjStatus',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Status'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSubtotal',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Subtotal'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSysCalShortRateFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Sys_Cal_Short_Rate_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjSystemmodstamp',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'SystemModstamp'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTariffGroup1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tariff_Group1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTariffGroupC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tariff_Group__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTax',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tax'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTaxDeductionConsentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tax_deduction_consent__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTaxSumsiVoluntaryC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tax_sumSI_voluntary__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTaxiOrVehicleForHireC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Taxi_or_vehicle_for_hire__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTempC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'temp__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTentativeStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Tentative_Start_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTerritorialLimitExtensionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Territorial_limit_extension__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTotalIncurredAmountOnClaimC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Total_Incurred_Amount_On_Claim__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTotalNonDepositPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Total_Non_Deposit_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTotalTransactionPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Total_Transaction_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTotalTwelveMonthlyPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Total_Twelve_Monthly_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTotalprice',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'TotalPrice'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactedDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transacted_date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactionNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transaction_Net_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactionPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transaction_Premium__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactionPremiumPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transaction_Premium_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactionProductPriceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transaction_Product_Price__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransactionTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transaction_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransmission1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transmission1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTransmissionC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Transmission__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyDownPaymentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Twelve_Monthly_Down_Payment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTwelveMonthlyInstallmentAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Twelve_Monthly_Installment_Amnt__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTwelveMonthsPaymentLoadingFactorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Twelve_Months_Payment_Loading_Factor__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjTypeFromQliC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Type_from_QLI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjUnderwritingNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Underwriting_NCB__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjUnirisxCreatedDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Unirisx_Created_Date__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjUnirisxDeeplinkC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Unirisx_Deeplink__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleInspectionLimitC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Inspection_Limit__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleKey1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Key1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleSumInsured1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Sum_Insured1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleSumInsured2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Sum_insured2__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleSumInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Sum_Insured__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleTypeUpdateFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Type_Update_Flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleUsageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Usage__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleUsageDocPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Usage_Doc_Print__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleUsageEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Usage_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVehicleUsageThC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vehicle_Usage_TH__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVolNetPremiumLyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Vol_Net_Premium_LY__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVoluntaryQuoteLineItemC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Voluntary_Quote_Line_Item__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVoluntaryTpbiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Voluntary_TPBI__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVoluntaryType1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Voluntary_Type1__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjVoluntaryTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Voluntary_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjWelcomeAddressC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Welcome_Address__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjWelcomeNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Welcome_Name__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjWhoDriveFlagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Who_drive_flag__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjWorkshopTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Workshop_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjWorkshoptypeEnC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'WorkshopType_EN__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYearOfManufactureC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Year_of_Manufacture__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYearOfRegistrationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Year_of_Registration__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYoungDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Young_Driver__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYoungDriverNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Young_driver_number__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYoungestDriverIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Youngest_Driver_ID__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYoungestDrivertC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Youngest_DriverT__c'))
			mapCaseOutput.put('SalesforceVerifyDataTransactionSyncedObjYoungestNamedDriverC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Youngest_Named_Driver__c'))
			for(Integer lIndex=0;lIndex<=5;lIndex++){
				Integer lItemIndex=lIndex+1
				String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAbsDeductibleAmntC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Abs_Deductible_amnt__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAbsNcbAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Abs_NCB_amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAbsNdDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Abs_ND_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAbsOtherDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Abs_Other_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAbsTotalDeductibleAmtC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Abs_Total_Deductible_Amt__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAddPremC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Add_Prem__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAddPremForMeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Add_Prem_For_ME__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAddPremForPaC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Add_Prem_For_PA__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAddPremForTpbiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Add_Prem_For_TPBI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_2__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_3__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName4C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_4__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName5C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_5__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName6C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_6__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName7C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_7__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageName8C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name_8__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Name__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_1__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_2__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_3__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium4C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_4__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium5C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_5__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium6C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_6__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium7C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_7__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremium8C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Premium_8__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoveragePremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_coverage_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured1C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_1__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_2__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured3C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_3__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured4C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_4__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured5C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_5__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured6C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_6__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured7C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_7__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdditionalCoverageSumAssured8C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Additional_Coverage_Sum_Assured_8__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAdjustedTechnicalPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Adjusted_technical_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualCommPcC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_Comm_Pc__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualCommissionAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_Commission_amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualCommissionPctC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_commission_pct__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_Gross_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_Stamp_duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailAnnualVatC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Annual_VAT__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBailBondC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Bail_Bond__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBailBondSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Bail_Bond_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBasicPremium123C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Basic_premium_123__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBasicPremium5C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Basic_premium_5__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBasicPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Basic_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailBrokerDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Broker_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCalculatedNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Calculated_NCB__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCalculatedNcbAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Calculated_NCB_amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCameraDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Camera_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCancelDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Cancel_Date__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCndnSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'CNDN_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCorePremium123C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Core_premium_123__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCorePremium5C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Core_premium_5__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Cover_Code__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverEndDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Cover_end_date__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverStartDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Cover_start_date__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverStatusC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Cover_Status__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCoverage13PremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Coverage13_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCreatedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'CreatedById'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCreateddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'CreatedDate'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCreditNoteNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Credit_Note_Number__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailCurrentDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Current_Date_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDebitNoteNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Debit_Note_Number__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDeductibleDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Deductible_discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDescription',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Description'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDiscount',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Discount'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDiscountBreakdownC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Discount_breakdown__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailDriverPlanC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Driver_plan__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailEffectiveTimeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Effective_Time__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailEndDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'End_Date_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailEndorseEffectiveDateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Endorse_Effective_Date__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailEndorsedEffectiveDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Endorsed_Effective_Date_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailEndorsementNumberWithPrefixC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Endorsement_number_with_prefix__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailFireAndTheftSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Fire_and_Theft_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailFixedAnnualPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Fixed_Annual_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailHerokuExternalIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Heroku_External_ID__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailId',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Id'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailInsuranceTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Insurance_type__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailInsurerPremWaiveTaxC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Insurer_prem_waive_tax__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailIsNeedRecalculateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Is_Need_Recalculate__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailIsProductC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Is_Product__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailIsdeleted',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'IsDeleted'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiCompCoverAddedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_Comp_Cover_Added__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportLoadingOd5RateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_Report_Loading_OD5_Rate__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportNcbRateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_Report_NCB_Rate__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportOd5SiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_Report_OD5_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportOtherDisctRateC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_Report_Other_Disct_Rate__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportReceiptNoC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_report_receipt_no__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportReceiptNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_report_receipt_number__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportTaxInvoiceNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_report_tax_invoice_number__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailKpiReportTdSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'KPI_report_TD_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLastModifiedDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Last_Modified_Date_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLastmodifiedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LastModifiedById'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLastmodifieddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LastModifiedDate'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLastreferenceddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LastReferencedDate'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLastvieweddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LastViewedDate'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLfNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LF_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLinenumber',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LineNumber'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailListprice',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'ListPrice'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLyNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LY_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailLySumInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'LY_Sum_Insured__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailMastersetIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Masterset_ID__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailMedicalExpensesC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Medical_Expenses__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailMedicalExpensesSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Medical_Expenses_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailNamedDriverDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Named_driver_discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailNaturalDisasterSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Natural_Disaster_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailNewBrokerDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'New_Broker_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailNewCameraDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'New_Camera_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOdDeductibleC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'OD_Deductible__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOdSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'OD_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOdSiPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'OD_SI_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOpportunitylineitemid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'OpportunityLineItemId'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOtherDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Other_discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailOtherDiscountAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Other_discount_amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaDriverPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'PA_Driver_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaDriverSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'PA_Driver_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaPassengerPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'PA_Passenger_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaPassengerSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'PA_passenger_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPackageCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Package_code__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaymentMethodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Payment_Method__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPaymentidC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'paymentId__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPlanCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Plan_code__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyCommissionAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_Commission_Amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_Gross_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_Net_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyNetStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_Net_Stamp_Duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyNoWithPrefixC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_No_with_Prefix__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_Stamp_duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_type__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPolicyVatC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Policy_VAT__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremNbAsifC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_NB_AsIf__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremNbLyNcdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_NB_LY_NCD__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnClaimsfreenbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_ClaimsFreeNB__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnHiddenvarC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_HiddenVar__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnMaxC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_Max__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnMaxAbsoluteC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_Max_Absolute__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnMinC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_Min__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremRnUncappedC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prem_RN_Uncapped__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremiumAdjustmentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Premium_adjustment__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremiumAdjustmentPctC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Premium_adjustment_pct__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPremiumAdjustmentRemarksC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Premium_Adjustment_Remarks__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPrevTransAnnualNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Prev_Trans_Annual_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPreviousPolicyNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Previous_Policy_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPreviousPolicyNetStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Previous_Policy_Net_Stamp_Duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPreviousPolicyNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Previous_policy_number__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPreviousPolicyStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Previous_Policy_Stamp_Duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailPricebookentryid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'PricebookEntryId'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailProduct2Id',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Product2Id'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailProductNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Product_Name__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailProductOptionHeaderC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Product_Option_Header__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailProductOptionNameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Product_Option_Name__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailQuantity',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Quantity'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailQuoteid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'QuoteId'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailReasonForPremiumAdjustmentC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Reason_for_premium_adjustment__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailReceiptNoC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Receipt_No__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailRenewalCoefficientC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Renewal_Coefficient__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailRenewalPeriodC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Renewal_Period__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailServicedate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'ServiceDate'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSortorder',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'SortOrder'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailStartDatePrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Start_Date_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailStartTimeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Start_Time__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSubtotal',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Subtotal'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSumAssuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Sum_Assured__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailSystemmodstamp',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'SystemModstamp'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTariffMaximumPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Tariff_maximum_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTariffMinimumPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Tariff_minimum_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTariffMinimumZeroNcbC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Tariff_Minimum_Zero_NCB__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxDeductionAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Tax_Deduction_Amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTaxInvoiceS2C',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Tax_Invoice_S2__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTechnicalPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Technical_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTotalDeductionAmtC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Total_Deduction_Amt__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTotalDiscountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Total_Discount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTotalprice',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'TotalPrice'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTpbiPerAccidentSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'TPBI_per_accident_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTpbiPerPersonSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'TPBI_per_person_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTppdSiC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'TPPD_SI__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransAdditionNetC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_addition_net__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransCommissionAmountC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Commission_amount__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransCommissionNewC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Commission_New__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransGrossPremPrintC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Gross_Prem_Print__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransGrossPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Gross_premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransNetPlusStampC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Net_Plus_Stamp__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransNetPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Net_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransPaMePremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_PA_ME_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransRefundNetC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'trans_refund_net__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransStampDutyC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_Stamp_duty__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransTpbiPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_TPBI_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTransVatC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Trans_VAT__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Type__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailUnitprice',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'UnitPrice'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailUwAdjustedTechnicalPremiumC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'UW_Adjusted_Technical_Premium__c'))
				mapCaseOutput.put('SalesforceVerifyDataQuoteLineItem'+lStrRoundPad+'DetailWorkshopC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonQuoteLineItem,lIndex,'Workshop__c'))
			}
			lResult=true
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV2(String strOpportunityNumber,Map mapCaseOutput){
		Map lreturn=[:]
		String lOpportunityNumber=strOpportunityNumber.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(strOpportunityNumber.length()<=0){
				return lreturn
			}
			if(!mapCaseOutput){
				//return lreturn
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
			lStrTargetSalesforceObjectName='Opportunity'
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
			lListFieldNameSelected.add('SyncedQuoteId')
			lMapClauseEqualAnd.put('Name',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lOpportunityNumber))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectOpportunity=[:]
			lMapGetSalesforceObjectOpportunity=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectOpportunity.Result){
				lMapGetSalesforceObjectOpportunity=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectOpportunity.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectOpportunity=lMapGetSalesforceObjectOpportunity.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectOpportunity.size()<=0){
				return lreturn
			}
			Map lMapJsonOpportunity=lListMapJsonGetSalesforceObjectOpportunity[0]
			if(!lMapJsonOpportunity){
				return lreturn
			}
			Integer lNumberOfObjectOpportunityNum=lMapJsonOpportunity.records.size()
			if(lNumberOfObjectOpportunityNum<=0){
				return lreturn
			}
			String lSyncedQuoteId=this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonOpportunity,0,'SyncedQuoteId')
			if(lSyncedQuoteId.length()<=0){
				return lreturn
			}
			lStrTargetSalesforceObjectName='Quote'
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
			lListFieldNameSelected.add('Id')
			lListFieldNameSelected.add('Property__c')
			lMapClauseEqualAnd.put('Id',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lSyncedQuoteId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectTransactionSynced=[:]
			lMapGetSalesforceObjectTransactionSynced=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectTransactionSynced.Result){
				lMapGetSalesforceObjectTransactionSynced=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectTransactionSynced.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectTransactionSynced=lMapGetSalesforceObjectTransactionSynced.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectTransactionSynced.size()<=0){
				return lreturn
			}
			Map lMapJsonTransactionSynced=lListMapJsonGetSalesforceObjectTransactionSynced[0]
			if(!lMapJsonTransactionSynced){
				return lreturn
			}
			Integer lNumberOfObjectTransactionSyncedNum=lMapJsonTransactionSynced.records.size()
			if(lNumberOfObjectTransactionSyncedNum<=0){
				return lreturn
			}
			String lPropertyId=this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonTransactionSynced,0,'Property__c')
			if(lPropertyId.length()<=0){
				return lreturn
			}
			lStrTargetSalesforceObjectName='Related_Contact__c'
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
			lMapClauseEqualAnd.put('Quote_Id__c',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lSyncedQuoteId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectRelatedContact=[:]
			lMapGetSalesforceObjectRelatedContact=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectRelatedContact.Result){
				lMapGetSalesforceObjectRelatedContact=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectRelatedContact.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectRelatedContact=lMapGetSalesforceObjectRelatedContact.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectRelatedContact.size()<=0){
				return lreturn
			}
			Map lMapJsonRelatedContact=lListMapJsonGetSalesforceObjectRelatedContact[0]
			if(!lMapJsonRelatedContact){
				return lreturn
			}
			Integer lNumberOfObjectRelatedContactNum=lMapJsonRelatedContact.records.size()
			if(lNumberOfObjectRelatedContactNum<=0){
				return lreturn
			}
			lStrTargetSalesforceObjectName='Property__c'
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
			lMapClauseEqualAnd.put('Id',IGNUemaHelper.getAddedSingleQuoteBeginEnd(lPropertyId))
			lStrWhereClause=IGNUemaHelper.getStringQueryForWhereClauseBuilder(lIsWhereJoinOperatorAnd,lStrClauseCustomText,lMapClauseEqualAnd,lMapClauseEqualOr,lMapClauseInAnd,lMapClauseInOr,lMapClauseLikeAnd,lMapClauseLikeOr,lMapClauseNotEqualAnd,lMapClauseNotEqualOr,lMapClauseNotInAnd,lMapClauseNotInOr,lMapClauseNotLikeAnd,lMapClauseNotLikeOr)
			lStrSuffixQuery=''
			Map lMapGetSalesforceObjectProperty=[:]
			lMapGetSalesforceObjectProperty=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			if(!lMapGetSalesforceObjectProperty.Result){
				lMapGetSalesforceObjectProperty=IGNSalesforceRestAPIHelper.mapGetSalesforceObjectByQueryParamList(lStrTargetSalesforceObjectName,lIsToPreferSelectedFieldName,lListFieldNameSelected,lStrWhereClause,lStrSuffixQuery)
			}
			if(!lMapGetSalesforceObjectProperty.Result){
				return lreturn
			}
			List<Map> lListMapJsonGetSalesforceObjectProperty=lMapGetSalesforceObjectProperty.ListMapJsonResponseObject
			if(lListMapJsonGetSalesforceObjectProperty.size()<=0){
				return lreturn
			}
			Map lMapJsonProperty=lListMapJsonGetSalesforceObjectProperty[0]
			if(!lMapJsonProperty){
				return lreturn
			}
			Integer lNumberOfObjectPropertyNum=lMapJsonProperty.records.size()
			if(lNumberOfObjectPropertyNum<=0){
				return lreturn
			}
			for(Integer lIndex=0;lIndex<=3;lIndex++){
				Integer lItemIndex=lIndex+1
				String lStrRoundPad=lItemIndex.toString().padLeft(2,'0')
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailClaimIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Claim_Id__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailConnectionreceivedid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'ConnectionReceivedId'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailConnectionsentid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'ConnectionSentId'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailCreatedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'CreatedById'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailCreateddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'CreatedDate'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailFirstnameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Firstname__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailId',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Id'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailIsdeleted',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'IsDeleted'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailLastactivitydate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'LastActivityDate'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailLastmodifiedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'LastModifiedById'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailLastmodifieddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'LastModifiedDate'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailLastnameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Lastname__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailMobileC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Mobile__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailName',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Name'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailOtherRelationshipC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Other_Relationship__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailOwnerid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'OwnerId'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailPercentageC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Percentage__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailQuoteIdC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Quote_Id__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailRelationshipC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Relationship__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailSalutationC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'Salutation__c'))
				mapCaseOutput.put('SalesforceVerifyDataRelatedContact'+lStrRoundPad+'DetailSystemmodstamp',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonRelatedContact,lIndex,'SystemModstamp'))
			}
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjAreaTopC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Area_Top__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjBuildingAddressC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Building_Address__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjBuildingDistrictC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Building_District__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjBuildingNumberC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Building_Number__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjBuildingProvinceC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Building_Province__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjBuildingSubDistrictC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Building_Sub_district__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjConnectionreceivedid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'ConnectionReceivedId'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjConnectionsentid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'ConnectionSentId'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjConstructionYearsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Construction_Years__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjCreatedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'CreatedById'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjCreateddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'CreatedDate'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjFireBlockC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Fire_Block__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjId',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Id'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjIsdeleted',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'IsDeleted'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjLastactivitydate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'LastActivityDate'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjLastmodifiedbyid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'LastModifiedById'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjLastmodifieddate',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'LastModifiedDate'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjName',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Name'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjNoOfCctvC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'No_of_CCTV__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjNoOfRoomsC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'No_of_Rooms__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjNoOfSmokeDetectorC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'No_of_Smoke_Detector__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjNoOfTotalFamilyMembersC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'No_of_Total_Family_members__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjNumberOfStoreysC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Number_of_Storeys__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjOwnerid',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'OwnerId'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjOwnerTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Owner_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjPostalCodeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Postal_Code__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjResidentialTypeC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Residential_Type__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjRiskflagC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Riskflag__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjRoofFrameC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Roof_Frame__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjRoofC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Roof__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjSoiRoadC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Soi_Road__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjSumInsuredC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Sum_Insured__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjSystemmodstamp',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'SystemModstamp'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjTotalAreaC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Total_Area__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjTypeOfBuildingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Type_of_Building__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjVillageBuildingC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'Village_Building__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjUseaddressinsureC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'useAddressInsure__c'))
			mapCaseOutput.put('SalesforceVerifyDataPropertyObjWallouterC',this.getSalesforceFieldTextFromMapJsonResponseObjectRecord(lMapJsonProperty,0,'wallOuter__c'))
			lResult=true
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
	public static Map mapGetSalesforceDataByOpportunityNumberToMapCaseOutputWithPrefix(String strOpportunityNumber,String strParameterPrefix,Map mapCaseOutput){
		Map lreturn=[:]
		String lOpportunityNumber=strOpportunityNumber.trim()
		String lParameterPrefix=strParameterPrefix.trim()
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			IGNUemaHelper.printLog(IGNUemaHelper.getThisCallMethodName())
			if(lOpportunityNumber.length()<=0){
				return lreturn
			}
			if(lParameterPrefix.length()<=0){
				lreturn=this.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(lOpportunityNumber,mapCaseOutput)
				return lreturn
			}
			if(!mapCaseOutput){
				//return lreturn
			}
			Map lMapCaseOutput=[:]
			Map lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefix=this.mapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefixV1(lOpportunityNumber,lMapCaseOutput)
			if(!lMapGetSalesforceDataByOpportunityNumberToMapCaseOutputNoPrefix.Result){
				return lreturn
			}
			lResult=IGNUemaHelper.addPrefixKeyToMap(lParameterPrefix,lMapCaseOutput,mapCaseOutput)
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
		}
		return lreturn
	}
}