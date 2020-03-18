package es.avalon.interfaces;

public class CorreoElectronico implements Mensajeria {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CorreoElectronico(String email) {
		super();
		this.email = email;
	}
	
	public void enviarMensaje(String texto) {
		System.out.println("mandamos un correo electronico a "+ email+ " con el texto a " + " texto");
	}
}
