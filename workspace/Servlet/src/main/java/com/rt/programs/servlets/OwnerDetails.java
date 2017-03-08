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
 * Servlet implementation class OwnerDetails
 * 
 */
@WebServlet("/ownerDetails")
public class OwnerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public OwnerDetails() {
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
		String Name=request.getParameter("Owner");

		OwnerDAO owner=new OwnerDAO();
		ResultSet rs=owner.findByName(Name);
		out.println("<table style='width:100%' border='1'>");
		out.println("<tr><th>ID</th><th>FIRST NAME</th><th>LAST NAME</th><th>ADDRESS</th><th>CITY</th><th>TELEPHONE</th></tr>");
		
			try {
				rs.next();
				out.println("<tr><td>"+rs.getInt(1)+ "</td><td>" +rs.getString(2) +"</td><td>"+ rs.getString(3)+"</td><td>" +rs.getString(4)+"</td><td>" +rs.getString(5)+" </td><td>"+ rs.getString(6)+"</td></tr>");
				
				
				out.println("</table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
