package es.clases3;

public class Paciente {

	//public static void main(String[] args) {
	 private String nombre;
	 private HistorialMedico historial;
	
	 public HistorialMedico getHistorial() {
		return historial;
	}


	public void setHistorial(HistorialMedico historial) {
		this.historial = historial;
	}


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

	//}

}
