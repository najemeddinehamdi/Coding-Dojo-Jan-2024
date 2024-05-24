<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 24/05/2024
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>fruits Store</h1>
    <table class="table">
        <thead class="table-danger">
        <tr>
            <th>name</th>
            <th>price</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="fruits" items="${fruit}">
        <tr>

        <td><c:out value="${fruits.name}"/></td>
        <td><c:out value="${fruits.price}"/></td>

        </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
