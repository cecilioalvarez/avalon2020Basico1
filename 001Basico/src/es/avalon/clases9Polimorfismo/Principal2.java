package es.avalon.clases9Polimorfismo;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> deportista = new ArrayList<Integer>();
		
		deportista.add("juan");
		deportista.add("Pedro");
		deportista.add("Ivan");
		
		for(Deportista d: lista) {
			System.out.println(d.getNombre());
		}
		
		
		

	}

}
