package org.roojai.ignite.types.testmanager
import internal.GlobalVariable
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import org.roojai.ignite.core.IGNBrowserConfig
import org.roojai.ignite.core.IGNSendEmail
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
import org.roojai.idn.core.IDNGlobalConst
import org.roojai.tha.core.THAGlobalConst
public final class IGNTestManager{
	private static IGNTestManager INSTANCE
	private String info='Initial Info Class Of IGNTestManager'
	private String strIGNTestManagerMessage=''
	private IGNTestForCountry enumIGNTestForCountry
	private String strConfigDataFileNameInput=''
	private String strConfigDataFileNameOutput=''
	private String strConfigDataFileNameTemplateOutput=''
	private String strConfigExcelFileName=''
	private String strConfigExcelWorkSheetNameInput='IgniteProgramDataInput'
	private String strConfigExcelWorkSheetNameOutput='IgniteProgramDataOutput'
	private String strConfigExcelWorkSheetNameTemplateOutput='IgniteProgramOutput0000'
	private Boolean isIGNTestManagerReady=false
	private IGNTestMandatoryParameter ignTestMandatoryParameter
	private IGNTestDataAdapter ignTestDataAdapter
	private IGNTestLibConfigRegister ignTestLibConfigRegister
	private IGNTestConductor ignTestConductor
	private Boolean isIGNTestConductorExecutedSingle=false
	private Boolean isIGNTestConductorExecutedBatch=false
	private String strIGNTestConductorTestStoryDetailAfterSingle=''
	private String strIGNTestConductorTestStoryDetailAfterBatch=''
	private IGNTestDelivery ignTestDelivery
	private IGNTestManager(IGNTestForCountry enumInitIGNTestForCountry,String strInitConfigDataFileNameInput,String strInitConfigDataFileNameOutput,String strInitConfigDataFileNameTemplateOutput,String strInitConfigExcelFileName){
		super()
		try{
			this.strIGNTestManagerMessage=''
			this.enumIGNTestForCountry=enumInitIGNTestForCountry
			this.strConfigDataFileNameInput=strInitConfigDataFileNameInput
			this.strConfigDataFileNameOutput=strInitConfigDataFileNameOutput
			this.strConfigDataFileNameTemplateOutput=strInitConfigDataFileNameTemplateOutput
			this.strConfigExcelFileName=strInitConfigExcelFileName
			this.initIGNTestManager()
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public static IGNTestManager getInstance(IGNTestForCountry enumInitIGNTestForCountry,String strInitConfigDataFileNameInput,String strInitConfigDataFileNameOutput,String strInitConfigDataFileNameTemplateOutput,String strInitConfigExcelFileName){
		try{
			if(this.INSTANCE==null){
				this.INSTANCE=new IGNTestManager(enumInitIGNTestForCountry,strInitConfigDataFileNameInput,strInitConfigDataFileNameOutput,strInitConfigDataFileNameTemplateOutput,strInitConfigExcelFileName)
			}
		}catch(Exception e){
			//e.printStackTrace()
		}
		return this.INSTANCE
	}
	private void initIGNTestManager(){
		try{
			this.isIGNTestManagerReady=false
			Boolean lIsIGNTestManagerReady=true
			if(lIsIGNTestManagerReady){
				this.ignTestMandatoryParameter=new IGNTestMandatoryParameter(this)
				lIsIGNTestManagerReady=this.ignTestMandatoryParameter.getIsIGNTestMandatoryParameterReady()
			}
			if(lIsIGNTestManagerReady){
				this.ignTestDataAdapter=new IGNTestDataAdapter(this)
				lIsIGNTestManagerReady=this.ignTestDataAdapter.getIsIGNTestDataAdapterReady()
			}
			if(lIsIGNTestManagerReady){
				this.ignTestLibConfigRegister=new IGNTestLibConfigRegister(this)
				lIsIGNTestManagerReady=this.ignTestLibConfigRegister.getIsIGNTestLibConfigRegisterReady()
			}
			if(lIsIGNTestManagerReady){
				this.ignTestConductor=new IGNTestConductor(this)
				lIsIGNTestManagerReady=this.ignTestConductor.getIsIGNTestConductorReady()
			}
			if(lIsIGNTestManagerReady){
				//this.ignTestDelivery=new IGNTestDelivery(this)
				//lIsIGNTestManagerReady=this.ignTestDelivery.getIsIGNTestDeliveryReady()
			}
			this.isIGNTestManagerReady=lIsIGNTestManagerReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestManagerMessage(){
		try{
			return this.strIGNTestManagerMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestManagerMessage(String newStrIGNTestManagerMessage){
		//Do Nothing
		//this.strIGNTestManagerMessage=newStrIGNTestManagerMessage
	}
	public IGNTestForCountry getEnumIGNTestForCountry(){
		return this.enumIGNTestForCountry
	}
	public void setEnumIGNTestForCountry(IGNTestForCountry newEnumIGNTestForCountry){
		//Do Nothing
		//this.enumIGNTestForCountry=newEnumIGNTestForCountry
	}
	public String getStrConfigDataFileNameInput(){
		try{
			return this.strConfigDataFileNameInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigDataFileNameInput(String newStrConfigDataFileNameInput){
		//Do Nothing
		//this.strConfigDataFileNameInput=newStrConfigDataFileNameInput
	}
	public String getStrConfigDataFileNameOutput(){
		try{
			return this.strConfigDataFileNameOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigDataFileNameOutput(String newStrConfigDataFileNameOutput){
		//Do Nothing
		//this.strConfigDataFileNameOutput=newStrConfigDataFileNameOutput
	}
	public String getStrConfigDataFileNameTemplateOutput(){
		try{
			return this.strConfigDataFileNameTemplateOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigDataFileNameTemplateOutput(String newStrConfigDataFileNameTemplateOutput){
		//Do Nothing
		//this.strConfigDataFileNameTemplateOutput=newStrConfigDataFileNameTemplateOutput
	}
	public String getStrConfigExcelFileName(){
		try{
			return this.strConfigExcelFileName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigExcelFileName(String newStrConfigExcelFileName){
		//Do Nothing
		//this.strConfigExcelFileName=newStrConfigExcelFileName
	}
	public Boolean getIsIGNTestManagerReady(){
		try{
			return this.isIGNTestManagerReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public String getStrConfigExcelWorkSheetNameInput(){
		try{
			return this.strConfigExcelWorkSheetNameInput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigExcelWorkSheetNameInput(String newStrConfigExcelWorkSheetNameInput){
		//Do Nothing
		//this.strConfigExcelWorkSheetNameInput=newStrConfigExcelWorkSheetNameInput
	}
	public String getStrConfigExcelWorkSheetNameOutput(){
		try{
			return this.strConfigExcelWorkSheetNameOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigExcelWorkSheetNameOutput(String newStrConfigExcelWorkSheetNameOutput){
		//Do Nothing
		//this.strConfigExcelWorkSheetNameOutput=newStrConfigExcelWorkSheetNameOutput
	}
	public String getStrConfigExcelWorkSheetNameTemplateOutput(){
		try{
			return this.strConfigExcelWorkSheetNameTemplateOutput
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrConfigExcelWorkSheetNameTemplateOutput(String newStrConfigExcelWorkSheetNameTemplateOutput){
		//Do Nothing
		//this.strConfigExcelWorkSheetNameTemplateOutput=newStrConfigExcelWorkSheetNameTemplateOutput
	}
	public void setIsIGNTestManagerReady(Boolean newIsIGNTestManagerReady){
		//Do Nothing
		//this.isIGNTestManagerReady=newIsIGNTestManagerReady
	}
	public IGNTestMandatoryParameter getIGNTestMandatoryParameter(){
		try{
			return this.ignTestMandatoryParameter
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestMandatoryParameter(IGNTestMandatoryParameter newIGNTestMandatoryParameter){
		//Do Nothing
		//this.ignTestMandatoryParameter=newIGNTestMandatoryParameter
	}
	public IGNTestDataAdapter getIGNTestDataAdapter(){
		try{
			return this.ignTestDataAdapter
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestDataAdapter(IGNTestDataAdapter newIGNTestDataAdapter){
		//Do Nothing
		//this.ignTestDataAdapter=newIGNTestDataAdapter
	}
	public IGNTestLibConfigRegister getIGNTestLibConfigRegister(){
		try{
			return this.ignTestLibConfigRegister
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestLibConfigRegister(IGNTestLibConfigRegister newIGNTestLibConfigRegister){
		//Do Nothing
		//this.ignTestLibConfigRegister=newIGNTestLibConfigRegister
	}
	public IGNTestConductor getIGNTestConductor(){
		try{
			return this.ignTestConductor
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestConductor(IGNTestConductor newIGNTestConductor){
		//Do Nothing
		//this.ignTestConductor=newIGNTestConductor
	}
	public Boolean getIsIGNTestConductorExecutedSingle(){
		try{
			return this.isIGNTestConductorExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestConductorExecutedSingle(Boolean newIsIGNTestConductorExecutedSingle){
		try{
			this.isIGNTestConductorExecutedSingle=newIsIGNTestConductorExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestConductorExecutedBatch(){
		try{
			return this.isIGNTestConductorExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestConductorExecutedBatch(Boolean newIsIGNTestConductorExecutedBatch){
		try{
			this.isIGNTestConductorExecutedBatch=newIsIGNTestConductorExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestConductorTestStoryDetailAfterSingle(){
		try{
			return this.strIGNTestConductorTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestConductorTestStoryDetailAfterSingle(String newStrIGNTestConductorTestStoryDetailAfterSingle){
		try{
			this.strIGNTestConductorTestStoryDetailAfterSingle=newStrIGNTestConductorTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestConductorTestStoryDetailAfterBatch(){
		try{
			return this.strIGNTestConductorTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestConductorTestStoryDetailAfterBatch(String newStrIGNTestConductorTestStoryDetailAfterBatch){
		try{
			this.strIGNTestConductorTestStoryDetailAfterBatch=newStrIGNTestConductorTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Workbook getExcelWorkbook(){
		try{
			return IGNUemaHelper.getExcelWorkbookInstanceFromFileName(this.strConfigExcelFileName)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Sheet getExcelWorkSheetInput(Workbook objWorkbook){
		try{
			if(!IGNUemaHelper.checkObjectNullOfObject(objWorkbook)){
				return IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(objWorkbook,this.strConfigExcelWorkSheetNameInput)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Sheet getExcelWorkSheetOutput(Workbook objWorkbook){
		try{
			if(!IGNUemaHelper.checkObjectNullOfObject(objWorkbook)){
				return IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(objWorkbook,this.strConfigExcelWorkSheetNameOutput)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Sheet getExcelWorkSheetTemplateOutput(Workbook objWorkbook){
		try{
			if(!IGNUemaHelper.checkObjectNullOfObject(objWorkbook)){
				return IGNUemaHelper.getExcelWorkSheetFromExcelWorkbook(objWorkbook,this.strConfigExcelWorkSheetNameTemplateOutput)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public Boolean conductTestExecutionSingle(Integer numCaseNumber){
		Boolean lreturn=false
		if(!this.isIGNTestManagerReady){
			return lreturn
		}
		if(numCaseNumber<=0){
			return lreturn
		}
		if(numCaseNumber>9999){
			return lreturn
		}
		try{
			Boolean lIsProceedTestExecutionSingle=false
			this.isIGNTestConductorExecutedSingle=true
			this.strIGNTestConductorTestStoryDetailAfterSingle=''
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lIsProceedTestExecutionSingle=this.ignTestConductor.conductTestExecutionSingle(numCaseNumber)
			this.strIGNTestConductorTestStoryDetailAfterSingle=this.ignTestConductor.getStrIGNTestConductorTestStoryDetailAfterSingle()
			this.strIGNTestConductorTestStoryDetailAfterBatch=this.ignTestConductor.getStrIGNTestConductorTestStoryDetailAfterBatch()
			if(!this.ignTestDataAdapter.getIGNTestMasterCaseFactory().saveIGNTestMasterCaseFactory()){
				lIsProceedTestExecutionSingle=false
			}
			IGNBrowserConfig.killBrowserAll()
			if(lIsProceedTestExecutionSingle){
				this.sendEmailRaw()
			}else{
				this.sendEmailRaw()
			}
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean conductTestExecutionBatch(){
		Boolean lreturn=false
		if(!this.isIGNTestManagerReady){
			return lreturn
		}
		try{
			Boolean lIsProceedTestExecutionBatch=true
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lIsProceedTestExecutionBatch=this.ignTestConductor.conductTestExecutionBatch()
			this.isIGNTestConductorExecutedBatch=true
			this.strIGNTestConductorTestStoryDetailAfterBatch=this.ignTestConductor.getStrIGNTestConductorTestStoryDetailAfterBatch()
			if(!this.ignTestDataAdapter.getIGNTestMasterCaseFactory().saveIGNTestMasterCaseFactory()){
				lIsProceedTestExecutionBatch=false
			}
			IGNBrowserConfig.killBrowserAll()
			if(lIsProceedTestExecutionBatch){
				this.sendEmailRaw()
			}else{
				this.sendEmailRaw()
			}
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestDelivery getIGNTestDelivery(){
		try{
			return this.ignTestDelivery
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestDelivery(IGNTestDelivery newIGNTestDelivery){
		//Do Nothing
		//this.ignTestDelivery=newIGNTestDelivery
	}
	public Boolean sendEmailRaw(){
		Boolean lreturn=false
		if(!this.isIGNTestManagerReady){
			return lreturn
		}
		try{
			String lStrDatetime=IGNUemaHelper.convertLocalDateTimeToString('yyyy/MM/dd HH:mm')
			String lStrSubject='Test Manager Raw Result : Automation Report ['+lStrDatetime+'].'
			String lStrEmailBody=IGNUemaHelper.getEmailBodyForReport(lStrSubject,IGNUemaHelper.getStringCurrentDateTimeSlashDDMMYYYYColonHHMMSS(),'1','1','0','0')
			String[] lArrayEmailAttachFile=new String[1]
			lArrayEmailAttachFile[0]=this.strConfigExcelFileName
			if(this.enumIGNTestForCountry==IGNTestForCountry.Indonesia){
				lreturn=IGNSendEmail.sendRoojaiReportIDN(IDNGlobalConst.DEFAULT_EMAIL_TO_ME,lStrSubject,lStrEmailBody,lArrayEmailAttachFile)
			}else{
				lreturn=IGNSendEmail.sendRoojaiReportTHA(THAGlobalConst.DEFAULT_EMAIL_TO_ME,lStrSubject,lStrEmailBody,lArrayEmailAttachFile)
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestManagerMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestManagerMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}