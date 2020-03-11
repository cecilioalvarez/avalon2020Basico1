package es.avalon;

public class Principal25recursividad {

	public static void main(String[] args) {

		//Numeros recursivos (cuando una funcion se llama a si misma)
		
		//numeros(5);
		numerosRecursivos(5);
	}

	private static void numeros(int valor) {

		for (int i = valor; i > 0; i--) {
			System.out.println(i);
		}
	}

	private static void numerosRecursivos(int numero) {
		if (numero > 0) {
			System.out.println(numero);
			numero--; //decremento en 1 el numero
			numerosRecursivos(numero);
		} else {
			System.out.println(0);
		}
	}
}
