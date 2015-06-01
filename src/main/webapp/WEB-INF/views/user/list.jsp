<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/user/add">add</a>

<br /> <br /> 
<table>
<c:forEach var="user" items="${users}"> 
<tr>
	<td>${user.name}</td>
	<td>${user.sex}</td>
	<td>${user.age}</td>
	<td><a href="${pageContext.request.contextPath}/user/edit/${user.id}">edit</a></td>
</tr>
</c:forEach> 
</table>
</body>
</html>
