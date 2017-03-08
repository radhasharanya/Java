package HAS_A_MANY_TO_ONE.ORMRELATIONS;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		Actor a= new Actor();
		a.setAid(1);
		a.setName("Nani");
		Movies m=new Movies();
		m.setMid(1);
		m.setMoviename("pilajanmindhar");
		m.setActor(a);
		Movies m1=new Movies();
		m1.setMid(2);
		m1.setMoviename("pkk");
		m1.setActor(a);
		
		
		s.save(a);
		s.save(m);
		s.save(m1);
		t.commit();
		System.out.println("Task completed");
		
		
		
		

	}

}
