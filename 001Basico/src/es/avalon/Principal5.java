package es.avalon;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numeros = new int[] {1,2,3};
//		
//		System.out.println(numeros[0]);
//		System.out.println(numeros[1]);
//		System.out.println(numeros[2]);
//		
//		for (int i=0; i<numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		
		
//		int[] notas = new int[] {2,3,4,6,8};
//
//		for (int i=0; i<notas.length; i++) {
//			if (notas[i] < 5) {
//				int notaInflada = notas[i]+1;
//				System.out.println(notaInflada);
//			}
//			else {
//				System.out.println(notas[i]);
//			}
//		}
//		int[] notas = new int[] {2,3,4,6,8};
//		
//		for (int i=0; i<notas.length; i++) {
//			if (notas[i] < 5) {
//				System.out.println(notas[i]+1);
//			}
//			else {
//				System.out.println(notas[i]);
//			}
//		}
		int[] arr1 = new int[] {2,4,6,8,10};
		int[] arr2 = new int[] {1,3,5,7,9};
		int[] arrSum = new int[] {0,0,0,0,0};
		for (int i=0; i<arr1.length; i++) {
			arrSum[i] = arr1[i]+arr2[i];
			System.out.println(arrSum[i]);
		}

	}

}
