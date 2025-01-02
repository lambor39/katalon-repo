package org.roojai.tha.core
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
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class THARoojaiAPI2RestAPIHelper{
	protected static final String strDefaultRequestHeaderContentTypeKey=HttpHeaders.CONTENT_TYPE
	protected static final String strDefaultRequestHeaderContentTypeValue='application/json;charset=UTF-8;'
	protected static final String strDefaultRequestHeaderUsernameKey='user'
	protected static final String strDefaultRequestHeaderPasswordKey='password'
	protected static IGNTestDataCountry ignTestDataCountry=IGNTestDataCountry.Thailand
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
	public static Map mapRoojaiAPI2HomeVersionRequest(String strEndpoint,String strRequestMethod){
		Map lreturn=[:]
		String lEndpoint=strEndpoint.trim()
		if(lEndpoint.length()<=0){
			return lreturn
		}
		String lRequestMethod=strRequestMethod.trim()
		if(lRequestMethod.length()<=0){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			Map lMapRequestBodyJsonObject=[:]
			IGNUemaHelper.printLog('lEndpoint>>'+lEndpoint)
			RequestObject lRequestObject=new RequestObject(IGNUemaHelper.randomStringAlphabetEngAndNum(17,false))
			lRequestObject.setRestUrl(lEndpoint)
			lRequestObject.setRestRequestMethod(lRequestMethod)
			ResponseObject lHomeVersionResponse=WS.sendRequest(lRequestObject)
			if(!lHomeVersionResponse){
				return lreturn
			}
			lreturn.put('ResponseObjectText',lHomeVersionResponse.getResponseText().trim())
			Integer lResponseObjectStatusCode=lHomeVersionResponse.getStatusCode()
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lResponseObjectStatusCode.toString()
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lHomeVersionResponse.getElapsedTime()
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lResponseObjectElapsedTimeNum.toString()
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			lResult=true
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
	public static Map mapPostRoojaiAPI2SubmitPolicy(String strEndPointUrl,String strUsername,String strPassword,Map mapCaseInput){
		Map lreturn=[:]
		String lEndPointUrl=strEndPointUrl.trim()
		if(lEndPointUrl.length()<=0){
			return lreturn
		}
		String lUsername=strUsername.trim()
		if(lUsername.length()<=0){
			return lreturn
		}
		String lPassword=strPassword.trim()
		if(lPassword.length()<=0){
			return lreturn
		}
		try{
			Boolean lResult=false
			lreturn.put('Result',lResult)
			if(!mapCaseInput){
				return lreturn
			}
			Map lMapRequestBodyJsonObject=[:]
			lMapRequestBodyJsonObject.put('policy',mapCaseInput)
			JSONObject lRequestBodyJsonObject = new JSONObject(lMapRequestBodyJsonObject)
			IGNUemaHelper.printLog(lRequestBodyJsonObject)
			Boolean lIsOK=true
			Map lMapURLRequestParameter=[:]
			List<TestObjectProperty> lListHTTPRequestHeader=[]
			TestObjectProperty lHTTPRequestHeaderItem=null
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderContentTypeKey,ConditionType.EQUALS,this.strDefaultRequestHeaderContentTypeValue)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderUsernameKey,ConditionType.EQUALS,lUsername)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			lHTTPRequestHeaderItem=new TestObjectProperty(this.strDefaultRequestHeaderPasswordKey,ConditionType.EQUALS,lPassword)
			lListHTTPRequestHeader.add(lHTTPRequestHeaderItem)
			String lHTTPRequestBodyContent=lRequestBodyJsonObject.toString()
			Map lMapCallRestAPIHTTPPost=this.mapCallRestAPIHTTPPost(lEndPointUrl,'',lMapURLRequestParameter,lListHTTPRequestHeader,lHTTPRequestBodyContent)
			Map lMapJsonResponseObject=lMapCallRestAPIHTTPPost.MapJsonResponseObject
			String lCallRestAPIHTTPPatchResponseObjectStatusCode=lMapCallRestAPIHTTPPost.ResponseObjectStatusCode.toString().trim()
			Boolean lIsResponseStatusCodeSuccess=lCallRestAPIHTTPPatchResponseObjectStatusCode.equalsIgnoreCase('200')
			lIsOK=lIsResponseStatusCodeSuccess
			if(!lIsOK){
				if(lMapCallRestAPIHTTPPost.ResultMessage){
					if(lMapCallRestAPIHTTPPost.ResultMessage.toString().length()>0){
						IGNUemaHelper.printLog(lMapCallRestAPIHTTPPost.ResultMessage)
					}
				}
				return lreturn
			}
			RequestObject lRequestObject=lMapCallRestAPIHTTPPost.RequestObject
			lreturn.put('RequestObject',lRequestObject)
			ResponseObject lResponseObject=lMapCallRestAPIHTTPPost.ResponseObject
			if(!lResponseObject){
				return lreturn
			}
			lreturn.put('ResponseObject',lResponseObject)
			Integer lResponseObjectStatusCode=lMapCallRestAPIHTTPPost.ResponseObjectStatusCode
			lreturn.put('ResponseObjectStatusCode',lResponseObjectStatusCode)
			String lResponseObjectStatusText=lMapCallRestAPIHTTPPost.ResponseObjectStatusText
			lreturn.put('ResponseObjectStatusText',lResponseObjectStatusText)
			Integer lResponseObjectElapsedTimeNum=lMapCallRestAPIHTTPPost.ResponseObjectElapsedTimeNum
			lreturn.put('ResponseObjectElapsedTimeNum',lResponseObjectElapsedTimeNum)
			String lResponseObjectElapsedTimeText=lMapCallRestAPIHTTPPost.ResponseObjectElapsedTimeText
			lreturn.put('ResponseObjectElapsedTimeText',lResponseObjectElapsedTimeText)
			String lResponseObjectResponseText=lMapCallRestAPIHTTPPost.ResponseObjectResponseText
			lreturn.put('ResponseObjectResponseText',lResponseObjectResponseText)
			lreturn.put('MapJsonResponseObject',lMapJsonResponseObject)
			lIsOK=(lMapJsonResponseObject.status.toString().equalsIgnoreCase('SUCCESS'))
			if(!lIsOK){
				return lreturn
			}
			lResult=true
			if(lResult){
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}