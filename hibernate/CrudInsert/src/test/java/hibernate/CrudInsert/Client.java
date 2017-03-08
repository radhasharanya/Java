package hibernate.CrudInsert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

public class Client {

	public static void main(String[] args) {
		Student st=new Student();
		st.setId(11);
		st.setName("ac");
		st.setMarks(123);
		st.setEmail("abc@gmail.com");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
int pk=(Integer)s.save(st);
		s.beginTransaction().commit();
		System.out.println(pk);
		
		
		s.evict(st);
		s.close();
		sr.close();
		
	}

}
