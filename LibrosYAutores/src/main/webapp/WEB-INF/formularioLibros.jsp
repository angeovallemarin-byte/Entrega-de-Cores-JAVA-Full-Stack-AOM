<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*, java.text.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Libros</title>
</head>
<body>
	<h1>Agregar Nuevo Libro</h1>
	
	<form action="/procesa/libro" method="POST">
		<div>
			<label>Nombre del Libro:</label>
			<input type="text" name="nombreLibro" required>
		</div>
		<br>
		<div>
			<label>Autor:</label>
			<input type="text" name="nombreAutor" required>
		</div>
		<br>
		<button type="submit">Guardar Libro</button>
	</form>
	
	<br>
	<a href="/libros">
		<button type="button">Regresar</button>
	</a>

	
</body>
</html>