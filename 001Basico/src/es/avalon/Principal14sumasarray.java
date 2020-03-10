package es.avalon;

public class Principal14sumasarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// suma de dos arrays
		
		int [] numeros1=new int [] {2,3,5,6,4};
		
			// pintamos el primer vector
		
			for(int i=0; i<numeros1.length; i++) {
			
				System.out.print(numeros1[i]+",");
			}
			
			System.out.println();
			
		int [] numeros2=new int [] {3,5,8,6,2};
		
		
			// pintamos el segundo vector
		
			for(int i=0; i<numeros2.length; i++) {
			
				System.out.print(numeros2[i]+",");
			}
			
			System.out.println();
		
			
			// pintamos la suma
			
		for(int i=0; i<numeros1.length; i++) {
			
			System.out.print(numeros1[i]+numeros2[i]+",");
		}
	}

}
