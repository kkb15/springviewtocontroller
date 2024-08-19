<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<h1>This is the home page</h1>

<%
String name = (String) request.getAttribute("name");
List<String> friendsname =(List<String>) request.getAttribute("friendlist");
%>

<h1>Name is <%=name%></h1>

<h2>list is 
 <%
 for(String s : friendsname){
	 out.println(s);
 }

 %></h2>

</body>
</html>
