import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
	String lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
	if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
		GlobalVariable.CaseDateTimeBegin=lDateTimeNow
	}
	GlobalVariable.CaseDateTimeEnd=lDateTimeNow
	IGNUemaHelper.printLog('Start>>'+GlobalVariable.CaseDateTimeBegin)
	Boolean lIsRestoreDataFileOK=IGNUemaHelper.restoreDataFileFromTestBlank()
	lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
	GlobalVariable.CaseDateTimeEnd=lDateTimeNow
	IGNUemaHelper.printLog('Stop>>'+GlobalVariable.CaseDateTimeEnd)
	IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
	if(lIsRestoreDataFileOK){
		KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
	}else{
		KeywordUtil.markFailed(GlobalVariable.TestCaseFullName)
	}
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
//KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
return null