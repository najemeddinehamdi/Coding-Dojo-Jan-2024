<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 02/06/2024
  Time: 00:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/lib.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>All Libraries</title>
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-12">
            <h1 class="mb-4">All Libraries</h1>
            <a href="${pageContext.request.contextPath}/books" class="btn btn-primary mb-3">Books</a>
            <hr/>
            <table class="table table-striped table-hover table-bordered">
                <thead class="table-dark">
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>Location</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="lib" items="${allLibrary}">
                    <tr>
                        <td>${lib.id}</td>
                        <td>${lib.name}</td>
                        <td>${lib.location}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row mt-5">
        <div class="col-12">
            <h2 class="mb-4">Create a Library</h2>
            <form:form action="${pageContext.request.contextPath}/libraries" method="post" modelAttribute="library">
                <div class="mb-3">
                    <label for="name" class="form-label">Name:</label>
                    <form:errors path="name" class="text-danger"/>
                    <form:input path="name" id="name" class="form-control"/>
                </div>
                <div class="mb-3">
                    <label for="location" class="form-label">Location:</label>
                    <form:errors path="location" class="text-danger"/>
                    <form:input path="location" id="location" class="form-control"/>
                </div>
                <button type="submit" class="btn btn-success">Create</button>
            </form:form>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
