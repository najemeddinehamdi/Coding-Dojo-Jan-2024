<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 01/06/2024
  Time: 19:42
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
    <table class="table">
        <thead>
        <tr>
            <th>Expenses</th>
            <th>Vendor</th>
            <th>Amount</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="travel" items="${travelList}">
        <tr>
            <td><a href="/show/travel/${travel.id}">${travel.expense}</a></td>
            <td>${travel.vendor}</td>
            <td>${travel.amount}$</td>
            <td>
                <div class="d-flex">
                <a class="btn btn-primary" href="travel/edit/${travel.id}">edit</a>
                <form method="post" action="travel/delete/${travel.id}">
                    <input type="hidden" name="_method" value="delete">
                    <input class="btn btn-danger" type="submit" value="delete">
                </form>
                </div>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <h1>Add an expense</h1>
    <form:form action="/processTravel" method="post" modelAttribute="travel">
    <form:label cssClass="form-label" path="expense">expences</form:label>
        <form:input class="form-control" path="expense"/>
        <form:errors path="expense"/>
    <br>
    <form:label cssClass="form-label" path="vendor">vendor</form:label>
        <form:input class="form-control" path="vendor"/>
        <form:errors path="vendor"/>
    <br>
    <form:label cssClass="form-label" path="amount">amount</form:label>
        <form:input cssClass="form-control"  type="number" step="0.001" path="amount"/>
        <form:errors path="amount"/>
    <br>
    <form:label cssClass="form-label" path="description">description</form:label>
        <form:input cssClass="form-control" type="text" path="description"/>
        <form:errors path="description"/>

    <div class="d-flex justify-content-between">
        <a class="btn btn-danger">Cancel</a>
        <input type="submit" value="create" class="btn btn-success">
        </form:form>
</div>
</body>
</html>