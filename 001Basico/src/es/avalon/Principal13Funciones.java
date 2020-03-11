package es.avalon;

public class Principal13Funciones {

	public static void main(String[] args) {
		
		
		hola();
		adios();
		hola();
		int resultado=sumar(2,2);
		System.out.println(resultado);
	}
	
	private  static int sumar (int a ,int b) {
		
		return a+b;
	}

	private static void hola() {
		System.out.println("hola");
		System.out.println("hola");
		System.out.println("hola");
		System.out.println("hola");
	}

	private static void adios() {
		System.out.println("adios");
		System.out.println("adios");
		System.out.println("adios");
		System.out.println("adios");
	}
	
	
}
