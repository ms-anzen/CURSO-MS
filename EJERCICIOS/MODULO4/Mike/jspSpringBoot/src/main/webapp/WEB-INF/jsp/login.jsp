<html>

<head>
<title>Jsp Spring Boot Demo</title>
</head>

<body>
	<h1>Bienvenido!!!</h1><br>
    <font color="red">${errorMessage}</font>
    <form method="post">
        Usuario : <input type="text" name="name" />
        Contraseña : <input type="password" name="password" /> 
        <input type="submit" value="Enviar" />
    </form>
</body>

</html>

