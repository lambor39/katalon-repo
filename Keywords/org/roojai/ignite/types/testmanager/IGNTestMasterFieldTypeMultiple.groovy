package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestMasterFieldTypeMultiple{
	private IGNTestMasterFieldFactory parentIGNTestMasterFieldFactory
	private String strIGNTestMasterFieldTypeMultipleMessage=''
	private Boolean isIGNTestMasterFieldTypeMultipleValid=false
	private Integer numDataCellColIndex=0
	private String strProjectFieldListFieldName=''
	private Integer numExcelCellColIndex=0
	private String strProgramParameterName=''
	public IGNTestMasterFieldTypeMultiple(IGNTestMasterFieldFactory ignTestMasterFieldFactory,Integer numInitDataCellColIndex,String strInitProjectFieldListFieldName){
		super()
		try{
			this.parentIGNTestMasterFieldFactory=ignTestMasterFieldFactory
			this.strIGNTestMasterFieldTypeMultipleMessage=''
			this.numDataCellColIndex=numInitDataCellColIndex
			this.strProjectFieldListFieldName=strInitProjectFieldListFieldName.trim()
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterFieldFactory)){
				this.initIGNTestMasterFieldTypeMultiple()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterFieldTypeMultiple(){
		try{
			this.isIGNTestMasterFieldTypeMultipleValid=false
			Boolean lIsIGNTestMasterFieldTypeMultipleValid=true
			if(this.numDataCellColIndex>0){
				this.numExcelCellColIndex=this.numDataCellColIndex-1
			}
			this.strProgramParameterName=this.strProjectFieldListFieldName.replaceAll('_','').trim()
			lIsIGNTestMasterFieldTypeMultipleValid=lIsIGNTestMasterFieldTypeMultipleValid&&(this.numDataCellColIndex>0)
			lIsIGNTestMasterFieldTypeMultipleValid=lIsIGNTestMasterFieldTypeMultipleValid&&(this.strProjectFieldListFieldName.length()>0)
			lIsIGNTestMasterFieldTypeMultipleValid=lIsIGNTestMasterFieldTypeMultipleValid&&(this.numExcelCellColIndex>=0)
			lIsIGNTestMasterFieldTypeMultipleValid=lIsIGNTestMasterFieldTypeMultipleValid&&(this.strProgramParameterName.length()>0)
			this.isIGNTestMasterFieldTypeMultipleValid=lIsIGNTestMasterFieldTypeMultipleValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestMasterFieldFactory getParentIGNTestMasterFieldFactory(){
		try{
			return this.parentIGNTestMasterFieldFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterFieldFactory(IGNTestMasterFieldFactory newParentIGNTestMasterFieldFactory){
		//Do Nothing
		//this.parentIGNTestMasterFieldFactory=newParentIGNTestMasterFieldFactory
	}
	public String getStrIGNTestMasterFieldTypeMultipleMessage(){
		try{
			return this.strIGNTestMasterFieldTypeMultipleMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterFieldTypeMultipleMessage(String newStrIGNTestMasterFieldTypeMultipleMessage){
		//Do Nothing
		//this.strIGNTestMasterFieldTypeMultipleMessage=newStrIGNTestMasterFieldTypeMultipleMessage
	}
	public Boolean getIsIGNTestMasterFieldTypeMultipleValid(){
		try{
			return this.isIGNTestMasterFieldTypeMultipleValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterFieldTypeMultipleValid(Boolean newIsIGNTestMasterFieldTypeMultipleValid){
		//Do Nothing
		//this.isIGNTestMasterFieldTypeMultipleValid=newIsIGNTestMasterFieldTypeMultipleValid
	}
	public Integer getNumDataCellColIndex(){
		try{
			return this.numDataCellColIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setNumDataCellColIndex(Integer newNumDataCellColIndex){
		//Do Nothing
		//this.numDataCellColIndex=newNumDataCellColIndex
	}
	public String getStrProjectFieldListFieldName(){
		try{
			return this.strProjectFieldListFieldName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProjectFieldListFieldName(String newStrProjectFieldListFieldName){
		//Do Nothing
		//this.strProjectFieldListFieldName=newStrProjectFieldListFieldName
	}
	public Integer getNumExcelCellColIndex(){
		try{
			return this.numExcelCellColIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setNumExcelCellColIndex(Integer newNumExcelCellColIndex){
		//Do Nothing
		//this.numExcelCellColIndex=newNumExcelCellColIndex
	}
	public String getStrProgramParameterName(){
		try{
			return this.strProgramParameterName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeMultipleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeMultipleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProgramParameterName(String newStrProgramParameterName){
		//Do Nothing
		//this.StrProgramParameterName=newStrProgramParameterName
	}
}