package es.avalon.clases6composicion2;

public class DNI {

	private int numero;
	private String fecha;
	private persona persona;
	
	public persona getPersona() {
		return persona;
	}
	public void setPersona(persona persona) {
		this.persona = persona;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public DNI(int numero, String fecha, persona persona) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.persona = persona;
	}
	
}
