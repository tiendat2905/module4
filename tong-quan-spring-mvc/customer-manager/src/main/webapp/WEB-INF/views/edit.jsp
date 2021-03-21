<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer Manage</title>
</head>
<body>
<center>
    <h1>Customer Edit</h1>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption>
            <h2>
                Customer Information
            </h2>
        </caption>
        <form:form method="post" modelAttribute="customer">
            <form:hidden path="id" />
            <tr>
                <th><label for="name">Name:</label></th>
                <td> <form:input path="name" id="name" /></td>
            </tr>
            <tr>
                <th>  <label for="email">Email:</label></th>
                <td> <form:input path="email" id="email" /></td>
            </tr>
            <tr>
                <th><label for="address">Address:</label></th>
                <td><form:input path="address" id="address" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Edit"></td>
            </tr>
        </form:form>
    </table>
    <h2><a href="${pageContext.request.contextPath}/customers">Back to list.</a></h2>
</div>
</body>
</html>