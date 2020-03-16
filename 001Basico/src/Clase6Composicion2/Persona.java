package Clase6Composicion2;

public class Persona {
	private String nombre;
	private Dni dni;
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
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}
	
}
