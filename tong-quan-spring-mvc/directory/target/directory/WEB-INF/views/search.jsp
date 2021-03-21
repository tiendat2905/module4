<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/10/2021
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/search" >
    <input type="text" name="keyword" placeholder="Enter your word:"/>
    <input type="submit" id="submit" value="Search"/>
</form>
</body>
</html>
