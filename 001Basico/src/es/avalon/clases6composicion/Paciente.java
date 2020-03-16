package es.avalon.clases6composicion;

public class Paciente {
	
	private String nombre;
	//Propiedad tipo no basico
	private HistorialMedico historial;
	


	//Getters y Setters
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
	
	//Constructor
	public Paciente(String nombre) {
		super();
		this.nombre = nombre;
	}
	

}
