package es.avalon.clases5Repaso;

public class PrincipalRepaso2 {

	public static void main(String[] args) {


		int[] notas=new int[] {5,7,9};
		String[] nombres=new String[] {"pedro","ana","gema"};
		
		int media=0;
		int notaInicial=0;
		int posicionMayor=0;
		
		for(int i=0;i<notas.length;i++) {
			media=media+notas[i];
					
			if(notaInicial<notas[i]) {
				notaInicial=i;
				notaInicial=notas[i];
			}
		}
		System.out.println(media/notas.length);
		System.out.println(nombres[posicionMayor]);

	}

}
