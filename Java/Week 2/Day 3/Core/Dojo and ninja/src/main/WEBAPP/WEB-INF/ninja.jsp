<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 03/06/2024
  Time: 10:25
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
    <h1>New Dojo</h1>
    <form:form action="/processNinja" method="post" modelAttribute="Ninja">
        <form:label path="dojo" cssClass="form-label">dojo</form:label>
        <form:select path="dojo" >
            <c:forEach var="dojo" items="${dojos}">
            <form:option value="${dojo.id}" label="${dojo.name}"/>
            </c:forEach>
        </form:select>
        <form:errors path="dojo"/>
        <form:label path="firstName" cssClass="form-label">first name</form:label>
        <form:input path="firstName" cssClass="form-control" />
        <form:errors path="firstName"/>
        <form:label path="lastName" cssClass="form-label">last name</form:label>
        <form:input path="lastName" cssClass="form-control" />
        <form:errors path="lastName"/>
        <form:label path="age" cssClass="form-label">age</form:label>
        <form:input path="age" cssClass="form-control" />
        <form:errors path="age"/>
        <input type="submit" value="create" class="btn btn-success">
    </form:form>

</div>
</body>
</html>