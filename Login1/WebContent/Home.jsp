<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="entidad.Persona"%>
<%@page import="dao.impl.PersonaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Potencial tabla</title>
</head>
<body>
 <br/><br/><br/><br/><br/>
        <center>
            <h2>
           <%
           // String a=(String)session.getAttribute("username");
            //out.println("Hello  "+a);
            PersonaDao personadao = (PersonaDao)request.getAttribute("personadao");
			List<Persona> personas = personadao.getPersonas();
            %>
            </h2>
			<table>
				<%
					out.println("<tr>"
							+"<th>nombre</th>"
							+"<th>apellido</th>"
							+"<th>domicilio</th>"
							+"<th>edad</th>"
							+"</tr>");
					for(Persona p : personas){
					out.println("<tr><td>"+p.getNombre()+"</td>");
					out.println("<td>"+p.getApellido()+"</td>");
					out.println("<td>"+p.getDomicilio()+"</td>");
					out.println("<td>"+p.getEdad()+"</td></tr>");
					}
					
					request.setAttribute("persona_dao", personadao);
					%>
			</table>
            <br/>
             <br/><a href="InsertarPersona.html"><input type="submit" value="Insertar"></a>
            <br/><br/><br/><br/><br/>
        <a href="Logout.jsp">Logout</a>
        </center>
</body>
</html>