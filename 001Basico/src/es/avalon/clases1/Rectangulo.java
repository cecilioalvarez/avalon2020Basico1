package es.avalon.clases1;

public class Rectangulo {
	int lado1;
	int lado2;

	double area() {
		return lado1 * lado2;
	}

	double perimetro() {
		return 2 * lado1 + 2 * lado2;
	}
}
