package Clase6Composicion;

public class Paciente {
 
	private String nombre;
	private HistorialMedico historial;

	public HistorialMedico getHistorial() {
		return historial;
	}
	
	public void setHistorial (HistorialMedico historial) {
		this.historial=historial;
	}
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
