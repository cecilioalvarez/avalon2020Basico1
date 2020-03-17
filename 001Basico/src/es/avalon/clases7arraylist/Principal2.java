package es.avalon.clases7arraylist;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {


		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		lista.add(8);
		lista.add(2);
		lista.add(5);
		lista.add(7);
		
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("************************");
		//Ahora quiero mostrar solo los aprobados
		ArrayList<Integer> listaaprobados=new ArrayList<Integer>();
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i)>=5) {
				listaaprobados.add(lista.get(i));
			}
			
		}
			
		for (int i=0;i<listaaprobados.size();i++ ) {
			System.out.println(listaaprobados.get(i));
		}
	
	}

}
