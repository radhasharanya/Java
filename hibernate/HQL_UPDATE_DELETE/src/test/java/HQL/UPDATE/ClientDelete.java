package HQL.UPDATE;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDelete {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		
	String hql="Delete Student where id=3";
	Query q=s.createQuery(hql);
	q.executeUpdate();
	t.commit();

	}

}
