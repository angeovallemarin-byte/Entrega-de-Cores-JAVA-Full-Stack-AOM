<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle Canción</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor detalle">
		<h2>${cancion.titulo}</h2>
		<ul>
			<li>Artista: <b>${cancion.artista}</b></li>
			<li>Álbum: <b>${cancion.album}</b></li>
			<li>Género: <b>${cancion.genero}</b></li>
			<li>Idioma: <b>${cancion.idioma}</b></li>
			<li>Fecha de Creación: <b>${cancion.fechaCreacion}</b></li>
			<li>Última Actualización: <b>${cancion.fechaActualizacion}</b></li>
		</ul>
		<br>
		<a class="botonEditar" href="/canciones/formulario/editar/${idCancion}">Editar Canción</a>
		<br><br>
		<form:form action="/canciones/eliminar/${idCancion}" method="POST" modelAttribute="cancion">
			<input type="hidden" name="_method" value="DELETE" />
			<input class="botonEliminar" type="submit" value="Eliminar Canción" />
		</form:form>
		<br>
		<a class="botonVolver" href="/canciones">Volver a lista de canciones</a>
	</div>
</body>
</html>