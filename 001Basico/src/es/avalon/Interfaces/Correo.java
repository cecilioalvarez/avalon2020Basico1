package es.avalon.Interfaces;

public class Correo implements Mensajeria {

	private String email;

	public Correo(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void enviarMensaje(String texto) {
		System.out.println("Mandamos un email a " + email + " con el texto " + texto);
	}
}
