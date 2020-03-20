package clase10_Diccionario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Factura f1=new Factura(1,"cena",20);
		Factura f2=new Factura(2,"comida",22);
		Factura f3=new Factura(3,"merienda",24);
		Factura f4=new Factura(4,"desayuno",26);

		HashMap<Integer,Factura> diccionario= new HashMap<>();
		
		diccionario.put(f1.getNumero(),f1);
		diccionario.put(f2.getNumero(),f2);
		diccionario.put(f3.getNumero(),f3);
		diccionario.put(f4.getNumero(),f4);
		
		Set<Integer> conjunto=diccionario.keySet();
		int mayor=0;
		for(int numero:conjunto ) {
			if(mayor<numero) {
				mayor=numero;
			}
			
		}
		System.out.println(mayor);
	
		Collection<Factura> lista=diccionario.values();
		
		for(Factura f:lista) {
			System.out.println(f);
		}
	}

}
