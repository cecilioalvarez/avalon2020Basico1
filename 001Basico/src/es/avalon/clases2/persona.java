package es.avalon.clases2;

public class persona {

	private int edad;
	
	public int getEdad() {
		return edad;
	}
	
	// con encapsulacion
	// limitar el acceso a las variables
	
	public void setEdad(int edad1) {
		if (edad<120) {
			edad=edad1;
		}else {
			edad=18;
		}
	}
}
