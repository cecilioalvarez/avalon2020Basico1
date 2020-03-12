package es.avalon.Clases1;

public class Principal {

	public static void main(String[] args) {

		Donut d1 = new Donut();
		d1.precio=1;
		d1.sabor="chocolate";
		
		Donut d2 = new Donut();
		d2.precio=2;
		d2.sabor="fresa";
		
		System.out.println(d1.precio);
		System.out.println(d1.sabor);
		System.out.println(d2.precio);
		System.out.println(d2.sabor);
		
		Persona p1 = new Persona();
		p1.edad = 25;
		p1.nombre = "Moises";
		
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		
	}
}
