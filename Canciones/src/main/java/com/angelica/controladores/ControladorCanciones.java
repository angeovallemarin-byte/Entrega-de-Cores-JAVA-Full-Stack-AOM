package com.angelica.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.angelica.modelos.Cancion;
import com.angelica.servicios.ServicioCanciones;

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

}
