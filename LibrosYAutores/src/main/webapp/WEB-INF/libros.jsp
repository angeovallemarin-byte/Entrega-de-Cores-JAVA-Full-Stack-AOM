<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!--Permite uso de sintaxis de JSTL-->
<%@ page import="java.util.*, java.text.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Libros</title>
</head>
<body>
	
    <h1>Libros disponibles</h1>

    <p>Selecciona un libro para ver mayor información: </p>

    <ul>
        <c:forEach var="libro" items="${listaDeLibros}">
            <li>
				<a href="/libros/${libro.key}">${libro.key}</a>
			</li>
        </c:forEach>
    </ul>
    <br>
    <a href="/libros/formulario">Agregar un Libro</a>
</body>
</html>
