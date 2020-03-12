package es.avalon.clase1;

public class Alumno {

	public String nombre;
	double nota;
	
	public Alumno(String nombre,int nota) {
		
		this.setNombre(nombre);
		this.setNota(nota);
	}
	
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
		if (nota>10) {
			this.nota=10;
		}
		else if (nota<0) {
			this.nota=0;
		}
		else {
			this.nota=nota;
		}
	}
}
