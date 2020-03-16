package es.avalon.clases6composicion2;

public class persona {

	private String nombre;
	private DNI dni;

	public DNI getDni() {
		return dni;
	}

	public void setDni(DNI dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
