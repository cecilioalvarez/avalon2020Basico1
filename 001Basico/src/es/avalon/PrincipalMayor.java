package es.avalon;

public class PrincipalMayor {

	public static void main(String[] args) {
		
		
		int[] lista=new int[] {1,3,5,6};
		int [] nuevo1= reves(lista);
		
//		System.out.println(esmayor(lista));
//		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(nuevo1[i]);
		}

		double [] nuevo2= IVA(lista);
		
//		System.out.println(esmayor(lista));
//		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(nuevo2[i]);
		}
		System.out.println(suma(nuevo2));
	}
	
//	private static int esmayor(int[] unalista) {
//		
//		int mayor=0;
//		for (int i=0;i<unalista.length;i++) {
//			
//			if (unalista[i]>mayor) {
//				
//				mayor=unalista[i];
//			}
//			
//			
//		}
//		
//		return mayor;
//	}
	
	private static int[] reves(int[] unalista) {
		
		int[] nuevo= new int[unalista.length];
		
		for (int i=0;i<unalista.length;i++) {
			
			nuevo[i]=unalista[unalista.length-i-1];
			
			
		}
		
		return nuevo;
	}
	
	private static double[] IVA(int[] unalista) {
		
		double[] nuevoiva= new double[unalista.length];
		
		for(int i=0;i<unalista.length;i++) {
			
			nuevoiva[i]=unalista[i]*0.21;
		}
		return nuevoiva;
	}
	private static double suma(double[] unalista) {
		
		double nuevo=0;
		for(int i=0;i<unalista.length;i++) {
			
			nuevo=unalista[i]+nuevo;
		}
		return nuevo;
	}

}
