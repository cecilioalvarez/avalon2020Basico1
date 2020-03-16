package es.avalon.clases6composicion;

public class historialmedico {

	private String enfermedad;
	private paciente paciente;
	
		public paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(paciente paciente) {
		this.paciente = paciente;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public historialmedico(String enfermedad, paciente paciente) {
		super();
		this.enfermedad = enfermedad;
		this.paciente=paciente;
	}
	
	
	
}
