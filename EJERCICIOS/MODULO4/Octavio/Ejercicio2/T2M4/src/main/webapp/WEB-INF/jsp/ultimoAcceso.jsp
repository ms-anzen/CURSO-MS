<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<script>
		function regresar(){
			window.location = "http://localhost:8081/bienvenida.html";
		}
	</script>
</head>
<body>
	<h5>LOGIN EXITOSO</h5>
	<table>
		<tr>
			<td>Nombre de usuario:</td>
			<td>${usuario}</td>
		</tr>
		<tr>
			<td>Último acceso:</td>
			<td>${ultimoAcceso}</td>
		</tr>
		<tr>
			<td></td>
			<td><input type="button" value="Regresar" onclick="regresar()"></td>
		</tr>
	</table>
</body>
</html>