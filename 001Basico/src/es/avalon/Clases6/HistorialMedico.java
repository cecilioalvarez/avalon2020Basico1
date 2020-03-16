package es.avalon.Clases6;

public class HistorialMedico {

	private String enfermedad;
	private Paciente paciente;
	
	public HistorialMedico(String enfermedad, Paciente paciente) {
		super();
		this.enfermedad = enfermedad;
		this.paciente= paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
}
