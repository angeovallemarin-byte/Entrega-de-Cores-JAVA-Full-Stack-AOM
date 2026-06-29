package com.angelica.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelica.modelos.Cancion;
import com.angelica.repositorios.RepositorioCanciones;

@Service //anotación
public class ServicioCanciones {
	@Autowired //Inyectar al servicio el repositorio
	private RepositorioCanciones repositorioCanciones;
	
	//MÉTODOS
	//obtenerTodasLasCanciones(): Devuelve una lista de objetos Cancion de la tabla canciones de nuestra base de datos.
	public List<Cancion> obtenerTodasLasCanciones(){
		return (List<Cancion>) this.repositorioCanciones.findAll();
	}
	
	//obtenerCancionPorId(Long): Devuelve un solo objeto de tipo Cancion dado el id enviado como parámetro. Si la Cancion no existe devuelve null.
	public Cancion obtenerCancionPorId(Long id) {
		return this.repositorioCanciones.findById(id).orElse(null);
	}
	
	//agregarCancion(Cancion): Agrega la canción a la base de datos dado el Objeto Cancion enviado como parámetro. Devuelve un objeto Cancion con la canción creada.
	public Cancion agregarCancion(Cancion cancion) {
		return this.repositorioCanciones.save(cancion);
	}
}
