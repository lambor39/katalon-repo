package org.roojai.idn.types.salesforce.lightning.core
import org.roojai.ignite.core.IGNUemaHelper
import org.roojai.idn.types.salesforce.lightning.core.IDNSalesforceLightningCoreEnum.IDNEnumSalesforceMode
public class IDNSalesforceLightningCoreHelperCommon{
	public static Map inputSfQuotePolicyStartDate(String strQuoteOptionalPolicyStartOffsetDay){
		Map lreturn=[:]
		String lQuoteOptionalPolicyStartDate=''
		try{
			Boolean lResult=false
			lreturn.put('StrQuotePolicyStartDate',lQuoteOptionalPolicyStartDate)
			lreturn.put('Result',lResult)
			if(IGNUemaHelper.checkObjectNullOfObject(strQuoteOptionalPolicyStartOffsetDay)){
				return lreturn
			}
			String lQuoteOptionalPolicyStartDateOffsetDay=strQuoteOptionalPolicyStartOffsetDay
			if(IGNUemaHelper.checkObjectEmptyOfString(lQuoteOptionalPolicyStartDateOffsetDay)){
				lQuoteOptionalPolicyStartDateOffsetDay='0'
			}
			String lFormatDate='dd/MM/yyyy'
			lQuoteOptionalPolicyStartDate=IGNUemaHelper.convertLocalDateToString(lFormatDate)
			Integer lQuoteOptionalPolicyStartDateOffsetDayNum=IGNUemaHelper.convertStringToInteger(lQuoteOptionalPolicyStartDateOffsetDay,0)
			lQuoteOptionalPolicyStartDate=IGNUemaHelper.offsetDayByDateString(lFormatDate,lQuoteOptionalPolicyStartDate,lQuoteOptionalPolicyStartDateOffsetDayNum)
			lResult=(lQuoteOptionalPolicyStartDate.length()>0)
			if(lResult){
				lreturn.put('StrQuotePolicyStartDate',lQuoteOptionalPolicyStartDate)
				lreturn.put('Result',lResult)
			}
		}catch(Exception e){
			e.printStackTrace()
			return lreturn
		}
		return lreturn
	}
}