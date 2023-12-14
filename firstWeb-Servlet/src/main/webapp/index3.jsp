<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean class="model.Book" id="b1" scope="page" />

<jsp:setProperty name="b1" property="bookId" value="101" />
<jsp:setProperty name="b1" property="bookName" value="Jsp Cookbook" />
<jsp:setProperty name="b1" property="price" value="650" />
<jsp:setProperty name="b1" property="pubYear" value="2010" />


<b>BookId:</b><jsp:getProperty name="b1" property="bookId"/><br>
<b>BookName:</b><jsp:getProperty name="b1" property="bookName"/><br>
<b>Price:</b><jsp:getProperty name="b1" property="price"/><br>
<b>Pub Year:</b><jsp:getProperty name="b1" property="pubYear"/><br>

</body>
</html>