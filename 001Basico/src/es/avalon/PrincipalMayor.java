package es.avalon;

public class PrincipalMayor {

	public static void main(String[] args) {
		
		
		int[] lista=new int[] {1,3,5,6};
		
		System.out.println(esmayor(lista));
		

	}
	
	private static int esmayor(int[] unalista) {
		
		int mayor=0;
		for (int i=0;i<unalista.length;i++) {
			
			if (unalista[i]>mayor) {
				
				mayor=unalista[i];
			}
			
			
		}
		return mayor;
	}

}
