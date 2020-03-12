package es.avalon;

public class Principal19ejercicio2 {

	public static void main(String[] args) {
		// que recorra el array y sume todos los valores mayores de 3.
		
		int[]lista=new int[] {1,2,3,4,5,6,7,8};
		
			
			
			System.out.println(sumamayor(lista));
	}

	private static int sumamayor(int[]unalista) {
		int mayor=0;
		for(int i=0; i<unalista.length; i++) {
			if (unalista[i]>3) {
				mayor=mayor+unalista[i];
			}
		}
		
		
		return mayor;
		
	}
	
			
	
}
