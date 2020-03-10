package es.avalon;

public class Principal5 {
//Vamos a hacer arrays
	public static void main(String[] args) {
//		int[] numeros=new int[] {1,2,3};
//		
//		System.out.println(numeros[0]);
//		System.out.println(numeros[1]);
//		System.out.println(numeros[2]);
//		
//		for(int i=0; i<numeros.length; i++) {
//			System.out.print(numeros[i]);
//		}
//		int[] notas=new int[] {1,5,2,4,6};
//		
//		for(int i=0; i<notas.length;i++) {
//			if (notas[i]<5) {
//				notas[i]=notas[i]+1;
//			}
//			System.out.print(notas[i]);
//		}//otra forma es con un for
		// for(int i=0;i<numeros.length;i++) { syso(numeros)

		int[] Array1 = new int[] { 1, 2, 3, 4, 5 };
		int[] Array2 = new int[] { 2, 3, 4, 5, 1 };
		int[] Array3 = new int[5];

//		for (int i = 0; i < Array1.length; i++) {
//
//			Array3[i] = Array1[i] + Array2[i];
//
//			if (i < Array1.length - 1) {
//				System.out.print(Array3[i] + ",");
//			} else {
//				System.out.println(Array3[i]);
//			}
//		}
		for(int i=0; i< Array1.length; i++) 
		{
		if(Array1[i]<Array2[i])
		{
			Array3[i] =Array2[i];
		}
		else
		{
			Array3[i] =Array1[i];
		}

		
		if (i < Array1.length - 1) {
  			System.out.print(Array3[i] + ",");
  		} else {
			System.out.println(Array3[i]);
		}
		}
	}

}
	


















