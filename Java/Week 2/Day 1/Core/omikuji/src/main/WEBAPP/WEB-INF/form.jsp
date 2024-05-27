<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: najem
  Date: 25/05/2024
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form class="container  "  action="/omikuji" method="post">
    <div class="">
    <label class="">
        <h2>Pick any number from 5 to 25</h2>
        <input class="form-control" type="number" name="num">
    </label>
    </div>
    <div >
    <label>
        <h2>Enter a name of any city</h2>
        <input class="form-control" type="text" name="city">
    </label>
    </div>
    <div>
    <label>
        <h2>Enter a name of any real person</h2>
        <input class="form-control" type="text" name="person">
    </label>
    </div>
    <div>
    <label>
        <h2>Enter professional endeavor or hobby:</h2>
        <input class="form-control" type="text" name="hobby">
    </label>
    </div>
    <div>
    <label>
        <h2>Enter any type of living thing</h2>
        <input class="form-control" type="text" name="thing">
    </label>
    </div>
    <div>
    <label>
        <h2>Say something nice to someone </h2>
        <textarea class="form-control" type="text" name="nice"></textarea>
    </label>
    </div>
    <h2>Send and show a friend</h2>
    <button class="btn btn-primary">Send</button>
</form>
</body>
</html>
