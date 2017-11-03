<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Serving Web Content</title>
<meta charset="utf-8" />
</head>
<body>
	<form action="/home" method="post">
	<label for="userName">Usuario</label>
	<input type="text" name="userName" placeholder="Usuario"/>
	<label for="pass">Contraseña</label>
	<input type="password" name="password" placeholder="Contraseña"/>
	<button type="submit">Entrar</button>
	</form>
</body>
</html>