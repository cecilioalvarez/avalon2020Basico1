package es.avalon.diccionarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FacturaPrincipal {

	public static void main(String[] args) {

		Factura f1 = new Factura(1, "ordenador", 500);
		Factura f2 = new Factura(2, "impresora", 300);
		Factura f3 = new Factura(3, "tablet", 500);
		Factura f4 = new Factura(4, "movil", 1000);
		Factura f5 = new Factura(5, "auriculares", 200);
		
		HashMap<Integer,Factura> mapa= new HashMap<Integer,Factura>();
		mapa.put(f5.getNumero(), f5);
		mapa.put(f4.getNumero(), f4);
		mapa.put(f3.getNumero(), f3);
		mapa.put(f2.getNumero(), f2);
		mapa.put(f1.getNumero(), f1);
		
		
		// 1,2,3,4,5
		//aqui 
		
		Set<Integer> conjunto= mapa.keySet();
		
		int mayor=0;
		for(int numero: conjunto) {
			
			if (mayor<numero){
				mayor=numero;
			}
		}
		System.out.println(mayor);

		
		Collection<Factura> lista=mapa.values();
		
		
		for (Factura f:lista) {
			System.out.println(f);
		}
		
	}

}
