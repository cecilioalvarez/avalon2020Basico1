package es.avalon;

public class Principal16ArraysNotas {

	public static void main(String[] args) {
		
		int [] numeros = new int [] {2,3,4,7,9};
		
	
		
		for(int i=0; i<numeros.length; i++) {
			
			
			if (numeros[i]<5) {
				numeros[i]=numeros[i]+1;
			}
		}
		
		for (int i=0;i<numeros.length;i++) {
			
			System.out.println(numeros[i]);
		}

	}

}
