<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gracias</title>
</head>
<body>
	<h2>Gracias por participar en nuestra encuenta</h2>
	<!-- Los scriptlets son aquellos que tienen acceso a todos los objetos implicitos 
	como request, response, el codigo java de abajo es un ejemplo de ello-->
	<p>
		<jsp:useBean id="datosEncuesta" scope="request" class="com.jsp.tutorial.model.DatosEncuesta" />
		<jsp:getProperty  name="datosEncuesta" property="nombreCompleto" />,
		Nos haz indicado que estás familiarizado con los siguientes
		lenguajess de programación		
	</p>
	<ul>
		<%
			String[] lenguajesSeleccionados = datosEncuesta.getLenguajes();
			if (lenguajesSeleccionados!=null){
				for (int i =0; i<lenguajesSeleccionados.length;i++){
		%>
			<li>
				<%=lenguajesSeleccionados[i] %>
			</li>
		
		<%		}		
			}
			
		%>
	</ul>
	<br>
	<input type="button" value="Regresar" onClick="history.back()">	
</body>
</html>