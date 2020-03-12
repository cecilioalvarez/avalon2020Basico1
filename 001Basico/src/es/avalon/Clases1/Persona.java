package es.avalon.Clases1;

public class Persona {
	
	private int edad;
	public int getEdad() {
		
	return edad;
	}
	//con encapsulacion limitar el acceso a las variables
	public void setEdad(int edad) {
		if(edad<120) {
		// para saltarte el shadow
			//la sombra que producen dos
			//variables del mismo nombre
			//en distintas situaciones
			this.edad=edad;
		}else {
				this.edad=18;
			}
		}
	}


