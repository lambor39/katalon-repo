package org.roojai.ignite.types.testmanager
import internal.GlobalVariable
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestDelivery{
	private IGNTestManager parentIGNTestManager
	private String strIGNTestDeliveryMessage=''
	private Boolean isIGNTestDeliveryReady=false
	private IGNTestExecutorFactory ignTestExecutorFactory
	private Boolean isIGNTestDeliveryExecutedSingle=false
	private Boolean isIGNTestDeliveryExecutedBatch=false
	private String strIGNTestDeliveryTestStoryDetailAfterSingle=''
	private String strIGNTestDeliveryTestStoryDetailAfterBatch=''
	public IGNTestDelivery(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			this.strIGNTestDeliveryMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				this.initIGNTestDelivery()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestDelivery(){
		try{
			this.isIGNTestDeliveryReady=false
			Boolean lIsIGNTestDeliveryReady=true
			if(lIsIGNTestDeliveryReady){
				this.ignTestExecutorFactory=new IGNTestExecutorFactory(this)
				lIsIGNTestDeliveryReady=this.ignTestExecutorFactory.getIsIGNTestExecutorFactoryReady()
			}
			this.isIGNTestDeliveryReady=lIsIGNTestDeliveryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestManager getParentIGNTestManager(){
		try{
			return this.parentIGNTestManager
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestManager(IGNTestManager newParentIGNTestManager){
		//Do Nothing
		//this.parentIGNTestManager=newParentIGNTestManager
	}
	public Boolean getIsIGNTestDeliveryReady(){
		try{
			return this.isIGNTestDeliveryReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDeliveryReady(Boolean newIsIGNTestDeliveryReady){
		//Do Nothing
		//this.isIGNTestDeliveryReady=newIsIGNTestDeliveryReady
	}
	public IGNTestExecutorFactory getIGNTestExecutorFactory(){
		try{
			return this.ignTestExecutorFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestExecutorFactory(IGNTestExecutorFactory newIGNTestExecutorFactory){
		//Do Nothing
		//this.ignTestExecutorFactory=newIGNTestExecutorFactory
	}
	public Boolean getIsIGNTestDeliveryExecutedSingle(){
		try{
			return this.isIGNTestDeliveryExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDeliveryExecutedSingle(Boolean newIsIGNTestDeliveryExecutedSingle){
		try{
			this.isIGNTestDeliveryExecutedSingle=newIsIGNTestDeliveryExecutedSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean getIsIGNTestDeliveryExecutedBatch(){
		try{
			return this.isIGNTestDeliveryExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDeliveryExecutedBatch(Boolean newIsIGNTestDeliveryExecutedBatch){
		try{
			this.isIGNTestDeliveryExecutedBatch=newIsIGNTestDeliveryExecutedBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestDeliveryTestStoryDetailAfterSingle(){
		try{
			return this.strIGNTestDeliveryTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestDeliveryTestStoryDetailAfterSingle(String newStrIGNTestDeliveryTestStoryDetailAfterSingle){
		try{
			this.strIGNTestDeliveryTestStoryDetailAfterSingle=newStrIGNTestDeliveryTestStoryDetailAfterSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public String getStrIGNTestDeliveryTestStoryDetailAfterBatch(){
		try{
			return this.strIGNTestDeliveryTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestDeliveryTestStoryDetailAfterBatch(String newStrIGNTestDeliveryTestStoryDetailAfterBatch){
		try{
			this.strIGNTestDeliveryTestStoryDetailAfterBatch=newStrIGNTestDeliveryTestStoryDetailAfterBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
	}
	public Boolean conductTestExecutionSingle(Integer numCaseNumber){
		Boolean lreturn=false
		if(!this.isIGNTestDeliveryReady){
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
			this.isIGNTestDeliveryExecutedSingle=true
			this.strIGNTestDeliveryTestStoryDetailAfterSingle=''
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lIsProceedTestExecutionSingle=this.ignTestExecutorFactory.proceedTestExecutionSingle(numCaseNumber)
			this.strIGNTestDeliveryTestStoryDetailAfterSingle=this.ignTestExecutorFactory.getStrIGNTestExecutorFactoryTestStoryDetailAfterSingle()
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionSingle
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public Boolean conductTestExecutionBatch(){
		Boolean lreturn=false
		if(!this.isIGNTestDeliveryReady){
			return lreturn
		}
		try{
			Boolean lIsProceedTestExecutionBatch=true
			this.isIGNTestDeliveryExecutedBatch=true
			this.strIGNTestDeliveryTestStoryDetailAfterBatch=''
			String lDateTimeNow=''
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			if(GlobalVariable.CaseDateTimeBegin.toString().length()<=0){
				GlobalVariable.CaseDateTimeBegin=lDateTimeNow
			}
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lIsProceedTestExecutionBatch=this.ignTestExecutorFactory.proceedTestExecutionBatch()
			this.strIGNTestDeliveryTestStoryDetailAfterBatch=this.ignTestExecutorFactory.getStrIGNTestExecutorFactoryTestStoryDetailAfterBatch()
			lDateTimeNow=IGNUemaHelper.getStringCurrentStampDateTime()
			GlobalVariable.CaseDateTimeEnd=lDateTimeNow
			lreturn=lIsProceedTestExecutionBatch
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDeliveryMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDeliveryMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}