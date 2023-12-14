<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Core Tag Example</title>
</head>
<body>
	<c:set var="income" scope="session" value="${10000*4}"/>
	<c:if test="${income>=40000}">
		<p>My income is: <c:out value="${income}"/><p>
	</c:if>
</body>
</html>