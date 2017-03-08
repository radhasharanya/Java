package com.rt.programs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rt.programs.Owner;

/**
 * Servlet implementation class someservlet
 */
@WebServlet("/someservlet")
public class Confirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  /*  public someservlet() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Owner owner =new Owner();
	/*request.setAttribute("firstName", request.getParameter("Firstname"));
	request.setAttribute("LastName", request.getParameter("LastName"));
	request.setAttribute("Address", request.getParameter("Address"));
	request.setAttribute("City", request.getParameter("City"));
	request.setAttribute("Telephone", request.getParameter("Telephone"));*/
	
	owner.setFirst_name((String)request.getParameter("Firstname"));
	owner.setLast_name((String)request.getParameter("Lastname"));
	owner.setAddress((String)request.getParameter("Address"));
	owner.setCity((String)request.getParameter("City"));
	owner.setTelephone((String)request.getParameter("Telephone"));
	OwnerService os = new OwnerService();
	int count=os.createOwner(owner);
	
	if(count!=0)
	{
		
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("Sucess.jsp");
	        dispatcher.include(request, response);
	}
	else{
		 RequestDispatcher dispatcher = request.getRequestDispatcher("Failure.jsp");
	        dispatcher.include(request, response);
	}
	}
		
	}


