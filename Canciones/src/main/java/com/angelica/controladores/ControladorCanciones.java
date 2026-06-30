package com.angelica.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.angelica.modelos.Cancion;
import com.angelica.servicios.ServicioCanciones;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller //Anotación
public class ControladorCanciones {
	@Autowired //Inyecta al controlador el servicio.
	private ServicioCanciones servicioCanciones;
	
	//desplegarCanciones(): Ruta a utilizar “/canciones”. Devuelve una lista de objetos Cancion para ser enviadas a la vista JSP canciones.jsp.
	@GetMapping("/canciones")
	public String desplegarCanciones(Model modelo) {
		List<Cancion> canciones = this.servicioCanciones.obtenerTodasLasCanciones();
		modelo.addAttribute("canciones", canciones);
		return "canciones.jsp";
	}
	
	//desplegarDetalleCancion(): Ruta a utilizar “/canciones/detalle/{idCancion}”. Devuelve un objeto Cancion que coincide con el idCancion recibido en la variable de ruta para ser enviado a la vista JSP detalleCancion.jsp.
	@GetMapping("/canciones/detalle/{idCancion}")
	public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model modelo) {
		modelo.addAttribute("cancion", this.servicioCanciones.obtenerCancionPorId(idCancion));
		return "detalleCancion.jsp";
	}
	
	//formularioAgregarCancion(): Ruta a utilizar “/canciones/formulario/agregar/{idCancion}”. Desplegar la vista JSP agregarCancion.jsp. Este formulario cuenta con todos los campos/atributos de una canción.
	@GetMapping("/canciones/formulario/agregar")
	public String formularioAgregarCancion(HttpSession sesion, Model modelo) {
		modelo.addAttribute("cancion", new Cancion());
		return "agregarCancion.jsp";
	}
	
	//procesarAgregarCancion(): Ruta a utilizar “/canciones/procesa/agregar”. Agrega la canción a la base de datos. Redirige a la ruta de “/canciones”. En caso de que el formulario no pase alguna validación hay que redirigir al mismo formulario agregarCancion.jsp para mostrar los errores.
	@PostMapping("/canciones/procesa/agregar")
	public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "agregarCancion.jsp";
		}
		this.servicioCanciones.agregarCancion(cancion);
		return "redirect:/canciones";
	}
	
	//formularioEditarCancion(): Ruta a utilizar “/canciones/formulario/editar/{idCancion}”. Devuelve un objeto Cancion dado el idCancion para ser enviado a la vista JSP editarCancion.jsp. Este formulario cuenta con todos los campos/atributos de una canción y deben de estar precargados con la información de la canción actual.
	@GetMapping("/canciones/formulario/editar/{idCancion}")
	public String formularioEditarCancion(HttpSession sesion, Model modelo, @PathVariable("idCancion") Long idCancion) {
		modelo.addAttribute("cancion", this.servicioCanciones.obtenerCancionPorId(idCancion));
		return "editarCancion.jsp";
	}
	
	//procesarEditarCancion(): Ruta a utilizar “/canciones/procesa/editar/{idCancion}”. Edita la canción dado el id recibido como parámetro. Redirige a la ruta de “/canciones”. En caso de que el formulario no pase alguna validación hay que redirigir al mismo formulario editarCancion.jsp para mostrar los errores.
	@PutMapping("/canciones/procesa/editar/{idCancion}")
	public String procesarEditarCancion(@Valid @ModelAttribute("cancion") Cancion cancion, BindingResult validaciones, @PathVariable("idCancion") Long idCancion) {
		if(validaciones.hasErrors()) {
			return "editarCancion.jsp";
		}
		cancion.setId(idCancion);
		this.servicioCanciones.actualizarCancion(cancion);
		return "redirect:/canciones";
	}
	
	//procesarEliminarCancion(): Ruta a utilizar “/canciones/eliminar/{idCancion}”. Elimina la canción dado el id recibido como parámetro. Redirige a la ruta de “/canciones”.
	@DeleteMapping("/canciones/eliminar/{idCancion}") 
	public String procesarEliminarCancion(@PathVariable("idCancion") Long idCancion) {
		this.servicioCanciones.eliminarCancion(idCancion);
		return "redirect:/canciones";
	}
	
}
