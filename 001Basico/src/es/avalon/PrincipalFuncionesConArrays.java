package es.avalon;

public class PrincipalFuncionesConArrays {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4 };
		int[] arrayDuplicado = duplicarArray(array);
		int[] arraySumado = sumaArray(array, 2);
		int[] arrayAlReves = alRevesArray(array);

		imprimirArray(array, "ArrayOriginal  -->  ");
		System.out.println();
		imprimirArray(arrayDuplicado, "ArrayDuplicado -->  ");
		System.out.println();
		imprimirArray(arraySumado, "ArraySumado    -->  ");
		System.out.println();
		imprimirArray(arrayAlReves, "ArrayAlReves   -->  ");

	}

	private static int[] sumaArray(int[] array, int a) {

		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++) {

			array2[i] = array[i] + a;
		}
		return array2;
	}

	private static int[] duplicarArray(int[] array) {

		int[] array2 = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			array2[i] = array[i] * 2;

		}
		return array2;
	}

	private static int[] alRevesArray(int[] array) {

		int[] array2 = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			array2[i] = array[array.length - 1 - i];
		}
		return array2;
	}

	private static void imprimirArray(int[] array, String titulo) {

		System.out.print(titulo);
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}
