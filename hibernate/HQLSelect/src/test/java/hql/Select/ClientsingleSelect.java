package hql.Select;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientsingleSelect {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	String hql= "select name from NewStudent" ;
 Query q=s.createQuery(hql);
 
 Object o=q.uniqueResult();
 Oldstudent os=(Oldstudent)o;
 System.out.println(os.getId()+""+os.getName()+""+os.getEmail()+""+os.getAddress());
 t.commit();
 //System.out.println("no of roows update"+i);
	}
}
