package es.avalon;

public class Principal13Funcion {

	public static void main(String[] args) {

//		lista(100);
//		int[] otro = listaArray(100);
//		System.out.println("****************");
//		for (int i = 0; i < otro.length; i++) {
//
//			System.out.println(otro[i]);
//		}

		// la invocacion a una funcion
		int nuevo = duplicar(2);
		
		System.out.println("*"+nuevo+"*");
		
		
		duplicarOtra(2);

	}

	private static int duplicar(int numero) {

		return numero * 2;
	}

	private static void duplicarOtra(int numero) {

		System.out.println(numero * 2);
	}
	
	
	
	
	
	
	

	private static void lista(int numero) {

		for (int i = 0; i < numero; i++) {

			System.out.println(i);
		}
	}

	private static int[] listaArray(int numero) {

		int[] nuevalista = new int[numero];
		for (int i = 0; i < numero; i++) {

			nuevalista[i] = i;

		}
		return nuevalista;
	}

//	private static int[] duplicar (int[] lista) {
//		
//		int[] nueva= new int[lista.length];
//		
//	}

}
