package es.clases3;

import java.util.ArrayList;

public class Habitacion {
//	private String NombreHabi; 
//
//	private Bombilla bombilla1;
//	
//	private Bombilla bombilla2;
//	
//	public String getNombreHabi() {
//		return NombreHabi;
//	}
//
//	public void setNombreHabi(String nombreHabi) {
//		NombreHabi = nombreHabi;
//	}
//
//	public Habitacion(String nombreHabi) {
//		super();
//		NombreHabi = nombreHabi;
//	}
//	public Bombilla getBombilla1() {
//		return bombilla1;
//	}
//	
//	public void setBombilla1(Bombilla bombilla1) {
//		this.bombilla1 = bombilla1;
//	}
//	
//	public Bombilla getBombilla2() {
//		return bombilla2;
//	}
//	
//	public void setBombilla2(Bombilla bombilla2) {
//		this.bombilla2 = bombilla2;
//	}
	//nuevo ejercicio
	//************************************************

	private String nombre;
	private ArrayList<Bombilla> bombillas=new ArrayList<Bombilla>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}
	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}
	public Habitacion() {
		super();
		
	}
}
}
