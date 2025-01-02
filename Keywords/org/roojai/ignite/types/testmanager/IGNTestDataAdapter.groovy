package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestDataAdapter{
	private IGNTestManager parentIGNTestManager
	private String strIGNTestDataAdapterMessage=''
	private Boolean isIGNTestDataAdapterReady=false
	private IGNTestMasterFieldFactory ignTestMasterFieldFactory
	private IGNTestMasterCaseFactory ignTestMasterCaseFactory
	public IGNTestDataAdapter(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			this.strIGNTestDataAdapterMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				this.initIGNTestDataAdapter()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestDataAdapter(){
		try{
			this.isIGNTestDataAdapterReady=false
			Boolean lIsIGNTestDataAdapterReady=true
			if(lIsIGNTestDataAdapterReady){
				this.ignTestMasterFieldFactory=new IGNTestMasterFieldFactory(this)
				lIsIGNTestDataAdapterReady=this.ignTestMasterFieldFactory.getIsIGNTestMasterFieldFactoryReady()
			}
			if(lIsIGNTestDataAdapterReady){
				this.ignTestMasterCaseFactory=new IGNTestMasterCaseFactory(this)
				lIsIGNTestDataAdapterReady=this.ignTestMasterCaseFactory.getIsIGNTestMasterCaseFactoryReady()
			}
			this.isIGNTestDataAdapterReady=lIsIGNTestDataAdapterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestManager getParentIGNTestManager(){
		try{
			return this.parentIGNTestManager
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestManager(IGNTestManager newParentIGNTestManager){
		//Do Nothing
		//this.parentIGNTestManager=newParentIGNTestManager
	}
	public Boolean getIsIGNTestDataAdapterReady(){
		try{
			return this.isIGNTestDataAdapterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestDataAdapterReady(Boolean newIsIGNTestDataAdapterReady){
		//Do Nothing
		//this.isIGNTestDataAdapterReady=newIsIGNTestDataAdapterReady
	}
	public IGNTestMasterFieldFactory getIGNTestMasterFieldFactory(){
		try{
			return this.ignTestMasterFieldFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestMasterFieldFactory(IGNTestMasterFieldFactory newIGNTestMasterFieldFactory){
		//Do Nothing
		//this.ignTestMasterFieldFactory=newIGNTestMasterFieldFactory
	}
	public IGNTestMasterCaseFactory getIGNTestMasterCaseFactory(){
		try{
			return this.ignTestMasterCaseFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestDataAdapterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestDataAdapterMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestMasterCaseFactory(IGNTestMasterCaseFactory newIGNTestMasterCaseFactory){
		//Do Nothing
		//this.ignTestMasterCaseFactory=newIGNTestMasterCaseFactory
	}
}