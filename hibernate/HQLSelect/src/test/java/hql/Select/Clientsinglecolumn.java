package hql.Select;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Clientsinglecolumn {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	String hql= "Select name from NewStudent" ;
 Query q=s.createQuery(hql);
 List<String> list=q.list();
/* List<String> list=(List<String>)q.list();*/
for(String name :list){
	System.out.println(name);
}
		 
 //System.out.println(os.getId()+""+os.getName()+""+os.getEmail()+""+os.getAddress());
 //t.commit();
 //System.out.println("no of roows update"+i);
s.close();
sf.close();
	}
}
