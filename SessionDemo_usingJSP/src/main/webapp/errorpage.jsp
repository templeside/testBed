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
	HttpSession nsession = request.getSession(false);
	if(nsession !=null){
		String data = (String) session.getAttribute("fname");
		out.println(data);
	}else{
		out.println("Session is not active");
	}
	%>
</body>
</html>