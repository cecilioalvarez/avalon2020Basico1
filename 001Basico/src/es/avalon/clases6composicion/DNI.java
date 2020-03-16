package es.avalon.clases6composicion;

public class DNI {
	private String numero;
	private String fechaCaducidad;
	private Persona nombre;
	
	
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

	public Persona getNombre() {
		return nombre;
	}

	public void setNombre(Persona nombre) {
		this.nombre = nombre;
	}

	public DNI(String numero, String fechaCaducidad, Persona nombre) {
		super();
		this.numero = numero;
		this.fechaCaducidad = fechaCaducidad;
		this.nombre = nombre;
	}

	
	

}
