package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Test;

public class client {

	public static void main(String[] args) {
		//find xml
		Resource r= new ClassPathResource("resource/Spring.xml");
		//load xml
		BeanFactory factory = new XmlBeanFactory(r);//core container it will create object on demand means factory.getbeans("t"); lazy container
		//ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring.xml");//while loading an xml file it will create an object eagar container
		//creating test class object 
		
		//pojo
		//xml
		//driver class nothing but client
		Object o=factory.getBean("t");
		Object o1=factory.getBean("t");
		Object o2=factory.getBean("t");
		System.out.println(o==o1);
		System.out.println(o1==o2);
		Test t= (Test)o;
		t.hello();
	
	}

}
