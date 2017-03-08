package hibernate.Crudread;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

import hibernate.Crudread.Student;

public class Client {

	public static void main(String[] args) {
	
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sr=cfg.buildSessionFactory();
		Session s=sr.openSession();
		
		//s.get(Student.class, 11); throw an exception for delete also
		/*Student st=new Student();
		st.setId(11);*/
		
		/*get method for READ*/
		
		
	/*	Object o= s.get(Student.class,111);//select query will trigger here and object will returned and if no record is available then it will return null we will get null pointer exception 
		Student  st=(Student)o;
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getMarks());
		System.out.println(st.getEmail());
		
t.commit();
		

		s.close();
		sr.close();*/
		// load method for read
		
		Object o= s.load(Student.class,112);
		Student  st=(Student)o;
		System.out.println(st.getId());
		System.out.println(st.getName());//here it will fire the select query
		System.out.println(st.getMarks());
		System.out.println(st.getEmail());

		

		s.close();
		sr.close();
		
	}

}
