package es.avalon.clases8Herencia2;

public class Deportista extends Persona{
	
	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	//Constructor que llama a la clase superior
	public Deportista(String nombre, int edad, String deporte) {
		//inicializa el constructor de la clase superior
		super(nombre, edad);
		//Este constructor inicializa el deporte
		this.deporte=deporte;
	}

	
	

}
