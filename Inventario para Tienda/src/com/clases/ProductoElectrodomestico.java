package com.clases;

public class ProductoElectrodomestico {
	
	//ATRIBUTOS
	private String nombre; //nombre del producto
	private double precio; //precio del producto
	private int cantidadDisponible;//cantidad disponible en el inventario
	
	//CONSTRUCTORES
	//constructor que inicializa los tres atributos
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
		
	//constructor sobrecargado que inicializa nombre y precio (cantidadDisponible por defecto en 0)
	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}

	//METODOS
	//mostrarInformacion(): Imprime los detalles del producto
	public void mostrarInformacion() {
		System.out.println("\n----------------------------------------");
		System.out.println("Producto: " + nombre);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad disponible: " + cantidadDisponible);
	}
	
	//Implementar getters y setters para todos los atributos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
}
