package com.angelica.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelica.modelos.Artista;
import com.angelica.repositorios.RepositorioArtistas;


@Service //anotación
public class ServicioArtistas {
	@Autowired //Inyectar al servicio el repositorio
	private RepositorioArtistas repositorioArtistas;
	
	//MÉTODOS
	//obtenerTodosLosArtistas(): Devuelve una lista de objetos Artista de la tabla artistas de nuestra base de datos.
	public List<Artista> obtenerTodosLosArtistas(){
		return (List<Artista>) this.repositorioArtistas.findAll();
	}
	
	//obtenerArtistaPorId(Long): Devuelve un solo objeto de tipo Artista dado el id enviado como parámetro. Si el Artista no existe devuelve null.
	 public Artista obtenerArtistaPorId(Long id) {
		 return this.repositorioArtistas.findById(id).orElse(null);
	 }
	
	//agregarArtista(Artista): Agrega el artista a la base de datos dado el Objeto Artista enviado como parámetro. Devuelve un objeto Artista con el artista creado.
	 public Artista agregarArtista(Artista artista) {
		 return this.repositorioArtistas.save(artista);
	 }
	
	
}