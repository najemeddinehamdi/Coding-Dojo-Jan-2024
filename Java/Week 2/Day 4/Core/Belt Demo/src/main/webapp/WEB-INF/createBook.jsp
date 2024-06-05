<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/create.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Create Book</title>
</head>
<body>
<div class="container">
    <h1>Create a Book 📖</h1>
    <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ Back to Books</a>
    <hr/>
    <form:form action="${pageContext.request.contextPath}/books" method="post" modelAttribute="book" class="mt-3">
        <div class="mb-3">
            <form:label path="title" cssClass="form-label">Book Name:</form:label>
            <form:errors path="title" cssClass="text-danger"/>
            <form:input path="title" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="numberOfPages" cssClass="form-label">Number Of Pages:</form:label>
            <form:errors path="numberOfPages" cssClass="text-danger"/>
            <form:input path="numberOfPages" type="number" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="language" cssClass="form-label">Language:</form:label>
            <form:errors path="language" cssClass="text-danger"/>
            <form:input path="language" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="description" cssClass="form-label">Description:</form:label>
            <form:errors path="description" cssClass="text-danger"/>
            <form:textarea path="description" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="library" cssClass="form-label">Library:</form:label>
            <form:select path="library" cssClass="form-select">
                <c:forEach items="${allLibrary}" var="library">
                    <form:option value="${library.id}">${library.name }</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="text-center">
            <input type="submit" value="Create Book" class="btn btn-primary btn-submit mt-3">
        </div>
    </form:form>
</div>
<script src="${pageContext.request.contextPath}js/app.js"></script>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>

</body>
</html>
