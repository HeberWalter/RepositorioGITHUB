<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Encuesta de desarrolladores</title>
</head>
<body>
	<h1>Bienvenido a la encuesta para desarrolladores</h1>
	<p>Indica los lenguajess de programación con los que estas familiarizado</p>
	<form action="encuesta" method="POST">
		<table border="1">
			<tr>
				<td>Nombre completo</td>
				<td><input type="text" name="nombreCompleto" value="" /></td>
			</tr>
			<tr>
				<td>Java</td>
				<td><input type="checkbox" name="lenguajes" value="Java" /></td>
			</tr>
			<tr>
				<td>PHP</td>
				<td><input type="checkbox" name="lenguajes" value="PHP" /></td>
			</tr>
			<tr>
				<td>Ruby</td>
				<td><input type="checkbox" name="lenguajes" value="Ruby" /></td>
			</tr>
			<tr>
				<td>Python</td>
				<td><input type="checkbox" name="lenguajes" value="Phyton" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Enviar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>