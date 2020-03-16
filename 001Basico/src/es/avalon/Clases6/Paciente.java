package es.avalon.Clases6;

public class Paciente {

	private String nombre;
	private HistorialMedico historial;

	public Paciente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HistorialMedico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialMedico historial) {
		this.historial = historial;
	}
	
	
}
