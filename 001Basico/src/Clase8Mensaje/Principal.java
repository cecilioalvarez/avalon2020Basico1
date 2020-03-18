package Clase8Mensaje;

public class Principal {

	public static void main(String[] args) {
		Mensajeria m1 = new Carta("los castros");
		enviarMensaje("encerrado",m1);
		
		Mensajeria m2 = new Wathsapp("los castros");
		enviarMensaje("Hola",m2);

	}

	public static void enviarMensaje(String texto, Mensajeria mensajeria) {
		mensajeria.enviarMensaje(texto);
	}
}
