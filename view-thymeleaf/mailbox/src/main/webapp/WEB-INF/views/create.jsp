<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/15/2021
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Mail Box</title>
</head>
<body>
<h1>Settings</h1>
<form:form action="addMail" method="post" modelAttribute="mailbox">
    <table>
        <tr>
            <td><form:label path="languages">Languages </form:label></td>
            <td><form:select path="languages">
                <form:option value="English">English</form:option>
                <form:option value="Vietnamese">Vietnamese</form:option>
                <form:option value="Japanese">Japanese</form:option>
                <form:option value="Chinese">Chinese</form:option>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size: </form:label></td>
            <td>show <form:select path="pageSize">
                 <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="25">25</form:option>
                <form:option value="50">50</form:option>
                <form:option value="100">100</form:option>
            </form:select> emails per page</td>
        </tr>
        <tr>
            <td>Spams fitter:</td>
            <td><form:checkbox path="spamsFitter" id="spamsFitter" value="spamsFitter"/>
                <form:label path="spamsFitter" for="spamsFitter"> Enable spams fitter</form:label></td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature: </form:label></td>
            <td><form:textarea path="signature"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Update"/>
            <input type="reset" value="Cancel"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
