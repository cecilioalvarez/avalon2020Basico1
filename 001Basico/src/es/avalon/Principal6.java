package es.avalon;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		hola();
//		adios();
//		lista(10);
//		sumaN(10);
		int[] inicial = new int[] {5,3,8};
		
		int[] duplicada = arrDupl(inicial);
		
		imprimir(duplicada);
		
		

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
//	private static void sumaN(int N) { // quitar void
//		int suma = 0;
//		for (int i=1; i<N; i++) {
//			suma = suma + i;
//		}
//		System.out.println(suma); // Hacerlo con return suma
//	}
	
	//array con los numeros duplicados
	private static int[] arrDupl(int[] arrInicial) {
		
		int[] arrDuplicado = new int[arrInicial.length];

		for (int i=0; i<arrInicial.length; i++) {
			arrDuplicado[i] = arrInicial[i]*2;
			
		}
		return arrDuplicado;
	}
	
	private static void imprimir(int[] lista) {
		for (int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}