package com.angelica.modelos;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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
    @NotBlank(message = "El título de la canción es requerido.")
    @Size(min = 3, message = "Debe contener al menos 5 caracteres.")
	private String titulo;
    
	//Artista: El nombre del artista o banda que interpreta la canción.
    //El atributo de artista ya no será un String, ahora será un objeto de tipo Artista.
    @ManyToOne
	@JoinColumn(name = "id_artista")
	private Artista artista;

	//Álbum: El álbum en el que se encuentra la canción.
    @NotBlank(message = "El álbum de la canción es requerido.")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
	private String album;
    
	//Género: El género musical de la canción (por ejemplo, rock, pop, jazz, etc.).
    @NotBlank(message = "El género de la canción es requerido.")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String genero;
    
	//Idioma: El idioma en el que está escrita la canción.
    @NotBlank(message = "El idioma de la canción es requerido.")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
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

	//Modificar el getter y setter para que coincidan con el cambio de String a Objeto.
	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
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
