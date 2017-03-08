<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.rt.programs.Owner" %>
<%@page import="com.rt.programs.servlets.OwnerService" %>
<%-- <jsp:useBean id="owner" class="com.rt.programs.Owner"></jsp:useBean>
<jsp:setProperty name="owner" property="id" name="owner" value=Integer.parseInt('<%= request.getParameter("id")%>')/>
<jsp:setProperty name="owner" property="first_name" name="owner" value='<%= request.getParameter("first_name")%>'/>
		<jsp:setProperty name="owner" property="last_name" name="owner" value='<%= request.getParameter("last_name")%>'/>
		<jsp:setProperty name="owner" property="address" name="owner" value='<%= request.getParameter("address")%>'/>
		<jsp:setProperty name="owner" property="city" name="owner" value='<%= request.getParameter("city")%>'/>
		<jsp:setProperty name="owner" property="telephone" name="owner" value='<%= request.getParameter("telephone")%>'/>
 --%>
<%
Owner own =new Owner();
System.out.print((String)request.getParameter("Firstname"));

own.setId(Integer.parseInt((String)request.getParameter("ID")));
own.setFirst_name((String)request.getParameter("Firstname"));
own.setLast_name((String)request.getParameter("Lastname"));
own.setAddress((String)request.getParameter("Address"));
own.setCity((String)request.getParameter("City"));
own.setTelephone((String)request.getParameter("Telephone")); 
OwnerService os = new OwnerService();
os.ownerUpdate(own);

out.println("Updated Sucessfully");


%>

</body>
</html>