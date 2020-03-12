package es.avalon;

public class PrincipalArrayInverso {

	public static void main(String[] args) {
		// un Array recorrido a la inversa
		
		int[] lista= new int[] {1,2,3,};
		int[] inversa= inversa(lista);
	for(int i=0; i<inversa.length;i++) {
		
	}
	
	}
		private static int[] inversa(int[]otra) {
			int[] nueva= new int[otra.length];
			for(int i=otra.length; i>0; i--) {
				nueva[i-otra.length]=otra[otra.length-1];
				
			}
			return nueva;
			
			
		}
}
