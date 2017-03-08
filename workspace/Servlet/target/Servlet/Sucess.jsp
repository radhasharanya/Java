<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Rows Sucessfully inserted</h1>


<%@page import="com.rt.programs.servlets.OwnerService" %>
<%@page import="java.sql.ResultSet" %>
<%!ResultSet rs;%>

<%
OwnerService os=new OwnerService();

rs=os.displayOwner();
out.println("<table style='width:100%' border='1'>");
out.println("<tr><th>ID</th><th>FIRST NAME</th><th>LAST NAME</th><th>ADDRESS</th><th>CITY</th><th>TELEPHONE</th></tr>");
while(rs.next())
	
{System.out.println(rs.getInt(1));
	out.println("<tr><td>"+rs.getInt(1)+ "</td><td><a href=DisplayOwner.jsp?firstname="+rs.getString(2)+ " >"+rs.getString(2) +"</a></td><td>"+ rs.getString(3)+"</td><td>" +rs.getString(4)+"</td><td>" +rs.getString(5)+" </td><td>"+ rs.getString(6)+"</td></tr>");
	
	
	
} 
out.println("</table>");
%>
</body>
</html>