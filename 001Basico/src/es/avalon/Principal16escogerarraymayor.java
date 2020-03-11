package es.avalon;

public class Principal16escogerarraymayor {

	public static void main(String[] args) {
	
		//Suma de 2 arrays escogiendo el valor mayor
		
		int[] numeros=new int[] {3,7,2,3,9};
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + ",");
		}
		System.out.println();
		
		int[] numeros2=new int[] {1,6,7,2,8};
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros2[i] + ",");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {

		if (numeros[i]>numeros2[i]) {
			System.out.print(numeros[i]+",");
		}
		else {
		System.out.print(numeros2[i]+","); //Pinto las notas retocadas
		}
		}
	}
}
