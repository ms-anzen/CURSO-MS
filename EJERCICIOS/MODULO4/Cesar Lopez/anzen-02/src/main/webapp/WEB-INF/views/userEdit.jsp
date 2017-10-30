<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Usuario Existente</title>
</head>
<body>

<h1>Editar Usuario</h1>  
       <form:form method="POST" action="/digital/editsave" modelAttribute="usuario">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>Nombre: </td>   
          <td><form:input path="name"  /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Guardar Cambios" /></td>    
         </tr>    
        </table>    
       </form:form>    


</body>
</html>