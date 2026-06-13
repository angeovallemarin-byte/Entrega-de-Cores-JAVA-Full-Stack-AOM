package com.clases;

public class Televisor extends ProductoElectrodomestico{ //hereda de la clase ProductoElectrodomestico
	//ATRIBUTOS ADICIONALES
	private int tamanoPantalla;
	private String resolucion;

	//CONSTRUCTOR
	//Constructor para inicializar los atributos de la clase Televisor
	public Televisor(String nombre, double precio, int cantidadDisponible, int tamanoPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamanoPantalla = tamanoPantalla;
		this.resolucion = resolucion;
	}

	
	//Sobrescribir el método mostrarInformacion() para mostrar la info específica del televisor.
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
	
	//Imprimir nuevos atributos
		System.out.println("Tamaño de pantalla: " + this.tamanoPantalla);
		System.out.println("Resolución: " + this.resolucion);
	}
	
	//getters y setters extra 
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}


	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
}
