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
	HttpSession ses = request.getSession(true);	
	//System.out.println(ses);
	//System.out.println(ses.getId());
	if(ses.isNew())
		response.sendRedirect("home.jsp");
	else{
		String username = (String) ses.getAttribute("user");
		out.println("Hello "+username);
	}
%>
</body>
</html>