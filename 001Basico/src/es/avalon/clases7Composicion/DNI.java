package es.avalon.clases7Composicion;

public class DNI {

	private String numero;
	private String Caducidad = "1/10/2023";
	private Persona persona;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCaducidad() {
		return Caducidad;
	}

	public void setCaducidad(String caducidad) {
		Caducidad = caducidad;
	}

// añadir parametro al constructor
	public DNI(String numero, String caducidad, Persona p) {
		super();
		this.numero = numero;
		this.Caducidad = caducidad;
		this.persona = p;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}