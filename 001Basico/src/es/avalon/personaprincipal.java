package es.avalon;

public class personaprincipal {
	public static void main (String [] args) {
		persona p1= new persona();
		p1.edad=55;
		p1.nombre="Jesús";
		Donut d2= new Donut();
		d2.precio=2;
		d2.sabor="fresa";
		//el operador . me permite acceder a aceda a cada propiedad del objeto
		System.out.println(p1.edad);
		System.out.println(p1.nombre);
		System.out.println(d2.precio);
		System.out.println(d2.sabor);
		
	}

}
