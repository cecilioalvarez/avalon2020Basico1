package es.avalon.clases5repaso;

public class Principal3 {

	public static void main(String[] args) {

		// un trillon
		int [] notas= new int[] {5,7,9};
		String [] nombres= new String[] {"pedro","ana","gema"};
		
		/////////////////////////////////////////////////////
		
		int media=0;
		int notaInicial=0;
		int posicionMayor=0;
		
		
		
		
		for(int i=0;i<notas.length;i++) {
			
			media=media+notas[i];
			
			if (notaInicial<notas[i]) {
				
				posicionMayor=i;
				notaInicial=notas[i];
			}
		}
		
		
		
		System.out.println("La media es " + media/notas.length);
		System.out.println("La mayor nota la tiene " + nombres[posicionMayor]);
		
	}

}
