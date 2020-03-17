package es.avalon.clases9.polimorfismo;

public class Persona {
	
	private String nombre;
	private int edad;
	
	//Getters y setters
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
	
	//Constructor
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void andar() {
		System.out.println("La persona anda a 5 km/h");
	}

	
	

}
