<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DetailsServlet" method="post">  

First Name:<input type="text" name="Firstname" /><br/><br/>  
Last Name:<input type="text" name="Lastname" /><br/><br/>
Address:<input type="text" name="Address" /><br/><br/>  
City:<input type="text" name="City" /><br/><br/>

Telephone:<input type="text" name="Telephone" /><br/><br/>
Gender:<input type="radio" value="Male" name="gender">Male<input type="radio" value="female" name="gender">female</br>
Hobbies:<input type="checkbox" value="Readingbooks" name="hobbies">Readingbooks<input type="checkbox" value="Cooking" name="hobbies">Cooking</br>
<input type="submit" value="submit"/>
</form> 
</body>
</html>