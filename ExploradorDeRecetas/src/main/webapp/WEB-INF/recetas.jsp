<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--Permite uso de sintaxis de JSTL-->
<%@ page import="java.util.*, java.text.*" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recetas</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=general>
	    <h1>Recetas disponibles</h1>
	
		<div class="contenedor contenedorRecetas">
		    <ul class=listaRecetas>
		        <c:forEach var="receta" items="${listaRecetas}">
		            <li>
						<a href="/recetas/${receta}">${receta}</a>
					</li>
		        </c:forEach>
		    </ul>
		    <img src="/png/recetas.png" alt="Imagen de recetas">
	    </div>
    </div>
</body>
</html>
