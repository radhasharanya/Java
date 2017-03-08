package hql.Select;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLAggregate {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	String hql= "select Max(id) from NewStudent" ;
 Query q=s.createQuery(hql);
 
 int i=(Integer)q.uniqueResult();
 
System.out.println("Max id is"+i);
	}
}
