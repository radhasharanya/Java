package CriteriasTest.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsertTest {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		Employee emp= new Employee();
		emp.setName("aaa");
		emp.setEmail("email@gmail.com");
		emp.setSalary(7000);
		s.save(emp);
		
		Employee emp1= new Employee();
		emp1.setName("bbb");
		emp1.setEmail("email1@gmail.com");
		emp1.setSalary(8000);
		s.save(emp1);
		
		
		Employee emp2= new Employee();
		emp2.setName("ccc");
		emp2.setEmail("email2@gmail.com");
		emp2.setSalary(9009);
		
		s.save(emp2);
		t.commit();
		s.close();
		sf.close();
	}

}
