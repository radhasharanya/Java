package DependencyInjection.SetterDI;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientOneVaribleSDI {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Object o= ap.getBean("hello");
		OneVariableSDI c = (OneVariableSDI)o;
		c.hello();

	}

}
