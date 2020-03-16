package es.avalon.Clases7;

public class Principal {

	public static void main(String[] args) {

		Bombilla bombilla = new Bombilla(true);
		Habitacion habitacion = new Habitacion(bombilla);

		habitacion.getBombilla().encender();
		System.out.println(bombilla.isEncendida());
		habitacion.getBombilla().apagar();
		System.out.println(bombilla.isEncendida());
	}

}
