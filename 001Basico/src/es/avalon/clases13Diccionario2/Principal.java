package es.avalon.clases13Diccionario2;

import java.util.HashMap;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Factura f1 = new Factura(1, "Cena", 20);
		Factura f2 = new Factura(2, "Comida", 15);
		Factura f3 = new Factura(3, "Desalluno", 5);
		Factura f4 = new Factura(4, "Aperitivo", 8);

		HashMap<Integer, Factura> diccionario = new HashMap<Integer, Factura>();
		diccionario.put(f1.getNumero(), f1);
		diccionario.put(f2.getNumero(), f2);
		diccionario.put(f3.getNumero(), f3);
		diccionario.put(f4.getNumero(), f4);
	

	// Devuelveme el conjunto de claves del diccionario
	Set<Integer> clave=diccionario.keySet();
	System.out.println(clave); //Estas son mis claves
	int mayor=0;
	for(int numero: clave) {
		if (mayor < numero) {
			mayor = numero;
		}
	}
	System.out.println(mayor);//Saco el numero de factura mayor

}
}


