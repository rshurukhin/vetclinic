<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <title>Vet Clinic Main Page</title>
</head>
<body>
<div>
    <h1>Welcome to Vet Clinic Main Page</h1>
    <h2>Here you can enter your data to register in the system</h2>
</div>
<div>
    <form action="${pageContext.servletContext.contextPath}/app/create" method="get">
        <input type="submit" name="register" value="Register">
    </form>
    <form action="${pageContext.servletContext.contextPath}/app/login" method="post">
        <input type="submit" name="enter" value="Log in">
    </form>
    <form action="${pageContext.servletContext.contextPath}/app/users" method="get">
        <input type="submit" name="users" value="view all users">
    </form>
</div>
</body>
</html>