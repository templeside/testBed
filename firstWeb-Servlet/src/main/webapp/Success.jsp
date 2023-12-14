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
	String msg = (String)request.getAttribute("message");
	out.print(msg);
	%>
	<a href = "FetchById"> Fetch Record</a>
	<a href = "FetchAll"> Fetch All Record</a>
</body>
</html>

<%
//Scriptlet -- it is used to write java code
%>