package com.rt.programs.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hellooo");
		HttpSession session= request.getSession();
		Integer count =(Integer)session.getAttribute("visitcount");
		//out.println(count);
		if(count==null)
		{
			  RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		        dispatcher.include(request, response);
		        count=0;
			  
	    } 
		else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	        dispatcher.include(request, response);
		        //count++;
		}
		
        session.setAttribute("visitcount", count);
       
	
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
