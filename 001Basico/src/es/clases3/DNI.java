package es.clases3;

public class DNI {
private int numero;
private String FechaCaducidad;

private Persona persona;

public Persona getPersona() {
	return persona;
}

public void setPersona(Persona persona) {
	this.persona = persona;
}


public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
	
}

public String getFechaCaducidad() {
	return FechaCaducidad;
}
public void setFechaCaducidad(String fechaCaducidad) {
	FechaCaducidad = fechaCaducidad;
}

//constructor
public DNI(Persona persona,int numero, String fechaCaducidad) {
	super();
	this.numero = numero;
	this.FechaCaducidad = fechaCaducidad;
	this.persona=persona;
}


}
