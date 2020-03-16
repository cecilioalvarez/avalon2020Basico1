package es.avalon.clases6composicion;

public class Paciente {

	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Paciente(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
