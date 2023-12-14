<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>import</title>
</head>
<body>
	<c:import var="data" url="/C_out.jsp"/>
	<c:out value="${data }"/>
</body>
</html>