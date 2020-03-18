package es.avalon.clases10Interfaces;

public class Principal {

	public static void main(String[] args) {

		Mensajeria m1=new Carta("Federico vial");
		mandarInformacion("Hola estoy en casa sin salir",m1);

		Mensajeria m2=new Whatsapp("Ines");
		mandarInformacion("Hola no voy a hacer nada",m2);
		
	}
	
	public static void mandarInformacion (String texto, Mensajeria mensajeria) {
		
		//No necesita saber que tipo de mensajeria es
		mensajeria.enviarMensaje(texto);
	}

}
