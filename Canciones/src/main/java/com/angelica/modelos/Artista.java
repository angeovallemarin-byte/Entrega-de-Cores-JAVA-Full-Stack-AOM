package com.angelica.modelos;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Asocia la clase a una @Entity y @Table, nombra la tabla “artistas”.
@Entity
@Table(name = "artistas")
public class Artista {
	
	//ATRIBUTOS
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre del artista es requerido.")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String nombre;

    @NotBlank(message = "El apellido del artista es requerido.")
    @Size(min = 3, message = "Debe contener al menos 3 caracteres.")
    private String apellido;
    
    @NotBlank(message = "La biografía del artista es requerida.")
	@Size(min = 10, message = "Debe contener al menos 10 caracteres.")
	private String biografia;
    
    //Fecha de creación: Fecha utilizada para cuando se crea el registro en la tabla de la base de datos.
  	@Column(name = "fecha_creacion")
  	@CreationTimestamp //se crea automáticamente
  	private LocalDate fechaCreacion;
  	
  	//Fecha de actualización: Fecha utilizada para mantener el registro de actualización de la canción.
  	@Column(name = "fecha_actualizacion")
  	@UpdateTimestamp //se actualiza automáticamente
  	private LocalDate fechaActualizacion;
  	
  	
  	//Agrega las anotaciones necesarias en ambos modelos para indicar que un artista puede tener una o más canciones, pero una canción solamente es escrita por un artista.
  	@OneToMany(mappedBy = "artista")
  	private List<Cancion> canciones;
  	
  	//CONSTRUCTOR VACÍO
  	
  	public Artista() {
  		
  	}

  	//Getters y Setters para cada atributo
  	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
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

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
  
	//Nombre completo
	public String getNombreCompleto() {
	    return this.nombre + " " + this.apellido;
	}
}