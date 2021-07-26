<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Using ModelAndView Object</h3>
   <%
      ArrayList<String> list=(ArrayList<String>)request.getAttribute("list");
   %>
   <%for(String str:list){ %>
   <h3><%=str%></h3>
   <%}%>
</body>
</html>