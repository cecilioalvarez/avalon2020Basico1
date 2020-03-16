package es.avalon.Clases7;

public class Principal {

	public static void main(String[] args) {

		Bombilla bombilla = new Bombilla(true);
		Habitacion habitacion = new Habitacion(bombilla,"Sala Gamer");

		imprimirEstadoBombilla(bombilla);
		habitacion.getBombilla().encender();
		imprimirEstadoBombilla(bombilla);
		habitacion.getBombilla().apagar();
		imprimirEstadoBombilla(bombilla);
		System.out.println(habitacion.getNombre());

	}

	public static void imprimirEstadoBombilla(Bombilla bombilla) {
		if (bombilla.estaEncendida()) {
			System.out.println("encendida");
		} else {
			System.out.println("apagada");
		}
	}
}
