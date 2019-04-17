<%@page import="java.util.jar.Attributes.Name"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JAX-RS @BeanParam Example</h1>

<%
String name="22";
%>
<form action="rest/myresources/user" method="post">
<!--<label for="name">Name: </label>
    <input id="name" type="text" name="name"/></p>
    <label for="count">Count: </label>
    <input id="count" type="text" name="count" /></p> -->
    <input type="submit" value="Submit" />
</form>
</p>
<form action="rest/hello/user" method="get">
<label for="name">Name: </label>
    <input id="name" type="text" name="name"/></p>
    <label for="count">Count: </label>
    <input id="count" type="text" name="count" /></p>
    <input type="submit" value="Submit" />
</form>
</body>
</html>