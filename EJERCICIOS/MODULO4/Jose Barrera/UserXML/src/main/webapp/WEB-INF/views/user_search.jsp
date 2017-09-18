<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty user}">
		<ul>
			<li>Name: <b>${user.getName()} ${user.getLastname()} </b></li>
			<li>Age: ${user.getAge()}</li>
			<li>Email: ${user.getEmail()}</li>
		</ul>
	</c:if>
	<a href="/use/users">Return</a>
</body>
</html>