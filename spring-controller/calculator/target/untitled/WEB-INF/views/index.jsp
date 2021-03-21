
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form:form action="/calculate" method="post" modelAttribute="cal">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand: </td>
                <td><form:input type="number" path="firstOperand"/></td>
            </tr>

            <tr>
                <td>Operator: </td>
                <td>
                    <form:select path="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>Second operand: </td>
                <td><form:input type="number" path="secondOperand"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Calculator"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
