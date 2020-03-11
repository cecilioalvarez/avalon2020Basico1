package es.avalon;

public class PrincipalFuncionesConArrays {

	public static void main(String[] args) {

		int[] array = new int[] { 3, 5, 7, 9 };
		int[] arrayDuplicado = duplicarArray(array);
		int[] arraySumado = sumaArray(array, 2);
		int[] arrayAlReves = alRevesArray(array);
		double[] arrayIva = new double[] { 100, 100, 100 };
		
		imprimirArray(array, "ArrayOriginal  -->  ");
		System.out.println();
		imprimirArray(arrayAlReves, "ArrayAlReves   -->  ");
		System.out.println();
		imprimirArray(arrayDuplicado, "ArrayDuplicado -->  ");
		System.out.println();
		imprimirArray(arraySumado, "ArraySumado    -->  ");
		System.out.println();
		int mayor = devuelveMayor(array);
		System.out.println("El mayor es    -->  " + mayor);
		int suma = sumaMayores(array);
		System.out.println("La suma >3 es  -->  " + suma);
		double iva = calculaIva(arrayIva);
		System.out.println("Suma(Iva) es   -->  " + iva);

	}

	private static double calculaIva(double[] array) {
		double suma = 0;
		double iva = 1.21;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i] * iva;
		}
		return suma;
	}

	private static int sumaMayores(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				suma = suma + array[i];
			}
		}
		return suma;
	}

	private static int devuelveMayor(int[] array) {
		int mayor = 0;
		mayor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (mayor < array[i]) {
				mayor = array[i];
			}
		}
		return mayor;
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
