package es.avalon;

public class Principal6 {
	public static void main (String [] args)
	{
		
//		lista(7); // hace una lista desde el cero hasta el numero pedido
		
//		suma (10); // suma todos los mnumero entero hasta el numero pedido
			// genero una lista
		int [] unalista= new int [] {1,2,3};
		
		inferno (unalista);// duplica los numeros del array
		
		
		}
	private static int [] inferno (int[] numeros ) {
		int [] nueva= new int [numeros.length]	; // asegura tener el array del mismo tamaño del que entra y asi no hay problema
		for (int i=0; i<numeros.length;i++) {
			nueva[i]= numeros[i]*2;
		}
		return nueva;
	}
	
	
	
	
	// metodo lista en el que haces una suma de 0 hasta el numero pedido
//	private static void suma (int a) {
//		int suma=0;
//		for (int i=0; i<=a;i++) {
//			suma=suma+i;
//					
//			
//		}
//		System.out.println(suma);
//		
//		
//	}
	// metodo lista en el que haces una lista de 0 hasta el numero pedido
//	private static void lista (int a) {
//		
//		for (int i=0; i<=a;i++) {
//			System.out.println(i);
//		}
		
//	}
	
}
	
		
		
		
		
		
		
		
		//hola(); // imprime hola 4 veces
//		int resultado=suma (5,6); // suma 2 umeros pedidos
//		System.out.println(resultado);
//		
//		
		
		//adios();// imprime adios 4 veces
		
		
		
//	}
// metodo suma en el que sumas 2 numeros
//	private static int suma(int a , int b) {
//		return a+b;
//	}
//metodo suma en el que dices adios 4 veces
//	private static void adios() {
//		System.out.println("adios");
//		System.out.println("adios");
//		System.out.println("adios");
//		System.out.println("adios");
//	}
//metodo suma en el que dices hola 4 veces
//	private static void hola() {
//		System.out.println("hola");
//		System.out.println("hola");
//		System.out.println("hola");
//		System.out.println("hola");
//	}
//	
//}
