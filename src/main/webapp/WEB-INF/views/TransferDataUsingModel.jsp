<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Using Model Object</h3>
   <%
      String name=(String)request.getAttribute("name");
      String id=(String)request.getAttribute("id");
   %>
   <h3>Name:<%=name%> Id:<%=id%></h3>
</body>
</html>