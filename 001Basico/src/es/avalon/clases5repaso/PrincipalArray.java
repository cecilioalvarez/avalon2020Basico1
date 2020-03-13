package es.avalon.clases5repaso;

public class PrincipalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] notas=new int [] {5,7,9};
		String [] nombres=new String [] {"Ines", "Kira", "Clara"};
		
		int media=0;
		int notaInicial=0;
		int posicionMayor=0;
		
		for(int i=0; i<notas.length; i++) {
			
			media=media+notas[i];
			
			if (posicionMayor<notas[i]) {
				
				posicionMayor=i;
				notaInicial=notas[i];
			}
		}
	
		System.out.println(media/notas.length);
		System.out.println(nombres[posicionMayor]);
	}

}
