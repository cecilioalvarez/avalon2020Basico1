package es.avalon.clases2;

public class Telefono {

	//operador de ambito de visibilidad
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero>7_000_000) {
			this.numero=0;
		}else {
			
			this.numero = numero;
		}
		
		
	}
	
	
	
}
