import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection
import javax.swing.JFrame
import javax.swing.JOptionPane
import org.roojai.tha.core.THARoojaiWebsite as THARoojaiWebsite
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Start')
IGNUemaHelper.printLog('printPropertiesOfExecutionProperties')
IGNUemaHelper.printPropertiesOfExecutionProperties()
IGNUemaHelper.printLog('ExecutionProfile:'+IGNUemaHelper.getExecutionProfile())
JFrame lJFrame=new JFrame('User Input Frame')
lJFrame.requestFocus()
lJFrame.requestFocus()
Integer lDialogButton=JOptionPane.YES_NO_OPTION
Integer lDialogResult=JOptionPane.showConfirmDialog(lJFrame,"My Account OTP By Phone No.?","My Account OTP",lDialogButton)
String lStrOTP=''
if(lDialogResult==0){
	IGNUemaHelper.printLog('Yes')
	String lStrPhone=JOptionPane.showInputDialog(lJFrame,'Enter Phone Number','0638961786')
	lStrOTP=THARoojaiWebsite.OTPMyAccountByPhoneNo(lStrPhone,true)
}else{
	IGNUemaHelper.printLog('No')
	String email=JOptionPane.showInputDialog(lJFrame,'Enter Email Address','chatchai.bun@roojai.com')
	lStrOTP=THARoojaiWebsite.OTPMyAccountByEmail(email,true)
}
IGNUemaHelper.printLog(lStrOTP)
Toolkit lToolkit=Toolkit.getDefaultToolkit()
StringSelection lSelectText=new StringSelection(lStrOTP)
Clipboard clipboard=lToolkit.getSystemClipboard().setContents(lSelectText,null)
lStrOTP=JOptionPane.showInputDialog(lJFrame,'Your OTP',lStrOTP)
IGNUemaHelper.printLog(GlobalVariable.TestCaseFullName+' Stop')
KeywordUtil.markPassed(GlobalVariable.TestCaseFullName)
return null