package es.avalon.clases2;

public class Alumno {
	private String nombre;
	private double nota;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (0 <= nota & 10 >= nota) {
			this.nota = nota;
		} 
		else if (nota>10) {
			this.nota = 10;
		}
		else if (nota<0) {
			this.nota=0;
		}
	}
}
