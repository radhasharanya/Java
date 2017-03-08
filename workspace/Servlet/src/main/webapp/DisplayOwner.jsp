<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="com.rt.programs.servlets.OwnerService" %>
<%@page import="java.sql.ResultSet" %>
<%!ResultSet rs;%>
<%
String firstname=request.getParameter("firstname");

OwnerService os=new OwnerService();

rs=os.findOwner(firstname);
rs.next();
out.println("<form action='UpdateOwner.jsp' method=post>");
out.println("ID:<input type='text' name='id'  value='"+rs.getString(1)+"'  /><br/><br/>");
out.println("First Name:<input type='text' name='first_name' value='"+rs.getString(2)+"' /><br/><br/>");
out.println("Last Name<input type='text' name='last_name' value='"+rs.getString(3)+"' /><br/><br/>");
out.println("Address:<input type='text' name='address' value='"+rs.getString(4)+"' /><br/><br/>");
out.println("City:<input type='text' name='city' value='"+rs.getString(5)+"' /><br/><br/>");
out.println("Telephone:<input type='text' name='telephone' value='"+rs.getString(6)+"' /><br/><br/>");
out.println("<input type='submit' value='Submit'/>");
out.println("</form>");
%>
</body>
</html>