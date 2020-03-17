package es.avalon.clases7arraylist;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		lista.add(8);
		lista.add(2);
		lista.add(5);
		lista.add(7);
		
//		for (int i=0; i<lista.size(); i++) {
//			
//			System.out.println(lista.get(i));
//		}
		
		ArrayList<Integer> listaaprobados=new ArrayList<Integer>();
		
		for (int i=0; i<lista.size(); i++) {
						
			if (lista.get(i)>=5) {
				
				listaaprobados.add(lista.get(i));	
				System.out.println(lista.get(i));
				
			}
		}
		
		// otra forma de pintarlo es una vez creado
		
//		for (int i=0; i<listaaprobados.size(); i++) {
//			
//			System.out.println(listaaprobados.get(i));
//		
//		}
	}

}
