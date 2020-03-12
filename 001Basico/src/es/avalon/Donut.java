package es.avalon;

public class Donut {
	String sabor;
	int precio;
	// con iva
	double precioconIVA(){
		
		return precio*1.21;
	}
}
