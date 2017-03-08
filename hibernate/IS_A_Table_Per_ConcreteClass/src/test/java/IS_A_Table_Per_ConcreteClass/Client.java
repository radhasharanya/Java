package IS_A_Table_Per_ConcreteClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import IS_A_Table_Per_ConcreteClass.Admin;
import IS_A_Table_Per_ConcreteClass.HardwareEmp;
import IS_A_Table_Per_ConcreteClass.SoftwareEmp;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		SoftwareEmp se =new SoftwareEmp(111,"aaa","aaa@gmail.com" ,10000,"hibernate");
		HardwareEmp he=new HardwareEmp(222,"bbb","bbb@gmail.com",8000,10);
		Admin a= new Admin(333,"ccc","ccc@gmail.com",4000,"srnagar");
		s.save(se);
		s.save(he);
		s.save(a);
		t.commit();
		s.close();
		sf.close();
	}

}
