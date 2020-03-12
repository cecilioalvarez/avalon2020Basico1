package es.avalon.clases2;

public class Persona {
	//esta edad pertenece al objeto que se construya
	private int edad;
	
	public int getEdad() {
		return edad;
	}
	
	//esta edad1 que es local al metodo shadow de variables
	public void setEdad(int edad) {
		if (edad<120) {
			//para saltarte el shadow la sombra que producen dos variables del mismo nombre en distintas situaciones
			this.edad=edad;
		}
		else {
			this.edad=18;
		}
	}

}
