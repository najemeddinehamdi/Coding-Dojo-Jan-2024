<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 02/06/2024
  Time: 08:39
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Library</title>
</head>
<body>
<div class="container mt-5">
    <div class="text-center mb-5">
        <h1 class="display-4"><c:out value="${library.name}"/></h1>
        <h4 class="text-muted"><c:out value="${library.location}"/></h4>
    </div>
    <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ Back to Books</a>
    <hr/>
    <h4 class="mb-4">Book List 📖</h4>
    <div class="row">
        <c:forEach items="${library.books}" var="book">
            <div class="col-md-4 mb-4">
                <div class="card h-100">
                    <div class="card-body">
                        <h5 class="card-title"><c:out value="${book.title}"/></h5>
                        <p class="card-text"><strong>ID:</strong> <c:out value="${book.id}"/></p>
                        <p class="card-text"><strong>Pages:</strong> <c:out value="${book.numberOfPages}"/></p>
                        <p class="card-text"><strong>Language:</strong> <c:out value="${book.language}"/></p>
                        <p class="card-text"><strong>Description:</strong> <c:out value="${book.description}"/></p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
    <a href="${pageContext.request.contextPath}/books/create"><input type="submit" value="Add Book" class="btn btn-primary btn-sm"/></a>
</div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
