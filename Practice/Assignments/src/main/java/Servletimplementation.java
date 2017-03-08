import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/first")
public class Servletimplementation implements Servlet{
	ServletConfig config=null;

	public void destroy() {
		 System.out.println("servlet life cycle finished");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		this.config=config;
	      System.out.println("Initialization complete");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
	       PrintWriter pwriter=res.getWriter();
	       pwriter.print("<html>");
	       pwriter.print("<body>");
	       pwriter.print("<h1>Java Assignment Programs</h1>");
	       pwriter.print("</body>");
	       pwriter.print("</html>");
		
	}

}
