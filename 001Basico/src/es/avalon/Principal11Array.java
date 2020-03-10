package es.avalon;

public class Principal11Array {

	public static void main(String[] args) {

		int[] numeros = new int[] { 1, 2, 3 };

		int[] numeros2 = new int[5];
		numeros2[0]=3;
		numeros2[1]=3;
		numeros2[2]=3;
		numeros2[3]=3;
		numeros2[4]=3;

		
		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		
	}
}
