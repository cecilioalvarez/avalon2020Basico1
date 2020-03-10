package es.avalon;

public class PrincipalArraysNotas {

	public static void main(String[] args) {

		int[] array = new int[] { 0,2,3,4,5};
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Antigua nota--->"  + array[i]);
			if (array[i]<5) {
				array[i]++;
			}System.out.println("   Nueva nota --->"+ array[i]);
		}
	}
}