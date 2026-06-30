<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Canción</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
	<div class="contenedor editar" >
		<h2>Editar Canción</h2>
		
	    <form:form action="/canciones/procesa/editar/${idCancion}" method="POST" modelAttribute="cancion">
	   		<input type="hidden" name="_method" value="PUT" />
	    	
	    	<div class="atributo">
		    	<form:label path="titulo">Título:</form:label>
		    	<form:input path="titulo" type="text" />
		    	<form:errors path="titulo" id="mensajeError"/>
	    	</div>
	    	
	    	<div class="atributo">
		    	<form:label path="artista">Artista:</form:label>
		    	<form:input path="artista" type="text" />
		    	<form:errors path="artista" id="mensajeError"/>
	    	</div>
	    	    	
	    	<div class="atributo">
		    	<form:label path="album">Álbum:</form:label>
		    	<form:input path="album" type="text" />
		    	<form:errors path="album" id="mensajeError"/>
	    	</div>
	    		    
		    <div class="atributo">	
		    	<form:label path="genero">Género:</form:label>
		    	<form:input path="genero" type="text" />
		    	<form:errors path="genero" id="mensajeError"/>
	    	</div>
	    		    	
		    <div class="atributo">	
		    	<form:label path="idioma">Idioma:</form:label>
		    	<form:input path="idioma" type="text" />
		    	<form:errors path="idioma" id="mensajeError"/>
	    	</div>
	    	
	    	<br>	
	    	<input class="botonEditar" type="submit" value="Editar" />
	    	 
	    </form:form>
	    	<br>
	    	<a class="botonVolver" href="/canciones">Volver a lista de canciones</a>
    </div>
</body>
</html>