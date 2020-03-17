package es.avalon.clases9.herencia2;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public Deportista(String nombre, int edad, String deporte) {

		// la llamada a super inicializa el constructor superior
		super(nombre, edad);
		// este constructor inicializa el deporte
		this.deporte = deporte;
	}

	public Deportista(String nombre, int edad) {

		// la llamada a super inicializa el constructor superior
		super(nombre, edad);

	}

}
