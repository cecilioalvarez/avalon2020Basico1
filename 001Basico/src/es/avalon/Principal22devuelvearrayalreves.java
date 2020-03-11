package es.avalon;

public class Principal22devuelvearrayalreves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// funcin que al introducir un array te devuelva otro al reves
		
		int [] miarray=new int [] {1,2,3,4,5,6};
		
		int [] resultado=reves(miarray);
		// imprimir(resultado);
		for (int i=0; i<resultado.length; i++) {
			System.out.println(resultado[i]);
		}
		
	}
		
		private static int [] reves(int [] array) {
			
			int [] nuevoarray=new int [array.length];
			
			for(int i=0; i<array.length; i++) {
				
				nuevoarray[array.length-i-1]=array[i];		
				
			}
			
			return nuevoarray;
		}
	
//		private static void imprimir(int [] array) {
//			
//			for(int i=0; i<array.length; i++) {
//				
//				System.out.println(array[i]);
//			}
//		}

}
