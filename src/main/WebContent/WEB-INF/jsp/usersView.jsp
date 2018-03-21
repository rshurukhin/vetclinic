<%--
  Created by IntelliJ IDEA.
  User: rosti
  Date: 16.03.2018
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Users</title>
</head>
<body>
    <h1>Users view</h1>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Surname</td>
            <td>Login</td>
            <td>Действия</td>
        </tr>
        <c:forEach items="${usersMap}" var="user">
            <tr valign="top">
                <td>${user.key}</td>
                <td>${user.value.userName}</td>
                <td>${user.value.userSurname}</td>
                <td>${user.value.login}</td>
                <td>
                    <a href="${pageContext.servletContext.contextPath}/app/users/edit?userId=${user.key}">Редактировать</a>
                    <a href="${pageContext.servletContext.contextPath}/app/users/delete?userId=${user.key}">Удалить</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.servletContext.contextPath}/app/create">Добавить пользователя</a>
</body>
</html>
