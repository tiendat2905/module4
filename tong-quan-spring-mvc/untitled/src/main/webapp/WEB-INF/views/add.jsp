<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/10/2021
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="/doadd" modelAttribute="cus">
    <label>Name:</label>
    <form:input path="name"/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
