package es.avalon.clases10Interfaces;

public class Correoelectronico implements Mensajeria {
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Correoelectronico(String email) {
		super();
		this.email = email;
	}
	
	public void enviarMensaje(String texto) {
		System.out.println("Mandamos un correo electronico a "+email+" con el texto a "+texto);
	}

}
