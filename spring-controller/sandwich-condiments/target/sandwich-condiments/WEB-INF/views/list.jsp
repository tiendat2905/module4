<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/11/2021
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="save">
    <label><h1>Sandwich Condiments</h1></label>
    <input type="checkbox" name="condiment" id="Letture" value="Letture"/>
    <label for="Letture">Letture</label>
    <input type="checkbox" name="condiment" id="Tomato" value="Tomato"/>
    <label for="Tomato">Tomato</label>
    <input type="checkbox" name="condiment" id="Mustand" value="Mustand"/>
    <label for="Mustand">Mustand</label>
    <input type="checkbox" name="condiment" id="Sprouts" value="Sprouts"/>
    <label for="Sprouts">Sprouts</label>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
