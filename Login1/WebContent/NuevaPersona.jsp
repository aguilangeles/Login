<%@page import="entidad.Persona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String nombre = request.getParameter("name"); 
	String apellido = request.getParameter("surname");
	String domicilio = request.getParameter("address");
	String edad = request.getParameter("age");
	int age = Integer.parseInt(edad);
	Persona pna = new Persona(nombre, apellido, domicilio, age);
	session.setAttribute("pna", pna);
	response.sendRedirect("ls");
	%>

</body>
</html>