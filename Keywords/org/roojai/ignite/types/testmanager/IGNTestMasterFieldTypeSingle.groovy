package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNGlobalEnum.IGNTestDataFieldType
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestMasterFieldTypeSingle{
	private IGNTestMasterFieldFactory parentIGNTestMasterFieldFactory
	private String strIGNTestMasterFieldTypeSingleMessage=''
	private Boolean isIGNTestMasterFieldTypeSingleValid=false
	private Integer numDataCellColIndex=0
	private String strProductGroupListName=''
	private String strProjectFieldListFieldName=''
	private String strProjectFieldListFieldMasterTypeKey=''
	private Integer numProjectFieldListFieldMasterTypeNum=0
	private String strProjectFieldListFieldMasterDefaultValue=''
	private Map<String,String> mapProjectFieldListFieldMasterPair=[:]
	private Integer numExcelCellColIndex=0
	private String strProgramParameterName
	private IGNTestDataFieldType ignTestDataFiledType
	public IGNTestMasterFieldTypeSingle(IGNTestMasterFieldFactory ignTestMasterFieldFactory,Integer numInitDataCellColIndex,String strInitProductGroupListName,String strInitProjectFieldListFieldName,String strInitProjectFieldListFieldMasterTypeKey,Integer numInitProjectFieldListFieldMasterTypeNum,String strInitProjectFieldListFieldMasterDefaultValue,Map mapInitProjectFieldListFieldMasterPair){
		super()
		try{
			this.parentIGNTestMasterFieldFactory=ignTestMasterFieldFactory
			this.strIGNTestMasterFieldTypeSingleMessage=''
			this.numDataCellColIndex=numInitDataCellColIndex
			this.strProductGroupListName=strInitProductGroupListName.trim()
			this.strProjectFieldListFieldName=strInitProjectFieldListFieldName.trim()
			this.strProjectFieldListFieldMasterTypeKey=strInitProjectFieldListFieldMasterTypeKey.trim()
			this.numProjectFieldListFieldMasterTypeNum=numInitProjectFieldListFieldMasterTypeNum
			this.strProjectFieldListFieldMasterDefaultValue=strInitProjectFieldListFieldMasterDefaultValue.trim()
			this.mapProjectFieldListFieldMasterPair.putAll(mapInitProjectFieldListFieldMasterPair)
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMasterFieldFactory)){
				this.initIGNTestMasterFieldTypeSingle()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMasterFieldTypeSingle(){
		try{
			this.isIGNTestMasterFieldTypeSingleValid=false
			Boolean lIsIGNTestMasterFieldTypeSingleValid=true
			if(this.numDataCellColIndex>0){
				this.numExcelCellColIndex=this.numDataCellColIndex-1
			}
			this.strProgramParameterName=this.strProjectFieldListFieldName.replaceAll('_','').trim()
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.numDataCellColIndex>0)
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProductGroupListName.length()>0)
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProjectFieldListFieldName.length()>0)
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProjectFieldListFieldMasterTypeKey.length()>0)
			Integer lNumProjectFieldListFieldMasterTypeNum=IGNUemaHelper.convertStringToInteger(this.strProjectFieldListFieldMasterTypeKey,0)
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(lNumProjectFieldListFieldMasterTypeNum==this.numProjectFieldListFieldMasterTypeNum)
			switch(this.numProjectFieldListFieldMasterTypeNum){
				case 1:
					this.ignTestDataFiledType=IGNTestDataFieldType.NullableText
					lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProjectFieldListFieldMasterDefaultValue.isBlank())
					lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.mapProjectFieldListFieldMasterPair.isEmpty())
					break
				case 2:
					this.ignTestDataFiledType=IGNTestDataFieldType.PairListWithDefaultKey
					if(this.strProjectFieldListFieldMasterDefaultValue.isBlank()){
						lIsIGNTestMasterFieldTypeSingleValid=false
					}else{
						Integer lNumProjectFieldListFieldMasterDefaultValue=IGNUemaHelper.convertStringToInteger(this.strProjectFieldListFieldMasterDefaultValue,0)
						String lStrProjectFieldListFieldMasterDefaultValue=lNumProjectFieldListFieldMasterDefaultValue.toString()
						if((lNumProjectFieldListFieldMasterDefaultValue>0)&&(lNumProjectFieldListFieldMasterDefaultValue<=99)){
							if(this.mapProjectFieldListFieldMasterPair.isEmpty()){
								lIsIGNTestMasterFieldTypeSingleValid=false
							}else{
								String lStrProjectFieldListFieldMasterPairValue=this.mapProjectFieldListFieldMasterPair.get(lStrProjectFieldListFieldMasterDefaultValue)
								if(!lStrProjectFieldListFieldMasterPairValue){
									lIsIGNTestMasterFieldTypeSingleValid=false
								}else{
									lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(lStrProjectFieldListFieldMasterPairValue.length()>=0)
								}
							}
						}else{
							lIsIGNTestMasterFieldTypeSingleValid=false
						}
					}
					break
				case 3:
					this.ignTestDataFiledType=IGNTestDataFieldType.TextWithDefaultTextIfBlank
					lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProjectFieldListFieldMasterDefaultValue.length()>0)
					lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.mapProjectFieldListFieldMasterPair.isEmpty())
					break
				default:
					lIsIGNTestMasterFieldTypeSingleValid=false
					break
			}
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.numExcelCellColIndex>=0)
			lIsIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid&&(this.strProgramParameterName.length()>0)
			this.isIGNTestMasterFieldTypeSingleValid=lIsIGNTestMasterFieldTypeSingleValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public IGNTestMasterFieldFactory getParentIGNTestMasterFieldFactory(){
		try{
			return this.parentIGNTestMasterFieldFactory
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMasterFieldFactory(IGNTestMasterFieldFactory newParentIGNTestMasterFieldFactory){
		//Do Nothing
		//this.parentIGNTestMasterFieldFactory=newParentIGNTestMasterFieldFactory
	}
	public String getStrIGNTestMasterFieldTypeSingleMessage(){
		try{
			return this.strIGNTestMasterFieldTypeSingleMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrIGNTestMasterFieldTypeSingleMessage(String newStrIGNTestMasterFieldTypeSingleMessage){
		//Do Nothing
		//this.strIGNTestMasterFieldTypeSingleMessage=newStrIGNTestMasterFieldTypeSingleMessage
	}
	public Boolean getIsIGNTestMasterFieldTypeSingleValid(){
		try{
			return this.isIGNTestMasterFieldTypeSingleValid
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMasterFieldTypeSingleValid(Boolean newIsIGNTestMasterFieldTypeSingleValid){
		//Do Nothing
		//this.isIGNTestMasterFieldTypeSingleValid=newIsIGNTestMasterFieldTypeSingleValid
	}
	public Integer getNumDataCellColIndex(){
		try{
			return this.numDataCellColIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setNumDataCellColIndex(Integer newNumDataCellColIndex){
		//Do Nothing
		//this.numDataCellColIndex=newNumDataCellColIndex
	}
	public String getStrProductGroupListName(){
		try{
			return this.strProductGroupListName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProductGroupListName(String newStrProductGroupListName){
		//Do Nothing
		//this.strProductGroupListName=newStrProductGroupListName
	}
	public String getStrProjectFieldListFieldName(){
		try{
			return this.strProjectFieldListFieldName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProjectFieldListFieldName(String newStrProjectFieldListFieldName){
		//Do Nothing
		//this.strProjectFieldListFieldName=newStrProjectFieldListFieldName
	}
	public String getStrProjectFieldListFieldMasterTypeKey(){
		try{
			return this.strProjectFieldListFieldMasterTypeKey
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProjectFieldListFieldMasterTypeKey(String newStrProjectFieldListFieldMasterTypeKey){
		//Do Nothing
		//this.strProjectFieldListFieldMasterTypeKey=newStrProjectFieldListFieldMasterTypeKey
	}
	public Integer getNumProjectFieldListFieldMasterTypeNum(){
		try{
			return this.numProjectFieldListFieldMasterTypeNum
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setNumProjectFieldListFieldMasterTypeNum(Integer newNumProjectFieldListFieldMasterTypeNum){
		//Do Nothing
		//this.numProjectFieldListFieldMasterTypeNum=newNumProjectFieldListFieldMasterTypeNum
	}
	public String getStrProjectFieldListFieldMasterDefaultValue(){
		try{
			return this.strProjectFieldListFieldMasterDefaultValue
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProjectFieldListFieldMasterDefaultValue(String newStrProjectFieldListFieldMasterDefaultValue){
		//Do Nothing
		//this.strProjectFieldListFieldMasterDefaultValue=newStrProjectFieldListFieldMasterDefaultValue
	}
	public Map<String,String> getMapProjectFieldListFieldMasterPair(){
		try{
			Map<String,String> lMapProjectFieldListFieldMasterPair=[:]
			lMapProjectFieldListFieldMasterPair.putAll(this.mapProjectFieldListFieldMasterPair)
			return lMapProjectFieldListFieldMasterPair
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setMapProjectFieldListFieldMasterPair(Map<String,String> newMapProjectFieldListFieldMasterPair){
		//Do Nothing
		//this.mapProjectFieldListFieldMasterPair=newMapProjectFieldListFieldMasterPair
	}
	public Integer getNumExcelCellColIndex(){
		try{
			return this.numExcelCellColIndex
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
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
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setStrProgramParameterName(String newStrProgramParameterName){
		//Do Nothing
		//this.strProgramParameterName=newStrProgramParameterName
	}
	public IGNTestDataFieldType getIGNTestDataFiledType(){
		try{
			return this.ignTestDataFiledType
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
	}
	public void setIGNTestDataFiledType(IGNTestDataFieldType newIGNTestDataFiledType){
		//Do Nothing
		//this.ignTestDataFiledType=newIGNTestDataFiledType
	}
	public String getMasterPairValueByKey(String strMasterPairKey){
		String lreturn=null
		if(!this.isIGNTestMasterFieldTypeSingleValid){
			return lreturn
		}
		if(!(this.numProjectFieldListFieldMasterTypeNum==2)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strMasterPairKey)){
			return lreturn
		}
		String lStrMasterPairKey=strMasterPairKey.trim()
		if(lStrMasterPairKey.isBlank()){
			return lreturn
		}
		try{
			String lStrMasterPairValue=this.mapProjectFieldListFieldMasterPair.get(lStrMasterPairKey)
			lreturn=lStrMasterPairValue
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public String getMasterPairKeyByValue(String strMasterPairValue){
		String lreturn=null
		if(!this.isIGNTestMasterFieldTypeSingleValid){
			return lreturn
		}
		if(!(this.numProjectFieldListFieldMasterTypeNum==2)){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strMasterPairValue)){
			return lreturn
		}
		String lStrMasterPairValue=strMasterPairValue.trim()
		try{
			for(Map.Entry lEntryMasterPair in this.mapProjectFieldListFieldMasterPair){
				String lEntryMasterPairValue=lEntryMasterPair.value
				if(lEntryMasterPairValue.isBlank()){
					if(lStrMasterPairValue.isBlank()){
						lreturn=lEntryMasterPair.key
						break
					}
				}else{
					if(!lStrMasterPairValue.isBlank()){
						if(lEntryMasterPairValue.equals(lStrMasterPairValue)){
							lreturn=lEntryMasterPair.key
							break
						}
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public String getMasterPairDefaultValue(){
		String lreturn=null
		if(!this.isIGNTestMasterFieldTypeSingleValid){
			return lreturn
		}
		if(!(this.numProjectFieldListFieldMasterTypeNum==2)){
			return lreturn
		}
		try{
			String lStrMasterPairKey=this.strProjectFieldListFieldMasterDefaultValue
			String lStrMasterPairValue=this.getMasterPairValueByKey(lStrMasterPairKey)
			lreturn=lStrMasterPairValue
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public String getStrValidatedValueFromIGNTestDataFiledType(String strInputParameterKey){
		String lreturn=null
		if(!this.isIGNTestMasterFieldTypeSingleValid){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(strInputParameterKey)){
			return lreturn
		}
		String lStrInputParameterKey=strInputParameterKey.trim()
		try{
			lreturn=IGNUemaHelper.getStrValidatedValueFromIGNTestDataFiledType(this.ignTestDataFiledType,lStrInputParameterKey,this.strProjectFieldListFieldMasterDefaultValue,this.getMapProjectFieldListFieldMasterPair())
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMasterFieldTypeSingleMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMasterFieldTypeSingleMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}