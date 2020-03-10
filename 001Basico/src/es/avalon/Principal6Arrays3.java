package es.avalon;

public class Principal6Arrays3 {
	public static void main(String[] args) {

		// Sumar dos Arrays

		int[] n1 = new int[] { 2, 4, 9 };
		int[] n2 = new int[] { 4, 6, 4 };
		
		int[] n3 = new int[3];

		for (int i = 0; i < n1.length; i++) {

			n3[i] = n1[i] + n2[i];
		}
		
		for (int j = 0; j < n3.length; j++) {

			System.out.println(n3[j]);
		}

	}
}
