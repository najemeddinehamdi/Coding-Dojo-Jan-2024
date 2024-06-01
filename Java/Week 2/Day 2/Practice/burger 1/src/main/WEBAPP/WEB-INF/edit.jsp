<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 31/05/2024
  Time: 21:17
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
    <h2>Edit Burger</h2>
    <form:form action="/edit/${burger.id}" mode="post" modelAttribute="burger">
        <input type="hidden" name="_method" value="put">
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