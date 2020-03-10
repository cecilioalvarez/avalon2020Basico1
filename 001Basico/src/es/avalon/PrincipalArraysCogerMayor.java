package es.avalon;

public class PrincipalArraysCogerMayor {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		int[] array2 = new int[] { 0, 1, 7, 3, 9 };
		int[] array3 = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println(" --> Array 1");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println(" --> Array 2");
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array2[i];
			if (array1[i]>array2[i]) {
				array3[i]=array1[i];
			}
			System.out.print(array3[i] + " ");
		}
		System.out.println(" --> Array Mayor");
	}
}
