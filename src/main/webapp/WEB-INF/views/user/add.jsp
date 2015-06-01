<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/add" method="post">  
    name: <input type="text" name="name"><br/>  
    sex: <input type="radio" name="sex" value="1">男 <input type="radio" name="sex" value="0">女<br/> 
    age: <input type="text" name="age"><br/>  
    <input type="submit">  
</form>

</body>
</html>
