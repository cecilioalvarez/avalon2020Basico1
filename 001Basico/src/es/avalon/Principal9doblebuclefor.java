package es.avalon;

public class Principal9doblebuclefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// bucle for 
		
		String num="";
				
		for(int i=1; i<=10; i++) {
			
			num=num+i;
				
			System.out.println(num);
			
		}
		
		// repetimos lo mismo pero utilizando dos bucles for
		
		for(int i=0; i<=10; i++) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(j);  // print pinta en linea, println en filas
		
			}
			
			System.out.println(); 
		}			
	}
}
