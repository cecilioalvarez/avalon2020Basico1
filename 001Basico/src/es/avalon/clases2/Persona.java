package es.avalon.clases2;

public class Persona {
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<120) {
			this.edad = edad;
		}else {
			this.edad = 18;
		}
		
	}
	
	
	
	

}
