package es.avalon;

public class PrincipalTablaMultiplicar {

	public static void main(String[] args) {

		int i = 0;
		int resultado = 0;
		
		while (i < 11) {
			resultado = 7 * i;
			System.out.println("7 x " + i + " =" + " " +resultado);
			i++;
		}
		
		System.out.println();
		int j=0;
		int resultado1=0;
		do {
			resultado1=8*j;
			System.out.println("8 x " +j +" =" + " " +resultado1);
			j++;
		}while(j<11);
	}
}

