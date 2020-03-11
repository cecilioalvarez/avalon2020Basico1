package es.avalon;

public class Principal20devuelvemayorarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// introducimos un array y nos devuelve su componente de mayor valor
		
		int [] miarray=new int [] {5,7,9,1,3};
		
		int resultado=devuelvemayor(miarray);
		System.out.println(resultado);
		
		// system.out.println(devuelvemayor(miarray));
		
	}

	private static int devuelvemayor(int [] array) {
		
		int mayor=0;
		
		for(int i=0; i<array.length; i++) {
			
			if (array[i]>mayor) {
				
				mayor=array[i];
			}
			else {
				
				mayor=mayor;
			}
				
			}
		return mayor;
		}

}
