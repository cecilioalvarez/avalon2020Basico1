package es.avalon;

public class Principal14DuplicarArray {

	public static void main(String[] args) {
		
		//esta
		int[] milista= new int[] {1,2,3};

		 duplicar(milista);
		//imprimir(milista);
	
	
	
	
	}
									//esta
	private  static int[] duplicar(int[] lista) {
							//esta parte 
		int[] nueva= new int[lista.length];
		
		for(int i=0;i<lista.length;i++) {
			
			nueva[i]=lista[i]*2;
		}
		return nueva;
		
		
	}
	
	
	
	
	private static void imprimir(int[] lista) {
		
		for(int i=0;i<lista.length;i++) {
			
			System.out.println(lista[i]);
		}
	}

}
