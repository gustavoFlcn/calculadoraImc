<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado IMC</title>
</head>
<body>
<% 
	String resultado = request.getAttribute("resultado").toString();
%>
<h2><%=resultado%></h2>
</body>
</html>