package es.avalon.diccionarios;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura f1 = new Factura(1, "movil", 500);
		Factura f2 = new Factura(5, "tablet", 750);
		Factura f3 = new Factura(3, "portatil", 1000);
		
		HashMap<Integer, Factura> dicc = new HashMap<Integer, Factura>();
		
		dicc.put(f1.getNumero(), f1);
		dicc.put(f2.getNumero(), f2);
		dicc.put(f3.getNumero(), f3);
		
		
		
		Set<Integer> claves = dicc.keySet();
		
		for (Integer clave: claves) {
			System.out.println(dicc.get(clave));
		}
		
		System.out.println("**********");
		
		Integer numMayor = 0;
		for (Integer clave: claves) {
			
			if (clave > numMayor) {
				numMayor = clave;
			}
		}
		System.out.println(numMayor);
		
		System.out.println("**********");
		
		
		//Otra forma de imprimir todo el diccionario
		Collection<Factura> lista = dicc.values();
		
		for (Factura f: lista) {
			System.out.println(f);
		}
		

	}

}
