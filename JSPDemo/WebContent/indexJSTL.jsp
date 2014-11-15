<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.ArrayList" %>
<%@page import="com.jsp.tutorial.model.AlumnoBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	ArrayList<AlumnoBean> listaAlumnos = new ArrayList<AlumnoBean>();
	
	listaAlumnos.add(new AlumnoBean("Jaime","Montoro"));
	listaAlumnos.add(new AlumnoBean("Heber","Rabanal"));
	listaAlumnos.add(new AlumnoBean("Luis","Magallanes"));
	listaAlumnos.add(new AlumnoBean("Lizeth","Zoraida"));

	session.setAttribute("listaAlumnos", listaAlumnos);
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hola mundo</h2>
	<p>
		Este parrafo se motrara siempre
	</p>
	<c:if test="${param.mostrarTextoCondicional=='true'}"
	 var="textlMostrado" scope="session">
		<p>
			Este parrafo se muestra si el parametro
			de la condicion llega por url como true
			<!-- http://localhost:8080/JSPDemo/indexJSTL.jsp?mostrarTextoCondicional=true -->
		</p>
	</c:if>
	<p>
		<c:choose>
			<c:when test="${param.mostrarTextoCondicional=='1'}">
				Este parrafo se muestra cuando parametro es igual a 1
			</c:when>
			<c:when test="${param.mostrarTextoCondicional=='2'}">
				Este parrafo se muestra cuando parametro es igual a 2
			</c:when>
			<c:otherwise>
				Este parrafo se muestra cuando parametro es distinto a 1 o 2
			</c:otherwise>
		</c:choose>
	</p>
	<table border="1" cellpadding="1" cellspacing="1">
		<thead>
			<tr>
				<th>Nombres</th>
				<th>Apellidos</th>
			</tr>			
		</thead>
		<tbody>
			<c:forEach var="alumnos" 
					items="${sessionScope.listaAlumnos}" >
					<tr>
						<td>${alumnos.nombre}</td>
						<td>${alumnos.apellidos}</td>
					</tr>
			</c:forEach>
		</tbody>		
	</table>
	<p>
		Este párrafo tambien se mostrara siempre
	</p>
</body>
</html>