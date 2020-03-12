package es.clases1;

public class alumnos {
//	public int numero; lo lee desde donde sea
//	int numero; // lo puede leer todo del mismo paquete
	private int nota; // solo lo lee esta clase
	private String nombre;
	// el constructor, que esta definido abajo, tiene que tener el mismo nombre que la clase
	public alumnos (String nombre, int nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	
//	public int getNota() {
//		return nota;
//	}
//	public void setNota(int nota) {
//		if (nota<0) {
//			this.nota= 0;
//			
//		}else if (nota>10) {
//			this.nota= 10;
//		}else {
//			this.nota = nota;
//		}
//		
//	}
	
	
}
//source-> geters setters