package org.roojai.ignite.types.testmanager
import org.roojai.ignite.core.IGNUemaHelper as IGNUemaHelper
public class IGNTestMandatoryForIDN{
	private IGNTestMandatoryParameter parentIGNTestMandatoryParameter
	private String strIGNTestMandatoryForIDNMessage=''
	private Boolean isIGNTestMandatoryForIDNReady=false
	private List<String> listIGNTestPreDefineParameterOneToOne
	private List<String> listIGNTestPreDefineParameterOneToMany
	public IGNTestMandatoryForIDN(IGNTestMandatoryParameter ignTestMandatoryParameter){
		super()
		try{
			this.parentIGNTestMandatoryParameter=ignTestMandatoryParameter
			this.strIGNTestMandatoryForIDNMessage=''
			if(!IGNUemaHelper.checkObjectNullOfObject(this.parentIGNTestMandatoryParameter)){
				this.initIGNTestMandatoryForIDN()
			}
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
	}
	private void initIGNTestMandatoryForIDN(){
		try{
			this.isIGNTestMandatoryForIDNReady=false
			Boolean lIsIGNTestMandatoryForIDNReady=true
			if(lIsIGNTestMandatoryForIDNReady){
				lIsIGNTestMandatoryForIDNReady=this.initListIGNTestPreDefineParameterOneToOne()
			}
			if(lIsIGNTestMandatoryForIDNReady){
				lIsIGNTestMandatoryForIDNReady=this.initListIGNTestPreDefineParameterOneToMany()
			}
			if(lIsIGNTestMandatoryForIDNReady){
				lIsIGNTestMandatoryForIDNReady=lIsIGNTestMandatoryForIDNReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.listIGNTestPreDefineParameterOneToOne))
				lIsIGNTestMandatoryForIDNReady=lIsIGNTestMandatoryForIDNReady&&(!IGNUemaHelper.checkObjectNullOfObject(this.listIGNTestPreDefineParameterOneToMany))
			}
			this.isIGNTestMandatoryForIDNReady=lIsIGNTestMandatoryForIDNReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
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
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	private Boolean initListIGNTestPreDefineParameterOneToMany(){
		Boolean lreturn=false
		try{
			this.listIGNTestPreDefineParameterOneToMany=new ArrayList<String>()
			IGNUemaHelper.addStringToListOfString(true,'Group_All_Global_Share_Control_Stage_01_Main_Output_Item_Index',this.listIGNTestPreDefineParameterOneToMany)
			lreturn=true
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
		return lreturn
	}
	public IGNTestMandatoryParameter getParentIGNTestMandatoryParameter(){
		try{
			return this.parentIGNTestMandatoryParameter
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
	}
	public void setParentIGNTestMandatoryParameter(IGNTestMandatoryParameter newParentIGNTestMandatoryParameter){
		//Do Nothing
		//this.parentIGNTestMandatoryParameter=newParentIGNTestMandatoryParameter
	}
	public String getstrIGNTestMandatoryForIDNMessage(){
		try{
			return this.strIGNTestMandatoryForIDNMessage
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
	}
	public void setstrIGNTestMandatoryForIDNMessage(String newstrIGNTestMandatoryForIDNMessage){
		//Do Nothing
		//this.strIGNTestMandatoryForIDNMessage=newstrIGNTestMandatoryForIDNMessage
	}
	public Boolean getIsIGNTestMandatoryForIDNReady(){
		try{
			return this.isIGNTestMandatoryForIDNReady
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
	}
	public void setIsIGNTestMandatoryForIDNReady(Boolean newIsIGNTestMandatoryForIDNReady){
		//Do Nothing
		//this.isIGNTestMandatoryForIDNReady=newIsIGNTestMandatoryForIDNReady
	}
	public List<String> getListIGNTestPreDefineParameterOneToOne(){
		try{
			List<String> lListIGNTestPreDefineParameterOneToOne=new ArrayList<String>()
			lListIGNTestPreDefineParameterOneToOne.addAll(this.listIGNTestPreDefineParameterOneToOne)
			return lListIGNTestPreDefineParameterOneToOne
		}catch(Exception e){
			//e.printStackTrace()
			try{
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
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
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,e.getStackTrace()[0].getMethodName(),e.getMessage())
			}catch(Exception ex){
				//ex.printStackTrace()
				this.strIGNTestMandatoryForIDNMessage=IGNUemaHelper.concatExceptionMessageLeftRight(this.strIGNTestMandatoryForIDNMessage,'',e.getMessage())
			}
		}
	}
	public void setListIGNTestPreDefineParameterOneToMany(List<String> newListIGNTestPreDefineParameterOneToMany){
		//Do Nothing
		//this.listIGNTestPreDefineParameterOneToMany=newListIGNTestPreDefineParameterOneToMany
	}
}