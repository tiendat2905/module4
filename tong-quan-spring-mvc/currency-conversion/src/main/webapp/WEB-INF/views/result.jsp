<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/10/2021
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>
    Amount: ${convert.amount} - Rate: <fmt:formatNumber value="${convert.rate}" maxFractionDigits="7" type="number" />
    => Total: <fmt:formatNumber value="${convert.total}" type="number" maxIntegerDigits="20" maxFractionDigits="2" />
</h1>

</body>
</html>
