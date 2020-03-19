package es.avalon.Arrays;

public class Principal {

	public static void main(String[] args) {

		Habitacion habitacion = new Habitacion();

		habitacion.addBombilla(new Bombilla(true, "bombilla1"));
		habitacion.addBombilla(new Bombilla(false, "bombilla2"));
		habitacion.addBombilla(new Bombilla(true, "bombilla3"));
		habitacion.addBombilla(new Bombilla(false, "bombilla4"));

		habitacion.mostrarBombillas(habitacion);
		habitacion.numeroBombillasOn(habitacion);

	}

}
