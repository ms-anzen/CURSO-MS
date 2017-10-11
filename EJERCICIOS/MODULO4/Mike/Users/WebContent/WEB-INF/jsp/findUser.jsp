<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form"
 uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/index.jsp">home</a><br>
	<h2>Agregar un Usuario</h2>
	<form:form modelAttribute="user" action="users.do" method="post">
		Nombre:<form:input id="name" path="name" /><br>
		Apellido Paterno:<form:input id="ap_pat" path="ap_pat" /><br>
		Apellido Materno:<form:input id="ap_mat" path="ap_mat" /><br>
		Telefono:<form:input id="phone" path="phone" /><br>
		<form:button value="enviar" >Agregar Usuario</form:button>
	</form:form>
</body>
</html>