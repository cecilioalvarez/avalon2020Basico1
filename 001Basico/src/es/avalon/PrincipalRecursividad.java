package es.avalon;

public class PrincipalRecursividad {
	public static void main(String[] args) {

		numerosrecursivos(5);

	}

	private static void numeros(int valor) {
		for (int i = valor; i > 0; i--) {
			System.out.println(i);
		}
	}

	private static void numerosrecursivos(int numero) {
		if (numero > 0) {
			System.out.println(numero);
			numero--;
			numerosrecursivos(numero);
		} else {
			System.out.println(0);
		}
	}
}
