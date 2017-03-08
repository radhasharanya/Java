package io.egpractise.hibernatfirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Student st= new Student();
		st.setId(1);
		st.setName("abc");
		st.setEmail("abc@gmail.com");
	
		st.setMarks(500);
		//obj transient
		Configuration cfg=new  Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(st);
		// obj presisent
		s.beginTransaction().commit();
		//student object will in to student table in to the database
		s.evict(st);//student object will be removed from presistence ,grabage collector can collect your student object
		
		
	}

}
