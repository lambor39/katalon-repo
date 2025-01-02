package org.roojai.ignite.types.testmanager
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
import org.roojai.ignite.types.testmanager.IGNTestManager
public class IGNTestManagerHelperTHA{
	private static IGNTestManager instanceIGNTestManager
	public static final String CURRENT_TEST_CONFIG_DATA_FILE_NAME_INPUT='Data Files/Release_UAT/Roojai/THA/UniversalTestManager/ProgramData.Input'
	public static final String CURRENT_TEST_CONFIG_DATA_FILE_NAME_OUTPUT='Data Files/Release_UAT/Roojai/THA/UniversalTestManager/ProgramData.Output'
	public static final String CURRENT_TEST_CONFIG_DATA_FILE_NAME_TEMPLATE_OUTPUT='Data Files/Release_UAT/Roojai/THA/UniversalTestManager/ProgramTemplate.Output'
	public static final String CURRENT_TEST_CONFIG_EXCEL_FILE_NAME='Data Files/Release_UAT/Roojai/THA/Excel_IgniteUniversalTestData_IgniteProgramDataList.xlsx'
	public static IGNTestManager getIGNTestManagerInstance(){
		try{
			this.instanceIGNTestManager=IGNTestManager.getInstance(IGNTestForCountry.Thailand,this.CURRENT_TEST_CONFIG_DATA_FILE_NAME_INPUT,this.CURRENT_TEST_CONFIG_DATA_FILE_NAME_OUTPUT,this.CURRENT_TEST_CONFIG_DATA_FILE_NAME_TEMPLATE_OUTPUT,this.CURRENT_TEST_CONFIG_EXCEL_FILE_NAME)
			return this.instanceIGNTestManager
		}catch(Exception e){
			//e.printStackTrace()
		}
	}
}