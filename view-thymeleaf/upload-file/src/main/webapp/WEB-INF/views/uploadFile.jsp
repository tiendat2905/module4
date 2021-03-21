<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/15/2021
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Upload File</title>
</head>
<body>
    <h1>Upload File</h1>
    <form:form modelAttribute="upload" method="post" enctype="multipart/form-data">
<%--        <form:label path="description" for="files">Select description:</form:label>--%>
<%--        <form:input path="description" id="files" type="file" multiple = "multiple"/> <br><br>--%>
        <form:label path="files" for="files">Select file:</form:label>
        <form:input path="files" id="files" type="file" multiple = "multiple"/> <br> <br>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
