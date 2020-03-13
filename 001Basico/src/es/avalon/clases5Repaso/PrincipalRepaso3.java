package es.avalon.clases5Repaso;

public class PrincipalRepaso3 {

	public static void main(String[] args) {

		int[] notas=new int[] {5,7,9};
		String[] nombres=new String[] {"pedro","ana","gema"};
		
		System.out.println(nombreMayorNOta(notas,nombres));
		
		int media=0;
		int notaInicial=0;
		int posicionMayor=0;
		
		for(int i=0;i<notas.length;i++) {
					
			if(notaInicial<notas[i]) {
				posicionMayor=i;
				notaInicial=notas[i];
			}
		}
		System.out.println(nombres[posicionMayor]);
		
		System.out.println(calcularMedia(notas));
		
		for(int i=0;i<notas.length;i++) {
			media=media+notas[i];
			
			}
		System.out.println(media/notas.length);
		
		
		

	}

}
