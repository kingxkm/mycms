<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>登录成功</title>
</head>

<body>
	<h1>登录成功！</h1>
	
	<h2>登记的用户为：${userName}</h2>
</body>
</html>
