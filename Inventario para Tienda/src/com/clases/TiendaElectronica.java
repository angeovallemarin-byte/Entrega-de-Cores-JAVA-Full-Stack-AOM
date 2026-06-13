package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	//ATRIBUTO
	private ArrayList<ProductoElectrodomestico> listaDeProductos; //atributo listaDeProductos para almacenar los productos en el inventario:ArrayList<Producto>
	
	//CONSTRUCTOR
	public TiendaElectronica() {
		this.listaDeProductos = new ArrayList<>();
	}
	
	//METODOS
	//Método para agregar un producto al inventario
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	
	//Método para mostrar todos los productos disponibles
	public void mostrarProductosDisponibles() {
		//Si la lista está vacía, imprime un aviso y usa return para dejar de ejecutar el método
		if(listaDeProductos.isEmpty()) { 
			System.out.println("No hay productos en el inventario");
			return;
		}
		//Bucle for each por cada producto (prod) de la listaDeProductos
		for (ProductoElectrodomestico prod : listaDeProductos) {
			prod.mostrarInformacion();
		}
	}
	
	//Método para buscar un producto por su nombre.
	public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
		//Recorre la lista buscando el producto sin importar mayúsculas o minúsculas
		for (ProductoElectrodomestico prod : listaDeProductos) {
			if(prod.getNombre().equalsIgnoreCase(nombre)) {
				return prod; //Si hay coincidencia al comparar retorna el prod y termina
			}
		}
		return null; //de lo contrario, recorre la lista completa y da null si no lo encuentra
	}
	
	//Método para realizar una venta, que reduce la cantidad disponible del producto vendido.
	public void realizarVenta(String nombreProducto) {
		//uso de método anterior para ver si producto está en la lista y guardarlo en prod
		ProductoElectrodomestico prod = buscarProductoPorNombre(nombreProducto);
		//si el producto existe
		if(prod != null) {
			//si hay stock se vende el producto y se reduce en 1 la cantidad disponible
			if(prod.getCantidadDisponible() > 0) {
				prod.setCantidadDisponible(prod.getCantidadDisponible() - 1);
				System.out.println("Producto comprado con éxito");
			//si no hay stock no se reduce la cantidad y se imprime mensaje
			}else {
				System.out.println("Producto agotado");
			}
		//si se ingresa un producto que no existe o se digita mal
		} else {
			System.out.println("Error: Este producto no existe");
		}
	}
	
	
	
	
	
	
	
	
	
}
