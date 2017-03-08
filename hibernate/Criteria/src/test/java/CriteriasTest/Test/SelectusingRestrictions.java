package CriteriasTest.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class SelectusingRestrictions {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		Criteria c=s.createCriteria(Employee.class);
		//Criterion cr=Restrictions.eq("id",1);
		Criterion cr=Restrictions.gt("salary",7000);
				c.add(cr);
		/*Employee emp =(Employee)c.uniqueResult();
		System.out.println("ID\t"+emp.getId()+"\tName \t"+emp.getName()+"\temail\t"+emp.getEmail()+"\tSalary\t"+emp.getSalary());
		*/
				List<Employee> list=c.list();
				for(Employee emp:list)
				{
					System.out.println("ID\t"+emp.getId()+"\tName \t"+emp.getName()+"\temail\t"+emp.getEmail()+"\tSalary\t"+emp.getSalary());
				}
		
		

	}

}
