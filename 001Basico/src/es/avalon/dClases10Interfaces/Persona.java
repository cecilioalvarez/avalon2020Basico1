package es.avalon.dClases10Interfaces;

public class Persona implements Mensajeria {

	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void enviarMensaje(String texto) {
		System.out.println("Mandamos una aviso en persona a " + nombre + " con el texto " + texto);
	}

}
