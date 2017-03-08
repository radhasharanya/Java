package hibernate.pk_genrator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;

public class AssignedClient {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		SessionFactory sf=cfg.configure().buildSessionFactory();
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		BookMovie bm=new BookMovie();
		/*bm.setId(1);
		bm.setMovie("premikudu");
		bm.setShowtime("10pm");
		bm.setSeatno(22);*/
		/*bm.setId(12);
		bm.setMovie("premikudu");
		bm.setShowtime("10pm");
		bm.setSeatno(23);
		*/
		
		////increment
		
	
		/*bm.setMovie("premikudu");
		bm.setShowtime("10pm");
		bm.setSeatno(23);*/
		bm.setMovie("premikudu");
		bm.setShowtime("10pm");
		bm.setSeatno(24);
		s.save(bm);
		t.commit();
		
		s.close();
		sf.close();
			
	}

}
