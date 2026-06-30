<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Artistas</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor artistas">
		<h2>Lista de Artistas</h2>
		<ul class="listaArtistas">
			<c:forEach var="artista" items="${artistas}">
				<li>
					<a href="/artistas/detalle/${artista.id}">
						${artista.nombre} ${artista.apellido}
					</a>
				</li>
			</c:forEach>
		</ul>
		<br>
		<a class="botonAgregar" href="/artistas/formulario/agregar">Agregar Artista</a>
		
		<br>
		<br>
		
		<a class="botonVolver" href="/canciones">Ir a Canciones</a>
		
	</div>
</body>
</html>