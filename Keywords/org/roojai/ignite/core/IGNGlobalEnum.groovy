package org.roojai.ignite.core
public class IGNGlobalEnum{
	public enum IGNTestDataCountry{
		Ignite('Ignite'),
		Indonesia('Indonesia'),
		Thailand('Thailand')
		private final String lStrName
		private IGNTestDataCountry(String strName){
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
					default:
						lreturn=this.lStrName
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public static IGNTestDataCountry fromRefNameToEnum(String strRefName){
			IGNTestDataCountry lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestDataCountry[] lArrayValueAll=IGNTestDataCountry.values()
					for(IGNTestDataCountry lArrayValueItem in lArrayValueAll){
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
				IGNTestDataCountry lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestDataCompany{
		Ignite('Ignite'),
		All('All'),
		Roojai('Roojai'),
		MrKumka('MrKumka'),
		LifePal('LifePal')
		private final String lStrName
		private IGNTestDataCompany(String strName){
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
		public static IGNTestDataCompany fromRefNameToEnum(String strRefName){
			IGNTestDataCompany lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestDataCompany[] lArrayValueAll=IGNTestDataCompany.values()
					for(IGNTestDataCompany lArrayValueItem in lArrayValueAll){
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
				IGNTestDataCompany lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestDataExcelStoreType{
		SingleProductSingleUser('SingleProductSingleUser'),
		MultipleProductMultipleUser('MultipleProductMultipleUser')
		private final String lStrName
		private IGNTestDataExcelStoreType(String strName){
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
		public static IGNTestDataExcelStoreType fromRefNameToEnum(String strRefName){
			IGNTestDataExcelStoreType lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestDataExcelStoreType[] lArrayValueAll=IGNTestDataExcelStoreType.values()
					for(IGNTestDataExcelStoreType lArrayValueItem in lArrayValueAll){
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
				IGNTestDataExcelStoreType lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestDataFieldType{
		NullableText('NullableText'),
		PairListWithDefaultKey('PairListWithDefaultKey'),
		TextWithDefaultTextIfBlank('TextWithDefaultTextIfBlank')
		private final String lStrName
		private IGNTestDataFieldType(String strName){
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
					default:
						lreturn=this.lStrName
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public static IGNTestDataFieldType fromRefNameToEnum(String strRefName){
			IGNTestDataFieldType lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestDataFieldType[] lArrayValueAll=IGNTestDataFieldType.values()
					for(IGNTestDataFieldType lArrayValueItem in lArrayValueAll){
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
				IGNTestDataFieldType lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestResultExpected{
		Positive('Positive'),
		IgnoreAsPositive('IgnoreAsPositive'),
		Negative('Negative'),
		IgnoreAsNegative('IgnoreAsNegative')
		private final String lStrName
		private IGNTestResultExpected(String strName){
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
		public static IGNTestResultExpected fromRefNameToEnum(String strRefName){
			IGNTestResultExpected lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestResultExpected[] lArrayValueAll=IGNTestResultExpected.values()
					for(IGNTestResultExpected lArrayValueItem in lArrayValueAll){
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
				IGNTestResultExpected lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean toBoolean(){
			Boolean lreturn=null
			try{
				Integer lNumOrdinal=this.ordinal()
				switch(lNumOrdinal){
					case 1:
						lreturn=true
						break
					case 2:
						lreturn=false
						break
					case 3:
						lreturn=false
						break
					default:
						lreturn=true
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNTestResultActual{
		PassedNoWarning('PassedNoWarning'),
		PassedWithWarning('PassedWithWarning'),
		FailedNoWarning('FailedNoWarning'),
		FailedWithWarning('FailedWithWarning'),
		Error('Error'),
		SkippedAsPassed('SkippedAsPassed'),
		SkippedAsFailed('SkippedAsFailed')
		private final String lStrName
		private IGNTestResultActual(String strName){
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
					case 4:
						lreturn=this.lStrName
						break
					case 5:
						lreturn=this.lStrName
						break
					case 6:
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
		public static IGNTestResultActual fromRefNameToEnum(String strRefName){
			IGNTestResultActual lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNTestResultActual[] lArrayValueAll=IGNTestResultActual.values()
					for(IGNTestResultActual lArrayValueItem in lArrayValueAll){
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
				IGNTestResultActual lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean toBoolean(){
			Boolean lreturn=null
			try{
				Integer lNumOrdinal=this.ordinal()
				switch(lNumOrdinal){
					case 1:
						lreturn=true
						break
					case 2:
						lreturn=false
						break
					case 3:
						lreturn=false
						break
					case 4:
						lreturn=false
						break
					case 5:
						lreturn=true
						break
					case 6:
						lreturn=false
						break
					default:
						lreturn=true
						break
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNWebElementTargetProceedDOM{
		WebElementProceedFind('WebElementProceedFind'),
		WebElementProceedList('WebElementProceedList'),
		WebElementProceedMatch('WebElementProceedMatch')
		private final String lStrName
		private IGNWebElementTargetProceedDOM(String strName){
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
		public static IGNWebElementTargetProceedDOM fromRefNameToEnum(String strRefName){
			IGNWebElementTargetProceedDOM lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNWebElementTargetProceedDOM[] lArrayValueAll=IGNWebElementTargetProceedDOM.values()
					for(IGNWebElementTargetProceedDOM lArrayValueItem in lArrayValueAll){
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
				IGNWebElementTargetProceedDOM lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNWebElementTargetItem{
		WebElementItemSingle('WebElementItemSingle'),
		WebElementItemMultiple('WebElementItemMultiple')
		private final String lStrName
		private IGNWebElementTargetItem(String strName){
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
		public static IGNWebElementTargetItem fromRefNameToEnum(String strRefName){
			IGNWebElementTargetItem lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNWebElementTargetItem[] lArrayValueAll=IGNWebElementTargetItem.values()
					for(IGNWebElementTargetItem lArrayValueItem in lArrayValueAll){
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
				IGNWebElementTargetItem lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean checkIsItemMultiple(){
			Boolean lreturn=false
			try{
				if(this.lStrName.contains('ItemMultiple')){
					lreturn=true
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNWebElementTargetFindDOM{
		WebElementFindDOMNormal('WebElementFindDOMNormal'),
		WebElementFindDOMShadow('WebElementFindDOMShadow')
		private final String lStrName
		private IGNWebElementTargetFindDOM(String strName){
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
		public static IGNWebElementTargetFindDOM fromRefNameToEnum(String strRefName){
			IGNWebElementTargetFindDOM lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNWebElementTargetFindDOM[] lArrayValueAll=IGNWebElementTargetFindDOM.values()
					for(IGNWebElementTargetFindDOM lArrayValueItem in lArrayValueAll){
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
				IGNWebElementTargetFindDOM lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean checkIsFindDOMNormal(){
			Boolean lreturn=false
			try{
				if(this.lStrName.contains('FindDOMNormal')){
					lreturn=true
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNWebElementTargetDOM{
		WebElementDOMFindAsMultipleByNormal('WebElementDOMFindAsMultipleByNormal'),
		WebElementDOMFindAsMultipleByShadow('WebElementDOMFindAsMultipleByShadow'),
		WebElementDOMFindAsSingleByNormal('WebElementDOMFindAsSingleByNormal'),
		WebElementDOMFindAsSingleByShadow('WebElementDOMFindAsSingleByShadow'),
		WebElementDOMListChildrenAsMultipleByNormal('WebElementDOMListChildrenAsMultipleByNormal'),
		WebElementDOMListChildrenAsMultipleByShadow('WebElementDOMListChildrenAsMultipleByShadow'),
		WebElementDOMListWildcardAsMultipleByNormal('WebElementDOMListWildcardAsMultipleByNormal'),
		WebElementDOMListWildcardAsMultipleByShadow('WebElementDOMListWildcardAsMultipleByShadow'),
		WebElementDOMMatchContainAllAsMultiple('WebElementDOMMatchContainAllAsMultiple'),
		WebElementDOMMatchEqualAllAsMultiple('WebElementDOMMatchEqualAllAsMultiple'),
		WebElementDOMMatchPrefixAllAsMultiple('WebElementDOMMatchPrefixAllAsMultiple'),
		WebElementDOMMatchSuffixAllAsMultiple('WebElementDOMMatchSuffixAllAsMultiple')
		private final String lStrName
		private IGNWebElementTargetDOM(String strName){
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
					case 4:
						lreturn=this.lStrName
						break
					case 5:
						lreturn=this.lStrName
						break
					case 6:
						lreturn=this.lStrName
						break
					case 7:
						lreturn=this.lStrName
						break
					case 8:
						lreturn=this.lStrName
						break
					case 9:
						lreturn=this.lStrName
						break
					case 10:
						lreturn=this.lStrName
						break
					case 11:
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
		public static IGNWebElementTargetDOM fromRefNameToEnum(String strRefName){
			IGNWebElementTargetDOM lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNWebElementTargetDOM[] lArrayValueAll=IGNWebElementTargetDOM.values()
					for(IGNWebElementTargetDOM lArrayValueItem in lArrayValueAll){
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
				IGNWebElementTargetDOM lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public IGNWebElementTargetProceedDOM toIGNWebElementTargetProceedDOM(){
			IGNWebElementTargetProceedDOM lreturn=null
			try{
				if(this.lStrName.contains('DOMFind')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedFind
				}else if(this.lStrName.contains('DOMList')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedList
				}else if(this.lStrName.contains('DOMMatch')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedMatch
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public IGNWebElementTargetItem toIGNWebElementTargetItem(){
			IGNWebElementTargetItem lreturn=null
			try{
				if(this.lStrName.contains('AsMultiple')){
					lreturn=IGNWebElementTargetItem.WebElementItemMultiple
				}else if(this.lStrName.contains('AsSingle')){
					lreturn=IGNWebElementTargetItem.WebElementItemSingle
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public IGNWebElementTargetFindDOM toIGNWebElementTargetFindDOM(){
			IGNWebElementTargetFindDOM lreturn=null
			try{
				IGNWebElementTargetProceedDOM lIGNWebElementTargetProceedDOM=this.toIGNWebElementTargetProceedDOM()
				if(lIGNWebElementTargetProceedDOM==IGNWebElementTargetProceedDOM.WebElementProceedFind){
					if(this.lStrName.contains('ByNormal')){
						lreturn=IGNWebElementTargetFindDOM.WebElementFindDOMNormal
					}else if(this.lStrName.contains('ByShadow')){
						lreturn=IGNWebElementTargetFindDOM.WebElementFindDOMShadow
					}
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean checkIsItemMultiple(){
			Boolean lreturn=false
			try{
				IGNWebElementTargetItem lIGNWebElementTargetItem=this.toIGNWebElementTargetItem()
				if(lIGNWebElementTargetItem==IGNWebElementTargetItem.WebElementItemMultiple){
					lreturn=true
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean checkIsFindDOMNormal(){
			Boolean lreturn=false
			try{
				IGNWebElementTargetFindDOM lIGNWebElementTargetFindDOM=this.toIGNWebElementTargetFindDOM()
				if(lIGNWebElementTargetFindDOM==IGNWebElementTargetFindDOM.WebElementFindDOMNormal){
					lreturn=true
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
	public enum IGNWebElementFindByMethod{
		WebElementFindAsMultipleByCssLocator('WebElementFindAsMultipleByCssLocator'),
		WebElementFindAsMultipleByCssSelector('WebElementFindAsMultipleByCssSelector'),
		WebElementFindAsMultipleByDataSeleniumOneKey('WebElementFindAsMultipleByDataSeleniumOneKey'),
		WebElementFindAsMultipleByLinkTextFull('WebElementFindAsMultipleByLinkTextFull'),
		WebElementFindAsMultipleByLinkTextPartial('WebElementFindAsMultipleByLinkTextPartial'),
		WebElementFindAsMultipleByTagName('WebElementFindAsMultipleByTagName'),
		WebElementFindAsMultipleByXPath('WebElementFindAsMultipleByXPath'),
		WebElementFindAsSingleByCssLocator('WebElementFindAsSingleByCssLocator'),
		WebElementFindAsSingleByCssSelector('WebElementFindAsSingleByCssSelector'),
		WebElementFindAsSingleByDataSeleniumOneKey('WebElementFindAsSingleByDataSeleniumOneKey'),
		WebElementFindAsSingleByDataSeleniumPairKeyValueContain('WebElementFindAsSingleByDataSeleniumPairKeyValueContain'),
		WebElementFindAsSingleByDataSeleniumPairKeyValueEqual('WebElementFindAsSingleByDataSeleniumPairKeyValueEqual'),
		WebElementFindAsSingleByLinkTextFull('WebElementFindAsSingleByLinkTextFull'),
		WebElementFindAsSingleByLinkTextPartial('WebElementFindAsSingleByLinkTextPartial'),
		WebElementFindAsSingleByTagName('WebElementFindAsSingleByTagName'),
		WebElementFindAsSingleByXPath('WebElementFindAsSingleByXPath'),
		WebElementListAsMultipleByChildrenOfRoot('WebElementListAsMultipleByChildrenOfRoot'),
		WebElementListAsMultipleByWildcardOfRoot('WebElementListAsMultipleByWildcardOfRoot'),
		WebElementMatchAsMultipleByAttributeClass('WebElementMatchAsMultipleByAttributeClass'),
		WebElementMatchAsMultipleByAttributeName('WebElementMatchAsMultipleByAttributeName'),
		WebElementMatchAsMultipleByAttributeValue('WebElementMatchAsMultipleByAttributeValue'),
		WebElementMatchAsMultipleByGetChildText('WebElementMatchAsMultipleByGetChildText'),
		WebElementMatchAsMultipleByGetText('WebElementMatchAsMultipleByGetText'),
		WebElementMatchAsMultipleByTagName('WebElementMatchAsMultipleByTagName')
		private final String lStrName
		private IGNWebElementFindByMethod(String strName){
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
					case 4:
						lreturn=this.lStrName
						break
					case 5:
						lreturn=this.lStrName
						break
					case 6:
						lreturn=this.lStrName
						break
					case 7:
						lreturn=this.lStrName
						break
					case 8:
						lreturn=this.lStrName
						break
					case 9:
						lreturn=this.lStrName
						break
					case 10:
						lreturn=this.lStrName
						break
					case 11:
						lreturn=this.lStrName
						break
					case 12:
						lreturn=this.lStrName
						break
					case 13:
						lreturn=this.lStrName
						break
					case 14:
						lreturn=this.lStrName
						break
					case 15:
						lreturn=this.lStrName
						break
					case 16:
						lreturn=this.lStrName
						break
					case 17:
						lreturn=this.lStrName
						break
					case 18:
						lreturn=this.lStrName
						break
					case 19:
						lreturn=this.lStrName
						break
					case 20:
						lreturn=this.lStrName
						break
					case 21:
						lreturn=this.lStrName
						break
					case 22:
						lreturn=this.lStrName
						break
					case 23:
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
		public static IGNWebElementFindByMethod fromRefNameToEnum(String strRefName){
			IGNWebElementFindByMethod lreturn=null
			if(strRefName==null) return lreturn
			if(strRefName.length()<=0) return lreturn
			try{
				try{
					IGNWebElementFindByMethod[] lArrayValueAll=IGNWebElementFindByMethod.values()
					for(IGNWebElementFindByMethod lArrayValueItem in lArrayValueAll){
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
				IGNWebElementFindByMethod lEnumValue=this.fromRefNameToEnum(strRefName)
				if(lEnumValue!=null){
					lreturn=lEnumValue.toString()
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public IGNWebElementTargetProceedDOM toIGNWebElementTargetProceedDOM(){
			IGNWebElementTargetProceedDOM lreturn=null
			try{
				if(this.lStrName.contains('WebElementFind')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedFind
				}else if(this.lStrName.contains('WebElementList')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedList
				}else if(this.lStrName.contains('WebElementMatch')){
					lreturn=IGNWebElementTargetProceedDOM.WebElementProceedMatch
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public IGNWebElementTargetItem toIGNWebElementTargetItem(){
			IGNWebElementTargetItem lreturn=null
			try{
				if(this.lStrName.contains('AsMultiple')){
					lreturn=IGNWebElementTargetItem.WebElementItemMultiple
				}else if(this.lStrName.contains('AsSingle')){
					lreturn=IGNWebElementTargetItem.WebElementItemSingle
				}
			}catch(Exception e){
			}
			return lreturn
		}
		public Boolean checkIsItemMultiple(){
			Boolean lreturn=false
			try{
				IGNWebElementTargetItem lIGNWebElementTargetItem=this.toIGNWebElementTargetItem()
				if(lIGNWebElementTargetItem==IGNWebElementTargetItem.WebElementItemMultiple){
					lreturn=true
				}
			}catch(Exception e){
			}
			return lreturn
		}
	}
}