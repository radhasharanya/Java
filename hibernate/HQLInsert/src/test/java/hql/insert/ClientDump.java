package hql.insert;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDump {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	String hql= "insert into NewStudent(id,name,email,address)  select s.id, s.name,s.email,s.address from Oldstudent s" ;
 Query q=s.createQuery(hql);
 int i=q.executeUpdate();
 t.commit();
 System.out.println("no of roows update"+i);
	}
}
