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
	HttpSession ses = request.getSession();
	String user = request.getParameter("username");
	ses.setAttribute("user", user);
%>
 Click <a href="welcome.jsp"> here</a>
</body>
</html>