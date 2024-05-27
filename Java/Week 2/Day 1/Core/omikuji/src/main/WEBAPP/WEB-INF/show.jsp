<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 25/05/2024
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here's your Omikuji !</h1>
<div class="container">
    <h4>In <c:out value="${num}"/>years, you will live in<c:out value="${city}"/> with <c:out value="${person}"/>
    as your rommate , <c:out value="${hobby}"/> for a living.The next time you see <c:out value="${thing}"/>,you will have good luck.Also,<c:out value="${nice}"/></h4>
</div>
</body>
</html>
