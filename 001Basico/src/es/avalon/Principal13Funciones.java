package es.avalon;

public class Principal13Funciones {

//	private static void lista(int a) {
//
//		int[] Array3 = new int[a];
//		for (int i = 0; i < a; i++) {
//			Array3[i] = i;
//			System.out.println(Array3[i]);
//		}
//
//	}

	public static void main(String[] args) {

//		
		// lista(3);

//		hola();
//		Adios();		
//		hola();
		
		int[] lista=new int[] {1,3,5,6};
		
		
		System.out.println(Suma(lista));
		
//
	}
//
//	private static void Adios() {
//		System.out.println("Adios");
//		System.out.println("Adios");
//		System.out.println("Adios");
//		System.out.println("Adios");
//	}
//
//	private static void hola() {
//		System.out.println("hola");
//		System.out.println("hola");
//		System.out.println("hola");
//		System.out.println("hola");
//	}

	// ahora quiero una funcion que me devuelva hasta la suma de ese numero

//	private static int Sumita(int a) {
//
//		int sum = 0;
//		for (int i = 0; i < a; i++) {
//			sum = sum + i;
//			// System.out.println(suma);
//		}
//		return sum;
	

//	private static int Mayor(int[] unaLista) {
//		int mayor = 0;
//		for (int i = 0; i <unaLista.length; i++) {
//			if (unaLista[i] > mayor) {
//				mayor=unaLista[i];
//			}
//		}
//		return mayor;
//	}
  // una funcion que me recorra el array y me sume todos los valores mayores que 3
	private static int Suma(int[] unaLista) {
		int inicial = 0;
		for (int i = 0; i <unaLista.length; i++) {
			if (unaLista[i] > 3) {
				inicial=inicial+unaLista[i];
			}
	}
		return inicial;
	}
}


