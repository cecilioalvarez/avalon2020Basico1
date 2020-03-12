package es.avalon.clases1;

public class Principal {

	public static void main(String[] args) {
		Donut d1= new Donut();
		d1.precio=1;
		d1.sabor="chocolate";
		
		// el operador . me permite acceder a cada propiedad del objeto
		
		System.out.println(d1.precio);
		System.out.println(d1.sabor);
	}

}
