<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>this is home page</h1>
<h1>
<% 
  String st= (String)request.getAttribute("name");
  out.print(st);
Object st1=   request.getAttribute("friends");
  out.print(st1);
%></h1>
${name} 




</body>
</html>