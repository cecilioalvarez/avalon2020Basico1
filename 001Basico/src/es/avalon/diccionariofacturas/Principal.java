package es.avalon.diccionariofacturas;

import java.util.HashMap;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura f1=new Factura(01,"television",300);
		Factura f2=new Factura(02,"ordenador",450);
		Factura f3=new Factura(03,"camara",250);
		Factura f4=new Factura(04,"tablet",350);
		Factura f5=new Factura(05,"movil",850);
		
		HashMap<Integer,Factura> diccionario=new HashMap <Integer,Factura>();
		
		diccionario.put(f1.getNumero(),f1);
		diccionario.put(f2.getNumero(),f2);
		diccionario.put(f3.getNumero(),f3);
		diccionario.put(f4.getNumero(),f4);
		diccionario.put(f5.getNumero(),f5);
		
		System.out.println(mayorNfact(diccionario));
		
	}

	private static int mayorNfact(HashMap<Integer, Factura> diccionario) {
		Set<Integer> claves=diccionario.keySet();
		
		int mayor=0;
		for (Integer clave:claves) {
			
			if (diccionario.get(clave).getNumero()>mayor) {
				mayor=diccionario.get(clave).getNumero();
			}
		}
		return mayor;
	}

}
