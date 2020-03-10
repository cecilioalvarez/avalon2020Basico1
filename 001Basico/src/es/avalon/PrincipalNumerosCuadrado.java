package es.avalon;

public class PrincipalNumerosCuadrado {

	public static void main(String[] args) {

		int j = 0;
		int suma = 0;

		for (int i = 0; i < 11; i++) {

			j = i * i;
			suma = suma + j;
			System.out.println(j);

		}
		System.out.println(suma);
	}
}
