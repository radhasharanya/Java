package _to_1._to_1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		Transaction t =s.beginTransaction();
		Voter v=new Voter();
				v.setVid(111);
		v.setVname("sam");
		v.setVage(23);
		Voting vt= new Voting();
		vt.setPname("BJP");
		vt.setCdate(new Date());
		vt.setVoter(v);
		
		/*Voting vt1= new Voting();
		vt1.setPname("BJP");
		vt1.setCdate(new Date());
		vt1.setVoter(v);*/
		
		s.save(v);
		s.save(vt);
		//s.save(vt1);
		t.commit();
		s.close();
		sr.close();
		System.out.println("Task Complted");
		
		
		
	}

}
