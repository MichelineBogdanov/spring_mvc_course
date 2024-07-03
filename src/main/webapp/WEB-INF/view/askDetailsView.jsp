<!DOCTYPE html>
<html>
<body>
<h2>Enter your name:</h2>
<br>
<form action="${pageContext.request.contextPath}/showDetails" method="get">
    <label>
        <input type="text" name="empName" placeholder="Write your name"/>
    </label>
    <input type="submit"/>
</form>
</body>
</html>