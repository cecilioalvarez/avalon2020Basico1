package es.avalon.clases6composicion;

public class HistorialMedico {
	
	private String enfermedad;
	
	private Paciente paciente;
	
	

	//Getters y setters
	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public HistorialMedico(String enfermedad, Paciente paciente) {
		super();
		this.enfermedad = enfermedad;
		this.paciente = paciente; 
	}
	

}
