package CriteriasTest.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class SelectusingAggregrate {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		Criteria c=s.createCriteria(Employee.class);
		/*Projection p=Projections.avg("salary");
		c.setProjection(p);
		double d=(Double)c.uniqueResult();
		System.out.println(d);
		*/
		/*Projection p=Projections.max("salary");
		c.setProjection(p);
		int d=(Integer)c.uniqueResult();
		System.out.println(d);*/
		Projection p=Projections.sum("salary");
		c.setProjection(p);
		long d=(Long)c.uniqueResult();
		System.out.println(d);
		
	}

}
