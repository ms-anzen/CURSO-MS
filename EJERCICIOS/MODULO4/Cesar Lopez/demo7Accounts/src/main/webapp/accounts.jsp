<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
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
	<h4>Cuentas de # ${id} Name:  ${newName}  </h4>
	
    <br /><br />
    
    	<c:if test="${not empty accounts}">

		<ul>
			<c:forEach var="listValue" items="${accounts}">
				<li> <label class="form-control" name="label" placeholder="User2" id="Correo2" aria-describedby="sizing-addon1" > Numero de Cuenta: ${listValue.numero}  </label>
				<label class="form-control" name="label" placeholder="User2" id="Correo2" aria-describedby="sizing-addon1" > Alias: ${listValue.alias}  </label>
				<label class="form-control" name="label" placeholder="User2" id="Correo2" aria-describedby="sizing-addon1" > Tipo: ${listValue.tipo}  </label>
				      </li>
				      <br />
			</c:forEach>
		</ul>

	</c:if>
    	 
		<button class="btn btn-lg btn-primary btn-block btn-signin" onclick="window.location.href='/home'">Regresar</button>

	
    </div>
</body>
</html>




