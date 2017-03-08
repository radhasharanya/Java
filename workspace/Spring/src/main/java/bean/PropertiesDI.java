package bean;

import java.util.Properties;
import java.util.Set;



public class PropertiesDI {
	
	private Properties driver;
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public void printdata(){
	Set keys=driver.keySet();
	for(Object key:keys)
	{
		System.out.println(key+":"+driver.getProperty(key.toString()));
	}
	}
	
}
