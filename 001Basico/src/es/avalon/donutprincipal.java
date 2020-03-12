package es.avalon;

public class donutprincipal {
	public static void main (String [] args) {
		Donut d1= new Donut();
		d1.precio=1;
		d1.sabor="chocolate";
		//el operador . me permite acceder a aceda a cada propiedad del objeto
		System.out.println(d1.precio);
		System.out.println(d1.sabor);
		
	}

}
