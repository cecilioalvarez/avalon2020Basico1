package es.avalon.clases2;

public class persona {

	// pertenece al objeto que se le construya
	private int edad;
	
	public int getEdad() {
		return edad;
	}
	
	// con encapsulacion
	// limitar el acceso a las variables
	
	// variable local al metodo shadow de variables
	public void setEdad(int edad) {
		if (edad<120) {
			// this -> para no tener que cambiar el nombre de la variable, para saltarte el shadow, 
			// la sombra que producen dos variables del mismo nombre en distintas situaciones
			this.edad=edad;
		}else {
			this.edad=18;
		}
	}
}
