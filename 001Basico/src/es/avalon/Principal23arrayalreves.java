package es.avalon;

public class Principal23arrayalreves {

	public static void main(String[] args) {

		// Sacar el array al reves

		int[] mivector = new int[] { 1, 2, 3, 4, 5 }; // introduzco el array

		int[] vectorordenado = reordenar(mivector);
		imprimir(vectorordenado);
	}

	private static int[] reordenar(int[] vector) {
		int[] nueva = new int[vector.length];

		for (int i = 0; i < vector.length; i++) { //for(int i=vector.length-1;i>=0;i--) {
			nueva[vector.length - i - 1] = vector[i]; //nueva[i]=vectro[vector.length-i]
		}
		return nueva;
	}

	private static void imprimir(int[] vector) { // con esta funcion imprimo el array
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
