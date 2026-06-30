<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Artista</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor agregar">
		<h2>Agregar Artista</h2>
		<form:form action="/artistas/procesa/agregar" method="POST" modelAttribute="artista">
		
			<div class="atributo">
				<form:label path="nombre">Nombre:</form:label>
				<form:input path="nombre" type="text"/>
				<form:errors path="nombre" id="mensajeError"/>
			</div>
			
			<div class="atributo">
				<form:label path="apellido">Apellido:</form:label>
				<form:input path="apellido" type="text"/>
				<form:errors path="apellido" id="mensajeError"/>
			</div>
			
			<div class="atributo">
				<form:label path="biografia">Biografía:</form:label>
				<form:textarea path="biografia" rows="6"/>
				<form:errors path="biografia" id="mensajeError"/>
			</div>
			<br>
			<input class="botonAgregar" type="submit" value="Agregar Artista" />
		</form:form>
		<br>
		<a class="botonVolver" href="/artistas">Volver a lista de artistas</a>
	</div>
</body>
</html>