package es.clases3;

public class Persona {
	private String nombre;
	//relacion con la clase DNI
	private DNI dni;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
//constructor
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public DNI getDni() {
	return dni;
}

	public void setDni(DNI dni) {
	this.dni = dni;
}


}
