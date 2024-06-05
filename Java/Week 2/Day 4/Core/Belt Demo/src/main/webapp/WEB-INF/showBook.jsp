<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 30/05/2024
  Time: 00:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Show Book</title>
</head>
<body>
<div class="container mt-5">
    <div class="card mb-3">
        <div class="d-flex justify-content-between align-items-lg-baseline card-header bg-primary text-white">
            <h1>About the Book</h1>
            <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ Back to Books</a>
        </div>
        <div class="card-body">
            <h2 class="card-title">Title: ${theBook.title}</h2>
            <p class="card-text">Number of Pages: ${theBook.numberOfPages}</p>
            <p class="card-text">Language: ${theBook.language}</p>
            <p class="card-text">Description: ${theBook.description}</p>
        </div>
    </div>
</div>



<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
