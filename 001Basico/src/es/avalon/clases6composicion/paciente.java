package es.avalon.clases6composicion;

public class paciente {

	private String nombre;
	// propiedad tipo que no es basico
	private historialmedico historial;

	public historialmedico getHistorial() {
		return historial;
	}

	public void setHistorial(historialmedico historial) {
		this.historial = historial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public paciente(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
}
