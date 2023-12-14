<%@page import="model.Employee"%>
<%@page import="java.util.List"%>
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
		List<Employee> employees = (List<Employee>)request.getAttribute("emp"); // backend에서 보낸거 받는 방법
		out.println(employees);
	%>
</body>
</html>