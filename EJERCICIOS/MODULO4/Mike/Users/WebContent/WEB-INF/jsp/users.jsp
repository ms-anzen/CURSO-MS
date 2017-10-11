<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/index.jsp">home</a><br>	
	<c:if test="${not empty users}">
		<h2>Usuarios Registrados:</h2>
		<ul>
			<c:forEach var="user" items="${users}">
				<li>
					id: ${user.id}
					Nombre: ${user.name}
							${user.ap_pat}
							${user.ap_mat}
					Telefono: ${user.phone}
				</li>
			</c:forEach>
		</ul>
	</c:if>
	<c:if test="${empty users}">	
		<h2>Usuarios Encontrados:</h2>	
		${user.name}
	</c:if>
</body>
</html>