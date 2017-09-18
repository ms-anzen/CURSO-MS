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
	<form action="/use/users" method=POST>
		Name: 
		<input type="text" name="name" required />
		Last Name:  
		<input type="text" name="lname" required />
		Age:  
		<input type="text" name="age" required />
		Email:  
		<input type="text" name="email" required />
		<input type="submit" value="Add">
	</form>
	Users:<br>
	<ul>
		<c:forEach var="user" items="${data}">
		<li><a href="/use/users/${data.indexOf(user)}">${user.getName()} ${user.getLastname()}</a></li>
		</c:forEach>
	</ul>
</body>
</html>