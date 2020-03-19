package es.avalon.igualdadFacturas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Factura f1 = new Factura(1, "iphone 5", 500);
		Factura f2 = new Factura(2, "iphone 5S", 550);
		Factura f3 = new Factura(3, "iphone 6", 600);
		Factura f4 = new Factura(3, "iphone 6S", 650);
		Factura f5 = new Factura(1, "iphone 7", 700);
		Factura f6 = new Factura(1, "iphone 7S", 750);
		Factura f7 = new Factura(2, "iphone 8", 800);
		Factura f8 = new Factura(6, "iphone 8S", 850);
		
		ArrayList<Factura> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		lista.add(f6);
		lista.add(f7);
		lista.add(f8);
		
		
		System.out.println(facturasRepetidas(lista, f1));
		System.out.println(facturasRepetidas(lista, f5));
		System.out.println(facturasRepetidas(lista, f2));
		System.out.println(facturasRepetidas(lista, f3));
		System.out.println(facturasRepetidas(lista, f8));
		
	}	

	
	public static int facturasRepetidas(ArrayList<Factura> listaFacturas, Factura facturaBuscar) {
		int contador = 0;
		for (Factura unaFactura: listaFacturas) {
			if (unaFactura.equals(facturaBuscar)) {
				contador++;
			}
		}
		return contador;
		}

	}

