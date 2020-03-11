package es.avalon;

public class Principal22sumaarrayfuncion {

	public static void main(String[] args) {

		// Funcion que me devuelva la suma de todos los valores del array mayores que 3

		int[] vector = new int[] { 7, 25, 3, 1, 8 }; // introduzco array

		int acumulado = Sumarvalores(vector);
		System.out.println(acumulado);

	}

	private static int Sumarvalores(int[] vector) {
		int acumulado = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > 3) {
				acumulado = acumulado + vector[i];
			}
		}
		return acumulado;
	}

}
