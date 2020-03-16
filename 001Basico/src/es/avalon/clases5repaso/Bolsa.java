package es.avalon.clases5repaso;

import es.avalon.clases4.Ejemplar;

public class Bolsa {
	//lista de bolsas, sacar por pantalla peso total de las bolsas

	
	private int numero;
	private int peso;
	

	//Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	
	public Bolsa(int numero, int peso) {
		super();
		this.numero = numero;
		this.peso = peso;
	}


}
