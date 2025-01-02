import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable
import org.roojai.ignite.core.IGNBrowserConfig as IGNBrowserConfig
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
try{
	/*============================================================================YOUR CODE HERE============================================================================*/
	IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
	IGNBrowserConfig.closeBrowser()
	IGNBrowserConfig.killBrowserAll()
	IGNBrowserConfig.killBrowserGlobal()
	/*============================================================================YOUR CODE HERE============================================================================*/
}catch(Exception e){
}
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
return null