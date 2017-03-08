package hibernate.CrudUpdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;
/* Limitation os update
 * only non primary key will be update we cannot update primary key
 * complete records need to update but cannot single column
 * if session has perisent object then we can not update that object in that case we have use merge
 * 
 */
public class Client {

	public static void main(String[] args) {
	//update 
	/*	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		Transaction t = s.beginTransaction();
		Student st=new Student();
		st.setId(11);
		st.setName("BSC");
		st.setMarks(123);
		st.setEmail("abc@gmail.com");
s.update(st);
t.commit();
		

		s.close();
		sr.close();
		System.out.println("update sucess");*/
		
		////exception becoz session has already is have the persistent object and you can update the same object using update it will throw an exception org.hibernate.NonUniqueObjectException operation
		
		
		/*Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		Transaction t = s.beginTransaction();
		s.get(Student.class, 11);
		Student st=new Student();
		st.setId(11);
		st.setName("BSC");
		st.setMarks(123);
		st.setEmail("abc@gmail.com");
s.update(st);
t.commit();
		

		s.close();
		sr.close();
		System.out.println("update sucess");*/
		///using merge
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		Transaction t = s.beginTransaction();
		s.get(Student.class, 11);
		Student st=new Student();
		st.setId(11);
		st.setName("abd");
		st.setMarks(123);
		st.setEmail("abc@gmail.com");
s.merge(st);
t.commit();
		

		s.close();
		sr.close();
		System.out.println("update sucess");
		
	}

}
