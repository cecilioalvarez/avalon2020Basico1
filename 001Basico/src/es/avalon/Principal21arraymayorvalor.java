package es.avalon;

public class Principal21arraymayorvalor {

	public static void main(String[] args) {

		// uncion que escoge el mayor valor de un array

		int[] vector = new int[] { 7, 25, 3, 1, 8 }; // introduzco array

		int resultado = valormayor(vector);
		System.out.println(resultado);
		// System.out.println(valormayor(vector)); // otra forma de sacar el resultado
	}

	private static int valormayor(int[] vector) {
		int mayor = 0;

		for (int i = 0; i < vector.length; i++) {

			if (vector[i] > mayor) {
				mayor = vector[i];
			} else {
				mayor = mayor;
			}
		}
		return mayor;
	}

}
