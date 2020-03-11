package es.avalon;

public class Principal20duplicararray {

	public static void main(String[] args) {

		// Introducimos un array y nos le devuelve duplicado

		int[] milista = new int[] { 1, 2, 3, 4, 5 }; //introduzco mi array
		//imprimir(milista); //Imprime el array original
		int[] resultado = duplicarvector(milista); //almaceno en la variable resultado el array duplicado
		imprimir(resultado); //saco la variable resultado (es el array original duplicado)
	}

	private static int[] duplicarvector(int[] lista) {
		int[] nueva = new int[lista.length];

		for (int i = 0; i < lista.length; i++) {

			nueva[i] = lista[i] * 2;
		}
		return nueva;
	}

	private static void imprimir(int[] lista) { //con esta funcion imprimo el array
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
