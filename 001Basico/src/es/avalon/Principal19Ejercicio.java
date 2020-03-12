package es.avalon;

public class Principal19Ejercicio {

	
	public static void main(String[] args) {
		// un array de numeros enteros que devuelva un numero mayor.
		int[]lista=new int[] {1,3,5,6};
		
		System.out.println(esmayor(lista));
		
	

	}
	private static int esmayor(int[]unalista) {
		int mayor=0;
		for(int i=0; i<unalista.length; i++) {
			if(unalista[i]>mayor) {
				mayor=unalista[i];
				
			}
		}
	return mayor;
}
}
