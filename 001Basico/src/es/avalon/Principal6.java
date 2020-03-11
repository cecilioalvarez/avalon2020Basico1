package es.avalon;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		hola();
//		adios();
//		lista(10);
//		sumaN(10);
//		int[] inicial = new int[] {8,10,100,80};
		

		
//		int[] duplicada = arrDupl(inicial);
		
//		imprimir(duplicada);
		
//		System.out.println(masAlto(inicial));
		
//		int[] reves = reverArr(inicial);
//		imprimir(reves);
		double[] inicial = new double[] {8,10,100,80};		
		double sumaIVA = arrIVA(inicial);
		System.out.println(sumaIVA);


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
//	private static int[] arrDupl(int[] arrInicial) {
//		
//		int[] arrDuplicado = new int[arrInicial.length];
//
//		for (int i=0; i<arrInicial.length; i++) {
//			arrDuplicado[i] = arrInicial[i]*2;
//			
//		}
//		return arrDuplicado;
//	}
//	
//	private static void imprimir(int[] lista) {
//		for (int i=0; i<lista.length; i++) {
//			System.out.println(lista[i]);
//		}
//	}
	
	//recorre un array y devuelve el número más alto
	
//	private static int masAlto(int[] arr) {
//		
//		int mayor = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > mayor) {
//				mayor = arr[i];
//			}
//		}
//		return mayor;
//	}

	// recorre un array y devuelve la suma de numeros mayores de 3
//	private static int sumaArr3(int[] arr) {
//	
//	int suma = 0;
//	for (int i = 0; i < arr.length; i++) {
//		if (arr[i] > 3) {
//			suma = suma + arr[i];
//		}
//	}
//	return suma;
//}
	
	
	//array al reves
	
//	private static int[] reverArr(int[] arr) {
//		int[] arr2 = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i] = arr[arr.length-i-1];
//		}
//		return arr2;
//	}
//	
//	private static void imprimir(int[] lista) {
//	for (int i=0; i<lista.length; i++) {
//		System.out.println(lista[i]);
//	}
//}
	
	// array que añada el iva a un array y devuelva la suma
	private static double arrIVA(double[] arr) {
		double iva = 0.21;
		double suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma = suma + arr[i]*iva;
		}
		return suma;
	}
}



