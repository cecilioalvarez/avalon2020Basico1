package es.avalon;

public class Principal19sumarterminosarray {

	public static void main(String[] args) {

		// Generar una funcion que nos devuelva la suma de los numeros desde 1 hasta x

		Sumalistado(15);

	}

	private static void Sumalistado(int x) {
		int suma = 0;

		for (int i = 0; i <= x; i++) {

			suma = suma + i;
		}
		System.out.println(suma);
	}

}
