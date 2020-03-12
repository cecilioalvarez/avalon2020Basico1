package es.avalon;

public class rectanguloprincipal {
	public static void main (String [] args) {
		rectangulo r1= new rectangulo();
		r1.lado1=5;
		r1.lado2=3;
//		Donut d2= new Donut();
//		d2.precio=2;
//		d2.sabor="fresa";
		//el operador . me permite acceder a aceda a cada propiedad del objeto
		System.out.println(r1.perimetro());
		System.out.println(r1.area());
//		System.out.println(d2.precio);
//		System.out.println(d2.sabor);
//		
	}

}
