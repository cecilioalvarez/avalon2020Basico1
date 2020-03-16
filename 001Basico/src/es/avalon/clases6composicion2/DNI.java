package es.avalon.clases6composicion2;

public class DNI {
	
	private int numero;
	private String fechacaducidad;
	//propiedad de un tipo que no es basico (clase persona creada)
	private Persona persona;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFechacaducidad() {
		return fechacaducidad;
	}
	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public DNI(int numero, String fechacaducidad, Persona persona) {
		super();
		this.numero = numero;
		this.fechacaducidad = fechacaducidad;
		this.persona = persona;
	}
	
	
	
	}

	
