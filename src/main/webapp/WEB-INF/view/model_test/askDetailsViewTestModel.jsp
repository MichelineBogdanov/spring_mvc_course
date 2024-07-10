<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Enter your name:</h2>
<br>
<%--action переводит на view, modelAttribute задает атрибут модели--%>
<form:form action="showDetailsTestModel" modelAttribute="employee">
    <%--будут срабатывать getter-ы--%>
    <%--path - название поля куда запишется зачение из формы
    items - откуда будут браться значения для списков--%>
    Name <form:input path="name"/>
    <%--валидация--%>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
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
    <br><br>
    <%--<form:checkbox path="language" value="FR" label="FR"/>
    <form:checkbox path="language" value="EN" label="EN"/>
    <form:checkbox path="language" value="DE" label="DE"/>--%>
    <form:checkboxes path="empLanguages" items="${employee.languages}"/>
    <br><br>
    <%--при нажатии на OK будут срабатывать setter-ы--%>
    <input type="submit" value="OK"/>
</form:form>
</body>
</html>