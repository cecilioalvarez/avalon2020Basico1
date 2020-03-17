package es.avalon.Clases9Polimorfismo;

public class Deportista extends Persona {

	private String deporte;

	public Deportista(String nombre, int edad, String deporte) {
		super(nombre, edad);
		this.deporte = deporte;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public void ejecutarDeporte() {
		System.out.println(this.getNombre() + this.deporte);
	}

	@Override
	public void andar() {
		System.out.println("La persona anda a 8 Km/h");
	}
	
}
