package es.avalon.Clases4;

public class Principal {

	public static void main(String[] args) {

		
//		Libro libro = new Libro("Java");
//		System.out.println(libro.getTitulo());
//		Libro libro2 = new Libro("Java2");
//		System.out.println(libro2.getTitulo());
//		Libro libro3 = new Libro("Java3");
//		System.out.println(libro3.getTitulo());
//		System.out.println(Libro.getContador());
		
		
		Factura factura = new Factura(1,100);
		System.out.println(factura.getNumero());
		System.out.println(factura.getImporte());
		System.out.println(Factura.calcularIVA(10));
		
		
		
	}

}
