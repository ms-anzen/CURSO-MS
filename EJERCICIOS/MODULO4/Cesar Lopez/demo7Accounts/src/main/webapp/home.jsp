<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
		<head>
		    <title>Inicio</title>
		    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
			<!-- vinculo a bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Temas-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- se vincula al hoja de estilo para definir el aspecto del formulario de login-->  
<link rel="stylesheet" type="text/css" href="estilo.css">
		</head>

<body class="bg-colores">
	<div id="ContenedorHome" >
	<h4 style="text-align:right;">Ultimo Acceso: ${date}</h4>
    <br /><br /><br /><br />
    <p>Bienvenid@: </p>
    <label class="form-control" name="label" placeholder="User2" id="Correo2" aria-describedby="sizing-addon1" ># ${id} ... ${name} </label>
    
    <br /><br /><br /><br /><br />
    
    
    	 
		<button class="btn btn-lg btn-primary btn-block btn-signin" onclick="window.location.href='/getAccounts'">Ver Cuentas</button>
	
		 	
    <button class="btn btn-lg btn-primary btn-block btn-signin" onclick="window.location.href='/salir'">Cerrar Sesión</button>
	
    </div>
</body>
</html>