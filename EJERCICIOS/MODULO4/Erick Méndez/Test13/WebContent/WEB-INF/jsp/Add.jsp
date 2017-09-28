<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Agregar usuario</h2>
	<form action="/Test/new" method="POST">
		id: <input type="text" name="id" required /> 
		Nombre: <input type="text" name="nombre" required /> 
		Apellido: <input type="text" name="apellido" required /> 
		<input type="submit" value="Agregar">
		<button><a href="/Test/users">cancelar</a></button>
	</form>
</body>
</html>