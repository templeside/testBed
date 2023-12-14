<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String firstname = "Mohd";
	String middlename = "Irfan";
	String lastname = "Khan";
	int age = 28;
	session.setAttribute("fname", firstname);
	session.setAttribute("mname", middlename);
	session.setAttribute("lname", lastname);
	session.setAttribute("UAge",age);
	%>
	<a href="display.jsp"> See Details</a>
	<a href="errorpage.jsp">Invalidate Session</a>
</body>
</html>