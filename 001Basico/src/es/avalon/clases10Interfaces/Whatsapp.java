package es.avalon.clases10Interfaces;

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
		System.out.println("Mandamos un WhatsApp a "+cuenta+" con el texto a "+texto);
	}
}
