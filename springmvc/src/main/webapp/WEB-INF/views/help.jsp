<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is Help page</h1>

<%
/* String name = (String) request.getAttribute("name"); */
Object nowObj = request.getAttribute("now");
LocalDateTime date = null;
if (nowObj instanceof LocalDateTime) {
    date = (LocalDateTime) nowObj;
}
%>

<%-- <h1>Name is <%= (name != null ? name : "name attribute is null") %></h1> --%>

<h1>Hello my name is ${name}</h1>

<h1>Current time is : <%= (date != null ? date.toString() : "now attribute is null or not a LocalDateTime") %></h1>

<hr>

<!-- JSTL tag -->
<h3>Marks are: ${marks}</h3>
<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>
</body>
</html>
