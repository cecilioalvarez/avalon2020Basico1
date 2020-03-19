package es.avalon.excepciones.igualdad;

public class Persona {

	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	// dos personas con el mismo nombre van a tener el mismo hascode
	// y se consideran iguales
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	// persona.equals(otraPersona)
	@Override
	public boolean equals(Object obj) {
		// persona.equals(Persona)
		if (this == obj)
			return true;
		// persona.equals(null)
		if (obj == null)
			return false;
		// clases son diferentes
		if (getClass() != obj.getClass())
			return false;
		
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
