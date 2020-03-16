package es.avalon.Clases6;

public class DNI {

	private String numero;
	private String FechaCaducidad;
	private Persona persona;
	
	public DNI(String numero, String fechaCaducidad, Persona persona) {
		super();
		this.numero = numero;
		FechaCaducidad = fechaCaducidad;
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getFechaCaducidad() {
		return FechaCaducidad;
	}
	
	public void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}
		
}

