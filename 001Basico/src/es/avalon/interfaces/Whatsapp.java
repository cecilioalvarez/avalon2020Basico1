package es.avalon.interfaces;

public class Whatsapp implements Mensajeria {

	private String cuenta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public Whatsapp(String cuenta) {
		super();
		this.cuenta = cuenta;
	}
	public void enviarMensaje(String texto) {
		System.out.println("mandamos un whatsapp a "+cuenta+" con el texto a "+ " texto ");
	}
}
