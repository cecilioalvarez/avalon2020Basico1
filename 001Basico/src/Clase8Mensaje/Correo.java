package Clase8Mensaje;

public class Correo implements Mensajeria {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Correo(String email) {
		super();
		this.email = email;
	}
	public void enviarMensaje(String texto) {
		System.out.println("mandamos una carta"+email + "con el texto"+ texto);
	}
}
