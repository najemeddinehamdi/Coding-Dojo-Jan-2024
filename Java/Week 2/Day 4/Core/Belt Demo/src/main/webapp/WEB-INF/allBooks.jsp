<%--
  File: allBooks.jsp
  Description: Displaying all books with update and delete actions.
  Created by: [Your Name]
  Date: [Date]
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
    <title>All Books</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <h1 class="text-center">📕 All Books 📕 </h1>
            <br/>
            <div class="d-flex justify-content-between align-items-lg-baseline">
                <a href="${pageContext.request.contextPath}/books/create" class="btn btn-primary btn-create btn-sm w-25">Create</a>
                <a href="${pageContext.request.contextPath}/" class="btn btn-danger btn-sm w-25">Logout</a>
            </div>
        </div>
    </div>
    <p class="badge bg-success"><c:out value="${success}"/></p>
    <div class="row">
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead class="bg-dark text-light">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Pages</th>
                        <th>Language</th>
                        <th>Description</th>
                        <th><a class="text-decoration-none" href="${pageContext.request.contextPath}/libraries">Library</a></th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="book" items="${allBooks}">
                        <tr>
                            <td>${book.id}</td>
                            <td><a class="text-decoration-none" href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
                            <td><c:out value="${book.numberOfPages}"/></td>
                            <td><c:out value="${book.language}"/></td>
                            <td><c:out value="${book.description}"/></td>
                            <td><a class="text-decoration-none" href="${pageContext.request.contextPath}/libraries/${book.library.id}"><c:out value="${book.library.name}"/></a></td>
                            <td>
                                <a href="${pageContext.request.contextPath}/books/update/${book.id}" class="btn btn-warning btn-sm me-2">Update</a>
                                <form action="${pageContext.request.contextPath}/books/delete/${book.id}" method="post" style="display:inline;">
                                    <input type="hidden" name="_method" value="delete"/>
                                    <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this book?')" value="delete">Delete</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
