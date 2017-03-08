package hql.Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hql.Select.Oldstudent;

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
		
		Transaction t= s.beginTransaction();
		t.commit();
		s.close();
		sf.close();
	}

}
