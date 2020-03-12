package es.avalon.Clases2;

public class Alumno {

	private int nota;
	private String nombre;

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if (nota < 0) {
			this.nota = 0;
		} else if (nota > 10) {
			this.nota = 10;
		} else {
			this.nota = nota;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
