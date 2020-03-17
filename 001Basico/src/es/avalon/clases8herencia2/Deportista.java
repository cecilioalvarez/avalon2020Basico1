package es.avalon.clases8herencia2;

public class Deportista extends Persona {

	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Deportista(int edad, String nombre, String deporte) {
		// invocamos al constructor de la clase superior
		super(edad, nombre);
		// este constructor inicializa el deporte
		this.deporte=deporte;
	}
	
	public Deportista(String nombre, int edad) {
		
		// la llamada a super inicializa el cosntructor superior
		
	super(nombre,edad);
		
	}

	
}
