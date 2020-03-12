package es.avalon.clases2;

public class Alumno {
	
	private String nombre;
	
	private int nota;
	
	//FUNCIONES NOMBRE
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//FUNCIONES NOTA
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		if (nota>=0 && nota<10) {
			this.nota = nota;
		}else {
			this.nota = -999;
		}	
	}

	
	

}
