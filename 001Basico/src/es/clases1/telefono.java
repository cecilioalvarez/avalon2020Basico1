package es.clases1;

public class telefono {
//	public int numero; lo lee desde donde sea
//	int numero; // lo puede leer todo del mismo paquete
	private int numero; // solo lo lee esta clase
	
	//limita el acceso a las variables
	public int getNumero() { 
		return numero; // permite accader al valor para leerlo
	}
	public void setNumero(int numero) {
		this.numero=numero; // //recibe una edad, codigo en el que yo pongo condiciones/ modifica , etc.
	}
}
//source-> geters setters