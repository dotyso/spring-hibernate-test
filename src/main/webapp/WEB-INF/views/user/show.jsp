<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/user/">list</a><br />
    name: ${user.name}<br/>  
    sex: ${user.sex}<br/> 
    age: ${user.age}<br/>  


</body>
</html>
