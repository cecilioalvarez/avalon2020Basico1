package Clase6Composicion3;

public class Habitacion {
	private String nombre;
	private Bombilla bombi;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Bombilla getBombi() {
		return bombi;
	}
	public void setBombi(Bombilla bombi) {
		this.bombi = bombi;
	}
	public Habitacion(String nombre, Bombilla bombi) {
		super();
		this.nombre = nombre;
		this.bombi = bombi;
	}



}
