package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico { //hereda de la clase ProductoElectrodomestico
	//ATRIBUTOS ADICIONALES
	private String marca;
	private int memoriaRAM;
	private String numeroSerie;
	
	//CONSTRUCTOR
	//Constructor para inicializar los atributos de la clase ComputadoraPortatil
	public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRAM, String numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	
	//Sobrescribir el método mostrarInformacion() para mostrar la info específica de la computadora
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		
		//Imprimir nuevos atributos
		System.out.println("Marca: " + this.marca);
		System.out.println("Memoria RAM: " + this.memoriaRAM);
		System.out.println("Número de Serie: " + this.numeroSerie);
	}
	
	//getters y setters extra
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
}
