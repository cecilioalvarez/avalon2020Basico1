package es.avalon.interfaces;

public class WhatApp  implements Mensajeria{

	private String cuenta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public WhatApp(String cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public void enviarMensaje(String texto) {

		System.out.println("mandamos un whatapp a " + cuenta + "con el texto" + texto);
	}
}
