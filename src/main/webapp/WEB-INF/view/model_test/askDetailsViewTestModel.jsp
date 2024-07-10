<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Enter your name:</h2>
<br>
<%--action переводит на view, modelAttribute задает атрибут модели--%>
<form:form action="showDetailsTestModel" modelAttribute="employee">
    <%--будут срабатывать getter-ы--%>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <%--лучше задавать значения в коде--%>
    <%--<form:option value="Information Technologies" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <%--при нажатии на OK будут срабатывать setter-ы--%>
    <input type="submit" value="OK"/>
</form:form>
</body>
</html>