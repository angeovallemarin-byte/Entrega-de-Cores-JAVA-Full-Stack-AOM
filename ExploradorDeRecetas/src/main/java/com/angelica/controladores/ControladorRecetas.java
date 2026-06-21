package com.angelica.controladores;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas{
	
	//ATRIBUTOS requeridos
	private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<String, String[]>();
	/*private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
	private static HashMap<String, String []> recetasConIngredientes = new HashMap<>();*/
	
	//CONSTRUCTOR requerido
	public ControladorRecetas() {
		String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
		recetasConIngredientes.put("Pizza", pizza);
		String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
		recetasConIngredientes.put("Espagueti", espagueti);
		String[] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
		recetasConIngredientes.put("Lasaña", lasaña);
	}
	
	//MÉTODOS
		//obtenerTodasLasRecetas(): Método que responde a la ruta /recetas. 
	@GetMapping("/recetas")
	public String obtenerTodasLasRecetas(Model modelo) {
		//Este método toma la lista de recetas y la agrega como atributo “listaRecetas” a un objeto Modelo para enviar hacia el JSP llamado recetas.jsp.
		modelo.addAttribute("listaRecetas", listaRecetas);
		return "recetas.jsp";
	}

		//obtenerRecetaPorNombre(): Método que responde a la ruta /recetas/{nombre}. Este método busca el nombre de la receta y agrega su nombre y sus ingredientes en dos atributos respectivamente a un objeto Modelo para enviar hacía el JSP llamado detalleReceta.jsp En caso de que la receta no exista en la lista devolver un mensaje como el siguiente: «La receta no se encuentra en nuestra lista.»
	@GetMapping("/recetas/{nombre}")
	public String obtenerRecetaPorNombre(@PathVariable("nombre") String nombre, Model modelo){
		if(!recetasConIngredientes.containsKey(nombre)) {
			modelo.addAttribute("mensajeError", "La receta no se encuentra en nuestra lista.");
		}else {
			modelo.addAttribute("nombreReceta", nombre);
			modelo.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
			//reemplaza mayusculas por minusculas y la ñ por n para usar la imagen
			String imagenReceta = nombre.toLowerCase().replace("ñ", "n");
			modelo.addAttribute("imagenReceta", imagenReceta);
		}
		return "detalleReceta.jsp";
	}
		
		/*String recetaEncontrada = this.buscar(nombre); //busca el nombre en el arreglo String[]
		
		if(recetaEncontrada != null) { //si la receta existe
			modelo.addAttribute("nombreReceta", recetaEncontrada); //agregar nombre de receta al modelo
			modelo.addAttribute("ingredientes", recetasConIngredientes.get(recetaEncontrada)); //agregar ingredientes al modelo buscando en el hasmap
		} else { //en caso de q no exista, muestra este mensaje
			modelo.addAttribute("error", "La receta no se encuentra en nuestra lista.");
		}
		return "detalleReceta.jsp"; //envía la jsp 
	}

	//método buscar que usa el controlador
	private String buscar(String nombre) {
		String r = null;			
		for (int i = 0; i < listaRecetas.length; i++) {
			if (nombre != null && listaRecetas[i].equalsIgnoreCase(nombre)) {
				r = listaRecetas[i];
				break;
			}
		}
		return r;
		}*/
}
	
	
	
