package es.avalon.ClasesArrayList;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();

		lista.add(8);
		lista.add(2);
		lista.add(6);
		lista.add(5);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		System.out.println("***********");
		int numero;
		for (int i = 0; i < lista.size(); i++) {
			numero = lista.get(i);
			if (numero >= 5) {
				System.out.println(lista.get(i));
			}
		}
	}
}
