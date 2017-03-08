package CriteriasTest.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProjectionsandRestrictions {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		Criteria c=s.createCriteria(Employee.class);
	Criterion cr =Restrictions.gt("salary", 9000);
		c.add(cr);
		Projection p= Projections.property("name");
		Projection p1= Projections.property("salary");
		ProjectionList plist=Projections.projectionList();
		plist.add(p);
		plist.add(p1);
		c.setProjection(plist);
		List<Object[]> list=c.list();
		for(Object [] o:list)
		{
		System.out.println("Name:\t"+o[0]+"\tSalary:\t"+o[1]);
		
		}
		
		
		

	}

}
