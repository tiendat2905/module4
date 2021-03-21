<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form:form method="post" modelAttribute="convert">
    <label>Amount: </label><br/>
    <form:input type="number" path="amount" placeholder="amount"/><br/>

    <label>Convert:</label><br/>
    <form:select path="rate">
        <form:option value="0.000043">VND->USD</form:option>
        <form:option value="23097.25">USD->VND</form:option>
    </form:select><br/>
    <input type="submit" id="submit" value="Converter"/><br/>
</form:form>
</body>
</html>
