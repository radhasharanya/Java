package hql.Select;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Clientmultiplecolumns {
	public static void main(String[] args) {
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sf= cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction t= s.beginTransaction();
	String hql= "Select name ,email from NewStudent" ;
 Query q=s.createQuery(hql);
 List<Object[]> list=q.list();
 /*List<String> list=(List<String>)q.list();
for(Object o[] :list){
	System.out.println(o[0]+"\n"+o[1]);*/
 /*List<Object> list=q.list();
 
for(Object o :list){
	Object ar[]=(Object[])o;
	for(Object val:ar){
		System.out.println(val);
		
	}
	//System.out.println(o[0]+"\n"+o[1]);
}*/
		 
 //System.out.println(os.getId()+""+os.getName()+""+os.getEmail()+""+os.getAddress());
 //t.commit();
 //System.out.println("no of roows update"+i);
 for(Object o :list){
		Object ar[]=(Object[])o;
	System.out.println(ar[0]);
	System.out.println(ar[1]);
 }
 s.close();
 sf.close();
	}
}

