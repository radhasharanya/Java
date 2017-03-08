package test;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;

public class NewClient {
	

public static void main(String[] args) {
	/*//find xml
	Resource r= new ClassPathResource("resource/xmlspring.xml");
	//load xml
	BeanFactory factory = new XmlBeanFactory(r);
	System.out.println("Document valid");
	factory.getBean("t");//if the scope is singleton it will create object here
	factory.getBean("t");
	factory.getBean("t");
	
	ApplicationContext ap= new ClassPathXmlApplicationContext("resource/xmlspring.xml");//check xml document// it will create instance to single ton beans
	ap.getBean("t");
	ap.getBean("t");
	ap.getBean("t");
	*/
	//to access private constructors in java
	
	try{
		Class c= Class.forName("bean.TestClass");
		Constructor con[]=c.getDeclaredConstructors();
		con[0].setAccessible(true);
		con[0].newInstance(null);
	}
	catch(Exception e)
	{
		
	}
}
}
