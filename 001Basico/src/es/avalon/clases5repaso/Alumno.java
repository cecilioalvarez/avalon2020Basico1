package es.avalon.clases5repaso;

public class Alumno {
	String nombre;
	int nota;
	
	//Getters y setters
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
			nota = 0;
		} else {
			this.nota = nota;
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
	
	//Funcion es mejor
	
	public Alumno esMejor(Alumno otro) {
		
		if (this.getNota()>otro.getNota()) {
			
			return this;
		}else {
			
			return otro;
		}
		
	}
	

}
