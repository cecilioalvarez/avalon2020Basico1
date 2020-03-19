package es.avalon.interfaces;

public class Carta implements Mensajeria {
	
	private String direccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Carta(String direccion) {
		super();
		this.direccion = direccion;
	}
	
	public void enviarMensaje(String texto) {
		
		System.out.println("Mandamos una carta a " + direccion + "con el texto" + texto);
	}
	

}
