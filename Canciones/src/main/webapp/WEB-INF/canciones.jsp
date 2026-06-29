<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Canciones</title>
	<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor canciones">
		<h2>Lista de Canciones</h2>
		<table class=tabla>
			<thead class="encabezado">
			    <tr>
			        <th class="inicio">Título</th>
			        <th>Autor</th>
			        <th class="final">Detalle</th>
			    </tr>
			</thead>
			<tbody>
				<c:forEach var="cancion" items="${canciones}">
				    <tr class="fila">
				        <td class="inicio">${cancion.titulo}</td>
				        <td>${cancion.artista}</td>
				        <td class="final">
				        	<a class="botonDetalle" href="/canciones/detalle/${cancion.id}">Detalle</a>
				        </td>
				    </tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>