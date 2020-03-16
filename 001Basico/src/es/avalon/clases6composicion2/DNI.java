package es.avalon.clases6composicion2;

public class DNI {
	private String numero;
	private String fechaCaducidad;
	private Persona persona;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public DNI(String numero, String fechaCaducidad, Persona persona) {
		super();
		this.numero = numero;
		this.fechaCaducidad = fechaCaducidad;
		this.persona = persona;
	}

	
	

}
