package es.avalon;

public class Principal17SumaArray {

	public static void main(String[] args) {
		// sumar dos arrays

		int[] x = new int[] { 4, 5, 6, 7 };
		int[] y = new int[] { 6, 7, 8, 9 };
		int[] z = new int [4];

		for (int i = 0; i < x.length; i++) {
			z[i]=y[i]+x[i];
			
		}
		for(int j=0; j< z.length; j++)
			System.out.println(x[j]);
	}

}
