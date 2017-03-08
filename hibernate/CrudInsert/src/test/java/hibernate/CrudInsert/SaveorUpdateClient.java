package hibernate.CrudInsert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

public class SaveorUpdateClient {

	public static void main(String[] args) {
		Student st=new Student();
		st.setId(111);
		st.setName("ac");
		st.setMarks(123);
		st.setEmail("abc@ymail.com");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
s.saveOrUpdate(st);

//save can execute without tranaction boudaries
//persist will execute with in transaction boundaries
		s.beginTransaction().commit();
		
		
		
		s.evict(st);
		s.close();
		sr.close();
		
	}

}
