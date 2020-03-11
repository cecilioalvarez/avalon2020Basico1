package es.avalon;

public class Principal18funcionsuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// funcion suma de todos los numeros hasta el introducido
		
		funcionsumalista(15);
		
	}

	private static void funcionsumalista(int x) {
		int suma=0;
		
		for(int i=0; i<=x; i++) {
			
			suma=suma+i;
			
		}
		
		System.out.println(suma);
	}

}
