package es.avalon.interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mensajeria m1= new Carta("federico vial");
		
		mandarInformacion("hola estoy en casa sin salir",m1);
		
		
		Mensajeria m2= new WhatApp("jordi");
		

		mandarInformacion("hola no voy a hacer nada",m2);
	}
	
	public static void mandarInformacion (String texto , Mensajeria mensajeria) {
		
		// no necesita saber que tipo de mensajeria es 
		mensajeria.enviarMensaje(texto);
		
	}

}
