
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer Manage</title>
</head>
<body>
<center>
    <h1>Customer List</h1>

    <h2>
        <a href="${pageContext.request.contextPath}/add">Add New Customer</a>
    </h2>

</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <c:forEach var="cus" items="${list}">
            <tr>
                <td><c:out value="${cus.id}"/></td>
                <td><c:out value="${cus.name}"/></td>
                <td><c:out value="${cus.email}"/></td>
                <td><c:out value="${cus.address}"/></td>
                <td>
                    <a href="<c:url value="/edit?id=${cus.id}"/>">Edit</a>
                    <a href="<c:url value="/delete?id=${cus.id}"/>">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>