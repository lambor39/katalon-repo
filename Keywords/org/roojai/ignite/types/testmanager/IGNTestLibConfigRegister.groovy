package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestStoryAfterToDo
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList
import org.roojai.tha.types.testmanager.THATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate
import org.roojai.idn.types.testmanager.IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate
public class IGNTestLibConfigRegister{
	private IGNTestManager parentIGNTestManager
	private String strIGNTestLibConfigRegisterMessage=''
	private Boolean isIGNTestLibConfigRegisterReady=false
	private TreeMap<Integer,String> mapTestStoryKeyStoryName
	private TreeMap<Integer,IGNTestStoryAfterToDo> mapTestStoryKeyStoryAfterToDo
	public IGNTestLibConfigRegister(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			this.strIGNTestLibConfigRegisterMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				this.initIGNTestLibConfigRegister()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestLibConfigRegister(){
		try{
			this.isIGNTestLibConfigRegisterReady=false
			Boolean lIsIGNTestLibConfigRegisterReady=true
			if(lIsIGNTestLibConfigRegisterReady){
				lIsIGNTestLibConfigRegisterReady=this.prepareMapTestStoryKeyStoryName()
			}
			if(lIsIGNTestLibConfigRegisterReady){
				lIsIGNTestLibConfigRegisterReady=this.prepareMapTestStoryKeyStoryAfterToDo()
			}
			if(lIsIGNTestLibConfigRegisterReady){
				lIsIGNTestLibConfigRegisterReady=lIsIGNTestLibConfigRegisterReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.mapTestStoryKeyStoryName))
				lIsIGNTestLibConfigRegisterReady=lIsIGNTestLibConfigRegisterReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.mapTestStoryKeyStoryAfterToDo))
				lIsIGNTestLibConfigRegisterReady=lIsIGNTestLibConfigRegisterReady&&(this.mapTestStoryKeyStoryName.keySet().equals(this.mapTestStoryKeyStoryAfterToDo.keySet()))
			}
			this.isIGNTestLibConfigRegisterReady=lIsIGNTestLibConfigRegisterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	private Boolean prepareMapTestStoryKeyStoryName(){
		Boolean lreturn=false
		try{
			Boolean lIsPrepareOK=true
			this.mapTestStoryKeyStoryName=new TreeMap<Integer,String>()
			switch(this.parentIGNTestManager.getEnumIGNTestForCountry()){
				case IGNTestForCountry.Indonesia:
					this.mapTestStoryKeyStoryName.put(34,'Group_Pricing_Api_Share_Quote_All_Name_Product_All_Story_Get_Price_List')
					this.mapTestStoryKeyStoryName.put(7,'Group_Sf_Lightning_Share_Quote_Motor_Name_New_Biz_Story_Create')
					this.mapTestStoryKeyStoryName.put(12,'Group_Sf_Lightning_Share_Claim_Motor_Name_New_Biz_Story_Search')
					break
				case IGNTestForCountry.Thailand:
					this.mapTestStoryKeyStoryName.put(34,'Group_Pricing_Api_Share_Quote_All_Name_Product_All_Story_Get_Price_List')
					break
				default:
					break
			}
			if(lIsPrepareOK){
				this.mapTestStoryKeyStoryName.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean prepareMapTestStoryKeyStoryAfterToDo(){
		Boolean lreturn=false
		try{
			Boolean lIsPrepareOK=true
			this.mapTestStoryKeyStoryAfterToDo=new TreeMap<Integer,IGNTestStoryAfterToDo>()
			switch(this.parentIGNTestManager.getEnumIGNTestForCountry()){
				case IGNTestForCountry.Indonesia:
					this.mapTestStoryKeyStoryAfterToDo.put(34,IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)
					this.mapTestStoryKeyStoryAfterToDo.put(7,IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)
					this.mapTestStoryKeyStoryAfterToDo.put(12,IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)
					break
				case IGNTestForCountry.Thailand:
					this.mapTestStoryKeyStoryAfterToDo.put(34,IGNTestStoryAfterToDo.DoAfterTestSuiteAndCollection)
					break
				default:
					break
			}
			if(lIsPrepareOK){
				this.mapTestStoryKeyStoryName.sort(null)
			}
			lreturn=lIsPrepareOK
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestManager getParentIGNTestManager(){
		try{
			return this.parentIGNTestManager
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestManager(IGNTestManager newParentIGNTestManager){
		//Do Nothing
		//this.parentIGNTestManager=newParentIGNTestManager
	}
	public Boolean getIsIGNTestLibConfigRegisterReady(){
		try{
			return this.isIGNTestLibConfigRegisterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestLibConfigRegisterReady(Boolean newIsIGNTestLibConfigRegisterReady){
		//Do Nothing
		//this.isIGNTestLibConfigRegisterReady=newIsIGNTestLibConfigRegisterReady
	}
	public TreeMap<Integer,String> getMapTestStoryKeyStoryName(){
		try{
			return this.mapTestStoryKeyStoryName
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	public void setMapTestStoryKeyStoryName(TreeMap<Integer,String> newMapTestStoryKeyStoryName){
		//Do Nothing
		//this.mapTestStoryKeyStoryName=newMapTestStoryKeyStoryName
	}
	public TreeMap<Integer,IGNTestStoryAfterToDo> getMapTestStoryKeyStoryAfterToDo(){
		try{
			return this.mapTestStoryKeyStoryAfterToDo
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
	}
	public void setMapTestStoryKeyStoryAfterToDo(Map newMapTestStoryKeyStoryAfterToDo){
		//Do Nothing
		//this.mapTestStoryKeyStoryAfterToDo=newMapTestStoryKeyStoryAfterToDo
	}
	public Boolean checkTestStoryKeyExist(Integer numTestStoryKey){
		Boolean lreturn=false
		if(!this.isIGNTestLibConfigRegisterReady){
			return lreturn
		}
		if(this.mapTestStoryKeyStoryName.size()<=0){
			return lreturn
		}
		if(numTestStoryKey<=0){
			return lreturn
		}
		try{
			lreturn=this.mapTestStoryKeyStoryName.containsKey(numTestStoryKey)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public String getTestStoryNameByTestStoryKey(Integer numTestStoryKey){
		String lreturn=null
		if(!this.isIGNTestLibConfigRegisterReady){
			return lreturn
		}
		if(this.mapTestStoryKeyStoryName.size()<=0){
			return lreturn
		}
		if(numTestStoryKey<=0){
			return lreturn
		}
		if(!this.checkTestStoryKeyExist(numTestStoryKey)){
			return lreturn
		}
		try{
			lreturn=this.mapTestStoryKeyStoryName.get(numTestStoryKey)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestStoryAfterToDo getStoryAfterToDoByTestStoryKey(Integer numTestStoryKey){
		IGNTestStoryAfterToDo lreturn=null
		if(!this.isIGNTestLibConfigRegisterReady){
			return lreturn
		}
		if(this.mapTestStoryKeyStoryAfterToDo.size()<=0){
			return lreturn
		}
		if(numTestStoryKey<=0){
			return lreturn
		}
		if(!this.checkTestStoryKeyExist(numTestStoryKey)){
			return lreturn
		}
		try{
			lreturn=this.mapTestStoryKeyStoryAfterToDo.get(numTestStoryKey)
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestLibUtilitySuper getIGNTestLibUtilitySuperInstance(IGNTestExecutorTypeItem ignTestExecutorTypeItem,Integer numTestStoryKey){
		IGNTestLibUtilitySuper lreturn=null
		if(!this.isIGNTestLibConfigRegisterReady){
			return lreturn
		}
		if(this.mapTestStoryKeyStoryAfterToDo.size()<=0){
			return lreturn
		}
		if(IGNUemaHelper.checkObjectNullOfObject(ignTestExecutorTypeItem)){
			return lreturn
		}
		if(numTestStoryKey<=0){
			return lreturn
		}
		if(!this.checkTestStoryKeyExist(numTestStoryKey)){
			return lreturn
		}
		try{
			String lStrInitTestStoryName=this.getTestStoryNameByTestStoryKey(numTestStoryKey)
			IGNTestStoryAfterToDo lEnumInitIGNTestStoryAfterToDo=this.getStoryAfterToDoByTestStoryKey(numTestStoryKey)
			if(IGNUemaHelper.checkObjectNullOrEmptyOfString(lStrInitTestStoryName)){
				return lreturn
			}
			if(IGNUemaHelper.checkObjectNullOfObject(lEnumInitIGNTestStoryAfterToDo)){
				return lreturn
			}
			IGNTestLibUtilitySuper lIGNTestLibUtilitySuper=null
			switch(this.parentIGNTestManager.getEnumIGNTestForCountry()){
				case IGNTestForCountry.Indonesia:
					switch(numTestStoryKey){
						case 34:
						lIGNTestLibUtilitySuper=new IDNTestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList(ignTestExecutorTypeItem,numTestStoryKey,lStrInitTestStoryName,lEnumInitIGNTestStoryAfterToDo)
						break
						case 7:
						lIGNTestLibUtilitySuper=new IDNTestStageControllerGroupSfLightningShareQuoteMotorNameNewBizStoryCreate(ignTestExecutorTypeItem,numTestStoryKey,lStrInitTestStoryName,lEnumInitIGNTestStoryAfterToDo)
						break
						case 12:
						lIGNTestLibUtilitySuper=new IDNTestStageControllerGroupSfLightningShareClaimMotorNameNewBizStoryCreate(ignTestExecutorTypeItem,numTestStoryKey,lStrInitTestStoryName,lEnumInitIGNTestStoryAfterToDo)
						break
						default:
						break
					}
					break
				case IGNTestForCountry.Thailand:
					switch(numTestStoryKey){
						case 34:
						lIGNTestLibUtilitySuper=new THATestStageControllerGroupPricingApiShareQuoteAllNameProductAllStoryGetPriceList(ignTestExecutorTypeItem,numTestStoryKey,lStrInitTestStoryName,lEnumInitIGNTestStoryAfterToDo)
						break
						default:
						break
					}
					break
				default:
					break
			}
			lreturn=lIGNTestLibUtilitySuper
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestLibConfigRegisterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestLibConfigRegisterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
}