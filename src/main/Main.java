package main;

import java.util.ArrayList;
import java.util.List;

import domain.Nevera;
import domain.Tienda;

public class Main {

	public static void main(String[] args) {

		Tienda exito = new Tienda("Exito");

		Nevera nevecon = new Nevera(12345, "samsung", 500000, 50, true);
		Nevera neverita = new Nevera(12345, "HP", 200000, 30, false);
		Nevera neverota2 = new Nevera(1234, "Samsung", 999999, 300, true);
		Nevera neverota = new Nevera(1245, "centrales", 988899, 350, true);

		exito.agregar(nevecon);
		exito.agregar(neverita);
		exito.agregar(neverota2);
		exito.agregar(neverota);
		
		exito.buscar(1245);
		exito.buscar(123453);
		 

		exito.buscar("samsung");
		exito.buscar(false);
		exito.buscarConMasCapacidadDe(100);
		exito.vender(neverota2);
		exito.capacidadActual();


	}

}