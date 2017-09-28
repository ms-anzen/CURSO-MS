<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuario</title>
</head>
<body>


	<core:if test="${ empty usr }">
		<h2>No existe el usuario buscado</h2>
	</core:if>
	<core:if test="${ not empty usr}">
		<h2>Usuario encontrado</h2>
		<br />
		<br />
		<b>ID: </b> ${ usr.id }
		<br />
		<br />
		<b>Nombre: </b> ${ usr.nombre }
		<br />
		<br />
		<b>Apellido: </b> ${ usr.apellido }
		<br />
		<br />
	</core:if>
	<a href="/Test/users">Regresar</a>
</body>
</html>