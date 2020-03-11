package es.avalon;

public class Principal7 {
	public static void main (String [] args) {
		//recursividad: se llama a si mismo
		//numeros (5);
		numerosRecursivos(5);
	}
	private static void numeros (int valor) {
		for(int i=valor;i>=0;i--) {
			System.out.println(i);
		}
	}
	private static void numerosRecursivos (int numero) {
		if (numero >0) {
			System.out.println(numero);
			numero--;
			numerosRecursivos(numero);
		}else {
			System.out.println(0);
		}
	}
}
