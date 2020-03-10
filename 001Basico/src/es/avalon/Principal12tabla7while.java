package es.avalon;

public class Principal12tabla7while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bucle while para la tabla del 7
		
		String texto="7x";
		String igual="=";
		int i=0;
		
		do {
			System.out.println(texto+i+igual+7*i);
			
			i=i+1;
		} while (i<=10);
		
	}

}
