package es.avalon.clases8Polimorfismo;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	// Constructor que llama a la clase superior
	public Deportista(String nombre, int edad, String deporte) {
		// inicializa el constructor de la clase superior
		super(nombre, edad);
		// Este constructor inicializa el deporte
		this.deporte = deporte;
	}

	// Constructor con solo 2 parametros
	public Deportista(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void andar() {
		System.out.println("El deportista anda a 8 km/h");
	}

}
