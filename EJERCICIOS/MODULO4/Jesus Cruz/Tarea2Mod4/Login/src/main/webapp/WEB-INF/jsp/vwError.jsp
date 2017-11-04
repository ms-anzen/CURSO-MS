<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.0.0/css/font-awesome.css" />
<title>Insert title here</title>
</head>
<body>
	<header>
   		<nav class="navbar navbar-default">
   	    	<div class="container">
  	         	<div class="navbar-header">
   	                <span class="navbar-brand">Ejercicio 2 Modulo 4</span>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="<%=request.getContextPath()%>/bienvenida.html"><i class="fa fa-home"></i>Home</a></li>
                </ul>
            </div>
		</nav>
	</header>
	<section>
		<div class="jumbotron text-center">
			<h1>ERROR</h1>
        	<p>Usuario o password incorrectos</p>
		</div>
	</section>
       
    <footer class="text-center">
		<hr>
		<strong>- Curso MS -</strong>
    </footer>	
</body>
</html>