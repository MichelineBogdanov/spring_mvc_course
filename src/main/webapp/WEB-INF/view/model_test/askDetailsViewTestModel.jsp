<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Enter your name:</h2>
<br>
<%--action переводит на view, modelAttribute задает атрибут модели--%>
<form:form action="showDetailsTestModel" modelAttribute="employee">
    <%--будут срабатывать getter-ы--%>
    <%--path - название поля--%>
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
    Which car do you want?
    <%--BMW <form:radiobutton path="carBrand" value="BMW"/>
    AUDI <form:radiobutton path="carBrand" value="AUDI"/>
    Mercedes <form:radiobutton path="carBrand" value="Mercedes"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <%--при нажатии на OK будут срабатывать setter-ы--%>
    <br><br>
    <input type="submit" value="OK"/>
</form:form>
</body>
</html>