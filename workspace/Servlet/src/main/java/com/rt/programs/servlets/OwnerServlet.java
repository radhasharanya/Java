package com.rt.programs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rt.programs.dao.OwnerDAO;

/**
 * Servlet implementation class OwnerServlet
 */
@WebServlet("/owner")
public class OwnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  /*  public OwnerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
		
		OwnerDAO owner=new OwnerDAO();
		ResultSet rs=owner.findAll();
		out.println("<form action='ownerDetails' method='POST'>");
		out.println("Owner Name: <select name = \"Owner\">");
		try {
			while(rs.next()){
				
			
			out.print("<option value='"+rs.getString(2)+"'>"+rs.getString(3)+"</option>");
			// out.println("</option>" );
			
			 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("</select> ");
		out.println();
		out.println("\n<input type=submit value=\"SUBMIT\">");
		out.println("</form>");
		//owner.findByID(ow);
		//owner.findByName(ow);
		//out.print("<input typ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
