package es.avalon.Interfaces;

public class Whatapp implements Mensajeria {
	
	private String cuenta;

	public Whatapp(String cuenta) {
		super();
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public void enviarMensaje(String texto) {
		System.out.println("Mandamos un whatapp a " + cuenta + " con el texto " + texto);
	}



}
