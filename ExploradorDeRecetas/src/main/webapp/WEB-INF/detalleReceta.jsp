<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle de Receta</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200">
	<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class=general>
		<c:choose>
			
			<c:when test="${nombreReceta != null}">
				<h1>Receta de ${nombreReceta}</h1>
				<div class=contenedor>
					<h3>Ingredientes:</h3>
					<div class=ingredientesReceta>
						<ul>
							<c:forEach var="ingrediente" items="${ingredientes}">
								<li>${ingrediente}</li>
							</c:forEach>
						</ul>
						<img src="/png/${imagenReceta}.png" alt="Imagen de la receta">
					</div>
				</div>
			</c:when>
			
			<c:otherwise>
					<p>La receta no se encuentra en nuestra lista.</p>
			</c:otherwise>
		</c:choose>
		
		<br>
		<a class=volver href="/recetas">Volver</a>
	</div>
	
</body>
</html>