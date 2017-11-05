<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<title>Home</title>
</head>
<body>
	<center>
		<h1>Hola ${name}</h1>
	</center>
	<br />
	<br /> 
	Última fecha de acceso ${lastLogin}
	<br />
	<br />
	<a href="/accounts"><button>Consultar Cuentas</button> </a>
	<br />
	<br />
	<a href="/logout"><button>Salir</button> </a>
</body>
</html>