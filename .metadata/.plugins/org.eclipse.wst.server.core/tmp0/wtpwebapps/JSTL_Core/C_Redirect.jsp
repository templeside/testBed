<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<title>Redirect</title>
</head>
<body>
	<c:set var="url" value="2" scope="request"/>
	<c:if test="${url<1}">
		<c:redirect url="http://gmail.com"/>
	</c:if>
	<c:if test="${url>1}">
		<c:redirect url="http://facebook.com"/>
	</c:if>	
</body>
</html>