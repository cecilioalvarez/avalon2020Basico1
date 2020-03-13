package es.avalon;

public class Principal8DuplicarArrayInverso {
public static void main(String[] args) {
		
		int[] lista= new int[] {1,2,3};
		
		int[] inversa=inversa(lista);
		
		for (int i=0;i<inversa.length;i++) {
			
			System.out.println(inversa[i]);
		}
		
		
	}
	
	private static int[] inversa(int[] otra) {
		
		int[] nueva=new int[otra.length];
		
		for (int i=0;i<nueva.length;i++) {
			
			//System.out.println("iteracion:"+i);
			//System.out.println("dato:"+otra[i]);
			nueva[i]=otra[otra.length-i-1];
			
			
			
			
		}
		
		return nueva;
		
	}

}
