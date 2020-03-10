package es.avalon;

public class Principal15mayorarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// escogemos el mayor numero de cada array para crear uno
		
		int [] numero1=new int [] {2,3,8,9,6};

		for(int i=0; i<numero1.length; i++) {
		
			System.out.print(numero1[i]+",");
		}
		System.out.println();
		
		int [] numero2=new int [] {8,6,9,1,4};

		for(int i=0; i<numero2.length; i++) {
		
			System.out.print(numero2[i]+",");
		}
		System.out.println();
		
			// pintamos el mayor
		
		for(int i=0; i<numero1.length; i++) {
			
			if (numero1[i]>numero2[i]) {
				
				System.out.print(numero1[i]+",");
			}
			
			else {
					
				System.out.print(numero2[i]+",");	
			}
		}
	}

}
