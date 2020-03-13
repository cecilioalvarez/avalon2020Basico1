package es.avalon.clases5Repaso;

public class Alumno {

	String nombre;
	private int nota;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		if (nota > 10) {
			this.nota = 10;
		} else if (nota < 0) {
			this.nota = 0;
		}
	}

	public Alumno(String nombre, int nota) {
		super();
		this.setNombre(nombre);
		this.setNota(nota);
	}

	public Alumno() {
		super();
	}

}
