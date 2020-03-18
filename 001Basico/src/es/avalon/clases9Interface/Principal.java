package es.avalon.clases9Interface;

public class Principal {

	public static void main(String[] args) {
		Mensajeria m1 = new Carta("Federico Vial");
		enviarMensaje("Hola estoy en casa sin salir", m1);

		Mensajeria m2 = new WhatsApp("jordi");
		enviarMensaje("Hola no voy a hacer nada hoy", m2);

	}

	public static void enviarMensaje(String texto, Mensajeria mensajeria) {
		mensajeria.enviarMensaje(texto);

	}

}
