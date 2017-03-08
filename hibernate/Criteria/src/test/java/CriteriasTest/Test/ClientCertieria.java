package CriteriasTest.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientCertieria {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
Criteria c=s.createCriteria(Employee.class);
List<Employee> list=c.list();
for(Employee emp:list)
{
	System.out.println("ID\t"+emp.getId()+"\tName \t"+emp.getName()+"\temail\t"+emp.getEmail()+"\tSalary\t"+emp.getSalary());
}
		

	}

}
