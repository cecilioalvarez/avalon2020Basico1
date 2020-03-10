package es.avalon;

public class Principal16ArraysNotas {

	public static void main(String[] args) {
		
		int [] numeros = new int [] {2,3,4,7,9};
<<<<<<< HEAD
		int []  numeros2 = new int [5];
=======
>>>>>>> branch 'slava' of https://github.com/cecilioalvarez/avalon2020Basico1.git
		
	
		
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
