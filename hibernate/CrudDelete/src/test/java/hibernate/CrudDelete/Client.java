package hibernate.CrudDelete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

import hibernate.CrudDelete.Student;

public class Client {

	public static void main(String[] args) {
	
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.CrudDelete");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		Transaction t = s.beginTransaction();
		//s.get(Student.class, 11); throw an exception for delete also
		Student st=new Student();
		st.setId(11);
		s.delete(st);
		
t.commit();
		

		s.close();
		sr.close();
		System.out.println("Deleted sucess");
		
	}

}
