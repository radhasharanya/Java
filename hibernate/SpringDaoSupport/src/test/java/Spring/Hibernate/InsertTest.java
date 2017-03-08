package Spring.Hibernate;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {

	public static void main(String[] args) {
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("applicationContext.xml");
 
	      
	    EmployeeDao dao=(EmployeeDao)appContext.getBean("d");  
	    Employee e =new Employee();
	      
	    
	    e.setId(123);  
	    e.setName("abc");  
	    e.setSalary(50000);  
	      
	    dao.saveEmployee(e);  

	}

}
