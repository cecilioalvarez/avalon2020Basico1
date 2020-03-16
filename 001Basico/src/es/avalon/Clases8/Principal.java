package es.avalon.Clases8;

public class Principal {

	public static void main(String[] args) {

		Bombilla bombilla = new Bombilla(true,"bombilla1");
		Bombilla bombilla2 = new Bombilla(true,"bombilla2");

		Habitacion habitacion = new Habitacion(bombilla,bombilla2,"Sala Gamer");

		imprimirEstadoBombilla(bombilla);
		habitacion.getBombilla().encender();
		imprimirEstadoBombilla(bombilla2);
		habitacion.getBombilla().encender();

	}

	public static void imprimirEstadoBombilla(Bombilla bombilla) {
		if (bombilla.estaEncendida()) {
			System.out.println(bombilla.getNombre()+ "   encendida");
		} else {
			System.out.println(bombilla.getNombre() + "   apagada");
		}
	}
}
