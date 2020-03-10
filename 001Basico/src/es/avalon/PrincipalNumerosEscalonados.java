package es.avalon;

public class PrincipalNumerosEscalonados {

	public static void main(String[] args) {

		String texto = "";

		for (int i = 1; i < 10; i++) {
			texto = texto + i;
			System.out.println(texto);

			}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
