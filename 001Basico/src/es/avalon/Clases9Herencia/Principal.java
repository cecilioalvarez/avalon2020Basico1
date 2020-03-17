package es.avalon.Clases9Herencia;

public class Principal {

	public static void main(String[] args) {
		Deportista deportista = new Deportista("Moises", 26, "Futbol");
		Deportista deportista1 = new Deportista("Moises1", 26, "Futbol1");
		deportista1.ejecutarDeporte();

	}
}
