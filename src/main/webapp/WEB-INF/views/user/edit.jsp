<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/edit" method="post">  
    name: <input type="text" name="name" value="${user.name}"><br/>  
    sex: <input type="radio" name="sex" value="1" <c:if test="${user.sex eq true}">checked</c:if>>男 <input type="radio" name="sex" value="0" <c:if test="${user.sex eq false}">checked</c:if>>女<br/> 
    age: <input type="text" name="age" value="${user.age}"><br/>  
    <input type="submit">  
</form>

</body>
</html>
