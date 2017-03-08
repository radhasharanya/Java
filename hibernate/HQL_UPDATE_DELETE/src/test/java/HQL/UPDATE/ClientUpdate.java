package HQL.UPDATE;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		
	String hql="update Student set id=3 where id=4";
	Query q=s.createQuery(hql);
	q.executeUpdate();
	t.commit();
		
	}

}
