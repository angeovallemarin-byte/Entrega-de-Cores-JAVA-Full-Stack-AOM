package com.angelica.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.angelica.modelos.Artista;
import com.angelica.servicios.ServicioArtistas;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller //Anotación
public class ControladorArtistas {
	@Autowired //Inyecta al controlador el servicio.
	private ServicioArtistas servicioArtistas;
	
	
	//RUTAS
	
	//desplegarArtistas(): Ruta a utilizar “/artistas”. Devuelve una lista de objetos Artista para ser enviadas a la vista JSP artistas.jsp.
	@GetMapping("/artistas")
	public String desplegarArtistas(Model modelo) {
		List<Artista> artistas = this.servicioArtistas.obtenerTodosLosArtistas();
		modelo.addAttribute("artistas", artistas);
		return "artistas.jsp";
	}
	
	//desplegarDetalleArtista(): Ruta a utilizar “/artistas/detalle/{idArtista}”. Devuelve un objeto Artista que coincide con el idArtista recibido en la variable de ruta para ser enviado a la vista JSP detalleArtista.jsp. 
	@GetMapping("/artistas/detalle/{idArtista}")
	public String desplegarDetalleArtista(@PathVariable("idArtista") Long idArtista, Model modelo) {
		modelo.addAttribute("artista", this.servicioArtistas.obtenerArtistaPorId(idArtista));
		return "detalleArtista.jsp";
	}
	
	//formularioAgregarArtista): Ruta a utilizar “/artistas/formulario/agregar/{idArtista}”. Desplegar la vista JSP agregarArtista.jsp. Este formulario cuenta con todos los campos/atributos de un artista.
	@GetMapping("/artistas/formulario/agregar")
	public String formularioAgregarArtista(HttpSession sesion, Model modelo) {
		modelo.addAttribute("artista", new Artista());
		return "agregarArtista.jsp";
	}
	
	//procesarAgregarArtista(): Ruta a utilizar “/artistas/procesa/agregar”. Agrega el artista a la base de datos. Redirige a la ruta de “/artistas”. En caso de que el formulario no pase alguna validación hay que redirigir al mismo formulario agregarArtista.jsp para mostrar los errores.
	@PostMapping("/artistas/procesa/agregar")
	public String procesarAgregarArtista(@Valid @ModelAttribute("artista") Artista artista, BindingResult validaciones) {
		if(validaciones.hasErrors()) {
			return "agregarArtista.jsp";
		}
		this.servicioArtistas.agregarArtista(artista);
		return "redirect:/artistas";
	}
	
	
	
}