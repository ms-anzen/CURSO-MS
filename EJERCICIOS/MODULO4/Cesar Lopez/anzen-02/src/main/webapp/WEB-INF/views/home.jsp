<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
 
 <h1>Lista de usuarios</h1>  
<table>  
<tr><th>Id</th><th>Nombre</th><th>Ver/Editar</th><th>Eliminar</th></tr>  
   <c:forEach var="user" items="${serverList}">   
   <tr>  
   <td>${user.getId()}</td>   
   <td>${user.getName()}</td>      
   <td><a href="editUser/${user.getId()}">Ver/Editar</a></td>  
   <td><a href="deleteUser/${user.getId()}">Eliminar</a></td>  
   </tr>  
   </c:forEach>  
   </table> 
   
    
    
   <br/>  
   <a href="addUser">Agregar Nuevo Usuario</a>  
   <br/>
   <br/>
   
   
	<h4>Buscar Usuario</h4> 
	
	<form action="search" method="get" >
		Id: <input type="text" name="id"/> 
		<input type="submit" value="buscar"/>
	</form> 

 <br>
 <br>
 
</body>
</html>
