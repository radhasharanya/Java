import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Generic")
public class GenericServletPrgm  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b>Generic Servlet Programs</b>");  
		out.print("</body></html>"); 
		
	}

}
