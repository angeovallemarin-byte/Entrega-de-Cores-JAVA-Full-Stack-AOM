package com;

import com.clases.ComputadoraPortatil;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
	public static void main(String[] args) {
		//Creación de tienda
		TiendaElectronica tienda = new TiendaElectronica();
		
		//INSTANCIAS: instanciar objetos y agrégalos al inventario de la tienda.
		
		//Instancias de televisor y agregar al inventario 
		Televisor tv1 = new Televisor("Smart TV Samsung", 459990.0, 3, 50, "4K UHD");
		Televisor tv2 = new Televisor("LG OLED Evo", 1299990.0, 1, 65, "4K UHD");
		tienda.agregarProducto(tv1);
		tienda.agregarProducto(tv2);
		
		//Instancias de computadora y agregar al inventario 
		ComputadoraPortatil computadora1 = new ComputadoraPortatil("MacBook Air", 1049990.0, 10, "Apple", 8, "SN-AAPL9876X");
		ComputadoraPortatil computadora2 = new ComputadoraPortatil("IdeaPad Slim", 429990.0, 2, "Lenovo", 16, "SN-LNV01234Y");
		tienda.agregarProducto(computadora1);
		tienda.agregarProducto(computadora2); 
		
		System.out.println("\n---------- ESTADO INICIAL INVENTARIO ----------");
		tienda.mostrarProductosDisponibles();
		
		//Vender y verificar que la cantidad disponible de los productos se actualice correctamente.
		System.out.println("\n---------- VENTAS DE PRODUCTOS ----------");
		tienda.realizarVenta("Sony");
		tienda.realizarVenta("LG OLED Evo");
		tienda.realizarVenta("MacBook Air");
		tienda.realizarVenta("LG OLED Evo");
		tienda.realizarVenta("IdeaPad Slim");
		tienda.realizarVenta("MacBook Air");
		tienda.realizarVenta("MacBook Air");
		tienda.realizarVenta("MacBook Air");
		tienda.realizarVenta("MacBook Air");
		
		System.out.println("\n---------- ESTADO ACTUALIZADO INVENTARIO ----------");
		tienda.mostrarProductosDisponibles();	 
	}
}