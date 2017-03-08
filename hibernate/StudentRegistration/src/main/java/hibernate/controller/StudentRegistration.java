package hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.bean.Student;

/**
 * Servlet implementation class StudentRegistration
 */
public class StudentRegistration extends HttpServlet {
	SessionFactory sf;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		Configuration cfg= new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
		System.out.println("Seesion factory init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String mail=req.getParameter("email");
		int marks=Integer.parseInt(req.getParameter("marks"));
	
		Student st= new Student(0,name,mail,marks);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		int pk=(Integer)s.save(st);
		t.commit();
		s.close();
		resp.getWriter().println("registration sucess");
	
	}
	
	@Override
	public void destroy() {
		sf.close();
	}
}
