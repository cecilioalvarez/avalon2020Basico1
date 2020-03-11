package es.avalon;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		hola();
//		adios();
//		lista(10);
		sumaN(10);

	}

//	private static void adios() {
//		System.out.println("Adios");
//		System.out.println("Adios");
//		System.out.println("Adios");
//		System.out.println("Adios");
//		System.out.println("Adios");
//	}

//	private static void hola() {
//		System.out.println("Hola");
//		System.out.println("Hola");
//		System.out.println("Hola");
//		System.out.println("Hola");
//		System.out.println("Hola");
//	}
	
	//listado del 1 hasta N
	
//	private static void lista(int N) {
//		for (int i=1; i<N; i++) {
//			System.out.println(i);
//		}
//	}
	
	
	//suma numeros del 1 hasta N
	private static void sumaN(int N) {
		int suma = 0;
		for (int i=1; i<N; i++) {
			suma = suma + i;
		}
		System.out.println(suma);
	}
}
