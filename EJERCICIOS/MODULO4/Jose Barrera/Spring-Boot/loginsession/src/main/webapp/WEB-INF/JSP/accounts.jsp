<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of accounts of ${UserName}:</h1><br>
	<ul>
		<c:forEach var="Account" items="${Accounts}">
		<li>
			<b>Account number</b>:<i>${Account.getAccount()}</i><br>
			<b>Account Alias</b>:<i>${Account.getAlias()}</i><br>
			<b>Account type</b>:<i>${Account.getType()}</i>
		</li>
		</c:forEach>
	</ul>
	
	<a href="/home">Go back</a>
</body>
</html>