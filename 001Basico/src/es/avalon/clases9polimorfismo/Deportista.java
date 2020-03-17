package es.avalon.clases9polimorfismo;

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
	
	public Deportista(int edad, String nombre) {
		
		// la llamada a super inicializa el constructor superior
		super (edad, nombre);
		
	}
	
	@Override
	public void andar() {
		System.out.println("el deportista anda a 8 km/h");
	}

	
}
