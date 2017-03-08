package cache.FirstLevelCache1;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Client {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	NewStudent s1=(NewStudent)s.get(NewStudent.class, 7);
	System.out.println("==============================");
	System.out.println(s1.getName()+"\t"+s1.getEmail());
	NewStudent s2=(NewStudent)s.get(NewStudent.class, 7);
	System.out.println("==============================");
	System.out.println(s2.getName()+"\t"+s2.getEmail());
	
	
	/*NewStudent s1=(NewStudent)s.get(NewStudent.class, 7);
	System.out.println("==============================");
	System.out.println(s1.getName()+"\t"+s1.getEmail());
	NewStudent s2=(NewStudent)s.get(NewStudent.class, 6);
	System.out.println("==============================");
	System.out.println(s2.getName()+"\t"+s2.getEmail());*/
	Session ses= sf.openSession();
	System.out.println("==============================SECOND SEssion====");
	NewStudent s4=(NewStudent)ses.get(NewStudent.class, 7);
	
	System.out.println(s4.getName()+"\t"+s4.getEmail());
	NewStudent s3=(NewStudent)ses.get(NewStudent.class, 7);
	System.out.println("==============================");
	System.out.println(s3.getName()+"\t"+s3.getEmail());
	
	
	}
}
