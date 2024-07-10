<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>You are welcome!</h2>
<br><br>
<%--обращаемся к полю зарегистрированного аттрибута--%>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your phone: ${employee.phoneNumber}
<br><br>
Your email: ${employee.email}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
Your language:
<ul>
    <c:forEach var="lang" items="${employee.empLanguages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>