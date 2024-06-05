<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 30/05/2024
  Time: 02:09
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/update.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Update Book</title>
</head>
<body>
<div class="container">
    <h1>Update Book 📖</h1>
    <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ Back to Books</a>
    <hr/>
    <form:form method="post" modelAttribute="theBook" action="${pageContext.request.contextPath}/books/update/${theBook.id}" class="mt-3">
        <div class="mb-3">
            <form:label path="title" class="form-label">Title:</form:label>
            <form:input path="title" id="title" class="form-control" />
            <form:errors path="title" cssClass="text-danger" />
        </div>
        <div class="mb-3">
            <form:label path="description" class="form-label">Description:</form:label>
            <form:input path="description" id="description" class="form-control"  />
            <form:errors path="description" cssClass="text-danger" />
        </div>
        <div class="mb-3">
            <form:label path="language" class="form-label">Language:</form:label>
            <form:input path="language" id="language" class="form-control"  />
            <form:errors path="language" cssClass="text-danger" />
        </div>
        <div class="mb-3">
            <form:label path="numberOfPages" class="form-label">Number of Pages:</form:label>
            <form:input path="numberOfPages" id="numberOfPages" class="form-control" type="number"  />
            <form:errors path="numberOfPages" cssClass="text-danger" />
        </div>
        <div class="mb-3">
            <form:label path="library" cssClass="form-label">Library:</form:label>
            <form:select path="library" cssClass="form-select">
                <c:forEach items="${allLibrary}" var="library">
                    <form:option value="${library.id}">${library.name }</form:option>
                </c:forEach>
            </form:select>
        </div>
        <button type="submit" class="btn btn-primary btn-submit">Update Book</button>
    </form:form>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
