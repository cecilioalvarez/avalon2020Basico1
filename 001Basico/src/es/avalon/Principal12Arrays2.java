package es.avalon;

public class Principal12Arrays2 {

	public static void main(String[] args) {
		
		int[] lista= new int[] {1,2,3};
		int[] lista2= new int[] {1,2,3};
		int[] lista3= new int[3];
		
		for (int i=0;i<lista.length;i++) {
			
			lista3[i]=lista2[i]+lista[i];
		}
		
		for (int j = 0; j < lista3.length; j++) {
			System.out.println(lista3[j]);
		}

	}

}
