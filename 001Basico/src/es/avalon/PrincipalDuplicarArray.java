package es.avalon;

public class PrincipalDuplicarArray {

	public static void main(String[] args) {
	int[]milista=new int[] {1,2,3};
	//	int[]otra= duplicar(milista);

	//imprimir(milista);
	
		
	}
		
		

		public static int [] duplicar(int[] lista) {
			int[] nueva= new int[lista.length];
			for(int i=0; i< lista.length; i++) {
				
				nueva[i]=lista[i]*2;
		
		
		}
				return nueva;
				
	}

}
