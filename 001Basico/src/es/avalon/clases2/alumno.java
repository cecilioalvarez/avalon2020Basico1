package es.avalon.clases2;

public class alumno {

	private double nota;
	private String nombre;
	
	// creamos un constructor
	// el mismo nombre de la clase
	public alumno(String nombre, int nota) {
		this.setnombre(nombre);
		this.setnota(nota);
	}
	
	public double getnota() {
		return nota;
	}
	
	public void setnota(int nota) {
		if(nota>0 & nota<10) {
			this.nota=nota;
			
		}else {
			this.nota=0;
		}
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
}
