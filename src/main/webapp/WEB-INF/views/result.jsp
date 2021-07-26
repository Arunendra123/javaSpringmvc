<!DOCTYPE html>
<%@page import="javaSpringMVC.Calculator.Calculate"%>
<%@page import="java.util.List"%>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Java Servlet Tutorial</title>
</head>
  <body>
        <h1>!!Calculator: Pure JSP!!</h1>
        <% 
           Calculate c=new Calculate();
           int y=c.getResult(request.getParameter("operation"),Integer.parseInt(request.getParameter("num1")),Integer.parseInt(request.getParameter("num2")));
        %>
        <h3>Result:<%=y%></h3>
  </body>
</html>