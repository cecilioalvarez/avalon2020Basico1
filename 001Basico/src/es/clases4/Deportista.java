package es.clases4;

public class Deportista extends Persona {

private String deporte;

public String getDeporte() {
	return deporte;
}

public void setDeporte(String deporte) {
	this.deporte = deporte;
}

public Deportista(String nombre, int edad, String deporte) {
	super(nombre, edad);
	this.deporte=deporte;
	// TODO Auto-generated constructor stub
}
public Deportista(String nombre, int edad) {
	super(nombre, edad);
//	this.deporte=deporte;
	// TODO Auto-generated constructor stub
}

@Override
public void andar() {
	// TODO Auto-generated method stub
	System.out.println(getNombre()+ " anda a 8km/h");
}

}
