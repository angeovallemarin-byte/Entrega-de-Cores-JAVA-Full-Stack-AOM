package com.angelica.modelos;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Asocia la clase a una @Entity y @Table, nombra la tabla “canciones”
@Entity
@Table(name = "canciones")
public class Cancion{
	//ATRIBUTOS
	//Id: Identificador de la canción para la base de datos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	//Título: El nombre de la canción.
	private String titulo;
	//Artista: El nombre del artista o banda que interpreta la canción.
	private String artista;
	//Álbum: El álbum en el que se encuentra la canción.
	private String album;
	//Género: El género musical de la canción (por ejemplo, rock, pop, jazz, etc.).
	private String genero;
	//Idioma: El idioma en el que está escrita la canción.
	private String idioma;
	
	//Fecha de creación: Fecha utilizada para cuando se crea el registro en la tabla de la base de datos.
	@Column(name = "fecha_creacion")
	@CreationTimestamp //se crea automáticamente
	private LocalDate fechaCreacion;
	
	//Fecha de actualización: Fecha utilizada para mantener el registro de actualización de la canción.
	@Column(name = "fecha_actualizacion")
	@UpdateTimestamp //se actualiza automáticamente
	private LocalDate fechaActualizacion;
	
	//CONSTRUCTOR VACÍO
	public Cancion() {
		
	}
	
	//Getters y Setters para cada atributo
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDate fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
