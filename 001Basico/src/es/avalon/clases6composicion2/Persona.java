package es.avalon.clases6composicion2;

public class Persona {
	private String nombre;
	private DNI dni;

	//Getters y setters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public DNI getDni() {
		return dni;
	}
	public void setDni(DNI dni) {
		this.dni = dni;
	}
	//Constructor
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

}
