<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
<title>Jsp Spring Boot Demo</title>
<style>
	#accounts {
	    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}

	#accounts td, #accounts th {
	    border: 1px solid #ddd;
	    padding: 8px;
	}
	
	#accounts tr:nth-child(even){background-color: #f2f2f2;}
	
	#accounts tr:hover {background-color: #ddd;}
	
	#accounts th {
	    padding-top: 12px;
	    padding-bottom: 12px;
	    text-align: left;
	    background-color: #4CAF50;
	    color: white;
	}
</style>
</head>

<body>
	<a href="/bienvenida.html">Home</a><br><br> 
	<table id="accounts">    	
    	<tr>
    		<th>Numero de Cuenta</th>
    		<th>Alias de la Cuenta</th>
    		<th>Tipo de cuenta</th>
    	</tr>   		
  		<c:forEach var="account" items="${accounts}">
    		<tr>
      			<td>${account.number}</td>
      			<td>${account.alias}</td>
      			<td>${account.type}</td>
    		</tr>
  		</c:forEach>
	</table>
</body>

</html>