package es.avalon.clases5repaso;

public class Principal {

	public static void main(String[] args) {
		int nota1=5;
		int nota2=7;
		int nota3=9;
		String nombre1="Pedro";
		String nombre2="Ana";
		String nombre3="Gema";
		
		double media= (nota1+nota2+nota3)/3;
		
		System.out.println(media);

		if (nota1>nota2) {
			System.out.println(nombre1);
		}else {
			System.out.println(nombre2);
		}
	}

}
