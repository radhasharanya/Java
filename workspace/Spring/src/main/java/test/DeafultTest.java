package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DefaultCollectionDI;
import bean.RequiredCollectionDI;

public class DeafultTest {

	public static void main(String[] args) {
		/*ApplicationContext ap= new ClassPathXmlApplicationContext("resource/DefauktCollectionDIXml.xml");
DefaultCollectionDI d=(DefaultCollectionDI)ap.getBean("t");
d.printData();*/
		
		
		//required Collection Test
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/RequiredCollectionDI.xml");
		RequiredCollectionDI r= (RequiredCollectionDI)ap.getBean("t");
		r.printData();
	}

}
