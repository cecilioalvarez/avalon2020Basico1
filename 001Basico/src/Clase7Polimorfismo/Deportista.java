package Clase7Polimorfismo;

public class Deportista extends Persona{

	private String deporte;
	
	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public Deportista(String nombre, int edad) {
		super(nombre, edad);
	
		
	}
	public Deportista(String nombre, int edad, String deporte) {
		super(nombre, edad);
		this.deporte=deporte;
		
	}

	
	public void andar() {
		System.out.println("el deportista anda a 8 km/h");
	}

}
