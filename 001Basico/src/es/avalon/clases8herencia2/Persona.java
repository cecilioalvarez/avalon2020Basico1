package es.avalon.clases8herencia2;

public class Persona {

	private int edad;
	private String nombre;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
}
