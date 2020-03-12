package es.avalon.clases1;

public class Principal4Rectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		r1.lado1 = 2;
		r1.lado2 = 3;
		System.out.println("area " + r1.area());
		System.out.println("perimetro " + r1.perimetro());

	}

}
