<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle Artista</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor detalle">
		<h2>${artista.nombre} ${artista.apellido}</h2>
		<ul id="detalleArtista">
			<li>Biografía: ${artista.biografia}</li>
		    <li>Fecha Registro: <b>${artista.fechaCreacion}</b></li>
			<li>Última Actualización: <b>${artista.fechaActualizacion}</b></li>
		</ul>
		<c:if test="${fn:length(artista.canciones) > 0}">
        	<h3>Listado de Canciones: </h3>
        	<ul id="listaCanciones">
        		<c:forEach var="cancion" items="${artista.canciones}">
				        <li><b>${cancion.titulo} </b>  (${cancion.genero}) </li>
				</c:forEach>
        	</ul>
        </c:if>
		
		<br>
		<a class="botonVolver" href="/artistas">Volver a lista de artistas</a>
	</div>
</body>
</html>