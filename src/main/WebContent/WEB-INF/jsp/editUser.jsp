<%--
  Created by IntelliJ IDEA.
  User: rosti
  Date: 21.03.2018
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Edit User ${user.login}</h1>
    <form action="${pageContext.servletContext.contextPath}/app/users/edit" method="post">
        <input type="hidden" name="userId" value="${user.userId}">
        Name: <input type="text" name="userName" value="${user.userName}">
        Surname: <input type="text" name="userSurname" value="${user.userSurname}">
        Login: <input type="text" name="login" value="${user.login}">
        Password: <input type="password" name="password" value="${user.password}">
        <input type="submit" name="register" value="Save changes">
    </form>
    <form action="${pageContext.servletContext.contextPath}/app/users" method="get">
        <input type="submit" name="users" value="view all users">
    </form>
</body>
</html>
