package com.rt.programs.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rt.programs.Owner;
import com.rt.programs.dao.OwnerDAO;

import java.sql.ResultSet;
import java.sql.SQLException;



public class OwnerService  {

int noofrows;	
OwnerDAO od = new OwnerDAO();
	
	public int createOwner(Owner o) {
		
		noofrows=od.insertOwner(o);
		return noofrows;
	}
	
public ResultSet displayOwner()
	{
	return od.findAll();
	
	}

public ResultSet findOwner(String Name)
{
	return od.findByName(Name);
}

public void ownerUpdate(Owner o)
{
	 od.updateOwner(o);
}
       
   
	

}
