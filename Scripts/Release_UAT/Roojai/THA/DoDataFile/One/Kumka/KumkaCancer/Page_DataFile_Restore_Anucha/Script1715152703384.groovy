import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCountry
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataCompany
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataExcelStoreType
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
String lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
	GlobalVariable.CaseDateTimeBegin=lDateTimeNow
}
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Start>>'+GlobalVariable.CaseDateTimeBegin)
IGNTestDataCountry lEnumIGNTestDataCountry=IGNTestDataCountry.Thailand
IGNTestDataCompany lEnumIGNTestDataCompany=IGNTestDataCompany.MrKumka
IGNTestDataExcelStoreType lEnumIGNTestDataExcelStoreType=IGNTestDataExcelStoreType.SingleProductSingleUser
String lStrProductName='Cancer'
String lStrCycleUserName='Anucha'
Boolean lIsRestoreDataFileOK=IGNUemaHelper.restoreDataFileByCountryCompanyTypeProduct(lEnumIGNTestDataCountry,lEnumIGNTestDataCompany,lEnumIGNTestDataExcelStoreType,lStrProductName,lStrCycleUserName)
lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
GlobalVariable.CaseDateTimeEnd=lDateTimeNow
IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
if(lIsRestoreDataFileOK){
	KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
}else{
	KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
}
return null