package es.avalon.clasesarrayList;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(8);
		lista.add(2);
		lista.add(5);
		lista.add(7);
		
//		for (int i=0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		//Crear nuevo ArrayList que solo tenga las notas aprobadas
		
		ArrayList<Integer> aprobados = new ArrayList<Integer>();
		
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i) >=5) {
				aprobados.add(lista.get(i));
			}
		}
		System.out.println(aprobados);
		


	}

}
