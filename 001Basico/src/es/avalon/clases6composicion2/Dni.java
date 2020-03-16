package es.avalon.clases6composicion2;

public class Dni {

	private String numero;
	private String fecha;
	
	private Persona persona;
	
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Dni(String numero, String fecha, Persona persona) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.persona = persona;
	}
	
}
