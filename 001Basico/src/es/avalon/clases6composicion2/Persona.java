package es.avalon.clases6composicion2;

public class Persona {

	private String nombre;
	//propiedad de un tipo que no es basico (clase dni creada)
	private DNI dni;
	
	
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
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	


	
}
