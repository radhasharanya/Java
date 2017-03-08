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

public class Selectusingprojections {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		Criteria c=s.createCriteria(Employee.class);
		/* Single colums projections
		Projection p=Projections.property("name");
		
		c.setProjection(p);
		
		List<String> list=c.list();
		for(String name:list)
		{
			
			System.out.println("\tName \t"+name);
		}
*//**Multiple columns Projections*/
		Projection p=Projections.property("name");
		Projection p1=Projections.property("salary");
	ProjectionList plist =Projections.projectionList();
	plist.add(p);
	plist.add(p1);
	
	c.setProjection(plist);
	List<Object[]> emplist=c.list();
	for(Object[] o:emplist)
	{
		System.out.println(o[0]);
		System.out.println(o[1]);
	}
	
		
	}

}
