<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 31/05/2024
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="">
    <title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
<div>
    <table class="table">
        <thead class="table-header table-danger">
        <tr>
        <th>Burger Name</th>
        <th>Restaurant Name</th>
        <th>Rating (out of 5)</th>
        </tr>
        </thead>
        <tbody >
        <c:forEach var="burger"  items="${burgers}">
        <tr>
            <td><a><c:out value="${burger.burgerName}"/></a></td>
            <td><a><c:out value="${burger.restaurantName}"/></a></td>
            <td><a><c:out value="${burger.rating}"/></a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
    <br>
    <h2>Add new burger</h2>
    <form:form action="/addBurger" mode="post" modelAttribute="burger">
        <div>
            <form:label path="burgerName">Burger Name:</form:label><br>
            <form:errors path="burgerName" class="text-danger"/>
            <form:input path="burgerName" style="width:250px;"/>
        </div>
        <div>
            <form:label path="restaurantName">Restaurant Name:</form:label><br>
            <form:errors path="restaurantName" class="text-danger"/>
            <form:input path="restaurantName" style="width:250px;"/>
        </div>
        <div>
            <form:label path="rating">Rating:</form:label><br>
            <form:errors path="rating" class="text-danger"/>
            <form:input path="rating" style="width:250px;"/>
        </div>
        <div>
            <form:label path="notes">Notes:</form:label><br>
            <form:errors path="notes" class="text-danger"/>
            <form:textarea path="notes" rows="3" style="width:250px;"/>
        </div>
        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form:form>
</div>
</body>
</html>