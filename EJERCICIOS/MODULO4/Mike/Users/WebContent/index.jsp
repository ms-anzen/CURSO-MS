<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First Spring MVC example</title>
<script>
	var idUser = 0;
	
	function getValue(){
		idUser = document.getElementById('id').value;
		document.getElementById("findUser").setAttribute("href","users/" + idUser);
	}
</script>
</head>
<body>
	<br>
	<div align='center'>
		<h2>
			 Elige una opcion.<br><br>
		</h2>
		<h3>
			<a href="users">1. Listar Usuarios</a><br>
			<a href="addUser">2. Agregar un Usuario</a><br>
			<input id="id" type="text" onfocusout="getValue()" ><a id="findUser" > Buscar</a>
		</h3>
	</div>
</body>
</html>