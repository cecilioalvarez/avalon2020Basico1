package es.avalon.clase2;

public class Persona {
 private int edad;

public int getEdad() {
	return edad;
}

public void setEdad(int edad1) {
	if (edad>120) {
		edad=edad1;
	}else {
		edad=18;
	}
}
 
	}


