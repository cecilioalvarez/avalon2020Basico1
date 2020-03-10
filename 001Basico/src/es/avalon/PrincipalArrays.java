package es.avalon;

public class PrincipalArrays {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numero = 7;
		int resultado = 0;

		for (int i = 0; i < array.length; i++) {
			resultado = numero * array[i];
			System.out.println("7 x " + i + " ="+ " " + resultado);
		}
	}
}

