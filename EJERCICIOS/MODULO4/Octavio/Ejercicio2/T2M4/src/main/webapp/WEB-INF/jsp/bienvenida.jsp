<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<style>
		.upObject{padding-bottom:10px}
	</style>
</head>
<body>
	<h5>BIENVENIDO SPRING BOOT MODULO 4</h5>
	<H6>TAREA 1</H6>
	<form action="/validaCredenciales">
		<table>
			<tr>
				<td><span class="upObject">Usuario:</span></td>
				<td>
					<input type="text" size=8 name="usuario"/><br><br>
				</td>
			</tr>
			<tr>
				<td><span>Password:</span></td>
				<td>
					<input type="text" size=8 name="password"/><br>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="< LOGIN >"/></td>
			</tr>
		</table>
	</form>
</body>
</html>