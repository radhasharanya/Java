package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.PropertiesDI;


public class PropertiesDITest {

	public static void main(String[] args) {
	
		//ApplicationContext ap= new ClassPathXmlApplicationContext("resource/PropertiesDI.xml");
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/PropertiesFile.xml");
		PropertiesDI d=(PropertiesDI)ap.getBean("t");
		d.printdata();
	}

}
