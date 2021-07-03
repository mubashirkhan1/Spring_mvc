<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %> 
<%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page is running ........</title>
</head>
<body>
<h1><%out.print("this is help page"); 

String name=(String)request.getAttribute("name");
Integer no=(Integer)request.getAttribute("no");
%></h1>
<h3> this is my name   <%out.print(name);
       out.print(no);
%></h3>

${name23} 
<c1:forEach var="it" items="${name23 }">
<h1> ${it}</h1>
</c1:forEach>
</body>
</html>