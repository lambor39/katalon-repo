package org.roojai.idn.types.salesforce.lightning.core
public class IDNSalesforceLightningCoreEnum{
	public enum IDNEnumSalesforceMode{
		Classic('Classic'),
		Lightning('Lightning')
		private final String lStrName
		private IDNEnumSalesforceMode(String strName){
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
		public static IDNEnumSalesforceMode fromRefNameToEnum(String strRefName){
			IDNEnumSalesforceMode lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IDNEnumSalesforceMode[] lArrayValueAll=IDNEnumSalesforceMode.values()
					for(IDNEnumSalesforceMode lArrayValueItem in lArrayValueAll){
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
				IDNEnumSalesforceMode lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IDNEnumSalesforceObjectTypeName{
		Account('Account'),
		Opportunity('Opportunity'),
		Contract('Contract'),
		Quote('Quote'),
		VehicleInspectionData('VehicleInspectionData')
		private final String lStrName
		private IDNEnumSalesforceObjectTypeName(String strName){
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
						lreturn='Opportunities'
						break
					case 2:
						lreturn='Contracts'
						break
					case 3:
						lreturn='Quotes'
						break
					case 4:
						lreturn='Vehicle Inspection Data'
						break
					default:
						lreturn='Accounts'
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public static IDNEnumSalesforceObjectTypeName fromRefNameToEnum(String strRefName){
			IDNEnumSalesforceObjectTypeName lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IDNEnumSalesforceObjectTypeName[] lArrayValueAll=IDNEnumSalesforceObjectTypeName.values()
					for(IDNEnumSalesforceObjectTypeName lArrayValueItem in lArrayValueAll){
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
				IDNEnumSalesforceObjectTypeName lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IDNEnumSalesforceObjectDriverType{
		SameDriver('SameDriver'),
		ExistingDriver('ExistingDriver'),
		NewDriver('NewDriver')
		private final String lStrName
		private IDNEnumSalesforceObjectDriverType(String strName){
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
					case 2:
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
		public static IDNEnumSalesforceObjectDriverType fromRefNameToEnum(String strRefName){
			IDNEnumSalesforceObjectDriverType lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IDNEnumSalesforceObjectDriverType[] lArrayValueAll=IDNEnumSalesforceObjectDriverType.values()
					for(IDNEnumSalesforceObjectDriverType lArrayValueItem in lArrayValueAll){
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
				IDNEnumSalesforceObjectDriverType lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
}