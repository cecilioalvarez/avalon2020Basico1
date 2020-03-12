package es.avalon.Clases1;

public class Principal3 {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();

		r1.lado1 = 2;
		r1.lado2 = 2;
		System.out.println("Lado 1 : " + r1.lado1);
		System.out.println("Lado 2 : " + r1.lado2);
		System.out.println("El area del rectangulo es : " + r1.area());
		System.out.println("El perimetro del rectangulo es : " + r1.perimetro());

	}
}
