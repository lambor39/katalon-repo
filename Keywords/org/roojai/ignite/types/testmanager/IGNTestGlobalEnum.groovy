package org.roojai.ignite.types.testmanager
public class IGNTestGlobalEnum{
	public enum IGNTestForCountry{
		Indonesia('Indonesia'),
		Thailand('Thailand')
		private final String lStrName
		private IGNTestForCountry(String strName){
			try{
				this.lStrName=strName
			}catch(Exception e){
			}
		}
		public Boolean equalsName(String strOtherName){
			Boolean lreturn=false
			if(strOtherName==null) return lreturn
			if(strOtherName.length()<=0) return lreturn
			try{
				lreturn=this.lStrName.equals(strOtherName)
			}catch(Exception e){
			}
			return lreturn
		}
		public String toString(){
			String lreturn=null
			try{
				lreturn=this.lStrName
			}catch(Exception e){
			}
			return lreturn
		}
		public String toRefString(){
			String lreturn=null
			try{
				Integer lNumOrdinal=this.ordinal()
				switch(lNumOrdinal){
					case 1:
						lreturn=this.lStrName
						break
					default:
						lreturn=this.lStrName
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestStoryAfterToDo{
		DoNothing('DoNothing'),
		DoAfterTestSuiteOnly('DoAfterTestSuiteOnly'),
		DoAfterTestCollectionOnly('DoAfterTestCollectionOnly'),
		DoAfterTestSuiteAndCollection('DoAfterTestSuiteAndCollection')
		private final String lStrName
		private IGNTestStoryAfterToDo(String strName){
			try{
				this.lStrName=strName
			}catch(Exception e){
			}
		}
		public Boolean equalsName(String strOtherName){
			Boolean lreturn=false
			if(strOtherName==null) return lreturn
			if(strOtherName.length()<=0) return lreturn
			try{
				lreturn=this.lStrName.equals(strOtherName)
			}catch(Exception e){
			}
			return lreturn
		}
		public String toString(){
			String lreturn=null
			try{
				lreturn=this.lStrName
			}catch(Exception e){
			}
			return lreturn
		}
		public String toRefString(){
			String lreturn=null
			try{
				Integer lNumOrdinal=this.ordinal()
				switch(lNumOrdinal){
					case 1:
						lreturn=this.lStrName
						break
					case 2:
						lreturn=this.lStrName
						break
					case 3:
						lreturn=this.lStrName
						break
					default:
						lreturn=this.lStrName
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public static IGNTestStoryAfterToDo fromRefNameToEnum(String strRefName){
			IGNTestStoryAfterToDo lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestStoryAfterToDo[] lArrayValueAll=IGNTestStoryAfterToDo.values()
					for(IGNTestStoryAfterToDo lArrayValueItem in lArrayValueAll){
						String lStrRefString=lArrayValueItem.toRefString()
						if(lStrRefString.equals(strRefName)){
							lreturn=lArrayValueItem
							break
						}
					}
				}catch(Exception ex){
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public static String fromRefNameToString(String strRefName){
			String lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				IGNTestStoryAfterToDo lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
}