package Many_to_Many.Ormrelation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		Set<Course> scourse =new HashSet<Course>();
		Set<Course> scourse1 =new HashSet<Course>();
		Set<Faculty> faculties =new HashSet<Faculty>();
		Set<Faculty> faculties1 =new HashSet<Faculty>();
		
		
		
		Course course =new Course();
		course.setCid(111);		course.setCname("java");
		course.setFee(1500);
			
		
		
		Course course1 =new Course();
		course1.setCid(222);
		course1.setCname("Advjava");
		course1.setFee(1700);
		
		
		Course course2 =new Course();
		course2.setCid(333);
		course2.setCname("Spring java");
		course2.setFee(2300);
		
		
		scourse.add(course);
		scourse.add(course1);
		
		scourse1.add(course);
		scourse1.add(course1);
		scourse1.add(course2);
		
		
		Faculty faculty =new Faculty();
		faculty.setFid(111);
		faculty.setFname("sharanya");
		faculty.setYearex(5);
		faculty.setCourse(scourse);
		
		
		Faculty faculty1 =new Faculty();
		faculty1.setFid(222);
		faculty1.setFname("shara");
		faculty1.setYearex(4);
		faculty1.setCourse(scourse);
		
		
		Faculty faculty2 =new Faculty();
		faculty2.setFid(333);
		faculty2.setFname("sha");
		faculty2.setYearex(6);
		faculty2.setCourse(scourse1);faculties1.add(faculty);
		faculties1.add(faculty1);
		

		faculties.add(faculty);
		faculties.add(faculty1);
		
		faculties.add(faculty2);
		
		
		
		s.saveOrUpdate(course);
		s.saveOrUpdate(course1);
		s.saveOrUpdate(course2);
		
		s.saveOrUpdate(faculty);
		s.saveOrUpdate(faculty1);
		s.saveOrUpdate(faculty2);
		t.commit();
		s.close();
		sf.close();
		
		
		
		
		
		
		

	}

}
