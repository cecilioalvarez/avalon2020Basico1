package es.avalon.clases12Excepciones.IgualdadFacturas;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {

		// Creo las facturas
		Factura f1 = new Factura(1, 20, "Zapatillas");
		Factura f2 = new Factura(2, 4, "Pincho de tortilla");
		Factura f3 = new Factura(1, 40, "Mesa");
		Factura f4 = new Factura(4, 200, "Television");

		ArrayList<Factura> lista = new ArrayList<Factura>();
		// Añado las facturas a la lista
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		
		//Creo una nueva factura y compruebo si existe alguna con ese nombre
		Factura f5 = new Factura(1, 1500, "Ordenador");
		System.out.println(lista.contains(f5)); // Compruebo si existe una factura con numero=1 en la lista

		// Metodo contar facturas
		System.out.println(contarFacturas(lista, f5));
	}

	// Metodo contar facturas
	public static int contarFacturas(ArrayList<Factura> listafactura1, Factura facturabuscar) {
		int contador = 0;
		for (Factura unaFactura : listafactura1) {
			if (unaFactura.equals(facturabuscar)) {
				contador++; // Incrementa el contador
			}
		}
		return contador;
	}
}
