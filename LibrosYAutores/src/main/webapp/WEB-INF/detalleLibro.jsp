<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--Permite uso de sintaxis de JSTL-->
<%@ page import="java.util.*, java.text.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle del Libro</title>
</head>
<body>
    <c:choose>
  
		<c:when test="${libro != null}">
			<h1>Información del Libro</h1>
			<p>Libro: ${libro}</p>
			<p>Autor: ${autor}</p>
		</c:when>
		
		<c:otherwise>
			<p>${mensajeError}</p>
		</c:otherwise>
	</c:choose>
	
	<br>
	<a href="/libros">
		<button type="button">Regresar</button>
	</a>
</body>
</html>