package es.avalon;

public class Principal6 {
	public static void main (String [] args)
	{
		float [] paliva= new float [] {100,85,60,1000,50,85};  
		calculoiva(paliva);// va a calcuar el iva total de la suma del array
			
			
//		int [] unalista= new int [] {1,2,3,85};
//		//eligira el numero m�s alto
//		System.out.println(masalto(unalista));
//		int [] unalista= new int [] {1,12,3,26,0,85}; // que me sume todo lo de la lista que sea mayor que 3
//		int[]  nueva=backward(unalista);
//		
//		for (int j = 0; j < nueva.length; j++) {
//			System.out.println(nueva[j]);
//		}
//		
//		lista(7); // hace una lista desde el cero hasta el numero pedido
		
//		suma (10); // suma todos los mnumero entero hasta el numero pedido
			// genero una lista
//		int [] unalista= new int [] {1,2,3};
//		
//		//inferno (unalista);// duplica los numeros del array
//		
//		
	}
	private static float calculoiva (float[] numeros ) {
		float a=0;
		for (int i=0; i<numeros.length;i++) {
			a=a+ numeros[i];
		}
		float IVA= (float) (0.21*a) +a ;
		
				System.out.println(IVA);
				return IVA;
	}
//	
//	private static int [] backward(int[] numeros ) {
//		int [] nueva= new int [numeros.length];
//		int L= numeros.length;
//		for (int i=0; i< numeros.length;i++) {
//			nueva [L-i-1]= numeros [i];
//		}return nueva;
//	}
	//otra version
	/*
	 * 
	 */
}
	
	
	
	
	//sumar los numero mas altos que el 3 
	
	
//	private static int sumamasalto(int[] numeros ) {
//		int a=3;
//		int suma=0;
//		for (int i=1; i<numeros.length;i++) {
//			if (numeros[i]>a) {
//				suma = suma + numeros[i];
//				i++;
//			}else {
//				i++;
//			}
//		}
//		return suma;
//	}
	
	
//	private static int [] inferno (int[] numeros ) {
//		int [] nueva= new int [numeros.length]	; // asegura tener el array del mismo tama�o del que entra y asi no hay problema
//		for (int i=0; i<numeros.length;i++) {
//			nueva[i]= numeros[i]*2;
//		}
//		return nueva;
//	}
//	private static int  masalto(int[] numeros ) {
//		int a= 0;
//		for (int i=1; i<numeros.length;i++) {
//			if(numeros [i] >= a) {
//				a= numeros [i];
//				i++;
//		}else {
//			i++;
//		}
//	}
//		return a;
//	}
//	
	
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
	
//}
	
		
		
		
		
		
		
		
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
