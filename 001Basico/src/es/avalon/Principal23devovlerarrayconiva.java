package es.avalon;

public class Principal23devovlerarrayconiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// devolver la suma de las componentes del array con iva incluido
		
		double [] miarray=new double [] {100,200,300,400};
		
		double [] resultadoarrayiva=arrayiva(miarray);
		imprimirarrayiva(resultadoarrayiva);
		
		double resultado=sumaarrayiva(miarray);
		System.out.println(resultado);
		
		
	}

	// suma de todas las componentes con iva del array
	private static double sumaarrayiva(double [] array) {
		
		double sumaiva=0;
		
		for(int i=0; i<array.length; i++) {
			
			sumaiva=sumaiva+0.21*array[i]+array[i];
			
		}
		return sumaiva;
	}
	
	// array con iva
	private static double [] arrayiva(double [] array) {
		
		double [] arrayiva=new double [array.length];
		
		for(int i=0; i<array.length; i++) {
			
			arrayiva[i]=0.21*array[i]+array[i];
			
		}
		return arrayiva;
	}
	
	// imprime el array con iva
	private static void imprimirarrayiva(double [] array) {
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
	}
}
