package Clase6ArrayList;

import java.util.ArrayList;

public class Principal2 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(8);
		lista.add(2);
		lista.add(5);
		lista.add(7);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < 5)
				lista.remove(i);
		}

		for (int i = 0; i < lista.size(); i++) {

			System.out.println(lista.get(i));
		}
	}

}
