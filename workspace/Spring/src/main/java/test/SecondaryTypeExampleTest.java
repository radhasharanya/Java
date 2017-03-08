package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.SecondaryTypeExampleCar;

public class SecondaryTypeExampleTest {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/SecondaryTypeExamplexml.xml");
		SecondaryTypeExampleCar c=(SecondaryTypeExampleCar)ap.getBean("car");
		c.data();
		
	}

}
