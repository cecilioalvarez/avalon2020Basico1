package es.avalon;

public class Principal16ArraysNotas {

	public static void main(String[] args) {
		
		int [] numeros = new int [] {2,3,4,7,9};
		int []  numeros2 = new int [5];
		
		System.out.println(numeros [0]);
		System.out.println(numeros [1]);
		System.out.println(numeros [2]);
		System.out.println(numeros [3]);
		System.out.println(numeros [4]);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i+1]);
		}

	} 

}
