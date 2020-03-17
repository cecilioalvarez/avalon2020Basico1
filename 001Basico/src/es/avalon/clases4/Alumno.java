package es.avalon.clases4;

public class Alumno {
	
	
	private String nombre;
	private int nota;
	
	public Alumno(String nombre,int nota) {
	}{
		 this.nombre=nombre;
		 this.nota=nota;
		 
	}
	
	
	public String getNombre() {
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	
	
	public int getNota() {
		return nota;
		
	}
	
	public void setNota(int nota) {
		if(nota>10) {
			this.nota=10;
		}else if(nota<0) {
			this.nota=0;
		}else {
			this.nota=nota;
			
		}
	}

}