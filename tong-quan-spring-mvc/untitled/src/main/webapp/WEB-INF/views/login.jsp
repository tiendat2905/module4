<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/11/2021
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>${mess}</h1>
<form:form method="post" action="/login" modelAttribute="user">
    <label>UserName:</label>
    <form:input path="username"/>
    <label>Password:</label>
    <form:input path="password"/>
    <input type="submit" id="submit" value="login">
</form:form>
</body>
</html>
