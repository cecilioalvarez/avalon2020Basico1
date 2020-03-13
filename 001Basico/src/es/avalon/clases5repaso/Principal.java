package es.avalon.clases5repaso;

public class Principal {

	public static void main(String[] args) {
		int nota1 = 5;
		int nota2 = 7;
		int nota3 = 9;
		String nombre1 = "pedro";
		String nombre2 = "ana";
		String nombre3 = "gema";

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println(media);

		if (nota1 > nota2 && nota1 > nota3) {

			System.out.println(nombre1);

		} else if (nota2 > nota3 && nota2 > nota1) {
			
			System.out.println(nombre2);
		} else {

			System.out.println(nombre3);
		}

	}

}
