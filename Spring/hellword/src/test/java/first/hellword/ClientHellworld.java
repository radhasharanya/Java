package first.hellword;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientHellworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find xml
Resource r= new ClassPathResource("spring.xml");
//core container(loading xml to container)
BeanFactory fac= new XmlBeanFactory(r);
//creating test class object
Object o=fac.getBean("hello");
Object o1=fac.getBean("hello");
Object o2=fac.getBean("hello");
System.out.println(o==o1);
System.out.println(o1==o2);
System.out.println(o2==o);
Hellworld h=(Hellworld)o;
h.hello();
	}

}