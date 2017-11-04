<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<%@taglib prefix="Form"
 uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Usuarios</h2>
		
		<!-- Tabla para listar a todos los usuario -->
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
				<th>Email</th>
			</tr>
			<c:if test="${not empty listUsrs}">
				<c:forEach var="user" items="${listUsrs}">
					<tr>
						<td><c:out value="${user.getId()}"/></td>
						<td><c:out value="${user.getName()}"/></td>
						<td><c:out value="${user.getAge()}"/></td>
						<td><c:out value="${user.getLastName()}"/></td>
						<td><c:out value="${user.getEmail()}"/></td>
					</tr>
				</c:forEach>				
			</c:if>
		</table>
		
		
			<h3>Buscar Por Id</h3>
	<form action="findUsr" method="get" >
		Introduce el Id: <input type="text" name="id"/> 
		<input type="submit"/>
	</form>

	<br><br>
	<h3>Registar nuevo usuario</h3>
	<form action="addUsr" method="post" ><br>
		Id: <input type="text" name="pId"/><br> 
		Nombre: <input type="text" name="pName"/><br>
		Apellido: <input type="text" name="pLName"/><br>
		Edad: <input type="text" name="pAge"/><br>
		Email: <input type="text" name="pEmail"/><br>
		<input type="submit" value="Guardar"/>
	</form>

</body>
</html>