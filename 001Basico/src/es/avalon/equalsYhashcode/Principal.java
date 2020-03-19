package es.avalon.equalsYhashcode;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Factura> facturas = new ArrayList<Factura>();
		Factura factura = new Factura(2, "concepto1", 100);
		Factura factura1 = new Factura(1, "concepto2", 100);
		Factura factura2 = new Factura(1, "concepto3", 100);
		Factura factura3 = new Factura(1, "concepto4", 100);
		Factura factura4 = new Factura(2, "concepto1");

		facturas.add(factura);
		facturas.add(factura1);
		facturas.add(factura2);
		facturas.add(factura3);
		facturas.add(factura4);
		
		System.out.println(numeroRepetidos(facturas,factura3));

	}

	public static void mostrarArray(ArrayList<Factura> lista) {

		for (Factura p : lista) {
			System.out.print(p.getNumero());
			System.out.print(p.getConcepto());
			System.out.println(p.getImporte());
		}
	}

	public static int numeroRepetidos(ArrayList<Factura> facturas, Factura buscar) {
		int contador = 0;
		for (Factura f : facturas) {
			if (f.equals(buscar)) {
				contador++;
			}
		}
		return contador;
	}
	
	
}
