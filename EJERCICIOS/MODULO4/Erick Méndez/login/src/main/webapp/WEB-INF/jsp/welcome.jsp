<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Serving Web Content</title>
<meta charset="utf-8" />
</head>
<body>
	<form action="/login" method="post">
	<label for="usuario">Usuario</label>
	<input type="text" name="usuario" placeholder="Usuario"/>
	<label for="pass">Contraseņa</label>
	<input type="password" name="pass" placeholder="Contraseņa"/>
	<button type="submit">Entrar</button>
	</form>
</body>
</html>