package es.avalon.clases5repaso;

public class Principal4 {
	
	public static void main(String[] args ) {
		
		int[] notas = new int[] {5,7,9};
		String[] nombres = new String[] {"pedro", "ana", "gema"};
		
		////Print
		System.out.println(calcularMedia(notas));
		System.out.println(nombreMayorNota(notas, nombres));
		
	}

	private static String nombreMayorNota(int[] notas, String[] nombres) {
		int notaInicial = 0;
		int posicionMayor = 0;
		
		for (int i=0; i<notas.length; i++) {
			if (notaInicial<notas[i])  {
				
				notaInicial=notas[i];
				posicionMayor=i;
			}
		}
		return nombres[posicionMayor];
	}

	private static double calcularMedia(int[] notas) {
		int media = 0;
		
		for (int i=0; i<notas.length; i++) {	
			media = media+notas[i];
		}
		return media/notas.length;
	}
}			
