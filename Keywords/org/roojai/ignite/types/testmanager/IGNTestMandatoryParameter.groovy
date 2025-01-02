package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
import org.roojai.ignite.types.testmanager.IGNTestGlobalEnum.IGNTestForCountry
public class IGNTestMandatoryParameter{
	private IGNTestManager parentIGNTestManager
	private String strIGNTestMandatoryParameterMessage=''
	private Boolean isIGNTestMandatoryParameterReady=false
	private List<String> listIGNTestPreDefineParameterOneToOne
	private List<String> listIGNTestPreDefineParameterOneToMany
	public IGNTestMandatoryParameter(IGNTestManager ignTestManager){
		super()
		try{
			this.parentIGNTestManager=ignTestManager
			this.strIGNTestMandatoryParameterMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestManager)){
				this.initIGNTestMandatoryParameter()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMandatoryParameter(){
		try{
			this.isIGNTestMandatoryParameterReady=false
			Boolean lIsIGNTestMandatoryParameterReady=true
			if(lIsIGNTestMandatoryParameterReady){
				lIsIGNTestMandatoryParameterReady=this.initListIGNTestPreDefineParameterOneToOne()
			}
			if(lIsIGNTestMandatoryParameterReady){
				lIsIGNTestMandatoryParameterReady=this.initListIGNTestPreDefineParameterOneToMany()
			}
			if(lIsIGNTestMandatoryParameterReady){
				lIsIGNTestMandatoryParameterReady=lIsIGNTestMandatoryParameterReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.listIGNTestPreDefineParameterOneToOne))
				lIsIGNTestMandatoryParameterReady=lIsIGNTestMandatoryParameterReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.listIGNTestPreDefineParameterOneToMany))
			}
			this.isIGNTestMandatoryParameterReady=lIsIGNTestMandatoryParameterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	private Boolean initListIGNTestPreDefineParameterOneToOne(){
		Boolean lreturn=false
		try{
			this.listIGNTestPreDefineParameterOneToOne=new ArrayList<String>()
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Test_Case_Number',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Group_List_Name',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Group_List_Field_Text',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Group_List_Field_Key',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Group_List_Field_Value',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Story_User_Description',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Test_Case_To_Do',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Test_Case_Config_Valid',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Refer_Case_Number',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Refer_Case_Valid',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Force_Start_To_Do',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Actual_Result',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Result_Message',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Field_Product_Story_Text_Detail',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_02_Sf_Config_Field_Sf_Login_Account_Name',this.listIGNTestPreDefineParameterOneToOne)
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_02_Sf_Config_Field_Sf_Login_Account_Password',this.listIGNTestPreDefineParameterOneToOne)
			if(this.parentIGNTestManager.getEnumIGNTestForCountry()==IGNTestForCountry.Indonesia){
				IGNTestMandatoryForIDN lIGNTestMandatoryForIDN=new IGNTestMandatoryForIDN(this)
				if(lIGNTestMandatoryForIDN.getIsIGNTestMandatoryForIDNReady()){
					List<String> lListIGNTestPreDefineParameterOneToOne=lIGNTestMandatoryForIDN.getListIGNTestPreDefineParameterOneToOne()
					if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
						if(!IGNUemaHelper.checkObjectEmptyOfList(lListIGNTestPreDefineParameterOneToOne)){
							for(String lText in lListIGNTestPreDefineParameterOneToOne){
								IGNUemaHelper.addStringToListOfString(true,lText,this.listIGNTestPreDefineParameterOneToOne)
							}
						}
						lreturn=true
					}
				}
			}else{
				IGNTestMandatoryForTHA lIGNTestMandatoryForTHA=new IGNTestMandatoryForTHA(this)
				if(lIGNTestMandatoryForTHA.getIsIGNTestMandatoryForTHAReady()){
					List<String> lListIGNTestPreDefineParameterOneToOne=lIGNTestMandatoryForTHA.getListIGNTestPreDefineParameterOneToOne()
					if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToOne)){
						if(!IGNUemaHelper.checkObjectEmptyOfList(lListIGNTestPreDefineParameterOneToOne)){
							for(String lText in lListIGNTestPreDefineParameterOneToOne){
								IGNUemaHelper.addStringToListOfString(true,lText,this.listIGNTestPreDefineParameterOneToOne)
							}
						}
						lreturn=true
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestPreDefineParameterOneToMany(){
		Boolean lreturn=false
		try{
			this.listIGNTestPreDefineParameterOneToMany=new ArrayList<String>()
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Output_Item_Index',this.listIGNTestPreDefineParameterOneToMany)
			if(this.parentIGNTestManager.getEnumIGNTestForCountry()==IGNTestForCountry.Indonesia){
				IGNTestMandatoryForIDN lIGNTestMandatoryForIDN=new IGNTestMandatoryForIDN(this)
				if(lIGNTestMandatoryForIDN.getIsIGNTestMandatoryForIDNReady()){
					List<String> lListIGNTestPreDefineParameterOneToMany=lIGNTestMandatoryForIDN.getListIGNTestPreDefineParameterOneToMany()
					if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToMany)){
						if(!IGNUemaHelper.checkObjectEmptyOfList(lListIGNTestPreDefineParameterOneToMany)){
							for(String lText in lListIGNTestPreDefineParameterOneToMany){
								IGNUemaHelper.addStringToListOfString(true,lText,this.listIGNTestPreDefineParameterOneToMany)
							}
						}
						lreturn=true
					}
				}
			}else{
				IGNTestMandatoryForTHA lIGNTestMandatoryForTHA=new IGNTestMandatoryForTHA(this)
				if(lIGNTestMandatoryForTHA.getIsIGNTestMandatoryForTHAReady()){
					List<String> lListIGNTestPreDefineParameterOneToMany=lIGNTestMandatoryForTHA.getListIGNTestPreDefineParameterOneToMany()
					if(!IGNUemaHelper.checkObjectNullOfObject(lListIGNTestPreDefineParameterOneToMany)){
						if(!IGNUemaHelper.checkObjectEmptyOfList(lListIGNTestPreDefineParameterOneToMany)){
							for(String lText in lListIGNTestPreDefineParameterOneToMany){
								IGNUemaHelper.addStringToListOfString(true,lText,this.listIGNTestPreDefineParameterOneToMany)
							}
						}
						lreturn=true
					}
				}
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
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
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestManager(IGNTestManager newParentIGNTestManager){
		//Do Nothing
		//this.parentIGNTestManager=newParentIGNTestManager
	}
	public String getstrIGNTestMandatoryParameterMessage(){
		try{
			return this.strIGNTestMandatoryParameterMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	public void setstrIGNTestMandatoryParameterMessage(String newstrIGNTestMandatoryParameterMessage){
		//Do Nothing
		//this.strIGNTestMandatoryParameterMessage=newstrIGNTestMandatoryParameterMessage
	}
	public Boolean getIsIGNTestMandatoryParameterReady(){
		try{
			return this.isIGNTestMandatoryParameterReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMandatoryParameterReady(Boolean newIsIGNTestMandatoryParameterReady){
		//Do Nothing
		//this.isIGNTestMandatoryParameterReady=newIsIGNTestMandatoryParameterReady
	}
	public List<String> getListIGNTestPreDefineParameterOneToOne(){
		try{
			List<String> lListIGNTestPreDefineParameterOneToOne=new ArrayList<String>()
			lListIGNTestPreDefineParameterOneToOne.addAll(this.listIGNTestPreDefineParameterOneToOne)
			return lListIGNTestPreDefineParameterOneToOne
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestPreDefineParameterOneToOne(List<String> newListIGNTestPreDefineParameterOneToOne){
		//Do Nothing
		//this.listIGNTestPreDefineParameterOneToOne=newListIGNTestPreDefineParameterOneToOne
	}
	public List<String> getListIGNTestPreDefineParameterOneToMany(){
		try{
			List<String> lListIGNTestPreDefineParameterOneToMany=new ArrayList<String>()
			lListIGNTestPreDefineParameterOneToMany.addAll(this.listIGNTestPreDefineParameterOneToMany)
			return lListIGNTestPreDefineParameterOneToMany
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryParameterMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryParameterMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestPreDefineParameterOneToMany(List<String> newListIGNTestPreDefineParameterOneToMany){
		//Do Nothing
		//this.listIGNTestPreDefineParameterOneToMany=newListIGNTestPreDefineParameterOneToMany
	}
}