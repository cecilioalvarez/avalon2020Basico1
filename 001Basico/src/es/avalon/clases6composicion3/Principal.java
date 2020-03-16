package es.avalon.clases6composicion3;

public class Principal {

	public static void main(String[] args) {

		Bombilla b1 = new Bombilla(true);

		// crear la bombilla y esta encendida
		imprimirEstadoBombilla(b1);
		// apagada
		b1.apagar();
		// esta apagada
		imprimirEstadoBombilla(b1);
		// encender
		b1.encender();
		// esta encendida
		imprimirEstadoBombilla(b1);

	}

	public static void imprimirEstadoBombilla(Bombilla b) {
		if (b.estaEncendida()) {
			System.out.println("encendida");
		} else {
			System.out.println("apagada");
		}
	}

}
