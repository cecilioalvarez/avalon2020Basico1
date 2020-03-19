package es.avalon.excepciones.igualdadfacturas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Factura> lista=new ArrayList<>();
		
		Factura f1=new Factura(01,"ordenador",350);
		Factura f2=new Factura(01,"ordenador",350);
		Factura f3=new Factura(02,"raton",30.50);
		Factura f4=new Factura(03,"cascos",19.95);
		Factura f5=new Factura(04,"camara",150);
		
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);
		
		// pinto mi lista de facturas
		for (Factura f:lista) {
			
			System.out.println(f.getNumero());
			System.out.println(f.getCocepto());
			System.out.println(f.getImporte());
			System.out.println("----------------");
		}
		System.out.println("------------------------------");
		
		
		System.out.println(lista.contains(f5));
		System.out.println("------------------------------");
		
	
		System.out.println(contarFacturas(lista,f1));
		System.out.println(contarFacturas(lista,f3));
		
	}
									 // pasame la lista		// pasame la factura q quiero ver repetida
	public static int contarFacturas(ArrayList<Factura> listaFacturas, Factura facturaBuscar) {
		
		int contador=0;			
		for (Factura cadaFactura:listaFacturas) {
			
			if(cadaFactura.equals(facturaBuscar)) {
				contador++;
			}
		}
		return contador;
	}
	

}
