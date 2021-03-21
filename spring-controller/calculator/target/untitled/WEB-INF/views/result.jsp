<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${mess!=null}">
        <p style="color: red">${mess}</p>
</c:if>
    <h1>Result: ${cal.total}</h1>
</body>
</html>
