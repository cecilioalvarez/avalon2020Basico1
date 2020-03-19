package es.avalon.Interfaces;

public class Principal {

	public static void main(String[] args) {

		Mensajeria carta = new Carta("Calle ria de solia");
		Persona persona = new Persona("Moises");
		Correo correo = new Correo("moises.bravo19@hotmail.com");
		Whatapp whatapp = new Whatapp("675281549");

		enviarMensaje("No vengas", carta);
		carta.enviarMensaje("No vengas");

	}

	public static void enviarMensaje(String texto, Mensajeria mensajeria) {
		mensajeria.enviarMensaje(texto);
	}

}
