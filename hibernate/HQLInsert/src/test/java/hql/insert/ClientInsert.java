package hql.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Oldstudent os= new Oldstudent();
		//os.setId(3);
		os.setName("shar");
		os.setEmail("shar@gmail.com");
		os.setAddress("US");
		s.save(os);
		
		Oldstudent os1= new Oldstudent();
		//os.setId(3);
		os1.setName("shar");
		os1.setEmail("shar@gmail.com");
		os1.setAddress("US");
		s.save(os1);
		
		Transaction t= s.beginTransaction();
		t.commit();
		s.close();
		sf.close();
	}

}
