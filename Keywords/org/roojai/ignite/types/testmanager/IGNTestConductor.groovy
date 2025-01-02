package org.roojai.ignite.types.testmanager
import internal.GlobalVariable
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestConductor{
	private IGNTestManager parentIGNTestManager
	private String strIGNTestConductorMessage=''
	private Boolean isIGNTestConductorReady=false
	private IGNTestExecutorFactory ignTestExecutorFactory
	private Boolean isIGNTestConductorExecutedSingle=false
	private Boolean isIGNTestConductorExecutedBatch=false
	private String strIGNTestConductorTestStoryDetailAfterSingle=''
	private String strIGNTestConductorTestStoryDetailAfterBatch=''
	public IGNTestConductor(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			this.strIGNTestConductorMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				this.initIGNTestConductor()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestConductor(){
		try{
			this.isIGNTestConductorReady=false
			Boolean lIsIGNTestConductorReady=true
			if(lIsIGNTestConductorReady){
				this.ignTestExecutorFactory=new IGNTestExecutorFactory(this)
				lIsIGNTestConductorReady=this.ignTestExecutorFactory.getIsIGNTestExecutorFactoryReady()
			}
			this.isIGNTestConductorReady=lIsIGNTestConductorReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestManager getParentIGNTestManager(){
		try{
			return this.parentIGNTestManager
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestManager(IGNTestManager newParentIGNTestManager){
		//Do Nothing
		//this.parentIGNTestManager=newParentIGNTestManager
	}
	public Boolean getIsIGNTestConductorReady(){
		try{
			return this.isIGNTestConductorReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestConductorReady(Boolean newIsIGNTestConductorReady){
		//Do Nothing
		//this.isIGNTestConductorReady=newIsIGNTestConductorReady
	}
	public IGNTestExecutorFactory getIGNTestExecutorFactory(){
		try{
			return this.ignTestExecutorFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestExecutorFactory(IGNTestExecutorFactory newIGNTestExecutorFactory){
		//Do Nothing
		//this.ignTestExecutorFactory=newIGNTestExecutorFactory
	}
	public Boolean getIsIGNTestConductorExecutedSingle(){
		try{
			return this.isIGNTestConductorExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestConductorExecutedSingle(Boolean newIsIGNTestConductorExecutedSingle){
		try{
			this.isIGNTestConductorExecutedSingle=newIsIGNTestConductorExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestConductorExecutedBatch(){
		try{
			return this.isIGNTestConductorExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestConductorExecutedBatch(Boolean newIsIGNTestConductorExecutedBatch){
		try{
			this.isIGNTestConductorExecutedBatch=newIsIGNTestConductorExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestConductorTestStoryDetailAfterSingle(){
		try{
			return this.strIGNTestConductorTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestConductorTestStoryDetailAfterSingle(String newStrIGNTestConductorTestStoryDetailAfterSingle){
		try{
			this.strIGNTestConductorTestStoryDetailAfterSingle=newStrIGNTestConductorTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestConductorTestStoryDetailAfterBatch(){
		try{
			return this.strIGNTestConductorTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestConductorTestStoryDetailAfterBatch(String newStrIGNTestConductorTestStoryDetailAfterBatch){
		try{
			this.strIGNTestConductorTestStoryDetailAfterBatch=newStrIGNTestConductorTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
	}
	public Boolean conductTestExecutionSingle(Integer numCaseNumber){
		Boolean lreturn=false
		if(!this.isIGNTestConductorReady){
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
			lIsProceedTestExecutionSingle=this.ignTestExecutorFactory.proceedTestExecutionSingle(numCaseNumber)
			this.strIGNTestConductorTestStoryDetailAfterSingle=this.ignTestExecutorFactory.getStrIGNTestExecutorFactoryTestStoryDetailAfterSingle()
			this.strIGNTestConductorTestStoryDetailAfterBatch=this.ignTestExecutorFactory.getStrIGNTestExecutorFactoryTestStoryDetailAfterBatch()
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean conductTestExecutionBatch(){
		Boolean lreturn=false
		if(!this.isIGNTestConductorReady){
			return lreturn
		}
		try{
			Boolean lIsProceedTestExecutionBatch=true
			this.isIGNTestConductorExecutedBatch=true
			this.strIGNTestConductorTestStoryDetailAfterBatch=''
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lIsProceedTestExecutionBatch=this.ignTestExecutorFactory.proceedTestExecutionBatch()
			this.strIGNTestConductorTestStoryDetailAfterBatch=this.ignTestExecutorFactory.getStrIGNTestExecutorFactoryTestStoryDetailAfterBatch()
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestConductorMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestConductorMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}