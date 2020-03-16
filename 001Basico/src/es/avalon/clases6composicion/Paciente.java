package es.avalon.clases6composicion;

public class Paciente {
	
	private String nombre;
	//propiedad de un tipo que no es basico
	private Historialmedico historial;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Historialmedico getHistorial() {
		return historial;
	}

	public void setHistorial(Historialmedico historial) {
		this.historial = historial;
	}

	public Paciente(String nombre) {
		super();
		this.nombre = nombre;
	}
	

}
