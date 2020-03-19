package es.avalon.interfaces;

public class Principal {
	
	public static void main(String[] args) {
		
		Mensajeria m1 = new Carta("federico vial");
		
		enviarMensaje("Hola estoy en casa sin salir", m1);
		
		Mensajeria m2 = new WhatApp("cecilio");
		
		enviarMensaje("Hola no voy a hacer nada", m2);
	
	}
	
	public static void enviarMensaje (String texto, Mensajeria mensajeria) {
		
		//no necesita saber que tipo de mensajeria es
		mensajeria.enviarMensaje(texto);
	}

}
