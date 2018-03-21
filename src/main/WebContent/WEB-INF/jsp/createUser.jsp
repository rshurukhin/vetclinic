<%--
  Created by IntelliJ IDEA.
  User: rosti
  Date: 21.03.2018
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <form action="${pageContext.servletContext.contextPath}/app/create" method="post">
        Name: <input type="text" name="userName">
        Surname: <input type="text" name="userSurname">
        Login: <input type="text" name="login">
        Password: <input type="password" name="password">
        <input type="submit" name="register" value="Register">
    </form>
    <form action="${pageContext.servletContext.contextPath}/app/users" method="get">
        <input type="submit" name="users" value="view all users">
    </form>
</body>
</html>
