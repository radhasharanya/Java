package hibernate.autoddl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		System.out.println("Table created Sucessfully");
		sr.close(); //will drop the tables a
		
		
	}

}
