package es.clases1;

public class persona {
//	public int numero; lo lee desde donde sea
//	int numero; // lo puede leer todo del mismo paquete
	private int edad; // solo lo lee esta clase
	
	//limita el acceso a las variables
	public int getNumero() { 
		return edad; // permite accader al valor para leerlo
	}
	public void setNumero(int edad) {
		if (edad<120) {
			/*
			 * para saltarse el shadow 
			 * la sombra que producen dos
			 * variables del mismo nombre
			 * en distintas suaciones
			 */
		this.edad=edad; // //recibe una edad, codigo en el que yo pongo condiciones/ modifica , etc.
	}else {
		this.edad=18;
	}
		
	}
}
//source-> geters setters