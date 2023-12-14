<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Core Tag Example forloop</title>
</head>
<body>
	<c:forEach var="j" begin="1" end="3">
		<p>Item<c:out value="${j}"/><p>
	</c:forEach>
	
</body>
</html>