package es.avalon.clases9polimorfismo;

public class Persona {

	private int edad;
	private String nombre;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public void andar() {
		System.out.println("la persona anda a 5 km/h");
	}
	
	
}
