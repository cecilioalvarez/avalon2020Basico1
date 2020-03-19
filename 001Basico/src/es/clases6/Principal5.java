package es.clases6;

import java.util.ArrayList;

public class Principal5 {
	public static void main(String[] args) {
		Factura f1= new Factura(1, "clase 1", 200);
		Factura f2= new Factura(2, "clase 1", 100);
		Factura f3= new Factura(3, "clase 1", 150);
		Factura f4= new Factura(1, "clase 1", 50);
		Factura f5= new Factura(5, "clase 1", 300);
		ArrayList<Factura> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		for (Factura f : lista) {
			System.out.println("Concepto: "+ f.getConcepto()+ "Importe: "+ f.getImporte()+" Numero: " + f.getNumero());
		}
		int numero=1;
		int contador=0;
		for (Factura f: lista) {
			if (numero.equals(f.getNumero()))
				contador++;
		}
		
	}
}
