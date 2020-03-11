package es.avalon;

public class Principal19funcionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// funcion array que le metamos un vector y nos devuelva otro con los valores duplicados
		
		int [] milista=new int [] {1,2,3,4,5}; 
		
		int [] resultado=duplicararray(milista);
		imprimir(resultado);
	}

	private static int [] duplicararray(int [] vector) {
		
		int [] nueva=new int [vector.length];
		
		for(int i=0; i<vector.length; i++) {
			
			nueva[i]=vector[i]*2;
			
		}
			return nueva;
	}
	
	private static void imprimir(int [] vector) {
	
		for(int i=0; i<=vector.length; i++) {
			System.out.println(vector[i]);
		}
	
	}
	
}
