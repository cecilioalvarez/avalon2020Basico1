package es.avalon;

public class Principal18Funciones {

	public static void main(String[] args) {
		hola();
		adios();
		hola();
		int resultado=sumar(2,2);
		System.out.println(resultado);
	}

	private static int sumar(int a, int b) {
		
		return a+b;
	}

	protected static void adios() {
		System.out.println("adios");
		System.out.println("adios");
		System.out.println("adios");
		System.out.println("adios");
	}

	protected static void hola() {
		System.out.println("hola");
		System.out.println("hola");
		System.out.println("hola");
		System.out.println("hola");
	}

}
