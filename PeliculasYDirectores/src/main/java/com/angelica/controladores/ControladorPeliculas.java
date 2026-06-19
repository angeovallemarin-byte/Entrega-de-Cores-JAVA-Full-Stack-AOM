package com.angelica.controladores;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControladorPeliculas {
	//Atributo requerido que contiene un HashMap para almacenar películas y sus respectivos directores
	private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();
	
	//Constructor requerido para llenar el HashMap con información de prueba de películas y sus directores
	public ControladorPeliculas() {
		listaPeliculas.put("Winnie the Pooh", "Don Hall");	
		listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
		listaPeliculas.put("Tarzán", "Kevin Lima");		
		listaPeliculas.put("Mulán", "Barry Cook");
		listaPeliculas.put("Oliver", "Kevin Lima");	
		listaPeliculas.put("Big Hero 6", "Don Hall");	
	}
	
	//MÉTODOS
	//obtenerTodasLasPeliculas(): Método que responde a la ruta /peliculas y retorna un string con la lista de todas las películas disponibles.
	@GetMapping("/peliculas")
	public String obtenerTodasLasPeliculas() {
		String peliculas = "Películas disponibles: ";
		for (String pelicula : listaPeliculas.keySet()) { //recorrer los nombres de películar uno por uno
			peliculas = peliculas + "<br>- " + pelicula; //crear listado de películas disponibles y el <br> de html permite el salto de linea porque se envía texto directo al navegador
		}
		return peliculas;
	}
	
	//obtenerPeliculaPorNombre(): Método que responde a la ruta /peliculas/{nombre} y retorna la información de una película específica. 
	@GetMapping("/peliculas/{nombre}")
	public String obtenerPeliculaPorNombre(@PathVariable("nombre") String nombre) {
		if (listaPeliculas.containsKey(nombre)) {
			String director = listaPeliculas.get(nombre);
			return "Película: " + nombre + "<br>Director: " + director; //devuelve el nombre de la película y su director.
		}else {
			return "La película no se encuentra en nuestra lista.";//Si la película no exista en la lista devolvuelve este mensaje.
		}
	}
	
	//obtenerPeliculasPorDirector(): Método que responde a la ruta /peliculas/director/{nombre} y retorna un string con la lista de todas las películas que tiene ese director asignado. En caso de que el director no exista en la lista devolver un mensaje como el siguiente: «No contamos con películas con ese director en nuestra lista.»
	@GetMapping("/peliculas/director/{nombre}")
	public String obtenerPeliculasPorDirector(@PathVariable("nombre") String nombre) {
		String resultado = "";
		
		for(String pelicula : listaPeliculas.keySet()) {
			String director = listaPeliculas.get(pelicula);
			if(director.equalsIgnoreCase(nombre)) {
				//resultado += "Pelicula: " + pelicula + ", dirigida por " + director + "<br>";
				resultado += resultado.isEmpty()
						? "Películas de " + director + ": " + pelicula : ", " + pelicula;
			}
		}
		return resultado.isEmpty() ? "No contamos con películas de ese director en nuestra lista." : resultado;
	}
	
	/*@GetMapping("/peliculas/director/{nombre}")
	public String obtenerPeliculasPorDirector(@PathVariable("nombre") String nombre) {//obtener películas por director6
		for (String pelicula : listaPeliculas.keySet()) { //buscar las películas en la lista
			if (pelicula.equalsIgnoreCase(nombre)) { //ignorar mayúsculas y minúsculas
				String nombre = listaPeliculas.get(pelicula);
			return "Películas dirigidas por " + nombre + ": " + pelicula;
		}else {
			return "No contamos con películas con ese director en nuestra lista.";
		}
		}
	}*/
}
