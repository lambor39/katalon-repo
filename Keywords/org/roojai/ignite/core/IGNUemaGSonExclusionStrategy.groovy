package org.roojai.ignite.core
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import org.openqa.selenium.WebDriver
public class IGNUemaGSonExclusionStrategy implements ExclusionStrategy{
	private List<Class> listClassToExclude
	private List<String> listStrFieldToExclude
	public IGNUemaGSonExclusionStrategy(){
		this.listClassToExclude=new ArrayList<Class>()
		this.listClassToExclude.add(WebDriver.class)
		this.listStrFieldToExclude=new ArrayList<String>()
		this.listStrFieldToExclude.add('driver')
		this.listStrFieldToExclude.add('currentWebDriver')
	}
	@Override
	public boolean shouldSkipField(FieldAttributes targetFieldAttribute){
		if(this.listStrFieldToExclude.contains(targetFieldAttribute.getName())){
			//return true
		}
		return false
	}
	@Override
	public boolean shouldSkipClass(Class<?> targetClass){
		if(this.listClassToExclude.contains(targetClass)){
			//return true
		}
		return false
	}
}