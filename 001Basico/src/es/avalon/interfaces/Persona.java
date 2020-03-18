package es.avalon.interfaces;

public class Persona implements Mensajeria {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
public void enviarMensaje(String texto) {
		
		System.out.println("mandamos un aviso a "+ nombre+" con el texto"+ texto);
	}
}
