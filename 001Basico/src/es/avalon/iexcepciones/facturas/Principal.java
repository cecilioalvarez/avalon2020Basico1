package es.avalon.iexcepciones.facturas;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		// referencia
		Factura f1= new Factura (1,"ordenador",200);
		
		Factura f2= new Factura (2,"tablet",200);
		Factura f3= new Factura (3,"telefono",200);
		
		
		Factura f4= new Factura (1,"ordenador",200);
		
		
		ArrayList<Factura> lista= new ArrayList<Factura>();
		
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		
		Factura f5=new Factura(1,"ordenador",200);
		
		System.out.println(lista.contains(f5));
	
		//pasado la referencia
		
		System.out.println(contarFacturas(lista,f5));	
	
		//contarFacturas (a.b)
		//contarFacturas(lista,f5)
	
	}
								
	// de asigar a la funcion que tu diseñas el nombre de parametors
	// que mejor te venga
	
	public static int contarFacturas ( ArrayList<Factura> listaFacturas, Factura facturaBuscar) {
		
		int contador=0;
		
		for (Factura unaFactura:listaFacturas) {
			
			if (unaFactura.equals(facturaBuscar)) {
				
				//incrementa el contador
				contador++;
				
			}
		}
		return contador;
	}

}
